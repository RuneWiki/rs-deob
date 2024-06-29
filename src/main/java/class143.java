import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class143 {

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    private int field1584 = -1;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    private int field1583 = 0;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lgk;")
    private class616 field1581 = new class616();

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "Z")
    public boolean field1592 = false;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "[Ltca;")
    private class144[] field1590;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[[I")
    private int[][] field1579;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Lq;")
    public static class490 field1593;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI)I")
    public static final int method785(int arg0, byte arg1, int arg2) {
        field1578++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 23) {
            method787((byte) 61, -112, 93);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([[[Lru;IBZII)Z")
    public static final boolean method786(class499[][][] arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field1580++;
        byte var6 = arg3 ? 1 : (byte) (class330.field4057 & 0xFF);
        if (class125.field1420[class169.field1888][arg5][arg4] == var6) {
            return false;
        } else if ((class16.field131[class169.field1888][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class442.field6248[var7] = arg5;
            int var8 = 0;
            int var35 = var7 + 1;
            class241.field2996[var7] = arg4;
            class125.field1420[class169.field1888][arg5][arg4] = var6;
            while (var35 != var8) {
                int var9 = class442.field6248[var8] & 0xFFFF;
                int var10 = (class442.field6248[var8] & 0xFF7117) >> 16;
                int var11 = class442.field6248[var8] >> 24 & 0xFF;
                int var12 = class241.field2996[var8] & 0xFFFF;
                int var13 = (class241.field2996[var8] & 0xFF7DED) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class16.field131[class169.field1888][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class169.field1888 + 1; var16 <= 3; var16++) {
                    if ((class16.field131[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field7218 != null) {
                                int var20 = class617.method3444(-19151, var10);
                                if (arg0[var16][var9][var12].field7218.field6646 == var20 || arg0[var16][var9][var12].field7223 != null && arg0[var16][var9][var12].field7223.field6646 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class617.method3444(-19151, var11);
                                    if (arg0[var16][var9][var12].field7218.field6646 == var21 || arg0[var16][var9][var12].field7223 != null && arg0[var16][var9][var12].field7223.field6646 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class617.method3444(-19151, var13);
                                    if (arg0[var16][var9][var12].field7218.field6646 == var22 || arg0[var16][var9][var12].field7223 != null && arg0[var16][var9][var12].field7223.field6646 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class499 var23 = arg0[var16][var9][var12];
                            if (var23.field7215 != null) {
                                for (class245 var24 = var23.field7215; var24 != null; var24 = var24.field3027) {
                                    class613 var25 = var24.field3029;
                                    if (var25 instanceof class49) {
                                        class49 var26 = (class49) var25;
                                        int var27 = var26.method241((byte) 29);
                                        int var28 = var26.method237(false);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class499 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field7215 != null) {
                            for (class245 var31 = var30.field7215; var31 != null; var31 = var31.field3027) {
                                class613 var32 = var31.field3029;
                                if (var32.field8635 != var32.field8634 || var32.field8630 != var32.field8627) {
                                    for (int var33 = var32.field8635; var33 <= var32.field8634; var33++) {
                                        for (int var34 = var32.field8627; var34 <= var32.field8630; var34++) {
                                            class125.field1420[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class125.field1420[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class156.field1743[class169.field1888 + 1].method1608(var12, 840, var9);
                    if (class309.field3823[arg1] < var17) {
                        class309.field3823[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (class3.field34[arg1] > var18) {
                        class3.field34[arg1] = var18;
                    } else if (var18 > class277.field3448[arg1]) {
                        class277.field3448[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class397.field5361[arg1]) {
                        class397.field5361[arg1] = var19;
                    } else if (class692.field9719[arg1] < var19) {
                        class692.field9719[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class125.field1420[class169.field1888][var9 - 1][var12] != var6) {
                        class442.field6248[var35] = class422.method2436(class422.method2436(1179648, var9 - 1), -754974720);
                        class241.field2996[var35] = class422.method2436(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class125.field1420[class169.field1888][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class140.field1550;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class125.field1420[class169.field1888][var9 - 1][var12] != var6 && (class16.field131[class169.field1888][var9][var12] & 0x4) == 0 && (class16.field131[class169.field1888][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class442.field6248[var35] = class422.method2436(1375731712, class422.method2436(var9 - 1, 1179648));
                            class241.field2996[var35] = class422.method2436(var12, 1245184);
                            class125.field1420[class169.field1888][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class125.field1420[class169.field1888][var9][var12] != var6) {
                            class442.field6248[var35] = class422.method2436(318767104, class422.method2436(var9, 5373952));
                            class241.field2996[var35] = class422.method2436(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class125.field1420[class169.field1888][var9][var12] = var6;
                        }
                        if (class142.field1574 > var9 + 1 && class125.field1420[class169.field1888][var9 + 1][var12] != var6 && (class16.field131[class169.field1888][var9][var12] & 0x4) == 0 && (class16.field131[class169.field1888][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class442.field6248[var35] = class422.method2436(-1845493760, class422.method2436(5373952, var9 + 1));
                            class241.field2996[var35] = class422.method2436(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class125.field1420[class169.field1888][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class142.field1574 && class125.field1420[class169.field1888][var9 + 1][var12] != var6) {
                        class442.field6248[var35] = class422.method2436(class422.method2436(var9 + 1, 9568256), 1392508928);
                        class241.field2996[var35] = class422.method2436(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class125.field1420[class169.field1888][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class125.field1420[class169.field1888][var9 - 1][var12] != var6 && (class16.field131[class169.field1888][var9][var12] & 0x4) == 0 && (class16.field131[class169.field1888][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class442.field6248[var35] = class422.method2436(class422.method2436(var9 - 1, 13762560), 301989888);
                            class241.field2996[var35] = class422.method2436(var12, 13828096);
                            class125.field1420[class169.field1888][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class125.field1420[class169.field1888][var9][var12] != var6) {
                            class442.field6248[var35] = class422.method2436(-1828716544, class422.method2436(var9, 13762560));
                            class241.field2996[var35] = class422.method2436(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class125.field1420[class169.field1888][var9][var12] = var6;
                        }
                        if (class142.field1574 > (var9 + 1) && class125.field1420[class169.field1888][var9 + 1][var12] != var6 && (class16.field131[class169.field1888][var9][var12] & 0x4) == 0 && (class16.field131[class169.field1888][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class442.field6248[var35] = class422.method2436(-771751936, class422.method2436(var9 + 1, 9568256));
                            class241.field2996[var35] = class422.method2436(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class125.field1420[class169.field1888][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg2 >= -70) {
                return false;
            }
            if (class309.field3823[arg1] != -1000000) {
                class309.field3823[arg1] += 40;
                class3.field34[arg1] -= 512;
                class277.field3448[arg1] += 512;
                class692.field9719[arg1] += 512;
                class397.field5361[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)Z")
    public static final boolean method787(byte arg0, int arg1, int arg2) {
        field1585++;
        if (arg0 != 48) {
            field1593 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZLnp;)Ljava/lang/String;")
    public static final String method788(boolean arg0, class115 arg1) {
        if (!arg0) {
            method786(null, 122, (byte) 50, true, -39, -76);
        }
        field1591++;
        return class347.method2066(32767, arg1, (byte) -100);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[I")
    public final int[] method789(int arg0, byte arg1) {
        field1588++;
        int var3 = -14 % ((arg1 - 60) / 62);
        if (this.field1586 == this.field1577) {
            this.field1592 = this.field1590[arg0] == null;
            this.field1590[arg0] = class340.field4285;
            return this.field1579[arg0];
        } else if (this.field1577 == 1) {
            this.field1592 = this.field1584 != arg0;
            this.field1584 = arg0;
            return this.field1579[0];
        } else {
            class144 var4 = this.field1590[arg0];
            if (var4 == null) {
                this.field1592 = true;
                if (this.field1583 >= this.field1577) {
                    class144 var5 = (class144) this.field1581.method3432(-46);
                    var4 = new class144(arg0, var5.field1596);
                    this.field1590[var5.field1594] = null;
                    var5.method1922(98);
                } else {
                    var4 = new class144(arg0, this.field1583);
                    this.field1583++;
                }
                this.field1590[arg0] = var4;
            } else {
                this.field1592 = false;
            }
            this.field1581.method3437((byte) 91, var4);
            return this.field1579[var4.field1596];
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public final void method790(int arg0) {
        for (int var2 = arg0; var2 < this.field1577; var2++) {
            this.field1579[var2] = null;
        }
        field1587++;
        this.field1590 = null;
        this.field1579 = null;
        this.field1581.method3438(16);
        this.field1581 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)[[I")
    public final int[][] method791(int arg0) {
        field1582++;
        if (this.field1586 != this.field1577) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 1) {
            for (int var2 = 0; var2 < this.field1577; var2++) {
                this.field1590[var2] = class340.field4285;
            }
            return this.field1579;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public static void method792(int arg0) {
        field1593 = null;
        if (arg0 < 42) {
            field1589 = 51;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(III)V")
    public class143(int arg0, int arg1, int arg2) {
        this.field1577 = arg0;
        this.field1586 = arg1;
        this.field1590 = new class144[this.field1586];
        this.field1579 = new int[this.field1577][arg2];
    }
}
