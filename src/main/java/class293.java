import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class293 extends class182 {

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    private int field4744 = 4096;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Z")
    private boolean field4745 = true;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[Z")
    public static boolean[] field4742 = new boolean[200];

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V", line = 7)
    public static void method2079(int arg0) {
        int var1 = -122 / ((37 - arg0) / 56);
        field4742 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 18)
    public class293() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lek;B)V", line = 29)
    public static final void method2080(class206 arg0, byte arg1) {
        class251.field4130 = arg0.method1402(-94, "p11_full");
        field4747++;
        class50.field1033 = arg0.method1402(arg1 ^ 0x10, "p12_full");
        class225.field3705 = arg0.method1402(-119, "b12_full");
        class39.field860 = arg0.method1402(-107, "hitmarks");
        class71.field1298 = arg0.method1402(-84, "hitbar_default");
        class36.field784 = arg0.method1402(arg1 - 31, "headicons_pk");
        class117.field2085 = arg0.method1402(-101, "headicons_prayer");
        class90.field1604 = arg0.method1402(-105, "hint_headicons");
        class164.field2756 = arg0.method1402(arg1 ^ 0x2, "hint_mapmarkers");
        class91.field1625 = arg0.method1402(-82, "mapflag");
        class31.field719 = arg0.method1402(-75, "cross");
        field4740 = arg0.method1402(-114, "mapdots");
        if (arg1 != -92) {
            return;
        }
        class70.field1287 = arg0.method1402(arg1 ^ 0x14, "scrollbar");
        class310.field5060 = arg0.method1402(-126, "name_icons");
        class244.field4050 = arg0.method1402(-102, "floorshadows");
        class143.field2401 = arg0.method1402(-111, "compass");
        class355.field5668 = arg0.method1402(-120, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V", line = 58)
    public static final void method2081(int arg0, boolean arg1) {
        if (arg0 != -11542) {
            field4742 = (boolean[]) null;
        }
        field4738++;
        class177.field2932 = arg1;
        if (!class177.field2932) {
            int var26 = class342.field5413.method1034(0);
            int var27 = class342.field5413.method996(6107);
            int var28 = class342.field5413.method996(6107);
            int var29 = class342.field5413.method1011(-32768);
            int var30 = (class205.field3414 - class342.field5413.field2435) / 16;
            class20.field533 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var32 = 0; var32 < 4; var32++) {
                    class20.field533[var31][var32] = class342.field5413.method1024(arg0 + 22550);
                }
            }
            boolean var33 = class238.method1658(9325, class342.field5413.method992((byte) 88));
            int var34 = class342.field5413.method989(arg0 + 11624);
            class190.field3227 = new int[var30];
            class132.field2272 = (byte[][]) null;
            class148.field2516 = new byte[var30][];
            class21.field540 = new byte[var30][];
            class341.field5405 = new byte[var30][];
            class271.field4415 = new int[var30];
            class127.field2221 = new int[var30];
            boolean var35 = false;
            class194.field3267 = new int[var30];
            class46.field920 = new byte[var30][];
            class176.field2919 = null;
            if (((var34 / 8) == 48 || (var34 / 8) == 49) && var29 / 8 == 48) {
                var35 = true;
            }
            class133.field2277 = new int[var30];
            if ((var34 / 8) == 48 && (var29 / 8) == 148) {
                var35 = true;
            }
            int var36 = 0;
            for (int var37 = (var34 - 6) / 8; var37 <= ((var34 + 6) / 8); var37++) {
                for (int var38 = (var29 - 6) / 8; var38 <= ((var29 + 6) / 8); var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var35 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class127.field2221[var36] = var39;
                        class271.field4415[var36] = -1;
                        class194.field3267[var36] = -1;
                        class190.field3227[var36] = -1;
                        class133.field2277[var36] = -1;
                    } else {
                        class127.field2221[var36] = var39;
                        class271.field4415[var36] = class162.field2727.method1402(arg0 + 11432, "m" + var37 + "_" + var38);
                        class194.field3267[var36] = class162.field2727.method1402(-74, "l" + var37 + "_" + var38);
                        class190.field3227[var36] = class162.field2727.method1402(class115.method856(arg0, 11613), "um" + var37 + "_" + var38);
                        class133.field2277[var36] = class162.field2727.method1402(arg0 + 11422, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class1.method3(var34, var29, var33, var26, arg0 + 11670, var27, var28, false);
            return;
        }
        int var2 = class342.field5413.method996(6107);
        int var3 = class342.field5413.method1011(arg0 ^ 0x52EA);
        int var4 = class342.field5413.method1005((byte) 122);
        class342.field5413.method297((byte) 80);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class342.field5413.method295((byte) -88, 1);
                    if (var8 == 1) {
                        class71.field1308[var5][var6][var7] = class342.field5413.method295((byte) -112, 26);
                    } else {
                        class71.field1308[var5][var6][var7] = -1;
                    }
                }
            }
        }
        class342.field5413.method298((byte) 30);
        int var9 = (class205.field3414 - class342.field5413.field2435) / 16;
        class20.field533 = new int[var9][4];
        for (int var10 = 0; var10 < var9; var10++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class20.field533[var10][var11] = class342.field5413.method1004(3);
            }
        }
        boolean var12 = class238.method1658(9325, class342.field5413.method1005((byte) 122));
        int var13 = class342.field5413.method1011(arg0 - 21226);
        int var14 = class342.field5413.method996(6107);
        class176.field2919 = null;
        class190.field3227 = new int[var9];
        class341.field5405 = new byte[var9][];
        class133.field2277 = new int[var9];
        class127.field2221 = new int[var9];
        class194.field3267 = new int[var9];
        class148.field2516 = new byte[var9][];
        class271.field4415 = new int[var9];
        class21.field540 = new byte[var9][];
        class46.field920 = new byte[var9][];
        int var15 = 0;
        class132.field2272 = (byte[][]) null;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class71.field1308[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 14 & 0x3FF;
                        int var21 = var19 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class127.field2221[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class127.field2221[var15] = var22;
                            int var24 = (var22 & 0xFF61) >> 8;
                            int var25 = var22 & 0xFF;
                            class271.field4415[var15] = class162.field2727.method1402(-75, "m" + var24 + "_" + var25);
                            class194.field3267[var15] = class162.field2727.method1402(-121, "l" + var24 + "_" + var25);
                            class190.field3227[var15] = class162.field2727.method1402(class115.method856(arg0, 11598), "um" + var24 + "_" + var25);
                            class133.field2277[var15] = class162.field2727.method1402(-93, "ul" + var24 + "_" + var25);
                            var15++;
                        }
                    }
                }
            }
        }
        class1.method3(var3, var13, var12, var4, 128, var2, var14, false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I", line = 309)
    public final int[][] method122(int arg0, int arg1) {
        field4741++;
        if (arg1 != 4944) {
            this.method122(-52, -71);
        }
        int[][] var3 = this.field3152.method1953(arg0, 84);
        if (this.field3152.field4493) {
            int[] var4 = this.method1292(arg0 - 1 & class194.field3266, 0, -85);
            int[] var5 = this.method1292(arg0, 0, -87);
            int[] var6 = this.method1292(arg0 + 1 & class194.field3266, 0, -77);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class26.field672; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field4744;
                int var12 = var11 >> 12;
                int var13 = (var5[class53.field1056 & var10 + 1] - var5[class53.field1056 & var10 - 1]) * this.field4744;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 * var12 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var18 = var13 / var17;
                    var20 = var11 / var17;
                }
                if (this.field4745) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var9[var10] = var18;
                var8[var10] = var20;
                var7[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Loe;IB)V", line = 396)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            method2079(46);
        }
        if (arg1 == 0) {
            this.field4744 = arg0.method989(124);
        } else if (arg1 == 1) {
            this.field4745 = arg0.method1005((byte) 122) == 1;
        }
        field4743++;
    }
}
