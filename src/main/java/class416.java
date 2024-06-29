import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class416 extends class577 {

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Lre;")
    private class626 field5693;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public int field5712;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public int field5705;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "F")
    public float field5709;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "[I")
    private int[] field5696;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "Lqfa;")
    private class106 field5711;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "Lmga;")
    private class738 field5708;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "[C")
    public static char[] field5694 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "Z")
    public static boolean field5701 = true;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Lei;")
    private class189 field5702;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "Lqja;")
    public static class326 field5706;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "Liaa;")
    public static class519 field5698;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5699;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5692;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)V")
    public final void method2529(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 26025) {
            this.field5708 = null;
        }
        this.field5696[this.field5693.field4289 * arg3 + arg2] = class746.method4158(this.field5696[this.field5693.field4289 * arg3 + arg2], 0x1 << arg1);
        field5707++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIFII)V")
    public final void method2530(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (arg3 != 256) {
            return;
        }
        field5710++;
        if (this.field5705 != -1) {
            class467 var6 = this.field5711.field774.method1208((byte) 47, this.field5705);
            int var7 = var6.field6582 & 0xFF;
            if (var7 != 0 && var6.field6567 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field6579 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 & 0xA600FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg2 != 1.0F) {
            int var15 = (arg4 & 0xFFDBB6) >> 16;
            int var16 = (arg4 & 0xFF83) >> 8;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var18 << 16;
        }
        this.field5699.method3948(arg1 * 4);
        this.field5699.method3955((byte) (arg4 >> 16));
        this.field5699.method3955((byte) (arg4 >> 8));
        this.field5699.method3955((byte) arg4);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method2531(int arg0) {
        field5706 = null;
        field5698 = null;
        field5694 = null;
        if (arg0 < 7) {
            method2531(-71);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V")
    public final void method2532(int arg0, int arg1) {
        this.field5699.method3948(arg0 * 4 + 3);
        field5695++;
        if (arg1 > 49) {
            this.field5699.method3955(-1);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
    public final void method2533(byte arg0, int arg1) {
        this.field5692 = this.field5711.field1435.method3939(arg1 * 4, true);
        field5713++;
        int var3 = 95 % ((26 - arg0) / 32);
        this.field5699 = new Stream(this.field5692);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V")
    public static final void method2534(int arg0, boolean arg1) {
        if (arg0 != 93) {
            method2531(29);
        }
        field5715++;
        if (class590.field8323 == null) {
            class403.method2479(true);
        }
        if (arg1) {
            class590.field8323.method3139(false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
    public final void method2535(boolean arg0, int arg1) {
        if (!arg0) {
            method2531(-74);
        }
        field5714++;
        this.field5699.method3945();
        class61 var3 = this.field5711.method778(this.field5692, arg1 * 4, 4, -128, false);
        this.field5702 = new class189(var3, 5121, 4, 0);
        this.field5692 = null;
        this.field5699 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[II)V")
    public final void method2536(int arg0, int[] arg1, int arg2) {
        if (arg0 != 5890) {
            this.method2532(80, 39);
        }
        field5703++;
        int var4 = 0;
        class538 var5 = this.field5711.field1485;
        var5.field7042 = 0;
        if (this.field5711.field1514) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field5693.field8792[var13];
                int var15 = this.field5696[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2957(var14[var17++] & 0xFFFF, 1267307848);
                            var4++;
                            var5.method2957(var14[var17++] & 0xFFFF, 1267307848);
                            var4++;
                            var5.method2957(var14[var17++] & 0xFFFF, arg0 + 1267301958);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field5693.field8792[var7];
                int var9 = this.field5696[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2965(var8[var11++] & 0xFFFF, (byte) 58);
                            var5.method2965(var8[var11++] & 0xFFFF, (byte) 58);
                            var4++;
                            var4++;
                            var5.method2965(var8[var11++] & 0xFFFF, (byte) 58);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field5708.method1240(5123, (byte) 76, var5.field7050, var5.field7042);
        this.field5711.method754(this.field5702, this.field5693.field8800, arg0 - 5794, this.field5693.field8804, this.field5693.field8802);
        this.field5711.method810((this.field5693.field8788 & 0x7) != 0, (this.field5693.field8788 & 0x8) != 0, 128, this.field5705);
        if (this.field5711.field1512) {
            this.field5711.method526(Integer.MAX_VALUE, this.field5700, this.field5712, this.field5697);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field5709, 1.0F / this.field5709, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field5711.method754(this.field5702, this.field5693.field8800, 102, this.field5693.field8804, this.field5693.field8802);
        this.field5711.method781(5889, 0, this.field5708, 4, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lre;IIIII)V")
    public class416(class626 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5693 = arg0;
        this.field5712 = arg4;
        this.field5697 = arg5;
        this.field5705 = arg1;
        this.field5709 = arg2;
        this.field5696 = new int[this.field5693.field4290 * this.field5693.field4289];
        this.field5700 = arg3;
        this.field5711 = this.field5693.field8766;
        this.field5708 = new class738(this.field5711, 5123, null, 1);
    }
}
