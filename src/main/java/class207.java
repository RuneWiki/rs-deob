import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class207 {

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lwg;")
    private class58 field2689 = new class58(64);

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lkr;")
    private class329 field2691;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2685 = null;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "[B")
    public static byte[] field2688 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "[I")
    public static int[] field2692 = new int[2];

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "[I")
    public static int[] field2694 = new int[1000];

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V")
    public final void method1318(int arg0, byte arg1) {
        field2684++;
        if (arg1 == -23) {
            class58 var3 = this.field2689;
            synchronized (this.field2689) {
                this.field2689.method320(arg0, -306674912);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
    public static final void method1319(int arg0, boolean arg1) {
        if (arg1 && class614.field8826 != null) {
            class145.field1889 = class614.field8826.field3429;
        } else {
            class145.field1889 = -1;
        }
        field2690++;
        class612.field8795 = null;
        class516.field7207 = null;
        class614.field8826 = null;
        class345.field4777 = 0;
        class614.method3516();
        class614.field8834.method3178(-8299);
        class211.field2725 = null;
        class217.field2771 = -1;
        class630.field9183 = null;
        class321.field4440 = null;
        class525.field7308 = null;
        class536.field7473 = null;
        class124.field1543 = -1;
        class342.field4757 = null;
        class447.field6219 = null;
        class58.field784 = null;
        class212.field2731 = null;
        class614.field8832 = null;
        if (class614.field8823 != null) {
            class614.field8823.method1545(true);
            class614.field8823.method1542(64, false, 128);
        }
        if (class614.field8824 != null) {
            class614.field8824.method2480(-19139, 64, 64);
        }
        if (class614.field8825 != null) {
            class614.field8825.method1092(-23, 64);
        }
        class643.field9328.method1291(arg0, 1344661505);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static void method1320(byte arg0) {
        if (arg0 != 0) {
            method1320((byte) 13);
        }
        field2694 = null;
        field2685 = null;
        field2692 = null;
        field2688 = null;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static final void method1321(byte arg0) {
        if (arg0 != 2) {
            return;
        }
        class215.field2765 = null;
        field2683++;
        class596.method3431(0, arg0 ^ 0x5A, 0, -1, class604.field8711, class502.field6955, class126.field1565, 0, 0);
        if (class215.field2765 != null) {
            class443.method2574(class502.field6955, -1412584499, arg0 ^ 0xFD, 0, class411.field5644, class95.field1281, class604.field8711, class254.field3157.field6233, 0, class215.field2765);
            class215.field2765 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lpda;")
    public final class281 method1322(int arg0, int arg1) {
        field2686++;
        class58 var3 = this.field2689;
        class281 var4;
        synchronized (this.field2689) {
            var4 = (class281) this.field2689.method323((long) arg1, -19814);
            if (arg0 != -7808) {
                this.field2691 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2691;
        byte[] var6;
        synchronized (this.field2691) {
            var6 = this.field2691.method2054(true, 31, arg1);
        }
        class281 var7 = new class281();
        if (var6 != null) {
            var7.method1755(-1, new class551(var6));
        }
        class58 var8 = this.field2689;
        synchronized (this.field2689) {
            this.field2689.method316((long) arg1, (byte) -112, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public final void method1323(int arg0) {
        class58 var2 = this.field2689;
        synchronized (this.field2689) {
            this.field2689.method315(1);
        }
        if (arg0 <= 37) {
            method1319(13, false);
        }
        field2693++;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)I")
    public static final int method1324(byte arg0) {
        if (arg0 <= 93) {
            method1319(-115, false);
        }
        field2695++;
        if (class558.field7815 == null) {
            return class317.field4370 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public final void method1325(boolean arg0) {
        class58 var2 = this.field2689;
        synchronized (this.field2689) {
            this.field2689.method317((byte) 21);
        }
        field2687++;
        if (arg0) {
            this.method1323(-21);
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class207(class513 arg0, int arg1, class329 arg2) {
        this.field2691 = arg2;
        this.field2691.method2064(0, 31);
    }
}
