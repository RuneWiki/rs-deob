import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public abstract class class30 {

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "J")
    public static volatile long field429 = 0L;

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Lr;")
    public static class33 field432 = class29.method192("Silk Trader", (byte) 126);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "[Z")
    public static boolean[] field436 = new boolean[112];

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lr;")
    public static class33 field435 = class29.method192("sprites", (byte) 126);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "[I")
    public static int[] field430;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)Lba;", line = 9)
    public static final class4 method195(int arg0) {
        try {
            if (arg0 != -9259) {
                field435 = null;
            }
            return (class4) Class.forName("k").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class6();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIBIB)V", line = 44)
    public static final void method197(int arg0, int arg1, byte arg2, int arg3, byte arg4) {
        int var5 = arg3 >> 6;
        int var6 = arg0 >> 6;
        if (class31.field441[arg1][var6][var5] == null) {
            class31.field441[arg1][var6][var5] = new byte[4096];
        }
        if (arg2 >= -111) {
            method195(107);
        }
        class31.field441[arg1][var6][var5][method198(63, arg3) + method198(arg0 << 6, 4032)] = arg4;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)I", line = 66)
    public static int method198(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 73)
    public static final void method199(Component arg0, int arg1) {
        arg0.addMouseListener(class29.field417);
        arg0.addMouseMotionListener(class29.field417);
        if (arg1 != 1254521510) {
            method199(null, -63);
        }
        arg0.addFocusListener(class29.field417);
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I)V", line = 86)
    public static void method200(int arg0) {
        int var1 = -30 / ((71 - arg0) / 47);
        field436 = null;
        field435 = null;
        field430 = null;
        field432 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method196(boolean arg0);

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B[B)V")
    public abstract void method201(byte arg0, byte[] arg1);
}
