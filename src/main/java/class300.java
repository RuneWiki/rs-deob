import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class300 {

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "[I")
    public static int[] field3939 = new int[3];

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lvha;")
    public static class687 field3941;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLei;)V", line = 4)
    public static final void method1793(int arg0, byte arg1, class180 arg2) {
        class322.field4152 = 0;
        field3942++;
        class100.field1384 = false;
        class134.method989((byte) 67, arg2);
        int var3 = 3 % ((arg1 - 32) / 34);
        class601.method3406(false, arg2);
        if (class100.field1384) {
            System.out.println("---endgpp---");
        }
        if (arg2.field6193 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field6193 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field3936++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 32)
    public static final void method1794(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1796((byte) -69);
        }
        if (class514.field7217 != 0) {
            if (arg0 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class718.field10003[var3] = arg2;
                }
            } else {
                class718.field10003[arg0] = arg2;
            }
        }
        field3934++;
        class126.field1799.method1402(arg0, -24856, arg2);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method1795(int arg0) {
        field3938++;
        if (arg0 != -1) {
            this.toString();
        }
        return class461.field6145 == this | class175.field2446 == this;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 85)
    public static void method1796(byte arg0) {
        if (arg0 != -113) {
            method1793(54, (byte) -36, null);
        }
        field3939 = null;
        field3941 = null;
    }
}
