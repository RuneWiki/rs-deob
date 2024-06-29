import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class77 {

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "Z")
    private boolean field411 = false;

    @OriginalMember(owner = "client!dc", name = "Hb", descriptor = "Z")
    private volatile boolean field428 = false;

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "Lqb;")
    private class113 field417;

    @OriginalMember(owner = "client!dc", name = "Lb", descriptor = "Lqb;")
    private class113 field432;

    @OriginalMember(owner = "client!dc", name = "Fb", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lv;")
    private static class146 field402 = class159.method1226((byte) -37, "Please try using a different world)3");

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lv;")
    public static class146 field399 = field402;

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "Lv;")
    public static class146 field409 = field402;

    @OriginalMember(owner = "client!dc", name = "yb", descriptor = "Lv;")
    public static class146 field419 = field402;

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "Lv;")
    public static class146 field413 = field402;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lv;")
    public static class146 field397 = field402;

    @OriginalMember(owner = "client!dc", name = "Db", descriptor = "Lv;")
    public static class146 field424 = class159.method1226((byte) -37, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!dc", name = "Kb", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!dc", name = "Ib", descriptor = "Lv;")
    public static class146 field429 = field402;

    @OriginalMember(owner = "client!dc", name = "Eb", descriptor = "Lua;")
    public static class140 field425 = new class140(64);

    @OriginalMember(owner = "client!dc", name = "Nb", descriptor = "[Lt;")
    public static class132[] field434 = new class132[16];

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!dc", name = "zb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!dc", name = "Ab", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!dc", name = "Bb", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!dc", name = "Jb", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!dc", name = "Mb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "Z")
    public static boolean field410;

    @OriginalMember(owner = "client!dc", name = "Cb", descriptor = "[Z")
    private volatile boolean[] field423;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZII)V")
    public static final void method151(int arg0, boolean arg1, int arg2, int arg3) {
        ++field427;
        if (~arg2 <= -8001 && arg2 <= 48000) {
            class87.field2075 = arg1;
            class100.field2424 = arg0;
            if (arg3 > -57) {
                method156(-124);
            }
            class126.field2922 = arg2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method152(int arg0) {
        ++field400;
        if (class58.field1298 != null) {
            class58.field1298.method1071((byte) 104);
            class58.field1298 = null;
        }
        class15.method93(10266);
        class66.field1496.method1192();
        if (arg0 >= 16) {
            for (int var1 = 0; var1 < 4; ++var1) {
                class64.field1437[var1].method719(true);
            }
            System.gc();
            class145.method1067(2, 0);
            class141.field3222 = -1;
            class22.field375 = false;
            client.method126((byte) -51);
            class88.method702(10, false);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZI[BLqb;)V")
    public final void method153(int arg0, boolean arg1, int arg2, byte[] arg3, class113 arg4) {
        if (arg0 <= 13) {
            this.method154(-118, 124, -74);
        }
        ++field404;
        if (this.field432 != arg4) {
            if (!arg1 && ~this.field403 == ~arg2) {
                this.field428 = true;
            }
            if (arg3 != null && arg3.length > 2) {
                class87.field2072.reset();
                class87.field2072.update(arg3, 0, arg3.length + -2);
                int var6 = (int) class87.field2072.getValue();
                int var7 = (arg3[arg3.length + -2] << 8 & 65280) + (255 & arg3[arg3.length + -1]);
                if (super.field1826[arg2] == var6 && super.field1844[arg2] == var7) {
                    this.field423[arg2] = true;
                    if (arg1) {
                        super.field1843[arg2] = class158.method1224((byte) -12, arg3, false);
                    }
                } else {
                    this.field423[arg2] = false;
                    if (this.field411 || arg1) {
                        class68.method481(arg2, (byte) -105, super.field1826[arg2], this, arg1, (byte) 2, this.field426);
                    }
                }
            } else {
                this.field423[arg2] = false;
                if (this.field411 || arg1) {
                    class68.method481(arg2, (byte) 67, super.field1826[arg2], this, arg1, (byte) 2, this.field426);
                }
            }
        } else if (this.field428) {
            throw new RuntimeException();
        } else if (arg3 == null) {
            class68.method481(this.field426, (byte) 125, this.field422, this, true, (byte) 0, 255);
        } else {
            class87.field2072.reset();
            class87.field2072.update(arg3, 0, arg3.length);
            int var8 = (int) class87.field2072.getValue();
            class95 var9 = new class95(class141.method1051(arg3, 1));
            int var10 = var9.method790((byte) 73);
            if (~var10 != -6 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            } else {
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method740((byte) -128);
                }
                if (this.field422 != var8 || this.field430 != var11) {
                    class68.method481(this.field426, (byte) -76, this.field422, this, true, (byte) 0, 255);
                } else {
                    this.method575(1, arg3);
                    this.method165((byte) 114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        this.field430 = arg0;
        this.field422 = arg1;
        ++field406;
        if (arg2 != 4111) {
            method151(-2, true, 66, -115);
        }
        if (this.field432 == null) {
            class68.method481(this.field426, (byte) -82, this.field422, this, true, (byte) 0, 255);
        } else {
            class158.method1222(this, this.field426, 17577, this.field432);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lqb;Lqb;IZZZ)V")
    public class25(class113 arg0, class113 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field411 = arg5;
        this.field417 = arg0;
        this.field432 = arg1;
        this.field426 = arg2;
        class54.method359(0, this, this.field426);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
    public final void method155(int arg0, byte arg1) {
        if (this.field417 != null && this.field423 != null && this.field423[arg0]) {
            class158.method1222(this, arg0, 17577, this.field417);
        } else {
            class68.method481(arg0, (byte) 100, super.field1826[arg0], this, true, (byte) 2, this.field426);
        }
        ++field418;
        if (arg1 > -127) {
            field425 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method156(int arg0) {
        field413 = null;
        field425 = null;
        field434 = null;
        if (arg0 >= -5) {
            field402 = null;
        }
        field429 = null;
        field419 = null;
        field402 = null;
        field424 = null;
        field397 = null;
        field399 = null;
        field409 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrb;I)V")
    public static final void method157(class120 arg0, int arg1) {
        ++field408;
        Object[] var2 = arg0.field2790;
        int var3 = (Integer) var2[0];
        class117 var4 = class127.method944(var3, arg1 ^ 125);
        if (var4 != null) {
            class120.field2794 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = -1;
            int[] var8 = var4.field2725;
            int[] var9 = var4.field2733;
            byte var10 = -1;
            try {
                int var11 = 0;
                if (arg1 == 5) {
                    class24.field395 = new class146[var4.field2731];
                    int var12 = 0;
                    class22.field362 = new int[var4.field2736];
                    for (int var13 = 1; var13 < var2.length; ++var13) {
                        if (var2[var13] instanceof Integer) {
                            int var14 = (Integer) var2[var13];
                            if (~var14 == 2147483646) {
                                var14 = arg0.field2777;
                            }
                            if (var14 == -2147483646) {
                                var14 = arg0.field2799;
                            }
                            if (~var14 == 2147483644) {
                                var14 = arg0.field2787 == null ? -1 : arg0.field2787.field547;
                            }
                            if (~var14 == 2147483643) {
                                var14 = arg0.field2803;
                            }
                            if (var14 == -2147483643) {
                                var14 = arg0.field2787 != null ? arg0.field2787.field461 : -1;
                            }
                            if (var14 == -2147483642) {
                                var14 = arg0.field2786 != null ? arg0.field2786.field547 : -1;
                            }
                            if (var14 == -2147483641) {
                                var14 = arg0.field2786 == null ? -1 : arg0.field2786.field461;
                            }
                            if (var14 == -2147483640) {
                                var14 = arg0.field2797;
                            }
                            if (~var14 == 2147483638) {
                                var14 = arg0.field2781;
                            }
                            class22.field362[var11++] = var14;
                        } else if (var2[var13] instanceof class146) {
                            class146 var15 = (class146) var2[var13];
                            if (var15.method1107((byte) -95, class90.field2131)) {
                                var15 = arg0.field2792;
                            }
                            class24.field395[var12++] = var15;
                        }
                    }
                    int var16 = 0;
                    label1975: while (true) {
                        ++var16;
                        if (~var16 < -200001) {
                            throw new RuntimeException("slow");
                        }
                        ++var7;
                        int var271 = var9[var7];
                        if (var271 < 100) {
                            if (var271 == 0) {
                                class113.field2635[var5++] = var8[var7];
                                continue;
                            }
                            if (~var271 == -2) {
                                int var17 = var8[var7];
                                class113.field2635[var5++] = class148.field3454[var17];
                                continue;
                            }
                            if (~var271 == -3) {
                                int var18 = var8[var7];
                                --var5;
                                class148.field3454[var18] = class113.field2635[var5];
                                continue;
                            }
                            if (~var271 == -4) {
                                class42.field944[var6++] = var4.field2727[var7];
                                continue;
                            }
                            if (~var271 == -7) {
                                var7 += var8[var7];
                                continue;
                            }
                            if (~var271 == -8) {
                                var5 -= 2;
                                if (~class113.field2635[var5 - -1] != ~class113.field2635[var5]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (~var271 == -9) {
                                var5 -= 2;
                                if (class113.field2635[var5 + 1] == class113.field2635[var5]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (var271 == 9) {
                                var5 -= 2;
                                if (~class113.field2635[var5 + 1] < ~class113.field2635[var5]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (var271 == 10) {
                                var5 -= 2;
                                if (~class113.field2635[var5] < ~class113.field2635[var5 + 1]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (~var271 == -22) {
                                if (class120.field2794 == 0) {
                                    return;
                                }
                                class75 var19 = class159.field3642[--class120.field2794];
                                var7 = var19.field1789;
                                class24.field395 = var19.field1787;
                                var4 = var19.field1786;
                                class22.field362 = var19.field1795;
                                var8 = var4.field2725;
                                var9 = var4.field2733;
                                continue;
                            }
                            if (~var271 == -26) {
                                int var20 = var8[var7];
                                class113.field2635[var5++] = class79.method604(var20, true);
                                continue;
                            }
                            if (~var271 == -28) {
                                int var21 = var8[var7];
                                --var5;
                                class42.method275(var21, class113.field2635[var5], 0);
                                continue;
                            }
                            if (var271 == 31) {
                                var5 -= 2;
                                if (class113.field2635[var5] <= class113.field2635[var5 + 1]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (var271 == 32) {
                                var5 -= 2;
                                if (class113.field2635[var5 - -1] <= class113.field2635[var5]) {
                                    var7 += var8[var7];
                                }
                                continue;
                            }
                            if (~var271 == -34) {
                                class113.field2635[var5++] = class22.field362[var8[var7]];
                                continue;
                            }
                            int var10001;
                            if (var271 == 34) {
                                var10001 = var8[var7];
                                --var5;
                                class22.field362[var10001] = class113.field2635[var5];
                                continue;
                            }
                            if (~var271 == -36) {
                                class42.field944[var6++] = class24.field395[var8[var7]];
                                continue;
                            }
                            if (var271 == 36) {
                                var10001 = var8[var7];
                                --var6;
                                class24.field395[var10001] = class42.field944[var6];
                                continue;
                            }
                            if (~var271 == -38) {
                                int var22 = var8[var7];
                                var6 -= var22;
                                class146 var23 = class9.method63(var22, false, var6, class42.field944);
                                class42.field944[var6++] = var23;
                                continue;
                            }
                            if (var271 == 38) {
                                --var5;
                                continue;
                            }
                            if (~var271 == -40) {
                                --var6;
                                continue;
                            }
                            if (var271 == 40) {
                                int var24 = var8[var7];
                                class117 var25 = class127.method944(var24, 120);
                                class146[] var26 = new class146[var25.field2731];
                                int[] var27 = new int[var25.field2736];
                                for (int var28 = 0; ~var28 > ~var25.field2728; ++var28) {
                                    var27[var28] = class113.field2635[-var25.field2728 + var5 - -var28];
                                }
                                for (int var29 = 0; var29 < var25.field2729; ++var29) {
                                    var26[var29] = class42.field944[-var25.field2729 - -var29 + var6];
                                }
                                var6 -= var25.field2729;
                                var5 -= var25.field2728;
                                class75 var30 = new class75();
                                var30.field1795 = class22.field362;
                                var30.field1787 = class24.field395;
                                var30.field1786 = var4;
                                var30.field1789 = var7;
                                class159.field3642[class120.field2794++] = var30;
                                var7 = -1;
                                var4 = var25;
                                class24.field395 = var26;
                                var8 = var25.field2725;
                                var9 = var25.field2733;
                                class22.field362 = var27;
                                continue;
                            }
                            if (~var271 == -43) {
                                class113.field2635[var5++] = class141.field3232[var8[var7]];
                                continue;
                            }
                            if (~var271 == -44) {
                                var10001 = var8[var7];
                                --var5;
                                class141.field3232[var10001] = class113.field2635[var5];
                                continue;
                            }
                            if (~var271 == -45) {
                                --var5;
                                int var31 = class113.field2635[var5];
                                int var32 = var8[var7] >> 16;
                                int var33 = 65535 & var8[var7];
                                if (var31 >= 0 && var31 <= 5000) {
                                    class123.field2867[var32] = var31;
                                    byte var34 = -1;
                                    if (~var33 == -106) {
                                        var34 = 0;
                                    }
                                    int var35 = 0;
                                    while (true) {
                                        if (~var35 <= ~var31) {
                                            continue label1975;
                                        }
                                        class123.field2864[var32][var35] = var34;
                                        ++var35;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var271 == -46) {
                                int var36 = var8[var7];
                                --var5;
                                int var37 = class113.field2635[var5];
                                if (var37 >= 0 && ~class123.field2867[var36] < ~var37) {
                                    class113.field2635[var5++] = class123.field2864[var36][var37];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var271 == 46) {
                                int var38 = var8[var7];
                                var5 -= 2;
                                int var39 = class113.field2635[var5];
                                if (~var39 <= -1 && ~var39 > ~class123.field2867[var38]) {
                                    class123.field2864[var38][var39] = class113.field2635[var5 - -1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var271 == 47) {
                                class146 var40 = class151.field3488[var8[var7]];
                                if (var40 == null) {
                                    var40 = class48.field1094;
                                }
                                class42.field944[var6++] = var40;
                                continue;
                            }
                            if (var271 == 48) {
                                var10001 = var8[var7];
                                --var6;
                                class151.field3488[var10001] = class42.field944[var6];
                                continue;
                            }
                        }
                        boolean var41;
                        if (var8[var7] != 1) {
                            var41 = false;
                        } else {
                            var41 = true;
                        }
                        int var10000;
                        if (var271 < 1000) {
                            if (var271 == 100) {
                                var5 -= 3;
                                int var253 = class113.field2635[var5];
                                int var254 = class113.field2635[var5 + 2];
                                int var255 = class113.field2635[var5 + 1];
                                if (~var255 == -1) {
                                    throw new RuntimeException();
                                }
                                class26 var256 = class64.method466(-1922515024, var253);
                                if (var256.field562 == null) {
                                    var256.field562 = new class26[var254 + 1];
                                }
                                if (var254 >= var256.field562.length) {
                                    class26[] var257 = new class26[var254 + 1];
                                    for (int var258 = 0; var258 < var256.field562.length; ++var258) {
                                        var257[var258] = var256.field562[var258];
                                    }
                                    var256.field562 = var257;
                                }
                                if (~var254 < -1 && var256.field562[var254 - 1] == null) {
                                    throw new RuntimeException("Gap at:" + (var254 + -1));
                                }
                                class26 var259 = new class26();
                                var259.field510 = true;
                                var259.field461 = var254;
                                var259.field498 = var259.field547 = var256.field547;
                                var259.field479 = var255;
                                var256.field562[var254] = var259;
                                if (var41) {
                                    class51.field1153 = var259;
                                } else {
                                    class58.field1290 = var259;
                                }
                                class75.method567((byte) 114, var256);
                                continue;
                            }
                            if (~var271 == -102) {
                                class26 var260 = var41 ? class51.field1153 : class58.field1290;
                                class26 var261 = class64.method466(-1922515024, var260.field547);
                                var261.field562[var260.field461] = null;
                                class75.method567((byte) 113, var261);
                                continue;
                            }
                            if (~var271 == -103) {
                                var10000 = arg1 ^ -1922515019;
                                --var5;
                                class26 var262 = class64.method466(var10000, class113.field2635[var5]);
                                var262.field562 = null;
                                class75.method567((byte) 123, var262);
                                continue;
                            }
                            if (~var271 == -201) {
                                var5 -= 2;
                                int var263 = class113.field2635[var5];
                                int var264 = class113.field2635[var5 + 1];
                                class26 var265 = class74.method551(var264, var263, -32540);
                                if (var265 != null && ~var264 != 0) {
                                    class113.field2635[var5++] = 1;
                                    if (!var41) {
                                        class58.field1290 = var265;
                                    } else {
                                        class51.field1153 = var265;
                                    }
                                    continue;
                                }
                                class113.field2635[var5++] = 0;
                                continue;
                            }
                        } else if (var271 >= 1000 && ~var271 > -1101 || var271 >= 2000 && var271 < 2100) {
                            class26 var42;
                            if (~var271 <= -2001) {
                                var271 -= 1000;
                                var10000 = arg1 ^ -1922515019;
                                --var5;
                                var42 = class64.method466(var10000, class113.field2635[var5]);
                            } else {
                                var42 = var41 ? class51.field1153 : class58.field1290;
                            }
                            if (~var271 == -1001) {
                                var5 -= 2;
                                var42.field438 = class113.field2635[var5];
                                var42.field501 = class113.field2635[var5 - -1];
                                class75.method567((byte) 123, var42);
                                continue;
                            }
                            if (~var271 == -1002) {
                                var5 -= 2;
                                var42.field543 = class113.field2635[var5];
                                var42.field513 = class113.field2635[var5 + 1];
                                class75.method567((byte) 124, var42);
                                continue;
                            }
                            if (~var271 == -1004) {
                                --var5;
                                boolean var43 = class113.field2635[var5] == 1;
                                if (!var43 == var42.field522) {
                                    var42.field522 = var43;
                                    class75.method567((byte) 115, var42);
                                }
                                continue;
                            }
                        } else if ((var271 < 1100 || var271 >= 1200) && (var271 < 2100 || var271 >= 2200)) {
                            if (var271 >= 1200 && ~var271 > -1301 || ~var271 <= -2201 && ~var271 > -2301) {
                                class26 var47;
                                if (var271 >= 2000) {
                                    var271 -= 1000;
                                    --var5;
                                    var47 = class64.method466(-1922515024, class113.field2635[var5]);
                                } else {
                                    var47 = var41 ? class51.field1153 : class58.field1290;
                                }
                                class75.method567((byte) 119, var47);
                                if (var271 == 1200) {
                                    var5 -= 2;
                                    int var48 = class113.field2635[var5];
                                    int var49 = class113.field2635[var5 - -1];
                                    var47.field485 = var48;
                                    var47.field450 = var49;
                                    class59 var50 = class73.method524((byte) 90, var48);
                                    var47.field486 = var50.field1312;
                                    var47.field470 = var50.field1313;
                                    var47.field571 = var50.field1325;
                                    var47.field523 = var50.field1339;
                                    var47.field534 = var50.field1319;
                                    if (var47.field543 > 0) {
                                        var47.field523 = var47.field523 * 32 / var47.field543;
                                    }
                                    var47.field536 = var50.field1315;
                                    continue;
                                }
                                if (var271 == 1201) {
                                    var47.field577 = 2;
                                    --var5;
                                    var47.field551 = class113.field2635[var5];
                                    continue;
                                }
                                if (var271 == 1202) {
                                    var47.field577 = 3;
                                    var47.field551 = class116.field2696.field1537.method288((byte) 98);
                                    continue;
                                }
                            } else if (var271 >= 1300 && var271 < 1400 || ~var271 <= -2301 && ~var271 > -2401) {
                                class26 var249;
                                if (~var271 <= -2001) {
                                    var271 -= 1000;
                                    --var5;
                                    var249 = class64.method466(-1922515024, class113.field2635[var5]);
                                } else {
                                    var249 = var41 ? class51.field1153 : class58.field1290;
                                }
                                if (~var271 == -1301) {
                                    --var5;
                                    int var250 = class113.field2635[var5] + -1;
                                    if (var250 >= 0 && ~var250 >= -10) {
                                        --var6;
                                        var249.method172(104, class42.field944[var6], var250);
                                        continue;
                                    }
                                    --var6;
                                    continue;
                                }
                                if (~var271 == -1302) {
                                    var5 -= 2;
                                    int var251 = class113.field2635[var5];
                                    int var252 = class113.field2635[var5 - -1];
                                    var249.field453 = class74.method551(var252, var251, arg1 + -32545);
                                    continue;
                                }
                                if (var271 == 1302) {
                                    --var5;
                                    var249.field467 = class113.field2635[var5] == 1;
                                    continue;
                                }
                                if (var271 == 1303) {
                                    --var5;
                                    var249.field508 = class113.field2635[var5];
                                    continue;
                                }
                                if (var271 == 1304) {
                                    --var5;
                                    var249.field483 = class113.field2635[var5];
                                    continue;
                                }
                                if (var271 == 1305) {
                                    --var6;
                                    var249.field524 = class42.field944[var6];
                                    continue;
                                }
                                if (var271 == 1306) {
                                    --var6;
                                    var249.field472 = class42.field944[var6];
                                    continue;
                                }
                                if (var271 == 1307) {
                                    var249.field480 = null;
                                    continue;
                                }
                            } else {
                                if (var271 >= 1400 && ~var271 > -1501 || var271 >= 2400 && var271 < 2500) {
                                    class26 var51;
                                    if (~var271 > -2001) {
                                        var51 = var41 ? class51.field1153 : class58.field1290;
                                    } else {
                                        --var5;
                                        var51 = class64.method466(-1922515024, class113.field2635[var5]);
                                        var271 -= 1000;
                                    }
                                    int[] var52 = null;
                                    --var6;
                                    class146 var53 = class42.field944[var6];
                                    if (var53.method1080(-1) > 0 && var53.method1089(121, -1 + var53.method1080(-1)) == 89) {
                                        --var5;
                                        int var54 = class113.field2635[var5];
                                        if (~var54 < -1) {
                                            var52 = new int[var54];
                                            while (var54-- > 0) {
                                                --var5;
                                                var52[var54] = class113.field2635[var5];
                                            }
                                        }
                                        var53 = var53.method1105(-1 + var53.method1080(-1), 112, 0);
                                    }
                                    Object[] var55 = new Object[var53.method1080(-1) + 1];
                                    for (int var56 = var55.length + -1; var56 >= 1; --var56) {
                                        if (var53.method1089(95, var56 + -1) == 115) {
                                            --var6;
                                            var55[var56] = class42.field944[var6];
                                        } else {
                                            --var5;
                                            var55[var56] = new Integer(class113.field2635[var5]);
                                        }
                                    }
                                    --var5;
                                    int var57 = class113.field2635[var5];
                                    if (~var57 == 0) {
                                        var55 = null;
                                    } else {
                                        var55[0] = new Integer(var57);
                                    }
                                    if (var271 == 1417) {
                                        var51.field474 = var55;
                                    }
                                    if (var271 == 1401) {
                                        var51.field542 = var55;
                                    }
                                    if (var271 == 1408) {
                                        var51.field457 = var55;
                                    }
                                    if (var271 == 1407) {
                                        var51.field541 = var55;
                                        var51.field546 = var52;
                                    }
                                    if (~var271 == -1410) {
                                        var51.field559 = var55;
                                    }
                                    if (var271 == 1410) {
                                        var51.field535 = var55;
                                    }
                                    if (~var271 == -1424) {
                                        var51.field558 = var55;
                                    }
                                    if (~var271 == -1413) {
                                        var51.field459 = var55;
                                    }
                                    if (~var271 == -1415) {
                                        var51.field475 = var52;
                                        var51.field500 = var55;
                                    }
                                    if (~var271 == -1416) {
                                        var51.field557 = var52;
                                        var51.field579 = var55;
                                    }
                                    if (~var271 == -1404) {
                                        var51.field553 = var55;
                                    }
                                    if (var271 == 1424) {
                                        var51.field548 = var55;
                                    }
                                    if (~var271 == -1421) {
                                        var51.field439 = var55;
                                    }
                                    if (~var271 == -1412) {
                                        var51.field468 = var55;
                                    }
                                    if (~var271 == -1407) {
                                        var51.field538 = var55;
                                    }
                                    if (var271 == 1400) {
                                        var51.field445 = var55;
                                    }
                                    if (var271 == 1419) {
                                        var51.field544 = var55;
                                    }
                                    if (~var271 == -1405) {
                                        var51.field476 = var55;
                                    }
                                    if (var271 == 1402) {
                                        var51.field454 = var55;
                                    }
                                    var51.field478 = true;
                                    if (~var271 == -1419) {
                                        var51.field528 = var55;
                                    }
                                    if (var271 == 1421) {
                                        var51.field575 = var55;
                                    }
                                    if (~var271 == -1417) {
                                        var51.field560 = var55;
                                    }
                                    if (~var271 == -1406) {
                                        var51.field515 = var55;
                                    }
                                    if (var271 == 1422) {
                                        var51.field565 = var55;
                                    }
                                    continue;
                                }
                                if (var271 >= 1600) {
                                    if (~var271 > -1701) {
                                        class26 var58 = !var41 ? class58.field1290 : class51.field1153;
                                        if (~var271 == -1601) {
                                            class113.field2635[var5++] = var58.field502;
                                            continue;
                                        }
                                        if (var271 == 1601) {
                                            class113.field2635[var5++] = var58.field505;
                                            continue;
                                        }
                                        if (var271 == 1602) {
                                            class42.field944[var6++] = var58.field441;
                                            continue;
                                        }
                                        if (var271 == 1603) {
                                            class113.field2635[var5++] = var58.field516;
                                            continue;
                                        }
                                        if (~var271 == -1605) {
                                            class113.field2635[var5++] = var58.field491;
                                            continue;
                                        }
                                        if (var271 == 1605) {
                                            class113.field2635[var5++] = var58.field523;
                                            continue;
                                        }
                                        if (var271 == 1606) {
                                            class113.field2635[var5++] = var58.field534;
                                            continue;
                                        }
                                        if (~var271 == -1608) {
                                            class113.field2635[var5++] = var58.field486;
                                            continue;
                                        }
                                        if (var271 == 1608) {
                                            class113.field2635[var5++] = var58.field470;
                                            continue;
                                        }
                                    } else if (~var271 > -1801) {
                                        class26 var59 = !var41 ? class58.field1290 : class51.field1153;
                                        if (~var271 == -1701) {
                                            class113.field2635[var5++] = var59.field485;
                                            continue;
                                        }
                                        if (var271 == 1701) {
                                            if (var59.field485 == -1) {
                                                class113.field2635[var5++] = 0;
                                            } else {
                                                class113.field2635[var5++] = var59.field450;
                                            }
                                            continue;
                                        }
                                        if (~var271 == -1703) {
                                            class113.field2635[var5++] = var59.field461;
                                            continue;
                                        }
                                    } else if (~var271 <= -1901) {
                                        if (var271 >= 2600) {
                                            if (var271 < 2700) {
                                                var10000 = arg1 ^ -1922515019;
                                                --var5;
                                                class26 var60 = class64.method466(var10000, class113.field2635[var5]);
                                                if (var271 == 2600) {
                                                    class113.field2635[var5++] = var60.field502;
                                                    continue;
                                                }
                                                if (var271 == 2601) {
                                                    class113.field2635[var5++] = var60.field505;
                                                    continue;
                                                }
                                                if (var271 == 2602) {
                                                    class42.field944[var6++] = var60.field441;
                                                    continue;
                                                }
                                                if (var271 == 2603) {
                                                    class113.field2635[var5++] = var60.field516;
                                                    continue;
                                                }
                                                if (~var271 == -2605) {
                                                    class113.field2635[var5++] = var60.field491;
                                                    continue;
                                                }
                                                if (~var271 == -2606) {
                                                    class113.field2635[var5++] = var60.field523;
                                                    continue;
                                                }
                                                if (var271 == 2606) {
                                                    class113.field2635[var5++] = var60.field534;
                                                    continue;
                                                }
                                                if (~var271 == -2608) {
                                                    class113.field2635[var5++] = var60.field486;
                                                    continue;
                                                }
                                                if (~var271 == -2609) {
                                                    class113.field2635[var5++] = var60.field470;
                                                    continue;
                                                }
                                            } else if (~var271 <= -2801) {
                                                if (~var271 <= -2901) {
                                                    if (~var271 > -3201) {
                                                        if (var271 == 3100) {
                                                            --var6;
                                                            class146 var61 = class42.field944[var6];
                                                            class26.method174(0, class17.field256, (byte) -76, var61);
                                                            continue;
                                                        }
                                                        if (~var271 == -3102) {
                                                            var5 -= 2;
                                                            class29.method200(class113.field2635[var5 + 1], (byte) 106, class116.field2696, class113.field2635[var5]);
                                                            continue;
                                                        }
                                                        if (var271 == 3103) {
                                                            class74.method550(true);
                                                            continue;
                                                        }
                                                        if (var271 == 3104) {
                                                            int var62 = 0;
                                                            --var6;
                                                            class146 var63 = class42.field944[var6];
                                                            ++class52.field1187;
                                                            if (var63.method1091(arg1 ^ 10)) {
                                                                var62 = var63.method1113(arg1 + 5);
                                                            }
                                                            class82.field1990.method265((byte) -85, 59);
                                                            class82.field1990.method788(var62, arg1 ^ -730641259);
                                                            continue;
                                                        }
                                                        if (~var271 == -3106) {
                                                            ++class159.field3654;
                                                            --var6;
                                                            class146 var64 = class42.field944[var6];
                                                            class82.field1990.method265((byte) -85, 30);
                                                            class82.field1990.method746(var64.method1101(118), 1101310632);
                                                            continue;
                                                        }
                                                        if (var271 == 3106) {
                                                            ++class47.field1072;
                                                            --var6;
                                                            class146 var65 = class42.field944[var6];
                                                            class82.field1990.method265((byte) -85, 235);
                                                            class82.field1990.method791(false, var65.method1080(-1) - -1);
                                                            class82.field1990.method762(var65, (byte) -124);
                                                            continue;
                                                        }
                                                        if (var271 == 3107) {
                                                            --var5;
                                                            int var66 = class113.field2635[var5];
                                                            --var6;
                                                            class146 var67 = class42.field944[var6];
                                                            class147.method1121(var67, var66, 1);
                                                            continue;
                                                        }
                                                        if (~var271 == -3109) {
                                                            var5 -= 3;
                                                            int var68 = class113.field2635[var5];
                                                            int var69 = class113.field2635[var5 - -2];
                                                            int var70 = class113.field2635[var5 + 1];
                                                            class26 var71 = class64.method466(-1922515024, var69);
                                                            class37.method253(var71, true, var68, var70);
                                                            continue;
                                                        }
                                                        if (var271 == 3109) {
                                                            class26 var72 = !var41 ? class58.field1290 : class51.field1153;
                                                            var5 -= 2;
                                                            int var73 = class113.field2635[var5 + 1];
                                                            int var74 = class113.field2635[var5];
                                                            class37.method253(var72, true, var74, var73);
                                                            continue;
                                                        }
                                                    } else if (~var271 <= -3301) {
                                                        if (~var271 > -3401) {
                                                            if (var271 == 3300) {
                                                                class113.field2635[var5++] = class94.field2229;
                                                                continue;
                                                            }
                                                            if (~var271 == -3302) {
                                                                var5 -= 2;
                                                                int var75 = class113.field2635[var5 + 1];
                                                                int var76 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class94.method738(var76, 0, var75);
                                                                continue;
                                                            }
                                                            if (~var271 == -3303) {
                                                                var5 -= 2;
                                                                int var77 = class113.field2635[var5];
                                                                int var78 = class113.field2635[var5 + 1];
                                                                class113.field2635[var5++] = class13.method74(14217, var78, var77);
                                                                continue;
                                                            }
                                                            if (~var271 == -3304) {
                                                                var5 -= 2;
                                                                int var79 = class113.field2635[var5];
                                                                int var80 = class113.field2635[var5 + 1];
                                                                class113.field2635[var5++] = class35.method231((byte) 125, var79, var80);
                                                                continue;
                                                            }
                                                            if (var271 == 3304) {
                                                                --var5;
                                                                int var81 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class153.method1154((byte) 126, var81).field1276;
                                                                continue;
                                                            }
                                                            if (~var271 == -3306) {
                                                                --var5;
                                                                int var82 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class94.field2218[var82];
                                                                continue;
                                                            }
                                                            if (var271 == 3306) {
                                                                --var5;
                                                                int var83 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class9.field167[var83];
                                                                continue;
                                                            }
                                                            if (~var271 == -3308) {
                                                                --var5;
                                                                int var84 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class64.field1443[var84];
                                                                continue;
                                                            }
                                                            if (var271 == 3308) {
                                                                int var85 = (class116.field2696.field757 >> 7) - -class63.field1429;
                                                                int var86 = (class116.field2696.field790 >> 7) - -class76.field1814;
                                                                int var87 = class148.field3428;
                                                                class113.field2635[var5++] = (var85 << 14) + (var87 << 28) + var86;
                                                                continue;
                                                            }
                                                            if (~var271 == -3310) {
                                                                --var5;
                                                                int var88 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class90.method711(268431546, var88) >> 14;
                                                                continue;
                                                            }
                                                            if (~var271 == -3311) {
                                                                --var5;
                                                                int var89 = class113.field2635[var5];
                                                                class113.field2635[var5++] = var89 >> 28;
                                                                continue;
                                                            }
                                                            if (~var271 == -3312) {
                                                                --var5;
                                                                int var90 = class113.field2635[var5];
                                                                class113.field2635[var5++] = class90.method711(16383, var90);
                                                                continue;
                                                            }
                                                            if (var271 == 3312) {
                                                                class113.field2635[var5++] = class81.field1961 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var271 == -3314) {
                                                                var5 -= 2;
                                                                int var91 = class113.field2635[var5] + 32768;
                                                                int var92 = class113.field2635[var5 + 1];
                                                                class113.field2635[var5++] = class94.method738(var91, class79.method609(arg1, 5), var92);
                                                                continue;
                                                            }
                                                            if (var271 == 3314) {
                                                                var5 -= 2;
                                                                int var93 = class113.field2635[var5 + 1];
                                                                int var94 = class113.field2635[var5] + 32768;
                                                                class113.field2635[var5++] = class13.method74(14217, var93, var94);
                                                                continue;
                                                            }
                                                            if (~var271 == -3316) {
                                                                var5 -= 2;
                                                                int var95 = class113.field2635[var5] + 32768;
                                                                int var96 = class113.field2635[var5 - -1];
                                                                class113.field2635[var5++] = class35.method231((byte) 125, var95, var96);
                                                                continue;
                                                            }
                                                            if (~var271 == -3317) {
                                                                if (class154.field3529 < 2) {
                                                                    class113.field2635[var5++] = 0;
                                                                } else {
                                                                    class113.field2635[var5++] = class154.field3529;
                                                                }
                                                                continue;
                                                            }
                                                            if (var271 == 3317) {
                                                                class113.field2635[var5++] = class38.field863;
                                                                continue;
                                                            }
                                                            if (var271 == 3318) {
                                                                class113.field2635[var5++] = class33.field713;
                                                                continue;
                                                            }
                                                            if (var271 == 3321) {
                                                                class113.field2635[var5++] = class103.field2505;
                                                                continue;
                                                            }
                                                            if (var271 == 3322) {
                                                                class113.field2635[var5++] = class47.field1088;
                                                                continue;
                                                            }
                                                            if (~var271 == -3324) {
                                                                if (~class154.field3529 == -2) {
                                                                    class113.field2635[var5++] = 1;
                                                                } else {
                                                                    class113.field2635[var5++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var271 <= -3501) {
                                                            if (var271 < 3700) {
                                                                if (var271 == 3600) {
                                                                    if (class153.field3522 != 0) {
                                                                        if (~class153.field3522 != -2) {
                                                                            class113.field2635[var5++] = class124.field2892;
                                                                        } else {
                                                                            class113.field2635[var5++] = -1;
                                                                        }
                                                                    } else {
                                                                        class113.field2635[var5++] = -2;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3602) {
                                                                    --var5;
                                                                    int var97 = class113.field2635[var5];
                                                                    if (~class153.field3522 == -3 && ~var97 > ~class124.field2892) {
                                                                        class42.field944[var6++] = class63.field1423[var97];
                                                                        continue;
                                                                    }
                                                                    class42.field944[var6++] = class17.field256;
                                                                    continue;
                                                                }
                                                                if (var271 == 3602) {
                                                                    --var5;
                                                                    int var98 = class113.field2635[var5];
                                                                    if (~class153.field3522 == -3 && ~var98 > ~class124.field2892) {
                                                                        class113.field2635[var5++] = class100.field2433[var98];
                                                                        continue;
                                                                    }
                                                                    class113.field2635[var5++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3604) {
                                                                    --var5;
                                                                    int var99 = class113.field2635[var5];
                                                                    if (~class153.field3522 == -3 && ~var99 > ~class124.field2892) {
                                                                        class113.field2635[var5++] = class111.field2627[var99];
                                                                        continue;
                                                                    }
                                                                    class113.field2635[var5++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3605) {
                                                                    --var5;
                                                                    int var100 = class113.field2635[var5];
                                                                    --var6;
                                                                    class146 var101 = class42.field944[var6];
                                                                    class58.method399(var100, (byte) -102, var101);
                                                                    continue;
                                                                }
                                                                if (var271 == 3605) {
                                                                    --var6;
                                                                    class146 var102 = class42.field944[var6];
                                                                    class33.method223((byte) 104, var102.method1101(123));
                                                                    continue;
                                                                }
                                                                if (~var271 == -3607) {
                                                                    --var6;
                                                                    class146 var103 = class42.field944[var6];
                                                                    class5.method37((byte) 54, var103.method1101(111));
                                                                    continue;
                                                                }
                                                                if (~var271 == -3608) {
                                                                    --var6;
                                                                    class146 var104 = class42.field944[var6];
                                                                    class3.method19(var104.method1101(127), false);
                                                                    continue;
                                                                }
                                                                if (~var271 == -3609) {
                                                                    --var6;
                                                                    class146 var105 = class42.field944[var6];
                                                                    class82.method623(var105.method1101(arg1 ^ -20), arg1 ^ 4);
                                                                    continue;
                                                                }
                                                                if (~var271 == -3610) {
                                                                    --var6;
                                                                    class146 var106 = class42.field944[var6];
                                                                    if (var106.method1098(class105.field2520, true) || var106.method1098(class3.field90, true)) {
                                                                        var106 = var106.method1103(true, 7);
                                                                    }
                                                                    class113.field2635[var5++] = !class113.method878(arg1 + -4514, var106) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3612) {
                                                                    if (class71.field1645 == null) {
                                                                        class42.field944[var6++] = class17.field256;
                                                                    } else {
                                                                        class42.field944[var6++] = class71.field1645.method1087(false);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3613) {
                                                                    if (class71.field1645 != null) {
                                                                        class113.field2635[var5++] = client.field350;
                                                                    } else {
                                                                        class113.field2635[var5++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3614) {
                                                                    --var5;
                                                                    int var107 = class113.field2635[var5];
                                                                    if (class71.field1645 != null && var107 < client.field350) {
                                                                        class42.field944[var6++] = class32.field672[var107].field3044.method1087(false);
                                                                        continue;
                                                                    }
                                                                    class42.field944[var6++] = class17.field256;
                                                                    continue;
                                                                }
                                                                if (var271 == 3614) {
                                                                    --var5;
                                                                    int var108 = class113.field2635[var5];
                                                                    if (class71.field1645 != null && ~var108 > ~client.field350) {
                                                                        class113.field2635[var5++] = class32.field672[var108].field3046;
                                                                        continue;
                                                                    }
                                                                    class113.field2635[var5++] = 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 3615) {
                                                                    --var5;
                                                                    int var109 = class113.field2635[var5];
                                                                    if (class71.field1645 != null && client.field350 > var109) {
                                                                        class113.field2635[var5++] = class32.field672[var109].field3053;
                                                                        continue;
                                                                    }
                                                                    class113.field2635[var5++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3617) {
                                                                    class113.field2635[var5++] = class72.field1694;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3618) {
                                                                    --var6;
                                                                    class146 var110 = class42.field944[var6];
                                                                    class92.method734((byte) -128, var110);
                                                                    continue;
                                                                }
                                                                if (~var271 == -3619) {
                                                                    class113.field2635[var5++] = class59.field1367;
                                                                    continue;
                                                                }
                                                                if (var271 == 3619) {
                                                                    --var6;
                                                                    class146 var111 = class42.field944[var6];
                                                                    class37.method245(29690, var111.method1101(arg1 ^ 127));
                                                                    continue;
                                                                }
                                                                if (var271 == 3620) {
                                                                    class143.method1060((byte) -44);
                                                                    continue;
                                                                }
                                                                if (var271 == 3621) {
                                                                    if (class153.field3522 == 0) {
                                                                        class113.field2635[var5++] = -1;
                                                                    } else {
                                                                        class113.field2635[var5++] = class54.field1233;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var271 == 3622) {
                                                                    --var5;
                                                                    int var112 = class113.field2635[var5];
                                                                    if (class153.field3522 != 0 && ~var112 > ~class54.field1233) {
                                                                        class42.field944[var6++] = class68.method483(37, class37.field838[var112]).method1087(false);
                                                                        continue;
                                                                    }
                                                                    class42.field944[var6++] = class17.field256;
                                                                    continue;
                                                                }
                                                                if (var271 == 3623) {
                                                                    --var6;
                                                                    class146 var113 = class42.field944[var6];
                                                                    if (var113.method1098(class105.field2520, true) || var113.method1098(class3.field90, true)) {
                                                                        var113 = var113.method1103(true, 7);
                                                                    }
                                                                    class113.field2635[var5++] = !class54.method364(5, var113) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var271 == 3624) {
                                                                    --var5;
                                                                    int var114 = class113.field2635[var5];
                                                                    if (class32.field672 != null && ~client.field350 < ~var114 && class32.field672[var114].field3044.method1111(class116.field2696.field1506, -41)) {
                                                                        class113.field2635[var5++] = 1;
                                                                        continue;
                                                                    }
                                                                    class113.field2635[var5++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3626) {
                                                                    if (class125.field2895 == null) {
                                                                        class42.field944[var6++] = class17.field256;
                                                                    } else {
                                                                        class42.field944[var6++] = class125.field2895.method1087(false);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var271 > -4101) {
                                                                if (var271 == 4000) {
                                                                    var5 -= 2;
                                                                    int var115 = class113.field2635[var5];
                                                                    int var116 = class113.field2635[var5 - -1];
                                                                    class113.field2635[var5++] = var115 + var116;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4002) {
                                                                    var5 -= 2;
                                                                    int var117 = class113.field2635[var5];
                                                                    int var118 = class113.field2635[var5 + 1];
                                                                    class113.field2635[var5++] = -var118 + var117;
                                                                    continue;
                                                                }
                                                                if (var271 == 4002) {
                                                                    var5 -= 2;
                                                                    int var119 = class113.field2635[var5];
                                                                    int var120 = class113.field2635[var5 - -1];
                                                                    class113.field2635[var5++] = var119 * var120;
                                                                    continue;
                                                                }
                                                                if (var271 == 4003) {
                                                                    var5 -= 2;
                                                                    int var121 = class113.field2635[var5 - -1];
                                                                    int var122 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = var122 / var121;
                                                                    continue;
                                                                }
                                                                if (var271 == 4004) {
                                                                    --var5;
                                                                    int var123 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = (int) ((double) var123 * Math.random());
                                                                    continue;
                                                                }
                                                                if (~var271 == -4006) {
                                                                    --var5;
                                                                    int var124 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = (int) ((double) (var124 + 1) * Math.random());
                                                                    continue;
                                                                }
                                                                if (var271 == 4006) {
                                                                    var5 -= 5;
                                                                    int var125 = class113.field2635[var5 + 2];
                                                                    int var126 = class113.field2635[var5 + 1];
                                                                    int var127 = class113.field2635[var5 + 3];
                                                                    int var128 = class113.field2635[var5];
                                                                    int var129 = class113.field2635[var5 + 4];
                                                                    class113.field2635[var5++] = var128 - -((-var125 + var129) * (-var128 + var126) / (-var125 + var127));
                                                                    continue;
                                                                }
                                                                if (~var271 == -4008) {
                                                                    var5 -= 2;
                                                                    int var130 = class113.field2635[var5];
                                                                    int var131 = class113.field2635[var5 - -1];
                                                                    class113.field2635[var5++] = var130 * var131 / 100 + var130;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4009) {
                                                                    var5 -= 2;
                                                                    int var132 = class113.field2635[var5];
                                                                    int var133 = class113.field2635[var5 - -1];
                                                                    class113.field2635[var5++] = class127.method943(1 << var133, var132);
                                                                    continue;
                                                                }
                                                                if (var271 == 4009) {
                                                                    var5 -= 2;
                                                                    int var134 = class113.field2635[var5];
                                                                    int var135 = class113.field2635[var5 + 1];
                                                                    class113.field2635[var5++] = class90.method711(-1 - (1 << var135), var134);
                                                                    continue;
                                                                }
                                                                if (var271 == 4010) {
                                                                    var5 -= 2;
                                                                    int var136 = class113.field2635[var5];
                                                                    int var137 = class113.field2635[var5 + 1];
                                                                    class113.field2635[var5++] = ~class90.method711(1 << var137, var136) == -1 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4012) {
                                                                    var5 -= 2;
                                                                    int var138 = class113.field2635[var5];
                                                                    int var139 = class113.field2635[var5 + 1];
                                                                    class113.field2635[var5++] = var138 % var139;
                                                                    continue;
                                                                }
                                                                if (var271 == 4012) {
                                                                    var5 -= 2;
                                                                    int var140 = class113.field2635[var5];
                                                                    int var141 = class113.field2635[var5 - -1];
                                                                    if (~var140 == -1) {
                                                                        class113.field2635[var5++] = 0;
                                                                    } else {
                                                                        class113.field2635[var5++] = (int) Math.pow((double) var140, (double) var141);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -4014) {
                                                                    var5 -= 2;
                                                                    int var142 = class113.field2635[var5];
                                                                    int var143 = class113.field2635[var5 + 1];
                                                                    if (var142 != 0) {
                                                                        if (var143 == 0) {
                                                                            class113.field2635[var5++] = Integer.MAX_VALUE;
                                                                        } else {
                                                                            class113.field2635[var5++] = (int) Math.pow((double) var142, 1.0D / (double) var143);
                                                                        }
                                                                    } else {
                                                                        class113.field2635[var5++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var271 == 4014) {
                                                                    var5 -= 2;
                                                                    int var144 = class113.field2635[var5 + 1];
                                                                    int var145 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = class90.method711(var145, var144);
                                                                    continue;
                                                                }
                                                                if (var271 == 4015) {
                                                                    var5 -= 2;
                                                                    int var146 = class113.field2635[var5];
                                                                    int var147 = class113.field2635[var5 + 1];
                                                                    class113.field2635[var5++] = class127.method943(var146, var147);
                                                                    continue;
                                                                }
                                                            } else if (var271 >= 4200) {
                                                                if (var271 < 4300) {
                                                                    if (~var271 == -4201) {
                                                                        --var5;
                                                                        int var148 = class113.field2635[var5];
                                                                        class42.field944[var6++] = class73.method524((byte) 104, var148).field1338;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4201) {
                                                                        var5 -= 2;
                                                                        int var149 = class113.field2635[var5];
                                                                        int var150 = class113.field2635[var5 - -1];
                                                                        class59 var151 = class73.method524((byte) 98, var149);
                                                                        if (var150 >= 1 && var150 <= 5 && var151.field1372[var150 - 1] != null) {
                                                                            class42.field944[var6++] = var151.field1372[var150 + -1];
                                                                            continue;
                                                                        }
                                                                        class42.field944[var6++] = class17.field256;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4202) {
                                                                        var5 -= 2;
                                                                        int var152 = class113.field2635[var5 - -1];
                                                                        int var153 = class113.field2635[var5];
                                                                        class59 var154 = class73.method524((byte) 126, var153);
                                                                        if (~var152 <= -2 && var152 <= 5 && var154.field1321[var152 - 1] != null) {
                                                                            class42.field944[var6++] = var154.field1321[var152 + -1];
                                                                            continue;
                                                                        }
                                                                        class42.field944[var6++] = class17.field256;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4204) {
                                                                        --var5;
                                                                        int var155 = class113.field2635[var5];
                                                                        class113.field2635[var5++] = class73.method524((byte) 98, var155).field1374;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4205) {
                                                                        --var5;
                                                                        int var156 = class113.field2635[var5];
                                                                        class113.field2635[var5++] = class73.method524((byte) 75, var156).field1344 == 1 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4205) {
                                                                        --var5;
                                                                        int var157 = class113.field2635[var5];
                                                                        class59 var158 = class73.method524((byte) 102, var157);
                                                                        if (~var158.field1333 == 0 && var158.field1353 >= 0) {
                                                                            class113.field2635[var5++] = var158.field1353;
                                                                            continue;
                                                                        }
                                                                        class113.field2635[var5++] = var157;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4206) {
                                                                        --var5;
                                                                        int var159 = class113.field2635[var5];
                                                                        class59 var160 = class73.method524((byte) 66, var159);
                                                                        if (~var160.field1333 <= -1 && ~var160.field1353 <= -1) {
                                                                            class113.field2635[var5++] = var160.field1353;
                                                                            continue;
                                                                        }
                                                                        class113.field2635[var5++] = var159;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4207) {
                                                                        --var5;
                                                                        int var161 = class113.field2635[var5];
                                                                        class113.field2635[var5++] = class73.method524((byte) 105, var161).field1320 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                } else if (~var271 > -5101) {
                                                                    if (~var271 == -5001) {
                                                                        class113.field2635[var5++] = class26.field520;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 5001) {
                                                                        ++class97.field2343;
                                                                        var5 -= 3;
                                                                        class26.field520 = class113.field2635[var5];
                                                                        class54.field1238 = class113.field2635[var5 + 1];
                                                                        class31.field655 = class113.field2635[var5 + 2];
                                                                        class82.field1990.method265((byte) -85, 121);
                                                                        class82.field1990.method791(false, class26.field520);
                                                                        class82.field1990.method791(false, class54.field1238);
                                                                        class82.field1990.method791(false, class31.field655);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 5002) {
                                                                        var5 -= 2;
                                                                        ++class20.field311;
                                                                        int var162 = class113.field2635[var5];
                                                                        --var6;
                                                                        class146 var163 = class42.field944[var6];
                                                                        int var164 = class113.field2635[var5 - -1];
                                                                        class82.field1990.method265((byte) -85, 147);
                                                                        class82.field1990.method746(var163.method1101(123), arg1 ^ 1101310637);
                                                                        class82.field1990.method791(false, var162 + -1);
                                                                        class82.field1990.method791(false, var164);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 5003) {
                                                                        class146 var165 = null;
                                                                        --var5;
                                                                        int var166 = class113.field2635[var5];
                                                                        if (~var166 > -101) {
                                                                            var165 = class76.field1805[var166];
                                                                        }
                                                                        if (var165 == null) {
                                                                            var165 = class17.field256;
                                                                        }
                                                                        class42.field944[var6++] = var165;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5005) {
                                                                        int var167 = -1;
                                                                        --var5;
                                                                        int var168 = class113.field2635[var5];
                                                                        if (~var168 > -101 && class76.field1805[var168] != null) {
                                                                            var167 = class94.field2238[var168];
                                                                        }
                                                                        class113.field2635[var5++] = var167;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5006) {
                                                                        class113.field2635[var5++] = class54.field1238;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 5008) {
                                                                        --var6;
                                                                        class146 var169 = class42.field944[var6];
                                                                        if (var169.method1098(class71.field1643, true)) {
                                                                            class124.method932(var169, (byte) 53);
                                                                        } else {
                                                                            ++class105.field2526;
                                                                            class146 var170 = var169.method1083(-66);
                                                                            byte var171 = 0;
                                                                            byte var172 = 0;
                                                                            if (!var170.method1098(class82.field2001, true)) {
                                                                                if (!var170.method1098(class32.field669, true)) {
                                                                                    if (!var170.method1098(class107.field2569, true)) {
                                                                                        if (var170.method1098(class63.field1425, true)) {
                                                                                            var172 = 3;
                                                                                            var169 = var169.method1103(true, class63.field1425.method1080(-1));
                                                                                        } else if (var170.method1098(class63.field1417, true)) {
                                                                                            var169 = var169.method1103(true, class63.field1417.method1080(-1));
                                                                                            var172 = 4;
                                                                                        } else if (var170.method1098(class12.field196, true)) {
                                                                                            var172 = 5;
                                                                                            var169 = var169.method1103(true, class12.field196.method1080(arg1 ^ -6));
                                                                                        } else if (var170.method1098(class75.field1794, true)) {
                                                                                            var172 = 6;
                                                                                            var169 = var169.method1103(true, class75.field1794.method1080(-1));
                                                                                        } else if (var170.method1098(class46.field1062, true)) {
                                                                                            var172 = 7;
                                                                                            var169 = var169.method1103(true, class46.field1062.method1080(-1));
                                                                                        } else if (!var170.method1098(class18.field291, true)) {
                                                                                            if (var170.method1098(class22.field377, true)) {
                                                                                                var169 = var169.method1103(true, class22.field377.method1080(-1));
                                                                                                var172 = 9;
                                                                                            } else if (var170.method1098(class54.field1240, true)) {
                                                                                                var172 = 10;
                                                                                                var169 = var169.method1103(true, class54.field1240.method1080(arg1 ^ -6));
                                                                                            } else if (!var170.method1098(class146.field3359, true)) {
                                                                                                if (class67.field1505 != 0) {
                                                                                                    if (var170.method1098(class82.field2004, true)) {
                                                                                                        var172 = 0;
                                                                                                        var169 = var169.method1103(true, class82.field2004.method1080(-1));
                                                                                                    } else if (var170.method1098(class32.field676, true)) {
                                                                                                        var172 = 1;
                                                                                                        var169 = var169.method1103(true, class32.field676.method1080(arg1 ^ -6));
                                                                                                    } else if (!var170.method1098(class107.field2550, true)) {
                                                                                                        if (!var170.method1098(class63.field1431, true)) {
                                                                                                            if (!var170.method1098(class63.field1427, true)) {
                                                                                                                if (var170.method1098(class12.field193, true)) {
                                                                                                                    var169 = var169.method1103(true, class12.field193.method1080(arg1 ^ -6));
                                                                                                                    var172 = 5;
                                                                                                                } else if (var170.method1098(class75.field1793, true)) {
                                                                                                                    var172 = 6;
                                                                                                                    var169 = var169.method1103(true, class75.field1793.method1080(-1));
                                                                                                                } else if (!var170.method1098(class46.field1060, true)) {
                                                                                                                    if (!var170.method1098(class18.field283, true)) {
                                                                                                                        if (!var170.method1098(class22.field379, true)) {
                                                                                                                            if (var170.method1098(class54.field1250, true)) {
                                                                                                                                var172 = 10;
                                                                                                                                var169 = var169.method1103(true, class54.field1250.method1080(-1));
                                                                                                                            } else if (var170.method1098(class146.field3333, true)) {
                                                                                                                                var169 = var169.method1103(true, class146.field3333.method1080(-1));
                                                                                                                                var172 = 11;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var172 = 9;
                                                                                                                            var169 = var169.method1103(true, class22.field379.method1080(arg1 ^ -6));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var169 = var169.method1103(true, class18.field283.method1080(-1));
                                                                                                                        var172 = 8;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var172 = 7;
                                                                                                                    var169 = var169.method1103(true, class46.field1060.method1080(-1));
                                                                                                                }
                                                                                                            } else {
                                                                                                                var172 = 4;
                                                                                                                var169 = var169.method1103(true, class63.field1427.method1080(-1));
                                                                                                            }
                                                                                                        } else {
                                                                                                            var169 = var169.method1103(true, class63.field1431.method1080(-1));
                                                                                                            var172 = 3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var172 = 2;
                                                                                                        var169 = var169.method1103(true, class107.field2550.method1080(-1));
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var169 = var169.method1103(true, class146.field3359.method1080(-1));
                                                                                                var172 = 11;
                                                                                            }
                                                                                        } else {
                                                                                            var172 = 8;
                                                                                            var169 = var169.method1103(true, class18.field291.method1080(-1));
                                                                                        }
                                                                                    } else {
                                                                                        var169 = var169.method1103(true, class107.field2569.method1080(-1));
                                                                                        var172 = 2;
                                                                                    }
                                                                                } else {
                                                                                    var169 = var169.method1103(true, class32.field669.method1080(arg1 + -6));
                                                                                    var172 = 1;
                                                                                }
                                                                            } else {
                                                                                var172 = 0;
                                                                                var169 = var169.method1103(true, class82.field2001.method1080(arg1 + -6));
                                                                            }
                                                                            class146 var173 = var169.method1083(-66);
                                                                            if (var173.method1098(class122.field2843, true)) {
                                                                                var171 = 1;
                                                                                var169 = var169.method1103(true, class122.field2843.method1080(-1));
                                                                            } else if (!var173.method1098(class17.field279, true)) {
                                                                                if (var173.method1098(class107.field2560, true)) {
                                                                                    var171 = 3;
                                                                                    var169 = var169.method1103(true, class107.field2560.method1080(-1));
                                                                                } else if (var173.method1098(class103.field2516, true)) {
                                                                                    var171 = 4;
                                                                                    var169 = var169.method1103(true, class103.field2516.method1080(-1));
                                                                                } else if (!var173.method1098(class98.field2371, true)) {
                                                                                    if (class67.field1505 != 0) {
                                                                                        if (var173.method1098(class122.field2849, true)) {
                                                                                            var169 = var169.method1103(true, class122.field2849.method1080(-1));
                                                                                            var171 = 1;
                                                                                        } else if (var173.method1098(class17.field267, true)) {
                                                                                            var171 = 2;
                                                                                            var169 = var169.method1103(true, class17.field267.method1080(-1));
                                                                                        } else if (!var173.method1098(class107.field2548, true)) {
                                                                                            if (var173.method1098(class103.field2515, true)) {
                                                                                                var171 = 4;
                                                                                                var169 = var169.method1103(true, class103.field2515.method1080(-1));
                                                                                            } else if (var173.method1098(class98.field2368, true)) {
                                                                                                var169 = var169.method1103(true, class98.field2368.method1080(-1));
                                                                                                var171 = 5;
                                                                                            }
                                                                                        } else {
                                                                                            var171 = 3;
                                                                                            var169 = var169.method1103(true, class107.field2548.method1080(arg1 + -6));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var171 = 5;
                                                                                    var169 = var169.method1103(true, class98.field2371.method1080(-1));
                                                                                }
                                                                            } else {
                                                                                var171 = 2;
                                                                                var169 = var169.method1103(true, class17.field279.method1080(-1));
                                                                            }
                                                                            class82.field1990.method265((byte) -85, 226);
                                                                            class82.field1990.method791(false, 0);
                                                                            int var174 = class82.field1990.field2304;
                                                                            class82.field1990.method791(false, var172);
                                                                            class82.field1990.method791(false, var171);
                                                                            class47.method330(-127, class82.field1990, var169);
                                                                            class82.field1990.method749(class82.field1990.field2304 - var174, (byte) -128);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5010) {
                                                                        var6 -= 2;
                                                                        ++class81.field1972;
                                                                        class146 var175 = class42.field944[var6];
                                                                        class146 var176 = class42.field944[var6 + 1];
                                                                        class82.field1990.method265((byte) -85, 179);
                                                                        class82.field1990.method791(false, 0);
                                                                        int var177 = class82.field1990.field2304;
                                                                        class82.field1990.method746(var175.method1101(-21), 1101310632);
                                                                        class47.method330(-128, class82.field1990, var176);
                                                                        class82.field1990.method749(class82.field1990.field2304 - var177, (byte) 115);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 5010) {
                                                                        --var5;
                                                                        int var178 = class113.field2635[var5];
                                                                        class146 var179 = null;
                                                                        if (var178 < 100) {
                                                                            var179 = class42.field968[var178];
                                                                        }
                                                                        if (var179 == null) {
                                                                            var179 = class17.field256;
                                                                        }
                                                                        class42.field944[var6++] = var179;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5012) {
                                                                        --var5;
                                                                        int var180 = class113.field2635[var5];
                                                                        class146 var181 = null;
                                                                        if (~var180 > -101) {
                                                                            var181 = class132.field3006[var180];
                                                                        }
                                                                        if (var181 == null) {
                                                                            var181 = class17.field256;
                                                                        }
                                                                        class42.field944[var6++] = var181;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5016) {
                                                                        class146 var182;
                                                                        if (class116.field2696 != null && class116.field2696.field1506 != null) {
                                                                            var182 = class116.field2696.field1506;
                                                                        } else {
                                                                            var182 = class134.field3057;
                                                                        }
                                                                        class42.field944[var6++] = var182;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5017) {
                                                                        class113.field2635[var5++] = class31.field655;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -5018) {
                                                                        class113.field2635[var5++] = class88.field2084;
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var271 == -4101) {
                                                                    --var5;
                                                                    int var183 = class113.field2635[var5];
                                                                    --var6;
                                                                    class146 var184 = class42.field944[var6];
                                                                    class42.field944[var6++] = class71.method509(new class146[] { var184, class75.method564(false, var183) }, (byte) -105);
                                                                    continue;
                                                                }
                                                                if (var271 == 4101) {
                                                                    var6 -= 2;
                                                                    class146 var185 = class42.field944[var6 + 1];
                                                                    class146 var186 = class42.field944[var6];
                                                                    class42.field944[var6++] = class71.method509(new class146[] { var186, var185 }, (byte) 101);
                                                                    continue;
                                                                }
                                                                if (var271 == 4102) {
                                                                    --var6;
                                                                    class146 var187 = class42.field944[var6];
                                                                    --var5;
                                                                    int var188 = class113.field2635[var5];
                                                                    class42.field944[var6++] = class71.method509(new class146[] { var187, class9.method65(var188, true, false) }, (byte) -113);
                                                                    continue;
                                                                }
                                                                if (var271 == 4103) {
                                                                    --var6;
                                                                    class146 var189 = class42.field944[var6];
                                                                    class42.field944[var6++] = var189.method1083(-66);
                                                                    continue;
                                                                }
                                                                if (var271 == 4104) {
                                                                    --var5;
                                                                    int var190 = class113.field2635[var5];
                                                                    long var191 = ((long) var190 + 11745L) * 86400000L;
                                                                    class24.field386.setTime(new Date(var191));
                                                                    int var193 = class24.field386.get(5);
                                                                    int var194 = class24.field386.get(2);
                                                                    int var195 = class24.field386.get(1);
                                                                    class42.field944[var6++] = class71.method509(new class146[] { class75.method564(false, var193), class87.field2068, class94.field2248[var194], class87.field2068, class75.method564(false, var195) }, (byte) -116);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4106) {
                                                                    var6 -= 2;
                                                                    class146 var196 = class42.field944[var6];
                                                                    class146 var197 = class42.field944[var6 + 1];
                                                                    if (class116.field2696.field1537 != null && class116.field2696.field1537.field946) {
                                                                        class42.field944[var6++] = var197;
                                                                        continue;
                                                                    }
                                                                    class42.field944[var6++] = var196;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4107) {
                                                                    --var5;
                                                                    int var198 = class113.field2635[var5];
                                                                    class42.field944[var6++] = class75.method564(false, var198);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4108) {
                                                                    var6 -= 2;
                                                                    class113.field2635[var5++] = class42.field944[var6].method1092((byte) 72, class42.field944[var6 - -1]);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4109) {
                                                                    --var6;
                                                                    class146 var199 = class42.field944[var6];
                                                                    var5 -= 2;
                                                                    int var200 = class113.field2635[var5];
                                                                    int var201 = class113.field2635[var5 - -1];
                                                                    byte[] var202 = class79.field1943.method585(var201, arg1 ^ 126, 0);
                                                                    class85 var203 = new class85(var202);
                                                                    class113.field2635[var5++] = var203.method812(var199, var200);
                                                                    continue;
                                                                }
                                                                if (var271 == 4109) {
                                                                    var5 -= 2;
                                                                    int var204 = class113.field2635[var5];
                                                                    --var6;
                                                                    class146 var205 = class42.field944[var6];
                                                                    int var206 = class113.field2635[var5 + 1];
                                                                    byte[] var207 = class79.field1943.method585(var206, 121, 0);
                                                                    class85 var208 = new class85(var207);
                                                                    class113.field2635[var5++] = var208.method822(var205, var204);
                                                                    continue;
                                                                }
                                                                if (var271 == 4110) {
                                                                    var6 -= 2;
                                                                    class146 var209 = class42.field944[var6];
                                                                    class146 var210 = class42.field944[var6 + 1];
                                                                    --var5;
                                                                    if (class113.field2635[var5] != 1) {
                                                                        class42.field944[var6++] = var210;
                                                                    } else {
                                                                        class42.field944[var6++] = var209;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var271 == 4111) {
                                                                    --var6;
                                                                    class146 var211 = class42.field944[var6];
                                                                    class42.field944[var6++] = class99.method821(var211);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4113) {
                                                                    --var6;
                                                                    class146 var212 = class42.field944[var6];
                                                                    --var5;
                                                                    int var213 = class113.field2635[var5];
                                                                    class42.field944[var6++] = var212.method1096((byte) -83, var213);
                                                                    continue;
                                                                }
                                                                if (var271 == 4113) {
                                                                    --var5;
                                                                    int var214 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = !class89.method704(true, var214) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var271 == 4114) {
                                                                    --var5;
                                                                    int var215 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = class120.method913(var215, -28) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 4115) {
                                                                    --var5;
                                                                    int var216 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = !class83.method628(false, var216) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var271 == 4116) {
                                                                    --var5;
                                                                    int var217 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = class46.method319(var217, arg1 + -54) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 4117) {
                                                                    --var6;
                                                                    class146 var218 = class42.field944[var6];
                                                                    if (var218 != null) {
                                                                        class113.field2635[var5++] = var218.method1080(-1);
                                                                    } else {
                                                                        class113.field2635[var5++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var271 == 4118) {
                                                                    var5 -= 2;
                                                                    int var219 = class113.field2635[var5];
                                                                    int var220 = class113.field2635[var5 + 1];
                                                                    --var6;
                                                                    class146 var221 = class42.field944[var6];
                                                                    class42.field944[var6++] = var221.method1105(var220, -71, var219);
                                                                    continue;
                                                                }
                                                                if (var271 == 4119) {
                                                                    --var6;
                                                                    class146 var222 = class42.field944[var6];
                                                                    class146 var223 = class64.method462(var222.method1080(-1), 0);
                                                                    boolean var224 = false;
                                                                    for (int var225 = 0; ~var222.method1080(-1) < ~var225; ++var225) {
                                                                        int var226 = var222.method1089(arg1 ^ 98, var225);
                                                                        if (~var226 == -61) {
                                                                            var224 = true;
                                                                        } else if (~var226 == -63) {
                                                                            var224 = false;
                                                                        } else if (!var224) {
                                                                            var223.method1117((byte) -31, var226);
                                                                        }
                                                                    }
                                                                    var223.method1084((byte) 109);
                                                                    class42.field944[var6++] = var223;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4121) {
                                                                    --var6;
                                                                    class146 var227 = class42.field944[var6];
                                                                    --var5;
                                                                    int var228 = class113.field2635[var5];
                                                                    class113.field2635[var5++] = var227.method1088(var228, 29054);
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (var271 == 3400) {
                                                                var5 -= 2;
                                                                int var229 = class113.field2635[var5];
                                                                int var230 = class113.field2635[var5 + 1];
                                                                class97 var231 = class141.method1055(var229, false);
                                                                for (int var232 = 0; var232 < var231.field2350; ++var232) {
                                                                    if (var231.field2354[var232] == var230) {
                                                                        class42.field944[var6++] = var231.field2348[var232];
                                                                        var231 = null;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var231 != null) {
                                                                    class42.field944[var6++] = var231.field2346;
                                                                }
                                                                continue;
                                                            }
                                                            if (var271 == 3408) {
                                                                var5 -= 4;
                                                                int var233 = class113.field2635[var5];
                                                                int var234 = class113.field2635[var5 + 2];
                                                                int var235 = class113.field2635[var5 + 1];
                                                                int var236 = class113.field2635[var5 + 3];
                                                                class97 var237 = class141.method1055(var234, false);
                                                                if (~var237.field2352 == ~var233 && var237.field2338 == var235) {
                                                                    for (int var238 = 0; ~var237.field2350 < ~var238; ++var238) {
                                                                        if (~var237.field2354[var238] == ~var236) {
                                                                            if (~var235 != -116) {
                                                                                class113.field2635[var5++] = var237.field2341[var238];
                                                                            } else {
                                                                                class42.field944[var6++] = var237.field2348[var238];
                                                                            }
                                                                            var237 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var237 != null) {
                                                                        if (var235 == 115) {
                                                                            class42.field944[var6++] = var237.field2346;
                                                                        } else {
                                                                            class113.field2635[var5++] = var237.field2358;
                                                                        }
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var235 != 115) {
                                                                    class113.field2635[var5++] = 0;
                                                                } else {
                                                                    class42.field944[var6++] = class48.field1094;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (~var271 == -3201) {
                                                            var5 -= 3;
                                                            class110.method870(class113.field2635[var5], class113.field2635[var5 + 2], class113.field2635[var5 + 1], (byte) 116);
                                                            continue;
                                                        }
                                                        if (var271 == 3201) {
                                                            --var5;
                                                            class152.method1144(class113.field2635[var5], 116);
                                                            continue;
                                                        }
                                                        if (var271 == 3202) {
                                                            var5 -= 2;
                                                            class3.method18(0, class113.field2635[var5], class113.field2635[var5 + 1]);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var5;
                                                    class26 var239 = class64.method466(-1922515024, class113.field2635[var5]);
                                                    if (~var271 == -2801) {
                                                        class113.field2635[var5++] = class146.method1118(class42.method281(var239, 1299495520), (byte) -109);
                                                        continue;
                                                    }
                                                    if (var271 == 2801) {
                                                        --var5;
                                                        int var240 = class113.field2635[var5];
                                                        int var272 = var240 - 1;
                                                        if (var239.field480 != null && ~var272 > ~var239.field480.length && var239.field480[var272] != null) {
                                                            class42.field944[var6++] = var239.field480[var272];
                                                            continue;
                                                        }
                                                        class42.field944[var6++] = class17.field256;
                                                        continue;
                                                    }
                                                    if (~var271 == -2803) {
                                                        if (var239.field524 == null) {
                                                            class42.field944[var6++] = class17.field256;
                                                        } else {
                                                            class42.field944[var6++] = var239.field524;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var271 == 2700) {
                                                    --var5;
                                                    class26 var241 = class64.method466(-1922515024, class113.field2635[var5]);
                                                    class113.field2635[var5++] = var241.field485;
                                                    continue;
                                                }
                                                if (var271 == 2701) {
                                                    --var5;
                                                    class26 var242 = class64.method466(-1922515024, class113.field2635[var5]);
                                                    if (var242.field485 == -1) {
                                                        class113.field2635[var5++] = 0;
                                                    } else {
                                                        class113.field2635[var5++] = var242.field450;
                                                    }
                                                    continue;
                                                }
                                                if (~var271 == -2703) {
                                                    --var5;
                                                    int var243 = class113.field2635[var5];
                                                    class94 var244 = (class94) class51.field1159.method332((byte) -79, (long) var243);
                                                    if (var244 == null) {
                                                        class113.field2635[var5++] = 0;
                                                    } else {
                                                        class113.field2635[var5++] = 1;
                                                    }
                                                    continue;
                                                }
                                            }
                                        } else {
                                            var10000 = arg1 + -1922515029;
                                            --var5;
                                            class26 var245 = class64.method466(var10000, class113.field2635[var5]);
                                            if (var271 == 2500) {
                                                class113.field2635[var5++] = var245.field438;
                                                continue;
                                            }
                                            if (~var271 == -2502) {
                                                class113.field2635[var5++] = var245.field501;
                                                continue;
                                            }
                                            if (var271 == 2502) {
                                                class113.field2635[var5++] = var245.field543;
                                                continue;
                                            }
                                            if (var271 == 2503) {
                                                class113.field2635[var5++] = var245.field513;
                                                continue;
                                            }
                                            if (var271 == 2504) {
                                                class113.field2635[var5++] = !var245.field522 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var271 == -2506) {
                                                class113.field2635[var5++] = var245.field498;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class26 var246 = var41 ? class51.field1153 : class58.field1290;
                                        if (var271 == 1800) {
                                            class113.field2635[var5++] = class146.method1118(class42.method281(var246, 1299495520), (byte) -102);
                                            continue;
                                        }
                                        if (var271 == 1801) {
                                            --var5;
                                            int var247 = class113.field2635[var5];
                                            int var273 = var247 - 1;
                                            if (var246.field480 != null && var246.field480.length > var273 && var246.field480[var273] != null) {
                                                class42.field944[var6++] = var246.field480[var273];
                                                continue;
                                            }
                                            class42.field944[var6++] = class17.field256;
                                            continue;
                                        }
                                        if (var271 == 1802) {
                                            if (var246.field524 != null) {
                                                class42.field944[var6++] = var246.field524;
                                            } else {
                                                class42.field944[var6++] = class17.field256;
                                            }
                                            continue;
                                        }
                                    }
                                } else {
                                    class26 var248 = !var41 ? class58.field1290 : class51.field1153;
                                    if (~var271 == -1501) {
                                        class113.field2635[var5++] = var248.field438;
                                        continue;
                                    }
                                    if (~var271 == -1502) {
                                        class113.field2635[var5++] = var248.field501;
                                        continue;
                                    }
                                    if (~var271 == -1503) {
                                        class113.field2635[var5++] = var248.field543;
                                        continue;
                                    }
                                    if (var271 == 1503) {
                                        class113.field2635[var5++] = var248.field513;
                                        continue;
                                    }
                                    if (~var271 == -1505) {
                                        class113.field2635[var5++] = !var248.field522 ? 0 : 1;
                                        continue;
                                    }
                                    if (var271 == 1505) {
                                        class113.field2635[var5++] = var248.field498;
                                        continue;
                                    }
                                }
                            }
                        } else {
                            class26 var44;
                            if (var271 < 2000) {
                                var44 = var41 ? class51.field1153 : class58.field1290;
                            } else {
                                --var5;
                                var44 = class64.method466(-1922515024, class113.field2635[var5]);
                                var271 -= 1000;
                            }
                            if (var271 == 1100) {
                                var5 -= 2;
                                var44.field502 = class113.field2635[var5];
                                if (~(-var44.field543 + var44.field516) > ~var44.field502) {
                                    var44.field502 = -var44.field543 + var44.field516;
                                }
                                if (var44.field502 < 0) {
                                    var44.field502 = 0;
                                }
                                var44.field505 = class113.field2635[var5 + 1];
                                if (var44.field505 > -var44.field513 + var44.field491) {
                                    var44.field505 = var44.field491 - var44.field513;
                                }
                                if (~var44.field505 > -1) {
                                    var44.field505 = 0;
                                }
                                class75.method567((byte) 118, var44);
                                continue;
                            }
                            if (var271 == 1101) {
                                --var5;
                                var44.field580 = class113.field2635[var5];
                                class75.method567((byte) 118, var44);
                                continue;
                            }
                            if (~var271 == -1103) {
                                --var5;
                                var44.field569 = class113.field2635[var5] == 1;
                                class75.method567((byte) 116, var44);
                                continue;
                            }
                            if (~var271 == -1104) {
                                --var5;
                                var44.field460 = class113.field2635[var5];
                                class75.method567((byte) 114, var44);
                                continue;
                            }
                            if (~var271 == -1105) {
                                --var5;
                                var44.field466 = class113.field2635[var5];
                                class75.method567((byte) 112, var44);
                                continue;
                            }
                            if (var271 == 1105) {
                                --var5;
                                var44.field537 = class113.field2635[var5];
                                class75.method567((byte) 119, var44);
                                continue;
                            }
                            if (~var271 == -1107) {
                                --var5;
                                var44.field521 = class113.field2635[var5];
                                class75.method567((byte) 115, var44);
                                continue;
                            }
                            if (~var271 == -1108) {
                                --var5;
                                var44.field447 = class113.field2635[var5] == 1;
                                class75.method567((byte) 123, var44);
                                continue;
                            }
                            if (~var271 == -1109) {
                                var44.field577 = 1;
                                --var5;
                                var44.field551 = class113.field2635[var5];
                                class75.method567((byte) 127, var44);
                                continue;
                            }
                            if (~var271 == -1110) {
                                var5 -= 6;
                                var44.field536 = class113.field2635[var5];
                                var44.field571 = class113.field2635[var5 + 1];
                                var44.field534 = class113.field2635[var5 + 2];
                                var44.field470 = class113.field2635[var5 + 3];
                                var44.field486 = class113.field2635[var5 + 4];
                                var44.field523 = class113.field2635[var5 + 5];
                                class75.method567((byte) 114, var44);
                                continue;
                            }
                            if (var271 == 1110) {
                                --var5;
                                int var45 = class113.field2635[var5];
                                if (var44.field530 != var45) {
                                    var44.field573 = 0;
                                    var44.field556 = 0;
                                    var44.field530 = var45;
                                    class75.method567((byte) 115, var44);
                                }
                                continue;
                            }
                            if (~var271 == -1112) {
                                --var5;
                                var44.field456 = ~class113.field2635[var5] == -2;
                                class75.method567((byte) 119, var44);
                                continue;
                            }
                            if (var271 == 1112) {
                                --var6;
                                class146 var46 = class42.field944[var6];
                                if (!var46.method1107((byte) -83, var44.field441)) {
                                    var44.field441 = var46;
                                    class75.method567((byte) 117, var44);
                                }
                                continue;
                            }
                            if (~var271 == -1114) {
                                --var5;
                                var44.field473 = class113.field2635[var5];
                                class75.method567((byte) 112, var44);
                                continue;
                            }
                            if (~var271 == -1115) {
                                var5 -= 3;
                                var44.field568 = class113.field2635[var5];
                                var44.field503 = class113.field2635[var5 + 1];
                                var44.field489 = class113.field2635[var5 + 2];
                                class75.method567((byte) 120, var44);
                                continue;
                            }
                            if (~var271 == -1116) {
                                --var5;
                                var44.field539 = class113.field2635[var5] == 1;
                                class75.method567((byte) 122, var44);
                                continue;
                            }
                            if (~var271 == -1117) {
                                --var5;
                                var44.field529 = class113.field2635[var5];
                                class75.method567((byte) 127, var44);
                                continue;
                            }
                            if (~var271 == -1118) {
                                --var5;
                                var44.field527 = class113.field2635[var5];
                                class75.method567((byte) 127, var44);
                                continue;
                            }
                            if (~var271 == -1119) {
                                --var5;
                                var44.field512 = ~class113.field2635[var5] == -2;
                                class75.method567((byte) 122, var44);
                                continue;
                            }
                            if (~var271 == -1120) {
                                --var5;
                                var44.field477 = class113.field2635[var5] == 1;
                                class75.method567((byte) 127, var44);
                                continue;
                            }
                            if (var271 == 1120) {
                                var5 -= 2;
                                var44.field516 = class113.field2635[var5];
                                var44.field491 = class113.field2635[var5 + 1];
                                class75.method567((byte) 115, var44);
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var270) {
                if (var4.field2726 == null) {
                    if (~class26.field532 != -1) {
                        class26.method174(0, class17.field256, (byte) -76, class153.field3520);
                    }
                    class122.method921((byte) 90, "CS2 - scr:" + var4.field679 + " op:" + var10, var270);
                } else {
                    class146 var267 = class64.method462(30, 0);
                    var267.method1085(class82.field1993, -1).method1085(var4.field2726, -1);
                    for (int var268 = class120.field2794 + -1; var268 >= 0; --var268) {
                        var267.method1085(class52.field1177, -1).method1085(class159.field3642[var268].field1786.field2726, -1);
                    }
                    if (var10 == 40) {
                        int var269 = var8[var7];
                        var267.method1085(class94.field2226, arg1 ^ -6).method1085(class75.method564(false, var269), -1);
                    }
                    if (~class26.field532 != -1) {
                        class26.method174(0, class17.field256, (byte) -76, class71.method509(new class146[] { class6.field141, var4.field2726 }, (byte) -121));
                    }
                    class122.method921((byte) 90, "CS2 - scr:" + var4.field679 + " op:" + var10 + new String(var267.method1095((byte) -65)), var270);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(II)I")
    private final int method158(int arg0, int arg1) {
        ++field407;
        if (super.field1843[arg1] != null) {
            return 100;
        } else {
            int var3 = -98 % ((arg0 - -33) / 59);
            return this.field423[arg1] ? 100 : class108.method864(this.field426, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
    public final int method159(boolean arg0) {
        ++field412;
        if (!arg0) {
            return -117;
        } else if (this.field428) {
            return 100;
        } else if (super.field1843 != null) {
            return 99;
        } else {
            int var2 = class108.method864(255, 0, this.field426);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public static final void method160(byte arg0) {
        if (class89.field2113 != null) {
            class89.field2113.method31((byte) 106);
        }
        if (arg0 == 43) {
            ++field420;
            if (class15.field249 != null) {
                class15.field249.method31((byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        ++field405;
        if (arg1 != -1421) {
            this.method153(-94, false, -121, (byte[]) null, (class113) null);
        }
        class155.method1161(arg1 ^ -1533, arg0, this.field426);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method162(byte[] arg0, int arg1) {
        ++field415;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class11.method68(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)I")
    public final int method163(boolean arg0) {
        ++field416;
        int var2 = 0;
        int var3 = 0;
        if (arg0) {
            field410 = true;
        }
        for (int var4 = 0; ~var4 > ~super.field1843.length; ++var4) {
            if (super.field1823[var4] > 0) {
                var2 += 100;
                var3 += this.method158(83, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILef;)V")
    public static final void method164(int arg0, class35 arg1) {
        ++field414;
        if (~arg1.field807 != -1) {
            if (arg1.field774 != -1 && arg1.field774 < 32768) {
                class38 var2 = class34.field735[arg1.field774];
                if (var2 != null) {
                    int var3 = -var2.field757 + arg1.field757;
                    int var4 = -var2.field790 + arg1.field790;
                    if (var3 != 0 || ~var4 != -1) {
                        arg1.field780 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (~arg1.field774 <= -32769) {
                int var5 = arg1.field774 + -32768;
                if (class49.field1135 == var5) {
                    var5 = 2047;
                }
                class67 var6 = class125.field2902[var5];
                if (var6 != null) {
                    int var7 = -var6.field790 + arg1.field790;
                    int var8 = -var6.field757 + arg1.field757;
                    if (var8 != 0 || ~var7 != -1) {
                        arg1.field780 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field786 != 0 || arg1.field792 != 0) && (arg1.field811 == 0 || arg1.field796 > 0)) {
                int var9 = -((arg1.field786 - class63.field1429 + -class63.field1429) * 64) + arg1.field757;
                int var10 = -((arg1.field792 - class76.field1814 + -class76.field1814) * 64) + arg1.field790;
                if (~var9 != -1 || ~var10 != -1) {
                    arg1.field780 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
                arg1.field786 = 0;
                arg1.field792 = 0;
            }
            int var11 = 101 % ((29 - arg0) / 49);
            int var12 = 2047 & -arg1.field763 + arg1.field780;
            if (var12 == 0) {
                arg1.field810 = 0;
            } else {
                ++arg1.field810;
                if (~var12 >= -1025) {
                    arg1.field763 += arg1.field807;
                    boolean var13 = true;
                    if (arg1.field807 > var12 || ~(2048 - arg1.field807) > ~var12) {
                        var13 = false;
                        arg1.field763 = arg1.field780;
                    }
                    if (~arg1.field809 == ~arg1.field752 && (arg1.field810 > 25 || var13)) {
                        if (arg1.field806 == -1) {
                            arg1.field809 = arg1.field813;
                        } else {
                            arg1.field809 = arg1.field806;
                        }
                    }
                } else {
                    arg1.field763 -= arg1.field807;
                    boolean var14 = true;
                    if (var12 < arg1.field807 || ~var12 < ~(-arg1.field807 + 2048)) {
                        var14 = false;
                        arg1.field763 = arg1.field780;
                    }
                    if (~arg1.field809 == ~arg1.field752 && (~arg1.field810 < -26 || var14)) {
                        if (arg1.field745 == -1) {
                            arg1.field809 = arg1.field813;
                        } else {
                            arg1.field809 = arg1.field745;
                        }
                    }
                }
                arg1.field763 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
    private final void method165(byte arg0) {
        ++field421;
        this.field423 = new boolean[super.field1843.length];
        for (int var2 = 0; ~this.field423.length < ~var2; ++var2) {
            this.field423[var2] = false;
        }
        if (this.field417 == null) {
            this.field428 = true;
        } else {
            this.field403 = -1;
            for (int var3 = 0; var3 < this.field423.length; ++var3) {
                if (super.field1823[var3] > 0) {
                    class69.method497(this.field417, var3, 1, this);
                    this.field403 = var3;
                }
            }
            if (this.field403 == -1) {
                this.field428 = true;
            }
            if (arg0 < 30) {
                field409 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BZZIZ)V")
    public final void method166(byte[] arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        ++field398;
        if (!arg2) {
            this.method153(73, false, 98, (byte[]) null, (class113) null);
        }
        if (!arg1) {
            arg0[arg0.length - 2] = (byte) (super.field1844[arg3] >> 8);
            arg0[arg0.length - 1] = (byte) super.field1844[arg3];
            if (this.field417 != null) {
                class132.method990(arg3, this.field417, true, arg0);
                this.field423[arg3] = true;
            }
            if (arg4) {
                super.field1843[arg3] = class158.method1224((byte) -12, arg0, false);
                return;
            }
        } else {
            if (this.field428) {
                throw new RuntimeException();
            }
            if (this.field432 != null) {
                class132.method990(this.field426, this.field432, true, arg0);
            }
            this.method575(1, arg0);
            this.method165((byte) 69);
        }
    }
}
