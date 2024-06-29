import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class464 extends class47 {

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
    public volatile boolean field6539 = true;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lae;")
    public static class172 field6538 = null;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
    public static int[] field6536 = new int[2048];

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Z")
    public static volatile boolean field6540 = true;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "[Lnc;")
    public static class135[] field6544 = new class135[14];

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Lrn;")
    public static class417 field6545;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
    public boolean field6541;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Z")
    public boolean field6546;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 3)
    public static final void method2768(int arg0) {
        if (arg0 != -8003) {
            method2772(-31);
        }
        field6547++;
        class201.field2979++;
        class336.method2111(class162.field2362, 106);
        class311.field4403.method1180((byte) -110, 0);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 17)
    public static void method2769(int arg0) {
        field6545 = null;
        field6544 = null;
        if (arg0 != -1) {
            field6536 = null;
        }
        field6536 = null;
        field6538 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V", line = 33)
    public static final void method2770(byte arg0, boolean arg1) {
        if (arg0 > -60) {
            method2773(102);
        }
        class87.method736(class431.field6099, class364.field5007, class238.field3475, -73, arg1);
        field6535++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIII)V", line = 47)
    public static final void method2771(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6543++;
        int var5 = 0;
        if (arg0 < 54) {
            method2773(-125);
        }
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class67.method630(0, arg1 + arg3, class103.field1457, class295.field4153);
        int var10 = class67.method630(0, arg3 - arg1, class103.field1457, class295.field4153);
        class61.method558(var9, -10647, class373.field5141[arg4], var10, arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class444.field6338 && class151.field2091 >= var11) {
                    int var13 = class67.method630(0, arg3 + var5, class103.field1457, class295.field4153);
                    int var14 = class67.method630(0, arg3 - var5, class103.field1457, class295.field4153);
                    if (class151.field2091 >= var12) {
                        class61.method558(var13, -10647, class373.field5141[var12], var14, arg2);
                    }
                    if (var11 >= class444.field6338) {
                        class61.method558(var13, -10647, class373.field5141[var11], var14, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class444.field6338 && var15 <= class151.field2091) {
                int var17 = class67.method630(0, arg3 + var6, class103.field1457, class295.field4153);
                int var18 = class67.method630(0, arg3 - var6, class103.field1457, class295.field4153);
                if (var16 <= class151.field2091) {
                    class61.method558(var17, -10647, class373.field5141[var16], var18, arg2);
                }
                if (var15 >= class444.field6338) {
                    class61.method558(var17, -10647, class373.field5141[var15], var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Lml;", line = 124)
    public static final class21 method2772(int arg0) {
        if (arg0 != 12842) {
            field6545 = null;
        }
        field6542++;
        class227.field3275 = 0;
        return class310.method1978(arg0 - 12845);
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Lid;", line = 148)
    public static final class266 method2773(int arg0) {
        field6537++;
        if (class330.field4572 == null || class8.field62 == null) {
            return null;
        }
        if (arg0 != 0) {
            method2770((byte) -26, true);
        }
        for (class266 var1 = (class266) class8.field62.method2720(-115); var1 != null; var1 = (class266) class8.field62.method2720(-99)) {
            class76 var2 = class330.field4569.method2321(var1.field3826, true);
            if (var2 != null && var2.field1089 && var2.method674(31590, class330.field4563)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
    public abstract int method1320(int arg0);

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)[B")
    public abstract byte[] method1319(int arg0);
}
