import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class73 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[Lwr;")
    public class316[] field1097 = null;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lfb;")
    public class474 field1100 = null;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lfb;")
    public class474 field1101 = null;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lfb;")
    public class474 field1099 = null;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[Lwr;")
    public class316[] field1102 = null;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Z")
    public boolean field1096;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[F")
    public static float[] field1095 = new float[16384];

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[F")
    public static float[] field1103 = new float[16384];

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
    public static int[] field1104;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[I")
    public static int[] field1108;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "J")
    public static long field1109;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lff;")
    public static class9 field1106;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[[S")
    public static short[][] field1105;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1103[var2] = (float) Math.sin((double) var2 * var0);
            field1095[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1104 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
        field1108 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
        field1109 = 0L;
        field1106 = new class9(107, -1);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 10)
    public static final void method475(int arg0) {
        for (int var1 = 0; var1 < class104.field1527; var1++) {
            class231 var2 = class520.field7703[var1];
            boolean var3 = false;
            if (var2.field3101 == null) {
                var2.field3104--;
                if (var2.field3104 < (var2.field3111 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field3111 == 1 && var2.field3105 == null) {
                        var2.field3105 = class113.method776(class50.field774, var2.field3098, 0);
                        if (var2.field3105 == null) {
                            continue;
                        }
                        var2.field3104 += var2.field3105.method778();
                    } else if (var2.field3111 == 2 && (var2.field3103 == null || var2.field3102 == null)) {
                        if (var2.field3103 == null) {
                            var2.field3103 = class82.method508(class204.field2826, var2.field3098);
                        }
                        if (var2.field3103 == null) {
                            continue;
                        }
                        if (var2.field3102 == null) {
                            var2.field3102 = var2.field3103.method509(new int[] { 22050 });
                            if (var2.field3102 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field3104 < 0) {
                        int var5;
                        if (var2.field3106 == 0) {
                            var5 = class154.field2244.field7767 * var2.field3110 >> 8;
                        } else {
                            int var4 = (var2.field3106 & 0x324C296) >> 24;
                            if (class385.field5232.field573 == var4) {
                                int var6 = (var2.field3106 & 0xFF) << 7;
                                int var7 = var2.field3106 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class385.field5232.field584;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field3106 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class385.field5232.field574;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var6 < var11) {
                                    var2.field3104 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (var6 - var11) * var2.field3110 * class154.field2244.field7772 / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class404 var12 = null;
                            if (var2.field3111 == 1) {
                                var12 = var2.field3105.method777().method2355(class516.field7649);
                            } else if (var2.field3111 == 2) {
                                var12 = var2.field3102;
                            }
                            class7 var13 = var2.field3101 = class7.method79(var12, 100, var5);
                            var13.method85(var2.field3107 - 1);
                            class318.field4175.method3069(var13);
                        }
                    }
                }
            } else if (!var2.field3101.method302(-25575)) {
                var3 = true;
            }
            if (var3) {
                class104.field1527--;
                for (int var14 = var1; var14 < class104.field1527; var14++) {
                    class520.field7703[var14] = class520.field7703[var14 + 1];
                }
                var1--;
            }
        }
        field1098++;
        if (arg0 != -23625) {
            method475(21);
        }
        if (class21.field380 && !class422.method2429(arg0 ^ 0xFFFFA3CE)) {
            if (class154.field2244.field7775 != 0 && class153.field2234 != -1) {
                class290.method1700(0, class153.field2234, false, class449.field6118, true, class154.field2244.field7775);
            }
            class21.field380 = false;
        } else if (class154.field2244.field7775 != 0 && class153.field2234 != -1 && !class422.method2429(117)) {
            class150.field2137++;
            class118.method822(56, class31.field522);
            class193.field2708.method2214(90, class153.field2234);
            class153.field2234 = -1;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 186)
    public static void method476(int arg0) {
        field1104 = null;
        field1108 = null;
        field1103 = null;
        if (arg0 == 128) {
            field1095 = null;
            field1106 = null;
            field1105 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbo;)V", line = 251)
    public class73(class511 arg0) {
        this.field1096 = arg0.field7519;
        class16.method167(-7856, arg0);
        if (this.field1096) {
            byte[] var6 = class380.method2256(4, false, class23.field399);
            this.field1101 = new class474(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class380.method2256(4, false, class200.field2773);
            this.field1100 = new class474(arg0, 6410, 128, 128, 16, var7, 6410);
            class65 var8 = arg0.field7399;
            if (var8.method447(101)) {
                byte[] var9 = class380.method2256(4, false, class370.field4988);
                this.field1099 = new class474(arg0, 6408, 128, 128, 16);
                class474 var10 = new class474(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method445(0, 2.0F, this.field1099, var10)) {
                    this.field1099.method2868(-59);
                } else {
                    this.field1099.method2861(false);
                    this.field1099 = null;
                }
                var10.method2861(false);
            }
        } else {
            this.field1097 = new class316[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class425.method2452((byte) 125, 32768, var2 * 128 * 128 * 2, class23.field399);
                this.field1097[var2] = new class316(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1102 = new class316[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class425.method2452((byte) 114, 32768, var3 * 128 * 256, class200.field2773);
                this.field1102[var3] = new class316(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
