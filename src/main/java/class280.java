import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class280 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lni;")
    public static class367 field3967 = new class367(78, 8);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lla;")
    public static class319 field3970 = new class319(43, 8);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lla;")
    public static class319 field3971 = new class319(77, 3);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lla;")
    public static class319 field3972 = new class319(23, 6);

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[S")
    public static short[] field3973 = new short[256];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 4)
    public static void method1794(byte arg0) {
        if (arg0 != 29) {
            return;
        }
        field3972 = null;
        field3970 = null;
        field3973 = null;
        field3967 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILee;B)V", line = 24)
    public static final void method1795(int arg0, class486 arg1, byte arg2) {
        if (arg2 != 52) {
            return;
        }
        if (class143.field1915) {
            class143.field1915 = false;
            arg0 = 0;
        }
        field3969++;
        if (class491.field7250 != null && class491.field7250.method2911(arg2 - 44, arg1)) {
            return;
        }
        class491.field7250 = arg1;
        class525.field7714 = class58.method427((byte) -19);
        class136.field1810 = arg0;
        class172.field2320 = arg0;
        if (class172.field2320 == 0) {
            class38.method323((byte) -97);
            return;
        }
        class273.field3807 = class146.field1936;
        class521.field7660 = class11.field203;
        class420.field6391 = class177.field2361;
        class434.field6590 = class375.field5702;
        class457.field6852 = class26.field381;
        class425.field6480 = class491.field7254;
        class361.field5544 = class91.field1320;
        class101.field1470 = class496.field7321;
        class75.field1099 = class348.field5371;
        class533.field7846 = class187.field2512;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method1796(int arg0, int arg1, int arg2) {
        field3968++;
        if (arg2 == 32768) {
            return (arg1 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqa;)V", line = 81)
    public static final void method1797(class165 arg0) {
        for (int var1 = class81.field1167; var1 < class141.field1892; var1++) {
            for (int var2 = 0; var2 < class533.field7842; var2++) {
                for (int var3 = 0; var3 < class475.field7051; var3++) {
                    class452 var4 = class443.field6672[var1][var2][var3];
                    if (var4 != null) {
                        class535 var5 = var4.field6812;
                        class535 var6 = var4.field6797;
                        if (var5 != null && var5.method176(true)) {
                            class60.method434(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method176(true)) {
                                class60.method434(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method166(0, var5, -121, 0, 0, arg0, false);
                                var6.method175(0);
                            }
                            var5.method175(0);
                        }
                        for (class384 var7 = var4.field6814; var7 != null; var7 = var7.field5834) {
                            class140 var9 = var7.field5832;
                            if (var9 != null && var9.method176(true)) {
                                class60.method434(arg0, var9, var1, var2, var3, var9.field1871 + 1 - var9.field1868, var9.field1874 - var9.field1863 + 1);
                                var9.method175(0);
                            }
                        }
                        class394 var8 = var4.field6801;
                        if (var8 != null && var8.method176(true)) {
                            class307.method1927(arg0, var8, var1, var2, var3);
                            var8.method175(0);
                        }
                    }
                }
            }
        }
    }
}
