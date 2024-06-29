import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class131 {

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    private int field2192 = 1;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    private int field2193 = 0;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    private int field2204 = 0;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    private int field2203 = 1;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Luh;")
    private class168 field2209 = new class168();

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
    private boolean field2210 = true;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Ltp;")
    private class533[] field2212 = new class533[2];

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "Z")
    private boolean field2214 = true;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Z")
    private boolean field2211 = true;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Z")
    private boolean field2216 = true;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    private int field2219 = 0;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    private int field2218 = -1;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "Z")
    private boolean field2220 = false;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Lqo;")
    private class22 field2207;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lrg;")
    private class643 field2198;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lrg;")
    private class643 field2201;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lrg;")
    private class643 field2202;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
    public static int[] field2196 = new int[2048];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Lkw;")
    private class251 field2213;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lkw;")
    private class251 field2215;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "Ltp;")
    private class533 field2217;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
    private boolean field2206;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILat;BI)V")
    public static final void method1076(int arg0, class378 arg1, byte arg2, int arg3) {
        field2195++;
        class487 var4 = arg1.method2385(class272.field3822, (byte) 19);
        if (var4 == null) {
            return;
        }
        class272.field3822.method303(arg3, arg0, arg1.field5385 + arg3, arg0 - -arg1.field5465);
        if (class318.field4392 >= 3) {
            class272.field3822.method271(-16777216, var4, arg3, arg0);
        } else {
            class334.field4682.method2927((float) arg1.field5385 / 2.0F + (float) arg3, (float) arg1.field5465 / 2.0F + (float) arg0, 4096, ((int) (-class451.field6366) & 0x3FFF) << 2, var4, arg3, arg0);
        }
        if (arg2 != -98) {
            method1076(88, null, (byte) 15, 71);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method1077(int arg0) {
        field2194++;
        if (!this.field2206) {
            return;
        }
        if (this.field2202 != null) {
            this.field2207.method241(-17083, this.field2202);
            int var2 = 16384;
            this.field2207.method214(this.field2198, -115);
            this.field2202.method3651(0, 0);
            this.field2198.method3649(0, (byte) 3);
            if (this.field2220) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field2203, this.field2192, 0, 0, this.field2203, this.field2192, var2, 9728);
            this.field2207.method351(8387, this.field2202);
            this.field2207.method287(this.field2198, 327685);
        }
        this.field2207.method314(92);
        this.field2207.method222(0, 1);
        this.field2207.method237(0, 1);
        int var3 = 19 % ((arg0 - 12) / 49);
        this.field2207.method305();
        int var4 = 0;
        int var5 = 1;
        class25 var7;
        for (class25 var6 = (class25) this.field2209.method1269(4); var6 != null; var6 = var7) {
            var7 = (class25) this.field2209.method1264((byte) 113);
            int var8 = var6.method391(1);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method377(this.field2217, this.field2212[var4], var9, (byte) 103);
                if (var7 == null && var8 - 1 == var9) {
                    this.field2207.method255(-422613672, this.field2198);
                    this.field2207.method308(103, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2192);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2204, this.field2193);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2204, this.field2193 + this.field2192);
                    OpenGL.glTexCoord2f((float) this.field2203, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2204 + this.field2203, this.field2193 + this.field2192);
                    OpenGL.glTexCoord2f((float) this.field2203, (float) this.field2192);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2204 + this.field2203, this.field2193);
                    OpenGL.glEnd();
                } else {
                    this.field2198.method3649(var5, (byte) 3);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2192);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field2192);
                    OpenGL.glTexCoord2f((float) this.field2203, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2203, this.field2192);
                    OpenGL.glTexCoord2f((float) this.field2203, (float) this.field2192);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2203, 0);
                    OpenGL.glEnd();
                }
                var6.method383((byte) -80, var9);
                var4 = var4 + 1 & 0x1;
                var5 = var5 + 1 & 0x1;
            }
        }
        this.field2206 = false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lat;I)V")
    public static final void method1078(class378 arg0, int arg1) {
        field2205++;
        if (arg0.field5450 == 5 && arg0.field5488 != -1) {
            class404.method2520(class272.field3822, -2, arg0);
        }
        if (arg1 != -2835) {
            method1078(null, 44);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lfba;Z)Z")
    public final boolean method1079(class25 arg0, boolean arg1) {
        field2190++;
        if (this.field2201 != null) {
            if (arg0.method378(arg1) || arg0.method385(85)) {
                this.field2209.method1273(arg0, -20180);
                this.method1086((byte) -94);
                if (this.method1081(false)) {
                    if (this.field2203 != -1 && this.field2192 != -1) {
                        arg0.method381(this.field2192, (byte) 55, this.field2203);
                    }
                    arg0.field733 = true;
                    return true;
                }
            }
            this.method1083(arg0, true);
        }
        return arg1 ? false : false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            return true;
        }
        field2189++;
        if (this.field2201 == null || this.field2209.method1276((byte) 18)) {
            return false;
        }
        if (this.field2203 != arg0 || this.field2192 != arg2) {
            this.field2203 = arg0;
            this.field2192 = arg2;
            for (class362 var6 = this.field2209.method1269(arg4 ^ 0xFFFFFFFB); var6 != this.field2209.field2642; var6 = var6.field5207) {
                ((class25) var6).method381(this.field2192, (byte) 41, this.field2203);
            }
            this.field2214 = true;
            this.field2210 = true;
            this.field2211 = true;
        }
        if (!this.method1081(false)) {
            return false;
        }
        this.field2206 = true;
        this.field2193 = arg3;
        this.field2204 = arg1;
        this.field2207.method264(arg4, this.field2201);
        this.field2201.method3649(0, (byte) 3);
        this.field2207.method308(98, this.field2192 + this.field2193 - this.field2207.field463, -this.field2204);
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
    private final boolean method1081(boolean arg0) {
        if (this.field2210) {
            if (this.field2215 != null) {
                this.field2215.method1704(4);
                this.field2215 = null;
            }
            if (this.field2217 != null) {
                this.field2217.method451(-19948);
                this.field2217 = null;
            }
            if (this.field2202 != null) {
                this.field2215 = new class251(this.field2207, 6402, this.field2203, this.field2192, this.field2207.field535);
            }
            if (this.field2220) {
                this.field2217 = new class533(this.field2207, 34037, 6402, this.field2203, this.field2192);
            } else if (this.field2215 == null) {
                this.field2215 = new class251(this.field2207, 6402, this.field2203, this.field2192);
            }
            this.field2210 = false;
            this.field2211 = true;
            this.field2216 = true;
        }
        field2188++;
        if (this.field2214) {
            if (this.field2213 != null) {
                this.field2213.method1704(4);
                this.field2213 = null;
            }
            if (this.field2212[0] != null) {
                this.field2212[0].method451(-19948);
                this.field2212[0] = null;
            }
            if (this.field2212[1] != null) {
                this.field2212[1].method451(-19948);
                this.field2212[1] = null;
            }
            if (this.field2202 != null) {
                this.field2213 = new class251(this.field2207, this.field2218, this.field2203, this.field2192, this.field2207.field535);
            }
            this.field2212[0] = new class533(this.field2207, 34037, this.field2218, this.field2203, this.field2192);
            this.field2212[1] = this.field2219 > 1 ? new class533(this.field2207, 34037, this.field2218, this.field2203, this.field2192) : null;
            this.field2211 = true;
            this.field2216 = true;
            this.field2214 = false;
        }
        if (arg0) {
            field2199 = -21;
        }
        if (this.field2211) {
            if (this.field2202 == null) {
                this.field2207.method264(-1, this.field2198);
                this.field2198.method3646(2983, 0);
                this.field2198.method3646(2983, 1);
                this.field2198.method3646(2983, 8);
                this.field2198.method3655(this.field2212[0], 0, 0);
                if (this.field2219 > 1) {
                    this.field2198.method3655(this.field2212[1], 0, 1);
                }
                if (this.field2220) {
                    this.field2198.method3655(this.field2217, 0, 8);
                } else {
                    this.field2198.method3654(8, this.field2215, 114);
                }
                this.field2207.method255(-422613672, this.field2198);
            } else {
                this.field2207.method264(-1, this.field2198);
                this.field2198.method3646(2983, 0);
                this.field2198.method3646(2983, 1);
                this.field2198.method3646(2983, 8);
                this.field2198.method3655(this.field2212[0], 0, 0);
                if (this.field2219 > 1) {
                    this.field2198.method3655(this.field2212[1], 0, 1);
                }
                if (this.field2220) {
                    this.field2198.method3655(this.field2217, 0, 8);
                }
                this.field2207.method255(-422613672, this.field2198);
                this.field2207.method264(-1, this.field2202);
                this.field2202.method3646(2983, 0);
                this.field2202.method3646(2983, 8);
                this.field2202.method3654(0, this.field2213, -100);
                this.field2202.method3654(8, this.field2215, -47);
                this.field2207.method255(-422613672, this.field2202);
            }
            this.field2211 = false;
            this.field2216 = true;
        }
        if (this.field2216) {
            this.field2207.method264(-1, this.field2201);
            this.field2216 = !this.field2201.method3653(118);
            this.field2207.method255(-422613672, this.field2201);
        }
        return !this.field2216;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1082(byte arg0) {
        if (arg0 >= 77) {
            field2196 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Lfba;Z)V")
    public final void method1083(class25 arg0, boolean arg1) {
        field2197++;
        if (arg1) {
            arg0.field733 = false;
            arg0.method390((byte) -126);
            arg0.method2314((byte) 103);
            this.method1086((byte) -80);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public final void method1084(byte arg0) {
        int var2 = 84 % ((-arg0 - 63) / 56);
        this.field2213 = null;
        field2208++;
        this.field2201 = this.field2202 = this.field2198 = null;
        this.field2217 = null;
        this.field2215 = null;
        this.field2212 = null;
        if (!this.field2209.method1276((byte) 18)) {
            for (class362 var3 = this.field2209.method1269(4); var3 != this.field2209.field2642; var3 = var3.field5207) {
                ((class25) var3).method390((byte) -124);
            }
        }
        this.field2203 = this.field2192 = 1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
    public final boolean method1085(int arg0) {
        field2187++;
        if (arg0 != 1) {
            this.field2203 = -99;
        }
        return this.field2201 != null;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    private final void method1086(byte arg0) {
        field2200++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        class25 var5 = (class25) this.field2209.method1269(4);
        int var6 = 50 / ((-arg0 - 34) / 45);
        while (var5 != null) {
            int var10 = var5.method388(true);
            var4 += var5.method391(1);
            if (var10 > var3) {
                var3 = var10;
            }
            var2 |= var5.method386(1);
            var5 = (class25) this.field2209.method1264((byte) 67);
        }
        int var7;
        if (var3 == 2) {
            var7 = 34836;
        } else if (var3 == 1) {
            var7 = 34842;
        } else {
            var7 = 6408;
        }
        if (this.field2218 != var7) {
            this.field2214 = true;
            this.field2218 = var7;
        }
        int var8 = this.field2219 > 2 ? 2 : this.field2219;
        int var9 = var4 <= 2 ? var4 : 2;
        this.field2219 = var4;
        if (var2 != this.field2220) {
            this.field2220 = var2;
            this.field2210 = true;
        }
        if (var8 != var9) {
            this.field2211 = this.field2214 = true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILha;IBIIII)V")
    public static final void method1087(int arg0, class59 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2191++;
        class569.field7823 = arg1;
        class99.field1740 = class569.field7823.method290();
        class211.field3000 = class569.field7823.method290();
        class184.field2783 = class569.field7823.method290();
        class192.field2852 = arg7;
        class94.field1656 = 0;
        if (arg3 <= 64) {
            field2196 = null;
        }
        class386.field5603 = arg4;
        class369.field5253 = 0;
        class273.field3847 = arg5;
        class691.field9342 = null;
        class215.field3119 = 1;
        class640.field8795 = arg0;
        class486.method2862((byte) 38, arg6, arg2);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lqo;)V")
    public class131(class22 arg0) {
        this.field2207 = arg0;
        if (this.field2207.field642 && this.field2207.field659) {
            this.field2201 = this.field2198 = new class643(this.field2207);
            if (this.field2207.field535 > 1 && this.field2207.field637 && this.field2207.field629) {
                this.field2201 = this.field2202 = new class643(this.field2207);
                return;
            }
        }
    }
}
