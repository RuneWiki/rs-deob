import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class229 extends class108 {

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "Z")
    public boolean field3395;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "Lpp;")
    public static class464 field3396 = new class464(62, -1);

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V")
    public static final void method1506(int arg0, int arg1, int arg2) {
        field3399++;
        class21 var3 = class601.method3413(arg2, arg1, (byte) 89);
        var3.method230(arg1 + 18327);
        var3.field308 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBIII)V")
    public static final void method1507(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3398++;
        class127.field2088.field3913 = 0;
        class127.field2088.method1710(class97.field1684.field7507, 112);
        class127.field2088.method1710(arg0, 30);
        class127.field2088.method1710(arg2, 109);
        class127.field2088.method1699(true, arg4);
        class127.field2088.method1699(true, arg3);
        class23.field324 = 1;
        class617.field8731 = 0;
        class551.field7801 = -3;
        if (arg1 != -47) {
            method1506(-92, -94, -47);
        }
        class98.field1708 = 0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static final void method1508(int arg0) {
        field3393++;
        int var1 = arg0;
        if (class202.field2854.method3140(class646.field9388, 2)) {
            int var2 = arg0 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class202.field2854.field7893) {
            var1 |= 0x40;
        }
        class182.method1227(-108, var1);
        class552.field7819.method2884(var1, (byte) -22);
        class611.field8684.method1627(var1, -31009);
        class204.field2882.method291(var1, (byte) -64);
        class522.field7247.method2490(var1, (byte) -39);
        class287.method1820((byte) 31, var1);
        class295.method1857((byte) 77, var1);
        class125.method996(var1, 124);
        class511.method2865((byte) 25, var1);
        class540.method3036(3273);
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
    public static void method1509(int arg0) {
        field3396 = null;
        if (arg0 != 4) {
            method1510(121, -27, -76);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)Lvj;")
    public static final class382 method1510(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class382 var4 = var3.field2657;
            var3.field2657 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(IIIIIZ)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3401 = arg1;
        this.field3395 = arg5;
        this.field3392 = arg2;
        this.field3400 = arg4;
        this.field3391 = arg0;
        this.field3394 = arg3;
    }

    static {
        new class567("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        new class567("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field3402 = 0;
    }
}
