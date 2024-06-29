import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class108 extends class118 {

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Lpf;")
    public static class425 field1433 = new class425(38, -1);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg0 == 0) {
            this.field1431 = (arg2.method2343(arg1 + 254) << 12) / 255;
        }
        ++field1430;
        if (arg1 != 1) {
            this.method24(32, -87, (class385) null);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class108(int arg0) {
        super(0, true);
        this.field1431 = 4096;
        this.field1431 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
    public static final void method667(int arg0, int arg1, int arg2) {
        int var3 = class438.field6450 * arg0 >> 8;
        ++field1432;
        int var4 = 101 / ((-45 - arg2) / 58);
        if (~arg1 == 0 && !class437.field6428) {
            class39.method225((byte) -125);
        } else if (arg1 != -1 && (~class195.field2944 != ~arg1 || !class120.method721(-15920)) && ~var3 != -1 && !class437.field6428) {
            class310.method1889(2, class298.field4505, false, var3, 18667, 0, arg1);
        }
        class195.field2944 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLfh;)V")
    public static final void method668(byte arg0, class170 arg1) {
        ++field1434;
        if (class132.field1692) {
            class177.method1082(class318.field4807, arg0 + 3);
            ++class324.field4870;
            class189.field2840.method2381(arg1.field2525, 0);
            class189.field2840.method2334(class390.field5763, 1833667168);
            class189.field2840.method2373(-121, class186.field2795);
            class189.field2840.method2340((byte) -58, class54.field729);
            class189.field2840.method2334(arg1.field2592, 1833667168);
            if (arg0 != -3) {
                field1437 = -28;
            }
            class189.field2840.method2340((byte) -109, arg1.field2511);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static void method669(int arg0) {
        if (arg0 == 255) {
            field1433 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1436;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            class129.method766(var3, 0, class440.field6474, this.field1431);
        }
        if (arg0 != 1) {
            this.method24(45, -8, (class385) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class108() {
        this(4096);
    }

    static {
        new class151("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field1437 = 0;
    }
}
