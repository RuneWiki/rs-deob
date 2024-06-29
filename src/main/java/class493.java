import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class493 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "Lwi;")
    private class330 field7270 = new class330(64);

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Luu;")
    private class191 field7269;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Luu;")
    private class191 field7266;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field7267 = 0;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "[Laa;")
    public static class341[] field7268;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIB)V", line = 7)
    public static final void method2937(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < 102) {
            method2939(true);
        }
        field7271++;
        if (arg1 == arg4) {
            class435.method2647(126, arg3, arg1, arg0, arg2);
        } else if (class377.field5760 <= arg0 - arg1 && arg0 + arg1 <= class49.field701 && class463.field6924 <= (arg3 - arg4) && class369.field5628 >= arg3 + arg4) {
            class139.method933(arg2, false, arg1, arg3, arg4, arg0);
        } else {
            class31.method268(arg0, arg2, arg4, arg3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)Lck;", line = 36)
    public final class461 method2938(int arg0, boolean arg1) {
        field7272++;
        class461 var3 = (class461) this.field7270.method2133((long) arg0, (byte) 47);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field7269.method1281(0, arg0 & 0x7FFF, 83);
        } else {
            var4 = this.field7266.method1281(0, arg0, 61);
        }
        class461 var5 = new class461();
        if (var4 != null) {
            var5.method2793(0, new class164(var4));
        }
        if (arg0 >= 32768) {
            var5.method2787(false);
        }
        this.field7270.method2131(var5, (long) arg0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V", line = 66)
    public static void method2939(boolean arg0) {
        field7268 = null;
        if (arg0) {
            field7268 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(ILuu;Luu;)V", line = 93)
    public class493(int arg0, class191 arg1, class191 arg2) {
        this.field7269 = arg2;
        this.field7266 = arg1;
        if (this.field7266 != null) {
            this.field7266.method1290(false, 0);
        }
        if (this.field7269 != null) {
            this.field7269.method1290(false, 0);
        }
    }
}
