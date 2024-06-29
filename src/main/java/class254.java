import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class254 extends class122 {

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    private int field4199 = 0;

    @OriginalMember(owner = "client!wi", name = "ob", descriptor = "I")
    private int field4224 = -1;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Z")
    public boolean field4198 = false;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lnc;")
    private class139 field4201;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "Z")
    private boolean field4210;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "Z")
    private boolean field4209;

    @OriginalMember(owner = "client!wi", name = "tb", descriptor = "Z")
    private boolean field4229;

    @OriginalMember(owner = "client!wi", name = "pb", descriptor = "Z")
    private boolean field4225;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    private int field4215;

    @OriginalMember(owner = "client!wi", name = "rb", descriptor = "I")
    private int field4227;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    private int field4216;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "[S")
    public static short[] field4217 = new short[256];

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "Z")
    public static boolean field4211 = true;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field4206 = 0;

    @OriginalMember(owner = "client!wi", name = "qb", descriptor = "Lqd;")
    public static class40 field4226 = class147.method1106("loginscreen", (byte) -72);

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Lpl;")
    public static class186 field4202 = new class186(260);

    @OriginalMember(owner = "client!wi", name = "ub", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "F")
    private float field4208;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wi", name = "lb", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!wi", name = "mb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!wi", name = "nb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wi", name = "vb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "Lgi;")
    public static class208 field4205;

    @OriginalMember(owner = "client!wi", name = "sb", descriptor = "Lrb;")
    public static class213 field4228;

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "[I")
    private int[] field4220;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLqd;II)V", line = 9)
    public static final void method1783(int arg0, byte arg1, class40 arg2, int arg3, int arg4) {
        class213 var5 = class211.method1483(arg3, arg4, arg1 ^ 0x4654);
        field4223++;
        if (var5 == null) {
            return;
        }
        if (var5.field3542 != null) {
            class109 var6 = new class109();
            var6.field1908 = var5.field3542;
            var6.field1915 = arg2;
            var6.field1910 = var5;
            var6.field1918 = arg0;
            class121.method912(var6, -88);
        }
        boolean var7 = true;
        if (var5.field3510 > 0) {
            var7 = class93.method707((byte) 75, var5);
        }
        if (!var7 || !class76.method561(77, arg0 - 1, client.method1720(var5))) {
            return;
        }
        if (arg0 == 1) {
            class195.field3147++;
            class19.field295.method1464(236, 0);
            class19.field295.method239((byte) 109, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 2) {
            class19.field295.method1464(77, 0);
            class19.field295.method239((byte) -76, arg4);
            class236.field3888++;
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 3) {
            class57.field1088++;
            class19.field295.method1464(117, arg1 + 102);
            class19.field295.method239((byte) 98, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 4) {
            class19.field295.method1464(78, 0);
            class19.field295.method239((byte) 113, arg4);
            class19.field295.method209(16711680, arg3);
            class251.field4156++;
        }
        if (arg0 == 5) {
            class2.field14++;
            class19.field295.method1464(107, 0);
            class19.field295.method239((byte) -103, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 6) {
            class19.field295.method1464(184, 0);
            class76.field1313++;
            class19.field295.method239((byte) 113, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 7) {
            class19.field295.method1464(47, arg1 ^ 0xFFFFFF9A);
            class228.field3774++;
            class19.field295.method239((byte) 104, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg0 == 8) {
            class284.field4766++;
            class19.field295.method1464(37, 0);
            class19.field295.method239((byte) 103, arg4);
            class19.field295.method209(16711680, arg3);
        }
        if (arg1 != -102) {
            field4228 = (class213) null;
        }
        if (arg0 == 9) {
            class314.field5305++;
            class19.field295.method1464(247, arg1 ^ 0xFFFFFF9A);
            class19.field295.method239((byte) -114, arg4);
            class19.field295.method209(arg1 ^ 0xFF00FF9A, arg3);
        }
        if (arg0 == 10) {
            class19.field295.method1464(168, 0);
            class109.field1905++;
            class19.field295.method239((byte) 117, arg4);
            class19.field295.method209(16711680, arg3);
        }
    }

    @OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V", line = 137)
    protected final void finalize() throws Throwable {
        if (this.field4224 != -1) {
            class136.method1008(this.field4224, this.field4199, this.field4207);
            this.field4199 = 0;
            this.field4224 = -1;
        }
        super.finalize();
        field4222++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 155)
    public static void method1784(byte arg0) {
        field4226 = null;
        if (arg0 != -81) {
            method1783(-21, (byte) -27, (class40) null, 5, 14);
        }
        field4228 = null;
        field4202 = null;
        field4217 = null;
        field4205 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILce;)V", line = 186)
    public static final void method1785(int arg0, class239 arg1) {
        field4231++;
        class85.field1470 = arg1.method1665(class252.field4182, (byte) -44);
        class72.field1273 = arg1.method1665(class103.field1811, (byte) -34);
        class159.field2649 = arg1.method1665(class52.field1005, (byte) -9);
        class297.field4961 = arg1.method1665(class278.field4699, (byte) -49);
        class160.field2679 = arg1.method1665(class135.field2295, (byte) -109);
        class140.field2367 = arg1.method1665(class285.field4809, (byte) -96);
        if (arg0 != -3) {
            method1789(-102, (byte) -116, -76, 118, -35, 117, 59);
        }
        class29.field623 = arg1.method1665(class34.field676, (byte) -64);
        class90.field1635 = arg1.method1665(class134.field2266, (byte) -59);
        class33.field665 = arg1.method1665(class71.field1264, (byte) -80);
        class257.field4282 = arg1.method1665(class45.field867, (byte) -51);
        class202.field3203 = arg1.method1665(class29.field616, (byte) -53);
        class142.field2385 = arg1.method1665(class27.field553, (byte) -24);
        class249.field4126 = arg1.method1665(class89.field1612, (byte) -116);
        class56.field1081 = arg1.method1665(class285.field4787, (byte) -54);
        class98.field1749 = arg1.method1665(class229.field3780, (byte) -11);
        class40.field711 = arg1.method1665(class247.field4094, (byte) -89);
        class71.field1270 = arg1.method1665(class278.field4690, (byte) -65);
        class243.field4009 = arg1.method1665(class25.field437, (byte) -85);
        class3.field31 = arg1.method1665(class83.field1448, (byte) -91);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lce;Lij;I)Z", line = 215)
    public final boolean method1786(class239 arg0, class77 arg1, int arg2) {
        field4200++;
        return arg2 == 4 ? this.field4201.method1029(arg0, -75, arg1) : true;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V", line = 226)
    public static final void method1787(int arg0) {
        field4219++;
        class20.field334 = new class282();
        if (arg0 != 9) {
            method1785(95, (class239) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lce;ZFBLij;)[I", line = 238)
    public final int[] method1788(class239 arg0, boolean arg1, float arg2, byte arg3, class77 arg4) {
        field4218++;
        if (this.field4220 == null || this.field4208 != arg2) {
            if (!this.field4201.method1029(arg0, -124, arg4)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field4220 = this.field4201.method1027(0, (double) arg2, this.field4209, true, var6, arg0, var6, arg4);
            this.field4208 = arg2;
            if (this.field4210) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13;
                int var14 = var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field4220[var13];
                        var7[var19] += class276.method1923(255, var20 >> 16);
                        var8[var19] += class276.method1923(var20 >> 8, 255);
                        var9[var19] += class276.method1923(var20, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var26 += var7[var27];
                        var24 += var8[var27];
                        var25 += var9[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        int var30 = var26 / 9;
                        var23--;
                        int var31 = var24 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var10[var21] = class11.method71(var32, class11.method71(var30 << 16, var31 << 8));
                        var27--;
                        var25 += var9[var27] - var9[var23];
                        var26 += var7[var27] - var7[var23];
                        var24 += var8[var27] - var8[var23];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field4220[var14];
                        var13--;
                        int var35 = this.field4220[var13];
                        var7[var33] += class276.method1923(255, var35 >> 16) - (class276.method1923(var34, 16716823) >> 16);
                        var8[var33] += class276.method1923(var35 >> 8, 255) - class276.method1923(255, var34 >> 8);
                        var9[var33] += class276.method1923(var35, 255) - class276.method1923(255, var34);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field4220 = var10;
            }
        }
        int var36 = 100 / ((6 - arg3) / 57);
        return this.field4220;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIIII)V", line = 419)
    public static final void method1789(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4212++;
        if (arg1 <= 26) {
            method1789(34, (byte) 13, -58, -38, 97, 6, 25);
        }
        if (class125.field2164 <= (arg0 - arg2) && class48.field941 >= (arg0 + arg2) && class220.field3664 <= (arg4 - arg2) && arg2 + arg4 <= class72.field1275) {
            class221.method1547(arg3, arg6, -29773, arg5, arg0, arg4, arg2);
        } else {
            class233.method1620(arg4, (byte) 37, arg3, arg6, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)V", line = 436)
    public final void method1790(int arg0, int arg1) {
        if (arg1 != 25089) {
            return;
        }
        field4204++;
        if (this.field4220 == null || this.field4215 == 0 && this.field4214 == 0) {
            return;
        }
        if (class12.field198 == null || this.field4220.length > class12.field198.length) {
            class12.field198 = new int[this.field4220.length];
        }
        int var3 = this.field4220.length == 4096 ? 64 : 128;
        int var4 = this.field4220.length;
        int var5 = this.field4214 * arg0;
        int var6 = arg0 * var3 * this.field4215;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var8 & var6 + var9;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var9 + var11;
                int var13 = (var5 + var11 & var7) + var10;
                class12.field198[var12] = this.field4220[var13];
            }
        }
        int[] var14 = this.field4220;
        this.field4220 = class12.field198;
        class12.field198 = var14;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLij;ZLce;)Z", line = 497)
    public final boolean method1791(boolean arg0, class77 arg1, boolean arg2, class239 arg3) {
        field4221++;
        if (!this.field4201.method1029(arg3, -85, arg1)) {
            return false;
        }
        GL var5 = class21.field377;
        int var6 = arg2 ? 64 : 128;
        if (arg0) {
            field4230 = 35;
        }
        int var7 = class199.method1395(-66);
        if ((var7 & 0x1) == 0) {
            if (this.field4224 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field4207 = class136.field2300;
                this.field4224 = var8[0];
                class21.method140(this.field4224);
                ByteBuffer var9 = ByteBuffer.wrap(this.field4201.method1030(0.7D, arg1, var6, var6, 0, arg3, this.field4209));
                if (this.field4227 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class136.field2303 += var9.limit() * 4 / 3 - this.field4199;
                    this.field4199 = var9.limit() * 4 / 3;
                } else if (this.field4227 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class136.field2303 += var9.limit() * 4 / 3 - this.field4199;
                            this.field4199 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field4201.method1030(0.7D, arg1, var6, var6, 0, arg3, this.field4209));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class136.field2303 += var9.limit() - this.field4199;
                    this.field4199 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field4229 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field4225 ? 10497 : 33071);
            } else {
                class21.method140(this.field4224);
            }
        }
        if ((var7 & 0x2) == 0) {
            class21.method144(this.field4216);
        }
        if ((var7 & 0x4) == 0) {
            class21.method164(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field4215 == 0 && this.field4214 == 0) {
                class21.method137();
            } else {
                float var12 = (float) (class21.field357 * this.field4214) / (float) var6;
                float var13 = (float) (class21.field357 * this.field4215) / (float) var6;
                class21.method143(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lsd;)V", line = 669)
    public class254(class26 arg0) {
        this.field4201 = new class139(arg0);
        this.field4210 = arg0.method226(255) == 1;
        this.field4209 = arg0.method226(255) == 1;
        this.field4229 = arg0.method226(255) == 1;
        this.field4225 = arg0.method226(255) == 1;
        int var2 = arg0.method226(255) & 0x3;
        this.field4214 = arg0.method234(2193);
        this.field4215 = arg0.method234(2193);
        int var3 = arg0.method226(255);
        arg0.method226(255);
        this.field4227 = (var3 & 0xFA) >> 4;
        if (var2 == 1) {
            this.field4216 = 2;
        } else if (var2 == 2) {
            this.field4216 = 3;
        } else if (var2 == 3) {
            this.field4216 = 4;
        } else {
            this.field4216 = 0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLij;ZLce;)[I", line = 612)
    public final int[] method1792(byte arg0, class77 arg1, boolean arg2, class239 arg3) {
        field4203++;
        if (!this.field4201.method1029(arg3, -125, arg1)) {
            return null;
        }
        if (arg0 > -51) {
            field4205 = (class208) null;
        }
        int var5 = arg2 ? 64 : 128;
        return this.field4201.method1027(0, 1.0D, this.field4209, false, var5, arg3, var5, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V", line = 631)
    public static final void method1793(int arg0) {
        int var1 = 51 / ((arg0 + 46) / 34);
        field4197++;
        class57.field1096++;
        class19.field295.method1464(49, 0);
        class19.field295.method209(16711680, class236.field3871);
    }
}
