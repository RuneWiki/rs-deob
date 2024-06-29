import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
    private int[][] field1014;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Z")
    public static volatile boolean field1013 = false;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lrd;")
    private static class114 field1019 = class84.method656("Loaded textures", (byte) 121);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lrd;")
    public static class114 field1032 = field1019;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lrd;")
    private static class114 field1025 = class84.method656("Loaded gamescreen", (byte) 120);

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lrd;")
    public static class114 field1034 = null;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lrd;")
    private static class114 field1030 = class84.method656("Please remove ", (byte) 126);

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lrd;")
    public static class114 field1023 = field1030;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lrd;")
    public static class114 field1031 = field1025;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lrd;")
    public static class114 field1027 = field1030;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Ldf;")
    public static class28 field1028;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Loa;")
    public static class93 field1021;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lhf;")
    public static final class55 method350(int arg0, int arg1) {
        field1017++;
        class55 var2 = (class55) class67.field1458.method194((byte) -120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -128) {
            method356(true);
        }
        byte[] var3 = class69.field1516.method762(4, arg1, (byte) 66);
        class55 var4 = new class55();
        if (var3 != null) {
            var4.method409(16876, new class60(var3), arg1);
        }
        var4.method411((byte) 92);
        class67.field1458.method193(-93, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
    public static final void method351(byte arg0, int arg1) {
        field1033++;
        if (arg0 != 93) {
            field1019 = null;
        }
        if (class98.field2216 == null) {
            return;
        }
        if (class110.field2575 == 0) {
            if (class36.field699 < 0) {
                return;
            }
            class36.field699 = arg1;
            class98.field2216.method176(0, arg1, arg0 - 79);
        } else if (class65.field1395 != null) {
            class20.field371 = arg1;
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
    public final int method352(int arg0, int arg1) {
        if (this.field1014 != null) {
            arg1 = (int) ((long) this.field1018 * (long) arg1 / (long) this.field1016) + 6;
        }
        if (arg0 != 0) {
            this.method353((byte) -120, null);
        }
        field1015++;
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B[B)[B")
    public final byte[] method353(byte arg0, byte[] arg1) {
        field1020++;
        if (this.field1014 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1018 / (long) this.field1016) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1014[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1018 + var6;
                int var14 = var13 / this.field1016;
                var6 = var13 - this.field1016 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg0 == 127 ? arg1 : null;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
    public final int method354(int arg0, int arg1) {
        if (this.field1014 != null) {
            arg1 = (int) ((long) this.field1018 * (long) arg1 / (long) this.field1016);
        }
        if (arg0 != -128) {
            this.field1016 = 24;
        }
        field1029++;
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method355(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class132 var5 = (class132) class132.field3197.method783(-1, (long) arg0);
        field1024++;
        if (var5 == null) {
            var5 = new class132();
            class132.field3197.method781((byte) -7, (long) arg0, var5);
        }
        if (var5.field3193.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field3193.length; var8++) {
                var6[var8] = var5.field3193[var8];
                var7[var8] = var5.field3186[var8];
            }
            for (int var9 = var5.field3193.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3186 = var7;
            var5.field3193 = var6;
        }
        var5.field3193[arg4] = arg3;
        if (arg1 >= 29) {
            var5.field3186[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
    public class49(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class121.method940(15106, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1014 = new int[var5][14];
            this.field1016 = var5;
            this.field1018 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1014[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method356(boolean arg0) {
        field1025 = null;
        field1023 = null;
        field1030 = null;
        field1027 = null;
        field1021 = null;
        field1028 = null;
        field1031 = null;
        field1034 = null;
        if (arg0) {
            field1019 = null;
            field1032 = null;
        }
    }
}
