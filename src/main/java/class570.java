import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class570 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lln;")
    public static class472 field8084 = new class472(15, 0, 1, 0);

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lht;")
    public static class393 field8091 = new class393();

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Z")
    public static boolean field8092 = false;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "D")
    public static double field8088;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lrt;")
    public static class485 field8089;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lpia;")
    public static class54 field8090;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Ljn;", line = 3)
    public static final class322[] method3305(int arg0) {
        if (arg0 != 0) {
            method3307(113);
        }
        field8085++;
        return new class322[] { class443.field6431, class758.field10564, class592.field8329 };
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lcca;IB[I)V", line = 19)
    public static final void method3306(class461 arg0, int arg1, byte arg2, int[] arg3) {
        field8087++;
        if (arg0.field1591 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field1591.length; var5++) {
                if (arg0.field1591[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field1695 != -1) {
                class82 var6 = class83.field1219.method2358((byte) 105, arg0.field1695);
                int var7 = var6.field1195;
                if (var7 == 1) {
                    arg0.field1686 = arg1;
                    arg0.field1600 = 0;
                    arg0.field1611 = 1;
                    arg0.field1624 = 0;
                    arg0.field1626 = 0;
                    if (!arg0.field1630) {
                        class262.method1747(arg0, arg0.field1626, var6, -26868);
                    }
                }
                if (var7 == 2) {
                    arg0.field1624 = 0;
                }
            }
        }
        int var8 = 125 % ((45 - arg2) / 45);
        boolean var9 = true;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            if (arg3[var10] != -1) {
                var9 = false;
            }
            if (arg0.field1591 == null || arg0.field1591[var10] == -1 || class83.field1219.method2358((byte) 88, arg3[var10]).field1199 >= class83.field1219.method2358((byte) 123, arg0.field1591[var10]).field1199) {
                arg0.field1707 = arg0.field1706;
                arg0.field1591 = arg3;
                arg0.field1686 = arg1;
            }
        }
        if (var9) {
            arg0.field1686 = arg1;
            arg0.field1591 = arg3;
            arg0.field1707 = arg0.field1706;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 117)
    public static void method3307(int arg0) {
        if (arg0 == -25895) {
            field8089 = null;
            field8091 = null;
            field8084 = null;
            field8090 = null;
        }
    }
}
