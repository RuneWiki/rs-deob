import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[Le;")
    public volatile class155[] field4433 = new class155[2];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Z")
    public volatile boolean field4422 = false;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
    public volatile boolean field4425 = false;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lha;")
    public static class46 field4423 = class271.method1828("www)2wtrc", -46);

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lha;")
    public static class46 field4430 = class271.method1828(" )2> ", -46);

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lha;")
    public static class46 field4431 = class271.method1828("welle2:", -46);

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lha;")
    public static class46 field4437 = class271.method1828("Sprites geladen)3", -46);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lrc;")
    public class9 field4436;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILpi;)V")
    public static final void method1699(int arg0, class181 arg1) {
        class261.field4545 = arg1;
        int var2 = -66 / (-arg0 / 43);
        field4435++;
    }

    @OriginalMember(owner = "client!ri", name = "run", descriptor = "()V")
    public final void run() {
        this.field4425 = true;
        try {
            while (!this.field4422) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class155 var2 = this.field4433[var1];
                    if (var2 != null) {
                        var2.method1145(11001);
                    }
                }
                class187.method1360((byte) 106, 10L);
                class268.method1792((Object) null, (byte) -90, this.field4436);
            }
        } catch (Exception var9) {
            class272.method1835(var9, -85, (String) null);
        } finally {
            Object var6 = null;
            this.field4425 = false;
        }
        field4424++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBLmg;)V")
    public static final void method1700(int arg0, byte arg1, class275 arg2) {
        field4426++;
        Object[] var3 = arg2.field4796;
        int var4 = (Integer) var3[0];
        if (arg1 != -17) {
            field4430 = null;
        }
        class225 var5 = class175.method1260(var4, (byte) -128);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        class12.field196 = 0;
        int var8 = -1;
        int[] var9 = var5.field3932;
        int[] var10 = var5.field3930;
        byte var11 = -1;
        try {
            class137.field2476 = new class46[var5.field3924];
            class92.field1722 = new int[var5.field3933];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field4802;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field4804;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field4792 == null ? -1 : arg2.field4792.field374;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field4791;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field4792 == null ? -1 : arg2.field4792.field436;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field4797 == null ? -1 : arg2.field4797.field374;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field4797 == null ? -1 : arg2.field4797.field436;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field4799;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field4809;
                    }
                    class92.field1722[var13++] = var16;
                } else if (var3[var14] instanceof class46) {
                    class46 var15 = (class46) var3[var14];
                    if (var15.method340((byte) 102, class237.field4209)) {
                        var15 = arg2.field4805;
                    }
                    class137.field2476[var12++] = var15;
                }
            }
            int var17 = 0;
            label3575: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var472 = var10[var8];
                if (var472 < 100) {
                    if (var472 == 0) {
                        class128.field2346[var6++] = var9[var8];
                        continue;
                    }
                    if (var472 == 1) {
                        int var18 = var9[var8];
                        class128.field2346[var6++] = class29.field568[var18];
                        continue;
                    }
                    if (var472 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class68.method493(-27632, var19, class128.field2346[var6]);
                        continue;
                    }
                    if (var472 == 3) {
                        class86.field1632[var7++] = var5.field3926[var8];
                        continue;
                    }
                    if (var472 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var472 == 7) {
                        var6 -= 2;
                        if (class128.field2346[var6 + 1] != class128.field2346[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 8) {
                        var6 -= 2;
                        if (class128.field2346[var6 + 1] == class128.field2346[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 9) {
                        var6 -= 2;
                        if (class128.field2346[var6 + 1] > class128.field2346[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 10) {
                        var6 -= 2;
                        if (class128.field2346[var6] > class128.field2346[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 21) {
                        if (class12.field196 == 0) {
                            return;
                        }
                        class180 var20 = class201.field3605[--class12.field196];
                        class92.field1722 = var20.field3207;
                        var8 = var20.field3222;
                        var5 = var20.field3206;
                        var10 = var5.field3930;
                        var9 = var5.field3932;
                        class137.field2476 = var20.field3208;
                        continue;
                    }
                    if (var472 == 25) {
                        int var21 = var9[var8];
                        class128.field2346[var6++] = class85.method667(var21, class51.method376(arg1, 71));
                        continue;
                    }
                    if (var472 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class205.method1454(var22, 118, class128.field2346[var6]);
                        continue;
                    }
                    if (var472 == 31) {
                        var6 -= 2;
                        if (class128.field2346[var6 + 1] >= class128.field2346[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 32) {
                        var6 -= 2;
                        if (class128.field2346[var6 + 1] <= class128.field2346[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var472 == 33) {
                        class128.field2346[var6++] = class92.field1722[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var472 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class92.field1722[var10001] = class128.field2346[var6];
                        continue;
                    }
                    if (var472 == 35) {
                        class86.field1632[var7++] = class137.field2476[var9[var8]];
                        continue;
                    }
                    if (var472 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class137.field2476[var10001] = class86.field1632[var7];
                        continue;
                    }
                    if (var472 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        class46 var24 = class10.method49(class86.field1632, var23, var7, 16);
                        class86.field1632[var7++] = var24;
                        continue;
                    }
                    if (var472 == 38) {
                        var6--;
                        continue;
                    }
                    if (var472 == 39) {
                        var7--;
                        continue;
                    }
                    if (var472 == 40) {
                        int var25 = var9[var8];
                        class225 var26 = class175.method1260(var25, (byte) -127);
                        int[] var27 = new int[var26.field3933];
                        class46[] var28 = new class46[var26.field3924];
                        for (int var29 = 0; var29 < var26.field3928; var29++) {
                            var27[var29] = class128.field2346[var6 + var29 - var26.field3928];
                        }
                        for (int var30 = 0; var30 < var26.field3925; var30++) {
                            var28[var30] = class86.field1632[var7 + var30 - var26.field3925];
                        }
                        var6 -= var26.field3928;
                        var7 -= var26.field3925;
                        class180 var31 = new class180();
                        var31.field3208 = class137.field2476;
                        var31.field3222 = var8;
                        var31.field3207 = class92.field1722;
                        var31.field3206 = var5;
                        if (class12.field196 >= class201.field3605.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class201.field3605[class12.field196++] = var31;
                        class92.field1722 = var27;
                        var9 = var26.field3932;
                        class137.field2476 = var28;
                        var10 = var26.field3930;
                        continue;
                    }
                    if (var472 == 42) {
                        class128.field2346[var6++] = class240.field4268[var9[var8]];
                        continue;
                    }
                    if (var472 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class240.field4268[var32] = class128.field2346[var6];
                        class154.method1131(arg1 ^ 0x7AAF, var32);
                        continue;
                    }
                    if (var472 == 44) {
                        int var33 = var9[var8] >> 16;
                        var6--;
                        int var34 = class128.field2346[var6];
                        int var35 = var9[var8] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class118.field2205[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label3575;
                                }
                                class39.field692[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class128.field2346[var6];
                        if (var39 >= 0 && class118.field2205[var38] > var39) {
                            class128.field2346[var6++] = class39.field692[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 46) {
                        var6 -= 2;
                        int var40 = class128.field2346[var6];
                        int var41 = var9[var8];
                        if (var40 >= 0 && class118.field2205[var41] > var40) {
                            class39.field692[var41][var40] = class128.field2346[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 47) {
                        class46 var42 = class2.field31[var9[var8]];
                        if (var42 == null) {
                            var42 = class64.field1078;
                        }
                        class86.field1632[var7++] = var42;
                        continue;
                    }
                    if (var472 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class2.field31[var43] = class86.field1632[var7];
                        class155.method1144(var43, true);
                        continue;
                    }
                    if (var472 == 51) {
                        class235 var44 = var5.field3935[var9[var8]];
                        var6--;
                        class176 var45 = (class176) var44.method1601(-57, (long) class128.field2346[var6]);
                        if (var45 != null) {
                            var8 += var45.field3166;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                int var10000;
                if (var472 < 300) {
                    if (var472 == 100) {
                        var6 -= 3;
                        int var451 = class128.field2346[var6 + 2];
                        int var452 = class128.field2346[var6 + 1];
                        int var453 = class128.field2346[var6];
                        if (var452 == 0) {
                            throw new RuntimeException();
                        }
                        class24 var454 = class13.method73(1506528624, var453);
                        if (var454.field503 == null) {
                            var454.field503 = new class24[var451 + 1];
                        }
                        if (var451 >= var454.field503.length) {
                            class24[] var455 = new class24[var451 + 1];
                            for (int var456 = 0; var456 < var454.field503.length; var456++) {
                                var455[var456] = var454.field503[var456];
                            }
                            var454.field503 = var455;
                        }
                        if (var451 > 0 && var454.field503[var451 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var451 - 1));
                        }
                        class24 var457 = new class24();
                        var457.field436 = var451;
                        var457.field440 = var457.field374 = var454.field374;
                        var457.field485 = var452;
                        var457.field480 = true;
                        var454.field503[var451] = var457;
                        if (var46) {
                            class10.field169 = var457;
                        } else {
                            class6.field108 = var457;
                        }
                        class226.method1549(false, var454);
                        continue;
                    }
                    if (var472 == 101) {
                        class24 var458 = var46 ? class10.field169 : class6.field108;
                        if (var458.field436 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class24 var459 = class13.method73(1506528624, var458.field374);
                        var459.field503[var458.field436] = null;
                        class226.method1549(false, var459);
                        continue;
                    }
                    if (var472 == 102) {
                        var10000 = arg1 ^ 0xA634329F;
                        var6--;
                        class24 var460 = class13.method73(var10000, class128.field2346[var6]);
                        var460.field503 = null;
                        class226.method1549(false, var460);
                        continue;
                    }
                    if (var472 == 200) {
                        var6 -= 2;
                        int var461 = class128.field2346[var6];
                        int var462 = class128.field2346[var6 + 1];
                        class24 var463 = class108.method841(var461, var462, arg1 ^ 0x10);
                        if (var463 != null && var462 != -1) {
                            class128.field2346[var6++] = 1;
                            if (var46) {
                                class10.field169 = var463;
                            } else {
                                class6.field108 = var463;
                            }
                            continue;
                        }
                        class128.field2346[var6++] = 0;
                        continue;
                    }
                    if (var472 == 201) {
                        var6--;
                        int var464 = class128.field2346[var6];
                        class24 var465 = class13.method73(1506528624, var464);
                        if (var465 == null) {
                            class128.field2346[var6++] = 0;
                        } else {
                            class128.field2346[var6++] = 1;
                            if (var46) {
                                class10.field169 = var465;
                            } else {
                                class6.field108 = var465;
                            }
                        }
                        continue;
                    }
                } else if (var472 < 500) {
                    if (var472 == 403) {
                        var6 -= 2;
                        int var446 = class128.field2346[var6 + 1];
                        int var447 = class128.field2346[var6];
                        if (var447 >= 7) {
                            var447 -= 7;
                        }
                        class277.field4824.field1527.method600(var446, 0, var447);
                        continue;
                    }
                    if (var472 == 404) {
                        var6 -= 2;
                        int var448 = class128.field2346[var6];
                        int var449 = class128.field2346[var6 + 1];
                        class277.field4824.field1527.method607(false, var449, var448);
                        continue;
                    }
                    if (var472 == 410) {
                        var6--;
                        boolean var450 = class128.field2346[var6] != 0;
                        class277.field4824.field1527.method604((byte) -92, var450);
                        continue;
                    }
                } else if (var472 >= 1000 && var472 < 1100 || var472 >= 2000 && var472 < 2100) {
                    class24 var47;
                    if (var472 >= 2000) {
                        var472 -= 1000;
                        var6--;
                        var47 = class13.method73(1506528624, class128.field2346[var6]);
                    } else {
                        var47 = var46 ? class10.field169 : class6.field108;
                    }
                    if (var472 == 1000) {
                        var6 -= 4;
                        var47.field430 = class128.field2346[var6];
                        var47.field502 = class128.field2346[var6 + 1];
                        int var48 = class128.field2346[var6 + 2];
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        int var49 = class128.field2346[var6 + 3];
                        var47.field492 = (byte) var48;
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var47.field391 = (byte) var49;
                        class226.method1549(false, var47);
                        class231.method1568(var47, (byte) -17);
                        if (var47.field436 == -1) {
                            class33.method214(var47.field374, (byte) 100);
                        }
                        continue;
                    }
                    if (var472 == 1001) {
                        var6 -= 4;
                        var47.field467 = class128.field2346[var6];
                        var47.field461 = class128.field2346[var6 + 1];
                        var47.field358 = 0;
                        var47.field410 = 0;
                        int var50 = class128.field2346[var6 + 2];
                        int var51 = class128.field2346[var6 + 3];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        var47.field474 = (byte) var51;
                        var47.field464 = (byte) var50;
                        class226.method1549(false, var47);
                        class231.method1568(var47, (byte) -17);
                        if (var47.field485 == 0) {
                            class113.method922(false, var47, -92);
                        }
                        continue;
                    }
                    if (var472 == 1003) {
                        var6--;
                        boolean var52 = class128.field2346[var6] == 1;
                        if (var47.field495 != var52) {
                            var47.field495 = var52;
                            class226.method1549(false, var47);
                        }
                        if (var47.field436 == -1) {
                            class243.method1666(var47.field374, -104);
                        }
                        continue;
                    }
                    if (var472 == 1004) {
                        var6 -= 2;
                        var47.field423 = class128.field2346[var6];
                        var47.field409 = class128.field2346[var6 + 1];
                        class226.method1549(false, var47);
                        class231.method1568(var47, (byte) -17);
                        if (var47.field485 == 0) {
                            class113.method922(false, var47, -94);
                        }
                        continue;
                    }
                } else if (var472 >= 1100 && var472 < 1200 || var472 >= 2100 && var472 < 2200) {
                    class24 var53;
                    if (var472 >= 2000) {
                        var6--;
                        var53 = class13.method73(1506528624, class128.field2346[var6]);
                        var472 -= 1000;
                    } else {
                        var53 = var46 ? class10.field169 : class6.field108;
                    }
                    if (var472 == 1100) {
                        var6 -= 2;
                        var53.field506 = class128.field2346[var6];
                        if (var53.field377 - var53.field468 < var53.field506) {
                            var53.field506 = var53.field377 - var53.field468;
                        }
                        if (var53.field506 < 0) {
                            var53.field506 = 0;
                        }
                        var53.field412 = class128.field2346[var6 + 1];
                        if (var53.field412 > (var53.field350 - var53.field341)) {
                            var53.field412 = var53.field350 - var53.field341;
                        }
                        if (var53.field412 < 0) {
                            var53.field412 = 0;
                        }
                        class226.method1549(false, var53);
                        if (var53.field436 == -1) {
                            class89.method687((byte) 86, var53.field374);
                        }
                        continue;
                    }
                    if (var472 == 1101) {
                        var6--;
                        var53.field344 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        if (var53.field436 == -1) {
                            class168.method1190(var53.field374, 6);
                        }
                        continue;
                    }
                    if (var472 == 1102) {
                        var6--;
                        var53.field431 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1103) {
                        var6--;
                        var53.field342 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1104) {
                        var6--;
                        var53.field455 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1105) {
                        var6--;
                        var53.field451 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1106) {
                        var6--;
                        var53.field386 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1107) {
                        var6--;
                        var53.field491 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1108) {
                        var53.field359 = 1;
                        var6--;
                        var53.field486 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        if (var53.field436 == -1) {
                            class65.method450((byte) -102, var53.field374);
                        }
                        continue;
                    }
                    if (var472 == 1109) {
                        var6 -= 6;
                        var53.field445 = class128.field2346[var6];
                        var53.field413 = class128.field2346[var6 + 1];
                        var53.field373 = class128.field2346[var6 + 2];
                        var53.field473 = class128.field2346[var6 + 3];
                        var53.field475 = class128.field2346[var6 + 4];
                        var53.field345 = class128.field2346[var6 + 5];
                        class226.method1549(false, var53);
                        if (var53.field436 == -1) {
                            class175.method1261(arg1 + 81, var53.field374);
                            class23.method164((byte) -40, var53.field374);
                        }
                        continue;
                    }
                    if (var472 == 1110) {
                        var6--;
                        int var54 = class128.field2346[var6];
                        if (var53.field352 != var54) {
                            var53.field352 = var54;
                            var53.field434 = 0;
                            var53.field419 = 0;
                            class226.method1549(false, var53);
                        }
                        if (var53.field436 == -1) {
                            class114.method924(-25274, var53.field374);
                        }
                        continue;
                    }
                    if (var472 == 1111) {
                        var6--;
                        var53.field505 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1112) {
                        var7--;
                        class46 var55 = class86.field1632[var7];
                        if (!var55.method340((byte) 101, var53.field411)) {
                            var53.field411 = var55;
                            class226.method1549(false, var53);
                        }
                        if (var53.field436 == -1) {
                            class214.method1505(var53.field374, 126);
                        }
                        continue;
                    }
                    if (var472 == 1113) {
                        var6--;
                        var53.field465 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1114) {
                        var6 -= 3;
                        var53.field408 = class128.field2346[var6];
                        var53.field343 = class128.field2346[var6 + 1];
                        var53.field471 = class128.field2346[var6 + 2];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1115) {
                        var6--;
                        var53.field397 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1116) {
                        var6--;
                        var53.field489 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1117) {
                        var6--;
                        var53.field369 = class128.field2346[var6];
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1118) {
                        var6--;
                        var53.field357 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1119) {
                        var6--;
                        var53.field460 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1120) {
                        var6 -= 2;
                        var53.field377 = class128.field2346[var6];
                        var53.field350 = class128.field2346[var6 + 1];
                        class226.method1549(false, var53);
                        if (var53.field485 == 0) {
                            class113.method922(false, var53, -44);
                        }
                        continue;
                    }
                    if (var472 == 1121) {
                        var6 -= 2;
                        class226.method1549(false, var53);
                        continue;
                    }
                    if (var472 == 1122) {
                        var6--;
                        var53.field375 = class128.field2346[var6] == 1;
                        class226.method1549(false, var53);
                        continue;
                    }
                } else if (var472 >= 1200 && var472 < 1300 || var472 >= 2200 && var472 < 2300) {
                    class24 var56;
                    if (var472 >= 2000) {
                        var472 -= 1000;
                        var6--;
                        var56 = class13.method73(1506528624, class128.field2346[var6]);
                    } else {
                        var56 = var46 ? class10.field169 : class6.field108;
                    }
                    class226.method1549(false, var56);
                    if (var472 == 1200 || var472 == 1205) {
                        var6 -= 2;
                        int var57 = class128.field2346[var6];
                        int var58 = class128.field2346[var6 + 1];
                        if (var56.field436 == -1) {
                            class268.method1796(arg1 + 26, var56.field374);
                            class175.method1261(arg1 + 81, var56.field374);
                            class23.method164((byte) -39, var56.field374);
                        }
                        if (var57 == -1) {
                            var56.field486 = -1;
                            var56.field348 = -1;
                            var56.field359 = 1;
                        } else {
                            var56.field355 = var58;
                            var56.field348 = var57;
                            class71 var59 = class80.method633(var57, 0);
                            var56.field475 = var59.field1229;
                            var56.field413 = var59.field1225;
                            var56.field345 = var59.field1272;
                            var56.field373 = var59.field1234;
                            if (var472 == 1205) {
                                var56.field420 = false;
                            } else {
                                var56.field420 = true;
                            }
                            var56.field473 = var59.field1212;
                            if (var56.field410 > 0) {
                                var56.field345 = var56.field345 * 32 / var56.field410;
                            } else if (var56.field467 > 0) {
                                var56.field345 = var56.field345 * 32 / var56.field467;
                            }
                            var56.field445 = var59.field1278;
                        }
                        continue;
                    }
                    if (var472 == 1201) {
                        var56.field359 = 2;
                        var6--;
                        var56.field486 = class128.field2346[var6];
                        if (var56.field436 == -1) {
                            class65.method450((byte) -117, var56.field374);
                        }
                        continue;
                    }
                    if (var472 == 1202) {
                        var56.field359 = 3;
                        var56.field486 = class277.field4824.field1527.method609(-118);
                        if (var56.field436 == -1) {
                            class65.method450((byte) -99, var56.field374);
                        }
                        continue;
                    }
                    if (var472 == 1203) {
                        var56.field359 = 6;
                        var6--;
                        var56.field486 = class128.field2346[var6];
                        if (var56.field436 == -1) {
                            class65.method450((byte) -117, var56.field374);
                        }
                        continue;
                    }
                    if (var472 == 1204) {
                        var56.field359 = 5;
                        var6--;
                        var56.field486 = class128.field2346[var6];
                        if (var56.field436 == -1) {
                            class65.method450((byte) -123, var56.field374);
                        }
                        continue;
                    }
                } else if ((var472 < 1300 || var472 >= 1400) && (var472 < 2300 || var472 >= 2400)) {
                    if (var472 >= 1400 && var472 < 1500 || var472 >= 2400 && var472 < 2500) {
                        class24 var439;
                        if (var472 >= 2000) {
                            var6--;
                            var439 = class13.method73(1506528624, class128.field2346[var6]);
                            var472 -= 1000;
                        } else {
                            var439 = var46 ? class10.field169 : class6.field108;
                        }
                        var7--;
                        class46 var440 = class86.field1632[var7];
                        int[] var441 = null;
                        if (var440.method314(arg1 ^ 0xFFFFFFC3) > 0 && var440.method318(var440.method314(87) - 1, (byte) -101) == 89) {
                            var6--;
                            int var442 = class128.field2346[var6];
                            if (var442 > 0) {
                                var441 = new int[var442];
                                while ((var442--) > 0) {
                                    var6--;
                                    var441[var442] = class128.field2346[var6];
                                }
                            }
                            var440 = var440.method338(19551, var440.method314(68) - 1, 0);
                        }
                        Object[] var443 = new Object[var440.method314(82) + 1];
                        for (int var444 = var443.length - 1; var444 >= 1; var444--) {
                            if (var440.method318(var444 - 1, (byte) 25) == 115) {
                                var7--;
                                var443[var444] = class86.field1632[var7];
                            } else {
                                var6--;
                                var443[var444] = Integer.valueOf(class128.field2346[var6]);
                            }
                        }
                        var6--;
                        int var445 = class128.field2346[var6];
                        if (var445 == -1) {
                            var443 = null;
                        } else {
                            var443[0] = Integer.valueOf(var445);
                        }
                        if (var472 == 1400) {
                            var439.field490 = var443;
                        } else if (var472 == 1401) {
                            var439.field416 = var443;
                        } else if (var472 == 1402) {
                            var439.field477 = var443;
                        } else if (var472 == 1403) {
                            var439.field508 = var443;
                        } else if (var472 == 1404) {
                            var439.field447 = var443;
                        } else if (var472 == 1405) {
                            var439.field399 = var443;
                        } else if (var472 == 1406) {
                            var439.field499 = var443;
                        } else if (var472 == 1407) {
                            var439.field450 = var441;
                            var439.field426 = var443;
                        } else if (var472 == 1408) {
                            var439.field415 = var443;
                        } else if (var472 == 1409) {
                            var439.field385 = var443;
                        } else if (var472 == 1410) {
                            var439.field446 = var443;
                        } else if (var472 == 1411) {
                            var439.field364 = var443;
                        } else if (var472 == 1412) {
                            var439.field395 = var443;
                        } else if (var472 == 1414) {
                            var439.field368 = var443;
                            var439.field380 = var441;
                        } else if (var472 == 1415) {
                            var439.field478 = var441;
                            var439.field429 = var443;
                        } else if (var472 == 1416) {
                            var439.field433 = var443;
                        } else if (var472 == 1417) {
                            var439.field449 = var443;
                        } else if (var472 == 1418) {
                            var439.field494 = var443;
                        } else if (var472 == 1419) {
                            var439.field367 = var443;
                        } else if (var472 == 1420) {
                            var439.field382 = var443;
                        } else if (var472 == 1421) {
                            var439.field432 = var443;
                        } else if (var472 == 1422) {
                            var439.field482 = var443;
                        } else if (var472 == 1423) {
                            var439.field444 = var443;
                        } else if (var472 == 1424) {
                            var439.field481 = var443;
                        } else if (var472 == 1425) {
                            var439.field441 = var443;
                        } else if (var472 == 1426) {
                            var439.field493 = var443;
                        } else if (var472 == 1427) {
                            var439.field406 = var443;
                        } else if (var472 == 1428) {
                            var439.field393 = var441;
                            var439.field394 = var443;
                        } else if (var472 == 1429) {
                            var439.field362 = var443;
                            var439.field384 = var441;
                        }
                        var439.field365 = true;
                        continue;
                    }
                    if (var472 < 1600) {
                        class24 var64 = var46 ? class10.field169 : class6.field108;
                        if (var472 == 1500) {
                            class128.field2346[var6++] = var64.field421;
                            continue;
                        }
                        if (var472 == 1501) {
                            class128.field2346[var6++] = var64.field501;
                            continue;
                        }
                        if (var472 == 1502) {
                            class128.field2346[var6++] = var64.field468;
                            continue;
                        }
                        if (var472 == 1503) {
                            class128.field2346[var6++] = var64.field341;
                            continue;
                        }
                        if (var472 == 1504) {
                            class128.field2346[var6++] = var64.field495 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 1505) {
                            class128.field2346[var6++] = var64.field440;
                            continue;
                        }
                    } else if (var472 < 1700) {
                        class24 var65 = var46 ? class10.field169 : class6.field108;
                        if (var472 == 1600) {
                            class128.field2346[var6++] = var65.field506;
                            continue;
                        }
                        if (var472 == 1601) {
                            class128.field2346[var6++] = var65.field412;
                            continue;
                        }
                        if (var472 == 1602) {
                            class86.field1632[var7++] = var65.field411;
                            continue;
                        }
                        if (var472 == 1603) {
                            class128.field2346[var6++] = var65.field377;
                            continue;
                        }
                        if (var472 == 1604) {
                            class128.field2346[var6++] = var65.field350;
                            continue;
                        }
                        if (var472 == 1605) {
                            class128.field2346[var6++] = var65.field345;
                            continue;
                        }
                        if (var472 == 1606) {
                            class128.field2346[var6++] = var65.field373;
                            continue;
                        }
                        if (var472 == 1607) {
                            class128.field2346[var6++] = var65.field475;
                            continue;
                        }
                        if (var472 == 1608) {
                            class128.field2346[var6++] = var65.field473;
                            continue;
                        }
                        if (var472 == 1609) {
                            class128.field2346[var6++] = var65.field342;
                            continue;
                        }
                    } else if (var472 < 1800) {
                        class24 var438 = var46 ? class10.field169 : class6.field108;
                        if (var472 == 1700) {
                            class128.field2346[var6++] = var438.field348;
                            continue;
                        }
                        if (var472 == 1701) {
                            if (var438.field348 == -1) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = var438.field355;
                            }
                            continue;
                        }
                        if (var472 == 1702) {
                            class128.field2346[var6++] = var438.field436;
                            continue;
                        }
                    } else if (var472 < 1900) {
                        class24 var66 = var46 ? class10.field169 : class6.field108;
                        if (var472 == 1800) {
                            class128.field2346[var6++] = class189.method1370(client.method1811(var66), false);
                            continue;
                        }
                        if (var472 == 1801) {
                            var6--;
                            int var67 = class128.field2346[var6];
                            int var473 = var67 - 1;
                            if (var66.field435 != null && var66.field435.length > var473 && var66.field435[var473] != null) {
                                class86.field1632[var7++] = var66.field435[var473];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 1802) {
                            if (var66.field389 == null) {
                                class86.field1632[var7++] = class83.field1597;
                            } else {
                                class86.field1632[var7++] = var66.field389;
                            }
                            continue;
                        }
                    } else if (var472 < 2600) {
                        var10000 = arg1 + 1506528641;
                        var6--;
                        class24 var437 = class13.method73(var10000, class128.field2346[var6]);
                        if (var472 == 2500) {
                            class128.field2346[var6++] = var437.field421;
                            continue;
                        }
                        if (var472 == 2501) {
                            class128.field2346[var6++] = var437.field501;
                            continue;
                        }
                        if (var472 == 2502) {
                            class128.field2346[var6++] = var437.field468;
                            continue;
                        }
                        if (var472 == 2503) {
                            class128.field2346[var6++] = var437.field341;
                            continue;
                        }
                        if (var472 == 2504) {
                            class128.field2346[var6++] = var437.field495 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 2505) {
                            class128.field2346[var6++] = var437.field440;
                            continue;
                        }
                    } else if (var472 < 2700) {
                        var6--;
                        class24 var68 = class13.method73(1506528624, class128.field2346[var6]);
                        if (var472 == 2600) {
                            class128.field2346[var6++] = var68.field506;
                            continue;
                        }
                        if (var472 == 2601) {
                            class128.field2346[var6++] = var68.field412;
                            continue;
                        }
                        if (var472 == 2602) {
                            class86.field1632[var7++] = var68.field411;
                            continue;
                        }
                        if (var472 == 2603) {
                            class128.field2346[var6++] = var68.field377;
                            continue;
                        }
                        if (var472 == 2604) {
                            class128.field2346[var6++] = var68.field350;
                            continue;
                        }
                        if (var472 == 2605) {
                            class128.field2346[var6++] = var68.field345;
                            continue;
                        }
                        if (var472 == 2606) {
                            class128.field2346[var6++] = var68.field373;
                            continue;
                        }
                        if (var472 == 2607) {
                            class128.field2346[var6++] = var68.field475;
                            continue;
                        }
                        if (var472 == 2608) {
                            class128.field2346[var6++] = var68.field473;
                            continue;
                        }
                        if (var472 == 2609) {
                            class128.field2346[var6++] = var68.field342;
                            continue;
                        }
                    } else if (var472 < 2800) {
                        if (var472 == 2700) {
                            var10000 = arg1 + 1506528641;
                            var6--;
                            class24 var427 = class13.method73(var10000, class128.field2346[var6]);
                            class128.field2346[var6++] = var427.field348;
                            continue;
                        }
                        if (var472 == 2701) {
                            var6--;
                            class24 var428 = class13.method73(1506528624, class128.field2346[var6]);
                            if (var428.field348 == -1) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = var428.field355;
                            }
                            continue;
                        }
                        if (var472 == 2702) {
                            var6--;
                            int var429 = class128.field2346[var6];
                            class31 var430 = (class31) class93.field1727.method1601(-64, (long) var429);
                            if (var430 == null) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = 1;
                            }
                            continue;
                        }
                        if (var472 == 2703) {
                            var6--;
                            class24 var431 = class13.method73(1506528624, class128.field2346[var6]);
                            if (var431.field503 == null) {
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                            int var432 = var431.field503.length;
                            for (int var433 = 0; var433 < var431.field503.length; var433++) {
                                if (var431.field503[var433] == null) {
                                    var432 = var433;
                                    break;
                                }
                            }
                            class128.field2346[var6++] = var432;
                            continue;
                        }
                        if (var472 == 2704 || var472 == 2705) {
                            var6 -= 2;
                            int var434 = class128.field2346[var6];
                            int var435 = class128.field2346[var6 + 1];
                            class31 var436 = (class31) class93.field1727.method1601(90, (long) var434);
                            if (var436 != null && var436.field582 == var435) {
                                class128.field2346[var6++] = 1;
                            } else {
                                class128.field2346[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var472 < 2900) {
                        var6--;
                        class24 var69 = class13.method73(1506528624, class128.field2346[var6]);
                        if (var472 == 2800) {
                            class128.field2346[var6++] = class189.method1370(client.method1811(var69), false);
                            continue;
                        }
                        if (var472 == 2801) {
                            var6--;
                            int var70 = class128.field2346[var6];
                            int var474 = var70 - 1;
                            if (var69.field435 != null && var474 < var69.field435.length && var69.field435[var474] != null) {
                                class86.field1632[var7++] = var69.field435[var474];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 2802) {
                            if (var69.field389 == null) {
                                class86.field1632[var7++] = class83.field1597;
                            } else {
                                class86.field1632[var7++] = var69.field389;
                            }
                            continue;
                        }
                    } else if (var472 < 3200) {
                        if (var472 == 3100) {
                            var7--;
                            class46 var412 = class86.field1632[var7];
                            class155.method1136(71, class83.field1597, 0, var412);
                            continue;
                        }
                        if (var472 == 3101) {
                            var6 -= 2;
                            class134.method1037(class128.field2346[var6], class277.field4824, 3118, class128.field2346[var6 + 1]);
                            continue;
                        }
                        if (var472 == 3103) {
                            class198.method1414(25);
                            continue;
                        }
                        if (var472 == 3104) {
                            var7--;
                            class46 var413 = class86.field1632[var7];
                            class185.field3308++;
                            int var414 = 0;
                            if (var413.method326(arg1 - 28077)) {
                                var414 = var413.method330(102);
                            }
                            class58.field967.method285((byte) -90, 224);
                            class58.field967.method581(true, var414);
                            continue;
                        }
                        if (var472 == 3105) {
                            var7--;
                            class46 var415 = class86.field1632[var7];
                            class260.field4532++;
                            class58.field967.method285((byte) -90, 129);
                            class58.field967.method578((byte) -128, var415.method349((byte) 59));
                            continue;
                        }
                        if (var472 == 3106) {
                            var7--;
                            class46 var416 = class86.field1632[var7];
                            class58.field967.method285((byte) -90, 98);
                            class58.field967.method570(var416.method314(58) + 1, 15619);
                            class219.field3864++;
                            class58.field967.method584(var416, arg1 + 19364);
                            continue;
                        }
                        if (var472 == 3107) {
                            var6--;
                            int var417 = class128.field2346[var6];
                            var7--;
                            class46 var418 = class86.field1632[var7];
                            class249.method1689(1, var418, var417);
                            continue;
                        }
                        if (var472 == 3108) {
                            var6 -= 3;
                            int var419 = class128.field2346[var6];
                            int var420 = class128.field2346[var6 + 1];
                            int var421 = class128.field2346[var6 + 2];
                            class24 var422 = class13.method73(1506528624, var421);
                            class170.method1217(var422, var420, var419, (byte) 119);
                            continue;
                        }
                        if (var472 == 3109) {
                            var6 -= 2;
                            int var423 = class128.field2346[var6];
                            int var424 = class128.field2346[var6 + 1];
                            class24 var425 = var46 ? class10.field169 : class6.field108;
                            class170.method1217(var425, var424, var423, (byte) 106);
                            continue;
                        }
                        if (var472 == 3110) {
                            class193.field3458++;
                            var6--;
                            int var426 = class128.field2346[var6];
                            class58.field967.method285((byte) -90, 37);
                            class58.field967.method546((byte) 113, var426);
                            continue;
                        }
                    } else if (var472 < 3300) {
                        if (var472 == 3200) {
                            var6 -= 3;
                            class207.method1463(class128.field2346[var6], arg1 ^ 0xFFFFFFEF, class128.field2346[var6 + 1], class128.field2346[var6 + 2]);
                            continue;
                        }
                        if (var472 == 3201) {
                            var6--;
                            class149.method1099(class128.field2346[var6], true);
                            continue;
                        }
                        if (var472 == 3202) {
                            var6 -= 2;
                            class17.method91(arg1 + 6224, class128.field2346[var6], class128.field2346[var6 + 1]);
                            continue;
                        }
                    } else if (var472 < 3400) {
                        if (var472 == 3300) {
                            class128.field2346[var6++] = class157.field2803;
                            continue;
                        }
                        if (var472 == 3301) {
                            var6 -= 2;
                            int var71 = class128.field2346[var6];
                            int var72 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class129.method997(false, var72, var71);
                            continue;
                        }
                        if (var472 == 3302) {
                            var6 -= 2;
                            int var73 = class128.field2346[var6];
                            int var74 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class137.method1047(var74, var73, (byte) -107);
                            continue;
                        }
                        if (var472 == 3303) {
                            var6 -= 2;
                            int var75 = class128.field2346[var6 + 1];
                            int var76 = class128.field2346[var6];
                            class128.field2346[var6++] = class111.method908(var75, (byte) 126, var76);
                            continue;
                        }
                        if (var472 == 3304) {
                            var6--;
                            int var77 = class128.field2346[var6];
                            class128.field2346[var6++] = class166.method1184((byte) -39, var77).field203;
                            continue;
                        }
                        if (var472 == 3305) {
                            var6--;
                            int var78 = class128.field2346[var6];
                            class128.field2346[var6++] = class221.field3895[var78];
                            continue;
                        }
                        if (var472 == 3306) {
                            var6--;
                            int var79 = class128.field2346[var6];
                            class128.field2346[var6++] = class235.field4084[var79];
                            continue;
                        }
                        if (var472 == 3307) {
                            var6--;
                            int var80 = class128.field2346[var6];
                            class128.field2346[var6++] = class140.field2511[var80];
                            continue;
                        }
                        if (var472 == 3308) {
                            int var81 = (class277.field4824.field2585 >> 7) + class29.field567;
                            int var82 = (class277.field4824.field2546 >> 7) + class77.field1432;
                            int var83 = class135.field2450;
                            class128.field2346[var6++] = (var83 << 28) + (var81 << 14) + var82;
                            continue;
                        }
                        if (var472 == 3309) {
                            var6--;
                            int var84 = class128.field2346[var6];
                            class128.field2346[var6++] = class50.method369(var84 >> 14, 16383);
                            continue;
                        }
                        if (var472 == 3310) {
                            var6--;
                            int var85 = class128.field2346[var6];
                            class128.field2346[var6++] = var85 >> 28;
                            continue;
                        }
                        if (var472 == 3311) {
                            var6--;
                            int var86 = class128.field2346[var6];
                            class128.field2346[var6++] = class50.method369(var86, 16383);
                            continue;
                        }
                        if (var472 == 3312) {
                            class128.field2346[var6++] = class124.field2290 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3313) {
                            var6 -= 2;
                            int var87 = class128.field2346[var6] + 32768;
                            int var88 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class129.method997(false, var88, var87);
                            continue;
                        }
                        if (var472 == 3314) {
                            var6 -= 2;
                            int var89 = class128.field2346[var6 + 1];
                            int var90 = class128.field2346[var6] + 32768;
                            class128.field2346[var6++] = class137.method1047(var89, var90, (byte) -107);
                            continue;
                        }
                        if (var472 == 3315) {
                            var6 -= 2;
                            int var91 = class128.field2346[var6] + 32768;
                            int var92 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class111.method908(var92, (byte) 121, var91);
                            continue;
                        }
                        if (var472 == 3316) {
                            if (class245.field4355 >= 2) {
                                class128.field2346[var6++] = class245.field4355;
                            } else {
                                class128.field2346[var6++] = 0;
                            }
                            continue;
                        }
                        if (var472 == 3317) {
                            class128.field2346[var6++] = class244.field4335;
                            continue;
                        }
                        if (var472 == 3318) {
                            class128.field2346[var6++] = class97.field1808;
                            continue;
                        }
                        if (var472 == 3321) {
                            class128.field2346[var6++] = class105.field1885;
                            continue;
                        }
                        if (var472 == 3322) {
                            class128.field2346[var6++] = class65.field1099;
                            continue;
                        }
                        if (var472 == 3323) {
                            if (class38.field675 >= 5 && class38.field675 <= 9) {
                                class128.field2346[var6++] = 1;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3324) {
                            if (class38.field675 >= 5 && class38.field675 <= 9) {
                                class128.field2346[var6++] = class38.field675;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3325) {
                            class128.field2346[var6++] = class46.field786 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3326) {
                            class128.field2346[var6++] = class277.field4824.field1550;
                            continue;
                        }
                        if (var472 == 3327) {
                            class128.field2346[var6++] = class277.field4824.field1527.field1417 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3328) {
                            class128.field2346[var6++] = class248.field4383;
                            continue;
                        }
                        if (var472 == 3329) {
                            class128.field2346[var6++] = class78.field1497;
                            continue;
                        }
                        if (var472 == 3330) {
                            var6--;
                            int var93 = class128.field2346[var6];
                            class128.field2346[var6++] = class166.method1185(arg1 - 60, var93);
                            continue;
                        }
                        if (var472 == 3331) {
                            var6 -= 2;
                            int var94 = class128.field2346[var6 + 1];
                            int var95 = class128.field2346[var6];
                            class128.field2346[var6++] = class112.method912(var95, false, var94, class51.method376(arg1, -17));
                            continue;
                        }
                        if (var472 == 3332) {
                            var6 -= 2;
                            int var96 = class128.field2346[var6];
                            int var97 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class112.method912(var96, true, var97, 0);
                            continue;
                        }
                        if (var472 == 3333) {
                            class128.field2346[var6++] = class270.field4718;
                            continue;
                        }
                        if (var472 == 3335) {
                            class128.field2346[var6++] = class135.field2443;
                            continue;
                        }
                    } else if (var472 < 3500) {
                        if (var472 == 3400) {
                            var6 -= 2;
                            int var395 = class128.field2346[var6];
                            int var396 = class128.field2346[var6 + 1];
                            class37 var397 = class115.method930(8, var395);
                            class86.field1632[var7++] = var397.method249(var396, true);
                            continue;
                        }
                        if (var472 == 3408) {
                            var6 -= 4;
                            int var398 = class128.field2346[var6 + 1];
                            int var399 = class128.field2346[var6];
                            int var400 = class128.field2346[var6 + 2];
                            int var401 = class128.field2346[var6 + 3];
                            class37 var402 = class115.method930(8, var400);
                            if (var402.field651 == var399 && var402.field653 == var398) {
                                if (var398 == 115) {
                                    class86.field1632[var7++] = var402.method249(var401, true);
                                } else {
                                    class128.field2346[var6++] = var402.method252(var401, (byte) -58);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var472 == 3409) {
                            var6 -= 3;
                            int var403 = class128.field2346[var6];
                            int var404 = class128.field2346[var6 + 2];
                            int var405 = class128.field2346[var6 + 1];
                            if (var405 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class37 var406 = class115.method930(arg1 ^ 0xFFFFFFE7, var405);
                            if (var406.field653 != var403) {
                                throw new RuntimeException("C3409-1");
                            }
                            class128.field2346[var6++] = var406.method250(var404, (byte) 93) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3410) {
                            var7--;
                            class46 var407 = class86.field1632[var7];
                            var6--;
                            int var408 = class128.field2346[var6];
                            if (var408 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class37 var409 = class115.method930(8, var408);
                            if (var409.field653 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class128.field2346[var6++] = var409.method247(var407, arg1 + 124) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3411) {
                            var6--;
                            int var410 = class128.field2346[var6];
                            class37 var411 = class115.method930(8, var410);
                            class128.field2346[var6++] = var411.field647.method1600(false);
                            continue;
                        }
                    } else if (var472 < 3700) {
                        if (var472 == 3600) {
                            if (class208.field3727 == 0) {
                                class128.field2346[var6++] = -2;
                            } else if (class208.field3727 == 1) {
                                class128.field2346[var6++] = -1;
                            } else {
                                class128.field2346[var6++] = class97.field1806;
                            }
                            continue;
                        }
                        if (var472 == 3601) {
                            var6--;
                            int var373 = class128.field2346[var6];
                            if (class208.field3727 == 2 && class97.field1806 > var373) {
                                class86.field1632[var7++] = class3.field37[var373];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 3602) {
                            var6--;
                            int var374 = class128.field2346[var6];
                            if (class208.field3727 == 2 && class97.field1806 > var374) {
                                class128.field2346[var6++] = class273.field4767[var374];
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3603) {
                            var6--;
                            int var375 = class128.field2346[var6];
                            if (class208.field3727 == 2 && class97.field1806 > var375) {
                                class128.field2346[var6++] = class108.field2008[var375];
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3604) {
                            var7--;
                            class46 var376 = class86.field1632[var7];
                            var6--;
                            int var377 = class128.field2346[var6];
                            class93.method737(var377, var376, arg1 + 17);
                            continue;
                        }
                        if (var472 == 3605) {
                            var7--;
                            class46 var378 = class86.field1632[var7];
                            class106.method817(200, var378.method349((byte) 59));
                            continue;
                        }
                        if (var472 == 3606) {
                            var7--;
                            class46 var379 = class86.field1632[var7];
                            class105.method790((byte) -27, var379.method349((byte) 59));
                            continue;
                        }
                        if (var472 == 3607) {
                            var7--;
                            class46 var380 = class86.field1632[var7];
                            class45.method300(var380.method349((byte) 59), arg1 + 17);
                            continue;
                        }
                        if (var472 == 3608) {
                            var7--;
                            class46 var381 = class86.field1632[var7];
                            class202.method1432(false, var381.method349((byte) 59));
                            continue;
                        }
                        if (var472 == 3609) {
                            var7--;
                            class46 var382 = class86.field1632[var7];
                            if (var382.method304(113, class274.field4787) || var382.method304(113, class73.field1310)) {
                                var382 = var382.method339(7, arg1 ^ 0xFFFFFFD8);
                            }
                            class128.field2346[var6++] = class158.method1162(var382, class51.method376(arg1, -18)) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3610) {
                            var6--;
                            int var383 = class128.field2346[var6];
                            if (class208.field3727 == 2 && class97.field1806 > var383) {
                                class86.field1632[var7++] = class74.field1343[var383];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 3611) {
                            if (class100.field1849 == null) {
                                class86.field1632[var7++] = class83.field1597;
                            } else {
                                class86.field1632[var7++] = class100.field1849.method306(true);
                            }
                            continue;
                        }
                        if (var472 == 3612) {
                            if (class100.field1849 == null) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = class245.field4361;
                            }
                            continue;
                        }
                        if (var472 == 3613) {
                            var6--;
                            int var384 = class128.field2346[var6];
                            if (class100.field1849 != null && class245.field4361 > var384) {
                                class86.field1632[var7++] = class107.field2000[var384].field1813.method306(true);
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 3614) {
                            var6--;
                            int var385 = class128.field2346[var6];
                            if (class100.field1849 != null && var385 < class245.field4361) {
                                class128.field2346[var6++] = class107.field2000[var385].field1810;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3615) {
                            var6--;
                            int var386 = class128.field2346[var6];
                            if (class100.field1849 != null && var386 < class245.field4361) {
                                class128.field2346[var6++] = class107.field2000[var386].field1812;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3616) {
                            class128.field2346[var6++] = class66.field1114;
                            continue;
                        }
                        if (var472 == 3617) {
                            var7--;
                            class46 var387 = class86.field1632[var7];
                            class181.method1311(var387, -112);
                            continue;
                        }
                        if (var472 == 3618) {
                            class128.field2346[var6++] = class92.field1724;
                            continue;
                        }
                        if (var472 == 3619) {
                            var7--;
                            class46 var388 = class86.field1632[var7];
                            class48.method356(0, var388.method349((byte) 59));
                            continue;
                        }
                        if (var472 == 3620) {
                            class96.method752((byte) 94);
                            continue;
                        }
                        if (var472 == 3621) {
                            if (class208.field3727 == 0) {
                                class128.field2346[var6++] = -1;
                            } else {
                                class128.field2346[var6++] = class42.field714;
                            }
                            continue;
                        }
                        if (var472 == 3622) {
                            var6--;
                            int var389 = class128.field2346[var6];
                            if (class208.field3727 != 0 && var389 < class42.field714) {
                                class86.field1632[var7++] = class277.method1862((byte) -64, class29.field562[var389]).method306(true);
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 3623) {
                            var7--;
                            class46 var390 = class86.field1632[var7];
                            if (var390.method304(113, class274.field4787) || var390.method304(113, class73.field1310)) {
                                var390 = var390.method339(7, 108);
                            }
                            class128.field2346[var6++] = class87.method678(var390, 0) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3624) {
                            var6--;
                            int var391 = class128.field2346[var6];
                            if (class107.field2000 != null && var391 < class245.field4361 && class107.field2000[var391].field1813.method315((byte) -38, class277.field4824.field1528)) {
                                class128.field2346[var6++] = 1;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3625) {
                            if (class235.field4098 == null) {
                                class86.field1632[var7++] = class83.field1597;
                            } else {
                                class86.field1632[var7++] = class235.field4098.method306(true);
                            }
                            continue;
                        }
                        if (var472 == 3626) {
                            var6--;
                            int var392 = class128.field2346[var6];
                            if (class100.field1849 != null && class245.field4361 > var392) {
                                class86.field1632[var7++] = class107.field2000[var392].field1809;
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 3627) {
                            var6--;
                            int var393 = class128.field2346[var6];
                            if (class208.field3727 == 2 && var393 >= 0 && var393 < class97.field1806) {
                                class128.field2346[var6++] = class252.field4441[var393] ? 1 : 0;
                                continue;
                            }
                            class128.field2346[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3628) {
                            var7--;
                            class46 var394 = class86.field1632[var7];
                            if (var394.method304(arg1 ^ 0xFFFFFF9E, class274.field4787) || var394.method304(113, class73.field1310)) {
                                var394 = var394.method339(7, arg1 ^ 0xFFFFFFDF);
                            }
                            class128.field2346[var6++] = class274.method1851(-60, var394);
                            continue;
                        }
                    } else if (var472 < 4000) {
                        if (var472 == 3903) {
                            var6--;
                            int var98 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var98].method441(true);
                            continue;
                        }
                        if (var472 == 3904) {
                            var6--;
                            int var99 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var99].field1055;
                            continue;
                        }
                        if (var472 == 3905) {
                            var6--;
                            int var100 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var100].field1073;
                            continue;
                        }
                        if (var472 == 3906) {
                            var6--;
                            int var101 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var101].field1068;
                            continue;
                        }
                        if (var472 == 3907) {
                            var6--;
                            int var102 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var102].field1054;
                            continue;
                        }
                        if (var472 == 3908) {
                            var6--;
                            int var103 = class128.field2346[var6];
                            class128.field2346[var6++] = class255.field4465[var103].field1064;
                            continue;
                        }
                        if (var472 == 3910) {
                            var6--;
                            int var104 = class128.field2346[var6];
                            int var105 = class255.field4465[var104].method442(arg1 ^ 0xFFFFFFE8);
                            class128.field2346[var6++] = var105 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3911) {
                            var6--;
                            int var106 = class128.field2346[var6];
                            int var107 = class255.field4465[var106].method442(7);
                            class128.field2346[var6++] = var107 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3912) {
                            var6--;
                            int var108 = class128.field2346[var6];
                            int var109 = class255.field4465[var108].method442(arg1 ^ 0xFFFFFFE8);
                            class128.field2346[var6++] = var109 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3913) {
                            var6--;
                            int var110 = class128.field2346[var6];
                            int var111 = class255.field4465[var110].method442(7);
                            class128.field2346[var6++] = var111 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var472 < 4100) {
                        if (var472 == 4000) {
                            var6 -= 2;
                            int var112 = class128.field2346[var6];
                            int var113 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var112 + var113;
                            continue;
                        }
                        if (var472 == 4001) {
                            var6 -= 2;
                            int var114 = class128.field2346[var6];
                            int var115 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var114 - var115;
                            continue;
                        }
                        if (var472 == 4002) {
                            var6 -= 2;
                            int var116 = class128.field2346[var6 + 1];
                            int var117 = class128.field2346[var6];
                            class128.field2346[var6++] = var116 * var117;
                            continue;
                        }
                        if (var472 == 4003) {
                            var6 -= 2;
                            int var118 = class128.field2346[var6];
                            int var119 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var118 / var119;
                            continue;
                        }
                        if (var472 == 4004) {
                            var6--;
                            int var120 = class128.field2346[var6];
                            class128.field2346[var6++] = (int) ((double) var120 * Math.random());
                            continue;
                        }
                        if (var472 == 4005) {
                            var6--;
                            int var121 = class128.field2346[var6];
                            class128.field2346[var6++] = (int) ((double) (var121 + 1) * Math.random());
                            continue;
                        }
                        if (var472 == 4006) {
                            var6 -= 5;
                            int var122 = class128.field2346[var6];
                            int var123 = class128.field2346[var6 + 1];
                            int var124 = class128.field2346[var6 + 3];
                            int var125 = class128.field2346[var6 + 4];
                            int var126 = class128.field2346[var6 + 2];
                            class128.field2346[var6++] = (var125 - var126) * (var123 - var122) / (var124 - var126) + var122;
                            continue;
                        }
                        if (var472 == 4007) {
                            var6 -= 2;
                            long var127 = (long) class128.field2346[var6 + 1];
                            long var129 = (long) class128.field2346[var6];
                            class128.field2346[var6++] = (int) (var129 + (var127 * var129 / 100L));
                            continue;
                        }
                        if (var472 == 4008) {
                            var6 -= 2;
                            int var131 = class128.field2346[var6];
                            int var132 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class235.method1595(0x1 << var132, var131);
                            continue;
                        }
                        if (var472 == 4009) {
                            var6 -= 2;
                            int var133 = class128.field2346[var6];
                            int var134 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class50.method369(-(0x1 << var134) - 1, var133);
                            continue;
                        }
                        if (var472 == 4010) {
                            var6 -= 2;
                            int var135 = class128.field2346[var6 + 1];
                            int var136 = class128.field2346[var6];
                            class128.field2346[var6++] = class50.method369(var136, 0x1 << var135) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var472 == 4011) {
                            var6 -= 2;
                            int var137 = class128.field2346[var6];
                            int var138 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var137 % var138;
                            continue;
                        }
                        if (var472 == 4012) {
                            var6 -= 2;
                            int var139 = class128.field2346[var6];
                            int var140 = class128.field2346[var6 + 1];
                            if (var139 == 0) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = (int) Math.pow((double) var139, (double) var140);
                            }
                            continue;
                        }
                        if (var472 == 4013) {
                            var6 -= 2;
                            int var141 = class128.field2346[var6 + 1];
                            int var142 = class128.field2346[var6];
                            if (var142 == 0) {
                                class128.field2346[var6++] = 0;
                            } else if (var141 == 0) {
                                class128.field2346[var6++] = Integer.MAX_VALUE;
                            } else {
                                class128.field2346[var6++] = (int) Math.pow((double) var142, 1.0D / (double) var141);
                            }
                            continue;
                        }
                        if (var472 == 4014) {
                            var6 -= 2;
                            int var143 = class128.field2346[var6];
                            int var144 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = class50.method369(var143, var144);
                            continue;
                        }
                        if (var472 == 4015) {
                            var6 -= 2;
                            int var145 = class128.field2346[var6 + 1];
                            int var146 = class128.field2346[var6];
                            class128.field2346[var6++] = class235.method1595(var145, var146);
                            continue;
                        }
                        if (var472 == 4016) {
                            var6 -= 2;
                            int var147 = class128.field2346[var6];
                            int var148 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var148 <= var147 ? var148 : var147;
                            continue;
                        }
                        if (var472 == 4017) {
                            var6 -= 2;
                            int var149 = class128.field2346[var6];
                            int var150 = class128.field2346[var6 + 1];
                            class128.field2346[var6++] = var150 >= var149 ? var150 : var149;
                            continue;
                        }
                        if (var472 == 4018) {
                            var6 -= 3;
                            long var151 = (long) class128.field2346[var6];
                            long var153 = (long) class128.field2346[var6 + 1];
                            long var155 = (long) class128.field2346[var6 + 2];
                            class128.field2346[var6++] = (int) (var151 * var155 / var153);
                            continue;
                        }
                    } else if (var472 < 4200) {
                        if (var472 == 4100) {
                            var7--;
                            class46 var321 = class86.field1632[var7];
                            var6--;
                            int var322 = class128.field2346[var6];
                            class86.field1632[var7++] = class109.method855(0, new class46[] { var321, class115.method932(false, var322) });
                            continue;
                        }
                        if (var472 == 4101) {
                            var7 -= 2;
                            class46 var323 = class86.field1632[var7];
                            class46 var324 = class86.field1632[var7 + 1];
                            class86.field1632[var7++] = class109.method855(arg1 + 17, new class46[] { var323, var324 });
                            continue;
                        }
                        if (var472 == 4102) {
                            var7--;
                            class46 var325 = class86.field1632[var7];
                            var6--;
                            int var326 = class128.field2346[var6];
                            class86.field1632[var7++] = class109.method855(0, new class46[] { var325, class111.method907(31542, true, var326) });
                            continue;
                        }
                        if (var472 == 4103) {
                            var7--;
                            class46 var327 = class86.field1632[var7];
                            class86.field1632[var7++] = var327.method305(106);
                            continue;
                        }
                        if (var472 == 4104) {
                            var6--;
                            int var328 = class128.field2346[var6];
                            long var329 = ((long) var328 + 11745L) * 86400000L;
                            class239.field4252.setTime(new Date(var329));
                            int var331 = class239.field4252.get(5);
                            int var332 = class239.field4252.get(2);
                            int var333 = class239.field4252.get(1);
                            class86.field1632[var7++] = class109.method855(0, new class46[] { class115.method932(false, var331), class38.field671, class162.field2862[var332], class38.field671, class115.method932(false, var333) });
                            continue;
                        }
                        if (var472 == 4105) {
                            var7 -= 2;
                            class46 var334 = class86.field1632[var7];
                            class46 var335 = class86.field1632[var7 + 1];
                            if (class277.field4824.field1527 != null && class277.field4824.field1527.field1417) {
                                class86.field1632[var7++] = var335;
                                continue;
                            }
                            class86.field1632[var7++] = var334;
                            continue;
                        }
                        if (var472 == 4106) {
                            var6--;
                            int var336 = class128.field2346[var6];
                            class86.field1632[var7++] = class115.method932(false, var336);
                            continue;
                        }
                        if (var472 == 4107) {
                            var7 -= 2;
                            class128.field2346[var6++] = class86.field1632[var7].method341((byte) -45, class86.field1632[var7 + 1]);
                            continue;
                        }
                        if (var472 == 4108) {
                            var6 -= 2;
                            int var337 = class128.field2346[var6];
                            int var338 = class128.field2346[var6 + 1];
                            var7--;
                            class46 var339 = class86.field1632[var7];
                            byte[] var340 = class92.field1721.method1293(0, var338, (byte) -99);
                            class256 var341 = new class256(var340);
                            var341.method131(class74.field1313, (int[]) null);
                            class128.field2346[var6++] = var341.method140(var339, var337);
                            continue;
                        }
                        if (var472 == 4109) {
                            var7--;
                            class46 var342 = class86.field1632[var7];
                            var6 -= 2;
                            int var343 = class128.field2346[var6 + 1];
                            int var344 = class128.field2346[var6];
                            byte[] var345 = class92.field1721.method1293(0, var343, (byte) -98);
                            class256 var346 = new class256(var345);
                            var346.method131(class74.field1313, (int[]) null);
                            class128.field2346[var6++] = var346.method146(var342, var344);
                            continue;
                        }
                        if (var472 == 4110) {
                            var7 -= 2;
                            class46 var347 = class86.field1632[var7];
                            class46 var348 = class86.field1632[var7 + 1];
                            var6--;
                            if (class128.field2346[var6] == 1) {
                                class86.field1632[var7++] = var347;
                            } else {
                                class86.field1632[var7++] = var348;
                            }
                            continue;
                        }
                        if (var472 == 4111) {
                            var7--;
                            class46 var349 = class86.field1632[var7];
                            class86.field1632[var7++] = class22.method137(var349);
                            continue;
                        }
                        if (var472 == 4112) {
                            var7--;
                            class46 var350 = class86.field1632[var7];
                            var6--;
                            int var351 = class128.field2346[var6];
                            if (var351 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class86.field1632[var7++] = var350.method345((byte) 107, var351);
                            continue;
                        }
                        if (var472 == 4113) {
                            var6--;
                            int var352 = class128.field2346[var6];
                            class128.field2346[var6++] = class95.method743(0, var352) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4114) {
                            var6--;
                            int var353 = class128.field2346[var6];
                            class128.field2346[var6++] = class196.method1402(var353, -87) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4115) {
                            var6--;
                            int var354 = class128.field2346[var6];
                            class128.field2346[var6++] = class109.method853(-27714, var354) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4116) {
                            var6--;
                            int var355 = class128.field2346[var6];
                            class128.field2346[var6++] = class102.method775(var355, -34) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4117) {
                            var7--;
                            class46 var356 = class86.field1632[var7];
                            if (var356 == null) {
                                class128.field2346[var6++] = 0;
                            } else {
                                class128.field2346[var6++] = var356.method314(9);
                            }
                            continue;
                        }
                        if (var472 == 4118) {
                            var6 -= 2;
                            var7--;
                            class46 var357 = class86.field1632[var7];
                            int var358 = class128.field2346[var6];
                            int var359 = class128.field2346[var6 + 1];
                            class86.field1632[var7++] = var357.method338(19551, var359, var358);
                            continue;
                        }
                        if (var472 == 4119) {
                            var7--;
                            class46 var360 = class86.field1632[var7];
                            class46 var361 = class181.method1305(25127, var360.method314(arg1 + 121));
                            boolean var362 = false;
                            for (int var363 = 0; var363 < var360.method314(113); var363++) {
                                int var364 = var360.method318(var363, (byte) -56);
                                if (var364 == 60) {
                                    var362 = true;
                                } else if (var364 == 62) {
                                    var362 = false;
                                } else if (!var362) {
                                    var361.method351(91, var364);
                                }
                            }
                            var361.method343(arg1 + 126);
                            class86.field1632[var7++] = var361;
                            continue;
                        }
                        if (var472 == 4120) {
                            var6 -= 2;
                            var7--;
                            class46 var365 = class86.field1632[var7];
                            int var366 = class128.field2346[var6 + 1];
                            int var367 = class128.field2346[var6];
                            class128.field2346[var6++] = var365.method322(-1, var367, var366);
                            continue;
                        }
                        if (var472 == 4121) {
                            var7 -= 2;
                            class46 var368 = class86.field1632[var7];
                            class46 var369 = class86.field1632[var7 + 1];
                            var6--;
                            int var370 = class128.field2346[var6];
                            class128.field2346[var6++] = var368.method336((byte) -41, var370, var369);
                            continue;
                        }
                        if (var472 == 4122) {
                            var6--;
                            int var371 = class128.field2346[var6];
                            class128.field2346[var6++] = class174.method1251(true, var371);
                            continue;
                        }
                        if (var472 == 4123) {
                            var6--;
                            int var372 = class128.field2346[var6];
                            class128.field2346[var6++] = class68.method496(var372, class51.method376(arg1, -125));
                            continue;
                        }
                    } else if (var472 < 4300) {
                        if (var472 == 4200) {
                            var6--;
                            int var157 = class128.field2346[var6];
                            class86.field1632[var7++] = class80.method633(var157, class51.method376(arg1, -17)).field1213;
                            continue;
                        }
                        if (var472 == 4201) {
                            var6 -= 2;
                            int var158 = class128.field2346[var6];
                            int var159 = class128.field2346[var6 + 1];
                            class71 var160 = class80.method633(var158, arg1 ^ 0xFFFFFFEF);
                            if (var159 >= 1 && var159 <= 5 && var160.field1220[var159 - 1] != null) {
                                class86.field1632[var7++] = var160.field1220[var159 - 1];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 4202) {
                            var6 -= 2;
                            int var161 = class128.field2346[var6];
                            int var162 = class128.field2346[var6 + 1];
                            class71 var163 = class80.method633(var161, 0);
                            if (var162 >= 1 && var162 <= 5 && var163.field1240[var162 - 1] != null) {
                                class86.field1632[var7++] = var163.field1240[var162 - 1];
                                continue;
                            }
                            class86.field1632[var7++] = class83.field1597;
                            continue;
                        }
                        if (var472 == 4203) {
                            var6--;
                            int var164 = class128.field2346[var6];
                            class128.field2346[var6++] = class80.method633(var164, 0).field1257;
                            continue;
                        }
                        if (var472 == 4204) {
                            var6--;
                            int var165 = class128.field2346[var6];
                            class128.field2346[var6++] = class80.method633(var165, 0).field1226 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4205) {
                            var6--;
                            int var166 = class128.field2346[var6];
                            class71 var167 = class80.method633(var166, arg1 ^ 0xFFFFFFEF);
                            if (var167.field1222 == -1 && var167.field1260 >= 0) {
                                class128.field2346[var6++] = var167.field1260;
                                continue;
                            }
                            class128.field2346[var6++] = var166;
                            continue;
                        }
                        if (var472 == 4206) {
                            var6--;
                            int var168 = class128.field2346[var6];
                            class71 var169 = class80.method633(var168, 0);
                            if (var169.field1222 >= 0 && var169.field1260 >= 0) {
                                class128.field2346[var6++] = var169.field1260;
                                continue;
                            }
                            class128.field2346[var6++] = var168;
                            continue;
                        }
                        if (var472 == 4207) {
                            var6--;
                            int var170 = class128.field2346[var6];
                            class128.field2346[var6++] = class80.method633(var170, 0).field1275 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4208) {
                            var6 -= 2;
                            int var171 = class128.field2346[var6];
                            int var172 = class128.field2346[var6 + 1];
                            class185 var173 = class250.method1698(var172, 13942);
                            if (var173.method1337((byte) 61)) {
                                class86.field1632[var7++] = class80.method633(var171, arg1 + 17).method511(var172, 10, var173.field3306);
                            } else {
                                class128.field2346[var6++] = class80.method633(var171, 0).method513(var173.field3304, var172, -1);
                            }
                            continue;
                        }
                        if (var472 == 4210) {
                            var7--;
                            class46 var174 = class86.field1632[var7];
                            var6--;
                            int var175 = class128.field2346[var6];
                            class93.method724(var174, var175 == 1, 16);
                            class128.field2346[var6++] = class214.field3796;
                            continue;
                        }
                        if (var472 == 4211) {
                            if (class5.field84 != null && class214.field3796 > class108.field2007) {
                                class128.field2346[var6++] = class50.method369(65535, class5.field84[class108.field2007++]);
                                continue;
                            }
                            class128.field2346[var6++] = -1;
                            continue;
                        }
                        if (var472 == 4212) {
                            class108.field2007 = 0;
                            continue;
                        }
                    } else if (var472 < 4400) {
                        if (var472 == 4300) {
                            var6 -= 2;
                            int var176 = class128.field2346[var6];
                            int var177 = class128.field2346[var6 + 1];
                            class185 var178 = class250.method1698(var177, 13942);
                            if (var178.method1337((byte) 61)) {
                                class86.field1632[var7++] = class156.method1152(var176, (byte) -116).method627(var178.field3306, arg1 + 145, var177);
                            } else {
                                class128.field2346[var6++] = class156.method1152(var176, (byte) -122).method617(-10, var178.field3304, var177);
                            }
                            continue;
                        }
                        if (var472 == 4301) {
                            var6--;
                            int var179 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var179, (byte) -124).field1439;
                            continue;
                        }
                        if (var472 == 4302) {
                            var6--;
                            int var180 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var180, (byte) -118).field1488;
                            continue;
                        }
                        if (var472 == 4303) {
                            var6--;
                            int var181 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var181, (byte) -128).field1489;
                            continue;
                        }
                        if (var472 == 4304) {
                            var6--;
                            int var182 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var182, (byte) -128).field1499;
                            continue;
                        }
                        if (var472 == 4305) {
                            var6--;
                            int var183 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var183, (byte) -116).field1475;
                            continue;
                        }
                        if (var472 == 4306) {
                            var6--;
                            int var184 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var184, (byte) -120).field1471;
                            continue;
                        }
                        if (var472 == 4307) {
                            var6--;
                            int var185 = class128.field2346[var6];
                            class128.field2346[var6++] = class156.method1152(var185, (byte) -124).field1447;
                            continue;
                        }
                    } else if (var472 < 4500) {
                        if (var472 == 4400) {
                            var6 -= 2;
                            int var186 = class128.field2346[var6 + 1];
                            int var187 = class128.field2346[var6];
                            class185 var188 = class250.method1698(var186, arg1 ^ 0xFFFFC999);
                            if (var188.method1337((byte) 61)) {
                                class86.field1632[var7++] = class157.method1158(var187, 125).method1606(var188.field3306, (byte) -117, var186);
                            } else {
                                class128.field2346[var6++] = class157.method1158(var187, 114).method1604(var188.field3304, class51.method376(arg1, 17), var186);
                            }
                            continue;
                        }
                    } else if (var472 >= 4600) {
                        if (var472 < 5100) {
                            if (var472 == 5000) {
                                class128.field2346[var6++] = class168.field2953;
                                continue;
                            }
                            if (var472 == 5001) {
                                class89.field1678++;
                                var6 -= 3;
                                class168.field2953 = class128.field2346[var6];
                                class175.field3154 = class128.field2346[var6 + 1];
                                class220.field3877 = class128.field2346[var6 + 2];
                                class58.field967.method285((byte) -90, 86);
                                class58.field967.method570(class168.field2953, 15619);
                                class58.field967.method570(class175.field3154, 15619);
                                class58.field967.method570(class220.field3877, 15619);
                                continue;
                            }
                            if (var472 == 5002) {
                                var6 -= 2;
                                int var255 = class128.field2346[var6];
                                class103.field1872++;
                                int var256 = class128.field2346[var6 + 1];
                                var7--;
                                class46 var257 = class86.field1632[var7];
                                class58.field967.method285((byte) -90, 152);
                                class58.field967.method578((byte) 109, var257.method349((byte) 59));
                                class58.field967.method570(var255 - 1, arg1 ^ 0xFFFFC2EC);
                                class58.field967.method570(var256, arg1 + 15636);
                                continue;
                            }
                            if (var472 == 5003) {
                                var6--;
                                int var258 = class128.field2346[var6];
                                class46 var259 = null;
                                if (var258 < 100) {
                                    var259 = class233.field4054[var258];
                                }
                                if (var259 == null) {
                                    var259 = class83.field1597;
                                }
                                class86.field1632[var7++] = var259;
                                continue;
                            }
                            if (var472 == 5004) {
                                var6--;
                                int var260 = class128.field2346[var6];
                                int var261 = -1;
                                if (var260 < 100 && class233.field4054[var260] != null) {
                                    var261 = class155.field2745[var260];
                                }
                                class128.field2346[var6++] = var261;
                                continue;
                            }
                            if (var472 == 5005) {
                                class128.field2346[var6++] = class175.field3154;
                                continue;
                            }
                            if (var472 == 5008) {
                                var7--;
                                class46 var262 = class86.field1632[var7];
                                if (var262.method304(113, class198.field3548)) {
                                    class187.method1362(var262, 2);
                                    continue;
                                }
                                if (class245.field4355 == 0 && (class248.field4383 == 1 || class78.field1497 == 1)) {
                                    continue;
                                }
                                class137.field2468++;
                                class46 var263 = var262.method305(-22);
                                byte var264 = 0;
                                if (var263.method304(113, class187.field3348)) {
                                    var264 = 0;
                                    var262 = var262.method339(class187.field3348.method314(arg1 + 73), -116);
                                } else if (var263.method304(113, class162.field2876)) {
                                    var264 = 1;
                                    var262 = var262.method339(class162.field2876.method314(arg1 ^ 0xFFFFFFC9), 49);
                                } else if (var263.method304(113, class105.field1878)) {
                                    var262 = var262.method339(class105.field1878.method314(arg1 ^ 0xFFFFFFB3), arg1 ^ 0xFFFFFF90);
                                    var264 = 2;
                                } else if (var263.method304(113, class186.field3334)) {
                                    var264 = 3;
                                    var262 = var262.method339(class186.field3334.method314(arg1 ^ 0xFFFFFFB6), arg1 ^ 0xFFFFFFD8);
                                } else if (var263.method304(113, class242.field4307)) {
                                    var262 = var262.method339(class242.field4307.method314(124), -92);
                                    var264 = 4;
                                } else if (var263.method304(arg1 ^ 0xFFFFFF9E, class269.field4656)) {
                                    var264 = 5;
                                    var262 = var262.method339(class269.field4656.method314(arg1 ^ 0xFFFFFFE0), arg1 + 121);
                                } else if (var263.method304(arg1 + 130, class142.field2596)) {
                                    var262 = var262.method339(class142.field2596.method314(arg1 ^ 0xFFFFFFF5), 21);
                                    var264 = 6;
                                } else if (var263.method304(arg1 + 130, class28.field554)) {
                                    var262 = var262.method339(class28.field554.method314(101), -111);
                                    var264 = 7;
                                } else if (var263.method304(113, class246.field4363)) {
                                    var264 = 8;
                                    var262 = var262.method339(class246.field4363.method314(97), arg1 + 118);
                                } else if (var263.method304(113, class257.field4482)) {
                                    var264 = 9;
                                    var262 = var262.method339(class257.field4482.method314(36), arg1 ^ 0x72);
                                } else if (var263.method304(113, class225.field3940)) {
                                    var262 = var262.method339(class225.field3940.method314(arg1 ^ 0xFFFFFF9C), arg1 - 102);
                                    var264 = 10;
                                } else if (var263.method304(arg1 ^ 0xFFFFFF9E, class267.field4616)) {
                                    var264 = 11;
                                    var262 = var262.method339(class267.field4616.method314(79), arg1 + 31);
                                } else if (class135.field2443 != 0) {
                                    if (var263.method304(113, class187.field3346)) {
                                        var264 = 0;
                                        var262 = var262.method339(class187.field3346.method314(25), 73);
                                    } else if (var263.method304(arg1 + 130, class162.field2879)) {
                                        var264 = 1;
                                        var262 = var262.method339(class162.field2879.method314(arg1 + 67), -114);
                                    } else if (var263.method304(113, class105.field1895)) {
                                        var264 = 2;
                                        var262 = var262.method339(class105.field1895.method314(94), arg1 + 121);
                                    } else if (var263.method304(113, class186.field3335)) {
                                        var264 = 3;
                                        var262 = var262.method339(class186.field3335.method314(88), arg1 + 115);
                                    } else if (var263.method304(113, class242.field4300)) {
                                        var264 = 4;
                                        var262 = var262.method339(class242.field4300.method314(116), arg1 + 108);
                                    } else if (var263.method304(113, class269.field4642)) {
                                        var262 = var262.method339(class269.field4642.method314(18), arg1 ^ 0x7E);
                                        var264 = 5;
                                    } else if (var263.method304(113, class142.field2595)) {
                                        var264 = 6;
                                        var262 = var262.method339(class142.field2595.method314(47), -127);
                                    } else if (var263.method304(113, class28.field556)) {
                                        var262 = var262.method339(class28.field556.method314(22), 77);
                                        var264 = 7;
                                    } else if (var263.method304(113, class246.field4362)) {
                                        var262 = var262.method339(class246.field4362.method314(51), -92);
                                        var264 = 8;
                                    } else if (var263.method304(113, class257.field4481)) {
                                        var262 = var262.method339(class257.field4481.method314(44), 79);
                                        var264 = 9;
                                    } else if (var263.method304(arg1 ^ 0xFFFFFF9E, class225.field3942)) {
                                        var262 = var262.method339(class225.field3942.method314(41), -100);
                                        var264 = 10;
                                    } else if (var263.method304(113, class267.field4617)) {
                                        var262 = var262.method339(class267.field4617.method314(121), 84);
                                        var264 = 11;
                                    }
                                }
                                class46 var265 = var262.method305(-126);
                                byte var266 = 0;
                                if (var265.method304(113, class46.field791)) {
                                    var262 = var262.method339(class46.field791.method314(39), -113);
                                    var266 = 1;
                                } else if (var265.method304(113, class148.field2664)) {
                                    var266 = 2;
                                    var262 = var262.method339(class148.field2664.method314(115), arg1 ^ 0x4A);
                                } else if (var265.method304(arg1 + 130, class168.field2973)) {
                                    var266 = 3;
                                    var262 = var262.method339(class168.field2973.method314(84), arg1 ^ 0xFFFFFFCA);
                                } else if (var265.method304(arg1 + 130, class141.field2548)) {
                                    var266 = 4;
                                    var262 = var262.method339(class141.field2548.method314(arg1 + 35), -107);
                                } else if (var265.method304(arg1 ^ 0xFFFFFF9E, class50.field881)) {
                                    var266 = 5;
                                    var262 = var262.method339(class50.field881.method314(arg1 + 112), arg1 - 91);
                                } else if (class135.field2443 != 0) {
                                    if (var265.method304(113, class46.field787)) {
                                        var262 = var262.method339(class46.field787.method314(88), arg1 - 91);
                                        var266 = 1;
                                    } else if (var265.method304(113, class148.field2660)) {
                                        var262 = var262.method339(class148.field2660.method314(12), 74);
                                        var266 = 2;
                                    } else if (var265.method304(arg1 ^ 0xFFFFFF9E, class168.field2957)) {
                                        var266 = 3;
                                        var262 = var262.method339(class168.field2957.method314(107), arg1 ^ 0x72);
                                    } else if (var265.method304(113, class141.field2542)) {
                                        var266 = 4;
                                        var262 = var262.method339(class141.field2542.method314(18), arg1 ^ 0xFFFFFFD9);
                                    } else if (var265.method304(113, class50.field878)) {
                                        var262 = var262.method339(class50.field878.method314(57), -103);
                                        var266 = 5;
                                    }
                                }
                                class58.field967.method285((byte) -90, 82);
                                class58.field967.method570(0, 15619);
                                int var267 = class58.field967.field1380;
                                class58.field967.method570(var264, arg1 ^ 0xFFFFC2EC);
                                class58.field967.method570(var266, 15619);
                                class200.method1425(116, class58.field967, var262);
                                class58.field967.method556(class58.field967.field1380 - var267, 26);
                                continue;
                            }
                            if (var472 == 5009) {
                                var7 -= 2;
                                class46 var268 = class86.field1632[var7];
                                class46 var269 = class86.field1632[var7 + 1];
                                if (class245.field4355 != 0 || class248.field4383 != 1 && class78.field1497 != 1) {
                                    class48.field831++;
                                    class58.field967.method285((byte) -90, 199);
                                    class58.field967.method570(0, 15619);
                                    int var270 = class58.field967.field1380;
                                    class58.field967.method578((byte) 12, var268.method349((byte) 59));
                                    class200.method1425(45, class58.field967, var269);
                                    class58.field967.method556(class58.field967.field1380 - var270, 108);
                                }
                                continue;
                            }
                            if (var472 == 5010) {
                                var6--;
                                int var271 = class128.field2346[var6];
                                class46 var272 = null;
                                if (var271 < 100) {
                                    var272 = class113.field2148[var271];
                                }
                                if (var272 == null) {
                                    var272 = class83.field1597;
                                }
                                class86.field1632[var7++] = var272;
                                continue;
                            }
                            if (var472 == 5011) {
                                var6--;
                                int var273 = class128.field2346[var6];
                                class46 var274 = null;
                                if (var273 < 100) {
                                    var274 = class2.field32[var273];
                                }
                                if (var274 == null) {
                                    var274 = class83.field1597;
                                }
                                class86.field1632[var7++] = var274;
                                continue;
                            }
                            if (var472 == 5012) {
                                var6--;
                                int var275 = class128.field2346[var6];
                                int var276 = -1;
                                if (var275 < 100) {
                                    var276 = class43.field723[var275];
                                }
                                class128.field2346[var6++] = var276;
                                continue;
                            }
                            if (var472 == 5015) {
                                class46 var277;
                                if (class277.field4824 == null || class277.field4824.field1528 == null) {
                                    var277 = class85.field1624;
                                } else {
                                    var277 = class277.field4824.method636(arg1 - 1520);
                                }
                                class86.field1632[var7++] = var277;
                                continue;
                            }
                            if (var472 == 5016) {
                                class128.field2346[var6++] = class220.field3877;
                                continue;
                            }
                            if (var472 == 5017) {
                                class128.field2346[var6++] = class29.field574;
                                continue;
                            }
                            if (var472 == 5050) {
                                var6--;
                                int var278 = class128.field2346[var6];
                                class86.field1632[var7++] = class248.method1685(class51.method376(arg1, -15), var278).field2388;
                                continue;
                            }
                            if (var472 == 5051) {
                                var6--;
                                int var279 = class128.field2346[var6];
                                class130 var280 = class248.method1685(61, var279);
                                if (var280.field2385 == null) {
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var280.field2385.length;
                                }
                                continue;
                            }
                            if (var472 == 5052) {
                                var6 -= 2;
                                int var281 = class128.field2346[var6 + 1];
                                int var282 = class128.field2346[var6];
                                class130 var283 = class248.method1685(95, var282);
                                int var284 = var283.field2385[var281];
                                class128.field2346[var6++] = var284;
                                continue;
                            }
                            if (var472 == 5053) {
                                var6--;
                                int var285 = class128.field2346[var6];
                                class130 var286 = class248.method1685(22, var285);
                                if (var286.field2387 == null) {
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var286.field2387.length;
                                }
                                continue;
                            }
                            if (var472 == 5054) {
                                var6 -= 2;
                                int var287 = class128.field2346[var6];
                                int var288 = class128.field2346[var6 + 1];
                                class128.field2346[var6++] = class248.method1685(117, var287).field2387[var288];
                                continue;
                            }
                            if (var472 == 5055) {
                                var6--;
                                int var289 = class128.field2346[var6];
                                class86.field1632[var7++] = class209.method1477(arg1 + 19, var289).method1356(3569);
                                continue;
                            }
                            if (var472 == 5056) {
                                var6--;
                                int var290 = class128.field2346[var6];
                                class186 var291 = class209.method1477(arg1 + 19, var290);
                                if (var291.field3319 == null) {
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var291.field3319.length;
                                }
                                continue;
                            }
                            if (var472 == 5057) {
                                var6 -= 2;
                                int var292 = class128.field2346[var6];
                                int var293 = class128.field2346[var6 + 1];
                                class128.field2346[var6++] = class209.method1477(class51.method376(arg1, -19), var292).field3319[var293];
                                continue;
                            }
                            if (var472 == 5058) {
                                class24.field454 = new class111();
                                var6--;
                                class24.field454.field2108 = class128.field2346[var6];
                                class24.field454.field2096 = class209.method1477(2, class24.field454.field2108);
                                class24.field454.field2097 = new int[class24.field454.field2096.method1346((byte) 105)];
                                continue;
                            }
                            if (var472 == 5059) {
                                class131.field2393++;
                                class58.field967.method285((byte) -90, 167);
                                class58.field967.method570(0, arg1 + 15636);
                                int var294 = class58.field967.field1380;
                                class58.field967.method570(0, 15619);
                                class58.field967.method546((byte) 99, class24.field454.field2108);
                                class24.field454.field2096.method1354(class24.field454.field2097, class58.field967, 0);
                                class58.field967.method556(class58.field967.field1380 - var294, arg1 + 92);
                                continue;
                            }
                            if (var472 == 5060) {
                                class198.field3542++;
                                var7--;
                                class46 var295 = class86.field1632[var7];
                                class58.field967.method285((byte) -90, 59);
                                class58.field967.method570(0, arg1 ^ 0xFFFFC2EC);
                                int var296 = class58.field967.field1380;
                                class58.field967.method578((byte) 33, var295.method349((byte) 59));
                                class58.field967.method546((byte) 120, class24.field454.field2108);
                                class24.field454.field2096.method1354(class24.field454.field2097, class58.field967, 0);
                                class58.field967.method556(class58.field967.field1380 - var296, 34);
                                continue;
                            }
                            if (var472 == 5061) {
                                class58.field967.method285((byte) -90, 167);
                                class131.field2393++;
                                class58.field967.method570(0, 15619);
                                int var297 = class58.field967.field1380;
                                class58.field967.method570(1, 15619);
                                class58.field967.method546((byte) 108, class24.field454.field2108);
                                class24.field454.field2096.method1354(class24.field454.field2097, class58.field967, arg1 ^ 0xFFFFFFEF);
                                class58.field967.method556(class58.field967.field1380 - var297, arg1 ^ 0xFFFFFF87);
                                continue;
                            }
                            if (var472 == 5062) {
                                var6 -= 2;
                                int var298 = class128.field2346[var6];
                                int var299 = class128.field2346[var6 + 1];
                                class128.field2346[var6++] = class248.method1685(117, var298).field2380[var299];
                                continue;
                            }
                            if (var472 == 5063) {
                                var6 -= 2;
                                int var300 = class128.field2346[var6 + 1];
                                int var301 = class128.field2346[var6];
                                class128.field2346[var6++] = class248.method1685(113, var301).field2382[var300];
                                continue;
                            }
                            if (var472 == 5064) {
                                var6 -= 2;
                                int var302 = class128.field2346[var6 + 1];
                                int var303 = class128.field2346[var6];
                                if (var302 == -1) {
                                    class128.field2346[var6++] = -1;
                                } else {
                                    class128.field2346[var6++] = class248.method1685(arg1 + 55, var303).method1007(var302, class51.method376(arg1, -11469));
                                }
                                continue;
                            }
                            if (var472 == 5065) {
                                var6 -= 2;
                                int var304 = class128.field2346[var6];
                                int var305 = class128.field2346[var6 + 1];
                                if (var305 == -1) {
                                    class128.field2346[var6++] = -1;
                                } else {
                                    class128.field2346[var6++] = class248.method1685(class51.method376(arg1, -12), var304).method1009((byte) -128, var305);
                                }
                                continue;
                            }
                            if (var472 == 5066) {
                                var6--;
                                int var306 = class128.field2346[var6];
                                class128.field2346[var6++] = class209.method1477(2, var306).method1346((byte) 105);
                                continue;
                            }
                            if (var472 == 5067) {
                                var6 -= 2;
                                int var307 = class128.field2346[var6 + 1];
                                int var308 = class128.field2346[var6];
                                int var309 = class209.method1477(2, var308).method1343((byte) -88, var307);
                                class128.field2346[var6++] = var309;
                                continue;
                            }
                            if (var472 == 5068) {
                                var6 -= 2;
                                int var310 = class128.field2346[var6 + 1];
                                int var311 = class128.field2346[var6];
                                class24.field454.field2097[var311] = var310;
                                continue;
                            }
                            if (var472 == 5069) {
                                var6 -= 2;
                                int var312 = class128.field2346[var6 + 1];
                                int var313 = class128.field2346[var6];
                                class24.field454.field2097[var313] = var312;
                                continue;
                            }
                            if (var472 == 5070) {
                                var6 -= 3;
                                int var314 = class128.field2346[var6];
                                int var315 = class128.field2346[var6 + 1];
                                int var316 = class128.field2346[var6 + 2];
                                class186 var317 = class209.method1477(arg1 ^ 0xFFFFFFED, var314);
                                if (var317.method1343((byte) -93, var315) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class128.field2346[var6++] = var317.method1345((byte) 73, var315, var316);
                                continue;
                            }
                        } else if (var472 < 5200) {
                            if (var472 == 5100) {
                                if (class162.field2878[86]) {
                                    class128.field2346[var6++] = 1;
                                } else {
                                    class128.field2346[var6++] = 0;
                                }
                                continue;
                            }
                            if (var472 == 5101) {
                                if (class162.field2878[82]) {
                                    class128.field2346[var6++] = 1;
                                } else {
                                    class128.field2346[var6++] = 0;
                                }
                                continue;
                            }
                            if (var472 == 5102) {
                                if (class162.field2878[81]) {
                                    class128.field2346[var6++] = 1;
                                } else {
                                    class128.field2346[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var472 < 5300) {
                            if (var472 == 5200) {
                                var6--;
                                class56.method391(class128.field2346[var6], -20498);
                                continue;
                            }
                            if (var472 == 5201) {
                                class128.field2346[var6++] = class29.method202(arg1 - 894161855);
                                continue;
                            }
                            if (var472 == 5202) {
                                var6--;
                                class226.method1547(6466, class128.field2346[var6]);
                                continue;
                            }
                            if (var472 == 5203) {
                                var7--;
                                class65.method451(class86.field1632[var7], -23885);
                                continue;
                            }
                            if (var472 == 5204) {
                                class86.field1632[var7 - 1] = class221.method1530(class86.field1632[var7 - 1], false);
                                continue;
                            }
                            if (var472 == 5205) {
                                var7--;
                                class31.method207((byte) 115, class86.field1632[var7]);
                                continue;
                            }
                            if (var472 == 5206) {
                                var6--;
                                int var189 = class128.field2346[var6];
                                class74 var190 = class170.method1212((var189 & 0xFFFCE8E) >> 14, var189 & 0x3FFF, 15110);
                                if (var190 == null) {
                                    class86.field1632[var7++] = class83.field1597;
                                } else {
                                    class86.field1632[var7++] = var190.field1325;
                                }
                                continue;
                            }
                            if (var472 == 5207) {
                                var7--;
                                class74 var191 = class198.method1415((byte) -102, class86.field1632[var7]);
                                if (var191 != null && var191.field1329 != null) {
                                    class86.field1632[var7++] = var191.field1329;
                                    continue;
                                }
                                class86.field1632[var7++] = class83.field1597;
                                continue;
                            }
                        } else if (var472 < 5400) {
                            if (var472 == 5300) {
                                var6 -= 2;
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                            if (var472 == 5301) {
                                continue;
                            }
                            if (var472 == 5302) {
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                            if (var472 == 5303) {
                                var6--;
                                class128.field2346[var6++] = 0;
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                            if (var472 == 5305) {
                                byte var192 = -1;
                                class128.field2346[var6++] = var192;
                                continue;
                            }
                            if (var472 == 5306) {
                                class128.field2346[var6++] = class221.method1533(24454);
                                continue;
                            }
                            if (var472 == 5307) {
                                var6--;
                                int var193 = class128.field2346[var6];
                                if (var193 < 0 || var193 > 2) {
                                    var193 = 0;
                                }
                                class255.method1715(-1, var193, 70, false, -1);
                                continue;
                            }
                            if (var472 == 5308) {
                                class128.field2346[var6++] = class138.field2484;
                                continue;
                            }
                            if (var472 == 5309) {
                                var6--;
                                int var194 = class128.field2346[var6];
                                if (var194 < 0 || var194 > 2) {
                                    var194 = 0;
                                }
                                class138.field2484 = var194;
                                class33.method215(class8.field130, (byte) 9);
                                continue;
                            }
                        } else if (var472 < 5500) {
                            if (var472 == 5400) {
                                var7 -= 2;
                                class39.field684++;
                                class46 var234 = class86.field1632[var7];
                                class46 var235 = class86.field1632[var7 + 1];
                                var6--;
                                int var236 = class128.field2346[var6];
                                class58.field967.method285((byte) -90, 228);
                                class58.field967.method570(client.method1813((byte) 87, var234) + client.method1813((byte) 87, var235) + 1, 15619);
                                class58.field967.method584(var234, 19347);
                                class58.field967.method584(var235, arg1 + 19364);
                                class58.field967.method570(var236, 15619);
                                continue;
                            }
                            if (var472 == 5401) {
                                var6 -= 2;
                                class112.field2117[class128.field2346[var6]] = (short) class190.method1375(class128.field2346[var6 + 1], true);
                                class60.method403(5);
                                class226.method1543(14607);
                                class147.method1091(0);
                                class232.method1574(arg1 - 13822);
                                class271.method1827((byte) -78);
                                continue;
                            }
                            if (var472 == 5405) {
                                var6 -= 2;
                                int var237 = class128.field2346[var6];
                                int var238 = class128.field2346[var6 + 1];
                                if (var237 >= 0 && var237 < 2) {
                                    class197.field3536[var237] = new int[var238 << 1][4];
                                }
                                continue;
                            }
                            if (var472 == 5406) {
                                var6 -= 7;
                                int var239 = class128.field2346[var6 + 1] << 1;
                                int var240 = class128.field2346[var6];
                                int var241 = class128.field2346[var6 + 2];
                                int var242 = class128.field2346[var6 + 3];
                                int var243 = class128.field2346[var6 + 4];
                                int var244 = class128.field2346[var6 + 5];
                                int var245 = class128.field2346[var6 + 6];
                                if (var240 >= 0 && var240 < 2 && class197.field3536[var240] != null && var239 >= 0 && var239 < class197.field3536[var240].length) {
                                    class197.field3536[var240][var239] = new int[] { (class50.method369(268432109, var241) >> 14) * 128, var242, class50.method369(var241, 16383) * 128, var245 };
                                    class197.field3536[var240][var239 + 1] = new int[] { (class50.method369(var243, 268421279) >> 14) * 128, var244, class50.method369(16383, var243) * 128 };
                                }
                                continue;
                            }
                            if (var472 == 5407) {
                                var6--;
                                int var246 = class197.field3536[class128.field2346[var6]].length >> 1;
                                class128.field2346[var6++] = var246;
                                continue;
                            }
                            if (var472 == 5411) {
                                if (class227.field3983 == null) {
                                    class105.method791((byte) -99, class15.method78(-84), false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var472 == 5419) {
                                class46 var247 = class83.field1597;
                                if (class31.field594 != null) {
                                    var247 = class190.method1378(0, class31.field594.field2922);
                                    try {
                                        if (class31.field594.field2921 != null) {
                                            byte[] var248 = ((String) class31.field594.field2921).getBytes("ISO-8859-1");
                                            var247 = class177.method1265(0, var248.length, var248, arg1 ^ 0xFFFFFF86);
                                        }
                                    } catch (UnsupportedEncodingException var470) {
                                    }
                                }
                                class86.field1632[var7++] = var247;
                                continue;
                            }
                            if (var472 == 5420) {
                                class128.field2346[var6++] = class9.field160 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 5421) {
                                var7--;
                                class46 var249 = class86.field1632[var7];
                                var6--;
                                boolean var250 = class128.field2346[var6] == 1;
                                class46 var251 = class109.method855(0, new class46[] { class15.method78(64), var249 });
                                if (class227.field3983 != null || var250 && class9.field160 != 3 && class9.field150.startsWith("win") && !class20.field266) {
                                    class236.field4127 = var250;
                                    class120.field2247 = var251;
                                    class12.field193 = class8.field130.method42(-21016, new String(var251.method311(0), "ISO-8859-1"));
                                    continue;
                                }
                                class105.method791((byte) -99, var251, var250);
                                continue;
                            }
                            if (var472 == 5422) {
                                var7 -= 2;
                                class46 var252 = class86.field1632[var7];
                                var6--;
                                int var253 = class128.field2346[var6];
                                class46 var254 = class86.field1632[var7 + 1];
                                if (var252.method314(21) > 0) {
                                    if (class233.field4055 == null) {
                                        class233.field4055 = new class46[class140.field2505[class32.field601]];
                                    }
                                    class233.field4055[var253] = var252;
                                }
                                if (var254.method314(122) > 0) {
                                    if (class122.field2269 == null) {
                                        class122.field2269 = new class46[class140.field2505[class32.field601]];
                                    }
                                    class122.field2269[var253] = var254;
                                }
                                continue;
                            }
                            if (var472 == 5423) {
                                var7--;
                                class86.field1632[var7].method332(0);
                                continue;
                            }
                        } else if (var472 < 5600) {
                            if (var472 == 5500) {
                                var6 -= 4;
                                int var222 = class128.field2346[var6];
                                int var223 = class128.field2346[var6 + 1];
                                int var224 = class128.field2346[var6 + 2];
                                int var225 = class128.field2346[var6 + 3];
                                class90.method699((var222 >> 14 & 0x3FFF) - class29.field567, (var222 & 0x3FFF) + -class77.field1432, var223, var225, var224, false, arg1 + 145);
                                continue;
                            }
                            if (var472 == 5501) {
                                var6 -= 4;
                                int var226 = class128.field2346[var6 + 1];
                                int var227 = class128.field2346[var6];
                                int var228 = class128.field2346[var6 + 2];
                                int var229 = class128.field2346[var6 + 3];
                                class180.method1290(var228, ((var227 & 0xFFFE823) >> 14) - class29.field567, -70, (var227 & 0x3FFF) - class77.field1432, var226, var229);
                                continue;
                            }
                            if (var472 == 5502) {
                                var6 -= 6;
                                int var230 = class128.field2346[var6];
                                if (var230 >= 2) {
                                    throw new RuntimeException();
                                }
                                class255.field4471 = var230;
                                int var231 = class128.field2346[var6 + 1];
                                if (var231 + 1 >= class197.field3536[class255.field4471].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class50.field859 = 0;
                                class102.field1862 = var231;
                                class214.field3799 = class128.field2346[var6 + 2];
                                class76.field1413 = class128.field2346[var6 + 3];
                                int var232 = class128.field2346[var6 + 4];
                                if (var232 >= 2) {
                                    throw new RuntimeException();
                                }
                                class113.field2150 = var232;
                                int var233 = class128.field2346[var6 + 5];
                                if ((var233 + 1) >= (class197.field3536[class113.field2150].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class154.field2735 = 3;
                                class4.field72 = var233;
                                continue;
                            }
                            if (var472 == 5503) {
                                class60.method407(75);
                                continue;
                            }
                            if (var472 == 5504) {
                                var6 -= 2;
                                class207.field3710 = class128.field2346[var6];
                                class249.field4414 = class128.field2346[var6 + 1];
                                class160.method1171(false);
                                continue;
                            }
                            if (var472 == 5505) {
                                class128.field2346[var6++] = class207.field3710;
                                continue;
                            }
                            if (var472 == 5506) {
                                class128.field2346[var6++] = class249.field4414;
                                continue;
                            }
                        } else if (var472 < 5700) {
                            if (var472 == 5600) {
                                var7 -= 2;
                                class46 var195 = class86.field1632[var7 + 1];
                                var6--;
                                int var196 = class128.field2346[var6];
                                class46 var197 = class86.field1632[var7];
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0 && class75.field1376 == 0) {
                                    class86.method677(var197, var195, 0, var196);
                                }
                                continue;
                            }
                            if (var472 == 5601) {
                                class150.method1107(5);
                                continue;
                            }
                            if (var472 == 5602) {
                                if (class33.field616 == 0) {
                                    class40.field698 = -2;
                                }
                                continue;
                            }
                            if (var472 == 5603) {
                                var6 -= 4;
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0 && class75.field1376 == 0) {
                                    class178.method1271(class128.field2346[var6 + 2], class128.field2346[var6 + 1], (byte) -93, class128.field2346[var6 + 3], class128.field2346[var6]);
                                }
                                continue;
                            }
                            if (var472 == 5604) {
                                var7--;
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0 && class75.field1376 == 0) {
                                    class20.method105(class86.field1632[var7].method349((byte) 59), (byte) 77);
                                }
                                continue;
                            }
                            if (var472 == 5605) {
                                var7 -= 2;
                                var6 -= 4;
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0 && class75.field1376 == 0) {
                                    class141.method1065(class86.field1632[var7].method349((byte) 59), class86.field1632[var7 + 1], class128.field2346[var6], class128.field2346[var6 + 1], class128.field2346[var6 + 2], class128.field2346[var6 + 3], 99999999);
                                }
                                continue;
                            }
                            if (var472 == 5606) {
                                if (class78.field1481 == 0) {
                                    class207.field3716 = -2;
                                }
                                continue;
                            }
                            if (var472 == 5607) {
                                class128.field2346[var6++] = class40.field698;
                                continue;
                            }
                            if (var472 == 5608) {
                                class128.field2346[var6++] = class38.field667;
                                continue;
                            }
                            if (var472 == 5609) {
                                class128.field2346[var6++] = class207.field3716;
                                continue;
                            }
                            if (var472 == 5610) {
                                for (int var198 = 0; var198 < 5; var198++) {
                                    class86.field1632[var7++] = var198 < class198.field3555.length ? class198.field3555[var198].method306(true) : class83.field1597;
                                }
                                class198.field3555 = null;
                                continue;
                            }
                            if (var472 == 5611) {
                                class128.field2346[var6++] = class105.field1879;
                                continue;
                            }
                        } else if (var472 < 6100) {
                            if (var472 == 6001) {
                                var6--;
                                int var216 = class128.field2346[var6];
                                if (var216 < 1) {
                                    var216 = 1;
                                }
                                if (var216 > 4) {
                                    var216 = 4;
                                }
                                class65.field1111 = var216;
                                if (class65.field1111 == 1) {
                                    class62.method437(0.9F);
                                }
                                if (class65.field1111 == 2) {
                                    class62.method437(0.8F);
                                }
                                if (class65.field1111 == 3) {
                                    class62.method437(0.7F);
                                }
                                if (class65.field1111 == 4) {
                                    class62.method437(0.6F);
                                }
                                class226.method1543(arg1 + 14624);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6002) {
                                var6--;
                                class66.method457(class128.field2346[var6] == 1, 128);
                                class86.method675(0);
                                class177.method1270(30);
                                class272.method1838(-92);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6003) {
                                var6--;
                                class217.field3840 = class128.field2346[var6] == 1;
                                class272.method1838(-32);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6005) {
                                var6--;
                                class268.field4631 = class128.field2346[var6] == 1;
                                class177.method1270(30);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6006) {
                                var6--;
                                class46.field809 = class128.field2346[var6] == 1;
                                ((class93) class62.field1040).method732(true, !class46.field809);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6007) {
                                var6--;
                                class264.field4596 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6008) {
                                var6--;
                                class68.field1177 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6009) {
                                var6--;
                                class111.field2103 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6010) {
                                var6--;
                                class250.field4416 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6011) {
                                var6--;
                                int var217 = class128.field2346[var6];
                                if (var217 < 0 || var217 > 2) {
                                    var217 = 0;
                                }
                                class186.field3326 = var217;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6012) {
                                var6--;
                                class70.field1206 = class128.field2346[var6] == 1;
                                if (class65.field1111 == 1) {
                                    class62.method437(0.9F);
                                }
                                if (class65.field1111 == 2) {
                                    class62.method437(0.8F);
                                }
                                if (class65.field1111 == 3) {
                                    class62.method437(0.7F);
                                }
                                if (class65.field1111 == 4) {
                                    class62.method437(0.6F);
                                }
                                class177.method1270(30);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6014) {
                                var6--;
                                class65.field1102 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6015) {
                                var6--;
                                class31.field588 = class128.field2346[var6] == 1;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6016) {
                                var6--;
                                int var218 = class128.field2346[var6];
                                if (var218 < 0 || var218 > 2) {
                                    var218 = 0;
                                }
                                class24.field396 = var218;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6017) {
                                var6--;
                                class42.field715 = class128.field2346[var6] == 1;
                                class113.method920(0);
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6018) {
                                var6--;
                                int var219 = class128.field2346[var6];
                                if (var219 < 0) {
                                    var219 = 0;
                                }
                                if (var219 > 127) {
                                    var219 = 127;
                                }
                                class38.field668 = var219;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6019) {
                                var6--;
                                int var220 = class128.field2346[var6];
                                if (var220 < 0) {
                                    var220 = 0;
                                }
                                if (var220 > 255) {
                                    var220 = 255;
                                }
                                if (class205.field3685 != var220) {
                                    if (class205.field3685 == 0 && class51.field890 != -1) {
                                        class108.method840(class51.field890, 1, false, var220, 0, class130.field2390);
                                        class29.field572 = false;
                                    } else if (var220 == 0) {
                                        class219.method1523(-49);
                                        class29.field572 = false;
                                    } else {
                                        class50.method371(true, var220);
                                    }
                                    class205.field3685 = var220;
                                }
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6020) {
                                var6--;
                                int var221 = class128.field2346[var6];
                                if (var221 < 0) {
                                    var221 = 0;
                                }
                                if (var221 > 127) {
                                    var221 = 127;
                                }
                                class135.field2452 = var221;
                                class33.method215(class8.field130, (byte) 9);
                                class178.field3198 = false;
                                continue;
                            }
                            if (var472 == 6021) {
                                var6--;
                                class154.field2732 = class128.field2346[var6] == 1;
                                class272.method1838(-125);
                                continue;
                            }
                        } else if (var472 < 6200) {
                            if (var472 == 6101) {
                                class128.field2346[var6++] = class65.field1111;
                                continue;
                            }
                            if (var472 == 6102) {
                                class128.field2346[var6++] = class180.method1291(2047) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6103) {
                                class128.field2346[var6++] = class217.field3840 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6105) {
                                class128.field2346[var6++] = class268.field4631 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6106) {
                                class128.field2346[var6++] = class46.field809 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6107) {
                                class128.field2346[var6++] = class264.field4596 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6108) {
                                class128.field2346[var6++] = class68.field1177 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6109) {
                                class128.field2346[var6++] = class111.field2103 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6110) {
                                class128.field2346[var6++] = class250.field4416 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6111) {
                                class128.field2346[var6++] = class186.field3326;
                                continue;
                            }
                            if (var472 == 6112) {
                                class128.field2346[var6++] = class70.field1206 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6114) {
                                class128.field2346[var6++] = class65.field1102 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6115) {
                                class128.field2346[var6++] = class31.field588 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6116) {
                                class128.field2346[var6++] = class24.field396;
                                continue;
                            }
                            if (var472 == 6117) {
                                class128.field2346[var6++] = class42.field715 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6118) {
                                class128.field2346[var6++] = class38.field668;
                                continue;
                            }
                            if (var472 == 6119) {
                                class128.field2346[var6++] = class205.field3685;
                                continue;
                            }
                            if (var472 == 6120) {
                                class128.field2346[var6++] = class135.field2452;
                                continue;
                            }
                            if (var472 == 6121) {
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                        } else if (var472 < 6300) {
                            if (var472 == 6200) {
                                var6 -= 2;
                                class17.field248 = (short) class128.field2346[var6];
                                if (class17.field248 <= 0) {
                                    class17.field248 = 256;
                                }
                                class174.field3144 = (short) class128.field2346[var6 + 1];
                                if (class174.field3144 <= 0) {
                                    class174.field3144 = 205;
                                }
                                continue;
                            }
                            if (var472 == 6201) {
                                var6 -= 2;
                                class137.field2471 = (short) class128.field2346[var6];
                                if (class137.field2471 <= 0) {
                                    class137.field2471 = 256;
                                }
                                class31.field584 = (short) class128.field2346[var6 + 1];
                                if (class31.field584 <= 0) {
                                    class31.field584 = 320;
                                }
                                continue;
                            }
                            if (var472 == 6202) {
                                var6 -= 4;
                                class207.field3717 = (short) class128.field2346[var6];
                                if (class207.field3717 <= 0) {
                                    class207.field3717 = 1;
                                }
                                class272.field4756 = (short) class128.field2346[var6 + 1];
                                if (class272.field4756 <= 0) {
                                    class272.field4756 = 32767;
                                } else if (class272.field4756 < class207.field3717) {
                                    class272.field4756 = class207.field3717;
                                }
                                class238.field4241 = (short) class128.field2346[var6 + 2];
                                if (class238.field4241 <= 0) {
                                    class238.field4241 = 1;
                                }
                                class156.field2797 = (short) class128.field2346[var6 + 3];
                                if (class156.field2797 <= 0) {
                                    class156.field2797 = 32767;
                                } else if (class156.field2797 < class238.field4241) {
                                    class156.field2797 = class238.field4241;
                                }
                                continue;
                            }
                            if (var472 == 6203) {
                                class236.method1613(0, 0, class240.field4277.field341, false, (byte) 119, class240.field4277.field468);
                                class128.field2346[var6++] = class71.field1271;
                                class128.field2346[var6++] = class10.field164;
                                continue;
                            }
                            if (var472 == 6204) {
                                class128.field2346[var6++] = class137.field2471;
                                class128.field2346[var6++] = class31.field584;
                                continue;
                            }
                            if (var472 == 6205) {
                                class128.field2346[var6++] = class17.field248;
                                class128.field2346[var6++] = class174.field3144;
                                continue;
                            }
                        } else if (var472 < 6400) {
                            if (var472 == 6300) {
                                class128.field2346[var6++] = (int) (class223.method1537(-26619) / 60000L);
                                continue;
                            }
                            if (var472 == 6301) {
                                class128.field2346[var6++] = (int) (class223.method1537(-26619) / 86400000L) - 11745;
                                continue;
                            }
                            if (var472 == 6302) {
                                var6 -= 3;
                                int var211 = class128.field2346[var6 + 1];
                                int var212 = class128.field2346[var6];
                                int var213 = class128.field2346[var6 + 2];
                                class239.field4252.clear();
                                class239.field4252.set(11, 12);
                                class239.field4252.set(var213, var211, var212);
                                class128.field2346[var6++] = (int) (class239.field4252.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var472 == 6303) {
                                class239.field4252.clear();
                                class239.field4252.setTime(new Date(class223.method1537(-26619)));
                                class128.field2346[var6++] = class239.field4252.get(1);
                                continue;
                            }
                            if (var472 == 6304) {
                                var6--;
                                int var214 = class128.field2346[var6];
                                boolean var215 = true;
                                if (var214 < 0) {
                                    var215 = (var214 + 1) % 4 == 0;
                                } else if (var214 < 1582) {
                                    var215 = var214 % 4 == 0;
                                } else if (var214 % 4 != 0) {
                                    var215 = false;
                                } else if (var214 % 100 != 0) {
                                    var215 = true;
                                } else if ((var214 % 400) != 0) {
                                    var215 = false;
                                }
                                class128.field2346[var6++] = var215 ? 1 : 0;
                                continue;
                            }
                        } else if (var472 < 6500) {
                            if (var472 == 6405) {
                                class128.field2346[var6++] = class171.method1223(-2121191512) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 6406) {
                                class128.field2346[var6++] = class168.method1191((byte) 32) ? 1 : 0;
                                continue;
                            }
                        } else if (var472 < 6600) {
                            if (var472 == 6500) {
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0) {
                                    class128.field2346[var6++] = class76.method608(false) == -1 ? 0 : 1;
                                    continue;
                                }
                                class128.field2346[var6++] = 1;
                                continue;
                            }
                            if (var472 == 6501) {
                                class119 var199 = class81.method646(71);
                                if (var199 == null) {
                                    class128.field2346[var6++] = -1;
                                    class128.field2346[var6++] = 0;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var199.field2240;
                                    class128.field2346[var6++] = var199.field3733;
                                    class86.field1632[var7++] = var199.field2232;
                                    class122 var200 = var199.method950(arg1 + 18943);
                                    class128.field2346[var6++] = var200.field2267;
                                    class86.field1632[var7++] = var200.field2270;
                                    class128.field2346[var6++] = var199.field3731;
                                }
                                continue;
                            }
                            if (var472 == 6502) {
                                class119 var201 = class111.method910((byte) 67);
                                if (var201 == null) {
                                    class128.field2346[var6++] = -1;
                                    class128.field2346[var6++] = 0;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var201.field2240;
                                    class128.field2346[var6++] = var201.field3733;
                                    class86.field1632[var7++] = var201.field2232;
                                    class122 var202 = var201.method950(18926);
                                    class128.field2346[var6++] = var202.field2267;
                                    class86.field1632[var7++] = var202.field2270;
                                    class128.field2346[var6++] = var201.field3731;
                                }
                                continue;
                            }
                            if (var472 == 6503) {
                                var6--;
                                int var203 = class128.field2346[var6];
                                if (class135.field2448 == 10 && class115.field2171 == 0 && class33.field616 == 0 && class78.field1481 == 0) {
                                    class128.field2346[var6++] = class107.method834(var203, -113) ? 1 : 0;
                                    continue;
                                }
                                class128.field2346[var6++] = 0;
                                continue;
                            }
                            if (var472 == 6504) {
                                var6--;
                                class170.field3030 = class128.field2346[var6];
                                class33.method215(class8.field130, (byte) 9);
                                continue;
                            }
                            if (var472 == 6505) {
                                class128.field2346[var6++] = class170.field3030;
                                continue;
                            }
                            if (var472 == 6506) {
                                var6--;
                                int var204 = class128.field2346[var6];
                                class119 var205 = class177.method1266(73, var204);
                                if (var205 == null) {
                                    class128.field2346[var6++] = -1;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                    class86.field1632[var7++] = class83.field1597;
                                    class128.field2346[var6++] = 0;
                                } else {
                                    class128.field2346[var6++] = var205.field3733;
                                    class86.field1632[var7++] = var205.field2232;
                                    class122 var206 = var205.method950(arg1 ^ 0xFFFFB601);
                                    class128.field2346[var6++] = var206.field2267;
                                    class86.field1632[var7++] = var206.field2270;
                                    class128.field2346[var6++] = var205.field3731;
                                }
                                continue;
                            }
                            if (var472 == 6507) {
                                var6 -= 4;
                                int var207 = class128.field2346[var6];
                                boolean var208 = class128.field2346[var6 + 3] == 1;
                                boolean var209 = class128.field2346[var6 + 1] == 1;
                                int var210 = class128.field2346[var6 + 2];
                                class174.method1252(var208, (byte) -92, var210, var209, var207);
                                continue;
                            }
                        }
                    } else if (var472 == 4500) {
                        var6 -= 2;
                        int var318 = class128.field2346[var6];
                        int var319 = class128.field2346[var6 + 1];
                        class185 var320 = class250.method1698(var319, arg1 ^ 0xFFFFC999);
                        if (var320.method1337((byte) 61)) {
                            class86.field1632[var7++] = class107.method833(var318, (byte) 56).method998(var320.field3306, -12678, var319);
                        } else {
                            class128.field2346[var6++] = class107.method833(var318, (byte) 56).method1000((byte) -52, var319, var320.field3304);
                        }
                        continue;
                    }
                } else {
                    class24 var60;
                    if (var472 < 2000) {
                        var60 = var46 ? class10.field169 : class6.field108;
                    } else {
                        var472 -= 1000;
                        var6--;
                        var60 = class13.method73(1506528624, class128.field2346[var6]);
                    }
                    if (var472 == 1300) {
                        var6--;
                        int var61 = class128.field2346[var6] - 1;
                        if (var61 >= 0 && var61 <= 9) {
                            var7--;
                            var60.method175(var61, 0, class86.field1632[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var472 == 1301) {
                        var6 -= 2;
                        int var62 = class128.field2346[var6 + 1];
                        int var63 = class128.field2346[var6];
                        var60.field443 = class108.method841(var63, var62, -1);
                        continue;
                    }
                    if (var472 == 1302) {
                        var6--;
                        var60.field428 = class128.field2346[var6] == 1;
                        continue;
                    }
                    if (var472 == 1303) {
                        var6--;
                        var60.field500 = class128.field2346[var6];
                        continue;
                    }
                    if (var472 == 1304) {
                        var6--;
                        var60.field417 = class128.field2346[var6];
                        continue;
                    }
                    if (var472 == 1305) {
                        var7--;
                        var60.field389 = class86.field1632[var7];
                        continue;
                    }
                    if (var472 == 1306) {
                        var7--;
                        var60.field353 = class86.field1632[var7];
                        continue;
                    }
                    if (var472 == 1307) {
                        var60.field435 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var471) {
            if (var5.field3923 == null) {
                if (class216.field3821 != 0) {
                    class155.method1136(110, class83.field1597, 0, class240.field4272);
                }
                class272.method1835(var471, -25, "CS2 - scr:" + var5.field1195 + " op:" + var11);
            } else {
                class46 var467 = class181.method1305(25127, 30);
                var467.method348(class248.field4379, -28).method348(var5.field3923, -116);
                for (int var468 = class12.field196 - 1; var468 >= 0; var468--) {
                    var467.method348(class185.field3302, -116).method348(class201.field3605[var468].field3206.field3923, -69);
                }
                if (var11 == 40) {
                    int var469 = var9[var8];
                    var467.method348(class216.field3822, arg1 - 84).method348(class115.method932(false, var469), -97);
                }
                if (class216.field3821 != 0) {
                    class155.method1136(arg1 + 134, class83.field1597, 0, class109.method855(0, new class46[] { class3.field63, var5.field3923 }));
                }
                class272.method1835(var471, -58, "CS2 - scr:" + var5.field1195 + " op:" + var11 + new String(var467.method311(0)));
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static void method1701(boolean arg0) {
        field4437 = null;
        field4430 = null;
        field4431 = null;
        field4423 = null;
        if (!arg0) {
            field4430 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method1702(int arg0) {
        class126.field2308 = new class235(32);
        if (arg0 != 2860) {
            field4432 = -37;
        }
        field4428++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method1703(int arg0) {
        field4429++;
        int var1 = 0;
        if (arg0 != -17468) {
            field4423 = null;
        }
        while (var1 < class111.field2082) {
            int var2 = class93.field1758[var1];
            class81 var3 = class1.field6[var2];
            int var4 = class147.field2651.method558(1);
            if ((var4 & 0x1) != 0) {
                var4 += class147.field2651.method558(arg0 ^ 0xFFFFBBC5) << 8;
            }
            class58.method400(0, var4, var3, var2);
            var1++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1704(int arg0, int arg1, int arg2, long arg3) {
        class201 var5 = class111.field2080[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3589 != null && var5.field3589.field4464 == arg3) {
            return true;
        } else if (var5.field3606 != null && var5.field3606.field2949 == arg3) {
            return true;
        } else if (var5.field3607 != null && var5.field3607.field3272 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3585; var6++) {
                if (var5.field3600[var6].field3523 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
