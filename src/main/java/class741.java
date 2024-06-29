import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class741 {

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "Lqj;")
    private class535 field10031 = new class535(64);

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "Luq;")
    private class172 field10032;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "Luq;")
    private class172 field10033;

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)Llca;")
    public final class669 method4075(int arg0, int arg1) {
        field10034++;
        class669 var3 = (class669) this.field10031.method3109((byte) 108, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field10033.method1188(0, -18047, arg1);
        } else {
            var4 = this.field10032.method1188(0, -18047, arg1 & 0x7FFF);
        }
        class669 var5 = new class669();
        if (var4 != null) {
            var5.method3692((byte) -118, new class254(var4));
        }
        if (arg1 >= 32768) {
            var5.method3695((byte) -78);
        }
        if (arg0 != 0) {
            this.field10032 = null;
        }
        this.field10031.method3108((long) arg1, 16337, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(ILuq;Luq;)V")
    public class741(int arg0, class172 arg1, class172 arg2) {
        this.field10032 = arg2;
        this.field10033 = arg1;
        if (this.field10033 != null) {
            this.field10033.method1175(0, (byte) 92);
        }
        if (this.field10032 != null) {
            this.field10032.method1175(0, (byte) 109);
        }
    }
}
