import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 extends class30 {

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "Lje;")
    private static class67 field1253 = class85.method592(255, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lje;")
    public static class67 field1258 = class85.method592(255, "Einloggen");

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "[I")
    public static int[] field1248 = new int[32];

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lje;")
    public static class67 field1250 = field1253;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lda;")
    public static class23 field1263 = new class23();

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static final void method430(int arg0) {
        field1262++;
        if (!class131.field2891) {
            return;
        }
        class103.field2337 = null;
        class27.field485 = null;
        class67.field1315 = null;
        class85.field1893 = null;
        class150.field3441 = null;
        if (arg0 != 64) {
            field1248 = null;
        }
        class89.field1957 = null;
        class103.field2333 = null;
        class107.field2458 = null;
        class118.field2667 = null;
        class85.field1891 = null;
        class16.field284 = null;
        class99.field2201 = null;
        class114.field2586 = null;
        class105.field2391 = null;
        class23.field426 = null;
        class18.field336 = null;
        class138.field3121 = null;
        class37.field672 = null;
        class66.field1281 = null;
        class116.field2620 = null;
        class30.method193((byte) -100, 2);
        class134.method1018(true, 117);
        class131.field2891 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILta;)V")
    public static final void method431(int arg0, class133 arg1) {
        if (class34.field627 == arg1.field2952 || arg1.field2991 == -1 || arg1.field2987 != 0 || arg1.field2933 + 1 > class49.method316(arg1.field2991, false).field2072[arg1.field2975]) {
            int var2 = class34.field627 - arg1.field2956;
            int var3 = arg1.field2958 * 64 + arg1.field2953 * 128;
            int var4 = arg1.field2958 * 64 + arg1.field2949 * 128;
            int var5 = arg1.field2952 - arg1.field2956;
            int var6 = arg1.field2971 * 128 + arg1.field2958 * 64;
            int var7 = arg1.field2978 * 128 + arg1.field2958 * 64;
            arg1.field2963 = ((var5 - var2) * var7 + var2 * var6) / var5;
            arg1.field2957 = ((var5 - var2) * var3 + var2 * var4) / var5;
        }
        arg1.field2934 = 0;
        field1252++;
        if (arg1.field2969 == 0) {
            arg1.field2972 = 1024;
        }
        if (arg1.field2969 == 1) {
            arg1.field2972 = 1536;
        }
        if (arg1.field2969 == 2) {
            arg1.field2972 = 0;
        }
        if (arg1.field2969 == arg0) {
            arg1.field2972 = 512;
        }
        arg1.field2992 = arg1.field2972;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1248 = null;
        field1258 = null;
        field1263 = null;
        field1253 = null;
        if (arg0 == 3) {
            field1250 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILna;I)V")
    private final void method433(int arg0, class91 arg1, int arg2) {
        field1254++;
        if (arg2 == 1) {
            this.field1261 = arg1.method641(255);
            this.field1264 = arg1.method649(false);
            this.field1256 = arg1.method649(false);
        }
        if (arg0 != -1) {
            field1263 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static final void method434(boolean arg0) {
        class154.field3499.method1071(arg0);
        class95.field2126 = 1;
        field1251++;
        class147.field3360 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIILfd;BI)V")
    public static final void method435(boolean arg0, int arg1, int arg2, class40 arg3, byte arg4, int arg5) {
        field1260++;
        class147.field3360 = arg3;
        class127.field2797 = arg0;
        class86.field1916 = 10000;
        class144.field3309 = arg2;
        if (arg4 >= 107) {
            class32.field578 = arg5;
            class68.field1369 = arg1;
            class95.field2126 = 1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lna;B)V")
    public final void method436(class91 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method649(false);
            if (var3 == 0) {
                if (arg1 != -72) {
                    return;
                }
                field1249++;
                return;
            }
            this.method433(-1, arg0, var3);
        }
    }
}
