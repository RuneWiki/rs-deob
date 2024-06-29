import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class226 extends class305 {

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
    private int field3291 = 0;

    @OriginalMember(owner = "client!gq", name = "lb", descriptor = "I")
    private int field3307 = 0;

    @OriginalMember(owner = "client!gq", name = "ib", descriptor = "Z")
    private boolean field3304 = false;

    @OriginalMember(owner = "client!gq", name = "jb", descriptor = "I")
    private int field3305 = -32768;

    @OriginalMember(owner = "client!gq", name = "rb", descriptor = "I")
    private int field3313 = -1;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!gq", name = "ab", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!gq", name = "fb", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    private int field3271;

    @OriginalMember(owner = "client!gq", name = "nb", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "Lpp;")
    private class356 field3289;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Lo;")
    public static class332 field3275 = new class332("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!gq", name = "sb", descriptor = "Lo;")
    public static class332 field3314 = new class332("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "D")
    private double field3272;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "D")
    private double field3277;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "D")
    private double field3279;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "D")
    private double field3283;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "D")
    private double field3284;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "D")
    private double field3285;

    @OriginalMember(owner = "client!gq", name = "kb", descriptor = "D")
    private double field3306;

    @OriginalMember(owner = "client!gq", name = "pb", descriptor = "D")
    private double field3311;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!gq", name = "X", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!gq", name = "Y", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!gq", name = "bb", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!gq", name = "cb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!gq", name = "db", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!gq", name = "eb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!gq", name = "gb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!gq", name = "hb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!gq", name = "mb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!gq", name = "ob", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!gq", name = "qb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "Lhn;")
    private class59 field3281;

    @OriginalMember(owner = "client!gq", name = "tb", descriptor = "Ljava/lang/String;")
    public static String field3315;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1463(int arg0, String arg1) {
        ++field3274;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (var2 < var3 && class190.method1325(-108, arg1.charAt(var2))) {
                ++var2;
            }
            while (~var3 < ~var2 && class190.method1325(-111, arg1.charAt(var3 - 1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (~var4 <= -2 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                if (arg0 != -1) {
                    return null;
                } else {
                    for (int var6 = var2; ~var3 < ~var6; ++var6) {
                        char var7 = arg1.charAt(var6);
                        if (class280.method1803(true, var7)) {
                            char var8 = class227.method1478(var7, (byte) 99);
                            if (~var8 != -1) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLtq;Lns;)V")
    private final void method1464(boolean arg0, class63 arg1, class57 arg2) {
        ++field3308;
        class275[] var4 = arg2.method430();
        class493[] var5 = arg2.method428();
        if ((this.field3281 == null || this.field3281.field819) && (var4 != null || var5 != null)) {
            this.field3281 = new class59(class452.field6418);
        }
        if (!arg0) {
            method1463(62, (String) null);
        }
        if (this.field3281 != null) {
            this.field3281.method466(arg1, (long) class452.field6418, var4, var5, false);
            this.field3281.method463(super.field4545, super.field4542, super.field4541, super.field4547, super.field4552);
        }
    }

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3314 = null;
        field3275 = null;
        if (arg0 == 150) {
            field3315 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3286 = arg5;
        this.field3304 = false;
        this.field3296 = arg0;
        this.field3301 = arg6;
        this.field3292 = arg9;
        this.field3271 = arg7;
        this.field3309 = arg10;
        this.field3295 = arg8;
        int var12 = class322.field4848.method951(this.field3296, (byte) 67).field2862;
        if (~var12 == 0) {
            this.field3289 = null;
        } else {
            this.field3289 = class170.field2423.method1586(var12, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILtq;)V")
    public final void method260(int arg0, class63 arg1) {
        ++field3302;
        class57 var3 = this.method1466(arg0, arg1, (byte) 94);
        if (var3 != null) {
            class315 var4 = arg1.method565();
            var4.method481(this.field3297);
            var4.method487(this.field3276);
            var4.method478((int) this.field3279, (int) this.field3277, (int) this.field3311);
            this.field3305 = var3.method400();
            this.method1464(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILtq;B)Lns;")
    private final class57 method1466(int arg0, class63 arg1, byte arg2) {
        if (arg2 != 94) {
            return null;
        } else {
            ++field3280;
            class188 var4 = class322.field4848.method951(this.field3296, (byte) 76);
            return var4.method1296(arg0, arg1, this.field3307, this.field3313, this.field3291, -103, class170.field2423);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZLtq;Lhm;III)V")
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -41) {
            this.field3311 = 0.7432884980819014D;
        }
        ++field3273;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILki;)Z")
    public static final boolean method1467(int arg0, class218 arg1) {
        ++field3303;
        class271 var2 = class206.field3124.method338((byte) 126, arg1.method257(false));
        if (var2.field4064 == -1) {
            return true;
        } else if (arg0 < 82) {
            return true;
        } else {
            class150 var3 = class256.field3796.method2243((byte) 109, var2.field4064);
            return ~var3.field2100 == 0 ? true : var3.method1015((byte) -124);
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)I")
    public final int method899(int arg0) {
        if (arg0 != 0) {
            this.field3271 = -92;
        }
        ++field3310;
        return this.field3305;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
    public final boolean method253(int arg0) {
        ++field3294;
        if (arg0 > -9) {
            this.method259((class63) null, 37, 110, 109);
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Ltq;I)Lcj;")
    public final class123 method252(class63 arg0, int arg1) {
        ++field3300;
        class57 var3 = this.method1466(1024, arg0, (byte) 94);
        if (var3 == null) {
            return null;
        } else {
            class315 var4 = arg0.method565();
            var4.method481(this.field3297);
            var4.method487(this.field3276);
            var4.method478((int) this.field3279, (int) this.field3277, (int) this.field3311);
            if (this.field3281 == null) {
                var3.method404(var4, (class117) null, 0);
            } else {
                class268 var5 = this.field3281.method459();
                arg0.method552(var3, var5, var4, (class117) null, 0);
            }
            this.field3305 = var3.method400();
            if (arg1 != 2) {
                this.method245((byte) -75, true, (class63) null, (class352) null, -57, -67, 105);
            }
            this.method1464(true, arg0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lvg;Lbg;III)V")
    public static final void method1468(class51 arg0, class257 arg1, int arg2, int arg3, int arg4) {
        ++field3290;
        if (~(arg3 & 16384) != -1) {
            int var5 = class452.field6418;
            int var6 = arg0.method2635(61);
            int var7 = arg0.method2626(126);
            arg1.method1925(var6, var5, var7, -12693);
        }
        if (arg2 != 150) {
            field3275 = null;
        }
        byte var8 = -1;
        if ((arg3 & 4) != 0) {
            int var9 = arg0.method2585(123);
            if (~var9 == -65536) {
                var9 = -1;
            }
            int var10 = arg0.method2616((byte) 22);
            class124.method870(var9, var10, (byte) 109, arg1);
        }
        if ((8192 & arg3) != 0) {
            int var11 = arg0.method2631(arg2 + 2380);
            arg1.field4665 = arg0.method2616((byte) 92);
            arg1.field4639 = arg0.method2628(49152);
            arg1.field4664 = 32767 & var11;
            arg1.field4598 = (32768 & var11) != 0;
            arg1.field4623 = class452.field6418 + arg1.field4665 + arg1.field4664;
        }
        if (~(arg3 & 2) != -1) {
            arg1.field3806 = arg0.method2585(109);
            if (~arg1.field4678 == -1) {
                arg1.method1924(arg1.field3806, (byte) 120);
                arg1.field3806 = -1;
            }
        }
        if (~(arg3 & 4096) != -1) {
            int var12 = arg0.method2616((byte) -79);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            int[] var15 = new int[var12];
            for (int var16 = 0; var12 > var16; ++var16) {
                int var17 = arg0.method2585(79);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                var13[var16] = var17;
                var14[var16] = arg0.method2628(49152);
                var15[var16] = arg0.method2598(arg2 + 15079);
            }
            class236.method1532(var15, arg1, var14, true, var13);
        }
        if (~(arg3 & 1024) != -1) {
            arg1.field4641 = arg0.method2582((byte) -66);
            if (~arg1.field4641.charAt(0) == -127) {
                arg1.field4641 = arg1.field4641.substring(1);
                class462.method2719(arg1.method1699(false, -1), 2, 0, (byte) -78, arg1.method1693(true, (byte) -67), arg1.field4641);
            } else if (class472.field6622 == arg1) {
                class462.method2719(arg1.method1699(false, -1), 2, 0, (byte) -78, arg1.method1693(true, (byte) -67), arg1.field4641);
            }
            arg1.field4655 = 0;
            arg1.field4594 = 0;
            arg1.field4605 = 150;
        }
        if ((arg3 & 8) != 0) {
            int var18 = arg0.method2631(2530);
            if (var18 == 65535) {
                var18 = -1;
            }
            arg1.field4635 = var18;
        }
        if ((arg3 & 256) != 0) {
            int var19 = arg0.method2598(15229);
            int var20 = arg0.method2617(1538701744);
            if (var19 == 65535) {
                var19 = -1;
            }
            boolean var21 = true;
            if (~var19 != 0 && ~arg1.field4618 != 0) {
                if (~arg1.field4618 == ~var19) {
                    class188 var22 = class322.field4848.method951(var19, (byte) 56);
                    if (var22.field2861 && var22.field2862 != -1) {
                        class356 var23 = class170.field2423.method1586(var22.field2862, (byte) 36);
                        int var24 = var23.field5415;
                        if (~var24 == -1) {
                            var21 = false;
                        } else if (var24 == 1) {
                            var21 = true;
                        } else if (var24 == 2) {
                            var21 = false;
                            arg1.field4642 = 0;
                        }
                    }
                } else {
                    class188 var25 = class322.field4848.method951(var19, (byte) 113);
                    class188 var26 = class322.field4848.method951(arg1.field4618, (byte) 125);
                    if (~var25.field2862 != 0 && ~var26.field2862 != 0) {
                        class356 var27 = class170.field2423.method1586(var25.field2862, (byte) 36);
                        class356 var28 = class170.field2423.method1586(var26.field2862, (byte) 36);
                        if (var28.field5419 > var27.field5419) {
                            var21 = false;
                        }
                    }
                }
            }
            if (var21) {
                arg1.field4618 = var19;
                arg1.field4633 = var20 >> 16;
                int var29 = class452.field6418;
                arg1.field4637 = (var20 & 65535) + var29;
                arg1.field4658 = 0;
                arg1.field4659 = 0;
                arg1.field4608 = 1;
                if (~arg1.field4637 < ~var29) {
                    arg1.field4659 = -1;
                }
                if (~arg1.field4618 != 0 && ~arg1.field4637 == ~var29) {
                    int var30 = class322.field4848.method951(arg1.field4618, (byte) 75).field2862;
                    if (~var30 != 0) {
                        class356 var31 = class170.field2423.method1586(var30, (byte) 36);
                        if (var31 != null && var31.field5389 != null) {
                            class210.method1416(0, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var31, 15806, arg1.field4538);
                        }
                    }
                }
            }
        }
        if (~(arg3 & 32) != -1) {
            class317.field4765[arg4] = arg0.method2618(false);
        }
        if ((arg3 & 64) != 0) {
            int var32 = arg0.method2635(12);
            int var33 = arg0.method2628(49152);
            arg1.method1925(var32, class452.field6418, var33, -12693);
            arg1.field4630 = class452.field6418 + 300;
            arg1.field4643 = arg0.method2626(127);
        }
        if ((128 & arg3) != 0) {
            int var34 = arg0.method2628(arg2 + 49002);
            byte[] var35 = new byte[var34];
            class446 var36 = new class446(var35);
            arg0.method2589(var34, 0, 98, var35);
            class98.field1400[arg4] = var36;
            arg1.method1704(var36, (byte) -128);
        }
        if (~(512 & arg3) != -1) {
            arg1.field4627 = arg0.method2642(true);
            arg1.field4607 = arg0.method2618(false);
            arg1.field4652 = arg0.method2618(false);
            arg1.field4631 = arg0.method2641(arg2 ^ -244);
            arg1.field4616 = arg0.method2585(101) + class452.field6418;
            arg1.field4628 = arg0.method2631(2530) + class452.field6418;
            arg1.field4613 = arg0.method2626(arg2 ^ -182);
            if (~arg1.field3828 != 0) {
                arg1.field4631 += arg1.field3847;
                arg1.field4678 = 0;
                arg1.field4607 += arg1.field3847;
                arg1.field4652 += arg1.field3828;
                arg1.field4627 += arg1.field3828;
            } else {
                arg1.field4627 += arg1.field4675[0];
                arg1.field4652 += arg1.field4675[0];
                arg1.field4631 += arg1.field4674[0];
                arg1.field4607 += arg1.field4674[0];
                arg1.field4678 = 1;
            }
            arg1.field4673 = 0;
        }
        if ((1 & arg3) != 0) {
            int var37 = arg0.method2598(15229);
            int var38 = arg0.method2626(-73);
            int var39 = arg0.method2626(111);
            int var40 = arg0.field6315;
            boolean var41 = (32768 & var37) != 0;
            if (arg1.field3839 != null && arg1.field3833 != null) {
                boolean var42 = false;
                if (var38 <= 1) {
                    if (var41 || (!class305.field4555 || class174.field2468) && !class206.field3122) {
                        if (class15.method140(arg1.field3839, (byte) -68)) {
                            var42 = true;
                        }
                    } else {
                        var42 = true;
                    }
                }
                if (!var42 && class301.field4488 == 0) {
                    class402.field5871.field6315 = 0;
                    arg0.method2588(var39, class402.field5871.field6316, (byte) 96, 0);
                    class402.field5871.field6315 = 0;
                    int var43 = -1;
                    String var45;
                    if (var41) {
                        var37 &= 32767;
                        class436 var44 = class256.method1690(class402.field5871, 102);
                        var43 = var44.field6171;
                        var45 = var44.field6172.method754((byte) 94, class402.field5871);
                    } else {
                        var45 = class459.method2712(class436.method2541(false, class402.field5871), -81);
                    }
                    arg1.field4641 = var45.trim();
                    arg1.field4655 = var37 >> 8;
                    arg1.field4605 = 150;
                    arg1.field4594 = var37 & 255;
                    int var46;
                    if (var38 != 1 && ~var38 != -3) {
                        var46 = var41 ? 17 : 2;
                    } else {
                        var46 = var41 ? 17 : 1;
                    }
                    if (var38 != 2) {
                        if (var38 == 1) {
                            class269.method1748(var45, "<img=0>" + arg1.method1693(true, (byte) -67), var46, "<img=0>" + arg1.method1699(false, arg2 + -151), (byte) -75, var43, (String) null, 0);
                        } else {
                            class269.method1748(var45, arg1.method1693(true, (byte) -67), var46, arg1.method1699(false, -1), (byte) 96, var43, (String) null, 0);
                        }
                    } else {
                        class269.method1748(var45, "<img=1>" + arg1.method1693(true, (byte) -67), var46, "<img=1>" + arg1.method1699(false, -1), (byte) 108, var43, (String) null, 0);
                    }
                }
            }
            arg0.field6315 = var39 + var40;
        }
        if ((2048 & arg3) != 0) {
            var8 = arg0.method2641(-92);
        }
        if (arg1.field3828 != -1) {
            if (var8 == 127) {
                arg1.method1700(arg1.field3847, 27348, arg1.field3828);
            } else {
                byte var47;
                if (var8 != -1) {
                    var47 = var8;
                } else {
                    var47 = class317.field4765[arg4];
                }
                arg1.method1695(var47, arg1.field3828, (byte) 31, arg1.field3847);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
    public final void method1469(int arg0) {
        if (arg0 != -7360) {
            this.field3279 = -3.1812597403141183D;
        }
        ++field3298;
        super.field4542 = super.field4541 = (short) ((int) (this.field3279 / 128.0D));
        super.field4547 = super.field4552 = (short) ((int) (this.field3311 / 128.0D));
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        ++field3287;
        if (arg0 >= 56) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "(I)V")
    public final void method1470(int arg0) {
        if (this.field3281 != null) {
            this.field3281.method456();
        }
        ++field3282;
        if (arg0 != -1) {
            this.method1466(51, (class63) null, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
    public final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3278;
        if (!this.field3304) {
            double var6 = (double) (-super.field4543 + arg1);
            double var8 = (double) (-super.field4538 + arg3);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3279 = (double) this.field3295 * var6 / var10 + (double) super.field4543;
            this.field3311 = (double) this.field3295 * var8 / var10 + (double) super.field4538;
            this.field3277 = (double) super.field4554;
        }
        double var12 = (double) (-arg2 + 1 + this.field3301);
        this.field3284 = ((double) arg1 + -this.field3279) / var12;
        this.field3306 = ((double) arg3 + -this.field3311) / var12;
        if (arg4 < 73) {
            this.field3311 = -0.4076999808485467D;
        }
        this.field3285 = Math.sqrt(this.field3306 * this.field3306 + this.field3284 * this.field3284);
        if (~this.field3271 == 0) {
            this.field3283 = ((double) arg0 - this.field3277) / var12;
        } else {
            if (!this.field3304) {
                this.field3283 = -this.field3285 * Math.tan((double) this.field3271 * 0.02454369D);
            }
            this.field3272 = ((double) arg0 + -this.field3277 - this.field3283 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public final void method1472(int arg0, int arg1) {
        if (this.field3271 == -1) {
            this.field3277 += (double) arg1 * this.field3283;
        } else {
            this.field3277 += this.field3272 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3283;
            this.field3283 += (double) arg1 * this.field3272;
        }
        this.field3304 = true;
        ++field3299;
        this.field3311 += (double) arg1 * this.field3306;
        this.field3279 += (double) arg1 * this.field3284;
        this.field3276 = arg0 & (int) (Math.atan2(this.field3284, this.field3306) * 2607.5945876176133D) - -8192;
        this.field3297 = 16383 & (int) (Math.atan2(this.field3283, this.field3285) * 2607.5945876176133D);
        if (this.field3289 != null) {
            this.field3291 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field3289.field5421[this.field3307] >= this.field3291) {
                            return;
                        }
                        this.field3291 -= this.field3289.field5421[this.field3307];
                        ++this.field3307;
                        if (~this.field3307 <= ~this.field3289.field5389.length) {
                            this.field3307 -= this.field3289.field5414;
                            if (~this.field3307 > -1 || this.field3307 >= this.field3289.field5389.length) {
                                this.field3307 = 0;
                            }
                        }
                        this.field3313 = this.field3307 + 1;
                    } while (this.field3313 < this.field3289.field5389.length);
                    this.field3313 -= this.field3289.field5414;
                } while (this.field3313 >= 0 && this.field3313 < this.field3289.field5389.length);
                this.field3313 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ltq;III)Z")
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = 96 / ((-59 - arg2) / 58);
        ++field3288;
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3281 != null) {
            this.field3281.method456();
        }
        ++field3293;
    }

    static {
        new class332("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
