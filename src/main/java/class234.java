import jaggl.memory.NativeHeap;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class234 extends class391 {

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3249;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Lhi;")
    public static class45 field3250 = new class45(13, 0);

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lhi;")
    public static class45 field3253 = new class45(64, 3);

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V", line = 3)
    public static void method1427(int arg0) {
        field3250 = null;
        field3253 = null;
        if (arg0 != -2086) {
            method1429((byte) -76, -13, 106, 110, -71, -94, 115, 46, 78);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 16)
    public static final byte[] method1428(Object arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            method1428(null, false, true);
        }
        field3255++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class130.method934(var3, (byte) 112) : var3;
        } else if (arg0 instanceof class527) {
            class527 var4 = (class527) arg0;
            return var4.method2385(-127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIIIIIIII)V", line = 56)
    public static final void method1429(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3254++;
        class17.method123(0, arg8, arg2, arg7, arg5, 5, arg6, arg1, arg4, arg3);
        if (arg0 != -84) {
            method1428(null, true, true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 70)
    public final void method1430(int arg0) {
        field3252++;
        this.field3249.method2847();
        if (arg0 != 13) {
            method1429((byte) -71, 94, 80, -63, 79, 96, -30, -41, 76);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V", line = 80)
    public class234(int arg0) {
        this.field3249 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lsv;I)V", line = 94)
    public static final void method1431(class319 arg0, int arg1) {
        field3251++;
        byte[] var2 = new byte[24];
        if (class274.field3724 != null) {
            try {
                class274.field3724.method1076(0L, -83);
                class274.field3724.method1079(var2, 10789);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1885(24, arg1, false, var2);
    }
}
