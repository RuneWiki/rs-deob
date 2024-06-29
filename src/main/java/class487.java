import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class487 {

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    private int field6950 = 1;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    private int field6946 = 1;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    private int field6960 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    private int field6961 = 0;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lau;")
    private class692 field6962 = new class692();

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Z")
    private boolean field6971 = true;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    private int field6969 = -1;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[Lil;")
    private class586[] field6970 = new class586[2];

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "Z")
    private boolean field6975 = false;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "Z")
    private boolean field6974 = true;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    private int field6977 = 0;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Z")
    private boolean field6972 = true;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
    private boolean field6979 = true;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lkfa;")
    private class382 field6963;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lec;")
    private class92 field6944;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lec;")
    private class92 field6951;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lec;")
    private class92 field6967;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field6943 = 0;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "J")
    public static long field6956 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field6959 = 0;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[F")
    public static float[] field6947 = new float[16];

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field6964 = 0;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Lkf;")
    private class325 field6968;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Lkf;")
    private class325 field6976;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lvo;")
    public static class345 field6954;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Lil;")
    private class586 field6978;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field6980;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Z")
    private boolean field6953;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2856(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z", line = 3)
    private final boolean method2845(byte arg0) {
        field6958++;
        if (this.field6979) {
            if (this.field6976 != null) {
                this.field6976.method1940(-113);
                this.field6976 = null;
            }
            if (this.field6978 != null) {
                this.field6978.method2008(-7656);
                this.field6978 = null;
            }
            if (this.field6967 != null) {
                this.field6976 = new class325(this.field6963, 6402, this.field6950, this.field6946, this.field6963.field5444);
            }
            if (this.field6975) {
                this.field6978 = new class586(this.field6963, 34037, 6402, this.field6950, this.field6946);
            } else if (this.field6976 == null) {
                this.field6976 = new class325(this.field6963, 6402, this.field6950, this.field6946);
            }
            this.field6979 = false;
            this.field6972 = true;
            this.field6974 = true;
        }
        if (arg0 <= 101) {
            this.field6944 = null;
        }
        if (this.field6971) {
            if (this.field6968 != null) {
                this.field6968.method1940(-71);
                this.field6968 = null;
            }
            if (this.field6970[0] != null) {
                this.field6970[0].method2008(-7656);
                this.field6970[0] = null;
            }
            if (this.field6970[1] != null) {
                this.field6970[1].method2008(-7656);
                this.field6970[1] = null;
            }
            if (this.field6967 != null) {
                this.field6968 = new class325(this.field6963, this.field6969, this.field6950, this.field6946, this.field6963.field5444);
            }
            this.field6970[0] = new class586(this.field6963, 34037, this.field6969, this.field6950, this.field6946);
            this.field6970[1] = this.field6977 <= 1 ? null : new class586(this.field6963, 34037, this.field6969, this.field6950, this.field6946);
            this.field6971 = false;
            this.field6974 = true;
            this.field6972 = true;
        }
        if (this.field6972) {
            if (this.field6967 == null) {
                this.field6963.method2263(true, this.field6944);
                this.field6944.method688(-120, 0);
                this.field6944.method688(-127, 1);
                this.field6944.method688(-101, 8);
                this.field6944.method692((byte) -128, this.field6970[0], 0);
                if (this.field6977 > 1) {
                    this.field6944.method692((byte) -122, this.field6970[1], 1);
                }
                if (this.field6975) {
                    this.field6944.method692((byte) -119, this.field6978, 8);
                } else {
                    this.field6944.method676((byte) -96, this.field6976, 8);
                }
                this.field6963.method2340((byte) 64, this.field6944);
            } else {
                this.field6963.method2263(true, this.field6944);
                this.field6944.method688(-100, 0);
                this.field6944.method688(-13, 1);
                this.field6944.method688(-2, 8);
                this.field6944.method692((byte) -127, this.field6970[0], 0);
                if (this.field6977 > 1) {
                    this.field6944.method692((byte) -123, this.field6970[1], 1);
                }
                if (this.field6975) {
                    this.field6944.method692((byte) -127, this.field6978, 8);
                }
                this.field6963.method2340((byte) 64, this.field6944);
                this.field6963.method2263(true, this.field6967);
                this.field6967.method688(-110, 0);
                this.field6967.method688(-15, 8);
                this.field6967.method676((byte) -116, this.field6968, 0);
                this.field6967.method676((byte) -101, this.field6976, 8);
                this.field6963.method2340((byte) 64, this.field6967);
            }
            this.field6974 = true;
            this.field6972 = false;
        }
        if (this.field6974) {
            this.field6963.method2263(true, this.field6951);
            this.field6974 = !this.field6951.method691(-106);
            this.field6963.method2340((byte) 64, this.field6951);
        }
        return !this.field6974;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 133)
    private final void method2846(byte arg0) {
        field6955++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class326 var5 = (class326) this.field6962.method3905(arg0 ^ 0x7B); var5 != null; var5 = (class326) this.field6962.method3899(0)) {
            int var9 = var5.method736(arg0 - 26875);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method1946((byte) 109);
            var2 |= var5.method1945((byte) -21);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6969 != var6) {
            this.field6969 = var6;
            this.field6971 = true;
        }
        int var7 = this.field6977 > 2 ? 2 : this.field6977;
        int var8 = var4 > 2 ? 2 : var4;
        if (arg0 != -2) {
            this.method2851(null, false);
        }
        this.field6977 = var4;
        if (this.field6975 != var2) {
            this.field6979 = true;
            this.field6975 = var2;
        }
        if (var7 != var8) {
            this.field6972 = this.field6971 = true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBI)Z", line = 197)
    public final boolean method2847(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6957++;
        if (arg3 != 34) {
            this.field6977 = -81;
        }
        if (this.field6951 == null || this.field6962.method3903(arg3 - 32)) {
            return false;
        }
        if (this.field6950 != arg1 || this.field6946 != arg4) {
            this.field6946 = arg4;
            this.field6950 = arg1;
            for (class435 var6 = this.field6962.method3905(-128); var6 != this.field6962.field9799; var6 = var6.field6259) {
                ((class326) var6).method727(this.field6946, this.field6950, 5798);
            }
            this.field6971 = true;
            this.field6972 = true;
            this.field6979 = true;
        }
        if (!this.method2845((byte) 106)) {
            return false;
        }
        this.field6961 = arg0;
        this.field6953 = true;
        this.field6960 = arg2;
        this.field6963.method2263(true, this.field6951);
        this.field6951.method690(21589, 0);
        this.field6963.method2279(this.field6946 - (this.field6963.field5289 - this.field6960), -this.field6961, true);
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V", line = 243)
    public static final void method2848() {
        for (int var0 = 0; var0 < class410.field5858; var0++) {
            if (!class235.field3491[var0]) {
                class8 var1 = class126.field2067[var0];
                class289 var2 = var1.field90;
                int var3 = var1.field79;
                int var4 = var2.method1772(true) - class211.field3229;
                int var5 = (var4 * 2 >> class49.field637) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1776((byte) -116) - var4 >> class49.field637;
                int var9 = var2.method1771(true) - var4 >> class49.field637;
                int var10 = var2.method1771(true) + var4 >> class49.field637;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class687.field9758) {
                    var10 = class687.field9758 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field77[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class33.field474) {
                        var16 = class33.field474 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class144 var19 = class31.method286(var3, var17, var11, field6980 == null ? (field6980 = method2856("at")) : field6980);
                        if (var19 != null && var19.field2479 != 0) {
                            if (var19.field2479 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field77[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field77[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field77[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field77[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class235.field3491[var0] = true;
                class687.field9745[var3].method1367(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZZ)V", line = 429)
    public static final void method2849(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class164.field2715--;
            if (class164.field2715 == 0) {
                class531.field7839 = null;
            }
        }
        field6945++;
        if (arg1) {
            class231.field3426--;
            if (class231.field3426 == 0) {
                class324.field4520 = null;
            }
        }
        if (arg0 != 34037) {
            method2849(-93, false, true);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 457)
    public final void method2850(int arg0) {
        this.field6978 = null;
        this.field6951 = this.field6967 = this.field6944 = null;
        this.field6976 = null;
        this.field6970 = null;
        field6948++;
        this.field6968 = null;
        if (!this.field6962.method3903(2)) {
            for (class435 var2 = this.field6962.method3905(-125); var2 != this.field6962.field9799; var2 = var2.field6259) {
                ((class326) var2).method735((byte) 75);
            }
        }
        this.field6950 = this.field6946 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Loba;Z)Z", line = 487)
    public final boolean method2851(class326 arg0, boolean arg1) {
        if (arg1) {
            this.field6975 = false;
        }
        field6965++;
        if (this.field6951 != null) {
            if (arg0.method732((byte) 62) || arg0.method729(true)) {
                this.field6962.method3904(arg0, 0);
                this.method2846((byte) -2);
                if (this.method2845((byte) 114)) {
                    if (this.field6950 != -1 && this.field6946 != -1) {
                        arg0.method727(this.field6946, this.field6950, 5798);
                    }
                    arg0.field4539 = true;
                    return true;
                }
            }
            this.method2855((byte) -15, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lkfa;)V", line = 733)
    public class487(class382 arg0) {
        this.field6963 = arg0;
        if (this.field6963.field5571 && this.field6963.field5528) {
            this.field6951 = this.field6944 = new class92(this.field6963);
            if (this.field6963.field5444 > 1 && this.field6963.field5593 && this.field6963.field5595) {
                this.field6951 = this.field6967 = new class92(this.field6963);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z", line = 531)
    public final boolean method2852(boolean arg0) {
        field6973++;
        if (!arg0) {
            this.method2847(-95, 58, 8, (byte) -47, 55);
        }
        return this.field6951 != null;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 543)
    public final void method2853(byte arg0) {
        field6949++;
        if (!this.field6953) {
            return;
        }
        if (this.field6967 != null) {
            this.field6963.method2273((byte) -115, this.field6967);
            int var2 = 16384;
            this.field6963.method2264(this.field6944, 32507);
            this.field6967.method680(20733, 0);
            this.field6944.method690(21589, 0);
            if (this.field6975) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6950, this.field6946, 0, 0, this.field6950, this.field6946, var2, 9728);
            this.field6963.method2271(-89, this.field6967);
            this.field6963.method2330(-4, this.field6944);
        }
        this.field6963.method2337(122);
        this.field6963.method2325(0, (byte) 45);
        this.field6963.method2270(1, (byte) 110);
        this.field6963.method805();
        int var3 = 0;
        int var4 = 1;
        class326 var7;
        for (class326 var5 = (class326) this.field6962.method3905(-108); var5 != null; var5 = var7) {
            var7 = (class326) this.field6962.method3899(0);
            int var8 = var5.method1946((byte) 65);
            for (int var9 = 0; var9 < var8; var9++) {
                var5.method730(this.field6970[var3], this.field6978, var9, -32399);
                if (var7 == null && var8 - 1 == var9) {
                    this.field6963.method2340((byte) 64, this.field6944);
                    this.field6963.method2279(0, 0, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6946);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6961, this.field6960);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6961, this.field6960 + this.field6946);
                    OpenGL.glTexCoord2f((float) this.field6950, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6961 + this.field6950, this.field6960 + this.field6946);
                    OpenGL.glTexCoord2f((float) this.field6950, (float) this.field6946);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6961 + this.field6950, this.field6960);
                    OpenGL.glEnd();
                } else {
                    this.field6944.method690(21589, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6946);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6946);
                    OpenGL.glTexCoord2f((float) this.field6950, (float) this.field6946);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6950, this.field6946);
                    OpenGL.glTexCoord2f((float) this.field6950, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6950, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method731((byte) -108, var9);
            }
        }
        int var6 = -29 / ((arg0 - 3) / 61);
        this.field6953 = false;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V", line = 650)
    public static void method2854(byte arg0) {
        if (arg0 < 124) {
            method2849(40, true, false);
        }
        field6954 = null;
        field6947 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLoba;)V", line = 672)
    public final void method2855(byte arg0, class326 arg1) {
        arg1.field4539 = false;
        field6966++;
        arg1.method735((byte) 115);
        arg1.method2549((byte) -97);
        this.method2846((byte) -2);
        if (arg0 >= -12) {
            field6954 = null;
        }
    }
}
