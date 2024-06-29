import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class170 implements Runnable {

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "[Lvo;")
    public volatile class41[] field2491 = new class41[2];

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Z")
    public volatile boolean field2490 = false;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Z")
    public volatile boolean field2487 = false;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "[I")
    public static int[] field2486 = new int[200];

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "Lvk;")
    public class367 field2489;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V", line = 4)
    public static void method1255(byte arg0) {
        if (arg0 != -80) {
            field2486 = null;
        }
        field2486 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1256(int arg0) {
        field2488++;
        if (class34.field456 != null) {
            if (class34.field456.field9091 == 1) {
                class34.field456 = null;
                return;
            }
            if (class34.field456.field9091 == 2) {
                class311.method2017(class390.field5455, 2, class208.field2993, 2);
                class34.field456 = null;
                return;
            }
        }
        if (arg0 != 13731) {
            method1256(88);
        }
    }

    @OriginalMember(owner = "client!cda", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        field2493++;
        this.field2487 = true;
        try {
            while (!this.field2490) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class41 var2 = this.field2491[var1];
                    if (var2 != null) {
                        var2.method376((byte) 54);
                    }
                }
                class246.method1639(10L, (byte) -94);
                class519.method3084(-96, this.field2489, null);
            }
        } catch (Exception var9) {
            class621.method3591(null, var9, (byte) -80);
        } finally {
            Object var6 = null;
            this.field2487 = false;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)V", line = 83)
    public static final void method1257(boolean arg0, int arg1) {
        if (!arg0) {
            field2486 = null;
        }
        field2492++;
        class354 var2 = class501.method3012(arg1, 3, 2145997216);
        var2.method2216(0);
    }
}
