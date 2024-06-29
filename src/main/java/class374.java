import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class374 extends class281 {

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field5405 = 0;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[[Z")
    public static boolean[][] field5404 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Ltm;")
    public static class412 field5403 = new class412();

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILor;I)V", line = 6)
    public static final void method2319(byte arg0, int arg1, class668 arg2, int arg3) {
        field5406++;
        if (class497.field6870) {
            class486 var4 = class648.field8998 == -1 ? null : class206.field2703.method3905(true, class648.field8998);
            if (client.method2022(arg2).method837(-119) && (class344.field5067 & 0x20) != 0 && (var4 == null || arg2.method3695(var4.field6728, class648.field8998, (byte) 82) != var4.field6728)) {
                class251.method1684(false, class66.field942, false, arg2.field9283, class341.field4924 + " -> " + arg2.field9397, (byte) 123, true, arg2.field9318, 8, (long) (arg2.field9318 << 0 | arg2.field9221), arg2.field9221, class678.field9483, 0L);
                class641.field8897++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class757.method4213(true, arg2, var5);
            if (var9 != null) {
                class309.field4454++;
                class251.method1684(false, var9, false, arg2.field9283, arg2.field9397, (byte) -123, true, arg2.field9318, 1001, (long) (arg2.field9318 << 0 | arg2.field9221), arg2.field9221, class773.method4283(arg2, arg0 + 60, var5), (long) (var5 + 1));
            }
        }
        if (arg0 != -61) {
            field5404 = null;
        }
        String var6 = class411.method2536(arg2, (byte) -81);
        if (var6 != null) {
            class251.method1684(false, var6, false, arg2.field9283, arg2.field9397, (byte) -86, true, arg2.field9318, 18, (long) (arg2.field9221 | arg2.field9318 << 0), arg2.field9221, arg2.field9370, 0L);
            class650.field9016++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class757.method4213(true, arg2, var7);
            if (var8 != null) {
                class309.field4454++;
                class251.method1684(false, var8, false, arg2.field9283, arg2.field9397, (byte) -103, true, arg2.field9318, 30, (long) (arg2.field9318 << 0 | arg2.field9221), arg2.field9221, class773.method4283(arg2, -1, var7), (long) (var7 + 1));
            }
        }
        if (!client.method2022(arg2).method840((byte) -70)) {
            return;
        }
        class429.field6102++;
        if (arg2.field9305 == null) {
            class251.method1684(false, class474.field6549.method2780(arg0 + 184, class38.field589), false, arg2.field9283, "", (byte) -74, true, arg2.field9318, 19, (long) (arg2.field9221 | arg2.field9318 << 0), arg2.field9221, -1, 0L);
        } else {
            class251.method1684(false, arg2.field9305, false, arg2.field9283, "", (byte) 90, true, arg2.field9318, 19, (long) (arg2.field9221 | arg2.field9318 << 0), arg2.field9221, -1, 0L);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V", line = 85)
    public class374(int arg0) {
        this.field5407 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 94)
    public static final void method2320(int arg0) {
        class692.field9714 = -1;
        class227.field3104 = 0;
        field5408++;
        class170.field2272 = -1;
        if (arg0 <= 95) {
            field5405 = -61;
        }
        class779.field10689 = -1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)Z", line = 112)
    public static final boolean method2322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5410++;
        if (arg3 != -1) {
            method2320(109);
        }
        if (arg5 < (arg0 + arg2) && arg2 < (arg5 + arg7)) {
            return arg8 < arg1 + arg4 && arg1 < arg6 + arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 132)
    public static void method2323(int arg0) {
        field5403 = null;
        field5404 = null;
        if (arg0 != 19) {
            field5404 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2321(byte arg0);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
    public abstract boolean method2324(int arg0);
}
