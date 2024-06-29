import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class358 {

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Lhu;")
    private class76 field4956 = new class76(64);

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lhu;")
    public class76 field4958 = new class76(64);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lr;")
    public class110 field4946;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lr;")
    private class110 field4955;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4943 = 1403;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[S")
    public static short[] field4953 = new short[256];

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field4957 = -1;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lmc;")
    public static class78 field4951 = new class78(73, 7);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field4951 = null;
        int var1 = -19 % ((-arg0 - 92) / 34);
        field4953 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V")
    public final void method2192(int arg0, boolean arg1, int arg2) {
        this.field4956 = new class76(arg0);
        if (arg1) {
            field4947++;
            this.field4958 = new class76(arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static final void method2193(byte arg0) {
        field4945++;
        class475.field6540 = 0;
        class450.field6121.method645(arg0 - 115);
        if (arg0 == 115) {
            class450.field6121.method641(class298.field3996, (byte) -93);
            class475.field6540++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
    public final void method2194(int arg0, int arg1) {
        field4952++;
        class76 var3 = this.field4956;
        synchronized (this.field4956) {
            this.field4956.method496(arg1, -120);
        }
        if (arg0 != 1193) {
            field4951 = null;
        }
        class76 var4 = this.field4958;
        synchronized (this.field4958) {
            this.field4958.method496(arg1, 94);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public final void method2195(byte arg0) {
        class76 var2 = this.field4956;
        synchronized (this.field4956) {
            this.field4956.method502(0);
        }
        if (arg0 < 87) {
            return;
        }
        field4944++;
        class76 var3 = this.field4958;
        synchronized (this.field4958) {
            this.field4958.method502(0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lnf;")
    public static final class374 method2196(int arg0, byte arg1) {
        int var2 = 103 / ((arg1 - 69) / 54);
        field4950++;
        class472[] var3 = class90.field1319;
        synchronized (class90.field1319) {
            class374 var4;
            if (class90.field1319.length <= arg0 || class90.field1319[arg0].method2763(8)) {
                var4 = new class374();
                var4.field5156 = new class478[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field5156[var5] = new class478();
                }
            } else {
                var4 = (class374) class90.field1319[arg0].method2766((byte) -2);
                var4.method1541(-3);
                int var10002 = class158.field2176[arg0]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
    public final void method2197(byte arg0) {
        if (arg0 >= -20) {
            this.field4958 = null;
        }
        class76 var2 = this.field4956;
        synchronized (this.field4956) {
            this.field4956.method495(-113);
        }
        field4948++;
        class76 var3 = this.field4958;
        synchronized (this.field4958) {
            this.field4958.method495(-119);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lmd;")
    public final class351 method2198(int arg0, int arg1) {
        field4949++;
        class76 var3 = this.field4956;
        class351 var4;
        synchronized (this.field4956) {
            var4 = (class351) this.field4956.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4955.method702((byte) 101, arg1, arg0);
        class351 var6 = new class351();
        var6.field4871 = this;
        if (var5 != null) {
            var6.method2170(-23, new class32(var5));
        }
        class76 var7 = this.field4956;
        synchronized (this.field4956) {
            this.field4956.method505((long) arg1, var6, 115);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ldn;ILr;Lr;)V")
    public class358(class329 arg0, int arg1, class110 arg2, class110 arg3) {
        this.field4946 = arg3;
        this.field4955 = arg2;
        this.field4955.method694(34, (byte) 119);
    }
}
