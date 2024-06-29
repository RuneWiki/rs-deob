import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Lae;")
    private class40 field557 = new class40();

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field552 = new Thread(this);

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Lvfa;")
    public static class264 field553;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLd;)V", line = 3)
    private final void method254(byte arg0, class329 arg1) {
        if (arg0 <= 88) {
            return;
        }
        field554++;
        class40 var3 = this.field557;
        synchronized (this.field557) {
            this.field557.method239(arg1, (byte) 93);
            this.field557.notify();
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V", line = 17)
    public final void method255(boolean arg0) {
        field551++;
        if (this.field552 == null) {
            return;
        }
        this.method254((byte) 101, new class329());
        try {
            this.field552.join();
        } catch (InterruptedException var2) {
        }
        if (arg0) {
            this.method257(null, -16);
        }
        this.field552 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 39)
    public static void method256(int arg0) {
        field553 = null;
        if (arg0 < 104) {
            field553 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "run", descriptor = "()V", line = 54)
    public final void run() {
        field549++;
        while (true) {
            class40 var1 = this.field557;
            class426 var3;
            synchronized (this.field557) {
                class329 var2;
                for (var2 = this.field557.method244(true); var2 == null; var2 = this.field557.method244(true)) {
                    try {
                        this.field557.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class426)) {
                    return;
                }
                var3 = (class426) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5344).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5346 = var5;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;I)Lvm;", line = 94)
    public final class426 method257(String arg0, int arg1) {
        field556++;
        if (this.field552 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 75) {
            return null;
        } else {
            class426 var3 = new class426(arg0);
            this.method254((byte) 123, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILr;BI)V", line = 115)
    public static final void method258(int arg0, class566 arg1, byte arg2, int arg3) {
        field550++;
        if (arg0 < 0 || arg3 < 0 || class516.field7045 == 0 || class167.field2195 == 0) {
            return;
        }
        arg1.method1048(class376.field4744, class285.field3539, class516.field7045, class167.field2195);
        arg1.method1083(class496.field6549, class468.field5954, class516.field7045, class167.field2195);
        class491 var4 = arg1.method1087();
        var4.method920(class228.field2843, class693.field9830, class391.field4928, class3.field30, class332.field4238, class516.field7038);
        arg1.method1058(var4);
        if (class256.field3127 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method974();
            int var8 = (arg0 - class376.field4744) * var7 / class516.field7045;
            int var9 = (arg3 - class285.field3539) * var7 / class167.field2195;
            int var10 = arg1.method1055();
            int var11 = (arg0 - class376.field4744) * var10 / class516.field7045;
            int var12 = (arg3 - class285.field3539) * var10 / class167.field2195;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method901(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method901(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class431.field5395 > var20 && class452.field5802 > var22) {
                    int var23 = class376.field4748.field6470;
                    if (var23 < 3 && (class10.field190[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class256.field3127[var23].method1565(var21, var19, true) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class376.field4748.method2785(-1) - 1 << 8) >> 9;
                        var6 = (class376.field4748.method2785(-1) - 1 << 8) + var21 >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class664.field9377 && (class639.field8984 & 0x40) != 0) {
                    class507 var24 = class138.method795(class529.field7156, class172.field2252, (byte) 102);
                    if (var24 == null) {
                        class476.method2518((byte) 31);
                    } else {
                        class326.method1864(var5, false, var6, -1, true, class477.field6046, 8, 0L, " ->", 30, class537.field7208);
                    }
                } else {
                    if (class98.field1337 == class641.field9035) {
                        class326.method1864(var5, false, var6, -1, true, -1, arg2 + 165, 0L, "", 21, class83.field1135.method476((byte) -63, class250.field3068));
                    }
                    class326.method1864(var5, false, var6, -1, true, class517.field7068, -67, 0L, "", 10, class674.field9482);
                    class667.field9406++;
                }
            }
        }
        if (arg2 != -39) {
            method258(119, null, (byte) 11, 123);
        }
        class139 var25 = class632.field8878;
        for (class101 var26 = (class101) var25.method802((byte) 93); var26 != null; var26 = (class101) var25.method800((byte) -106)) {
            if ((class557.field7743 || class376.field4748.field6470 == var26.field1364.field6470) && var26.method574(arg1, arg2 ^ 0xFFFFFFD9, arg3, arg0)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if ((var26.field1364 instanceof class172)) {
                    var30 = ((class172) var26.field1364).field2247;
                    var29 = ((class172) var26.field1364).field2243;
                } else {
                    var29 = var26.field1364.field6464 >> 9;
                    var30 = var26.field1364.field6461 >> 9;
                }
                if (var26.field1364 instanceof class514) {
                    class514 var31 = (class514) var26.field1364;
                    int var32 = var31.method2785(-1);
                    if ((var32 & 0x1) == 0 && (var31.field6461 & 0x1FF) == 0 && (var31.field6464 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field6461 & 0x1FF) == 256 && (var31.field6464 & 0x1FF) == 256) {
                        int var33 = var31.field6461 - (var31.method2785(-1) - 1 << 8);
                        int var34 = var31.field6464 - (var31.method2785(-1) - 1 << 8);
                        for (int var35 = 0; var35 < class470.field5974; var35++) {
                            class206 var42 = (class206) class180.field2318.method399(-32748, (long) class153.field1958[var35]);
                            if (var42 != null) {
                                class307 var43 = var42.field2618;
                                if (class133.field1735 != var43.field9683 && var43.field9671) {
                                    int var44 = var43.field6461 - (var43.field3902.field8210 - 1 << 8);
                                    int var45 = var43.field6464 - (var43.field3902.field8210 - 1 << 8);
                                    if (var44 >= var33 && var43.field3902.field8210 <= (var31.method2785(-1) - (var44 - var33 >> 9)) && var45 >= var34 && var43.field3902.field8210 <= var31.method2785(-1) - (var45 - var34 >> 9)) {
                                        class168.method965(var43, class376.field4748.field6470 != var26.field1364.field6470, (byte) -116);
                                        var43.field9683 = class133.field1735;
                                    }
                                }
                            }
                        }
                        int var36 = class596.field8384;
                        int[] var37 = class354.field4521;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class514 var39 = class351.field4490[var37[var38]];
                            if (var39 != null && class133.field1735 != var39.field9683 && var31 != var39 && var39.field9671) {
                                int var40 = var39.field6461 - (var39.method2785(-1) - 1 << 8);
                                int var41 = var39.field6464 - (var39.method2785(-1) - 1 << 8);
                                if (var40 >= var33 && var39.method2785(-1) <= (var31.method2785(arg2 + 38) - (var40 - var33 >> 9)) && var41 >= var34 && var39.method2785(-1) <= (var31.method2785(arg2 ^ 0x26) - (var41 - var34 >> 9))) {
                                    class469.method2487(class376.field4748.field6470 != var26.field1364.field6470, arg2 + 6631, var39);
                                    var39.field9683 = class133.field1735;
                                }
                            }
                        }
                    }
                    if (class133.field1735 == var31.field9683) {
                        continue;
                    }
                    class469.method2487(class376.field4748.field6470 != var26.field1364.field6470, arg2 ^ 0xFFFFE619, var31);
                    var31.field9683 = class133.field1735;
                }
                if (var26.field1364 instanceof class307) {
                    class307 var46 = (class307) var26.field1364;
                    if (var46.field3902 != null) {
                        if ((var46.field3902.field8210 & 0x1) == 0 && (var46.field6461 & 0x1FF) == 0 && (var46.field6464 & 0x1FF) == 0 || (var46.field3902.field8210 & 0x1) == 1 && (var46.field6461 & 0x1FF) == 256 && (var46.field6464 & 0x1FF) == 256) {
                            int var47 = var46.field6461 - (var46.field3902.field8210 - 1 << 8);
                            int var48 = var46.field6464 - (var46.field3902.field8210 - 1 << 8);
                            for (int var49 = 0; var49 < class470.field5974; var49++) {
                                class206 var56 = (class206) class180.field2318.method399(-32748, (long) class153.field1958[var49]);
                                if (var56 != null) {
                                    class307 var57 = var56.field2618;
                                    if (class133.field1735 != var57.field9683 && var46 != var57 && var57.field9671) {
                                        int var58 = var57.field6461 - (var57.field3902.field8210 - 1 << 8);
                                        int var59 = var57.field6464 - (var57.field3902.field8210 - 1 << 8);
                                        if (var47 <= var58 && (var46.field3902.field8210 - (var58 - var47 >> 9)) >= var57.field3902.field8210 && var48 <= var59 && var57.field3902.field8210 <= (var46.field3902.field8210 - (var59 - var48 >> 9))) {
                                            class168.method965(var57, class376.field4748.field6470 != var26.field1364.field6470, (byte) -113);
                                            var57.field9683 = class133.field1735;
                                        }
                                    }
                                }
                            }
                            int var50 = class596.field8384;
                            int[] var51 = class354.field4521;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class514 var53 = class351.field4490[var51[var52]];
                                if (var53 != null && class133.field1735 != var53.field9683 && var53.field9671) {
                                    int var54 = var53.field6461 - (var53.method2785(arg2 ^ 0x26) - 1 << 8);
                                    int var55 = var53.field6464 - (var53.method2785(-1) - 1 << 8);
                                    if (var47 <= var54 && var53.method2785(-1) <= var46.field3902.field8210 - (var54 - var47 >> 9) && var55 >= var48 && var53.method2785(arg2 ^ 0x26) <= var46.field3902.field8210 - (var55 - var48 >> 9)) {
                                        class469.method2487(class376.field4748.field6470 != var26.field1364.field6470, 6592, var53);
                                        var53.field9683 = class133.field1735;
                                    }
                                }
                            }
                        }
                        if (class133.field1735 == var46.field9683) {
                            continue;
                        }
                        class168.method965(var46, class376.field4748.field6470 != var26.field1364.field6470, (byte) -122);
                        var46.field9683 = class133.field1735;
                    }
                }
                if (var26.field1364 instanceof class433) {
                    int var60 = class145.field1879 + var30;
                    int var61 = var29 + class630.field8817;
                    class650 var62 = (class650) class533.field7185.method399(-32748, (long) (var60 | var61 << 14 | var26.field1364.field6470 << 28));
                    if (var62 != null) {
                        for (class288 var63 = (class288) var62.field9177.method248(false); var63 != null; var63 = (class288) var62.field9177.method243(16)) {
                            class3 var64 = class633.field8881.method434(12388, var63.field3586);
                            if (class664.field9377 && class376.field4748.field6470 == var26.field1364.field6470) {
                                class207 var65 = class355.field4527 == -1 ? null : class705.field9939.method2477((byte) 6, class355.field4527);
                                if ((class639.field8984 & 0x1) != 0 && (var65 == null || var64.method18(class355.field4527, var65.field2627, -123) != var65.field2627)) {
                                    class326.method1864(var30, false, var29, -1, true, class477.field6046, 126, (long) var63.field3586, class473.field6007 + " -> <col=ff9040>" + var64.field34, 48, class537.field7208);
                                    class428.field5367++;
                                }
                            }
                            if (class376.field4748.field6470 == var26.field1364.field6470) {
                                String[] var66 = var64.field39;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        int var69 = class533.field7186;
                                        if (var67 == 0) {
                                            var68 = 25;
                                        }
                                        if (var67 == 1) {
                                            var68 = 11;
                                        }
                                        if (var67 == 2) {
                                            var68 = 6;
                                        }
                                        if (var67 == 3) {
                                            var68 = 46;
                                        }
                                        if (var67 == 4) {
                                            var68 = 16;
                                        }
                                        if (var64.field106 == var67) {
                                            var69 = var64.field32;
                                        }
                                        if (var64.field86 == var67) {
                                            var69 = var64.field81;
                                        }
                                        class201.field2537++;
                                        class326.method1864(var30, false, var29, -1, true, var69, 8, (long) var63.field3586, "<col=ff9040>" + var64.field34, var68, var66[var67]);
                                    }
                                }
                            }
                            class326.method1864(var30, class376.field4748.field6470 != var26.field1364.field6470, var29, -1, true, class36.field495, 127, (long) var63.field3586, "<col=ff9040>" + var64.field34, 1004, class83.field1130.method476((byte) -93, class250.field3068));
                            class66.field897++;
                        }
                    }
                }
                if (var26.field1364 instanceof class339) {
                    class339 var70 = (class339) var26.field1364;
                    class441 var71 = class428.field5352.method3138((byte) 51, var70.method65((byte) 127));
                    if (var71.field5574 != null) {
                        var71 = var71.method2355(class684.field9606, arg2 - 1604);
                    }
                    if (var71 != null) {
                        if (class664.field9377 && class376.field4748.field6470 == var26.field1364.field6470) {
                            class207 var72 = class355.field4527 == -1 ? null : class705.field9939.method2477((byte) 6, class355.field4527);
                            if ((class639.field8984 & 0x4) != 0 && (var72 == null || var71.method2351(class355.field4527, arg2 + 102, var72.field2627) != var72.field2627)) {
                                class326.method1864(var30, false, var29, -1, true, class477.field6046, 127, class561.method3084(var29, var30, -1, var70), class473.field6007 + " -> <col=00ffff>" + var71.field5581, 19, class537.field7208);
                                class298.field3667++;
                            }
                        }
                        if (class376.field4748.field6470 == var26.field1364.field6470) {
                            String[] var73 = var71.field5544;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        if (var74 == 0) {
                                            var75 = 22;
                                        }
                                        int var76 = class533.field7186;
                                        if (var74 == 1) {
                                            var75 = 47;
                                        }
                                        if (var74 == 2) {
                                            var75 = 18;
                                        }
                                        if (var74 == 3) {
                                            var75 = 51;
                                        }
                                        if (var71.field5584 == var74) {
                                            var76 = var71.field5524;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1009;
                                        }
                                        if (var71.field5532 == var74) {
                                            var76 = var71.field5499;
                                        }
                                        class326.method1864(var30, false, var29, -1, true, var76, 29, class561.method3084(var29, var30, arg2 ^ 0x26, var70), "<col=00ffff>" + var71.field5581, var75, var73[var74]);
                                        class445.field5640++;
                                    }
                                }
                            }
                        }
                        class644.field9054++;
                        class326.method1864(var30, class376.field4748.field6470 != var26.field1364.field6470, var29, -1, true, class36.field495, 126, (long) var71.field5504, "<col=00ffff>" + var71.field5581, 1008, class83.field1130.method476((byte) -41, class250.field3068));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 606)
    public class42() {
        this.field552.setDaemon(true);
        this.field552.start();
    }
}
