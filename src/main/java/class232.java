import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class232 {

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Z")
    public boolean field3408 = false;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public int field3413 = 443;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public int field3416 = 43594;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Lbv;")
    public static class567 field3414 = new class567("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Lbv;")
    public static class567 field3418 = new class567(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "J")
    public static long field3419 = 20000000L;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Ljava/lang/String;")
    public String field3411;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLp;)Z")
    public static final boolean method1515(boolean arg0, class231 arg1) {
        if (arg0) {
            return false;
        }
        field3415++;
        class370 var2 = class552.field7819.method2890(0, arg1.method264(-25792));
        if (var2.field5293 == -1) {
            return true;
        } else {
            class169 var3 = class484.field6855.method2557(34, var2.field5293);
            return var3.field2465 == -1 ? true : var3.method1167((byte) -32);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method1516(int arg0) {
        field3414 = null;
        field3418 = null;
        int var1 = -103 % ((58 - arg0) / 35);
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
    public final int method1517(int arg0) {
        field3417++;
        if (this.field3408) {
            return this.field3413;
        } else if (arg0 == -7005) {
            return this.field3416;
        } else {
            return 93;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lcba;B)Z")
    public final boolean method1518(class232 arg0, byte arg1) {
        field3410++;
        int var3 = -79 / ((arg1 + 2) / 51);
        if (arg0 == null) {
            return false;
        } else {
            return this.field3409 == arg0.field3409 && this.field3411.equals(arg0.field3411);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILqa;)V")
    public static final void method1519(int arg0, int arg1, int arg2, class167 arg3) {
        class134.field2161 = arg3;
        field3412++;
        class584.field8319 = new class366[arg0][arg2];
        if (class538.field7502 != null) {
            class139.field2188 = class151.method1080(class538.field7502[1], class538.field7502[2], class538.field7502[4], class538.field7502[0], (byte) 60, class538.field7502[3], class538.field7502[5]);
        }
        if (arg1 < 52) {
            method1519(14, -15, 72, null);
        }
        class32.field438 = new class366();
        class594.method3392(6);
    }
}
