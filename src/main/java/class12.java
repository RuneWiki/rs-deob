import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class12 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public int field166 = 0;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lvc;")
    public static class129 field159 = new class129();

    @OriginalMember(owner = "client!an", name = "e", descriptor = "[[[I")
    public static int[][][] field162 = new int[4][13][13];

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lce;")
    public static class126 field163 = null;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lcc;")
    public static class313 field161;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lbb;I)V", line = 10)
    public final void method68(class134 arg0, int arg1) {
        field164++;
        while (true) {
            int var3 = arg0.method948(-126);
            if (var3 == 0) {
                if (arg1 != 3) {
                    field167 = 116;
                }
                return;
            }
            this.method72(arg0, var3, arg1 ^ 0x6);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([Lce;B)Lce;", line = 35)
    public static final class126 method69(class126[] arg0, byte arg1) {
        if (arg1 <= 114) {
            field167 = 29;
        }
        field160++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class153.method1137((byte) -73, arg0.length, 0, arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 73)
    public static void method70(byte arg0) {
        field159 = null;
        field163 = null;
        if (arg0 < 90) {
            field161 = (class313) null;
        }
        field161 = null;
        field162 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I", line = 99)
    public static final int method71(int arg0, int arg1) {
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC6) >> 6;
        field158++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1 > -121) {
            method70((byte) 117);
        }
        return 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lbb;II)V", line = 162)
    private final void method72(class134 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field166 = arg0.method942(true);
        }
        field165++;
    }
}
