import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class254 {

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Ldh;")
    public class254 field3440;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lc;")
    public class511 field3445;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "F")
    public static float field3443;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ldp;")
    public static class347 field3446;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "F")
    public static float field3455;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Luv;")
    public static class2 field3454;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "F")
    public static float field3450;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[Ll;")
    public static class127[] field3448;

    static {
        new class347(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field3443 = 1024.0F;
        field3446 = new class347("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        field3455 = 0.25F;
        field3454 = new class2(86, 6);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Canvas;IILga;)Lya;", line = 9)
    public static final class11 method1511(Canvas arg0, int arg1, int arg2, class243 arg3) {
        field3453++;
        return arg2 == 1024 ? new class13(arg1, arg0, arg3) : null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lki;", line = 24)
    public final class232 method1512(int arg0) {
        if (arg0 != 1024) {
            this.method1512(-101);
        }
        field3451++;
        return class118.method891(this.field3441, 2);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 35)
    public static void method1513(byte arg0) {
        field3446 = null;
        field3454 = null;
        field3448 = null;
        if (arg0 <= 72) {
            method1511(null, 17, -50, null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)Ldh;", line = 52)
    public final class254 method1514(byte arg0, int arg1) {
        field3444++;
        return arg0 >= -65 ? null : new class254(this.field3441, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V", line = 72)
    public class254(int arg0, int arg1) {
        this.field3452 = arg1;
        this.field3441 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ldh;I)V", line = 85)
    public class254(class254 arg0, int arg1) {
        this.field3440 = arg0;
        this.field3445 = this.field3440.field3445;
        this.field3452 = this.field3440.field3452 + arg1;
        this.field3441 = this.field3440.field3441;
    }
}
