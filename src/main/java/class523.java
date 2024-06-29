import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class523 {

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public int field7172 = 1;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[I")
    public static int[][] field7168 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Ljda;")
    public static class239 field7171 = new class239(64);

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lmga;")
    public static class739 field7173 = new class739(3, -1);

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lur;")
    public static class564 field7175 = new class564();

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Ljw;")
    public static class581 field7176 = new class581(83, 2);

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field7178 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "C")
    public char field7174;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 8)
    public static void method3016(int arg0) {
        field7175 = null;
        field7176 = null;
        if (arg0 != 8) {
            method3017(105, 49);
        }
        field7171 = null;
        field7168 = null;
        field7173 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Z", line = 24)
    public static final boolean method3017(int arg0, int arg1) {
        field7170++;
        int var2 = 51 / ((38 - arg1) / 39);
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 36)
    public static final void method3018(byte arg0) {
        class93.method748(10);
        field7166++;
        class73.field1031 = null;
        class708.field9928 = null;
        class66.field937 = null;
        class162.field2200 = null;
        class652.field9037 = null;
        int var1 = 74 / ((arg0 - 30) / 33);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjp;I)V", line = 53)
    private final void method3019(int arg0, class376 arg1, int arg2) {
        field7169++;
        if (arg2 != 9) {
            this.method3019(69, null, 104);
        }
        if (arg0 == 1) {
            this.field7174 = class682.method3796((byte) 42, arg1.method2387((byte) -126));
        } else if (arg0 == 2) {
            this.field7172 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljp;I)V", line = 84)
    public final void method3020(class376 arg0, int arg1) {
        if (arg1 != 0) {
            this.method3019(-104, null, 68);
        }
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                field7165++;
                return;
            }
            this.method3019(var3, arg0, 9);
        }
    }
}
