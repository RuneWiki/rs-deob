import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class67 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field849 = 0;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field852 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lfc;")
    private class174 field850 = new class174(64);

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lqd;")
    private class317 field857 = null;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Loi;")
    private class53 field853;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Loi;")
    private class53 field854;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[S")
    public static short[] field851;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lhu;")
    public final class88 method526(int arg0, int arg1) {
        field856++;
        class88 var3 = (class88) this.field850.method1088((long) arg0, (byte) -125);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field853.method426(1, (byte) 9, arg0 & 0x7FFF);
        } else {
            var4 = this.field854.method426(1, (byte) 9, arg0);
        }
        if (arg1 != 5364) {
            this.field849 = 3;
        }
        class88 var5 = new class88();
        var5.field1094 = this;
        if (var4 != null) {
            var5.method640(new class403(var4), arg1 ^ 0x148B);
        }
        if (arg0 >= 32768) {
            var5.method636((byte) 96);
        }
        this.field850.method1097(19627, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3) {
        class30.field357.method2354(arg0, false);
        field848++;
        class30.field357.method2368(arg1, -31442);
        class30.field357.method2336(arg3, -126);
        if (arg2 <= 100) {
            method527(63, -84, -57, 11);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([ILmt;JI)Ljava/lang/String;")
    public final String method528(int[] arg0, class276 arg1, long arg2, int arg3) {
        field855++;
        if (this.field857 != null) {
            String var6 = this.field857.method1910(arg1, arg0, arg2, 50);
            if (var6 != null) {
                return var6;
            }
        }
        return arg3 < 90 ? null : Long.toString(arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method529(byte arg0) {
        int var1 = 10 % ((arg0 + 25) / 50);
        field851 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILoi;Loi;Lqd;)V")
    public class67(int arg0, class53 arg1, class53 arg2, class317 arg3) {
        this.field853 = arg2;
        this.field857 = arg3;
        this.field854 = arg1;
        if (this.field854 != null) {
            this.field852 = this.field854.method435(1, 0);
        }
        if (this.field853 != null) {
            this.field849 = this.field853.method435(1, 0);
        }
    }
}
