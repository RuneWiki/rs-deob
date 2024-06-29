import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class193 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lv;")
    public static class218 field3454 = new class218();

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Loc;")
    private static class151 field3456 = class137.method873(2, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static volatile int field3458 = 0;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Loc;")
    public static class151 field3459 = class137.method873(2, "Hierhin gehen");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Loc;")
    public static class151 field3462 = field3456;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Loc;")
    private static class151 field3457 = class137.method873(2, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Loc;")
    public static class151 field3461 = field3457;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field3453;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public int[] field3451;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method523(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field3457 = null;
        field3456 = null;
        field3454 = null;
        if (arg0 == -26457) {
            field3461 = null;
            field3462 = null;
            field3459 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method522(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1215(int arg0) {
        class20.field448.method1317((byte) 24);
        field3455++;
        class134.field2438.method1026(-1);
        if (arg0 != 0) {
            field3458 = -48;
        }
        class224.field3896.method1026(-1);
        class112.field1978.method1026(-1);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z")
    public static final boolean method1216(int arg0) {
        field3450++;
        return class218.field3799 == arg0 ? class69.field1363.method808((byte) 118) : true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method1217(byte arg0) {
        class221.method1380(this.field3451, this.field3452, this.field3460);
        if (arg0 >= 77) {
            field3449++;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    protected class193() {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method524(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);
}
