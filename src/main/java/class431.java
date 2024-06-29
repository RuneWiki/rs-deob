import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class431 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lgo;Lya;I)V")
    public static final void method2544(class310 arg0, class11 arg1, int arg2) {
        field6398++;
        boolean var3 = class164.field2437.method1753(arg0.field4685, arg0.field4665, arg0.field4662 | 0xFF000000, arg0.field4677, arg0.field4758, arg1, arg0.field4652 ? class410.field6198.field7104 : null, false) == null;
        if (arg2 != 21917) {
            field6399 = 78;
        }
        if (var3) {
            class261.field3906.method2958(new class201(arg0.field4665, arg0.field4677, arg0.field4758, arg0.field4662 | 0xFF000000, arg0.field4685, arg0.field4652), (byte) 71);
            class292.method1812(-14307, arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method2545(int arg0) {
        class214.field3053.method3056(true);
        if (arg0 <= -72) {
            field6392++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
    public static final void method2546(boolean arg0, int arg1) {
        field6397++;
        if (!class250.method1495(arg0, arg1)) {
            return;
        }
        class310[] var2 = class174.field2549[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            if (var4 != null) {
                var4.field4641 = 0;
                var4.field4710 = 0;
                var4.field4739 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
    public static final boolean method2547(int arg0, int arg1) {
        if (arg0 != 2) {
            method2544(null, null, -64);
        }
        field6394++;
        return arg1 == 2 || arg1 == 4 || arg1 == 5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6395++;
        int var8 = arg5 - arg3;
        int var9 = arg3 + arg6;
        for (int var10 = arg6; var10 < var9; var10++) {
            class94.method740(class306.field4574[var10], arg7, arg1, arg0, false);
        }
        if (arg2 != 1538822376) {
            field6396 = -83;
        }
        for (int var11 = arg5; var11 > var8; var11--) {
            class94.method740(class306.field4574[var11], arg7, arg1, arg0, false);
        }
        int var12 = arg3 + arg7;
        int var13 = arg1 - arg3;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class306.field4574[var14];
            class94.method740(var15, arg7, var12, arg0, false);
            class94.method740(var15, var12, var13, arg4, false);
            class94.method740(var15, var13, arg1, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
    public static final void method2549(int arg0, byte arg1, int arg2) {
        field6400++;
        int var3 = class342.field5252.method2599(class227.field3205.method2103(class30.field430, (byte) 34), (byte) 66);
        for (class477 var4 = (class477) class154.field2334.method2957(-74); var4 != null; var4 = (class477) class154.field2334.method2947(53)) {
            int var8 = class78.method565(270664672, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class448.field6610 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (var3 + var6 > class155.field2347) {
            var6 = class155.field2347 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class413.field6241 < arg2 + var5) {
            var7 = class413.field6241 - var5;
        }
        if (arg1 > -12) {
            field6399 = 105;
        }
        class148.field2227 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class274.field4094 = var7;
        class88.field1383 = var3;
        class27.field396 = (class56.field774 ? 26 : 22) + class448.field6610 * 16;
        class495.field7350 = true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
    public static final int method2550(int arg0, byte arg1) {
        if (arg1 >= -125) {
            field6396 = -45;
        }
        field6393++;
        return arg0 >>> 7;
    }
}
