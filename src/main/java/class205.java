import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class205 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
    public static int[] field3008 = new int[13];

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
    public static int[] field3006 = new int[500];

    @OriginalMember(owner = "client!np", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3010 = new String[100];

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lfg;")
    public static class18 field3011 = new class18(64);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "[[I")
    public static int[][] field3013;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 3)
    public static void method1550(int arg0) {
        field3006 = null;
        field3010 = null;
        field3011 = null;
        if (arg0 < -71) {
            field3013 = null;
            field3008 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)[B", line = 24)
    public static final synchronized byte[] method1551(int arg0, int arg1) {
        field3007++;
        if (arg1 == 100 && class174.field2587 > 0) {
            byte[] var2 = class306.field4471[--class174.field2587];
            class306.field4471[class174.field2587] = null;
            return var2;
        } else if (~arg1 == arg0 && class73.field1224 > 0) {
            byte[] var3 = class157.field2384[--class73.field1224];
            class157.field2384[class73.field1224] = null;
            return var3;
        } else if (arg1 == 30000 && class49.field796 > 0) {
            byte[] var4 = class132.field2131[--class49.field796];
            class132.field2131[class49.field796] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V", line = 57)
    public static final void method1552(boolean arg0, int arg1) {
        field3003++;
        class265.field3977 = arg1;
        class18 var2 = class439.field6386;
        synchronized (class439.field6386) {
            class439.field6386.method106((byte) -128);
            if (!arg0) {
                field3008 = null;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1553(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        if (var3 != null && var3.field2501 != null) {
            var3.field2501 = null;
        }
    }
}
