import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class430 extends class207 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[[I")
    public static int[][] field5885 = new int[128][128];

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field5890 = 1337;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lff;")
    public static class9 field5887 = new class9(15, 0);

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "F")
    public static float field5884;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method2483(boolean arg0) {
        int var1 = 0;
        if (!arg0) {
            method2484((byte) 106, 70);
        }
        while (var1 < 5) {
            class265.field3504[var1] = false;
            var1++;
        }
        field5886++;
        class42.field623 = 1;
        class450.field6127 = -1;
        class520.field7699 = -1;
        class154.field2242 = 0;
        class60.field945 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)Lra;", line = 33)
    public static final class70 method2484(byte arg0, int arg1) {
        field5891++;
        class70[] var2 = class421.method2424((byte) 106);
        int var3 = -68 / (arg0 / 35);
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].field1052 == arg1) {
                return var2[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([SB[Ljava/lang/String;)V", line = 59)
    public static final void method2485(short[] arg0, byte arg1, String[] arg2) {
        class20.method188(arg2, arg2.length - 1, (byte) -39, 0, arg0);
        field5889++;
        if (arg1 != -72) {
            method2483(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 84)
    public static void method2486(int arg0) {
        field5887 = null;
        if (arg0 != 128) {
            field5885 = null;
        }
        field5885 = null;
    }
}
