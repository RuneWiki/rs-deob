import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class346 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4755 = -1;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Laea;")
    public static class47 field4757 = new class47();

    @OriginalMember(owner = "client!om", name = "e", descriptor = "F")
    public static float field4759;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 12)
    public static final byte[] method2076(int arg0, String arg1) {
        field4761++;
        int var2 = arg1.length();
        int var3 = -54 / ((43 - arg0) / 49);
        if (var2 == 0) {
            return new byte[0];
        }
        int var4 = var2 + 3 & 0xFFFFFFFC;
        int var5 = var4 / 4 * 3;
        if (var4 - 2 >= var2 || class138.method1020(-21218, arg1.charAt(var4 - 2)) == -1) {
            var5 -= 2;
        } else if (var2 <= (var4 - 1) || class138.method1020(-21218, arg1.charAt(var4 - 1)) == -1) {
            var5--;
        }
        byte[] var6 = new byte[var5];
        class322.method1957(var6, arg1, -93, 0);
        return var6;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lqf;", line = 42)
    public static final class639 method2077(boolean arg0) {
        field4756++;
        if (!arg0) {
            method2076(-63, null);
        }
        return class153.method1077(arg0, 1);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V", line = 58)
    public static void method2078(boolean arg0) {
        field4757 = null;
        if (arg0) {
            field4758 = 120;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILst;)I", line = 70)
    public static final int method2079(int arg0, class403 arg1) {
        field4760++;
        if (arg0 != 12610) {
            method2077(false);
        }
        int var2 = arg1.field5365;
        class543 var3 = arg1.method2353(-1);
        if (arg1.field5609) {
            var2 = arg1.field5382;
        } else if (arg1.field5584 == var3.field7186 || arg1.field5584 == var3.field7136 || arg1.field5584 == var3.field7174 || arg1.field5584 == var3.field7147) {
            var2 = arg1.field5392;
        } else if (arg1.field5584 == var3.field7155 || arg1.field5584 == var3.field7153 || arg1.field5584 == var3.field7156 || arg1.field5584 == var3.field7163) {
            var2 = arg1.field5363;
        }
        return var2;
    }
}
