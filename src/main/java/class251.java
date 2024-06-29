import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class251 {

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "[I")
    private int[] field3673 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "[Lcea;")
    public static class96[] field3675 = new class96[2048];

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "Lav;")
    public class416 field3685;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "[I")
    private int[] field3681;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "[S")
    private short[] field3674;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "[S")
    private short[] field3677;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "[S")
    private short[] field3679;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "[S")
    private short[] field3680;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1714(int arg0) {
        field3671++;
        if (this.field3681 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -1595576016) {
            return false;
        }
        class237 var3 = this.field3685.field5881;
        synchronized (this.field3685.field5881) {
            for (int var4 = 0; var4 < this.field3681.length; var4++) {
                if (!this.field3685.field5881.method1570(-2, this.field3681[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIII[I)V", line = 42)
    public static final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field3678++;
        if (arg4 > 0 && !class88.method611(arg4, 2)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class88.method611(arg6, 2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 != 32993) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 7) {
            int var8 = 0;
            int var9 = arg6 <= arg4 ? arg6 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg5, arg4, arg6, 0, arg1, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = (var20 & 0xFFBF) >> 8;
                        int var24 = var20 >> 16 & 0xFF;
                        int var25 = var20 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var12[var16++];
                        int var28 = (var21 >> 24 & 0xFF) + var26;
                        int var29 = (var21 & 0xFF) + var25;
                        int var30 = ((var21 & 0xFF03) >> 8) + var23;
                        int var31 = ((var21 & 0xFFE7B2) >> 16) + var24;
                        int var32 = (var22 & 0xFF) + var29;
                        int var33 = (var22 >> 24 & 0xFF) + var28;
                        int var34 = ((var22 & 0xFF3D) >> 8) + var30;
                        int var35 = ((var22 & 0xFFCC89) >> 16) + var31;
                        int var36 = (var27 >> 8 & 0xFF) + var34;
                        int var37 = (var27 & 0xFF) + var32;
                        int var38 = (var27 >> 16 & 0xFF) + var35;
                        int var39 = (var27 >> 24 & 0xFF) + var33;
                        var13[var14++] = class678.method3817(class678.method3817(class678.method3817(class665.method3759(var38, 1020) << 14, class665.method3759(-16777216, var39 << 22)), class665.method3759(1020, var36) << 6), class665.method3759(255, var37 >> 2));
                    }
                    var16 += arg4;
                    var15 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg6 = var11;
                arg4 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILdc;)V", line = 151)
    public final void method1716(int arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 <= 52) {
                    return;
                }
                field3683++;
                return;
            }
            this.method1718(var3, 93, arg1);
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Lvo;", line = 176)
    public final class133 method1717(int arg0) {
        field3682++;
        class133[] var2 = new class133[5];
        int var3 = 0;
        class237 var4 = this.field3685.field5881;
        synchronized (this.field3685.field5881) {
            if (arg0 != -24585) {
                this.field3677 = null;
            }
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3673[var5] != -1) {
                    var2[var3++] = class214.method1266(this.field3685.field5881, 0, this.field3673[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1891 < 13) {
                var2[var6].method833(2, 6);
            }
        }
        class133 var7 = new class133(var2, var3);
        if (this.field3674 != null) {
            for (int var8 = 0; var8 < this.field3674.length; var8++) {
                var7.method838(this.field3680[var8], this.field3674[var8], 0);
            }
        }
        if (this.field3677 != null) {
            for (int var9 = 0; var9 < this.field3677.length; var9++) {
                var7.method835(this.field3679[var9], (byte) -89, this.field3677[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILdc;)V", line = 256)
    private final void method1718(int arg0, int arg1, class63 arg2) {
        int var4 = 16 / ((arg1 - 42) / 38);
        if (arg0 == 1) {
            arg2.method505((byte) -119);
        } else if (arg0 == 2) {
            int var5 = arg2.method505((byte) -119);
            this.field3681 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3681[var6] = arg2.method482(-772591672);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var9 = arg2.method505((byte) -119);
                this.field3674 = new short[var9];
                this.field3680 = new short[var9];
                for (int var10 = 0; var10 < var9; var10++) {
                    this.field3674[var10] = (short) arg2.method482(-772591672);
                    this.field3680[var10] = (short) arg2.method482(-772591672);
                }
            } else if (arg0 == 41) {
                int var7 = arg2.method505((byte) -119);
                this.field3679 = new short[var7];
                this.field3677 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field3677[var8] = (short) arg2.method482(-772591672);
                    this.field3679[var8] = (short) arg2.method482(-772591672);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3673[arg0 - 60] = arg2.method482(-772591672);
            }
        }
        field3676++;
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)Lvo;", line = 338)
    public final class133 method1719(int arg0) {
        field3684++;
        if (this.field3681 == null) {
            return null;
        }
        class133[] var2 = new class133[this.field3681.length];
        class237 var3 = this.field3685.field5881;
        synchronized (this.field3685.field5881) {
            int var4 = arg0;
            while (true) {
                if (var4 >= this.field3681.length) {
                    break;
                }
                var2[var4] = class214.method1266(this.field3685.field5881, 0, this.field3681[var4], arg0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3681.length; var5++) {
            if (var2[var5].field1891 < 13) {
                var2[var5].method833(2, arg0 ^ 0x6);
            }
        }
        class133 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class133(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3674 != null) {
            for (int var7 = 0; var7 < this.field3674.length; var7++) {
                var6.method838(this.field3680[var7], this.field3674[var7], 0);
            }
        }
        if (this.field3677 != null) {
            for (int var8 = 0; var8 < this.field3677.length; var8++) {
                var6.method835(this.field3679[var8], (byte) -89, this.field3677[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 410)
    public static void method1720(byte arg0) {
        if (arg0 != -101) {
            method1715(79, 100, 8, 101, 7, 51, 66, null);
        }
        field3675 = null;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)Z", line = 423)
    public final boolean method1721(byte arg0) {
        field3670++;
        boolean var2 = true;
        class237 var3 = this.field3685.field5881;
        synchronized (this.field3685.field5881) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3673[var4] != -1 && !this.field3685.field5881.method1570(-2, this.field3673[var4], 0)) {
                    var2 = false;
                }
            }
            int var5 = -61 / (arg0 / 60);
            return var2;
        }
    }
}
