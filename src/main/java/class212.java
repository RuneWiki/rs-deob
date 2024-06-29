import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class212 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    private int field3092 = 1;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field3109 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    private int field3101 = 1;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    private int field3107 = 0;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Low;")
    private class665 field3105 = new class665();

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    private int field3113 = 0;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
    private boolean field3114 = false;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    private int field3112 = -1;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Z")
    private boolean field3115 = true;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Z")
    private boolean field3116 = true;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Z")
    private boolean field3119 = true;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[Lwi;")
    private class504[] field3118 = new class504[2];

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Z")
    private boolean field3120 = true;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Llea;")
    private class573 field3099;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lbq;")
    private class727 field3090;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lbq;")
    private class727 field3108;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lbq;")
    private class727 field3104;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lra;")
    private class399 field3110;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lra;")
    private class399 field3117;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lwi;")
    private class504 field3111;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
    private boolean field3096;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[Luf;")
    public static class519[] field3100;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method1459(boolean arg0) {
        this.field3118 = null;
        field3102++;
        this.field3110 = null;
        this.field3117 = null;
        this.field3111 = null;
        this.field3108 = this.field3104 = this.field3090 = null;
        if (!this.field3105.method3723((byte) 121)) {
            for (class766 var2 = this.field3105.method3731((byte) -107); var2 != this.field3105.field9375; var2 = var2.field10591) {
                ((class364) var2).method1183(false);
            }
        }
        this.field3092 = this.field3101 = 1;
        if (arg0) {
            this.field3092 = 86;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z")
    private final boolean method1460(int arg0) {
        if (this.field3120) {
            if (this.field3117 != null) {
                this.field3117.method2371(11600);
                this.field3117 = null;
            }
            if (this.field3111 != null) {
                this.field3111.method2272((byte) 27);
                this.field3111 = null;
            }
            if (this.field3104 != null) {
                this.field3117 = new class399(this.field3099, 6402, this.field3092, this.field3101, this.field3099.field8128);
            }
            if (this.field3114) {
                this.field3111 = new class504(this.field3099, 34037, 6402, this.field3092, this.field3101);
            } else if (this.field3117 == null) {
                this.field3117 = new class399(this.field3099, 6402, this.field3092, this.field3101);
            }
            this.field3119 = true;
            this.field3116 = true;
            this.field3120 = false;
        }
        int var2 = -85 / ((-arg0 - 62) / 44);
        field3093++;
        if (this.field3115) {
            if (this.field3110 != null) {
                this.field3110.method2371(11600);
                this.field3110 = null;
            }
            if (this.field3118[0] != null) {
                this.field3118[0].method2272((byte) 27);
                this.field3118[0] = null;
            }
            if (this.field3118[1] != null) {
                this.field3118[1].method2272((byte) 27);
                this.field3118[1] = null;
            }
            if (this.field3104 != null) {
                this.field3110 = new class399(this.field3099, this.field3112, this.field3092, this.field3101, this.field3099.field8128);
            }
            this.field3118[0] = new class504(this.field3099, 34037, this.field3112, this.field3092, this.field3101);
            this.field3118[1] = this.field3113 <= 1 ? null : new class504(this.field3099, 34037, this.field3112, this.field3092, this.field3101);
            this.field3119 = true;
            this.field3116 = true;
            this.field3115 = false;
        }
        if (this.field3116) {
            if (this.field3104 == null) {
                this.field3099.method3307(this.field3090, 30909);
                this.field3090.method4036(1, 0);
                this.field3090.method4036(1, 1);
                this.field3090.method4036(1, 8);
                this.field3090.method4033(0, 0, this.field3118[0]);
                if (this.field3113 > 1) {
                    this.field3090.method4033(0, 1, this.field3118[1]);
                }
                if (this.field3114) {
                    this.field3090.method4033(0, 8, this.field3111);
                } else {
                    this.field3090.method4034(this.field3117, 1, 8);
                }
                this.field3099.method3372((byte) -94, this.field3090);
            } else {
                this.field3099.method3307(this.field3090, 30909);
                this.field3090.method4036(1, 0);
                this.field3090.method4036(1, 1);
                this.field3090.method4036(1, 8);
                this.field3090.method4033(0, 0, this.field3118[0]);
                if (this.field3113 > 1) {
                    this.field3090.method4033(0, 1, this.field3118[1]);
                }
                if (this.field3114) {
                    this.field3090.method4033(0, 8, this.field3111);
                }
                this.field3099.method3372((byte) -94, this.field3090);
                this.field3099.method3307(this.field3104, 30909);
                this.field3104.method4036(1, 0);
                this.field3104.method4036(1, 8);
                this.field3104.method4034(this.field3110, 1, 0);
                this.field3104.method4034(this.field3117, 1, 8);
                this.field3099.method3372((byte) -94, this.field3104);
            }
            this.field3116 = false;
            this.field3119 = true;
        }
        if (this.field3119) {
            this.field3099.method3307(this.field3108, 30909);
            this.field3119 = !this.field3108.method4032(0);
            this.field3099.method3372((byte) -94, this.field3108);
        }
        return !this.field3119;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method1461(byte arg0) {
        field3094++;
        if (!this.field3096) {
            return;
        }
        if (this.field3104 != null) {
            this.field3099.method3353((byte) -70, this.field3104);
            int var2 = 16384;
            this.field3099.method3318(this.field3090, -31027);
            this.field3104.method4038(10498, 0);
            this.field3090.method4031(7, 0);
            if (this.field3114) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field3092, this.field3101, 0, 0, this.field3092, this.field3101, var2, 9728);
            this.field3099.method3317(this.field3104, false);
            this.field3099.method3327(this.field3090, false);
        }
        this.field3099.method3320(26936);
        this.field3099.method3308((byte) 76, 0);
        this.field3099.method3375(1, (byte) 102);
        this.field3099.method512();
        int var3 = 0;
        int var4 = 1;
        class364 var6;
        for (class364 var5 = (class364) this.field3105.method3731((byte) -91); var5 != null; var5 = var6) {
            var6 = (class364) this.field3105.method3729((byte) 89);
            int var7 = var5.method2189(1);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1192(this.field3118[var3], 7574, this.field3111, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field3099.method3372((byte) -94, this.field3090);
                    this.field3099.method3345(0, 0, (byte) 83);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3101);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3107, this.field3109);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3107, this.field3109 + this.field3101);
                    OpenGL.glTexCoord2f((float) this.field3092, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3107 + this.field3092, this.field3109 + this.field3101);
                    OpenGL.glTexCoord2f((float) this.field3092, (float) this.field3101);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3107 + this.field3092, this.field3109);
                    OpenGL.glEnd();
                } else {
                    this.field3090.method4031(7, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3101);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field3101);
                    OpenGL.glTexCoord2f((float) this.field3092, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3092, this.field3101);
                    OpenGL.glTexCoord2f((float) this.field3092, (float) this.field3101);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3092, 0);
                    OpenGL.glEnd();
                }
                var5.method1186(var8, 0);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field3096 = false;
        if (arg0 >= -108) {
            this.method1465(false);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1462(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3097++;
        if (this.field3108 == null || this.field3105.method3723((byte) 98)) {
            return false;
        }
        if (this.field3092 != arg4 || this.field3101 != arg0) {
            this.field3092 = arg4;
            this.field3101 = arg0;
            for (class766 var6 = this.field3105.method3731((byte) -114); var6 != this.field3105.field9375; var6 = var6.field10591) {
                ((class364) var6).method1189(this.field3101, false, this.field3092);
            }
            this.field3116 = true;
            this.field3120 = true;
            this.field3115 = true;
        }
        if (arg3 > -102) {
            this.method1468(71, null);
        }
        if (!this.method1460(35)) {
            return false;
        }
        this.field3109 = arg2;
        this.field3107 = arg1;
        this.field3096 = true;
        this.field3099.method3307(this.field3108, 30909);
        this.field3108.method4031(7, 0);
        this.field3099.method3345(this.field3101 + this.field3109 - this.field3099.field8015, -this.field3107, (byte) 83);
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method1463(int arg0) {
        if (arg0 < 44) {
            method1469(null, -15);
        }
        field3100 = null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z")
    public final boolean method1464(int arg0) {
        field3091++;
        if (arg0 != 10299) {
            this.method1467((byte) 125, null);
        }
        return this.field3108 != null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    private final void method1465(boolean arg0) {
        field3095++;
        boolean var2 = arg0;
        int var3 = 0;
        int var4 = 0;
        for (class364 var5 = (class364) this.field3105.method3731((byte) -80); var5 != null; var5 = (class364) this.field3105.method3729((byte) -125)) {
            int var9 = var5.method1185(-87);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2189(1);
            var2 |= var5.method2187((byte) -105);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3112 != var6) {
            this.field3112 = var6;
            this.field3115 = true;
        }
        int var7 = this.field3113 <= 2 ? this.field3113 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field3114) {
            this.field3114 = var2;
            this.field3120 = true;
        }
        if (var7 != var8) {
            this.field3116 = this.field3115 = true;
        }
        this.field3113 = var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1466(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLhp;)V")
    public final void method1467(byte arg0, class364 arg1) {
        arg1.field5168 = false;
        field3103++;
        arg1.method1183(false);
        if (arg0 == -75) {
            arg1.method4237(-1);
            this.method1465(false);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILhp;)Z")
    public final boolean method1468(int arg0, class364 arg1) {
        field3098++;
        if (arg0 < 2) {
            this.field3113 = -95;
        }
        if (this.field3108 != null) {
            if (arg1.method1187((byte) -78) || arg1.method1191(89)) {
                this.field3105.method3728((byte) 117, arg1);
                this.method1465(false);
                if (this.method1460(-113)) {
                    if (this.field3092 != -1 && this.field3101 != -1) {
                        arg1.method1189(this.field3101, false, this.field3092);
                    }
                    arg1.field5168 = true;
                    return true;
                }
            }
            this.method1467((byte) -75, arg1);
        }
        return false;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lcea;I)[Lpda;")
    public static final class157[] method1469(class111 arg0, int arg1) {
        field3106++;
        if (!arg0.method916((byte) 57)) {
            return new class157[0];
        }
        class746 var2 = arg0.method909(23132);
        while (var2.field10365 == 0) {
            class579.method3405(10L, 10);
        }
        if (var2.field10365 == 2) {
            return new class157[0];
        }
        int[] var3 = (int[]) var2.field10371;
        class157[] var4 = new class157[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class157 var6 = new class157();
            var4[var5] = var6;
            var6.field2458 = var3[var5 << 2];
            var6.field2459 = var3[(var5 << 2) + 1];
            var6.field2463 = var3[(var5 << 2) + 2];
            var6.field2461 = var3[(var5 << 2) + 3];
        }
        if (arg1 != 10) {
            field3100 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Llea;)V")
    public class212(class573 arg0) {
        this.field3099 = arg0;
        if (this.field3099.field8207 && this.field3099.field8220) {
            this.field3108 = this.field3090 = new class727(this.field3099);
            if (this.field3099.field8128 > 1 && this.field3099.field8240 && this.field3099.field8189) {
                this.field3108 = this.field3104 = new class727(this.field3099);
                return;
            }
        }
    }
}
