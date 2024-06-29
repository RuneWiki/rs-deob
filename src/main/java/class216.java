import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 {

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lac;")
    private class135 field3535 = new class135();

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[Lgk;")
    public static class157[] field3526 = new class157[0];

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    public static int[] field3520 = new int[50];

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static volatile int field3536 = 0;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3534 = "Unable to find ";

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Ldl;")
    public static class123 field3532;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lac;")
    private class135 field3538;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    public static int[] field3527;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lac;")
    public final class135 method1461(byte arg0) {
        field3523++;
        class135 var2 = this.field3538;
        if (arg0 != -116) {
            return null;
        } else if (this.field3535 == var2) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var2.field1955;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method1462(byte arg0) {
        int var1 = 97 / ((-arg0 - 7) / 58);
        field3532 = null;
        field3534 = null;
        field3520 = null;
        field3526 = null;
        field3527 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
    public final int method1463(boolean arg0) {
        field3521++;
        class135 var2 = this.field3535.field1955;
        int var3 = 0;
        if (arg0) {
            method1462((byte) -9);
        }
        while (this.field3535 != var2) {
            var3++;
            var2 = var2.field1955;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)Lac;")
    public final class135 method1464(boolean arg0) {
        field3528++;
        class135 var2 = this.field3535.field1955;
        if (!arg0) {
            return null;
        } else if (this.field3535 == var2) {
            return null;
        } else {
            var2.method912(16);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public final void method1465(byte arg0) {
        if (arg0 != 105) {
            this.method1461((byte) -28);
        }
        while (true) {
            class135 var2 = this.field3535.field1955;
            if (this.field3535 == var2) {
                this.field3538 = null;
                field3525++;
                return;
            }
            var2.method912(arg0 - 224);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lac;I)V")
    public final void method1466(class135 arg0, int arg1) {
        if (arg0.field1959 != null) {
            arg0.method912(-124);
        }
        arg0.field1955 = this.field3535;
        arg0.field1959 = this.field3535.field1959;
        arg0.field1959.field1955 = arg0;
        field3530++;
        arg0.field1955.field1959 = arg0;
        int var3 = -76 % ((arg1 - 25) / 35);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lac;")
    public final class135 method1467(int arg0) {
        if (arg0 != 0) {
            field3534 = null;
        }
        class135 var2 = this.field3535.field1955;
        field3539++;
        if (this.field3535 == var2) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var2.field1955;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class216() {
        this.field3535.field1955 = this.field3535;
        this.field3535.field1959 = this.field3535;
    }
}
