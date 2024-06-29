import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class184 extends class335 {

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field2562 = 4096;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    private int field2558 = 0;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field2563 = -1;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Leba;")
    public static class550 field2560 = new class550(100, 1);

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)[I", line = 4)
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field2559;
            int[] var3 = super.field4525.method2344(-2, arg1);
            if (super.field4525.field5435) {
                int[] var4 = this.method1969(0, arg1, -99);
                for (int var5 = 0; class649.field8968 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field2558 && ~var6 >= ~this.field2562 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILga;Lfa;Ljava/awt/Canvas;)Lr;", line = 38)
    public static final class562 method1218(int arg0, int arg1, class332 arg2, class522 arg3, Canvas arg4) {
        ++field2564;
        if (!class488.method2801((byte) 104)) {
            throw new RuntimeException("");
        } else if (!class324.method1882("jaggl", -50)) {
            throw new RuntimeException("");
        } else if (arg1 <= 47) {
            return null;
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class510 var8 = new class510(var5, arg4, var6, arg3, arg2, arg0);
                var8.method3654(85);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILio;I)V", line = 67)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            field2565 = 4;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2562 = arg1.method963(arg2 + -53);
            }
        } else {
            this.field2558 = arg1.method963(-125);
        }
        ++field2561;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 102)
    public static final void method1219(byte arg0) {
        ++field2557;
        class502.field6926 = -1;
        class657.field9361 = 0;
        class387.field5165 = -1;
        if (arg0 < 35) {
            field2565 = -107;
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 116)
    public static void method1220(int arg0) {
        field2560 = null;
        if (arg0 != 0) {
            method1218(111, 35, (class332) null, (class522) null, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 129)
    public class184() {
        super(1, true);
    }
}
