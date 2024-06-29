import java.math.BigInteger;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class250 extends class216 {

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    private int field4152 = -1;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Z")
    public boolean field4154 = false;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    private int field4165 = 0;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Lpb;")
    private class286 field4149;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    private boolean field4162;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Z")
    private boolean field4158;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Z")
    private boolean field4173;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "Z")
    private boolean field4153;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lbd;")
    public static class162 field4156 = class17.method142(0, "logo");

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lbd;")
    public static class162 field4161 = class17.method142(0, "b12_full");

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4170 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "Lbd;")
    public static class162 field4175 = class17.method142(0, ":");

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[Lai;")
    public static class258[] field4174 = new class258[27];

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "[I")
    public static int[] field4180 = new int[4096];

    @OriginalMember(owner = "client!re", name = "N", descriptor = "F")
    private float field4157;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "Lda;")
    public static class143 field4178;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field4179;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "[I")
    public static int[] field4150;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "[I")
    private int[] field4167;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "[I")
    public static int[] field4176;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLgj;Lda;Z)Z", line = 8)
    public final boolean method1747(byte arg0, class294 arg1, class143 arg2, boolean arg3) {
        field4177++;
        int var5 = 127 / ((arg0 - 18) / 49);
        if (!this.field4149.method1977((byte) 123, arg2, arg1)) {
            return false;
        }
        GL var6 = class117.field2143;
        int var7 = class180.method1371(128);
        int var8 = arg3 ? 64 : 128;
        if ((var7 & 0x1) == 0) {
            if (this.field4152 == -1) {
                int[] var9 = new int[1];
                var6.glGenTextures(1, var9, 0);
                this.field4163 = class41.field659;
                this.field4152 = var9[0];
                class117.method939(this.field4152);
                ByteBuffer var10 = ByteBuffer.wrap(this.field4149.method1969(var8, false, var8, arg2, this.field4158, 0.7D, arg1));
                if (this.field4164 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var8, var8, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class41.field658 += var10.limit() * 4 / 3 - this.field4165;
                    this.field4165 = var10.limit() * 4 / 3;
                } else if (this.field4164 == 1) {
                    int var12 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var12++, 6408, var8, var8, 0, 6408, 5121, var10);
                        var8 >>= 0x1;
                        if (var8 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class41.field658 += var10.limit() * 4 / 3 - this.field4165;
                            this.field4165 = var10.limit() * 4 / 3;
                            break;
                        }
                        var10 = ByteBuffer.wrap(this.field4149.method1969(var8, false, var8, arg2, this.field4158, 0.7D, arg1));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var8, var8, 0, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class41.field658 += var10.limit() - this.field4165;
                    this.field4165 = var10.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field4173 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field4153 ? 10497 : 33071);
            } else {
                class117.method939(this.field4152);
            }
        }
        if ((var7 & 0x2) == 0) {
            class117.method961(this.field4151);
        }
        if ((var7 & 0x4) == 0) {
            class117.method935(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field4169 == 0 && this.field4166 == 0) {
                class117.method959();
            } else {
                float var13 = (float) (class117.field2127 * this.field4169) / (float) var8;
                float var14 = (float) (class117.field2127 * this.field4166) / (float) var8;
                class117.method967(var14, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V", line = 120)
    protected final void finalize() throws Throwable {
        if (this.field4152 != -1) {
            class41.method301(this.field4152, this.field4165, this.field4163);
            this.field4165 = 0;
            this.field4152 = -1;
        }
        super.finalize();
        field4172++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lgj;ZZLda;)[I", line = 135)
    public final int[] method1748(class294 arg0, boolean arg1, boolean arg2, class143 arg3) {
        field4160++;
        if (!this.field4149.method1977((byte) 95, arg3, arg0)) {
            return null;
        }
        int var5 = arg1 ? 64 : 128;
        if (arg2) {
            this.method1747((byte) 27, (class294) null, (class143) null, true);
        }
        return this.field4149.method1973(arg3, false, this.field4158, -1976238812, arg0, var5, var5, 1.0D);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lb;)V", line = 491)
    public class250(class94 arg0) {
        this.field4149 = new class286(arg0);
        this.field4162 = arg0.method756(915905888) == 1;
        this.field4158 = arg0.method756(915905888) == 1;
        this.field4173 = arg0.method756(915905888) == 1;
        this.field4153 = arg0.method756(915905888) == 1;
        int var2 = arg0.method756(915905888) & 0x3;
        this.field4166 = arg0.method719((byte) -42);
        this.field4169 = arg0.method719((byte) -42);
        int var3 = arg0.method756(915905888);
        arg0.method756(915905888);
        if (var2 == 1) {
            this.field4151 = 2;
        } else if (var2 == 2) {
            this.field4151 = 3;
        } else if (var2 == 3) {
            this.field4151 = 4;
        } else {
            this.field4151 = 0;
        }
        this.field4164 = (var3 & 0xFA) >> 4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FLda;ZLgj;I)[I", line = 166)
    public final int[] method1749(float arg0, class143 arg1, boolean arg2, class294 arg3, int arg4) {
        field4168++;
        if (arg4 != 18778) {
            return (int[]) null;
        }
        if (this.field4167 == null || this.field4157 != arg0) {
            if (!this.field4149.method1977((byte) 104, arg1, arg3)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field4167 = this.field4149.method1973(arg1, true, this.field4158, -1976238812, arg3, var6, var6, (double) arg0);
            this.field4157 = arg0;
            if (this.field4162) {
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
                        int var20 = this.field4167[var13];
                        var9[var19] += class92.method695(255, var20 >> 16);
                        var8[var19] += class92.method695(var20, 65363) >> 8;
                        var7[var19] += class92.method695(var20, 255);
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
                    for (int var27 = 2; var27 >= 0; var27--) {
                        var23--;
                        var25 += var7[var23];
                        var24 += var8[var23];
                        var26 += var9[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    int var28 = 1;
                    for (int var29 = var15; var29 >= 0; var29--) {
                        int var30 = var26 / 9;
                        var28--;
                        int var31 = var25 / 9;
                        int var32 = var24 / 9;
                        var21--;
                        var10[var21] = class289.method2005(var31, class289.method2005(var32 << 8, var30 << 16));
                        var23--;
                        var25 += var7[var23] - var7[var28];
                        var26 += var9[var23] - var9[var28];
                        var24 += var8[var23] - var8[var28];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var28 == 0) {
                            var28 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field4167[var14];
                        var13--;
                        int var35 = this.field4167[var13];
                        var9[var33] += -class92.method695(var34 >> 16, 255) + (class92.method695(16751002, var35) >> 16);
                        var8[var33] += class92.method695(var35 >> 8, 255) - (class92.method695(var34, 65520) >> 8);
                        var7[var33] += class92.method695(255, var35) - class92.method695(255, var34);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field4167 = var10;
            }
        }
        return this.field4167;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V", line = 354)
    public static final void method1750(byte arg0, int arg1) {
        class96.field1753.method1538(arg1, (byte) -64);
        int var2 = -14 / ((arg0 + 35) / 44);
        field4155++;
        class23.field386.method1538(arg1, (byte) -12);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V", line = 378)
    public final void method1751(int arg0, byte arg1) {
        if (arg1 >= -82) {
            this.field4162 = false;
        }
        field4148++;
        if (this.field4167 == null || this.field4169 == 0 && this.field4166 == 0) {
            return;
        }
        if (class136.field2434 == null || class136.field2434.length < this.field4167.length) {
            class136.field2434 = new int[this.field4167.length];
        }
        int var3 = this.field4167.length == 4096 ? 64 : 128;
        int var4 = this.field4167.length;
        int var5 = this.field4166 * arg0;
        int var6 = var3 - 1;
        int var7 = this.field4169 * arg0 * var3;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var8 & var9 + var7;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var9 + var11;
                int var13 = (var11 + var5 & var6) + var10;
                class136.field2434[var12] = this.field4167[var13];
            }
        }
        int[] var14 = this.field4167;
        this.field4167 = class136.field2434;
        class136.field2434 = var14;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lgj;Lda;I)Z", line = 440)
    public final boolean method1752(class294 arg0, class143 arg1, int arg2) {
        field4159++;
        return arg2 == 26329 ? this.field4149.method1977((byte) -85, arg1, arg0) : false;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 471)
    public static void method1753(int arg0) {
        field4179 = null;
        int var1 = -2 / ((-arg0 - 69) / 36);
        field4161 = null;
        field4174 = null;
        field4176 = null;
        field4156 = null;
        field4175 = null;
        field4150 = null;
        field4178 = null;
        field4170 = null;
        field4180 = null;
    }
}
