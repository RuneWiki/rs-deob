import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class441 extends class607 {

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    public static boolean field6583;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6582;

    static {
        new class474("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6583 = false;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ltu;)V", line = 4)
    public class441(class294 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 8)
    public final void method805(byte arg0) {
        if (arg0 != -58) {
            field6582 = null;
        }
        ++field6573;
        super.field8870.method1917(false, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V", line = 21)
    public final void method811(boolean arg0, byte arg1) {
        if (arg1 == 91) {
            super.field8870.method1917(true, false);
            ++field6577;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLiu;)V", line = 36)
    public final void method810(int arg0, byte arg1, class502 arg2) {
        super.field8870.method1971((byte) -103, arg2);
        ++field6578;
        if (arg1 >= -73) {
            method2743(false);
        }
        super.field8870.method1904(arg0, -122);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z", line = 48)
    public final boolean method814(byte arg0) {
        ++field6581;
        return arg0 != -97 ? true : true;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V", line = 60)
    public static final void method2743(boolean arg0) {
        ++field6575;
        if (class87.field989) {
            class367.field5549 = null;
            class87.field989 = arg0;
            class176.field2149 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 74)
    public final void method808(int arg0, boolean arg1) {
        ++field6580;
        if (arg0 != 993) {
            method2743(false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V", line = 84)
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 == 12868) {
            ++field6576;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLjava/lang/String;ZJ)V", line = 94)
    public static final void method2744(boolean arg0, String arg1, boolean arg2, long arg3) {
        ++field6579;
        if (arg0) {
            class80.method525(1);
            if (class506.field7343.equals("")) {
                class523.field7601 = 39;
                return;
            }
        }
        class194 var5 = new class194(576);
        var5.method1205((byte) -69, 10);
        var5.method1229((int) (Math.random() * 65535.0D), 30364);
        var5.method1206(arg3, 4);
        var5.method1229(!arg0 ? class448.field6686 : class120.field1502, 30364);
        var5.method1223(true, (int) (9.9999999E7D * Math.random()));
        var5.method1237(1049279824, arg1);
        var5.method1223(true, (int) (Math.random() * 9.9999999E7D));
        if (!arg0) {
            var5.method1223(arg2, (int) (9.9999999E7D * Math.random()));
            var5.method1223(arg2, (int) (Math.random() * 9.9999999E7D));
            var5.method1223(true, (int) (Math.random() * 9.9999999E7D));
            var5.method1223(arg2, (int) (Math.random() * 9.9999999E7D));
        } else {
            var5.method1206(class573.method3335(class506.field7343, 512), 4);
            try {
                var5.method1206(Long.parseLong(class240.field3409), 4);
            } catch (Exception var6) {
                class523.field7601 = 39;
                return;
            }
        }
        var5.method1223(true, (int) (9.9999999E7D * Math.random()));
        var5.method1199(0, class630.field9089, class410.field6244);
        class468.field6960.field2610 = 0;
        class468.field6960.method1205((byte) -69, !arg0 ? class129.field1610.field9114 : class129.field1613.field9114);
        class468.field6960.method1229(28 - -var5.field2610, 30364);
        class468.field6960.method1229(611, 30364);
        class468.field6960.method1205((byte) -69, class35.field396);
        class468.field6960.method1205((byte) -69, class184.field2291.field1843);
        class451.method2788(class468.field6960, arg2);
        class468.field6960.method1198(255, var5.field2610, var5.field2622, 0);
        class523.field7601 = -3;
        class572.field8266 = 0;
        class489.field7134 = 0;
        class360.field5099 = 1;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 153)
    public static void method2745(int arg0) {
        field6582 = null;
        if (arg0 != 1) {
            method2745(-107);
        }
    }
}
