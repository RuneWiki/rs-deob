import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class285 extends class28 {

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lpea;")
    private class641 field3840;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Lhj;")
    private class329 field3843;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lle;")
    private class517 field3844;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "[[F")
    private float[][] field3861;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "[[F")
    private float[][] field3855;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[[F")
    private float[][] field3850;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Lav;")
    private class437 field3846;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Lrm;")
    private class359 field3848;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Lcm;")
    private class158 field3852;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "Lcm;")
    private class158 field3860;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "Ldga;")
    private class138 field3865;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Lkj;")
    private class457 field3864;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "Lnj;")
    private class436 field3856;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3858 = new Hashtable();

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field3842;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "Lro;")
    public static class567 field3866;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "[[[Laf;")
    public static class651[][][] field3867;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIBIII)V", line = 3)
    private final void method1708(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3841++;
        long var8 = -1L;
        int var10 = (arg1 << this.field3844.field2212) + arg2;
        int var11 = arg0 + (arg5 << this.field3844.field2212);
        int var12 = this.field3844.method159(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class28 var13 = this.field3856.method2506(32, var8);
            if (var13 != null) {
                this.method1712(((class396) var13).field5661, 0);
                return;
            }
        }
        short var14 = (short) (this.field3842++);
        if (var8 != -1L) {
            this.field3856.method2504(var8, -89, new class396(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg0 == 0) {
            var15 = this.field3861[arg4][arg6];
            var16 = this.field3855[arg4][arg6];
            var17 = this.field3850[arg4][arg6];
        } else if (this.field3844.field2210 == arg2 && arg0 == 0) {
            var17 = this.field3850[arg4 + 1][arg6];
            var16 = this.field3855[arg4 + 1][arg6];
            var15 = this.field3861[arg4 + 1][arg6];
        } else if (this.field3844.field2210 == arg2 && this.field3844.field2210 == arg0) {
            var17 = this.field3850[arg4 + 1][arg6 + 1];
            var15 = this.field3861[arg4 + 1][arg6 + 1];
            var16 = this.field3855[arg4 + 1][arg6 + 1];
        } else if (arg2 == 0 && this.field3844.field2210 == arg0) {
            var17 = this.field3850[arg4][arg6 + 1];
            var16 = this.field3855[arg4][arg6 + 1];
            var15 = this.field3861[arg4][arg6 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field3844.field2210;
            float var19 = (float) arg0 / (float) this.field3844.field2210;
            float var20 = this.field3855[arg4][arg6];
            float var21 = this.field3861[arg4][arg6];
            float var22 = this.field3850[arg4][arg6];
            float var23 = this.field3855[arg4 + 1][arg6];
            float var24 = this.field3861[arg4 + 1][arg6];
            float var25 = this.field3850[arg4 + 1][arg6];
            float var26 = (this.field3850[arg4][arg6 + 1] - var22) * var18 + var22;
            float var27 = (this.field3861[arg4 + 1][arg6 + 1] - var24) * var18 + var24;
            float var28 = (this.field3861[arg4][arg6 + 1] - var21) * var18 + var21;
            float var29 = (this.field3855[arg4][arg6 + 1] - var20) * var18 + var20;
            float var30 = (this.field3855[arg4 + 1][arg6 + 1] - var23) * var18 + var23;
            var16 = (var30 - var29) * var19 + var29;
            var15 = (var27 - var28) * var19 + var28;
            float var31 = (this.field3850[arg4 + 1][arg6 + 1] - var25) * var18 + var25;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field3843.method2112(0) - var10);
        float var33 = (float) (this.field3843.method2115((byte) -63) - var12);
        float var34 = (float) (this.field3843.method2114((byte) -114) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field3843.method2110(true);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var39 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3843.method2109(14463);
        if (arg3 <= 36) {
            return;
        }
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3840.field8968) {
            this.field3864.method2587((float) var10, -11186);
            this.field3864.method2587((float) var12, -11186);
            this.field3864.method2587((float) var11, -11186);
        } else {
            this.field3864.method2586(-26561, (float) var10);
            this.field3864.method2586(-26561, (float) var12);
            this.field3864.method2586(-26561, (float) var11);
        }
        this.field3864.method951((byte) -82, var45);
        this.field3864.method951((byte) -82, var46);
        this.field3864.method951((byte) -82, var47);
        this.field3864.method951((byte) -82, 255);
        this.method1712(var14, 0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V", line = 174)
    public static final void method1709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3853++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        if (arg3 > -53) {
            method1709(-28, 50, -89, -88, 97);
        }
        class653.method3620(arg1 + arg2, -arg2 + arg1, false, arg0, class319.field4673[arg4]);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class319.field4673[arg4 + var6];
                int[] var10 = class319.field4673[arg4 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class653.method3620(var11, var12, false, arg0, var9);
                class653.method3620(var11, var12, false, arg0, var10);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class319.field4673[arg4 + var5];
            int[] var16 = class319.field4673[arg4 - var5];
            class653.method3620(var13, var14, false, arg0, var15);
            class653.method3620(var13, var14, false, arg0, var16);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BZ)Luw;", line = 228)
    public static final class175 method1710(byte[] arg0, boolean arg1) {
        field3854++;
        class175 var2 = new class175();
        class138 var3 = new class138(arg0);
        var3.field1745 = var3.field1712.length - 2;
        int var4 = var3.method922((byte) -126);
        int var5 = var3.field1712.length - var4 - 12 - 2;
        var3.field1745 = var5;
        int var6 = var3.method943(-122);
        var2.field2205 = var3.method922((byte) -124);
        var2.field2208 = var3.method922((byte) -125);
        var2.field2206 = var3.method922((byte) -118);
        var2.field2201 = var3.method922((byte) -120);
        int var7 = var3.method957((byte) -114);
        if (arg1) {
            return null;
        }
        if (var7 > 0) {
            var2.field2209 = new class436[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method922((byte) -121);
                class436 var10 = new class436(class306.method1837((byte) -125, var9));
                var2.field2209[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method943(-94);
                    int var12 = var3.method943(-100);
                    var10.method2504((long) var11, -1, new class360(var12));
                }
            }
        }
        var3.field1745 = 0;
        var2.field2197 = var3.method897(2081120600);
        var2.field2196 = new int[var6];
        var2.field2198 = new int[var6];
        var2.field2200 = new String[var6];
        int var13 = 0;
        while (var3.field1745 < var5) {
            int var14 = var3.method922((byte) -122);
            if (var14 == 3) {
                var2.field2200[var13] = var3.method907(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2198[var13] = var3.method957((byte) -119);
            } else {
                var2.field2198[var13] = var3.method943(-122);
            }
            var2.field2196[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 309)
    public static void method1711(int arg0) {
        field3858 = null;
        field3867 = null;
        field3866 = null;
        if (arg0 != -12) {
            method1709(91, -123, -26, -93, 110);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(SI)V", line = 324)
    private final void method1712(short arg0, int arg1) {
        field3851++;
        if (this.field3840.field8968) {
            this.field3865.method915(arg0, 1502242504);
        } else {
            this.field3865.method954(arg0, -103);
        }
        if (arg1 != 0) {
            this.method1712((short) 25, -19);
        }
        this.field3845++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBII[[Z)V", line = 354)
    public final void method1713(int arg0, byte arg1, int arg2, int arg3, boolean[][] arg4) {
        field3857++;
        if (this.field3848 == null || this.field3859 > arg0 + arg3 || (arg0 - arg3) > this.field3847) {
            return;
        }
        if (arg1 <= 100) {
            method1709(47, -72, -48, -102, -15);
        }
        if (this.field3862 > (arg2 + arg3) || this.field3849 < (arg2 - arg3)) {
            return;
        }
        for (int var6 = this.field3862; var6 <= this.field3849; var6++) {
            for (int var7 = this.field3859; var7 <= this.field3847; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if ((-arg3) < var8 && arg3 > var8 && var9 > (-arg3) && arg3 > var9 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field3840.method3519((int) (this.field3843.method2113((byte) -94) * 255.0F) << 24, -11148);
                    this.field3840.method3567(null, 0, null, this.field3860, this.field3852);
                    this.field3840.method3497(-1, this.field3845, 4, 0, this.field3848);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lpea;Lle;Lhj;[I)V", line = 424)
    public class285(class641 arg0, class517 arg1, class329 arg2, int[] arg3) {
        this.field3840 = arg0;
        this.field3843 = arg2;
        this.field3844 = arg1;
        int var5 = this.field3843.method2110(true) - (arg1.field2210 >> 1);
        this.field3859 = this.field3843.method2112(0) - var5 >> arg1.field2212;
        this.field3847 = this.field3843.method2112(0) + var5 >> arg1.field2212;
        this.field3862 = this.field3843.method2114((byte) -125) - var5 >> arg1.field2212;
        this.field3849 = var5 + this.field3843.method2114((byte) -123) >> arg1.field2212;
        int var6 = this.field3847 + 1 - this.field3859;
        int var7 = this.field3849 + 1 - this.field3862;
        this.field3861 = new float[var6 + 1][var7 + 1];
        this.field3855 = new float[var6 + 1][var7 + 1];
        this.field3850 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field3862 + var8;
            if (var26 > 0 && (this.field3844.field2215 - 1) > var26) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = this.field3859 + var27;
                    if (var28 > 0 && (this.field3844.field2214 - 1) > var28) {
                        int var29 = arg1.method150(var28 + 1, var26) - arg1.method150(var28 - 1, var26);
                        int var30 = arg1.method150(var28, var26 + 1) - arg1.method150(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var30 * var30 + 65536)));
                        this.field3855[var27][var8] = (float) var29 * var31;
                        this.field3861[var27][var8] = var31 * -256.0F;
                        this.field3850[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3862; var11 <= this.field3849; var11++) {
            if (var11 >= 0 && var11 < arg1.field2215) {
                for (int var22 = this.field3859; var22 <= this.field3847; var22++) {
                    if (var22 >= 0 && var22 < arg1.field2214) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field7118[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field3845 += 3;
                                    }
                                }
                            } else {
                                this.field3845 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field3847 - this.field3859;
            }
        }
        if (var9 <= 0) {
            this.field3846 = null;
            this.field3848 = null;
            this.field3852 = null;
            this.field3860 = null;
        } else {
            this.field3865 = new class138(var9 * 2);
            this.field3864 = new class457(var9 * 16);
            this.field3856 = new class436(class306.method1837((byte) -115, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3862; var14 <= this.field3849; var14++) {
                if (var14 >= 0 && arg1.field2215 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field3859; var16 <= this.field3847; var16++) {
                        if (var16 >= 0 && var16 < arg1.field2214) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field7118[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field7096[var16][var14];
                                    int[] var20 = arg1.field7083[var16][var14];
                                    int var21 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var18.length <= var21) {
                                                break label111;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method1708(var20[var21], var16, var19[var21], (byte) 113, var15, var14, var13);
                                                var21++;
                                                this.method1708(var20[var21], var16, var19[var21], (byte) 117, var15, var14, var13);
                                                var21++;
                                                this.method1708(var20[var21], var16, var19[var21], (byte) 100, var15, var14, var13);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method1708(0, var16, 0, (byte) 104, var15, var14, var13);
                                    this.method1708(0, var16, arg1.field2210, (byte) 81, var15, var14, var13);
                                    this.method1708(arg1.field2210, var16, 0, (byte) 89, var15, var14, var13);
                                } else if (var17 == 2) {
                                    this.method1708(0, var16, arg1.field2210, (byte) 41, var15, var14, var13);
                                    this.method1708(arg1.field2210, var16, arg1.field2210, (byte) 105, var15, var14, var13);
                                    this.method1708(0, var16, 0, (byte) 45, var15, var14, var13);
                                } else if (var17 == 5) {
                                    this.method1708(arg1.field2210, var16, arg1.field2210, (byte) 98, var15, var14, var13);
                                    this.method1708(arg1.field2210, var16, 0, (byte) 95, var15, var14, var13);
                                    this.method1708(0, var16, arg1.field2210, (byte) 58, var15, var14, var13);
                                } else if (var17 == 4) {
                                    this.method1708(arg1.field2210, var16, 0, (byte) 57, var15, var14, var13);
                                    this.method1708(0, var16, 0, (byte) 46, var15, var14, var13);
                                    this.method1708(arg1.field2210, var16, arg1.field2210, (byte) 83, var15, var14, var13);
                                }
                            }
                        }
                        var12++;
                        var15++;
                    }
                } else {
                    var12 += this.field3847 - this.field3859;
                }
                var13++;
            }
            this.field3848 = this.field3840.method3498(this.field3865.field1745, false, this.field3865.field1712, 5123, -23702);
            this.field3846 = this.field3840.method3494(false, this.field3864.field1712, 16, 4609, this.field3864.field1745);
            this.field3860 = new class158(this.field3846, 5126, 3, 0);
            this.field3852 = new class158(this.field3846, 5121, 4, 12);
        }
        this.field3865 = null;
        this.field3856 = null;
        this.field3855 = this.field3861 = this.field3850 = null;
        this.field3864 = null;
    }
}
