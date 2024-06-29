import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class215 extends class201 {

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Z")
    public volatile boolean field3776 = true;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "[I")
    public static int[] field3775 = new int[2];

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Ljd;")
    public static class85 field3779 = class221.method1499(" loggt sich ein)3", (byte) -65);

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field3778 = -1;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lge;")
    public static class68 field3773;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
    public boolean field3772;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
    public boolean field3780;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[[Ljb;")
    public static class255[][] field3774;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
    public abstract int method694(byte arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1475(int arg0, int arg1, int arg2, int arg3) {
        if (class141.method925(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class264.method1817(var4 + 1, class245.field4193[arg0][arg1][arg2] + arg3, var5 + 1) && class264.method1817(var4 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class264.method1817(var4 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class264.method1817(var4 + 1, class245.field4193[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static void method1476(int arg0) {
        if (arg0 == 30053) {
            field3779 = null;
            field3774 = null;
            field3773 = null;
            field3775 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)[B")
    public abstract byte[] method691(byte arg0);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        class43 var1 = class168.field2886;
        synchronized (class168.field2886) {
            class198.field3395++;
            class217.field3806 = class102.field1815;
            if (arg0 != 1) {
                return;
            }
            class245.field4195 = class112.field1957;
            class106.field1851 = class41.field661;
            class75.field1393 = class147.field2497;
            class99.field1784 = class61.field1136;
            class175.field3008 = class146.field2494;
            class177.field3024 = class218.field3835;
            class147.field2497 = 0;
        }
        field3777++;
    }
}
