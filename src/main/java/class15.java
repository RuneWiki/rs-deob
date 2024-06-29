import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class15 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lwo;")
    public static class285 field177;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "[[I")
    public static int[][] field180;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Lg;")
    public static final class366 method85(int arg0, int arg1, int arg2) {
        field178++;
        class366 var3 = new class366();
        var3.field4999 = arg2 + 5 + 1;
        var3.field4992 = arg1;
        var3.field4982 = -1;
        var3.field4981 = arg0 + 6;
        var3.field4977 = new int[var3.field4999][var3.field4981];
        var3.method2313(arg1 - 43);
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method86(int arg0) {
        field180 = null;
        field177 = null;
        if (arg0 < 73) {
            field180 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZB)V")
    public static final void method87(boolean arg0, byte arg1) {
        field176++;
        int[] var2 = null;
        byte[][] var3;
        byte var4;
        if (arg0) {
            var3 = class31.field345;
            var4 = 1;
        } else {
            var3 = class126.field1411;
            var4 = 4;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class94.method589(-123);
            for (int var6 = 0; var6 < (class22.field232 >> 3); var6++) {
                for (int var7 = 0; var7 < class196.field2329 >> 3; var7++) {
                    boolean var8 = false;
                    int var9 = class225.field2848[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3C32E87) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFF) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class358.field4867.length; var15++) {
                                if (class358.field4867[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class320.method2000(var3[var15], var6 * 8, class156.field1815, var10, var12, var5, arg0, var13, class267.field3454, arg1 - 101, var11, var7 * 8);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class80.method506(var7 * 8, 8, arg1 + 57, var5, var6 * 8, 8);
                    }
                }
            }
        }
        if (arg1 != 47) {
            field177 = null;
        }
        if (var2 == null) {
            class451.field6298 = null;
        } else {
            class451.field6298 = class450.method2785(var2[3], var2[2], (byte) 15, var2[0], var2[1]);
            class190.field2231 = var2[4];
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static final void method88(int arg0) {
        if (arg0 != -1) {
            method85(113, 84, 103);
        }
        class365 var1 = class287.field3780;
        synchronized (class287.field3780) {
            class287.field3780.method2290(13831);
        }
        field179++;
    }
}
