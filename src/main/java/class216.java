import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class216 extends class73 {

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    private int field3326;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[C")
    public static char[] field3315 = new char[128];

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3324 = null;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[J")
    public static long[] field3322 = new long[1000];

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lhl;")
    public static class139 field3319 = new class139(16);

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lpk;")
    public static class237 field3316;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)V")
    public static final void method1451(byte arg0, boolean arg1) {
        class176.field2578 = arg1;
        ++field3329;
        if (arg0 == 44) {
            if (class176.field2578) {
                int var2 = class173.field2543.method447(30925);
                int var3 = class173.field2543.method401((byte) -42);
                int var4 = class173.field2543.method447(arg0 + 30881);
                int var5 = class173.field2543.method397(62);
                class173.field2543.method1541((byte) -116);
                for (int var6 = 0; var6 < 4; ++var6) {
                    for (int var23 = 0; ~var23 > -14; ++var23) {
                        for (int var24 = 0; ~var24 > -14; ++var24) {
                            int var25 = class173.field2543.method1544(arg0 + 69, 1);
                            if (~var25 != -2) {
                                class195.field2952[var6][var23][var24] = -1;
                            } else {
                                class195.field2952[var6][var23][var24] = class173.field2543.method1544(110, 26);
                            }
                        }
                    }
                }
                class173.field2543.method1538((byte) 97);
                int var7 = (-class173.field2543.field887 + class45.field784) / 16;
                class32.field581 = new int[var7][4];
                for (int var8 = 0; var8 < var7; ++var8) {
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        class32.field581[var8][var22] = class173.field2543.method411((byte) 112);
                    }
                }
                int var9 = class173.field2543.method447(arg0 + 30881);
                boolean var10 = class76.method605((byte) -77, class173.field2543.method407(255));
                class165.field2429 = new byte[var7][];
                class51.field841 = new int[var7];
                class283.field4334 = new int[var7];
                class244.field3786 = new int[var7];
                class220.field3417 = null;
                class168.field2480 = null;
                class18.field323 = new int[var7];
                class59.field976 = new int[var7];
                class259.field3974 = new byte[var7][];
                int var11 = 0;
                for (int var12 = 0; ~var12 > -5; ++var12) {
                    for (int var13 = 0; ~var13 > -14; ++var13) {
                        for (int var14 = 0; ~var14 > -14; ++var14) {
                            int var15 = class195.field2952[var12][var13][var14];
                            if (var15 != -1) {
                                int var16 = (var15 & 16383) >> 3;
                                int var17 = (16772591 & var15) >> 14;
                                int var18 = (var17 / 8 << 8) + var16 / 8;
                                for (int var19 = 0; ~var11 < ~var19; ++var19) {
                                    if (~class18.field323[var19] == ~var18) {
                                        var18 = -1;
                                        break;
                                    }
                                }
                                if (~var18 != 0) {
                                    int var20 = var18 >> 8 & 255;
                                    int var21 = var18 & 255;
                                    class18.field323[var11] = var18;
                                    class51.field841[var11] = class210.field3143.method1621("m" + var20 + "_" + var21, 1);
                                    class283.field4334[var11] = class210.field3143.method1621("l" + var20 + "_" + var21, 1);
                                    class59.field976[var11] = class210.field3143.method1621("um" + var20 + "_" + var21, 1);
                                    class244.field3786[var11] = class210.field3143.method1621("ul" + var20 + "_" + var21, 1);
                                    ++var11;
                                }
                            }
                        }
                    }
                }
                class12.method87(false, 789221, var3, var9, var2, var10, var4, var5);
            } else {
                int var26 = class173.field2543.method397(49);
                int var27 = class173.field2543.method447(30925);
                boolean var28 = class76.method605((byte) -77, class173.field2543.method450(-106));
                int var29 = class173.field2543.method407(255);
                int var30 = class173.field2543.method421(arg0 + 211);
                int var31 = class173.field2543.method447(30925);
                int var32 = (-class173.field2543.field887 + class45.field784) / 16;
                class32.field581 = new int[var32][4];
                for (int var33 = 0; var33 < var32; ++var33) {
                    for (int var39 = 0; ~var39 > -5; ++var39) {
                        class32.field581[var33][var39] = class173.field2543.method411((byte) -21);
                    }
                }
                class165.field2429 = new byte[var32][];
                class259.field3974 = new byte[var32][];
                class283.field4334 = new int[var32];
                class244.field3786 = new int[var32];
                boolean var34 = false;
                class51.field841 = new int[var32];
                class220.field3417 = null;
                class168.field2480 = null;
                class18.field323 = new int[var32];
                class59.field976 = new int[var32];
                int var35 = 0;
                if ((~(var30 / 8) == -49 || ~(var30 / 8) == -50) && ~(var27 / 8) == -49) {
                    var34 = true;
                }
                if (~(var30 / 8) == -49 && ~(var27 / 8) == -149) {
                    var34 = true;
                }
                for (int var36 = (var30 + -6) / 8; ~((var30 + 6) / 8) <= ~var36; ++var36) {
                    for (int var37 = (var27 + -6) / 8; (var27 + 6) / 8 >= var37; ++var37) {
                        int var38 = (var36 << 8) + var37;
                        if (!var34 || ~var37 != -50 && var37 != 149 && ~var37 != -148 && var36 != 50 && (~var36 != -50 || ~var37 != -48)) {
                            class18.field323[var35] = var38;
                            class51.field841[var35] = class210.field3143.method1621("m" + var36 + "_" + var37, 1);
                            class283.field4334[var35] = class210.field3143.method1621("l" + var36 + "_" + var37, 1);
                            class59.field976[var35] = class210.field3143.method1621("um" + var36 + "_" + var37, arg0 + -43);
                            class244.field3786[var35] = class210.field3143.method1621("ul" + var36 + "_" + var37, 1);
                        } else {
                            class18.field323[var35] = var38;
                            class51.field841[var35] = -1;
                            class283.field4334[var35] = -1;
                            class59.field976[var35] = -1;
                            class244.field3786[var35] = -1;
                        }
                        ++var35;
                    }
                }
                class12.method87(false, 789221, var29, var27, var26, var28, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public final void method584(int arg0, int arg1, int arg2) {
        if (arg1 <= 116) {
            this.field3321 = -15;
        }
        ++field3328;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public static void method1452(int arg0) {
        field3316 = null;
        field3319 = null;
        if (arg0 == -5) {
            field3322 = null;
            field3324 = null;
            field3315 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1453(byte[] arg0, byte arg1) {
        ++field3331;
        if (arg1 <= 6) {
            method1454((String[]) null, (byte) -98, -63, 8);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class41.method335(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([Ljava/lang/String;BII)Ljava/lang/String;")
    public static final String method1454(String[] arg0, byte arg1, int arg2, int arg3) {
        ++field3323;
        if (~arg3 == -1) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; ~var5 < ~var7; ++var7) {
                String var11 = arg0[var7];
                if (var11 != null) {
                    var6 += var11.length();
                } else {
                    var6 += 4;
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = arg2;
            if (arg1 != 55) {
                return null;
            } else {
                while (~var9 > ~var5) {
                    String var10 = arg0[var9];
                    if (var10 == null) {
                        var8.append("null");
                    } else {
                        var8.append(var10);
                    }
                    ++var9;
                }
                return var8.toString();
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIII)V")
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3318 = arg3;
        this.field3330 = arg1;
        this.field3321 = arg2;
        this.field3326 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
    public final void method587(int arg0, int arg1, int arg2) {
        ++field3320;
        int var4 = this.field3326 * arg0 >> 12;
        int var5 = this.field3321 * arg0 >> 12;
        if (arg2 != -10) {
            field3315 = null;
        }
        int var6 = this.field3330 * arg1 >> 12;
        int var7 = this.field3318 * arg1 >> 12;
        class88.method666(var4, super.field1182, super.field1181, var7, 0, var5, var6, super.field1188);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)V")
    public final void method588(int arg0, int arg1, int arg2) {
        ++field3327;
        int var4 = this.field3330 * arg0 >> 12;
        int var5 = this.field3321 * arg1 >> 12;
        int var6 = this.field3326 * arg1 >> 12;
        int var7 = this.field3318 * arg0 >> 12;
        class250.method1707(super.field1181, var4, var7, var5, (byte) -128, var6);
        int var8 = -80 % ((61 - arg2) / 46);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1455(byte arg0) {
        ++field3314;
        class234.method1587(0);
        class165.method1125(27968);
        client.method331(0);
        class159.method1076((byte) 92);
        class270.method1821((byte) 8);
        class78.method617(114);
        if (arg0 >= 28) {
            class111.method807(700);
            class170.method1142(26700);
            class75.method602(-18707);
            class9.method71((byte) -74);
            class215.method1446(false);
            class68.method541((byte) 116);
            class19.method136((byte) 77);
            class138.method936((byte) -126);
            class232.method1581(262144);
            class220.method1510(-1);
            class155.method1055((byte) -104);
            class278.method1854(false);
            if (~class138.field1999 != -1) {
                for (int var1 = 0; class297.field4571.length > var1; ++var1) {
                    class297.field4571[var1] = null;
                }
                class12.field170 = 0;
            }
            class215.method1448(1608943980);
            class113.method815((byte) -30);
            class270.field4217.method940(66);
            ((class275) class119.field1790).method1832(-93);
            class188.field2761.method670((byte) -102);
            class215.field3301.method1607(0);
            class81.field1266.method1607(0);
            class239.field3694.method1607(0);
            class211.field3161.method1607(0);
            class210.field3143.method1607(0);
            class220.field3404.method1607(0);
            class287.field4392.method1607(0);
            class36.field637.method1607(0);
            class259.field3966.method1607(0);
            class100.field1465.method1607(0);
            class124.field1841.method1607(0);
            class166.field2446.method940(121);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
    public static final void method1456(int arg0, byte arg1) {
        ++field3325;
        class105 var2 = class9.method72(6, -1, arg0);
        if (arg1 >= 113) {
            var2.method764((byte) 7);
        }
    }
}
