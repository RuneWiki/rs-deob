import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class491 implements class698 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lmfa;")
    private class204 field6960;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "J")
    public static long field6962 = -1L;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Z")
    public static boolean field6959 = false;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lgg;")
    public static class114 field6967 = new class114(20);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method620(boolean arg0, int arg1) {
        if (arg0) {
            class458.field6407.method167(0, 0, class599.field8320, class84.field1083, this.field6960.field2588, 0);
        }
        if (arg1 < 108) {
            this.method616((byte) -22);
        }
        field6963++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkha;ZLd;)V", line = 18)
    public static final void method2861(class687 arg0, boolean arg1, class96 arg2) {
        class294.field3837 = arg0;
        class396.field5513 = arg2;
        field6966++;
        if (!arg1) {
            method2861(null, false, null);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method616(byte arg0) {
        field6968++;
        if (arg0 != 30) {
            method2863(null, (byte) 87);
        }
        return true;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 49)
    public static void method2862(byte arg0) {
        if (arg0 < 112) {
            field6967 = null;
        }
        field6967 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 59)
    public final void method621(int arg0) {
        field6961++;
        if (arg0 != 27799) {
            this.method620(true, 110);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 71)
    public static final void method2863(String arg0, byte arg1) {
        class673.method3627((byte) -128, "", "", 0, "", 0, arg0);
        field6964++;
        if (arg1 != 4) {
            field6959 = true;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lmfa;)V", line = 82)
    public class491(class204 arg0) {
        this.field6960 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 95)
    public static final void method2864(int arg0, int arg1) {
        field6965++;
        class548 var2 = class696.method3872(arg1, arg0, arg0 - 1633381945);
        var2.method3127((byte) 126);
    }
}
