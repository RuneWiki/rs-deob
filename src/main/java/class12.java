import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class12 extends class305 {

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Z")
    public volatile boolean field239 = true;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Lth;")
    public static class55 field238 = new class55();

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Z")
    public boolean field236;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Z")
    public boolean field237;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "[Loj;")
    public static class283[] field240;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 6)
    public static final void method94(int arg0, int arg1) {
        field235++;
        class2 var2 = class212.method1433(arg1, arg0, -13802);
        var2.method16((byte) 101);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 16)
    public static void method96(int arg0) {
        field238 = null;
        if (arg0 > 100) {
            field240 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)I", line = 34)
    public static final int method98(byte arg0) {
        if (arg0 < 87) {
            return 96;
        }
        field241++;
        try {
            if (class125.field2174 == 0) {
                if (class338.method2339((byte) -120) - 5000L < class168.field2703) {
                    return 0;
                }
                class28.field541 = class177.field2849.method806(class305.field4624, class151.field2469, -27289);
                class307.field4678 = class338.method2339((byte) -120);
                class125.field2174 = 1;
            }
            if (class307.field4678 + 30000L < class338.method2339((byte) -120)) {
                return class225.method1495(1000, -126);
            }
            if (class125.field2174 == 1) {
                if (class28.field541.field1852 == 2) {
                    return class225.method1495(1001, -126);
                }
                if (class28.field541.field1852 != 1) {
                    return -1;
                }
                class177.field2860 = new class87((Socket) class28.field541.field1853, class177.field2849);
                class14.field263.field3249 = 0;
                int var1 = 0;
                if (class263.field4089) {
                    var1 = class84.field1591;
                }
                class28.field541 = null;
                class14.field263.method1311(23, 10964);
                class14.field263.method1359(16705, var1);
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                if (class41.field797 != null) {
                    class41.field797.method1497(-116);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(-90);
                }
                int var2 = class177.field2860.method616((byte) -103);
                if (class41.field797 != null) {
                    class41.field797.method1497(-116);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(-103);
                }
                if (var2 != 0) {
                    return class225.method1495(var2, -126);
                }
                class125.field2174 = 2;
            }
            if (class125.field2174 == 2) {
                if (class177.field2860.method608(-87) < 2) {
                    return -1;
                }
                class155.field2521 = class177.field2860.method616((byte) -106);
                class155.field2521 <<= 0x8;
                class155.field2521 += class177.field2860.method616((byte) -109);
                class2.field47 = 0;
                class125.field2174 = 3;
                class123.field2129 = new byte[class155.field2521];
            }
            if (class125.field2174 != 3) {
                return -1;
            }
            int var3 = class177.field2860.method608(-117);
            if (var3 < 1) {
                return -1;
            }
            if ((class155.field2521 - class2.field47) < var3) {
                var3 = class155.field2521 - class2.field47;
            }
            class177.field2860.method605((byte) -19, class2.field47, class123.field2129, var3);
            class2.field47 += var3;
            if (class2.field47 < class155.field2521) {
                return -1;
            } else if (class276.method1851(class123.field2129, -23217)) {
                int var4 = 0;
                class236.field3715 = new class103[class77.field1540];
                for (int var5 = class72.field1512; var5 <= class104.field1797; var5++) {
                    class103 var6 = class335.method2311(true, var5);
                    if (var6 != null) {
                        class236.field3715[var4++] = var6;
                    }
                }
                class177.field2860.method607((byte) -76);
                class125.field2175 = 0;
                class177.field2860 = null;
                class125.field2174 = 0;
                class123.field2129 = null;
                class168.field2703 = class338.method2339((byte) -120);
                return 0;
            } else {
                return class225.method1495(1002, -126);
            }
        } catch (IOException var8) {
            return class225.method1495(1003, -127);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V", line = 172)
    public static final void method99(int arg0, int arg1) {
        int var2 = 4 % ((arg1 - 51) / 58);
        class2 var3 = class212.method1433(arg0, 4, -13802);
        var3.method16((byte) -38);
        field243++;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)I")
    public abstract int method95(boolean arg0);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)[B")
    public abstract byte[] method97(int arg0);
}
