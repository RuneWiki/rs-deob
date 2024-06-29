import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class49 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Ld;")
    public static class242 field761 = new class242(8);

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field764 = 0;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field765 = 1;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[Lvb;")
    public static class231[] field758;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 3)
    public static void method324(int arg0) {
        field758 = null;
        int var1 = 29 / ((arg0 + 62) / 53);
        field761 = null;
    }

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field766++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 24)
    public static final void method325(int arg0) {
        field763++;
        if (class390.field5713) {
            return;
        }
        if (class40.field667.field4187) {
            class353.field5236 = ((int) class353.field5236 - 17 & 0xFFFFFFF0);
        } else {
            class301.field4616 += (-class301.field4616 - 12.0F) / 2.0F;
        }
        if (arg0 != 8) {
            field758 = null;
        }
        class397.field5861 = true;
        class390.field5713 = true;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I", line = 50)
    public final int method326(byte arg0) {
        field762++;
        if (arg0 <= 36) {
            field765 = -116;
        }
        return this.field757;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILjava/lang/String;)V", line = 65)
    public static final void method327(byte arg0, int arg1, String arg2) {
        field759++;
        class188 var3 = class10.method48((byte) 51, 2, arg1);
        var3.method1308(false);
        var3.field2881 = arg2;
        int var4 = -44 % ((-arg0 - 72) / 39);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V", line = 88)
    public class49(int arg0, int arg1) {
        this.field757 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V", line = 102)
    public static final void method328(int arg0, int arg1, int arg2) {
        if (class446.field6627 == arg0) {
            class154.method1122(arg2, 0, arg1, class112.field1674);
        } else if (class446.field6627 == 2) {
            class6.method28(arg1, arg2, 7);
        }
        field760++;
        class446.field6627 = 0;
        class112.field1674 = null;
    }
}
