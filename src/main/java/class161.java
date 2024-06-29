import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class161 extends class147 {

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field2583 = 0;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Lqj;")
    public static class196 field2584 = class80.method502(":clan:", -48);

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field2585 = -1;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Z")
    public static boolean field2587 = false;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "[Z")
    public static boolean[] field2588 = new boolean[100];

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lj;")
    public static class114 field2589;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lp;II)V")
    private final void method1008(class56 arg0, int arg1, int arg2) {
        if (arg1 != -14057) {
            method1010(-91, -118, -3, 5, null, -127L, null, null);
        }
        if (arg2 == 5) {
            this.field2583 = arg0.method318(true);
        }
        field2581++;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2584 = null;
        field2589 = null;
        if (arg0 != 100) {
            method1011(8, null, 45);
        }
        field2588 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILpe;JLpe;Lpe;)V")
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, class258 arg4, long arg5, class258 arg6, class258 arg7) {
        class159 var9 = new class159();
        var9.field2567 = arg4;
        var9.field2571 = arg1 * 128 + 64;
        var9.field2566 = arg2 * 128 + 64;
        var9.field2563 = arg3;
        var9.field2570 = arg5;
        var9.field2558 = arg6;
        var9.field2553 = arg7;
        int var10 = 0;
        class61 var11 = class249.field4410[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field836; var12++) {
                class200 var13 = var11.field823[var12];
                if ((var13.field3554 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3544.method266();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2572 = -var10;
        if (class249.field4410[arg0][arg1][arg2] == null) {
            class249.field4410[arg0][arg1][arg2] = new class61(arg0, arg1, arg2);
        }
        class249.field4410[arg0][arg1][arg2].field839 = var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILbk;I)Lwi;")
    public static final class233 method1011(int arg0, class136 arg1, int arg2) {
        field2582++;
        if (arg0 != 64) {
            field2588 = null;
        }
        return class47.method251(7172, arg1, arg2) ? class16.method86(arg0 ^ 0x40) : null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lp;I)V")
    public final void method1012(class56 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method367(1);
            if (var3 == 0) {
                if (arg1 != 64) {
                    field2585 = -34;
                }
                field2586++;
                return;
            }
            this.method1008(arg0, -14057, var3);
        }
    }
}
