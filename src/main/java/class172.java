import jaclib.memory.Stream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class172 extends class63 {

    @OriginalMember(owner = "client!bga", name = "Ib", descriptor = "Lst;")
    public static class335 field2382 = new class335(58, 3);

    @OriginalMember(owner = "client!bga", name = "Ob", descriptor = "[I")
    public static int[] field2388 = new int[2048];

    @OriginalMember(owner = "client!bga", name = "Gb", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!bga", name = "Hb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!bga", name = "Jb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!bga", name = "Kb", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!bga", name = "Lb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!bga", name = "Mb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!bga", name = "Pb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!bga", name = "Qb", descriptor = "Lmga;")
    public static class30 field2390;

    @OriginalMember(owner = "client!bga", name = "Nb", descriptor = "[[[Z")
    public static boolean[][][] field2387;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        field2387 = null;
        if (arg0 <= 38) {
            method1099((String) null, -89);
        }
        field2390 = null;
        field2382 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1099(String arg0, int arg1) {
        ++field2383;
        int var2 = -117 % ((arg1 - 37) / 48);
        StringBuffer var3 = new StringBuffer();
        int var4 = arg0.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            char var6 = arg0.charAt(var5);
            if (var6 == '%' && ~(var5 + 2) > ~var4) {
                char var7 = arg0.charAt(var5 - -1);
                boolean var8 = false;
                int var9;
                if (~var7 <= -49 && ~var7 >= -58) {
                    var9 = var7 + -48;
                } else if (var7 >= 'a' && ~var7 >= -103) {
                    var9 = var7 + '\n' + -97;
                } else {
                    if (~var7 > -66 || ~var7 < -71) {
                        var3.append('%');
                        continue;
                    }
                    var9 = var7 - 'A' + 10;
                }
                int var10 = var9 * 16;
                char var11 = arg0.charAt(var5 + 2);
                int var12;
                if (~var11 <= -49 && var11 <= '9') {
                    var12 = var11 + -48 + var10;
                } else if (var11 >= 'a' && var11 <= 'f') {
                    var12 = 10 - (-var11 - -97) + var10;
                } else {
                    if (~var11 > -66 || var11 > 'F') {
                        var3.append('%');
                        continue;
                    }
                    var12 = var11 + -55 + var10;
                }
                if (~var12 != -1 && class31.method173((byte) var12, (byte) -12)) {
                    var3.append(class211.method1253(64, (byte) var12));
                }
                var5 += 2;
            } else if (~var6 == -44) {
                var3.append(' ');
            } else {
                var3.append(var6);
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(FI)V")
    public final void method1100(float arg0, int arg1) {
        ++field2385;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field954[super.field956++] = (byte) var3;
        super.field954[super.field956++] = (byte) (var3 >> 8);
        int var4 = 120 / ((-67 - arg1) / 42);
        super.field954[super.field956++] = (byte) (var3 >> 16);
        super.field954[super.field956++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "(B)Z")
    public static final boolean method1101(byte arg0) {
        ++field2386;
        try {
            if (arg0 > -118) {
                field2389 = -8;
            }
            class698 var1 = new class698();
            byte[] var2 = var1.method3945(class300.field4252, -26956);
            class10.method49(var2, 0);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IF)V")
    public final void method1102(int arg0, float arg1) {
        ++field2381;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field954[super.field956++] = (byte) (var3 >> 24);
        super.field954[super.field956++] = (byte) (var3 >> 16);
        if (arg0 != -732814632) {
            this.method1102(13, 2.2461975F);
        }
        super.field954[super.field956++] = (byte) (var3 >> 8);
        super.field954[super.field956++] = (byte) var3;
    }

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "(I)V")
    public static final void method1103(int arg0) {
        int var1 = 0;
        if (arg0 != -17564) {
            method1101((byte) -17);
        }
        while (~var1 > ~class456.field6315) {
            int var2 = class606.field8182[var1];
            class679 var3 = ((class234) class372.field5245.method812(103, (long) var2)).field3471;
            int var4 = class352.field5071.method505((byte) -119);
            if (~(var4 & 1) != -1) {
                var4 += class352.field5071.method505((byte) -119) << 8;
            }
            if (~(256 & var4) != -1) {
                var4 += class352.field5071.method505((byte) -119) << 16;
            }
            if (~(8 & var4) != -1) {
                var3.field9448 = class352.field5071.method455(-82);
                var3.field9441 = class352.field5071.method455(-91);
            }
            if (~(65536 & var4) != -1) {
                int var5 = class352.field5071.method455(arg0 ^ 17630);
                int var6 = class352.field5071.method483(-30458);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class352.field5071.method505((byte) -119);
                int var8 = var7 & 7;
                int var9 = 15 & var7 >> 3;
                if (~var9 == -16) {
                    var9 = -1;
                }
                var3.method3078(var8, var6, var9, var5, false, 2);
            }
            if ((128 & var4) != 0) {
                int var10 = class352.field5071.method500((byte) -41);
                int var11 = class352.field5071.method457(-14532);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var12 = class352.field5071.method466(-99);
                int var13 = var12 & 7;
                int var14 = 15 & var12 >> 3;
                if (~var14 == -16) {
                    var14 = -1;
                }
                var3.method3078(var13, var11, var14, var10, false, 0);
            }
            if ((16384 & var4) != 0) {
                int var15 = class352.field5071.method498(arg0 + 17479);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; ~var15 < ~var19; ++var19) {
                    int var20 = class352.field5071.method506(arg0 ^ 17636);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class352.field5071.method505((byte) -119);
                    var18[var19] = class352.field5071.method455(-104);
                }
                class244.method1642(var3, 0, var17, var16, var18);
            }
            if ((262144 & var4) != 0) {
                int var21 = var3.field9436.field1658.length;
                int var22 = 0;
                if (var3.field9436.field1627 != null) {
                    var22 = var3.field9436.field1627.length;
                }
                byte var23 = 0;
                if (var3.field9436.field1641 != null) {
                    var22 = var3.field9436.field1641.length;
                }
                int var24 = class352.field5071.method474(11212);
                if (~(var24 & 1) != -2) {
                    int[] var25 = null;
                    if ((2 & var24) == 2) {
                        var25 = new int[var21];
                        for (int var26 = 0; var21 > var26; ++var26) {
                            var25[var26] = class352.field5071.method455(-47);
                        }
                    }
                    short[] var27 = null;
                    if ((var24 & 4) == 4) {
                        var27 = new short[var22];
                        for (int var28 = 0; var22 > var28; ++var28) {
                            var27[var28] = (short) class352.field5071.method500((byte) -121);
                        }
                    }
                    short[] var29 = null;
                    if ((var24 & 8) == 8) {
                        var29 = new short[var23];
                        for (int var30 = 0; ~var23 < ~var30; ++var30) {
                            var29[var30] = (short) class352.field5071.method455(-78);
                        }
                    }
                    long var31 = (long) var2 | (long) (var3.field9421++) << 32;
                    new class688(var31, var25, var27, var29);
                }
            }
            if (~(131072 & var4) != -1) {
                var3.field9425 = class352.field5071.method479((byte) -124);
                if ("".equals(var3.field9425) || var3.field9425.equals(var3.field9436.field1691)) {
                    var3.field9425 = var3.field9436.field1691;
                }
            }
            if (~(64 & var4) != -1) {
                var3.field7122 = class352.field5071.method455(-52);
                if (~var3.field7122 == -65536) {
                    var3.field7122 = -1;
                }
            }
            if ((16 & var4) != 0) {
                int[] var33 = new int[4];
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    var33[var34] = class352.field5071.method500((byte) 110);
                    if (var33[var34] == 65535) {
                        var33[var34] = -1;
                    }
                }
                int var35 = class352.field5071.method466(-72);
                class563.method3306(var33, var35, (byte) -99, var3);
            }
            if ((var4 & 524288) != 0) {
                var3.field9419 = class352.field5071.method506(-120);
                if (var3.field9419 == 65535) {
                    var3.field9419 = var3.field9436.field1681;
                }
            }
            if (~(4096 & var4) != -1) {
                int var36 = class352.field5071.method506(arg0 ^ 17646);
                var3.field7160 = class352.field5071.method498(-108);
                var3.field7161 = class352.field5071.method498(arg0 + 17509);
                var3.field7174 = (var36 & 32768) != 0;
                var3.field7144 = var36 & 32767;
                var3.field7102 = class483.field6741 + var3.field7144 - -var3.field7160;
            }
            if (~(4 & var4) != -1) {
                int var37 = class352.field5071.method474(11212);
                if (var37 > 0) {
                    for (int var38 = 0; ~var38 > ~var37; ++var38) {
                        int var39 = -1;
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = class352.field5071.method478(arg0 + 17458);
                        if (var42 == 32767) {
                            var42 = class352.field5071.method478(arg0 + 17471);
                            var40 = class352.field5071.method478(arg0 ^ 17653);
                            var39 = class352.field5071.method478(-89);
                            var41 = class352.field5071.method478(-95);
                        } else if (var42 == 32766) {
                            var42 = -1;
                        } else {
                            var40 = class352.field5071.method478(-116);
                        }
                        int var43 = class352.field5071.method478(-128);
                        int var44 = class352.field5071.method474(11212);
                        var3.method3083(var39, class483.field6741, var42, var40, var44, var43, (byte) -106, var41);
                    }
                }
            }
            if ((var4 & 2048) != 0) {
                var3.field7157 = class352.field5071.method503(true);
                var3.field7104 = class352.field5071.method503(true);
                var3.field7163 = class352.field5071.method491(false);
                var3.field7145 = (byte) class352.field5071.method505((byte) -119);
                var3.field7154 = class483.field6741 + class352.field5071.method482(arg0 ^ 772576428);
                var3.field7120 = class483.field6741 - -class352.field5071.method482(-772591672);
            }
            if ((var4 & 32768) != 0) {
                var3.field7129 = class352.field5071.method452(1475501192);
                var3.field7140 = class352.field5071.method491(false);
                var3.field7175 = class352.field5071.method452(1475501192);
                var3.field7119 = class352.field5071.method491(false);
                var3.field7107 = class352.field5071.method455(arg0 ^ 17588) - -class483.field6741;
                var3.field7173 = class352.field5071.method455(-98) - -class483.field6741;
                var3.field7101 = class352.field5071.method466(arg0 + 17658);
                var3.field7129 += var3.field7197[0];
                var3.field7119 += var3.field7198[0];
                var3.field7175 += var3.field7197[0];
                var3.field7203 = 1;
                var3.field7140 += var3.field7198[0];
                var3.field7199 = 0;
            }
            if ((var4 & 512) != 0) {
                int var45 = var3.field9436.field1654.length;
                int var46 = 0;
                if (var3.field9436.field1627 != null) {
                    var46 = var3.field9436.field1627.length;
                }
                int var47 = 0;
                if (var3.field9436.field1641 != null) {
                    var47 = var3.field9436.field1641.length;
                }
                int var48 = class352.field5071.method498(-60);
                if ((1 & var48) == 1) {
                    var3.field9443 = null;
                } else {
                    int[] var49 = null;
                    if (~(2 & var48) == -3) {
                        var49 = new int[var45];
                        for (int var50 = 0; var50 < var45; ++var50) {
                            var49[var50] = class352.field5071.method500((byte) -30);
                        }
                    }
                    short[] var51 = null;
                    if ((4 & var48) == 4) {
                        var51 = new short[var46];
                        for (int var52 = 0; var46 > var52; ++var52) {
                            var51[var52] = (short) class352.field5071.method482(class134.method848(arg0, 772576428));
                        }
                    }
                    short[] var53 = null;
                    if ((8 & var48) == 8) {
                        var53 = new short[var47];
                        for (int var54 = 0; var47 > var54; ++var54) {
                            var53[var54] = (short) class352.field5071.method506(-119);
                        }
                    }
                    long var55 = (long) (var3.field9428++) << 32 | (long) var2;
                    var3.field9443 = new class688(var55, var49, var51, var53);
                }
            }
            if ((1024 & var4) != 0) {
                int var57 = class352.field5071.method506(-97);
                if (var57 == 65535) {
                    var57 = -1;
                }
                int var58 = class352.field5071.method469(-4040);
                int var59 = class352.field5071.method505((byte) -119);
                int var60 = var59 & 7;
                int var61 = (126 & var59) >> 3;
                if (var61 == 15) {
                    var61 = -1;
                }
                var3.method3078(var60, var58, var61, var57, false, 1);
            }
            if ((32 & var4) != 0) {
                var3.field7162 = class352.field5071.method479((byte) -109);
                var3.field7124 = 100;
            }
            if ((var4 & 2) != 0) {
                if (var3.field9436.method768(arg0 ^ 17640)) {
                    class333.method2130((byte) 124, var3);
                }
                var3.method3826(class525.field7291.method146(2, class352.field5071.method506(-122)), 0);
                var3.method3081(var3.field9436.field1656, 32679);
                var3.field7136 = var3.field9436.field1702 << 3;
                if (var3.field9436.method768(arg0 ^ 17575)) {
                    class38.method204((class96) null, 0, var3, var3.field7197[0], var3.field4408, -27170, (class220) null, var3.field7198[0]);
                }
            }
            if ((var4 & 8192) != 0) {
                int var62 = class352.field5071.method474(11212);
                int[] var63 = new int[var62];
                int[] var64 = new int[var62];
                for (int var65 = 0; ~var62 < ~var65; ++var65) {
                    int var66 = class352.field5071.method506(-121);
                    if ((49152 & var66) != 49152) {
                        var63[var65] = var66;
                    } else {
                        int var67 = class352.field5071.method500((byte) 111);
                        var63[var65] = class678.method3817(var66 << 16, var67);
                    }
                    var64[var65] = class352.field5071.method482(arg0 + -772574108);
                }
                var3.method3077(var63, var64, 1);
            }
            ++var1;
        }
        ++field2384;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBLjava/lang/String;Lrp;)Ljg;")
    public static final class246 method1104(int arg0, byte arg1, String arg2, class135 arg3) {
        ++field2380;
        if (arg0 == 0) {
            return arg3.method866(arg2, (byte) -125);
        } else if (~arg0 == -2) {
            try {
                class69.method541(class320.field4445, "openjs", -67, new Object[] { (new URL(class320.field4445.getCodeBase(), arg2)).toString() });
                class246 var4 = new class246();
                var4.field3633 = 1;
                return var4;
            } catch (Throwable var11) {
                class246 var5 = new class246();
                var5.field3633 = 2;
                return var5;
            }
        } else if (~arg0 == -3) {
            try {
                class320.field4445.getAppletContext().showDocument(new URL(class320.field4445.getCodeBase(), arg2), "_blank");
                class246 var6 = new class246();
                var6.field3633 = 1;
                return var6;
            } catch (Exception var12) {
                class246 var7 = new class246();
                var7.field3633 = 2;
                return var7;
            }
        } else if (~arg0 == -4) {
            try {
                class69.method540("loggedout", class320.field4445, -127);
            } catch (Throwable var14) {
            }
            try {
                class320.field4445.getAppletContext().showDocument(new URL(class320.field4445.getCodeBase(), arg2), "_top");
                class246 var8 = new class246();
                var8.field3633 = 1;
                return var8;
            } catch (Exception var13) {
                class246 var9 = new class246();
                var9.field3633 = 2;
                return var9;
            }
        } else {
            int var10 = 12 / ((arg1 - -15) / 56);
            throw new IllegalArgumentException();
        }
    }
}
