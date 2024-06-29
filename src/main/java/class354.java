import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class354 extends class197 {

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
    public boolean field4898 = false;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Z")
    public boolean field4902 = false;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    public static int[] field4901 = new int[14];

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Lh;")
    public static class434 field4906 = new class434(80, 2);

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lr;BLr;)V")
    public static final void method2179(class110 arg0, byte arg1, class110 arg2) {
        class107.field1607 = arg2;
        class291.field3911 = arg0;
        if (arg1 < 20) {
            method2179((class110) null, (byte) 45, (class110) null);
        }
        field4899++;
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V")
    public static void method2180(int arg0) {
        field4901 = null;
        if (arg0 != -29584) {
            field4906 = null;
        }
        field4906 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([[[Lf;ZIIII)Z")
    public static final boolean method2181(class491[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4905++;
        byte var6 = arg1 ? 1 : (byte) (class67.field911 & 0xFF);
        if (class191.field2589[class373.field5104][arg3][arg4] == var6) {
            return false;
        } else if ((class1.field26[class373.field5104][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class343.field4599[var7] = arg3;
            if (arg2 != 14818) {
                field4906 = null;
            }
            int var8 = 0;
            int var35 = var7 + 1;
            class37.field550[var7] = arg4;
            class191.field2589[class373.field5104][arg3][arg4] = var6;
            while (var35 != var8) {
                int var9 = class343.field4599[var8] & 0xFFFF;
                int var10 = class343.field4599[var8] >> 16 & 0xFF;
                int var11 = class343.field4599[var8] >> 24 & 0xFF;
                int var12 = class37.field550[var8] & 0xFFFF;
                int var13 = (class37.field550[var8] & 0xFFD9EB) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class1.field26[class373.field5104][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class373.field5104 + 1; var16 <= 3; var16++) {
                    if ((class1.field26[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field6864 != null) {
                                int var20 = class487.method2826(true, var10);
                                if (arg0[var16][var9][var12].field6864.field4359 == var20 || arg0[var16][var9][var12].field6847 != null && arg0[var16][var9][var12].field6847.field4359 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class487.method2826(true, var11);
                                    if (arg0[var16][var9][var12].field6864.field4359 == var21 || arg0[var16][var9][var12].field6847 != null && arg0[var16][var9][var12].field6847.field4359 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class487.method2826(true, var13);
                                    if (arg0[var16][var9][var12].field6864.field4359 == var22 || arg0[var16][var9][var12].field6847 != null && arg0[var16][var9][var12].field6847.field4359 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class491 var23 = arg0[var16][var9][var12];
                            if (var23.field6845 != null) {
                                for (class309 var24 = var23.field6845; var24 != null; var24 = var24.field4084) {
                                    class471 var25 = var24.field4091;
                                    if (var25 instanceof class381) {
                                        class381 var26 = (class381) var25;
                                        int var27 = var26.method4(arg2 ^ 0xFFFFEFB4);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method9(-769);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class491 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field6845 != null) {
                            for (class309 var31 = var30.field6845; var31 != null; var31 = var31.field4084) {
                                class471 var32 = var31.field4091;
                                if (var32.field6505 != var32.field6500 || var32.field6497 != var32.field6491) {
                                    for (int var33 = var32.field6500; var33 <= var32.field6505; var33++) {
                                        for (int var34 = var32.field6491; var34 <= var32.field6497; var34++) {
                                            class191.field2589[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class191.field2589[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class221.field2945[class373.field5104 + 1].method371(var9, var12);
                    if (class138.field2006[arg5] < var17) {
                        class138.field2006[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class97.field1420[arg5] > var18) {
                        class97.field1420[arg5] = var18;
                    } else if (class121.field1774[arg5] < var18) {
                        class121.field1774[arg5] = var18;
                    }
                    if (var19 < class127.field1866[arg5]) {
                        class127.field1866[arg5] = var19;
                    } else if (class108.field1612[arg5] < var19) {
                        class108.field1612[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class191.field2589[class373.field5104][var9 - 1][var12] != var6) {
                        class343.field4599[var35] = class21.method133(class21.method133(1179648, var9 - 1), -754974720);
                        class37.field550[var35] = class21.method133(var12, 1245184);
                        class191.field2589[class373.field5104][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class39.field567 > var12) {
                        if ((var9 - 1) >= 0 && class191.field2589[class373.field5104][var9 - 1][var12] != var6 && (class1.field26[class373.field5104][var9][var12] & 0x4) == 0 && (class1.field26[class373.field5104][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class343.field4599[var35] = class21.method133(class21.method133(var9 - 1, 1179648), 1375731712);
                            class37.field550[var35] = class21.method133(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class191.field2589[class373.field5104][var9 - 1][var12] = var6;
                        }
                        if (class191.field2589[class373.field5104][var9][var12] != var6) {
                            class343.field4599[var35] = class21.method133(318767104, class21.method133(5373952, var9));
                            class37.field550[var35] = class21.method133(5439488, var12);
                            class191.field2589[class373.field5104][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class295.field3947 > (var9 + 1) && class191.field2589[class373.field5104][var9 + 1][var12] != var6 && (class1.field26[class373.field5104][var9][var12] & 0x4) == 0 && (class1.field26[class373.field5104][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class343.field4599[var35] = class21.method133(class21.method133(5373952, var9 + 1), -1845493760);
                            class37.field550[var35] = class21.method133(5439488, var12);
                            class191.field2589[class373.field5104][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class295.field3947 > var9 + 1 && class191.field2589[class373.field5104][var9 + 1][var12] != var6) {
                        class343.field4599[var35] = class21.method133(1392508928, class21.method133(9568256, var9 + 1));
                        class37.field550[var35] = class21.method133(9633792, var12);
                        class191.field2589[class373.field5104][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class191.field2589[class373.field5104][var9 - 1][var12] != var6 && (class1.field26[class373.field5104][var9][var12] & 0x4) == 0 && (class1.field26[class373.field5104][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class343.field4599[var35] = class21.method133(class21.method133(13762560, var9 - 1), 301989888);
                            class37.field550[var35] = class21.method133(var12, 13828096);
                            class191.field2589[class373.field5104][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class191.field2589[class373.field5104][var9][var12] != var6) {
                            class343.field4599[var35] = class21.method133(-1828716544, class21.method133(13762560, var9));
                            class37.field550[var35] = class21.method133(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class191.field2589[class373.field5104][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class295.field3947 && class191.field2589[class373.field5104][var9 + 1][var12] != var6 && (class1.field26[class373.field5104][var9][var12] & 0x4) == 0 && (class1.field26[class373.field5104][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class343.field4599[var35] = class21.method133(class21.method133(9568256, var9 + 1), -771751936);
                            class37.field550[var35] = class21.method133(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class191.field2589[class373.field5104][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class138.field2006[arg5] != -1000000) {
                class138.field2006[arg5] += 10;
                class97.field1420[arg5] -= 50;
                class121.field1774[arg5] += 50;
                class108.field1612[arg5] += 50;
                class127.field1866[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIZZ)V")
    public class354(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4898 = arg4;
        this.field4904 = arg0;
        this.field4902 = arg3;
        this.field4897 = arg1;
        this.field4900 = arg2;
    }
}
