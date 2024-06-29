import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class208 extends class187 {

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public int field3309 = 0;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public int field3320 = -1;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static volatile int field3306 = 0;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[Ljj;")
    public static class80[] field3313 = new class80[32768];

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Lng;")
    public static class245 field3317;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1398(byte arg0) {
        field3321++;
        if (class138.field2147) {
            return;
        }
        class138.field2147 = true;
        class171.field2602 = true;
        if (arg0 >= -8) {
            field3313 = (class80[]) null;
        }
        if (class298.field4569) {
            class309.field4866 = (float) ((int) class309.field4866 - 17 & 0xFFFFFFF0);
        } else {
            class207.field3125 += (-12.0F - class207.field3125) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 45)
    public static final void method1399(int arg0) {
        Container var1;
        if (class63.field919 != null) {
            var1 = class63.field919;
        } else if (class261.field4045 == null) {
            var1 = class89.field1359.field3569;
        } else {
            var1 = class261.field4045;
        }
        field3310++;
        class312.field4943 = var1.getSize().width;
        class136.field2112 = var1.getSize().height;
        if (class261.field4045 == var1) {
            Insets var2 = class261.field4045.getInsets();
            class312.field4943 -= var2.right + var2.left;
            class136.field2112 -= var2.top + var2.bottom;
        }
        if (class166.method1132(false) < 2) {
            class334.field5203 = 765;
            class128.field1996 = 0;
            class143.field2278 = (class312.field4943 - 765) / 2;
            class174.field2644 = 503;
        } else {
            class128.field1996 = 0;
            class174.field2644 = class136.field2112;
            class334.field5203 = class312.field4943;
            class143.field2278 = 0;
        }
        if (class333.field5166) {
            class333.method2317(class334.field5203, class174.field2644);
        }
        class302.field4665.setSize(class334.field5203, class174.field2644);
        if (class261.field4045 == var1) {
            Insets var3 = class261.field4045.getInsets();
            class302.field4665.setLocation(class143.field2278 + var3.left, class128.field1996 + var3.top);
        } else {
            class302.field4665.setLocation(class143.field2278, class128.field1996);
        }
        if (class253.field3936 != -1) {
            class221.method1479(true, 12918);
        }
        class95.method649(arg0 ^ 0x356E);
        if (arg0 != -765) {
            field3307 = 86;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILgn;)V", line = 117)
    public static final void method1400(int arg0, class303 arg1) {
        if (arg0 != 8) {
            field3317 = (class245) null;
        }
        field3312++;
        while (true) {
            while (arg1.field4679 < arg1.field4716.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method2043((byte) -126) == 1) {
                    var4 = arg1.method2043((byte) -114);
                    var3 = arg1.method2043((byte) -126);
                    var2 = true;
                }
                int var5 = arg1.method2043((byte) -108);
                int var6 = arg1.method2043((byte) -119);
                int var7 = var5 * 64 - class78.field1161;
                int var8 = class338.field5233 + class129.field2021 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class204.field3088 && class129.field2021 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && var4 * 8 + 8 > var11 && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                int var13 = arg1.method2043((byte) -115);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method2043((byte) -111);
                                        if (class34.field435[var10][var9] == null) {
                                            class34.field435[var10][var9] = new byte[4096];
                                        }
                                        class34.field435[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method2059(255);
                                        if (class128.field1993[var10][var9] == null) {
                                            class128.field1993[var10][var9] = new int[4096];
                                        }
                                        class128.field1993[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method2059(255);
                                        if (class163.field2519[var10][var9] == null) {
                                            class163.field2519[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class17 var17 = class277.method1819((byte) 127, var16);
                                        if (var17.field195 != null) {
                                            var17 = var17.method139(-1);
                                            if (var17 == null || var17.field205 == -1) {
                                                continue;
                                            }
                                        }
                                        class163.field2519[var10][var9][(63 - var12 << 6) + var11] = var17.field196 + 1;
                                        class282 var18 = new class282();
                                        var18.field4333 = var8;
                                        var18.field4339 = var17.field205;
                                        var18.field4334 = var7;
                                        class155.field2431.method7((byte) -51, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method2043((byte) -124);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field4679++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field4679 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field4679 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 273)
    public static void method1401(int arg0) {
        field3317 = null;
        if (arg0 > -101) {
            method1401(54);
        }
        field3313 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Lwf;I)V", line = 289)
    public static final void method1402(class306 arg0, int arg1) {
        field3324++;
        class136.field2116 = arg0;
        class87.field1311 = class136.field2116.method2086(0, 4);
        if (arg1 >= -30) {
            method1400(125, (class303) null);
        }
    }
}
