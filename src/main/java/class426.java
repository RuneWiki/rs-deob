import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class426 extends class329 {

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public volatile int field5346 = -1;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field5344;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field5342 = 0;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Z")
    public static boolean field5349 = false;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZZZLtt;)V")
    public static final void method2260(boolean arg0, boolean arg1, boolean arg2, class340 arg3) {
        if (arg2) {
            field5349 = true;
        }
        field5348++;
        int var4 = arg3.field4392;
        int var5 = (int) arg3.field4199;
        arg3.method1871(-86);
        if (arg1) {
            class510.method2756(var4, 0);
        }
        class273.method1569((byte) 79, var4);
        class507 var6 = class156.method894(-1018745488, var5);
        if (var6 != null) {
            class572.method3158(var6, 1023);
        }
        class225.method1354((byte) 108);
        if (!arg0 && class316.field4063 != -1) {
            class106.method603(-1630137275, class316.field4063, 1);
        }
        class374 var7 = new class374(class138.field1797);
        for (class340 var8 = (class340) var7.method2036((byte) -120); var8 != null; var8 = (class340) var7.method2034(1)) {
            if (!var8.method1873(-95)) {
                var8 = (class340) var7.method2036((byte) -121);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4391 == 3) {
                int var9 = (int) var8.field4199;
                if (var9 >>> 16 == var4) {
                    method2260(arg0, true, false, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I")
    public static final int method2261(byte arg0, int arg1) {
        field5343++;
        int var2 = -69 % ((arg0 - 7) / 62);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLes;)Ltl;")
    public static final class570 method2262(byte arg0, class630 arg1) {
        field5345++;
        int var2 = arg1.method3483(74);
        if (arg0 <= 17) {
            method2263(-57, -16, 124, -39, 4, 24, 85, 76, -3);
        }
        return new class570(var2);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5347++;
        if (arg5 != 14557) {
            method2263(94, -116, -79, -9, -49, -120, -76, -105, 18);
        }
        class642.field9049[class430.field5385++] = new class199(arg2, arg1, arg0, arg6, arg6, arg0, arg7, arg8, arg8, arg7, arg4, arg4, arg3, arg3);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class426(String arg0) {
        this.field5344 = arg0;
    }
}
