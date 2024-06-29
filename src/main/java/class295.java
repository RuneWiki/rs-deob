import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class295 extends class175 {

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[B")
    public byte[] field4665;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4668 = "Loaded title screen";

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Lsj;")
    public static class48 field4666 = new class48();

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field4670 = 0;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4669 = "Loading title screen - ";

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lkk;")
    public static class210 field4667;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
    public static final int method1970(byte arg0) {
        if (arg0 < 28) {
            method1970((byte) 112);
        }
        field4664++;
        try {
            if (class266.field4315 == 0) {
                if (class172.field2771 > (class182.method1253(20215) - 5000L)) {
                    return 0;
                }
                class270.field4367 = class250.field4006.method1672(-3, class148.field2385, class199.field3204);
                class147.field2377 = class182.method1253(20215);
                class266.field4315 = 1;
            }
            if (class147.field2377 + 30000L < class182.method1253(20215)) {
                return class274.method1849(1000, -79);
            }
            if (class266.field4315 == 1) {
                if (class270.field4367.field2271 == 2) {
                    return class274.method1849(1001, -93);
                }
                if (class270.field4367.field2271 != 1) {
                    return -1;
                }
                class149.field2395 = new class186((Socket) class270.field4367.field2266, class250.field4006);
                class270.field4367 = null;
                int var1 = 0;
                if (class196.field3169) {
                    var1 = class79.field1081;
                }
                class83.field1148.field4195 = 0;
                class83.field1148.method1757(23, (byte) 119);
                class83.field1148.method1789((byte) -38, var1);
                class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, -92);
                if (class226.field3580 != null) {
                    class226.field3580.method735(0);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                int var2 = class149.field2395.method1270(0);
                if (class226.field3580 != null) {
                    class226.field3580.method735(0);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                if (var2 != 0) {
                    return class274.method1849(var2, -112);
                }
                class266.field4315 = 2;
            }
            if (class266.field4315 == 2) {
                if (class149.field2395.method1274(29491) < 2) {
                    return -1;
                }
                class281.field4495 = class149.field2395.method1270(0);
                class281.field4495 <<= 0x8;
                class281.field4495 += class149.field2395.method1270(0);
                class285.field4548 = new byte[class281.field4495];
                class101.field1526 = 0;
                class266.field4315 = 3;
            }
            if (class266.field4315 != 3) {
                return -1;
            }
            int var3 = class149.field2395.method1274(29491);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class281.field4495 - class101.field1526) {
                var3 = class281.field4495 - class101.field1526;
            }
            class149.field2395.method1275(var3, class285.field4548, 12267, class101.field1526);
            class101.field1526 += var3;
            if (class281.field4495 > class101.field1526) {
                return -1;
            } else if (class30.method212((byte) -34, class285.field4548)) {
                class106.field1853 = new class219[class82.field1143];
                int var4 = 0;
                for (int var5 = class26.field315; var5 <= class77.field1046; var5++) {
                    class219 var6 = class268.method1817(var5, -72);
                    if (var6 != null) {
                        class106.field1853[var4++] = var6;
                    }
                }
                class149.field2395.method1276(-1);
                class178.field2892 = 0;
                class149.field2395 = null;
                class285.field4548 = null;
                class266.field4315 = 0;
                class172.field2771 = class182.method1253(20215);
                return 0;
            } else {
                return class274.method1849(1002, -100);
            }
        } catch (IOException var7) {
            return class274.method1849(1003, -66);
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
    public static void method1971(int arg0) {
        if (arg0 < 54) {
            field4670 = 92;
        }
        field4666 = null;
        field4668 = null;
        field4667 = null;
        field4669 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([B)V")
    public class295(byte[] arg0) {
        this.field4665 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILhi;I)Ljava/lang/String;")
    public static final String method1972(int arg0, class264 arg1, int arg2) {
        field4663++;
        try {
            int var3 = arg1.method1729(false);
            if (var3 > arg2) {
                var3 = arg2;
            }
            if (arg0 <= 82) {
                field4666 = null;
            }
            byte[] var4 = new byte[var3];
            arg1.field4195 += class46.field562.method1561(arg1.field4198, var3, 32, 0, var4, arg1.field4195);
            return class34.method235(var4, 0, false, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
