import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class394 extends class179 {

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Z")
    public static boolean field5749 = true;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lbg;")
    public static class310 field5746 = new class310(75, 3);

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "Lrp;")
    public static class288 field5752 = new class288(10);

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public int field5753;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V", line = 6)
    public static final void method2338(int arg0) {
        field5748++;
        if (arg0 != -22124) {
            method2339(-85, null);
        }
        class409.field5933 = new class427[class274.field4161.method2738((byte) 109)][];
        class332.field4972 = new class427[class274.field4161.method2738((byte) 109)][];
        class70.field1229 = new boolean[class274.field4161.method2738((byte) 109)];
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILha;)Lie;", line = 20)
    public static final class6 method2339(int arg0, class40 arg1) {
        if (arg0 == 3) {
            field5751++;
            return new class6(arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method224(-2), arg1.method257((byte) 35));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V", line = 39)
    public static void method2340(int arg0) {
        field5746 = null;
        field5752 = null;
        if (arg0 > -15) {
            field5746 = null;
        }
    }
}
