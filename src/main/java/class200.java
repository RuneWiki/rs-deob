import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class200 {

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3474 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lbf;")
    public static class195 field3478 = new class195();

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lmb;")
    public static class96 field3480 = class243.method1708("<br>(X", (byte) 109);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method1394(boolean arg0) {
        field3472++;
        boolean var1 = true;
        class152.method1114(false, 0);
        class273.field4745 = 0;
        for (int var2 = 0; var2 < class241.field4191.length; var2++) {
            if (class136.field2436[var2] != -1 && class241.field4191[var2] == null) {
                class241.field4191[var2] = class92.field1523.method23(0, 103, class136.field2436[var2]);
                if (class241.field4191[var2] == null) {
                    var1 = false;
                    class273.field4745++;
                }
            }
            if (class149.field2625[var2] != -1 && class167.field2951[var2] == null) {
                class167.field2951[var2] = class92.field1523.method28(class269.field4696[var2], class149.field2625[var2], -2, 0);
                if (class167.field2951[var2] == null) {
                    class273.field4745++;
                    var1 = false;
                }
            }
            if (class86.field1452 != null && class241.field4182[var2] == null && class86.field1452[var2] != -1) {
                class241.field4182[var2] = class92.field1523.method28(class269.field4696[var2], class86.field1452[var2], -2, 0);
                if (class241.field4182[var2] == null) {
                    var1 = false;
                    class273.field4745++;
                }
            }
        }
        if (class178.field3085 == null) {
            if (class128.field2332 == null || !class246.field4270.method44(class36.method289(-5615, new class96[] { class128.field2332.field4623, class91.field1514 }), (byte) -33)) {
                class178.field3085 = new class110(0);
            } else if (class246.field4270.method38(-77, class36.method289(-5615, new class96[] { class128.field2332.field4623, class91.field1514 }))) {
                class178.field3085 = class11.method91(class36.method289(-5615, new class96[] { class128.field2332.field4623, class91.field1514 }), 103, class246.field4270);
            } else {
                var1 = false;
                class273.field4745++;
            }
        }
        if (!var1) {
            class9.field151 = 1;
            return;
        }
        boolean var3 = true;
        class152.field2668 = 0;
        for (int var4 = 0; var4 < class241.field4191.length; var4++) {
            byte[] var20 = class167.field2951[var4];
            if (var20 != null) {
                int var21 = (class157.field2741[var4] >> 8) * 64 - class196.field3383;
                int var22 = (class157.field2741[var4] & 0xFF) * 64 - class225.field3832;
                if (class135.field2430) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class159.method1155(var21, 30986, var22, var20);
            }
        }
        if (!var3) {
            class9.field151 = 2;
            return;
        }
        boolean var5 = false;
        if (class9.field151 != 0) {
            class241.method1698(8215, class36.method289(-5615, new class96[] { class103.field1742, class143.field2537 }), true);
        }
        class135.method1009((byte) 3);
        class178.method1269(97);
        class5.method57(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class62.field1064[var6].method1429(-68);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class132.field2376[var7][var18][var19] = 0;
                }
            }
        }
        class80.method566(arg0, -23254);
        class135.method1009((byte) 3);
        System.gc();
        class152.method1114(true, 0);
        class44.method343((byte) 123, false);
        if (!class135.field2430) {
            class231.method1574(false, false);
            class152.method1114(true, 0);
            class194.method1353(false, !arg0);
            if (class241.field4182 != null) {
                class22.method161(0);
            }
        }
        if (class135.field2430) {
            class31.method207(false, (byte) 114);
            class152.method1114(true, 0);
            class91.method642(90, false);
        }
        class178.method1269(-46);
        class152.method1114(true, 0);
        class153.method1116(!arg0, false, class62.field1064);
        class152.method1114(true, 0);
        int var8 = class41.field707;
        if (var8 > class216.field3712) {
            var8 = class216.field3712;
        }
        if (var8 < class216.field3712 - 1) {
            int var9 = class216.field3712 - 1;
        }
        if (class106.method786(80)) {
            class245.method1722(0);
        } else {
            class245.method1722(class41.field707);
        }
        class211.method1465(-3);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class247.method1729(var17, 56, var10);
            }
        }
        class180.method1276(-25210);
        class135.method1009((byte) 3);
        class211.method1468(-10681);
        class178.method1269(-110);
        if (class103.field1743 != null && class211.field3638 != null && class101.field1729 == 25) {
            class140.field2505.method1012((byte) 74, 255);
            class222.field3790++;
            class140.field2505.method1625((byte) -127, 1057001181);
        }
        if (!class135.field2430) {
            int var11 = (class260.field4578 - 6) / 8;
            int var12 = (class128.field2342 - 6) / 8;
            int var13 = (class260.field4578 + 6) / 8;
            int var14 = (class128.field2342 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var13 + 1); var15++) {
                for (int var16 = var12 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var13 < var15 || var12 > var16 || var16 > var14) {
                        class92.field1523.method17((byte) -126, class36.method289(-5615, new class96[] { class270.field4702, class31.method205(var15, (byte) -78), class61.field1051, class31.method205(var16, (byte) -78) }));
                        class92.field1523.method17((byte) -121, class36.method289(-5615, new class96[] { class100.field1686, class31.method205(var15, (byte) -78), class61.field1051, class31.method205(var16, (byte) -78) }));
                    }
                }
            }
        }
        if (class101.field1729 == 28) {
            class146.method1076(6938, 10);
        } else {
            class146.method1076(6938, 30);
            if (class211.field3638 != null) {
                class140.field2505.method1012((byte) -11, 33);
            }
        }
        class135.method1009((byte) 3);
        class256.method1782((byte) 20);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static final void method1395(boolean arg0) {
        if (arg0) {
            field3478 = null;
        }
        field3475++;
        if (!class106.method786(104) && class277.field4822 != class216.field3712) {
            class192.method1343(false, class260.field4578, class236.field4047.field4566[0], class236.field4047.field4528[0], 1, class128.field2342, class216.field3712);
        } else if (class97.field1639 != class216.field3712) {
            class97.field1639 = class216.field3712;
            class196.method1365(class216.field3712, 0);
            class180.method1276(-25210);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
    public static final int method1396(byte arg0) {
        field3477++;
        return arg0 >= -32 ? 77 : 6;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public static final void method1397(int arg0, int arg1) {
        class187 var2 = class259.field4487[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class187 var4 = class259.field4487[var3][arg0][arg1] = class259.field4487[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3280--;
                for (int var5 = 0; var5 < var4.field3282; var5++) {
                    class70 var6 = var4.field3274[var5];
                    if ((var6.field1197 >> 29 & 0x3L) == 2L && var6.field1208 == arg0 && var6.field1204 == arg1) {
                        var6.field1198--;
                    }
                }
            }
        }
        if (class259.field4487[0][arg0][arg1] == null) {
            class259.field4487[0][arg0][arg1] = new class187(0, arg0, arg1);
        }
        class259.field4487[0][arg0][arg1].field3286 = var2;
        class259.field4487[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        field3469++;
        class34.field604.method83(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static void method1399(boolean arg0) {
        field3478 = null;
        field3480 = null;
        if (arg0) {
            field3467 = -114;
        }
        field3474 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)I")
    public static final int method1400(int arg0, boolean arg1) {
        if (!arg1) {
            method1401(-71, true, 47, -71, -30);
        }
        field3468++;
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIII)V")
    public static final void method1401(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if ((arg4 - arg3) >= class9.field145 && (arg3 + arg4) <= class162.field2884 && client.field1994 <= (arg0 - arg3) && (arg0 + arg3) <= class9.field149) {
            class118.method917(arg0, arg4, arg2, 103, arg3);
        } else {
            class80.method563(60, arg0, arg4, arg2, arg3);
        }
        if (!arg1) {
            field3471++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lo;Lff;Lff;IZ)V")
    public static final void method1402(class12 arg0, class3 arg1, class3 arg2, int arg3, boolean arg4) {
        field3476++;
        class116.field2168 = arg4;
        class177.field3073 = arg2;
        class31.field499 = arg1;
        int var5 = class31.field499.method40((byte) 127) - 1;
        class202.field3496 = var5 * 256 + class31.field499.method37(var5, (byte) -96);
        int var6 = -32 / ((arg3 - 18) / 63);
        class157.field2731 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILrg;)V")
    public static final void method1403(int arg0, class239 arg1) {
        field3473++;
        if (arg1.field4144.length - arg1.field4124 < 1) {
            return;
        }
        int var2 = arg1.method1651(4139);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field4144.length - arg1.field4124) {
            return;
        }
        class269.field4682 = arg1.method1651(arg0 + 4120);
        if (class269.field4682 < 1) {
            class269.field4682 = 1;
        } else if (class269.field4682 > 4) {
            class269.field4682 = 4;
        }
        class109.method837(arg1.method1651(4139) == 1, 14459);
        class248.field4292 = arg1.method1651(4139) == 1;
        class89.field1478 = arg1.method1651(arg0 ^ 0x1038) == 1;
        class237.field4073 = arg1.method1651(arg0 + 4120) == 1;
        class82.field1392 = arg1.method1651(4139) == 1;
        class128.field2334 = arg1.method1651(4139) == 1;
        class94.field1550 = arg1.method1651(4139) == 1;
        class219.field3743 = arg1.method1651(4139) == 1;
        class148.field2620 = arg1.method1651(arg0 ^ 0x1038);
        if (class148.field2620 > 2) {
            class148.field2620 = 2;
        }
        if (var2 < 2) {
            class143.field2541 = arg1.method1651(4139) == 1;
            arg1.method1651(4139);
        } else {
            class143.field2541 = arg1.method1651(arg0 + 4120) == 1;
        }
        class161.field2860 = arg1.method1651(4139) == 1;
        class109.field2014 = arg1.method1651(4139) == 1;
        class22.field376 = arg1.method1651(4139);
        if (class22.field376 > 2) {
            class22.field376 = 2;
        }
        class22.field386 = arg1.method1651(4139) == 1;
        class233.field3999 = arg1.method1651(4139);
        if (class233.field3999 > 127) {
            class233.field3999 = 127;
        }
        class92.field1525 = arg1.method1651(4139);
        if (arg0 != 19) {
            return;
        }
        class5.field100 = arg1.method1651(arg0 ^ 0x1038);
        if (class5.field100 > 127) {
            class5.field100 = 127;
        }
        if (var2 >= 1) {
            class206.field3535 = arg1.method1663((byte) -70);
            class144.field2546 = arg1.method1663((byte) -44);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1651(4139);
        }
        if (var2 >= 4) {
            arg1.method1651(arg0 ^ 0x1038);
        }
        if (var2 >= 5) {
            class234.field4018 = arg1.method1617((byte) -43);
        }
        if (var2 >= 6) {
            class256.field4461 = arg1.method1651(4139);
        }
        if (var2 >= 7) {
            class176.field3061 = arg1.method1651(4139) == 1;
        }
    }
}
