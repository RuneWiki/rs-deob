import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class195 {

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Lmq;")
    private class104 field2772 = new class104(64);

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lfc;")
    public class343 field2767;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lfc;")
    private class343 field2764;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[I")
    public static int[] field2768 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
    public static boolean field2769 = false;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Lcs;")
    public static class351 field2765 = new class351(34, 7);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZI)V")
    public final void method1240(boolean arg0, int arg1) {
        class104 var3 = this.field2772;
        synchronized (this.field2772) {
            this.field2772.method666(arg1, arg0);
        }
        field2770++;
        if (arg0) {
            this.method1244((byte) 40);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lce;")
    public final class381 method1241(int arg0, int arg1) {
        field2766++;
        class104 var3 = this.field2772;
        class381 var4;
        synchronized (this.field2772) {
            var4 = (class381) this.field2772.method659((long) arg1, (byte) -1);
            if (arg0 != -18336) {
                method1242(-94);
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2764.method2029(3, arg1, 0);
        class381 var6 = new class381();
        var6.field5403 = this;
        if (var5 != null) {
            var6.method2284(new class425(var5), (byte) 12);
        }
        class104 var7 = this.field2772;
        synchronized (this.field2772) {
            this.field2772.method653(87, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field2768 = null;
        if (arg0 < -44) {
            field2765 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public final void method1243(int arg0) {
        field2773++;
        class104 var2 = this.field2772;
        synchronized (this.field2772) {
            if (arg0 < 1) {
                this.method1243(93);
            }
            this.field2772.method656(100);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public final void method1244(byte arg0) {
        class104 var2 = this.field2772;
        synchronized (this.field2772) {
            this.field2772.method654(false);
            if (arg0 > -116) {
                this.field2767 = null;
            }
        }
        field2763++;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;)V")
    public class195(class328 arg0, int arg1, class343 arg2, class343 arg3) {
        this.field2767 = arg3;
        this.field2764 = arg2;
        this.field2764.method2054(0, 3);
    }
}
