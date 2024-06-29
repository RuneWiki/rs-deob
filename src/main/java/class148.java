import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class148 extends class9 {

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!tba", name = "E", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!tba", name = "G", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!tba", name = "A", descriptor = "[[Lgfa;")
    public static class697[][] field2552;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        ++field2554;
        if (arg0 < 68) {
            field2552 = null;
        }
        class394.field5759 = null;
        class361.field5363 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIII)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3) {
        super.field541 = arg0;
        if (arg2 != -1) {
            method1173(59);
        }
        super.field542 = arg1;
        ++field2558;
        super.field547 = arg3;
    }

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field2552 = null;
        int var1 = -12 % ((arg0 - 60) / 51);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[[BLdw;)V")
    public static final void method1175(boolean arg0, byte[][] arg1, class669 arg2) {
        ++field2555;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~var4 > ~arg2.field2258; ++var4) {
            class418.method2539(false);
            for (int var5 = 0; var5 < class675.field9604 >> 3; ++var5) {
                for (int var6 = 0; ~(class218.field3316 >> 3) < ~var6; ++var6) {
                    int var7 = class674.field9598[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = 3 & var7 >> 24;
                        if (!arg2.field2265 || ~var8 == -1) {
                            int var9 = (var7 & 6) >> 1;
                            int var10 = (var7 & 16776204) >> 14;
                            int var11 = (16377 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; ~var13 > ~class335.field5019.length; ++var13) {
                                if (class335.field5019[var13] == var12 && arg1[var13] != null) {
                                    class61 var14 = new class61(arg1[var13]);
                                    arg2.method1071(class223.field3352, var6 * 8, var14, var8, var9, var11, -116, var10, var4, var5 * 8);
                                    arg2.method3784(var6 * 8, var10, var8, class623.field9017, 4, var3[0] == -1 ? var3 : null, var11, var14, var5 * 8, var9, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            field2557 = -88;
        }
        if (~var3[0] != 0) {
            class2.field378 = class475.field6813.method1516(var3[3], var3[2], var3[1], 75, var3[0], class92.field1672);
            class124.field2246 = var3[4];
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
    public static final void method1176(byte arg0) {
        class287 var1 = class395.field5768;
        synchronized (class395.field5768) {
            if (arg0 != -30) {
                return;
            }
            class395.field5768.method1912(-2552);
        }
        ++field2553;
        class287 var2 = class319.field4696;
        synchronized (class319.field4696) {
            class319.field4696.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(FB)V")
    public final void method268(float arg0, byte arg1) {
        if (arg1 >= -89) {
            field2552 = null;
        }
        ++field2556;
        super.field549 = arg0;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(IIIIIF)V")
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
