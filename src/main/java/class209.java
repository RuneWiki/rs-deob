import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class209 extends class77 {

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "[Ldd;")
    public class319[] field3046;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "[I")
    public static int[] field3049 = new int[100];

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field3047 = -1;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Lth;")
    public static class57 field3048 = new class57(100);

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z", line = 13)
    public final boolean method1524(int arg0, int arg1) {
        if (arg0 == 21474) {
            field3052++;
            return this.field3046[arg1].field4799;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lph;Lph;IZ)V", line = 31)
    public class209(class361 arg0, class361 arg1, int arg2, boolean arg3) {
        class16 var5 = new class16();
        int var6 = arg0.method2539(true, arg2);
        this.field3046 = new class319[var6];
        int[] var7 = arg0.method2508(26, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2520(arg2, var7[var8], (byte) -25);
            class191 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class191 var12 = (class191) var5.method93((byte) -88); var12 != null; var12 = (class191) var5.method97(-56)) {
                if (var12.field2787 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2522(var11, 0, (byte) 118);
                } else {
                    var13 = arg1.method2522(0, var11, (byte) 4);
                }
                var10 = new class191(var11, var13);
                var5.method106(var10, -126);
            }
            this.field3046[var7[var8]] = new class319(var9, var10);
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 90)
    public static final void method1525(int arg0) {
        class40.method289();
        class220.method1603(-103);
        class279.method2039((byte) 82);
        class223.field3342.method545((byte) -82);
        class121.field1704 = new class127();
        ((class71) class345.field5336).method567(true);
        class82.method671();
        class268.field4082 = 0;
        field3050++;
        if (arg0 != -570) {
            field3047 = -11;
        }
        class268.field4081 = new class277[255];
        class218.method1571();
        class24.method143();
        class186.method1289(25037);
        class213.method1536((byte) 124, false);
        class117.method873((byte) -125);
        class192.method1387((byte) 63);
        for (int var1 = 0; var1 < 2048; var1++) {
            class228 var2 = class343.field5312[var1];
            if (var2 != null) {
                var2.field5094 = null;
            }
        }
        if (class141.field2031) {
            class24.method148(104, 104);
            class281.method2043((byte) 123, class133.field1948);
            class155.method1127();
        }
        class189.method1304(class75.field1090, (byte) -37, class216.field3184);
        class190.method1333(class216.field3184, -124);
        class270.field4100 = null;
        class338.field5243 = null;
        class102.field1470 = null;
        class47.field704 = null;
        class158.field2271 = null;
        if (class194.field2819 == 5) {
            class291.method2094(class216.field3184, (byte) 115);
        }
        if (class194.field2819 == 10) {
            class125.method929((byte) -106, false);
        }
        if (class194.field2819 == 30) {
            class250.method1837(25, 40);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Z", line = 155)
    public final boolean method1526(int arg0, byte arg1) {
        if (arg1 != 67) {
            method1525(119);
        }
        field3051++;
        return this.field3046[arg0].field4795;
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V", line = 168)
    public static void method1527(int arg0) {
        field3049 = null;
        if (arg0 != 30) {
            field3053 = -98;
        }
        field3048 = null;
    }
}
