import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class329 extends class166 {

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lhs;")
    public class329 field4446;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Lhs;")
    public class329 field4449;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)V")
    public static final void method1953(int arg0, int arg1, byte arg2) {
        field4447++;
        if ((class642.field8936 < class642.field8940)) {
            class642.field8936 = (float) ((double) class642.field8936 / 30.0D + (double) class642.field8936);
            if (class642.field8936 > class642.field8940) {
                class642.field8936 = class642.field8940;
            }
            class582.method3255(-1);
            class642.field8941 = (int) class642.field8936 >> 1;
            class642.field8944 = class702.method3958(class642.field8941, (byte) 112);
        } else if (class642.field8940 < class642.field8936) {
            class642.field8936 = (float) ((double) class642.field8936 - (double) class642.field8936 / 30.0D);
            if (class642.field8940 > class642.field8936) {
                class642.field8936 = class642.field8940;
            }
            class582.method3255(-1);
            class642.field8941 = (int) class642.field8936 >> 1;
            class642.field8944 = class702.method3958(class642.field8941, (byte) -86);
        }
        if (class278.field3706 != -1 && class239.field3133 != -1) {
            int var3 = class278.field3706 - class510.field6893;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class239.field3133 - class450.field6297;
            class510.field6893 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class278.field3706 = -1;
                class239.field3133 = -1;
            }
            class450.field6297 += var4;
            class582.method3255(-1);
        }
        if (arg2 != 2) {
            method1953(33, 96, (byte) -1);
        }
        if (class41.field420 <= 0) {
            class572.field8051 = -1;
            class251.field3238 = -1;
        } else {
            class354.field4718--;
            if (class354.field4718 == 0) {
                class354.field4718 = 100;
                class41.field420--;
            }
        }
        if (!class531.field7208 || class600.field8354 == null) {
            return;
        }
        for (class617 var5 = (class617) class600.field8354.method724(32); var5 != null; var5 = (class617) class600.field8354.method723(arg2 ^ 0x73)) {
            class292 var6 = class642.field8929.method1647(arg2 ^ 0xFFFFFFDF, var5.field8649.field6940);
            if (var5.method3475(Integer.MIN_VALUE, arg1, arg0)) {
                if (var6.field3870 != null) {
                    if (var6.field3870[4] != null) {
                        class218.method1237(false, true, (long) var5.field8649.field6940, -1, var6.field3880, var6.field3865, false, 0, 1004, (long) var5.field8649.field6940, -1, false, var6.field3870[4]);
                    }
                    if (var6.field3870[3] != null) {
                        class218.method1237(false, true, (long) var5.field8649.field6940, -1, var6.field3880, var6.field3865, false, 0, 1010, (long) var5.field8649.field6940, -1, false, var6.field3870[3]);
                    }
                    if (var6.field3870[2] != null) {
                        class218.method1237(false, true, (long) var5.field8649.field6940, -1, var6.field3880, var6.field3865, false, 0, 1001, (long) var5.field8649.field6940, -1, false, var6.field3870[2]);
                    }
                    if (var6.field3870[1] != null) {
                        class218.method1237(false, true, (long) var5.field8649.field6940, -1, var6.field3880, var6.field3865, false, 0, 1003, (long) var5.field8649.field6940, -1, false, var6.field3870[1]);
                    }
                    if (var6.field3870[0] != null) {
                        class218.method1237(false, true, (long) var5.field8649.field6940, -1, var6.field3880, var6.field3865, false, 0, 1011, (long) var5.field8649.field6940, -1, false, var6.field3870[0]);
                    }
                }
                if (!var5.field8649.field6949) {
                    var5.field8649.field6949 = true;
                    class498.method2783(class140.field1800, var5.field8649.field6940, var6.field3880);
                }
                if (var5.field8649.field6949) {
                    class498.method2783(class449.field6265, var5.field8649.field6940, var6.field3880);
                }
            } else if (var5.field8649.field6949) {
                var5.field8649.field6949 = false;
                class498.method2783(class626.field8757, var5.field8649.field6940, var6.field3880);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)Z")
    public static final boolean method1954(int arg0, byte arg1) {
        field4450++;
        if (arg1 < 41) {
            return false;
        } else {
            return arg0 >= 12 && arg0 <= 17;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public final void method1955(int arg0) {
        field4448++;
        if (this.field4449 == null) {
            return;
        }
        this.field4449.field4446 = this.field4446;
        this.field4446.field4449 = this.field4449;
        int var2 = 16 % ((24 - arg0) / 38);
        this.field4446 = null;
        this.field4449 = null;
    }
}
