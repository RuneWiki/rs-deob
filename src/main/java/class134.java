import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class134 extends class36 {

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lhf;")
    public class16 field1853;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lin;")
    public static class344 field1852 = null;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "[J")
    public static long[] field1855 = new long[32];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lkn;")
    public static class178 field1850;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "[I")
    public static int[] field1857;

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lhf;)V", line = 12)
    public class134(class16 arg0) {
        this.field1853 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V", line = 22)
    public static void method976(byte arg0) {
        field1855 = null;
        field1850 = null;
        field1852 = null;
        if (arg0 != 3) {
            field1857 = (int[]) null;
        }
        field1857 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V", line = 35)
    public static final void method977(boolean arg0, int arg1) {
        class61.method412(class64.field836, arg0, class187.field2592, (byte) 23, class183.field2521);
        field1851++;
        if (arg1 != 128) {
            field1855 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBILfj;ILsc;Lwj;)V", line = 50)
    public static final void method978(int arg0, int arg1, byte arg2, int arg3, class241 arg4, int arg5, class329 arg6, class302 arg7) {
        class98 var8 = new class98();
        field1856++;
        var8.field1331 = arg1 * 128;
        if (arg2 > -29) {
            return;
        }
        var8.field1335 = arg5 * 128;
        var8.field1337 = arg0;
        if (arg7 != null) {
            var8.field1318 = arg7.field4493;
            var8.field1319 = arg7;
            var8.field1322 = arg7.field4517;
            var8.field1343 = arg7.field4524 * 128;
            var8.field1342 = arg7.field4481;
            var8.field1328 = arg7.field4498;
            int var10 = arg7.field4520;
            int var11 = arg7.field4479;
            var8.field1338 = arg7.field4500;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg7.field4479;
                var11 = arg7.field4520;
            }
            var8.field1326 = (arg5 + var10) * 128;
            var8.field1341 = (arg1 + var11) * 128;
            if (arg7.field4519 != null) {
                var8.field1329 = true;
                var8.method713((byte) -10);
            }
            if (var8.field1328 != null) {
                var8.field1317 = (int) (Math.random() * (double) (var8.field1322 - var8.field1318)) + var8.field1318;
            }
            class291.field4344.method1339((byte) -124, var8);
        } else if (arg6 != null) {
            var8.field1334 = arg6;
            class181 var9 = arg6.field4961;
            if (var9.field2476 != null) {
                var8.field1329 = true;
                var9 = var9.method1266((byte) 124);
            }
            if (var9 != null) {
                var8.field1326 = (arg5 + var9.field2424) * 128;
                var8.field1341 = (arg1 + var9.field2424) * 128;
                var8.field1342 = class170.method1197(arg6, -109);
                var8.field1338 = var9.field2463;
                var8.field1343 = var9.field2423 * 128;
            }
            class174.field2372.method1339((byte) -123, var8);
        } else if (arg4 != null) {
            var8.field1324 = arg4;
            var8.field1326 = (arg5 + arg4.method1653(-1)) * 128;
            var8.field1341 = (arg4.method1653(-1) + arg1) * 128;
            var8.field1342 = class202.method1437(arg4, -1);
            var8.field1338 = arg4.field3436;
            var8.field1343 = arg4.field3414 * 128;
            class223.field3199.method120(class77.method584(arg4.field3439, 72), var8, -22851);
        }
    }
}
