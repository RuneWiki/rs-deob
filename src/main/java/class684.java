import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class684 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ltq;")
    private class536 field8820 = new class536(128);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lwm;")
    private class30 field8821;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field8822 = 2;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lwm;")
    public static class30 field8824;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Llv;")
    public final class374 method3669(int arg0, boolean arg1) {
        field8823++;
        if (arg1) {
            return null;
        }
        class536 var3 = this.field8820;
        class374 var4;
        synchronized (this.field8820) {
            var4 = (class374) this.field8820.method2931((long) arg0, (byte) -81);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field8821.method139(class790.method4326(11, arg0), (byte) -94, class525.method2888(arg0, (byte) -41));
        class374 var6 = new class374();
        if (var5 != null) {
            var6.method2143(new class234(var5), (byte) -65);
        }
        class536 var7 = this.field8820;
        synchronized (this.field8820) {
            this.field8820.method2918((long) arg0, var6, 117);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method3670(int arg0) {
        int var1 = 32 / ((arg0 - 25) / 37);
        field8824 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class684(class473 arg0, int arg1, class30 arg2) {
        this.field8821 = arg2;
        if (this.field8821 != null) {
            int var4 = this.field8821.method143((byte) 106) - 1;
            this.field8821.method138(0, var4);
        }
    }
}
