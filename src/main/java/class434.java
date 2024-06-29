import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class434 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lmc;")
    public static class78 field5901 = new class78(12, 8);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
    public static volatile boolean field5906 = false;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lgd;")
    public static class206 field5907 = new class206("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method2558(int arg0) {
        field5907 = null;
        if (arg0 < 84) {
            field5901 = null;
        }
        field5901 = null;
    }

    @OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5903++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method2559(byte arg0) {
        class490.method2854(class385.field5314, (byte) 103);
        field5900++;
        class450.field6115++;
        if (class65.field866 && class135.field1970) {
            int var1 = class34.field523.method1916((byte) -21);
            int var2 = class34.field523.method1925(50);
            int var3 = var1 - class200.field2714;
            int var4 = var2 - class291.field3910;
            if (var3 < class348.field4797) {
                var3 = class348.field4797;
            }
            if (var4 < class82.field1084) {
                var4 = class82.field1084;
            }
            if ((class385.field5314.field6308 + var3) > (class348.field4797 + class65.field858.field6308)) {
                var3 = class65.field858.field6308 + class348.field4797 - class385.field5314.field6308;
            }
            if (var4 + class385.field5314.field6340 > class82.field1084 + class65.field858.field6340) {
                var4 = class82.field1084 + class65.field858.field6340 - class385.field5314.field6340;
            }
            if (arg0 >= -97) {
                field5901 = null;
            }
            int var5 = var3 + class65.field858.field6330 - class348.field4797;
            int var6 = class65.field858.field6333 + var4 - class82.field1084;
            if (class34.field523.method1917((byte) 94)) {
                if (class385.field5314.field6357 < class450.field6115) {
                    int var8 = var3 - class326.field4349;
                    int var9 = var4 - class437.field5934;
                    if (class385.field5314.field6293 < var8 || -class385.field5314.field6293 > var8 || var9 > class385.field5314.field6293 || var9 < -class385.field5314.field6293) {
                        class252.field3365 = true;
                    }
                }
                if (class385.field5314.field6418 != null && class252.field3365) {
                    class82 var10 = new class82();
                    var10.field1092 = var6;
                    var10.field1086 = class385.field5314;
                    var10.field1085 = class385.field5314.field6418;
                    var10.field1091 = var5;
                    class382.method2340(var10);
                }
            } else {
                if (class252.field3365) {
                    class78.method513(-1);
                    if (class385.field5314.field6311 != null) {
                        class82 var7 = new class82();
                        var7.field1091 = var5;
                        var7.field1093 = class114.field1719;
                        var7.field1086 = class385.field5314;
                        var7.field1085 = class385.field5314.field6311;
                        var7.field1092 = var6;
                        class382.method2340(var7);
                    }
                    if (class114.field1719 != null && client.method1057(class385.field5314) != null) {
                        class110.method709(class114.field1719, false, class385.field5314);
                    }
                } else if ((class208.field2811 == 1 || class351.method2174(-1)) && class475.field6540 > 2) {
                    class96.method599(class291.field3910 + class437.field5934, class326.field4349 + class200.field2714, (byte) -49);
                } else if (class316.method1735(0)) {
                    class96.method599(class291.field3910 + class437.field5934, class326.field4349 + class200.field2714, (byte) -54);
                }
                class385.field5314 = null;
            }
        } else if (class450.field6115 > 1) {
            class385.field5314 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I")
    public final int method2560(byte arg0) {
        field5902++;
        return arg0 == -66 ? this.field5904 : -111;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
    public class434(int arg0, int arg1) {
        this.field5905 = arg1;
        this.field5904 = arg0;
    }
}
