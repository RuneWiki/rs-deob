import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("uh")
public class class192 extends class71 {

    @OriginalMember(owner = "uh", name = "z", descriptor = "I")
    public static int field3676 = 0;

    @OriginalMember(owner = "uh", name = "C", descriptor = "[[I")
    public static int[][] field3679 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "uh", name = "y", descriptor = "I")
    public static int field3675 = 0;

    @OriginalMember(owner = "uh", name = "o", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "uh", name = "s", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "uh", name = "t", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "uh", name = "u", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "uh", name = "w", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "uh", name = "x", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "uh", name = "q", descriptor = "[I")
    public int[] field3667;

    @OriginalMember(owner = "uh", name = "A", descriptor = "[I")
    public int[] field3677;

    @OriginalMember(owner = "uh", name = "B", descriptor = "[I")
    public int[] field3678;

    @OriginalMember(owner = "uh", name = "n", descriptor = "[Lda;")
    public class32[] field3664;

    @OriginalMember(owner = "uh", name = "p", descriptor = "[Lda;")
    public class32[] field3666;

    @OriginalMember(owner = "uh", name = "r", descriptor = "[Ljc;")
    public static class88[] field3668;

    @OriginalMember(owner = "uh", name = "v", descriptor = "[[[B")
    public byte[][][] field3672;

    @OriginalMember(owner = "uh", name = "a", descriptor = "(IIII)V")
    public static final void method1289(int arg0, int arg1, int arg2, int arg3) {
        class3 var4 = class78.field1550[arg0][arg1][arg2];
        if (var4 != null) {
            class78.field1550[arg0][arg1][arg2].field23 = arg3;
        }
    }

    @OriginalMember(owner = "uh", name = "a", descriptor = "(BI)Lsd;")
    public static final class170 method1290(byte arg0, int arg1) {
        class170 var2 = (class170) class78.field1504.method1086((long) arg1, -110);
        field3665++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == -99) {
            byte[] var3 = client.field680.method147(arg0 ^ 0xFFFFFF9D, arg1, 9);
            class170 var4 = new class170();
            var4.field3193 = arg1;
            if (var3 != null) {
                var4.method1148(0, new class86(var3));
            }
            var4.method1146(-36);
            class78.field1504.method1082((long) arg1, arg0 + 121, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "uh", name = "a", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3668 = null;
        if (arg0 != -1) {
            method1289(101, -125, -95, 90);
        }
        field3679 = null;
    }

    @OriginalMember(owner = "uh", name = "a", descriptor = "(IJ)V")
    public static final void method1292(int arg0, long arg1) {
        field3674++;
        if (arg1 == 0L || arg0 != 3542) {
            return;
        }
        for (int var3 = 0; var3 < class19.field426; var3++) {
            if (class82.field1607[var3] == arg1) {
                class134.field2564++;
                class19.field426--;
                for (int var4 = var3; var4 < class19.field426; var4++) {
                    class82.field1607[var4] = class82.field1607[var4 + 1];
                    class31.field741[var4] = class31.field741[var4 + 1];
                }
                class107.field2127 = class75.field1442;
                class200.field3850.method1339((byte) 92, 7);
                class200.field3850.method592(arg1, -562765672);
                return;
            }
        }
    }
}
