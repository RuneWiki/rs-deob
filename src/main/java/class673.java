import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class673 {

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field9474 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public int field9476 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Ltb;")
    private class450 field9469 = new class450(64);

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Llv;")
    private class696 field9477 = null;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lpl;")
    private class612 field9470;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lpl;")
    private class612 field9467;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lrga;")
    public static class280 field9465 = new class280(62, -1);

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field9473 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lpl;")
    public static class612 field9472;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method3778(int arg0) {
        field9465 = null;
        field9472 = null;
        if (arg0 != 4664) {
            field9465 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lks;II)V")
    public static final void method3779(class30 arg0, int arg1, int arg2) {
        if (arg1 != 32767) {
            return;
        }
        class207.field2620 = 0;
        field9466++;
        class2.field18 = false;
        class452.method2422((byte) -118, arg0);
        class121.method650(arg0, (byte) -126);
        if (class2.field18) {
            System.out.println("---endgpp---");
        }
        if (arg0.field8812 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field8812 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbaa;JI[I)Ljava/lang/String;")
    public final String method3780(class593 arg0, long arg1, int arg2, int[] arg3) {
        if (arg2 < 43) {
            this.method3781(-1, (byte) -58);
        }
        field9468++;
        if (this.field9477 != null) {
            String var6 = this.field9477.method1442(arg1, arg3, 88, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)Luj;")
    public final class629 method3781(int arg0, byte arg1) {
        field9464++;
        class629 var3 = (class629) this.field9469.method2418((long) arg0, (byte) 100);
        if (var3 != null) {
            return var3;
        } else if (arg1 < 8) {
            return null;
        } else {
            byte[] var4;
            if (arg0 >= 32768) {
                var4 = this.field9470.method3365(arg0 & 0x7FFF, 24, 1);
            } else {
                var4 = this.field9467.method3365(arg0, 50, 1);
            }
            class629 var5 = new class629();
            var5.field8764 = this;
            if (var4 != null) {
                var5.method3450((byte) 48, new class630(var4));
            }
            if (arg0 >= 32768) {
                var5.method3458(-19394);
            }
            this.field9469.method2409((long) arg0, var5, 1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method3782(int arg0) {
        field9475++;
        class685.field9617++;
        class704 var1 = class314.method1820(class376.field4743, class400.field5014, (byte) -124);
        if (arg0 != -30184) {
            method3778(21);
        }
        var1.field9929.method3526(class70.field942, 13469);
        class122.method654(var1, (byte) -36);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILpl;Lpl;Llv;)V")
    public class673(int arg0, class612 arg1, class612 arg2, class696 arg3) {
        this.field9477 = arg3;
        this.field9470 = arg2;
        this.field9467 = arg1;
        if (this.field9467 != null) {
            this.field9476 = this.field9467.method3349(1, true);
        }
        if (this.field9470 != null) {
            this.field9474 = this.field9470.method3349(1, true);
        }
    }
}
