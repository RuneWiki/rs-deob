import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class473 {

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Ltja;")
    private class288 field6595 = new class288(64);

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lbt;")
    private class48 field6591;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field6590 = 0;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field6598 = new String[8];

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
    public static int[] field6599 = new int[2];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 7)
    public static final String method2819(char arg0, String arg1, String arg2, int arg3) {
        field6594++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg0, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        if (arg3 > -86) {
            field6599 = null;
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg0, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg2);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V", line = 63)
    public final void method2820(byte arg0, int arg1) {
        class288 var3 = this.field6595;
        synchronized (this.field6595) {
            this.field6595.method1694(arg1, -66);
        }
        if (arg0 > 104) {
            field6586++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)Llha;", line = 76)
    public final class652 method2821(byte arg0, int arg1) {
        field6589++;
        class288 var3 = this.field6595;
        class652 var4;
        synchronized (this.field6595) {
            var4 = (class652) this.field6595.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field6591;
        byte[] var6;
        synchronized (this.field6591) {
            var6 = this.field6591.method437(31, (byte) 109, arg1);
        }
        if (arg0 >= -72) {
            method2825(59);
        }
        class652 var7 = new class652();
        if (var6 != null) {
            var7.method3688(new class403(var6), false);
        }
        class288 var8 = this.field6595;
        synchronized (this.field6595) {
            this.field6595.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLbt;)V", line = 109)
    public static final void method2822(byte arg0, class48 arg1) {
        if (arg0 <= -24) {
            field6592++;
            class45.field608 = arg1.method450((byte) 93, "p11_full");
            class643.field8772 = arg1.method450((byte) 83, "p12_full");
            class117.field1484 = arg1.method450((byte) 82, "b12_full");
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lbj;", line = 123)
    public static final class257 method2823(int arg0) {
        int var1 = 35 % ((-arg0 - 53) / 50);
        field6597++;
        return class9.field140;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 133)
    public final void method2824(int arg0) {
        class288 var2 = this.field6595;
        synchronized (this.field6595) {
            this.field6595.method1690(0);
        }
        if (arg0 != 31) {
            this.method2824(107);
        }
        field6596++;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 146)
    public static void method2825(int arg0) {
        field6599 = null;
        field6598 = null;
        if (arg0 > -81) {
            field6599 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZBIZI)V", line = 161)
    public static final void method2826(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        class558.method3254(0, (byte) 123, class780.field10754.length - 1, arg4, arg3, arg2, arg0);
        field6593++;
        class669.field9185 = null;
        class603.field8145 = 0;
        if (arg1 >= -78) {
            field6598 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z", line = 177)
    public static final boolean method2827(int arg0, int arg1, int arg2) {
        int var3 = -103 % ((45 - arg2) / 46);
        field6588++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 208)
    public class473(class441 arg0, int arg1, class48 arg2) {
        this.field6591 = arg2;
        this.field6591.method431(4, 31);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 196)
    public final void method2828(int arg0) {
        class288 var2 = this.field6595;
        synchronized (this.field6595) {
            if (arg0 <= 116) {
                return;
            }
            this.field6595.method1687((byte) 61);
        }
        field6587++;
    }
}
