import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class133 extends class508 {

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "Leh;")
    private class180 field1811;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
    private int[] field1793;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "F")
    public float field1794;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "Lgk;")
    private class463 field1797;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "Lgi;")
    private class485 field1807;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "Lad;")
    public static class11 field1808 = new class11(64);

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "Lpi;")
    public static class340 field1813 = new class340(92, -1);

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "Ltp;")
    private class139 field1809;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field1810;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field1806;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "[[S")
    public static short[][] field1814;

    static {
        new class169("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZII)I", line = 7)
    public static final int method934(int arg0, boolean arg1, int arg2, int arg3) {
        field1795++;
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        if (!arg1) {
            method939(87);
        }
        return (arg2 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBI)V", line = 40)
    public final void method935(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -117) {
            this.method937(34, false, null);
        }
        this.field1793[this.field1811.field3197 * arg0 + arg3] = class31.method213(this.field1793[this.field1811.field3197 * arg0 + arg3], 0x1 << arg1);
        field1798++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V", line = 55)
    public final void method936(int arg0, int arg1) {
        if (arg1 < 105) {
            this.field1799 = 41;
        }
        this.field1806.method2850();
        field1801++;
        class500 var3 = this.field1797.method2753(4, false, this.field1810, true, arg0 * 4);
        this.field1809 = new class139(this.field1797, var3, 5121, 4, 0);
        this.field1806 = null;
        this.field1810 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ[I)V", line = 71)
    public final void method937(int arg0, boolean arg1, int[] arg2) {
        field1804++;
        int var4 = 0;
        class88 var5 = class164.field2129;
        var5.field1176 = 0;
        if (this.field1797.field6759) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field1811.field2321[var13];
                int var15 = this.field1793[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method609(var14[var17++] & 0xFFFF, -94);
                            var4++;
                            var5.method609(var14[var17++] & 0xFFFF, -41);
                            var4++;
                            var5.method609(var14[var17++] & 0xFFFF, -103);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field1793[var7];
                short[] var9 = this.field1811.field2321[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method564(var9[var11++] & 0xFFFF, 595249544);
                            var4++;
                            var5.method564(var9[var11++] & 0xFFFF, 595249544);
                            var5.method564(var9[var11++] & 0xFFFF, 595249544);
                            var4++;
                        }
                    }
                }
            }
        }
        if (arg1 || var4 <= 0) {
            return;
        }
        this.field1807.method2062(var5.field1223, (byte) 102, var5.field1176, 5123);
        this.field1797.method2788(this.field1811.field2355, this.field1811.field2352, this.field1809, (byte) -35, this.field1811.field2350);
        this.field1797.method2792(0, (this.field1811.field2317 & 0x8) != 0, this.field1812, (this.field1811.field2317 & 0x7) != 0);
        if (this.field1797.field6773) {
            this.field1797.method848(Integer.MAX_VALUE, this.field1802, this.field1799, this.field1805);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field1794, 1.0F / this.field1794, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field1797.method2788(this.field1811.field2355, this.field1811.field2352, this.field1809, (byte) -35, this.field1811.field2350);
        this.field1797.method2769(0, this.field1807, 4, 0, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V", line = 195)
    public final void method938(byte arg0, int arg1) {
        this.field1810 = this.field1797.field6694.method2845(arg1 * 4);
        field1796++;
        if (arg0 < 73) {
            this.field1794 = -0.3195341F;
        }
        this.field1806 = new NativeStream(this.field1810);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 207)
    public static void method939(int arg0) {
        if (arg0 != -128) {
            field1808 = null;
        }
        field1814 = null;
        field1813 = null;
        field1808 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V", line = 223)
    public final void method940(int arg0, byte arg1) {
        this.field1806.method2853(arg0 * 4 + 3);
        field1803++;
        if (arg1 <= 53) {
            this.field1810 = null;
        }
        this.field1806.method2849(-1);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Leh;IIIII)V", line = 234)
    public class133(class180 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1811 = arg0;
        this.field1793 = new int[this.field1811.field3197 * this.field1811.field3194];
        this.field1794 = arg2;
        this.field1797 = this.field1811.field2314;
        this.field1805 = arg5;
        this.field1799 = arg4;
        this.field1812 = arg1;
        this.field1802 = arg3;
        this.field1807 = new class485(this.field1797, 5123, null, 1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FIIII)V", line = 250)
    public final void method941(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1860377584) {
            this.field1807 = null;
        }
        if (this.field1812 != -1) {
            class499 var6 = this.field1797.field1765.method460(-26282, this.field1812);
            int var7 = var6.field7334 & 0xFF;
            if (var7 != 0 && var6.field7352 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00) * var7 + ((arg1 & 0xFF00) * var10) & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7346 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + ((var12 & 0x6C00FF00) << 8) + (var13 & 0xFF00);
            }
        }
        field1800++;
        if (arg0 != 1.0F) {
            int var15 = (arg1 & 0xFF4361) >> 16;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var19 << 8 | var17 << 16;
        }
        this.field1806.method2853(arg2 * 4);
        this.field1806.method2849((byte) (arg1 >> 16));
        this.field1806.method2849((byte) (arg1 >> 8));
        this.field1806.method2849((byte) arg1);
    }
}
