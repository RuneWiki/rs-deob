import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class73 extends class136 {

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    private int field1002 = 3216;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    private int field999 = 4096;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    private int field1003 = 3216;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "[I")
    private int[] field1008 = new int[3];

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field1001 = 2;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Lbg;")
    public static class324 field998 = new class324(13, -2);

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "Lfs;")
    public static class387 field1005;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
    public static void method691(boolean arg0) {
        if (arg0) {
            method694((byte) -74, (class432) null);
        }
        field998 = null;
        field1005 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field993;
        int var8 = arg6 - 334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (class146.field2033 - class445.field6588) * var8 / 100 + class445.field6588;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16383 & -arg7 + 16384;
        int var12 = 16383 & -arg4 + 16384;
        int var13 = arg0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class340.field4724[var11] * -var10 >> 15;
            var15 = class340.field4715[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class340.field4724[var12] * var15 >> 15;
            var15 = class340.field4715[var12] * var15 >> 15;
        }
        class321.field4529 = arg7;
        class161.field2268 = arg1 - var13;
        class170.field2418 = 0;
        class486.field7138 = -var15 + arg3;
        class316.field4503 = arg4;
        class487.field7162 = -var14 + arg5;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class73() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (arg0) {
            this.field1002 = -62;
        }
        ++field994;
        this.method693(-57);
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
    private final void method693(int arg0) {
        ++field1000;
        double var2 = Math.cos((double) ((float) this.field1003 / 4096.0F));
        this.field1008[0] = (int) (var2 * Math.sin((double) ((float) this.field1002 / 4096.0F)) * 4096.0D);
        this.field1008[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1002 / 4096.0F)));
        this.field1008[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1003 / 4096.0F)));
        if (arg0 >= -44) {
            method694((byte) -59, (class432) null);
        }
        int var4 = this.field1008[0] * this.field1008[0] >> 12;
        int var5 = this.field1008[1] * this.field1008[1] >> 12;
        int var6 = this.field1008[2] * this.field1008[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (~var7 != -1) {
            this.field1008[2] = (this.field1008[2] << 12) / var7;
            this.field1008[1] = (this.field1008[1] << 12) / var7;
            this.field1008[0] = (this.field1008[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 == 4) {
            ++field1004;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field1003 = arg2.method623((byte) -125);
                    }
                } else {
                    this.field1002 = arg2.method623((byte) -73);
                }
            } else {
                this.field999 = arg2.method623((byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLji;)V")
    public static final void method694(byte arg0, class432 arg1) {
        if (arg0 > -1) {
            method695(-53, (long[]) null, (Object[]) null, 10, 26);
        }
        class425.field6285 = arg1;
        ++field996;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
    public static final void method695(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        if (~arg0 > ~arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; ++var11) {
                if (arg1[var11] < var7 - -((long) (var11 & var10))) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method695(arg0, arg1, arg2, var6 + -1, 28260);
            method695(var6 - -1, arg1, arg2, arg3, 28260);
        }
        ++field1006;
        if (arg4 != 28260) {
            method691(false);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field997;
        int var3 = -102 % ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var5 = class196.field2863 * this.field999 >> 12;
            int[] var6 = this.method1033(arg1 + -1 & class519.field7637, 0, 0);
            int[] var7 = this.method1033(arg1, 0, 0);
            int[] var8 = this.method1033(class519.field7637 & arg1 - -1, 0, 0);
            for (int var9 = 0; var9 < class467.field6889; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 + -1 & class166.field2356] - var7[class166.field2356 & var9 + 1]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class45.field505[var12 - -((var13 + 1) * var13 >> 1)];
                int var15 = var11 * var14 >> 8;
                int var16 = var14 * 4096 >> 8;
                int var17 = var10 * var14 >> 8;
                int var18 = this.field1008[0] * var15 >> 12;
                int var19 = this.field1008[1] * var17 >> 12;
                int var20 = this.field1008[2] * var16 >> 12;
                var4[var9] = var18 + var20 - -var19;
            }
        }
        return var4;
    }
}
