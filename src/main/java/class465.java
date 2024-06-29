import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public abstract class class465 {

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "[F")
    public static float[] field6031 = new float[16384];

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "[F")
    public static float[] field6033 = new float[16384];

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "[Lmd;")
    public static class649[] field6034;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public abstract void method454(int arg0);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
    public abstract void method456(int arg0);

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IC)Z")
    public static final boolean method2608(int arg0, char arg1) {
        field6032++;
        if (arg0 > -6) {
            method2609(127);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III[I)V")
    public abstract void method457(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public abstract void method448(int arg0);

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "([I)V")
    public abstract void method447(int[] arg0);

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "()Loha;")
    public abstract class465 method458();

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "(I)V")
    public abstract void method463(int arg0);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(III[I)V")
    public abstract void method446(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Loha;)V")
    public abstract void method468(class465 arg0);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "()V")
    public abstract void method462();

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
    public abstract void method450(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(III[I)V")
    public abstract void method460(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(III)V")
    public abstract void method449(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "(I)V")
    public static void method2609(int arg0) {
        field6033 = null;
        field6031 = null;
        field6034 = null;
        if (arg0 > -31) {
            field6034 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "(I)V")
    public abstract void method466(int arg0);

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6033[var2] = (float) Math.sin((double) var2 * var0);
            field6031[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
