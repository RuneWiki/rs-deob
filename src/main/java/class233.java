import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class233 {

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    public boolean field3531;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Z")
    public boolean field3550;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[S")
    public short[] field3545;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lki;")
    public class480 field3534;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field3532;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 3)
    private final void method1394(int arg0) {
        if (arg0 != 1280) {
            method1402(false, 59);
        }
        int var2 = this.field3546;
        if (var2 == 2) {
            this.field3538 = 0;
            this.field3536 = 1;
            this.field3544 = 2048;
            this.field3529 = 2048;
        } else if (var2 == 3) {
            this.field3536 = 1;
            this.field3538 = 0;
            this.field3529 = 4096;
            this.field3544 = 2048;
        } else if (var2 == 4) {
            this.field3544 = 2048;
            this.field3529 = 2048;
            this.field3536 = 4;
            this.field3538 = 0;
        } else if (var2 == 5) {
            this.field3529 = 8192;
            this.field3536 = 4;
            this.field3538 = 0;
            this.field3544 = 2048;
        } else if (var2 == 12) {
            this.field3536 = 2;
            this.field3529 = 2048;
            this.field3544 = 2048;
            this.field3538 = 0;
        } else if (var2 == 13) {
            this.field3529 = 8192;
            this.field3544 = 2048;
            this.field3536 = 2;
            this.field3538 = 0;
        } else if (var2 == 10) {
            this.field3544 = 512;
            this.field3538 = 1536;
            this.field3529 = 2048;
            this.field3536 = 3;
        } else if (var2 == 11) {
            this.field3529 = 4096;
            this.field3536 = 3;
            this.field3544 = 512;
            this.field3538 = 1536;
        } else if (var2 == 6) {
            this.field3538 = 1280;
            this.field3536 = 3;
            this.field3529 = 2048;
            this.field3544 = 768;
        } else if (var2 == 7) {
            this.field3529 = 4096;
            this.field3538 = 1280;
            this.field3544 = 768;
            this.field3536 = 3;
        } else if (var2 == 8) {
            this.field3536 = 3;
            this.field3544 = 1024;
            this.field3529 = 2048;
            this.field3538 = 1024;
        } else if (var2 == 9) {
            this.field3538 = 1024;
            this.field3544 = 1024;
            this.field3529 = 4096;
            this.field3536 = 3;
        } else if (var2 == 14) {
            this.field3544 = 768;
            this.field3538 = 1280;
            this.field3536 = 1;
            this.field3529 = 2048;
        } else if (var2 == 15) {
            this.field3536 = 1;
            this.field3538 = 1536;
            this.field3544 = 512;
            this.field3529 = 4096;
        } else if (var2 == 16) {
            this.field3529 = 8192;
            this.field3544 = 256;
            this.field3536 = 1;
            this.field3538 = 1792;
        } else {
            this.field3529 = 2048;
            this.field3536 = 0;
            this.field3544 = 2048;
            this.field3538 = 0;
        }
        field3533++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V", line = 204)
    public final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -4) {
            this.method1399(-85, 113, true);
        }
        this.field3529 = arg3;
        this.field3538 = arg2;
        field3540++;
        this.field3536 = arg4;
        this.field3544 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 219)
    public static void method1396(byte arg0) {
        int var1 = -53 % ((arg0 - 36) / 56);
        field3532 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I", line = 235)
    public static final int method1397(int arg0, byte arg1) {
        int var2 = 7 % ((-arg1 - 2) / 36);
        field3537++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILta;IILta;IIIIB)V", line = 250)
    public static final void method1398(int arg0, class135 arg1, int arg2, int arg3, class135 arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field3547++;
        int var10 = arg4.method334(-128);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class154 var12 = (class154) class129.field2073.method1752(0, (long) var10);
        if (var12 == null) {
            class351[] var13 = class351.method2137(class472.field7225, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class345.field5116.method1952(var13[0], true);
            class129.field2073.method1758(1, var12, (long) var10);
        }
        class149.method973(arg8 >> 1, 0, arg2, arg1.method337(0) * 64, arg1.field3222, 0, arg1.field3218, arg5 >> 1, arg3, arg1.field3217);
        int var14 = arg6 + class161.field2529[0] - 18;
        int var15 = arg0 - (-class161.field2529[1] + 16) - 54;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = arg7 % 4 * 18 + var15;
        var12.method994(var16, var17);
        if (arg9 < 54) {
            field3532 = null;
        }
        if (arg1 == arg4) {
            class345.field5116.method1920(18, -256, var16 - 1, 18, 22437, var17 - 1);
        }
        class486 var18 = class431.method2528(-6016);
        var18.field7409 = var17;
        var18.field7403 = arg4;
        var18.field7401 = var16;
        var18.field7404 = var17 + 16;
        var18.field7405 = var16 + 16;
        class382.field5559.method1321((byte) 0, var18);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ)V", line = 304)
    public final void method1399(int arg0, int arg1, boolean arg2) {
        field3551++;
        if (arg1 != -767211645) {
            method1396((byte) 67);
        }
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field3529 * arg0 / 50 + this.field3535 & 0x7FF;
            int var6 = this.field3536;
            if (var6 == 1) {
                var4 = (class195.field3075[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class230.field3509[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field3534.method929(true, (float) ((this.field3544 * var4 >> 11) + this.field3538) / 2048.0F);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 382)
    public static final void method1400(boolean arg0) {
        if (class462.field7108 != null) {
            class462.field7108.method1642(-2955);
        }
        field3542++;
        if (arg0) {
            method1402(true, -64);
        }
        if (class386.field5607 != null) {
            class386.field5607.method1642(-2955);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIILqq;I)V", line = 403)
    private final void method1401(int arg0, int arg1, int arg2, int arg3, int arg4, class318 arg5, int arg6) {
        field3543++;
        this.field3534 = arg5.method1894(arg3, arg4, arg0, arg6, arg2, 1.0F);
        if (arg1 != -1) {
            method1397(22, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V", line = 421)
    public static final void method1402(boolean arg0, int arg1) {
        if (arg0) {
            method1398(67, null, 66, 10, null, 114, 89, -66, 90, (byte) 35);
        }
        field3539++;
        class64 var2 = class230.method1387(arg1, (byte) 40, 14);
        var2.method446(-20033);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 433)
    protected class233() {
        if (class230.field3509 == null) {
            class137.method908((byte) 34);
        }
        this.method1394(1280);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lqq;Lha;I)V", line = 443)
    public class233(class318 arg0, class40 arg1, int arg2) {
        if (class230.field3509 == null) {
            class137.method908((byte) 34);
        }
        this.field3541 = arg1.method257((byte) 33);
        this.field3531 = (this.field3541 & 0x8) != 0;
        this.field3550 = (this.field3541 & 0x10) != 0;
        this.field3541 &= 0x7;
        int var4 = arg1.method254((byte) -99) << arg2;
        int var5 = arg1.method254((byte) -109) << arg2;
        int var6 = arg1.method254((byte) -100) << arg2;
        int var7 = arg1.method257((byte) 77);
        int var8 = var7 * 2 + 1;
        this.field3545 = new short[var8];
        for (int var9 = 0; var9 < this.field3545.length; var9++) {
            short var13 = (short) arg1.method254((byte) -97);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field3545[var9] = (short) class318.method1973(var15, var14 << 8);
        }
        int var10 = (var7 << class239.field3602) + class42.field621;
        int var11 = class327.field4907 == null ? class143.field2332[class460.method2751(arg1.method254((byte) -125), 903) & 0xFFFF] : class327.field4907[arg1.method254((byte) -78)];
        int var12 = arg1.method257((byte) 96);
        this.field3535 = (var12 & 0xE0) << 3;
        this.field3546 = var12 & 0x1F;
        if (this.field3546 != 31) {
            this.method1394(1280);
        }
        this.method1401(var5, -1, var11, var4, var6, arg0, var10);
    }
}
