import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class177 extends class199 {

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2678 = "cyan:";

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
    public static int[] field2683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "C")
    private char field2679;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Ljava/lang/String;")
    public String field2686;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 4)
    public static void method1261(byte arg0) {
        field2678 = null;
        field2683 = null;
        int var1 = 34 % ((-arg0 - 4) / 60);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILkh;)V", line = 16)
    private final void method1262(int arg0, int arg1, class166 arg2) {
        field2682++;
        if (arg1 != 1) {
            method1261((byte) 55);
        }
        if (arg0 == 1) {
            this.field2679 = class214.method1503(arg2.method1143(arg1 + 72), (byte) 58);
        } else if (arg0 == 2) {
            this.field2684 = arg2.method1137(73);
        } else if (arg0 == 5) {
            this.field2686 = arg2.method1179((byte) -115);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Ltb;", line = 47)
    public static final class220 method1263(int arg0, int arg1, int arg2) {
        class220 var3 = class68.method524((byte) -81, arg0);
        field2685++;
        if (arg2 == -1) {
            return var3;
        } else if (arg1 > -92) {
            return (class220) null;
        } else if (var3 == null || var3.field3472 == null || var3.field3472.length <= arg2) {
            return null;
        } else {
            return var3.field3472[arg2];
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z", line = 68)
    public final boolean method1264(byte arg0) {
        if (arg0 <= 35) {
            this.method1265(false, (class166) null);
        }
        field2681++;
        return this.field2679 == 's';
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLkh;)V", line = 82)
    public final void method1265(boolean arg0, class166 arg1) {
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                if (!arg0) {
                    this.field2684 = -43;
                }
                field2680++;
                return;
            }
            this.method1262(var3, 1, arg1);
        }
    }
}
