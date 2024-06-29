import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class709 extends class738 {

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field9969;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field9968;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field9962;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field9961;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field9963 = -1;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[F")
    public static float[] field9960 = new float[4];

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9966;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILgt;ILrq;Ll;IBI)V", line = 3)
    public static final void method3965(int arg0, class571 arg1, int arg2, class482 arg3, class639 arg4, int arg5, byte arg6, int arg7) {
        ++field9972;
        class654 var8 = new class654();
        var8.field9359 = arg0 << 9;
        if (arg6 != -14) {
            method3968((byte) -66);
        }
        var8.field9371 = arg5;
        var8.field9379 = arg2 << 9;
        if (arg3 == null) {
            if (arg1 != null) {
                var8.field9383 = arg1;
                class521 var9 = arg1.field8235;
                if (var9.field7535 != null) {
                    var8.field9367 = true;
                    var9 = var9.method3166(class226.field3372, true);
                }
                if (var9 != null) {
                    var8.field9362 = var9.field7512 + arg2 << 9;
                    var8.field9368 = var9.field7512 + arg0 << 9;
                    var8.field9354 = class491.method2990(false, arg1);
                    var8.field9380 = var9.field7566 << 9;
                    var8.field9377 = var9.field7531;
                    var8.field9382 = var9.field7570;
                    var8.field9373 = var9.field7537;
                    var8.field9355 = var9.field7528;
                }
                class337.field4661.method3559(var8, (byte) 12);
                return;
            }
            if (arg4 != null) {
                var8.field9366 = arg4;
                var8.field9362 = arg2 + arg4.method2053(true) << 9;
                var8.field9368 = arg0 - -arg4.method2053(true) << 9;
                var8.field9354 = class240.method1658(30200, arg4);
                var8.field9380 = arg4.field9077 << 9;
                var8.field9373 = arg4.field9092;
                var8.field9355 = arg4.field9091;
                var8.field9382 = 256;
                var8.field9377 = 256;
                class675.field9602.method4022(var8, arg6 ^ 43, (long) arg4.field4592);
                return;
            }
        } else {
            var8.field9356 = arg3;
            int var10 = arg3.field6936;
            int var11 = arg3.field6879;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg3.field6936;
                var10 = arg3.field6879;
            }
            var8.field9382 = arg3.field6881;
            var8.field9361 = arg3.field6941;
            var8.field9354 = arg3.field6962;
            var8.field9368 = arg0 + var11 << 9;
            var8.field9378 = arg3.field6888;
            var8.field9380 = arg3.field6898 << 9;
            var8.field9372 = arg3.field6908;
            var8.field9373 = arg3.field6909;
            var8.field9365 = arg3.field6944;
            var8.field9355 = arg3.field6955;
            var8.field9377 = arg3.field6928;
            var8.field9362 = arg2 - -var10 << 9;
            if (arg3.field6900 != null) {
                var8.field9367 = true;
                var8.method3752(1024);
            }
            if (var8.field9365 != null) {
                var8.field9360 = var8.field9378 - -((int) (Math.random() * (double) (var8.field9361 - var8.field9378)));
            }
            class451.field6446.method3559(var8, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 105)
    public static final void method3966(int arg0) {
        class518.field7465 = arg0;
        for (int var1 = 0; var1 < class439.field6264; ++var1) {
            for (int var2 = 0; var2 < class408.field5806; ++var2) {
                if (class565.field8185[arg0][var1][var2] == null) {
                    class565.field8185[arg0][var1][var2] = new class375(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZI)V", line = 131)
    public final void method85(int arg0, boolean arg1, int arg2) {
        ++field9971;
        if (!arg1) {
            this.field9969 = -79;
        }
        int var4 = this.field9961 * arg0 >> 12;
        int var5 = this.field9968 * arg0 >> 12;
        int var6 = this.field9969 * arg2 >> 12;
        int var7 = this.field9962 * arg2 >> 12;
        class133.method941(super.field10310, var6, var5, super.field10312, var4, super.field10305, var7, 23352);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZI)I", line = 151)
    public static final int method3967(int arg0, int arg1, boolean arg2, int arg3) {
        ++field9964;
        class37 var4 = class582.method3429(arg2, (byte) -100, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg0 != 9303) {
                method3966(29);
            }
            int var5 = 0;
            for (int var6 = 0; ~var6 > ~var4.field332.length; ++var6) {
                if (~var4.field334[var6] == ~arg1) {
                    var5 += var4.field332[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 186)
    public static void method3968(byte arg0) {
        field9960 = null;
        field9966 = null;
        if (arg0 != -69) {
            field9963 = -119;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V", line = 198)
    public final void method83(byte arg0, int arg1, int arg2) {
        ++field9965;
        if (arg0 == 81) {
            int var4 = this.field9961 * arg1 >> 12;
            int var5 = this.field9968 * arg1 >> 12;
            int var6 = this.field9969 * arg2 >> 12;
            int var7 = this.field9962 * arg2 >> 12;
            class292.method1835(var4, super.field10312, -10168, var7, var6, var5);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 219)
    public final void method84(int arg0, int arg1, int arg2) {
        ++field9970;
        if (arg2 != 34065) {
            this.field9968 = -128;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIII)V", line = 239)
    public class709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9969 = arg1;
        this.field9968 = arg2;
        this.field9962 = arg3;
        this.field9961 = arg0;
    }
}
