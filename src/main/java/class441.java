import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class441 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field6425 = 1;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field6430 = 0;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    private int field6436 = 1;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    private int field6441 = 0;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lfea;")
    private class47 field6439 = new class47();

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    private int field6450 = -1;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Z")
    private boolean field6449 = false;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Z")
    private boolean field6453 = true;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Z")
    private boolean field6451 = true;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[Lhp;")
    private class355[] field6455 = new class355[2];

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Z")
    private boolean field6456 = true;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    private int field6457 = 0;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Z")
    private boolean field6454 = true;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Ljj;")
    private class66 field6431;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Lfs;")
    private class353 field6443;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lfs;")
    private class353 field6426;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lfs;")
    private class353 field6433;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
    public static int[] field6444 = new int[500];

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[[I")
    public static int[][] field6442 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lhp;")
    private class355 field6448;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lcm;")
    private class528 field6447;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Lcm;")
    private class528 field6452;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Z")
    private boolean field6432;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method2604(boolean arg0) {
        field6438++;
        this.field6426 = this.field6433 = this.field6443 = null;
        this.field6448 = null;
        this.field6455 = null;
        this.field6447 = null;
        this.field6452 = null;
        if (arg0) {
            this.field6430 = -54;
        }
        if (!this.field6439.method424(2000)) {
            for (class108 var2 = this.field6439.method427(true); var2 != this.field6439.field659; var2 = var2.field1802) {
                ((class548) var2).method49(-122);
            }
        }
        this.field6425 = this.field6436 = 1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILcg;)Z")
    public final boolean method2605(int arg0, class548 arg1) {
        if (arg0 != -1) {
            this.method2604(true);
        }
        field6435++;
        if (this.field6426 != null) {
            if (arg1.method50(false) || arg1.method53(arg0 + 35633)) {
                this.field6439.method414(arg1, (byte) 29);
                this.method2610(arg0 ^ 0x79);
                if (this.method2613(-20405)) {
                    if (this.field6425 != -1 && this.field6436 != -1) {
                        arg1.method54(this.field6436, (byte) -88, this.field6425);
                    }
                    arg1.field7614 = true;
                    return true;
                }
            }
            this.method2606(arg1, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lcg;Z)V")
    public final void method2606(class548 arg0, boolean arg1) {
        arg0.field7614 = false;
        field6434++;
        arg0.method49(-127);
        arg0.method911(-52);
        if (!arg1) {
            this.method2605(81, null);
        }
        this.method2610(-123);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public final void method2607(boolean arg0) {
        field6429++;
        if (!this.field6432) {
            return;
        }
        if (this.field6433 != null) {
            this.field6431.method659(true, this.field6433);
            int var2 = 16384;
            this.field6431.method655(this.field6443, 3);
            this.field6433.method2140(0, false);
            this.field6443.method2137(-25469, 0);
            if (this.field6449) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6425, this.field6436, 0, 0, this.field6425, this.field6436, var2, 9728);
            this.field6431.method535(this.field6433, (byte) 108);
            this.field6431.method552(103, this.field6443);
        }
        this.field6431.method597(!arg0);
        this.field6431.method598(0, (byte) -121);
        this.field6431.method634(118, 1);
        this.field6431.method657();
        int var3 = 0;
        int var4 = 1;
        class548 var6;
        for (class548 var5 = (class548) this.field6439.method427(arg0); var5 != null; var5 = var6) {
            var6 = (class548) this.field6439.method420(false);
            int var7 = var5.method3073(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method51(var8, this.field6448, true, this.field6455[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field6431.method564((byte) 124, this.field6443);
                    this.field6431.method608(0, (byte) 99, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6436);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6430, this.field6441);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6430, this.field6441 + this.field6436);
                    OpenGL.glTexCoord2f((float) this.field6425, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6430 + this.field6425, this.field6441 + this.field6436);
                    OpenGL.glTexCoord2f((float) this.field6425, (float) this.field6436);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6430 + this.field6425, this.field6441);
                    OpenGL.glEnd();
                } else {
                    this.field6443.method2137(-25469, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6436);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6436);
                    OpenGL.glTexCoord2f((float) this.field6425, (float) this.field6436);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6425, this.field6436);
                    OpenGL.glTexCoord2f((float) this.field6425, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6425, 0);
                    OpenGL.glEnd();
                }
                var5.method56(var8, -128);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field6432 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method2608(byte arg0) {
        field6444 = null;
        field6442 = null;
        if (arg0 <= 46) {
            method2611(-30, 66, -97);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
    public final boolean method2609(byte arg0) {
        if (arg0 < 86) {
            return false;
        } else {
            field6446++;
            return this.field6426 != null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    private final void method2610(int arg0) {
        field6445++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class548 var5 = (class548) this.field6439.method427(true); var5 != null; var5 = (class548) this.field6439.method420(false)) {
            int var10 = var5.method57(false);
            if (var3 < var10) {
                var3 = var10;
            }
            var4 += var5.method3073(1);
            var2 |= var5.method3071((byte) 71);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6450 != var6) {
            this.field6450 = var6;
            this.field6451 = true;
        }
        int var7 = this.field6457 <= 2 ? this.field6457 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        int var9 = -19 % ((arg0 + 54) / 61);
        this.field6457 = var4;
        if (var2 != this.field6449) {
            this.field6449 = var2;
            this.field6454 = true;
        }
        if (var7 != var8) {
            this.field6453 = this.field6451 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
    public static final boolean method2611(int arg0, int arg1, int arg2) {
        field6437++;
        int var3 = 110 % ((arg0 - 28) / 40);
        return (class219.method1469((byte) 67, arg1, arg2) | (arg1 & 0x2000) != 0 | class589.method3370(arg1, (byte) 98, arg2)) & class224.method1495(55, arg2, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 53 % ((arg4 + 37) / 58);
        field6427++;
        if (this.field6426 == null || this.field6439.method424(2000)) {
            return false;
        }
        if (this.field6425 != arg3 || this.field6436 != arg2) {
            this.field6425 = arg3;
            this.field6436 = arg2;
            for (class108 var7 = this.field6439.method427(true); var7 != this.field6439.field659; var7 = var7.field1802) {
                ((class548) var7).method54(this.field6436, (byte) -88, this.field6425);
            }
            this.field6453 = true;
            this.field6451 = true;
            this.field6454 = true;
        }
        if (!this.method2613(-20405)) {
            return false;
        }
        this.field6441 = arg1;
        this.field6432 = true;
        this.field6430 = arg0;
        this.field6431.method539(this.field6426, true);
        this.field6426.method2137(-25469, 0);
        this.field6431.method608(-this.field6430, (byte) 111, this.field6436 - (this.field6426.method2154(false) + this.field6441));
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z")
    private final boolean method2613(int arg0) {
        if (this.field6454) {
            if (this.field6452 != null) {
                this.field6452.method2972(91);
                this.field6452 = null;
            }
            if (this.field6448 != null) {
                this.field6448.method1482((byte) -77);
                this.field6448 = null;
            }
            if (this.field6433 != null) {
                this.field6452 = new class528(this.field6431, 6402, this.field6425, this.field6436, this.field6431.field1123);
            }
            if (this.field6449) {
                this.field6448 = new class355(this.field6431, 34037, 6402, this.field6425, this.field6436);
            } else if (this.field6452 == null) {
                this.field6452 = new class528(this.field6431, 6402, this.field6425, this.field6436);
            }
            this.field6454 = false;
            this.field6453 = true;
            this.field6456 = true;
        }
        field6424++;
        if (this.field6451) {
            if (this.field6447 != null) {
                this.field6447.method2972(118);
                this.field6447 = null;
            }
            if (this.field6455[0] != null) {
                this.field6455[0].method1482((byte) -77);
                this.field6455[0] = null;
            }
            if (this.field6455[1] != null) {
                this.field6455[1].method1482((byte) -77);
                this.field6455[1] = null;
            }
            if (this.field6433 != null) {
                this.field6447 = new class528(this.field6431, this.field6450, this.field6425, this.field6436, this.field6431.field1123);
            }
            this.field6455[0] = new class355(this.field6431, 34037, this.field6450, this.field6425, this.field6436);
            this.field6455[1] = this.field6457 <= 1 ? null : new class355(this.field6431, 34037, this.field6450, this.field6425, this.field6436);
            this.field6453 = true;
            this.field6456 = true;
            this.field6451 = false;
        }
        if (arg0 != -20405) {
            return false;
        }
        if (this.field6453) {
            if (this.field6433 == null) {
                this.field6431.method539(this.field6443, true);
                this.field6443.method2148(1, 0);
                this.field6443.method2148(1, 1);
                this.field6443.method2148(1, 8);
                this.field6443.method2144((byte) 50, this.field6455[0], 0);
                if (this.field6457 > 1) {
                    this.field6443.method2144((byte) 50, this.field6455[1], 1);
                }
                if (this.field6449) {
                    this.field6443.method2144((byte) 50, this.field6448, 8);
                } else {
                    this.field6443.method2145(8, (byte) 120, this.field6452);
                }
                this.field6431.method564((byte) 14, this.field6443);
            } else {
                this.field6431.method539(this.field6443, true);
                this.field6443.method2148(1, 0);
                this.field6443.method2148(1, 1);
                this.field6443.method2148(1, 8);
                this.field6443.method2144((byte) 50, this.field6455[0], 0);
                if (this.field6457 > 1) {
                    this.field6443.method2144((byte) 50, this.field6455[1], 1);
                }
                if (this.field6449) {
                    this.field6443.method2144((byte) 50, this.field6448, 8);
                }
                this.field6431.method564((byte) 11, this.field6443);
                this.field6431.method539(this.field6433, true);
                this.field6433.method2148(arg0 + 20406, 0);
                this.field6433.method2148(1, 8);
                this.field6433.method2145(0, (byte) 86, this.field6447);
                this.field6433.method2145(8, (byte) 117, this.field6452);
                this.field6431.method564((byte) 14, this.field6433);
            }
            this.field6456 = true;
            this.field6453 = false;
        }
        if (this.field6456) {
            this.field6431.method539(this.field6426, true);
            this.field6456 = !this.field6426.method2141(-36054);
            this.field6431.method564((byte) 87, this.field6426);
        }
        return !this.field6456;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljj;)V")
    public class441(class66 arg0) {
        this.field6431 = arg0;
        if (this.field6431.field1201 && this.field6431.field1158) {
            this.field6426 = this.field6443 = new class353(this.field6431);
            if (this.field6431.field1123 > 1 && this.field6431.field1275 && this.field6431.field1215) {
                this.field6426 = this.field6433 = new class353(this.field6431);
                return;
            }
        }
    }
}
