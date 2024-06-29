import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class292 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[[I")
    private int[][] field4349;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lsd;")
    public static class74 field4341 = new class74(48, 0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lpn;")
    public static class72 field4347 = new class72(58, 2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1836(int arg0) {
        if (arg0 != 6090) {
            field4341 = null;
        }
        field4344++;
        if (class420.field6058 != null && class159.field1909 != null) {
            return;
        }
        class159.field1909 = new int[256];
        class420.field6058 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class420.field6058[var1] = (int) (Math.sin(var2) * 4096.0D);
            class159.field1909[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)I", line = 34)
    public final int method1837(boolean arg0, int arg1) {
        if (arg0) {
            this.field4346 = -124;
        }
        if (this.field4349 != null) {
            arg1 = (int) ((long) this.field4345 * (long) arg1 / (long) this.field4346);
        }
        field4340++;
        return arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)I", line = 49)
    public final int method1838(byte arg0, int arg1) {
        if (arg0 > -21) {
            field4347 = null;
        }
        if (this.field4349 != null) {
            arg1 = (int) ((long) this.field4345 * (long) arg1 / (long) this.field4346) + 6;
        }
        field4342++;
        return arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[B)[B", line = 66)
    public final byte[] method1839(int arg0, byte[] arg1) {
        if (this.field4349 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4345 / (long) this.field4346) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4349[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4345 + var6;
                int var14 = var13 / this.field4346;
                var5 += var14;
                var6 = var13 - this.field4346 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field4343++;
        if (arg0 != 0) {
            field4341 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z", line = 137)
    public static final boolean method1840(int arg0, byte arg1, int arg2) {
        field4348++;
        if ((class140.field1686[1][arg0][arg2] & 0x2) == 0) {
            int var3 = -90 / ((79 - arg1) / 34);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I", line = 153)
    public static int method1841(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 174)
    public static void method1842(int arg0) {
        if (arg0 <= 71) {
            field4347 = null;
        }
        field4347 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V", line = 184)
    public class292(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class15.method105(arg0, -123, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4346 = var4;
            this.field4349 = new int[var4][14];
            this.field4345 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4349[var6];
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
}
