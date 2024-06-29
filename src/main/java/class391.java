import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class391 {

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "[I")
    public static int[] field5650 = new int[14];

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "Lmw;")
    public static class517 field5648 = new class517(29, 2);

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "[I")
    public static int[] field5651 = new int[14];

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIBIII)V", line = 5)
    public static final void method2414(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5652++;
        int var7 = class269.method1790(arg6, class233.field3099, class291.field4156, 13094);
        int var8 = class269.method1790(arg1, class233.field3099, class291.field4156, 13094);
        int var9 = class269.method1790(arg2, class45.field472, class297.field4199, 13094);
        int var10 = class269.method1790(arg5, class45.field472, class297.field4199, 13094);
        int var11 = class269.method1790(arg4 + arg6, class233.field3099, class291.field4156, 13094);
        int var12 = class269.method1790(arg1 - arg4, class233.field3099, class291.field4156, 13094);
        for (int var13 = var7; var13 < var11; var13++) {
            class464.method2733(arg0, var9, var10, -22816, class228.field2951[var13]);
        }
        if (arg3 >= -48) {
            field5651 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class464.method2733(arg0, var9, var10, -22816, class228.field2951[var14]);
        }
        int var15 = class269.method1790(arg2 + arg4, class45.field472, class297.field4199, 13094);
        int var16 = class269.method1790(arg5 - arg4, class45.field472, class297.field4199, 13094);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class228.field2951[var17];
            class464.method2733(arg0, var9, var15, -22816, var18);
            class464.method2733(arg0, var16, var10, -22816, var18);
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Z)V", line = 57)
    public static final void method2415(boolean arg0) {
        class770.field10602 = 0;
        class628.field8508 = 0;
        class336.field4733++;
        field5649++;
        class422.method2543(-4);
        class45.method297(2);
        class175.method1208(1);
        boolean var1 = false;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < class628.field8508; var2++) {
            int var5 = class270.field3943[var2];
            class316 var6 = (class316) class176.field2326.method1248(115, (long) var5);
            class22 var7 = var6.field4455;
            if (class677.field9075 && class661.method3660(127, var5)) {
                class469.method2748((byte) 127);
            }
            if (class336.field4733 != var7.field6141) {
                if (var7.field217.method1963(0)) {
                    class487.method2846(var7, -12);
                }
                var7.method132((byte) -125, null);
                var1 = true;
                var6.method1102((byte) 102);
            }
        }
        if (var1) {
            class181.field2380 = class176.field2326.method1245((byte) 124);
            class176.field2326.method1242(class110.field1528, -1);
        }
        if (class442.field6366 != class560.field7678.field3725) {
            throw new RuntimeException("gnp1 pos:" + class560.field7678.field3725 + " psize:" + class442.field6366);
        }
        for (int var3 = 0; var3 < class178.field2352; var3++) {
            if (class176.field2326.method1248(95, (long) class245.field3206[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class178.field2352);
            }
        }
        if (class181.field2380 - class178.field2352 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class181.field2380 - class178.field2352));
        }
        for (int var4 = 0; var4 < class181.field2380; var4++) {
            if (class336.field4733 != class110.field1528[var4].field4455.field6141) {
                throw new RuntimeException("gnp4 uk:" + class110.field1528[var4].field4455.field6146);
            }
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)V", line = 147)
    public static void method2416(byte arg0) {
        field5651 = null;
        field5650 = null;
        field5648 = null;
        if (arg0 != 76) {
            field5648 = null;
        }
    }
}
