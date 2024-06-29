import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class181 implements Runnable {

    @OriginalMember(owner = "client!js", name = "k", descriptor = "[Lwe;")
    public volatile class233[] field2534 = new class233[2];

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
    public volatile boolean field2527 = false;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "Z")
    public volatile boolean field2535 = false;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field2530 = 1;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "[[I")
    public static int[][] field2533 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lng;")
    public static class190 field2524 = new class190(128);

    @OriginalMember(owner = "client!js", name = "o", descriptor = "S")
    public static short field2538 = 256;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Llf;")
    public static class130 field2539;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "Lqj;")
    public static class296 field2537;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lkq;")
    public class351 field2529;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 5)
    public static final int method1198(String arg0, int arg1) {
        field2532++;
        for (int var2 = arg1; var2 < class188.field2608.length; var2++) {
            if (class188.field2608[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 23)
    public static final byte[] method1199(Object arg0, boolean arg1, int arg2) {
        field2525++;
        if (arg2 != 0) {
            method1201(-76);
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class431.method2710(var3, (byte) 88) : var3;
        } else if (arg0 instanceof class364) {
            class364 var4 = (class364) arg0;
            return var4.method723((byte) 126);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!js", name = "run", descriptor = "()V", line = 64)
    public final void run() {
        this.field2535 = true;
        field2528++;
        try {
            while (!this.field2527) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class233 var2 = this.field2534[var1];
                    if (var2 != null) {
                        var2.method1478(8);
                    }
                }
                class4.method28(10L, 111);
                class288.method1862((Object) null, this.field2529, (byte) 24);
            }
        } catch (Exception var9) {
            class184.method1214(116, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field2535 = false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 97)
    public static void method1200(int arg0) {
        field2537 = null;
        field2539 = null;
        field2524 = null;
        field2533 = null;
        if (arg0 != -28603) {
            method1199((Object) null, true, 86);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 111)
    public static final void method1201(int arg0) {
        field2531++;
        class115.field1675 = null;
        if (arg0 != 31383) {
            method1202(-110, -59);
        }
        class403.method2599(class243.field3359, class194.field2696, -1, class230.field3089, 0, 0, 2, 0, 0);
        if (class115.field1675 != null) {
            class213.method1372(class32.field497.field5549, 0, class9.field137, -121, class386.field5625, -1412584499, class194.field2696, class243.field3359, class115.field1675, 0);
            class115.field1675 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V", line = 139)
    public static final void method1202(int arg0, int arg1) {
        if (class275.field3727 == null || class275.field3727.length < arg0) {
            class275.field3727 = new int[arg0];
        }
        if (arg1 > -4) {
            field2538 = -18;
        }
        field2526++;
    }
}
