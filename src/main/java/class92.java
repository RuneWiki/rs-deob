import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
    public static int[] field1663 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
    public static boolean field1662 = true;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1669 = 1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
    public static long field1666;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)I")
    public static final int method692(byte arg0, int arg1) {
        field1665++;
        int var2 = 123 % ((3 - arg0) / 59);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIZIILfa;)V")
    public static final void method693(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class239 arg6) {
        if (arg1 != 7525) {
            method696((byte) -35);
        }
        class62.field1248 = arg3;
        class199.field3452 = arg2;
        field1664++;
        class193.field3340 = arg5;
        class43.field953 = arg4;
        class55.field1144 = arg6;
        class41.field930 = 1;
        class230.field3942 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    public static final int method694(int arg0, byte arg1) {
        field1667++;
        if (arg1 >= -3) {
            method695(46, -19, 20, 19, -65, 16, 44, 17, 46, -59, 83);
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1660++;
        int var11 = arg2 - arg6;
        int var12 = arg4 - arg0;
        int var13 = 983040 / arg8;
        boolean var14;
        if (class135.field2360 > 0 && class135.field2360 % 10 < 5) {
            var14 = true;
        } else {
            var14 = false;
        }
        if (arg7 > -119) {
            method694(-65, (byte) 16);
        }
        int var15 = 983040 / arg5;
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var18 = arg10 + (arg8 * var16) >> 16;
            int var19 = (var16 + 1) * arg8 + arg10 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg1 + var19;
                int var22 = arg6 + var16 >> 6;
                int var23 = arg1 + var18;
                if (var22 >= 0 && var22 <= class261.field4470.length - 1) {
                    int[][] var24 = class261.field4470[var22];
                    for (int var25 = -var15; var25 < var12 + var15; var25++) {
                        int var26 = (var25 + 1) * arg5 + arg3 >> 16;
                        int var27 = arg3 + (arg5 * var25) >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg0 + var25 >> 6;
                            var10000 = arg9 + var26;
                            int var31 = arg9 + var27;
                            if (var29 >= 0 && var29 <= (var24.length - 1) && var24[var29] != null) {
                                int var32 = ((arg0 + var25 & 0x3F) << 6) + (arg6 + var16 & 0x3F);
                                int var33 = var24[var29][var32];
                                if (var33 != 0) {
                                    class28 var34 = class94.method700(117, var33 - 1);
                                    if (var14 && class166.field2943 == var34.field553) {
                                        class96 var35 = new class96();
                                        var35.field1713 = var34.field553;
                                        var35.field1704 = var31;
                                        var35.field1706 = var23;
                                        class45.field981.method675(var35, (byte) -104);
                                    }
                                    class114.field1998[var34.field553].method806(var23 - 7, var31 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class96 var17 = (class96) class45.field981.method673(false); var17 != null; var17 = (class96) class45.field981.method680(56)) {
            class114.field1998[var17.field1713].method806(var17.field1706 - 7, var17.field1704 - 7);
            class192.method1294(var17.field1706, var17.field1704, 15, 16776960, 128);
            class192.method1294(var17.field1706, var17.field1704, 7, 16777215, 256);
        }
        class45.field981.method676(16841);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method696(byte arg0) {
        int var1 = -102 % ((50 - arg0) / 60);
        field1663 = null;
    }
}
