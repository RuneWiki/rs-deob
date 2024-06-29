import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[I")
    public static int[] field1280 = new int[256];

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Loh;")
    private static class258 field1283;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Loh;")
    public static class258 field1282;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Loh;")
    public static class258 field1285;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lsj;")
    public static class169 field1289;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lgb;")
    public static class213 field1284;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
    public static int[] field1288;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 9)
    public static void method542(int arg0) {
        field1282 = null;
        field1285 = null;
        field1280 = null;
        field1283 = null;
        field1289 = null;
        if (arg0 > -86) {
            method542(48);
        }
        field1284 = null;
        field1288 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnd;I)V", line = 28)
    public static final void method543(class58 arg0, int arg1) {
        field1281++;
        int var2 = arg0.field943 - class202.field3498;
        int var3 = arg0.field928 * 128 + (arg0.method447(18123) * 64);
        int var4 = arg0.field948 * 128 + arg0.method447(18123) * 64;
        if (arg0.field982 == 0) {
            arg0.field961 = 1024;
        }
        if (arg1 > -72) {
            method544((byte) 102);
        }
        arg0.field934 += (var4 - arg0.field934) / var2;
        if (arg0.field982 == 1) {
            arg0.field961 = 1536;
        }
        arg0.field958 = 0;
        if (arg0.field982 == 2) {
            arg0.field961 = 0;
        }
        if (arg0.field982 == 3) {
            arg0.field961 = 512;
        }
        arg0.field912 += (var3 - arg0.field912) / var2;
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
            field1280[var0] = var1;
        }
        field1283 = class153.method1046("Loading sprites )2 ", 113);
        field1282 = class153.method1046("hitmarks", 86);
        field1285 = field1283;
        field1286 = 1;
        field1287 = -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 72)
    public static final void method544(byte arg0) {
        if (class299.field5112 != null) {
            class91 var1 = class299.field5112;
            synchronized (class299.field5112) {
                class299.field5112 = null;
            }
        }
        int var3 = 115 / ((7 - arg0) / 52);
        field1279++;
    }
}
