import java.awt.Frame;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 {

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lne;")
    public static class235 field393 = new class235(64);

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lwm;")
    public static class152 field398 = class157.method1048("Chargement des interfaces )2 ", 106);

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[[I")
    public static int[][] field404 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Z")
    public static boolean field407 = false;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lwm;")
    private static class152 field401 = class157.method1048("Face here", 96);

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[I")
    public static int[] field405 = new int[2];

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lwm;")
    public static class152 field406 = field401;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lah;")
    public static class205 field408;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lak;")
    public static class311 field399;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field397;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field391;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[Lbg;")
    public static class203[] field402;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[[B")
    public static byte[][] field403;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIIIFIIZ)[I", line = 10)
    public static final int[] method189(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, boolean arg7) {
        field390++;
        int[] var8 = new int[arg3];
        class252 var9 = new class252();
        var9.field4324 = (int) (arg4 * 4096.0F);
        var9.field4349 = arg7;
        var9.field4327 = arg1;
        var9.field4334 = arg5;
        var9.field4323 = arg6;
        var9.field4333 = arg2;
        var9.method673(8);
        class54.method361(70, 1, arg3);
        var9.method1747(0, arg0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILwm;Lwm;I)V", line = 34)
    public static final void method190(int arg0, class152 arg1, class152 arg2, int arg3) {
        field388++;
        class201.field3237 = arg1;
        class90.field1265 = arg0;
        class201.field3241 = arg2;
        if (class201.field3241.method992(23292, class201.field3252) || class201.field3237.method992(23292, class201.field3252)) {
            class184.field2930 = 3;
        } else if (class314.field5443 == -1) {
            class18.field250 = 1;
            class184.field2930 = -3;
            class172.field2745 = 0;
            class30.field506 = 0;
            class291 var4 = new class291(128);
            var4.method1980(false, 10);
            var4.method1994((int) (Math.random() * 99999.0D), 2921);
            var4.method1994(531, 2921);
            var4.method1988(class201.field3241.method1013(arg3 - 10711), 89);
            var4.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
            var4.method2015(-21389, class201.field3237);
            var4.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
            var4.method2006(class54.field847, false, class116.field1635);
            class245.field4102.field4946 = 0;
            class245.field4102.method1980(false, 239);
            class245.field4102.method1980(false, var4.field4946);
            if (arg3 == -7963) {
                class245.field4102.method1989(var4.field4950, 0, (byte) 126, var4.field4946);
            }
        } else {
            class239.method1637(arg3 ^ 0xFFFFCD10);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V", line = 78)
    public static final void method191(int arg0, int arg1, int arg2) {
        field387++;
        int var3 = 93 / ((-arg2 - 40) / 47);
        short var4 = 256;
        if (class202.field3269 > 0) {
            class149.method939(class202.field3269, (byte) -26);
            class202.field3269 = 0;
        }
        int var5 = 0;
        int var6 = class96.field1380 * arg1;
        int var7 = 0;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var9 = (var4 - var8) * class245.field4108[var8] / var4;
            if (var9 < 0) {
                var9 = 0;
            }
            var5 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var11 = class241.field3938[var5++];
                int var12 = class96.field1376[var6++ + arg0];
                if (var11 == 0) {
                    class157.field2494.field1552[var7++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var11 + 18);
                    int var15 = class133.field2042[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class157.field2494.field1552[var7++] = class34.method251(class34.method251(var15, 16711935) * var13 + var14 * class34.method251(var12, 16711935), -16711936) + class34.method251(16711680, class34.method251(var15, 65280) * var13 + class34.method251(var12, 65280) * var14) >> 8;
                }
            }
            for (int var16 = 0; var16 < var9; var16++) {
                class157.field2494.field1552[var7++] = class96.field1376[arg0 + (var6++)];
            }
            var6 += class96.field1380 - 128;
        }
        if (class217.field3516) {
            class13.method73(class157.field2494.field1552, arg0, arg1, class157.field2494.field3281, class157.field2494.field3284);
        } else {
            class157.field2494.method435(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 167)
    public static void method192(int arg0) {
        if (arg0 < 60) {
            method191(44, 109, -81);
        }
        field405 = null;
        field404 = (int[][]) null;
        field397 = null;
        field403 = (byte[][]) null;
        field393 = null;
        field402 = null;
        field401 = null;
        field406 = null;
        field399 = null;
        field408 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lhi;I[B)V", line = 194)
    public final void method193(class291 arg0, int arg1, byte[] arg2) {
        field392++;
        if (arg0.field4950[arg0.field4946] != 31 || arg0.field4950[arg0.field4946 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field391 == null) {
            this.field391 = new Inflater(true);
        }
        try {
            this.field391.setInput(arg0.field4950, arg0.field4946 + 10, arg0.field4950.length + -8 + -10 + -arg0.field4946);
            if (arg1 != 0) {
                this.field391 = (Inflater) null;
            }
            this.field391.inflate(arg2);
        } catch (Exception var5) {
            this.field391.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field391.reset();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V", line = 223)
    public static final void method194(byte arg0, int arg1) {
        class121.field1708.method1617(arg1, 50);
        field396++;
        if (arg0 < 56) {
            method189(false, -53, 64, 54, 0.9784758F, -88, -20, false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 240)
    public static final void method195(int arg0, int arg1) {
        if (arg1 != 0) {
            method190(-106, (class152) null, (class152) null, 97);
        }
        class308.field5285.method1617(arg0, 50);
        field389++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)I", line = 251)
    public static final int method196(byte arg0, int arg1, int arg2) {
        field395++;
        int var3 = class213.method1440(arg1 + 91923, 4, arg2 + 45365, 0) + (class213.method1440(arg1 + 37821, 2, arg2 + 10294, 0) - 128 >> 1) + (class213.method1440(arg1, 1, arg2, 0) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = 26 / ((arg0 + 12) / 57);
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lld;ZZ)V", line = 277)
    public static final void method197(class122 arg0, boolean arg1, boolean arg2) {
        field394++;
        int var3 = arg0.field1724;
        int var4 = (int) arg0.field4689;
        arg0.method1880(-25368);
        if (arg2) {
            class253.method1764(var3, (byte) -77);
        }
        class160.method1080(var3, false);
        class127 var5 = class11.method54(arg1, var4);
        if (var5 != null) {
            class272.method1868(22889, var5);
        }
        int var6 = class160.field2556;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class289.method1945(class273.field4688[var7], (byte) 126)) {
                class194.method1299(var7, (byte) 47);
            }
        }
        if (class160.field2556 == 1) {
            class70.field1016 = false;
            class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
        } else {
            class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
            int var8 = class316.field5485.method1123(class48.field741);
            for (int var9 = 0; var9 < class160.field2556; var9++) {
                int var10 = class316.field5485.method1123(class6.method27(var9, -51));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class17.field232 = var8 + 8;
            class258.field4429 = (class180.field2874 ? 26 : 22) + class160.field2556 * 15;
        }
        if (class253.field4387 != -1) {
            class157.method1058(1, -127, class253.field4387);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 342)
    public class23() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(III)V", line = 356)
    private class23(int arg0, int arg1, int arg2) {
    }
}
