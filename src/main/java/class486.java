import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class486 extends class65 {

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "S")
    public short field7028;

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "Ltm;")
    public static class334 field7029 = new class334(119, 0);

    @OriginalMember(owner = "client!cia", name = "r", descriptor = "I")
    public static int field7031 = 0;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!cia", name = "q", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)Luw;", line = 4)
    public static final class194 method2948(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1762;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lla;IIZIII)V", line = 11)
    public static final void method2949(class422 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class259.field4052 = null;
        class442.field6421 = arg1;
        class560.field7944 = arg2;
        class140.field2198 = arg0;
        class371.field5634 = arg3;
        field7027++;
        class730.field10244 = arg4;
        class577.field8182 = arg5;
        class540.field7712 = arg6;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(CI)Z", line = 28)
    public static final boolean method2950(char arg0, int arg1) {
        int var2 = -119 / ((arg1 - 15) / 60);
        field7026++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var3 = class173.field2952;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg0 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V", line = 65)
    public static void method2951(int arg0) {
        if (arg0 != -8000) {
            method2948(-108, -74, 105);
        }
        field7029 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Z)V", line = 75)
    public static final void method2952(boolean arg0) {
        field7030++;
        class497.field7205.method1609((byte) -77, 5);
        class338.field4951.method1701(-15728, 5);
        class174.field2980.method993(108, 5);
        class576.field8167.method3071(false, 5);
        class740.field10382.method3437(5, (byte) 18);
        class556.field7917.method747(5, false);
        class83.field1219.method2359(5, (byte) 72);
        class41.field718.method1531(11723, 5);
        class52.field836.method1714(2, 5);
        class346.field5119.method3695((byte) 121, 5);
        class581.field8222.method1552(-100, 5);
        class617.field8704.method2552(0, 5);
        class629.field8840.method3850(5, (byte) -6);
        class382.field5728.method1990(60, 5);
        class122.field1882.method3642(5, false);
        if (!arg0) {
            return;
        }
        class691.field9803.method2536(-3924, 5);
        class416.field6122.method4207(5, (byte) -119);
        class451.field6568.method2399(false, 5);
        class520.field7513.method1412(5, 33);
        class184.field3100.method145((byte) 115, 5);
        class430.field6290.method3995(5, -31534);
        class519.method3094(5, 1);
        class331.method2131((byte) -90, 50);
        class397.method2459(122, 50);
        class541.method3166((byte) -91, 5);
        class176.method1379(0, 5);
        class453.field6589.method68(-16878, 5);
        class341.field5052.method68(-16878, 5);
        class65.field1041.method68(-16878, 5);
        class527.field7586.method68(-16878, 5);
        class464.field6775.method68(-16878, 5);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(III[B)I", line = 117)
    public static final int method2953(int arg0, int arg1, int arg2, byte[] arg3) {
        field7024++;
        int var4 = arg2;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class342.field5054[(arg3[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqv;", line = 138)
    public static final class106 method2954(Throwable arg0, String arg1) {
        field7025++;
        class106 var2;
        if ((arg0 instanceof class106)) {
            var2 = (class106) arg0;
            var2.field1550 = var2.field1550 + ' ' + arg1;
        } else {
            var2 = new class106(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "()V", line = 154)
    public class486() {
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(S)V", line = 165)
    public class486(short arg0) {
        this.field7028 = arg0;
    }
}
