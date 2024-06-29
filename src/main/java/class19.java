import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 extends class361 {

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "[I")
    private int[] field216;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "[I")
    private int[] field218;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "Lbu;")
    private class17 field222;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "Lbu;")
    private class17 field219;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "Lbu;")
    private class17 field217;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "[Lbu;")
    private class17[] field220;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "Lkn;")
    public static class530 field223 = new class530(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 != 0) {
            field226 = -42;
        }
        field223 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILoi;Ll;ZIZ)[F")
    public final float[] method99(int arg0, class53 arg1, class16 arg2, boolean arg3, int arg4, boolean arg5) {
        class387.field5431 = arg2;
        class1.field30 = arg1;
        field227++;
        int var7 = 0;
        if (!arg3) {
            this.method103(null, (byte) 76, null);
        }
        while (this.field220.length > var7) {
            this.field220[var7].method90(arg4, -256, arg0);
            var7++;
        }
        class450.method2635((byte) 117, arg0, arg4);
        float[] var8 = new float[arg0 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field219.field205) {
                int[] var16 = this.field219.method27(var10, 125);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field219.method89(var10, (byte) -25);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field217.field205) {
                var17 = this.field217.method27(var10, 67);
            } else {
                var17 = this.field217.method89(var10, (byte) -25)[0];
            }
            int[] var18;
            if (this.field222.field205) {
                var18 = this.field222.method27(var10, 117);
            } else {
                var18 = this.field222.method89(var10, (byte) -25)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field220.length; var11++) {
            this.field220[var11].method84(-24566);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILl;DLoi;Z)[I")
    public final int[] method100(int arg0, int arg1, int arg2, class16 arg3, double arg4, class53 arg5, boolean arg6) {
        class387.field5431 = arg3;
        field225++;
        class1.field30 = arg5;
        for (int var9 = 0; var9 < this.field220.length; var9++) {
            this.field220[var9].method90(arg0, -256, arg2);
        }
        class483.method2788(arg4, -63);
        class450.method2635((byte) 117, arg2, arg0);
        int[] var10 = new int[arg2 * 4 * arg0];
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field219.field205) {
                int[] var19 = this.field219.method27(var12, 73);
                var17 = var19;
                var16 = var19;
                var18 = var19;
            } else {
                int[][] var15 = this.field219.method89(var12, (byte) -25);
                var16 = var15[0];
                var17 = var15[1];
                var18 = var15[2];
            }
            if (arg6) {
                var11 = var12;
            }
            int[] var20;
            if (this.field217.field205) {
                var20 = this.field217.method27(var12, 110);
            } else {
                var20 = this.field217.method89(var12, (byte) -25)[0];
            }
            for (int var21 = arg0 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class155.field2265[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class155.field2265[var22];
                int var27 = class155.field2265[var24];
                int var28;
                if (var26 == 0 && var25 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10[var11++] = (var28 << 24) + (var26 << 16) + (var25 << 8) + var27;
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        int var13 = 33 / ((arg1 - 71) / 48);
        for (int var14 = 0; var14 < this.field220.length; var14++) {
            this.field220[var14].method84(-24566);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILoi;IIZLl;DZ)[I")
    public final int[] method101(int arg0, class53 arg1, int arg2, int arg3, boolean arg4, class16 arg5, double arg6, boolean arg7) {
        class1.field30 = arg1;
        field215++;
        class387.field5431 = arg5;
        for (int var10 = 0; var10 < this.field220.length; var10++) {
            this.field220[var10].method90(arg0, -256, arg2);
        }
        class483.method2788(arg6, -73);
        class450.method2635((byte) 117, arg2, arg0);
        int[] var11 = new int[arg0 * arg2];
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var13 = -1;
            var12 = -1;
            var14 = arg0 - 1;
        } else {
            var12 = arg0;
            var13 = 1;
            var14 = 0;
        }
        if (arg3 != 19924) {
            return null;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field219.field205) {
                int[] var18 = this.field219.method27(var16, arg3 ^ 0x4DEE);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field219.method89(var16, (byte) -25);
                var19 = var22[1];
                var20 = var22[2];
                var21 = var22[0];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class155.field2265[var24];
                int var28 = class155.field2265[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class155.field2265[var26];
                int var30 = (var27 << 16) + var29 + (var28 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field220.length; var17++) {
            this.field220[var17].method84(-24566);
        }
        return var11;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILih;[Lkt;)Lre;")
    public static final class435 method102(int arg0, class503 arg1, class110[] arg2) {
        field221++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field1493 <= 0L) {
                return null;
            }
        }
        if (arg0 > -34) {
            method102(43, null, null);
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field1493);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class501.field7095, 0);
        if (class501.field7095[0] == 0) {
            if (class501.field7095[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class501.field7095, 1);
            if (class501.field7095[1] > 1) {
                byte[] var7 = new byte[class501.field7095[1]];
                OpenGL.glGetInfoLogARB(var4, class501.field7095[1], class501.field7095, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class501.field7095[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field1493);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class435(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ll;BLoi;)Z")
    public final boolean method103(class16 arg0, byte arg1, class53 arg2) {
        field224++;
        if (class5.field87 >= 0) {
            for (int var4 = 0; var4 < this.field216.length; var4++) {
                if (!arg2.method448(this.field216[var4], class5.field87, 123)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field216.length; var5++) {
                if (!arg2.method424(0, this.field216[var5])) {
                    return false;
                }
            }
        }
        if (arg1 < 118) {
            this.field222 = null;
        }
        for (int var6 = 0; var6 < this.field218.length; var6++) {
            if (!arg0.method82(this.field218[var6], -18226)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class19() {
        this.field216 = new int[0];
        this.field218 = new int[0];
        this.field222 = new class195(0);
        this.field222.field202 = 1;
        this.field219 = new class195();
        this.field219.field202 = 1;
        this.field217 = new class195();
        this.field217.field202 = 1;
        this.field220 = new class17[] { this.field219, this.field217, this.field222 };
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lwm;)V")
    public class19(class403 arg0) {
        int var2 = arg0.method2357((byte) 115);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field220 = new class17[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class17 var16 = class421.method2497(-27935, arg0);
            if (var16.method85(-1) >= 0) {
                var3++;
            }
            if (var16.method86((byte) -64) >= 0) {
                var4++;
            }
            int var17 = var16.field207.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2357((byte) 113);
            }
            this.field220[var6] = var16;
        }
        this.field216 = new int[var3];
        this.field218 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class17 var11 = this.field220[var9];
            int var12 = var11.field207.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field207[var13] = this.field220[var5[var9][var13]];
            }
            int var14 = var11.method85(-1);
            int var15 = var11.method86((byte) -73);
            if (var14 > 0) {
                this.field216[var7++] = var14;
            }
            if (var15 > 0) {
                this.field218[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field219 = this.field220[arg0.method2357((byte) 105)];
        this.field217 = this.field220[arg0.method2357((byte) 113)];
        Object var10 = null;
        this.field222 = this.field220[arg0.method2357((byte) 111)];
    }
}
