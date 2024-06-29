import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class327 extends class539 {

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Lot;")
    private class540 field4830;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "[I")
    private int[] field4826;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "F")
    public float field4825;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Len;")
    private class289 field4818;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "I")
    public int field4838;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Lho;")
    private class135 field4833;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4829 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[I")
    public static int[] field4836 = new int[13];

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "Lkca;")
    private class74 field4823;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4827;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4824;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI[I)V", line = 5)
    public final void method1975(byte arg0, int arg1, int[] arg2) {
        field4831++;
        int var4 = -105 % ((-arg0 - 7) / 34);
        int var5 = 0;
        class57 var6 = this.field4818.field4289;
        var6.field1301 = 0;
        if (this.field4818.field4362) {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg2[var13];
                short[] var15 = this.field4830.field7347[var14];
                int var16 = this.field4826[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var18 < var15.length) {
                        if ((0x1 << var17++ & var16) == 0) {
                            var18 += 3;
                        } else {
                            var5++;
                            var6.method731(-2045573048, var15[var18++] & 0xFFFF);
                            var5++;
                            var6.method731(-2045573048, var15[var18++] & 0xFFFF);
                            var5++;
                            var6.method731(-2045573048, var15[var18++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg2[var7];
                short[] var9 = this.field4830.field7347[var8];
                int var10 = this.field4826[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var9.length > var12) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var5++;
                            var6.method720(4, var9[var12++] & 0xFFFF);
                            var6.method720(4, var9[var12++] & 0xFFFF);
                            var5++;
                            var5++;
                            var6.method720(4, var9[var12++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var5 <= 0) {
            return;
        }
        this.field4833.method968(var6.field1301, var6.field1316, -1842, 5123);
        this.field4818.method1744(this.field4830.field7364, (byte) -100, this.field4830.field7366, this.field4823, this.field4830.field7361);
        this.field4818.method1748(this.field4838, (this.field4830.field7341 & 0x7) != 0, true, (this.field4830.field7341 & 0x8) != 0);
        if (this.field4818.field4309) {
            this.field4818.method410(Integer.MAX_VALUE, this.field4835, this.field4820, this.field4821);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4825, 1.0F / this.field4825, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4818.method1744(this.field4830.field7364, (byte) -109, this.field4830.field7366, this.field4823, this.field4830.field7361);
        this.field4818.method1822(var5, this.field4833, 0, (byte) 63, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIZZ)V", line = 130)
    public static final void method1976(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (!arg4) {
            field4829 = null;
        }
        field4828++;
        if (class474.method2690(arg1, -256197904)) {
            class218.method1409(0, arg0, arg3, -1, class676.field9545[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 144)
    public static void method1977(byte arg0) {
        field4829 = null;
        field4836 = null;
        if (arg0 != -68) {
            method1977((byte) 117);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)V", line = 162)
    public final void method1978(int arg0, int arg1, int arg2, int arg3) {
        field4837++;
        this.field4826[this.field4830.field1918 * arg0 + arg3] = class266.method1624(this.field4826[this.field4830.field1918 * arg0 + arg3], arg1 << arg2);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V", line = 174)
    public final void method1979(int arg0, byte arg1) {
        this.field4827.method3417(arg0 * 4 + 3);
        if (arg1 >= -46) {
            this.method1975((byte) -27, -123, null);
        }
        field4819++;
        this.field4827.method3419(-1);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V", line = 187)
    public final void method1980(int arg0, int arg1) {
        field4817++;
        this.field4824 = this.field4818.field4222.method3413(arg0 * arg1, true);
        this.field4827 = new Stream(this.field4824);
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V", line = 202)
    public final void method1981(int arg0, int arg1) {
        field4822++;
        this.field4827.method3426();
        if (arg1 <= 40) {
            this.method1979(-5, (byte) 26);
        }
        class682 var3 = this.field4818.method1794(arg0 * 4, false, 4, 125, this.field4824);
        this.field4823 = new class74(var3, 5121, 4, 0);
        this.field4827 = null;
        this.field4824 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IFIII)V", line = 218)
    public final void method1982(int arg0, float arg1, int arg2, int arg3, int arg4) {
        field4834++;
        if (this.field4838 != -1) {
            class269 var6 = this.field4818.field9050.method588(-26679, this.field4838);
            int var7 = var6.field3820 & 0xFF;
            if (var7 != 0 && var6.field3803 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3810 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var12 << 8 & 0xFF003F) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var18 << 16 | var19 << 8 | var20;
        }
        this.field4827.method3417(arg0 * 4);
        this.field4827.method3419((byte) (arg2 >> 16));
        this.field4827.method3419((byte) (arg2 >> 8));
        if (arg3 > -120) {
            this.method1982(-64, -1.2572869F, 61, -29, -45);
        }
        this.field4827.method3419((byte) arg2);
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lot;IIIII)V", line = 334)
    public class327(class540 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4830 = arg0;
        this.field4826 = new int[this.field4830.field1918 * this.field4830.field1916];
        this.field4825 = arg2;
        this.field4821 = arg5;
        this.field4818 = this.field4830.field7339;
        this.field4838 = arg1;
        this.field4820 = arg4;
        this.field4835 = arg3;
        this.field4833 = new class135(this.field4818, 5123, null, 1);
    }
}
