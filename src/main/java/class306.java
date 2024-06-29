import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class306 extends class47 {

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field3873;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "[[I")
    public static int[][] field3877 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lxa;")
    public static class468[] field3871;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method285(byte arg0) {
        if (arg0 < 45) {
            field3871 = null;
        }
        field3875++;
        return this.field3873;
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
    public static final void method1820(int arg0) {
        if (arg0 <= 17) {
            return;
        }
        field3872++;
        class148.field1765 = 0;
        int var1 = (class67.field815.field8018 >> 9) + class227.field2938;
        int var2 = (class67.field815.field8011 >> 9) + class522.field6612;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class148.field1765 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class148.field1765 = 1;
        }
        if (class148.field1765 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class148.field1765 = 0;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3874++;
        int var7 = arg3 + arg1;
        int var8 = arg6 - arg1;
        for (int var9 = arg3; var9 < var7; var9++) {
            class390.method2223(arg2, arg0, class30.field364[var9], (byte) -70, arg4);
        }
        for (int var10 = arg6; var10 > var8; var10--) {
            class390.method2223(arg2, arg0, class30.field364[var10], (byte) -125, arg4);
        }
        int var11 = arg1 + arg2;
        if (arg5 != 6) {
            method1822(-25);
        }
        int var12 = arg4 - arg1;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class30.field364[var13];
            class390.method2223(arg2, arg0, var14, (byte) -87, var11);
            class390.method2223(var12, arg0, var14, (byte) -99, arg4);
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field3877 = null;
        if (arg0 != -2830) {
            method1822(119);
        }
        field3871 = null;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        if (arg0 != -23906) {
            this.method287(78);
        }
        field3876++;
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class306(Object arg0, int arg1) {
        super(arg1);
        this.field3873 = arg0;
    }
}
