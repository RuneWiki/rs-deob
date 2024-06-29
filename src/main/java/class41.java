import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class41 extends class237 {

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[S")
    public static short[] field508 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field517;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[[[I")
    public static int[][][] field516;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
    public static final int method223(byte arg0) {
        field506++;
        class216.field3470 = 0;
        int var1 = 81 / ((34 - arg0) / 60);
        return class75.method422(true);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
    public static final void method224(byte arg0) {
        field512++;
        int var1 = 65 % ((arg0 + 9) / 46);
        class104.field1395.method1701((byte) 127);
        class101.field1338.method1701((byte) 50);
        class236.field3908.method1701((byte) 84);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)V")
    public static void method225(byte arg0) {
        field508 = null;
        field516 = null;
        if (arg0 != 64) {
            field507 = -103;
        }
        field517 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V")
    public static final void method226(int arg0, int arg1) {
        field514++;
        class233 var2 = class114.method746(arg1, 1228126432, arg0);
        var2.method1653(false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILjb;I)V")
    public static final void method227(int arg0, int arg1, int arg2, class188 arg3, int arg4) {
        field509++;
        if (class34.field437 >= 400) {
            return;
        }
        if (arg3.field3004 != null) {
            arg3 = arg3.method1314(-1);
        }
        if (arg3 == null || !arg3.field3027) {
            return;
        }
        String var5 = arg3.field3005;
        if (arg3.field3011 != 0) {
            String var6 = class297.field4695 == 1 ? class46.field584 : class258.field4187;
            var5 = var5 + class251.method1727(arg3.field3011, class286.field4571.field4200, 93) + " (" + var6 + arg3.field3011 + ")";
        }
        if (arg4 >= -43) {
            method224((byte) -26);
        }
        if (class32.field432 == 1) {
            class152.field2357++;
            class195.method1373(arg2, class138.field2217 + " -> <col=ffff00>" + var5, class153.field2379, (long) arg1, (byte) -88, arg0, class207.field3316, (short) 51);
        } else if (class247.field4076) {
            class258 var7 = class73.field918 == -1 ? null : class44.method250(class73.field918, -101);
            if ((class78.field984 & 0x2) != 0) {
                if (var7 == null || arg3.method1313(var7.field4181, class73.field918, (byte) -79) != var7.field4181) {
                    class18.field227++;
                    class195.method1373(arg2, class144.field2284 + " -> <col=ffff00>" + var5, class78.field983, (long) arg1, (byte) -125, arg0, class283.field4511, (short) 47);
                }
                return;
            }
        } else {
            class188.field3043++;
            String[] var8 = arg3.field3016;
            if (class61.field784) {
                var8 = class89.method484(17594, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class297.field4695 != 0 || !var8[var9].equalsIgnoreCase(class237.field3921))) {
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 1;
                        }
                        int var11 = -1;
                        if (var9 == 1) {
                            var10 = 31;
                        }
                        class240.field3956++;
                        if (var9 == 2) {
                            var10 = 24;
                        }
                        if (var9 == 3) {
                            var10 = 14;
                        }
                        if (var9 == 4) {
                            var10 = 16;
                        }
                        if (arg3.field3046 == var9) {
                            var11 = arg3.field2993;
                        }
                        if (arg3.field3057 == var9) {
                            var11 = arg3.field3047;
                        }
                        class195.method1373(arg2, "<col=ffff00>" + var5, var11, (long) arg1, (byte) -71, arg0, var8[var9], var10);
                    }
                }
            }
            if (class297.field4695 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class237.field3921)) {
                        short var13 = 0;
                        short var14 = 0;
                        if (class286.field4571.field4200 < arg3.field3011) {
                            var13 = 2000;
                        }
                        if (var12 == 0) {
                            var14 = 1;
                        }
                        if (var12 == 1) {
                            var14 = 31;
                        }
                        class191.field3081++;
                        if (var12 == 2) {
                            var14 = 24;
                        }
                        if (var12 == 3) {
                            var14 = 14;
                        }
                        if (var12 == 4) {
                            var14 = 16;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class195.method1373(arg2, "<col=ffff00>" + var5, arg3.field3040, (long) arg1, (byte) -99, arg0, var8[var12], var14);
                    }
                }
            }
            class195.method1373(arg2, "<col=ffff00>" + var5, class59.field761, (long) arg1, (byte) -96, arg0, class60.field772, (short) 1003);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILeh;I)Lrb;")
    public static final class135 method228(int arg0, class137 arg1, int arg2) {
        field511++;
        if (arg0 >= -66) {
            method225((byte) 75);
        }
        return class52.method300(72, arg2, arg1) ? class23.method133((byte) -112) : null;
    }
}
