import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class22 extends class324 {

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Lpf;")
    private class506 field227;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "F")
    public float field220;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[I")
    private int[] field222;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lad;")
    private class362 field223;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljp;")
    private class300 field212;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lig;")
    public static class206 field235 = new class206(74, 5);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lgr;")
    private class371 field225;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field228;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field219;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    public final void method134(int arg0, int arg1) {
        this.field228.method3411();
        field216++;
        class632 var3 = this.field223.method2298(true, arg1 * 4, this.field219, false, 4);
        this.field225 = new class371(var3, 5121, 4, 0);
        this.field228 = null;
        if (arg0 == -2097723632) {
            this.field219 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method135(byte arg0) {
        field235 = null;
        int var1 = 107 / ((arg0 - 82) / 36);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
    public final void method136(byte arg0, int arg1) {
        this.field228.method3421(arg1 * 4 + 3);
        field217++;
        this.field228.method3412(arg0);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)V")
    public static final void method137(byte arg0, int arg1) {
        field224++;
        if (arg0 != 93) {
            method137((byte) -45, 76);
        }
        for (class324 var2 = class547.field7835.method523(arg0 - 209); var2 != null; var2 = class547.field7835.method530(12714)) {
            if ((long) arg1 == (var2.field4676 >> 48 & 0xFFFFL)) {
                var2.method2108(true);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(BI)V")
    public final void method138(byte arg0, int arg1) {
        if (arg0 < 26) {
            field235 = null;
        }
        this.field219 = this.field223.field5353.method3408(arg1 * 4, true);
        field215++;
        this.field228 = new Stream(this.field219);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLoa;)V")
    public static final void method139(byte arg0, class605 arg1) {
        if (class600.field8764) {
            class126.method772(arg1, 81);
        } else {
            class341.method2192(arg1, -38);
        }
        field229++;
        if (arg0 != -32) {
            method139((byte) 105, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method140(int arg0, String arg1) {
        field213++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 < 83) {
            return -55;
        }
        while (var4 < var2) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        this.field222[this.field227.field1656 * arg3 + arg1] = class283.method1834(this.field222[this.field227.field1656 * arg3 + arg1], 0x1 << arg0);
        if (arg2 > -12) {
            method135((byte) 45);
        }
        field218++;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lpf;IIIII)V")
    public class22(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field227 = arg0;
        this.field232 = arg5;
        this.field220 = arg2;
        this.field230 = arg3;
        this.field226 = arg1;
        this.field222 = new int[this.field227.field1660 * this.field227.field1656];
        this.field234 = arg4;
        this.field223 = this.field227.field7335;
        this.field212 = new class300(this.field223, 5123, null, 1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIFI)V")
    public final void method142(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field226 != -1) {
            class614 var6 = this.field223.field8852.method438(73, this.field226);
            int var7 = var6.field8926 & 0xFF;
            if (var7 != 0 && var6.field8935 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field8939 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var14 >> 8) + (var12 << 8 & 0xFF00E6) + (var13 & 0xFF00);
            }
        }
        field233++;
        this.field228.method3421(arg2 * 4);
        if (arg4 != 10165) {
            this.field226 = -55;
        }
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFFC1F1) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var18 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var19 << 8 | var17 << 16 | var20;
        }
        this.field228.method3412((byte) (arg0 >> 16));
        this.field228.method3412((byte) (arg0 >> 8));
        this.field228.method3412((byte) arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([III)V")
    public final void method143(int[] arg0, int arg1, int arg2) {
        field214++;
        if (arg2 < 8) {
            method137((byte) 27, -84);
        }
        int var4 = 0;
        class257 var5 = this.field223.field5392;
        var5.field2610 = 0;
        if (this.field223.field5468) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field222[var7];
                short[] var9 = this.field227.field7336[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1229(var9[var11++] & 0xFFFF, 30364);
                            var4++;
                            var4++;
                            var5.method1229(var9[var11++] & 0xFFFF, 30364);
                            var4++;
                            var5.method1229(var9[var11++] & 0xFFFF, 30364);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field227.field7336[var13];
                int var15 = this.field222[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1185(var14[var17++] & 0xFFFF, 1616065864);
                            var5.method1185(var14[var17++] & 0xFFFF, 1616065864);
                            var4++;
                            var4++;
                            var5.method1185(var14[var17++] & 0xFFFF, 1616065864);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field212.method38(var5.field2622, var5.field2610, 5123, true);
        this.field223.method2255(this.field227.field7349, (byte) 4, this.field227.field7347, this.field225, this.field227.field7345);
        this.field223.method2252((byte) 53, (this.field227.field7316 & 0x7) != 0, (this.field227.field7316 & 0x8) != 0, this.field226);
        if (this.field223.field5385) {
            this.field223.method319(Integer.MAX_VALUE, this.field230, this.field234, this.field232);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field220, 1.0F / this.field220, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field223.method2255(this.field227.field7349, (byte) 4, this.field227.field7347, this.field225, this.field227.field7345);
        this.field223.method2263(0, var4, 4, (byte) 65, this.field212);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }
}
