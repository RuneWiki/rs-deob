import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class55 extends class264 {

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Lvq;")
    public static class24 field671 = new class24(59, -2);

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "Z")
    public static boolean field674 = false;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "Lct;")
    public static class104 field677;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Lfc;")
    public static class199 field673;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "Lae;")
    public class285 field676;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "Ldf;")
    public static class85 field675;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "Z")
    public boolean field679;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lvh;", line = 5)
    public static final class444 method420(int arg0, int arg1) {
        field678++;
        class444 var2 = (class444) class103.field1340.method1933((long) arg0, 0);
        if (arg1 != 31849) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class318.field4674.method715(arg0, (byte) 55, 19);
            class444 var4 = new class444();
            if (var3 != null) {
                var4.method2730(new class256(var3), -120);
            }
            class103.field1340.method1937(-18, (long) arg0, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Canvas;ZLic;I)Lfp;", line = 28)
    public static final class9 method421(Canvas arg0, boolean arg1, class235 arg2, int arg3) {
        field670++;
        if (!arg1) {
            method420(-28, -86);
        }
        return new class12(arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 48)
    public static void method422(int arg0) {
        field673 = null;
        field677 = null;
        if (arg0 >= -16) {
            field677 = null;
        }
        field671 = null;
        field675 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lct;ILct;)V", line = 65)
    public static final void method423(class104 arg0, int arg1, class104 arg2) {
        class239.field3559 = arg2;
        if (arg1 >= 96) {
            field680++;
            class367.field5303 = arg0;
        }
    }
}
