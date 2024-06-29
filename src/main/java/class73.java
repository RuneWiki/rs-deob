import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1116 = new String[5];

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[Lsj;")
    public static class50[] field1124 = new class50[14];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1125 = "Loaded update list";

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lel;")
    public static class213 field1119;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lfa;")
    public static class267 field1118;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method572(int arg0) {
        field1117++;
        class191.field2989.method1172((byte) 110);
        if (arg0 == 1) {
            class163.field2457.method1172((byte) 122);
            class136.field2043.method1172((byte) 115);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(CI)Z")
    public static final boolean method573(char arg0, int arg1) {
        field1115++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg1 != 128) {
            field1116 = null;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class156.field2332;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method574(int arg0) {
        field1116 = null;
        field1118 = null;
        field1124 = null;
        field1125 = null;
        if (arg0 <= 35) {
            method575((byte) -15, -56L);
        }
        field1119 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BJ)V")
    public static final void method575(byte arg0, long arg1) {
        field1121++;
        int var3 = -28 / (-arg0 / 60);
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method576(int arg0, int arg1, int arg2, int arg3) {
        if (class150.method1088(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class58.method483(var4 + 1, class233.field3684[arg0][arg1][arg2] + arg3, var5 + 1) && class58.method483(var4 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class58.method483(var4 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class58.method483(var4 + 1, class233.field3684[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
