import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class108 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
    public boolean field1585 = true;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public int field1589 = -1;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public int field1590 = -1;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field1586 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
    public static boolean field1582 = false;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field1584 = 1;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lpi;")
    public static class132 field1581;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1580++;
        int var6 = arg4;
        int var7 = arg0 * arg0;
        int var8 = arg2;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var9 << 2;
        int var15 = ((arg4 << 1) + 3) * var10;
        int var16 = var9 - ((var12 - 1) * var11);
        int var17 = var7 << 2;
        int var18 = ((arg2 << 1) - 3) * var11;
        if (class175.field2557 <= arg3 && arg3 <= class91.field1381) {
            int var19 = class251.method1710(arg0 + arg1, (byte) 27, class196.field2961, class84.field1287);
            int var20 = class251.method1710(arg1 - arg0, (byte) 27, class196.field2961, class84.field1287);
            class222.method1519((byte) -115, var20, class241.field3751[arg3], var19, arg5);
        }
        int var21 = (arg4 + 1) * var14;
        int var22 = (arg2 - 1) * var17;
        while (var8 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var15;
                    var16 += var21;
                    var6++;
                    var15 += var14;
                    var21 += var14;
                }
            }
            var8--;
            int var23 = arg3 - var8;
            if (var16 < 0) {
                var16 += var21;
                var6++;
                var21 += var14;
                var13 += var15;
                var15 += var14;
            }
            int var24 = arg3 + var8;
            var16 += -var18;
            if (var24 >= class175.field2557 && var23 <= class91.field1381) {
                int var25 = class251.method1710(arg1 + var6, (byte) 27, class196.field2961, class84.field1287);
                int var26 = class251.method1710(arg1 - var6, (byte) 27, class196.field2961, class84.field1287);
                if (class175.field2557 <= var23) {
                    class222.method1519((byte) -119, var26, class241.field3751[var23], var25, arg5);
                }
                if (class91.field1381 >= var24) {
                    class222.method1519((byte) -114, var26, class241.field3751[var24], var25, arg5);
                }
            }
            var18 -= var17;
            var13 += -var22;
            var22 -= var17;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lwg;")
    public static final class220 method781(int arg0, int arg1) {
        class220 var2 = (class220) class81.field1261.method945((long) arg0, true);
        field1591++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -1) {
            byte[] var3 = class69.field1149.method1605(-126, class121.method861(arg0, false), class221.method1516((byte) 123, arg0));
            class220 var4 = new class220();
            var4.field3432 = arg0;
            if (var3 != null) {
                var4.method1506(new class54(var3), arg1 ^ 0xFFFFFFB4);
            }
            var4.method1509(true);
            class81.field1261.method941(var4, (long) arg0, -8447);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method782(byte arg0) {
        field1588++;
        int var1 = class229.field3561;
        int var2 = class67.field1116;
        int var3 = class19.field333;
        int var4 = class106.field1561 - 3;
        byte var5 = 20;
        if (class134.field1970 == null || class150.field2185 == null) {
            if (class36.field637.method1629(class251.field3888, 0) && class36.field637.method1629(class185.field2705, 0)) {
                class134.field1970 = class231.method1574(class251.field3888, class36.field637, 0, false);
                class150.field2185 = class231.method1574(class185.field2705, class36.field637, 0, false);
            } else {
                class72.method573(var1, var2, var3, var5, class112.field1711, 256 - class168.field2468);
            }
        }
        if (class134.field1970 != null && class150.field2185 != null) {
            int var6 = (var3 - (class150.field2185.field3948 * 2)) / class134.field1970.field3948;
            for (int var7 = 0; var7 < var6; var7++) {
                class134.field1970.method1230(class150.field2185.field3948 + var1 + (class134.field1970.field3948 * var7), var2);
            }
            class150.field2185.method1230(var1, var2);
            class150.field2185.method1227(var1 - (class150.field2185.field3948 - var3), var2);
        }
        class105.field1555.method1291(class194.field2938, var1 + 3, var2 + 14, class174.field2552, -1);
        class72.method573(var1, var2 + var5, var3, var4 - var5, class112.field1711, 256 - class168.field2468);
        int var8 = class12.field172;
        int var9 = class105.field1542;
        for (int var10 = 0; var10 < class51.field826; var10++) {
            int var19 = (class51.field826 - var10 - 1) * 15 + var2 + var5 + 13;
            if (var8 > var1 && var8 < (var1 + var3) && var19 - 13 < var9 && var9 < var19 + 3) {
                class72.method573(var1, var19 - 12, var3, 15, class22.field364, 256 - class75.field1197);
            }
        }
        int var11 = -85 % ((arg0 + 51) / 58);
        if ((class227.field3542 == null || class81.field1262 == null || class235.field3615 == null) && class36.field637.method1629(class90.field1366, 0) && class36.field637.method1629(class103.field1503, 0) && class36.field637.method1629(class281.field4317, 0)) {
            class227.field3542 = class231.method1574(class90.field1366, class36.field637, 0, false);
            class81.field1262 = class231.method1574(class103.field1503, class36.field637, 0, false);
            class235.field3615 = class231.method1574(class281.field4317, class36.field637, 0, false);
        }
        if (class227.field3542 != null && class81.field1262 != null && class235.field3615 != null) {
            int var12 = (var3 - (class235.field3615.field3948 * 2)) / class227.field3542.field3948;
            for (int var13 = 0; var13 < var12; var13++) {
                class227.field3542.method1230(class227.field3542.field3948 * var13 + class235.field3615.field3948 + var1, var2 - -var4 + -class227.field3542.field3936);
            }
            int var14 = (var4 - var5 - class235.field3615.field3936) / class81.field1262.field3936;
            for (int var15 = 0; var15 < var14; var15++) {
                class81.field1262.method1230(var1, class81.field1262.field3936 * var15 + var5 + var2);
                class81.field1262.method1227(var1 - (class81.field1262.field3948 - var3), class81.field1262.field3936 * var15 + (var2 - -var5));
            }
            class235.field3615.method1230(var1, var2 + var4 - class235.field3615.field3936);
            class235.field3615.method1227(var1 + var3 - class235.field3615.field3948, var2 + var4 - class235.field3615.field3936);
        }
        for (int var16 = 0; var16 < class51.field826; var16++) {
            int var17 = var2 + var5 + (-var16 + -1 + class51.field826) * 15 + 13;
            int var18 = class174.field2552;
            if (var8 > var1 && var8 < var1 + var3 && var17 - 13 < var9 && var9 < (var17 + 3)) {
                var18 = class285.field4376;
            }
            class105.field1555.method1291(class170.method1143(-24448, var16), var1 + 3, var17, var18, 0);
        }
        class10.method74(class67.field1116, class229.field3561, false, class106.field1561, class19.field333);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method783(byte arg0) {
        field1581 = null;
        if (arg0 >= -60) {
            field1582 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILca;I)V")
    public final void method784(int arg0, class54 arg1, int arg2) {
        field1579++;
        if (arg2 != -30076) {
            method783((byte) -75);
        }
        while (true) {
            int var4 = arg1.method407(255);
            if (var4 == 0) {
                return;
            }
            this.method785(var4, arg1, (byte) 82, arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILca;BI)V")
    private final void method785(int arg0, class54 arg1, byte arg2, int arg3) {
        if (arg2 < 10) {
            method782((byte) -54);
        }
        if (arg0 == 1) {
            this.field1586 = class286.method1902((byte) 113, arg1.method408(8));
        } else if (arg0 == 2) {
            this.field1590 = arg1.method407(255);
        } else if (arg0 == 3) {
            this.field1590 = arg1.method423(-84);
            if (this.field1590 == 65535) {
                this.field1590 = -1;
            }
        } else if (arg0 == 5) {
            this.field1585 = false;
        } else if (arg0 == 7) {
            this.field1589 = class286.method1902((byte) 115, arg1.method408(8));
        } else if (arg0 == 8) {
            class251.field3890 = arg3;
        } else if (arg0 == 9) {
            arg1.method423(60);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg1.method407(255);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg1.method408(8);
                } else if (arg0 == 14) {
                    arg1.method407(255);
                }
            }
        }
        field1587++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method786(int arg0) {
        if (arg0 != 9763) {
            method780(70, 69, -100, -92, 21, -5);
        }
        class157.field2302.method944(65535);
        field1583++;
    }
}
