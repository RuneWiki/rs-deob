import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class17 {

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "J")
    public long field530 = 0L;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field529 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field537 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lud;")
    public static class279 field540 = class130.method1024("Kampfstufe: ", 255);

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "[I")
    public static int[] field536 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lsf;")
    public class108 field522;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lsf;")
    public class108 field525;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lue;")
    public static class15 field538;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLhj;)V", line = 18)
    public static final void method147(byte arg0, class29 arg1) {
        if (arg0 < 76) {
            method153(-119, true);
        }
        class163.field2943 = arg1;
        field532++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIII)V", line = 33)
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field541++;
        if (arg1 != 0) {
            return;
        }
        class261 var10 = null;
        for (class261 var11 = (class261) class268.field4806.method2248(127); var11 != null; var11 = (class261) class268.field4806.method2240(1138)) {
            if (var11.field4641 == arg3 && var11.field4646 == arg0 && var11.field4644 == arg4 && var11.field4650 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class261();
            var10.field4641 = arg3;
            var10.field4650 = arg6;
            var10.field4646 = arg0;
            var10.field4644 = arg4;
            class85.method739(var10, (byte) 78);
            class268.field4806.method2246(true, var10);
        }
        var10.field4660 = arg2;
        var10.field4661 = arg7;
        var10.field4658 = arg5;
        var10.field4655 = arg8;
        var10.field4645 = arg9;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lgn;", line = 75)
    public static final class5 method149(byte arg0) {
        if (arg0 != 83) {
            return (class5) null;
        }
        field523++;
        try {
            return (class5) Class.forName("bc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method150(boolean arg0) {
        if (!arg0) {
            class143.field2592.method1338((byte) -128);
            field539++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 106)
    public static final void method151(int arg0) {
        if (arg0 < 22) {
            return;
        }
        field534++;
        if (!class38.field848) {
            return;
        }
        class8 var1 = class103.method868(250, class236.field4107, class315.field5545);
        if (var1 != null && var1.field278 != null) {
            class23 var2 = new class23();
            var2.field596 = var1;
            var2.field608 = var1.field278;
            class279.method2017(0, var2);
        }
        class222.field3935 = -1;
        class38.field848 = false;
        class50.method426(var1, false);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V", line = 137)
    public static final void method152(boolean arg0) {
        class52.field1087 = null;
        class306.field5434 = null;
        class306.field5436 = null;
        class51.field1051 = null;
        if (!arg0) {
            class179.field3241 = null;
            field524++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)Lfg;", line = 167)
    public static final class211 method153(int arg0, boolean arg1) {
        if (!arg1) {
            field540 = (class279) null;
        }
        field535++;
        class211 var2 = (class211) class248.field4407.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        class211 var3 = class253.method1812(class190.field3429, false, class315.field5549, 255, arg0);
        if (var3 != null) {
            class248.field4407.method1331(var3, 30237, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 189)
    public static void method154(int arg0) {
        field529 = null;
        field540 = null;
        field538 = null;
        field536 = null;
        if (arg0 != -9918) {
            field536 = (int[]) null;
        }
    }
}
