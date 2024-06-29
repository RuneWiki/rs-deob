import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class120 extends class314 {

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    public static int[] field1929 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1933 = "Loaded interfaces";

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lja;")
    public static class64 field1930;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lgk;")
    public static class7 field1925;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Ljava/lang/String;")
    public String field1927;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Ljava/lang/String;")
    public String field1931;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 11)
    public static final void method917(int arg0, int arg1, int arg2) {
        field1924++;
        class278.field4304[arg2] = arg0;
        if (arg1 != 8) {
            field1925 = (class7) null;
        }
        class60 var3 = (class60) class156.field2485.method833(false, (long) arg2);
        if (var3 == null) {
            class60 var4 = new class60(class154.method1172((byte) 122) + 500L);
            class156.field2485.method845(var4, (byte) -69, (long) arg2);
        } else {
            var3.field939 = class154.method1172((byte) 83) + 500L;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLja;)V", line = 33)
    public static final void method918(byte arg0, class64 arg1) {
        if (arg0 != -108) {
            method917(45, -55, 72);
        }
        class169.field2635 = arg1.method487(false, "runes");
        field1928++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)Llf;", line = 45)
    public final class125 method919(boolean arg0) {
        field1926++;
        if (!arg0) {
            method918((byte) -117, (class64) null);
        }
        return class162.field2548[this.field4913];
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 61)
    public static void method920(int arg0) {
        field1925 = null;
        field1930 = null;
        field1929 = null;
        field1933 = null;
        if (arg0 != 0) {
            method918((byte) 123, (class64) null);
        }
    }
}
