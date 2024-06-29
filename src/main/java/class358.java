import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class358 extends class376 {

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "S")
    public short field5039;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[[Z")
    public static boolean[][] field5041 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field5044 = 0;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V", line = 5)
    public static void method2315(byte arg0) {
        int var1 = -42 / ((arg0 - 39) / 50);
        field5041 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILeb;)Ljava/lang/String;", line = 19)
    public static final String method2316(int arg0, class371 arg1) {
        if (arg0 != 32767) {
            field5041 = null;
        }
        field5042++;
        return class173.method1167((byte) 90, 32767, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 37)
    public static final String method2317(int arg0, int arg1, byte arg2) {
        field5040++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            if (arg2 != 1) {
                field5043 = -124;
            }
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V", line = 79)
    public class358() {
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(S)V", line = 81)
    public class358(short arg0) {
        this.field5039 = arg0;
    }
}
