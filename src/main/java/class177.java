import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class177 extends class134 {

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field2446 = -1;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Ljn;")
    public static class409 field2450 = new class409("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Ljava/lang/String;")
    public String field2448;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Ljava/lang/String;")
    public String field2451;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLge;)V")
    public static final void method1227(boolean arg0, class108 arg1) {
        ++field2449;
        arg1.method770(8);
        int var2 = class420.field6085;
        class380 var3 = class187.field2619 = class455.field6731[var2] = new class380();
        var3.field777 = var2;
        int var4 = arg1.method773(30, (byte) 96);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268427918 & var4) >> 14;
        var3.field793[0] = -class28.field399 + var6;
        int var7 = var4 & 16383;
        if (arg0) {
            method1228(11);
        }
        var3.field4954 = (var3.field793[0] << 7) - -(var3.method446(10) << 6);
        var3.field784[0] = -class134.field1846 + var7;
        var3.field4951 = (var3.field784[0] << 7) - -(var3.method446(10) << 6);
        class423.field6117 = var3.field4960 = var5;
        if (class228.field3433[var2] != null) {
            var3.method2414(class228.field3433[var2], -93);
        }
        class208.field2933 = 0;
        class88.field1085[class208.field2933++] = var2;
        class143.field1949[var2] = 0;
        class241.field3575 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (var2 != var8) {
                int var9 = arg1.method773(18, (byte) -125);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65321) >> 8;
                int var12 = var9 & 255;
                class393.field5727[var8] = (var10 << 28) - (-(var11 << 14) + -var12);
                class465.field6852[var8] = 0;
                class18.field294[var8] = -1;
                class420.field6084[class241.field3575++] = var8;
                class143.field1949[var8] = 0;
            }
        }
        arg1.method771((byte) 122);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static void method1228(int arg0) {
        int var1 = 92 % ((arg0 - -15) / 49);
        field2450 = null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)Lqe;")
    public final class153 method1229(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field2447;
            return class296.field4317[super.field1835];
        }
    }
}
