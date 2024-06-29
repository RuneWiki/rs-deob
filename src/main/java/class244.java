import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class244 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Lrp;")
    private class288 field3658 = new class288(64);

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public int field3671 = 0;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Llt;")
    private class458 field3665;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lsk;")
    public static class423 field3666 = new class423("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "Lsk;")
    public static class423 field3670 = new class423(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field3672 = 999999;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method1460(int arg0) {
        field3657++;
        if (arg0 != -22512) {
            this.field3658 = null;
        }
        class288 var2 = this.field3658;
        synchronized (this.field3658) {
            this.field3658.method1749((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)Lpb;")
    public final class448 method1461(int arg0, int arg1) {
        field3661++;
        class288 var3 = this.field3658;
        class448 var4;
        synchronized (this.field3658) {
            var4 = (class448) this.field3658.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3665.method2715(arg1, arg0, false);
        class448 var6 = new class448();
        var6.field6894 = this;
        var6.field6897 = arg1;
        if (var5 != null) {
            var6.method2679(-2, new class40(var5));
        }
        var6.method2680(false);
        class288 var7 = this.field3658;
        synchronized (this.field3658) {
            this.field3658.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lta;Z)I")
    public static final int method1462(class135 arg0, boolean arg1) {
        field3663++;
        if (arg1) {
            return 74;
        } else if (arg0.field2136 == 0) {
            return 0;
        } else {
            if (arg0.field2148 != -1) {
                class135 var2 = null;
                if (arg0.field2148 < 32768) {
                    var2 = class195.field3085[arg0.field2148];
                } else if (arg0.field2148 >= 32768) {
                    var2 = class224.field3450[arg0.field2148 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field3218 - var2.field3218;
                    int var4 = arg0.field3222 - var2.field3222;
                    if (var3 != 0 || var4 != 0) {
                        arg0.method896((byte) 13, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg0 instanceof class47) {
                class47 var5 = (class47) arg0;
                if (var5.field705 != -1 && (var5.field2231 == 0 || var5.field2233 > 0)) {
                    var5.method896((byte) 13, var5.field705);
                    var5.field705 = -1;
                }
            } else if (arg0 instanceof class249) {
                class249 var6 = (class249) arg0;
                if (var6.field3815 != -1 && (var6.field2231 == 0 || var6.field2233 > 0)) {
                    int var7 = var6.field3218 - (var6.field3815 - class381.field5550 - class381.field5550) * 64;
                    int var8 = var6.field3222 - ((var6.field3816 - class320.field4827 - class320.field4827) * 64);
                    if (var7 != 0 || var8 != 0) {
                        var6.method896((byte) 13, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                    }
                    var6.field3815 = -1;
                }
            }
            return arg0.method897((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public final void method1463(int arg0) {
        field3660++;
        class288 var2 = this.field3658;
        synchronized (this.field3658) {
            this.field3658.method1761(arg0 - 8725);
            if (arg0 != 8609) {
                field3672 = 91;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public static void method1464(int arg0) {
        field3666 = null;
        field3670 = null;
        if (arg0 <= 98) {
            field3670 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V")
    public final void method1465(int arg0, int arg1) {
        field3667++;
        class288 var3 = this.field3658;
        synchronized (this.field3658) {
            if (arg0 != -16937) {
                this.method1460(-76);
            }
            this.field3658.method1760(arg1, arg0 ^ 0xFFFFCB69);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(FIIFIFIFFILgg;)[B")
    public static final byte[] method1466(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, class111 arg10) {
        field3669++;
        byte[] var11 = new byte[arg1 * arg4 * arg2];
        if (arg9 != -7735) {
            method1468(false, null);
        }
        class24.method125(104, arg2, arg1, arg3, arg8, arg7, arg6, 0, arg0, arg10, arg5, var11, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1467(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field3668++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class157.field2475 + ((class456.field7001 - class157.field2475) * var6 / 100);
        if (class375.field5472 > var7) {
            var7 = class375.field5472;
        } else if (var7 > class112.field1904) {
            var7 = class112.field1904;
        }
        int var8 = arg5 * var7 * 512 / (arg1 * 334);
        if (class302.field4542 > var8) {
            short var9 = class302.field4542;
            var7 = arg1 * var9 * 334 / (arg5 * 512);
            if (var7 > class112.field1904) {
                var7 = class112.field1904;
                int var10 = var7 * 512 * arg5 / (var9 * 334);
                int var11 = (arg1 - var10) / 2;
                if (arg0) {
                    class345.field5116.method1966();
                    class345.field5116.method1943(arg4, -16777216, arg3, arg5, 1, var11);
                    class345.field5116.method1943(arg1 + arg4 - var11, -16777216, arg3, arg5, 1, var11);
                }
                arg4 += var11;
                arg1 -= var11 * 2;
            }
        } else if (var8 > class463.field7115) {
            short var12 = class463.field7115;
            var7 = arg1 * var12 * 334 / (arg5 * 512);
            if (class375.field5472 > var7) {
                var7 = class375.field5472;
                int var13 = arg1 * var12 * 334 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg0) {
                    class345.field5116.method1966();
                    class345.field5116.method1943(arg4, -16777216, arg3, var14, 1, arg1);
                    class345.field5116.method1943(arg4, -16777216, arg3 + arg5 - var14, var14, 1, arg1);
                }
                arg5 -= var14 * 2;
                arg3 += var14;
            }
        }
        class100.field1815 = (short) arg5;
        class384.field5590 = (short) arg1;
        if (arg2 != 11746) {
            field3670 = null;
        }
        class139.field2287 = arg4;
        class21.field270 = arg5 * var7 / 334;
        class157.field2472 = arg3;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZLqq;)V")
    public static final void method1468(boolean arg0, class318 arg1) {
        if (class381.field5555) {
            class217.method1334((byte) 92, arg1);
        } else {
            class388.method2310(69, arg1);
        }
        field3659++;
        if (!arg0) {
            method1467(true, 27, -61, -79, 85, 25);
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class244(class491 arg0, int arg1, class458 arg2) {
        this.field3665 = arg2;
        this.field3664 = this.field3665.method2726((byte) 113, 4);
    }
}
