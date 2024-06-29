import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class112 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljava/lang/String;")
    public String field1468;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
    public static boolean field1467 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lnw;")
    public static class347 field1466 = new class347();

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method625(int arg0) {
        field1463++;
        if (class260.field3213 != null) {
            class260.field3213.method1504(-32470);
        }
        if (class411.field5140 != null) {
            class411.field5140.method1504(-32470);
        }
        int var1 = -7 % ((arg0 - 43) / 35);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILbfa;)V")
    public static final void method626(int arg0, class145 arg1) {
        field1462++;
        if (arg0 == -30036 && !class84.field1188) {
            arg1.method1871(-72);
            class463.field5904--;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLr;ZLsa;Lla;Ljava/lang/String;)V")
    public static final void method627(boolean arg0, class566 arg1, boolean arg2, class595 arg3, class413 arg4, String arg5) {
        if (!arg0) {
            method627(true, null, true, null, null, null);
        }
        field1464++;
        boolean var6 = !class193.field2412 || class484.method2630(3171);
        if (!var6) {
            return;
        }
        if (class193.field2412 && var6) {
            class595 var12 = class30.field435;
            class413 var13 = arg1.method989(var12, class477.field6045, true);
            int var14 = var12.method3273(arg5, null, 250, -118);
            int var15 = var12.method3278(250, var12.field8368, arg5, (byte) -92, null);
            int var16 = class462.field5893.field9351;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var15;
            int var19 = var17 * 2 + var14;
            if (var19 < class611.field8575) {
                var19 = class611.field8575;
            }
            if (class271.field3426 > var18) {
                var18 = class271.field3426;
            }
            int var20 = class525.field7129.method2206(class593.field8327, var19, 2) + class676.field9501;
            int var21 = class587.field8254.method195(class316.field4060, var18, -123) + class481.field6404;
            arg1.method1072(class556.field7732, false).method164(class294.field3639.field9351 + var20, class294.field3639.field9353 + var21, var19 - class294.field3639.field9351 * 2, -(class294.field3639.field9353 * 2) + var18, 1, 0, 0);
            arg1.method1072(class294.field3639, true).method2902(var20, var21);
            class294.field3639.method3714();
            arg1.method1072(class294.field3639, true).method2902(var19 + var20 - var16, var21);
            class294.field3639.method3726();
            arg1.method1072(class294.field3639, true).method2902(var20 + var19 - var16, -var16 + var21 + var18);
            class294.field3639.method3714();
            arg1.method1072(class294.field3639, true).method2902(var20, var18 + var21 - var16);
            class294.field3639.method3726();
            arg1.method1072(class462.field5893, true).method2909(var20, class294.field3639.field9353 + var21, var16, var18 - (class294.field3639.field9353 * 2));
            class462.field5893.method3724();
            arg1.method1072(class462.field5893, true).method2909(class294.field3639.field9351 + var20, var21, var19 - (class294.field3639.field9351 * 2), var16);
            class462.field5893.method3724();
            arg1.method1072(class462.field5893, true).method2909(var20 + var19 - var16, class294.field3639.field9353 + var21, var16, var18 - (class294.field3639.field9353 * 2));
            class462.field5893.method3724();
            arg1.method1072(class462.field5893, true).method2909(class294.field3639.field9351 + var20, -var16 + var21 + var18, var19 - (class294.field3639.field9351 * 2), var16);
            class462.field5893.method3724();
            var13.method2185(-1, 0, null, var19 - (var17 * 2), arg5, class372.field4701 | 0xFF000000, 1, -36, 1, var18 - (var17 * 2), null, null, 0, 0, var21 + var17, var17 + var20);
            class51.method328(var19, var21, var18, (byte) 31, var20);
        } else {
            int var7 = arg3.method3273(arg5, null, 250, -107);
            int var8 = arg3.method3277(250, arg5, null, -128) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg1.method1090(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 - -var9, -16777216, 0);
            arg1.method978(var10 - var9, var11 - var9, var7 + var9 + var9, var8 + var9 + var9, -1, 0);
            arg4.method2185(-1, 0, null, var7, arg5, -1, 1, -65, 1, var8, null, null, 0, 0, var11, var10);
            class51.method328(var7 + var9 + var9, -var9 + var11, var8 + var9 + var9, (byte) 31, var10 - var9);
        }
        if (arg2) {
            try {
                arg1.method988();
            } catch (class180 var22) {
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method628(byte arg0) {
        field1466 = null;
        if (arg0 != 127) {
            method627(false, null, true, null, null, null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1465++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class112(String arg0, int arg1) {
        this.field1469 = arg1;
        this.field1468 = arg0;
    }
}
