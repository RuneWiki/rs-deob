import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class31 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field583 = 2;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field584 = 5;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field588 = 99;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field586 = -1;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field595 = -1;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field581 = -1;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field602 = -1;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field599 = -1;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Z")
    public boolean field609 = false;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lia;")
    public static class257 field600 = class28.method234(-18, "hint_headicons");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lia;")
    public static class257 field594 = class28.method234(-37, " <col=ffffff>");

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field611 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
    public int[] field589;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[I")
    public int[] field603;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    private int[] field606;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
    private int[] field608;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[[I")
    public int[][] field604;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLk;)V")
    private final void method256(int arg0, boolean arg1, class152 arg2) {
        field593++;
        if (arg0 == 1) {
            int var13 = arg2.method1063(-17162);
            this.field603 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field603[var14] = arg2.method1063(-17162);
            }
            this.field589 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field589[var15] = arg2.method1063(-17162);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field589[var16] += arg2.method1063(-17162) << 16;
            }
        } else if (arg0 == 2) {
            this.field586 = arg2.method1063(-17162);
        } else if (arg0 == 3) {
            int var4 = arg2.method1051((byte) 83);
            this.field606 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field606[var5] = arg2.method1051((byte) 118);
            }
            this.field606[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field609 = true;
        } else if (arg0 == 5) {
            this.field584 = arg2.method1051((byte) 84);
        } else if (arg0 == 6) {
            this.field581 = arg2.method1063(-17162);
        } else if (arg0 == 7) {
            this.field602 = arg2.method1063(-17162);
        } else if (arg0 == 8) {
            this.field588 = arg2.method1051((byte) -128);
        } else if (arg0 == 9) {
            this.field595 = arg2.method1051((byte) -128);
        } else if (arg0 == 10) {
            this.field599 = arg2.method1051((byte) 91);
        } else if (arg0 == 11) {
            this.field583 = arg2.method1051((byte) 90);
        } else if (arg0 == 12) {
            int var10 = arg2.method1051((byte) -64);
            this.field608 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field608[var11] = arg2.method1063(-17162);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field608[var12] += arg2.method1063(-17162) << 16;
            }
        } else if (arg0 == 13) {
            int var6 = arg2.method1063(-17162);
            this.field604 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1051((byte) 114);
                if (var8 > 0) {
                    this.field604[var7] = new int[var8];
                    this.field604[var7][0] = arg2.method1064((byte) -94);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field604[var7][var9] = arg2.method1063(-17162);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field587 = true;
        }
        if (arg1) {
            this.field586 = -40;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lk;Z)V")
    public final void method257(class152 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1051((byte) -75);
            if (var3 == 0) {
                field597++;
                return;
            }
            this.method256(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public static final boolean method258(int arg0, int arg1) {
        field590++;
        if (class255.field4363[arg0]) {
            return true;
        } else if (class78.field1515.method1222((byte) -116, arg0)) {
            int var2 = class78.field1515.method1220((byte) -63, arg0);
            if (var2 == 0) {
                class255.field4363[arg0] = true;
                return true;
            }
            if (class28.field539[arg0] == null) {
                class28.field539[arg0] = new class44[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class28.field539[arg0][var3] == null) {
                    byte[] var4 = class78.field1515.method1197(var3, arg0, arg1 ^ 0xFFFFFFFE);
                    if (var4 != null) {
                        class28.field539[arg0][var3] = new class44();
                        class28.field539[arg0][var3].field935 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class28.field539[arg0][var3].method349(new class152(var4), 107);
                        } else {
                            class28.field539[arg0][var3].method346(new class152(var4), (byte) -127);
                        }
                    }
                }
            }
            class255.field4363[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lei;II)Lei;")
    public final class168 method259(class168 arg0, int arg1, int arg2) {
        field592++;
        int var4 = this.field589[arg2];
        class205 var5 = class94.method693(var4 >> 16, (byte) -69);
        int var6 = var4 & 0xFFFF;
        if (arg1 != 2) {
            this.field602 = -107;
        }
        if (var5 == null) {
            return arg0.method1155(true, true);
        }
        class205 var7 = null;
        int var8 = 0;
        if (this.field608 != null && arg2 < this.field608.length) {
            int var9 = this.field608[arg2];
            var7 = class94.method693(var9 >> 16, (byte) 34);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class168 var11 = arg0.method1155(!var5.method1380(var6, 651), !this.field587);
            var11.method1150(var5, var6, this.field587);
            return var11;
        } else {
            class168 var10 = arg0.method1155(!var5.method1380(var6, arg1 + 649) & !var7.method1380(var8, 651), !this.field587);
            var10.method1150(var5, var6, this.field587);
            var10.method1150(var7, var8, this.field587);
            return var10;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILfc;Lei;B)Lei;")
    public final class168 method260(int arg0, int arg1, class31 arg2, class168 arg3, byte arg4) {
        field585++;
        int var6 = this.field589[arg1];
        if (arg4 != 121) {
            this.field589 = null;
        }
        class205 var7 = class94.method693(var6 >> 16, (byte) -81);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method265(arg0, 106, arg3);
        }
        int var9 = arg2.field589[arg0];
        class205 var10 = class94.method693(var9 >> 16, (byte) 83);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class168 var12 = arg3.method1155(!var7.method1380(var8, arg4 + 530), !this.field587);
            var12.method1150(var7, var8, this.field587);
            return var12;
        } else {
            class168 var13 = arg3.method1155(!var7.method1380(var8, 651) & !var10.method1380(var11, 651), !arg2.field587 & !this.field587);
            var13.method1153(var7, var8, var10, var11, this.field606, this.field587 | arg2.field587);
            return var13;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lia;")
    public static final class257 method261(int arg0, byte arg1) {
        field605++;
        if (arg1 < 107) {
            return null;
        } else if (arg0 < 999999999) {
            return class111.method808(10, arg0);
        } else {
            return class257.field4446;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZILei;)Lei;")
    public final class168 method262(boolean arg0, int arg1, class168 arg2) {
        int var4 = this.field589[arg1];
        class205 var5 = class94.method693(var4 >> 16, (byte) 109);
        field591++;
        if (arg0) {
            this.method256(-46, false, (class152) null);
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1140(true, true);
        } else {
            class168 var7 = arg2.method1140(!var5.method1380(var6, 651), !this.field587);
            var7.method1150(var5, var6, this.field587);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method263(int arg0) {
        field582++;
        if (class166.field2900 > 1) {
            class166.field2900--;
            class145.field2541 = class111.field2038;
        }
        if (class90.field1721 > 0) {
            class90.field1721--;
        }
        if (class182.field3173) {
            class182.field3173 = false;
            class44.method345(4);
            return;
        }
        for (int var1 = 0; var1 < 100 && class181.method1240(true); var1++) {
        }
        if (class217.field3675 != 30) {
            return;
        }
        class219.method1449(236, class205.field3524, 25508);
        Object var2 = class252.field4335.field3236;
        synchronized (class252.field4335.field3236) {
            if (!class36.field720) {
                class252.field4335.field3240 = 0;
            } else if (class102.field1902 != 0 || class252.field4335.field3240 >= 40) {
                class205.field3524.method908(false, 102);
                class205.field3524.method1023(13195, 0);
                int var3 = 0;
                int var4 = class205.field3524.field2677;
                for (int var5 = 0; class252.field4335.field3240 > var5 && (class205.field3524.field2677 - var4) < 240; var5++) {
                    int var6 = class252.field4335.field3239[var5];
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class252.field4335.field3238[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class252.field4335.field3239[var5] == -1 && class252.field4335.field3238[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class115.field2068 != var7 || class131.field2344 != var6) {
                        int var9 = var7 - class115.field2068;
                        class115.field2068 = var7;
                        int var10 = var6 - class131.field2344;
                        class131.field2344 = var6;
                        if (class248.field4291 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class205.field3524.method1065((var9 << 6) + (class248.field4291 << 12) + var10, 1210792072);
                            class248.field4291 = 0;
                        } else if (class248.field4291 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class205.field3524.method1023(13195, class248.field4291 + 128);
                            var9 += 128;
                            class205.field3524.method1065((var9 << 8) + var10, 1210792072);
                            class248.field4291 = 0;
                        } else if (class248.field4291 < 32) {
                            class205.field3524.method1023(13195, class248.field4291 + 192);
                            if (var8) {
                                class205.field3524.method1066(-1687589720, Integer.MIN_VALUE);
                            } else {
                                class205.field3524.method1066(-1687589720, var7 | var6 << 16);
                            }
                            class248.field4291 = 0;
                        } else {
                            class205.field3524.method1065(class248.field4291 + 57344, 1210792072);
                            if (var8) {
                                class205.field3524.method1066(-1687589720, Integer.MIN_VALUE);
                            } else {
                                class205.field3524.method1066(-1687589720, var6 << 16 | var7);
                            }
                            class248.field4291 = 0;
                        }
                    } else if (class248.field4291 < 2047) {
                        class248.field4291++;
                    }
                }
                class205.field3524.method1074(-62, class205.field3524.field2677 - var4);
                class52.field1135++;
                if (var3 < class252.field4335.field3240) {
                    class252.field4335.field3240 -= var3;
                    for (int var11 = 0; var11 < class252.field4335.field3240; var11++) {
                        class252.field4335.field3238[var11] = class252.field4335.field3238[var3 + var11];
                        class252.field4335.field3239[var11] = class252.field4335.field3239[var3 + var11];
                    }
                } else {
                    class252.field4335.field3240 = 0;
                }
            }
        }
        if (class102.field1902 != 0) {
            class172.field2948++;
            long var12 = (class233.field4013 - class242.field4194) / 50L;
            int var14 = class74.field1430;
            int var15 = class105.field1952;
            class242.field4194 = class233.field4013;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var17 = (int) var12;
            if (class102.field1902 == 2) {
                var16 = 1;
            }
            class205.field3524.method908(false, 241);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class205.field3524.method1066(-1687589720, var15 | var14 << 16);
            class205.field3524.method1054(var16 << 15 | var17, 2);
        }
        if (class215.field3650 > 0) {
            class215.field3650--;
        }
        if (class39.field793[96] || class39.field793[97] || class39.field793[98] || class39.field793[99]) {
            class237.field4052 = true;
        }
        if (class237.field4052 && class215.field3650 <= 0) {
            class215.field3650 = 20;
            class237.field4052 = false;
            class35.field708++;
            class205.field3524.method908(false, 226);
            class205.field3524.method1054(class243.field4212, 2);
            class205.field3524.method1065(class25.field479, 1210792072);
        }
        if (class59.field1248 && !class248.field4290) {
            class248.field4290 = true;
            class205.field3524.method908(false, 173);
            class156.field2718++;
            class205.field3524.method1023(13195, 1);
        }
        if (!class59.field1248 && class248.field4290) {
            class156.field2718++;
            class248.field4290 = false;
            class205.field3524.method908(false, 173);
            class205.field3524.method1023(13195, 0);
        }
        if (!class95.field1789) {
            class205.field3524.method908(false, 57);
            class13.field244++;
            class205.field3524.method1030(class19.method174(true), -16);
            class95.field1789 = true;
        }
        class204.method1372(false);
        if (class217.field3675 != 30) {
            return;
        }
        class15.method155(-79);
        class138.method948(true);
        class87.field1694++;
        if (class87.field1694 > 750) {
            class44.method345(-121);
            return;
        }
        class12.method128(2047);
        class145.method982(true);
        class151.method1012(true);
        if (class239.field4114 != null) {
            class169.method1159(122);
        }
        for (int var18 = class129.method898(63, true); var18 != -1; var18 = class129.method898(96, false)) {
            class188.method1268(-10, var18);
            class99.field1829[class30.method252(31, class114.field2057++)] = var18;
        }
        for (class202 var19 = class255.method1663(0); var19 != null; var19 = class255.method1663(0)) {
            int var20 = var19.method1357(82);
            int var21 = var19.method1360((byte) -127);
            if (var20 == 1) {
                class221.field3740[var21] = var19.field3450;
                class139.field2477[class30.method252(31, class82.field1590++)] = var21;
            } else if (var20 == 2) {
                class133.field2385[var21] = var19.field3456;
                class83.field1628[class30.method252(31, class121.field2180++)] = var21;
            }
        }
        class171.field2935++;
        if (class81.field1570 != 0) {
            class112.field2045 += 20;
            if (class112.field2045 >= 400) {
                class81.field1570 = 0;
            }
        }
        if (class125.field2244 != null) {
            class125.field2246++;
            if (class125.field2246 >= 15) {
                class257.method1718(false, class125.field2244);
                class125.field2244 = null;
            }
        }
        if (class131.field2347 != null) {
            class257.method1718(false, class131.field2347);
            class95.field1790++;
            if (class245.field4253 > (class24.field464 + 5) || class24.field464 - 5 > class245.field4253 || class102.field1904 > (class156.field2729 + 5) || class102.field1904 < (class156.field2729 - 5)) {
                class156.field2736 = true;
            }
            if (class94.field1780 == 0) {
                if (class156.field2736 && class95.field1790 >= 5) {
                    if (class241.field4189 == class131.field2347 && class94.field1775 != class177.field3029) {
                        class116.field2083++;
                        byte var22 = 0;
                        class44 var23 = class131.field2347;
                        if (class21.field441 == 1 && var23.field949 == 206) {
                            var22 = 1;
                        }
                        if (var23.field929[class94.field1775] <= 0) {
                            var22 = 0;
                        }
                        if (class114.method819(true, client.method590(var23))) {
                            int var24 = class177.field3029;
                            int var25 = class94.field1775;
                            var23.field929[var25] = var23.field929[var24];
                            var23.field1008[var25] = var23.field1008[var24];
                            var23.field929[var24] = -1;
                            var23.field1008[var24] = 0;
                        } else if (var22 == 1) {
                            int var26 = class177.field3029;
                            int var27 = class94.field1775;
                            while (var26 != var27) {
                                if (var26 > var27) {
                                    var23.method344(var26 - 1, -115, var26);
                                    var26--;
                                } else if (var26 < var27) {
                                    var23.method344(var26 + 1, -123, var26);
                                    var26++;
                                }
                            }
                        } else {
                            var23.method344(class94.field1775, -123, class177.field3029);
                        }
                        class205.field3524.method908(false, 84);
                        class205.field3524.method1071(class131.field2347.field935, (byte) 104);
                        class205.field3524.method1018((byte) -11, class94.field1775);
                        class205.field3524.method1065(class177.field3029, 1210792072);
                        class205.field3524.method1023(13195, var22);
                    }
                } else if ((class227.field3821 == 1 || class11.method123(class199.field3407 - 1, (byte) -76)) && class199.field3407 > 2) {
                    class140.method954(0);
                } else if (class199.field3407 > 0) {
                    class227.method1486(class199.field3407 - 1, -128);
                }
                class131.field2347 = null;
                class102.field1902 = 0;
                class125.field2246 = 10;
            }
        }
        class104.field1934 = 0;
        class186.field3229 = false;
        class170.field2931 = false;
        class44 var28 = class117.field2095;
        class116.field2085 = null;
        class44 var29 = class89.field1712;
        class89.field1712 = null;
        class117.field2095 = null;
        while (class211.method1426((byte) -112) && class104.field1934 < 128) {
            class13.field250[class104.field1934] = class25.field486;
            class211.field3610[class104.field1934] = class128.field2273;
            class104.field1934++;
        }
        class239.field4114 = null;
        if (class5.field114 != -1) {
            class165.method1130(0, class5.field114, class12.field241, 0, 0, class166.field2897, (byte) 89, 0);
        }
        class111.field2038++;
        while (true) {
            class164 var30;
            class44 var31;
            class44 var32;
            do {
                var30 = (class164) class258.field4478.method285(0);
                if (var30 == null) {
                    while (true) {
                        class164 var33;
                        class44 var34;
                        class44 var35;
                        do {
                            var33 = (class164) class81.field1586.method285(0);
                            if (var33 == null) {
                                while (true) {
                                    class164 var36;
                                    class44 var37;
                                    class44 var38;
                                    do {
                                        var36 = (class164) class154.field2706.method285(0);
                                        if (var36 == null) {
                                            int var39 = -32 % ((-arg0 - 46) / 32);
                                            if (class18.field384 && class239.field4114 == null) {
                                                class18.field384 = false;
                                            }
                                            if (class78.field1516 != null) {
                                                class178.method1215((byte) 95);
                                            }
                                            if (class156.field2741 != -1) {
                                                int var40 = class156.field2741;
                                                int var41 = class108.field2021;
                                                boolean var42 = class178.method1199(class137.field2441.field4119[0], (byte) 126, var40, 0, 0, 0, var41, class137.field2441.field4182[0], 0, true, 0, 0);
                                                class156.field2741 = -1;
                                                if (var42) {
                                                    class112.field2045 = 0;
                                                    class123.field2210 = class105.field1952;
                                                    class81.field1570 = 1;
                                                    class180.field3123 = class74.field1430;
                                                }
                                            }
                                            class157.method1095(16496);
                                            if (class117.field2095 != var28) {
                                                if (var28 != null) {
                                                    class257.method1718(false, var28);
                                                }
                                                if (class117.field2095 != null) {
                                                    class257.method1718(false, class117.field2095);
                                                }
                                            }
                                            if (class89.field1712 != var29 && class54.field1160 == class177.field3014) {
                                                if (var29 != null) {
                                                    class257.method1718(false, var29);
                                                }
                                                if (class89.field1712 != null) {
                                                    class257.method1718(false, class89.field1712);
                                                }
                                            }
                                            if (class89.field1712 == null) {
                                                if (class54.field1160 > 0) {
                                                    class54.field1160--;
                                                }
                                            } else if (class54.field1160 < class177.field3014) {
                                                class54.field1160++;
                                                if (class54.field1160 == class177.field3014) {
                                                    class257.method1718(false, class89.field1712);
                                                }
                                            }
                                            if (class224.field3766 == 1) {
                                                class230.method1499(true);
                                            } else if (class224.field3766 == 2) {
                                                class241.method1579(0);
                                            } else {
                                                class172.method1174((byte) 124);
                                            }
                                            for (int var43 = 0; var43 < 5; var43++) {
                                                int var10002 = class69.field1378[var43]++;
                                            }
                                            int var44 = class199.method1337(1);
                                            int var45 = class85.method642(926530096);
                                            if (var44 > 4500 && var45 > 4500) {
                                                class205.field3512++;
                                                class90.field1721 = 250;
                                                class56.method426(4000, (byte) -123);
                                                class205.field3524.method908(false, 208);
                                            }
                                            class182.field3162++;
                                            class85.field1669++;
                                            if (class85.field1669 > 500) {
                                                class85.field1669 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x1) == 1) {
                                                    class29.field560 += class41.field838;
                                                }
                                                if ((var46 & 0x4) == 4) {
                                                    class156.field2735 += class35.field679;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class211.field3598 += class99.field1825;
                                                }
                                            }
                                            if (class211.field3598 < -55) {
                                                class99.field1825 = 2;
                                            }
                                            class151.field2613++;
                                            if (class211.field3598 > 55) {
                                                class99.field1825 = -2;
                                            }
                                            if (class29.field560 < -50) {
                                                class41.field838 = 2;
                                            }
                                            if (class29.field560 > 50) {
                                                class41.field838 = -2;
                                            }
                                            if (class156.field2735 < -40) {
                                                class35.field679 = 1;
                                            }
                                            if (class182.field3162 > 500) {
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x2) == 2) {
                                                    class95.field1796 += class46.field1051;
                                                }
                                                class182.field3162 = 0;
                                                if ((var47 & 0x1) == 1) {
                                                    class215.field3648 += class248.field4272;
                                                }
                                            }
                                            if (class215.field3648 < -60) {
                                                class248.field4272 = 2;
                                            }
                                            if (class156.field2735 > 40) {
                                                class35.field679 = -1;
                                            }
                                            if (class215.field3648 > 60) {
                                                class248.field4272 = -2;
                                            }
                                            if (class95.field1796 < -20) {
                                                class46.field1051 = 1;
                                            }
                                            if (class95.field1796 > 10) {
                                                class46.field1051 = -1;
                                            }
                                            if (class151.field2613 > 50) {
                                                class205.field3524.method908(false, 138);
                                                class150.field2584++;
                                            }
                                            class165.method1129((byte) -110);
                                            try {
                                                if (class151.field2595 != null && class205.field3524.field2677 > 0) {
                                                    class151.field2595.method1419(class205.field3524.field2677, 0, class205.field3524.field2638, 119);
                                                    class205.field3524.field2677 = 0;
                                                    class151.field2613 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var48) {
                                                class44.method345(48);
                                                return;
                                            }
                                        }
                                        var37 = var36.field2864;
                                        if (var37.field890 < 0) {
                                            break;
                                        }
                                        var38 = class221.method1456(var37.field885, (byte) -56);
                                    } while (var38 == null || var38.field1015 == null || var37.field890 >= var38.field1015.length || var38.field1015[var37.field890] != var37);
                                    class57.method441(var36, -10305);
                                }
                            }
                            var34 = var33.field2864;
                            if (var34.field890 < 0) {
                                break;
                            }
                            var35 = class221.method1456(var34.field885, (byte) -123);
                        } while (var35 == null || var35.field1015 == null || var34.field890 >= var35.field1015.length || var35.field1015[var34.field890] != var34);
                        class57.method441(var33, -10305);
                    }
                }
                var31 = var30.field2864;
                if (var31.field890 < 0) {
                    break;
                }
                var32 = class221.method1456(var31.field885, (byte) -101);
            } while (var32 == null || var32.field1015 == null || var32.field1015.length <= var31.field890 || var32.field1015[var31.field890] != var31);
            class57.method441(var30, -10305);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILei;IB)Lei;")
    public final class168 method264(int arg0, class168 arg1, int arg2, byte arg3) {
        field596++;
        int var5 = this.field589[arg2];
        class205 var6 = class94.method693(var5 >> 16, (byte) -75);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1155(true, true);
        }
        int var8 = arg0 & 0x3;
        if (arg3 != -77) {
            return null;
        }
        class168 var9 = arg1.method1155(!var6.method1380(var7, arg3 ^ 0xFFFFFD38), !this.field587);
        if (var8 == 1) {
            var9.method1148();
        } else if (var8 == 2) {
            var9.method1145();
        } else if (var8 == 3) {
            var9.method1152();
        }
        var9.method1150(var6, var7, this.field587);
        if (var8 == 1) {
            var9.method1152();
        } else if (var8 == 2) {
            var9.method1145();
        } else if (var8 == 3) {
            var9.method1148();
        }
        return var9;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILei;)Lei;")
    public final class168 method265(int arg0, int arg1, class168 arg2) {
        int var4 = this.field589[arg0];
        field612++;
        class205 var5 = class94.method693(var4 >> 16, (byte) 68);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1155(true, true);
        }
        if (arg1 <= 63) {
            this.method264(-83, (class168) null, 125, (byte) -35);
        }
        class168 var7 = arg2.method1155(!var5.method1380(var6, 651), !this.field587);
        var7.method1150(var5, var6, this.field587);
        return var7;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static final void method266(int arg0) {
        class40.field835.method25(false);
        field598++;
        class252.field4334 = null;
        class244.field4242 = 1;
        int var1 = -79 / ((arg0 + 15) / 41);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        if (arg0) {
            field594 = null;
        }
        field600 = null;
        field594 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public final void method268(int arg0) {
        if (arg0 != 2) {
            this.field587 = true;
        }
        if (this.field595 == -1) {
            if (this.field606 == null) {
                this.field595 = 0;
            } else {
                this.field595 = 2;
            }
        }
        field601++;
        if (this.field599 != -1) {
            return;
        }
        if (this.field606 == null) {
            this.field599 = 0;
        } else {
            this.field599 = 2;
        }
    }
}
