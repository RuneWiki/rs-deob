import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class207 extends class424 {

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    public volatile int field2672 = -1;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field2668;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "Lme;")
    public static class668 field2671 = new class668(260);

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Lra;")
    public static class361 field2673 = new class361(99, 4);

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public static void method1330(byte arg0) {
        if (arg0 < 30) {
            method1331(true, -75);
        }
        field2673 = null;
        field2671 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)Lpl;")
    public static final class215 method1331(boolean arg0, int arg1) {
        if (!arg0) {
            method1332(-8, -118, 98);
        }
        field2670++;
        class365[] var2 = class274.field3603;
        synchronized (class274.field3603) {
            class215 var3;
            if (class274.field3603.length <= arg1 || class274.field3603[arg1].method2095((byte) -113)) {
                var3 = new class215();
                var3.field2770 = new class108[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field2770[var4] = new class108();
                }
            } else {
                var3 = (class215) class274.field3603[arg1].method2103(-7394);
                var3.method2227(60);
                int var10002 = class388.field4972[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
    public static final boolean method1332(int arg0, int arg1, int arg2) {
        int var3 = class105.field1384[arg0][arg1][arg2];
        if (-class655.field9110 == var3) {
            return false;
        } else if (class655.field9110 == var3) {
            return true;
        } else {
            int var4 = arg1 << class291.field3760;
            int var5 = arg2 << class291.field3760;
            if (class239.method1510(var4 + 1, class392.field4997[arg0].method668(arg1, arg2), var5 + 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1 + 1, arg2), var5 + 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1 + 1, arg2 + 1), class688.field9414 + var5 - 1) && class239.method1510(var4 + 1, class392.field4997[arg0].method668(arg1, arg2 + 1), class688.field9414 + var5 - 1) && class239.method1510(class57.field768 + var4, class392.field4997[arg0].method668(arg1, arg2), var5 + 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1 + 1, arg2), class57.field768 + var5) && class239.method1510(class57.field768 + var4, class392.field4997[arg0].method668(arg1, arg2 + 1), class688.field9414 + var5 - 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1, arg2), class57.field768 + var5) && class239.method1510(class57.field768 + var4, class392.field4997[arg0].method668(arg1, arg2), class57.field768 + var5)) {
                class105.field1384[arg0][arg1][arg2] = class655.field9110;
                return true;
            } else {
                class105.field1384[arg0][arg1][arg2] = -class655.field9110;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class207(String arg0) {
        this.field2668 = arg0;
    }
}
