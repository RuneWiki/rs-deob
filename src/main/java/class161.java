import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public abstract class class161 {

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "F")
    public static float field2491;

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "F")
    public static float field2493;

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ija", name = "e", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ija", name = "d", descriptor = "Lgga;")
    public static class513 field2494;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IIII[BI)Z", line = 4)
    public static final boolean method1228(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field2495++;
        int var6 = 120 % ((arg0 - 62) / 40);
        boolean var7 = true;
        class431 var8 = new class431(arg4);
        int var9 = -1;
        label70: while (true) {
            int var10 = var8.method2522(-890248784);
            if (var10 == 0) {
                return var7;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                int var16;
                class416 var19;
                do {
                    int var17;
                    int var18;
                    do {
                        do {
                            do {
                                do {
                                    while (var12) {
                                        int var20 = var8.method2527((byte) -24);
                                        if (var20 == 0) {
                                            continue label70;
                                        }
                                        var8.method2557(14929);
                                    }
                                    int var13 = var8.method2527((byte) -24);
                                    if (var13 == 0) {
                                        continue label70;
                                    }
                                    var11 += var13 - 1;
                                    int var14 = var11 & 0x3F;
                                    int var15 = (var11 & 0xFF3) >> 6;
                                    var16 = var8.method2557(14929) >> 2;
                                    var17 = arg3 + var15;
                                    var18 = arg2 + var14;
                                } while (var17 <= 0);
                            } while (var18 <= 0);
                        } while ((arg1 - 1) <= var17);
                    } while (var18 >= (arg5 - 1));
                    var19 = class312.field4418.method369((byte) 125, var9);
                } while (var16 == 22 && class420.field5820.field9479.method288(17539) == 0 && var19.field5754 == 0 && var19.field5693 != 1 && !var19.field5783);
                if (!var19.method2444(124)) {
                    var7 = false;
                    class472.field6427++;
                }
                var12 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)Z", line = 90)
    public static final boolean method1229(int arg0, int arg1, int arg2) {
        field2492++;
        return arg2 == -1 ? class419.method2477(arg0, arg1, (byte) 43) & class317.method1928(arg1, arg0, 29381) : true;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V", line = 105)
    public static void method1230(int arg0) {
        int var1 = 80 % ((arg0 + 44) / 47);
        field2494 = null;
    }
}
