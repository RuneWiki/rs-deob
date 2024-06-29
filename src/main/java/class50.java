import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class50 extends class64 {

    @OriginalMember(owner = "client!ha", name = "qb", descriptor = "I")
    public int field1052 = 1000;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "Lrd;")
    public static class114 field1035 = class84.method656("@cr1@", (byte) 114);

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "Z")
    public static boolean field1038 = true;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "Lrd;")
    public static class114 field1039 = class84.method656("::fpsoff", (byte) 124);

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lrd;")
    private static class114 field1042 = class84.method656("Invalid loginserver requested)3", (byte) 115);

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "Lrd;")
    public static class114 field1045 = class84.method656("Lade Benutzeroberfl-=che )2 ", (byte) 127);

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "Lrd;")
    public static class114 field1044 = class84.method656("Side panel redrawn", (byte) 117);

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "Lrd;")
    public static class114 field1047 = field1042;

    @OriginalMember(owner = "client!ha", name = "pb", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "Lrd;")
    public static class114 field1041 = class84.method656("null", (byte) 123);

    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "[[I")
    public static int[][] field1049 = new int[104][104];

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "Ljd;")
    public static class66 field1048;

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "[I")
    public static int[] field1050;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIILtb;)V")
    public static final void method357(byte arg0, int arg1, int arg2, int arg3, class124 arg4) {
        field1046++;
        if (class60.field1263 >= 400) {
            return;
        }
        if (arg4.field2939 != null) {
            arg4 = arg4.method961(-1);
        }
        if (arg4 == null || !arg4.field2938) {
            return;
        }
        if (arg0 >= -81) {
            field1042 = null;
        }
        class114 var5 = arg4.field2926;
        if (arg4.field2953 != 0) {
            var5 = class101.method786((byte) 126, new class114[] { var5, class26.method201(class7.field103.field3004, 7, arg4.field2953), class74.field1720, class107.field2477, class14.method113(arg4.field2953, -31766), class84.field1873 });
        }
        if (class145.field3452 == 1) {
            class3.method10(arg1, class101.method786((byte) 127, new class114[] { class16.field319, class67.field1457, var5 }), arg3, (byte) 122, 30, class117.field2724, arg2);
            class110.field2556++;
        } else if (!class125.field2975) {
            class114[] var6 = arg4.field2940;
            if (class106.field2445) {
                var6 = class29.method220(112, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method886(class16.field326, true)) {
                        class11.field182++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 35;
                        }
                        if (var7 == 1) {
                            var8 = 49;
                        }
                        if (var7 == 2) {
                            var8 = 20;
                        }
                        if (var7 == 3) {
                            var8 = 47;
                        }
                        if (var7 == 4) {
                            var8 = 54;
                        }
                        class3.method10(arg1, class101.method786((byte) 125, new class114[] { class3.field27, var5 }), arg3, (byte) 127, var8, var6[var7], arg2);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method886(class16.field326, true)) {
                        class89.field1996++;
                        short var10 = 0;
                        int var11 = 0;
                        if (arg4.field2953 > class7.field103.field3004) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = var10 + 35;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 49;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 20;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 47;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 54;
                        }
                        class3.method10(arg1, class101.method786((byte) 125, new class114[] { class3.field27, var5 }), arg3, (byte) 124, var11, var6[var9], arg2);
                    }
                }
            }
            class3.method10(arg1, class101.method786((byte) 126, new class114[] { class3.field27, var5 }), arg3, (byte) 125, 1005, class124.field2937, arg2);
            class88.field1954++;
        } else if ((class22.field427 & 0x2) == 2) {
            class3.method10(arg1, class101.method786((byte) 127, new class114[] { class34.field683, class67.field1457, var5 }), arg3, (byte) 125, 32, class120.field2803, arg2);
            class32.field647++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public static void method358(boolean arg0) {
        field1039 = null;
        field1050 = null;
        field1035 = null;
        field1045 = null;
        field1048 = null;
        field1041 = null;
        field1044 = null;
        field1049 = null;
        field1047 = null;
        if (arg0) {
            field1042 = null;
        }
        field1042 = null;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)Lue;")
    public class133 method67(byte arg0) {
        field1040++;
        if (arg0 > -9) {
            field1048 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class133 var10 = this.method67((byte) -117);
        field1037++;
        if (var10 != null) {
            this.field1052 = var10.field1052;
            var10.method359(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
