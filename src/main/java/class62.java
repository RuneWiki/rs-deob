import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class62 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ldf;")
    private static class51 field1006 = class46.method233("Loaded interfaces", 100);

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Ldf;")
    public static class51 field1013 = field1006;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1010 = 99;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
    public static int[] field1014 = new int[100];

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lwi;")
    public static class125 field1007 = class11.method63(120);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILu;)V")
    public static final void method410(int arg0, class111 arg1) {
        field1008++;
        if (class167.field2711) {
            return;
        }
        class59.method388();
        class140.field2348 = class240.method1651(class143.field2398, arg1, arg0 + 125);
        class140.field2348.method1100(-95, 0);
        class190.field3178 = class230.method1583(class228.field3983, true, arg1);
        class190.field3178.method1110(382 - (class190.field3178.field2583 / arg0), 18);
        class167.field2711 = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field1006 = null;
        if (arg0 != -15490) {
            method412((class51) null, false);
        }
        field1007 = null;
        field1013 = null;
        field1014 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ldf;Z)V")
    public static final void method412(class51 arg0, boolean arg1) {
        field1011++;
        for (class5 var2 = (class5) class141.field2367.method1720(true); var2 != null; var2 = (class5) class141.field2367.method1712((byte) 112)) {
            if (var2.field44.method315(arg1, arg0)) {
                class93.field1546 = var2;
                return;
            }
        }
        if (arg1) {
            method412((class51) null, false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field1012++;
        class29 var1 = class208.field3475;
        synchronized (class208.field3475) {
            class196.field3288++;
            if (arg0 > -88) {
                field1009 = -54;
            }
            class195.field3261 = class164.field2688;
            if (class5.field57 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class144.field2405[var2] = false;
                }
                class5.field57 = class262.field4578;
            } else {
                while (class5.field57 != class262.field4578) {
                    int var3 = class44.field711[class262.field4578];
                    class262.field4578 = class262.field4578 + 1 & 0x7F;
                    if (var3 < 0) {
                        class144.field2405[~var3] = false;
                    } else {
                        class144.field2405[var3] = true;
                    }
                }
            }
            class164.field2688 = class133.field2216;
        }
    }
}
