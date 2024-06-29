import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class346 implements Runnable {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lpr;")
    public volatile class379[] field4651 = new class379[2];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Z")
    public volatile boolean field4646 = false;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
    public volatile boolean field4653 = false;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lcba;")
    public static class471 field4654 = new class471(13, 0);

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lan;")
    public static class21 field4656;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ldj;")
    public class288 field4647;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public static final void method2086(int arg0, int arg1) {
        field4649++;
        class207.field2910 = arg1;
        class571 var2 = class384.field5141;
        synchronized (class384.field5141) {
            class384.field5141.method3246(false);
        }
        class571 var3 = class65.field1110;
        synchronized (class65.field1110) {
            if (arg0 <= -103) {
                class65.field1110.method3246(false);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lbe;I)V")
    public static final void method2087(class33 arg0, int arg1) {
        if (arg1 != -1) {
            method2089(true, -123, -23, (byte) -64);
        }
        if (arg0 instanceof class109) {
            class109 var2 = (class109) arg0;
            if (var2.field1669 != null) {
                class25.method291(var2, class645.field9372.field6035 != var2.field6035, (byte) -44);
            }
        } else if (arg0 instanceof class188) {
            class188 var3 = (class188) arg0;
            class590.method3459(class645.field9372.field6035 != var3.field6035, var3, 2098);
        }
        field4652++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method2088(int arg0) {
        field4654 = null;
        if (arg0 >= 8) {
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "run", descriptor = "()V")
    public final void run() {
        this.field4653 = true;
        field4650++;
        try {
            while (!this.field4646) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class379 var2 = this.field4651[var1];
                    if (var2 != null) {
                        var2.method2238(94);
                    }
                }
                class21.method220(0, 10L);
                class103.method729(null, this.field4647, -3);
            }
        } catch (Exception var9) {
            class235.method1474(var9, null, (byte) 115);
        } finally {
            Object var6 = null;
            this.field4653 = false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIB)I")
    public static final int method2089(boolean arg0, int arg1, int arg2, byte arg3) {
        field4648++;
        if (arg3 != -116) {
            field4656 = null;
        }
        class133 var4 = class568.method3229(arg2, (byte) -88, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var4.field2115.length) {
            return var4.field2115[arg1];
        } else {
            return -1;
        }
    }
}
