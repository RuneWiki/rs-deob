import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class216 extends class125 {

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "[Lte;")
    public class77[] field3743 = new class77[5];

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public int field3753 = 0;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
    public int[] field3755 = new int[5];

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public int field3747;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3734 = 2;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Loa;")
    public static class99 field3739 = class221.method1463(2844, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Loa;")
    public static class99 field3738 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lda;")
    public static class186 field3745 = new class186(0, 0);

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "B")
    public byte field3751;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lil;")
    public class163 field3756;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lcg;")
    public class167 field3762;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lhe;")
    public class19 field3749;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Lef;")
    public class216 field3740;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lg;")
    public class278 field3757;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Loc;")
    public class61 field3746;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "Lki;")
    public class62 field3758;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Lph;")
    public class78 field3750;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Z")
    public boolean field3741;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Z")
    public boolean field3760;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Z")
    public boolean field3764;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        if (arg0 != -22297) {
            field3739 = null;
        }
        field3736++;
        if (class244.field4218 != 2) {
            if (class11.field97 != class1.field10 || class20.field237 != class122.field2133) {
                class133.field2326 = class11.field97;
                class207.field3593 = class122.field2133;
                class244.field4218 = 2;
                return;
            }
            class244.field4218 = 0;
            if (class65.field1104 && class51.field839[81] && class258.field4497 > 2) {
                class175.method1172((byte) 47, class258.field4497 - 2);
                return;
            }
            class175.method1172((byte) 44, class258.field4497 - 1);
        } else if (class133.field2326 == class1.field10 && class207.field3593 == class20.field237) {
            class244.field4218 = 0;
            if (class65.field1104 && class51.field839[81] && class258.field4497 > 2) {
                class175.method1172((byte) 122, class258.field4497 - 2);
                return;
            }
            class175.method1172((byte) 89, class258.field4497 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLik;)V")
    public static final void method1443(boolean arg0, class261 arg1) {
        if (class128.field2237 != null) {
            try {
                class128.field2237.method632(0, 0L);
                class128.field2237.method622(24, arg1.field4619, arg1.field4587, (byte) -51);
            } catch (Exception var2) {
            }
        }
        field3752++;
        if (arg0) {
            arg1.field4587 += 24;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method1444(int arg0) {
        if (arg0 != -16119) {
            method1446(true, (byte) 111, (class107) null);
        }
        field3745 = null;
        field3738 = null;
        field3739 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
    public class216(int arg0, int arg1, int arg2) {
        this.field3754 = arg1;
        this.field3761 = this.field3747 = arg0;
        this.field3742 = arg2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILtf;II)V")
    public static final void method1445(int arg0, int arg1, class107 arg2, int arg3, int arg4) {
        field3737++;
        class225.method1485(0);
        if (arg0 != -21366) {
            field3734 = 96;
        }
        class68.method453(arg1, arg4, arg1 + arg2.field1933, arg2.field1793 + arg4);
        if (class105.field1761 == 2 || class105.field1761 == 5 || class170.field3031 == null) {
            class68.method454(arg1, arg4, 0, arg2.field1930, arg2.field1858);
        } else {
            int var5 = class239.field4129 + class124.field2178 & 0x7FF;
            int var6 = class168.field3006.field1325 / 32 + 48;
            int var7 = 464 - (class168.field3006.field1301 / 32);
            ((class4) class170.field3031).method28(arg1, arg4, arg2.field1933, arg2.field1793, var6, var7, var5, class260.field4542 + 256, arg2.field1930, arg2.field1858);
            if (class31.field566 != null) {
                for (int var8 = 0; var8 < class31.field566.field1524; var8++) {
                    if (class31.field566.method600(true, var8)) {
                        int var9 = (class31.field566.field1517[var8] - class215.field3731) * 4 + 2 - class168.field3006.field1301 / 32;
                        int var10 = (class31.field566.field1523[var8] - class280.field4910) * 4 + 2 - (class168.field3006.field1325 / 32);
                        int var11 = class134.field2339[var5];
                        int var12 = class134.field2344[var5];
                        int var13 = var11 * 256 / (class260.field4542 + 256);
                        int var14 = var12 * 256 / (class260.field4542 + 256);
                        int var15 = var9 * var14 - (var10 * var13) >> 16;
                        class70 var16 = class244.field4208;
                        if (class31.field566.method603(false, var8) == 1) {
                            var16 = class44.field768;
                        }
                        int var17 = var9 * var13 + (var10 * var14) >> 16;
                        if (class31.field566.method603(false, var8) == 2) {
                            var16 = class228.field3950;
                        }
                        int var18 = var16.method496(class31.field566.field1529[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (-arg2.field1933 <= var19 && var19 <= arg2.field1933 && -arg2.field1793 <= var15 && arg2.field1793 >= var15) {
                            int var20 = 16777215;
                            if (class31.field566.field1525[var8] != -1) {
                                var20 = class31.field566.field1525[var8];
                            }
                            class68.method446(arg2.field1930, arg2.field1858);
                            var16.method482(class31.field566.field1529[var8], arg2.field1933 / 2 + var19 + arg1, arg2.field1793 / 2 + -var15 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            class68.method444();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class152.field2665; var21++) {
                int var56 = class101.field1722[var21] * 4 + 2 - class168.field3006.field1325 / 32;
                int var57 = class180.field3132[var21] * 4 - (class168.field3006.field1301 / 32 - 2);
                class153 var58 = class247.method1601(26012, class190.field3340[var21]);
                if (var58.field2696 != null) {
                    var58 = var58.method1023(-124);
                    if (var58 == null || var58.field2689 == -1) {
                        continue;
                    }
                }
                class56.method378(arg1, var56, var57, (byte) 22, arg4, class80.field1417[var58.field2689], arg2);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class76 var53 = class32.field579[class255.field4407][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class168.field3006.field1325 / 32);
                        int var55 = var52 * 4 + 2 - class168.field3006.field1301 / 32;
                        class56.method378(arg1, var54, var55, (byte) -85, arg4, class96.field1617[0], arg2);
                    }
                }
            }
            for (int var23 = 0; var23 < class102.field1735; var23++) {
                class156 var48 = class248.field4287[class239.field4120[var23]];
                if (var48 != null && var48.method526(38)) {
                    class257 var49 = var48.field2793;
                    if (var49 != null && var49.field4491 != null) {
                        var49 = var49.method1667(arg0 + 21464);
                    }
                    if (var49 != null && var49.field4448 && var49.field4438) {
                        int var50 = var48.field1325 / 32 - (class168.field3006.field1325 / 32);
                        int var51 = var48.field1301 / 32 - (class168.field3006.field1301 / 32);
                        if (var49.field4480 == -1) {
                            class56.method378(arg1, var50, var51, (byte) -87, arg4, class96.field1617[1], arg2);
                        } else {
                            class56.method378(arg1, var50, var51, (byte) -119, arg4, class80.field1417[var49.field4480], arg2);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class190.field3342; var24++) {
                class183 var38 = class259.field4515[class105.field1765[var24]];
                if (var38 != null && var38.method526(104)) {
                    int var39 = var38.field1325 / 32 - class168.field3006.field1325 / 32;
                    boolean var40 = false;
                    int var41 = var38.field1301 / 32 - (class168.field3006.field1301 / 32);
                    long var42 = var38.field3224.method697(arg0 - 2300);
                    for (int var44 = 0; var44 < class82.field1450; var44++) {
                        if (class71.field1203[var44] == var42 && class54.field891[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class142.field2503; var46++) {
                        if (class56.field917[var46].field2187 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class168.field3006.field3226 != 0 && var38.field3226 != 0 && class168.field3006.field3226 == var38.field3226) {
                        var47 = true;
                    }
                    if (var40) {
                        class56.method378(arg1, var39, var41, (byte) -98, arg4, class96.field1617[3], arg2);
                    } else if (var45) {
                        class56.method378(arg1, var39, var41, (byte) 121, arg4, class96.field1617[5], arg2);
                    } else if (var47) {
                        class56.method378(arg1, var39, var41, (byte) 78, arg4, class96.field1617[4], arg2);
                    } else {
                        class56.method378(arg1, var39, var41, (byte) 31, arg4, class96.field1617[2], arg2);
                    }
                }
            }
            int var25 = 0;
            class284[] var26 = class284.field4935;
            while (var26.length > var25) {
                class284 var29 = var26[var25];
                if (var29 != null && var29.field4944 != 0 && class56.field926 % 20 < 10) {
                    if (var29.field4944 == 1 && var29.field4949 >= 0 && var29.field4949 < class248.field4287.length) {
                        class156 var30 = class248.field4287[var29.field4949];
                        if (var30 != null) {
                            int var31 = var30.field1325 / 32 - class168.field3006.field1325 / 32;
                            int var32 = var30.field1301 / 32 - (class168.field3006.field1301 / 32);
                            class173.method1161((byte) 24, arg2, arg1, arg4, var32, var31, var29.field4947);
                        }
                    }
                    if (var29.field4944 == 2) {
                        int var33 = (var29.field4948 - class215.field3731) * 4 + 2 - (class168.field3006.field1301 / 32);
                        int var34 = (var29.field4936 - class280.field4910) * 4 - ((class168.field3006.field1325 / 32) - 2);
                        class173.method1161((byte) 24, arg2, arg1, arg4, var33, var34, var29.field4947);
                    }
                    if (var29.field4944 == 10 && var29.field4949 >= 0 && class259.field4515.length > var29.field4949) {
                        class183 var35 = class259.field4515[var29.field4949];
                        if (var35 != null) {
                            int var36 = var35.field1325 / 32 - (class168.field3006.field1325 / 32);
                            int var37 = var35.field1301 / 32 - (class168.field3006.field1301 / 32);
                            class173.method1161((byte) 24, arg2, arg1, arg4, var37, var36, var29.field4947);
                        }
                    }
                }
                var25++;
            }
            if (class18.field195 != 0) {
                int var27 = class18.field195 * 4 + 2 - class168.field3006.field1325 / 32;
                int var28 = class118.field2096 * 4 - (class168.field3006.field1301 / 32 - 2);
                class56.method378(arg1, var27, var28, (byte) -119, arg4, class290.field5071, arg2);
            }
            class68.method465(arg1 - (1 - (arg2.field1933 / 2)), arg2.field1793 / 2 - 1 + arg4, 3, 3, 16777215);
        }
        class101.field1720[arg3] = true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZBLtf;)V")
    public static final void method1446(boolean arg0, byte arg1, class107 arg2) {
        field3735++;
        int var3 = arg2.field1796 == 0 ? arg2.field1933 : arg2.field1796;
        int var4 = arg2.field1803 == 0 ? arg2.field1793 : arg2.field1803;
        class243.method1577(arg2.field1873, class125.field2188[arg2.field1873 >> 16], -4441, arg0, var4, var3);
        if (arg1 != 84) {
            field3734 = 86;
        }
        if (arg2.field1837 != null) {
            class243.method1577(arg2.field1873, arg2.field1837, arg1 - 4525, arg0, var4, var3);
        }
        class2 var5 = (class2) class57.field959.method1550(true, (long) arg2.field1873);
        if (var5 != null) {
            class115.method780(var5.field12, arg0, var4, arg1 ^ 0xABCDAB99, var3);
        }
    }
}
