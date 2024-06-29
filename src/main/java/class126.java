import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class126 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field1762 = new int[200];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lqg;")
    public static class212 field1759;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
    public static int[] field1760;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 7)
    public static final void method745(int arg0) {
        class149.field2037 = -1;
        class378.field5005 = 1;
        field1761++;
        long var1 = 0L;
        if (class14.field183 == null) {
            method747(35, (byte) 34);
        } else {
            class157 var3 = new class157(class596.method3309(class475.method2737(-116, class14.field183), true));
            long var4 = var3.method953(true);
            class422.field5536 = var3.method953(true);
            class32.method195(true, 11703, class339.method1979(arg0 ^ arg0, var4), "");
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 32)
    public static void method746(boolean arg0) {
        field1759 = null;
        field1760 = null;
        field1762 = null;
        if (!arg0) {
            method746(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method747(int arg0, byte arg1) {
        field1758++;
        if (arg1 != 34) {
            return;
        }
        if (class378.field5005 == 1) {
            class181.field2533 = arg0;
        } else if (class378.field5005 == 2 || class378.field5005 == 3) {
            class567.field7721 = arg0;
        }
    }
}
