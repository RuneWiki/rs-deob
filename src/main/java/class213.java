import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class213 {

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field3214 = 1;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "S")
    public static short field3216;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Z")
    public static boolean field3215;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[Z")
    public static boolean[] field3212;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1378(int arg0, boolean arg1) {
        field3213++;
        if (arg1) {
            method1378(-127, false);
        }
        class224.field3391 = arg0 + 1 & 0xFFFF;
        class38.field510 = true;
        return true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1379(int arg0, String arg1, int arg2) {
        field3211++;
        if (arg0 != -6) {
            field3212 = null;
        }
        int var3 = class37.field491;
        int[] var4 = class348.field5033;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class452 var7 = class124.field1559[var4[var6]];
            if (var7 != null && class492.field6935 != var7 && var7.field6277 != null && var7.field6277.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class15.method110(class239.field3583, -126);
                    class36.field474++;
                    class225.field3415.method1753(true, 0);
                    class225.field3415.method1694(var4[var6], 120);
                } else if (arg2 == 4) {
                    class15.method110(class157.field2339, -127);
                    class267.field3897++;
                    class225.field3415.method1695(0, true);
                    class225.field3415.method1694(var4[var6], 95);
                } else if (arg2 == 5) {
                    class59.field794++;
                    class15.method110(class435.field6059, -126);
                    class225.field3415.method1753(true, 0);
                    class225.field3415.method1724((byte) 84, var4[var6]);
                } else if (arg2 == 6) {
                    client.field2603++;
                    class15.method110(class93.field1185, -127);
                    class225.field3415.method1711(false, var4[var6]);
                    class225.field3415.method1718(0, 32734);
                } else if (arg2 == 7) {
                    class349.field5048++;
                    class15.method110(class446.field6175, -128);
                    class225.field3415.method1724((byte) -123, var4[var6]);
                    class225.field3415.method1695(0, true);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class139.method884(class450.field6221.method2065(93, class326.field4711) + arg1, 0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public static void method1380(boolean arg0) {
        field3212 = null;
        if (arg0) {
            field3212 = null;
        }
    }

    static {
        new class326("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field3216 = 32767;
        field3215 = false;
    }
}
