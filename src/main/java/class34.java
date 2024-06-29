import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 {

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field523 = 4;

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "Lhj;")
    public static class596 field525 = new class596(61, 3);

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!bja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field528++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
    public static void method312(byte arg0) {
        if (arg0 != -110) {
            method313();
        }
        field525 = null;
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(IIII)V")
    public class34(int arg0, int arg1, int arg2, int arg3) {
        this.field527 = arg2;
        this.field526 = arg0;
        this.field524 = arg1;
        this.field522 = arg3;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "()V")
    public static final void method313() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class747.field10373.length; var1++) {
                if (class747.field10373[var1].method2125()) {
                    class180.field2202[var1] = class747.field10373[var1].method2129();
                } else {
                    synchronized (class747.field10373[var1]) {
                        class747.field10373[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class747.field10373[class747.field10373.length - 1].method2127();
                class639.method3589(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class747.field10373.length - 1; var4++) {
                        if (!class747.field10373[var4].method2125()) {
                            synchronized (class747.field10373[var4]) {
                                class747.field10373[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class747.field10373.length - 2; var6++) {
                            class747.field10373[var6].method2127();
                        }
                        class639.method3589(2);
                        while (!class747.field10373[0].method2125()) {
                            synchronized (class747.field10373[0]) {
                                class747.field10373[0].notify();
                            }
                            try {
                                class594.method3405(1L, 16711680);
                            } catch (Exception var9) {
                            }
                        }
                        class747.field10373[0].method2127();
                        return;
                    }
                    try {
                        class594.method3405(1L, 16711680);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class594.method3405(1L, 16711680);
            } catch (Exception var8) {
            }
        }
    }
}
