import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class184 extends class272 {

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Ljd;")
    public static class118 field3383 = new class118(new byte[5000]);

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Lli;")
    public static class185 field3388 = class245.method1649("Prendre", 127);

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lli;")
    public static class185 field3390 = class245.method1649(": ", -6);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "Lli;")
    public static class185 field3393 = class245.method1649("welle:", -68);

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lgf;")
    public static class7 field3387 = new class7(200);

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Lhi;")
    public static class250 field3386;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lhi;")
    public static class250 field3392;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
    public static void method1293(boolean arg0) {
        field3393 = null;
        field3387 = null;
        if (arg0) {
            field3387 = null;
        }
        field3383 = null;
        field3390 = null;
        field3392 = null;
        field3388 = null;
        field3386 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lki;")
    public static final class135 method1294(int arg0, int arg1) {
        ++field3389;
        class135 var2 = (class135) class212.field3868.method82(-92, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field776.method1688(0, class9.method91(255, arg0), class228.method1576((byte) -117, arg0));
            class135 var4 = new class135();
            var4.field2527 = arg0;
            if (var3 != null) {
                var4.method973(new class118(var3), false);
            }
            var4.method968(arg1 ^ arg1);
            if (var4.field2492) {
                var4.field2516 = 0;
                var4.field2545 = false;
            }
            if (!class60.field1080 && var4.field2546) {
                var4.field2491 = null;
            }
            class212.field3868.method84(99, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            field3394 = -21;
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        ++field3382;
        if (super.field4819.field4294) {
            class190.method1367(var3, 0, class246.field4385, class232.field4177[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILhi;)V")
    public static final void method1295(int arg0, class250 arg1) {
        class150.field2841 = arg1;
        ++field3379;
        if (arg0 != 5000) {
            method1297(-57, (class118) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V")
    public static final void method1296(boolean arg0) {
        if (class241.field4308 != null) {
            class127 var1 = class241.field4308;
            synchronized (class241.field4308) {
                class241.field4308 = null;
            }
        }
        if (!arg0) {
            field3387 = null;
        }
        ++field3380;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjd;)Lnd;")
    public static final class272 method1297(int arg0, class118 arg1) {
        arg1.method867(false);
        ++field3381;
        int var2 = arg1.method867(false);
        class272 var3 = class220.method1522(12, var2);
        var3.field4831 = arg1.method867(false);
        int var4 = arg1.method867(false);
        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = arg1.method867(false);
            var3.method34(arg1, (byte) -107, var6);
        }
        var3.method113(arg0);
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }
}
