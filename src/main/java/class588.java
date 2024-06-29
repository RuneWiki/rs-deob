import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class588 {

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    private int field8351 = 1;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    private int field8360 = 0;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    private int field8349 = 1;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    private int field8366 = 0;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "Lmfa;")
    private class562 field8357 = new class562();

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "Z")
    private boolean field8371 = true;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    private int field8368 = -1;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "Z")
    private boolean field8373 = true;

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "Z")
    private boolean field8376 = true;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "Z")
    private boolean field8375 = true;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "[Lkp;")
    private class446[] field8377 = new class446[2];

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "Z")
    private boolean field8370 = false;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
    private int field8378 = 0;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "Lap;")
    private class435 field8367;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "Lei;")
    private class162 field8346;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Lei;")
    private class162 field8350;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lei;")
    private class162 field8358;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field8361 = 0;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "[Lqda;")
    public static class90[] field8353 = new class90[4];

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field8356 = 0;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "Lkp;")
    private class446 field8374;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "Lrc;")
    private class491 field8369;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "Lrc;")
    private class491 field8372;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lca", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field8379;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "Z")
    private boolean field8352;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3307(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 7)
    public final void method3296(boolean arg0) {
        this.field8377 = null;
        if (arg0) {
            this.method3299((byte) 33);
        }
        this.field8369 = null;
        this.field8372 = null;
        field8345++;
        this.field8374 = null;
        this.field8350 = this.field8358 = this.field8346 = null;
        if (!this.field8357.method3161((byte) 104)) {
            for (class270 var2 = this.field8357.method3174((byte) 49); var2 != this.field8357.field7992; var2 = var2.field3394) {
                ((class502) var2).method1607((byte) -122);
            }
        }
        this.field8349 = this.field8351 = 1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lcba;I)Z", line = 40)
    public final boolean method3297(class502 arg0, int arg1) {
        int var3 = 19 % ((23 - arg1) / 51);
        field8354++;
        if (this.field8350 != null) {
            if (arg0.method1610(1) || arg0.method1599(1)) {
                this.field8357.method3164(arg0, 256);
                this.method3300((byte) -79);
                if (this.method3299((byte) 124)) {
                    if (this.field8349 != -1 && this.field8351 != -1) {
                        arg0.method1604(this.field8349, 98, this.field8351);
                    }
                    arg0.field7230 = true;
                    return true;
                }
            }
            this.method3306(0, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 80)
    public final void method3298(int arg0) {
        field8348++;
        if (!this.field8352) {
            return;
        }
        if (this.field8358 != null) {
            int var2 = 16384;
            this.field8367.method2342(arg0 ^ 0xFFFFB9E7, this.field8358);
            this.field8367.method2405(this.field8346, 3089);
            this.field8358.method981(0, (byte) -83);
            this.field8346.method982(0, arg0 ^ 0x3EA0);
            if (this.field8370) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field8349, this.field8351, 0, 0, this.field8349, this.field8351, var2, 9728);
            this.field8367.method2374(arg0 - 17839, this.field8358);
            this.field8367.method2368(this.field8346, 255);
        }
        this.field8367.method2391((byte) -103);
        this.field8367.method2378(true, 0);
        this.field8367.method2396(1, -1);
        this.field8367.method378();
        if (arg0 != 17966) {
            this.field8370 = true;
        }
        int var3 = 0;
        int var4 = 1;
        class502 var6;
        for (class502 var5 = (class502) this.field8357.method3174((byte) 49); var5 != null; var5 = var6) {
            var6 = (class502) this.field8357.method3168(false);
            int var7 = var5.method2888(true);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1601(this.field8377[var3], var8, this.field8374, arg0 - 17965);
                if (var6 == null && var7 - 1 == var8) {
                    this.field8367.method2341(this.field8346, (byte) -91);
                    this.field8367.method2389((byte) 123, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8351);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8360, this.field8366);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8360, this.field8366 + this.field8351);
                    OpenGL.glTexCoord2f((float) this.field8349, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8360 + this.field8349, this.field8366 + this.field8351);
                    OpenGL.glTexCoord2f((float) this.field8349, (float) this.field8351);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8360 + this.field8349, this.field8366);
                    OpenGL.glEnd();
                } else {
                    this.field8346.method982(var4, 30862);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8351);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field8351);
                    OpenGL.glTexCoord2f((float) this.field8349, (float) this.field8351);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8349, this.field8351);
                    OpenGL.glTexCoord2f((float) this.field8349, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8349, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method1602(var8, 0);
            }
        }
        this.field8352 = false;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Z", line = 183)
    private final boolean method3299(byte arg0) {
        field8347++;
        if (this.field8371) {
            if (this.field8372 != null) {
                this.field8372.method2837(-102);
                this.field8372 = null;
            }
            if (this.field8374 != null) {
                this.field8374.method2228(-115);
                this.field8374 = null;
            }
            if (this.field8358 != null) {
                this.field8372 = new class491(this.field8367, 6402, this.field8349, this.field8351, this.field8367.field5912);
            }
            if (this.field8370) {
                this.field8374 = new class446(this.field8367, 34037, 6402, this.field8349, this.field8351);
            } else if (this.field8372 == null) {
                this.field8372 = new class491(this.field8367, 6402, this.field8349, this.field8351);
            }
            this.field8375 = true;
            this.field8371 = false;
            this.field8373 = true;
        }
        if (arg0 < 96) {
            this.method3301(-125);
        }
        if (this.field8376) {
            if (this.field8369 != null) {
                this.field8369.method2837(-64);
                this.field8369 = null;
            }
            if (this.field8377[0] != null) {
                this.field8377[0].method2228(-89);
                this.field8377[0] = null;
            }
            if (this.field8377[1] != null) {
                this.field8377[1].method2228(-115);
                this.field8377[1] = null;
            }
            if (this.field8358 != null) {
                this.field8369 = new class491(this.field8367, this.field8368, this.field8349, this.field8351, this.field8367.field5912);
            }
            this.field8377[0] = new class446(this.field8367, 34037, this.field8368, this.field8349, this.field8351);
            this.field8377[1] = this.field8378 > 1 ? new class446(this.field8367, 34037, this.field8368, this.field8349, this.field8351) : null;
            this.field8373 = true;
            this.field8376 = false;
            this.field8375 = true;
        }
        if (this.field8375) {
            if (this.field8358 == null) {
                this.field8367.method2395(true, this.field8346);
                this.field8346.method988(0, 512);
                this.field8346.method988(1, 512);
                this.field8346.method988(8, 512);
                this.field8346.method984(0, 0, this.field8377[0]);
                if (this.field8378 > 1) {
                    this.field8346.method984(0, 1, this.field8377[1]);
                }
                if (this.field8370) {
                    this.field8346.method984(0, 8, this.field8374);
                } else {
                    this.field8346.method977(this.field8372, 8, (byte) 123);
                }
                this.field8367.method2341(this.field8346, (byte) -91);
            } else {
                this.field8367.method2395(true, this.field8346);
                this.field8346.method988(0, 512);
                this.field8346.method988(1, 512);
                this.field8346.method988(8, 512);
                this.field8346.method984(0, 0, this.field8377[0]);
                if (this.field8378 > 1) {
                    this.field8346.method984(0, 1, this.field8377[1]);
                }
                if (this.field8370) {
                    this.field8346.method984(0, 8, this.field8374);
                }
                this.field8367.method2341(this.field8346, (byte) -91);
                this.field8367.method2395(true, this.field8358);
                this.field8358.method988(0, 512);
                this.field8358.method988(8, 512);
                this.field8358.method977(this.field8369, 0, (byte) 123);
                this.field8358.method977(this.field8372, 8, (byte) 123);
                this.field8367.method2341(this.field8358, (byte) -91);
            }
            this.field8375 = false;
            this.field8373 = true;
        }
        if (this.field8373) {
            this.field8367.method2395(true, this.field8350);
            this.field8373 = !this.field8350.method976((byte) 45);
            this.field8367.method2341(this.field8350, (byte) -91);
        }
        return !this.field8373;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V", line = 311)
    private final void method3300(byte arg0) {
        field8363++;
        if (arg0 >= -62) {
            return;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class502 var5 = (class502) this.field8357.method3174((byte) 49); var5 != null; var5 = (class502) this.field8357.method3168(false)) {
            int var9 = var5.method1609(1);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method2888(true);
            var2 |= var5.method2890(-1124);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field8368 != var6) {
            this.field8376 = true;
            this.field8368 = var6;
        }
        int var7 = this.field8378 > 2 ? 2 : this.field8378;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field8375 = this.field8376 = true;
        }
        if (var2 != this.field8370) {
            this.field8370 = var2;
            this.field8371 = true;
        }
        this.field8378 = var4;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z", line = 379)
    public final boolean method3301(int arg0) {
        field8362++;
        if (arg0 != 25443) {
            this.field8378 = -16;
        }
        return this.field8350 != null;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(Z)V", line = 391)
    public static void method3302(boolean arg0) {
        field8353 = null;
        if (arg0) {
            method3303(-41, -94, null);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILlt;)V", line = 407)
    public static final void method3303(int arg0, int arg1, class617 arg2) {
        field8355++;
        boolean var3 = arg2.method3465(1, (byte) -85) == 1;
        if (var3) {
            class382.field5045[class179.field2218++] = arg0;
        }
        int var4 = arg2.method3465(2, (byte) -120);
        class455 var5 = class362.field4726[arg0];
        if (~var4 == arg1) {
            if (var3) {
                var5.field6349 = false;
            } else if (class90.field1038 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class383 var6 = class412.field5458[arg0] = new class383();
                var6.field5132 = (var5.field3841[0] + class146.field1642 >> 6) + (var5.field3839[0] + class682.field9685 >> 6 << 14) + (var5.field4638 << 28);
                if (var5.field6326 == -1) {
                    var6.field5134 = var5.field3765.method1593(-123);
                } else {
                    var6.field5134 = var5.field6326;
                }
                var6.field5130 = var5.field6315;
                var6.field5131 = var5.field3803;
                if (var5.field6302 > 0) {
                    class362.method1988((byte) -110, var5);
                }
                class362.field4726[arg0] = null;
                if (arg2.method3465(1, (byte) -79) != 0) {
                    class632.method3538(arg0, -11, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method3465(3, (byte) -127);
            int var8 = var5.field3839[0];
            int var9 = var5.field3841[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field6348 = var8;
                var5.field6343 = var9;
                var5.field6349 = true;
            } else {
                var5.method2590(var9, class60.field626[arg0], var8, (byte) -112);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method3465(4, (byte) -83);
            int var11 = var5.field3839[0];
            int var12 = var5.field3841[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field6349 = true;
                var5.field6343 = var12;
                var5.field6348 = var11;
            } else {
                var5.method2590(var12, class60.field626[arg0], var11, (byte) -112);
            }
        } else {
            int var13 = arg2.method3465(1, (byte) -119);
            if (var13 == 0) {
                int var14 = arg2.method3465(12, (byte) -98);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F0) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field3839[0] + var16;
                int var19 = var5.field3841[0] + var17;
                if (var3) {
                    var5.field6343 = var19;
                    var5.field6348 = var18;
                    var5.field6349 = true;
                } else {
                    var5.method2590(var19, class60.field626[arg0], var18, (byte) -112);
                }
                var5.field4638 = (byte) (var5.field4638 + var15 & 0x3);
                if (class90.field1038 == arg0) {
                    class353.field4625 = var5.field4638;
                }
            } else {
                int var20 = arg2.method3465(30, (byte) -87);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field3839[0] + class682.field9685 + var22 & 0x3FFF) - class682.field9685;
                int var25 = (class146.field1642 + var23 + var5.field3841[0] & 0x3FFF) - class146.field1642;
                if (var3) {
                    var5.field6349 = true;
                    var5.field6348 = var24;
                    var5.field6343 = var25;
                } else {
                    var5.method2590(var25, class60.field626[arg0], var24, (byte) -112);
                }
                var5.field4638 = (byte) (var5.field4638 + var21 & 0x3);
                if (class90.field1038 == arg0) {
                    class353.field4625 = var5.field4638;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(Z)V", line = 720)
    public static final void method3304(boolean arg0) {
        try {
            Method var1 = (field8379 == null ? (field8379 = method3307("java.lang.Runtime")) : field8379).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class277.field3513 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0) {
            field8365++;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)Z", line = 751)
    public final boolean method3305(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -11463) {
            this.field8349 = -2;
        }
        field8359++;
        if (this.field8350 == null || this.field8357.method3161((byte) 101)) {
            return false;
        }
        if (this.field8349 != arg0 || this.field8351 != arg1) {
            this.field8349 = arg0;
            this.field8351 = arg1;
            for (class270 var6 = this.field8357.method3174((byte) 49); var6 != this.field8357.field7992; var6 = var6.field3394) {
                ((class502) var6).method1604(this.field8349, 113, this.field8351);
            }
            this.field8375 = true;
            this.field8376 = true;
            this.field8371 = true;
        }
        if (!this.method3299((byte) 106)) {
            return false;
        }
        this.field8360 = arg4;
        this.field8352 = true;
        this.field8366 = arg3;
        this.field8367.method2395(true, this.field8350);
        this.field8350.method982(0, 30862);
        this.field8367.method2389((byte) 98, this.field8351 + this.field8366 - this.field8367.field5907, -this.field8360);
        return true;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lap;)V", line = 864)
    public class588(class435 arg0) {
        this.field8367 = arg0;
        if (this.field8367.field6063 && this.field8367.field6012) {
            this.field8350 = this.field8346 = new class162(this.field8367);
            if (this.field8367.field5912 > 1 && this.field8367.field6014 && this.field8367.field5992) {
                this.field8350 = this.field8358 = new class162(this.field8367);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILcba;)V", line = 809)
    public final void method3306(int arg0, class502 arg1) {
        field8364++;
        arg1.field7230 = false;
        arg1.method1607((byte) -76);
        if (arg0 != 0) {
            this.method3306(-85, null);
        }
        arg1.method1519((byte) 121);
        this.method3300((byte) -116);
    }
}
