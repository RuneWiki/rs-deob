import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class200 extends class617 {

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "[B")
    public byte[] field2356;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "Lwa;")
    public static class661 field2354 = new class661(64);

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "Lps;")
    public static class469 field2358 = new class469(10, 19);

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1197(String arg0, boolean arg1, int arg2) {
        field2352++;
        int var3 = class306.field3786;
        int[] var4 = class396.field5353;
        boolean var5 = arg1;
        for (int var6 = 0; var6 < var3; var6++) {
            class236 var7 = class139.field1540[var4[var6]];
            if (var7 != null && class362.field4859 != var7 && var7.field2893 != null && var7.field2893.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class631.field8869++;
                    class653 var12 = class699.method3845((byte) 45, class39.field395, class381.field5157);
                    var12.field9158.method658(0, (byte) 88);
                    var12.field9158.method612(false, var4[var6]);
                    class568.method3220(var12, (byte) 103);
                } else if (arg2 == 4) {
                    class44.field431++;
                    class653 var11 = class699.method3845((byte) 45, class39.field395, class320.field3942);
                    var11.field9158.method622(-92, 0);
                    var11.field9158.method646(true, var4[var6]);
                    class568.method3220(var11, (byte) 115);
                } else if (arg2 == 5) {
                    class392.field5315++;
                    class653 var10 = class699.method3845((byte) 45, class39.field395, client.field9554);
                    var10.field9158.method645(-672168216, var4[var6]);
                    var10.field9158.method633((byte) -79, 0);
                    class568.method3220(var10, (byte) 118);
                } else if (arg2 == 6) {
                    class571.field8110++;
                    class653 var9 = class699.method3845((byte) 45, class39.field395, class631.field8874);
                    var9.field9158.method615(0, (byte) 117);
                    var9.field9158.method645(-672168216, var4[var6]);
                    class568.method3220(var9, (byte) 74);
                } else if (arg2 == 7) {
                    class282.field3528++;
                    class653 var8 = class699.method3845((byte) 45, class39.field395, class123.field1381);
                    var8.field9158.method646(!arg1, var4[var6]);
                    var8.field9158.method615(0, (byte) 116);
                    class568.method3220(var8, (byte) 92);
                }
                break;
            }
        }
        if (!var5) {
            class340.method1964(4, class198.field2306.method1195((byte) 62, class504.field7267) + arg0, 116);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1198(String arg0, int arg1) {
        class416.method2341(0, arg0, "", "", 0, 0, "");
        if (arg1 <= -64) {
            field2353++;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIIII)I")
    public static final int method1199(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2355++;
        if (arg0 == -26) {
            int var5 = 65536 - class435.field6135[arg1 * 8192 / arg3] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "([B)V")
    public class200(byte[] arg0) {
        this.field2356 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field2354 = null;
        field2358 = null;
        if (arg0 != 4) {
            method1199((byte) 37, -118, -33, -16, 64);
        }
    }
}
