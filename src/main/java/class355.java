import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class355 {

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "[I")
    public static int[] field5445 = new int[14];

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Luv;")
    public static class2 field5440 = new class2(78, 2);

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "[I")
    public static int[] field5458;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public int field5446;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public int field5454;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public int field5460;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method2139(boolean arg0) {
        field5440 = null;
        field5458 = null;
        if (!arg0) {
            method2139(false);
        }
        field5445 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static final void method2140(int arg0) {
        int var1 = -106 % ((21 - arg0) / 49);
        class31.method277(false);
        field5459++;
    }

    static {
        new class347("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field5458 = new int[13];
    }
}
