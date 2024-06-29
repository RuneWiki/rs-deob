import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class433 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field6227 = 0;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
    public static boolean field6226 = false;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field6231 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Z")
    public static boolean field6233;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method2715(int arg0, String arg1) {
        field6234++;
        if (arg0 != 1) {
            field6226 = false;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class348.method2226(arg1.charAt(var4), (byte) -118) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V", line = 37)
    public static final void method2716(int arg0, boolean arg1) {
        field6223++;
        class63.field724 = arg1;
        if (arg0 != 3) {
            return;
        }
        if (!class63.field724) {
            int var27 = class359.field5120.method1566(-3451);
            int var28 = class359.field5120.method1585(arg0 ^ 0x68);
            int var29 = (class55.field658 - class359.field5120.field3320) / 16;
            class14.field182 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var41 = 0; var41 < 4; var41++) {
                    class14.field182[var30][var41] = class359.field5120.method1597(3641);
                }
            }
            int var31 = class359.field5120.method1567(arg0 + 65277);
            int var32 = class359.field5120.method1575((byte) 108);
            boolean var33 = class359.field5120.method1567(arg0 + 65277) == 1;
            int var34 = class359.field5120.method1585(arg0 ^ 0x72);
            int var35 = class359.field5120.method1590(false);
            class82.method460((byte) -83, var32);
            class260.field3711 = new int[var29];
            class254.field3657 = new int[var29];
            class33.field380 = new int[var29];
            class340.field4822 = null;
            class36.field418 = new int[var29];
            class366.field5187 = new byte[var29][];
            class112.field1371 = new int[var29];
            class56.field678 = null;
            class109.field1346 = new byte[var29][];
            class212.field3019 = new byte[var29][];
            class193.field2798 = new byte[var29][];
            boolean var36 = false;
            if (((var34 / 8) == 48 || var34 / 8 == 49) && var28 / 8 == 48) {
                var36 = true;
            }
            if (var34 / 8 == 48 && var28 / 8 == 148) {
                var36 = true;
            }
            int var37 = 0;
            for (int var38 = (var34 - (class176.field2403 >> 4)) / 8; var38 <= (((class176.field2403 >> 4) + var34) / 8); var38++) {
                for (int var39 = (var28 - (class383.field5395 >> 4)) / 8; var39 <= ((class383.field5395 >> 4) + var28) / 8; var39++) {
                    int var40 = (var38 << 8) + var39;
                    if (var36 && var39 == 49 || var39 == 149 || var39 == 147 || var38 == 50 || !(var38 != 49 || var39 != 47)) {
                        class33.field380[var37] = var40;
                        class36.field418[var37] = -1;
                        class254.field3657[var37] = -1;
                        class260.field3711[var37] = -1;
                        class112.field1371[var37] = -1;
                    } else {
                        class33.field380[var37] = var40;
                        class36.field418[var37] = class311.field4389.method2418("m" + var38 + "_" + var39, (byte) -23);
                        class254.field3657[var37] = class311.field4389.method2418("l" + var38 + "_" + var39, (byte) -23);
                        class260.field3711[var37] = class311.field4389.method2418("um" + var38 + "_" + var39, (byte) -23);
                        class112.field1371[var37] = class311.field4389.method2418("ul" + var38 + "_" + var39, (byte) -23);
                    }
                    var37++;
                }
            }
            class50.method292((byte) 96, var27, var35, var34, false, var31, var28, var33);
            return;
        }
        int var2 = class359.field5120.method1566(-3451);
        int var3 = class359.field5120.method1590(false);
        int var4 = class359.field5120.method1590(false);
        int var5 = class359.field5120.method1566(-3451);
        int var6 = class359.field5120.method1575((byte) 110);
        boolean var7 = class359.field5120.method1574(-116) == 1;
        int var8 = class359.field5120.method1574(-25);
        class82.method460((byte) -83, var8);
        class359.field5120.method2150(1);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var24 = 0; var24 < (class176.field2403 >> 3); var24++) {
                for (int var25 = 0; var25 < (class383.field5395 >> 3); var25++) {
                    int var26 = class359.field5120.method2146(1, (byte) 52);
                    if (var26 == 1) {
                        class330.field4670[var9][var24][var25] = class359.field5120.method2146(26, (byte) 52);
                    } else {
                        class330.field4670[var9][var24][var25] = -1;
                    }
                }
            }
        }
        class359.field5120.method2145((byte) -94);
        int var10 = (class55.field658 - class359.field5120.field3320) / 16;
        class14.field182 = new int[var10][4];
        for (int var11 = 0; var11 < var10; var11++) {
            for (int var23 = 0; var23 < 4; var23++) {
                class14.field182[var11][var23] = class359.field5120.method1597(3641);
            }
        }
        class260.field3711 = new int[var10];
        class36.field418 = new int[var10];
        class254.field3657 = new int[var10];
        class193.field2798 = new byte[var10][];
        class33.field380 = new int[var10];
        class56.field678 = null;
        class340.field4822 = null;
        class109.field1346 = new byte[var10][];
        class366.field5187 = new byte[var10][];
        class112.field1371 = new int[var10];
        class212.field3019 = new byte[var10][];
        int var12 = 0;
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < (class176.field2403 >> 3); var14++) {
                for (int var15 = 0; var15 < (class383.field5395 >> 3); var15++) {
                    int var16 = class330.field4670[var13][var14][var15];
                    if (var16 != -1) {
                        int var17 = var16 >> 14 & 0x3FF;
                        int var18 = var16 >> 3 & 0x7FF;
                        int var19 = (var17 / 8 << 8) + (var18 / 8);
                        for (int var20 = 0; var20 < var12; var20++) {
                            if (class33.field380[var20] == var19) {
                                var19 = -1;
                                break;
                            }
                        }
                        if (var19 != -1) {
                            class33.field380[var12] = var19;
                            int var21 = var19 >> 8 & 0xFF;
                            int var22 = var19 & 0xFF;
                            class36.field418[var12] = class311.field4389.method2418("m" + var21 + "_" + var22, (byte) -23);
                            class254.field3657[var12] = class311.field4389.method2418("l" + var21 + "_" + var22, (byte) -23);
                            class260.field3711[var12] = class311.field4389.method2418("um" + var21 + "_" + var22, (byte) -23);
                            class112.field1371[var12] = class311.field4389.method2418("ul" + var21 + "_" + var22, (byte) -23);
                            var12++;
                        }
                    }
                }
            }
        }
        class50.method292((byte) 118, var2, var5, var3, false, var6, var4, var7);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I", line = 295)
    public static final int method2717(int arg0, int arg1, int arg2) {
        field6225++;
        return ~arg0 == arg2 || arg0 == 5 ? class21.field270[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 307)
    public static final void method2718(int arg0) {
        if (arg0 != 15581) {
            return;
        }
        class62.field718.field3320 = 0;
        field6229++;
        class359.field5120.field3320 = 0;
        class328.field4656 = 0;
        class215.field3047 = -1;
        class199.field2838 = -1;
        class188.field2717 = -1;
        class233.field3286 = 0;
        class68.field771 = -1;
        class55.field658 = 0;
        class245.method1664(-22116);
        class294.method1944(true);
        for (int var1 = 0; var1 < class26.field314.length; var1++) {
            if (class26.field314[var1] != null) {
                class26.field314[var1].field5574 = -1;
            }
        }
        for (int var2 = 0; var2 < class167.field2335.length; var2++) {
            if (class167.field2335[var2] != null) {
                class167.field2335[var2].field5574 = -1;
            }
        }
        class365.method2336((byte) -97);
        class129.field1568 = 1;
        class178.method1210(30, arg0 - 15520);
        for (int var3 = 0; var3 < 100; var3++) {
            class394.field5556[var3] = true;
        }
        class43.method263((byte) -42);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILtq;ZIIZ)V", line = 362)
    public static final void method2719(int arg0, int arg1, class376 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        class367.field5205 = arg0;
        class383.field5407 = 1;
        if (!arg6) {
            method2720(-81, -25, 26, 56, 65, 62, -27, 36);
        }
        class362.field5168 = arg2;
        class311.field4393 = arg5;
        class128.field1558 = arg1;
        class295.field4117 = arg3;
        field6224++;
        class193.field2793 = arg4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)V", line = 382)
    public static final void method2720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6228++;
        int var8 = class130.method805(true, class219.field3080, arg2, class388.field5464);
        int var9 = class130.method805(true, class219.field3080, arg0, class388.field5464);
        if (arg4 >= -55) {
            field6231 = -63;
        }
        int var10 = class130.method805(true, class235.field3295, arg6, class81.field946);
        int var11 = class130.method805(true, class235.field3295, arg7, class81.field946);
        int var12 = class130.method805(true, class219.field3080, arg2 + arg5, class388.field5464);
        int var13 = class130.method805(true, class219.field3080, arg0 - arg5, class388.field5464);
        for (int var14 = var8; var14 < var12; var14++) {
            class296.method1954(arg1, var11, class291.field4067[var14], var10, -1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class296.method1954(arg1, var11, class291.field4067[var15], var10, -1);
        }
        int var16 = class130.method805(true, class235.field3295, arg5 + arg6, class81.field946);
        int var17 = class130.method805(true, class235.field3295, arg7 - arg5, class81.field946);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class291.field4067[var18];
            class296.method1954(arg1, var16, var19, var10, -1);
            class296.method1954(arg3, var17, var19, var16, -1);
            class296.method1954(arg1, var11, var19, var17, -1);
        }
    }
}
