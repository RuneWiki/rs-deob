import jaggl.OpenGL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class682 {

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field9333 = 0;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private int field9340 = 0;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    private int field9337 = 1;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    private int field9341 = 1;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lqia;")
    private class547 field9335 = new class547();

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Z")
    private boolean field9346 = false;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    private int field9349 = 0;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
    private boolean field9352 = true;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    private int field9350 = -1;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[Lhga;")
    private class185[] field9354 = new class185[2];

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
    private boolean field9353 = true;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Z")
    private boolean field9347 = true;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Z")
    private boolean field9351 = true;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Leq;")
    private class357 field9323;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Ltt;")
    private class504 field9326;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Ltt;")
    private class504 field9328;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Ltt;")
    private class504 field9329;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9334 = new Hashtable();

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lus;")
    public static class328 field9342 = new class328(54, 7);

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
    public static boolean field9344 = false;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lfq;")
    public static class141 field9343 = new class141(15, 0, 1, 0);

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "[I")
    public static int[] field9356 = new int[8];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Lhga;")
    private class185 field9345;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "Lgk;")
    private class579 field9348;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Lgk;")
    private class579 field9355;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
    private boolean field9331;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method3697(int arg0) {
        field9343 = null;
        field9342 = null;
        field9356 = null;
        field9334 = null;
        if (arg0 != 11207) {
            field9342 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method3698(int arg0) {
        this.field9328 = this.field9329 = this.field9326 = null;
        this.field9354 = null;
        this.field9348 = null;
        field9327++;
        this.field9345 = null;
        this.field9355 = null;
        if (!this.field9335.method3112(-4)) {
            for (class627 var2 = this.field9335.method3111(arg0 + 126); var2 != this.field9335.field7718; var2 = var2.field8744) {
                ((class448) var2).method1857(-83);
            }
        }
        this.field9337 = this.field9341 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    private final void method3699(int arg0) {
        field9324++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class448 var5 = (class448) this.field9335.method3111(106); var5 != null; var5 = (class448) this.field9335.method3116(-45)) {
            int var9 = var5.method1855(7);
            var4 += var5.method2641((byte) -56);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method2642(true);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field9350 != var6) {
            this.field9350 = var6;
            this.field9352 = true;
        }
        if (arg0 >= -89) {
            field9342 = null;
        }
        int var7 = this.field9349 > 2 ? 2 : this.field9349;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field9351 = this.field9352 = true;
        }
        if (var2 != this.field9346) {
            this.field9346 = var2;
            this.field9347 = true;
        }
        this.field9349 = var4;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static final void method3700(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class488.field6948[var1] = false;
        }
        if (arg0 != -696) {
            method3700(-56);
        }
        field9332++;
        class408.field5759 = class505.field7134;
        class730.field10224 = class688.field9781;
        class654.field9000 = 0;
        class188.field2472 = 0;
        class522.field7390 = -1;
        class335.field4311 = -1;
        class147.field1783 = -1;
        class276.field3497 = 5;
        class170.field2244 = class407.field5744;
        class501.field7065 = class266.field3368;
        class737.field10329 = -1;
        class235.field3035 = class411.field5801;
        class597.field8276 = class524.field7412;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmt;B)V")
    public final void method3701(class448 arg0, byte arg1) {
        if (arg1 <= 13) {
            method3700(-59);
        }
        field9325++;
        arg0.field6298 = false;
        arg0.method1857(-42);
        arg0.method3426((byte) -17);
        this.method3699(-92);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmt;I)Z")
    public final boolean method3702(class448 arg0, int arg1) {
        field9330++;
        if (arg1 != -1) {
            this.method3703(123, -101, -45, -8, 49);
        }
        if (this.field9328 != null) {
            if (arg0.method1861(arg1 ^ 0xFFFFFFC0) || arg0.method1860(1)) {
                this.field9335.method3110(arg0, 1);
                this.method3699(-124);
                if (this.method3705((byte) 15)) {
                    if (this.field9337 != -1 && this.field9341 != -1) {
                        arg0.method1856((byte) 67, this.field9337, this.field9341);
                    }
                    arg0.field6298 = true;
                    return true;
                }
            }
            this.method3701(arg0, (byte) 106);
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)Z")
    public final boolean method3703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9339++;
        if (this.field9328 == null || this.field9335.method3112(-4)) {
            return false;
        }
        if (arg3 != 0) {
            this.method3703(-49, 101, 37, 64, 104);
        }
        if (this.field9337 != arg1 || this.field9341 != arg2) {
            this.field9341 = arg2;
            this.field9337 = arg1;
            for (class627 var6 = this.field9335.method3111(55); var6 != this.field9335.field7718; var6 = var6.field8744) {
                ((class448) var6).method1856((byte) 67, this.field9337, this.field9341);
            }
            this.field9351 = true;
            this.field9347 = true;
            this.field9352 = true;
        }
        if (!this.method3705((byte) 15)) {
            return false;
        }
        this.field9331 = true;
        this.field9333 = arg4;
        this.field9340 = arg0;
        this.field9323.method2158(arg3 ^ 0xFFFF8BAC, this.field9328);
        this.field9328.method2901(0, (byte) 33);
        this.field9323.method2178(-this.field9340, this.field9341 + this.field9333 - this.field9323.field4882, (byte) -123);
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method3704(int arg0) {
        field9336++;
        if (!this.field9331) {
            return;
        }
        if (this.field9329 != null) {
            int var2 = 16384;
            this.field9323.method2192(103, this.field9329);
            this.field9323.method2191(true, this.field9326);
            this.field9329.method2910(-92, 0);
            this.field9326.method2901(0, (byte) 93);
            if (this.field9346) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field9337, this.field9341, 0, 0, this.field9337, this.field9341, var2, 9728);
            this.field9323.method2173(this.field9329, 20444);
            this.field9323.method2197(-4915, this.field9326);
        }
        this.field9323.method2116(0);
        this.field9323.method2195(-71, 0);
        this.field9323.method2153(-20, 1);
        this.field9323.method59();
        int var3 = 0;
        int var4 = 1;
        if (arg0 != 24426) {
            method3697(29);
        }
        class448 var6;
        for (class448 var5 = (class448) this.field9335.method3111(126); var5 != null; var5 = var6) {
            var6 = (class448) this.field9335.method3116(arg0 ^ 0xFFFFA0CD);
            int var7 = var5.method2641((byte) -44);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1864(this.field9354[var3], var8, this.field9345, (byte) -41);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field9323.method2142(-110, this.field9326);
                    this.field9323.method2178(0, 0, (byte) -126);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9341);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9340, this.field9333);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9340, this.field9333 + this.field9341);
                    OpenGL.glTexCoord2f((float) this.field9337, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9340 + this.field9337, this.field9341 + this.field9333);
                    OpenGL.glTexCoord2f((float) this.field9337, (float) this.field9341);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9340 + this.field9337, this.field9333);
                    OpenGL.glEnd();
                } else {
                    this.field9326.method2901(var4, (byte) 70);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9341);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field9341);
                    OpenGL.glTexCoord2f((float) this.field9337, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9337, this.field9341);
                    OpenGL.glTexCoord2f((float) this.field9337, (float) this.field9341);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9337, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method1863(var8, -83);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field9331 = false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z")
    private final boolean method3705(byte arg0) {
        if (this.field9347) {
            if (this.field9355 != null) {
                this.field9355.method3232(true);
                this.field9355 = null;
            }
            if (this.field9345 != null) {
                this.field9345.method2429((byte) -117);
                this.field9345 = null;
            }
            if (this.field9329 != null) {
                this.field9355 = new class579(this.field9323, 6402, this.field9337, this.field9341, this.field9323.field4951);
            }
            if (this.field9346) {
                this.field9345 = new class185(this.field9323, 34037, 6402, this.field9337, this.field9341);
            } else if (this.field9355 == null) {
                this.field9355 = new class579(this.field9323, 6402, this.field9337, this.field9341);
            }
            this.field9347 = false;
            this.field9351 = true;
            this.field9353 = true;
        }
        field9322++;
        if (arg0 != 15) {
            this.method3704(-63);
        }
        if (this.field9352) {
            if (this.field9348 != null) {
                this.field9348.method3232(true);
                this.field9348 = null;
            }
            if (this.field9354[0] != null) {
                this.field9354[0].method2429((byte) -92);
                this.field9354[0] = null;
            }
            if (this.field9354[1] != null) {
                this.field9354[1].method2429((byte) -118);
                this.field9354[1] = null;
            }
            if (this.field9329 != null) {
                this.field9348 = new class579(this.field9323, this.field9350, this.field9337, this.field9341, this.field9323.field4951);
            }
            this.field9354[0] = new class185(this.field9323, 34037, this.field9350, this.field9337, this.field9341);
            this.field9354[1] = this.field9349 > 1 ? new class185(this.field9323, 34037, this.field9350, this.field9337, this.field9341) : null;
            this.field9351 = true;
            this.field9353 = true;
            this.field9352 = false;
        }
        if (this.field9351) {
            if (this.field9329 == null) {
                this.field9323.method2158(-29780, this.field9326);
                this.field9326.method2904(0, (byte) 88);
                this.field9326.method2904(1, (byte) 76);
                this.field9326.method2904(8, (byte) 122);
                this.field9326.method2912(0, 0, this.field9354[0]);
                if (this.field9349 > 1) {
                    this.field9326.method2912(0, 1, this.field9354[1]);
                }
                if (this.field9346) {
                    this.field9326.method2912(0, 8, this.field9345);
                } else {
                    this.field9326.method2905(true, 8, this.field9355);
                }
                this.field9323.method2142(-80, this.field9326);
            } else {
                this.field9323.method2158(-29780, this.field9326);
                this.field9326.method2904(0, (byte) 69);
                this.field9326.method2904(1, (byte) 61);
                this.field9326.method2904(8, (byte) 78);
                this.field9326.method2912(arg0 ^ 0xF, 0, this.field9354[0]);
                if (this.field9349 > 1) {
                    this.field9326.method2912(0, 1, this.field9354[1]);
                }
                if (this.field9346) {
                    this.field9326.method2912(arg0 ^ 0xF, 8, this.field9345);
                }
                this.field9323.method2142(arg0 - 100, this.field9326);
                this.field9323.method2158(arg0 ^ 0xFFFF8BA3, this.field9329);
                this.field9329.method2904(0, (byte) 104);
                this.field9329.method2904(8, (byte) 61);
                this.field9329.method2905(true, 0, this.field9348);
                this.field9329.method2905(true, 8, this.field9355);
                this.field9323.method2142(-60, this.field9329);
            }
            this.field9351 = false;
            this.field9353 = true;
        }
        if (this.field9353) {
            this.field9323.method2158(-29780, this.field9328);
            this.field9353 = !this.field9328.method2906(-1);
            this.field9323.method2142(-97, this.field9328);
        }
        return !this.field9353;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
    public final boolean method3706(byte arg0) {
        field9338++;
        if (arg0 <= 56) {
            this.field9351 = true;
        }
        return this.field9328 != null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Leq;)V")
    public class682(class357 arg0) {
        this.field9323 = arg0;
        if (this.field9323.field5073 && this.field9323.field5017) {
            this.field9328 = this.field9326 = new class504(this.field9323);
            if (this.field9323.field4951 > 1 && this.field9323.field5045 && this.field9323.field5014) {
                this.field9328 = this.field9329 = new class504(this.field9323);
                return;
            }
        }
    }
}
