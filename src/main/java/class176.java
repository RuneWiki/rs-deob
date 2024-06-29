import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class176 extends class451 {

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field2559 = 0;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Ljp;")
    public static class236 field2561;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field2566;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Lff;")
    public static class9 field2565;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIII)V")
    public final void method169(byte arg0, int arg1, int arg2, int arg3) {
        super.field6131 = arg2;
        if (arg0 >= 99) {
            ++field2557;
            super.field6130 = arg3;
            super.field6132 = arg1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field2565 = null;
        field2566 = null;
        if (arg0 != 8) {
            method1180(-85, 112, -39, 8, 41, -74, -82, 63);
        }
        field2561 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
    public static final void method1178(boolean arg0) {
        class305[] var1 = class76.field1133;
        synchronized (class76.field1133) {
            for (int var2 = 0; var2 < class76.field1133.length; ++var2) {
                class76.field1133[var2] = new class305();
                class257.field3383[var2] = 0;
            }
            if (!arg0) {
                method1180(-96, 31, 98, 24, 24, -4, -63, -110);
            }
        }
        ++field2556;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)V")
    public static final void method1179(byte arg0, int arg1) {
        if (arg0 != 103) {
            field2559 = -84;
        }
        class226.field3052 = 1000 / arg1;
        ++field2560;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIF)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2558;
        int var8 = -arg0 + arg6;
        int var9 = arg0 + arg7;
        for (int var10 = arg7; ~var9 < ~var10; ++var10) {
            class427.method2465(class457.field6299[var10], arg4, arg3, -7, arg1);
        }
        for (int var11 = arg6; var8 < var11; --var11) {
            class427.method2465(class457.field6299[var11], arg4, arg3, -7, arg1);
        }
        int var12 = arg0 + arg3;
        int var13 = -arg0 + arg4;
        if (arg2 != 200) {
            method1180(97, -91, 103, 92, 24, -27, -31, -29);
        }
        for (int var14 = var9; ~var8 <= ~var14; ++var14) {
            int[] var15 = class457.field6299[var14];
            class427.method2465(var15, var12, arg3, -7, arg1);
            class427.method2465(var15, var13, var12, -7, arg5);
            class427.method2465(var15, arg4, var13, -7, arg1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IF)V")
    public final void method170(int arg0, float arg1) {
        ++field2562;
        super.field6136 = arg1;
        if (arg0 < 17) {
            method1180(124, -86, 55, -103, -116, 66, 83, -81);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1181(String arg0, boolean arg1) {
        if (class390.field5283 == null) {
            class351.method2055(false);
        }
        ++field2563;
        String[] var2 = class482.method2781(arg0, -22005, '\n');
        for (int var3 = 0; var2.length > var3; ++var3) {
            for (int var4 = class141.field2042; ~var4 < -1; --var4) {
                class390.field5283[var4] = class390.field5283[var4 - 1];
            }
            class390.field5283[0] = var2[var3];
            if (class390.field5283.length + -1 > class141.field2042) {
                ++class141.field2042;
                if (class53.field834 > 0) {
                    ++class53.field834;
                }
            }
        }
        if (arg1) {
            field2561 = null;
        }
    }

    static {
        new class304("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field2561 = new class236(8);
        new class304(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field2566 = new String[200];
        field2565 = new class9(94, 8);
    }
}
