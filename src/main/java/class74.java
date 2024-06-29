import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class74 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1260 = "Walk here";

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
    public static boolean field1262 = true;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1256 = -1;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[Lgk;")
    public static class273[] field1261 = new class273[8];

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1266 = -1;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
    public static int[] field1255;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "[I")
    public static int[] field1265;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[[[B")
    public static byte[][][] field1267;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLth;Lth;)V", line = 6)
    public static final void method618(boolean arg0, class57 arg1, class57 arg2) {
        field1257++;
        class321.field5113 = arg2;
        if (arg0) {
            field1269 = -122;
        }
        class205.field3244 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 22)
    public static void method619(int arg0) {
        if (arg0 != -2049) {
            method618(true, (class57) null, (class57) null);
        }
        field1260 = null;
        field1265 = null;
        field1267 = (byte[][][]) null;
        field1261 = null;
        field1268 = null;
        field1255 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 38)
    public static final void method620(byte arg0) {
        field1270++;
        if (class342.field5449 != null) {
            class342.field5449.method916((byte) 105);
            class342.field5449 = null;
        }
        class175.method1377(-1);
        class187.method1471();
        for (int var1 = 0; var1 < 4; var1++) {
            class32.field459[var1].method137(1);
        }
        class179.method1406(16, false);
        System.gc();
        class161.method1254(true, 2);
        class32.field461 = false;
        class196.field3132 = -1;
        class339.method2382(true, (byte) -110);
        class294.field4746 = false;
        class93.field1562 = 0;
        class113.field1844 = 0;
        class275.field4546 = 0;
        class316.field5050 = 0;
        for (int var2 = 0; var2 < field1261.length; var2++) {
            field1261[var2] = null;
        }
        if (arg0 >= -113) {
            field1260 = (String) null;
        }
        class35.field508 = 0;
        class345.field5501 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class56.field924[var3] = null;
            class261.field4401[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class165.field2621[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class211.field3372[var5][var6][var7] = null;
                }
            }
        }
        class317.method2243(0);
        class215.field3442 = 0;
        class241.method1835((byte) -88);
        class319.method2253(true, -311578841);
        try {
            class88.method702(class128.field2163.field2350, "loggedout", (byte) 82);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 151)
    public static final void method621(int arg0) {
        if (arg0 > -60) {
            method620((byte) 5);
        }
        field1262 = true;
        field1259++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 162)
    public static final String method622(int arg0, long arg1, int[] arg2, int arg3) {
        if (arg0 != -2049) {
            method618(true, (class57) null, (class57) null);
        }
        field1258++;
        if (class204.field3230 != null) {
            String var5 = class204.field3230.method611(arg1, 11, arg2, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIIILug;II)V", line = 183)
    public static final void method623(boolean arg0, int arg1, int arg2, int arg3, class220 arg4, int arg5, int arg6) {
        class181.method1420(arg4.field3511, -45, arg2, arg4.field3577, 0, arg1, arg6, arg3, arg5);
        field1263++;
        if (arg0) {
            field1266 = 85;
        }
    }
}
