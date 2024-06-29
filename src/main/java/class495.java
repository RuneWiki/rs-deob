import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class495 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lqj;")
    private class535 field6972 = new class535(64);

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Luq;")
    private class172 field6969;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public int field6970;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "F")
    public static float field6971 = 0.0F;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Lpi;")
    public final class523 method2911(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field6968++;
        class535 var3 = this.field6972;
        class523 var4;
        synchronized (this.field6972) {
            var4 = (class523) this.field6972.method3109((byte) 125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field6969;
        byte[] var6;
        synchronized (this.field6969) {
            var6 = this.field6969.method1188(19, -18047, arg0);
        }
        class523 var7 = new class523();
        if (var6 != null) {
            var7.method3038(new class254(var6), 0);
        }
        class535 var8 = this.field6972;
        synchronized (this.field6972) {
            this.field6972.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class495(class263 arg0, int arg1, class172 arg2) {
        this.field6969 = arg2;
        this.field6970 = this.field6969.method1175(19, (byte) 111);
    }
}
