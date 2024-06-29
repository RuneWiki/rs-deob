import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class134 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lwi;")
    private class330 field1793 = new class330(64);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public int field1801 = 0;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Luu;")
    private class191 field1799;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lof;")
    public static class446 field1795 = new class446("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lla;")
    public static class319 field1800 = new class319(51, 9);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lni;")
    public static class367 field1803 = new class367(24, 7);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
    public static final int method906(int arg0, int arg1, int arg2) {
        field1792++;
        int var3 = arg0 >>> 31;
        if (arg1 > -111) {
            field1795 = null;
        }
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lav;")
    public final class459 method907(int arg0, int arg1) {
        field1802++;
        class330 var3 = this.field1793;
        class459 var4;
        synchronized (this.field1793) {
            var4 = (class459) this.field1793.method2133((long) arg1, (byte) 34);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field1799;
        byte[] var6;
        synchronized (this.field1799) {
            var6 = this.field1799.method1281(4, arg1, 75);
        }
        class459 var7 = new class459();
        var7.field6872 = arg1;
        var7.field6884 = this;
        if (var6 != null) {
            var7.method2781(new class164(var6), arg0 - 22503);
        }
        var7.method2780((byte) -98);
        class330 var8 = this.field1793;
        synchronized (this.field1793) {
            this.field1793.method2131(var7, (long) arg1, false);
        }
        return arg0 == 22599 ? var7 : null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
    public static final void method908(int arg0, int arg1) {
        field1798++;
        if (class435.field6596 == arg0) {
            return;
        }
        if (class435.field6596 == 0) {
            class335.method2167(arg1 ^ 0xFFFFFF99);
        }
        if (arg0 == 12) {
            class301.method1911(class452.field6813, 2, class67.field955, class530.field7794);
        }
        if (arg0 != 12 && class195.field2615 != null) {
            class195.field2615.method1934((byte) -93);
            class195.field2615 = null;
        }
        if (arg0 == arg1) {
            class212.method1458(class337.field5232 != class236.field3342, 31616);
        }
        if (arg0 == 6) {
            class125.method859(arg1 ^ 0xFFFFF285, class340.field5264 != class337.field5232);
        }
        if (arg0 == 4) {
            class65.method465((byte) 110, class452.field6813, class530.field7794);
        } else if (arg0 == 5) {
            class301.method1911(class452.field6813, arg1, class67.field955, class530.field7794);
        } else if (arg0 == 8) {
            class301.method1911(class452.field6813, 2, class67.field955, class530.field7794);
        } else if (arg0 == 11) {
            class65.method465((byte) 123, class452.field6813, class530.field7794);
        }
        if (class180.method1207(class435.field6596, -256)) {
            class315.field4587.field2559 = 2;
            class532.field7829.field2559 = 2;
            class467.field6983.field2559 = 2;
            class126.field1714.field2559 = 2;
            class502.field7407.field2559 = 2;
            class273.field3801.field2559 = 2;
            class304.field4439.field2559 = 2;
        }
        if (class180.method1207(arg0, -256)) {
            class463.field6920 = 1;
            class448.field6750 = 1;
            class281.field3982 = 0;
            class29.field448 = 0;
            class199.field2655 = 0;
            class229.method1543(true, 64);
            class315.field4587.field2559 = 1;
            class532.field7829.field2559 = 1;
            class467.field6983.field2559 = 1;
            class126.field1714.field2559 = 1;
            class502.field7407.field2559 = 1;
            class273.field3801.field2559 = 1;
            class304.field4439.field2559 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class318.method1990(arg1 - 11741);
        }
        if (arg0 == 1) {
            class348.method2249((byte) -120, class266.field3709, class400.field6090);
        } else {
            class211.method1453(15793);
        }
        boolean var2 = arg0 == 1 || class92.method621(arg0, -4) || class404.method2491(arg0, -9);
        boolean var3 = class435.field6596 == 1 || class92.method621(class435.field6596, -4) || class404.method2491(class435.field6596, -9);
        if (var2 != var3) {
            if (var2) {
                class513.field7536 = class8.field152;
                if (class203.field2716.field1157 == 0) {
                    class411.method2532(-126, 2);
                } else {
                    class355.method2284(class203.field2716.field1157, 2, class8.field152, 0, class162.field2111, arg1 - 1, false);
                }
                class13.field258.method899(0, false);
            } else {
                class411.method2532(-86, 2);
                class13.field258.method899(0, true);
            }
        }
        if (class180.method1207(arg0, -256) || arg0 == 12) {
            class400.field6090.method852();
        }
        class435.field6596 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V")
    public final void method909(int arg0, int arg1) {
        field1791++;
        if (arg1 != -20750) {
            this.method911(-18);
        }
        class330 var3 = this.field1793;
        synchronized (this.field1793) {
            this.field1793.method2140(-113, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method910(byte arg0) {
        field1796++;
        class330 var2 = this.field1793;
        synchronized (this.field1793) {
            int var3 = -118 % ((arg0 - 3) / 39);
            this.field1793.method2135(0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method911(int arg0) {
        if (arg0 != 1) {
            field1800 = null;
        }
        class330 var2 = this.field1793;
        synchronized (this.field1793) {
            this.field1793.method2127((byte) -48);
        }
        field1794++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static void method912(boolean arg0) {
        field1803 = null;
        field1800 = null;
        if (arg0) {
            method912(false);
        }
        field1795 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class134(class65 arg0, int arg1, class191 arg2) {
        this.field1799 = arg2;
        this.field1797 = this.field1799.method1290(false, 4);
    }
}
