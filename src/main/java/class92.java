import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class92 {

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1277 = 0;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[F")
    public static float[] field1275 = new float[16384];

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[F")
    public static float[] field1278 = new float[16384];

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "[J")
    public static long[] field1276 = new long[100];

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "[I")
    public static int[] field1280 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
    public static int[] field1283;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Lgp;")
    public static class459 field1284;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "[Lna;")
    public static class251[] field1285;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1275[var2] = (float) Math.sin((double) var2 * var0);
            field1278[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1283 = new int[4096];
        for (int var3 = 0; var3 < 4096; var3++) {
            field1283[var3] = class398.method2367(41, var3);
        }
        field1284 = new class459(5, 7);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V", line = 20)
    public static final void method632(byte arg0) {
        if (arg0 != 58) {
            method634((byte) 70);
        }
        field1279++;
        int var1 = class206.field2684;
        int[] var2 = class143.field1892;
        for (int var3 = 0; var3 < var1; var3++) {
            class518 var7 = class76.field952[var2[var3]];
            if (var7 != null && var7.field5223 > 0) {
                var7.field5223--;
                if (var7.field5223 == 0) {
                    var7.field5229 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class16.field264; var4++) {
            int var5 = class414.field5507[var4];
            class295 var6 = class527.field7791[var5];
            if (var6 != null && var6.field5223 > 0) {
                var6.field5223--;
                if (var6.field5223 == 0) {
                    var6.field5229 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V", line = 76)
    public static final void method633(byte arg0, int arg1) {
        field1282++;
        if (arg0 <= 96) {
            method634((byte) 19);
        }
        class249.field3175.method80(-38, arg1);
        class24.field429.method80(-56, arg1);
        class412.field5493.method80(-50, arg1);
        class248.field3172.method80(-69, arg1);
        class256.field3238.method80(-25, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V", line = 93)
    public static void method634(byte arg0) {
        field1280 = null;
        field1276 = null;
        field1278 = null;
        if (arg0 == -109) {
            field1285 = null;
            field1275 = null;
            field1283 = null;
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Lvs;", line = 109)
    public static final class465 method635(int arg0, int arg1) {
        field1274++;
        class362[] var2 = class89.field1243;
        synchronized (class89.field1243) {
            if (arg1 != -16461) {
                field1283 = null;
            }
            class465 var3;
            if (class89.field1243.length <= arg0 || class89.field1243[arg0].method2130((byte) -76)) {
                var3 = new class465();
                var3.field6843 = new class530[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field6843[var4] = new class530();
                }
            } else {
                var3 = (class465) class89.field1243[arg0].method2123((byte) 10);
                var3.method2336((byte) 95);
                int var10002 = class18.field320[arg0]--;
            }
            return var3;
        }
    }
}
