import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class139 extends class123 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lqg;")
    public static class257 field2249 = new class257(0, -1);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static volatile int field2257 = 0;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "C")
    private char field2248;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field2247;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Ljava/lang/String;")
    public String field2245;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V", line = 5)
    public static final void method1064(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class170 var5 = class221.method1613(8, arg3, arg1 ^ 0xFFFFDF1F);
        var5.method1269(false);
        var5.field2730 = arg0;
        field2251++;
        var5.field2737 = arg2;
        if (arg1 == 57) {
            var5.field2734 = arg4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Laj;I)V", line = 21)
    public final void method1065(class1 arg0, int arg1) {
        field2252++;
        if (arg1 != 0) {
            method1068((byte) 15);
        }
        while (true) {
            int var3 = arg0.method15((byte) 90);
            if (var3 == 0) {
                return;
            }
            this.method1070(var3, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 46)
    public static final void method1066(int arg0) {
        field2244++;
        class274 var1 = class243.field3645;
        synchronized (class243.field3645) {
            class129.field2062 = class327.field5114;
            class70.field1059++;
            if (arg0 != 8) {
                field2257 = -99;
            }
            class303.field4832 = class45.field704;
            class22.field389 = class13.field300;
            class200.field3072 = class218.field3397;
            class170.field2740 = class183.field2887;
            class243.field3639 = field2257;
            class319.field5004 = class220.field3435;
            class218.field3397 = 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Z", line = 73)
    public final boolean method1067(int arg0) {
        if (arg0 <= 40) {
            return true;
        } else {
            field2250++;
            return this.field2248 == 's';
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 84)
    public static void method1068(byte arg0) {
        field2247 = null;
        if (arg0 != 23) {
            method1064(-51, (byte) 84, 38, -61, -96);
        }
        field2249 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbk;I)[Lp;", line = 111)
    public static final class108[] method1069(class69 arg0, int arg1) {
        field2253++;
        if (!arg0.method551((byte) -43)) {
            return new class108[0];
        }
        class23 var2 = arg0.method545((byte) -47);
        while (var2.field405 == 0) {
            class245.method1729(120, 10L);
        }
        if (var2.field405 == 2) {
            return new class108[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field409);
        class108[] var4 = new class108[var3.length >> 2];
        for (int var5 = arg1; var5 < var4.length; var5++) {
            class108 var6 = new class108();
            var4[var5] = var6;
            var6.field1765 = var3[var5 << 2];
            var6.field1768 = var3[(var5 << 2) + 1];
            var6.field1760 = var3[(var5 << 2) + 2];
            var6.field1761 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILaj;I)V", line = 150)
    private final void method1070(int arg0, class1 arg1, int arg2) {
        if (arg2 != 5) {
            field2249 = (class257) null;
        }
        if (arg0 == 1) {
            this.field2248 = class15.method188(arg1.method55(4), 11546);
        } else if (arg0 == 2) {
            this.field2255 = arg1.method33(false);
        } else if (arg0 == 5) {
            this.field2245 = arg1.method53(32);
        }
        field2246++;
    }
}
