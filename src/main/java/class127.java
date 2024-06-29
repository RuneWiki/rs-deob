import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class127 extends class64 {

    @OriginalMember(owner = "client!w", name = "sb", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!w", name = "pb", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!w", name = "ob", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!w", name = "xb", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!w", name = "Ab", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!w", name = "rb", descriptor = "Ls;")
    private class107 field3096;

    @OriginalMember(owner = "client!w", name = "vb", descriptor = "I")
    private int field3100;

    @OriginalMember(owner = "client!w", name = "qb", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!w", name = "yb", descriptor = "Lkc;")
    public static class63 field3103 = new class63(50);

    @OriginalMember(owner = "client!w", name = "Db", descriptor = "I")
    public static int field3108 = 0;

    @OriginalMember(owner = "client!w", name = "Cb", descriptor = "Lmc;")
    private static class75 field3107 = class30.method234(true, "Error connecting to server)3");

    @OriginalMember(owner = "client!w", name = "Bb", descriptor = "Z")
    public static boolean field3106 = false;

    @OriginalMember(owner = "client!w", name = "Fb", descriptor = "I")
    public static int field3110 = 0;

    @OriginalMember(owner = "client!w", name = "Eb", descriptor = "Lmc;")
    private static class75 field3109 = class30.method234(true, "No reply from loginserver)3");

    @OriginalMember(owner = "client!w", name = "Gb", descriptor = "Lmc;")
    public static class75 field3111 = field3109;

    @OriginalMember(owner = "client!w", name = "Hb", descriptor = "Lmc;")
    public static class75 field3112 = field3107;

    @OriginalMember(owner = "client!w", name = "Ib", descriptor = "[I")
    public static int[] field3113 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!w", name = "tb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!w", name = "ub", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!w", name = "zb", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!w", name = "Jb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 3)
    public static final void method1001(int arg0) {
        int var1 = 4 / ((-arg0 - 69) / 36);
        field3099++;
        if (class96.field2417 != 0 || class97.field2435 != 1) {
            return;
        }
        int var2 = class12.field245 - 575;
        int var3 = class71.field1813 - 5 - 4;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var3 -= 75;
        var2 -= 73;
        int var4 = class97.field2455 + class43.field1025 & 0x7FF;
        int var5 = class49.field1194[var4];
        int var6 = class49.field1196[var4];
        int var7 = (class91.field2230 + 256) * var5 >> 8;
        int var8 = (class91.field2230 + 256) * var6 >> 8;
        int var9 = var2 * var7 + var3 * var8 >> 11;
        int var10 = var3 * var7 - var2 * var8 >> 11;
        int var11 = class52.field1315.field1233 + var9 >> 7;
        int var12 = class52.field1315.field1242 - var10 >> 7;
        boolean var13 = class111.method906((byte) 125, 0, 0, var11, 0, 0, true, 1, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var12);
        if (!var13) {
            return;
        }
        class118.field2923.method493((byte) 88, var2);
        class118.field2923.method493((byte) 88, var3);
        class118.field2923.method530(class43.field1025, 109);
        class118.field2923.method493((byte) 88, 57);
        class118.field2923.method493((byte) 88, class97.field2455);
        class118.field2923.method493((byte) 88, class91.field2230);
        class118.field2923.method493((byte) 88, 89);
        class118.field2923.method530(class52.field1315.field1233, 109);
        class118.field2923.method530(class52.field1315.field1242, 119);
        class118.field2923.method493((byte) 88, class68.field1746);
        class118.field2923.method493((byte) 88, 63);
        return;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V", line = 65)
    public static void method1002(int arg0) {
        field3113 = null;
        field3112 = null;
        field3107 = null;
        field3109 = null;
        field3103 = null;
        field3111 = null;
        if (arg0 != -23282) {
            method1003(true);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)[Lnc;", line = 95)
    public static final class81[] method1003(boolean arg0) {
        class81[] var1 = new class81[class5.field76];
        field3104++;
        if (arg0) {
            return null;
        }
        for (int var2 = 0; var2 < class5.field76; var2++) {
            class81 var3 = var1[var2] = new class81();
            var3.field2026 = class55.field1395;
            var3.field2022 = class130.field3170;
            var3.field2024 = class47.field1154[var2];
            var3.field2023 = class43.field1031[var2];
            var3.field2027 = class100.field2592[var2];
            var3.field2028 = class36.field880[var2];
            var3.field2025 = class85.field2109;
            var3.field2029 = class118.field2924[var2];
        }
        class41.method317(7);
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)Lpc;", line = 132)
    public final class93 method561(boolean arg0) {
        field3098++;
        if (this.field3096 != null) {
            int var2 = class34.field781 - this.field3100;
            if (var2 > 100 && this.field3096.field2666 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field3096.field2675[this.field3095] >= var2) {
                            break label42;
                        }
                        var2 -= this.field3096.field2675[this.field3095];
                        this.field3095++;
                    } while (this.field3095 < this.field3096.field2662.length);
                    this.field3095 -= this.field3096.field2666;
                } while (this.field3095 >= 0 && this.field3095 < this.field3096.field2662.length);
                this.field3096 = null;
            }
            this.field3100 = class34.field781 - var2;
        }
        class59 var3 = class50.method387(-26274, this.field3093);
        if (var3.field1484 != null) {
            var3 = var3.method474(5234);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0) {
                this.field3094 = 83;
            }
            return var3.method477(this.field3092, this.field3096, this.field3101, this.field3094, this.field3095, this.field3097, -99, this.field3102, this.field3105);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 204)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field3097 = arg5;
        this.field3094 = arg6;
        this.field3093 = arg0;
        this.field3092 = arg1;
        this.field3102 = arg3;
        this.field3101 = arg2;
        this.field3105 = arg4;
        if (arg7 != -1) {
            this.field3096 = class37.method289(arg7, (byte) -128);
            this.field3100 = class34.field781 - 1;
            this.field3095 = 0;
            if (arg8 && this.field3096.field2666 != -1) {
                this.field3095 = (int) ((double) this.field3096.field2662.length * Math.random());
                this.field3100 -= (int) (Math.random() * (double) this.field3096.field2675[this.field3095]);
                return;
            }
        }
    }
}
