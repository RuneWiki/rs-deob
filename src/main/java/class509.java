import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class509 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Llga;")
    private class663 field6967 = new class663(64);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lsea;")
    private class648 field6971;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field6966;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lap;", line = 7)
    public final class441 method2904(int arg0, int arg1) {
        field6969++;
        class663 var3 = this.field6967;
        class441 var4;
        synchronized (this.field6967) {
            var4 = (class441) this.field6967.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field6971;
        byte[] var6;
        synchronized (this.field6971) {
            if (arg0 != 27366) {
                method2908((byte) 126);
            }
            var6 = this.field6971.method3654(-15615, 16, arg1);
        }
        class441 var7 = new class441();
        if (var6 != null) {
            var7.method2509(new class501(var6), 0);
        }
        class663 var8 = this.field6967;
        synchronized (this.field6967) {
            this.field6967.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 40)
    public final void method2905(byte arg0) {
        class663 var2 = this.field6967;
        synchronized (this.field6967) {
            this.field6967.method3749(arg0 ^ 0xFFFFE263);
        }
        if (arg0 != -125) {
            this.method2905((byte) 52);
        }
        field6973++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 53)
    public final void method2906(int arg0) {
        field6970++;
        if (arg0 != 0) {
            this.field6971 = null;
        }
        class663 var2 = this.field6967;
        synchronized (this.field6967) {
            this.field6967.method3755(arg0 + 19713);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 66)
    public final void method2907(int arg0, byte arg1) {
        class663 var3 = this.field6967;
        synchronized (this.field6967) {
            this.field6967.method3754(arg0, true);
        }
        if (arg1 != 61) {
            this.field6971 = null;
        }
        field6972++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 81)
    public static final void method2908(byte arg0) {
        if (arg0 <= 19) {
            return;
        }
        for (int var1 = 0; var1 < class492.field6720.length; var1++) {
            for (int var2 = 0; var2 < class492.field6720[0].length; var2++) {
                for (int var3 = 0; var3 < class492.field6720[0][0].length; var3++) {
                    class492.field6720[var1][var2][var3] = 0;
                }
            }
        }
        field6968++;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 119)
    public class509(class414 arg0, int arg1, class648 arg2) {
        this.field6971 = arg2;
        if (this.field6971 == null) {
            this.field6966 = 0;
        } else {
            this.field6966 = this.field6971.method3653(16, true);
        }
    }
}
