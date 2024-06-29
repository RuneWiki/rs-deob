import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class169 {

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
    public static boolean field2651 = false;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    public class169(int arg0) {
        this.field2654 = arg0;
    }

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2655++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII[BI)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg2 > -32) {
            method1279();
        }
        field2652++;
        if (arg5 <= arg0) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg5 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()V")
    public static final void method1279() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class170.field2657.length; var1++) {
                if (class170.field2657[var1].method3923()) {
                    class499.field6971[var1] = class170.field2657[var1].method3917();
                } else {
                    synchronized (class170.field2657[var1]) {
                        class170.field2657[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class170.field2657[class170.field2657.length - 1].method3921();
                class115.method1019(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class170.field2657.length - 1; var4++) {
                        if (!class170.field2657[var4].method3923()) {
                            synchronized (class170.field2657[var4]) {
                                class170.field2657[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class170.field2657.length - 2; var6++) {
                            class170.field2657[var6].method3921();
                        }
                        class115.method1019(2);
                        while (!class170.field2657[0].method3923()) {
                            synchronized (class170.field2657[0]) {
                                class170.field2657[0].notify();
                            }
                            try {
                                class700.method3916((byte) 112, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class170.field2657[0].method3921();
                        return;
                    }
                    try {
                        class700.method3916((byte) 72, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class700.method3916((byte) -18, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)V")
    public static final void method1280(byte arg0, int arg1, int arg2) {
        field2653++;
        int var3 = class140.field2316.method3389(true, class497.field6915.method2936(class607.field8336, 544));
        int var5;
        if (class715.field9742) {
            for (class462 var7 = (class462) class631.field8684.method2344(-87); var7 != null; var7 = (class462) class631.field8684.method2336((byte) 126)) {
                int var10;
                if (var7.field6497 == 1) {
                    var10 = class345.method2173((class324) var7.field6503.field5243.field241, false);
                } else {
                    var10 = class591.method3374(-1, var7);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var3 += 8;
            var5 = class436.field6235 * 16 + 21;
            class469.field6575 = (class545.field7514 ? 26 : 22) + class436.field6235 * 16;
        } else {
            for (class324 var4 = (class324) class528.field7301.method1269(4); var4 != null; var4 = (class324) class528.field7301.method1264((byte) 69)) {
                int var6 = class345.method2173(var4, false);
                if (var3 < var6) {
                    var3 = var6;
                }
            }
            var3 += 8;
            class469.field6575 = (class545.field7514 ? 26 : 22) + class192.field2844 * 16;
            var5 = class192.field2844 * 16 + 21;
        }
        int var8 = arg1 - (var3 / 2);
        if (class467.field6559 < var3 + var8) {
            var8 = class467.field6559 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (arg0 > -108) {
            method1279();
        }
        if (var5 + arg2 > class582.field7968) {
            var9 = class582.field7968 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class106.field1869 = var8;
        class311.field4321 = true;
        class749.field10379 = var9;
        class565.field7788 = var3;
    }
}
