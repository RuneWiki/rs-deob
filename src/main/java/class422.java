import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class422 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6142 = "K";

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6145 = "Loaded client variable data";

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6148 = "";

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ldp;ZLdp;B)V", line = 3)
    public static final void method2649(class174 arg0, boolean arg1, class174 arg2, byte arg3) {
        class126.field2039 = arg1;
        if (arg3 <= -98) {
            class287.field4290 = arg0;
            field6144++;
            class359.field5120 = arg2;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 17)
    public static void method2650(byte arg0) {
        field6142 = null;
        if (arg0 == 38) {
            field6145 = null;
            field6148 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBIII)V", line = 36)
    public static final void method2651(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class324 var5 = (class324) class127.field2075.method157((byte) -125); var5 != null; var5 = (class324) class127.field2075.method145(-115)) {
            class72.method577(arg2, arg0, arg4, var5, 24038, arg3);
        }
        field6147++;
        if (arg1 != -62) {
            field6148 = null;
        }
        for (class324 var6 = (class324) class30.field441.method157((byte) -125); var6 != null; var6 = (class324) class30.field441.method145(121)) {
            byte var11 = 1;
            class419 var12 = var6.field4672.method2476((byte) 93);
            if (var6.field4672.field5661) {
                var11 = 0;
            } else if (var6.field4672.field5642 == var12.field6081 || var6.field4672.field5642 == var12.field6096 || var6.field4672.field5642 == var12.field6116 || var6.field4672.field5642 == var12.field6098) {
                var11 = 2;
            } else if (var6.field4672.field5642 == var12.field6103 || var6.field4672.field5642 == var12.field6117 || var6.field4672.field5642 == var12.field6086 || var6.field4672.field5642 == var12.field6076) {
                var11 = 3;
            }
            if (var6.field4663 != var11) {
                int var13 = class332.method2175(63, var6.field4672);
                if (var6.field4669 != var13) {
                    if (var6.field4690 != null) {
                        class220.field3275.method511(var6.field4690);
                        var6.field4690 = null;
                    }
                    var6.field4669 = var13;
                }
                var6.field4663 = var11;
            }
            var6.field4675 = var6.field4672.field6520;
            var6.field4677 = var6.field4672.field6520 + (var6.field4672.method1070((byte) -50) * 64);
            var6.field4691 = var6.field4672.field6519;
            var6.field4682 = var6.field4672.field6519 + (var6.field4672.method1070((byte) -50) * 64);
            class72.method577(arg2, arg0, arg4, var6, 24038, arg3);
        }
        for (class324 var7 = (class324) class356.field5056.method1222(5656); var7 != null; var7 = (class324) class356.field5056.method1224((byte) -116)) {
            byte var8 = 1;
            class419 var9 = var7.field4676.method2476((byte) 101);
            if (var7.field4676.field5661) {
                var8 = 0;
            } else if (var7.field4676.field5642 == var9.field6081 || var7.field4676.field5642 == var9.field6096 || var7.field4676.field5642 == var9.field6116 || var7.field4676.field5642 == var9.field6098) {
                var8 = 2;
            } else if (var7.field4676.field5642 == var9.field6103 || var7.field4676.field5642 == var9.field6117 || var7.field4676.field5642 == var9.field6086 || var7.field4676.field5642 == var9.field6076) {
                var8 = 3;
            }
            if (var7.field4663 != var8) {
                int var10 = class220.method1676(var7.field4676, 21386);
                if (var7.field4669 != var10) {
                    if (var7.field4690 != null) {
                        class220.field3275.method511(var7.field4690);
                        var7.field4690 = null;
                    }
                    var7.field4669 = var10;
                }
                var7.field4663 = var8;
            }
            var7.field4675 = var7.field4676.field6520;
            var7.field4677 = var7.field4676.field6520 + var7.field4676.method1070((byte) -50) * 64;
            var7.field4691 = var7.field4676.field6519;
            var7.field4682 = var7.field4676.field6519 + var7.field4676.method1070((byte) -50) * 64;
            class72.method577(arg2, arg0, arg4, var7, 24038, arg3);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)V", line = 160)
    public static final void method2652(int arg0, int arg1, int arg2, int arg3) {
        field6143++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & arg3);
        System.out.println(var4);
        class55.method435(1, var4, true);
    }
}
