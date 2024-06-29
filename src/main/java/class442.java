import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class442 {

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    private int field6095 = 0;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    private int field6099 = 1;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    private int field6078 = 1;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    private int field6091 = 0;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Lrh;")
    private class59 field6082 = new class59();

    @OriginalMember(owner = "client!to", name = "C", descriptor = "Z")
    private boolean field6105 = false;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Z")
    private boolean field6104 = true;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "[Lqw;")
    private class379[] field6102 = new class379[2];

    @OriginalMember(owner = "client!to", name = "D", descriptor = "Z")
    private boolean field6106 = true;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
    private boolean field6110 = true;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    private int field6109 = 0;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    private int field6111 = -1;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Z")
    private boolean field6112 = true;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Lpea;")
    private class641 field6090;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Luf;")
    private class120 field6081;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Luf;")
    private class120 field6077;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Luf;")
    private class120 field6087;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "[F")
    public static float[] field6100 = new float[16];

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "Lga;")
    private class335 field6103;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "Lga;")
    private class335 field6108;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "Lqw;")
    private class379 field6107;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Z")
    private boolean field6092;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2533(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class379.field5445 = arg1;
        class321.field4715 = arg4;
        client.field3007 = arg0;
        class209.field2739 = arg2;
        field6079++;
        class329.field4827 = arg3;
        int var7 = 79 % ((71 - arg6) / 54);
        if (arg5 && client.field3007 >= 100) {
            class471.field6379 = class329.field4827 * 512 + 256;
            class132.field1679 = class321.field4715 * 512 + 256;
            class628.field8545 = class394.method2340(class132.field1679, -1, class432.field5993, class471.field6379) - class209.field2739;
        }
        class42.field546 = 2;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static final void method2534(int arg0) {
        field6089++;
        if (arg0 >= -7) {
            field6096 = 115;
        }
        for (class119 var1 = (class119) class283.field3823.method374((byte) 70); var1 != null; var1 = (class119) class283.field3823.method372(-20740)) {
            class665 var2 = var1.field1527;
            if (class430.field5984 > var2.field9429) {
                var1.method175(30604);
                var2.method3690(87);
            } else if (var2.field9455 <= class430.field5984) {
                if (var2.field9435 > 0) {
                    class637 var3 = (class637) class77.field955.method2506(68, (long) (var2.field9435 - 1));
                    if (var3 != null) {
                        class676 var4 = var3.field8702;
                        if (var4.field3929 >= 0 && var4.field3929 < (class588.field8082 * 512) && var4.field3917 >= 0 && var4.field3917 < class12.field113 * 512) {
                            var2.method3691(var4.field3917, class394.method2340(var4.field3929, -1, var2.field3925, var4.field3917) - var2.field9456, class430.field5984, 75, var4.field3929);
                        }
                    }
                }
                if (var2.field9435 < 0) {
                    int var5 = -var2.field9435 - 1;
                    class519 var6;
                    if (class224.field2907 == var5) {
                        var6 = class596.field8164;
                    } else {
                        var6 = class292.field3912[var5];
                    }
                    if (var6 != null && var6.field3929 >= 0 && var6.field3929 < class588.field8082 * 512 && var6.field3917 >= 0 && (class12.field113 * 512) > var6.field3917) {
                        var2.method3691(var6.field3917, class394.method2340(var6.field3929, -1, var2.field3925, var6.field3917) - var2.field9456, class430.field5984, 63, var6.field3929);
                    }
                }
                var2.method3689(256, class323.field4732);
                class621.method3396(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
    private final boolean method2535(byte arg0) {
        if (this.field6112) {
            if (this.field6108 != null) {
                this.field6108.method2143((byte) -123);
                this.field6108 = null;
            }
            if (this.field6107 != null) {
                this.field6107.method1588((byte) -122);
                this.field6107 = null;
            }
            if (this.field6087 != null) {
                this.field6108 = new class335(this.field6090, 6402, this.field6099, this.field6078, this.field6090.field8929);
            }
            if (this.field6105) {
                this.field6107 = new class379(this.field6090, 34037, 6402, this.field6099, this.field6078);
            } else if (this.field6108 == null) {
                this.field6108 = new class335(this.field6090, 6402, this.field6099, this.field6078);
            }
            this.field6110 = true;
            this.field6112 = false;
            this.field6104 = true;
        }
        field6097++;
        if (this.field6106) {
            if (this.field6103 != null) {
                this.field6103.method2143((byte) 69);
                this.field6103 = null;
            }
            if (this.field6102[0] != null) {
                this.field6102[0].method1588((byte) -122);
                this.field6102[0] = null;
            }
            if (this.field6102[1] != null) {
                this.field6102[1].method1588((byte) -122);
                this.field6102[1] = null;
            }
            if (this.field6087 != null) {
                this.field6103 = new class335(this.field6090, this.field6111, this.field6099, this.field6078, this.field6090.field8929);
            }
            this.field6102[0] = new class379(this.field6090, 34037, this.field6111, this.field6099, this.field6078);
            this.field6102[1] = this.field6109 <= 1 ? null : new class379(this.field6090, 34037, this.field6111, this.field6099, this.field6078);
            this.field6110 = true;
            this.field6104 = true;
            this.field6106 = false;
        }
        if (this.field6110) {
            if (this.field6087 == null) {
                this.field6090.method3541(this.field6081, (byte) -13);
                this.field6081.method738(arg0 ^ 0xFFFFFFDF, 0);
                this.field6081.method738(arg0 - 192, 1);
                this.field6081.method738(arg0 - 166, 8);
                this.field6081.method728(this.field6102[0], (byte) 114, 0);
                if (this.field6109 > 1) {
                    this.field6081.method728(this.field6102[1], (byte) -100, 1);
                }
                if (this.field6105) {
                    this.field6081.method728(this.field6107, (byte) -128, 8);
                } else {
                    this.field6081.method731(-69, this.field6108, 8);
                }
                this.field6090.method3522(this.field6081, arg0 ^ 0xFFFFFFF4);
            } else {
                this.field6090.method3541(this.field6081, (byte) -13);
                this.field6081.method738(arg0 ^ 0xFFFFFFDE, 0);
                this.field6081.method738(-99, 1);
                this.field6081.method738(-128, 8);
                this.field6081.method728(this.field6102[0], (byte) -106, 0);
                if (this.field6109 > 1) {
                    this.field6081.method728(this.field6102[1], (byte) -118, 1);
                }
                if (this.field6105) {
                    this.field6081.method728(this.field6107, (byte) -71, 8);
                }
                this.field6090.method3522(this.field6081, -121);
                this.field6090.method3541(this.field6087, (byte) -13);
                this.field6087.method738(-124, 0);
                this.field6087.method738(-96, 8);
                this.field6087.method731(-113, this.field6103, 0);
                this.field6087.method731(-101, this.field6108, 8);
                this.field6090.method3522(this.field6087, -14);
            }
            this.field6104 = true;
            this.field6110 = false;
        }
        if (this.field6104) {
            this.field6090.method3541(this.field6077, (byte) -13);
            this.field6104 = !this.field6077.method737(69);
            this.field6090.method3522(this.field6077, -95);
        }
        if (arg0 != 65) {
            this.method2541(110);
        }
        return !this.field6104;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)I")
    public static final int method2536(byte arg0, int arg1) {
        field6101++;
        if (arg0 != 107) {
            field6096 = 92;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    private final void method2537(int arg0) {
        field6085++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = -105 / ((arg0 - 57) / 38);
        for (class370 var6 = (class370) this.field6082.method374((byte) 57); var6 != null; var6 = (class370) this.field6082.method372(-20740)) {
            int var10 = var6.method566(1);
            var4 += var6.method2270(false);
            if (var3 < var10) {
                var3 = var10;
            }
            var2 |= var6.method2271(false);
        }
        int var7;
        if (var3 == 2) {
            var7 = 34836;
        } else if (var3 == 1) {
            var7 = 34842;
        } else {
            var7 = 6408;
        }
        if (this.field6111 != var7) {
            this.field6111 = var7;
            this.field6106 = true;
        }
        int var8 = this.field6109 <= 2 ? this.field6109 : 2;
        int var9 = var4 <= 2 ? var4 : 2;
        if (this.field6105 != var2) {
            this.field6105 = var2;
            this.field6112 = true;
        }
        if (var8 != var9) {
            this.field6110 = this.field6106 = true;
        }
        this.field6109 = var4;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
    public static final void method2538(byte arg0) {
        field6088++;
        if (class548.field7497) {
            return;
        }
        class548.field7497 = true;
        if (class72.field935.field6535) {
            class620.field8432 = ((int) class620.field8432 + 191 & 0xFFFFFF80);
        } else {
            class690.field9748 += (24.0F - class690.field9748) / 2.0F;
        }
        class308.field4137 = true;
        if (arg0 < 18) {
            field6080 = 88;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 106) {
            this.field6087 = null;
        }
        field6093++;
        if (this.field6077 == null || this.field6082.method379(-1)) {
            return false;
        }
        if (this.field6099 != arg3 || this.field6078 != arg2) {
            this.field6099 = arg3;
            this.field6078 = arg2;
            for (class28 var6 = this.field6082.method374((byte) 126); var6 != this.field6082.field825; var6 = var6.field276) {
                ((class370) var6).method570(this.field6078, (byte) 121, this.field6099);
            }
            this.field6106 = true;
            this.field6112 = true;
            this.field6110 = true;
        }
        if (!this.method2535((byte) 65)) {
            return false;
        }
        this.field6095 = arg4;
        this.field6092 = true;
        this.field6091 = arg0;
        this.field6090.method3541(this.field6077, (byte) -13);
        this.field6077.method734(0, (byte) 86);
        this.field6090.method3523(-this.field6095, -65, this.field6091 + this.field6078 - this.field6090.field8920);
        return true;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static void method2540(int arg0) {
        field6100 = null;
        if (arg0 != 0) {
            field6080 = -58;
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z")
    public final boolean method2541(int arg0) {
        if (arg0 != -18359) {
            this.field6090 = null;
        }
        field6086++;
        return this.field6077 != null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljo;B)Z")
    public final boolean method2542(class370 arg0, byte arg1) {
        if (arg1 != 40) {
            return true;
        }
        field6084++;
        if (this.field6077 != null) {
            if (arg0.method578(false) || arg0.method568(67)) {
                this.field6082.method378(arg0, 31316);
                this.method2537(105);
                if (this.method2535((byte) 65)) {
                    if (this.field6099 != -1 && this.field6078 != -1) {
                        arg0.method570(this.field6078, (byte) 104, this.field6099);
                    }
                    arg0.field5317 = true;
                    return true;
                }
            }
            this.method2544(arg0, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
    public final void method2543(int arg0) {
        field6083++;
        if (!this.field6092) {
            return;
        }
        if (this.field6087 != null) {
            int var2 = 16384;
            this.field6090.method3529(this.field6087, (byte) -128);
            this.field6090.method3539(this.field6081, false);
            this.field6087.method735(0, arg0 + 36053);
            this.field6081.method734(0, (byte) 35);
            if (this.field6105) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6099, this.field6078, 0, 0, this.field6099, this.field6078, var2, 9728);
            this.field6090.method3492(this.field6087, (byte) -99);
            this.field6090.method3560(this.field6081, -110);
        }
        this.field6090.method3564(14528);
        this.field6090.method3547(arg0, true);
        this.field6090.method3524(1, 14);
        this.field6090.method1984();
        int var3 = 0;
        int var4 = 1;
        class370 var6;
        for (class370 var5 = (class370) this.field6082.method374((byte) 83); var5 != null; var5 = var6) {
            var6 = (class370) this.field6082.method372(arg0 - 20740);
            int var7 = var5.method2270(false);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method575(this.field6102[var3], this.field6107, 1, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field6090.method3522(this.field6081, arg0 - 96);
                    this.field6090.method3523(0, -23, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6078);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6095, this.field6091);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6095, this.field6091 + this.field6078);
                    OpenGL.glTexCoord2f((float) this.field6099, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6095 + this.field6099, this.field6091 + this.field6078);
                    OpenGL.glTexCoord2f((float) this.field6099, (float) this.field6078);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6099 + this.field6095, this.field6091);
                    OpenGL.glEnd();
                } else {
                    this.field6081.method734(-(-var4), (byte) 64);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6078);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6078);
                    OpenGL.glTexCoord2f((float) this.field6099, (float) this.field6078);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6099, this.field6078);
                    OpenGL.glTexCoord2f((float) this.field6099, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6099, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method576(var8, arg0 ^ 0x1);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field6092 = false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljo;Z)V")
    public final void method2544(class370 arg0, boolean arg1) {
        field6094++;
        arg0.field5317 = arg1;
        arg0.method574((byte) -122);
        arg0.method175(30604);
        this.method2537(121);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(JJ)J")
    public static long method2545(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)V")
    public final void method2546(int arg0) {
        this.field6077 = this.field6087 = this.field6081 = null;
        this.field6107 = null;
        this.field6103 = null;
        this.field6108 = null;
        field6098++;
        this.field6102 = null;
        if (arg0 != 33985) {
            this.method2542(null, (byte) 48);
        }
        if (!this.field6082.method379(-1)) {
            for (class28 var2 = this.field6082.method374((byte) 78); var2 != this.field6082.field825; var2 = var2.field276) {
                ((class370) var2).method574((byte) 121);
            }
        }
        this.field6099 = this.field6078 = 1;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lpea;)V")
    public class442(class641 arg0) {
        this.field6090 = arg0;
        if (this.field6090.field9013 && this.field6090.field8993) {
            this.field6077 = this.field6081 = new class120(this.field6090);
            if (this.field6090.field8929 > 1 && this.field6090.field9033 && this.field6090.field9077) {
                this.field6077 = this.field6087 = new class120(this.field6090);
                return;
            }
        }
    }
}
