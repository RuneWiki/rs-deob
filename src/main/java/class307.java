import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class307 {

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lmo;")
    private class336 field4358 = new class336(64);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lnl;")
    private class435 field4356;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field4348 = -1;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[Lqp;")
    public static class303[] field4357 = new class303[14];

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field4359 = 328;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[Lrn;")
    public static class417[] field4353;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method1967(int arg0) {
        field4354++;
        if (arg0 != -18182 || class107.field1498) {
            return;
        }
        if (class165.field2399) {
            class91.field1281 = (float) ((int) class91.field1281 + 191 & 0xFFFFFF80);
        } else {
            class95.field1340 += (24.0F - class95.field1340) / 2.0F;
        }
        class303.field4311 = true;
        class107.field1498 = true;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lcp;")
    public final class162 method1968(int arg0, int arg1) {
        field4349++;
        class336 var3 = this.field4358;
        class162 var4;
        synchronized (this.field4358) {
            var4 = (class162) this.field4358.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4356.method2633(arg0, arg1, -29);
        class162 var6 = new class162();
        if (var5 != null) {
            var6.method1202(false, new class161(var5));
        }
        var6.method1203(-113);
        class336 var7 = this.field4358;
        synchronized (this.field4358) {
            this.field4358.method2116((long) arg1, (byte) -116, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method1969(byte arg0) {
        field4357 = null;
        field4353 = null;
        int var1 = 127 / ((arg0 + 38) / 47);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    public final void method1970(boolean arg0) {
        field4351++;
        class336 var2 = this.field4358;
        synchronized (this.field4358) {
            this.field4358.method2119(0);
            if (!arg0) {
                method1973(20, -16, -80, -79, -26, 113, (class418) null);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Z)V")
    public final void method1971(boolean arg0) {
        if (arg0) {
            this.field4358 = null;
        }
        field4355++;
        class336 var2 = this.field4358;
        synchronized (this.field4358) {
            this.field4358.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
    public final void method1972(int arg0, boolean arg1) {
        class336 var3 = this.field4358;
        synchronized (this.field4358) {
            this.field4358.method2120((byte) 93, arg0);
        }
        if (!arg1) {
            field4350++;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Llo;ILnl;)V")
    public class307(class280 arg0, int arg1, class435 arg2) {
        this.field4356 = arg2;
        if (this.field4356 != null) {
            this.field4356.method2638(1, 35);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIILfo;)V")
    public static final void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class418 arg6) {
        field4352++;
        class382.method2325(arg4, arg6.field4537, 0, arg5, arg6.field4531, arg6.field4530, arg1, arg0, (byte) 44, arg2);
        if (arg3 != 32602) {
            method1973(-115, -102, 111, -37, -23, 78, (class418) null);
        }
    }
}
