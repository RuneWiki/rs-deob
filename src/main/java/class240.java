import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class240 extends class704 {

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(JIIZIIILjava/lang/String;IZLjava/lang/String;)V", line = 5)
    public static final void method1471(long arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7, int arg8, boolean arg9, String arg10) {
        ++field3319;
        if (!class361.field4805 && class271.field3704 < 500) {
            int var12 = arg5 == -1 ? class10.field99 : arg5;
            class377 var13 = new class377(arg7, arg10, var12, arg2, arg4, arg0, arg8, arg6, arg9, arg3);
            class34.field679.method1129(var13, 262144);
            ++class271.field3704;
            if (arg1 != -24453) {
                method1472((byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljn;Ljn;Lvw;)V", line = 24)
    public class240(class668 arg0, class668 arg1, class277 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 27)
    public static final void method1472(byte arg0) {
        if (arg0 > -75) {
            method1471(-93L, -54, -34, true, -101, 44, 62, (String) null, -52, false, (String) null);
        }
        ++field3320;
        for (class520 var1 = (class520) class376.field5049.method1132((byte) 65); var1 != null; var1 = (class520) class376.field5049.method1134(8446)) {
            class120 var2 = var1.field7621;
            if (!var2.field1548) {
                if (var2.field1537 <= class543.field7882) {
                    var2.method841(0, class456.field6422);
                    if (!var2.field1548) {
                        class667.method3777(var2, true);
                    } else {
                        var1.method3045(true);
                    }
                }
            } else {
                var1.method3045(true);
                var2.method837(-1);
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V", line = 64)
    public final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3318;
        int var6 = super.field9962.method896();
        if (arg0 == 25002) {
            int var7 = ((class277) super.field8689).field3784 * class48.method542(-99) / 10 % var6;
            super.field9962.method3923(arg3 + var7 + -var6, arg4, arg1 + var6 + -var7, arg2);
        }
    }
}
