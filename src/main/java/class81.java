import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class81 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
    public boolean field1357 = false;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public static boolean field1351;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public static final void method560(int arg0, int arg1, int arg2) {
        class222 var3 = class4.method33(arg2, -128);
        int var4 = var3.field3726;
        field1353++;
        int var5 = var3.field3730;
        int var6 = var3.field3732;
        if (arg0 != 32658) {
            return;
        }
        int var7 = class270.field4489[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class237.method1701(22445, class152.field2541[var4] & ~var8 | var8 & arg1 << var6, var4);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lab;ZI)V")
    public final void method561(class249 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1802((byte) -120);
            if (var4 == 0) {
                field1354++;
                if (!arg1) {
                    method565(41);
                    return;
                }
                return;
            }
            this.method567((byte) -123, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
    public static final int method562(byte arg0) {
        if (arg0 <= 13) {
            return -119;
        } else {
            field1361++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method563(int arg0) {
        field1359++;
        class236.field3980.method640((byte) 97, 255);
        class236.field3980.method1780(0, 77);
        class143.field2354++;
        if (arg0 != -24898) {
            field1351 = true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZZ)Lkm;")
    public final class230 method564(int arg0, boolean arg1, boolean arg2) {
        class230 var4 = (class230) class32.field525.method99((long) (arg0 << 16 | this.field1360 | (arg1 ? 262144 : 0)), arg2);
        field1355++;
        if (var4 != null) {
            return var4;
        }
        class151.field2486.method1118((byte) 96, this.field1360);
        class230 var5 = class215.method1532(class151.field2486, 0, this.field1360, 0);
        if (var5 != null) {
            var5.method1657(class141.field2328, class277.field4621, class244.field4088);
            var5.field4226 = var5.field4225;
            var5.field4230 = var5.field4235;
            if (arg1) {
                var5.method1659();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method1648();
            }
            class32.field525.method100((long) ((arg1 ? 262144 : 0) | this.field1360 | arg0 << 16), var5, 72);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method565(int arg0) {
        field1356++;
        class176.field2839.method97(100);
        if (arg0 != 0) {
            method565(-117);
        }
        class245.field4104.method97(arg0 ^ 0x6B);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lng;)V")
    public static final void method566(class73 arg0) {
        for (int var1 = arg0.field1270; var1 <= arg0.field1269; var1++) {
            for (int var2 = arg0.field1266; var2 <= arg0.field1276; var2++) {
                class174 var3 = class90.field1498[arg0.field1265][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2814; var4++) {
                        if (var3.field2812[var4] == arg0) {
                            var3.field2814--;
                            for (int var5 = var4; var5 < var3.field2814; var5++) {
                                var3.field2812[var5] = var3.field2812[var5 + 1];
                                var3.field2801[var5] = var3.field2801[var5 + 1];
                            }
                            var3.field2812[var3.field2814] = null;
                            break;
                        }
                    }
                    var3.field2819 = 0;
                    for (int var6 = 0; var6 < var3.field2814; var6++) {
                        var3.field2819 |= var3.field2801[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIILab;)V")
    private final void method567(byte arg0, int arg1, int arg2, class249 arg3) {
        field1358++;
        int var5 = -14 % ((65 - arg0) / 38);
        if (arg1 == 1) {
            this.field1360 = arg3.method1821((byte) 51);
        } else if (arg1 == 2) {
            this.field1350 = arg3.method1812((byte) 52);
        } else if (arg1 == 3) {
            this.field1357 = true;
            return;
        } else if (arg1 == 4) {
            this.field1360 = -1;
            return;
        }
    }
}
