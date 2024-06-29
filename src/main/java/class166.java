import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class166 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
    public static int[] field2595 = new int[25];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public static boolean field2599 = false;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "S")
    public static short field2594 = 256;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[J")
    public static long[] field2596 = new long[100];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
    public long field2603;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lek;")
    public class166 field2602;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lek;")
    public class166 field2608;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1118(byte arg0) {
        if (arg0 < 107) {
            method1121(54);
        }
        field2595 = null;
        field2596 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public static final void method1119(int arg0, int arg1) {
        class190.field2945.method1897(true, arg0);
        class47.field677.method1897(true, arg0);
        field2606++;
        if (arg1 != 2) {
            field2595 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public static final void method1120(byte arg0) {
        field2600++;
        try {
            if (arg0 != 33) {
                method1118((byte) -29);
            }
            if (class253.field4061 == 1) {
                int var1 = class6.field122.method54((byte) -57);
                if (var1 > 0 && class6.field122.method35((byte) -18)) {
                    int var2 = var1 - class240.field3908;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class6.field122.method53(var2, (byte) 121);
                } else {
                    class6.field122.method37((byte) -96);
                    class6.field122.method56((byte) 99);
                    class213.field3315 = null;
                    if (class205.field3198 == null) {
                        class253.field4061 = 0;
                    } else {
                        class253.field4061 = 2;
                    }
                    class263.field4174 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class6.field122.method37((byte) -96);
            class253.field4061 = 0;
            class263.field4174 = null;
            class205.field3198 = null;
            class213.field3315 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method1121(int arg0) {
        field2597++;
        class278.field4408 = 0;
        int var1 = (class283.field4473.field2240 >> 7) + class46.field656;
        int var2 = (class283.field4473.field2278 >> 7) + class260.field4162;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class278.field4408 = 1;
        }
        if (arg0 != -13172) {
            field2595 = null;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class278.field4408 = 1;
        }
        if (class278.field4408 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class278.field4408 = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z")
    public final boolean method1122(byte arg0) {
        field2607++;
        if (arg0 > -42) {
            return false;
        } else {
            return this.field2602 != null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method1123(int arg0) {
        field2605++;
        if (this.field2602 == null) {
            return;
        }
        this.field2602.field2608 = this.field2608;
        if (arg0 != 0) {
            method1119(114, -29);
        }
        this.field2608.field2602 = this.field2602;
        this.field2608 = null;
        this.field2602 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z[IIII)V")
    public static final void method1124(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field2593++;
        arg4--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
        if (!arg0) {
            field2596 = null;
        }
    }
}
