import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class192 extends class513 {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Z")
    public boolean field2792;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lll;")
    public class45 field2791;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lnea;")
    public static class154[] field2794 = new class154[14];

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lcj;")
    public static class443 field2795;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public boolean field2782;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Z")
    public boolean field2783;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Z")
    public boolean field2788;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[[[Lch;")
    public static class38[][][] field2787;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1272(boolean arg0) {
        if (arg0) {
            field2795 = null;
            field2787 = null;
            field2794 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 27)
    public static final Object method1273(boolean arg0, int arg1, byte[] arg2) {
        field2793++;
        if (arg1 > -78) {
            method1273(false, 102, null);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class75.field1035) {
            try {
                class667 var3 = (class667) Class.forName("tg").getDeclaredConstructor().newInstance();
                var3.method3550(2, arg2);
                return var3;
            } catch (Throwable var4) {
                class75.field1035 = true;
            }
        }
        return arg0 ? class55.method378((byte) 70, arg2) : arg2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 62)
    public static final void method1274(byte arg0) {
        field2790++;
        if (class95.field1393 == 0) {
            return;
        }
        try {
            if ((++class369.field4720) > 2000) {
                if (class275.field3699 != null) {
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                }
                if (class282.field3741 >= 2) {
                    class530.field7420 = -5;
                    class95.field1393 = 0;
                    return;
                }
                class177.field2403.method388((byte) 62);
                class282.field3741++;
                class95.field1393 = 1;
                class369.field4720 = 0;
            }
            if (class95.field1393 == 1) {
                class176.field2392 = class177.field2403.method391(false, class379.field5339);
                class95.field1393 = 2;
            }
            if (class95.field1393 == 2) {
                if (class176.field2392.field5975 == 2) {
                    throw new IOException();
                }
                if (class176.field2392.field5975 != 1) {
                    return;
                }
                class275.field3699 = class734.method4075(true, (Socket) class176.field2392.field5973, 7500);
                class176.field2392 = null;
                class458.method2748(true);
                class95.field1393 = 4;
            }
            if (class95.field1393 == 4) {
                if (!class275.field3699.method2459(2, 1)) {
                    return;
                }
                class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                int var1 = class150.field2065.field279[0] & 0xFF;
                class95.field1393 = 0;
                class530.field7420 = var1;
                class275.field3699.method2461(false);
                class275.field3699 = null;
                return;
            }
        } catch (IOException var3) {
            if (class275.field3699 != null) {
                class275.field3699.method2461(false);
                class275.field3699 = null;
            }
            if (class282.field3741 >= 2) {
                class530.field7420 = -4;
                class95.field1393 = 0;
            } else {
                class177.field2403.method388((byte) 78);
                class369.field4720 = 0;
                class282.field3741++;
                class95.field1393 = 1;
            }
        }
        int var2 = 23 % ((79 - arg0) / 32);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 164)
    public static final void method1275(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1275(1, 59, -100);
        }
        field2786++;
        if (class324.field4159 == class210.field2984) {
            if (!class176.method1104(0, 1, arg0, 1, 0, false, arg2, (byte) -76, -2)) {
                class176.method1104(0, 1, arg0, 1, 0, false, arg2, (byte) -76, -3);
            }
        } else if (!class176.method1104(0, 1, arg0, 1, 0, false, arg2, (byte) -76, -3)) {
            class176.method1104(0, 1, arg0, 1, 0, false, arg2, (byte) -76, -2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILll;IZ)V", line = 190)
    public class192(int arg0, class45 arg1, int arg2, boolean arg3) {
        this.field2792 = arg3;
        this.field2789 = arg0;
        this.field2785 = arg2;
        this.field2791 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I", line = 205)
    public static final int method1276(int arg0, byte arg1, int arg2) {
        field2784++;
        int var3 = -105 / ((arg1 - 64) / 50);
        int var4 = (arg0 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }
}
