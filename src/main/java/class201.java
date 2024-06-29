import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class201 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lrh;")
    public static class275 field2949 = new class275(6, 0, 4, 2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1446(int arg0, byte arg1) {
        class772.field10654.method2366(arg0, arg1 ^ 0xFFFFFFB0);
        if (arg1 != -51) {
            method1447(9);
        }
        field2945++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1447(int arg0) {
        if (arg0 > -77) {
            return;
        }
        field2948++;
        class310[] var1 = class683.field9701;
        synchronized (class683.field9701) {
            for (int var2 = 0; var2 < class683.field9701.length; var2++) {
                class683.field9701[var2] = new class310();
                class520.field7436[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V", line = 43)
    public static final void method1448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2944++;
        if (arg5 != 0) {
            field2949 = null;
        }
        int var8 = class387.method2374(arg5 + 1, arg6, class738.field10297, class414.field5846);
        int var9 = class387.method2374(1, arg1, class738.field10297, class414.field5846);
        int var10 = class387.method2374(1, arg0, class450.field6463, class285.field4372);
        int var11 = class387.method2374(1, arg4, class450.field6463, class285.field4372);
        int var12 = class387.method2374(1, arg2 + arg6, class738.field10297, class414.field5846);
        int var13 = class387.method2374(1, arg1 - arg2, class738.field10297, class414.field5846);
        for (int var14 = var8; var14 < var12; var14++) {
            class382.method2347(var10, class347.field5087[var14], arg7, 7, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class382.method2347(var10, class347.field5087[var15], arg7, 7, var11);
        }
        int var16 = class387.method2374(1, arg0 + arg2, class450.field6463, class285.field4372);
        int var17 = class387.method2374(arg5 ^ 0x1, arg4 - arg2, class450.field6463, class285.field4372);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class347.field5087[var18];
            class382.method2347(var10, var19, arg7, arg5 ^ 0x7, var16);
            class382.method2347(var16, var19, arg3, arg5 + 7, var17);
            class382.method2347(var17, var19, arg7, 7, var11);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 99)
    public static void method1449(byte arg0) {
        if (arg0 == -13) {
            field2949 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lda;)V", line = 109)
    public static final void method1450(class67 arg0) {
        class220.field3134 = arg0;
    }
}
