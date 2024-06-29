import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class46 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lr;")
    private class178 field948 = new class178();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Loc;")
    public static class151 field945 = class137.method873(2, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field947 = 3;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Loc;")
    public static class151 field946 = class137.method873(2, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Loc;")
    public static class151 field952 = class137.method873(2, "document)3cookie=(R");

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Loc;")
    public static class151 field953 = class137.method873(2, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)I")
    public static final int method325(byte arg0, int arg1, int arg2) {
        field951++;
        if (arg0 != -86) {
            method326(false);
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method326(boolean arg0) {
        field945 = null;
        field953 = null;
        field952 = null;
        if (arg0) {
            field952 = null;
        }
        field946 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lr;")
    public final class178 method327(int arg0) {
        field949++;
        class178 var2 = this.field948.field3206;
        if (this.field948 == var2) {
            return null;
        } else {
            if (arg0 != 11997) {
                this.method328(true);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Lr;")
    public final class178 method328(boolean arg0) {
        if (arg0) {
            return null;
        }
        field954++;
        class178 var2 = this.field948.field3206;
        if (this.field948 == var2) {
            return null;
        } else {
            var2.method1129((byte) -2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLr;)V")
    public final void method329(byte arg0, class178 arg1) {
        if (arg0 != 42) {
            this.method328(false);
        }
        field955++;
        if (arg1.field3220 != null) {
            arg1.method1129((byte) -2);
        }
        arg1.field3206 = this.field948.field3206;
        arg1.field3220 = this.field948;
        arg1.field3220.field3206 = arg1;
        arg1.field3206.field3220 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILr;)V")
    public final void method330(int arg0, class178 arg1) {
        if (arg1.field3220 != null) {
            arg1.method1129((byte) -2);
        }
        arg1.field3220 = this.field948.field3220;
        if (arg0 < 83) {
            this.field948 = null;
        }
        arg1.field3206 = this.field948;
        arg1.field3220.field3206 = arg1;
        arg1.field3206.field3220 = arg1;
        field950++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class46() {
        this.field948.field3206 = this.field948;
        this.field948.field3220 = this.field948;
    }
}
