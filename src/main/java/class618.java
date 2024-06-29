import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class618 extends class735 {

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "J")
    private long field8598 = -1L;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Ljava/lang/String;")
    private String field8600 = null;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "Z")
    public static boolean field8597 = false;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field8595 = 0;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)B")
    public static final byte method3486(int arg0, int arg1, byte arg2) {
        field8596++;
        if (arg1 == 9) {
            if (arg2 >= -87) {
                method3486(-2, -4, (byte) 59);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
    public static final void method3487() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class34.field571.length; var1++) {
                if (class34.field571[var1].method2534()) {
                    class62.field854[var1] = class34.field571[var1].method2530();
                } else {
                    synchronized (class34.field571[var1]) {
                        class34.field571[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class34.field571[class34.field571.length - 1].method2531();
                class298.method1918(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class34.field571.length - 1; var4++) {
                        if (!class34.field571[var4].method2534()) {
                            synchronized (class34.field571[var4]) {
                                class34.field571[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class34.field571.length - 2; var6++) {
                            class34.field571[var6].method2531();
                        }
                        class298.method1918(2);
                        while (!class34.field571[0].method2534()) {
                            synchronized (class34.field571[0]) {
                                class34.field571[0].notify();
                            }
                            try {
                                class643.method3577(1L, 0);
                            } catch (Exception var9) {
                            }
                        }
                        class34.field571[0].method2531();
                        return;
                    }
                    try {
                        class643.method3577(1L, 0);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class643.method3577(1L, 0);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILfca;)V")
    public final void method627(int arg0, class93 arg1) {
        field8599++;
        if (arg1.method793((byte) 98) != 255) {
            arg1.field1442--;
            this.field8598 = arg1.method770((byte) 119);
        }
        this.field8600 = arg1.method802(false);
        if (arg0 != 5) {
            field8597 = true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lrh;Z)V")
    public final void method624(class280 arg0, boolean arg1) {
        arg0.method1794(this.field8600, this.field8598, (byte) 8);
        if (arg1) {
            method3487();
        }
        field8601++;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Z")
    public static final boolean method3488(int arg0, int arg1) {
        if (arg1 != 4) {
            field8595 = 37;
        }
        field8602++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }
}
