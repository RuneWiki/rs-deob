import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class10 extends class228 {

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    private int field334 = 0;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lak;")
    private class269 field332 = new class269(16);

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lch;")
    private class117 field358 = new class117();

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "J")
    private long field362 = 0L;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Li;")
    private class182 field318;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Z")
    private boolean field359;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Lch;")
    private class117 field360;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Li;")
    private class182 field330;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Lqi;")
    private class259 field353;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Z")
    private boolean field361;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lae;")
    private class238 field336;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lpf;")
    private class69 field338;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Lvf;")
    public static class265 field335 = class87.method582(-46, "clignotant2:");

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lvf;")
    public static class265 field344 = class87.method582(-46, "Ablegen");

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lvf;")
    private static class265 field327 = class87.method582(-46, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "J")
    public static long field337 = 0L;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lvf;")
    public static class265 field348 = field327;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lvf;")
    public static class265 field328 = class87.method582(-46, " <col=00ff80>");

    @OriginalMember(owner = "client!se", name = "T", descriptor = "[Lse;")
    public static class10[] field356 = new class10[28];

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Loc;")
    private class121 field323;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Z")
    public static boolean field340;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "Z")
    private boolean field355;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[B")
    private byte[] field320;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "[S")
    public static short[] field352;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (arg0) {
            method82(true, (class265) null);
        }
        field347++;
        if (this.field360 != null) {
            if (this.method89(128) == null) {
                return;
            }
            if (this.field359) {
                boolean var6 = true;
                for (class12 var7 = this.field360.method789((byte) -47); var7 != null; var7 = this.field360.method787((byte) -76)) {
                    int var9 = (int) var7.field393;
                    if (this.field320[var9] == 0) {
                        this.method85(var9, 83, 1);
                    }
                    if (this.field320[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method97(158);
                    }
                }
                while (this.field323.field2154.length > this.field357) {
                    if (this.field323.field2154[this.field357] == 0) {
                        this.field357++;
                    } else {
                        if (this.field336.field4161 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field320[this.field357] == 0) {
                            this.method85(this.field357, 82, 1);
                        }
                        if (this.field320[this.field357] == 0) {
                            var6 = false;
                            class12 var8 = new class12();
                            var8.field393 = (long) this.field357;
                            this.field360.method785(var8, -29);
                        }
                        this.field357++;
                    }
                }
                if (var6) {
                    this.field357 = 0;
                    this.field359 = false;
                }
            } else if (this.field355) {
                boolean var2 = true;
                for (class12 var3 = this.field360.method789((byte) -87); var3 != null; var3 = this.field360.method787((byte) -76)) {
                    int var5 = (int) var3.field393;
                    if (this.field320[var5] != 1) {
                        this.method85(var5, 77, 2);
                    }
                    if (this.field320[var5] == 1) {
                        var3.method97(158);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field357 < this.field323.field2154.length) {
                    if (this.field323.field2154[this.field357] == 0) {
                        this.field357++;
                    } else {
                        if (this.field353.method1710((byte) 113)) {
                            var2 = false;
                            break;
                        }
                        if (this.field320[this.field357] != 1) {
                            this.method85(this.field357, 126, 2);
                        }
                        if (this.field320[this.field357] != 1) {
                            class12 var4 = new class12();
                            var2 = false;
                            var4.field393 = (long) this.field357;
                            this.field360.method785(var4, -29);
                        }
                        this.field357++;
                    }
                }
                if (var2) {
                    this.field357 = 0;
                    this.field355 = false;
                }
            } else {
                this.field360 = null;
            }
        }
        if (!this.field361 || class136.method950(8954) < this.field362) {
            return;
        }
        for (class69 var10 = (class69) this.field332.method1851(false); var10 != null; var10 = (class69) this.field332.method1847(false)) {
            if (!var10.field1315) {
                if (var10.field1310) {
                    if (!var10.field1314) {
                        throw new RuntimeException();
                    }
                    var10.method97(158);
                } else {
                    var10.field1310 = true;
                }
            }
        }
        this.field362 = class136.method950(8954) + 1000L;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I")
    public final int method74(byte arg0) {
        field349++;
        if (this.field323 == null) {
            return 0;
        } else if (this.field359) {
            class12 var2 = this.field360.method789((byte) -43);
            if (arg0 == 1) {
                return var2 == null ? 0 : (int) var2.field393;
            } else {
                return 82;
            }
        } else {
            return this.field323.field2153;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIZILsd;Lwb;Lnc;)V")
    public static final void method75(int arg0, int arg1, int arg2, boolean arg3, int arg4, class23 arg5, class130 arg6, class122 arg7) {
        field329++;
        class242 var8 = new class242();
        var8.field4220 = arg2 * 128;
        var8.field4206 = arg4;
        var8.field4229 = arg1 * 128;
        if (arg3) {
            return;
        }
        if (arg6 != null) {
            var8.field4222 = arg6;
            var8.field4207 = arg6.field2293 * 128;
            var8.field4225 = arg6.field2348;
            var8.field4214 = arg6.field2288;
            var8.field4212 = arg6.field2298;
            int var10 = arg6.field2309;
            var8.field4208 = arg6.field2352;
            int var11 = arg6.field2328;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg6.field2328;
                var11 = arg6.field2309;
            }
            var8.field4221 = (arg2 + var11) * 128;
            var8.field4211 = (arg1 + var10) * 128;
            if (arg6.field2365 != null) {
                var8.field4227 = true;
                var8.method1614(-102);
            }
            if (var8.field4212 != null) {
                var8.field4209 = (int) ((double) (var8.field4214 - var8.field4225) * Math.random()) + var8.field4225;
            }
            class7.field250.method785(var8, -29);
            return;
        }
        if (arg5 != null) {
            var8.field4205 = arg5;
            class268 var9 = arg5.field681;
            if (var9.field4755 != null) {
                var8.field4227 = true;
                var9 = var9.method1825(20656);
            }
            if (var9 != null) {
                var8.field4221 = (var9.field4713 + arg2) * 128;
                var8.field4211 = (var9.field4713 + arg1) * 128;
                var8.field4208 = class166.method1091(114, arg5);
                var8.field4207 = var9.field4760 * 128;
            }
            class240.field4197.method785(var8, -29);
            return;
        }
        if (arg7 == null) {
            return;
        }
        var8.field4218 = arg7;
        var8.field4211 = (arg7.method822(2) + arg1) * 128;
        var8.field4221 = (arg2 + arg7.method822(2)) * 128;
        var8.field4208 = class267.method1819(arg7, (byte) 127);
        var8.field4207 = arg7.field2166 * 128;
        class32.field804.method1838(arg7.field2163.method1793(43), var8, (byte) 8);
        return;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class201 var7 = new class201();
        var7.field3607 = arg1 / 128;
        var7.field3602 = arg2 / 128;
        var7.field3589 = arg3 / 128;
        var7.field3606 = arg4 / 128;
        var7.field3588 = arg0;
        var7.field3599 = arg1;
        var7.field3592 = arg2;
        var7.field3595 = arg3;
        var7.field3598 = arg4;
        var7.field3596 = arg5;
        var7.field3590 = arg6;
        class118.field2082[class112.field1966++] = var7;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
    public final int method77(int arg0) {
        if (arg0 != -1) {
            this.field320 = null;
        }
        field343++;
        return this.field334;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
    public final int method78(byte arg0, int arg1) {
        field354++;
        if (arg0 != -102) {
            method75(-121, -13, 74, false, 106, (class23) null, (class130) null, (class122) null);
        }
        class69 var3 = (class69) this.field332.method1842(-1, (long) arg1);
        return var3 == null ? 0 : var3.method492(-2);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
    public final int method79(int arg0) {
        field345++;
        if (arg0 != 255) {
            this.field342 = 105;
        }
        if (this.method89(128) == null) {
            return this.field338 == null ? 0 : this.field338.method492(-2);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public final void method80(int arg0, byte arg1) {
        field350++;
        if (this.field318 == null) {
            return;
        }
        if (arg1 < 4) {
            method84(97);
        }
        for (class12 var3 = this.field358.method789((byte) -98); var3 != null; var3 = this.field358.method787((byte) -76)) {
            if (((long) arg0) == var3.field393) {
                return;
            }
        }
        class12 var4 = new class12();
        var4.field393 = (long) arg0;
        this.field358.method785(var4, -29);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
    public final int method81(int arg0) {
        field326++;
        if (arg0 != 0) {
            this.method73(true);
        }
        return this.field323 == null ? 0 : this.field323.field2153;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLvf;)V")
    public static final void method82(boolean arg0, class265 arg1) {
        field321++;
        int var2 = class49.method399(arg1, -119);
        if (var2 != -1 && !arg0) {
            class113.method745(class126.field2260.field2709[var2], true, class126.field2260.field2705[var2]);
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static void method83(int arg0) {
        field352 = null;
        field335 = null;
        field328 = null;
        field344 = null;
        if (arg0 != -22469) {
            method82(true, (class265) null);
        }
        field348 = null;
        field327 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
    public static final void method84(int arg0) {
        field333++;
        if (!class50.field1049) {
            class120.field2129 = 1;
            class206.field3714[0] = class227.field4033;
            class118.field2079[0] = 1006;
            class206.field3717[0] = class21.field598;
            if (class183.field3286 != 0) {
                class38.field862 = class135.field2440;
                class77.field1475 = class97.field1719;
            } else if (class141.field2620 == 0) {
                class38.field862 = class268.field4722;
                class77.field1475 = class79.field1497;
            } else {
                class38.field862 = class192.field3427;
                class77.field1475 = class122.field2193;
            }
            class40.field924[0] = class4.field66;
        }
        if (class8.field271 != -1) {
            class259.method1714(54, class8.field271);
        }
        for (int var1 = 0; var1 < class119.field2104; var1++) {
            if (class135.field2481[var1]) {
                class80.field1516[var1] = true;
            }
            class4.field50[var1] = class135.field2481[var1];
            class135.field2481[var1] = false;
        }
        int var2 = -53 / ((arg0 - 54) / 33);
        class267.field4699 = -1;
        class133.field2402 = null;
        class193.field3480 = -1;
        class125.field2248 = class93.field1655;
        class176.field3140 = null;
        if (class8.field271 != -1) {
            class119.field2104 = 0;
            class281.method1912(0, class26.field706, 0, class8.field271, (byte) -99, 0, class50.field1053, 0, -1);
        }
        class35.method296();
        class164.method1081(-26);
        if (class50.field1049) {
            if (class97.field1711) {
                class244.method1626(false);
            } else {
                class283.method1918(0);
            }
        } else if (class176.field3140 != null) {
            class150.method1026(90, class176.field3140, class100.field1768, class54.field1121);
        } else if (class193.field3480 != -1) {
            class150.method1026(90, (class6) null, class193.field3480, class267.field4699);
        }
        int var3 = class50.field1049 ? -1 : class167.method1103(93);
        if (var3 == -1) {
            var3 = class133.field2409;
        }
        class209.method1434(var3, 12781);
        if (class58.field1179 == 1) {
            class58.field1179 = 2;
        }
        if (class106.field1872 == 1) {
            class106.field1872 = 2;
        }
        if (class111.field1952 == 3) {
            for (int var4 = 0; var4 < class119.field2104; var4++) {
                if (class4.field50[var4]) {
                    class35.method301(client.field3858[var4], class72.field1390[var4], class124.field2229[var4], class102.field1811[var4], 16711935, 128);
                } else if (class80.field1516[var4]) {
                    class35.method301(client.field3858[var4], class72.field1390[var4], class124.field2229[var4], class102.field1811[var4], 16711680, 128);
                }
            }
        }
        class265.method1789(class214.field3827.field2564, -216, class84.field1572, class216.field3902, class214.field3827.field2600);
        class84.field1572 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lpf;")
    private final class69 method85(int arg0, int arg1, int arg2) {
        class69 var4 = (class69) this.field332.method1842(-1, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field1314 && var4.field1315) {
            var4.method97(158);
            var4 = null;
        }
        int var5 = -71 / ((24 - arg1) / 38);
        field324++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field318 == null || this.field320[arg0] == -1) {
                    if (this.field353.method1709(20)) {
                        return null;
                    }
                    var4 = this.field353.method1715(arg0, this.field331, true, true, (byte) 2);
                } else {
                    var4 = this.field336.method1594(-25, arg0, this.field318);
                }
            } else if (arg2 == 1) {
                if (this.field318 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field336.method1586(this.field318, (byte) -91, arg0);
            } else if (arg2 == 2) {
                if (this.field318 == null) {
                    throw new RuntimeException();
                }
                if (this.field320[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field353.method1710((byte) 99)) {
                    return null;
                }
                var4 = this.field353.method1715(arg0, this.field331, false, true, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field332.method1838((long) arg0, var4, (byte) 8);
        }
        if (var4.field1315) {
            return null;
        }
        byte[] var6 = var4.method493(-102);
        if (!var4 instanceof class283) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class214.field3829.reset();
                class214.field3829.update(var6, 0, var6.length - 2);
                int var10 = (int) class214.field3829.getValue();
                if (this.field323.field2141[arg0] != var10) {
                    throw new RuntimeException();
                }
                this.field353.field4478 = 0;
                this.field353.field4476 = 0;
            } catch (RuntimeException var13) {
                this.field353.method1722(true);
                var4.method97(158);
                if (var4.field1314 && !this.field353.method1709(20)) {
                    class84 var11 = this.field353.method1715(arg0, this.field331, true, true, (byte) 2);
                    this.field332.method1838((long) arg0, var11, (byte) 8);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field323.field2139[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field323.field2139[arg0];
            if (this.field318 != null) {
                this.field336.method1588(arg0, -127, var6, this.field318);
                if (this.field320[arg0] != 1) {
                    this.field334++;
                    this.field320[arg0] = 1;
                }
            }
            if (!var4.field1314) {
                var4.method97(158);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class214.field3829.reset();
            class214.field3829.update(var6, 0, var6.length - 2);
            int var7 = (int) class214.field3829.getValue();
            if (this.field323.field2141[arg0] != var7) {
                throw new RuntimeException();
            }
            int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field323.field2139[arg0] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field320[arg0] != 1) {
                this.field334++;
                this.field320[arg0] = 1;
            }
            if (!var4.field1314) {
                var4.method97(158);
            }
            return var4;
        } catch (Exception var12) {
            this.field320[arg0] = -1;
            var4.method97(158);
            if (var4.field1314 && !this.field353.method1709(20)) {
                class84 var9 = this.field353.method1715(arg0, this.field331, true, true, (byte) 2);
                this.field332.method1838((long) arg0, var9, (byte) 8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        field319++;
        if (this.field360 == null || this.method89(128) == null || !arg0) {
            return;
        }
        for (class12 var2 = this.field358.method789((byte) -61); var2 != null; var2 = this.field358.method787((byte) -76)) {
            int var3 = (int) var2.field393;
            if (var3 < 0 || var3 >= this.field323.field2138 || this.field323.field2154[var3] == 0) {
                var2.method97(158);
            } else {
                if (this.field320[var3] == 0) {
                    this.method85(var3, 71, 1);
                }
                if (this.field320[var3] == -1) {
                    this.method85(var3, 87, 2);
                }
                if (this.field320[var3] == 1) {
                    var2.method97(158);
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        field351++;
        if (arg0 >= -49) {
            this.method77(77);
        }
        if (this.field318 != null) {
            this.field355 = true;
            if (this.field360 == null) {
                this.field360 = new class117();
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[B")
    public final byte[] method88(int arg0, int arg1) {
        field346++;
        class69 var3 = this.method85(arg0, 117, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method493(-108);
            var3.method97(arg1 ^ 0x9E);
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Loc;")
    public final class121 method89(int arg0) {
        field325++;
        if (this.field323 != null) {
            return this.field323;
        }
        if (this.field338 == null) {
            if (this.field353.method1709(arg0 - 108)) {
                return null;
            }
            this.field338 = this.field353.method1715(this.field331, 255, true, true, (byte) 0);
        }
        if (this.field338.field1315) {
            return null;
        }
        byte[] var2 = this.field338.method493(arg0 - 256);
        if (this.field338 instanceof class283) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field323 = new class121(var2, this.field322);
                if (this.field323.field2158 != this.field342) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field323 = null;
                if (this.field353.method1709(20)) {
                    this.field338 = null;
                } else {
                    this.field338 = this.field353.method1715(this.field331, 255, true, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field323 = new class121(var2, this.field322);
            } catch (RuntimeException var4) {
                this.field353.method1722(true);
                this.field323 = null;
                if (this.field353.method1709(20)) {
                    this.field338 = null;
                } else {
                    this.field338 = this.field353.method1715(this.field331, 255, true, true, (byte) 0);
                }
                return null;
            }
            if (this.field330 != null) {
                this.field336.method1588(this.field331, -128, var2, this.field330);
            }
        }
        if (arg0 != 128) {
            return null;
        }
        if (this.field318 != null) {
            this.field320 = new byte[this.field323.field2138];
            this.field334 = 0;
        }
        this.field338 = null;
        return this.field323;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(ILi;Li;Lqi;Lae;IIZ)V")
    public class10(int arg0, class182 arg1, class182 arg2, class259 arg3, class238 arg4, int arg5, int arg6, boolean arg7) {
        this.field318 = arg1;
        this.field331 = arg0;
        if (this.field318 == null) {
            this.field359 = false;
        } else {
            this.field359 = true;
            this.field360 = new class117();
        }
        this.field330 = arg2;
        this.field322 = arg5;
        this.field353 = arg3;
        this.field342 = arg6;
        this.field361 = arg7;
        this.field336 = arg4;
        if (this.field330 != null) {
            this.field338 = this.field336.method1594(127, this.field331, this.field330);
        }
    }
}
