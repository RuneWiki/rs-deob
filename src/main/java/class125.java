import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class125 extends class213 {

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public int field2388 = 0;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field2386 = -1;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field2389 = -1;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lsg;")
    public static class195 field2391;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILka;)V")
    public final void method790(int arg0, class109 arg1) {
        field2383++;
        while (true) {
            int var3 = arg1.method662((byte) -86);
            if (var3 == 0) {
                if (arg0 == -25007) {
                    return;
                } else {
                    field2387 = 68;
                    return;
                }
            }
            this.method792(arg1, var3, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lvd;I)I")
    public static final int method791(class222 arg0, int arg1) {
        if (arg1 != 1) {
            field2387 = -11;
        }
        field2381++;
        return arg0.method1444(-12) + 1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lka;IB)V")
    private final void method792(class109 arg0, int arg1, byte arg2) {
        if (arg1 == 2) {
            this.field2388 = arg0.method675(2);
        }
        if (arg2 != -65) {
            method796(11, 39);
        }
        field2385++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 - arg6;
        field2382++;
        int var8 = arg0 + arg6;
        int var9 = arg1 + arg6;
        for (int var10 = arg0; var10 < var8; var10++) {
            class81.method532(arg1, arg4, class156.field2981[var10], arg2, -7);
        }
        int var11 = arg2 - arg6;
        int var12 = arg3;
        if (arg5 != 0) {
            method795(-23, -26, 55, 78, 76);
        }
        while (var7 < var12) {
            class81.method532(arg1, arg4, class156.field2981[var12], arg2, -7);
            var12--;
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class156.field2981[var13];
            class81.method532(arg1, arg4, var14, var9, arg5 ^ 0xFFFFFFF9);
            class81.method532(var11, arg4, var14, arg2, arg5 ^ 0xFFFFFFF9);
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V")
    public static void method794(int arg0) {
        field2391 = null;
        if (arg0 != -105) {
            method793(-105, 30, -67, -112, -12, -118, -50);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        if (arg3 != -1) {
            method793(120, 120, -51, 117, -106, -67, 73);
        }
        while (var5 <= arg0 + arg2) {
            for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class37.field810[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class176.field3295[0][var6][var5] = class176.field3295[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class176.field3295[0][var6][var5] = class176.field3295[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class176.field3295[0][var6][var5] = class176.field3295[0][var6][var5 - 1];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class176.field3295[0][var6][var5] = class176.field3295[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
        field2390++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Z")
    public static final boolean method796(int arg0, int arg1) {
        if (arg1 != -1) {
            method795(-55, 10, 57, -101, -80);
        }
        field2384++;
        return (arg0 >> 30 & 0x1) != 0;
    }
}
