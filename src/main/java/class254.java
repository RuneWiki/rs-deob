import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class254 extends class259 {

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    private int field4486 = 0;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    private int field4482 = 0;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    private int field4491 = 1;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "J")
    public static long field4480 = 0L;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "[I")
    public static int[] field4477 = new int[2000];

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "Lsg;")
    public static class30 field4495 = class167.method1221((byte) 33, "Abbrechen");

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "[J")
    public static long[] field4485 = new long[100];

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "[I")
    public static int[] field4476;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 == -1586849108) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -4) {
                        this.field4491 = arg2.method63((byte) 58);
                    }
                } else {
                    this.field4482 = arg2.method63((byte) 109);
                }
            } else {
                this.field4486 = arg2.method63((byte) 50);
            }
            ++field4487;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Le;")
    public static final class130 method1765(int arg0, int arg1) {
        int var2 = -47 / ((arg1 - -61) / 43);
        ++field4481;
        class130 var3 = (class130) class71.field1597.method174((long) arg0, (byte) -54);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4;
            if (arg0 < 32768) {
                var4 = class41.field1017.method1115(arg0, (byte) -72, 1);
            } else {
                var4 = class113.field2249.method1115(arg0 & 32767, (byte) -80, 1);
            }
            class130 var5 = new class130();
            if (var4 != null) {
                var5.method996((byte) -105, new class8(var4));
            }
            if (arg0 >= 32768) {
                var5.method989((byte) -71);
            }
            class71.field1597.method169(var5, -57, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(III)V")
    public static final void method1766(int arg0, int arg1, int arg2) {
        ++field4494;
        class68 var3 = class103.method830(arg0, 4, 13);
        var3.method608(false);
        if (arg2 == 17) {
            var3.field1484 = arg1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field4485 = null;
        field4477 = null;
        field4495 = null;
        if (arg0 == 20327) {
            field4476 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.field4482 = -119;
        }
        ++field4492;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = class154.field2910[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class223.field3999 > var6; ++var6) {
                int var7 = class29.field558[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field4486 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4491 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field4491;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field4482 != -1) {
                    if (~this.field4482 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class250.field4420[(var12 & 4080) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        class168.method1242((byte) -91);
        if (arg0 <= 11) {
            method1768((byte) -97, (class151) null);
        }
        ++field4483;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLmc;)V")
    public static final void method1768(byte arg0, class151 arg1) {
        if (arg0 != 29) {
            method1770(51, (class120) null, 47, -27);
        }
        class210.field3766 = arg1.method1096((byte) -102, class243.field4346);
        class30.field603 = arg1.method1096((byte) -102, class227.field4063);
        ++field4489;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLmc;)I")
    public static final int method1769(boolean arg0, class151 arg1) {
        ++field4479;
        int var2 = 0;
        if (arg1.method1112(class210.field3766, (byte) 64)) {
            ++var2;
        }
        if (arg1.method1112(class30.field603, (byte) 57)) {
            ++var2;
        }
        if (arg0) {
            field4495 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILva;II)V")
    public static final void method1770(int arg0, class120 arg1, int arg2, int arg3) {
        if (~(arg0 & 128) != -1) {
            arg1.field1384 = class59.field1289.method79(true);
            if (~arg1.field1384 == -65536) {
                arg1.field1384 = -1;
            }
        }
        if ((512 & arg0) != 0) {
            arg1.field1363 = class59.field1289.method54(75);
            arg1.field1382 = class59.field1289.method63((byte) 86);
            arg1.field1352 = class59.field1289.method63((byte) 119);
            arg1.field1404 = class59.field1289.method63((byte) 121);
            arg1.field1367 = class59.field1289.method65((byte) 118) + class133.field2617;
            arg1.field1394 = class59.field1289.method81(-1239235384) + class133.field2617;
            arg1.field1393 = class59.field1289.method63((byte) 91);
            arg1.field1388 = 1;
            arg1.field1368 = 0;
        }
        ++field4488;
        if ((64 & arg0) != arg2) {
            int var4 = class59.field1289.method65((byte) 110);
            int var5 = class59.field1289.method69(5002);
            boolean var6 = ~(32768 & var4) != -1;
            int var7 = class59.field1289.method54(35);
            int var8 = class59.field1289.field146;
            if (arg1.field2349 != null && arg1.field2343 != null) {
                long var9 = arg1.field2349.method297((byte) -109);
                boolean var11 = false;
                if (~var5 >= -2) {
                    if (var6 || class36.field874 != 1 && ~class230.field4091 != -2) {
                        for (int var12 = 0; ~class141.field2730 < ~var12; ++var12) {
                            if (~field4485[var12] == ~var9) {
                                var11 = true;
                                break;
                            }
                        }
                    } else {
                        var11 = true;
                    }
                }
                if (!var11 && class153.field2908 == 0) {
                    class220.field3973.field146 = 0;
                    class59.field1289.method56(var7, 0, class220.field3973.field124, (byte) -115);
                    class220.field3973.field146 = 0;
                    int var13 = -1;
                    class30 var14;
                    if (!var6) {
                        var14 = class206.method1448(class108.method851(class220.field3973, false).method278(0));
                    } else {
                        var4 &= 32767;
                        class172 var15 = class63.method570((byte) -40, class220.field3973);
                        var13 = var15.field3214;
                        var14 = var15.field3219.method994(0, class220.field3973);
                    }
                    arg1.field1357 = var14.method288((byte) 121);
                    arg1.field1353 = 255 & var4;
                    arg1.field1408 = var4 >> 8;
                    arg1.field1374 = 150;
                    if (~var5 != -3) {
                        if (var5 == 1) {
                            class52.method515(class160.method1188(new class30[] { class219.field3952, arg1.method916(~arg2) }, 0), var13, false, (class30) null, var14, !var6 ? 1 : 17);
                        } else {
                            class52.method515(arg1.method916(-1), var13, false, (class30) null, var14, var6 ? 17 : 2);
                        }
                    } else {
                        class52.method515(class160.method1188(new class30[] { class68.field1494, arg1.method916(arg2 + -1) }, 0), var13, false, (class30) null, var14, var6 ? 17 : 1);
                    }
                }
            }
            class59.field1289.field146 = var8 - -var7;
        }
        if ((arg0 & 2) != 0) {
            int var16 = class59.field1289.method69(5002);
            byte[] var17 = new byte[var16];
            class8 var18 = new class8(var17);
            class59.field1289.method56(var16, 0, var17, (byte) -115);
            class106.field2124[arg3] = var18;
            arg1.method912(false, var18);
        }
        if ((arg0 & 256) != 0) {
            int var19 = class59.field1289.method63((byte) 98);
            int var20 = class59.field1289.method77((byte) 118);
            arg1.method571(class133.field2617, arg2 + -121, var19, var20);
        }
        if (~(32 & arg0) != -1) {
            int var21 = class59.field1289.method81(arg2 + -1239235384);
            if (~var21 == -65536) {
                var21 = -1;
            }
            int var22 = class59.field1289.method54(66);
            class208.method1477(arg1, var21, var22, true);
        }
        if (~(8 & arg0) != -1) {
            int var23 = class59.field1289.method69(5002);
            int var24 = class59.field1289.method77((byte) 110);
            arg1.method571(class133.field2617, -95, var23, var24);
            arg1.field1338 = class133.field2617 + 300;
            arg1.field1377 = class59.field1289.method54(93);
        }
        if (~(arg0 & 1) != -1) {
            arg1.field1380 = class59.field1289.method65((byte) 111);
            arg1.field1390 = class59.field1289.method92(126);
        }
        if (~(arg0 & 16) != -1) {
            arg1.field1357 = class59.field1289.method84(0);
            if (arg1.field1357.method283(0, arg2 ^ 255) == 126) {
                arg1.field1357 = arg1.field1357.method260((byte) 5, 1);
                class268.method1838(2, arg2 + -1, arg1.field1357, arg1.method916(-1));
            } else if (class247.field4394 == arg1) {
                class268.method1838(2, -1, arg1.field1357, arg1.method916(~arg2));
            }
            arg1.field1353 = 0;
            arg1.field1408 = 0;
            arg1.field1374 = 150;
        }
        if (~(arg0 & 1024) != -1) {
            arg1.field1345 = class59.field1289.method79(true);
            int var25 = class59.field1289.method70(65280);
            arg1.field1339 = (65535 & var25) + class133.field2617;
            arg1.field1403 = 0;
            if (~arg1.field1339 < ~class133.field2617) {
                arg1.field1403 = -1;
            }
            arg1.field1346 = 0;
            if (~arg1.field1345 == -65536) {
                arg1.field1345 = -1;
            }
            arg1.field1369 = var25 >> 16;
            if (arg1.field1345 != -1 && class133.field2617 == arg1.field1339) {
                int var26 = class263.method1819(arg1.field1345, -4).field460;
                if (~var26 != 0) {
                    class138 var27 = class193.method1396(-30590, var26);
                    if (var27 != null && var27.field2699 != null) {
                        class53.method518(arg1.field1360, arg1.field1336, -128, 0, var27, class247.field4394 == arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldl;I)V")
    public static final void method1771(class31 arg0, int arg1) {
        ++field4490;
        if (arg1 != 8) {
            field4480 = -123L;
        }
        if (~class147.field2814 == ~arg0.field756) {
            class14.field288[arg0.field781] = true;
        }
    }
}
