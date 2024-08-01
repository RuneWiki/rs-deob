import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rd")
public class class161 extends class147 {

    @OriginalMember(owner = "rd", name = "I", descriptor = "Llf;")
    public static class109 field3015 = class35.method275(" weitere Optionen", 2);

    @OriginalMember(owner = "rd", name = "G", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "rd", name = "T", descriptor = "Llf;")
    public static class109 field3025 = class35.method275("Musik)2Engine vorbereitet)3", 2);

    @OriginalMember(owner = "rd", name = "V", descriptor = "Llf;")
    public static class109 field3027 = class35.method275("title_mute", 2);

    @OriginalMember(owner = "rd", name = "H", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "rd", name = "J", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "rd", name = "L", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "rd", name = "M", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "rd", name = "N", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "rd", name = "O", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "rd", name = "P", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "rd", name = "Q", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "rd", name = "R", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "rd", name = "S", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "rd", name = "U", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "rd", name = "a", descriptor = "(IZILbg;)Ldf;")
    public static final class37 method1090(int arg0, boolean arg1, int arg2, class18 arg3) {
        field3023++;
        if (class203.method1333(-21957, arg3, arg2, arg0)) {
            if (arg1) {
                method1096(false, -12, 115);
            }
            return class127.method921(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "rd", name = "a", descriptor = "(Lja;I)V")
    public final void method1091(class86 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method598((byte) 72);
            if (var3 == 0) {
                field3018++;
                if (arg1 != 28109) {
                    method1093(44);
                    return;
                }
                return;
            }
            this.method1094(arg1 - 18799, var3, arg0);
        }
    }

    @OriginalMember(owner = "rd", name = "d", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        if (arg0 != 17) {
            field3025 = null;
        }
        field3025 = null;
        field3015 = null;
        field3027 = null;
    }

    @OriginalMember(owner = "rd", name = "b", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        class95.field1934.method1338(arg0 - 5591);
        field3022++;
        int var1 = class95.field1934.method1341((byte) 117, 8);
        if (class1.field10 > var1) {
            for (int var2 = var1; var2 < class1.field10; var2++) {
                class126.field2437[class184.field3479++] = class1.field8[var2];
            }
        }
        if (var1 > class1.field10) {
            throw new RuntimeException("gnpov1");
        }
        class1.field10 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class1.field8[var3];
            class139 var5 = class183.field3444[var4];
            int var6 = class95.field1934.method1341((byte) 79, 1);
            if (var6 == 0) {
                class1.field8[class1.field10++] = var4;
                var5.field3613 = class143.field2754;
            } else {
                int var7 = class95.field1934.method1341((byte) 102, 2);
                if (var7 == 0) {
                    class1.field8[class1.field10++] = var4;
                    var5.field3613 = class143.field2754;
                    class102.field2018[class98.field1967++] = var4;
                } else if (var7 == 1) {
                    class1.field8[class1.field10++] = var4;
                    var5.field3613 = class143.field2754;
                    int var8 = class95.field1934.method1341((byte) 82, 3);
                    var5.method1272(false, var8, 109);
                    int var9 = class95.field1934.method1341((byte) 81, 1);
                    if (var9 == 1) {
                        class102.field2018[class98.field1967++] = var4;
                    }
                } else if (var7 == 2) {
                    class1.field8[class1.field10++] = var4;
                    var5.field3613 = class143.field2754;
                    int var10 = class95.field1934.method1341((byte) 111, 3);
                    var5.method1272(true, var10, 105);
                    int var11 = class95.field1934.method1341((byte) 109, 3);
                    var5.method1272(true, var11, 88);
                    int var12 = class95.field1934.method1341((byte) 62, 1);
                    if (var12 == 1) {
                        class102.field2018[class98.field1967++] = var4;
                    }
                } else if (var7 == 3) {
                    class126.field2437[class184.field3479++] = var4;
                }
            }
        }
        if (arg0 != 16636) {
            field3013 = 111;
        }
    }

    @OriginalMember(owner = "rd", name = "a", descriptor = "(IILja;)V")
    private final void method1094(int arg0, int arg1, class86 arg2) {
        if (arg0 != 9310) {
            method1096(false, 65, 116);
        }
        field3014++;
        if (arg1 == 1) {
            this.field3019 = arg2.method569(true);
            this.field3024 = arg2.method598((byte) 117);
            this.field3026 = arg2.method598((byte) 105);
        }
    }

    @OriginalMember(owner = "rd", name = "a", descriptor = "()V")
    public static final void method1095() {
        for (int var0 = 0; var0 < class191.field3659; var0++) {
            class45 var1 = class121.field2346[var0];
            class158.method1079(var1);
            class121.field2346[var0] = null;
        }
        class191.field3659 = 0;
    }

    @OriginalMember(owner = "rd", name = "a", descriptor = "(ZII)I")
    public static final int method1096(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3021 = -39;
        }
        field3017++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "rd", name = "a", descriptor = "(IBII)I")
    public static final int method1097(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -99) {
            field3021 = -11;
        }
        field3020++;
        if ((class88.field1827[arg2][arg3][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class88.field1827[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }
}
