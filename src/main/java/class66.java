import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class66 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[I")
    public int[] field795 = new int[3];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
    public int[] field792 = new int[100];

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "[Lbj;")
    public class227[] field797 = new class227[8];

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "[Lwda;")
    public class597[] field799 = new class597[100];

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field793;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
    public static final void method523(boolean arg0) {
        field796++;
        class99.method721((byte) -80, class338.field4324);
        class52.field661++;
        if (class300.field3811 && class46.field621) {
            int var1 = class113.field1423.method1074((byte) -26);
            int var2 = class113.field1423.method1078((byte) 114);
            int var3 = var2 - class410.field5265;
            int var4 = var1 - class250.field3230;
            if (var4 < class689.field9562) {
                var4 = class689.field9562;
            }
            if (class420.field5352 > var3) {
                var3 = class420.field5352;
            }
            if ((class689.field9562 + class85.field1089.field4309) < (class338.field4324.field4309 + var4)) {
                var4 = class689.field9562 + class85.field1089.field4309 - class338.field4324.field4309;
            }
            if ((class420.field5352 + class85.field1089.field4211) < (var3 + class338.field4324.field4211)) {
                var3 = class420.field5352 + class85.field1089.field4211 - class338.field4324.field4211;
            }
            int var5 = class85.field1089.field4300 + var4 - class689.field9562;
            int var6 = var3 + class85.field1089.field4208 - class420.field5352;
            if (class113.field1423.method2921(arg0)) {
                if (class338.field4324.field4178 < class52.field661) {
                    int var8 = var4 - class124.field1519;
                    int var9 = var3 - class103.field1315;
                    if (var8 > class338.field4324.field4155 || var8 < -class338.field4324.field4155 || class338.field4324.field4155 < var9 || var9 < -class338.field4324.field4155) {
                        class373.field4821 = true;
                    }
                }
                if (class338.field4324.field4260 != null && class373.field4821) {
                    class402 var10 = new class402();
                    var10.field5159 = var6;
                    var10.field5154 = class338.field4324;
                    var10.field5153 = class338.field4324.field4260;
                    var10.field5158 = var5;
                    class620.method3450(var10);
                }
            } else {
                if (class373.field4821) {
                    class167.method1012(101);
                    if (class338.field4324.field4162 != null) {
                        class402 var7 = new class402();
                        var7.field5159 = var6;
                        var7.field5158 = var5;
                        var7.field5153 = class338.field4324.field4162;
                        var7.field5154 = class338.field4324;
                        var7.field5152 = class528.field6660;
                        class620.method3450(var7);
                    }
                    if (class528.field6660 != null && client.method1704(class338.field4324) != null) {
                        class505.method2752((byte) -100, class338.field4324, class528.field6660);
                    }
                } else if ((class175.field2061 == 1 || class681.method3766(-5)) && class638.field8648 > 2) {
                    class477.method2608(class410.field5265 + class103.field1315, (byte) 65, class250.field3230 + class124.field1519);
                } else if (class42.method262(-119)) {
                    class477.method2608(class410.field5265 + class103.field1315, (byte) 94, class250.field3230 + class124.field1519);
                }
                class338.field4324 = null;
            }
        } else if (class52.field661 > 1) {
            class338.field4324 = null;
        }
    }
}
