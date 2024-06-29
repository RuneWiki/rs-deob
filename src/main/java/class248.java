import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class248 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Ljea;")
    public static class248 field3687 = new class248();

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "Ljea;")
    public static class248 field3691 = new class248();

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "Ljea;")
    public static class248 field3693 = new class248();

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "Ljea;")
    public static class248 field3694 = new class248();

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public static int field3697 = 13156520;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "Z")
    public static boolean field3698 = false;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "F")
    public static float field3696;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!jea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3690++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIZJ)Ljava/lang/String;")
    public static final String method1670(int arg0, int arg1, boolean arg2, long arg3) {
        field3688++;
        if (arg0 != -549643391) {
            return null;
        }
        Calendar var5;
        if (arg2) {
            class166.method1047(-1, arg3);
            var5 = class448.field6278;
        } else {
            class324.method2052(-79, arg3);
            var5 = class448.field6277;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return arg1 == 3 ? class607.method3512(arg3, arg0 + 549635487, arg2, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class428.field5975[arg1][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3692++;
        class657[] var7 = class115.field1569;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class657 var9 = var7[var8];
            if (var9 != null && var9.field9270 == 2) {
                class54.method459(arg0, arg3 ^ 0xFFFFD443, arg5 >> 1, arg6 >> 1, arg1, var9.field9277, var9.field9271, var9.field9264 * 2, var9.field9272);
                if (class491.field6769[0] > -1 && (class533.field7336 % 20) < 10) {
                    class318 var10 = class182.field2292[var9.field9268];
                    int var11 = arg4 + class491.field6769[0] - 12;
                    int var12 = class491.field6769[1] + arg2 - 28;
                    var10.method2025(var11, var12);
                    class338.method2144((byte) -22, var11 + var10.method749(), var12, var12 + var10.method736(), var11);
                }
            }
        }
        if (arg3 != -23651) {
            field3694 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Laia;Lqk;I)Liaa;")
    public static final class116 method1672(class399 arg0, class1 arg1, int arg2) {
        field3689++;
        class116 var3 = class537.method3194((byte) -93);
        var3.field1578 = arg1;
        var3.field1573 = arg1.field3;
        if (var3.field1573 == -1) {
            var3.field1575 = new class432(260);
        } else if (var3.field1573 == -2) {
            var3.field1575 = new class432(10000);
        } else if (var3.field1573 <= 18) {
            var3.field1575 = new class432(20);
        } else if (var3.field1573 > 98) {
            var3.field1575 = new class432(260);
        } else {
            var3.field1575 = new class432(100);
        }
        var3.field1575.method2592(arg0, -29720);
        var3.field1575.method2587(var3.field1578.method1((byte) -101), arg2 + 20704);
        if (arg2 != -20647) {
            method1670(-69, -76, true, -95L);
        }
        var3.field1572 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public static void method1673(byte arg0) {
        field3693 = null;
        int var1 = -21 / ((25 - arg0) / 61);
        field3687 = null;
        field3691 = null;
        field3694 = null;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)I")
    public static final int method1674(byte arg0) {
        if (arg0 >= -12) {
            field3697 = -64;
        }
        field3695++;
        return class409.field5750.method966(36);
    }
}
