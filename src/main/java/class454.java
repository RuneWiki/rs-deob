import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class454 extends class499 implements class458 {

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lug;I[BI)V")
    public class454(class395 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6549 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I")
    public final int method2501(byte arg0) {
        ++field6546;
        if (arg0 != -58) {
            this.field6549 = 56;
        }
        return this.field6549;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III[B)V")
    public final void method2505(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3008(arg3, arg2);
        if (arg1 != 6538) {
            this.field6549 = 94;
        }
        ++field6551;
        this.field6549 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lhd;IBI)V")
    public static final void method2704(class523 arg0, int arg1, byte arg2, int arg3) {
        ++field6545;
        if (class233.field2985 == null && !class122.field1646) {
            int var4 = 40 % ((arg2 - 70) / 38);
            if (arg0 != null && class296.method1741((byte) 96, arg0) != null) {
                class233.field2985 = arg0;
                class177.field2338 = class296.method1741((byte) 96, arg0);
                class52.field701 = 0;
                class178.field2358 = false;
                class452.field6531 = arg3;
                class501.field7242 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)Z")
    public static final boolean method2705(int arg0, int arg1, int arg2) {
        ++field6547;
        if (arg1 < 70) {
            method2704((class523) null, -9, (byte) -60, 119);
        }
        return (class502.method3023(arg0, (byte) -125, arg2) | class139.method944(arg0, arg2, 106) | class418.method2463(arg2, 52, arg0)) & class129.method913(3754, arg0, arg2);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
    public final int method2502(byte arg0) {
        ++field6548;
        int var2 = -9 % ((-55 - arg0) / 52);
        return 0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)J")
    public final long method2503(int arg0) {
        ++field6550;
        if (arg0 >= -31) {
            this.field6549 = 102;
        }
        return super.field7226.method2593();
    }

    static {
        new class335("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
