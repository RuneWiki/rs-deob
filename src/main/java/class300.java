import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class300 implements Runnable {

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "[Lcl;")
    public volatile class245[] field4684 = new class245[2];

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "Z")
    public volatile boolean field4691 = false;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Z")
    public volatile boolean field4689 = false;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Lvg;")
    public static class49 field4688 = new class49(8);

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Lk;")
    public class525 field4686;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Lri;")
    public static class97 field4692;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)V")
    public static final void method2074(int arg0, byte arg1) {
        field4690++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class165.field2779 = arg0;
        class210.field3507 = new class536[class664.field9247[class165.field2779] + 1];
        class411.field6317 = 0;
        if (arg1 != 72) {
            method2074(-72, (byte) -84);
        }
        class582.field8279 = 0;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
    public static void method2075(int arg0) {
        field4692 = null;
        if (arg0 <= 42) {
            method2075(60);
        }
        field4688 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I")
    public static final int method2076(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            field4688 = null;
        }
        field4687++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!saa", name = "run", descriptor = "()V")
    public final void run() {
        field4685++;
        this.field4689 = true;
        try {
            while (!this.field4691) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class245 var2 = this.field4684[var1];
                    if (var2 != null) {
                        var2.method1752((byte) 63);
                    }
                }
                class549.method3313(10L, 127);
                class390.method2533((byte) 70, this.field4686, null);
            }
        } catch (Exception var9) {
            class660.method3790(10216, var9, null);
        } finally {
            Object var6 = null;
            this.field4689 = false;
        }
    }
}
