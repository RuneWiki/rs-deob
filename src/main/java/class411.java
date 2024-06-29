import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class411 extends class544 {

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[B")
    public byte[] field5348;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lhba;")
    public static class10 field5346 = new class10(2);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[[I")
    public static int[][] field5350 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I", line = 3)
    public static final int method2348(int arg0) {
        field5349++;
        if (arg0 != 6) {
            field5350 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 20)
    public static final void method2349(int arg0) {
        if (arg0 <= -116) {
            field5347++;
            class539.field7888.method3694(0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V", line = 32)
    public class411(byte[] arg0) {
        this.field5348 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)I", line = 40)
    public static final int method2350(int arg0, int arg1, int arg2) {
        field5351++;
        if (arg1 != 8151) {
            method2349(82);
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 76)
    public static void method2351(boolean arg0) {
        field5346 = null;
        if (!arg0) {
            field5350 = null;
        }
    }
}
