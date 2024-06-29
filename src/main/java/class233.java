import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class233 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lwg;")
    private class58 field2975 = new class58(64);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lkr;")
    private class329 field2977;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lpaa;")
    public static class317 field2974 = new class317(4, 5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lha;")
    public static class116 field2980;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public final void method1469(int arg0) {
        class58 var2 = this.field2975;
        synchronized (this.field2975) {
            this.field2975.method317((byte) 21);
        }
        field2979++;
        if (arg0 != 32) {
            this.field2975 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method1470(int arg0) {
        if (arg0 != 19458) {
            method1470(-69);
        }
        field2974 = null;
        field2980 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public final void method1471(int arg0, int arg1) {
        class58 var3 = this.field2975;
        synchronized (this.field2975) {
            this.field2975.method320(arg0, arg1 ^ 0x1247239A);
        }
        if (arg1 != -24390) {
            field2974 = null;
        }
        field2976++;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method1472(int arg0) {
        if (arg0 != 32) {
            return;
        }
        field2973++;
        class58 var2 = this.field2975;
        synchronized (this.field2975) {
            this.field2975.method315(1);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lpca;")
    public final class362 method1473(int arg0, int arg1) {
        field2972++;
        class58 var3 = this.field2975;
        class362 var4;
        synchronized (this.field2975) {
            var4 = (class362) this.field2975.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2977;
        byte[] var6;
        synchronized (this.field2977) {
            var6 = this.field2977.method2054(true, 32, arg0);
        }
        class362 var7 = new class362();
        if (var6 != null) {
            var7.method2241(new class551(var6), (byte) 108);
        }
        class58 var8 = this.field2975;
        synchronized (this.field2975) {
            if (arg1 >= -49) {
                field2974 = null;
            }
            this.field2975.method316((long) arg0, (byte) -120, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class233(class513 arg0, int arg1, class329 arg2) {
        this.field2977 = arg2;
        this.field2977.method2064(0, 32);
    }
}
