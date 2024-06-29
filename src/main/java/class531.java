import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class531 extends class76 {

    @OriginalMember(owner = "client!iba", name = "V", descriptor = "Z")
    public boolean field7567;

    @OriginalMember(owner = "client!iba", name = "R", descriptor = "F")
    public float field7564;

    @OriginalMember(owner = "client!iba", name = "W", descriptor = "F")
    public float field7568;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!iba", name = "X", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!iba", name = "Y", descriptor = "Lsca;")
    public static class46 field7570 = null;

    @OriginalMember(owner = "client!iba", name = "Z", descriptor = "Lqe;")
    public static class469 field7571 = new class469(38, 0);

    @OriginalMember(owner = "client!iba", name = "Q", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!iba", name = "ab", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!iba", name = "P", descriptor = "[I")
    public static int[] field7562;

    @OriginalMember(owner = "client!iba", name = "U", descriptor = "[Ls;")
    public static class280[] field7566;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(JI)V", line = 3)
    public static final void method3103(long arg0, int arg1) {
        ++field7563;
        int var3 = class130.field1749.field8423 - -class309.field4385;
        int var4 = class633.field8863 + class130.field1749.field8428;
        if (-var3 + class383.field5783 < -2000 || ~(class383.field5783 - var3) < -2001 || class398.field5951 - var4 < -2000 || ~(-var4 + class398.field5951) < -2001) {
            class383.field5783 = var3;
            class398.field5951 = var4;
        }
        if (class383.field5783 != var3) {
            int var5 = -class383.field5783 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 != 0) {
                    if (~var6 > ~var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (~var6 == -1) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class383.field5783 += var6;
        }
        class255.field3659 += (float) arg0 * class32.field330 / 6.0F;
        if (class398.field5951 != var4) {
            int var7 = -class398.field5951 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (~var8 == -1) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (~var8 == -1) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class398.field5951 += var8;
        }
        class418.field6261 += (float) arg0 * class724.field10112 / 6.0F;
        class378.method2444(false);
        if (arg1 != 0) {
            field7571 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)V", line = 88)
    public static void method3104(int arg0) {
        if (arg0 == -5231) {
            field7571 = null;
            field7570 = null;
            field7566 = null;
            field7562 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIZ[III)V", line = 101)
    public class531(class148 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field2957 == 34037) {
            this.field7567 = false;
            this.field7564 = (float) arg2;
            this.field7568 = (float) arg3;
        } else {
            this.field7567 = true;
            this.field7564 = this.field7568 = 1.0F;
        }
        this.field7561 = arg2;
        this.field7569 = arg3;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIII)V", line = 122)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7567 = false;
        this.field7561 = arg2;
        this.field7568 = (float) arg3 / (float) arg5;
        this.field7569 = arg3;
        this.field7564 = (float) arg2 / (float) arg4;
        this.method636(false, 10497, false);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIII[BI)V", line = 136)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7569 = arg3;
        this.field7561 = arg2;
        this.method635(0, arg2, arg6, 0, arg3, 0, arg7, true, 0, 0);
        this.field7568 = (float) arg3 / (float) arg5;
        this.field7567 = false;
        this.field7564 = (float) arg2 / (float) arg4;
        this.method636(false, 10497, false);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIII)V", line = 151)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7569 = arg4;
        this.field7561 = arg3;
        if (~super.field2957 == -34038) {
            this.field7567 = false;
            this.field7568 = (float) arg4;
            this.field7564 = (float) arg3;
        } else {
            this.field7567 = true;
            this.field7564 = this.field7568 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIIIIZ)V", line = 172)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7569 = arg4;
        this.field7567 = false;
        this.field7564 = (float) arg3 / (float) arg5;
        this.field7561 = arg3;
        this.field7568 = (float) arg4 / (float) arg6;
        this.method636(false, 10497, false);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIIZ[BI)V", line = 185)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field7569 = arg4;
        if (super.field2957 == 34037) {
            this.field7568 = (float) arg4;
            this.field7567 = false;
            this.field7564 = (float) arg3;
        } else {
            this.field7564 = this.field7568 = 1.0F;
            this.field7567 = true;
        }
        this.field7561 = arg3;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIIIIZ)V", line = 210)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field2957 == 34037) {
            this.field7564 = (float) arg4;
            this.field7568 = (float) arg5;
            this.field7567 = false;
        } else {
            this.field7567 = true;
            this.field7564 = this.field7568 = 1.0F;
        }
        this.field7569 = arg5;
        this.field7561 = arg4;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwh;IIII[I)V", line = 236)
    public class531(class148 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7569 = arg2;
        this.field7561 = arg1;
        this.method634(arg1, 0, 0, arg5, true, arg2, 4, 0, 0);
        this.field7568 = (float) arg2 / (float) arg4;
        this.field7567 = false;
        this.field7564 = (float) arg1 / (float) arg3;
        this.method636(false, 10497, false);
    }
}
