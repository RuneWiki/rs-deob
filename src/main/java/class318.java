import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class318 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4857 = 0;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field4860 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILkm;I)[Lkn;", line = 5)
    public static final class178[] method2229(int arg0, int arg1, class133 arg2, int arg3) {
        field4859++;
        if (class129.method931(arg0, arg3, arg2, (byte) 89)) {
            return arg1 >= -90 ? (class178[]) null : class337.method2338(120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V", line = 21)
    public static final void method2230(boolean arg0, boolean arg1) {
        field4854++;
        class45.field552 = arg0;
        if (!arg1) {
            method2232(125, -4);
        }
        if (!class45.field552) {
            int var26 = class157.field2165.method2190((byte) 126);
            int var27 = class157.field2165.method2160(81);
            int var28 = (class199.field2833 - class157.field2165.field4777) / 16;
            class47.field589 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var30 = 0; var30 < 4; var30++) {
                    class47.field589[var29][var30] = class157.field2165.method2172((byte) 71);
                }
            }
            int var31 = class157.field2165.method2168((byte) -116);
            boolean var32 = class103.method757(class157.field2165.method2204(90), !arg1);
            int var33 = class157.field2165.method2220((byte) 94);
            boolean var34 = false;
            if (((var26 / 8) == 48 || var26 / 8 == 49) && var27 / 8 == 48) {
                var34 = true;
            }
            int var35 = class157.field2165.method2219(16448);
            class66.field867 = new int[var28];
            class11.field119 = new int[var28];
            class266.field3883 = (byte[][]) null;
            class256.field3702 = new int[var28];
            class37.field425 = new byte[var28][];
            class231.field3270 = new byte[var28][];
            class71.field964 = new byte[var28][];
            class202.field2866 = new int[var28];
            if (var26 / 8 == 48 && (var27 / 8) == 148) {
                var34 = true;
            }
            class41.field468 = new byte[var28][];
            class203.field2905 = new int[var28];
            int var36 = 0;
            class7.field58 = null;
            for (int var37 = (var26 - 6) / 8; var37 <= ((var26 + 6) / 8); var37++) {
                for (int var38 = (var27 - 6) / 8; var38 <= (var27 + 6) / 8; var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var34 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class256.field3702[var36] = var39;
                        class11.field119[var36] = -1;
                        class202.field2866[var36] = -1;
                        class203.field2905[var36] = -1;
                        class66.field867[var36] = -1;
                    } else {
                        class256.field3702[var36] = var39;
                        class11.field119[var36] = class92.field1281.method964(11, "m" + var37 + "_" + var38);
                        class202.field2866[var36] = class92.field1281.method964(121, "l" + var37 + "_" + var38);
                        class203.field2905[var36] = class92.field1281.method964(125, "um" + var37 + "_" + var38);
                        class66.field867[var36] = class92.field1281.method964(114, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class85.method661(var26, 13184, false, var32, var31, var35, var33, var27);
            return;
        }
        int var2 = class157.field2165.method2190((byte) 123);
        int var3 = class157.field2165.method2168((byte) -117);
        class157.field2165.method2240(8);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class157.field2165.method2242(1, -14970);
                    if (var7 == 1) {
                        class199.field2840[var4][var5][var6] = class157.field2165.method2242(26, -14970);
                    } else {
                        class199.field2840[var4][var5][var6] = -1;
                    }
                }
            }
        }
        class157.field2165.method2233(8);
        int var8 = (class199.field2833 - class157.field2165.field4777) / 16;
        class47.field589 = new int[var8][4];
        for (int var9 = 0; var9 < var8; var9++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class47.field589[var9][var10] = class157.field2165.method2172((byte) 71);
            }
        }
        int var11 = class157.field2165.method2204(124);
        int var12 = class157.field2165.method2160(110);
        boolean var13 = class103.method757(class157.field2165.method2176(9639), !arg1);
        int var14 = class157.field2165.method2220((byte) 52);
        class71.field964 = new byte[var8][];
        class231.field3270 = new byte[var8][];
        class37.field425 = new byte[var8][];
        class266.field3883 = (byte[][]) null;
        class256.field3702 = new int[var8];
        class41.field468 = new byte[var8][];
        class7.field58 = null;
        class66.field867 = new int[var8];
        class203.field2905 = new int[var8];
        class202.field2866 = new int[var8];
        class11.field119 = new int[var8];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class199.field2840[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 14 & 0x3FF;
                        int var21 = (var19 & 0x3FF9) >> 3;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class256.field3702[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            int var24 = var22 >> 8 & 0xFF;
                            class256.field3702[var15] = var22;
                            int var25 = var22 & 0xFF;
                            class11.field119[var15] = class92.field1281.method964(51, "m" + var24 + "_" + var25);
                            class202.field2866[var15] = class92.field1281.method964(31, "l" + var24 + "_" + var25);
                            class203.field2905[var15] = class92.field1281.method964(43, "um" + var24 + "_" + var25);
                            class66.field867[var15] = class92.field1281.method964(107, "ul" + var24 + "_" + var25);
                            var15++;
                        }
                    }
                }
            }
        }
        class85.method661(var12, 13184, false, var13, var2, var11, var14, var3);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILkm;)V", line = 283)
    public static final void method2231(int arg0, class133 arg1) {
        class23.field297 = arg1;
        class26.field331 = class23.field297.method970(-74, 16);
        field4856++;
        if (arg0 != 8324) {
            field4860 = 43;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 296)
    public static final void method2232(int arg0, int arg1) {
        field4858++;
        if (arg1 != 10) {
            method2231(-37, (class133) null);
        }
        class248.field3574.method720(arg0, 1088);
        class276.field4141.method720(arg0, 1088);
    }
}
