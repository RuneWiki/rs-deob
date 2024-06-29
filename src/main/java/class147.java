import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class147 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field2421 = 20;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field2418 = -1;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lhg;")
    public static class207 field2423 = null;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
    public static boolean field2425 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field2429 = 0;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "S")
    public static short field2430 = 32767;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lab;Z)Ljj;")
    public static final class182 method1087(class249 arg0, boolean arg1) {
        arg0.method1802((byte) 42);
        if (arg1) {
            field2430 = -50;
        }
        field2424++;
        int var2 = arg0.method1802((byte) -92);
        class182 var3 = class71.method501(var2, -100);
        var3.field2913 = arg0.method1802((byte) 112);
        int var4 = arg0.method1802((byte) -96);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1802((byte) 83);
            var3.method155(false, arg0, var6);
        }
        var3.method469(-1);
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method1088(int arg0) {
        int var1 = -59 / ((-arg0 - 75) / 50);
        field2423 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIII)I")
    public static final int method1089(boolean arg0, int arg1, int arg2, int arg3) {
        field2420++;
        class302 var4 = (class302) class21.field381.method987(-116, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = arg1;
        for (int var6 = 0; var6 < var4.field4922.length; var6++) {
            if (var4.field4922[var6] >= 0 && class241.field4062 > var4.field4922[var6]) {
                class71 var7 = class13.method75(false, var4.field4922[var6]);
                if (var7.field1193 != null) {
                    class113 var8 = (class113) var7.field1193.method987(arg1 - 92, (long) arg3);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field4927[var6] * var8.field1929;
                        } else {
                            var5 += var8.field1929;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1090(boolean arg0, String arg1) {
        field2419++;
        System.out.println("Error: " + class241.method1731(arg1, -127, "%0a", "\n"));
        if (arg0) {
            method1087((class249) null, false);
        }
    }
}
