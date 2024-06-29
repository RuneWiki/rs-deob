import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class282 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lgp;")
    public class282 field4098;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lbd;")
    public class327 field4101;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lec;")
    public static class40 field4104 = new class40("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "[B")
    public static byte[] field4109 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lsd;")
    public static class74 field4108 = new class74(81, 6);

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Lwb;")
    public static class45 field4112 = new class45(8);

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "Lco;")
    public static class210 field4114 = new class210(4);

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method1772(byte arg0) {
        field4108 = null;
        field4114 = null;
        field4109 = null;
        field4104 = null;
        if (arg0 <= 51) {
            method1772((byte) -76);
        }
        field4112 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILvt;)Laa;")
    public static final class298 method1773(int arg0, class179 arg1) {
        arg1.method895((byte) -110);
        field4107++;
        int var2 = arg1.method895((byte) -77);
        class298 var3 = class314.method1939(14, var2);
        var3.field4447 = arg1.method895((byte) -94);
        int var4 = arg1.method895((byte) -111);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method895((byte) -95);
            var3.method10(-76, var6, arg1);
        }
        var3.method15(-74);
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
    public class282(int arg0, int arg1) {
        this.field4099 = arg0;
        this.field4100 = arg1;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lgp;I)V")
    public class282(class282 arg0, int arg1) {
        this.field4098 = arg0;
        this.field4100 = this.field4098.field4100 + arg1;
        this.field4101 = this.field4098.field4101;
        this.field4099 = this.field4098.field4099;
    }
}
