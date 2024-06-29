import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 extends class44 {

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "La;")
    private static class1 field928 = class113.method934(-11538, "Login");

    @OriginalMember(owner = "client!fd", name = "Cb", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!fd", name = "Kb", descriptor = "La;")
    private static class1 field943 = class113.method934(-11538, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!fd", name = "Ab", descriptor = "La;")
    public static class1 field933 = field943;

    @OriginalMember(owner = "client!fd", name = "Eb", descriptor = "[I")
    public static int[] field937 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "La;")
    public static class1 field927 = field928;

    @OriginalMember(owner = "client!fd", name = "Jb", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!fd", name = "xb", descriptor = "La;")
    public static class1 field930 = class113.method934(-11538, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!fd", name = "yb", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fd", name = "Bb", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!fd", name = "Db", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fd", name = "Fb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!fd", name = "Gb", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!fd", name = "Ib", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!fd", name = "Nb", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!fd", name = "Ob", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fd", name = "zb", descriptor = "Lsa;")
    public static class109 field932;

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "Lbd;")
    public static class11 field925;

    @OriginalMember(owner = "client!fd", name = "Hb", descriptor = "Lbd;")
    public static class11 field940;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "Lwc;")
    public static class134 field926;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILba;)V", line = 18)
    public final void method403(int arg0, class8 arg1) {
        field929++;
        while (true) {
            int var3 = arg1.method145(false);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field932 = null;
                    return;
                }
            }
            this.method404(arg1, arg0 + 26283, var3);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lba;II)V", line = 42)
    private final void method404(class8 arg0, int arg1, int arg2) {
        field936++;
        if (arg2 == 1) {
            this.field934 = arg0.method146(65280);
            this.field944 = arg0.method145(false);
            this.field946 = arg0.method145(false);
        }
        if (arg1 != 26283) {
            field932 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIB)I", line = 62)
    public static final int method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg4 & 0x3;
        field947++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg3 - arg2;
        } else {
            if (arg6 > -64) {
                method405(12, 96, -19, -17, -19, 1, (byte) -99);
            }
            return var7 == 2 ? 7 + 1 - arg0 - arg1 : arg2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V", line = 115)
    public static void method406(int arg0) {
        field927 = null;
        if (arg0 > -120) {
            return;
        }
        field940 = null;
        field926 = null;
        field925 = null;
        field933 = null;
        field937 = null;
        field932 = null;
        field930 = null;
        field943 = null;
        field928 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI[BI)V", line = 158)
    public static final void method407(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field941++;
        if (arg4 != -27520) {
            method406(49);
        }
        if (class9.field312 == null) {
            return;
        }
        if (class122.field3033 >= 0) {
            arg2 -= 20;
            if (arg2 < 1) {
                arg2 = 1;
            }
            class62.field1551 = arg2;
            if (class122.field3033 == 0) {
                class8.field303 = 0;
            } else {
                int var5 = class66.method635(113, class122.field3033);
                int var6 = var5 - class81.field2049;
                class8.field303 = (arg2 + var6 + 3600 - 1) / arg2;
            }
            class2.field79 = arg3;
            class36.field976 = arg0;
            class67.field1665 = arg1;
        } else if (class62.field1551 == 0) {
            class1.method7(2037, arg1, arg3, arg0);
        } else {
            class36.field976 = arg0;
            class67.field1665 = arg1;
            class2.field79 = arg3;
        }
    }
}
