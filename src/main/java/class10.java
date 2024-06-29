import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Laj;")
    public static class1 field123 = new class1();

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field128 = -1;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lhe;")
    public static class94 field127 = new class94(260);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lvd;")
    public static class135 field129;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Z")
    public static boolean field126;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[Lt;")
    public static class257[] field124;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 8)
    public static final void method53(byte arg0) {
        class88.field1389 = -1;
        class256.field4471.field4314 = 0;
        class311.field5374 = 0;
        class293.field5127.field4314 = 0;
        class62.field989 = false;
        client.field4538 = 0;
        field121++;
        class290.field5080 = -1;
        class191.field3471 = 0;
        class290.field5069 = 0;
        class156.field2805 = 0;
        class191.field3457 = -1;
        class157.field2836 = 0;
        class158.field2852 = -1;
        for (int var1 = 0; var1 < class96.field1558.length; var1++) {
            if (class96.field1558[var1] != null) {
                class96.field1558[var1].field4522 = -1;
            }
        }
        for (int var2 = 0; var2 < class159.field2863.length; var2++) {
            if (class159.field2863[var2] != null) {
                class159.field2863[var2].field4522 = -1;
            }
        }
        class146.method1017(arg0 + 127);
        class63.field1021 = 1;
        class312.method2177(30, (byte) -119);
        if (arg0 == -17) {
            for (int var3 = 0; var3 < 100; var3++) {
                class47.field692[var3] = true;
            }
            class321.method2220((byte) -99);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 69)
    public static void method54(byte arg0) {
        field129 = null;
        field123 = null;
        if (arg0 < -90) {
            field124 = null;
            field127 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 92)
    public static final void method55(byte arg0) {
        for (int var1 = -1; var1 < class43.field569; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class194.field3511[var1];
            }
            class51 var3 = class96.field1558[var2];
            if (var3 != null) {
                class99.method684(var3, var3.method363((byte) 49), arg0 ^ 0x3270);
            }
        }
        if (arg0 != 53) {
            method54((byte) 98);
        }
        field120++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 129)
    public static final void method56(int arg0, int arg1) {
        field125++;
        class120 var2 = class248.method1704(arg0, 125, arg1);
        var2.method843((byte) 28);
    }
}
