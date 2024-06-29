import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class14 extends class285 {

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
    public boolean field204 = false;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    private int field216 = -1;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Lqc;")
    private class4 field209;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Z")
    private boolean field195;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Z")
    private boolean field188;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Z")
    private boolean field206;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "Z")
    private boolean field208;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "[Lve;")
    public static class255[] field189 = new class255[1000];

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[I")
    public static int[] field197 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Lve;")
    public static class255 field196 = class87.method607(125, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field210 = -1;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Lwl;")
    public static class81 field203 = new class81(100);

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "Lve;")
    public static class255 field219 = class87.method607(122, "::cardmem");

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "F")
    private float field190;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "[Lte;")
    public static class282[] field217;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V", line = 15)
    public final void method66(byte arg0, int arg1) {
        field212++;
        if (this.field201 == null) {
            return;
        }
        if (this.field191 != 0 || this.field214 != 0) {
            if (class260.field4410 == null || class260.field4410.length < this.field201.length) {
                class260.field4410 = new int[this.field201.length];
            }
            int var3 = this.field201.length == 4096 ? 64 : 128;
            int var4 = this.field201.length;
            int var5 = this.field214 * arg1;
            int var6 = var3 - 1;
            int var7 = var4 - 1;
            int var8 = arg1 * var3 * this.field191;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var10 = var7 & var8 + var9;
                for (int var11 = 0; var11 < var3; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var11 + var5 & var6) + var10;
                    class260.field4410[var12] = this.field201[var13];
                }
            }
            int[] var14 = this.field201;
            this.field201 = class260.field4410;
            class260.field4410 = var14;
        }
        if (arg0 != -39) {
            method70(-29);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lrg;Lqe;ZI)[I", line = 74)
    public final int[] method67(class88 arg0, class176 arg1, boolean arg2, int arg3) {
        field192++;
        if (arg3 != 16762656) {
            this.method66((byte) -103, 125);
        }
        if (this.field209.method23((byte) -121, arg1, arg0)) {
            int var5 = arg2 ? 64 : 128;
            return this.field209.method25(this.field188, arg1, arg0, false, 1.0D, var5, var5, -20239);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() throws Throwable {
        if (this.field216 != -1) {
            class139.method1044(this.field216, this.field211, this.field198);
            this.field216 = -1;
            this.field211 = 0;
        }
        super.finalize();
        field205++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZLrg;Lqe;)Z", line = 139)
    public final boolean method68(byte arg0, boolean arg1, class88 arg2, class176 arg3) {
        field218++;
        if (arg0 != 86) {
            this.method68((byte) -58, true, (class88) null, (class176) null);
        }
        if (!this.field209.method23((byte) 44, arg3, arg2)) {
            return false;
        }
        GL var5 = class281.field4839;
        int var6 = class287.method2030((byte) -126);
        int var7 = arg1 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field216 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field198 = class139.field2330;
                this.field216 = var8[0];
                class281.method1953(this.field216);
                ByteBuffer var9 = ByteBuffer.wrap(this.field209.method26(0.7D, var7, arg3, arg0 ^ 0x52, var7, this.field188, arg2));
                if (this.field200 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class139.field2326 += var9.limit() * 4 / 3 - this.field211;
                    this.field211 = var9.limit() * 4 / 3;
                } else if (this.field200 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class139.field2326 += var9.limit() * 4 / 3 - this.field211;
                            this.field211 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field209.method26(0.7D, var7, arg3, 4, var7, this.field188, arg2));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class139.field2326 += var9.limit() - this.field211;
                    this.field211 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field206 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field208 ? 10497 : 33071);
            } else {
                class281.method1953(this.field216);
            }
        }
        if ((var6 & 0x2) == 0) {
            class281.method1964(this.field202);
        }
        if ((var6 & 0x4) == 0) {
            class281.method1983(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field191 == 0 && this.field214 == 0) {
                class281.method1960();
            } else {
                float var12 = (float) (class281.field4810 * this.field214) / (float) var7;
                float var13 = (float) (class281.field4810 * this.field191) / (float) var7;
                class281.method1969(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZFLrg;Lqe;)[I", line = 244)
    public final int[] method69(boolean arg0, boolean arg1, float arg2, class88 arg3, class176 arg4) {
        if (!arg0) {
            return (int[]) null;
        }
        field207++;
        if (this.field201 == null || this.field190 != arg2) {
            if (!this.field209.method23((byte) 118, arg4, arg3)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field201 = this.field209.method25(this.field188, arg4, arg3, true, (double) arg2, var6, var6, -20239);
            this.field190 = arg2;
            if (this.field195) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6 - 1;
                int var14;
                int var15 = var14 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var12; var19 >= 0; var19--) {
                        var14--;
                        int var20 = this.field201[var14];
                        var7[var19] += class154.method1134(16722461, var20) >> 16;
                        var9[var19] += class154.method1134(var20 >> 8, 255);
                        var10[var19] += class154.method1134(255, var20);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var26--;
                        var24 += var10[var26];
                        var23 += var9[var26];
                        var25 += var7[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    for (int var29 = var12; var29 >= 0; var29--) {
                        int var30 = var24 / 9;
                        var27--;
                        int var31 = var23 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var8[var21] = class264.method1836(var30, class264.method1836(var31 << 8, var32 << 16));
                        var26--;
                        var25 += var7[var26] - var7[var27];
                        var23 += var9[var26] - var9[var27];
                        var24 += var10[var26] - var10[var27];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var33 = var12; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field201[var14];
                        var15--;
                        int var35 = this.field201[var15];
                        var7[var33] += -(class154.method1134(16725742, var35) >> 16) + (class154.method1134(var34, 16762656) >> 16);
                        var9[var33] += -(class154.method1134(var35, 65356) >> 8) + class154.method1134(255, var34 >> 8);
                        var10[var33] += -class154.method1134(255, var35) + class154.method1134(255, var34);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field201 = var8;
            }
        }
        return this.field201;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 409)
    public static void method70(int arg0) {
        field197 = null;
        field217 = null;
        field189 = null;
        field219 = null;
        field203 = null;
        if (arg0 != -74628703) {
            method72((byte) -102);
        }
        field196 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIIIIII)V", line = 425)
    public static final void method71(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field213++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg3 - arg5;
        int var12 = arg7 - arg5;
        int var13 = arg3 * arg3;
        int var14 = var11 * var11;
        int var15 = arg7 * arg7;
        int var16 = var15 << 1;
        int var17 = var13 << 1;
        int var18 = var12 * var12;
        int var19 = var18 << 1;
        int var20 = var14 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var16;
        int var24 = var18 - ((var22 - 1) * var20);
        int var25 = var15 - (var21 - 1) * var17;
        int var26 = (1 - var22) * var14 + var19;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = (var21 - 3) * var17;
        int var30 = var18 << 2;
        int var31 = var14 << 2;
        int var32 = var28;
        int var33 = (var22 - 3) * var20;
        int var34 = var16 * 3;
        int var35 = var19 * 3;
        int var36 = (arg7 - 1) * var27;
        if (arg0 < 91) {
            return;
        }
        int var37 = var30;
        if (arg6 >= class261.field4427 && class11.field156 >= arg6) {
            int[] var38 = class250.field4213[arg6];
            int var39 = class198.method1425(class30.field473, false, arg1 - arg3, class125.field2082);
            int var40 = class198.method1425(class30.field473, false, arg1 + arg3, class125.field2082);
            int var41 = class198.method1425(class30.field473, false, arg1 - var11, class125.field2082);
            int var42 = class198.method1425(class30.field473, false, arg1 + var11, class125.field2082);
            class30.method170(var41, var38, var39, arg4, -30310);
            class30.method170(var42, var38, var41, arg2, -30310);
            class30.method170(var40, var38, var42, arg4, -30310);
        }
        int var43 = (var12 - 1) * var31;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var34;
                    var8++;
                    var34 += var28;
                    var25 += var32;
                    var32 += var28;
                }
            }
            if (var25 < 0) {
                var8++;
                var25 += var32;
                var23 += var34;
                var34 += var28;
                var32 += var28;
            }
            var25 += -var29;
            var29 -= var27;
            var23 += -var36;
            var36 -= var27;
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var10++;
                        var26 += var35;
                        var35 += var30;
                        var24 += var37;
                        var37 += var30;
                    }
                }
                if (var24 < 0) {
                    var24 += var37;
                    var10++;
                    var37 += var30;
                    var26 += var35;
                    var35 += var30;
                }
                var26 += -var43;
                var43 -= var31;
                var24 += -var33;
                var33 -= var31;
            }
            var9--;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class261.field4427 <= var46 && var45 <= class11.field156) {
                int var47 = class198.method1425(class30.field473, false, arg1 + var8, class125.field2082);
                int var48 = class198.method1425(class30.field473, false, arg1 - var8, class125.field2082);
                if (var44) {
                    int var49 = class198.method1425(class30.field473, false, arg1 + var10, class125.field2082);
                    int var50 = class198.method1425(class30.field473, false, arg1 - var10, class125.field2082);
                    if (var45 >= class261.field4427) {
                        int[] var51 = class250.field4213[var45];
                        class30.method170(var50, var51, var48, arg4, -30310);
                        class30.method170(var49, var51, var50, arg2, -30310);
                        class30.method170(var47, var51, var49, arg4, -30310);
                    }
                    if (class11.field156 >= var46) {
                        int[] var52 = class250.field4213[var46];
                        class30.method170(var50, var52, var48, arg4, -30310);
                        class30.method170(var49, var52, var50, arg2, -30310);
                        class30.method170(var47, var52, var49, arg4, -30310);
                    }
                } else {
                    if (var45 >= class261.field4427) {
                        class30.method170(var47, class250.field4213[var45], var48, arg4, -30310);
                    }
                    if (var46 <= class11.field156) {
                        class30.method170(var47, class250.field4213[var46], var48, arg4, -30310);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V", line = 631)
    public static final void method72(byte arg0) {
        field215++;
        if (arg0 != -98) {
            return;
        }
        for (int var1 = 0; var1 < class255.field4356; var1++) {
            int var10002 = class25.field406[var1]--;
            if (class25.field406[var1] >= -10) {
                class140 var3 = class269.field4626[var1];
                if (var3 == null) {
                    var3 = class140.method1045(class87.field1422, class25.field410[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class25.field406[var1] += var3.method1048();
                    class269.field4626[var1] = var3;
                }
                if (class25.field406[var1] < 0) {
                    int var4;
                    if (class255.field4357[var1] == 0) {
                        var4 = class25.field392;
                    } else {
                        int var5 = (class255.field4357[var1] & 0xFF85DF) >> 16;
                        int var6 = (class255.field4357[var1] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class276.field4742.field5130;
                        int var8 = class255.field4357[var1] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class276.field4742.field5173;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var6) {
                            class25.field406[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class301.field5169 / var6;
                    }
                    if (var4 > 0) {
                        class257 var11 = var3.method1046().method1799(class32.field517);
                        class94 var12 = class94.method716(var11, 100, var4);
                        var12.method700(class124.field2054[var1] - 1);
                        class230.field3813.method1484(var12);
                    }
                    class25.field406[var1] = -100;
                }
            } else {
                class255.field4356--;
                for (int var2 = var1; var2 < class255.field4356; var2++) {
                    class25.field410[var2] = class25.field410[var2 + 1];
                    class269.field4626[var2] = class269.field4626[var2 + 1];
                    class124.field2054[var2] = class124.field2054[var2 + 1];
                    class25.field406[var2] = class25.field406[var2 + 1];
                    class255.field4357[var2] = class255.field4357[var2 + 1];
                }
                var1--;
            }
        }
        if (class148.field2505 && !class196.method1399((byte) -111)) {
            if (class184.field2963 != 0 && class124.field2070 != -1) {
                class197.method1420(class143.field2379, class184.field2963, false, class124.field2070, (byte) 50, 0);
            }
            class148.field2505 = false;
        } else if (class184.field2963 != 0 && class124.field2070 != -1 && !class196.method1399((byte) -110)) {
            class255.field4318.method1523(arg0 ^ 0xFFFFA96A, 173);
            class149.field2512++;
            class255.field4318.method436(class124.field2070, -18820);
            class124.field2070 = -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILqe;Lrg;)Z", line = 769)
    public final boolean method73(int arg0, class176 arg1, class88 arg2) {
        if (arg0 != 3) {
            this.method66((byte) -33, 105);
        }
        field193++;
        return this.field209.method23((byte) -81, arg1, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lpb;)V", line = 799)
    public class14(class70 arg0) {
        this.field209 = new class4(arg0);
        this.field195 = arg0.method481(0) == 1;
        this.field188 = arg0.method481(0) == 1;
        this.field206 = arg0.method481(0) == 1;
        this.field208 = arg0.method481(0) == 1;
        int var2 = arg0.method481(0) & 0x3;
        this.field214 = arg0.method466((byte) -38);
        this.field191 = arg0.method466((byte) -34);
        int var3 = arg0.method481(0);
        arg0.method481(0);
        if (var2 == 1) {
            this.field202 = 2;
        } else if (var2 == 2) {
            this.field202 = 3;
        } else if (var2 == 3) {
            this.field202 = 4;
        } else {
            this.field202 = 0;
        }
        this.field200 = var3 >> 4 & 0xF;
    }
}
