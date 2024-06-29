import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class569 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "J")
    private long field7804 = -1L;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lifa;")
    private class450 field7806 = new class450();

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7802 = "";

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Ldj;")
    public static class362 field7805 = new class362(8);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lqda;")
    public static class113 field7811 = new class113(128);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lhj;")
    public static class596 field7812 = new class596(67, -2);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
    private long field7807;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Les;B)V", line = 15)
    private final void method3288(class403 arg0, byte arg1) {
        int var3 = -32 % ((arg1 - 56) / 34);
        field7810++;
        this.field7807 = arg0.method2361(115);
        this.field7804 = arg0.method2361(62);
        for (int var4 = arg0.method2396((byte) 57); var4 != 0; var4 = arg0.method2396((byte) 55)) {
            class490 var5;
            if (var4 == 1) {
                var5 = new class555();
            } else if (var4 == 4) {
                var5 = new class539();
            } else if (var4 == 3) {
                var5 = new class594();
            } else if (var4 == 2) {
                var5 = new class412();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var5.method2457(arg0, 123);
            this.field7806.method2732(var5, 21939);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Les;)V", line = 103)
    public class569(class403 arg0) {
        this.method3288(arg0, (byte) -21);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 65)
    public static final int method3289(String arg0, byte arg1) {
        field7803++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = -61 % ((arg1 - 14) / 49);
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 91)
    public static void method3290(int arg0) {
        field7805 = null;
        field7802 = null;
        if (arg0 <= 60) {
            field7802 = null;
        }
        field7812 = null;
        field7811 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII)Lbt;", line = 116)
    public static final class48 method3291(boolean arg0, int arg1, int arg2, int arg3) {
        field7808++;
        class372 var4 = null;
        int var5 = 36 / ((88 - arg1) / 33);
        if (class370.field4631 != null) {
            var4 = new class372(arg3, class370.field4631, class187.field2266[arg3], 1000000);
        }
        class267.field3150[arg3] = class458.field6463.method1658(var4, class778.field10746, 0, arg3);
        class267.field3150[arg3].method2230(false);
        return new class48(class267.field3150[arg3], arg0, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwt;B)V", line = 134)
    public final void method3292(class330 arg0, byte arg1) {
        field7809++;
        if (this.field7807 != arg0.field4809 || this.field7804 != arg0.field4080) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.field4809 + " updateNum:" + arg0.field4080 + " delta.clanHash:" + this.field7807 + " updateNum:" + this.field7804);
        }
        for (class490 var3 = (class490) this.field7806.method2725(37); var3 != null; var3 = (class490) this.field7806.method2726(-116)) {
            var3.method2459(arg0, 0);
        }
        if (arg1 <= 119) {
            field7802 = null;
        }
        arg0.field4080++;
    }
}
