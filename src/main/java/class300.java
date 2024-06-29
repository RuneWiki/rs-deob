import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class class300 implements class222 {

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lng;")
    private class219 field3971 = class266.field3443;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lvea;")
    public class404 field3972;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "Z")
    private boolean field3987;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "Lqi;")
    public class510 field3985;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Lsk;")
    public class452 field3989;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field3980 = 0;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Ltca;")
    public static class141 field3976 = new class141(8, 1);

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!gaa", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field3979++;
        this.method1766(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V", line = 12)
    private final void method1766(int arg0) {
        if (arg0 != 0) {
            field3976 = null;
        }
        field3977++;
        if (this.field3966 > 0) {
            this.field3985.method2895(this.method1768(26), (byte) 92, this.field3966);
            this.field3966 = 0;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)V", line = 30)
    private final void method1767(byte arg0, int arg1) {
        this.field3985.field9168 -= arg1;
        if (arg0 == -118) {
            field3983++;
            this.field3985.field9168 += this.method1768(arg0 + 215);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)V", line = 48)
    public final void method389(boolean arg0) {
        field3978++;
        if (!arg0) {
            this.field3987 = false;
        }
        int var2 = this.field3985.method3609((byte) 127);
        int var3 = this.field3985.field7133[var2];
        if (this.field3982 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3982);
            this.field3985.field7133[var2] = this.field3982;
        }
        OpenGL.glBindTexture(this.field3982, this.field3966);
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)I", line = 79)
    private final int method1768(int arg0) {
        field3967++;
        if (arg0 <= 7) {
            return 108;
        } else {
            int var2 = this.field3972.field5334 * this.field3984 * this.field3989.field5964;
            return this.field3987 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BII)Z", line = 93)
    public static final boolean method1769(byte arg0, int arg1, int arg2) {
        int var3 = 49 % ((62 - arg0) / 53);
        field3968++;
        return class689.method3898(arg1, -1100, arg2) & class616.method3408(-31006, arg2, arg1);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILng;)V", line = 106)
    public final void method390(int arg0, class219 arg1) {
        field3986++;
        if (arg0 != 29613) {
            this.field3985 = null;
        }
        if (this.field3971 != arg1) {
            this.field3971 = arg1;
            this.method1773(arg0 ^ 0x255B);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[IIBI)V", line = 125)
    public final void method1770(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        field3981++;
        if (arg0 > 0 && !class355.method2093(arg0, 1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class355.method2093(arg2, 1)) {
            throw new IllegalArgumentException("");
        } else if (class480.field6686 == this.field3989) {
            int var6 = 0;
            int var7 = arg2 > arg0 ? arg0 : arg2;
            int var8 = arg0 >> 1;
            int var9 = arg2 >> 1;
            if (arg3 != 67) {
                this.method390(-86, null);
            }
            int[] var10 = arg1;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var6, this.method1776(true), arg0, arg2, 0, 32993, this.field3985.field7126, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 8 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = (var18 & 0xFF8E04) >> 16;
                        int var24 = var18 & 0xFF;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = (var20 >> 16 & 0xFF) + var23;
                        int var27 = (var20 & 0xFF) + var24;
                        int var28 = (var20 >> 24 & 0xFF) + var25;
                        int var29 = (var20 >> 8 & 0xFF) + var21;
                        int var30 = ((var19 & 0xFF9C) >> 8) + var29;
                        int var31 = (var19 >> 24 & 0xFF) + var28;
                        int var32 = (var19 & 0xFF) + var27;
                        int var33 = ((var19 & 0xFFC7E0) >> 16) + var26;
                        int var34 = (var22 >> 16 & 0xFF) + var33;
                        int var35 = (var22 >> 24 & 0xFF) + var31;
                        int var36 = (var22 & 0xFF) + var32;
                        int var37 = ((var22 & 0xFF2A) >> 8) + var30;
                        var11[var12++] = class665.method3789(class665.method3789(class15.method97(var37 << 6, 65280), class665.method3789(class15.method97(1020, var34) << 14, class15.method97(var35, 1020) << 22)), class15.method97(255, var36 >> 2));
                    }
                    var13 += arg0;
                    var14 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg0 = var8;
                var10 = var16;
                arg2 = var9;
                var7 >>= 0x1;
                var6++;
                var8 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II[FII)V", line = 232)
    public final void method1771(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field3974++;
        if (arg4 > 0 && !class355.method2093(arg4, arg0 ^ 0x29)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class355.method2093(arg1, 1)) {
            int var6 = this.field3989.field5964;
            int var7 = 0;
            int var8 = arg1 > arg4 ? arg4 : arg1;
            int var9 = arg4 >> 1;
            int var10 = arg1 >> 1;
            if (arg0 != 40) {
                this.method389(true);
            }
            float[] var11 = arg2;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var7, this.method1776(true), arg4, arg1, 0, class400.method2292(-27762, this.field3989), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg4 = var9;
                var11 = var15;
                arg1 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)Llv;", line = 328)
    public static final class694 method1772(int arg0) {
        field3969++;
        if (class672.field9563 == null || class327.field4401 == null) {
            return null;
        }
        class694 var1 = (class694) class327.field4401.method1383((byte) 1);
        if (arg0 != 17956) {
            field3980 = 52;
        }
        while (var1 != null) {
            class83 var2 = class672.field9554.method2158(var1.field9786, (byte) -119);
            if (var2 != null && var2.field983 && var2.method445(true, class672.field9549)) {
                return var1;
            }
            var1 = (class694) class327.field4401.method1383((byte) 1);
        }
        return null;
    }

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)V", line = 357)
    private final void method1773(int arg0) {
        this.field3985.method3613((byte) 127, this);
        if (arg0 != 22262) {
            field3976 = null;
        }
        field3988++;
        if (class266.field3443 == this.field3971) {
            OpenGL.glTexParameteri(this.field3982, 10241, this.field3987 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3982, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3982, 10241, this.field3987 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3982, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BIIII)V", line = 386)
    public final void method1774(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3970++;
        if (arg1 > 0 && !class355.method2093(arg1, arg3 + 1304653065)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class355.method2093(arg4, 1)) {
            int var6 = this.field3989.field5964;
            int var7 = 0;
            int var8 = arg4 > arg1 ? arg1 : arg4;
            int var9 = arg1 >> 1;
            if (arg3 != -1304653064) {
                this.method1766(51);
            }
            int var10 = arg4 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method1776(true), arg1, arg4, 0, class400.method2292(-27762, this.field3989), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
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
                arg1 = var9;
                var11 = var15;
                arg4 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lqi;ILsk;Lvea;IZ)V", line = 600)
    public class300(class510 arg0, int arg1, class452 arg2, class404 arg3, int arg4, boolean arg5) {
        this.field3972 = arg3;
        this.field3982 = arg1;
        this.field3987 = arg5;
        this.field3984 = arg4;
        this.field3985 = arg0;
        this.field3989 = arg2;
        OpenGL.glGenTextures(1, class662.field9431, 0);
        this.field3966 = class662.field9431[0];
        this.method1773(22262);
        this.method1767((byte) -118, 0);
    }

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V", line = 491)
    public static void method1775(int arg0) {
        if (arg0 != -9223) {
            field3973 = -94;
        }
        field3976 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(Z)I", line = 501)
    public final int method1776(boolean arg0) {
        field3975++;
        if (class404.field5338 == this.field3972) {
            if (class568.field7733 == this.field3989) {
                return 6407;
            }
            if (class480.field6686 == this.field3989) {
                return 6408;
            }
            if (class635.field8783 == this.field3989) {
                return 6406;
            }
            if (class86.field1050 == this.field3989) {
                return 6409;
            }
            if (class508.field7012 == this.field3989) {
                return 6410;
            }
            if (class353.field4712 == this.field3989) {
                return 6145;
            }
        } else if (class404.field5341 == this.field3972) {
            if (class568.field7733 == this.field3989) {
                return 34843;
            }
            if (class480.field6686 == this.field3989) {
                return 34842;
            }
            if (class635.field8783 == this.field3989) {
                return 34844;
            }
            if (class86.field1050 == this.field3989) {
                return 34846;
            }
            if (class508.field7012 == this.field3989) {
                return 34847;
            }
            if (class353.field4712 == this.field3989) {
                return 6145;
            }
        } else if (class404.field5342 == this.field3972) {
            if (class568.field7733 == this.field3989) {
                return 34837;
            }
            if (class480.field6686 == this.field3989) {
                return 34836;
            }
            if (class635.field8783 == this.field3989) {
                return 34838;
            }
            if (class86.field1050 == this.field3989) {
                return 34840;
            }
            if (class508.field7012 == this.field3989) {
                return 34841;
            }
            if (class353.field4712 == this.field3989) {
                return 6145;
            }
        }
        if (!arg0) {
            this.field3971 = null;
        }
        throw new IllegalStateException();
    }
}
