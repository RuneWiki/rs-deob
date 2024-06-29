import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class52 extends class504 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lxa;")
    public static class468 field726;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z")
    public final boolean method349(int arg0, int arg1) {
        int var3 = 71 % ((arg0 - 50) / 54);
        field728++;
        return (this.field725 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
    public final int method350(byte arg0) {
        if (arg0 <= 119) {
            field726 = null;
        }
        field722++;
        return this.field725 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)[Llt;")
    public static final class633[] method351(byte arg0) {
        if (arg0 != 114) {
            field726 = null;
        }
        field721++;
        return new class633[] { class527.field7026, class169.field2609, class529.field7048 };
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Z")
    public final boolean method352(int arg0) {
        if (arg0 == -27140) {
            field723++;
            return (this.field725 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Z")
    public final boolean method353(int arg0) {
        field727++;
        if (arg0 > -11) {
            method351((byte) 49);
        }
        return ((this.field725 & 0x4DC8E1) >> 22) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static void method354(int arg0) {
        field726 = null;
        if (arg0 != -1) {
            method351((byte) 94);
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)I")
    public final int method355(byte arg0) {
        if (arg0 != -55) {
            method351((byte) 115);
        }
        field724++;
        return class271.method1652((byte) 79, this.field725);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z")
    public final boolean method356(boolean arg0) {
        field720++;
        if (arg0) {
            method351((byte) 111);
        }
        return (this.field725 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field729 = arg1;
        this.field725 = arg0;
    }
}
