import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class195 extends class281 {

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Ljw;")
    public static class581 field2608 = new class581(132, 6);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Z")
    public static boolean field2610 = false;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Ltja;")
    public static class288 field2609 = new class288(2, 7);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "[I")
    public static int[] field2611 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
    public static final boolean method1341(int arg0, int arg1, int arg2) {
        field2606++;
        if (arg0 == -30823) {
            return (arg1 & 0x40000) != 0 | class509.method2953(-1, arg2, arg1) || class647.method3617(arg1, arg2, (byte) -49);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method1342(int arg0) {
        if (!class526.field7216) {
            class668.field9373 = class246.field3494 != -1 && class746.field10297 >= class246.field3494 || class746.field10297 * 16 + (class38.field591 ? 26 : 22) > class140.field2048;
        }
        if (arg0 != 2) {
            return;
        }
        field2607++;
        class104.field1442.method2549(-84);
        class466.field6467.method2549(arg0 - 72);
        for (class275 var1 = (class275) class280.field4138.method2551((byte) -108); var1 != null; var1 = (class275) class280.field4138.method2542(-126)) {
            int var38 = var1.field4080;
            if (var38 < 1000) {
                var1.method792((byte) -108);
                if (var38 == 2 || var38 == 22 || var38 == 5 || var38 == 10 || var38 == 49 || var38 == 60 || var38 == 8) {
                    class466.field6467.method2545(-127, var1);
                } else {
                    class104.field1442.method2545(-127, var1);
                }
            }
        }
        class104.field1442.method2546(class280.field4138, 8557);
        class466.field6467.method2546(class280.field4138, 8557);
        if (class746.field10297 <= 1) {
            class788.field10852 = null;
            class454.field6306 = null;
        } else {
            if (class672.field9457 && class469.field6507.method828(arg0 ^ 0xFFFFFFFC, 81) && class746.field10297 > 2) {
                class788.field10852 = (class275) class280.field4138.field5921.field1416.field1416;
            } else {
                class788.field10852 = (class275) class280.field4138.field5921.field1416;
            }
            class454.field6306 = (class275) class280.field4138.field5921.field1416;
        }
        int var2 = -1;
        class504 var3 = (class504) class289.field4242.method2551((byte) -108);
        if (var3 != null) {
            var2 = var3.method1037(-5);
        }
        if (!class526.field7216) {
            if (var2 == 0 && (class752.field10419 == 1 && class746.field10297 > 2 || class201.method1366(-121))) {
                var2 = 2;
            }
            if (var2 == 2 && class746.field10297 > 0 && var3 != null) {
                if (class437.field6161 == null && class348.field5120 == 0) {
                    class286.method1827(var3.method1036(5), var3.method1038(arg0 + 6), -112);
                } else {
                    class605.field8218 = 2;
                }
            }
            if (var2 == 0) {
                if (class788.field10852 != null) {
                    class307.method1942((byte) 58);
                } else if (class497.field6870) {
                    class701.method3909(0);
                }
            }
            if (class437.field6161 != null || class348.field5120 != 0) {
                return;
            }
            class605.field8218 = 0;
            class665.field9190 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class304.field4371.method778(0);
            int var5 = class304.field4371.method777((byte) 79);
            boolean var6 = false;
            if (class314.field4522 != null) {
                if (var4 >= (class271.field4010 - 10) && var4 <= (class271.field4010 + class152.field2100 + 10) && (class270.field3986 - 10) <= var5 && class485.field6706 + class270.field3986 + 10 >= var5) {
                    var6 = true;
                } else {
                    class684.method3803(arg0 ^ 0xFFFFFFF9);
                }
            }
            if (!var6) {
                if (class245.field3317 - 10 > var4 || var4 > class442.field6220 + class245.field3317 + 10 || var5 < (class356.field5213 - 10) || (class356.field5213 + class337.field4890 + 10) < var5) {
                    class539.method3078(0);
                } else if (class668.field9373) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class491.field6811; var9++) {
                        if (class38.field591) {
                            int var10 = (var9 * 16) + class356.field5213 + 33;
                            if ((var10 - 13) < var5 && var10 + 4 > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class356.field5213 + 31;
                            if (var5 > var11 - 13 && var5 < (var11 + 3)) {
                                var7 = var9;
                                var8 = var11 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class533 var13 = new class533(class57.field805);
                        for (class81 var14 = (class81) var13.method3051((byte) 94); var14 != null; var14 = (class81) var13.method3053(7782)) {
                            if (var7 == var12) {
                                if (var14.field1151 > 1) {
                                    class463.method2742(var8, var14, 107, var5);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1038(8);
        int var16 = var3.method1036(5);
        if (class314.field4522 != null && var15 >= class271.field4010 && class271.field4010 + class152.field2100 >= var15 && var16 >= class270.field3986 && (class270.field3986 + class485.field6706) >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class314.field4522.field1151; var18++) {
                if (class38.field591) {
                    int var23 = class270.field3986 - (-(var18 * 16) - 33);
                    if ((var23 - 13) < var16 && var23 + 4 > var16) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class270.field3986 + 31;
                    if (var16 > var22 - 13 && var16 < var22 + 3) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class533 var20 = new class533(class314.field4522.field1155);
                for (class275 var21 = (class275) var20.method3051((byte) 84); var21 != null; var21 = (class275) var20.method3053(arg0 ^ 0x1E64)) {
                    if (var17 == var19) {
                        class249.method1675(var21, var16, 114, var15);
                        break;
                    }
                    var19++;
                }
            }
            class539.method3078(0);
            return;
        }
        if (class245.field3317 > var15 || class442.field6220 + class245.field3317 < var15 || var16 < class356.field5213 || class356.field5213 + class337.field4890 < var16) {
            return;
        }
        if (!class668.field9373) {
            int var24 = -1;
            for (int var25 = 0; var25 < class746.field10297; var25++) {
                if (class38.field591) {
                    int var30 = (class746.field10297 - var25 - 1) * 16 + (class356.field5213 + 33);
                    if (var16 > (var30 - 13) && var16 < var30 + 4) {
                        var24 = var25;
                    }
                } else {
                    int var29 = (class746.field10297 - var25 - 1) * 16 + class356.field5213 + 31;
                    if (var29 - 13 < var16 && var29 + 3 > var16) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class359 var27 = new class359(class280.field4138);
                for (class275 var28 = (class275) var27.method2253(3530); var28 != null; var28 = (class275) var27.method2255((byte) 17)) {
                    if (var24 == var26) {
                        class249.method1675(var28, var16, 117, var15);
                        break;
                    }
                    var26++;
                }
            }
            class539.method3078(0);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class491.field6811; var32++) {
            if (class38.field591) {
                int var33 = var32 * 16 + class356.field5213 + 33;
                if (var33 - 13 < var16 && (var33 + 4) > var16) {
                    var31 = var32;
                    break;
                }
            } else {
                int var34 = var32 * 16 + class356.field5213 + 31;
                if ((var34 - 13) < var16 && var16 < (var34 + 3)) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class533 var36 = new class533(class57.field805);
        for (class81 var37 = (class81) var36.method3051((byte) 97); var37 != null; var37 = (class81) var36.method3053(7782)) {
            if (var31 == var35) {
                class249.method1675((class275) var37.field1155.field1176.field4146, var16, 115, var15);
                class539.method3078(arg0 ^ 0x2);
                return;
            }
            var35++;
        }
        return;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static void method1343(byte arg0) {
        if (arg0 <= 16) {
            field2608 = null;
        }
        field2609 = null;
        field2611 = null;
        field2608 = null;
    }
}
