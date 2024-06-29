import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public abstract class class591 {

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "[I")
    public static int[] field8390 = new int[16];

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "[I")
    public static int[] field8389 = new int[3];

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Z")
    public abstract boolean method1515(int arg0, int arg1);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method3448(int arg0) {
        field8390 = null;
        if (arg0 <= 24) {
            field8389 = null;
        }
        field8389 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIII)V")
    public static final void method3449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8393++;
        if (arg2 != 14380) {
            return;
        }
        if (arg4 >= class576.field8218 && class340.field5510 >= arg3 && arg0 >= class545.field7931 && arg5 <= class585.field8331) {
            class344.method2341(arg3, -94, arg0, arg5, arg4, arg1);
        } else {
            class42.method527(arg1, arg0, arg4, arg5, arg3, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public static final void method3450(int arg0) {
        field8391++;
        if (class255.field4056 != null && arg0 == 0) {
            class204.field3327 = new class473();
            class204.field3327.method2938(class255.field4056.field9634, class255.field4056, class226.field3639, arg0 - 24436, class255.field4056.field9637.method1091(class135.field2206, 1));
            class89.field1078 = new Thread(class204.field3327, "");
            class89.field1078.start();
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(JIII)V")
    public static final void method3451(long arg0, int arg1, int arg2, int arg3) {
        field8394++;
        int var5 = ((int) arg0 & 0x7E36A) >> 14;
        if (arg3 != -23874) {
            field8389 = null;
        }
        int var6 = ((int) arg0 & 0x316F6D) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class388.method2522(arg1, 0, arg2, 0, var6, var5, (byte) 31, 0, true);
            return;
        }
        class698 var8 = class213.field3537.method94(var7, (byte) -42);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field9829;
            var10 = var8.field9851;
        } else {
            var9 = var8.field9851;
            var10 = var8.field9829;
        }
        int var11 = var8.field9819;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class388.method2522(arg1, var9, arg2, var10, 0, 0, (byte) 31, var11, true);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Lvc;")
    public abstract class291 method1518(boolean arg0);

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V")
    public abstract void method1517(boolean arg0);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public abstract void method1510(byte arg0);
}
