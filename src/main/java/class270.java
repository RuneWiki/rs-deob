import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class270 extends class242 {

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Lhb;")
    public static class250 field3425 = new class250(6, 6);

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Ldn;")
    public static class201 field3423;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[Lf;")
    public static class404[] field3427;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIJ)V")
    public static final void method1663(int arg0, int arg1, int arg2, long arg3) {
        field3426++;
        if (arg0 != 7026) {
            field3423 = null;
        }
        int var5 = ((int) arg3 & 0x7DD3E) >> 14;
        int var6 = ((int) arg3 & 0x372BD9) >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class411.method2431(0, var6, true, 0, -1, arg2, arg1, 0, var5);
            return;
        }
        class402 var8 = class52.field715.method1164(var7, 0);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5340;
            var9 = var8.field5396;
        } else {
            var9 = var8.field5340;
            var10 = var8.field5396;
        }
        int var11 = var8.field5362;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class411.method2431(var9, 0, true, var10, -1, arg2, arg1, var11, 0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method1664(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3419++;
        if (arg3 < 128 || arg2 < 128 || arg3 > (class200.field2594 - 2) * 128 || arg2 > (class118.field1647 - 2) * 128) {
            class267.field3388[0] = class267.field3388[1] = -1;
            return;
        }
        int var10 = class366.method2145(arg4, (byte) 99, arg3, arg2) - arg8;
        class168.field2199.method993(arg6, 0, 0);
        class512.field7538.method829(class168.field2199);
        class512.field7538.method855(arg3, var10, arg2, class267.field3388);
        class168.field2199.method993(-arg6, 0, 0);
        class512.field7538.method829(class168.field2199);
        if (!arg0) {
            field3425 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
    public static void method1665(boolean arg0) {
        field3423 = null;
        if (!arg0) {
            method1665(false);
        }
        field3427 = null;
        field3425 = null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIII)V")
    public class270(int arg0, int arg1, int arg2, int arg3) {
        this.field3420 = arg2;
        this.field3421 = arg0;
        this.field3422 = arg1;
        this.field3424 = arg3;
    }
}
