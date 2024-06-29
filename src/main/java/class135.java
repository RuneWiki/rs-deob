import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class135 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[J")
    public static long[] field2393 = new long[200];

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field2388 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lrg;")
    public static class84 field2387 = new class84();

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method981(byte arg0) {
        field2389++;
        if (class67.field1102 > 0) {
            class244.method1591((byte) -120);
            return;
        }
        class171.field2984 = class52.field866;
        class52.field866 = null;
        if (arg0 == 29) {
            class265.method1746((byte) -52, 40);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static void method982(byte arg0) {
        field2393 = null;
        field2387 = null;
        if (arg0 != -41) {
            field2388 = 84;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2391++;
        int var7 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg5);
        int var8 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg0);
        int var9 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg2);
        int var10 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4);
        int var11 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg3 + arg5);
        int var12 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg0 - arg3);
        for (int var13 = var7; var13 < var11; var13++) {
            class36.method216(class19.field280[var13], var9, arg1, -120, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class36.method216(class19.field280[var14], var9, arg1, -122, var10);
        }
        if (arg6 != 32663) {
            field2393 = null;
        }
        int var15 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg2 + arg3);
        int var16 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 - arg3);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class19.field280[var17];
            class36.method216(var18, var9, arg1, -116, var15);
            class36.method216(var18, var16, arg1, arg6 - 32780, var10);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method984(int arg0) {
        class201.field3447.method1865(arg0 - 7193);
        field2392++;
        class4.field54.method1279((byte) -29);
        class174.field3011.method1279((byte) -29);
        if (arg0 != 7278) {
            method984(84);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 23284) {
            method984(8);
        }
        if (arg3 < arg1) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class19.field280[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class19.field280[var6][arg4] = arg2;
            }
        }
        field2390++;
    }
}
