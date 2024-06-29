import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class267 implements Runnable {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[Lfl;")
    public volatile class648[] field3660 = new class648[2];

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
    public volatile boolean field3668 = false;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public volatile boolean field3666 = false;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lpn;")
    public static class361 field3664 = new class361();

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3667 = null;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ljj;")
    public static class398 field3669 = new class398(65, 3);

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lcr;")
    public class112 field3665;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static final void method1650(byte arg0) {
        field3662++;
        class303.field4055 = null;
        class335.method2137(0, class316.field4599, 0, class211.field2763, class303.field4059, 0, true, 0, -1);
        if (class303.field4055 != null) {
            class465.method2633(class278.field3766.field2467, 0, class630.field8569, class303.field4055, -46, -1412584499, 0, class303.field4059, class211.field2763, class518.field7141);
            class303.field4055 = null;
        }
        if (arg0 != -66) {
            field3669 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static void method1651(byte arg0) {
        field3664 = null;
        field3669 = null;
        field3667 = null;
        if (arg0 > -9) {
            method1651((byte) -17);
        }
    }

    @OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
    public final void run() {
        this.field3666 = true;
        field3661++;
        try {
            while (!this.field3668) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class648 var2 = this.field3660[var1];
                    if (var2 != null) {
                        var2.method3595((byte) -15);
                    }
                }
                class660.method3668(-1, 10L);
                class473.method2658(null, (byte) 127, this.field3665);
            }
        } catch (Exception var9) {
            class282.method1694(null, (byte) 47, var9);
        } finally {
            Object var6 = null;
            this.field3666 = false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BIII)I")
    public static final int method1652(byte arg0, int arg1, int arg2, int arg3) {
        field3663++;
        if (arg1 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 & 0x7F) * arg3 + (arg2 & 0x7F) * var4 >> 7;
        if (arg0 > -57) {
            return 25;
        } else {
            int var6 = (arg2 & 0x380) * var4 + ((arg1 & 0x380) * arg3) >> 7;
            int var7 = (arg1 & 0xFC00) * arg3 + (arg2 & 0xFC00) * var4 >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        }
    }
}
