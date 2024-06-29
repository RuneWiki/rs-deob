import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class221 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lss;")
    public static class213 field3738 = new class213("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lhc;")
    public class221 field3739;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lhc;")
    public class221 field3741;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3737;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[[Z")
    public static boolean[][] field3735;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1612(int arg0) {
        if (arg0 != 295) {
            field3737 = null;
        }
        field3735 = null;
        field3738 = null;
        field3737 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public final void method1613(int arg0) {
        field3736++;
        if (this.field3741 == null) {
            return;
        }
        this.field3741.field3739 = this.field3739;
        this.field3739.field3741 = this.field3741;
        this.field3739 = null;
        this.field3741 = null;
        if (arg0 != 1049391719) {
            this.field3739 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
    public static final void method1614(int arg0, boolean arg1) {
        if (arg1) {
            if (class509.field7597 != -1) {
                class433.method2724(class509.field7597, 115);
            }
            for (class301 var2 = (class301) class423.field6414.method1119(false); var2 != null; var2 = (class301) class423.field6414.method1121((byte) -126)) {
                if (!var2.method3147(99)) {
                    var2 = (class301) class423.field6414.method1119(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class215.method1588(true, arg0 - 27044, var2, false);
            }
            class509.field7597 = -1;
            class423.field6414 = new class177(8);
            class452.method2846(90);
            class509.field7597 = class39.field385;
            class154.method942(false, arg0 - 26801);
            class236.method1667(2318);
            class420.method2674(class509.field7597);
        }
        field3743++;
        class270.field4310 = "";
        class372.field5719 = "";
        class257.field4155 = false;
        class264.method1811(80);
        class436.field6587 = -1;
        if (arg0 != 26925) {
            field3735 = null;
        }
        class456.method2860(class86.field1254, 95);
        class358.field5565 = new class350();
        class358.field5565.field894[0] = class135.field1839 / 2;
        class358.field5565.field6417 = class135.field1839 * 128 / 2;
        class358.field5565.field6410 = class197.field3038 * 128 / 2;
        class358.field5565.field899[0] = class197.field3038 / 2;
        class98.field1404 = 0;
        class163.field2367 = 0;
        if (class334.field5222 == 2) {
            class163.field2367 = class203.field3094 << 7;
            class98.field1404 = class296.field4667 << 7;
        } else {
            class345.method2282((byte) -127);
        }
        class278.method1866((byte) -111);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
    public static final void method1615(int arg0, byte arg1, int arg2) {
        field3740++;
        class456 var3 = class233.method1654(0, 15, 126);
        var3.method2858(10250);
        var3.field7042 = arg2;
        var3.field7041 = arg0;
        int var4 = -58 / ((arg1 + 74) / 37);
    }
}
