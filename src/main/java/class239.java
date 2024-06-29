import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class239 extends class196 {

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "B")
    private byte field4179 = 0;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Z")
    public boolean field4177 = false;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "B")
    private byte field4180 = 0;

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
    private int field4200 = 0;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    private int field4176 = 0;

    @OriginalMember(owner = "client!jm", name = "hb", descriptor = "I")
    public int field4212 = 0;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "[I")
    private int[] field4190;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "[I")
    public int[] field4186;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "[I")
    public int[] field4192;

    @OriginalMember(owner = "client!jm", name = "jb", descriptor = "[I")
    public int[] field4214;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "[I")
    private int[] field4172;

    @OriginalMember(owner = "client!jm", name = "Y", descriptor = "[Lcn;")
    public class269[] field4203;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "[Ldh;")
    public class170[] field4191;

    @OriginalMember(owner = "client!jm", name = "W", descriptor = "[S")
    private short[] field4201;

    @OriginalMember(owner = "client!jm", name = "X", descriptor = "[S")
    private short[] field4202;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "[S")
    private short[] field4199;

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "[S")
    private short[] field4197;

    @OriginalMember(owner = "client!jm", name = "ab", descriptor = "[F")
    private float[] field4205;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "[F")
    private float[] field4173;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "[S")
    private short[] field4178;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "[B")
    private byte[] field4174;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "[S")
    private short[] field4187;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "[S")
    private short[] field4183;

    @OriginalMember(owner = "client!jm", name = "bb", descriptor = "[S")
    private short[] field4206;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "[S")
    private short[] field4189;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "[B")
    private byte[] field4171;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lcc;")
    public class251 field4170;

    @OriginalMember(owner = "client!jm", name = "cb", descriptor = "Llb;")
    public class213 field4207;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Llb;")
    private class213 field4175;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "Llb;")
    private class213 field4193;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "Llb;")
    private class213 field4195;

    @OriginalMember(owner = "client!jm", name = "db", descriptor = "Llb;")
    private class213 field4208;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "S")
    private short field4184;

    @OriginalMember(owner = "client!jm", name = "fb", descriptor = "S")
    private short field4210;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "[S")
    private short[] field4181;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "[I")
    private int[] field4185;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "Lkh;")
    private static class14 field4194 = new class14(10000);

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "Ljm;")
    private static class239 field4196 = new class239();

    @OriginalMember(owner = "client!jm", name = "ib", descriptor = "Ljm;")
    private static class239 field4213 = new class239();

    @OriginalMember(owner = "client!jm", name = "kb", descriptor = "Ljm;")
    private static class239 field4215 = new class239();

    @OriginalMember(owner = "client!jm", name = "lb", descriptor = "Ljm;")
    private static class239 field4216 = new class239();

    @OriginalMember(owner = "client!jm", name = "rb", descriptor = "[I")
    private static int[] field4222 = new int[1];

    @OriginalMember(owner = "client!jm", name = "ub", descriptor = "[I")
    private static int[] field4225 = new int[1];

    @OriginalMember(owner = "client!jm", name = "mb", descriptor = "F")
    private static float field4217;

    @OriginalMember(owner = "client!jm", name = "ob", descriptor = "F")
    private static float field4219;

    @OriginalMember(owner = "client!jm", name = "pb", descriptor = "F")
    private static float field4220;

    @OriginalMember(owner = "client!jm", name = "qb", descriptor = "F")
    private static float field4221;

    @OriginalMember(owner = "client!jm", name = "tb", descriptor = "F")
    private static float field4224;

    @OriginalMember(owner = "client!jm", name = "vb", descriptor = "F")
    private static float field4226;

    @OriginalMember(owner = "client!jm", name = "nb", descriptor = "I")
    private static int field4218;

    @OriginalMember(owner = "client!jm", name = "sb", descriptor = "I")
    private static int field4223;

    @OriginalMember(owner = "client!jm", name = "wb", descriptor = "I")
    private static int field4227;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "Lgi;")
    private class218 field4182;

    @OriginalMember(owner = "client!jm", name = "gb", descriptor = "Lph;")
    private class79 field4211;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4198;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "[J")
    private static long[] field4188;

    @OriginalMember(owner = "client!jm", name = "Z", descriptor = "[[I")
    private int[][] field4204;

    @OriginalMember(owner = "client!jm", name = "eb", descriptor = "[[I")
    private int[][] field4209;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(SS)V", line = 7)
    public final void method1706(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4176; var3++) {
            if (this.field4178[var3] == arg0) {
                this.field4178[var3] = arg1;
            }
        }
        this.field4175.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ISIB)I", line = 20)
    private static final int method1707(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class227.field3907[class32.method285(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class227.field3904.method1510(255, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class227.field3904.method1514(-69, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 78)
    private final void method1708(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field4218 = 0;
            field4223 = 0;
            field4227 = 0;
            for (int var6 = 0; var6 < this.field4212; var6++) {
                field4218 += this.field4186[var6];
                field4223 += this.field4192[var6];
                field4227 += this.field4214[var6];
                var5++;
            }
            if (var5 > 0) {
                field4218 = field4218 / var5 + arg1;
                field4223 = field4223 / var5 + arg2;
                field4227 = field4227 / var5 + arg3;
            } else {
                field4218 = arg1;
                field4223 = arg2;
                field4227 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4212; var7++) {
                this.field4186[var7] += arg1;
                this.field4192[var7] += arg2;
                this.field4214[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4212; var8++) {
                this.field4186[var8] -= field4218;
                this.field4192[var8] -= field4223;
                this.field4214[var8] -= field4227;
                if (arg3 != 0) {
                    int var9 = class227.field3896[arg3];
                    int var10 = class227.field3911[arg3];
                    int var11 = this.field4192[var8] * var9 + this.field4186[var8] * var10 + 32767 >> 16;
                    this.field4192[var8] = this.field4192[var8] * var10 + 32767 - this.field4186[var8] * var9 >> 16;
                    this.field4186[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class227.field3896[arg1];
                    int var13 = class227.field3911[arg1];
                    int var14 = this.field4192[var8] * var13 + 32767 - this.field4214[var8] * var12 >> 16;
                    this.field4214[var8] = this.field4214[var8] * var13 + this.field4192[var8] * var12 + 32767 >> 16;
                    this.field4192[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class227.field3896[arg2];
                    int var16 = class227.field3911[arg2];
                    int var17 = this.field4214[var8] * var15 + this.field4186[var8] * var16 + 32767 >> 16;
                    this.field4214[var8] = this.field4214[var8] * var16 + 32767 - this.field4186[var8] * var15 >> 16;
                    this.field4186[var8] = var17;
                }
                this.field4186[var8] += field4218;
                this.field4192[var8] += field4223;
                this.field4214[var8] += field4227;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4212; var18++) {
                this.field4186[var18] -= field4218;
                this.field4192[var18] -= field4223;
                this.field4214[var18] -= field4227;
                this.field4186[var18] = this.field4186[var18] * arg1 / 128;
                this.field4192[var18] = this.field4192[var18] * arg2 / 128;
                this.field4214[var18] = this.field4214[var18] * arg3 / 128;
                this.field4186[var18] += field4218;
                this.field4192[var18] += field4223;
                this.field4214[var18] += field4227;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4176; var19++) {
                int var20 = (this.field4174[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field4174[var19] = (byte) var20;
            }
            this.field4175.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZLjm;Ljm;)Lrl;", line = 232)
    private final class196 method1709(boolean arg0, boolean arg1, class239 arg2, class239 arg3) {
        arg2.field4212 = this.field4212;
        arg2.field4200 = this.field4200;
        arg2.field4176 = this.field4176;
        arg2.field4184 = this.field4184;
        arg2.field4210 = this.field4210;
        arg2.field4180 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field4186 == null || arg2.field4186.length < this.field4212) {
            arg2.field4186 = new int[this.field4212 + 100];
            arg2.field4192 = new int[this.field4212 + 100];
            arg2.field4214 = new int[this.field4212 + 100];
        }
        for (int var5 = 0; var5 < this.field4212; var5++) {
            arg2.field4186[var5] = this.field4186[var5];
            arg2.field4192[var5] = this.field4192[var5];
            arg2.field4214[var5] = this.field4214[var5];
        }
        if (arg2.field4207 == null) {
            arg2.field4207 = new class213();
        }
        arg2.field4207.field3659 = false;
        if (arg2.field4170 == null) {
            arg2.field4170 = new class251();
        }
        arg2.field4170.field4392 = false;
        if (arg0) {
            arg2.field4174 = this.field4174;
            arg2.field4175 = this.field4175;
        } else {
            if (arg3.field4174 == null || arg3.field4174.length < this.field4176) {
                arg3.field4174 = new byte[this.field4176 + 100];
            }
            arg2.field4174 = arg3.field4174;
            for (int var6 = 0; var6 < this.field4176; var6++) {
                arg2.field4174[var6] = this.field4174[var6];
            }
            if (arg3.field4175 == null) {
                arg3.field4175 = new class213();
            }
            arg2.field4175 = arg3.field4175;
            arg2.field4175.field3659 = false;
        }
        if (arg1) {
            arg2.field4201 = this.field4201;
            arg2.field4202 = this.field4202;
            arg2.field4199 = this.field4199;
            arg2.field4197 = this.field4197;
            arg2.field4193 = this.field4193;
        } else {
            if (arg3.field4201 == null || arg3.field4201.length < this.field4200) {
                arg3.field4201 = new short[this.field4200 + 100];
                arg3.field4202 = new short[this.field4200 + 100];
                arg3.field4199 = new short[this.field4200 + 100];
                arg3.field4197 = new short[this.field4200 + 100];
            }
            arg2.field4201 = arg3.field4201;
            arg2.field4202 = arg3.field4202;
            arg2.field4199 = arg3.field4199;
            arg2.field4197 = arg3.field4197;
            for (int var7 = 0; var7 < this.field4200; var7++) {
                arg2.field4201[var7] = this.field4201[var7];
                arg2.field4202[var7] = this.field4202[var7];
                arg2.field4199[var7] = this.field4199[var7];
                arg2.field4197[var7] = this.field4197[var7];
            }
            if (class329.field5607) {
                if (arg3.field4193 == null) {
                    arg3.field4193 = new class213();
                }
                arg2.field4193 = arg3.field4193;
                arg2.field4193.field3659 = false;
            } else {
                arg2.field4193 = null;
            }
        }
        arg2.field4205 = this.field4205;
        arg2.field4173 = this.field4173;
        arg2.field4172 = this.field4172;
        arg2.field4204 = this.field4204;
        arg2.field4178 = this.field4178;
        arg2.field4187 = this.field4187;
        arg2.field4183 = this.field4183;
        arg2.field4206 = this.field4206;
        arg2.field4189 = this.field4189;
        arg2.field4171 = this.field4171;
        arg2.field4209 = this.field4209;
        arg2.field4195 = this.field4195;
        arg2.field4208 = this.field4208;
        arg2.field4185 = this.field4185;
        arg2.field4181 = this.field4181;
        arg2.field4190 = this.field4190;
        arg2.field3398 = this.field3398;
        arg2.field4203 = this.field4203;
        arg2.field4191 = this.field4191;
        return arg2;
    }

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "()V", line = 362)
    public static final void method1710() {
        field4196 = new class239();
        field4213 = new class239();
        field4215 = new class239();
        field4216 = new class239();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZ)V", line = 369)
    public final void method1711(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field4180 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field4200 != 0) {
            if (arg6) {
                boolean var8 = !this.field4175.field3659 && (arg1 || arg2 && !class329.field5607);
                this.method1718(false, !this.field4207.field3659 && arg0, var8, this.field4193 != null && !this.field4193.field3659 && arg2, !this.field4195.field3659 && arg3);
                if (!this.field4208.field3659 && arg4 && arg1) {
                    this.method1717();
                }
            }
            if (arg0) {
                if (this.field4207.field3659) {
                    this.field4186 = null;
                    this.field4192 = null;
                    this.field4214 = null;
                    this.field4181 = null;
                    this.field4190 = null;
                } else {
                    this.field4179 = (byte) (this.field4179 | 0x1);
                }
            }
            if (arg1) {
                if (this.field4175.field3659) {
                    this.field4178 = null;
                    this.field4174 = null;
                } else {
                    this.field4179 = (byte) (this.field4179 | 0x2);
                }
            }
            if (arg2 && class329.field5607) {
                if (this.field4193.field3659) {
                    this.field4201 = null;
                    this.field4202 = null;
                    this.field4199 = null;
                    this.field4197 = null;
                } else {
                    this.field4179 = (byte) (this.field4179 | 0x4);
                }
            }
            if (arg3) {
                if (this.field4195.field3659) {
                    this.field4205 = null;
                    this.field4173 = null;
                } else {
                    this.field4179 = (byte) (this.field4179 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field4208.field3659 && this.field4175.field3659) {
                    this.field4187 = null;
                    this.field4183 = null;
                    this.field4206 = null;
                } else {
                    this.field4179 = (byte) (this.field4179 | 0x10);
                }
            }
            if (arg5) {
                this.field4172 = null;
                this.field4171 = null;
                this.field4204 = (int[][]) null;
                this.field4209 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII[FFIF)V", line = 464)
    private static final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field4221 = var16;
        field4224 = var17;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(ZZ)Lrl;", line = 508)
    public final class196 method283(boolean arg0, boolean arg1) {
        return this.method1709(arg0, arg1, field4213, field4196);
    }

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "()V", line = 514)
    public final void method267() {
        for (int var1 = 0; var1 < this.field4212; var1++) {
            int var2 = this.field4214[var1];
            this.field4214[var1] = this.field4186[var1];
            this.field4186[var1] = -var2;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)V", line = 530)
    public final void method271(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4212; var4++) {
            this.field4186[var4] = this.field4186[var4] * arg0 >> 7;
            this.field4192[var4] = this.field4192[var4] * arg1 >> 7;
            this.field4214[var4] = this.field4214[var4] * arg2 >> 7;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIJILki;)V", line = 546)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class164 arg10) {
        if (this.field4200 == 0) {
            return;
        }
        if (!this.field4170.field4392) {
            this.method1719();
        }
        short var13 = this.field4170.field4399;
        short var14 = this.field4170.field4398;
        short var15 = this.field4170.field4395;
        if (arg10 != null) {
            arg10.method1110(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class214.field3688) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class324.field5468) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class165.field2827) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class297.field5079) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class227.field3896[arg0];
            var27 = class227.field3911[arg0];
        }
        if (arg8 > 0L && class222.field3792 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class317.field5358 >= var28 && class317.field5358 <= var29 && class51.field890 >= var30 && class51.field890 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field4170.field4393;
                short var37 = this.field4170.field4397;
                short var38 = this.field4170.field4396;
                short var39 = this.field4170.field4394;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class317.field5358 >= var32 && class317.field5358 <= var33 && class51.field890 >= var34 && class51.field890 <= var35) {
                    if (this.field3398) {
                        class45.field832[class156.field2653++] = arg8;
                    } else {
                        if (field4225.length < this.field4200) {
                            field4225 = new int[this.field4200];
                            field4222 = new int[this.field4200];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field4212) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field4176) {
                                        break label124;
                                    }
                                    short var80 = this.field4187[var79];
                                    short var81 = this.field4183[var79];
                                    short var82 = this.field4206[var79];
                                    if (this.method1727(class317.field5358, class51.field890, field4222[var80], field4222[var81], field4222[var82], field4225[var80], field4225[var81], field4225[var82])) {
                                        class45.field832[class156.field2653++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field4186[var59];
                            int var61 = this.field4192[var59];
                            int var62 = this.field4214[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field4190[var59];
                            int var76 = this.field4190[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field4181[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field4225[var78] = var73;
                                field4222[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class108.field1899;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1713();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        if (arg10 != null) {
            arg10.method1120(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "()V", line = 832)
    private final void method1713() {
        GL var1 = class108.field1899;
        if (this.field4176 == 0) {
            return;
        }
        if (this.field4180 != 0) {
            this.method1718(true, !this.field4207.field3659 && (this.field4180 & 0x1) != 0, !this.field4175.field3659 && (this.field4180 & 0x2) != 0, this.field4193 != null && !this.field4193.field3659 && (this.field4180 & 0x4) != 0, false);
        }
        this.method1718(false, !this.field4207.field3659, !this.field4175.field3659, this.field4193 != null && !this.field4193.field3659, !this.field4195.field3659);
        if (!this.field4208.field3659) {
            this.method1717();
        }
        if (this.field4179 != 0) {
            if ((this.field4179 & 0x1) != 0) {
                this.field4186 = null;
                this.field4192 = null;
                this.field4214 = null;
                this.field4181 = null;
                this.field4190 = null;
            }
            if ((this.field4179 & 0x2) != 0) {
                this.field4178 = null;
                this.field4174 = null;
            }
            if ((this.field4179 & 0x4) != 0) {
                this.field4201 = null;
                this.field4202 = null;
                this.field4199 = null;
                this.field4197 = null;
            }
            if ((this.field4179 & 0x8) != 0) {
                this.field4205 = null;
                this.field4173 = null;
            }
            if ((this.field4179 & 0x10) != 0) {
                this.field4187 = null;
                this.field4183 = null;
                this.field4206 = null;
            }
            this.field4179 = 0;
        }
        class79 var2 = null;
        if (this.field4207.field3657 != null) {
            this.field4207.field3657.method564();
            var2 = this.field4207.field3657;
            var1.glVertexPointer(3, 5126, this.field4207.field3650, (long) this.field4207.field3662);
        }
        if (this.field4175.field3657 != null) {
            if (this.field4175.field3657 != var2) {
                this.field4175.field3657.method564();
                var2 = this.field4175.field3657;
            }
            var1.glColorPointer(4, 5121, this.field4175.field3650, (long) this.field4175.field3662);
        }
        if (class329.field5607 && this.field4193.field3657 != null) {
            if (this.field4193.field3657 != var2) {
                this.field4193.field3657.method564();
                var2 = this.field4193.field3657;
            }
            var1.glNormalPointer(5126, this.field4193.field3650, (long) this.field4193.field3662);
        }
        if (this.field4195.field3657 != null) {
            if (this.field4195.field3657 != var2) {
                this.field4195.field3657.method564();
                class79 var3 = this.field4195.field3657;
            }
            var1.glTexCoordPointer(2, 5126, this.field4195.field3650, (long) this.field4195.field3662);
        }
        if (this.field4208.field3657 != null) {
            this.field4208.field3657.method562();
        }
        if (this.field4207.field3657 == null || this.field4175.field3657 == null || class329.field5607 && this.field4193.field3657 == null || this.field4195.field3657 == null) {
            if (class108.field1904) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field4207.field3657 == null) {
                this.field4207.field3656.position(this.field4207.field3662);
                var1.glVertexPointer(3, 5126, this.field4207.field3650, this.field4207.field3656);
            }
            if (this.field4175.field3657 == null) {
                this.field4175.field3656.position(this.field4175.field3662);
                var1.glColorPointer(4, 5121, this.field4175.field3650, this.field4175.field3656);
            }
            if (class329.field5607 && this.field4193.field3657 == null) {
                this.field4193.field3656.position(this.field4193.field3662);
                var1.glNormalPointer(5126, this.field4193.field3650, this.field4193.field3656);
            }
            if (this.field4195.field3657 == null) {
                this.field4195.field3656.position(this.field4195.field3662);
                var1.glTexCoordPointer(2, 5126, this.field4195.field3650, this.field4195.field3656);
            }
        }
        if (this.field4208.field3657 == null && class108.field1904) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field4185.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field4185[var5];
            int var7 = this.field4185[var5 + 1];
            short var8 = this.field4189[var6];
            if (var8 == -1) {
                class108.method736(-1);
                class257.method1832((byte) 52, 0, 0);
            } else {
                class227.field3904.method1504(var8 & 0xFFFF, 255);
            }
            if (this.field4208.field3657 == null) {
                this.field4208.field3656.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field4208.field3656);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "()V", line = 1007)
    public final void method1714() {
        if (this.field4201 == null) {
            this.method270();
            return;
        }
        for (int var1 = 0; var1 < this.field4212; var1++) {
            this.field4186[var1] = -this.field4186[var1];
            this.field4214[var1] = -this.field4214[var1];
        }
        for (int var2 = 0; var2 < this.field4200; var2++) {
            this.field4201[var2] = (short) (-this.field4201[var2]);
            this.field4199[var2] = (short) (-this.field4199[var2]);
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "()I", line = 1040)
    public final int method1715() {
        return this.field4184;
    }

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "()V", line = 1045)
    public final void method1716() {
        for (int var1 = 0; var1 < this.field4212; var1++) {
            this.field4214[var1] = -this.field4214[var1];
        }
        if (this.field4199 != null) {
            for (int var2 = 0; var2 < this.field4200; var2++) {
                this.field4199[var2] = (short) (-this.field4199[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field4176; var3++) {
            short var4 = this.field4187[var3];
            this.field4187[var3] = this.field4206[var3];
            this.field4206[var3] = var4;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
        this.field4208.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "()V", line = 1083)
    public final void method281() {
        for (int var1 = 0; var1 < this.field4212; var1++) {
            int var2 = this.field4186[var1];
            this.field4186[var1] = this.field4214[var1];
            this.field4214[var1] = -var2;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lll;IZ)V", line = 1098)
    public final void method280(class158 arg0, int arg1, boolean arg2) {
        if (this.field4204 == null || arg1 == -1) {
            return;
        }
        class43 var4 = arg0.field2707[arg1];
        class113 var5 = var4.field781;
        for (int var6 = 0; var6 < this.field4212; var6++) {
            this.field4186[var6] <<= 0x4;
            this.field4192[var6] <<= 0x4;
            this.field4214[var6] <<= 0x4;
        }
        field4218 = 0;
        field4223 = 0;
        field4227 = 0;
        for (int var7 = 0; var7 < var4.field782; var7++) {
            short var8 = var4.field780[var7];
            if (var4.field778[var7] != -1) {
                this.method1722(0, var5.field2038[var4.field778[var7]], 0, 0, 0, arg2);
            }
            this.method1722(var5.field2039[var8], var5.field2038[var8], var4.field785[var7], var4.field784[var7], var4.field777[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field4212; var9++) {
            this.field4186[var9] >>= 0x4;
            this.field4192[var9] >>= 0x4;
            this.field4214[var9] >>= 0x4;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZ)Lrl;", line = 1151)
    public final class196 method279(boolean arg0, boolean arg1) {
        return this.method1709(arg0, arg1, field4216, field4215);
    }

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "()V", line = 1156)
    private final void method1717() {
        if (field4194.field174.length < this.field4200 * 12) {
            field4194 = new class14((this.field4200 + 100) * 12);
        } else {
            field4194.field195 = 0;
        }
        if (class108.field1911) {
            for (int var1 = 0; var1 < this.field4176; var1++) {
                field4194.method100(this.field4187[var1], 65280);
                field4194.method100(this.field4183[var1], 65280);
                field4194.method100(this.field4206[var1], 65280);
            }
        } else {
            for (int var2 = 0; var2 < this.field4176; var2++) {
                field4194.method89((byte) 94, this.field4187[var2]);
                field4194.method89((byte) 94, this.field4183[var2]);
                field4194.method89((byte) 94, this.field4206[var2]);
            }
        }
        if (!class108.field1904) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field4194.field195);
            var5.put(field4194.field174, 0, field4194.field195);
            var5.flip();
            this.field4208.field3659 = true;
            this.field4208.field3656 = var5;
            this.field4208.field3657 = null;
            return;
        }
        class79 var3 = new class79();
        ByteBuffer var4 = ByteBuffer.wrap(field4194.field174, 0, field4194.field195);
        var3.method563(var4);
        this.field4208.field3659 = true;
        this.field4208.field3656 = null;
        this.field4208.field3657 = var3;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 3772)
    private class239() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lei;IIZ)V", line = 3794)
    public class239(class197 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3427];
        this.field4190 = new int[arg0.field3441 + 1];
        for (int var6 = 0; var6 < arg0.field3427; var6++) {
            if ((arg0.field3439 == null || arg0.field3439[var6] != 2) && (arg0.field3414 == null || arg0.field3414[var6] == -1 || !class227.field3904.method1511(arg0.field3414[var6] & 0xFFFF, -1))) {
                var5[this.field4176++] = var6;
                this.field4190[arg0.field3440[var6]]++;
                this.field4190[arg0.field3448[var6]]++;
                this.field4190[arg0.field3408[var6]]++;
            }
        }
        long[] var7 = new long[this.field4176];
        for (int var8 = 0; var8 < this.field4176; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3414 != null) {
                var14 = arg0.field3414[var9];
                if (var14 != -1) {
                    var12 = class227.field3904.method1507(false, var14 & 0xFFFF);
                    var13 = class227.field3904.method1515(var14 & 0xFFFF, (byte) -27);
                }
            }
            boolean var15 = arg0.field3420 != null && arg0.field3420[var9] != 0 || var14 != -1 && !class227.field3904.method1506(var14 & 0xFFFF, 59);
            if ((arg3 || var15) && arg0.field3402 != null) {
                var10 += arg0.field3402[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class170.method1164(0, var7, var5);
        this.field4212 = arg0.field3441;
        this.field4186 = arg0.field3422;
        this.field4192 = arg0.field3445;
        this.field4214 = arg0.field3418;
        this.field4172 = arg0.field3417;
        this.field4203 = arg0.field3425;
        this.field4191 = arg0.field3446;
        int var20 = this.field4176 * 3;
        this.field4201 = new short[var20];
        this.field4202 = new short[var20];
        this.field4199 = new short[var20];
        this.field4197 = new short[var20];
        this.field4205 = new float[var20];
        this.field4173 = new float[var20];
        this.field4178 = new short[this.field4176];
        this.field4174 = new byte[this.field4176];
        this.field4187 = new short[this.field4176];
        this.field4183 = new short[this.field4176];
        this.field4206 = new short[this.field4176];
        this.field4189 = new short[this.field4176];
        if (arg0.field3431 != null) {
            this.field4171 = new byte[this.field4176];
        }
        this.field4170 = new class251();
        this.field4207 = new class213();
        this.field4175 = new class213();
        if (class329.field5607) {
            this.field4193 = new class213();
        }
        this.field4195 = new class213();
        this.field4208 = new class213();
        this.field4184 = (short) arg1;
        this.field4210 = (short) arg2;
        this.field4181 = new short[var20];
        field4188 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3441; var22++) {
            int var23 = this.field4190[var22];
            this.field4190[var22] = var21;
            var21 += var23;
        }
        this.field4190[arg0.field3441] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3430 != null) {
            int var28 = arg0.field3407;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field4176; var36++) {
                int var37 = var5[var36];
                if (arg0.field3430[var37] != -1) {
                    int var38 = arg0.field3430[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3440[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3448[var37];
                        } else {
                            var40 = arg0.field3408[var37];
                        }
                        int var41 = arg0.field3422[var40];
                        int var42 = arg0.field3445[var40];
                        int var43 = arg0.field3418[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field3433[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3403[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field3436[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3403[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3436[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3399[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3403[var44] / 1024.0F;
                        var49 = (float) arg0.field3436[var44] / 1024.0F;
                        var48 = (float) arg0.field3399[var44] / 1024.0F;
                    }
                    var27[var44] = method1732(arg0.field3449[var44], arg0.field3426[var44], arg0.field3401[var44], arg0.field3428[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field4176; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3419[var51] & 0xFFFF;
            short var53;
            if (arg0.field3414 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3414[var51];
            }
            int var54;
            if (arg0.field3430 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3430[var51];
            }
            int var55;
            if (arg0.field3420 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3420[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field3433[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3440[var51];
                        int var67 = arg0.field3448[var51];
                        int var68 = arg0.field3408[var51];
                        short var69 = arg0.field3449[var54];
                        short var70 = arg0.field3426[var54];
                        short var71 = arg0.field3401[var54];
                        float var72 = (float) arg0.field3422[var69];
                        float var73 = (float) arg0.field3445[var69];
                        float var74 = (float) arg0.field3418[var69];
                        float var75 = (float) arg0.field3422[var70] - var72;
                        float var76 = (float) arg0.field3445[var70] - var73;
                        float var77 = (float) arg0.field3418[var70] - var74;
                        float var78 = (float) arg0.field3422[var71] - var72;
                        float var79 = (float) arg0.field3445[var71] - var73;
                        float var80 = (float) arg0.field3418[var71] - var74;
                        float var81 = (float) arg0.field3422[var66] - var72;
                        float var82 = (float) arg0.field3445[var66] - var73;
                        float var83 = (float) arg0.field3418[var66] - var74;
                        float var84 = (float) arg0.field3422[var67] - var72;
                        float var85 = (float) arg0.field3445[var67] - var73;
                        float var86 = (float) arg0.field3418[var67] - var74;
                        float var87 = (float) arg0.field3422[var68] - var72;
                        float var88 = (float) arg0.field3445[var68] - var73;
                        float var89 = (float) arg0.field3418[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field3440[var51];
                        int var102 = arg0.field3448[var51];
                        int var103 = arg0.field3408[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3432[var54];
                        float var109 = (float) arg0.field3411[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3399[var54] & 0xFFFF) / 1024.0F;
                            method1712(arg0.field3422[var101], arg0.field3445[var101], arg0.field3418[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field4221;
                            var57 = field4224;
                            method1712(arg0.field3422[var102], arg0.field3445[var102], arg0.field3418[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field4221;
                            var59 = field4224;
                            method1712(arg0.field3422[var103], arg0.field3445[var103], arg0.field3418[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field4221;
                            var61 = field4224;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field3423[var54] / 256.0F;
                            float var113 = (float) arg0.field3443[var54] / 256.0F;
                            int var114 = arg0.field3422[var102] - arg0.field3422[var101];
                            int var115 = arg0.field3445[var102] - arg0.field3445[var101];
                            int var116 = arg0.field3418[var102] - arg0.field3418[var101];
                            int var117 = arg0.field3422[var103] - arg0.field3422[var101];
                            int var118 = arg0.field3445[var103] - arg0.field3445[var101];
                            int var119 = arg0.field3418[var103] - arg0.field3418[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3403[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3436[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3399[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1730(var126, var127, var128);
                            method1736(arg0.field3422[var101], arg0.field3445[var101], arg0.field3418[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field4217;
                            var57 = field4219;
                            method1736(arg0.field3422[var102], arg0.field3445[var102], arg0.field3418[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field4217;
                            var59 = field4219;
                            method1736(arg0.field3422[var103], arg0.field3445[var103], arg0.field3418[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field4217;
                            var61 = field4219;
                        } else if (var65 == 3) {
                            method1723(arg0.field3422[var101], arg0.field3445[var101], arg0.field3418[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field4226;
                            var57 = field4220;
                            method1723(arg0.field3422[var102], arg0.field3445[var102], arg0.field3418[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field4226;
                            var59 = field4220;
                            method1723(arg0.field3422[var103], arg0.field3445[var103], arg0.field3418[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field4226;
                            var61 = field4220;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1350();
            byte var129;
            if (arg0.field3439 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3439[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3440[var51];
                class47 var133 = arg0.field3405[var132];
                this.field4187[var50] = this.method1737(arg0, var132, var130, var133.field863, var133.field855, var133.field864, var133.field866, var56, var57);
                int var134 = arg0.field3448[var51];
                class47 var135 = arg0.field3405[var134];
                this.field4183[var50] = this.method1737(arg0, var134, (long) var62 + var130, var135.field863, var135.field855, var135.field864, var135.field866, var58, var59);
                int var136 = arg0.field3408[var51];
                class47 var137 = arg0.field3405[var136];
                this.field4206[var50] = this.method1737(arg0, var136, (long) var63 + var130, var137.field863, var137.field855, var137.field864, var137.field866, var60, var61);
            } else if (var129 == 1) {
                class307 var138 = arg0.field3429[var51];
                long var139 = (long) ((var54 << 2) + (var138.field5188 > 0 ? 1024 : 2048) + (var138.field5195 + 256 << 12) + (var138.field5194 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field4187[var50] = this.method1737(arg0, arg0.field3440[var51], var139, var138.field5188, var138.field5195, var138.field5194, 0, var56, var57);
                this.field4183[var50] = this.method1737(arg0, arg0.field3448[var51], (long) var62 + var139, var138.field5188, var138.field5195, var138.field5194, 0, var58, var59);
                this.field4206[var50] = this.method1737(arg0, arg0.field3408[var51], (long) var63 + var139, var138.field5188, var138.field5195, var138.field5194, 0, var60, var61);
            }
            if (arg0.field3414 == null) {
                this.field4189[var50] = -1;
            } else {
                this.field4189[var50] = arg0.field3414[var51];
            }
            if (this.field4171 != null) {
                this.field4171[var50] = (byte) arg0.field3431[var51];
            }
            this.field4178[var50] = arg0.field3419[var51];
            if (arg0.field3420 != null) {
                this.field4174[var50] = arg0.field3420[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field4176; var143++) {
            short var144 = this.field4189[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field4185 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field4176; var147++) {
            short var148 = this.field4189[var147];
            if (var146 != var148) {
                this.field4185[var145++] = var147;
                var146 = var148;
            }
        }
        this.field4185[var145] = this.field4176;
        field4188 = null;
        this.field4201 = method1726(this.field4201, this.field4200);
        this.field4202 = method1726(this.field4202, this.field4200);
        this.field4199 = method1726(this.field4199, this.field4200);
        this.field4197 = method1726(this.field4197, this.field4200);
        this.field4205 = method1729(this.field4205, this.field4200);
        this.field4173 = method1729(this.field4173, this.field4200);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZ)V", line = 1221)
    private final void method1718(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field4207.field3662 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field4175.field3662 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field4193.field3662 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field4195.field3662 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field4194.field174.length < this.field4200 * var6) {
            field4194 = new class14((this.field4200 + 100) * var6);
        } else {
            field4194.field195 = 0;
        }
        if (arg1) {
            if (class108.field1911) {
                for (int var7 = 0; var7 < this.field4212; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field4186[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field4192[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field4214[var7]);
                    int var11 = this.field4190[var7];
                    int var12 = this.field4190[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field4181[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field4194.field195 = var6 * var14;
                        field4194.method100(var8, 65280);
                        field4194.method100(var9, 65280);
                        field4194.method100(var10, 65280);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field4212; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field4186[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field4192[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field4214[var15]);
                    int var19 = this.field4190[var15];
                    int var20 = this.field4190[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field4181[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field4194.field195 = var6 * var22;
                        field4194.method89((byte) 94, var16);
                        field4194.method89((byte) 94, var17);
                        field4194.method89((byte) 94, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class329.field5607) {
                for (int var42 = 0; var42 < this.field4176; var42++) {
                    int var43 = method1707(this.field4178[var42], this.field4189[var42], this.field4184, this.field4174[var42]);
                    field4194.field195 = this.field4187[var42] * var6 + this.field4175.field3662;
                    field4194.method100(var43, 65280);
                    field4194.field195 = this.field4183[var42] * var6 + this.field4175.field3662;
                    field4194.method100(var43, 65280);
                    field4194.field195 = this.field4206[var42] * var6 + this.field4175.field3662;
                    field4194.method100(var43, 65280);
                }
            } else {
                int var23 = (int) class276.field4746[0];
                int var24 = (int) class276.field4746[1];
                int var25 = (int) class276.field4746[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field4184 * 1.3F);
                int var28 = this.field4210 * var26 >> 8;
                for (int var29 = 0; var29 < this.field4176; var29++) {
                    short var30 = this.field4187[var29];
                    short var31 = this.field4197[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field4199[var30] * var25 + this.field4202[var30] * var24 + this.field4201[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field4199[var30] * var25 + this.field4202[var30] * var24 + this.field4201[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field4197[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field4183[var29];
                    short var34 = this.field4197[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field4199[var33] * var25 + this.field4202[var33] * var24 + this.field4201[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field4199[var33] * var25 + this.field4202[var33] * var24 + this.field4201[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field4197[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field4206[var29];
                    short var37 = this.field4197[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field4199[var36] * var25 + this.field4202[var36] * var24 + this.field4201[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field4199[var36] * var25 + this.field4202[var36] * var24 + this.field4201[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field4197[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1707(this.field4178[var29], this.field4189[var29], var32, this.field4174[var29]);
                    int var40 = method1707(this.field4178[var29], this.field4189[var29], var35, this.field4174[var29]);
                    int var41 = method1707(this.field4178[var29], this.field4189[var29], var38, this.field4174[var29]);
                    field4194.field195 = var6 * var30 + this.field4175.field3662;
                    field4194.method100(var39, 65280);
                    field4194.field195 = var6 * var33 + this.field4175.field3662;
                    field4194.method100(var40, 65280);
                    field4194.field195 = var6 * var36 + this.field4175.field3662;
                    field4194.method100(var41, 65280);
                }
                this.field4201 = null;
                this.field4202 = null;
                this.field4199 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field4210;
            float var45 = 3.0F / (float) (this.field4210 / 2 + this.field4210);
            field4194.field195 = this.field4193.field3662;
            if (class108.field1911) {
                for (int var46 = 0; var46 < this.field4200; var46++) {
                    short var47 = this.field4197[var46];
                    if (var47 == 0) {
                        field4194.method130(false, (float) this.field4201[var46] * var45);
                        field4194.method130(false, (float) this.field4202[var46] * var45);
                        field4194.method130(false, (float) this.field4199[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field4194.method130(false, (float) this.field4201[var46] * var48);
                        field4194.method130(false, (float) this.field4202[var46] * var48);
                        field4194.method130(false, (float) this.field4199[var46] * var48);
                    }
                    field4194.field195 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field4200; var49++) {
                    short var50 = this.field4197[var49];
                    if (var50 == 0) {
                        field4194.method91((float) this.field4201[var49] * var45, (byte) 98);
                        field4194.method91((float) this.field4202[var49] * var45, (byte) -119);
                        field4194.method91((float) this.field4199[var49] * var45, (byte) -102);
                    } else {
                        float var51 = var44 / (float) var50;
                        field4194.method91((float) this.field4201[var49] * var51, (byte) 113);
                        field4194.method91((float) this.field4202[var49] * var51, (byte) -119);
                        field4194.method91((float) this.field4199[var49] * var51, (byte) -88);
                    }
                    field4194.field195 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field4194.field195 = this.field4195.field3662;
            if (class108.field1911) {
                for (int var52 = 0; var52 < this.field4200; var52++) {
                    field4194.method130(false, this.field4205[var52]);
                    field4194.method130(false, this.field4173[var52]);
                    field4194.field195 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field4200; var53++) {
                    field4194.method91(this.field4205[var53], (byte) 82);
                    field4194.method91(this.field4173[var53], (byte) 57);
                    field4194.field195 += var6 - 8;
                }
            }
        }
        field4194.field195 = this.field4200 * var6;
        if (arg0) {
            if (class108.field1903) {
                ByteBuffer var54 = ByteBuffer.wrap(field4194.field174, 0, field4194.field195);
                if (this.field4211 == null) {
                    this.field4211 = new class79(true);
                    this.field4211.method563(var54);
                } else {
                    this.field4211.method560(var54);
                }
                if (arg1) {
                    this.field4207.field3659 = true;
                    this.field4207.field3656 = null;
                    this.field4207.field3657 = this.field4211;
                    this.field4207.field3650 = var6;
                }
                if (arg2) {
                    this.field4175.field3659 = true;
                    this.field4175.field3656 = null;
                    this.field4175.field3657 = this.field4211;
                    this.field4175.field3650 = var6;
                }
                if (arg3) {
                    this.field4193.field3659 = true;
                    this.field4193.field3656 = null;
                    this.field4193.field3657 = this.field4211;
                    this.field4193.field3650 = var6;
                }
                if (arg4) {
                    this.field4195.field3659 = true;
                    this.field4195.field3656 = null;
                    this.field4195.field3657 = this.field4211;
                    this.field4195.field3650 = var6;
                }
            } else {
                if (field4198 == null || field4198.capacity() < field4194.field195) {
                    field4198 = ByteBuffer.allocateDirect(var6 * 100 + field4194.field195);
                } else {
                    field4198.clear();
                }
                field4198.put(field4194.field174, 0, field4194.field195);
                field4198.flip();
                if (arg1) {
                    this.field4207.field3659 = true;
                    this.field4207.field3656 = field4198;
                    this.field4207.field3657 = null;
                    this.field4207.field3650 = var6;
                }
                if (arg2) {
                    this.field4175.field3659 = true;
                    this.field4175.field3656 = field4198;
                    this.field4207.field3657 = null;
                    this.field4175.field3650 = var6;
                }
                if (arg3) {
                    this.field4193.field3659 = true;
                    this.field4193.field3656 = field4198;
                    this.field4193.field3657 = null;
                    this.field4193.field3650 = var6;
                }
                if (arg4) {
                    this.field4195.field3659 = true;
                    this.field4195.field3656 = field4198;
                    this.field4195.field3657 = null;
                    this.field4195.field3650 = var6;
                }
            }
        } else if (class108.field1904) {
            class79 var55 = new class79();
            ByteBuffer var56 = ByteBuffer.wrap(field4194.field174, 0, field4194.field195);
            var55.method563(var56);
            if (arg1) {
                this.field4207.field3659 = true;
                this.field4207.field3656 = null;
                this.field4207.field3657 = var55;
                this.field4207.field3650 = var6;
            }
            if (arg2) {
                this.field4175.field3659 = true;
                this.field4175.field3656 = null;
                this.field4175.field3657 = var55;
                this.field4175.field3650 = var6;
            }
            if (arg3) {
                this.field4193.field3659 = true;
                this.field4193.field3656 = null;
                this.field4193.field3657 = var55;
                this.field4193.field3650 = var6;
            }
            if (arg4) {
                this.field4195.field3659 = true;
                this.field4195.field3656 = null;
                this.field4195.field3657 = var55;
                this.field4195.field3650 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field4194.field195);
            var57.put(field4194.field174, 0, field4194.field195);
            var57.flip();
            if (arg1) {
                this.field4207.field3659 = true;
                this.field4207.field3656 = var57;
                this.field4207.field3657 = null;
                this.field4207.field3650 = var6;
            }
            if (arg2) {
                this.field4175.field3659 = true;
                this.field4175.field3656 = var57;
                this.field4207.field3657 = null;
                this.field4175.field3650 = var6;
            }
            if (arg3) {
                this.field4193.field3659 = true;
                this.field4193.field3656 = var57;
                this.field4193.field3657 = null;
                this.field4193.field3650 = var6;
            }
            if (arg4) {
                this.field4195.field3659 = true;
                this.field4195.field3656 = var57;
                this.field4195.field3657 = null;
                this.field4195.field3650 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "()V", line = 1753)
    private final void method1719() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field4212; var9++) {
            int var10 = this.field4186[var9];
            int var11 = this.field4192[var9];
            int var12 = this.field4214[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field4170.field4393 = (short) var1;
        this.field4170.field4397 = (short) var4;
        this.field4170.field4398 = (short) var2;
        this.field4170.field4395 = (short) var5;
        this.field4170.field4396 = (short) var3;
        this.field4170.field4394 = (short) var6;
        this.field4170.field4399 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field4170.field4392 = true;
    }

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "()V", line = 1822)
    public static void method1720() {
        field4188 = null;
        field4194 = null;
        field4198 = null;
        field4196 = null;
        field4213 = null;
        field4215 = null;
        field4216 = null;
        field4225 = null;
        field4222 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lrm;)Lrm;", line = 1837)
    public final class248 method1721(class248 arg0) {
        if (this.field4200 == 0) {
            return null;
        }
        if (!this.field4170.field4392) {
            this.method1719();
        }
        int var2;
        int var3;
        if (class276.field4752 > 0) {
            var2 = this.field4170.field4393 - (class276.field4752 * this.field4170.field4395 >> 8) >> 3;
            var3 = this.field4170.field4397 - (class276.field4752 * this.field4170.field4398 >> 8) >> 3;
        } else {
            var2 = this.field4170.field4393 - (class276.field4752 * this.field4170.field4398 >> 8) >> 3;
            var3 = this.field4170.field4397 - (class276.field4752 * this.field4170.field4395 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class276.field4751 > 0) {
            var4 = this.field4170.field4396 - (class276.field4751 * this.field4170.field4395 >> 8) >> 3;
            var5 = this.field4170.field4394 - (class276.field4751 * this.field4170.field4398 >> 8) >> 3;
        } else {
            var4 = this.field4170.field4396 - (class276.field4751 * this.field4170.field4398 >> 8) >> 3;
            var5 = this.field4170.field4394 - (class276.field4751 * this.field4170.field4395 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class248 var8;
        if (arg0 == null || arg0.field4376.length < var6 * var7) {
            var8 = new class248(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2298 = arg0.field2294 = var6;
            arg0.field2297 = arg0.field2299 = var7;
            arg0.method1791();
        }
        var8.field2301 = var2;
        var8.field2295 = var4;
        if (field4225.length < this.field4200) {
            field4225 = new int[this.field4200];
            field4222 = new int[this.field4200];
        }
        for (int var9 = 0; var9 < this.field4212; var9++) {
            int var10 = (this.field4186[var9] - (this.field4192[var9] * class276.field4752 >> 8) >> 3) - var2;
            int var11 = (this.field4214[var9] - (this.field4192[var9] * class276.field4751 >> 8) >> 3) - var4;
            int var12 = this.field4190[var9];
            int var13 = this.field4190[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field4181[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field4225[var15] = var10;
                field4222[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field4176; var16++) {
            if (this.field4174[var16] <= 128) {
                short var17 = this.field4187[var16];
                short var18 = this.field4183[var16];
                short var19 = this.field4206[var16];
                int var20 = field4225[var17];
                int var21 = field4225[var18];
                int var22 = field4225[var19];
                int var23 = field4222[var17];
                int var24 = field4222[var18];
                int var25 = field4222[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class227.method1584(var8.field4376, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIIIZ)V", line = 1961)
    private final void method1722(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field4218 = 0;
            field4223 = 0;
            field4227 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field4204.length) {
                    int[] var14 = this.field4204[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field4218 += this.field4186[var16];
                        field4223 += this.field4192[var16];
                        field4227 += this.field4214[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field4218 = field4218 / var11 + var8;
                field4223 = field4223 / var11 + var9;
                field4227 = field4227 / var11 + var10;
            } else {
                field4218 = var8;
                field4223 = var9;
                field4227 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field4204.length) {
                    int[] var22 = this.field4204[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field4186[var24] += var17;
                        this.field4192[var24] += var18;
                        this.field4214[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4204.length) {
                    int[] var27 = this.field4204[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field4186[var29] -= field4218;
                        this.field4192[var29] -= field4223;
                        this.field4214[var29] -= field4227;
                        if (arg4 != 0) {
                            int var30 = class227.field3896[arg4];
                            int var31 = class227.field3911[arg4];
                            int var32 = this.field4192[var29] * var30 + this.field4186[var29] * var31 + 32767 >> 16;
                            this.field4192[var29] = this.field4192[var29] * var31 + 32767 - this.field4186[var29] * var30 >> 16;
                            this.field4186[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class227.field3896[arg2];
                            int var34 = class227.field3911[arg2];
                            int var35 = this.field4192[var29] * var34 + 32767 - this.field4214[var29] * var33 >> 16;
                            this.field4214[var29] = this.field4214[var29] * var34 + this.field4192[var29] * var33 + 32767 >> 16;
                            this.field4192[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class227.field3896[arg3];
                            int var37 = class227.field3911[arg3];
                            int var38 = this.field4214[var29] * var36 + this.field4186[var29] * var37 + 32767 >> 16;
                            this.field4214[var29] = this.field4214[var29] * var37 + 32767 - this.field4186[var29] * var36 >> 16;
                            this.field4186[var29] = var38;
                        }
                        this.field4186[var29] += field4218;
                        this.field4192[var29] += field4223;
                        this.field4214[var29] += field4227;
                    }
                }
            }
            if (arg5 && this.field4201 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field4204.length) {
                        int[] var41 = this.field4204[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field4190[var43];
                            int var45 = this.field4190[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field4181[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class227.field3896[arg4];
                                    int var49 = class227.field3911[arg4];
                                    int var50 = this.field4202[var47] * var48 + this.field4201[var47] * var49 + 32767 >> 16;
                                    this.field4202[var47] = (short) (this.field4202[var47] * var49 + 32767 - this.field4201[var47] * var48 >> 16);
                                    this.field4201[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class227.field3896[arg2];
                                    int var52 = class227.field3911[arg2];
                                    int var53 = this.field4202[var47] * var52 + 32767 - this.field4199[var47] * var51 >> 16;
                                    this.field4199[var47] = (short) (this.field4202[var47] * var51 + this.field4199[var47] * var52 + 32767 >> 16);
                                    this.field4202[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class227.field3896[arg3];
                                    int var55 = class227.field3911[arg3];
                                    int var56 = this.field4201[var47] * var55 + this.field4199[var47] * var54 + 32767 >> 16;
                                    this.field4199[var47] = (short) (this.field4199[var47] * var55 + 32767 - this.field4201[var47] * var54 >> 16);
                                    this.field4201[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field4193 != null) {
                    this.field4193.field3659 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field4204.length) {
                    int[] var59 = this.field4204[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field4186[var61] -= field4218;
                        this.field4192[var61] -= field4223;
                        this.field4214[var61] -= field4227;
                        this.field4186[var61] = this.field4186[var61] * arg2 >> 7;
                        this.field4192[var61] = this.field4192[var61] * arg3 >> 7;
                        this.field4214[var61] = this.field4214[var61] * arg4 >> 7;
                        this.field4186[var61] += field4218;
                        this.field4192[var61] += field4223;
                        this.field4214[var61] += field4227;
                    }
                }
            }
        } else if (arg0 == 5 && this.field4209 != null && this.field4174 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field4209.length) {
                    int[] var64 = this.field4209[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field4174[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field4174[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field4175.field3659 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "()I", line = 2306)
    public final int method289() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4397;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII[FIF)V", line = 2312)
    private static final void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field4226 = var16;
        field4220 = var17;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()I", line = 2358)
    public final int method201() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4398;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjm;[[I[[IIII)V", line = 2365)
    public final void method1724(int arg0, int arg1, class239 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field4170.field4392) {
            arg2.method1719();
        }
        int var9 = arg2.field4170.field4393 + arg5;
        int var10 = arg2.field4170.field4397 + arg5;
        int var11 = arg2.field4170.field4396 + arg7;
        int var12 = arg2.field4170.field4394 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field4212; var17++) {
                int var18 = this.field4186[var17] + arg5;
                int var19 = this.field4214[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field4192[var17] = this.field4192[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field4170.field4398;
            for (int var28 = 0; var28 < this.field4212; var28++) {
                int var29 = (this.field4192[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field4186[var28] + arg5;
                    int var31 = this.field4214[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field4192[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1337(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field4170.field4395 - arg2.field4170.field4398;
            for (int var42 = 0; var42 < this.field4212; var42++) {
                int var43 = this.field4186[var42] + arg5;
                int var44 = this.field4214[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field4192[var42] = var51 + this.field4192[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field4170.field4395 - arg2.field4170.field4398;
            for (int var53 = 0; var53 < this.field4212; var53++) {
                int var54 = this.field4186[var53] + arg5;
                int var55 = this.field4214[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field4192[var53] = ((this.field4192[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field4207.field3659 = false;
        this.field4170.field4392 = false;
    }

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "()V", line = 2562)
    public final void method1725() {
        if (this.field4201 == null) {
            this.method267();
            return;
        }
        for (int var1 = 0; var1 < this.field4212; var1++) {
            int var2 = this.field4214[var1];
            this.field4214[var1] = this.field4186[var1];
            this.field4186[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4200; var3++) {
            short var4 = this.field4199[var3];
            this.field4199[var3] = this.field4201[var3];
            this.field4201[var3] = (short) (-var4);
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([SI)[S", line = 2600)
    private static final short[] method1726(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class36.method322(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)Z", line = 2605)
    private final boolean method1727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V", line = 2620)
    public final void method1728(int arg0) {
        this.field4184 = (short) arg0;
        this.field4175.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([FI)[F", line = 2625)
    private static final float[] method1729(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class36.method323(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lll;I)V", line = 2630)
    public final void method273(class158 arg0, int arg1) {
        if (this.field4204 == null || arg1 == -1) {
            return;
        }
        class43 var3 = arg0.field2707[arg1];
        class113 var4 = var3.field781;
        field4218 = 0;
        field4223 = 0;
        field4227 = 0;
        for (int var5 = 0; var5 < var3.field782; var5++) {
            short var6 = var3.field780[var5];
            if (var4.field2043[var6]) {
                if (var3.field778[var5] != -1) {
                    this.method1708(0, 0, 0, 0);
                }
                this.method1708(var4.field2039[var6], var3.field785[var5], var3.field784[var5], var3.field777[var5]);
            }
        }
        this.field4207.field3659 = false;
        this.field4170.field4392 = false;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "()I", line = 2665)
    public final int method272() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4393;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "()V", line = 2679)
    public final void method270() {
        for (int var1 = 0; var1 < this.field4212; var1++) {
            this.field4186[var1] = -this.field4186[var1];
            this.field4214[var1] = -this.field4214[var1];
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V", line = 2692)
    public final void method268(int arg0) {
        int var2 = class227.field3896[arg0];
        int var3 = class227.field3911[arg0];
        for (int var4 = 0; var4 < this.field4212; var4++) {
            int var5 = this.field4214[var4] * var2 + this.field4186[var4] * var3 >> 16;
            this.field4214[var4] = this.field4214[var4] * var3 - this.field4186[var4] * var2 >> 16;
            this.field4186[var4] = var5;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 2712)
    public final void method286(int arg0) {
        int var2 = class227.field3896[arg0];
        int var3 = class227.field3911[arg0];
        for (int var4 = 0; var4 < this.field4212; var4++) {
            int var5 = this.field4192[var4] * var3 - this.field4214[var4] * var2 >> 16;
            this.field4214[var4] = this.field4214[var4] * var3 + this.field4192[var4] * var2 >> 16;
            this.field4192[var4] = var5;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)V", line = 2734)
    public final void method266(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4212; var4++) {
            this.field4186[var4] += arg0;
            this.field4192[var4] += arg1;
            this.field4214[var4] += arg2;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(FFF)I", line = 2749)
    private static final int method1730(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lhg;IIIZ)V", line = 2787)
    public final void method1180(class174 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class239 var6 = (class239) arg0;
        if (this.field4176 == 0 || var6.field4176 == 0) {
            return;
        }
        int var7 = var6.field4212;
        int[] var8 = var6.field4186;
        int[] var9 = var6.field4192;
        int[] var10 = var6.field4214;
        short[] var11 = var6.field4201;
        short[] var12 = var6.field4202;
        short[] var13 = var6.field4199;
        short[] var14 = var6.field4197;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field4182 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field4182.field3738;
            var16 = this.field4182.field3740;
            var17 = this.field4182.field3739;
            var18 = this.field4182.field3741;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4182 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field4182.field3738;
            var20 = var6.field4182.field3740;
            var21 = var6.field4182.field3739;
            var22 = var6.field4182.field3741;
        }
        int[] var23 = var6.field4190;
        short[] var24 = var6.field4181;
        if (!var6.field4170.field4392) {
            var6.method1719();
        }
        short var25 = var6.field4170.field4398;
        short var26 = var6.field4170.field4395;
        short var27 = var6.field4170.field4393;
        short var28 = var6.field4170.field4397;
        short var29 = var6.field4170.field4396;
        short var30 = var6.field4170.field4394;
        for (int var31 = 0; var31 < this.field4212; var31++) {
            int var32 = this.field4192[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4186[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field4214[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4190[var31];
                        int var37 = this.field4190[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4181[var38] - 1;
                            if (var35 == -1 || this.field4197[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field4182 = new class218();
                                            var15 = this.field4182.field3738 = class282.method1985(this.field4201, (byte) 124);
                                            var16 = this.field4182.field3740 = class282.method1985(this.field4202, (byte) -54);
                                            var17 = this.field4182.field3739 = class282.method1985(this.field4199, (byte) 112);
                                            var18 = this.field4182.field3741 = class282.method1985(this.field4197, (byte) -90);
                                        }
                                        if (var19 == null) {
                                            class218 var44 = var6.field4182 = new class218();
                                            var19 = var44.field3738 = class282.method1985(var11, (byte) 114);
                                            var20 = var44.field3740 = class282.method1985(var12, (byte) 108);
                                            var21 = var44.field3739 = class282.method1985(var13, (byte) 124);
                                            var22 = var44.field3741 = class282.method1985(var14, (byte) -81);
                                        }
                                        short var45 = this.field4201[var35];
                                        short var46 = this.field4202[var35];
                                        short var47 = this.field4199[var35];
                                        short var48 = this.field4197[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field4190[var31];
                                        int var58 = this.field4190[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field4181[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "()V", line = 3025)
    public final void method1731() {
        int var10002;
        if (this.field4172 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4212; var3++) {
                int var4 = this.field4172[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4204 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4204[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4212) {
                int var7 = this.field4172[var6] & 0xFF;
                this.field4204[var7][var1[var7]++] = var6++;
            }
            this.field4172 = null;
        }
        if (this.field4171 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4176; var10++) {
            int var11 = this.field4171[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4209 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4209[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4176) {
            int var14 = this.field4171[var13] & 0xFF;
            this.field4209[var14][var8[var14]++] = var13++;
        }
        this.field4171 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIFFF)[F", line = 3119)
    private static final float[] method1732(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 3193)
    public final void method1733(int arg0) {
        this.field4210 = (short) arg0;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZZZZZ)Ljm;", line = 3200)
    public final class239 method1734(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class239 var12 = new class239();
        var12.field4212 = this.field4212;
        var12.field4200 = this.field4200;
        var12.field4176 = this.field4176;
        if (arg0) {
            var12.field4186 = this.field4186;
            var12.field4214 = this.field4214;
        } else {
            var12.field4186 = class63.method474((byte) -17, this.field4186);
            var12.field4214 = class63.method474((byte) -17, this.field4214);
        }
        if (arg1) {
            var12.field4192 = this.field4192;
        } else {
            var12.field4192 = class63.method474((byte) -17, this.field4192);
        }
        if (arg0 && arg1) {
            var12.field4207 = this.field4207;
            var12.field4170 = this.field4170;
        } else {
            var12.field4207 = new class213();
            var12.field4170 = new class251();
        }
        if (arg2) {
            var12.field4178 = this.field4178;
        } else {
            var12.field4178 = class282.method1985(this.field4178, (byte) 102);
        }
        if (arg3) {
            var12.field4174 = this.field4174;
        } else {
            var12.field4174 = class4.method27(false, this.field4174);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class329.field5607) {
            var12.field4175 = new class213();
        } else {
            var12.field4175 = this.field4175;
        }
        if (arg5) {
            var12.field4201 = this.field4201;
            var12.field4202 = this.field4202;
            var12.field4199 = this.field4199;
            var12.field4197 = this.field4197;
        } else {
            var12.field4201 = class282.method1985(this.field4201, (byte) 115);
            var12.field4202 = class282.method1985(this.field4202, (byte) -25);
            var12.field4199 = class282.method1985(this.field4199, (byte) -13);
            var12.field4197 = class282.method1985(this.field4197, (byte) 116);
        }
        if (!class329.field5607) {
            var12.field4193 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field4193 = this.field4193;
        } else {
            var12.field4193 = new class213();
        }
        if (arg8) {
            var12.field4205 = this.field4205;
            var12.field4173 = this.field4173;
            var12.field4195 = this.field4195;
        } else {
            var12.field4205 = class155.method1038(false, this.field4205);
            var12.field4173 = class155.method1038(false, this.field4173);
            var12.field4195 = new class213();
        }
        if (arg9) {
            var12.field4187 = this.field4187;
            var12.field4183 = this.field4183;
            var12.field4206 = this.field4206;
            var12.field4208 = this.field4208;
        } else {
            var12.field4187 = class282.method1985(this.field4187, (byte) -92);
            var12.field4183 = class282.method1985(this.field4183, (byte) 114);
            var12.field4206 = class282.method1985(this.field4206, (byte) 125);
            var12.field4208 = new class213();
        }
        if (arg10) {
            var12.field4189 = this.field4189;
        } else {
            var12.field4189 = class282.method1985(this.field4189, (byte) -11);
        }
        var12.field4172 = this.field4172;
        var12.field4204 = this.field4204;
        var12.field4171 = this.field4171;
        var12.field4209 = this.field4209;
        var12.field4185 = this.field4185;
        var12.field4181 = this.field4181;
        var12.field4190 = this.field4190;
        var12.field4184 = this.field4184;
        var12.field4210 = this.field4210;
        var12.field4203 = this.field4203;
        var12.field4191 = this.field4191;
        return var12;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(SS)V", line = 3342)
    public final void method1735(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4176; var3++) {
            if (this.field4189[var3] == arg0) {
                this.field4189[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class227.field3904.method1510(255, arg0 & 0xFFFF);
            var5 = class227.field3904.method1514(-73, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class227.field3904.method1510(255, arg1 & 0xFFFF);
            var7 = class227.field3904.method1514(-111, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field4175.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3377)
    private static final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field4217 = var18;
        field4219 = var19;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 3463)
    public final void method292(int arg0) {
        int var2 = class227.field3896[arg0];
        int var3 = class227.field3911[arg0];
        for (int var4 = 0; var4 < this.field4212; var4++) {
            int var5 = this.field4192[var4] * var2 + this.field4186[var4] * var3 >> 16;
            this.field4192[var4] = this.field4192[var4] * var3 - this.field4186[var4] * var2 >> 16;
            this.field4186[var4] = var5;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "()I", line = 3485)
    public final int method295() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4399;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIJ)V", line = 3491)
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field4200 == 0) {
            return;
        }
        GL var10 = class108.field1899;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1713();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "()I", line = 3517)
    public final int method291() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4396;
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "()I", line = 3523)
    public final int method284() {
        if (!this.field4170.field4392) {
            this.method1719();
        }
        return this.field4170.field4394;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lei;IJIIIIFF)S", line = 3530)
    private final short method1737(class197 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field4190[arg1];
        int var12 = this.field4190[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field4181[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field4188[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field4181[var13] = (short) (this.field4200 + 1);
        field4188[var13] = arg2;
        this.field4201[this.field4200] = (short) arg3;
        this.field4202[this.field4200] = (short) arg4;
        this.field4199[this.field4200] = (short) arg5;
        this.field4197[this.field4200] = (short) arg6;
        this.field4205[this.field4200] = arg7;
        this.field4173[this.field4200] = arg8;
        return (short) (this.field4200++);
    }

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "()I", line = 3565)
    public final int method1738() {
        return this.field4210;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lhg;", line = 3568)
    public final class174 method1182(int arg0, int arg1, int arg2) {
        this.field4177 = false;
        if (this.field4182 != null) {
            this.field4201 = this.field4182.field3738;
            this.field4202 = this.field4182.field3740;
            this.field4199 = this.field4182.field3739;
            this.field4197 = this.field4182.field3741;
            this.field4182 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)V", line = 3582)
    public final void method1739(int arg0) {
        if (this.field4201 == null) {
            this.method268(arg0);
            return;
        }
        int var2 = class227.field3896[arg0];
        int var3 = class227.field3911[arg0];
        for (int var4 = 0; var4 < this.field4212; var4++) {
            int var5 = this.field4214[var4] * var2 + this.field4186[var4] * var3 >> 16;
            this.field4214[var4] = this.field4214[var4] * var3 - this.field4186[var4] * var2 >> 16;
            this.field4186[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field4200; var6++) {
            int var7 = this.field4201[var6] * var3 + this.field4199[var6] * var2 >> 16;
            this.field4199[var6] = (short) (this.field4199[var6] * var3 - this.field4201[var6] * var2 >> 16);
            this.field4201[var6] = (short) var7;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "()V", line = 3629)
    public final void method1740() {
        if (this.field4201 == null) {
            this.method281();
            return;
        }
        for (int var1 = 0; var1 < this.field4212; var1++) {
            int var2 = this.field4186[var1];
            this.field4186[var1] = this.field4214[var1];
            this.field4214[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4200; var3++) {
            short var4 = this.field4201[var3];
            this.field4201[var3] = this.field4199[var3];
            this.field4199[var3] = (short) (-var4);
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
        if (this.field4193 != null) {
            this.field4193.field3659 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lll;ILll;I[IZ)V", line = 3671)
    public final void method297(class158 arg0, int arg1, class158 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method280(arg0, arg1, arg5);
            return;
        }
        class43 var7 = arg0.field2707[arg1];
        class43 var8 = arg2.field2707[arg3];
        class113 var9 = var7.field781;
        for (int var10 = 0; var10 < this.field4212; var10++) {
            this.field4186[var10] <<= 0x4;
            this.field4192[var10] <<= 0x4;
            this.field4214[var10] <<= 0x4;
        }
        field4218 = 0;
        field4223 = 0;
        field4227 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field782; var13++) {
            short var14 = var7.field780[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field2039[var14] == 0) {
                if (var7.field778[var13] != -1) {
                    this.method1722(0, var9.field2038[var7.field778[var13]], 0, 0, 0, arg5);
                }
                this.method1722(var9.field2039[var14], var9.field2038[var14], var7.field785[var13], var7.field784[var13], var7.field777[var13], arg5);
            }
        }
        field4218 = 0;
        field4223 = 0;
        field4227 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field782; var17++) {
            short var18 = var8.field780[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field2039[var18] == 0) {
                if (var8.field778[var17] != -1) {
                    this.method1722(0, var9.field2038[var8.field778[var17]], 0, 0, 0, arg5);
                }
                this.method1722(var9.field2039[var18], var9.field2038[var18], var8.field785[var17], var8.field784[var17], var8.field777[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field4212; var19++) {
            this.field4186[var19] >>= 0x4;
            this.field4192[var19] >>= 0x4;
            this.field4214[var19] >>= 0x4;
        }
        this.field4170.field4392 = false;
        this.field4207.field3659 = false;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()Z", line = 3766)
    public final boolean method1183() {
        return this.field4177 && this.field4186 != null && this.field4201 != null;
    }
}
