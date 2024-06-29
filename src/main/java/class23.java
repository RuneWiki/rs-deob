import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class146 {

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public int field412 = 0;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public int field411 = -1;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[[[Lwd;")
    public static class157[][][] field397 = new class157[4][104][104];

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lec;")
    public static class32 field402 = class73.method594("<col=ffb000>", true);

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Lec;")
    public static class32 field403 = class73.method594("(Y", true);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field415 = new CRC32();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "Lec;")
    public static class32 field422 = class73.method594("mapscene", true);

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lec;")
    public static class32 field417 = class73.method594("Hier wechseln", true);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
    public static boolean field418 = false;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
    public static boolean field416 = false;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Lec;")
    private static class32 field424 = class73.method594("To create a new account you need to", true);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "Lec;")
    public static class32 field421 = field424;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method163(int arg0) {
        field415 = null;
        field417 = null;
        field424 = null;
        field397 = null;
        field421 = null;
        field422 = null;
        field403 = null;
        int var1 = 37 / ((-arg0 - 59) / 48);
        field402 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IJ)V")
    public static final void method164(int arg0, long arg1) {
        field399++;
        if (arg1 == 0L) {
            return;
        }
        if (class106.field2506 >= 100) {
            class79.method629((byte) 98, class107.field2547, 0, class77.field1787);
            return;
        }
        class32 var3 = class9.method59(arg1, 1).method264((byte) 52);
        for (int var4 = 0; var4 < class106.field2506; var4++) {
            if (class103.field2409[var4] == arg1) {
                class79.method629((byte) 98, class52.method403(new class32[] { var3, class4.field59 }, (byte) -20), 0, class77.field1787);
                return;
            }
        }
        for (int var5 = 0; var5 < class2.field20; var5++) {
            if (class33.field695[var5] == arg1) {
                class79.method629((byte) 98, class52.method403(new class32[] { class5.field95, var3, class94.field2180 }, (byte) -20), 0, class77.field1787);
                return;
            }
        }
        if (var3.method272(true, class20.field373.field1660)) {
            class79.method629((byte) 98, class43.field1010, 0, class77.field1787);
            return;
        }
        class103.field2409[class106.field2506] = arg1;
        class106.field2504++;
        class71.field1686[class106.field2506++] = class9.method59(arg1, 1);
        class2.field26 = class115.field2769;
        if (arg0 < 16) {
            method166((byte) -120, -78);
        }
        class44.field1027.method357(38, -109);
        class44.field1027.method542(arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLlf;)V")
    public static final void method165(byte arg0, class82 arg1) {
        field419++;
        if (class117.field2794) {
            class119.method938((byte) 33, arg1);
            return;
        }
        if (class79.field1827 == 1 && class9.field166 >= 715 && class66.field1590 >= 453) {
            class30.field551 = !class30.field551;
            if (class30.field551) {
                class68.method566(true);
            } else {
                class102.method825(class74.field1749, class124.field2889, false, 255, class73.field1713, (byte) -122);
            }
        }
        if (class134.field3116 == 5) {
            return;
        }
        class66.field1571++;
        if (class134.field3116 != 10) {
            return;
        }
        if (class107.field2534 != 2 && class20.field371 == 0) {
            if (class79.field1827 == 1) {
                byte var2 = 5;
                byte var3 = 35;
                short var4 = 463;
                byte var5 = 100;
                if (var2 <= class9.field166 && class9.field166 <= var2 + var5 && var4 <= class66.field1590 && class66.field1590 <= var4 + var3) {
                    class83.method653(7032);
                    return;
                }
            }
            if (class81.field1873 != null) {
                class83.method653(7032);
            }
        }
        int var6 = class79.field1827;
        if (arg0 != 93) {
            return;
        }
        int var7 = class66.field1590;
        int var8 = class9.field166;
        if (class11.field189 == 0) {
            short var9 = 291;
            short var10 = 302;
            if (var6 == 1 && var10 - 75 <= var8 && var8 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class135.field3136 = 0;
                class11.field189 = 3;
            }
            short var11 = 462;
            if (var6 == 1 && var8 >= var11 - 75 && var11 + 75 >= var8 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class74.field1755 = class133.field3092;
                class74.field1741 = class133.field3067;
                class135.field3136 = 0;
                class74.field1743 = class77.field1788;
                class11.field189 = 2;
                return;
            }
        } else if (class11.field189 == 2) {
            short var14 = 302;
            short var15 = 231;
            int var20 = var15 + 30;
            if (var6 == 1 && var7 >= var20 - 15 && var7 < var20) {
                class135.field3136 = 0;
            }
            var20 += 15;
            short var16 = 321;
            if (var6 == 1 && var20 - 15 <= var7 && var20 > var7) {
                class135.field3136 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var14 - 75 <= var8 && var14 + 75 >= var8 && var16 - 20 <= var7 && var7 <= var16 + 20) {
                class74.field1752 = class74.field1752.method244((byte) 117).method264((byte) 52);
                if (class74.field1752.method240((byte) 15) == 0) {
                    class114.method893(false, class133.field3096, class133.field3039, class37.field893);
                    return;
                }
                if (class74.field1739.method240((byte) 107) == 0) {
                    class114.method893(false, class133.field3085, class133.field3097, class136.field3170);
                    return;
                }
                class114.method893(false, class133.field3053, class133.field3079, class105.field2489);
                class54.method426(0, 20);
                return;
            }
            short var17 = 462;
            if (var6 == 1 && var17 - 75 <= var8 && var17 + 75 >= var8 && var16 - 20 <= var7 && var16 + 20 >= var7) {
                class74.field1739 = class74.field1749;
                class11.field189 = 0;
                class74.field1752 = class74.field1749;
            }
            while (true) {
                while (class145.method1091((byte) 65)) {
                    boolean var18 = false;
                    for (int var19 = 0; class91.field2085.method240((byte) 64) > var19; var19++) {
                        if (class109.field2564 == class91.field2085.method260(124, var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (class135.field3136 == 0) {
                        if (class13.field224 == 85 && class74.field1752.method240((byte) 99) > 0) {
                            class74.field1752 = class74.field1752.method241((byte) 32, 0, class74.field1752.method240((byte) 104) - 1);
                        }
                        if (class13.field224 == 84 || class13.field224 == 80) {
                            class135.field3136 = 1;
                        }
                        if (var18 && class74.field1752.method240((byte) 50) < 12) {
                            class74.field1752 = class74.field1752.method277(255, class109.field2564);
                        }
                    } else if (class135.field3136 == 1) {
                        if (class13.field224 == 85 && class74.field1739.method240((byte) 85) > 0) {
                            class74.field1739 = class74.field1739.method241((byte) 4, 0, class74.field1739.method240((byte) 52) - 1);
                        }
                        if (class13.field224 == 84 || class13.field224 == 80) {
                            class135.field3136 = 0;
                        }
                        if (class70.field1647 == 2 && class13.field224 == 84) {
                            class74.field1752 = class74.field1752.method244((byte) 121).method264((byte) 52);
                            if (class74.field1752.method240((byte) 115) == 0) {
                                class114.method893(false, class133.field3096, class133.field3039, class37.field893);
                                return;
                            }
                            if (class74.field1739.method240((byte) 82) == 0) {
                                class114.method893(false, class133.field3085, class133.field3097, class136.field3170);
                                return;
                            }
                            class114.method893(false, class133.field3053, class133.field3079, class105.field2489);
                            class54.method426(0, 20);
                            return;
                        }
                        if (var18 && class74.field1739.method240((byte) 84) < 20) {
                            class74.field1739 = class74.field1739.method277(255, class109.field2564);
                        }
                    }
                }
                return;
            }
        } else if (class11.field189 == 3) {
            short var12 = 382;
            short var13 = 321;
            if (var6 == 1 && var12 - 75 <= var8 && var8 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                class11.field189 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z")
    public static final boolean method166(byte arg0, int arg1) {
        if (arg0 < 82) {
            return true;
        }
        field409++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method167(byte arg0) {
        field400++;
        if (!class136.field3172) {
            return;
        }
        class43.field999 = null;
        class156.field3558 = null;
        class74.field1753 = null;
        class41.field959 = null;
        if (arg0 > -95) {
            return;
        }
        class156.field3567 = null;
        class45.field1053 = null;
        class80.field1852 = null;
        class70.field1652 = null;
        class3.field44 = null;
        class100.field2322 = null;
        class98.field2264 = null;
        class4.field71 = null;
        class124.field2892 = null;
        class133.field3088 = null;
        class94.field2171 = null;
        class5.field99 = null;
        class14.field237 = null;
        class63.field1443 = null;
        class9.field160 = null;
        class54.field1265 = null;
        class152.method1178(2, (byte) 55);
        class94.method742(0, true);
        class136.field3172 = false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
    public static final int method168(int arg0, int arg1, int arg2) {
        field407++;
        int var3 = -35 / ((arg0 - 51) / 39);
        int var4 = 0;
        while (arg2 > 0) {
            var4 = arg1 & 0x1 | var4 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var4;
    }
}
