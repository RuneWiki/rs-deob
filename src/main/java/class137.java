import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class137 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[[S")
    public static short[][] field1995;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field1995 = null;
        if (arg0 != -66) {
            method933(-94, (class297) null, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public static final void method932(int arg0, int arg1, int arg2) {
        if (~class133.field1954 == arg2) {
            class205.field3074 = arg1;
            class254.field3919 = arg0;
        }
        class89.field1349 = (float) arg1;
        class281.field4313 = (float) arg0;
        field1994++;
        class82.method642(arg2 + 10347);
        class36.field641 = true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjk;B)I")
    public static final int method933(int arg0, class297 arg1, byte arg2) {
        field1991++;
        if (arg1.field4666 == null || arg0 >= arg1.field4666.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field4666[arg0];
            if (arg2 >= 0) {
                method932(-51, 115, 3);
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class259.field3967[var3[var4++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class202.field3053[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class102.field1502[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class297 var12 = class151.method1023(-30464, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class140.method951((byte) -94, var13).field286 || class244.field3781)) {
                        for (int var14 = 0; var14 < var12.field4529.length; var14++) {
                            if ((var13 + 1) == var12.field4529[var14]) {
                                var8 += var12.field4654[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class166.field2447[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class55.field939[class202.field3053[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class166.field2447[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class185.field2687.field3485;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class33.field585[var15]) {
                            var8 += class202.field3053[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class297 var18 = class151.method1023(-30464, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class140.method951((byte) -94, var19).field286 || class244.field3781)) {
                        for (int var20 = 0; var20 < var18.field4529.length; var20++) {
                            if ((var19 + 1) == var18.field4529[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class283.field4327;
                }
                if (var7 == 12) {
                    var8 = class201.field3027;
                }
                if (var7 == 13) {
                    int var21 = class166.field2447[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class121.method856(16853, var23);
                }
                if (var7 == 18) {
                    var8 = (class185.field2687.field425 >> 7) + class90.field1367;
                }
                if (var7 == 19) {
                    var8 = (class185.field2687.field455 >> 7) + class188.field2774;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILr;)V")
    public static final void method934(int arg0, class43 arg1) {
        field1990++;
        class249.method1701(arg1, arg0, (byte) -59);
    }
}
