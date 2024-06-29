import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class725 {

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lpja;")
    private class43 field9970 = new class43(16);

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lgj;")
    private class662 field9968;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public final void method4021(int arg0) {
        field9964++;
        if (arg0 == -31181) {
            class43 var2 = this.field9970;
            synchronized (this.field9970) {
                this.field9970.method272(20);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)Lao;")
    public final class304 method4022(int arg0, int arg1) {
        field9966++;
        class43 var3 = this.field9970;
        class304 var4;
        synchronized (this.field9970) {
            var4 = (class304) this.field9970.method266((byte) -127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field9968;
        byte[] var6;
        synchronized (this.field9968) {
            var6 = this.field9968.method3732(arg0, 8906, arg1);
        }
        class304 var7 = new class304();
        if (var6 != null) {
            var7.method1942(new class93(var6), arg1 ^ 0xFFFF9E32);
        }
        class43 var8 = this.field9970;
        synchronized (this.field9970) {
            this.field9970.method270(var7, (long) arg0, -123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
    public static final void method4023(int arg0) {
        field9969++;
        int var1 = class111.field1911.field6722.method3987((byte) 100);
        int var2 = 55 / ((51 - arg0) / 56);
        if (var1 == 0) {
            class101.field1628 = null;
            class239.method1595((byte) -103, 0);
        } else if (var1 == 1) {
            class714.method3972(6, (byte) 0);
            class239.method1595((byte) 63, 512);
            if (class554.field7832 != null) {
                class704.method3929(false);
            }
        } else {
            class714.method3972(6, (byte) (class93.field1455 - 4 & 0xFF));
            class239.method1595((byte) 124, 2);
        }
        class605.field8447 = class282.field3917;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
    public final void method4024(int arg0) {
        class43 var2 = this.field9970;
        synchronized (this.field9970) {
            this.field9970.method273(0);
            int var3 = -17 % ((20 - arg0) / 61);
        }
        field9965++;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)V")
    public final void method4025(int arg0, int arg1) {
        class43 var3 = this.field9970;
        synchronized (this.field9970) {
            this.field9970.method265(arg1, -53);
            if (arg0 != -4) {
                this.method4025(36, 0);
            }
        }
        field9963++;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class725(class598 arg0, int arg1, class662 arg2) {
        this.field9968 = arg2;
        this.field9968.method3730((byte) -114, 30);
    }
}
