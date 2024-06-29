import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class81 extends class15 {

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lj;")
    public class227 field1303;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "Lce;")
    private static class126 field1307 = class206.method1445(-7923, "Connected to update server");

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Lce;")
    public static class126 field1302 = field1307;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Lml;")
    public static class160 field1305 = new class160(2);

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "Lce;")
    private static class126 field1311 = class206.method1445(-7923, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "Lce;")
    public static class126 field1308 = field1311;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "Lce;")
    private static class126 field1312 = class206.method1445(-7923, "Take");

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "Lce;")
    public static class126 field1310 = field1312;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "Lml;")
    public static class160 field1309 = new class160(260);

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Lce;")
    public static class126 field1314 = class206.method1445(-7923, " loggt sich aus)3");

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "Lce;")
    public static class126 field1313 = class206.method1445(-7923, "(U (X");

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Z")
    public static boolean field1315 = true;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V", line = 9)
    public static void method578(byte arg0) {
        field1305 = null;
        field1308 = null;
        field1302 = null;
        field1314 = null;
        field1311 = null;
        field1312 = null;
        field1313 = null;
        int var1 = -93 % ((75 - arg0) / 32);
        field1307 = null;
        field1310 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lce;BI)V", line = 28)
    public static final void method579(class126 arg0, byte arg1, int arg2) {
        class245 var3 = class139.method1022(3, (byte) -127, arg2);
        var3.method1683(0);
        field1304++;
        var3.field4148 = arg0;
        if (arg1 != 78) {
            field1314 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lj;)V", line = 42)
    public class81(class227 arg0) {
        this.field1303 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLcc;Lcc;)V", line = 53)
    public static final void method580(byte arg0, class313 arg1, class313 arg2) {
        class321.field5495 = arg1;
        field1306++;
        if (arg0 != 63) {
            field1305 = (class160) null;
        }
        class13.field178 = arg2;
    }
}
