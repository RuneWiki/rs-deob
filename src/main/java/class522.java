import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class522 {

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Llh;")
    private class364 field7655 = new class364(64);

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Llh;")
    public class364 field7665 = new class364(50);

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "Ltg;")
    public class153 field7668 = new class153(250);

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "Lvh;")
    private class240 field7670 = new class240();

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lhh;")
    public class84 field7659;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
    private boolean field7646;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public int field7664;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Lhh;")
    private class84 field7653;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Let;")
    private class418 field7673;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field7658;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field7672;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field7674;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Lao;")
    public static class188 field7662 = new class188(97, 15);

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Lao;")
    public static class188 field7663 = new class188(15, 2);

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Lvp;")
    public static class123 field7667 = new class123(21, 3);

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "[I")
    public static int[] field7671 = new int[1000];

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "Lgf;")
    public static class180 field7669 = new class180("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lao;")
    public static class188 field7676 = new class188(72, 9);

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "Z")
    public static boolean field7677 = false;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "[[I")
    public static int[][] field7666;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILqn;ILqa;Loa;Lqa;IZIIIZ)Lf;")
    public final class528 method3073(int arg0, class45 arg1, int arg2, class162 arg3, class488 arg4, class162 arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field7656++;
        class528 var13 = this.method3084(arg6, arg5, arg10, arg2, arg8, (byte) 76, arg1, arg0);
        if (var13 != null) {
            return var13;
        }
        class172 var14 = this.method3077(48, arg0);
        if (arg6 > 1 && var14.field2635 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg6 >= var14.field2610[var16] && var14.field2610[var16] != 0) {
                    var15 = var14.field2635[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3077(16, var15);
            }
        }
        int var17 = 8 / ((-arg9 - 86) / 33);
        int[] var18 = var14.method1228(arg6, arg1, arg3, arg11, arg4, arg2, arg8, false, arg5, arg10);
        if (var18 == null) {
            return null;
        }
        class528 var19;
        if (arg7) {
            var19 = arg3.method527(var18, 0, 36, 36, 32);
        } else {
            var19 = arg5.method527(var18, 0, 36, 36, 32);
        }
        if (!arg7) {
            class240 var20 = new class240();
            var20.field3492 = arg8;
            var20.field3488 = arg1 != null;
            var20.field3486 = arg5.field2452;
            var20.field3494 = arg2;
            var20.field3493 = arg6;
            var20.field3495 = arg10;
            var20.field3485 = arg0;
            this.field7668.method1106(-1, var19, var20);
        }
        return var19;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
    public final void method3074(int arg0, int arg1) {
        if (arg1 != 2) {
            method3081(59, 93, false, -61, (byte) -123, 93);
        }
        field7660++;
        this.field7675 = arg0;
        class364 var3 = this.field7665;
        synchronized (this.field7665) {
            this.field7665.method2349(0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public final void method3075(int arg0) {
        field7657++;
        class364 var2 = this.field7665;
        synchronized (this.field7665) {
            this.field7665.method2349(arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public final void method3076(int arg0) {
        field7647++;
        class153 var2 = this.field7668;
        synchronized (this.field7668) {
            if (arg0 != -2) {
                this.method3084(-41, null, 104, -87, -48, (byte) -122, null, 43);
            }
            this.field7668.method1108(0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Lrh;")
    public final class172 method3077(int arg0, int arg1) {
        field7644++;
        class364 var3 = this.field7655;
        class172 var4;
        synchronized (this.field7655) {
            var4 = (class172) this.field7655.method2339(-109, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 3 % ((arg0 + 71) / 49);
        byte[] var6 = this.field7653.method683(class401.method2496(arg1, (byte) 15), class525.method3104(arg1, 109), 5);
        class172 var7 = new class172();
        var7.field2604 = this;
        var7.field2636 = arg1;
        var7.field2606 = new String[] { null, null, class470.field6912.method1273(true, this.field7664), null, null };
        var7.field2593 = new String[] { null, null, null, null, class1.field4.method1273(true, this.field7664) };
        if (var6 != null) {
            var7.method1218((byte) -24, new class303(var6));
        }
        var7.method1220(-3676);
        if (var7.field2589 != -1) {
            var7.method1230(this.method3077(-126, var7.field2589), 1, this.method3077(-127, var7.field2602));
        }
        if (var7.field2574 != -1) {
            var7.method1217(this.method3077(18, var7.field2574), true, this.method3077(119, var7.field2615));
        }
        if (!this.field7646 && var7.field2614) {
            var7.field2569 = class196.field2890.method1273(true, this.field7664);
            var7.field2556 = null;
            var7.field2591 = 0;
            var7.field2593 = this.field7674;
            var7.field2597 = false;
            var7.field2606 = this.field7672;
            if (var7.field2613 != null) {
                boolean var8 = false;
                for (class439 var9 = var7.field2613.method2483(-37); var9 != null; var9 = var7.field2613.method2481((byte) -27)) {
                    class93 var10 = this.field7673.method2570((byte) -32, (int) var9.field6399);
                    if (var10.field1532) {
                        var9.method2663(-122);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2613 = null;
                }
            }
        }
        class364 var11 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method2342((long) arg1, var7, -79);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
    public final void method3078(int arg0) {
        class364 var2 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method2350((byte) 112);
        }
        field7654++;
        class364 var3 = this.field7665;
        synchronized (this.field7665) {
            this.field7665.method2350((byte) 112);
        }
        class153 var4 = this.field7668;
        synchronized (this.field7668) {
            this.field7668.method1114(-7991);
            if (arg0 >= -106) {
                this.field7653 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V")
    public final void method3079(boolean arg0, byte arg1) {
        field7651++;
        if (this.field7646 == arg0) {
            return;
        }
        if (arg1 != 108) {
            method3081(-98, -73, true, -47, (byte) 69, -68);
        }
        this.field7646 = arg0;
        this.method3080(15);
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
    public final void method3080(int arg0) {
        class364 var2 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method2349(0);
        }
        field7652++;
        class364 var3 = this.field7665;
        synchronized (this.field7665) {
            this.field7665.method2349(0);
            if (arg0 != 15) {
                this.method3084(75, null, 14, 74, 122, (byte) 114, null, -67);
            }
        }
        class153 var4 = this.field7668;
        synchronized (this.field7668) {
            this.field7668.method1108(0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIZIBI)V")
    public static final void method3081(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field7661++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class303.field4352 - class5.field80) * var6 / 100 + class5.field80;
        if (var7 < class249.field3586) {
            var7 = class249.field3586;
        } else if (var7 > class359.field5433) {
            var7 = class359.field5433;
        }
        if (arg4 != -38) {
            field7669 = null;
        }
        int var8 = arg1 * var7 * 512 / (arg3 * 334);
        if (var8 < class355.field5370) {
            short var12 = class355.field5370;
            var7 = arg3 * 334 * var12 / (arg1 * 512);
            if (var7 > class359.field5433) {
                var7 = class359.field5433;
                int var13 = arg1 * var7 * 512 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg2) {
                    class394.field5821.method492();
                    class394.field5821.method1175(var14, arg4 + 46, arg5, -16777216, arg1, arg0);
                    class394.field5821.method1175(var14, 8, arg3 + arg5 - var14, -16777216, arg1, arg0);
                }
                arg5 += var14;
                arg3 -= var14 * 2;
            }
        } else if (class479.field7030 < var8) {
            short var9 = class479.field7030;
            var7 = var9 * 334 * arg3 / (arg1 * 512);
            if (var7 < class249.field3586) {
                var7 = class249.field3586;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg2) {
                    class394.field5821.method492();
                    class394.field5821.method1175(arg3, 8, arg5, -16777216, var11, arg0);
                    class394.field5821.method1175(arg3, 8, arg5, -16777216, var11, arg0 + arg1 - var11);
                }
                arg0 += var11;
                arg1 -= var11 * 2;
            }
        }
        class147.field2167 = arg1 * var7 / 334;
        class369.field5526 = (short) arg3;
        class134.field2067 = arg0;
        class382.field5685 = (short) arg1;
        class182.field2749 = arg5;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)V")
    public static void method3082(int arg0) {
        field7663 = null;
        field7662 = null;
        field7667 = null;
        field7676 = null;
        field7666 = null;
        if (arg0 != 50) {
            field7666 = null;
        }
        field7671 = null;
        field7669 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V")
    public final void method3083(int arg0, boolean arg1) {
        field7650++;
        class364 var3 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method2348(arg0, -126);
        }
        class364 var4 = this.field7665;
        synchronized (this.field7665) {
            this.field7665.method2348(arg0, 28);
        }
        class153 var5 = this.field7668;
        synchronized (this.field7668) {
            if (arg1) {
                this.field7668.method1115((byte) -49, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILqa;IIIBLqn;I)Lf;")
    public final class528 method3084(int arg0, class162 arg1, int arg2, int arg3, int arg4, byte arg5, class45 arg6, int arg7) {
        this.field7670.field3494 = arg3;
        if (arg5 <= 19) {
            this.method3084(-20, null, -7, 8, -126, (byte) -56, null, 45);
        }
        this.field7670.field3495 = arg2;
        this.field7670.field3492 = arg4;
        this.field7670.field3485 = arg7;
        this.field7670.field3488 = arg6 != null;
        field7649++;
        this.field7670.field3486 = arg1.field2452;
        this.field7670.field3493 = arg0;
        return (class528) this.field7668.method1113(this.field7670, 126);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIBI)V")
    public static final void method3085(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7648++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -72 % ((65 - arg3) / 38);
        int var9 = -1;
        int var10 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 + arg1);
        int var11 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 - arg1);
        class217.method1448(class436.field6332[arg0], var11, arg4, 4, var10);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var12 = arg0 - var6;
                int var13 = arg0 + var6;
                if (class229.field3347 <= var13 && var12 <= class156.field2366) {
                    int var14 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 + var5);
                    int var15 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 - var5);
                    if (class156.field2366 >= var13) {
                        class217.method1448(class436.field6332[var13], var15, arg4, 4, var14);
                    }
                    if (class229.field3347 <= var12) {
                        class217.method1448(class436.field6332[var12], var15, arg4, 4, var14);
                    }
                }
            }
            var5++;
            int var16 = arg0 - var5;
            int var17 = arg0 + var5;
            if (var17 >= class229.field3347 && var16 <= class156.field2366) {
                int var18 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 + var6);
                int var19 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 - var6);
                if (var17 <= class156.field2366) {
                    class217.method1448(class436.field6332[var17], var19, arg4, 4, var18);
                }
                if (class229.field3347 <= var16) {
                    class217.method1448(class436.field6332[var16], var19, arg4, 4, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lmt;IZLet;Lhh;Lhh;)V")
    public class522(class271 arg0, int arg1, boolean arg2, class418 arg3, class84 arg4, class84 arg5) {
        this.field7659 = arg5;
        this.field7646 = arg2;
        this.field7664 = arg1;
        this.field7653 = arg4;
        this.field7673 = arg3;
        if (this.field7653 == null) {
            this.field7658 = 0;
        } else {
            int var7 = this.field7653.method658((byte) -114) - 1;
            this.field7658 = var7 * 256 + this.field7653.method656((byte) 122, var7);
        }
        this.field7672 = new String[] { null, null, class470.field6912.method1273(true, this.field7664), null, null };
        this.field7674 = new String[] { null, null, null, null, class1.field4.method1273(true, this.field7664) };
    }
}
