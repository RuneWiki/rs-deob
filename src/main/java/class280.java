import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class280 {

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Lqm;")
    private class259 field4414 = new class259();

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Ltg;")
    private class345 field4420 = new class345();

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    private int field4416;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Lqb;")
    private class117 field4421;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[I")
    public static int[] field4409 = new int[5];

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    public static int[] field4406 = new int[14];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4410 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[I")
    public static int[] field4417 = new int[100];

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IJ)Lqm;", line = 11)
    public final class259 method1998(int arg0, long arg1) {
        class259 var4 = (class259) this.field4421.method770(arg1, arg0 + 1114531725);
        field4413++;
        if (arg0 != -1114531641) {
            method2004((byte) 48);
        }
        if (var4 != null) {
            this.field4420.method2395(16218, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)Lba;", line = 40)
    public final class188 method1999(boolean arg0) {
        if (!arg0) {
            field4415 = 74;
        }
        field4403++;
        return this.field4421.method757(-1);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqm;BJ)V", line = 52)
    public final void method2000(class259 arg0, byte arg1, long arg2) {
        if (this.field4416 == 0) {
            class259 var5 = this.field4420.method2396(1542);
            var5.method1290(-8);
            var5.method1829((byte) -74);
            if (this.field4414 == var5) {
                class259 var6 = this.field4420.method2396(1542);
                var6.method1290(111);
                var6.method1829((byte) -74);
            }
        } else {
            this.field4416--;
        }
        field4404++;
        this.field4421.method764(24369, arg0, arg2);
        int var7 = -127 % ((arg1 + 25) / 62);
        this.field4420.method2395(16218, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 81)
    public static final void method2001(int arg0) {
        field4408++;
        class328.field5282.method304(126, 19830);
        class328.field5282.method1039(0L, (byte) 87);
        if (arg0 != -6562) {
            method2008(102, -93, (String) null, (String) null);
        }
        class245.field3847++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V", line = 97)
    public static final void method2002(int arg0, byte arg1) {
        field4407++;
        int var2 = class302.field4704;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 <= 76) {
            field4415 = 62;
        }
        int var10002;
        while (var3 < var2) {
            class67 var4;
            if (arg0 == 0) {
                var4 = class11.field113;
            } else {
                var4 = class105.field1443[class80.field1067[var3]];
            }
            if (var4 != null && var4.method414((byte) -115)) {
                int var5 = var4.method412((byte) 101);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field3767 & 0x7F) == 64 && (var4.field3763 & 0x7F) == 64) {
                            int var6 = var4.field3767 >> 7;
                            int var7 = var4.field3763 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class312.field4888[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field3767 & 0x7F) == 0 && (var4.field3763 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field3767 & 0x7F) == 64 && (var4.field3763 & 0x7F) == 64)) {
                        int var8 = var4.field3767 - (var5 * 64) >> 7;
                        int var9 = var4.field3763 - (var5 * 64) >> 7;
                        int var10 = var8 + var4.method412((byte) 106);
                        int var11 = var4.method412((byte) 116) + var9;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class312.field4888[var12][var13]++;
                            }
                        }
                    }
                }
            }
            var3++;
        }
        label227: for (int var14 = 0; var14 < var2; var14++) {
            class67 var15;
            long var16;
            if (arg0 == 0) {
                var15 = class11.field113;
                var16 = 8791798054912L;
            } else {
                var15 = class105.field1443[class80.field1067[var14]];
                var16 = (long) class80.field1067[var14] << 32;
            }
            if (var15 != null && var15.method414((byte) 108)) {
                int var18 = var15.method412((byte) 102);
                if (arg0 == 0 || arg0 == var18) {
                    var15.field815 = false;
                    var15.field3706 = true;
                    if ((class327.field5233 && class302.field4704 > 200 || class302.field4704 > 50) && arg0 != 0 && var15.field3778 == var15.method1719(-1).field4486) {
                        var15.field815 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field3767 & 0x7F) == 64 && (var15.field3763 & 0x7F) == 64) {
                            int var19 = var15.field3763 >> 7;
                            int var20 = var15.field3767 >> 7;
                            if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class312.field4888[var20][var19] > 1) {
                                var10002 = class312.field4888[var20][var19]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field3767 & 0x7F) == 0 && (var15.field3763 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field3767 & 0x7F) == 64 && (var15.field3763 & 0x7F) == 0) {
                        int var21 = var15.field3767 - var18 * 64 >> 7;
                        int var22 = var15.field3763 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        int var24 = var22 + var18;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        boolean var25 = true;
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var24; var27++) {
                                if (class312.field4888[var26][var27] <= 1) {
                                    var25 = false;
                                    break;
                                }
                            }
                        }
                        if (var25) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label227;
                                }
                                for (int var29 = var22; var29 < var24; var29++) {
                                    var10002 = class312.field4888[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field3725 == null || var15.field3801 > class102.field1381 || class102.field1381 >= var15.field3793) {
                        var15.field3706 = false;
                        var15.field3800 = class14.method80(var15.field3763, class219.field3290, var15.field3767, (byte) -126);
                        class214.method1495(class219.field3290, var15.field3767, var15.field3763, var15.field3800, var18 * 64 + 60 - 64, var15, var15.field3760, var16, var15.field3728);
                    } else {
                        var15.field815 = false;
                        var15.field3706 = false;
                        var15.field3800 = class14.method80(var15.field3763, class219.field3290, var15.field3767, (byte) -126);
                        class49.method299(class219.field3290, var15.field3767, var15.field3763, var15.field3800, var15, var15.field3760, var16, var15.field3750, var15.field3757, var15.field3779, var15.field3808);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 373)
    public final void method2003(int arg0) {
        if (arg0 > -52) {
            return;
        }
        this.field4420.method2393(-119);
        this.field4421.method769(93);
        field4402++;
        this.field4414 = new class259();
        this.field4416 = this.field4418;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 394)
    public static void method2004(byte arg0) {
        field4406 = null;
        field4409 = null;
        field4410 = null;
        field4417 = null;
        if (arg0 > -13) {
            method2006(31, 7, 26);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZI)V", line = 407)
    public static final void method2005(int arg0, int arg1, boolean arg2, int arg3) {
        field4405++;
        if (arg1 > -93) {
            field4415 = -99;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class146.field2318 = arg3;
        class349.field5573 = arg2;
        class361.field5710 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I", line = 427)
    public static final int method2006(int arg0, int arg1, int arg2) {
        field4412++;
        int var3 = arg2 + (arg1 * 57);
        int var4 = 110 / ((arg0 - 8) / 40);
        int var5 = var3 << 13 ^ var3;
        int var6 = (var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return (var6 & 0x7FCEA9D) >> 19;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Lba;", line = 443)
    public final class188 method2007(int arg0) {
        if (arg0 != -65) {
            this.method1999(true);
        }
        field4419++;
        return this.field4421.method761(arg0 ^ 0xFFFFFF94);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 458)
    public static final int method2008(int arg0, int arg1, String arg2, String arg3) {
        field4411++;
        int var4 = arg3.length();
        int var5 = 0;
        int var6 = arg2.length();
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var5 - var8) || var7 - var9 < var6) {
            if (var4 <= var5 - var8) {
                return -1;
            }
            if (var6 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class138.method951(true, var22);
            var9 = class138.method951(true, var24);
            char var26 = class24.method180(arg0, var22, (byte) 34);
            char var27 = class24.method180(arg0, var24, (byte) 34);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class45.method278(arg0, 44, var28) - class45.method278(arg0, 44, var29);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg0 == 2) {
                var12 = var6 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class45.method278(arg0, arg1 + 104, var16) - class45.method278(arg0, 29, var17);
                }
            }
        }
        int var18 = var4 - var6;
        if (~var18 != arg1) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg3.charAt(var19);
            char var21 = arg2.charAt(var19);
            if (var20 != var21) {
                return class45.method278(arg0, arg1 + 81, var20) - class45.method278(arg0, 108, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V", line = 591)
    public class280(int arg0) {
        this.field4416 = arg0;
        int var2 = 1;
        this.field4418 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field4421 = new class117(var2);
    }
}
