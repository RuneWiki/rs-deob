import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class523 {

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public int field6616 = 1;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public static int field6621 = 0;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "C")
    public char field6618;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6615;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "[[B")
    public static byte[][] field6614;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILji;)V", line = 11)
    public final void method2825(int arg0, class572 arg1) {
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                field6622++;
                if (arg0 != 0) {
                    this.method2828(99, null, 119);
                    return;
                }
                return;
            }
            this.method2828(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lpfa;B)V", line = 33)
    public static final void method2826(class275 arg0, byte arg1) {
        class325.field4068 = arg0;
        int var2 = 120 / ((arg1 + 58) / 54);
        field6617++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)I", line = 46)
    public static final int method2827(int arg0, int arg1) {
        field6620++;
        int var2 = 103 % ((74 - arg1) / 50);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILji;I)V", line = 57)
    private final void method2828(int arg0, class572 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field6619++;
        if (arg0 == 1) {
            this.field6618 = class171.method1030(arg1.method3083(255), true);
        } else if (arg0 == 2) {
            this.field6616 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 77)
    public static void method2829(int arg0) {
        field6615 = null;
        field6614 = null;
        if (arg0 != -10024) {
            field6615 = null;
        }
    }
}
