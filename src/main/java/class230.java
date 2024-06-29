import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class230 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lmq;")
    private class472 field2992 = new class472(64);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ljn;")
    private class668 field2991;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Z")
    public static boolean field2989 = false;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lmq;")
    public static class472 field2993 = new class472(260);

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "S")
    public static short field2997 = 32767;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3001 = -1;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[I")
    public static int[] field2998 = new int[1];

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "F")
    public static float field2995;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lq;")
    public static class394 field2999;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Lgf;")
    public final class251 method1390(byte arg0, int arg1) {
        field2994++;
        class472 var3 = this.field2992;
        class251 var4;
        synchronized (this.field2992) {
            var4 = (class251) this.field2992.method2766(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field2991;
        byte[] var6;
        synchronized (this.field2991) {
            var6 = this.field2991.method3800(arg1, 31, (byte) -92);
        }
        class251 var7 = new class251();
        if (var6 != null) {
            var7.method1537((byte) -96, new class389(var6));
        }
        int var8 = -125 / ((49 - arg0) / 44);
        class472 var9 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method1391(int arg0) {
        field2990++;
        class472 var2 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method2778((byte) 107);
        }
        if (arg0 != 31) {
            field2993 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
    public final void method1392(int arg0, byte arg1) {
        if (arg1 < 44) {
            return;
        }
        class472 var3 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method2777(arg0, 85);
        }
        field2988++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field2993 = null;
        field2998 = null;
        field2999 = null;
        if (arg0 != -100) {
            field2999 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final void method1394(int arg0) {
        field2996++;
        class472 var2 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method2776(false);
        }
        if (arg0 < 34) {
            this.method1390((byte) -77, 74);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class230(class90 arg0, int arg1, class668 arg2) {
        this.field2991 = arg2;
        this.field2991.method3805(31, false);
    }
}
