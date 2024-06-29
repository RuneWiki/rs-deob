import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class531 {

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Lau;")
    private class692 field7824 = new class692(64);

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "Lau;")
    public class692 field7831 = new class692(60);

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Lmv;")
    public class295 field7822;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Lmv;")
    private class295 field7826;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public int field7832;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILps;Lr;)V", line = 4)
    public static final void method3076(int arg0, class5 arg1, class98 arg2) {
        field7828++;
        boolean var3 = class259.field3355.method2385(arg1.field59, arg1.field86 ? class321.field4681.field1105 : null, arg2, arg1.field75, arg1.field171 | 0xFF000000, arg1.field108, arg1.field93, (byte) 115) == null;
        int var4 = -2 / ((47 - arg0) / 37);
        if (var3) {
            class268.field3506.method1909(new class74(arg1.field59, arg1.field108, arg1.field93, arg1.field171 | 0xFF000000, arg1.field75, arg1.field86), (byte) -81);
            class284.method1679(arg1, -29);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 21)
    public static final void method3077(int arg0, String arg1, int arg2) {
        field7827++;
        class489 var3 = class704.method3942(arg0, 3, 0);
        var3.method2797(arg2 + 18461);
        if (arg2 == -18462) {
            var3.field6939 = arg1;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method3078(boolean arg0) {
        if (arg0) {
            return;
        }
        field7823++;
        if (class229.field3042 != null && class641.field9196 != null) {
            return;
        }
        class229.field3042 = new int[256];
        class641.field9196 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class229.field3042[var1] = (int) (Math.sin(var2) * 4096.0D);
            class641.field9196[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIBII)V", line = 66)
    public static final void method3079(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7819++;
        if (arg3 >= class323.field4704 && arg3 <= class148.field2106) {
            int var5 = class79.method461((byte) 61, class375.field5631, arg4, class175.field2455);
            int var6 = class79.method461((byte) 46, class375.field5631, arg1, class175.field2455);
            class692.method3903(var6, var5, arg3, arg0, arg2 ^ 0xFFFFD586);
        }
        if (arg2 != -124) {
            method3077(-110, null, 126);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 85)
    public final void method3080(int arg0) {
        class692 var2 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3891(13747);
        }
        field7821++;
        if (arg0 <= 62) {
            method3078(false);
        }
        class692 var3 = this.field7831;
        synchronized (this.field7831) {
            this.field7831.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IB)V", line = 104)
    public final void method3081(int arg0, byte arg1) {
        class692 var3 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3900(arg0, 0);
        }
        if (arg1 != -16) {
            this.method3082((byte) -93, -51);
        }
        field7830++;
        class692 var4 = this.field7831;
        synchronized (this.field7831) {
            this.field7831.method3900(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)Ldw;", line = 124)
    public final class525 method3082(byte arg0, int arg1) {
        field7820++;
        class692 var3 = this.field7824;
        class525 var5;
        synchronized (this.field7824) {
            if (arg0 != 50) {
                return null;
            }
            var5 = (class525) this.field7824.method3901((long) arg1, -115);
        }
        if (var5 != null) {
            return var5;
        }
        class295 var6 = this.field7826;
        byte[] var7;
        synchronized (this.field7826) {
            var7 = this.field7826.method1844(class624.method3591(arg1, true), 31330, class19.method128((byte) 117, arg1));
        }
        class525 var8 = new class525();
        var8.field7455 = this;
        var8.field7463 = arg1;
        if (var7 != null) {
            var8.method2974((byte) 54, new class540(var7));
        }
        class692 var9 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3894(var8, (byte) 60, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V", line = 163)
    public final void method3083(byte arg0) {
        class692 var2 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3890(-1);
        }
        if (arg0 != -51) {
            this.field7831 = null;
        }
        field7817++;
        class692 var3 = this.field7831;
        synchronized (this.field7831) {
            this.field7831.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V", line = 179)
    public final void method3084(int arg0, int arg1) {
        this.field7832 = arg1;
        if (arg0 != 256) {
            this.field7826 = null;
        }
        field7818++;
        class692 var3 = this.field7831;
        synchronized (this.field7831) {
            this.field7831.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;)V", line = 227)
    public class531(class373 arg0, int arg1, class295 arg2, class295 arg3) {
        this.field7822 = arg3;
        this.field7826 = arg2;
        int var5 = this.field7826.method1816(-107) - 1;
        this.field7826.method1845(var5, true);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIZ)V", line = 199)
    public static final void method3085(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var9 = arg3 + 1;
        class41.method235(arg4, class565.field8253[arg3], 0, arg1, arg0);
        field7825++;
        int var8 = arg2 - 1;
        class41.method235(arg4, class565.field8253[arg2], 0, arg1, arg0);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class565.field8253[var6];
            var7[arg4] = var7[arg1] = arg0;
        }
        if (arg5) {
            ;
        }
    }
}
