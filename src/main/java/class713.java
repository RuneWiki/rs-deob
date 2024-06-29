import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class713 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    private int field9965;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    private int field9966;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Z")
    private boolean field9976;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Z")
    private boolean field9970;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field9969 = -1;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field9972 = 0;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    public static int[] field9979 = new int[13];

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)V")
    public static final void method3984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9977++;
        if (class495.field6845 >= arg4 && arg0 >= class523.field7178) {
            boolean var6;
            if (arg1 < class174.field2335) {
                var6 = false;
                arg1 = class174.field2335;
            } else if (arg1 <= class751.field10402) {
                var6 = true;
            } else {
                arg1 = class751.field10402;
                var6 = false;
            }
            boolean var7;
            if (arg3 < class174.field2335) {
                arg3 = class174.field2335;
                var7 = false;
            } else if (arg3 <= class751.field10402) {
                var7 = true;
            } else {
                arg3 = class751.field10402;
                var7 = false;
            }
            if (arg4 < class523.field7178) {
                arg4 = class523.field7178;
            } else {
                class138.method1069(class785.field10808[arg4++], (byte) 123, arg1, arg3, arg2);
            }
            if (arg0 > class495.field6845) {
                arg0 = class495.field6845;
            } else {
                class138.method1069(class785.field10808[arg0--], (byte) -28, arg1, arg3, arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class785.field10808[var8];
                    var9[arg1] = var9[arg3] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class785.field10808[var11][arg1] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class785.field10808[var10][arg3] = arg2;
                }
            }
        }
        if (arg5 != -3145) {
            method3985(2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)J")
    public static final long method3985(int arg0) {
        if (arg0 != 1727) {
            method3984(-5, 88, -41, -48, 28, -45);
        }
        field9974++;
        return class89.field1236.method604((byte) 64);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
    public final int method3986(int arg0) {
        if (arg0 < 104) {
            field9979 = null;
        }
        field9978++;
        return this.field9965;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
    public static final void method3987(boolean arg0, byte arg1) {
        if (arg0) {
            if (class69.field968 != -1) {
                class506.method2929(95, class69.field968);
            }
            for (class237 var2 = (class237) class609.field8283.method3960(0); var2 != null; var2 = (class237) class609.field8283.method3955((byte) -126)) {
                if (!var2.method790(1)) {
                    var2 = (class237) class609.field8283.method3960(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class618.method3397(false, true, var2, -86709072);
            }
            class69.field968 = -1;
            class609.field8283 = new class706(8);
            class786.method4345(94);
            class69.field968 = class739.field10206;
            class503.method2921(-105, false);
            class229.method1502(0);
            class173.method1226(class69.field968);
        }
        field9975++;
        class582.method3241(false);
        class256.field3816 = false;
        class326.method2065(77);
        class660.field9129 = -1;
        class735.method4077(-101, class118.field1724);
        class551.field7456 = new class73();
        class551.field7456.field2257 = class597.field8132 * 512 / 2;
        class551.field7456.field1890[0] = class597.field8132 / 2;
        class551.field7456.field2259 = class628.field8800 * 512 / 2;
        class350.field5138 = 0;
        class634.field8856 = 0;
        class551.field7456.field1884[0] = class628.field8800 / 2;
        int var3 = -43 / ((20 - arg1) / 37);
        if (class502.field6938 == 2) {
            class350.field5138 = class563.field7552 << 9;
            class634.field8856 = class76.field1101 << 9;
        } else {
            class306.method1939(3);
        }
        class596.method3322((byte) 103);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Z")
    public final boolean method3988(int arg0) {
        field9968++;
        return arg0 == 0 ? this.field9970 : false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method3989(byte arg0) {
        field9979 = null;
        if (arg0 >= -4) {
            method3989((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
    public final int method3990(int arg0) {
        field9973++;
        if (arg0 != -20773) {
            this.method3988(-51);
        }
        return this.field9966;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method3991(boolean arg0, String[] arg1) {
        field9967++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (!arg0) {
            method3984(-49, -112, -101, -11, 117, -121);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z")
    public final boolean method3992(byte arg0) {
        if (arg0 != -37) {
            this.method3986(-94);
        }
        field9971++;
        return this.field9976;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(ZIIZ)V")
    public class713(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field9965 = arg1;
        this.field9966 = arg2;
        this.field9976 = arg0;
        this.field9970 = arg3;
    }
}
