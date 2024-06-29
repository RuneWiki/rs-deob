import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class156 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lmg;")
    private class151 field2608 = new class151();

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lmg;")
    private class151 field2624 = new class151();

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lmg;")
    private class151 field2625 = new class151();

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Lmg;")
    private class151 field2627 = new class151();

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lwe;")
    private class47 field2631 = new class47(4);

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "B")
    private byte field2633 = 0;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public volatile int field2635 = 0;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public volatile int field2632 = 0;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Lwe;")
    private class47 field2634 = new class47(8);

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lok;")
    public static class146 field2610 = class235.method1724(-12908, "Lade Liste der Welten");

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lok;")
    public static class146 field2605 = class235.method1724(-12908, "comp-Btence ");

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lok;")
    public static class146 field2623 = class235.method1724(-12908, "<)4col>");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    private int field2630;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "J")
    private long field2629;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "Lvj;")
    private class103 field2636;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Loh;")
    public static class15 field2606;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lqd;")
    private class40 field2628;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1211(boolean arg0) {
        field2603++;
        if (!arg0 && class157.field2648 != null) {
            class305 var1 = class157.field2648;
            synchronized (class157.field2648) {
                class157.field2648 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V", line = 21)
    public final void method1212(byte arg0, boolean arg1) {
        field2613++;
        if (this.field2628 == null || arg0 >= -106) {
            return;
        }
        try {
            this.field2631.field857 = 0;
            this.field2631.method332(arg1 ? 2 : 3, 93);
            this.field2631.method354((byte) -113, 0);
            this.field2628.method279(124, 0, 4, this.field2631.field860);
        } catch (IOException var6) {
            try {
                this.field2628.method284((byte) 106);
            } catch (Exception var5) {
            }
            this.field2632 = -2;
            this.field2628 = null;
            this.field2635++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z", line = 49)
    public final boolean method1213(int arg0) {
        if (arg0 == 100) {
            field2622++;
            return this.method1224(0) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 60)
    public static void method1214(int arg0) {
        field2605 = null;
        field2610 = null;
        field2616 = null;
        if (arg0 != 0) {
            method1218(85, (class286[]) null);
        }
        field2623 = null;
        field2606 = null;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V", line = 74)
    public final void method1215(int arg0) {
        field2604++;
        try {
            this.field2628.method284((byte) 105);
        } catch (Exception var3) {
        }
        if (arg0 <= -41) {
            this.field2628 = null;
            this.field2633 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field2635++;
            this.field2632 = -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ltd;III)V", line = 92)
    public static final void method1216(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -65536) {
            method1216((class234) null, -15, 9, -7);
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field5428 = client.field4080.method379(arg2 + 65534);
            if (arg0.field5428 == 65535) {
                arg0.field5428 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            int var4 = client.field4080.method350(-32768);
            int var5 = client.field4080.method368(-107);
            arg0.method2214(var4, class203.field3385, var5, (byte) 50);
        }
        field2620++;
        if ((arg3 & 0x200) != 0) {
            arg0.field5382 = client.field4080.method357((byte) -66);
            arg0.field5425 = client.field4080.method346((byte) -1);
            arg0.field5393 = client.field4080.method357((byte) -66);
            arg0.field5403 = client.field4080.method368(-115);
            arg0.field5414 = client.field4080.method360(-1) + class203.field3385;
            arg0.field5437 = client.field4080.method390((byte) -123) + class203.field3385;
            arg0.field5396 = client.field4080.method341((byte) -112);
            arg0.field5424 = 1;
            arg0.field5431 = 0;
        }
        if ((arg3 & 0x8) != 0) {
            int var6 = client.field4080.method336(-2);
            int var7 = client.field4080.method357((byte) -66);
            if (var6 == 65535) {
                var6 = -1;
            }
            class13.method76(var6, (byte) 120, var7, arg0);
        }
        if ((arg3 & 0x20) != 0) {
            arg0.field5400 = client.field4080.method360(-1);
            arg0.field5383 = client.field4080.method360(-1);
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field5445 = client.field4080.method337(-1);
            if (arg0.field5445.method1115(0, (byte) 127) == 126) {
                arg0.field5445 = arg0.field5445.method1111(-1, 1);
                class316.method2209(false, arg0.field5445, 2, arg0.method1715(-94));
            } else if (class102.field1639 == arg0) {
                class316.method2209(false, arg0.field5445, 2, arg0.method1715(-70));
            }
            arg0.field5388 = 0;
            arg0.field5411 = 150;
            arg0.field5375 = 0;
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = client.field4080.method350(arg2 + 32768);
            int var9 = client.field4080.method341((byte) -79);
            arg0.method2214(var8, class203.field3385, var9, (byte) 32);
            arg0.field5410 = class203.field3385 + 300;
            arg0.field5376 = client.field4080.method368(-93);
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = client.field4080.method341((byte) -128);
            byte[] var11 = new byte[var10];
            class47 var12 = new class47(var11);
            client.field4080.method385(var11, (byte) -1, 0, var10);
            class140.field2339[arg1] = var12;
            arg0.method1716(var12, -10605);
        }
        if ((arg3 & 0x100) != 0) {
            int var13 = client.field4080.method336(-2);
            if (var13 == 65535) {
                var13 = -1;
            }
            boolean var14 = true;
            int var15 = client.field4080.method366(true);
            if (var13 != -1 && arg0.field5441 != -1 && class306.method2156(arg2 + 65659, class73.method540((byte) 98, var13).field2329).field4907 < class306.method2156(arg2 ^ 0xFFFF0079, class73.method540((byte) 103, arg0.field5441).field2329).field4907) {
                var14 = false;
            }
            if (var14) {
                arg0.field5441 = var13;
                arg0.field5387 = 0;
                arg0.field5423 = (var15 & 0xFFFF) + class203.field3385;
                arg0.field5399 = 0;
                arg0.field5371 = var15 >> 16;
                if (class203.field3385 < arg0.field5423) {
                    arg0.field5387 = -1;
                }
                if (arg0.field5441 != -1 && class203.field3385 == arg0.field5423) {
                    int var16 = class73.method540((byte) 77, arg0.field5441).field2329;
                    if (var16 != -1) {
                        class287 var17 = class306.method2156(123, var16);
                        if (var17 != null && var17.field4904 != null) {
                            class11.method70(false, class102.field1639 == arg0, var17, arg0.field5409, 0, arg0.field5380);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x2) == 0) {
            return;
        }
        int var18 = client.field4080.method390((byte) -93);
        boolean var19 = (var18 & 0x8000) != 0;
        int var20 = client.field4080.method368(-116);
        int var21 = client.field4080.method341((byte) -63);
        int var22 = client.field4080.field857;
        if (arg0.field3891 != null && arg0.field3923 != null) {
            long var23 = arg0.field3891.method1123(-13726);
            boolean var25 = false;
            if (var20 <= 1) {
                if (var19 || (!class157.field2653 || class158.field2675) && !class287.field4925) {
                    for (int var26 = 0; var26 < class102.field1653; var26++) {
                        if (class106.field1715[var26] == var23) {
                            var25 = true;
                            break;
                        }
                    }
                } else {
                    var25 = true;
                }
            }
            if (!var25 && class294.field4992 == 0) {
                class27.field467.field857 = 0;
                int var27 = -1;
                client.field4080.method385(class27.field467.field860, (byte) -1, 0, var21);
                class27.field467.field857 = 0;
                class146 var28;
                if (var19) {
                    class293 var29 = class194.method1494(class27.field467, -1);
                    var18 &= 0x7FFF;
                    var27 = var29.field4982;
                    var28 = var29.field4983.method1832(arg2 ^ 0xFFFF0005, class27.field467);
                } else {
                    var28 = class30.method211(class322.method2237(class27.field467, 32767).method1101((byte) -104));
                }
                arg0.field5445 = var28.method1096((byte) -89);
                arg0.field5411 = 150;
                arg0.field5388 = var18 & 0xFF;
                arg0.field5375 = var18 >> 8;
                if (var20 == 2) {
                    class71.method529(class112.method758(122, new class146[] { class200.field3345, arg0.method1715(-74) }), var19 ? 17 : 1, 140, var27, var28, (class146) null);
                } else if (var20 == 1) {
                    class71.method529(class112.method758(123, new class146[] { class274.field4721, arg0.method1715(arg2 ^ 0xFF86) }), var19 ? 17 : 1, arg2 ^ 0xFFFF008C, var27, var28, (class146) null);
                } else {
                    class71.method529(arg0.method1715(-63), var19 ? 17 : 2, 140, var27, var28, (class146) null);
                }
            }
        }
        client.field4080.field857 = var21 + var22;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 340)
    public final void method1217(int arg0) {
        if (this.field2628 != null) {
            this.field2628.method284((byte) 82);
        }
        field2615++;
        if (arg0 != 0) {
            this.field2608 = (class151) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lhi;)V", line = 353)
    public static final void method1218(int arg0, class286[] arg1) {
        class281.field4823[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I", line = 358)
    public final int method1219(byte arg0) {
        if (arg0 == -30) {
            field2612++;
            return this.field2608.method1191((byte) -114) + this.field2624.method1191((byte) -106);
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Z", line = 371)
    public final boolean method1220(int arg0) {
        field2619++;
        if (this.field2628 != null) {
            long var2 = class67.method501(-100);
            int var4 = (int) (var2 - this.field2629);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2629 = var2;
            this.field2630 += var4;
            if (this.field2630 > 30000) {
                try {
                    this.field2628.method284((byte) -63);
                } catch (Exception var30) {
                }
                this.field2628 = null;
            }
        }
        if (this.field2628 == null) {
            return this.method1219((byte) -30) == 0 && this.method1224(0) == 0;
        }
        try {
            this.field2628.method286((byte) 113);
            for (class103 var6 = (class103) this.field2608.method1197(17181); var6 != null; var6 = (class103) this.field2608.method1198((byte) -128)) {
                this.field2631.field857 = 0;
                this.field2631.method332(1, arg0 + 2378);
                this.field2631.method354((byte) -113, (int) var6.field3874);
                this.field2628.method279(arg0 + 2414, 0, 4, this.field2631.field860);
                this.field2624.method1195((byte) -93, var6);
            }
            for (class103 var7 = (class103) this.field2625.method1197(17181); var7 != null; var7 = (class103) this.field2625.method1198((byte) -127)) {
                this.field2631.field857 = 0;
                this.field2631.method332(0, 86);
                this.field2631.method354((byte) -113, (int) var7.field3874);
                this.field2628.method279(25, 0, 4, this.field2631.field860);
                this.field2627.method1195((byte) -93, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field2628.method288(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2630 = 0;
                byte var10 = 0;
                if (this.field2636 == null) {
                    var10 = 8;
                } else if (this.field2636.field1662 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field2634.field857;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field2628.method277(this.field2634.field860, arg0 + 2371, var11, this.field2634.field857);
                    if (this.field2633 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2634.field860[this.field2634.field857 + var12] = (byte) class35.method255(this.field2634.field860[this.field2634.field857 + var12], this.field2633);
                        }
                    }
                    this.field2634.field857 += var11;
                    if (this.field2634.field857 >= var10) {
                        if (this.field2636 == null) {
                            this.field2634.field857 = 0;
                            int var13 = this.field2634.method368(arg0 + 2325);
                            int var14 = this.field2634.method379(arg0 ^ 0x8F2);
                            int var15 = this.field2634.method368(arg0 + 2199);
                            int var16 = this.field2634.method373((byte) 36);
                            boolean var17 = (var15 & 0x80) != 0;
                            int var18 = var15 & 0x7F;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class103 var22;
                            if (var17) {
                                for (var22 = (class103) this.field2627.method1197(17181); var22 != null && var22.field3874 != var19; var22 = (class103) this.field2627.method1198((byte) -127)) {
                                }
                            } else {
                                for (var22 = (class103) this.field2624.method1197(17181); var22 != null && var22.field3874 != var19; var22 = (class103) this.field2624.method1198((byte) -127)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field2636 = var22;
                            int var23 = var18 == 0 ? 5 : 9;
                            this.field2636.field1672 = new class47(var16 + var23 + this.field2636.field1666);
                            this.field2636.field1672.method332(var18, 93);
                            this.field2636.field1672.method387(var16, 111);
                            this.field2634.field857 = 0;
                            this.field2636.field1662 = 8;
                        } else if (this.field2636.field1662 != 0) {
                            throw new IOException();
                        } else if (this.field2634.field860[0] == -1) {
                            this.field2636.field1662 = 1;
                            this.field2634.field857 = 0;
                        } else {
                            this.field2636 = null;
                        }
                    }
                } else {
                    int var24 = 512 - this.field2636.field1662;
                    int var25 = this.field2636.field1672.field860.length - this.field2636.field1666;
                    if ((var25 - this.field2636.field1672.field857) < var24) {
                        var24 = var25 - this.field2636.field1672.field857;
                    }
                    if (var24 > var9) {
                        var24 = var9;
                    }
                    this.field2628.method277(this.field2636.field1672.field860, 111, var24, this.field2636.field1672.field857);
                    if (this.field2633 != 0) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            this.field2636.field1672.field860[this.field2636.field1672.field857 + var26] = (byte) class35.method255(this.field2636.field1672.field860[this.field2636.field1672.field857 + var26], this.field2633);
                        }
                    }
                    this.field2636.field1662 += var24;
                    this.field2636.field1672.field857 += var24;
                    if (this.field2636.field1672.field857 == var25) {
                        this.field2636.method1703((byte) 126);
                        this.field2636.field1856 = false;
                        this.field2636 = null;
                    } else if (this.field2636.field1662 == 512) {
                        this.field2636.field1662 = 0;
                    }
                }
            }
            if (arg0 != -2292) {
                this.field2635 = 115;
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field2628.method284((byte) -101);
            } catch (Exception var29) {
            }
            this.field2632 = -2;
            this.field2635++;
            this.field2628 = null;
            return this.method1219((byte) -30) == 0 && this.method1224(0) == 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 651)
    public final void method1221(byte arg0) {
        int var2 = 67 / ((24 - arg0) / 54);
        if (this.field2628 != null) {
            this.field2628.method289((byte) 109);
        }
        field2626++;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V", line = 667)
    private final void method1222(int arg0) {
        field2607++;
        if (this.field2628 == null || arg0 != 5) {
            return;
        }
        try {
            this.field2631.field857 = 0;
            this.field2631.method332(6, 100);
            this.field2631.method354((byte) -113, 3);
            this.field2628.method279(125, 0, 4, this.field2631.field860);
        } catch (IOException var5) {
            try {
                this.field2628.method284((byte) 93);
            } catch (Exception var4) {
            }
            this.field2635++;
            this.field2628 = null;
            this.field2632 = -2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZILqd;)V", line = 695)
    public final void method1223(boolean arg0, int arg1, class40 arg2) {
        field2614++;
        if (this.field2628 != null) {
            try {
                this.field2628.method284((byte) 84);
            } catch (Exception var11) {
            }
            this.field2628 = null;
        }
        this.field2628 = arg2;
        this.method1222(5);
        this.method1212((byte) -122, arg0);
        this.field2634.field857 = 0;
        this.field2636 = null;
        while (true) {
            class103 var5 = (class103) this.field2624.method1194(false);
            if (var5 == null) {
                while (true) {
                    class103 var6 = (class103) this.field2627.method1194(false);
                    if (var6 == null) {
                        if (this.field2633 != arg1) {
                            try {
                                this.field2631.field857 = 0;
                                this.field2631.method332(4, 125);
                                this.field2631.method332(this.field2633, 77);
                                this.field2631.method361(0, 1635554120);
                                this.field2628.method279(34, 0, 4, this.field2631.field860);
                            } catch (IOException var10) {
                                try {
                                    this.field2628.method284((byte) 96);
                                } catch (Exception var9) {
                                }
                                this.field2632 = -2;
                                this.field2628 = null;
                                this.field2635++;
                            }
                        }
                        this.field2630 = 0;
                        this.field2629 = class67.method501(arg1 ^ 0xFFFFFF82);
                        return;
                    }
                    this.field2625.method1195((byte) -93, var6);
                }
            }
            this.field2608.method1195((byte) -93, var5);
        }
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)I", line = 762)
    private final int method1224(int arg0) {
        field2617++;
        return arg0 == 0 ? this.field2625.method1191((byte) -125) + this.field2627.method1191((byte) -56) : -94;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIZIB)Lvj;", line = 782)
    public final class103 method1225(byte arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        long var6 = (long) ((arg3 << 16) + arg1);
        class103 var8 = new class103();
        field2611++;
        var8.field1666 = arg4;
        var8.field3874 = var6;
        var8.field1849 = arg2;
        if (arg2) {
            if (this.method1219((byte) -30) >= 20) {
                throw new RuntimeException();
            }
            this.field2608.method1195((byte) -93, var8);
        } else if (this.method1224(0) < 20) {
            this.field2625.method1195((byte) -93, var8);
        } else {
            throw new RuntimeException();
        }
        int var9 = -100 % ((arg0 - 38) / 49);
        return var8;
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V", line = 822)
    public final void method1226(int arg0) {
        field2618++;
        if (arg0 < 115) {
            this.field2630 = 98;
        }
        if (this.field2628 == null) {
            return;
        }
        try {
            this.field2631.field857 = 0;
            this.field2631.method332(7, 70);
            this.field2631.method354((byte) -113, 0);
            this.field2628.method279(-25, 0, 4, this.field2631.field860);
        } catch (IOException var5) {
            try {
                this.field2628.method284((byte) 122);
            } catch (Exception var4) {
            }
            this.field2632 = -2;
            this.field2635++;
            this.field2628 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)Z", line = 858)
    public final boolean method1227(int arg0) {
        if (arg0 != 2476) {
            this.field2630 = -109;
        }
        field2621++;
        return this.method1219((byte) -30) >= 20;
    }
}
