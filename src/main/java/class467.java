import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class467 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lh;")
    private class571 field6573 = new class571(64);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lan;")
    public class21 field6571;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lan;")
    private class21 field6572;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field6575 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Z")
    public static boolean field6579 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field6578 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2723(byte arg0, String arg1) {
        if (arg0 != 114) {
            return;
        }
        field6577++;
        if (!class493.field6904) {
            return;
        }
        boolean var2 = false;
        int var3 = class559.field7738;
        int[] var4 = class358.field4825;
        for (int var5 = 0; var5 < var3; var5++) {
            class188 var6 = class349.field4696[var4[var5]];
            if (var6 != null && class645.field9372 != var6 && var6.field2630 != null && var6.field2630.equalsIgnoreCase(arg1)) {
                class351.method2108(class560.field7756, -10511);
                class442.field6288++;
                class479.field6754.method68(97, class608.field8768);
                class479.field6754.method61((byte) 97, 0);
                class479.field6754.method109(class103.field1566, 255);
                class479.field6754.method91((byte) 88, class461.field6472);
                class479.field6754.method109(var4[var5], 255);
                class45.method433(var6.method337(arg0 ^ 0x72), var6.field616[0], -2, var6.field618[0], 0, -120, true, 0, var6.method337(0));
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class176.method1116(class425.field6045.method739(class173.field2491, -53) + arg1, true);
        }
        if (class493.field6904) {
            class339.method2057((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lvt;")
    public final class253 method2724(byte arg0, int arg1) {
        field6581++;
        class571 var3 = this.field6573;
        class253 var4;
        synchronized (this.field6573) {
            var4 = (class253) this.field6573.method3252((long) arg1, (byte) -124);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field6572;
        byte[] var6;
        synchronized (this.field6572) {
            var6 = this.field6572.method240(3, arg1, (byte) -124);
        }
        class253 var7 = new class253();
        var7.field3501 = this;
        if (var6 != null) {
            var7.method1577((byte) -23, new class11(var6));
        }
        class571 var8 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method3243(var7, (long) arg1, -74);
        }
        return arg0 < 7 ? null : var7;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final void method2725(byte arg0) {
        class571 var2 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method3246(false);
        }
        field6580++;
        int var3 = -107 / ((arg0 + 14) / 51);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public final void method2726(int arg0, int arg1) {
        field6584++;
        class571 var3 = this.field6573;
        synchronized (this.field6573) {
            if (arg0 != 0) {
                this.method2727((byte) 41);
            }
            this.field6573.method3253(arg1, -126);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public final void method2727(byte arg0) {
        field6574++;
        class571 var2 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method3248(0);
        }
        int var3 = -48 / ((-arg0 - 7) / 61);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lbea;B)V")
    public static final void method2728(class188 arg0, byte arg1) {
        field6576++;
        class421 var2 = (class421) class480.field6765.method1242(0, (long) arg0.field607);
        if (arg1 <= 24) {
            return;
        }
        if (var2 == null) {
            class434.method2578(arg0, arg0.field616[0], 0, null, arg0.field6035, arg0.field618[0], 279765095, null);
        } else {
            var2.method2516(0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lhu;ILan;Lan;)V")
    public class467(class111 arg0, int arg1, class21 arg2, class21 arg3) {
        this.field6571 = arg3;
        this.field6572 = arg2;
        this.field6572.method231(3, -121);
    }
}
