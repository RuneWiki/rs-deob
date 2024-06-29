import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class136 extends class196 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field2075 = -1;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Z")
    public boolean field2087 = false;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Ltf;")
    private class123 field2064;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Z")
    private boolean field2091;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Z")
    private boolean field2073;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Z")
    private boolean field2079;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Z")
    private boolean field2090;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "[Llj;")
    public static class265[] field2069 = new class265[6];

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field2081 = 1;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2085 = "glow1:";

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "F")
    private float field2083;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
    private int[] field2070;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V", line = 7)
    public static final void method991(int arg0, int arg1, int arg2) {
        field2077++;
        if (arg2 != 27011) {
            field2071 = 114;
        }
        if (class72.method463(12, arg0)) {
            class206.method1415(31, arg1, class278.field4231[arg0]);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 24)
    public static void method992(byte arg0) {
        field2069 = null;
        field2085 = null;
        if (arg0 <= 90) {
            field2085 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() throws Throwable {
        if (this.field2075 != -1) {
            class174.method1213(this.field2075, this.field2065, this.field2068);
            this.field2075 = -1;
            this.field2065 = 0;
        }
        field2086++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lse;Llm;ZFZ)[I", line = 52)
    public final int[] method993(class105 arg0, class210 arg1, boolean arg2, float arg3, boolean arg4) {
        if (!arg4) {
            return (int[]) null;
        }
        field2076++;
        if (this.field2070 == null || this.field2083 != arg3) {
            if (!this.field2064.method889(arg0, arg1, 0)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field2070 = this.field2064.method886(arg1, var6, true, this.field2073, arg0, var6, (double) arg3, 0);
            this.field2083 = arg3;
            if (this.field2091) {
                int[] var7 = new int[var6 * var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var16; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field2070[var12];
                        var8[var19] += class124.method893(var20 >> 16, 255);
                        var9[var19] += class124.method893(var20 >> 8, 255);
                        var10[var19] += class124.method893(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var24--;
                        var25 += var9[var24];
                        var26 += var10[var24];
                        var27 += var8[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var29 = var16; var29 >= 0; var29--) {
                        var24--;
                        int var30 = var27 / 9;
                        int var31 = var26 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var7[var21] = class140.method1009(class140.method1009(var32 << 8, var30 << 16), var31);
                        var23--;
                        var25 += var9[var24] - var9[var23];
                        var27 += var8[var24] - var8[var23];
                        var26 += var10[var24] - var10[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var33 = var16; var33 >= 0; var33--) {
                        var12--;
                        int var34 = this.field2070[var12];
                        var13--;
                        int var35 = this.field2070[var13];
                        var8[var33] += (class124.method893(var34, 16772792) >> 16) - class124.method893(var35 >> 16, 255);
                        var9[var33] += -class124.method893(var35 >> 8, 255) + (class124.method893(var34, 65466) >> 8);
                        var10[var33] += -class124.method893(255, var35) + class124.method893(255, var34);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field2070 = var7;
            }
        }
        return this.field2070;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Llm;ZLse;I)[I", line = 216)
    public final int[] method994(class210 arg0, boolean arg1, class105 arg2, int arg3) {
        field2078++;
        if (!this.field2064.method889(arg2, arg0, 0)) {
            return null;
        }
        int var5 = arg1 ? 64 : 128;
        if (arg3 != -10415) {
            method995(true, -14);
        }
        return this.field2064.method886(arg0, var5, false, this.field2073, arg2, var5, 1.0D, 0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V", line = 239)
    public static final void method995(boolean arg0, int arg1) {
        class203.method1390(class251.field3747, field2071, arg0, class123.field1926, (byte) -6);
        if (arg1 != 31456) {
            method995(true, -35);
        }
        field2080++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLlm;Lse;)Z", line = 261)
    public final boolean method996(byte arg0, class210 arg1, class105 arg2) {
        int var4 = -115 / ((90 - arg0) / 33);
        field2084++;
        return this.field2064.method889(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lre;)V", line = 477)
    public class136(class263 arg0) {
        this.field2064 = new class123(arg0);
        this.field2091 = arg0.method1787(false) == 1;
        this.field2073 = arg0.method1787(false) == 1;
        this.field2079 = arg0.method1787(false) == 1;
        this.field2090 = arg0.method1787(false) == 1;
        int var2 = arg0.method1787(false) & 0x3;
        this.field2089 = arg0.method1810((byte) 123);
        this.field2082 = arg0.method1810((byte) 116);
        int var3 = arg0.method1787(false);
        arg0.method1787(false);
        if (var2 == 1) {
            this.field2088 = 2;
        } else if (var2 == 2) {
            this.field2088 = 3;
        } else if (var2 == 3) {
            this.field2088 = 4;
        } else {
            this.field2088 = 0;
        }
        this.field2063 = (var3 & 0xF6) >> 4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZLse;Llm;)Z", line = 288)
    public final boolean method997(int arg0, boolean arg1, class105 arg2, class210 arg3) {
        field2072++;
        if (!this.field2064.method889(arg2, arg3, 0)) {
            return false;
        }
        int var5 = arg1 ? 64 : 128;
        GL var6 = class117.field1801;
        if (arg0 <= 103) {
            this.method994((class210) null, true, (class105) null, 123);
        }
        int var7 = class178.method1232((byte) -41);
        if ((var7 & 0x1) == 0) {
            if (this.field2075 == -1) {
                int[] var8 = new int[1];
                var6.glGenTextures(1, var8, 0);
                this.field2075 = var8[0];
                this.field2068 = class174.field2589;
                class117.method814(this.field2075);
                ByteBuffer var9 = ByteBuffer.wrap(this.field2064.method888(4, var5, 0.7D, arg2, var5, this.field2073, arg3));
                if (this.field2063 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var5, var5, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class174.field2592 += var9.limit() * 4 / 3 - this.field2065;
                    this.field2065 = var9.limit() * 4 / 3;
                } else if (this.field2063 == 1) {
                    int var10 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var10++, 6408, var5, var5, 0, 6408, 5121, var9);
                        var5 >>= 0x1;
                        if (var5 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class174.field2592 += var9.limit() * 4 / 3 - this.field2065;
                            this.field2065 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field2064.method888(4, var5, 0.7D, arg2, var5, this.field2073, arg3));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var5, var5, 0, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class174.field2592 += var9.limit() - this.field2065;
                    this.field2065 = var9.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field2079 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field2090 ? 10497 : 33071);
            } else {
                class117.method814(this.field2075);
            }
        }
        if ((var7 & 0x2) == 0) {
            class117.method809(this.field2088);
        }
        if ((var7 & 0x4) == 0) {
            class117.method823(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field2082 == 0 && this.field2089 == 0) {
                class117.method821();
            } else {
                float var12 = (float) (class117.field1818 * this.field2089) / (float) var5;
                float var13 = (float) (class117.field1818 * this.field2082) / (float) var5;
                class117.method836(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)V", line = 412)
    public final void method998(boolean arg0, int arg1) {
        if (!arg0) {
            method991(-103, 17, -119);
        }
        field2074++;
        if (this.field2070 == null || this.field2082 == 0 && this.field2089 == 0) {
            return;
        }
        if (class257.field3895 == null || class257.field3895.length < this.field2070.length) {
            class257.field3895 = new int[this.field2070.length];
        }
        int var3 = this.field2070.length == 4096 ? 64 : 128;
        int var4 = this.field2089 * arg1;
        int var5 = this.field2070.length;
        int var6 = var3 - 1;
        int var7 = arg1 * var3 * this.field2082;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var3) {
            int var10 = var7 + var9 & var8;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var10 + (var6 & var4 + var11);
                int var13 = var9 + var11;
                class257.field3895[var13] = this.field2070[var12];
            }
        }
        int[] var14 = this.field2070;
        this.field2070 = class257.field3895;
        class257.field3895 = var14;
    }
}
