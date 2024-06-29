import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class456 extends class540 {

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "[I")
    public static int[] field6332 = new int[16];

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
    public static int field6333 = class485.method2812(9761, 1600);

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "D")
    public static double field6331;

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class456(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(FB)V", line = 16)
    public final void method1412(float arg0, byte arg1) {
        ++field6330;
        super.field7348 = arg0;
        if (arg1 != -50) {
            field6331 = 1.7334031902899227D;
        }
    }

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "(B)V", line = 38)
    public static void method2704(byte arg0) {
        field6332 = null;
        if (arg0 < 9) {
            method2704((byte) 43);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(JZ)V", line = 49)
    public static final void method2705(long arg0, boolean arg1) {
        if (class626.field8501 != null) {
            if (class502.field6938 != 1 && ~class502.field6938 != -6) {
                if (class502.field6938 == 4) {
                    class543.method3093(arg0, -128);
                }
            } else {
                class682.method3799(-30477, arg0);
            }
        }
        ++field6329;
        class131.method1047((long) class100.field1401, class379.field5542, (byte) -2);
        if (class69.field968 != -1) {
            class586.method3253(-120, class69.field968);
        }
        if (!arg1) {
            field6331 = -0.4837835905579927D;
        }
        for (int var3 = 0; var3 < class131.field1940; ++var3) {
            if (class627.field8773[var3]) {
                class756.field10500[var3] = true;
            }
            class555.field7488[var3] = class627.field8773[var3];
            class627.field8773[var3] = false;
        }
        class60.field823 = class100.field1401;
        class289.method1837(-1, -1, 55, (class668) null);
        class483.method2808(-1, -81, (class668) null, -1);
        if (class69.field968 != -1) {
            class131.field1940 = 0;
            class385.method2446(82);
        }
        class379.field5542.method543();
        class751.method4170(false, class379.field5542);
        int var4 = class581.method3235((byte) 1);
        if (~var4 == 0) {
            var4 = class660.field9129;
        }
        if (~var4 == 0) {
            var4 = class118.field1724;
        }
        class735.method4077(-101, var4);
        int var5 = class551.field7456.method655(-125) << 8;
        class83.method693(class303.field4368, class551.field7456.field2250, class551.field7456.field2259 + var5, class551.field7456.field2257 - -var5, -77);
        class303.field4368 = 0;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBII)V", line = 122)
    public final void method1411(int arg0, byte arg1, int arg2, int arg3) {
        super.field7342 = arg3;
        if (arg1 == 24) {
            super.field7344 = arg2;
            super.field7341 = arg0;
            ++field6334;
        }
    }
}
