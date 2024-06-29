import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class618 extends class30 {

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field8707 = 0;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field8706 = 0;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field8708 = -1;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Ltm;")
    public static class334 field8710 = new class334(90, -1);

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "[I")
    public static int[] field8711 = new int[1];

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "[Z")
    public static boolean[] field8712;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V", line = 9)
    public static final void method3525() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class147.field2305.length; var1++) {
                if (class147.field2305[var1].method3290()) {
                    class199.field3399[var1] = class147.field2305[var1].method3288();
                } else {
                    synchronized (class147.field2305[var1]) {
                        class147.field2305[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class147.field2305[class147.field2305.length - 1].method3289();
                class563.method3261(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class147.field2305.length - 1; var4++) {
                        if (!class147.field2305[var4].method3290()) {
                            synchronized (class147.field2305[var4]) {
                                class147.field2305[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class147.field2305.length - 2; var6++) {
                            class147.field2305[var6].method3289();
                        }
                        class563.method3261(2);
                        while (!class147.field2305[0].method3290()) {
                            synchronized (class147.field2305[0]) {
                                class147.field2305[0].notify();
                            }
                            try {
                                class484.method2932(true, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class147.field2305[0].method3289();
                        return;
                    }
                    try {
                        class484.method2932(true, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class484.method2932(true, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 110)
    public static void method3526(int arg0) {
        field8710 = null;
        field8712 = null;
        field8711 = null;
        if (arg0 <= 84) {
            method3526(-31);
        }
    }
}
