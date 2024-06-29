import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class249 extends class334 {

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lcg;")
    public static class10 field4038 = new class10(7, 0, 1, 1);

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lru;")
    public static class177 field4049 = new class177(16);

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Lbi;")
    public static class104 field4052 = new class104(79, 10);

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4053 = 2;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[Ltn;")
    public class124[] field4046;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[[B")
    private byte[][] field4048;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Z")
    public final boolean method1720(byte arg0, int arg1) {
        field4042++;
        if (arg0 >= -1) {
            this.method1720((byte) 51, -107);
        }
        return this.field4046[arg1].field1683;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
    public final boolean method1721(int arg0, int arg1) {
        int var3 = -101 % ((72 - arg1) / 32);
        field4039++;
        return this.field4046[arg0].field1689;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    public static void method1722(boolean arg0) {
        field4038 = null;
        field4049 = null;
        if (arg0) {
            field4052 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
    public final boolean method1723(int arg0) {
        field4040++;
        if (this.field4046 != null) {
            return true;
        }
        if (this.field4048 == null) {
            if (!class19.field196.method1002(1, this.field4043)) {
                return false;
            }
            int[] var2 = class19.field196.method1016(this.field4043, 1);
            this.field4048 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4048[var3] = class19.field196.method1004(this.field4043, false, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4048.length; var5++) {
            byte[] var15 = this.field4048[var5];
            int var16 = var15[0] & 0xFF << 8 | var15[1] & 0xFF;
            var4 &= class377.field5796.method1012(var16, true);
        }
        if (!var4) {
            return false;
        }
        class317 var6 = new class317();
        int var7 = class19.field196.method1008(this.field4043, (byte) -21);
        this.field4046 = new class124[var7];
        int[] var8 = class19.field196.method1016(this.field4043, 1);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var11 = this.field4048[var9];
            int var12 = (var11[0] & 0xFF) << 8 | var11[1] & 0xFF;
            class231 var13 = null;
            for (class231 var14 = (class231) var6.method2123(-113); var14 != null; var14 = (class231) var6.method2126((byte) 61)) {
                if (var14.field3823 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class231(var12, class377.field5796.method1010(var12, (byte) 115));
                var6.method2124(var13, (byte) -68);
            }
            this.field4046[var8[var9]] = new class124(var11, var13);
        }
        int var10 = -90 % ((-arg0 - 30) / 41);
        this.field4048 = null;
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
    public static final void method1724(boolean arg0) {
        class116.field1616 = new class206(8);
        field4050++;
        class61.field953 = 0;
        for (class356 var1 = (class356) class518.field7685.method2616(255); var1 != null; var1 = (class356) class518.field7685.method2619(255)) {
            var1.method2358();
        }
        if (arg0) {
            field4053 = -25;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
    public static final boolean method1725(int arg0, int arg1, int arg2) {
        if (arg0 != -16698) {
            field4047 = -79;
        }
        field4045++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)Z")
    public final boolean method1726(int arg0, int arg1) {
        if (arg1 != 65280) {
            method1725(-68, 89, -94);
        }
        field4037++;
        return this.field4046[arg0].field1679;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class249(int arg0) {
        this.field4043 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static final void method1727(int arg0) {
        field4041++;
        if (arg0 < 117) {
            return;
        }
        for (int var1 = 0; var1 < class486.field7371; var1++) {
            class17 var2 = class357.field5540[var1];
            boolean var3 = false;
            if (var2.field171 == null) {
                var2.field179--;
                if (var2.field179 < (var2.field184 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field184 == 1 && var2.field175 == null) {
                        var2.field175 = class230.method1647(class300.field4717, var2.field172, 0);
                        if (var2.field175 == null) {
                            continue;
                        }
                        var2.field179 += var2.field175.method1645();
                    } else if (var2.field184 == 2 && (var2.field183 == null || var2.field177 == null)) {
                        if (var2.field183 == null) {
                            var2.field183 = class40.method238(class116.field1621, var2.field172);
                        }
                        if (var2.field183 == null) {
                            continue;
                        }
                        if (var2.field177 == null) {
                            var2.field177 = var2.field183.method234(new int[] { 22050 });
                            if (var2.field177 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field179 < 0) {
                        int var11;
                        if (var2.field173 == 0) {
                            var11 = class141.field1911.field6109 * var2.field176 >> 8;
                        } else {
                            int var4 = var2.field173 >> 24 & 0x3;
                            if (class358.field5565.field6419 == var4) {
                                int var5 = var2.field173 & 0xFF << 7;
                                int var6 = (var2.field173 & 0xFFE635) >> 16;
                                int var7 = (var6 << 7) + 64 - class358.field5565.field6417;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var2.field173 >> 8 & 0xFF;
                                int var9 = (var8 << 7) - (class358.field5565.field6410 - 64);
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var9 + var7 - 128;
                                if (var5 < var10) {
                                    var2.field179 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = (var5 - var10) * var2.field176 * class141.field1911.field6100 / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class391 var12 = null;
                            if (var2.field184 == 1) {
                                var12 = var2.field175.method1646().method2497(class73.field1105);
                            } else if (var2.field184 == 2) {
                                var12 = var2.field177;
                            }
                            class394 var13 = var2.field171 = class394.method2524(var12, 100, var11);
                            var13.method2521(var2.field174 - 1);
                            class411.field6231.method480(var13);
                        }
                    }
                }
            } else if (!var2.field171.method3147(126)) {
                var3 = true;
            }
            if (var3) {
                class486.field7371--;
                for (int var14 = var1; var14 < class486.field7371; var14++) {
                    class357.field5540[var14] = class357.field5540[var14 + 1];
                }
                var1--;
            }
        }
        if (class5.field55 && !class285.method1928((byte) -75)) {
            if (class141.field1911.field6112 != 0 && class236.field3874 != -1) {
                class50.method358(class236.field3874, class305.field4799, class141.field1911.field6112, 23618, false, 0);
            }
            class5.field55 = false;
        } else if (class141.field1911.field6112 != 0 && class236.field3874 != -1 && !class285.method1928((byte) -128)) {
            class81.method578((byte) 66, class536.field7853);
            client.field1055++;
            class170.field2488.method1477(65280, class236.field3874);
            class236.field3874 = -1;
        }
    }
}
