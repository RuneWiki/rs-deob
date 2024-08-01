import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class class69 implements Runnable {

    @OriginalMember(owner = "h", name = "o", descriptor = "[Lah;")
    public volatile class9[] field1346 = new class9[2];

    @OriginalMember(owner = "h", name = "f", descriptor = "Z")
    public volatile boolean field1337 = false;

    @OriginalMember(owner = "h", name = "c", descriptor = "Z")
    public volatile boolean field1334 = false;

    @OriginalMember(owner = "h", name = "b", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "h", name = "i", descriptor = "Llf;")
    public static class109 field1340 = class35.method275("Benutzen Sie die (WPasswort -=ndern(W Option", 2);

    @OriginalMember(owner = "h", name = "l", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "h", name = "k", descriptor = "Llf;")
    public static class109 field1342 = class35.method275(" <col=00ff80>", 2);

    @OriginalMember(owner = "h", name = "p", descriptor = "Llf;")
    public static class109 field1347 = class35.method275("<img=0>", 2);

    @OriginalMember(owner = "h", name = "q", descriptor = "Llf;")
    public static class109 field1348 = class35.method275("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 2);

    @OriginalMember(owner = "h", name = "a", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "h", name = "d", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "h", name = "g", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "h", name = "h", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "h", name = "j", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "h", name = "m", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "h", name = "e", descriptor = "Lke;")
    public class99 field1336;

    @OriginalMember(owner = "h", name = "n", descriptor = "[I")
    public static int[] field1345;

    @OriginalMember(owner = "h", name = "run", descriptor = "()V")
    public final void run() {
        this.field1334 = true;
        field1332++;
        try {
            while (!this.field1337) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class9 var2 = this.field1346[var1];
                    if (var2 != null) {
                        var2.method47(1);
                    }
                }
                class54.method354(10L, 95);
                class148.method1040(this.field1336, 0, null);
            }
        } catch (Exception var9) {
            class9.method43(null, -80, var9);
        } finally {
            Object var6 = null;
            this.field1334 = false;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static final void method443(int arg0) {
        field1341++;
        class59.method391(false, (byte) 75);
        class49.field1008 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class143.field2749.length; var2++) {
            if (class49.field1013[var2] != -1 && class143.field2749[var2] == null) {
                class143.field2749[var2] = class171.field3212.method147(0, 0, class49.field1013[var2]);
                if (class143.field2749[var2] == null) {
                    class49.field1008++;
                    var1 = false;
                }
            }
            if (class77.field1494[var2] != -1 && class84.field1700[var2] == null) {
                class84.field1700[var2] = class171.field3212.method171(119, class24.field538[var2], class77.field1494[var2], 0);
                if (class84.field1700[var2] == null) {
                    class49.field1008++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class172.field3226 = 1;
            return;
        }
        class141.field2736 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class143.field2749.length; var4++) {
            byte[] var57 = class84.field1700[var4];
            if (var57 != null) {
                int var58 = (class103.field2037[var4] >> 8) * 64 - class53.field1079;
                int var59 = (class103.field2037[var4] & 0xFF) * 64 - class42.field880;
                if (class6.field89) {
                    var59 = 10;
                    var58 = 10;
                }
                var3 &= class128.method931(var57, -94, var59, var58);
            }
        }
        if (!var3) {
            class172.field3226 = 2;
            return;
        }
        if (class172.field3226 != 0) {
            class103.method742(class36.method279(new class109[] { class117.field2315, class42.field886 }, 122), -1, true);
        }
        class190.method1285((byte) 82);
        class125.method917((byte) -91);
        class190.method1285((byte) 106);
        class26.method219();
        class190.method1285((byte) 101);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class168.field3116[var5].method751(true);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var55 = 0; var55 < 104; var55++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    class88.field1827[var6][var55][var56] = 0;
                }
            }
        }
        class190.method1285((byte) 110);
        class54.method355(104);
        int var7 = class143.field2749.length;
        class109.method780(91);
        class59.method391(true, (byte) -123);
        if (!class6.field89) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class103.field2037[var8] >> 8) * 64 - class53.field1079;
                byte[] var18 = class143.field2749[var8];
                int var19 = (class103.field2037[var8] & 0xFF) * 64 - class42.field880;
                if (var18 != null) {
                    class190.method1285((byte) 81);
                    class34.method271(var18, class106.field2102 * 8 - 48, 3752, (class177.field3343 - 6) * 8, var17, var19, class168.field3116);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class103.field2037[var9] & 0xFF) * 64 - class42.field880;
                int var15 = (class103.field2037[var9] >> 8) * 64 - class53.field1079;
                byte[] var16 = class143.field2749[var9];
                if (var16 == null && class177.field3343 < 800) {
                    class190.method1285((byte) 101);
                    class137.method982(var15, false, 64, 64, var14);
                }
            }
            class59.method391(true, (byte) -128);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class84.field1700[var10];
                if (var11 != null) {
                    int var12 = (class103.field2037[var10] >> 8) * 64 - class53.field1079;
                    int var13 = (class103.field2037[var10] & 0xFF) * 64 - class42.field880;
                    class190.method1285((byte) 90);
                    class123.method887(var12, var13, var11, 97, class168.field3116);
                }
            }
        }
        if (class6.field89) {
            for (int var20 = 0; var20 < 4; var20++) {
                class190.method1285((byte) 123);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class10.field164[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 14 & 0x3FF;
                            int var42 = (var41 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class103.field2037.length; var43++) {
                                if (class103.field2037[var43] == var42 && class143.field2749[var43] != null) {
                                    var37 = true;
                                    class78.method496(var38, -15, var39, class168.field3116, var34 * 8, class143.field2749[var43], var35 * 8, var20, (var40 & 0x7) * 8, (var41 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class184.method1246(false, var20, var34 * 8, var35 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class10.field164[0][var21][var32];
                    if (var33 == -1) {
                        class137.method982(var21 * 8, false, 8, 8, var32 * 8);
                    }
                }
            }
            class59.method391(true, (byte) 33);
            for (int var22 = 0; var22 < 4; var22++) {
                class190.method1285((byte) 93);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class10.field164[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < class103.field2037.length; var31++) {
                                if (class103.field2037[var31] == var30 && class84.field1700[var31] != null) {
                                    class125.method912(var27, var23 * 8, class168.field3116, class84.field1700[var31], var26, (var29 & 0x7) * 8, var24 * 8, (var28 & 0x7) * 8, var22, -121);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class59.method391(true, (byte) 87);
        class125.method917((byte) -128);
        class190.method1285((byte) 113);
        class71.method454(class168.field3116, (byte) -111);
        class59.method391(true, (byte) 2);
        int var44 = class83.field1687;
        if (var44 > class72.field1405) {
            var44 = class72.field1405;
        }
        if (class72.field1405 - 1 > var44) {
            int var45 = class72.field1405 - 1;
        }
        if (class181.field3420) {
            class148.method1038(class83.field1687);
        } else {
            class148.method1038(0);
        }
        int var46 = 0;
        int var47 = -44 / ((arg0 - 26) / 38);
        while (var46 < 104) {
            for (int var54 = 0; var54 < 104; var54++) {
                class171.method1151(var46, -28592, var54);
            }
            var46++;
        }
        class190.method1285((byte) 120);
        class3.method12((byte) 111);
        class125.method917((byte) -72);
        if (class26.field558 != null) {
            class128.field2477++;
            class200.field3850.method1339((byte) 88, 24);
            class200.field3850.method588((byte) 122, 1057001181);
        }
        if (!class6.field89) {
            int var48 = (class106.field2102 - 6) / 8;
            int var49 = (class177.field3343 - 6) / 8;
            int var50 = (class177.field3343 + 6) / 8;
            int var51 = (class106.field2102 + 6) / 8;
            for (int var52 = var48 - 1; var52 <= var51 + 1; var52++) {
                for (int var53 = var49 - 1; var53 <= var50 + 1; var53++) {
                    if (var52 < var48 || var52 > var51 || var53 < var49 || var53 > var50) {
                        class171.field3212.method164(true, class36.method279(new class109[] { class199.field3796, class52.method345((byte) 85, var52), class159.field2982, class52.method345((byte) 85, var53) }, -8));
                        class171.field3212.method164(true, class36.method279(new class109[] { class146.field2817, class52.method345((byte) 85, var52), class159.field2982, class52.method345((byte) 85, var53) }, -36));
                    }
                }
            }
        }
        class36.method278(30, (byte) -64);
        class190.method1285((byte) 108);
        class191.method1287((byte) -41);
        class200.field3850.method1339((byte) 118, 4);
        class39.method289((byte) 1);
    }

    @OriginalMember(owner = "h", name = "b", descriptor = "(I)V")
    public static final void method444(int arg0) {
        field1344++;
        class160.field2992 = null;
        if (arg0 >= -85) {
            field1348 = null;
        }
        class10.field166 = null;
        class51.field1036 = null;
        class21.field481 = null;
        field1345 = null;
        class202.field3976 = null;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)V")
    public static final void method445(int arg0, int arg1) {
        field1338++;
        int[] var2 = class136.field2641.field2007;
        if (arg0 != -1401834104) {
            field1340 = null;
        }
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class88.field1827[arg1][var21][var5] & 0x18) == 0) {
                    class75.method473(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class88.field1827[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class75.method473(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class136.field2641.method710();
        int var6 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class88.field1827[arg1][var19][var8] & 0x18) == 0) {
                    class134.method950(arg0 + 1401835640, arg1, var8, var6, var7, var19);
                }
                if (arg1 < 3 && (class88.field1827[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class134.method950(1536, arg1 + 1, var8, var6, var7, var19);
                }
            }
        }
        class163.field3057 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class77.method483(class72.field1405, var9, var10);
                if (var11 != 0L) {
                    int var13 = class140.method1000((int) (var11 >>> 32) & Integer.MAX_VALUE, 0).field1549;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class168.field3116[class72.field1405].field2069;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class118.field2321[class163.field3057] = class146.field2814[var13];
                        class103.field2027[class163.field3057] = var14;
                        class8.field115[class163.field3057] = var15;
                        class163.field3057++;
                    }
                }
            }
        }
        class68.field1320.method325((byte) 10);
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(B)V")
    public static void method446(byte arg0) {
        field1348 = null;
        field1340 = null;
        if (arg0 < 78) {
            method447(-92, 74, (byte) 87);
        }
        field1342 = null;
        field1347 = null;
        field1345 = null;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(IIB)I")
    public static final int method447(int arg0, int arg1, byte arg2) {
        if (arg2 > -31) {
            return -26;
        }
        field1335++;
        int var3 = class86.method564(arg1 - 1, (byte) 127, arg0 - 1) + class86.method564(arg1 + 1, (byte) 123, arg0 - 1) + class86.method564(arg1 + -1, (byte) 121, arg0 + 1) + class86.method564(arg1 + 1, (byte) 127, arg0 + 1);
        int var4 = class86.method564(arg1 - 1, (byte) 125, arg0) + class86.method564(arg1 + 1, (byte) 123, arg0) + class86.method564(arg1, (byte) 122, arg0 - 1) + class86.method564(arg1, (byte) 121, arg0 + 1);
        int var5 = class86.method564(arg1, (byte) 123, arg0);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }
}
