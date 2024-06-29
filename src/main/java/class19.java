import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Llc;")
    public static class69 field412 = class69.method470((byte) -103, " unread messages");

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Llc;")
    public static class69 field420 = class69.method470((byte) -102, "Imported models");

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Llc;")
    public static class69 field418 = class69.method470((byte) -114, "Prepared visibility map");

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Llc;")
    public static class69 field425 = class69.method470((byte) -109, "To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Llc;")
    public static class69 field429 = class69.method470((byte) -96, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Llc;")
    public static class69 field430 = class69.method470((byte) -111, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Llc;")
    public static class69 field431 = class69.method470((byte) -103, "yesterday");

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lea;")
    public class26 field432;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[[B")
    public static byte[][] field416;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkc;ZI)Lcb;")
    public static final class15 method124(class63 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field429 = null;
        }
        field411++;
        return class78.method556(arg0, arg2, 67) ? class108.method809(true) : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method125(int arg0) {
        field416 = null;
        if (arg0 != 0) {
            method124(null, false, 24);
        }
        field418 = null;
        field425 = null;
        field420 = null;
        field430 = null;
        field431 = null;
        field412 = null;
        field429 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILkc;II)Lda;")
    public static final class20 method126(int arg0, class63 arg1, int arg2, int arg3) {
        if (arg3 <= 81) {
            return null;
        } else {
            field413++;
            return class101.method768(500, arg2, arg1, arg0) ? class42.method247(true) : null;
        }
    }
}
