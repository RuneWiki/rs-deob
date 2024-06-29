import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class211 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[C")
    public static char[] field3001 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Lbca;")
    public static class661 field3000;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I")
    public static final int method1448(int arg0, int arg1, int arg2) {
        field2999++;
        int var3 = class551.method3174(arg0 - 1, arg2 - 1, (byte) 91) - (-class551.method3174(arg0 + 1, arg2 + -1, (byte) -53) - class551.method3174(arg0 - 1, arg2 + 1, (byte) -90)) + class551.method3174(arg0 - -1, arg2 - -1, (byte) -82);
        int var4 = class551.method3174(arg0 - 1, arg2, (byte) -118) + (class551.method3174(arg0 - arg1, arg2, (byte) 118) - (-class551.method3174(arg0, arg2 - 1, (byte) 109) - class551.method3174(arg0, arg2 + 1, (byte) 89)));
        int var5 = class551.method3174(arg0, arg2, (byte) -59);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLvaa;[[B)V")
    public static final void method1449(boolean arg0, class469 arg1, byte[][] arg2) {
        field2998++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field3692; var4++) {
            class15.method120(false);
            for (int var9 = 0; var9 < (class376.field5325 >> 3); var9++) {
                for (int var10 = 0; var10 < class175.field2711 >> 3; var10++) {
                    int var11 = class554.field7662[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = var11 >> 24 & 0x3;
                        if (!arg1.field3671 || var12 == 0) {
                            int var13 = (var11 & 0x6) >> 1;
                            int var14 = (var11 & 0xFFD064) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + (var15 / 8);
                            for (int var17 = 0; var17 < class199.field2905.length; var17++) {
                                if (class199.field2905[var17] == var16 && arg2[var17] != null) {
                                    class215 var18 = new class215(arg2[var17]);
                                    arg1.method1729(var9 * 8, var4, -1, var18, var15, var10 * 8, var14, class19.field295, var13, var12);
                                    arg1.method2764(var18, false, var15, var14, var9 * 8, var4, var13, var10 * 8, class272.field3822, var3[0] == -1 ? var3 : null, var12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg1.field3692; var5++) {
            class15.method120(false);
            for (int var6 = 0; var6 < (class376.field5325 >> 3); var6++) {
                for (int var7 = 0; var7 < class175.field2711 >> 3; var7++) {
                    int var8 = class554.field7662[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method1723(var6 * 8, 8, var7 * 8, -100, 8, var5);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class318.field4390 = class132.field2230.method3665(var3[2], var3[3], var3[1], -109, class744.field9996, var3[0]);
            class681.field9221 = var3[4];
        }
        if (arg0) {
            method1451(26);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1450(byte arg0) {
        field2997++;
        if (arg0 != -106) {
            method1450((byte) 21);
        }
        class425.field6121.method996(arg0 + 9);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1451(int arg0) {
        field3000 = null;
        field3001 = null;
        if (arg0 < 33) {
            field3001 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILun;Lun;)V")
    public static final void method1452(int arg0, int arg1, int arg2, class424 arg3, class424 arg4) {
        class384 var5 = class410.method2541(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5566 = arg3;
        var5.field5578 = arg4;
        int var6 = class683.field9250 == class344.field4822 ? 1 : 0;
        if (!arg3.method45(-62)) {
            arg3.field5924 = class375.field5310[var6];
            class375.field5310[var6] = arg3;
        } else if (arg3.method49((byte) 122)) {
            arg3.field5924 = class391.field5762[var6];
            class391.field5762[var6] = arg3;
        } else {
            arg3.field5924 = class362.field5206[var6];
            class362.field5206[var6] = arg3;
            class30.field778 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method45(-110)) {
            if (arg4.method49((byte) 122)) {
                arg4.field5924 = class391.field5762[var6];
                class391.field5762[var6] = arg4;
                return;
            }
            arg4.field5924 = class362.field5206[var6];
            class362.field5206[var6] = arg4;
            class30.field778 = true;
            return;
        }
        arg4.field5924 = class375.field5310[var6];
        class375.field5310[var6] = arg4;
    }
}
