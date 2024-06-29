import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class211 extends class125 {

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Lqg;")
    private class321 field3059;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "Lnm;")
    private class329 field3056;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I", line = 5)
    public static final int method1408(boolean arg0, int arg1) {
        field3060++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (!arg0) {
            method1409(null, null, null, null, (byte) 12);
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)Lnm;", line = 58)
    public final class329 method933(boolean arg0) {
        if (arg0) {
            this.field3059 = null;
        }
        field3055++;
        return this.field3056;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([I[I[ILps;B)V", line = 73)
    public static final void method1409(int[] arg0, int[] arg1, int[] arg2, class62 arg3, byte arg4) {
        if (arg4 != 69) {
            return;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field318.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field318[var9] = null;
                    } else {
                        class357 var10 = class311.field4455.method1233(true, var6);
                        int var11 = var10.field5404;
                        class228 var12 = arg3.field318[var9];
                        if (var12 != null) {
                            if (var12.field3341 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field318[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3345 = var8;
                                    var12.field3344 = 0;
                                    var12.field3342 = 0;
                                    var12.field3346 = 1;
                                    var12.field3340 = 0;
                                    class435.method2635(arg3.field5538, 232, arg3.field5539, 0, var10, class95.field1558 == arg3, arg3.field5529);
                                } else if (var11 == 2) {
                                    var12.field3344 = 0;
                                }
                            } else if (var10.field5389 >= class311.field4455.method1233(true, var12.field3341).field5389) {
                                var12 = arg3.field318[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class228 var13 = arg3.field318[var9] = new class228();
                            var13.field3341 = var6;
                            var13.field3346 = 1;
                            var13.field3344 = 0;
                            var13.field3340 = 0;
                            var13.field3345 = var8;
                            var13.field3342 = 0;
                            class435.method2635(arg3.field5538, 232, arg3.field5539, 0, var10, class95.field1558 == arg3, arg3.field5529);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3057++;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lqg;I)V", line = 169)
    public class211(class321 arg0, int arg1) {
        this.field3059 = arg0;
        this.field3056 = new class329(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILqf;)I", line = 181)
    public static final int method1410(int arg0, class477 arg1) {
        field3058++;
        if (arg0 != 0) {
            field3054 = 20;
        }
        int var2 = arg1.method2847(119, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2847(arg0 ^ 0xFFFFFF9C, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2847(arg0 ^ 0xFFFFFF80, 8);
        } else {
            var3 = arg1.method2847(arg0 ^ 0x70, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIZ)V", line = 208)
    public static final void method1411(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method1411(92, -46, -55, false);
        }
        int var4 = arg2 << 3;
        field3062++;
        int var5 = arg0 << 3;
        int var6 = arg1 << 3;
        if (class403.field5944 == 2) {
            class320.field4578 = var5;
            class310.field4446 = var6;
            class103.field1642 = var4;
        }
        class66.field1161 = var5;
        class382.field5684 = var6;
        class111.method822(4);
        class163.field2465 = true;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lnm;FILnm;)Z", line = 234)
    public final boolean method1412(class329 arg0, float arg1, int arg2, class329 arg3) {
        field3061++;
        boolean var5 = true;
        class217 var6 = this.field3059.field4854;
        class217 var7 = this.field3059.field4876;
        if (this.field3059.field4916.field3430 != arg3.field5077 || this.field3059.field4916.field3429 != arg3.field5077) {
            this.field3059.field4916 = new class236(this.field3059, 3553, 6408, arg3.field5077, arg3.field5077);
        }
        if (this.field3059.field4864.field3430 != arg0.field5077 || this.field3059.field4864.field3429 != arg0.field5077) {
            this.field3059.field4864 = new class236(this.field3059, 3553, 6408, arg0.field5077, arg0.field5077);
        }
        this.field3059.method505(class78.field1308);
        this.field3059.method492();
        this.field3059.method2043(0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) arg2);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3056.field5077, this.field3056.field5077);
        this.field3059.method2018(false, 22090);
        this.field3059.method2024(true, false);
        this.field3059.method2016((byte) -56, false);
        this.field3059.method2052((byte) 127, false);
        this.field3059.method2008(-2, arg2 ^ 0x351);
        this.field3059.method2030(1, (byte) -122);
        this.field3059.method2074(0.0F, 0.0F, arg1, (byte) -73, 0.0F);
        this.field3059.method2070(101, 34165, 34165);
        this.field3059.method2042(null, 0);
        this.field3059.method2030(0, (byte) -125);
        this.field3059.method2068(1, 13134);
        this.field3059.method2042(null, 0);
        int var8 = 0;
        while (var8 < 6) {
            int var9 = var8 + 34069;
            this.field3059.method2083(40, var6);
            var6.method1435(0, 0, arg3, var9);
            this.field3059.method2062(var7, (byte) -117);
            var7.method1449((byte) 69, this.field3059.field4916, 0);
            if (var6.method1444(-127) && var7.method1444(-126)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg3.field5077, arg3.field5077, 0, 0, arg3.field5077, arg3.field5077, 16384, 9728);
                var6.method1435(0, arg2 ^ 0x1, arg0, var9);
                var7.method1449((byte) 74, this.field3059.field4864, 0);
                if (var6.method1444(-126) && var7.method1444(arg2 ^ 0xFFFFFF83)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg3.field5077, arg3.field5077, 0, 0, arg3.field5077, arg3.field5077, 16384, 9728);
                    var6.method1445(1, 0);
                    this.field3059.method2056(var6, (byte) -38);
                    var7.method1445(1, 0);
                    this.field3059.method2059(var7, 1);
                    this.field3059.method2036((byte) 118, var6);
                    var6.method1435(0, 0, this.field3056, var9);
                    if (!var6.method1444(arg2 ^ 0xFFFFFF83)) {
                        var6.method1445(arg2, 0);
                        var5 = false;
                        this.field3059.method2060((byte) -54, var6);
                        break;
                    }
                    this.field3059.method2030(1, (byte) 98);
                    this.field3059.method2042(this.field3059.field4864, 0);
                    this.field3059.method2030(0, (byte) 83);
                    this.field3059.method2042(this.field3059.field4916, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field3059.method2030(1, (byte) -125);
                    this.field3059.method2042(null, arg2 ^ 0x1);
                    this.field3059.method2030(0, (byte) -124);
                    this.field3059.method2042(null, 0);
                    var6.method1445(1, 0);
                    this.field3059.method2060((byte) -54, var6);
                    var8++;
                    continue;
                }
                var6.method1445(1, 0);
                this.field3059.method2056(var6, (byte) -38);
                var7.method1445(arg2, 0);
                var5 = false;
                this.field3059.method2059(var7, arg2);
                break;
            }
            var6.method1445(arg2, 0);
            this.field3059.method2056(var6, (byte) -38);
            var7.method1445(1, 0);
            this.field3059.method2059(var7, 1);
            var5 = false;
            break;
        }
        this.field3059.method2030(1, (byte) 111);
        this.field3059.method2070(arg2 + 77, 8448, 8448);
        this.field3059.method2030(0, (byte) 35);
        OpenGL.glPopAttrib();
        this.field3059.method509(class78.field1308[0], class78.field1308[1], class78.field1308[2], class78.field1308[3]);
        if (var5) {
            this.field3056.method2666(-6454);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I", line = 361)
    public final int method1413(int arg0) {
        field3063++;
        return arg0 == 0 ? this.field3056.field5077 : -62;
    }
}
