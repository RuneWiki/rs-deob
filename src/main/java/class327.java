import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class327 extends class476 {

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    public static int[] field4715 = new int[2];

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "[B")
    public static byte[] field4716;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Lkr;")
    public class327 field4709;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Lkr;")
    public class327 field4714;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Ljava/awt/Frame;")
    public static Frame field4718;

    static {
        new class567("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field4716 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZZ)V", line = 3)
    public static final void method2034(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 2) {
            return;
        }
        if (arg2) {
            class81.field1438++;
            class483.method2780((byte) -123);
        }
        field4712++;
        if (arg1) {
            class308.field4448++;
            class173.method1196((byte) 105);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLaj;)V", line = 26)
    public static final void method2035(boolean arg0, class261 arg1) {
        field4713++;
        arg1.method1655(6924);
        int var2 = 0;
        for (int var3 = 0; var3 < class43.field586; var3++) {
            int var15 = class343.field4927[var3];
            if ((class185.field2688[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class185.field2688[var15] = (byte) class188.method1258(class185.field2688[var15], 2);
                } else {
                    int var16 = arg1.method1660(-126, 1);
                    if (var16 == 0) {
                        var2 = class389.method2354(arg1, -125);
                        class185.field2688[var15] = (byte) class188.method1258(class185.field2688[var15], 2);
                    } else {
                        class17.method202(4, arg1, var15);
                    }
                }
            }
        }
        if (!arg0) {
            method2037((byte) 30);
        }
        arg1.method1668((byte) -40);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1655(6924);
        for (int var4 = 0; var4 < class43.field586; var4++) {
            int var13 = class343.field4927[var4];
            if ((class185.field2688[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class185.field2688[var13] = (byte) class188.method1258(class185.field2688[var13], 2);
                } else {
                    int var14 = arg1.method1660(-127, 1);
                    if (var14 == 0) {
                        var2 = class389.method2354(arg1, 40);
                        class185.field2688[var13] = (byte) class188.method1258(class185.field2688[var13], 2);
                    } else {
                        class17.method202(4, arg1, var13);
                    }
                }
            }
        }
        arg1.method1668((byte) -40);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1655(6924);
        for (int var5 = 0; var5 < class418.field6154; var5++) {
            int var11 = class302.field4368[var5];
            if ((class185.field2688[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class185.field2688[var11] = (byte) class188.method1258(class185.field2688[var11], 2);
                } else {
                    int var12 = arg1.method1660(-128, 1);
                    if (var12 == 0) {
                        var2 = class389.method2354(arg1, -96);
                        class185.field2688[var11] = (byte) class188.method1258(class185.field2688[var11], 2);
                    } else if (class421.method2533(arg1, (byte) 123, var11)) {
                        class185.field2688[var11] = (byte) class188.method1258(class185.field2688[var11], 2);
                    }
                }
            }
        }
        arg1.method1668((byte) -40);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1655(6924);
        for (int var6 = 0; var6 < class418.field6154; var6++) {
            int var9 = class302.field4368[var6];
            if ((class185.field2688[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class185.field2688[var9] = (byte) class188.method1258(class185.field2688[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method1660(6, 1);
                    if (var10 == 0) {
                        var2 = class389.method2354(arg1, 41);
                        class185.field2688[var9] = (byte) class188.method1258(class185.field2688[var9], 2);
                    } else if (class421.method2533(arg1, (byte) 123, var9)) {
                        class185.field2688[var9] = (byte) class188.method1258(class185.field2688[var9], 2);
                    }
                }
            }
        }
        arg1.method1668((byte) -40);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class418.field6154 = 0;
        class43.field586 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class185.field2688[var7] = (byte) (class185.field2688[var7] >> 1);
            class400 var8 = class39.field536[var7];
            if (var8 == null) {
                class302.field4368[class418.field6154++] = var7;
            } else {
                class343.field4927[class43.field586++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V", line = 230)
    public final void method2036(boolean arg0) {
        field4708++;
        if (this.field4714 == null) {
            return;
        }
        this.field4714.field4709 = this.field4709;
        this.field4709.field4714 = this.field4714;
        this.field4709 = null;
        if (!arg0) {
            field4715 = null;
        }
        this.field4714 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 254)
    public static void method2037(byte arg0) {
        field4718 = null;
        field4715 = null;
        field4716 = null;
        if (arg0 < 66) {
            field4716 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 270)
    public static final void method2038(byte arg0) {
        if (arg0 < 28) {
            method2034(-128, false, false);
        }
        class310.field4550.method2406(-39);
        field4711++;
        class258.field3753.method2406(-118);
        class92.field1631.method2406(103);
        class601.field8528.method2406(118);
        class185.field2680.method2406(91);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V", line = 300)
    public static final void method2039(boolean arg0, int arg1) {
        class547.method3064((byte) -50);
        field4710++;
        if (!class541.method3037(112, class64.field893)) {
            return;
        }
        class259.field3775++;
        if (class259.field3775 < 50 && !arg0) {
            return;
        }
        class259.field3775 = arg1;
        if (!class554.field7835 && client.field8770 != null) {
            class257.field3733++;
            class624.method3537(arg1 - 92, class195.field2799);
            try {
                client.field8770.method2733(3, class127.field2088.field3913, 0, class127.field2088.field3952);
                class127.field2088.field3913 = 0;
            } catch (IOException var2) {
                class554.field7835 = true;
            }
        }
        class547.method3064((byte) 86);
    }
}
