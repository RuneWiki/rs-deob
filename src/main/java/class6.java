import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class6 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
    public static int[] field61 = new int[256];

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lkn;")
    public static class52 field67;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method33(int arg0, boolean arg1) {
        field62++;
        return arg1 ? arg0 & 0xFF : -30;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BIIIIIII)V", line = 18)
    public static final void method34(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field60++;
        if (arg0 != 37) {
            method33(13, false);
        }
        if (arg1 < 1 || arg7 < 1 || arg1 > 102 || arg7 > 102) {
            return;
        }
        if (!class148.method1042((byte) 54) && (class305.field4784[0][arg1][arg7] & 0x2) == 0) {
            int var8 = arg5;
            if ((class305.field4784[arg5][arg1][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class230.field3720 != var8) {
                return;
            }
        }
        int var9 = arg5;
        if (arg5 < 3 && (class305.field4784[1][arg1][arg7] & 0x2) == 2) {
            var9 = arg5 + 1;
        }
        class90.method623(arg6, class33.field425[arg5], var9, arg5, arg7, (byte) -46, arg1);
        if (arg4 >= 0) {
            boolean var10 = class317.field4985;
            class317.field4985 = true;
            class231.method1585(arg3, -122, false, arg1, false, arg7, var9, arg2, arg4, arg5, class33.field425[arg5]);
            class317.field4985 = var10;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lph;", line = 73)
    public static final class79 method35(byte arg0) {
        if (arg0 > -39) {
            method34((byte) -89, 45, 46, -65, -50, 51, -45, 47);
        }
        field63++;
        class79 var1;
        if (class333.field5166) {
            var1 = new class140(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], class46.field644[0], class154.field2417);
        } else {
            var1 = new class20(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], class46.field644[0], class154.field2417);
        }
        class345.method2394((byte) -92);
        return var1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field61[var0] = var1;
        }
        field68 = 0;
        field67 = new class52(64);
        field69 = 0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 107)
    public static void method36(int arg0) {
        if (arg0 != 5) {
            field65 = 103;
        }
        field67 = null;
        field61 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILwf;II)Ln;", line = 145)
    public static final class178 method37(int arg0, class306 arg1, int arg2, int arg3) {
        field59++;
        if (arg2 >= -31) {
            return (class178) null;
        } else if (class156.method1093(true, arg3, arg0, arg1)) {
            return class104.method705(4050);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 160)
    public static final int method38(String arg0, byte arg1) {
        field64++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 < 49) {
            method38((String) null, (byte) -88);
        }
        for (int var2 = 0; var2 < class116.field1795; var2++) {
            if (arg0.equalsIgnoreCase(class120.field1851[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
