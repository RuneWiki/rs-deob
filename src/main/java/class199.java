import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class199 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Ltq;")
    private class536 field2767 = new class536(64);

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public int field2771 = 0;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Lwm;")
    private class30 field2769;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Ldaa;")
    public final class363 method1361(int arg0, int arg1) {
        field2768++;
        class536 var3 = this.field2767;
        class363 var4;
        synchronized (this.field2767) {
            var4 = (class363) this.field2767.method2931((long) arg1, (byte) -118);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field2769;
        byte[] var6;
        synchronized (this.field2769) {
            var6 = this.field2769.method139(arg0, (byte) -94, arg1);
        }
        class363 var7 = new class363();
        var7.field4422 = arg1;
        var7.field4414 = this;
        if (var6 != null) {
            var7.method2087(58, new class234(var6));
        }
        var7.method2085((byte) -89);
        class536 var8 = this.field2767;
        synchronized (this.field2767) {
            this.field2767.method2918((long) arg1, var7, arg0 ^ 0x66);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public final void method1362(byte arg0) {
        class536 var2 = this.field2767;
        synchronized (this.field2767) {
            this.field2767.method2919(0);
        }
        field2763++;
        if (arg0 != -86) {
            this.method1361(-79, -119);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method1363(int arg0) {
        field2764++;
        if (arg0 == 3684) {
            class536 var2 = this.field2767;
            synchronized (this.field2767) {
                this.field2767.method2932((byte) 80);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public final void method1364(int arg0, int arg1) {
        field2770++;
        class536 var3 = this.field2767;
        synchronized (this.field2767) {
            this.field2767.method2928(true, arg0);
            if (arg1 <= 122) {
                this.field2767 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class199(class473 arg0, int arg1, class30 arg2) {
        this.field2769 = arg2;
        this.field2765 = this.field2769.method138(0, 4);
    }
}
