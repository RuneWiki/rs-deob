import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class16 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public static int[] field300 = new int[2];

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lad;")
    public static class275 field303 = new class275(64);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field305 = -1;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[S")
    public static short[] field304 = new short[256];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1(int arg0, Component arg1);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIIII)V")
    public static final void method129(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class309.method2096(arg5, arg4, (byte) -117, class232.field3629[arg0], arg3);
        field299++;
        int var9 = arg2 - 1;
        class309.method2096(arg5, arg4, (byte) -117, class232.field3629[arg2], arg3);
        if (arg1 != -55) {
            field300 = null;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class232.field3629[var6];
            var7[arg3] = var7[arg4] = arg5;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)I")
    public abstract int method2(boolean arg0);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method130(byte arg0) {
        field303 = null;
        field304 = null;
        field300 = null;
        int var1 = -78 / ((47 - arg0) / 60);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZIIII)V")
    public static final void method131(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        field301++;
        class249.field4084 = (short) arg4;
        if (arg2 > arg5) {
            arg5 = 1;
        }
        class236.field3700 = (short) arg5;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method3(int arg0, Component arg1);
}
