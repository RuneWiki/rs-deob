import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class271 {

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "Lwq;")
    public static class176 field3793;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Lcl;")
    public static class276 field3796;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method1764(byte arg0, int arg1, int arg2) {
        field3794++;
        int var3 = 91 % ((-arg0 - 10) / 44);
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lrv;I)Loca;", line = 20)
    public static final class273 method1765(class120 arg0, int arg1) {
        if (arg1 == 0) {
            field3791++;
            return new class273(arg0.method838(true), arg0.method838(true), arg0.method838(true), arg0.method838(true), arg0.method833(-3), arg0.method833(arg1 - 3), arg0.method842(2384));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 34)
    public static void method1766(byte arg0) {
        field3793 = null;
        field3796 = null;
        if (arg0 != 67) {
            method1765(null, 73);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V", line = 45)
    public static final void method1767(String arg0, boolean arg1, String arg2) {
        if (!arg1) {
            method1767(null, false, null);
        }
        class222.field3160 = -1;
        class544.field7651 = 1;
        field3797++;
        class731.method4097(arg0, 31533, false, arg2);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lli;IZ)V", line = 59)
    public static final void method1768(class449 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1766((byte) -96);
        }
        field3792++;
        if (arg0.field6393 == null) {
            return;
        }
        int var3 = arg0.field6393[arg1 + 1];
        if (arg0.field6404 == var3) {
            return;
        }
        arg0.field6404 = var3;
        arg0.field6352 = 1;
        arg0.field6442 = arg0.field6443;
        arg0.field6409 = 0;
        arg0.field6350 = 0;
        arg0.field6371 = 0;
        if (arg0.field6404 != -1) {
            class524.method3048((byte) 17, arg0.field6409, arg0, class203.field2975.method1931((byte) -81, arg0.field6404));
            return;
        }
    }
}
