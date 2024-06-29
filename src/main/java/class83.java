import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class83 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[[I")
    private int[][] field1025;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Loi;")
    public static class169 field1032;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Ldn;")
    public static class201 field1031;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "[[[J")
    public static long[][][] field1033;

    static {
        new class169(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field1032 = new class169("shake:", "schütteln:", "tremblement:", "tremor:");
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I", line = 4)
    public final int method469(int arg0, int arg1) {
        int var3 = -78 / ((arg0 - 28) / 54);
        field1024++;
        if (this.field1025 != null) {
            arg1 = (int) ((long) this.field1026 * (long) arg1 / (long) this.field1029);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Z", line = 20)
    public static final boolean method470(int arg0, int arg1) {
        if (arg0 > -64) {
            method473((byte) -44);
        }
        field1028++;
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I", line = 34)
    public final int method471(int arg0, boolean arg1) {
        if (arg1) {
            this.method469(-52, 59);
        }
        if (this.field1025 != null) {
            arg0 = (int) ((long) this.field1026 * (long) arg0 / (long) this.field1029) + 6;
        }
        field1034++;
        return arg0;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V", line = 50)
    public class83(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class334.method1985(arg1, arg0, 0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1029 = var5;
            this.field1026 = var4;
            this.field1025 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1025[var6];
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
                while (var11 > var10) {
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

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)[B", line = 110)
    public final byte[] method472(int arg0, byte[] arg1) {
        if (this.field1025 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1026 / (long) this.field1029) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1025[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1026 + var6;
                int var14 = var13 / this.field1029;
                var6 = var13 - this.field1029 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field1030++;
        if (arg0 <= 54) {
            this.field1025 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 177)
    public static void method473(byte arg0) {
        field1031 = null;
        if (arg0 != 120) {
            method473((byte) -45);
        }
        field1033 = null;
        field1032 = null;
    }
}
