import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class252 {

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Lcf;")
    public static class93 field4537 = class147.method1066("::tween", -48);

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field4543 = 0;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Z")
    public static boolean field4546 = false;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Lcf;")
    public static class93 field4547 = class147.method1066(" est d-Bj-9 dans votre liste noire)3", -48);

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Z")
    public static boolean[] field4541 = new boolean[100];

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lnh;")
    public static class54 field4538 = new class54(50);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[B")
    public byte[] field4540;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[B")
    public byte[] field4542;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)I")
    public static final int method1707(int arg0, boolean arg1) {
        field4532++;
        if (arg1) {
            field4541 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1708(byte arg0) {
        field4541 = null;
        field4538 = null;
        field4537 = null;
        field4547 = null;
        if (arg0 > -116) {
            field4547 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZ)Lcf;")
    public static final class93 method1709(int arg0, int arg1, boolean arg2) {
        field4533++;
        if (arg0 != 24) {
            field4547 = null;
        }
        return class218.method1531(10, arg2, arg1, arg0 + 12913);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ltg;I)Lcf;")
    public static final class93 method1710(class181 arg0, int arg1) {
        int var2 = 37 / (arg1 / 61);
        field4534++;
        if (client.method1109(arg0).method1430(123) == 0) {
            return null;
        } else if (arg0.field3246 == null || arg0.field3246.method671(false).method666(false) == 0) {
            return field4546 ? class279.field4986 : null;
        } else {
            return arg0.field3246;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Ltd;")
    public static final class72 method1711(int arg0) {
        if (arg0 != 50) {
            method1710((class181) null, 64);
        }
        field4544++;
        try {
            return (class72) Class.forName("kl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1712(Component arg0, byte arg1) {
        field4539++;
        if (arg1 == -52) {
            arg0.removeKeyListener(class172.field3011);
            arg0.removeFocusListener(class172.field3011);
            class33.field522 = -1;
        }
    }
}
