import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public abstract class class48 implements class67 {

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Lkha;")
    private class584 field611 = class475.field6514;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Llaa;")
    public class122 field602;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Z")
    private boolean field603;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "Lqda;")
    public class105 field626;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Lns;")
    public class408 field623;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
    public static int[] field605 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
    public static int[] field606 = new int[1000];

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lhu;")
    public static class133 field608;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "[[Z")
    public static boolean[][] field604;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)Z", line = 4)
    public static final boolean method335(byte arg0) {
        field619++;
        if (arg0 < 36) {
            method341((byte) 93, null);
        }
        return class432.field5950;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V", line = 17)
    private final void method336(boolean arg0) {
        if (this.field614 > 0) {
            this.field602.method978(16384, this.method337(3), this.field614);
            this.field614 = 0;
        }
        field613++;
        if (!arg0) {
            this.method342(false);
        }
    }

    @OriginalMember(owner = "client!gp", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        field612++;
        this.method336(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)I", line = 43)
    private final int method337(int arg0) {
        field607++;
        if (arg0 == 3) {
            int var2 = this.field623.field5665 * this.field626.field1441 * this.field625;
            return this.field603 ? var2 * 4 / 3 : var2;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)V", line = 59)
    private final void method338(int arg0, boolean arg1) {
        if (!arg1) {
            this.field602.field1712 -= arg0;
            field610++;
            this.field602.field1712 += this.method337(3);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 71)
    public final void method339(int arg0) {
        if (arg0 != 32073) {
            this.field625 = 73;
        }
        field609++;
        int var2 = this.field602.method857(128);
        int var3 = this.field602.field2054[var2];
        if (this.field618 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field618);
            this.field602.field2054[var2] = this.field618;
        }
        OpenGL.glBindTexture(this.field618, this.field614);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILkha;)V", line = 98)
    public final void method340(int arg0, class584 arg1) {
        if (this.field611 != arg1) {
            this.field611 = arg1;
            this.method344((byte) 58);
        }
        if (arg0 != -9495) {
            field608 = null;
        }
        field621++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLpf;)[I", line = 121)
    public static final int[] method341(byte arg0, class583 arg1) {
        field616++;
        class677 var2 = new class677(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method3823(-120, 10);
        var2.method3798(27695, var3[0]);
        var2.method3798(arg0 ^ 0xFFFF93B6, var3[1]);
        var2.method3798(arg0 ^ 0xFFFF93B6, var3[2]);
        var2.method3798(27695, var3[3]);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method3798(27695, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method3831(1182, (int) (Math.random() * 9.9999999E7D));
        var2.method3806(class225.field3197, class541.field7176, 112);
        if (arg0 != -103) {
            method345((byte) 8);
        }
        arg1.field7637.method3827(0, (byte) -32, var2.field9399, var2.field9419);
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)I", line = 162)
    public final int method342(boolean arg0) {
        if (!arg0) {
            this.method342(true);
        }
        field622++;
        if (class408.field5668 == this.field623) {
            if (class282.field3991 == this.field626) {
                return 6407;
            }
            if (class315.field4498 == this.field626) {
                return 6408;
            }
            if (class155.field2358 == this.field626) {
                return 6406;
            }
            if (class555.field7297 == this.field626) {
                return 6409;
            }
            if (class628.field8365 == this.field626) {
                return 6410;
            }
            if (class427.field5894 == this.field626) {
                return 6145;
            }
        } else if (class408.field5671 == this.field623) {
            if (class282.field3991 == this.field626) {
                return 34843;
            }
            if (class315.field4498 == this.field626) {
                return 34842;
            }
            if (class155.field2358 == this.field626) {
                return 34844;
            }
            if (class555.field7297 == this.field626) {
                return 34846;
            }
            if (class628.field8365 == this.field626) {
                return 34847;
            }
            if (class427.field5894 == this.field626) {
                return 6145;
            }
        } else if (class408.field5672 == this.field623) {
            if (class282.field3991 == this.field626) {
                return 34837;
            }
            if (class315.field4498 == this.field626) {
                return 34836;
            }
            if (class155.field2358 == this.field626) {
                return 34838;
            }
            if (class555.field7297 == this.field626) {
                return 34840;
            }
            if (class628.field8365 == this.field626) {
                return 34841;
            }
            if (class427.field5894 == this.field626) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Llaa;ILqda;Lns;IZ)V", line = 622)
    public class48(class122 arg0, int arg1, class105 arg2, class408 arg3, int arg4, boolean arg5) {
        this.field602 = arg0;
        this.field618 = arg1;
        this.field603 = arg5;
        this.field626 = arg2;
        this.field623 = arg3;
        this.field625 = arg4;
        OpenGL.glGenTextures(1, class650.field8634, 0);
        this.field614 = class650.field8634[0];
        this.method344((byte) 58);
        this.method338(0, false);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([BBIII)V", line = 264)
    public final void method343(byte[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field627++;
        if (arg4 > 0 && !class538.method2993(arg4, -31218)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class538.method2993(arg2, arg1 - 31154)) {
            int var6 = this.field626.field1441;
            int var7 = 0;
            int var8 = arg4 >= arg2 ? arg2 : arg4;
            int var9 = arg4 >> 1;
            int var10 = arg2 >> 1;
            byte[] var11 = arg0;
            if (arg1 != -64) {
                field605 = null;
            }
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var7, this.method342(true), arg4, arg2, 0, class711.method3993(this.field626, true), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg4 = var9;
                var11 = var15;
                arg2 = var10;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V", line = 360)
    private final void method344(byte arg0) {
        if (arg0 != 58) {
            field608 = null;
        }
        this.field602.method823(this, -8423);
        field617++;
        if (class475.field6514 == this.field611) {
            OpenGL.glTexParameteri(this.field618, 10241, this.field603 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field618, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field618, 10241, this.field603 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field618, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(B)V", line = 387)
    public static void method345(byte arg0) {
        field606 = null;
        field615 = null;
        if (arg0 >= -75) {
            method341((byte) 89, null);
        }
        field608 = null;
        field604 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I", line = 404)
    public static int method346(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBII[F)V", line = 412)
    public final void method347(int arg0, byte arg1, int arg2, int arg3, float[] arg4) {
        field620++;
        if (arg3 > 0 && !class538.method2993(arg3, -31218)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class538.method2993(arg0, -31218)) {
            int var6 = this.field626.field1441;
            int var7 = 0;
            int var8 = arg0 <= arg3 ? arg0 : arg3;
            int var9 = arg3 >> 1;
            if (arg1 < 35) {
                this.field603 = false;
            }
            int var10 = arg0 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var7, this.method342(true), arg3, arg0, 0, class711.method3993(this.field626, true), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                float[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                arg3 = var9;
                var11 = var14;
                arg0 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIIZI)V", line = 516)
    public final void method348(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field624++;
        if (arg4 > 0 && !class538.method2993(arg4, -31218)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class538.method2993(arg2, -31218)) {
            throw new IllegalArgumentException("");
        } else if (class315.field4498 == this.field626) {
            int var6 = 0;
            int var7 = arg4 >= arg2 ? arg2 : arg4;
            int var8 = arg4 >> 1;
            int var9 = arg2 >> 1;
            if (!arg3) {
                int[] var10 = arg0;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var6, this.method342(true), arg4, arg2, 0, 32993, this.field602.field2046, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg4 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var18 & 0xFF;
                            int var22 = var18 >> 24 & 0xFF;
                            int var23 = var18 >> 8 & 0xFF;
                            int var24 = var10[var14++];
                            int var25 = var18 >> 16 & 0xFF;
                            int var26 = ((var20 & 0xFF8A2B) >> 16) + var25;
                            int var27 = (var20 >> 24 & 0xFF) + var22;
                            int var28 = (var20 >> 8 & 0xFF) + var23;
                            int var29 = (var20 & 0xFF) + var21;
                            int var30 = ((var19 & 0xFF841C) >> 16) + var26;
                            int var31 = (var19 >> 24 & 0xFF) + var27;
                            int var32 = ((var19 & 0xFF45) >> 8) + var28;
                            int var33 = (var19 & 0xFF) + var29;
                            int var34 = (var24 >> 24 & 0xFF) + var31;
                            int var35 = (var24 >> 8 & 0xFF) + var32;
                            int var36 = (var24 & 0xFF) + var33;
                            int var37 = (var24 >> 16 & 0xFF) + var30;
                            var11[var12++] = class446.method2556(method346(var36, 1020) >> 2, class446.method2556(method346(65280, var35 << 6), class446.method2556(method346(var37 << 14, 16711680), method346(-16777216, var34 << 22))));
                        }
                        var14 += arg4;
                        var13 += arg4;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    var10 = var16;
                    arg2 = var9;
                    arg4 = var8;
                    var8 >>= 0x1;
                    var7 >>= 0x1;
                    var6++;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
