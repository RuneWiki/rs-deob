import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class155 {

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    private int field2642 = 0;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    private int field2648 = 0;

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
    private int field2651 = 1;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
    private int field2652 = 1;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Lor;")
    private class594 field2644 = new class594();

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "Z")
    private boolean field2657 = true;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
    private int field2658 = 0;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "Z")
    private boolean field2663 = false;

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "I")
    private int field2665 = -1;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "Z")
    private boolean field2656 = true;

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "Z")
    private boolean field2659 = true;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "[Lwh;")
    private class133[] field2664 = new class133[2];

    @OriginalMember(owner = "client!gw", name = "J", descriptor = "Z")
    private boolean field2666 = true;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Ler;")
    private class92 field2634;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "Lnb;")
    private class276 field2650;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "Lnb;")
    private class276 field2649;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "Lnb;")
    private class276 field2655;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "[F")
    public static float[] field2635 = new float[4];

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2639 = 1;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "[I")
    public static int[] field2654 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "Llaa;")
    private class106 field2660;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "Llaa;")
    private class106 field2662;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "Lwh;")
    private class133 field2661;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lmea;")
    public static class395 field2633;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "Z")
    private boolean field2640;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field2633 = null;
        field2654 = null;
        field2635 = null;
        int var1 = -62 % ((-arg0 - 38) / 63);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    private final void method1279(byte arg0) {
        field2646++;
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != -68) {
            return;
        }
        int var4 = 0;
        for (class557 var5 = (class557) this.field2644.method3465((byte) 121); var5 != null; var5 = (class557) this.field2644.method3469(arg0 + 68)) {
            int var9 = var5.method1428(false);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method3326((byte) 113);
            var2 |= var5.method3328(-1);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field2665 != var6) {
            this.field2665 = var6;
            this.field2656 = true;
        }
        int var7 = this.field2658 <= 2 ? this.field2658 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        this.field2658 = var4;
        if (var7 != var8) {
            this.field2657 = this.field2656 = true;
        }
        if (var2 != this.field2663) {
            this.field2666 = true;
            this.field2663 = var2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z")
    private final boolean method1280(byte arg0) {
        if (this.field2666) {
            if (this.field2662 != null) {
                this.field2662.method1004(21);
                this.field2662 = null;
            }
            if (this.field2661 != null) {
                this.field2661.method2513(-4);
                this.field2661 = null;
            }
            if (this.field2655 != null) {
                this.field2662 = new class106(this.field2634, 6402, this.field2652, this.field2651, this.field2634.field1316);
            }
            if (this.field2663) {
                this.field2661 = new class133(this.field2634, 34037, 6402, this.field2652, this.field2651);
            } else if (this.field2662 == null) {
                this.field2662 = new class106(this.field2634, 6402, this.field2652, this.field2651);
            }
            this.field2659 = true;
            this.field2657 = true;
            this.field2666 = false;
        }
        field2637++;
        if (this.field2656) {
            if (this.field2660 != null) {
                this.field2660.method1004(80);
                this.field2660 = null;
            }
            if (this.field2664[0] != null) {
                this.field2664[0].method2513(-4);
                this.field2664[0] = null;
            }
            if (this.field2664[1] != null) {
                this.field2664[1].method2513(-4);
                this.field2664[1] = null;
            }
            if (this.field2655 != null) {
                this.field2660 = new class106(this.field2634, this.field2665, this.field2652, this.field2651, this.field2634.field1316);
            }
            this.field2664[0] = new class133(this.field2634, 34037, this.field2665, this.field2652, this.field2651);
            this.field2664[1] = this.field2658 > 1 ? new class133(this.field2634, 34037, this.field2665, this.field2652, this.field2651) : null;
            this.field2659 = true;
            this.field2657 = true;
            this.field2656 = false;
        }
        if (this.field2657) {
            if (this.field2655 == null) {
                this.field2634.method881(false, this.field2650);
                this.field2650.method1965(126, 0);
                this.field2650.method1965(114, 1);
                this.field2650.method1965(95, 8);
                this.field2650.method1968(0, this.field2664[0], (byte) -51);
                if (this.field2658 > 1) {
                    this.field2650.method1968(1, this.field2664[1], (byte) 7);
                }
                if (this.field2663) {
                    this.field2650.method1968(8, this.field2661, (byte) -82);
                } else {
                    this.field2650.method1964((byte) 64, 8, this.field2662);
                }
                this.field2634.method828(this.field2650, 0);
            } else {
                this.field2634.method881(false, this.field2650);
                this.field2650.method1965(72, 0);
                this.field2650.method1965(75, 1);
                this.field2650.method1965(120, 8);
                this.field2650.method1968(0, this.field2664[0], (byte) 126);
                if (this.field2658 > 1) {
                    this.field2650.method1968(1, this.field2664[1], (byte) 127);
                }
                if (this.field2663) {
                    this.field2650.method1968(8, this.field2661, (byte) -61);
                }
                this.field2634.method828(this.field2650, 0);
                this.field2634.method881(false, this.field2655);
                this.field2655.method1965(71, 0);
                this.field2655.method1965(111, 8);
                this.field2655.method1964((byte) 47, 0, this.field2660);
                this.field2655.method1964((byte) 51, 8, this.field2662);
                this.field2634.method828(this.field2655, 0);
            }
            this.field2657 = false;
            this.field2659 = true;
        }
        if (arg0 > -113) {
            this.field2648 = -19;
        }
        if (this.field2659) {
            this.field2634.method881(false, this.field2649);
            this.field2659 = !this.field2649.method1970((byte) -66);
            this.field2634.method828(this.field2649, 0);
        }
        return !this.field2659;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
    public final void method1281(byte arg0) {
        field2638++;
        if (!this.field2640) {
            return;
        }
        if (this.field2655 != null) {
            int var2 = 16384;
            this.field2634.method879(this.field2655, 0);
            this.field2634.method876(this.field2650, (byte) -58);
            this.field2655.method1972((byte) 123, 0);
            this.field2650.method1967(0, -5);
            if (this.field2663) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field2652, this.field2651, 0, 0, this.field2652, this.field2651, var2, 9728);
            this.field2634.method824(false, this.field2655);
            this.field2634.method854(119, this.field2650);
        }
        this.field2634.method822(true);
        this.field2634.method889(arg0 + 15, 0);
        this.field2634.method816(1, -123);
        this.field2634.method281();
        if (arg0 != 84) {
            this.method1280((byte) 99);
        }
        int var3 = 0;
        int var4 = 1;
        class557 var6;
        for (class557 var5 = (class557) this.field2644.method3465((byte) -21); var5 != null; var5 = var6) {
            var6 = (class557) this.field2644.method3469(arg0 - 84);
            int var7 = var5.method3326((byte) -1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1437(var8, this.field2664[var3], this.field2661, arg0 ^ 0x55);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field2634.method828(this.field2650, 0);
                    this.field2634.method835(0, false, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2651);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2642, this.field2648);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2642, this.field2651 + this.field2648);
                    OpenGL.glTexCoord2f((float) this.field2652, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2652 + this.field2642, this.field2651 + this.field2648);
                    OpenGL.glTexCoord2f((float) this.field2652, (float) this.field2651);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2652 + this.field2642, this.field2648);
                    OpenGL.glEnd();
                } else {
                    this.field2650.method1967(var4, arg0 ^ 0xFFFFFFAF);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2651);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field2651);
                    OpenGL.glTexCoord2f((float) this.field2652, (float) this.field2651);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2652, this.field2651);
                    OpenGL.glTexCoord2f((float) this.field2652, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2652, 0);
                    OpenGL.glEnd();
                }
                var5.method1431(126, var8);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field2640 = false;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)V")
    public final void method1282(byte arg0) {
        this.field2662 = null;
        this.field2661 = null;
        this.field2649 = this.field2655 = this.field2650 = null;
        field2653++;
        this.field2664 = null;
        if (arg0 != 95) {
            this.method1281((byte) -73);
        }
        this.field2660 = null;
        if (!this.field2644.method3464(0)) {
            for (class66 var2 = this.field2644.method3465((byte) -56); var2 != this.field2644.field8428; var2 = var2.field848) {
                ((class557) var2).method1432(true);
            }
        }
        this.field2652 = this.field2651 = 1;
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)I")
    public static final int method1283(byte arg0) {
        if (arg0 == -52) {
            field2636++;
            return class181.method1479(false, 128);
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lgl;I)Z")
    public final boolean method1284(class557 arg0, int arg1) {
        field2643++;
        if (this.field2649 != null) {
            if (arg0.method1429((byte) 114) || arg0.method1430(-106)) {
                this.field2644.method3463((byte) -87, arg0);
                this.method1279((byte) -68);
                if (this.method1280((byte) -121)) {
                    if (this.field2652 != -1 && this.field2651 != -1) {
                        arg0.method1434(this.field2651, this.field2652, 256);
                    }
                    arg0.field8052 = true;
                    return true;
                }
            }
            this.method1289(arg0, 1);
        }
        if (arg1 != 2) {
            this.field2663 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
    public final boolean method1285(int arg0) {
        field2631++;
        if (arg0 >= -17) {
            method1288(null, 109, 35);
        }
        return this.field2649 != null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2641++;
        int var6 = 119 / ((arg3 - 11) / 46);
        if (this.field2649 == null || this.field2644.method3464(0)) {
            return false;
        }
        if (this.field2652 != arg0 || this.field2651 != arg4) {
            this.field2651 = arg4;
            this.field2652 = arg0;
            for (class66 var7 = this.field2644.method3465((byte) -117); var7 != this.field2644.field8428; var7 = var7.field848) {
                ((class557) var7).method1434(this.field2651, this.field2652, 256);
            }
            this.field2666 = true;
            this.field2656 = true;
            this.field2657 = true;
        }
        if (!this.method1280((byte) -118)) {
            return false;
        }
        this.field2642 = arg1;
        this.field2648 = arg2;
        this.field2640 = true;
        this.field2634.method881(false, this.field2649);
        this.field2649.method1967(0, -5);
        this.field2634.method835(this.field2651 + this.field2648 - this.field2634.field1242, false, -this.field2642);
        return true;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1287(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "([Lpn;II)V")
    public static final void method1288(class692[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class692 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9699;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9699 < (var7 & 0x1) + var6) {
                class692 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1288(arg0, arg1, var4 - 1);
        method1288(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(Lgl;I)V")
    public final void method1289(class557 arg0, int arg1) {
        arg0.field8052 = false;
        field2645++;
        arg0.method1432(true);
        if (arg1 != 1) {
            this.field2644 = null;
        }
        arg0.method707((byte) -48);
        this.method1279((byte) -68);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lpca;IIB)V")
    public static final void method1290(class665 arg0, int arg1, int arg2, byte arg3) {
        class107.field1747 = arg2;
        class138.field2333 = arg1;
        field2632++;
        class10.field178 = arg0;
        if (arg3 < 11) {
            method1278(85);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ler;)V")
    public class155(class92 arg0) {
        this.field2634 = arg0;
        if (this.field2634.field1472 && this.field2634.field1428) {
            this.field2649 = this.field2650 = new class276(this.field2634);
            if (this.field2634.field1316 > 1 && this.field2634.field1404 && this.field2634.field1406) {
                this.field2649 = this.field2655 = new class276(this.field2634);
                return;
            }
        }
    }
}
