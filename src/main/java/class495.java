import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class495 extends class516 {

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
    private boolean field7046 = false;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BZ)V")
    public final void method199(byte arg0, boolean arg1) {
        ++field7044;
        class31 var3 = super.field7353.method2603((byte) 98);
        int var4 = -127 / ((63 - arg0) / 38);
        if (var3 != null && arg1) {
            super.field7353.method2646(1, 127);
            super.field7353.method2632(var3, 0);
            super.field7353.method2651((byte) -106, class253.field3653);
            super.field7353.method2646(1, 123);
            super.field7353.method2643(class296.field4074, -10304, class471.field6648);
            super.field7353.method2612(true, 2, (byte) 64, false, class645.field9388);
            super.field7353.method2655(0, -109, class325.field4478);
            class57 var5 = super.field7353.method2653((byte) -110);
            var5.method367((byte) -17, super.field7353.method2656(2));
            super.field7353.method2623(-70, class464.field6525);
            super.field7353.method2646(0, 104);
            this.field7046 = true;
        } else {
            super.field7353.method2655(0, -39, class325.field4478);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/io/File;)[B")
    public static final byte[] method2954(int arg0, int arg1, File arg2) {
        if (arg0 != 17254) {
            field7048 = -94;
        }
        ++field7049;
        try {
            byte[] var3 = new byte[arg1];
            class266.method1674(arg1, 0, var3, arg2);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        if (arg0 > -60) {
            return true;
        } else {
            ++field7045;
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lcb;)V")
    public class495(class444 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        if (this.field7046) {
            super.field7353.method2646(1, 117);
            super.field7353.method2651((byte) -106, class209.field3093);
            super.field7353.method2643(class132.field1816, -10304, class132.field1816);
            super.field7353.method2598(class314.field4331, 2, (byte) 59);
            super.field7353.method2655(0, -41, class453.field6405);
            super.field7353.method2664(-80);
            super.field7353.method2632((class563) null, 0);
            super.field7353.method2646(0, 125);
            this.field7046 = false;
        } else {
            super.field7353.method2655(0, -93, class453.field6405);
        }
        if (!arg0) {
            ++field7042;
            super.field7353.method2643(class132.field1816, -10304, class132.field1816);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        ++field7039;
        int var4 = 74 % ((-41 - arg0) / 57);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)V")
    public final void method195(boolean arg0, boolean arg1) {
        super.field7353.method2643(class296.field4074, -10304, class132.field1816);
        if (!arg1) {
            this.field7046 = true;
        }
        ++field7047;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)Z")
    public static final boolean method2955(int arg0, int arg1, int arg2) {
        ++field7043;
        if (arg0 <= 96) {
            return true;
        } else {
            return class531.method3208(arg1, arg2, 41) || class481.method2896(1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lpb;II)V")
    public final void method202(class563 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            super.field7353.method2632(arg0, arg2 + 1);
            ++field7040;
            super.field7353.method2698(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIZI)V")
    public static final void method2956(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field7050;
        if (class325.method1953(arg0, (byte) 88)) {
            if (arg2 != -16905) {
                field7041 = -38;
            }
            class49.method299(class302.field4135[arg0], (byte) -90, arg3, arg1, -1, arg4);
        }
    }
}
