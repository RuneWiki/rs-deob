import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class470 {

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "S")
    public short field6491;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "B")
    public byte field6488;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Leq;")
    public class194 field6485;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "B")
    public byte field6484;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field6489 = 0;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)V")
    public static final void method2658(int arg0, int arg1, int arg2, int arg3) {
        field6486++;
        if (arg0 >= -59) {
            field6489 = 7;
        }
        class51 var4 = class703.method3938(-1989279584, arg3, 9);
        var4.method402((byte) 67);
        var4.field603 = arg2;
        var4.field605 = arg1;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static final void method2659(int arg0) {
        field6490++;
        if (class366.field4875.method541(class503.field6917, 1) != 2) {
            return;
        }
        byte var1 = (byte) (class241.field3299 - 4 & 0xFF);
        int var2 = class241.field3299 % class401.field5620;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var19 = 0; var19 < class257.field3508; var19++) {
                class468.field6439[var3][var2][var19] = var1;
            }
        }
        if (class367.field4944 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class338.field4528[var4] = -1000000;
            class606.field8430[var4] = 1000000;
            class287.field3953[var4] = 0;
            class360.field4760[var4] = 1000000;
            class185.field2691[var4] = 0;
        }
        int var5 = -86 % ((arg0 - 8) / 60);
        int var6 = class143.field2063.field4042;
        int var7 = class143.field2063.field4047;
        if (class203.field2863 != 1 && class199.field2832 == -1) {
            int var8 = class249.method1533(class367.field4944, class11.field114, class666.field9335, -128);
            if ((var8 - class441.field6102) < 3200 && (class492.field6720[class367.field4944][class666.field9335 >> 9][class11.field114 >> 9] & 0x4) != 0) {
                class605.method3401(-1, class666.field9335 >> 9, false, class295.field4051, 1, class11.field114 >> 9);
                return;
            }
            return;
        }
        if (class203.field2863 != 1) {
            var7 = class560.field7547;
            var6 = class199.field2832;
        }
        if ((class492.field6720[class367.field4944][var6 >> 9][var7 >> 9] & 0x4) != 0) {
            class605.method3401(-1, var6 >> 9, false, class295.field4051, 0, var7 >> 9);
        }
        if (class685.field9771 >= 2560) {
            return;
        }
        int var9 = class666.field9335 >> 9;
        int var10 = class11.field114 >> 9;
        int var11 = var6 >> 9;
        int var12 = var7 >> 9;
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        int var14;
        if (var10 >= var12) {
            var14 = var10 - var12;
        } else {
            var14 = var12 - var10;
        }
        if (var13 == 0 && var14 == 0 || (-class401.field5620) >= var13 || class401.field5620 <= var13 || (-class257.field3508) >= var14 || class257.field3508 <= var14) {
            class413.method2400("RC: " + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class498.field6774 + "," + class613.field8555, null, (byte) -116);
            return;
        }
        if (var14 < var13) {
            int var15 = var14 * 65536 / var13;
            int var16 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class492.field6720[class367.field4944][var9][var10] & 0x4) != 0) {
                    class605.method3401(-1, var9, false, class295.field4051, 1, var10);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var12 > var10) {
                        var10++;
                    } else if (var12 < var10) {
                        var10--;
                    }
                    if ((class492.field6720[class367.field4944][var9][var10] & 0x4) != 0) {
                        class605.method3401(-1, var9, false, class295.field4051, 1, var10);
                        return;
                    }
                }
            }
            return;
        }
        int var17 = var13 * 65536 / var14;
        int var18 = 32768;
        while (var10 != var12) {
            if (var10 < var12) {
                var10++;
            } else if (var12 < var10) {
                var10--;
            }
            if ((class492.field6720[class367.field4944][var9][var10] & 0x4) != 0) {
                class605.method3401(-1, var9, false, class295.field4051, 1, var10);
                return;
            }
            var18 += var17;
            if (var18 >= 65536) {
                var18 -= 65536;
                if (var11 > var9) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class492.field6720[class367.field4944][var9][var10] & 0x4) != 0) {
                    class605.method3401(-1, var9, false, class295.field4051, 1, var10);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[IBI)V")
    public static final void method2660(int arg0, int arg1, int[] arg2, byte arg3, int arg4) {
        arg0--;
        field6487++;
        if (arg3 != 11) {
            method2660(-67, 98, null, (byte) -17, 19);
        }
        int var8 = arg1 - 1;
        int var5 = var8 - 7;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg2[var6] = arg4;
            int var7 = var6 + 1;
            arg2[var7] = arg4;
            int var9 = var7 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var11 = var10 + 1;
            arg2[var11] = arg4;
            int var12 = var11 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg0 = var13 + 1;
            arg2[arg0] = arg4;
        }
        while (arg0 < var8) {
            arg0++;
            arg2[arg0] = arg4;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Leq;III)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3) {
        this.field6491 = (short) arg1;
        this.field6488 = (byte) arg3;
        this.field6485 = arg0;
        this.field6484 = (byte) arg2;
    }
}
