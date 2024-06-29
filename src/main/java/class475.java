import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class475 {

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "Lpa;")
    private class387 field6757 = new class387(64);

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "Lcb;")
    private class544 field6752;

    @OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!oja", name = "j", descriptor = "Z")
    public static boolean field6760 = false;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)Lmaa;")
    public final class494 method2801(int arg0, int arg1) {
        field6755++;
        if (arg1 != 64) {
            this.field6759 = -89;
        }
        class387 var3 = this.field6757;
        class494 var4;
        synchronized (this.field6757) {
            var4 = (class494) this.field6757.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field6752;
        byte[] var6;
        synchronized (this.field6752) {
            var6 = this.field6752.method3150(arg0, -67, 16);
        }
        class494 var7 = new class494();
        if (var6 != null) {
            var7.method2886(new class120(var6), (byte) -115);
        }
        class387 var8 = this.field6757;
        synchronized (this.field6757) {
            this.field6757.method2362(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)V")
    public final void method2802(boolean arg0) {
        field6754++;
        class387 var2 = this.field6757;
        synchronized (this.field6757) {
            if (arg0) {
                this.method2804(124, 100);
            }
            this.field6757.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
    public final void method2803(byte arg0) {
        if (arg0 != 13) {
            method2805(34, null);
        }
        field6753++;
        class387 var2 = this.field6757;
        synchronized (this.field6757) {
            this.field6757.method2364(1);
        }
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(II)V")
    public final void method2804(int arg0, int arg1) {
        field6756++;
        class387 var3 = this.field6757;
        synchronized (this.field6757) {
            this.field6757.method2366(arg0, 109);
            if (arg1 != 0) {
                this.method2802(false);
            }
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILrv;)V")
    public static final void method2805(int arg0, class120 arg1) {
        field6751++;
        if (arg0 >= -109) {
            return;
        }
        int var2 = arg1.method890((byte) -59);
        class10.field228 = new class367[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class10.field228[var3] = new class367();
            class10.field228[var3].field5284 = arg1.method890((byte) -59);
            class10.field228[var3].field5285 = arg1.method874(-1);
        }
        class132.field1729 = arg1.method890((byte) -59);
        class585.field8280 = arg1.method890((byte) -59);
        class542.field7602 = arg1.method890((byte) -59);
        class541.field7585 = new class162[class585.field8280 + 1 - class132.field1729];
        for (int var4 = 0; var4 < class542.field7602; var4++) {
            int var5 = arg1.method890((byte) -59);
            class162 var6 = class541.field7585[var5] = new class162();
            var6.field10804 = arg1.method842(2384);
            var6.field10809 = arg1.method871(23995);
            var6.field2380 = class132.field1729 + var5;
            var6.field2386 = arg1.method874(-1);
            var6.field2387 = arg1.method874(-1);
        }
        class533.field7527 = arg1.method871(23995);
        class247.field3517 = true;
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class475(class106 arg0, int arg1, class544 arg2) {
        this.field6752 = arg2;
        if (this.field6752 == null) {
            this.field6759 = 0;
        } else {
            this.field6759 = this.field6752.method3147(16, -79);
        }
    }
}
