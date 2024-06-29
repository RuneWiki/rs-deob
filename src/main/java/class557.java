import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class557 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
    private boolean field7339 = true;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field7345 = 43594;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Z")
    private boolean field7344 = false;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public int field7342 = 443;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Z")
    public static boolean field7336 = true;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[J")
    public static long[] field7331 = new long[10];

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field7343 = new String[5];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lvfa;")
    public static class672 field7340;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
    public String field7333;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfi;B)Z", line = 5)
    public final boolean method3101(class557 arg0, byte arg1) {
        if (arg1 != -72) {
            return true;
        }
        field7346++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field7338 == arg0.field7338 && this.field7333.equals(arg0.field7333);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 25)
    public static final void method3102(int arg0) {
        field7332++;
        class442.field6091.method558(0);
        class96.field1190.method558(0);
        class472.field6469.method558(0);
        if (arg0 >= -82) {
            method3102(80);
        }
        class637.field8463.method558(0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 44)
    public final void method3103(byte arg0) {
        if (!this.field7339) {
            this.field7339 = true;
            this.field7344 = true;
        } else if (this.field7344) {
            this.field7344 = false;
        } else {
            this.field7339 = false;
        }
        int var2 = -89 % ((arg0 - 14) / 39);
        field7335++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILkk;)Ltj;", line = 67)
    public final class198 method3104(int arg0, class192 arg1) {
        field7334++;
        if (arg0 != 43594) {
            this.field7338 = 16;
        }
        return arg1.method1301(this.field7339 ? this.field7342 : this.field7345, this.field7344, (byte) 112, this.field7333);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)[I", line = 85)
    public static final int[] method3105(int arg0) {
        int var1 = -94 % ((81 - arg0) / 45);
        field7337++;
        return new int[] { class2.field28, class511.field6790, class573.field7524 };
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 102)
    public static final void method3106(int arg0) {
        field7341++;
        int var1 = 84 / ((arg0 - 51) / 35);
        class281.field3984 = null;
        class369.field5149 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 116)
    public static void method3107(byte arg0) {
        field7343 = null;
        int var1 = 38 / ((arg0 - 25) / 36);
        field7331 = null;
        field7340 = null;
    }
}
