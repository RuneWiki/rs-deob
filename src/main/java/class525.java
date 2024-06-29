import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class525 extends class518 {

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Z")
    private boolean field7263 = false;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "Lhea;")
    private class393 field7273;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "J")
    public static long field7267 = -1L;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "Z")
    public static boolean field7265 = false;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "F")
    public static float field7258;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIFIFFLue;IFFI[B)V")
    public static final void method2993(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7, class531 arg8, int arg9, float arg10, float arg11, int arg12, byte[] arg13) {
        ++field7266;
        int var14 = arg2 * arg5;
        float[] var15 = new float[var14];
        for (int var16 = 0; arg9 > var16; ++var16) {
            arg8.method1168(94, arg7 / (float) arg2, arg12, var15, arg5, arg10 * 127.0F, 0, arg11 / (float) arg5, arg0, arg2, arg6 / (float) arg12);
            int var19 = arg1;
            arg10 = arg4 * arg10;
            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                arg13[var19] = (byte) ((int) ((float) arg13[var19] + var15[var20]));
                ++var19;
            }
            arg7 *= 2.0F;
            arg11 *= 2.0F;
            arg6 *= 2.0F;
        }
        int var17 = arg1;
        for (int var18 = 0; var18 < var14; ++var18) {
            arg13[var17] = (byte) (arg13[var17] + 127);
            ++var17;
        }
        if (arg3 != 31664) {
            method2993(-65, 115, -107, -64, -0.5997803F, 102, 1.3279763F, -0.07873186F, (class531) null, 16, -0.97110647F, 0.4081603F, -26, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)V")
    public final void method1134(int arg0, boolean arg1, int arg2) {
        ++field7259;
        if (arg1) {
            this.method1133(true, 109);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
    public static final void method2994(int arg0, String arg1, String arg2, boolean arg3) {
        ++field7272;
        class245.field3315 = arg3;
        class82.field1022 = arg1;
        class67.field885 = arg2;
        if (!class245.field3315 && class168.field2105 != 3 && (class82.field1022.equals("") || class67.field885.equals(""))) {
            class689.method3818(3, arg0 ^ -122);
        } else {
            class367.field5274 = false;
            if (class168.field2105 != 1) {
                class477.field6444 = -1;
                class222.field2874 = 0;
            }
            class689.method3818(-3, 107);
            class243.field3275 = 1;
            class532.field7343 = 0;
            class518.field7147 = 0;
            if (arg0 != -1) {
                method2994(-41, (String) null, (String) null, false);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        ++field7260;
        if (this.field7263) {
            this.field7273.method2336((byte) 32, '\u0001');
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -98, (class254) null);
            super.field7145.method3488(0, (byte) 23);
        } else {
            super.field7145.method3557(arg0 + 8954, 770, 0, 5890);
        }
        if (arg0 != 6) {
            method2993(-108, -126, -18, -72, 1.3009254F, -46, 0.65249574F, 0.030231148F, (class531) null, -57, 0.30264482F, -2.1145792F, 99, (byte[]) null);
        }
        super.field7145.method3499(8448, 34161, 8448);
        this.field7263 = false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILdda;I)J")
    public static final long method2995(int arg0, int arg1, class289 arg2, int arg3) {
        ++field7270;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg0 != 34066) {
            return 25L;
        } else {
            long var8 = Long.MIN_VALUE;
            class252 var10 = class578.field7980.method1746(arg2.method130(-5582), (byte) 115);
            long var11 = (long) (1073741824 | arg1 | arg3 << 7 | arg2.method128((byte) 122) << 14 | arg2.method126(20377) << 20);
            if (~var10.field3453 == -1) {
                var11 |= var8;
            }
            if (var10.field3415 == 1) {
                var11 |= var4;
            }
            if (var10.field3484) {
                var11 |= var6;
            }
            return var11 | (long) arg2.method130(-5582) << 32;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        ++field7261;
        if (arg1 > 79) {
            super.field7145.method3499(7681, 34161, 8448);
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lpea;)V")
    public class525(class641 arg0) {
        super(arg0);
        if (arg0.field8964) {
            this.field7273 = new class393(arg0, 2);
            this.field7273.method2339(4864, 0);
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3499(7681, 34161, 34165);
            super.field7145.method3525(770, 34168, 2, true);
            super.field7145.method3557(8960, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7145.method3488(0, (byte) 23);
            this.field7273.method2338(-20555);
            this.field7273.method2339(4864, 1);
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3499(8448, 34161, 8448);
            super.field7145.method3525(770, 34166, 2, true);
            super.field7145.method3557(8960, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7145.method3488(0, (byte) 23);
            this.field7273.method2338(-20555);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z")
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            field7257 = -106;
        }
        ++field7262;
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLwq;I)V")
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        if (arg0 != 75) {
            field7269 = -115;
        }
        ++field7264;
        super.field7145.method3553((byte) -106, arg1);
        super.field7145.method3524(arg2, 14);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V")
    public final void method1139(boolean arg0, byte arg1) {
        ++field7271;
        class322 var3 = super.field7145.method3528(-122);
        if (this.field7273 != null && var3 != null && arg0) {
            this.field7273.method2336((byte) 32, '\u0000');
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -115, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7145.field8980.method2260((byte) 27), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field7145.method3488(0, (byte) 23);
            this.field7263 = true;
        } else {
            super.field7145.method3557(8960, 770, 0, 34168);
        }
        if (arg1 != 127) {
            field7265 = false;
        }
    }
}
