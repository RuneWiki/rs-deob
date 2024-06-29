import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class227 extends class32 {

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[I")
    private int[] field3146 = new int[this.field447];

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "[B")
    private byte[] field3152;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZ)V")
    public final void method293(int arg0, int arg1, boolean arg2) {
        this.field3155 += this.field3146[arg1] * arg0 >> 12;
        if (arg2) {
            ++field3150;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIF)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field447 < ~var7; ++var7) {
            this.field3146[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3151;
        if (~(2 & class302.field4122[0][arg2][arg4]) != -1) {
            return true;
        } else {
            if (arg0 != -21801) {
                method1484(true, (class323) null, 22, (byte[][]) null, (class58) null, (byte[][]) null, (byte[][]) null, (byte) -45, (class323) null, -51, (int[][]) null, (byte[][]) null, -2);
            }
            if (~(16 & class302.field4122[arg1][arg2][arg4]) != -1) {
                return false;
            } else {
                return class130.method973(arg1, (byte) -118, arg2, arg4) == arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLdn;I[[BLea;[[B[[BBLdn;I[[I[[BI)V")
    public static final void method1484(boolean arg0, class323 arg1, int arg2, byte[][] arg3, class58 arg4, byte[][] arg5, byte[][] arg6, byte arg7, class323 arg8, int arg9, int[][] arg10, byte[][] arg11, int arg12) {
        ++field3147;
        if (~class22.field284 == -1 && !class319.field4357) {
            class143.method1038(arg3, arg9, arg4, arg6, arg0, arg12, arg5, arg10, arg11, arg1, 23312, arg2, arg8);
        } else {
            class245.method1596(arg5, arg3, arg12, arg6, arg10, arg11, arg4, arg9, (byte) 2, arg0, arg8, arg1, arg2);
        }
        if (arg7 >= -112) {
            method1483(-104, 3, -76, -85, -22);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILea;B)V")
    public static final void method1485(int arg0, int arg1, class58 arg2, byte arg3) {
        if (arg3 != 73) {
            method1485(43, -88, (class58) null, (byte) 72);
        }
        class144.field2108 = arg2;
        class389.field5423 = new class141[arg1][arg0];
        ++field3144;
        if (class267.field3667 != null) {
            class451.field6493 = class370.method2321(class267.field3667[1], class267.field3667[0], class267.field3667[4], class267.field3667[3], class267.field3667[5], class267.field3667[2], 303);
        }
        class367.field5098 = new class141();
        class418.method2581(-65);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public final void method291(int arg0) {
        int var2 = -53 / ((arg0 - -36) / 51);
        this.field3153 = 0;
        ++field3142;
        this.field3155 = 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
    public void method1422(int arg0, byte arg1) {
        this.field3152[this.field3153++] = (byte) (127 + class187.method1301(arg1 >> 1, 127));
        ++field3145;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public final void method299(boolean arg0) {
        this.field3155 = Math.abs(this.field3155);
        if (!arg0) {
            ++field3154;
            if (this.field3155 >= 4096) {
                this.field3155 = 4095;
            }
            this.method1422(this.field3153++, (byte) (this.field3155 >> 4));
            this.field3155 = 0;
        }
    }
}
