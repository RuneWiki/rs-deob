import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class650 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field9174 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field9178 = 0;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lnga;")
    private class510 field9179 = new class510(64);

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Loha;")
    private class738 field9181 = null;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Leq;")
    private class209 field9175;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Leq;")
    private class209 field9176;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI[ILqca;)Ljava/lang/String;")
    public final String method3678(long arg0, int arg1, int[] arg2, class115 arg3) {
        if (arg1 != 1) {
            this.method3679(-16, -21);
        }
        field9173++;
        if (this.field9181 != null) {
            String var6 = this.field9181.method3114(arg3, (byte) 114, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lom;")
    public final class372 method3679(int arg0, int arg1) {
        field9177++;
        class372 var3 = (class372) this.field9179.method3054((byte) -107, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field9175.method1453(arg0, arg1 ^ 0x1B, 1);
        } else {
            var4 = this.field9176.method1453(arg0 & 0x7FFF, arg1 ^ 0xFFFFFFC7, 1);
        }
        class372 var5 = new class372();
        var5.field5212 = this;
        if (var4 != null) {
            var5.method2337(new class35(var4), arg1 ^ 0x40);
        }
        if (arg0 >= 32768) {
            var5.method2339(true);
        }
        if (arg1 == 64) {
            this.field9179.method3047(false, var5, (long) arg0);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ILeq;Leq;Loha;)V")
    public class650(int arg0, class209 arg1, class209 arg2, class738 arg3) {
        this.field9175 = arg1;
        this.field9176 = arg2;
        this.field9181 = arg3;
        if (this.field9175 != null) {
            this.field9174 = this.field9175.method1477(0, 1);
        }
        if (this.field9176 != null) {
            this.field9178 = this.field9176.method1477(0, 1);
        }
    }
}
