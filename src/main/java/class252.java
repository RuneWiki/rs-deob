import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.zip.CRC32;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class252 extends class253 {

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Z")
    public boolean field4338;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[Lrd;")
    public class252[] field4346;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "Ljd;")
    public static class85 field4353 = class221.method1499("details", (byte) -44);

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field4358 = 2301979;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4357 = new CRC32();

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lve;")
    public static class184 field4360 = new class184(4);

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Lfh;")
    public class128 field4356;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Lqf;")
    public static class232 field4348;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Lec;")
    public class23 field4350;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)[[I")
    public final int[][] method1737(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field4358 = 51;
        }
        field4345++;
        if (this.field4346[arg0].field4338) {
            int[] var4 = this.field4346[arg0].method149(arg2, (byte) -55);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4346[arg0].method89(arg2, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V")
    public final void method1738(int arg0, byte arg1, int arg2) {
        if (arg1 > -2) {
            return;
        }
        field4335++;
        int var4 = this.field4340 == 255 ? arg0 : this.field4340;
        if (this.field4338) {
            this.field4356 = new class128(var4, arg0, arg2);
        } else {
            this.field4350 = new class23(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
    private static final boolean method1739(byte arg0, int arg1) {
        field4337++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            int var2 = -49 % ((-arg0 - 82) / 38);
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IJ)V")
    private static final void method1740(int arg0, long arg1) {
        field4341++;
        if ((long) arg0 == arg1) {
            return;
        }
        if (class56.field978 >= 100) {
            class148.method972(class239.field4116, (byte) -86, class100.field1795, 0);
            return;
        }
        class85 var3 = class116.method814(arg1, 68).method587((byte) -91);
        for (int var4 = 0; var4 < class56.field978; var4++) {
            if (class137.field2379[var4] == arg1) {
                class148.method972(class172.method1150(new class85[] { var3, class117.field2092 }, 0), (byte) -63, class100.field1795, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class45.field810; var5++) {
            if (class28.field428[var5] == arg1) {
                class148.method972(class172.method1150(new class85[] { class207.field3622, var3, class159.field2722 }, arg0), (byte) -55, class100.field1795, 0);
                return;
            }
        }
        if (var3.method612((byte) 107, class22.field308.field762)) {
            class148.method972(class142.field2448, (byte) -80, class100.field1795, 0);
            return;
        }
        class137.field2379[class56.field978] = arg1;
        class256.field4572[class56.field978++] = class116.method814(arg1, arg0 - 50);
        class101.field1799++;
        class207.field3613 = class43.field755;
        class207.field3618.method483(-24260, 83);
        class207.field3618.method1674((byte) 101, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lik;IB)V")
    public void method88(class247 arg0, int arg1, byte arg2) {
        field4343++;
        if (arg2 != -99) {
            field4348 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
    public int method96(int arg0) {
        field4354++;
        return arg0 == 2 ? -1 : 115;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public void method94(byte arg0) {
        if (arg0 != 48) {
            return;
        }
        if (this.field4338) {
            this.field4356.method870(2);
            this.field4356 = null;
        } else {
            this.field4350.method157(0);
            this.field4350 = null;
        }
        field4352++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILti;I)V")
    public static final void method1741(int arg0, class5 arg1, int arg2) {
        Object[] var3 = arg1.field67;
        field4349++;
        int var4 = (Integer) var3[0];
        class76 var5 = class225.method1522(-40, var4);
        if (var5 == null) {
            return;
        }
        class220.field3865 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field1407;
        int[] var10 = var5.field1416;
        byte var11 = -1;
        try {
            class41.field666 = new class85[var5.field1413];
            class31.field479 = new int[var5.field1411];
            if (arg0 <= 37) {
                field4357 = null;
            }
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field56;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field62;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field58 == null ? -1 : arg1.field58.field4479;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field51;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field58 == null ? -1 : arg1.field58.field4418;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field59 == null ? -1 : arg1.field59.field4479;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field59 == null ? -1 : arg1.field59.field4418;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field48;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field54;
                    }
                    class31.field479[var12++] = var16;
                } else if (var3[var14] instanceof class85) {
                    class85 var15 = (class85) var3[var14];
                    if (var15.method612((byte) 112, class150.field2527)) {
                        var15 = arg1.field66;
                    }
                    class41.field666[var13++] = var15;
                }
            }
            int var17 = 0;
            label3495: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var461 = var10[var7];
                if (var461 < 100) {
                    if (var461 == 0) {
                        class30.field448[var6++] = var9[var7];
                        continue;
                    }
                    if (var461 == 1) {
                        int var18 = var9[var7];
                        class30.field448[var6++] = class256.field4563[var18];
                        continue;
                    }
                    if (var461 == 2) {
                        int var19 = var9[var7];
                        var6--;
                        class256.method1779(class30.field448[var6], var19, -11642);
                        continue;
                    }
                    if (var461 == 3) {
                        class97.field1761[var8++] = var5.field1408[var7];
                        continue;
                    }
                    if (var461 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var461 == 7) {
                        var6 -= 2;
                        if (class30.field448[var6 + 1] != class30.field448[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 8) {
                        var6 -= 2;
                        if (class30.field448[var6 + 1] == class30.field448[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 9) {
                        var6 -= 2;
                        if (class30.field448[var6 + 1] > class30.field448[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 10) {
                        var6 -= 2;
                        if (class30.field448[var6] > class30.field448[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 21) {
                        if (class220.field3865 == 0) {
                            return;
                        }
                        class249 var20 = class178.field3062[--class220.field3865];
                        class41.field666 = var20.field4293;
                        var7 = var20.field4294;
                        class31.field479 = var20.field4298;
                        var5 = var20.field4295;
                        var9 = var5.field1407;
                        var10 = var5.field1416;
                        continue;
                    }
                    if (var461 == 25) {
                        int var21 = var9[var7];
                        class30.field448[var6++] = class82.method566(var21, (byte) 127);
                        continue;
                    }
                    if (var461 == 27) {
                        int var22 = var9[var7];
                        var6--;
                        class162.method1068(0, class30.field448[var6], var22);
                        continue;
                    }
                    if (var461 == 31) {
                        var6 -= 2;
                        if (class30.field448[var6] <= class30.field448[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 32) {
                        var6 -= 2;
                        if (class30.field448[var6 + 1] <= class30.field448[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 33) {
                        class30.field448[var6++] = class31.field479[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var461 == 34) {
                        var10001 = var9[var7];
                        var6--;
                        class31.field479[var10001] = class30.field448[var6];
                        continue;
                    }
                    if (var461 == 35) {
                        class97.field1761[var8++] = class41.field666[var9[var7]];
                        continue;
                    }
                    if (var461 == 36) {
                        var10001 = var9[var7];
                        var8--;
                        class41.field666[var10001] = class97.field1761[var8];
                        continue;
                    }
                    if (var461 == 37) {
                        int var23 = var9[var7];
                        var8 -= var23;
                        class85 var24 = class234.method1566(class97.field1761, var23, var8, 0);
                        class97.field1761[var8++] = var24;
                        continue;
                    }
                    if (var461 == 38) {
                        var6--;
                        continue;
                    }
                    if (var461 == 39) {
                        var8--;
                        continue;
                    }
                    if (var461 == 40) {
                        int var25 = var9[var7];
                        class76 var26 = class225.method1522(-40, var25);
                        class85[] var27 = new class85[var26.field1413];
                        int[] var28 = new int[var26.field1411];
                        for (int var29 = 0; var29 < var26.field1418; var29++) {
                            var28[var29] = class30.field448[var6 + var29 - var26.field1418];
                        }
                        for (int var30 = 0; var30 < var26.field1412; var30++) {
                            var27[var30] = class97.field1761[var8 - (var26.field1412 - var30)];
                        }
                        var8 -= var26.field1412;
                        var6 -= var26.field1418;
                        class249 var31 = new class249();
                        var31.field4295 = var5;
                        var31.field4294 = var7;
                        var31.field4298 = class31.field479;
                        var31.field4293 = class41.field666;
                        if (class220.field3865 >= class178.field3062.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var7 = -1;
                        class178.field3062[class220.field3865++] = var31;
                        var9 = var26.field1407;
                        class31.field479 = var28;
                        var10 = var26.field1416;
                        class41.field666 = var27;
                        continue;
                    }
                    if (var461 == 42) {
                        class30.field448[var6++] = class183.field3130[var9[var7]];
                        continue;
                    }
                    if (var461 == 43) {
                        int var32 = var9[var7];
                        var6--;
                        class183.field3130[var32] = class30.field448[var6];
                        class199.method1362(var32, -128);
                        continue;
                    }
                    if (var461 == 44) {
                        int var33 = var9[var7] >> 16;
                        int var34 = var9[var7] & 0xFFFF;
                        var6--;
                        int var35 = class30.field448[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class239.field4117[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3495;
                                }
                                class221.field3881[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 45) {
                        int var38 = var9[var7];
                        var6--;
                        int var39 = class30.field448[var6];
                        if (var39 >= 0 && class239.field4117[var38] > var39) {
                            class30.field448[var6++] = class221.field3881[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 46) {
                        var6 -= 2;
                        int var40 = class30.field448[var6];
                        int var41 = var9[var7];
                        if (var40 >= 0 && var40 < class239.field4117[var41]) {
                            class221.field3881[var41][var40] = class30.field448[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 47) {
                        class85 var42 = class162.field2793[var9[var7]];
                        if (var42 == null) {
                            var42 = class102.field1822;
                        }
                        class97.field1761[var8++] = var42;
                        continue;
                    }
                    if (var461 == 48) {
                        int var43 = var9[var7];
                        var8--;
                        class162.field2793[var43] = class97.field1761[var8];
                        method1746(var43, true);
                        continue;
                    }
                    if (var461 == 51) {
                        class204 var44 = var5.field1409[var9[var7]];
                        var6--;
                        class105 var45 = (class105) var44.method1398(1, (long) class30.field448[var6]);
                        if (var45 != null) {
                            var7 += var45.field1842;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var461 < 300) {
                    if (var461 == 100) {
                        var6 -= 3;
                        int var439 = class30.field448[var6 + 1];
                        int var440 = class30.field448[var6];
                        int var441 = class30.field448[var6 + 2];
                        if (var439 == 0) {
                            throw new RuntimeException();
                        }
                        class255 var442 = class72.method506(var440, 0);
                        if (var442.field4549 == null) {
                            var442.field4549 = new class255[var441 + 1];
                        }
                        if (var441 >= var442.field4549.length) {
                            class255[] var443 = new class255[var441 + 1];
                            for (int var444 = 0; var444 < var442.field4549.length; var444++) {
                                var443[var444] = var442.field4549[var444];
                            }
                            var442.field4549 = var443;
                        }
                        if (var441 > 0 && var442.field4549[var441 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var441 - 1));
                        }
                        class255 var445 = new class255();
                        var445.field4436 = var439;
                        var445.field4530 = var445.field4479 = var442.field4479;
                        var445.field4459 = true;
                        var445.field4418 = var441;
                        var442.field4549[var441] = var445;
                        if (var46) {
                            class35.field538 = var445;
                        } else {
                            class117.field2096 = var445;
                        }
                        class16.method120((byte) -84, var442);
                        continue;
                    }
                    if (var461 == 101) {
                        class255 var446 = var46 ? class35.field538 : class117.field2096;
                        if (var446.field4418 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class255 var447 = class72.method506(var446.field4479, 0);
                        var447.field4549[var446.field4418] = null;
                        class16.method120((byte) -67, var447);
                        continue;
                    }
                    if (var461 == 102) {
                        var6--;
                        class255 var448 = class72.method506(class30.field448[var6], 0);
                        var448.field4549 = null;
                        class16.method120((byte) -66, var448);
                        continue;
                    }
                    if (var461 == 200) {
                        var6 -= 2;
                        int var449 = class30.field448[var6];
                        int var450 = class30.field448[var6 + 1];
                        class255 var451 = class67.method449(var450, (byte) -67, var449);
                        if (var451 != null && var450 != -1) {
                            class30.field448[var6++] = 1;
                            if (var46) {
                                class35.field538 = var451;
                            } else {
                                class117.field2096 = var451;
                            }
                            continue;
                        }
                        class30.field448[var6++] = 0;
                        continue;
                    }
                    if (var461 == 201) {
                        var6--;
                        int var452 = class30.field448[var6];
                        class255 var453 = class72.method506(var452, 0);
                        if (var453 == null) {
                            class30.field448[var6++] = 0;
                        } else {
                            class30.field448[var6++] = 1;
                            if (var46) {
                                class35.field538 = var453;
                            } else {
                                class117.field2096 = var453;
                            }
                        }
                        continue;
                    }
                } else if (var461 < 500) {
                    if (var461 == 403) {
                        var6 -= 2;
                        int var434 = class30.field448[var6];
                        int var435 = class30.field448[var6 + 1];
                        if (var434 >= 7) {
                            var434 -= 7;
                        }
                        class22.field308.field796.method1240(0, var435, var434);
                        continue;
                    }
                    if (var461 == 404) {
                        var6 -= 2;
                        int var436 = class30.field448[var6 + 1];
                        int var437 = class30.field448[var6];
                        class22.field308.field796.method1235(var437, var436, 0);
                        continue;
                    }
                    if (var461 == 410) {
                        var6--;
                        boolean var438 = class30.field448[var6] != 0;
                        class22.field308.field796.method1238((byte) 101, var438);
                        continue;
                    }
                } else if (!(var461 < 1000 || var461 >= 1100) || !(var461 < 2000 || var461 >= 2100)) {
                    class255 var428;
                    if (var461 < 2000) {
                        var428 = var46 ? class35.field538 : class117.field2096;
                    } else {
                        var461 -= 1000;
                        var6--;
                        var428 = class72.method506(class30.field448[var6], 0);
                    }
                    if (var461 == 1000) {
                        var6 -= 4;
                        var428.field4410 = class30.field448[var6];
                        var428.field4424 = class30.field448[var6 + 1];
                        int var429 = class30.field448[var6 + 2];
                        if (var429 < 0) {
                            var429 = 0;
                        } else if (var429 > 5) {
                            var429 = 5;
                        }
                        int var430 = class30.field448[var6 + 3];
                        var428.field4460 = (byte) var429;
                        if (var430 < 0) {
                            var430 = 0;
                        } else if (var430 > 5) {
                            var430 = 5;
                        }
                        var428.field4511 = (byte) var430;
                        class16.method120((byte) -98, var428);
                        class160.method1050((byte) -112, var428);
                        if (var428.field4418 == -1) {
                            class63.method427(var428.field4479, 11);
                        }
                        continue;
                    }
                    if (var461 == 1001) {
                        var6 -= 4;
                        var428.field4510 = class30.field448[var6];
                        var428.field4533 = class30.field448[var6 + 1];
                        var428.field4469 = 0;
                        var428.field4537 = 0;
                        int var431 = class30.field448[var6 + 3];
                        int var432 = class30.field448[var6 + 2];
                        if (var431 < 0) {
                            var431 = 0;
                        } else if (var431 > 4) {
                            var431 = 4;
                        }
                        var428.field4400 = (byte) var431;
                        if (var432 < 0) {
                            var432 = 0;
                        } else if (var432 > 4) {
                            var432 = 4;
                        }
                        var428.field4465 = (byte) var432;
                        class16.method120((byte) -107, var428);
                        class160.method1050((byte) 74, var428);
                        if (var428.field4436 == 0) {
                            class66.method446(var428, false, (byte) 57);
                        }
                        continue;
                    }
                    if (var461 == 1003) {
                        var6--;
                        boolean var433 = class30.field448[var6] == 1;
                        if (var428.field4542 != var433) {
                            var428.field4542 = var433;
                            class16.method120((byte) -101, var428);
                        }
                        if (var428.field4418 == -1) {
                            class3.method10(var428.field4479, 7);
                        }
                        continue;
                    }
                    if (var461 == 1004) {
                        var6 -= 2;
                        var428.field4451 = class30.field448[var6];
                        var428.field4448 = class30.field448[var6 + 1];
                        class16.method120((byte) -57, var428);
                        class160.method1050((byte) 106, var428);
                        if (var428.field4436 == 0) {
                            class66.method446(var428, false, (byte) 57);
                        }
                        continue;
                    }
                } else if (!(var461 < 1100 || var461 >= 1200) || !(var461 < 2100 || var461 >= 2200)) {
                    class255 var47;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var6--;
                        var47 = class72.method506(class30.field448[var6], 0);
                    } else {
                        var47 = var46 ? class35.field538 : class117.field2096;
                    }
                    if (var461 == 1100) {
                        var6 -= 2;
                        var47.field4557 = class30.field448[var6];
                        if (var47.field4557 > (var47.field4443 - var47.field4513)) {
                            var47.field4557 = var47.field4443 - var47.field4513;
                        }
                        if (var47.field4557 < 0) {
                            var47.field4557 = 0;
                        }
                        var47.field4484 = class30.field448[var6 + 1];
                        if (var47.field4484 > var47.field4466 - var47.field4482) {
                            var47.field4484 = var47.field4466 - var47.field4482;
                        }
                        if (var47.field4484 < 0) {
                            var47.field4484 = 0;
                        }
                        class16.method120((byte) -123, var47);
                        if (var47.field4418 == -1) {
                            class245.method1656(var47.field4479, false);
                        }
                        continue;
                    }
                    if (var461 == 1101) {
                        var6--;
                        var47.field4407 = class30.field448[var6];
                        class16.method120((byte) -13, var47);
                        if (var47.field4418 == -1) {
                            method1743(-122, var47.field4479);
                        }
                        continue;
                    }
                    if (var461 == 1102) {
                        var6--;
                        var47.field4556 = class30.field448[var6] == 1;
                        class16.method120((byte) -33, var47);
                        continue;
                    }
                    if (var461 == 1103) {
                        var6--;
                        var47.field4538 = class30.field448[var6];
                        class16.method120((byte) -114, var47);
                        continue;
                    }
                    if (var461 == 1104) {
                        var6--;
                        var47.field4517 = class30.field448[var6];
                        class16.method120((byte) -93, var47);
                        continue;
                    }
                    if (var461 == 1105) {
                        var6--;
                        var47.field4521 = class30.field448[var6];
                        class16.method120((byte) -84, var47);
                        continue;
                    }
                    if (var461 == 1106) {
                        var6--;
                        var47.field4553 = class30.field448[var6];
                        class16.method120((byte) -117, var47);
                        continue;
                    }
                    if (var461 == 1107) {
                        var6--;
                        var47.field4543 = class30.field448[var6] == 1;
                        class16.method120((byte) -52, var47);
                        continue;
                    }
                    if (var461 == 1108) {
                        var47.field4492 = 1;
                        var6--;
                        var47.field4425 = class30.field448[var6];
                        class16.method120((byte) -39, var47);
                        if (var47.field4418 == -1) {
                            class168.method1127(var47.field4479, 0);
                        }
                        continue;
                    }
                    if (var461 == 1109) {
                        var6 -= 6;
                        var47.field4440 = class30.field448[var6];
                        var47.field4455 = class30.field448[var6 + 1];
                        var47.field4416 = class30.field448[var6 + 2];
                        var47.field4394 = class30.field448[var6 + 3];
                        var47.field4512 = class30.field448[var6 + 4];
                        var47.field4500 = class30.field448[var6 + 5];
                        class16.method120((byte) -70, var47);
                        if (var47.field4418 == -1) {
                            class6.method30(var47.field4479, -64);
                            client.method993(1000, var47.field4479);
                        }
                        continue;
                    }
                    if (var461 == 1110) {
                        var6--;
                        int var48 = class30.field448[var6];
                        if (var47.field4426 != var48) {
                            var47.field4497 = 0;
                            var47.field4426 = var48;
                            var47.field4421 = 0;
                            class16.method120((byte) -103, var47);
                        }
                        if (var47.field4418 == -1) {
                            class193.method1320(3, var47.field4479);
                        }
                        continue;
                    }
                    if (var461 == 1111) {
                        var6--;
                        var47.field4415 = class30.field448[var6] == 1;
                        class16.method120((byte) -42, var47);
                        continue;
                    }
                    if (var461 == 1112) {
                        var8--;
                        class85 var49 = class97.field1761[var8];
                        if (!var49.method612((byte) 92, var47.field4534)) {
                            var47.field4534 = var49;
                            class16.method120((byte) -127, var47);
                        }
                        if (var47.field4418 == -1) {
                            class25.method167(var47.field4479, (byte) -76);
                        }
                        continue;
                    }
                    if (var461 == 1113) {
                        var6--;
                        var47.field4445 = class30.field448[var6];
                        class16.method120((byte) -69, var47);
                        continue;
                    }
                    if (var461 == 1114) {
                        var6 -= 3;
                        var47.field4423 = class30.field448[var6];
                        var47.field4473 = class30.field448[var6 + 1];
                        var47.field4468 = class30.field448[var6 + 2];
                        class16.method120((byte) -89, var47);
                        continue;
                    }
                    if (var461 == 1115) {
                        var6--;
                        var47.field4444 = class30.field448[var6] == 1;
                        class16.method120((byte) -76, var47);
                        continue;
                    }
                    if (var461 == 1116) {
                        var6--;
                        var47.field4462 = class30.field448[var6];
                        class16.method120((byte) -96, var47);
                        continue;
                    }
                    if (var461 == 1117) {
                        var6--;
                        var47.field4456 = class30.field448[var6];
                        class16.method120((byte) -13, var47);
                        continue;
                    }
                    if (var461 == 1118) {
                        var6--;
                        var47.field4527 = class30.field448[var6] == 1;
                        class16.method120((byte) -13, var47);
                        continue;
                    }
                    if (var461 == 1119) {
                        var6--;
                        var47.field4518 = class30.field448[var6] == 1;
                        class16.method120((byte) -128, var47);
                        continue;
                    }
                    if (var461 == 1120) {
                        var6 -= 2;
                        var47.field4443 = class30.field448[var6];
                        var47.field4466 = class30.field448[var6 + 1];
                        class16.method120((byte) -65, var47);
                        if (var47.field4436 == 0) {
                            class66.method446(var47, false, (byte) 57);
                        }
                        continue;
                    }
                    if (var461 == 1121) {
                        class16.method120((byte) -117, var47);
                        var6 -= 2;
                        continue;
                    }
                    if (var461 == 1122) {
                        var6--;
                        var47.field4547 = class30.field448[var6] == 1;
                        class16.method120((byte) -63, var47);
                        continue;
                    }
                } else if (var461 >= 1200 && var461 < 1300 || var461 >= 2200 && var461 < 2300) {
                    class255 var50;
                    if (var461 < 2000) {
                        var50 = var46 ? class35.field538 : class117.field2096;
                    } else {
                        var6--;
                        var50 = class72.method506(class30.field448[var6], 0);
                        var461 -= 1000;
                    }
                    class16.method120((byte) -109, var50);
                    if (var461 == 1200 || var461 == 1205) {
                        var6 -= 2;
                        int var51 = class30.field448[var6];
                        int var52 = class30.field448[var6 + 1];
                        if (var50.field4418 == -1) {
                            class87.method648(var50.field4479, -32061);
                            class6.method30(var50.field4479, -64);
                            client.method993(1000, var50.field4479);
                        }
                        if (var51 == -1) {
                            var50.field4425 = -1;
                            var50.field4548 = -1;
                            var50.field4492 = 1;
                        } else {
                            var50.field4487 = var52;
                            var50.field4548 = var51;
                            class61 var53 = class32.method221(11649, var51);
                            var50.field4440 = var53.field1112;
                            var50.field4512 = var53.field1139;
                            var50.field4394 = var53.field1156;
                            var50.field4500 = var53.field1141;
                            var50.field4416 = var53.field1105;
                            if (var50.field4469 > 0) {
                                var50.field4500 = var50.field4500 * 32 / var50.field4469;
                            } else if (var50.field4510 > 0) {
                                var50.field4500 = var50.field4500 * 32 / var50.field4510;
                            }
                            if (var461 == 1205) {
                                var50.field4413 = false;
                            } else {
                                var50.field4413 = true;
                            }
                            var50.field4455 = var53.field1100;
                        }
                        continue;
                    }
                    if (var461 == 1201) {
                        var50.field4492 = 2;
                        var6--;
                        var50.field4425 = class30.field448[var6];
                        if (var50.field4418 == -1) {
                            class168.method1127(var50.field4479, 0);
                        }
                        continue;
                    }
                    if (var461 == 1202) {
                        var50.field4492 = 3;
                        var50.field4425 = class22.field308.field796.method1244(0);
                        if (var50.field4418 == -1) {
                            class168.method1127(var50.field4479, 0);
                        }
                        continue;
                    }
                    if (var461 == 1203) {
                        var50.field4492 = 6;
                        var6--;
                        var50.field4425 = class30.field448[var6];
                        if (var50.field4418 == -1) {
                            class168.method1127(var50.field4479, 0);
                        }
                        continue;
                    }
                    if (var461 == 1204) {
                        var50.field4492 = 5;
                        var6--;
                        var50.field4425 = class30.field448[var6];
                        if (var50.field4418 == -1) {
                            class168.method1127(var50.field4479, 0);
                        }
                        continue;
                    }
                } else if (var461 >= 1300 && var461 < 1400 || var461 >= 2300 && var461 < 2400) {
                    class255 var54;
                    if (var461 < 2000) {
                        var54 = var46 ? class35.field538 : class117.field2096;
                    } else {
                        var461 -= 1000;
                        var6--;
                        var54 = class72.method506(class30.field448[var6], 0);
                    }
                    if (var461 == 1300) {
                        var6--;
                        int var55 = class30.field448[var6] - 1;
                        if (var55 >= 0 && var55 <= 9) {
                            var8--;
                            var54.method1773(class97.field1761[var8], -72, var55);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var461 == 1301) {
                        var6 -= 2;
                        int var56 = class30.field448[var6];
                        int var57 = class30.field448[var6 + 1];
                        var54.field4495 = class67.method449(var57, (byte) -68, var56);
                        continue;
                    }
                    if (var461 == 1302) {
                        var6--;
                        var54.field4392 = class30.field448[var6] == 1;
                        continue;
                    }
                    if (var461 == 1303) {
                        var6--;
                        var54.field4532 = class30.field448[var6];
                        continue;
                    }
                    if (var461 == 1304) {
                        var6--;
                        var54.field4489 = class30.field448[var6];
                        continue;
                    }
                    if (var461 == 1305) {
                        var8--;
                        var54.field4526 = class97.field1761[var8];
                        continue;
                    }
                    if (var461 == 1306) {
                        var8--;
                        var54.field4546 = class97.field1761[var8];
                        continue;
                    }
                    if (var461 == 1307) {
                        var54.field4439 = null;
                        continue;
                    }
                } else {
                    if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                        int[] var58 = null;
                        class255 var59;
                        if (var461 >= 2000) {
                            var6--;
                            var59 = class72.method506(class30.field448[var6], 0);
                            var461 -= 1000;
                        } else {
                            var59 = var46 ? class35.field538 : class117.field2096;
                        }
                        var8--;
                        class85 var60 = class97.field1761[var8];
                        if (var60.method586(true) > 0 && var60.method615(true, var60.method586(true) - 1) == 89) {
                            var6--;
                            int var61 = class30.field448[var6];
                            if (var61 > 0) {
                                var58 = new int[var61];
                                while ((var61--) > 0) {
                                    var6--;
                                    var58[var61] = class30.field448[var6];
                                }
                            }
                            var60 = var60.method636(var60.method586(true) - 1, 0, true);
                        }
                        Object[] var62 = new Object[var60.method586(true) + 1];
                        for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                            if (var60.method615(true, var63 - 1) == 115) {
                                var8--;
                                var62[var63] = class97.field1761[var8];
                            } else {
                                var6--;
                                var62[var63] = Integer.valueOf(class30.field448[var6]);
                            }
                        }
                        var6--;
                        int var64 = class30.field448[var6];
                        if (var64 == -1) {
                            var62 = null;
                        } else {
                            var62[0] = Integer.valueOf(var64);
                        }
                        var59.field4434 = true;
                        if (var461 == 1400) {
                            var59.field4516 = var62;
                        } else if (var461 == 1401) {
                            var59.field4399 = var62;
                        } else if (var461 == 1402) {
                            var59.field4505 = var62;
                        } else if (var461 == 1403) {
                            var59.field4449 = var62;
                        } else if (var461 == 1404) {
                            var59.field4411 = var62;
                        } else if (var461 == 1405) {
                            var59.field4401 = var62;
                        } else if (var461 == 1406) {
                            var59.field4503 = var62;
                        } else if (var461 == 1407) {
                            var59.field4540 = var62;
                            var59.field4403 = var58;
                        } else if (var461 == 1408) {
                            var59.field4483 = var62;
                        } else if (var461 == 1409) {
                            var59.field4552 = var62;
                        } else if (var461 == 1410) {
                            var59.field4458 = var62;
                        } else if (var461 == 1411) {
                            var59.field4406 = var62;
                        } else if (var461 == 1412) {
                            var59.field4493 = var62;
                        } else if (var461 == 1414) {
                            var59.field4496 = var58;
                            var59.field4550 = var62;
                        } else if (var461 == 1415) {
                            var59.field4474 = var58;
                            var59.field4523 = var62;
                        } else if (var461 == 1416) {
                            var59.field4472 = var62;
                        } else if (var461 == 1417) {
                            var59.field4398 = var62;
                        } else if (var461 == 1418) {
                            var59.field4404 = var62;
                        } else if (var461 == 1419) {
                            var59.field4454 = var62;
                        } else if (var461 == 1420) {
                            var59.field4414 = var62;
                        } else if (var461 == 1421) {
                            var59.field4463 = var62;
                        } else if (var461 == 1422) {
                            var59.field4555 = var62;
                        } else if (var461 == 1423) {
                            var59.field4419 = var62;
                        } else if (var461 == 1424) {
                            var59.field4551 = var62;
                        } else if (var461 == 1425) {
                            var59.field4431 = var62;
                        } else if (var461 == 1426) {
                            var59.field4402 = var62;
                        } else if (var461 == 1427) {
                            var59.field4464 = var62;
                        } else if (var461 == 1428) {
                            var59.field4514 = var58;
                            var59.field4447 = var62;
                        } else if (var461 == 1429) {
                            var59.field4478 = var62;
                            var59.field4408 = var58;
                        }
                        continue;
                    }
                    if (var461 < 1600) {
                        class255 var65 = var46 ? class35.field538 : class117.field2096;
                        if (var461 == 1500) {
                            class30.field448[var6++] = var65.field4559;
                            continue;
                        }
                        if (var461 == 1501) {
                            class30.field448[var6++] = var65.field4554;
                            continue;
                        }
                        if (var461 == 1502) {
                            class30.field448[var6++] = var65.field4513;
                            continue;
                        }
                        if (var461 == 1503) {
                            class30.field448[var6++] = var65.field4482;
                            continue;
                        }
                        if (var461 == 1504) {
                            class30.field448[var6++] = var65.field4542 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 1505) {
                            class30.field448[var6++] = var65.field4530;
                            continue;
                        }
                    } else if (var461 < 1700) {
                        class255 var427 = var46 ? class35.field538 : class117.field2096;
                        if (var461 == 1600) {
                            class30.field448[var6++] = var427.field4557;
                            continue;
                        }
                        if (var461 == 1601) {
                            class30.field448[var6++] = var427.field4484;
                            continue;
                        }
                        if (var461 == 1602) {
                            class97.field1761[var8++] = var427.field4534;
                            continue;
                        }
                        if (var461 == 1603) {
                            class30.field448[var6++] = var427.field4443;
                            continue;
                        }
                        if (var461 == 1604) {
                            class30.field448[var6++] = var427.field4466;
                            continue;
                        }
                        if (var461 == 1605) {
                            class30.field448[var6++] = var427.field4500;
                            continue;
                        }
                        if (var461 == 1606) {
                            class30.field448[var6++] = var427.field4416;
                            continue;
                        }
                        if (var461 == 1607) {
                            class30.field448[var6++] = var427.field4512;
                            continue;
                        }
                        if (var461 == 1608) {
                            class30.field448[var6++] = var427.field4394;
                            continue;
                        }
                        if (var461 == 1609) {
                            class30.field448[var6++] = var427.field4538;
                            continue;
                        }
                    } else if (var461 < 1800) {
                        class255 var66 = var46 ? class35.field538 : class117.field2096;
                        if (var461 == 1700) {
                            class30.field448[var6++] = var66.field4548;
                            continue;
                        }
                        if (var461 == 1701) {
                            if (var66.field4548 == -1) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = var66.field4487;
                            }
                            continue;
                        }
                        if (var461 == 1702) {
                            class30.field448[var6++] = var66.field4418;
                            continue;
                        }
                    } else if (var461 < 1900) {
                        class255 var67 = var46 ? class35.field538 : class117.field2096;
                        if (var461 == 1800) {
                            class30.field448[var6++] = class161.method1057((byte) -58, client.method987(var67));
                            continue;
                        }
                        if (var461 == 1801) {
                            var6--;
                            int var68 = class30.field448[var6];
                            int var462 = var68 - 1;
                            if (var67.field4439 != null && var462 < var67.field4439.length && var67.field4439[var462] != null) {
                                class97.field1761[var8++] = var67.field4439[var462];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 1802) {
                            if (var67.field4526 == null) {
                                class97.field1761[var8++] = class82.field1501;
                            } else {
                                class97.field1761[var8++] = var67.field4526;
                            }
                            continue;
                        }
                    } else if (var461 < 2600) {
                        var6--;
                        class255 var426 = class72.method506(class30.field448[var6], 0);
                        if (var461 == 2500) {
                            class30.field448[var6++] = var426.field4559;
                            continue;
                        }
                        if (var461 == 2501) {
                            class30.field448[var6++] = var426.field4554;
                            continue;
                        }
                        if (var461 == 2502) {
                            class30.field448[var6++] = var426.field4513;
                            continue;
                        }
                        if (var461 == 2503) {
                            class30.field448[var6++] = var426.field4482;
                            continue;
                        }
                        if (var461 == 2504) {
                            class30.field448[var6++] = var426.field4542 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 2505) {
                            class30.field448[var6++] = var426.field4530;
                            continue;
                        }
                    } else if (var461 < 2700) {
                        var6--;
                        class255 var425 = class72.method506(class30.field448[var6], 0);
                        if (var461 == 2600) {
                            class30.field448[var6++] = var425.field4557;
                            continue;
                        }
                        if (var461 == 2601) {
                            class30.field448[var6++] = var425.field4484;
                            continue;
                        }
                        if (var461 == 2602) {
                            class97.field1761[var8++] = var425.field4534;
                            continue;
                        }
                        if (var461 == 2603) {
                            class30.field448[var6++] = var425.field4443;
                            continue;
                        }
                        if (var461 == 2604) {
                            class30.field448[var6++] = var425.field4466;
                            continue;
                        }
                        if (var461 == 2605) {
                            class30.field448[var6++] = var425.field4500;
                            continue;
                        }
                        if (var461 == 2606) {
                            class30.field448[var6++] = var425.field4416;
                            continue;
                        }
                        if (var461 == 2607) {
                            class30.field448[var6++] = var425.field4512;
                            continue;
                        }
                        if (var461 == 2608) {
                            class30.field448[var6++] = var425.field4394;
                            continue;
                        }
                        if (var461 == 2609) {
                            class30.field448[var6++] = var425.field4538;
                            continue;
                        }
                    } else if (var461 < 2800) {
                        if (var461 == 2700) {
                            var6--;
                            class255 var415 = class72.method506(class30.field448[var6], 0);
                            class30.field448[var6++] = var415.field4548;
                            continue;
                        }
                        if (var461 == 2701) {
                            var6--;
                            class255 var416 = class72.method506(class30.field448[var6], 0);
                            if (var416.field4548 == -1) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = var416.field4487;
                            }
                            continue;
                        }
                        if (var461 == 2702) {
                            var6--;
                            int var417 = class30.field448[var6];
                            class129 var418 = (class129) class121.field2126.method1398(1, (long) var417);
                            if (var418 == null) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 2703) {
                            var6--;
                            class255 var419 = class72.method506(class30.field448[var6], 0);
                            if (var419.field4549 == null) {
                                class30.field448[var6++] = 0;
                                continue;
                            }
                            int var420 = var419.field4549.length;
                            for (int var421 = 0; var421 < var419.field4549.length; var421++) {
                                if (var419.field4549[var421] == null) {
                                    var420 = var421;
                                    break;
                                }
                            }
                            class30.field448[var6++] = var420;
                            continue;
                        }
                        if (var461 == 2704 || var461 == 2705) {
                            var6 -= 2;
                            int var422 = class30.field448[var6];
                            int var423 = class30.field448[var6 + 1];
                            class129 var424 = (class129) class121.field2126.method1398(1, (long) var422);
                            if (var424 != null && var424.field2264 == var423) {
                                class30.field448[var6++] = 1;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                    } else if (var461 < 2900) {
                        var6--;
                        class255 var413 = class72.method506(class30.field448[var6], 0);
                        if (var461 == 2800) {
                            class30.field448[var6++] = class161.method1057((byte) -9, client.method987(var413));
                            continue;
                        }
                        if (var461 == 2801) {
                            var6--;
                            int var414 = class30.field448[var6];
                            int var463 = var414 - 1;
                            if (var413.field4439 != null && var463 < var413.field4439.length && var413.field4439[var463] != null) {
                                class97.field1761[var8++] = var413.field4439[var463];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 2802) {
                            if (var413.field4526 == null) {
                                class97.field1761[var8++] = class82.field1501;
                            } else {
                                class97.field1761[var8++] = var413.field4526;
                            }
                            continue;
                        }
                    } else if (var461 < 3200) {
                        if (var461 == 3100) {
                            var8--;
                            class85 var398 = class97.field1761[var8];
                            class148.method972(var398, (byte) -125, class82.field1501, 0);
                            continue;
                        }
                        if (var461 == 3101) {
                            var6 -= 2;
                            class254.method1754(-69, class30.field448[var6 + 1], class30.field448[var6], class22.field308);
                            continue;
                        }
                        if (var461 == 3103) {
                            class232.method1549((byte) 122);
                            continue;
                        }
                        if (var461 == 3104) {
                            int var399 = 0;
                            class204.field3569++;
                            var8--;
                            class85 var400 = class97.field1761[var8];
                            if (var400.method608((byte) -64)) {
                                var399 = var400.method639(2);
                            }
                            class207.field3618.method483(-24260, 109);
                            class207.field3618.method1715(var399, (byte) -91);
                            continue;
                        }
                        if (var461 == 3105) {
                            class127.field2228++;
                            var8--;
                            class85 var401 = class97.field1761[var8];
                            class207.field3618.method483(-24260, 29);
                            class207.field3618.method1674((byte) 101, var401.method624(false));
                            continue;
                        }
                        if (var461 == 3106) {
                            class127.field2227++;
                            var8--;
                            class85 var402 = class97.field1761[var8];
                            class207.field3618.method483(-24260, 223);
                            class207.field3618.method1714(var402.method586(true) + 1, -714043120);
                            class207.field3618.method1698((byte) -72, var402);
                            continue;
                        }
                        if (var461 == 3107) {
                            var6--;
                            int var403 = class30.field448[var6];
                            var8--;
                            class85 var404 = class97.field1761[var8];
                            class105.method724(0, var404, var403);
                            continue;
                        }
                        if (var461 == 3108) {
                            var6 -= 3;
                            int var405 = class30.field448[var6 + 1];
                            int var406 = class30.field448[var6 + 2];
                            int var407 = class30.field448[var6];
                            class255 var408 = class72.method506(var406, 0);
                            class240.method1634(var407, var405, var408, (byte) -128);
                            continue;
                        }
                        if (var461 == 3109) {
                            var6 -= 2;
                            int var409 = class30.field448[var6 + 1];
                            int var410 = class30.field448[var6];
                            class255 var411 = var46 ? class35.field538 : class117.field2096;
                            class240.method1634(var410, var409, var411, (byte) -128);
                            continue;
                        }
                        if (var461 == 3110) {
                            class247.field4278++;
                            var6--;
                            int var412 = class30.field448[var6];
                            class207.field3618.method483(-24260, 213);
                            class207.field3618.method1703(var412, -97);
                            continue;
                        }
                    } else if (var461 < 3300) {
                        if (var461 == 3200) {
                            var6 -= 3;
                            class102.method705(0, class30.field448[var6], class30.field448[var6 + 2], class30.field448[var6 + 1]);
                            continue;
                        }
                        if (var461 == 3201) {
                            var6--;
                            class181.method1247(0, class30.field448[var6]);
                            continue;
                        }
                        if (var461 == 3202) {
                            var6 -= 2;
                            class263.method1798(class30.field448[var6 + 1], (byte) 30, class30.field448[var6]);
                            continue;
                        }
                    } else if (var461 < 3400) {
                        if (var461 == 3300) {
                            class30.field448[var6++] = class151.field2555;
                            continue;
                        }
                        if (var461 == 3301) {
                            var6 -= 2;
                            int var371 = class30.field448[var6 + 1];
                            int var372 = class30.field448[var6];
                            class30.field448[var6++] = class175.method1177((byte) 97, var372, var371);
                            continue;
                        }
                        if (var461 == 3302) {
                            var6 -= 2;
                            int var373 = class30.field448[var6 + 1];
                            int var374 = class30.field448[var6];
                            class30.field448[var6++] = class35.method237(var374, 3, var373);
                            continue;
                        }
                        if (var461 == 3303) {
                            var6 -= 2;
                            int var375 = class30.field448[var6];
                            int var376 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class214.method1467(-113, var375, var376);
                            continue;
                        }
                        if (var461 == 3304) {
                            var6--;
                            int var377 = class30.field448[var6];
                            class30.field448[var6++] = class255.method1771(var377, (byte) -69).field4624;
                            continue;
                        }
                        if (var461 == 3305) {
                            var6--;
                            int var378 = class30.field448[var6];
                            class30.field448[var6++] = class20.field279[var378];
                            continue;
                        }
                        if (var461 == 3306) {
                            var6--;
                            int var379 = class30.field448[var6];
                            class30.field448[var6++] = class71.field1323[var379];
                            continue;
                        }
                        if (var461 == 3307) {
                            var6--;
                            int var380 = class30.field448[var6];
                            class30.field448[var6++] = class227.field3941[var380];
                            continue;
                        }
                        if (var461 == 3308) {
                            int var381 = class116.field2066;
                            int var382 = (class22.field308.field1042 >> 7) + class244.field4172;
                            int var383 = (class22.field308.field1027 >> 7) + class213.field3742;
                            class30.field448[var6++] = (var381 << 28) + (var382 << 14) + var383;
                            continue;
                        }
                        if (var461 == 3309) {
                            var6--;
                            int var384 = class30.field448[var6];
                            class30.field448[var6++] = class135.method899(var384, 268435104) >> 14;
                            continue;
                        }
                        if (var461 == 3310) {
                            var6--;
                            int var385 = class30.field448[var6];
                            class30.field448[var6++] = var385 >> 28;
                            continue;
                        }
                        if (var461 == 3311) {
                            var6--;
                            int var386 = class30.field448[var6];
                            class30.field448[var6++] = class135.method899(var386, 16383);
                            continue;
                        }
                        if (var461 == 3312) {
                            class30.field448[var6++] = class217.field3814 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3313) {
                            var6 -= 2;
                            int var387 = class30.field448[var6] + 32768;
                            int var388 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class175.method1177((byte) 123, var387, var388);
                            continue;
                        }
                        if (var461 == 3314) {
                            var6 -= 2;
                            int var389 = class30.field448[var6] + 32768;
                            int var390 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class35.method237(var389, 3, var390);
                            continue;
                        }
                        if (var461 == 3315) {
                            var6 -= 2;
                            int var391 = class30.field448[var6 + 1];
                            int var392 = class30.field448[var6] + 32768;
                            class30.field448[var6++] = class214.method1467(-118, var392, var391);
                            continue;
                        }
                        if (var461 == 3316) {
                            if (class63.field1174 < 2) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = class63.field1174;
                            }
                            continue;
                        }
                        if (var461 == 3317) {
                            class30.field448[var6++] = class197.field3380;
                            continue;
                        }
                        if (var461 == 3318) {
                            class30.field448[var6++] = class7.field78;
                            continue;
                        }
                        if (var461 == 3321) {
                            class30.field448[var6++] = class93.field1706;
                            continue;
                        }
                        if (var461 == 3322) {
                            class30.field448[var6++] = class15.field226;
                            continue;
                        }
                        if (var461 == 3323) {
                            if (class181.field3096 >= 5 && class181.field3096 <= 9) {
                                class30.field448[var6++] = 1;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3324) {
                            if (class181.field3096 >= 5 && class181.field3096 <= 9) {
                                class30.field448[var6++] = class181.field3096;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3325) {
                            if (class108.field1898 <= 0) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 3326) {
                            class30.field448[var6++] = class22.field308.field760;
                            continue;
                        }
                        if (var461 == 3327) {
                            class30.field448[var6++] = class22.field308.field796.field3079 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3328) {
                            class30.field448[var6++] = class98.field1766;
                            continue;
                        }
                        if (var461 == 3329) {
                            class30.field448[var6++] = class169.field2916;
                            continue;
                        }
                        if (var461 == 3330) {
                            var6--;
                            int var393 = class30.field448[var6];
                            class30.field448[var6++] = class74.method520(var393, -17209);
                            continue;
                        }
                        if (var461 == 3331) {
                            var6 -= 2;
                            int var394 = class30.field448[var6];
                            int var395 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class223.method1516(var394, (byte) 51, var395, false);
                            continue;
                        }
                        if (var461 == 3332) {
                            var6 -= 2;
                            int var396 = class30.field448[var6 + 1];
                            int var397 = class30.field448[var6];
                            class30.field448[var6++] = class223.method1516(var397, (byte) 51, var396, true);
                            continue;
                        }
                        if (var461 == 3333) {
                            class30.field448[var6++] = class253.field4363;
                            continue;
                        }
                    } else if (var461 < 3500) {
                        if (var461 == 3400) {
                            var6 -= 2;
                            int var69 = class30.field448[var6];
                            int var70 = class30.field448[var6 + 1];
                            class72 var71 = class4.method17(var69, -102);
                            class97.field1761[var8++] = var71.method505(true, var70);
                            continue;
                        }
                        if (var461 == 3408) {
                            var6 -= 4;
                            int var72 = class30.field448[var6 + 1];
                            int var73 = class30.field448[var6];
                            int var74 = class30.field448[var6 + 2];
                            int var75 = class30.field448[var6 + 3];
                            class72 var76 = class4.method17(var74, -116);
                            if (var76.field1363 == var73 && var76.field1343 == var72) {
                                if (var72 == 115) {
                                    class97.field1761[var8++] = var76.method505(true, var75);
                                } else {
                                    class30.field448[var6++] = var76.method510(-113, var75);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var461 == 3409) {
                            var6 -= 3;
                            int var77 = class30.field448[var6];
                            int var78 = class30.field448[var6 + 1];
                            int var79 = class30.field448[var6 + 2];
                            if (var78 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class72 var80 = class4.method17(var78, -123);
                            if (var80.field1343 != var77) {
                                throw new RuntimeException("C3409-1");
                            }
                            class30.field448[var6++] = var80.method502(124, var79) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3410) {
                            var6--;
                            int var81 = class30.field448[var6];
                            var8--;
                            class85 var82 = class97.field1761[var8];
                            if (var81 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class72 var83 = class4.method17(var81, -123);
                            if (var83.field1343 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class30.field448[var6++] = var83.method508(false, var82) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3411) {
                            var6--;
                            int var84 = class30.field448[var6];
                            class72 var85 = class4.method17(var84, -103);
                            class30.field448[var6++] = var85.field1345.method1400(1);
                            continue;
                        }
                    } else if (var461 < 3700) {
                        if (var461 == 3600) {
                            if (class251.field4308 == 0) {
                                class30.field448[var6++] = -2;
                            } else if (class251.field4308 == 1) {
                                class30.field448[var6++] = -1;
                            } else {
                                class30.field448[var6++] = class45.field810;
                            }
                            continue;
                        }
                        if (var461 == 3601) {
                            var6--;
                            int var349 = class30.field448[var6];
                            if (class251.field4308 == 2 && var349 < class45.field810) {
                                class97.field1761[var8++] = class1.field5[var349];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 3602) {
                            var6--;
                            int var350 = class30.field448[var6];
                            if (class251.field4308 == 2 && var350 < class45.field810) {
                                class30.field448[var6++] = class222.field3890[var350];
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3603) {
                            var6--;
                            int var351 = class30.field448[var6];
                            if (class251.field4308 == 2 && var351 < class45.field810) {
                                class30.field448[var6++] = class183.field3117[var351];
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3604) {
                            var8--;
                            class85 var352 = class97.field1761[var8];
                            var6--;
                            int var353 = class30.field448[var6];
                            class175.method1184(var353, var352, (byte) 12);
                            continue;
                        }
                        if (var461 == 3605) {
                            var8--;
                            class85 var354 = class97.field1761[var8];
                            class50.method339(-27106, var354.method624(false));
                            continue;
                        }
                        if (var461 == 3606) {
                            var8--;
                            class85 var355 = class97.field1761[var8];
                            class105.method723(var355.method624(false), false);
                            continue;
                        }
                        if (var461 == 3607) {
                            var8--;
                            class85 var356 = class97.field1761[var8];
                            method1740(0, var356.method624(false));
                            continue;
                        }
                        if (var461 == 3608) {
                            var8--;
                            class85 var357 = class97.field1761[var8];
                            class65.method435(99, var357.method624(false));
                            continue;
                        }
                        if (var461 == 3609) {
                            var8--;
                            class85 var358 = class97.field1761[var8];
                            if (var358.method619(class119.field2118, (byte) 74) || var358.method619(class127.field2220, (byte) 74)) {
                                var358 = var358.method611((byte) -97, 7);
                            }
                            class30.field448[var6++] = class214.method1473(28, var358) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3610) {
                            var6--;
                            int var359 = class30.field448[var6];
                            if (class251.field4308 == 2 && class45.field810 > var359) {
                                class97.field1761[var8++] = class190.field3267[var359];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 3611) {
                            if (class146.field2495 == null) {
                                class97.field1761[var8++] = class82.field1501;
                            } else {
                                class97.field1761[var8++] = class146.field2495.method587((byte) -90);
                            }
                            continue;
                        }
                        if (var461 == 3612) {
                            if (class146.field2495 == null) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = class40.field641;
                            }
                            continue;
                        }
                        if (var461 == 3613) {
                            var6--;
                            int var360 = class30.field448[var6];
                            if (class146.field2495 != null && var360 < class40.field641) {
                                class97.field1761[var8++] = class118.field2111[var360].field3869.method587((byte) -109);
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 3614) {
                            var6--;
                            int var361 = class30.field448[var6];
                            if (class146.field2495 != null && class40.field641 > var361) {
                                class30.field448[var6++] = class118.field2111[var361].field3876;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3615) {
                            var6--;
                            int var362 = class30.field448[var6];
                            if (class146.field2495 != null && class40.field641 > var362) {
                                class30.field448[var6++] = class118.field2111[var362].field3872;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3616) {
                            class30.field448[var6++] = class147.field2499;
                            continue;
                        }
                        if (var461 == 3617) {
                            var8--;
                            class85 var363 = class97.field1761[var8];
                            class225.method1520(var363, true);
                            continue;
                        }
                        if (var461 == 3618) {
                            class30.field448[var6++] = class2.field14;
                            continue;
                        }
                        if (var461 == 3619) {
                            var8--;
                            class85 var364 = class97.field1761[var8];
                            class246.method1659(var364.method624(false), (byte) 75);
                            continue;
                        }
                        if (var461 == 3620) {
                            class17.method126(0);
                            continue;
                        }
                        if (var461 == 3621) {
                            if (class251.field4308 == 0) {
                                class30.field448[var6++] = -1;
                            } else {
                                class30.field448[var6++] = class56.field978;
                            }
                            continue;
                        }
                        if (var461 == 3622) {
                            var6--;
                            int var365 = class30.field448[var6];
                            if (class251.field4308 != 0 && var365 < class56.field978) {
                                class97.field1761[var8++] = class116.method814(class137.field2379[var365], -126).method587((byte) -83);
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 3623) {
                            var8--;
                            class85 var366 = class97.field1761[var8];
                            if (var366.method619(class119.field2118, (byte) 74) || var366.method619(class127.field2220, (byte) 74)) {
                                var366 = var366.method611((byte) -97, 7);
                            }
                            class30.field448[var6++] = class244.method1646(var366, false) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3624) {
                            var6--;
                            int var367 = class30.field448[var6];
                            if (class118.field2111 != null && class40.field641 > var367 && class118.field2111[var367].field3869.method582(class22.field308.field762, -96)) {
                                class30.field448[var6++] = 1;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3625) {
                            if (class39.field603 == null) {
                                class97.field1761[var8++] = class82.field1501;
                            } else {
                                class97.field1761[var8++] = class39.field603.method587((byte) -111);
                            }
                            continue;
                        }
                        if (var461 == 3626) {
                            var6--;
                            int var368 = class30.field448[var6];
                            if (class146.field2495 != null && var368 < class40.field641) {
                                class97.field1761[var8++] = class118.field2111[var368].field3873;
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 3627) {
                            var6--;
                            int var369 = class30.field448[var6];
                            if (class251.field4308 == 2 && var369 >= 0 && var369 < class45.field810) {
                                class30.field448[var6++] = client.field2560[var369] ? 1 : 0;
                                continue;
                            }
                            class30.field448[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3628) {
                            var8--;
                            class85 var370 = class97.field1761[var8];
                            if (var370.method619(class119.field2118, (byte) 74) || var370.method619(class127.field2220, (byte) 74)) {
                                var370 = var370.method611((byte) -97, 7);
                            }
                            class30.field448[var6++] = class251.method1732(-61, var370);
                            continue;
                        }
                    } else if (var461 < 4000) {
                        if (var461 == 3903) {
                            var6--;
                            int var335 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var335].method573(-9);
                            continue;
                        }
                        if (var461 == 3904) {
                            var6--;
                            int var336 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var336].field1519;
                            continue;
                        }
                        if (var461 == 3905) {
                            var6--;
                            int var337 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var337].field1512;
                            continue;
                        }
                        if (var461 == 3906) {
                            var6--;
                            int var338 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var338].field1516;
                            continue;
                        }
                        if (var461 == 3907) {
                            var6--;
                            int var339 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var339].field1523;
                            continue;
                        }
                        if (var461 == 3908) {
                            var6--;
                            int var340 = class30.field448[var6];
                            class30.field448[var6++] = class86.field1614[var340].field1507;
                            continue;
                        }
                        if (var461 == 3910) {
                            var6--;
                            int var341 = class30.field448[var6];
                            int var342 = class86.field1614[var341].method572(-2684);
                            class30.field448[var6++] = var342 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3911) {
                            var6--;
                            int var343 = class30.field448[var6];
                            int var344 = class86.field1614[var343].method572(-2684);
                            class30.field448[var6++] = var344 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3912) {
                            var6--;
                            int var345 = class30.field448[var6];
                            int var346 = class86.field1614[var345].method572(-2684);
                            class30.field448[var6++] = var346 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3913) {
                            var6--;
                            int var347 = class30.field448[var6];
                            int var348 = class86.field1614[var347].method572(-2684);
                            class30.field448[var6++] = var348 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var461 < 4100) {
                        if (var461 == 4000) {
                            var6 -= 2;
                            int var86 = class30.field448[var6];
                            int var87 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var86 + var87;
                            continue;
                        }
                        if (var461 == 4001) {
                            var6 -= 2;
                            int var88 = class30.field448[var6];
                            int var89 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var88 - var89;
                            continue;
                        }
                        if (var461 == 4002) {
                            var6 -= 2;
                            int var90 = class30.field448[var6];
                            int var91 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var90 * var91;
                            continue;
                        }
                        if (var461 == 4003) {
                            var6 -= 2;
                            int var92 = class30.field448[var6 + 1];
                            int var93 = class30.field448[var6];
                            class30.field448[var6++] = var93 / var92;
                            continue;
                        }
                        if (var461 == 4004) {
                            var6--;
                            int var94 = class30.field448[var6];
                            class30.field448[var6++] = (int) (Math.random() * (double) var94);
                            continue;
                        }
                        if (var461 == 4005) {
                            var6--;
                            int var95 = class30.field448[var6];
                            class30.field448[var6++] = (int) (Math.random() * (double) (var95 + 1));
                            continue;
                        }
                        if (var461 == 4006) {
                            var6 -= 5;
                            int var96 = class30.field448[var6];
                            int var97 = class30.field448[var6 + 2];
                            int var98 = class30.field448[var6 + 1];
                            int var99 = class30.field448[var6 + 4];
                            int var100 = class30.field448[var6 + 3];
                            class30.field448[var6++] = (var98 - var96) * (var99 - var97) / (var100 - var97) + var96;
                            continue;
                        }
                        if (var461 == 4007) {
                            var6 -= 2;
                            long var101 = (long) class30.field448[var6 + 1];
                            long var103 = (long) class30.field448[var6];
                            class30.field448[var6++] = (int) (var101 * var103 / 100L + var103);
                            continue;
                        }
                        if (var461 == 4008) {
                            var6 -= 2;
                            int var105 = class30.field448[var6 + 1];
                            int var106 = class30.field448[var6];
                            class30.field448[var6++] = class75.method528(0x1 << var105, var106);
                            continue;
                        }
                        if (var461 == 4009) {
                            var6 -= 2;
                            int var107 = class30.field448[var6];
                            int var108 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class135.method899(var107, -(0x1 << var108) - 1);
                            continue;
                        }
                        if (var461 == 4010) {
                            var6 -= 2;
                            int var109 = class30.field448[var6];
                            int var110 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class135.method899(var109, 0x1 << var110) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var461 == 4011) {
                            var6 -= 2;
                            int var111 = class30.field448[var6];
                            int var112 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var111 % var112;
                            continue;
                        }
                        if (var461 == 4012) {
                            var6 -= 2;
                            int var113 = class30.field448[var6];
                            int var114 = class30.field448[var6 + 1];
                            if (var113 == 0) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = (int) Math.pow((double) var113, (double) var114);
                            }
                            continue;
                        }
                        if (var461 == 4013) {
                            var6 -= 2;
                            int var115 = class30.field448[var6];
                            int var116 = class30.field448[var6 + 1];
                            if (var115 == 0) {
                                class30.field448[var6++] = 0;
                            } else if (var116 == 0) {
                                class30.field448[var6++] = Integer.MAX_VALUE;
                            } else {
                                class30.field448[var6++] = (int) Math.pow((double) var115, 1.0D / (double) var116);
                            }
                            continue;
                        }
                        if (var461 == 4014) {
                            var6 -= 2;
                            int var117 = class30.field448[var6];
                            int var118 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class135.method899(var118, var117);
                            continue;
                        }
                        if (var461 == 4015) {
                            var6 -= 2;
                            int var119 = class30.field448[var6];
                            int var120 = class30.field448[var6 + 1];
                            class30.field448[var6++] = class75.method528(var119, var120);
                            continue;
                        }
                        if (var461 == 4016) {
                            var6 -= 2;
                            int var121 = class30.field448[var6];
                            int var122 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var121 >= var122 ? var122 : var121;
                            continue;
                        }
                        if (var461 == 4017) {
                            var6 -= 2;
                            int var123 = class30.field448[var6];
                            int var124 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var123 <= var124 ? var124 : var123;
                            continue;
                        }
                        if (var461 == 4018) {
                            var6 -= 3;
                            long var125 = (long) class30.field448[var6];
                            long var127 = (long) class30.field448[var6 + 1];
                            long var129 = (long) class30.field448[var6 + 2];
                            class30.field448[var6++] = (int) (var125 * var129 / var127);
                            continue;
                        }
                    } else if (var461 < 4200) {
                        if (var461 == 4100) {
                            var6--;
                            int var131 = class30.field448[var6];
                            var8--;
                            class85 var132 = class97.field1761[var8];
                            class97.field1761[var8++] = class172.method1150(new class85[] { var132, class68.method451(var131, -12572) }, 0);
                            continue;
                        }
                        if (var461 == 4101) {
                            var8 -= 2;
                            class85 var133 = class97.field1761[var8 + 1];
                            class85 var134 = class97.field1761[var8];
                            class97.field1761[var8++] = class172.method1150(new class85[] { var134, var133 }, 0);
                            continue;
                        }
                        if (var461 == 4102) {
                            var8--;
                            class85 var135 = class97.field1761[var8];
                            var6--;
                            int var136 = class30.field448[var6];
                            class97.field1761[var8++] = class172.method1150(new class85[] { var135, class199.method1356(true, var136, -102) }, 0);
                            continue;
                        }
                        if (var461 == 4103) {
                            var8--;
                            class85 var137 = class97.field1761[var8];
                            class97.field1761[var8++] = var137.method633(90);
                            continue;
                        }
                        if (var461 == 4104) {
                            var6--;
                            int var138 = class30.field448[var6];
                            long var139 = ((long) var138 + 11745L) * 86400000L;
                            class6.field73.setTime(new Date(var139));
                            int var141 = class6.field73.get(5);
                            int var142 = class6.field73.get(2);
                            int var143 = class6.field73.get(1);
                            class97.field1761[var8++] = class172.method1150(new class85[] { class68.method451(var141, -12572), class247.field4250, class133.field2330[var142], class247.field4250, class68.method451(var143, -12572) }, 0);
                            continue;
                        }
                        if (var461 == 4105) {
                            var8 -= 2;
                            class85 var144 = class97.field1761[var8 + 1];
                            class85 var145 = class97.field1761[var8];
                            if (class22.field308.field796 != null && class22.field308.field796.field3079) {
                                class97.field1761[var8++] = var144;
                                continue;
                            }
                            class97.field1761[var8++] = var145;
                            continue;
                        }
                        if (var461 == 4106) {
                            var6--;
                            int var146 = class30.field448[var6];
                            class97.field1761[var8++] = class68.method451(var146, -12572);
                            continue;
                        }
                        if (var461 == 4107) {
                            var8 -= 2;
                            class30.field448[var6++] = class97.field1761[var8].method581((byte) 20, class97.field1761[var8 + 1]);
                            continue;
                        }
                        if (var461 == 4108) {
                            var8--;
                            class85 var147 = class97.field1761[var8];
                            var6 -= 2;
                            int var148 = class30.field448[var6];
                            int var149 = class30.field448[var6 + 1];
                            byte[] var150 = class2.field19.method464(-1, var149, 0);
                            class138 var151 = new class138(var150);
                            var151.method80(class45.field798, (int[]) null);
                            class30.field448[var6++] = var151.method76(var147, var148);
                            continue;
                        }
                        if (var461 == 4109) {
                            var6 -= 2;
                            int var152 = class30.field448[var6 + 1];
                            int var153 = class30.field448[var6];
                            var8--;
                            class85 var154 = class97.field1761[var8];
                            byte[] var155 = class2.field19.method464(-1, var152, 0);
                            class138 var156 = new class138(var155);
                            var156.method80(class45.field798, (int[]) null);
                            class30.field448[var6++] = var156.method73(var154, var153);
                            continue;
                        }
                        if (var461 == 4110) {
                            var8 -= 2;
                            class85 var157 = class97.field1761[var8];
                            class85 var158 = class97.field1761[var8 + 1];
                            var6--;
                            if (class30.field448[var6] == 1) {
                                class97.field1761[var8++] = var157;
                            } else {
                                class97.field1761[var8++] = var158;
                            }
                            continue;
                        }
                        if (var461 == 4111) {
                            var8--;
                            class85 var159 = class97.field1761[var8];
                            class97.field1761[var8++] = class10.method60(var159);
                            continue;
                        }
                        if (var461 == 4112) {
                            var6--;
                            int var160 = class30.field448[var6];
                            var8--;
                            class85 var161 = class97.field1761[var8];
                            if (var160 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class97.field1761[var8++] = var161.method621(true, var160);
                            continue;
                        }
                        if (var461 == 4113) {
                            var6--;
                            int var162 = class30.field448[var6];
                            class30.field448[var6++] = method1739((byte) -123, var162) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4114) {
                            var6--;
                            int var163 = class30.field448[var6];
                            class30.field448[var6++] = class15.method109(-12671, var163) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4115) {
                            var6--;
                            int var164 = class30.field448[var6];
                            class30.field448[var6++] = class233.method1563(var164, 11110) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4116) {
                            var6--;
                            int var165 = class30.field448[var6];
                            class30.field448[var6++] = class196.method1342(var165, 48) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4117) {
                            var8--;
                            class85 var166 = class97.field1761[var8];
                            if (var166 == null) {
                                class30.field448[var6++] = 0;
                            } else {
                                class30.field448[var6++] = var166.method586(true);
                            }
                            continue;
                        }
                        if (var461 == 4118) {
                            var6 -= 2;
                            int var167 = class30.field448[var6];
                            var8--;
                            class85 var168 = class97.field1761[var8];
                            int var169 = class30.field448[var6 + 1];
                            class97.field1761[var8++] = var168.method636(var169, var167, true);
                            continue;
                        }
                        if (var461 == 4119) {
                            var8--;
                            class85 var170 = class97.field1761[var8];
                            class85 var171 = class58.method392(var170.method586(true), (byte) -28);
                            boolean var172 = false;
                            for (int var173 = 0; var173 < var170.method586(true); var173++) {
                                int var174 = var170.method615(true, var173);
                                if (var174 == 60) {
                                    var172 = true;
                                } else if (var174 == 62) {
                                    var172 = false;
                                } else if (!var172) {
                                    var171.method594(false, var174);
                                }
                            }
                            var171.method609(-127);
                            class97.field1761[var8++] = var171;
                            continue;
                        }
                        if (var461 == 4120) {
                            var6 -= 2;
                            var8--;
                            class85 var175 = class97.field1761[var8];
                            int var176 = class30.field448[var6];
                            int var177 = class30.field448[var6 + 1];
                            class30.field448[var6++] = var175.method610(var177, -25380, var176);
                            continue;
                        }
                        if (var461 == 4121) {
                            var8 -= 2;
                            class85 var178 = class97.field1761[var8];
                            class85 var179 = class97.field1761[var8 + 1];
                            var6--;
                            int var180 = class30.field448[var6];
                            class30.field448[var6++] = var178.method634(var180, var179, (byte) -103);
                            continue;
                        }
                        if (var461 == 4122) {
                            var6--;
                            int var181 = class30.field448[var6];
                            class30.field448[var6++] = class50.method334(-27106, var181);
                            continue;
                        }
                        if (var461 == 4123) {
                            var6--;
                            int var182 = class30.field448[var6];
                            class30.field448[var6++] = class119.method826(var182, -34);
                            continue;
                        }
                    } else if (var461 < 4300) {
                        if (var461 == 4200) {
                            var6--;
                            int var316 = class30.field448[var6];
                            class97.field1761[var8++] = class32.method221(11649, var316).field1106;
                            continue;
                        }
                        if (var461 == 4201) {
                            var6 -= 2;
                            int var317 = class30.field448[var6 + 1];
                            int var318 = class30.field448[var6];
                            class61 var319 = class32.method221(11649, var318);
                            if (var317 >= 1 && var317 <= 5 && var319.field1151[var317 - 1] != null) {
                                class97.field1761[var8++] = var319.field1151[var317 - 1];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 4202) {
                            var6 -= 2;
                            int var320 = class30.field448[var6];
                            int var321 = class30.field448[var6 + 1];
                            class61 var322 = class32.method221(11649, var320);
                            if (var321 >= 1 && var321 <= 5 && var322.field1127[var321 - 1] != null) {
                                class97.field1761[var8++] = var322.field1127[var321 - 1];
                                continue;
                            }
                            class97.field1761[var8++] = class82.field1501;
                            continue;
                        }
                        if (var461 == 4203) {
                            var6--;
                            int var323 = class30.field448[var6];
                            class30.field448[var6++] = class32.method221(11649, var323).field1137;
                            continue;
                        }
                        if (var461 == 4204) {
                            var6--;
                            int var324 = class30.field448[var6];
                            class30.field448[var6++] = class32.method221(11649, var324).field1158 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4205) {
                            var6--;
                            int var325 = class30.field448[var6];
                            class61 var326 = class32.method221(11649, var325);
                            if (var326.field1133 == -1 && var326.field1123 >= 0) {
                                class30.field448[var6++] = var326.field1123;
                                continue;
                            }
                            class30.field448[var6++] = var325;
                            continue;
                        }
                        if (var461 == 4206) {
                            var6--;
                            int var327 = class30.field448[var6];
                            class61 var328 = class32.method221(11649, var327);
                            if (var328.field1133 >= 0 && var328.field1123 >= 0) {
                                class30.field448[var6++] = var328.field1123;
                                continue;
                            }
                            class30.field448[var6++] = var327;
                            continue;
                        }
                        if (var461 == 4207) {
                            var6--;
                            int var329 = class30.field448[var6];
                            class30.field448[var6++] = class32.method221(11649, var329).field1152 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4208) {
                            var6 -= 2;
                            int var330 = class30.field448[var6];
                            int var331 = class30.field448[var6 + 1];
                            class240 var332 = class239.method1627(var331, 47);
                            if (var332.method1638(-112)) {
                                class97.field1761[var8++] = class32.method221(11649, var330).method403(var332.field4134, var331, 115);
                            } else {
                                class30.field448[var6++] = class32.method221(11649, var330).method401(var331, var332.field4147, (byte) -8);
                            }
                            continue;
                        }
                        if (var461 == 4210) {
                            var8--;
                            class85 var333 = class97.field1761[var8];
                            var6--;
                            int var334 = class30.field448[var6];
                            class27.method191(0, var334 == 1, var333);
                            class30.field448[var6++] = class151.field2550;
                            continue;
                        }
                        if (var461 == 4211) {
                            if (class247.field4221 != null && class200.field3484 < class151.field2550) {
                                class30.field448[var6++] = class135.method899(65535, class247.field4221[class200.field3484++]);
                                continue;
                            }
                            class30.field448[var6++] = -1;
                            continue;
                        }
                        if (var461 == 4212) {
                            class200.field3484 = 0;
                            continue;
                        }
                    } else if (var461 < 4400) {
                        if (var461 == 4300) {
                            var6 -= 2;
                            int var306 = class30.field448[var6];
                            int var307 = class30.field448[var6 + 1];
                            class240 var308 = class239.method1627(var307, 113);
                            if (var308.method1638(71)) {
                                class97.field1761[var8++] = class55.method370(true, var306).method1805((byte) -79, var308.field4134, var307);
                            } else {
                                class30.field448[var6++] = class55.method370(true, var306).method1802(var308.field4147, var307, -104);
                            }
                            continue;
                        }
                        if (var461 == 4301) {
                            var6--;
                            int var309 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var309).field4666;
                            continue;
                        }
                        if (var461 == 4302) {
                            var6--;
                            int var310 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var310).field4678;
                            continue;
                        }
                        if (var461 == 4303) {
                            var6--;
                            int var311 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var311).field4661;
                            continue;
                        }
                        if (var461 == 4304) {
                            var6--;
                            int var312 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var312).field4712;
                            continue;
                        }
                        if (var461 == 4305) {
                            var6--;
                            int var313 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var313).field4711;
                            continue;
                        }
                        if (var461 == 4306) {
                            var6--;
                            int var314 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var314).field4676;
                            continue;
                        }
                        if (var461 == 4307) {
                            var6--;
                            int var315 = class30.field448[var6];
                            class30.field448[var6++] = class55.method370(true, var315).field4681;
                            continue;
                        }
                    } else if (var461 < 4500) {
                        if (var461 == 4400) {
                            var6 -= 2;
                            int var183 = class30.field448[var6 + 1];
                            int var184 = class30.field448[var6];
                            class240 var185 = class239.method1627(var183, 85);
                            if (var185.method1638(-124)) {
                                class97.field1761[var8++] = class110.method753(var184, (byte) -19).method1353(var183, var185.field4134, 0);
                            } else {
                                class30.field448[var6++] = class110.method753(var184, (byte) -127).method1367(var185.field4147, var183, (byte) 37);
                            }
                            continue;
                        }
                    } else if (var461 >= 4600) {
                        if (var461 < 5100) {
                            if (var461 == 5000) {
                                class30.field448[var6++] = class242.field4158;
                                continue;
                            }
                            if (var461 == 5001) {
                                class262.field4631++;
                                var6 -= 3;
                                class242.field4158 = class30.field448[var6];
                                class175.field3003 = class30.field448[var6 + 1];
                                class260.field4596 = class30.field448[var6 + 2];
                                class207.field3618.method483(-24260, 221);
                                class207.field3618.method1714(class242.field4158, -714043120);
                                class207.field3618.method1714(class175.field3003, -714043120);
                                class207.field3618.method1714(class260.field4596, -714043120);
                                continue;
                            }
                            if (var461 == 5002) {
                                var6 -= 2;
                                class121.field2133++;
                                int var240 = class30.field448[var6];
                                var8--;
                                class85 var241 = class97.field1761[var8];
                                int var242 = class30.field448[var6 + 1];
                                class207.field3618.method483(-24260, 92);
                                class207.field3618.method1674((byte) 101, var241.method624(false));
                                class207.field3618.method1714(var240 - 1, -714043120);
                                class207.field3618.method1714(var242, -714043120);
                                continue;
                            }
                            if (var461 == 5003) {
                                var6--;
                                int var243 = class30.field448[var6];
                                class85 var244 = null;
                                if (var243 < 100) {
                                    var244 = class256.field4560[var243];
                                }
                                if (var244 == null) {
                                    var244 = class82.field1501;
                                }
                                class97.field1761[var8++] = var244;
                                continue;
                            }
                            if (var461 == 5004) {
                                var6--;
                                int var245 = class30.field448[var6];
                                int var246 = -1;
                                if (var245 < 100 && class256.field4560[var245] != null) {
                                    var246 = class116.field2074[var245];
                                }
                                class30.field448[var6++] = var246;
                                continue;
                            }
                            if (var461 == 5005) {
                                class30.field448[var6++] = class175.field3003;
                                continue;
                            }
                            if (var461 == 5008) {
                                var8--;
                                class85 var247 = class97.field1761[var8];
                                if (var247.method619(class2.field18, (byte) 74)) {
                                    class78.method538(var247, (byte) -87);
                                    continue;
                                }
                                if (class63.field1174 == 0 && (class98.field1766 == 1 || class169.field2916 == 1)) {
                                    continue;
                                }
                                class55.field966++;
                                class85 var248 = var247.method633(90);
                                byte var249 = 0;
                                if (var248.method619(class116.field2070, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class116.field2070.method586(true));
                                    var249 = 0;
                                } else if (var248.method619(class232.field4016, (byte) 74)) {
                                    var249 = 1;
                                    var247 = var247.method611((byte) -97, class232.field4016.method586(true));
                                } else if (var248.method619(class90.field1665, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class90.field1665.method586(true));
                                    var249 = 2;
                                } else if (var248.method619(class65.field1197, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class65.field1197.method586(true));
                                    var249 = 3;
                                } else if (var248.method619(client.field2564, (byte) 74)) {
                                    var249 = 4;
                                    var247 = var247.method611((byte) -97, client.field2564.method586(true));
                                } else if (var248.method619(class57.field995, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class57.field995.method586(true));
                                    var249 = 5;
                                } else if (var248.method619(class95.field1740, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class95.field1740.method586(true));
                                    var249 = 6;
                                } else if (var248.method619(class264.field4722, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class264.field4722.method586(true));
                                    var249 = 7;
                                } else if (var248.method619(class234.field4057, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class234.field4057.method586(true));
                                    var249 = 8;
                                } else if (var248.method619(class94.field1723, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class94.field1723.method586(true));
                                    var249 = 9;
                                } else if (var248.method619(class130.field2278, (byte) 74)) {
                                    var249 = 10;
                                    var247 = var247.method611((byte) -97, class130.field2278.method586(true));
                                } else if (var248.method619(class102.field1809, (byte) 74)) {
                                    var249 = 11;
                                    var247 = var247.method611((byte) -97, class102.field1809.method586(true));
                                } else if (class128.field2249 != 0) {
                                    if (var248.method619(class116.field2084, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class116.field2084.method586(true));
                                        var249 = 0;
                                    } else if (var248.method619(class232.field4015, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class232.field4015.method586(true));
                                        var249 = 1;
                                    } else if (var248.method619(class90.field1662, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class90.field1662.method586(true));
                                        var249 = 2;
                                    } else if (var248.method619(class65.field1188, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class65.field1188.method586(true));
                                        var249 = 3;
                                    } else if (var248.method619(client.field2566, (byte) 74)) {
                                        var249 = 4;
                                        var247 = var247.method611((byte) -97, client.field2566.method586(true));
                                    } else if (var248.method619(class57.field997, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class57.field997.method586(true));
                                        var249 = 5;
                                    } else if (var248.method619(class95.field1733, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class95.field1733.method586(true));
                                        var249 = 6;
                                    } else if (var248.method619(class264.field4723, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class264.field4723.method586(true));
                                        var249 = 7;
                                    } else if (var248.method619(class234.field4058, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class234.field4058.method586(true));
                                        var249 = 8;
                                    } else if (var248.method619(class94.field1716, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class94.field1716.method586(true));
                                        var249 = 9;
                                    } else if (var248.method619(class130.field2274, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class130.field2274.method586(true));
                                        var249 = 10;
                                    } else if (var248.method619(class102.field1816, (byte) 74)) {
                                        var249 = 11;
                                        var247 = var247.method611((byte) -97, class102.field1816.method586(true));
                                    }
                                }
                                class85 var250 = var247.method633(90);
                                byte var251 = 0;
                                if (var250.method619(class15.field228, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class15.field228.method586(true));
                                    var251 = 1;
                                } else if (var250.method619(class38.field585, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class38.field585.method586(true));
                                    var251 = 2;
                                } else if (var250.method619(class22.field318, (byte) 74)) {
                                    var251 = 3;
                                    var247 = var247.method611((byte) -97, class22.field318.method586(true));
                                } else if (var250.method619(class171.field2959, (byte) 74)) {
                                    var247 = var247.method611((byte) -97, class171.field2959.method586(true));
                                    var251 = 4;
                                } else if (var250.method619(class37.field570, (byte) 74)) {
                                    var251 = 5;
                                    var247 = var247.method611((byte) -97, class37.field570.method586(true));
                                } else if (class128.field2249 != 0) {
                                    if (var250.method619(class15.field224, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class15.field224.method586(true));
                                        var251 = 1;
                                    } else if (var250.method619(class38.field595, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class38.field595.method586(true));
                                        var251 = 2;
                                    } else if (var250.method619(class22.field314, (byte) 74)) {
                                        var251 = 3;
                                        var247 = var247.method611((byte) -97, class22.field314.method586(true));
                                    } else if (var250.method619(class171.field2960, (byte) 74)) {
                                        var247 = var247.method611((byte) -97, class171.field2960.method586(true));
                                        var251 = 4;
                                    } else if (var250.method619(class37.field573, (byte) 74)) {
                                        var251 = 5;
                                        var247 = var247.method611((byte) -97, class37.field573.method586(true));
                                    }
                                }
                                class207.field3618.method483(-24260, 171);
                                class207.field3618.method1714(0, -714043120);
                                int var252 = class207.field3618.field4224;
                                class207.field3618.method1714(var249, -714043120);
                                class207.field3618.method1714(var251, -714043120);
                                class50.method336(var247, class207.field3618, (byte) 111);
                                class207.field3618.method1693(class207.field3618.field4224 - var252, -1);
                                continue;
                            }
                            if (var461 == 5009) {
                                var8 -= 2;
                                class85 var253 = class97.field1761[var8 + 1];
                                class85 var254 = class97.field1761[var8];
                                if (class63.field1174 != 0 || class98.field1766 != 1 && class169.field2916 != 1) {
                                    class207.field3618.method483(-24260, 210);
                                    class207.field3618.method1714(0, -714043120);
                                    int var255 = class207.field3618.field4224;
                                    class207.field3618.method1674((byte) 101, var254.method624(false));
                                    class159.field2720++;
                                    class50.method336(var253, class207.field3618, (byte) 90);
                                    class207.field3618.method1693(class207.field3618.field4224 - var255, -1);
                                }
                                continue;
                            }
                            if (var461 == 5010) {
                                var6--;
                                int var256 = class30.field448[var6];
                                class85 var257 = null;
                                if (var256 < 100) {
                                    var257 = class233.field4024[var256];
                                }
                                if (var257 == null) {
                                    var257 = class82.field1501;
                                }
                                class97.field1761[var8++] = var257;
                                continue;
                            }
                            if (var461 == 5011) {
                                class85 var258 = null;
                                var6--;
                                int var259 = class30.field448[var6];
                                if (var259 < 100) {
                                    var258 = class24.field355[var259];
                                }
                                if (var258 == null) {
                                    var258 = class82.field1501;
                                }
                                class97.field1761[var8++] = var258;
                                continue;
                            }
                            if (var461 == 5012) {
                                var6--;
                                int var260 = class30.field448[var6];
                                int var261 = -1;
                                if (var260 < 100) {
                                    var261 = class261.field4610[var260];
                                }
                                class30.field448[var6++] = var261;
                                continue;
                            }
                            if (var461 == 5015) {
                                class85 var262;
                                if (class22.field308 == null || class22.field308.field762 == null) {
                                    var262 = class100.field1796;
                                } else {
                                    var262 = class22.field308.method308(0);
                                }
                                class97.field1761[var8++] = var262;
                                continue;
                            }
                            if (var461 == 5016) {
                                class30.field448[var6++] = class260.field4596;
                                continue;
                            }
                            if (var461 == 5017) {
                                class30.field448[var6++] = class213.field3750;
                                continue;
                            }
                            if (var461 == 5050) {
                                var6--;
                                int var263 = class30.field448[var6];
                                class97.field1761[var8++] = class70.method485(var263, (byte) -11).field2515;
                                continue;
                            }
                            if (var461 == 5051) {
                                var6--;
                                int var264 = class30.field448[var6];
                                class148 var265 = class70.method485(var264, (byte) -126);
                                if (var265.field2514 == null) {
                                    class30.field448[var6++] = 0;
                                } else {
                                    class30.field448[var6++] = var265.field2514.length;
                                }
                                continue;
                            }
                            if (var461 == 5052) {
                                var6 -= 2;
                                int var266 = class30.field448[var6 + 1];
                                int var267 = class30.field448[var6];
                                class148 var268 = class70.method485(var267, (byte) 124);
                                int var269 = var268.field2514[var266];
                                class30.field448[var6++] = var269;
                                continue;
                            }
                            if (var461 == 5053) {
                                var6--;
                                int var270 = class30.field448[var6];
                                class148 var271 = class70.method485(var270, (byte) 125);
                                if (var271.field2502 == null) {
                                    class30.field448[var6++] = 0;
                                } else {
                                    class30.field448[var6++] = var271.field2502.length;
                                }
                                continue;
                            }
                            if (var461 == 5054) {
                                var6 -= 2;
                                int var272 = class30.field448[var6];
                                int var273 = class30.field448[var6 + 1];
                                class30.field448[var6++] = class70.method485(var272, (byte) -105).field2502[var273];
                                continue;
                            }
                            if (var461 == 5055) {
                                var6--;
                                int var274 = class30.field448[var6];
                                class97.field1761[var8++] = class242.method1640(var274, 6).method1081(true);
                                continue;
                            }
                            if (var461 == 5056) {
                                var6--;
                                int var275 = class30.field448[var6];
                                class163 var276 = class242.method1640(var275, 124);
                                if (var276.field2810 == null) {
                                    class30.field448[var6++] = 0;
                                } else {
                                    class30.field448[var6++] = var276.field2810.length;
                                }
                                continue;
                            }
                            if (var461 == 5057) {
                                var6 -= 2;
                                int var277 = class30.field448[var6];
                                int var278 = class30.field448[var6 + 1];
                                class30.field448[var6++] = class242.method1640(var277, 122).field2810[var278];
                                continue;
                            }
                            if (var461 == 5058) {
                                class204.field3567 = new class50();
                                var6--;
                                class204.field3567.field876 = class30.field448[var6];
                                class204.field3567.field885 = class242.method1640(class204.field3567.field876, -33);
                                class204.field3567.field874 = new int[class204.field3567.field885.method1074((byte) 52)];
                                continue;
                            }
                            if (var461 == 5059) {
                                class207.field3618.method483(-24260, 124);
                                class206.field3593++;
                                class207.field3618.method1714(0, -714043120);
                                int var279 = class207.field3618.field4224;
                                class207.field3618.method1714(0, -714043120);
                                class207.field3618.method1703(class204.field3567.field876, -88);
                                class204.field3567.field885.method1075(class207.field3618, 0, class204.field3567.field874);
                                class207.field3618.method1693(class207.field3618.field4224 - var279, -1);
                                continue;
                            }
                            if (var461 == 5060) {
                                class140.field2418++;
                                var8--;
                                class85 var280 = class97.field1761[var8];
                                class207.field3618.method483(-24260, 62);
                                class207.field3618.method1714(0, -714043120);
                                int var281 = class207.field3618.field4224;
                                class207.field3618.method1674((byte) 101, var280.method624(false));
                                class207.field3618.method1703(class204.field3567.field876, -121);
                                class204.field3567.field885.method1075(class207.field3618, 0, class204.field3567.field874);
                                class207.field3618.method1693(class207.field3618.field4224 - var281, -1);
                                continue;
                            }
                            if (var461 == 5061) {
                                class207.field3618.method483(-24260, 124);
                                class206.field3593++;
                                class207.field3618.method1714(0, -714043120);
                                int var282 = class207.field3618.field4224;
                                class207.field3618.method1714(1, -714043120);
                                class207.field3618.method1703(class204.field3567.field876, -117);
                                class204.field3567.field885.method1075(class207.field3618, 0, class204.field3567.field874);
                                class207.field3618.method1693(class207.field3618.field4224 - var282, -1);
                                continue;
                            }
                            if (var461 == 5062) {
                                var6 -= 2;
                                int var283 = class30.field448[var6];
                                int var284 = class30.field448[var6 + 1];
                                class30.field448[var6++] = class70.method485(var283, (byte) 125).field2508[var284];
                                continue;
                            }
                            if (var461 == 5063) {
                                var6 -= 2;
                                int var285 = class30.field448[var6];
                                int var286 = class30.field448[var6 + 1];
                                class30.field448[var6++] = class70.method485(var285, (byte) -62).field2513[var286];
                                continue;
                            }
                            if (var461 == 5064) {
                                var6 -= 2;
                                int var287 = class30.field448[var6];
                                int var288 = class30.field448[var6 + 1];
                                if (var288 == -1) {
                                    class30.field448[var6++] = -1;
                                } else {
                                    class30.field448[var6++] = class70.method485(var287, (byte) -94).method971(var288, (byte) -125);
                                }
                                continue;
                            }
                            if (var461 == 5065) {
                                var6 -= 2;
                                int var289 = class30.field448[var6 + 1];
                                int var290 = class30.field448[var6];
                                if (var289 == -1) {
                                    class30.field448[var6++] = -1;
                                } else {
                                    class30.field448[var6++] = class70.method485(var290, (byte) -41).method973((byte) -123, var289);
                                }
                                continue;
                            }
                            if (var461 == 5066) {
                                var6--;
                                int var291 = class30.field448[var6];
                                class30.field448[var6++] = class242.method1640(var291, 124).method1074((byte) 52);
                                continue;
                            }
                            if (var461 == 5067) {
                                var6 -= 2;
                                int var292 = class30.field448[var6];
                                int var293 = class30.field448[var6 + 1];
                                int var294 = class242.method1640(var292, -42).method1078(-92, var293);
                                class30.field448[var6++] = var294;
                                continue;
                            }
                            if (var461 == 5068) {
                                var6 -= 2;
                                int var295 = class30.field448[var6];
                                int var296 = class30.field448[var6 + 1];
                                class204.field3567.field874[var295] = var296;
                                continue;
                            }
                            if (var461 == 5069) {
                                var6 -= 2;
                                int var297 = class30.field448[var6 + 1];
                                int var298 = class30.field448[var6];
                                class204.field3567.field874[var298] = var297;
                                continue;
                            }
                            if (var461 == 5070) {
                                var6 -= 3;
                                int var299 = class30.field448[var6 + 1];
                                int var300 = class30.field448[var6 + 2];
                                int var301 = class30.field448[var6];
                                class163 var302 = class242.method1640(var301, -113);
                                if (var302.method1078(-35, var299) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class30.field448[var6++] = var302.method1071(var299, 7655, var300);
                                continue;
                            }
                        } else if (var461 < 5200) {
                            if (var461 == 5100) {
                                if (class105.field1843[86]) {
                                    class30.field448[var6++] = 1;
                                } else {
                                    class30.field448[var6++] = 0;
                                }
                                continue;
                            }
                            if (var461 == 5101) {
                                if (class105.field1843[82]) {
                                    class30.field448[var6++] = 1;
                                } else {
                                    class30.field448[var6++] = 0;
                                }
                                continue;
                            }
                            if (var461 == 5102) {
                                if (class105.field1843[81]) {
                                    class30.field448[var6++] = 1;
                                } else {
                                    class30.field448[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var461 < 5300) {
                            if (var461 == 5200) {
                                var6--;
                                class91.method663((byte) -100, class30.field448[var6]);
                                continue;
                            }
                            if (var461 == 5201) {
                                class30.field448[var6++] = class128.method867(100);
                                continue;
                            }
                            if (var461 == 5202) {
                                var6--;
                                class175.method1187((byte) 30, class30.field448[var6]);
                                continue;
                            }
                            if (var461 == 5203) {
                                var8--;
                                class273.method1861((byte) 84, class97.field1761[var8]);
                                continue;
                            }
                            if (var461 == 5204) {
                                class97.field1761[var8 - 1] = class119.method828(true, class97.field1761[var8 - 1]);
                                continue;
                            }
                            if (var461 == 5205) {
                                var8--;
                                class104.method722(class97.field1761[var8], -59);
                                continue;
                            }
                            if (var461 == 5206) {
                                var6--;
                                int var186 = class30.field448[var6];
                                class82 var187 = class175.method1183((var186 & 0xFFFF427) >> 14, var186 & 0x3FFF, false);
                                if (var187 == null) {
                                    class97.field1761[var8++] = class82.field1501;
                                } else {
                                    class97.field1761[var8++] = var187.field1488;
                                }
                                continue;
                            }
                            if (var461 == 5207) {
                                var8--;
                                class82 var188 = class20.method141(class97.field1761[var8], -38);
                                if (var188 != null && var188.field1486 != null) {
                                    class97.field1761[var8++] = var188.field1486;
                                    continue;
                                }
                                class97.field1761[var8++] = class82.field1501;
                                continue;
                            }
                        } else if (var461 >= 5400) {
                            if (var461 < 5500) {
                                if (var461 == 5400) {
                                    class202.field3516++;
                                    var8 -= 2;
                                    class85 var189 = class97.field1761[var8];
                                    class85 var190 = class97.field1761[var8 + 1];
                                    var6--;
                                    int var191 = class30.field448[var6];
                                    class207.field3618.method483(-24260, 77);
                                    class207.field3618.method1714(class66.method442((byte) -34, var189) + class66.method442((byte) -34, var190) + 1, -714043120);
                                    class207.field3618.method1698((byte) -72, var189);
                                    class207.field3618.method1698((byte) -72, var190);
                                    class207.field3618.method1714(var191, -714043120);
                                    continue;
                                }
                                if (var461 == 5401) {
                                    var6 -= 2;
                                    class27.field414[class30.field448[var6]] = (short) class23.method158(class30.field448[var6 + 1], 3609);
                                    class91.method665((byte) 91);
                                    class111.method758((byte) -89);
                                    class140.method921((byte) -89);
                                    client.method999(-111);
                                    class78.method545(-13203);
                                    continue;
                                }
                                if (var461 == 5405) {
                                    var6 -= 2;
                                    int var192 = class30.field448[var6];
                                    int var193 = class30.field448[var6 + 1];
                                    if (var192 >= 0 && var192 < 2) {
                                        class240.field4132[var192] = new int[var193 << 1][4];
                                    }
                                    continue;
                                }
                                if (var461 == 5406) {
                                    var6 -= 7;
                                    int var194 = class30.field448[var6];
                                    int var195 = class30.field448[var6 + 2];
                                    int var196 = class30.field448[var6 + 1] << 1;
                                    int var197 = class30.field448[var6 + 4];
                                    int var198 = class30.field448[var6 + 3];
                                    int var199 = class30.field448[var6 + 6];
                                    int var200 = class30.field448[var6 + 5];
                                    if (var194 >= 0 && var194 < 2 && class240.field4132[var194] != null && var196 >= 0 && class240.field4132[var194].length > var196) {
                                        class240.field4132[var194][var196] = new int[] { (class135.method899(var195, 268433693) >> 14) * 128, var198, class135.method899(16383, var195) * 128, var199 };
                                        class240.field4132[var194][var196 + 1] = new int[] { (class135.method899(268422005, var197) >> 14) * 128, var200, class135.method899(var197, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var461 == 5407) {
                                    var6--;
                                    int var201 = class240.field4132[class30.field448[var6]].length >> 1;
                                    class30.field448[var6++] = var201;
                                    continue;
                                }
                                if (var461 == 5408) {
                                    class30.field448[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 5409) {
                                    class13.method103(8);
                                    continue;
                                }
                                if (var461 == 5411) {
                                    if (class167.field2882 == null) {
                                        class175.method1179(false, class221.method1502((byte) -114), -1);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var461 == 5419) {
                                    class85 var202 = class82.field1501;
                                    if (class181.field3099 != null) {
                                        var202 = class150.method977((byte) 125, class181.field3099.field1295);
                                        try {
                                            if (class181.field3099.field1292 != null) {
                                                byte[] var203 = ((String) class181.field3099.field1292).getBytes("ISO-8859-1");
                                                var202 = class116.method817(var203.length, var203, (byte) -39, 0);
                                            }
                                        } catch (UnsupportedEncodingException var459) {
                                        }
                                    }
                                    class97.field1761[var8++] = var202;
                                    continue;
                                }
                                if (var461 == 5420) {
                                    class30.field448[var6++] = class246.field4205 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 5421) {
                                    var8--;
                                    class85 var204 = class97.field1761[var8];
                                    var6--;
                                    boolean var205 = class30.field448[var6] == 1;
                                    class85 var206 = class172.method1150(new class85[] { class221.method1502((byte) -85), var204 }, 0);
                                    if (class167.field2882 == null && (!var205 || class246.field4205 == 2 || !class81.field1472.startsWith("win") || class223.field3912)) {
                                        class175.method1179(var205, var206, -1);
                                        continue;
                                    }
                                    class83.field1514 = var205;
                                    class115.field2063 = var206;
                                    class49.field869 = class107.field1882.method557(new String(var206.method588(17473), "ISO-8859-1"), 106);
                                    continue;
                                }
                                if (var461 == 5422) {
                                    var8 -= 2;
                                    class85 var207 = class97.field1761[var8];
                                    var6--;
                                    int var208 = class30.field448[var6];
                                    class85 var209 = class97.field1761[var8 + 1];
                                    if (var207.method586(true) > 0) {
                                        if (class231.field3990 == null) {
                                            class231.field3990 = new class85[class178.field3055[class18.field267]];
                                        }
                                        class231.field3990[var208] = var207;
                                    }
                                    if (var209.method586(true) > 0) {
                                        if (class153.field2610 == null) {
                                            class153.field2610 = new class85[class178.field3055[class18.field267]];
                                        }
                                        class153.field2610[var208] = var209;
                                    }
                                    continue;
                                }
                            } else if (var461 < 5600) {
                                if (var461 == 5500) {
                                    var6 -= 4;
                                    int var228 = class30.field448[var6];
                                    int var229 = class30.field448[var6 + 1];
                                    int var230 = class30.field448[var6 + 2];
                                    int var231 = class30.field448[var6 + 3];
                                    class6.method28((var228 & 0x3FFF) - class213.field3742, var229, (var228 >> 14 & 0x3FFF) - class244.field4172, var230, 124, false, var231);
                                    continue;
                                }
                                if (var461 == 5501) {
                                    var6 -= 4;
                                    int var232 = class30.field448[var6];
                                    int var233 = class30.field448[var6 + 1];
                                    int var234 = class30.field448[var6 + 3];
                                    int var235 = class30.field448[var6 + 2];
                                    class190.method1305(var234, (byte) -111, (var232 >> 14 & 0x3FFF) - class244.field4172, (var232 & 0x3FFF) + -class213.field3742, var235, var233);
                                    continue;
                                }
                                if (var461 == 5502) {
                                    var6 -= 6;
                                    int var236 = class30.field448[var6];
                                    if (var236 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class146.field2491 = var236;
                                    int var237 = class30.field448[var6 + 1];
                                    if (class240.field4132[class146.field2491].length >> 1 <= var237 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class61.field1144 = 0;
                                    class56.field980 = var237;
                                    class45.field797 = class30.field448[var6 + 2];
                                    class56.field988 = class30.field448[var6 + 3];
                                    int var238 = class30.field448[var6 + 4];
                                    if (var238 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class154.field2663 = var238;
                                    int var239 = class30.field448[var6 + 5];
                                    if (var239 + 1 >= class240.field4132[class154.field2663].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class273.field4825 = 3;
                                    class234.field4046 = var239;
                                    continue;
                                }
                                if (var461 == 5503) {
                                    class197.method1347(false);
                                    continue;
                                }
                                if (var461 == 5504) {
                                    var6 -= 2;
                                    class199.field3413 = class30.field448[var6];
                                    class30.field450 = class30.field448[var6 + 1];
                                    class137.method909(true);
                                    continue;
                                }
                                if (var461 == 5505) {
                                    class30.field448[var6++] = class199.field3413;
                                    continue;
                                }
                                if (var461 == 5506) {
                                    class30.field448[var6++] = class30.field450;
                                    continue;
                                }
                            } else if (var461 < 5700) {
                                if (var461 == 5600) {
                                    var8 -= 2;
                                    class85 var210 = class97.field1761[var8];
                                    class85 var211 = class97.field1761[var8 + 1];
                                    var6--;
                                    int var212 = class30.field448[var6];
                                    if (class1.field4 == 10 && class254.field4383 == 0 && class115.field2056 == 0) {
                                        class177.method1194(var212, var210, var211, false);
                                    }
                                    continue;
                                }
                                if (var461 == 5601) {
                                    class186.method1280(true);
                                    continue;
                                }
                                if (var461 == 5602) {
                                    if (class254.field4383 == 0) {
                                        class205.field3580 = -2;
                                    }
                                    continue;
                                }
                                if (var461 == 5603) {
                                    var6 -= 4;
                                    if (class1.field4 == 10 && class254.field4383 == 0 && class115.field2056 == 0) {
                                        class254.method1758(class30.field448[var6 + 3], class30.field448[var6 + 1], class30.field448[var6], class30.field448[var6 + 2], 5000);
                                    }
                                    continue;
                                }
                                if (var461 == 5604) {
                                    var8--;
                                    if (class1.field4 == 10 && class254.field4383 == 0 && class115.field2056 == 0) {
                                        class182.method1253(class97.field1761[var8].method624(false), 0);
                                    }
                                    continue;
                                }
                                if (var461 == 5605) {
                                    var6 -= 4;
                                    var8 -= 2;
                                    if (class1.field4 == 10 && class254.field4383 == 0 && class115.field2056 == 0) {
                                        class167.method1125(class30.field448[var6 + 1], class30.field448[var6 + 2], class30.field448[var6], class30.field448[var6 + 3], class97.field1761[var8 + 1], (byte) -121, class97.field1761[var8].method624(false));
                                    }
                                    continue;
                                }
                                if (var461 == 5606) {
                                    if (class115.field2056 == 0) {
                                        class112.field1965 = -2;
                                    }
                                    continue;
                                }
                                if (var461 == 5607) {
                                    class30.field448[var6++] = class205.field3580;
                                    continue;
                                }
                                if (var461 == 5608) {
                                    class30.field448[var6++] = class35.field540;
                                    continue;
                                }
                                if (var461 == 5609) {
                                    class30.field448[var6++] = class112.field1965;
                                    continue;
                                }
                                if (var461 == 5610) {
                                    for (int var213 = 0; var213 < 5; var213++) {
                                        class97.field1761[var8++] = var213 < class88.field1650.length ? class88.field1650[var213].method587((byte) -123) : class82.field1501;
                                    }
                                    class88.field1650 = null;
                                    continue;
                                }
                                if (var461 == 5611) {
                                    class30.field448[var6++] = class215.field3778;
                                    continue;
                                }
                            } else if (var461 < 6100) {
                                if (var461 == 6001) {
                                    var6--;
                                    int var214 = class30.field448[var6];
                                    if (var214 < 1) {
                                        var214 = 1;
                                    }
                                    if (var214 > 4) {
                                        var214 = 4;
                                    }
                                    class3.field38 = var214;
                                    if (class3.field38 == 1) {
                                        class173.method1163(0.9F);
                                    }
                                    if (class3.field38 == 2) {
                                        class173.method1163(0.8F);
                                    }
                                    if (class3.field38 == 3) {
                                        class173.method1163(0.7F);
                                    }
                                    if (class3.field38 == 4) {
                                        class173.method1163(0.6F);
                                    }
                                    class111.method758((byte) -71);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6002) {
                                    var6--;
                                    class268.method1845(class30.field448[var6] == 1, (byte) -97);
                                    class49.method331(4096);
                                    class213.method1461((byte) -6);
                                    class124.method851(false);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6003) {
                                    var6--;
                                    class236.field4084 = class30.field448[var6] == 1;
                                    class124.method851(false);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6005) {
                                    var6--;
                                    class31.field475 = class30.field448[var6] == 1;
                                    class213.method1461((byte) -13);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6006) {
                                    var6--;
                                    class214.field3762 = class30.field448[var6] == 1;
                                    ((class122) class173.field2987).method840(!class214.field3762, 255);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6007) {
                                    var6--;
                                    class95.field1735 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6008) {
                                    var6--;
                                    class25.field396 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6009) {
                                    var6--;
                                    class180.field3093 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6010) {
                                    var6--;
                                    class273.field4826 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6011) {
                                    var6--;
                                    int var215 = class30.field448[var6];
                                    if (var215 < 0 || var215 > 2) {
                                        var215 = 0;
                                    }
                                    class11.field167 = var215;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6012) {
                                    var6--;
                                    class240.field4136 = class30.field448[var6] == 1;
                                    if (class3.field38 == 1) {
                                        class173.method1163(0.9F);
                                    }
                                    if (class3.field38 == 2) {
                                        class173.method1163(0.8F);
                                    }
                                    if (class3.field38 == 3) {
                                        class173.method1163(0.7F);
                                    }
                                    if (class3.field38 == 4) {
                                        class173.method1163(0.6F);
                                    }
                                    class213.method1461((byte) -97);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6014) {
                                    var6--;
                                    class194.field3308 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6015) {
                                    var6--;
                                    class98.field1775 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6016) {
                                    var6--;
                                    int var216 = class30.field448[var6];
                                    if (var216 < 0 || var216 > 2) {
                                        var216 = 0;
                                    }
                                    class177.field3028 = var216;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6017) {
                                    var6--;
                                    class95.field1743 = class30.field448[var6] == 1;
                                    class76.method533(40);
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6018) {
                                    var6--;
                                    int var217 = class30.field448[var6];
                                    if (var217 < 0) {
                                        var217 = 0;
                                    }
                                    if (var217 > 127) {
                                        var217 = 127;
                                    }
                                    class85.field1565 = var217;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6019) {
                                    var6--;
                                    int var218 = class30.field448[var6];
                                    if (var218 < 0) {
                                        var218 = 0;
                                    }
                                    if (var218 > 255) {
                                        var218 = 255;
                                    }
                                    if (class270.field4793 != var218) {
                                        if (class270.field4793 == 0 && class2.field24 != -1) {
                                            class132.method887(class213.field3744, false, 27750, class2.field24, var218, 0);
                                            class203.field3549 = false;
                                        } else if (var218 == 0) {
                                            class16.method122(-123);
                                            class203.field3549 = false;
                                        } else {
                                            class148.method965(var218, 115);
                                        }
                                        class270.field4793 = var218;
                                    }
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6020) {
                                    var6--;
                                    int var219 = class30.field448[var6];
                                    if (var219 < 0) {
                                        var219 = 0;
                                    }
                                    if (var219 > 127) {
                                        var219 = 127;
                                    }
                                    class182.field3109 = var219;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class226.field3937 = false;
                                    continue;
                                }
                                if (var461 == 6021) {
                                    var6--;
                                    class90.field1667 = class30.field448[var6] == 1;
                                    class124.method851(false);
                                    continue;
                                }
                                if (var461 == 6022) {
                                    var6--;
                                    class193.field3296 = class30.field448[var6] == 1;
                                    class183.method1257((byte) -71, class107.field1882);
                                    class125.method854(0, -765);
                                    continue;
                                }
                            } else if (var461 < 6200) {
                                if (var461 == 6101) {
                                    class30.field448[var6++] = class3.field38;
                                    continue;
                                }
                                if (var461 == 6102) {
                                    class30.field448[var6++] = class121.method833((byte) -122) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6103) {
                                    class30.field448[var6++] = class236.field4084 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6105) {
                                    class30.field448[var6++] = class31.field475 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6106) {
                                    class30.field448[var6++] = class214.field3762 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6107) {
                                    class30.field448[var6++] = class95.field1735 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6108) {
                                    class30.field448[var6++] = class25.field396 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6109) {
                                    class30.field448[var6++] = class180.field3093 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6110) {
                                    class30.field448[var6++] = class273.field4826 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6111) {
                                    class30.field448[var6++] = class11.field167;
                                    continue;
                                }
                                if (var461 == 6112) {
                                    class30.field448[var6++] = class240.field4136 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6114) {
                                    class30.field448[var6++] = class194.field3308 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6115) {
                                    class30.field448[var6++] = class98.field1775 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6116) {
                                    class30.field448[var6++] = class177.field3028;
                                    continue;
                                }
                                if (var461 == 6117) {
                                    class30.field448[var6++] = class95.field1743 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6118) {
                                    class30.field448[var6++] = class85.field1565;
                                    continue;
                                }
                                if (var461 == 6119) {
                                    class30.field448[var6++] = class270.field4793;
                                    continue;
                                }
                                if (var461 == 6120) {
                                    class30.field448[var6++] = class182.field3109;
                                    continue;
                                }
                                if (var461 == 6121) {
                                    class30.field448[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 6122) {
                                    class30.field448[var6++] = class193.field3296 ? 1 : 0;
                                    continue;
                                }
                            } else if (var461 < 6300) {
                                if (var461 == 6200) {
                                    var6 -= 2;
                                    class25.field371 = (short) class30.field448[var6];
                                    if (class25.field371 <= 0) {
                                        class25.field371 = 256;
                                    }
                                    class203.field3547 = (short) class30.field448[var6 + 1];
                                    if (class203.field3547 <= 0) {
                                        class203.field3547 = 205;
                                    }
                                    continue;
                                }
                                if (var461 == 6201) {
                                    var6 -= 2;
                                    class19.field273 = (short) class30.field448[var6];
                                    if (class19.field273 <= 0) {
                                        class19.field273 = 256;
                                    }
                                    class261.field4609 = (short) class30.field448[var6 + 1];
                                    if (class261.field4609 <= 0) {
                                        class261.field4609 = 320;
                                    }
                                    continue;
                                }
                                if (var461 == 6202) {
                                    var6 -= 4;
                                    class6.field76 = (short) class30.field448[var6];
                                    if (class6.field76 <= 0) {
                                        class6.field76 = 1;
                                    }
                                    class83.field1517 = (short) class30.field448[var6 + 1];
                                    if (class83.field1517 <= 0) {
                                        class83.field1517 = 32767;
                                    } else if (class83.field1517 < class6.field76) {
                                        class83.field1517 = class6.field76;
                                    }
                                    class125.field2210 = (short) class30.field448[var6 + 2];
                                    if (class125.field2210 <= 0) {
                                        class125.field2210 = 1;
                                    }
                                    class117.field2090 = (short) class30.field448[var6 + 3];
                                    if (class117.field2090 <= 0) {
                                        class117.field2090 = 32767;
                                    } else if (class125.field2210 > class117.field2090) {
                                        class117.field2090 = class125.field2210;
                                    }
                                    continue;
                                }
                                if (var461 == 6203) {
                                    class88.method652(false, class27.field420.field4482, 0, class27.field420.field4513, 0, -128);
                                    class30.field448[var6++] = class221.field3879;
                                    class30.field448[var6++] = class168.field2897;
                                    continue;
                                }
                                if (var461 == 6204) {
                                    class30.field448[var6++] = class19.field273;
                                    class30.field448[var6++] = class261.field4609;
                                    continue;
                                }
                                if (var461 == 6205) {
                                    class30.field448[var6++] = class25.field371;
                                    class30.field448[var6++] = class203.field3547;
                                    continue;
                                }
                            } else if (var461 < 6400) {
                                if (var461 == 6300) {
                                    class30.field448[var6++] = (int) (class28.method200(127) / 60000L);
                                    continue;
                                }
                                if (var461 == 6301) {
                                    class30.field448[var6++] = (int) (class28.method200(96) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var461 == 6302) {
                                    var6 -= 3;
                                    int var223 = class30.field448[var6];
                                    int var224 = class30.field448[var6 + 1];
                                    int var225 = class30.field448[var6 + 2];
                                    class6.field73.clear();
                                    class6.field73.set(11, 12);
                                    class6.field73.set(var225, var224, var223);
                                    class30.field448[var6++] = (int) (class6.field73.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var461 == 6303) {
                                    class6.field73.clear();
                                    class6.field73.setTime(new Date(class28.method200(-40)));
                                    class30.field448[var6++] = class6.field73.get(1);
                                    continue;
                                }
                                if (var461 == 6304) {
                                    var6--;
                                    int var226 = class30.field448[var6];
                                    boolean var227 = true;
                                    if (var226 < 0) {
                                        var227 = ((var226 + 1) % 4) == 0;
                                    } else if (var226 < 1582) {
                                        var227 = (var226 % 4) == 0;
                                    } else if (var226 % 4 != 0) {
                                        var227 = false;
                                    } else if (var226 % 100 != 0) {
                                        var227 = true;
                                    } else if ((var226 % 400) != 0) {
                                        var227 = false;
                                    }
                                    class30.field448[var6++] = var227 ? 1 : 0;
                                    continue;
                                }
                            } else if (var461 < 6500) {
                                if (var461 == 6400) {
                                    class30.field448[var6++] = class28.field423 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6401) {
                                    var8--;
                                    class85 var220 = class97.field1761[var8];
                                    var6--;
                                    int var221 = class30.field448[var6];
                                    String var222;
                                    try {
                                        var222 = new String(var220.method588(17473), "ISO-8859-1");
                                    } catch (UnsupportedEncodingException var458) {
                                        var222 = new String(var220.method588(17473));
                                    }
                                    if (class28.field423) {
                                        if (!browsercontrol.iscreated()) {
                                            browsercontrol.create("about:blank");
                                        }
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate(var222);
                                            class251.field4316 = var221;
                                            class125.method854(0, -765);
                                        }
                                    }
                                    continue;
                                }
                                if (var461 == 6402) {
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate("about:blank");
                                        browsercontrol.hide();
                                        class251.field4316 = 0;
                                        class125.method854(0, -765);
                                    }
                                    continue;
                                }
                                if (var461 == 6403) {
                                    class97.field1761[var8++] = class232.field4019;
                                    continue;
                                }
                                if (var461 == 6404) {
                                    class97.field1761[var8++] = class246.field4199;
                                    continue;
                                }
                                if (var461 == 6405) {
                                    class30.field448[var6++] = class111.method759((byte) -114) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6406) {
                                    class30.field448[var6++] = class122.method839(0) ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var461 == 5306) {
                            class30.field448[var6++] = class171.method1144(-52);
                            continue;
                        }
                    } else if (var461 == 4500) {
                        var6 -= 2;
                        int var303 = class30.field448[var6 + 1];
                        int var304 = class30.field448[var6];
                        class240 var305 = class239.method1627(var303, 69);
                        if (var305.method1638(71)) {
                            class97.field1761[var8++] = class211.method1452(1, var304).method1648(var305.field4134, 30, var303);
                        } else {
                            class30.field448[var6++] = class211.method1452(1, var304).method1652(var303, true, var305.field4147);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var460) {
            if (var5.field1402 == null) {
                if (class133.field2312 != 0) {
                    class148.method972(class171.field2958, (byte) -35, class82.field1501, 0);
                }
                class201.method1379(var460, "CS2 - scr:" + var5.field4377 + " op:" + var11, 2552);
            } else {
                class85 var455 = class58.method392(30, (byte) 109);
                var455.method638(class49.field872, 0).method638(var5.field1402, 0);
                for (int var456 = class220.field3865 - 1; var456 >= 0; var456--) {
                    var455.method638(class189.field3236, 0).method638(class178.field3062[var456].field4295.field1402, 0);
                }
                if (var11 == 40) {
                    int var457 = var9[var7];
                    var455.method638(class30.field447, 0).method638(class68.method451(var457, -12572), 0);
                }
                if (class133.field2312 != 0) {
                    class148.method972(class172.method1150(new class85[] { class125.field2205, var5.field1402 }, 0), (byte) -88, class82.field1501, 0);
                }
                class201.method1379(var460, "CS2 - scr:" + var5.field4377 + " op:" + var11 + new String(var455.method588(17473)), 2552);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[[I")
    public int[][] method89(int arg0, byte arg1) {
        if (arg1 == -123) {
            field4336++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)[I")
    public final int[] method1742(byte arg0, int arg1, int arg2) {
        field4351++;
        if (arg0 != 8) {
            method1741(-9, (class5) null, -6);
        }
        return this.field4346[arg1].field4338 ? this.field4346[arg1].method149(arg2, (byte) -55) : this.field4346[arg1].method89(arg2, (byte) -123)[0];
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public void method230(int arg0) {
        field4342++;
        if (arg0 != 3906) {
            this.field4340 = -108;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    private static final void method1743(int arg0, int arg1) {
        field4359++;
        class171 var2 = class85.method579(6, 0, arg1);
        if (arg0 > -16) {
            field4357 = null;
        }
        var2.method1141(-6456);
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field4348 = null;
        field4357 = null;
        field4353 = null;
        int var1 = 18 % ((arg0 + 2) / 56);
        field4360 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
    public int method1004(byte arg0) {
        int var2 = -19 % ((-arg0 - 24) / 46);
        field4334++;
        return -1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[I")
    public int[] method149(int arg0, byte arg1) {
        field4355++;
        if (arg1 != -55) {
            method1740(59, 57L);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)V")
    public static final void method1745(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 104) {
            field4348 = null;
        }
        field4344++;
        for (int var5 = 0; var5 < class22.field307; var5++) {
            if ((class146.field2493[var5] + class54.field947[var5]) > arg1 && (arg1 + arg3) > class146.field2493[var5] && arg0 < (class253.field4364[var5] + class246.field4201[var5]) && class253.field4364[var5] < arg0 + arg4) {
                class20.field286[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
    private static final void method1746(int arg0, boolean arg1) {
        class171 var2 = class85.method579(2, 0, arg0);
        field4339++;
        if (arg1) {
            var2.method1141(-6456);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IZ)V")
    public class252(int arg0, boolean arg1) {
        this.field4338 = arg1;
        this.field4346 = new class252[arg0];
    }
}
