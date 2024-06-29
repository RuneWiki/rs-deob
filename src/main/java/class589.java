import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class589 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    private int field8345;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    private int field8356;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[[I")
    private int[][] field8346;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field8351 = 1;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Loi;")
    public static class73 field8347 = new class73("", 16);

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZZ)V")
    public static final void method3402(boolean arg0, boolean arg1) {
        field8348++;
        class63.field908++;
        class468 var2 = class93.method734(class29.field284, class443.field6588, 8174);
        if (!arg0) {
            return;
        }
        class120.method872((byte) 127, var2);
        for (class421 var3 = (class421) class291.field4168.method2283(false); var3 != null; var3 = (class421) class291.field4168.method2282((byte) 58)) {
            if (!var3.method1303((byte) 26)) {
                var3 = (class421) class291.field4168.method2283(!arg0);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field6285 == 0) {
                class327.method2074(arg1, !arg0, var3, true);
            }
        }
        if (class625.field8742 != null) {
            class673.method3850(class625.field8742, (byte) -109);
            class625.field8742 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
    public final int method3403(int arg0, int arg1) {
        if (this.field8346 != null) {
            arg0 = (int) ((long) this.field8356 * (long) arg0 / (long) this.field8345) + 6;
        }
        if (arg1 != 16) {
            field8355 = 32;
        }
        field8354++;
        return arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B[S)[S")
    public final short[] method3404(byte arg0, short[] arg1) {
        field8353++;
        if (arg0 > -115) {
            field8347 = null;
        }
        if (this.field8346 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field8356 / (long) this.field8345) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field8346[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field8356 + var6;
                int var14 = var13 / this.field8345;
                var5 += var14;
                var6 = var13 - this.field8345 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)I")
    public final int method3405(boolean arg0, int arg1) {
        field8352++;
        if (!arg0) {
            method3406(-109);
        }
        if (this.field8346 != null) {
            arg1 = (int) ((long) this.field8356 * (long) arg1 / (long) this.field8345);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method3406(int arg0) {
        field8347 = null;
        if (arg0 != -15) {
            method3406(94);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BZ)[B")
    public final byte[] method3407(byte[] arg0, boolean arg1) {
        if (!arg1) {
            method3406(-93);
        }
        if (this.field8346 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field8356 / (long) this.field8345) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field8346[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8356 + var6;
                int var14 = var13 / this.field8345;
                var6 = var13 - this.field8345 * var14;
                var5 += var14;
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
        field8350++;
        return arg0;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(II)V")
    public class589(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class86.method699((byte) -105, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field8345 = var5;
            this.field8356 = var4;
            this.field8346 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field8346[var6];
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
}
