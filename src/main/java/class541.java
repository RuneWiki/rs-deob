import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class541 {

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Lhm;")
    private class208 field6828 = new class208(64);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Lpfa;")
    private class275 field6822;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "[I")
    public static int[] field6825;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method2903(int arg0) {
        int var1 = -39 / ((-arg0 - 44) / 32);
        field6825 = null;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
    public final void method2904(int arg0) {
        class208 var2 = this.field6828;
        synchronized (this.field6828) {
            this.field6828.method1224(false);
            if (arg0 != 64) {
                this.field6822 = null;
            }
        }
        field6826++;
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
    public final void method2905(int arg0) {
        class208 var2 = this.field6828;
        synchronized (this.field6828) {
            this.field6828.method1218(114);
        }
        field6823++;
        if (arg0 != 32) {
            field6825 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
    public final void method2906(int arg0, int arg1) {
        field6827++;
        class208 var3 = this.field6828;
        synchronized (this.field6828) {
            this.field6828.method1222(14564, arg1);
            if (arg0 <= 26) {
                this.field6822 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class541(class643 arg0, int arg1, class275 arg2) {
        this.field6822 = arg2;
        this.field6822.method1655(32, (byte) -82);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Lgr;")
    public final class403 method2907(int arg0, int arg1) {
        field6824++;
        class208 var3 = this.field6828;
        class403 var4;
        synchronized (this.field6828) {
            var4 = (class403) this.field6828.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field6822;
        byte[] var6;
        synchronized (this.field6822) {
            var6 = this.field6822.method1659(102, arg0, 32);
        }
        int var7 = 79 % ((arg1 + 12) / 39);
        class403 var8 = new class403();
        if (var6 != null) {
            var8.method2270((byte) -119, new class572(var6));
        }
        class208 var9 = this.field6828;
        synchronized (this.field6828) {
            this.field6828.method1230((byte) 28, (long) arg0, var8);
            return var8;
        }
    }
}
