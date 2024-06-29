import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class56 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[[I")
    private int[][] field769;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Z")
    public static boolean field768 = false;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lfp;")
    public static class437 field763 = new class437(4, 1, 1, 1);

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lgn;")
    public static class526 field772 = new class526(2, 3);

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public static boolean field774 = false;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Ljo;")
    public static class382 field773 = new class382(64);

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BB)[B")
    public final byte[] method410(byte[] arg0, byte arg1) {
        if (arg1 > -92) {
            return null;
        }
        if (this.field769 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field770 / (long) this.field767) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field769[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field770 + var6;
                int var14 = var13 / this.field767;
                var5 += var14;
                var6 = var13 - this.field767 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field771++;
        return arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method411(byte arg0) {
        field764++;
        class452.method2630((byte) -107);
        class170.field2500 = null;
        class378.field5692 = null;
        class27.field395 = null;
        class164.field2446 = null;
        class303.field4521 = null;
        int var1 = -36 / ((arg0 + 10) / 44);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method412(byte arg0) {
        field773 = null;
        field763 = null;
        if (arg0 != -128) {
            method412((byte) -52);
        }
        field772 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)I")
    public final int method413(boolean arg0, int arg1) {
        field765++;
        if (!arg0) {
            this.field767 = 67;
        }
        if (this.field769 != null) {
            arg1 = ((int) ((long) this.field770 * (long) arg1 / (long) this.field767)) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)I")
    public final int method414(byte arg0, int arg1) {
        if (this.field769 != null) {
            arg1 = (int) ((long) this.field770 * (long) arg1 / (long) this.field767);
        }
        if (arg0 != -87) {
            this.field769 = null;
        }
        field766++;
        return arg1;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
    public class56(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class375.method2224(arg0, arg1, 115);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field769 = new int[var4][14];
            this.field767 = var4;
            this.field770 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field769[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
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
}
