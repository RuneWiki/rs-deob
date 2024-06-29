import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field599 = -1;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[C")
    public static char[] field600 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        if (arg0 == 35) {
            field600 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Loo;B)V")
    public static final void method529(class580 arg0, byte arg1) {
        field598++;
        arg0.method3405(true);
        int var2 = 0;
        int var3 = 0;
        if (arg1 != 108) {
            return;
        }
        while (class99.field1607 > var3) {
            int var15 = class359.field5700[var3];
            if ((class490.field7163[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class490.field7163[var15] = (byte) class81.method769(class490.field7163[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method3404(1, 8);
                    if (var16 == 0) {
                        var2 = class15.method202(arg1 + 1459, arg0);
                        class490.field7163[var15] = (byte) class81.method769(class490.field7163[var15], 2);
                    } else {
                        class419.method2680(arg0, (byte) 39, var15);
                    }
                }
            }
            var3++;
        }
        arg0.method3398((byte) 104);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method3405(true);
        for (int var4 = 0; var4 < class99.field1607; var4++) {
            int var13 = class359.field5700[var4];
            if ((class490.field7163[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class490.field7163[var13] = (byte) class81.method769(class490.field7163[var13], 2);
                } else {
                    int var14 = arg0.method3404(1, 8);
                    if (var14 == 0) {
                        var2 = class15.method202(1567, arg0);
                        class490.field7163[var13] = (byte) class81.method769(class490.field7163[var13], 2);
                    } else {
                        class419.method2680(arg0, (byte) 67, var13);
                    }
                }
            }
        }
        arg0.method3398((byte) 104);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method3405(true);
        for (int var5 = 0; var5 < class585.field8329; var5++) {
            int var11 = class62.field792[var5];
            if ((class490.field7163[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class490.field7163[var11] = (byte) class81.method769(class490.field7163[var11], 2);
                } else {
                    int var12 = arg0.method3404(1, 8);
                    if (var12 == 0) {
                        var2 = class15.method202(1567, arg0);
                        class490.field7163[var11] = (byte) class81.method769(class490.field7163[var11], 2);
                    } else if (class180.method1475(arg0, (byte) 115, var11)) {
                        class490.field7163[var11] = (byte) class81.method769(class490.field7163[var11], 2);
                    }
                }
            }
        }
        arg0.method3398((byte) 104);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method3405(true);
        for (int var6 = 0; var6 < class585.field8329; var6++) {
            int var9 = class62.field792[var6];
            if ((class490.field7163[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class490.field7163[var9] = (byte) class81.method769(class490.field7163[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method3404(1, 8);
                    if (var10 == 0) {
                        var2 = class15.method202(1567, arg0);
                        class490.field7163[var9] = (byte) class81.method769(class490.field7163[var9], 2);
                    } else if (class180.method1475(arg0, (byte) 49, var9)) {
                        class490.field7163[var9] = (byte) class81.method769(class490.field7163[var9], 2);
                    }
                }
            }
        }
        arg0.method3398((byte) 104);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class99.field1607 = 0;
        class585.field8329 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class490.field7163[var7] = (byte) (class490.field7163[var7] >> 1);
            class304 var8 = class597.field8465[var7];
            if (var8 == null) {
                class62.field792[class585.field8329++] = var7;
            } else {
                class359.field5700[class99.field1607++] = var7;
            }
        }
    }
}
