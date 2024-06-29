import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class197 extends class64 {

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Lid;")
    public static class149 field3562 = class60.method382("glissement:", (byte) 74);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Lid;")
    public static class149 field3581 = null;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lvj;")
    public static class115 field3558 = new class115(128);

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lid;")
    public static class149 field3586 = class60.method382(" )2>", (byte) 75);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Luf;")
    public class173 field3580;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Ltg;")
    public class181 field3572;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "Leg;")
    public static class225 field3583;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljc;")
    public class238 field3560;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "Lji;")
    public class42 field3582;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "[I")
    public static int[] field3566;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "[I")
    public static int[] field3585;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3566 = null;
        field3586 = null;
        field3581 = null;
        field3585 = null;
        if (arg0 < -55) {
            field3583 = null;
            field3562 = null;
            field3558 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static final void method1346(int arg0) {
        if (class106.field1840 < 0) {
            class106.field1840 = 0;
            class65.field1159 = -1;
            class129.field2285 = -1;
        }
        if (class106.field1840 > class62.field1121) {
            class65.field1159 = -1;
            class129.field2285 = -1;
            class106.field1840 = class62.field1121;
        }
        if (class163.field3019 < 0) {
            class65.field1159 = -1;
            class163.field3019 = 0;
            class129.field2285 = -1;
        }
        if (class287.field5086 < class163.field3019) {
            class163.field3019 = class287.field5086;
            class65.field1159 = -1;
            class129.field2285 = -1;
        }
        if (arg0 == 98) {
            field3549++;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        if (class224.field3939 > 0) {
            class224.field3939--;
        }
        if (class271.field4876 > 1) {
            class271.field4876--;
            class10.field143 = class90.field1606;
        }
        field3565++;
        if (class248.field4355) {
            class248.field4355 = false;
            class198.method1357(-118);
            return;
        }
        for (int var1 = 0; var1 < 100 && class65.method408(-66); var1++) {
        }
        if (class107.field1845 != 30) {
            return;
        }
        class13.method71(163, class208.field3720, true);
        if (arg0 <= 93) {
            return;
        }
        Object var2 = class50.field914.field3322;
        synchronized (class50.field914.field3322) {
            if (!class272.field4895) {
                class50.field914.field3329 = 0;
            } else if (class80.field1487 != 0 || class50.field914.field3329 >= 40) {
                class84.field1537++;
                class208.field3720.method162(2, 123);
                class208.field3720.method494((byte) 4, 0);
                int var3 = class208.field3720.field1340;
                int var4 = 0;
                for (int var5 = 0; var5 < class50.field914.field3329 && class208.field3720.field1340 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class50.field914.field3328[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class50.field914.field3330[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class50.field914.field3328[var5] == -1 && class50.field914.field3330[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class205.field3662 != var7 || class103.field1812 != var6) {
                        int var9 = var7 - class205.field3662;
                        int var10 = var6 - class103.field1812;
                        class103.field1812 = var6;
                        class205.field3662 = var7;
                        if (class82.field1500 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class208.field3720.method518(16711680, (class82.field1500 << 12) + (var9 << 6) + var10);
                            class82.field1500 = 0;
                        } else if (class82.field1500 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class208.field3720.method494((byte) 4, class82.field1500 + 128);
                            class208.field3720.method518(16711680, (var9 << 8) + var10);
                            class82.field1500 = 0;
                        } else if (class82.field1500 < 32) {
                            class208.field3720.method494((byte) 4, class82.field1500 + 192);
                            if (var8) {
                                class208.field3720.method517(Integer.MIN_VALUE, 125);
                            } else {
                                class208.field3720.method517(var6 << 16 | var7, 118);
                            }
                            class82.field1500 = 0;
                        } else {
                            class208.field3720.method518(16711680, class82.field1500 + 57344);
                            if (var8) {
                                class208.field3720.method517(Integer.MIN_VALUE, 127);
                            } else {
                                class208.field3720.method517(var6 << 16 | var7, 118);
                            }
                            class82.field1500 = 0;
                        }
                    } else if (class82.field1500 < 2047) {
                        class82.field1500++;
                    }
                }
                class208.field3720.method521(127, class208.field3720.field1340 - var3);
                if (class50.field914.field3329 > var4) {
                    class50.field914.field3329 -= var4;
                    for (int var11 = 0; var11 < class50.field914.field3329; var11++) {
                        class50.field914.field3330[var11] = class50.field914.field3330[var4 + var11];
                        class50.field914.field3328[var11] = class50.field914.field3328[var11 + var4];
                    }
                } else {
                    class50.field914.field3329 = 0;
                }
            }
        }
        if (class80.field1487 != 0) {
            class184.field3316++;
            long var12 = (class84.field1533 - class37.field545) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class260.field4582;
            class37.field545 = class84.field1533;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class159.field2921;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var17 = (int) var12;
            if (class80.field1487 == 2) {
                var16 = 1;
            }
            class208.field3720.method162(2, 75);
            class208.field3720.method516((byte) -125, var17 | var16 << 15);
            class208.field3720.method479(var14 | var15 << 16, -116);
        }
        if (class242.field4252 > 0) {
            class242.field4252--;
        }
        if (class228.field3987) {
            for (int var18 = 0; var18 < class40.field633; var18++) {
                int var19 = class248.field4353[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class272.field4896 = true;
                    break;
                }
            }
        } else if (class131.field2312[96] || class131.field2312[97] || class131.field2312[98] || class131.field2312[99]) {
            class272.field4896 = true;
        }
        if (class272.field4896 && class242.field4252 <= 0) {
            class190.field3408++;
            class242.field4252 = 20;
            class272.field4896 = false;
            class208.field3720.method162(2, 21);
            class208.field3720.method504(class57.field1004, -12196);
            class208.field3720.method509(class55.field985, 1608904784);
        }
        if (class174.field3207 && !class8.field111) {
            class154.field2818++;
            class8.field111 = true;
            class208.field3720.method162(2, 22);
            class208.field3720.method494((byte) 4, 1);
        }
        if (!class174.field3207 && class8.field111) {
            class8.field111 = false;
            class154.field2818++;
            class208.field3720.method162(2, 22);
            class208.field3720.method494((byte) 4, 0);
        }
        if (!class63.field1134) {
            class208.field3720.method162(2, 98);
            class16.field224++;
            class208.field3720.method517(class65.method404(104), 122);
            class63.field1134 = true;
        }
        class218.method1477(0);
        if (class107.field1845 != 30) {
            return;
        }
        class91.method669((byte) -118);
        class163.method1196((byte) -24);
        class275.method1903(128);
        class224.field3944++;
        if (class224.field3944 > 750) {
            class198.method1357(-57);
            return;
        }
        class73.method472(10046);
        class136.method955(false);
        class159.method1144(false);
        if (class10.field139 != null) {
            class208.method1420(true);
        }
        for (int var20 = class150.method1070(-31374, true); var20 != -1; var20 = class150.method1070(-31374, false)) {
            class134.method938(var20, -107);
            class255.field4455[class136.method953(31, class104.field1814++)] = var20;
        }
        for (class216 var21 = class15.method93(-124); var21 != null; var21 = class15.method93(-111)) {
            int var22 = var21.method1455(55);
            int var23 = var21.method1456((byte) 126);
            if (var22 == 1) {
                class91.field1620[var23] = var21.field3809;
                class65.field1154[class136.method953(31, class84.field1531++)] = var23;
            } else if (var22 == 2) {
                class222.field3878[var23] = var21.field3815;
                class226.field3966[class136.method953(31, class38.field569++)] = var23;
            } else if (var22 == 3) {
                class47 var24 = class251.method1741((byte) 110, var23);
                if (!var21.field3815.method1041((byte) -103, var24.field752)) {
                    var24.field752 = var21.field3815;
                    class182.method1267(var24, 110);
                }
            } else if (var22 == 4) {
                class47 var41 = class251.method1741((byte) 110, var23);
                int var42 = var21.field3809;
                int var43 = var21.field3818;
                int var44 = var21.field3813;
                if (var41.field862 != var42 || var41.field716 != var43 || var41.field808 != var44) {
                    var41.field808 = var44;
                    var41.field862 = var42;
                    var41.field716 = var43;
                    class182.method1267(var41, 91);
                }
            } else if (var22 == 5) {
                class47 var25 = class251.method1741((byte) 110, var23);
                if (var21.field3809 != var25.field807 || var21.field3809 == -1) {
                    var25.field807 = var21.field3809;
                    var25.field736 = 1;
                    var25.field831 = 0;
                    var25.field790 = 0;
                    class182.method1267(var25, 111);
                }
            } else if (var22 == 6) {
                int var26 = var21.field3809;
                int var27 = var26 >> 10 & 0x1F;
                int var28 = var26 & 0x1F;
                int var29 = (var26 & 0x3EE) >> 5;
                class47 var30 = class251.method1741((byte) 110, var23);
                int var31 = (var28 << 3) + ((var27 << 19) + (var29 << 11));
                if (var30.field812 != var31) {
                    var30.field812 = var31;
                    class182.method1267(var30, 77);
                }
            } else if (var22 == 7) {
                class47 var39 = class251.method1741((byte) 110, var23);
                boolean var40 = var21.field3809 == 1;
                if (var39.field846 != var40) {
                    var39.field846 = var40;
                    class182.method1267(var39, 78);
                }
            } else if (var22 == 8) {
                class47 var38 = class251.method1741((byte) 110, var23);
                if (var21.field3809 != var38.field863 || var21.field3818 != var38.field697 || var21.field3813 != var38.field871) {
                    var38.field697 = var21.field3818;
                    var38.field863 = var21.field3809;
                    var38.field871 = var21.field3813;
                    if (var38.field822 != -1) {
                        if (var38.field773 > 0) {
                            var38.field871 = var38.field871 * 32 / var38.field773;
                        } else if (var38.field726 > 0) {
                            var38.field871 = var38.field871 * 32 / var38.field726;
                        }
                    }
                    class182.method1267(var38, 116);
                }
            } else if (var22 == 9) {
                class47 var37 = class251.method1741((byte) 110, var23);
                if (var21.field3809 != var37.field822 || var21.field3818 != var37.field821) {
                    var37.field822 = var21.field3809;
                    var37.field821 = var21.field3818;
                    class182.method1267(var37, 98);
                }
            } else if (var22 == 10) {
                class47 var32 = class251.method1741((byte) 110, var23);
                if (var21.field3809 != var32.field749 || var21.field3818 != var32.field753 || var21.field3813 != var32.field858) {
                    var32.field749 = var21.field3809;
                    var32.field753 = var21.field3818;
                    var32.field858 = var21.field3813;
                    class182.method1267(var32, 87);
                }
            } else if (var22 == 11) {
                class47 var33 = class251.method1741((byte) 110, var23);
                var33.field784 = var33.field828 = var21.field3818;
                var33.field754 = var33.field825 = var21.field3809;
                var33.field766 = 0;
                var33.field706 = 0;
                class182.method1267(var33, 126);
            } else if (var22 == 12) {
                class47 var35 = class251.method1741((byte) 110, var23);
                int var36 = var21.field3809;
                if (var35 != null && var35.field760 == 0) {
                    if (var36 > var35.field755 - var35.field727) {
                        var36 = var35.field755 - var35.field727;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field824 != var36) {
                        var35.field824 = var36;
                        class182.method1267(var35, 123);
                    }
                }
            } else if (var22 == 13) {
                class47 var34 = class251.method1741((byte) 110, var23);
                var34.field735 = var21.field3809;
            }
        }
        if (class55.field993 != 0) {
            class283.field5011 += 20;
            if (class283.field5011 >= 400) {
                class55.field993 = 0;
            }
        }
        class149.field2683++;
        if (class116.field1979 != null) {
            class119.field2047++;
            if (class119.field2047 >= 15) {
                class182.method1267(class116.field1979, 123);
                class116.field1979 = null;
            }
        }
        if (class23.field322 != null) {
            class182.method1267(class23.field322, 83);
            if (class49.field883 > (class210.field3747 + 5) || class210.field3747 - 5 > class49.field883 || class285.field5068 > class186.field3349 + 5 || class186.field3349 - 5 > class285.field5068) {
                class77.field1445 = true;
            }
            class50.field900++;
            if (class263.field4671 == 0) {
                if (class77.field1445 && class50.field900 >= 5) {
                    if (class23.field322 == class177.field3236 && class159.field2925 != class115.field1970) {
                        class61.field1097++;
                        class47 var45 = class23.field322;
                        byte var46 = 0;
                        if (class18.field257 == 1 && var45.field820 == 206) {
                            var46 = 1;
                        }
                        if (var45.field797[class159.field2925] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1104(var45).method1187((byte) 65)) {
                            int var47 = class115.field1970;
                            int var48 = class159.field2925;
                            var45.field797[var48] = var45.field797[var47];
                            var45.field786[var48] = var45.field786[var47];
                            var45.field797[var47] = -1;
                            var45.field786[var47] = 0;
                        } else if (var46 == 1) {
                            int var49 = class115.field1970;
                            int var50 = class159.field2925;
                            while (var49 != var50) {
                                if (var50 < var49) {
                                    var45.method301(124, var49 - 1, var49);
                                    var49--;
                                } else if (var50 > var49) {
                                    var45.method301(119, var49 + 1, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method301(124, class159.field2925, class115.field1970);
                        }
                        class208.field3720.method162(2, 231);
                        class208.field3720.method518(16711680, class115.field1970);
                        class208.field3720.method513((byte) -115, class23.field322.field834);
                        class208.field3720.method504(class159.field2925, -12196);
                        class208.field3720.method493(var46, (byte) 120);
                    }
                } else if ((class236.field4146 == 1 || class221.method1488(class60.field1092 - 1, (byte) -53)) && class60.field1092 > 2) {
                    class36.method212(-36);
                } else if (class60.field1092 > 0) {
                    class147.method1013(122);
                }
                class119.field2047 = 10;
                class23.field322 = null;
                class80.field1487 = 0;
            }
        }
        class174.field3204 = false;
        class20.field305 = false;
        class47 var51 = class176.field3224;
        class176.field3224 = null;
        class47 var52 = class24.field346;
        class116.field1995 = null;
        class24.field346 = null;
        for (class40.field633 = 0; class149.method1068(false) && class40.field633 < 128; class40.field633++) {
            class248.field4353[class40.field633] = class164.field3053;
            class11.field157[class40.field633] = class264.field4721;
        }
        class10.field139 = null;
        if (class11.field161 != -1) {
            class133.method935(class240.field4197, 0, class218.field3851, 0, (byte) 120, class11.field161, 0, 0);
        }
        class90.field1606++;
        while (true) {
            class1 var53;
            class47 var54;
            class47 var55;
            do {
                var53 = (class1) class17.field253.method1137(true);
                if (var53 == null) {
                    while (true) {
                        class1 var56;
                        class47 var57;
                        class47 var58;
                        do {
                            var56 = (class1) class231.field4045.method1137(true);
                            if (var56 == null) {
                                while (true) {
                                    class1 var59;
                                    class47 var60;
                                    class47 var61;
                                    do {
                                        var59 = (class1) class258.field4506.method1137(true);
                                        if (var59 == null) {
                                            if (class10.field139 == null) {
                                                class223.field3929 = 0;
                                            }
                                            if (class244.field4296 != null) {
                                                class240.method1655((byte) -125);
                                            }
                                            if (class258.field4519 > 0 && class131.field2312[82] && class131.field2312[81] && class180.field3250 != 0) {
                                                int var62 = class277.field4948 - class180.field3250;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class101.method723(class125.field2199 + class77.field1449.field2333[0], class77.field1449.field2400[0] + class115.field1969, var62, 2074796454);
                                            }
                                            if (class258.field4519 > 0 && class131.field2312[82] && class131.field2312[81]) {
                                                if (class198.field3606 != -1) {
                                                    class101.method723(class198.field3606 + class125.field2199, class39.field615 + class115.field1969, class277.field4948, 2074796454);
                                                }
                                                class286.field5076 = 0;
                                                class191.field3421 = 0;
                                            } else if (class191.field3421 == 2) {
                                                if (class198.field3606 != -1) {
                                                    class258.field4521++;
                                                    class208.field3720.method162(2, 131);
                                                    class208.field3720.method479(class97.field1717, -91);
                                                    class208.field3720.method504(class125.field2199 + class198.field3606, -12196);
                                                    class208.field3720.method516((byte) 60, class24.field368);
                                                    class208.field3720.method504(class39.field615 + class115.field1969, -12196);
                                                    class55.field993 = 1;
                                                    class283.field5011 = 0;
                                                    class223.field3925 = class260.field4582;
                                                    class136.field2506 = class159.field2921;
                                                }
                                                class191.field3421 = 0;
                                            } else if (class286.field5076 == 2) {
                                                if (class198.field3606 != -1) {
                                                    class39.field591++;
                                                    class208.field3720.method162(2, 179);
                                                    class208.field3720.method518(16711680, class39.field615 + class115.field1969);
                                                    class208.field3720.method518(16711680, class125.field2199 + class198.field3606);
                                                    class283.field5011 = 0;
                                                    class136.field2506 = class159.field2921;
                                                    class55.field993 = 1;
                                                    class223.field3925 = class260.field4582;
                                                }
                                                class286.field5076 = 0;
                                            } else if (class198.field3606 != -1 && class191.field3421 == 0 && class286.field5076 == 0) {
                                                boolean var63 = class71.method445(0, class39.field615, class198.field3606, 0, (byte) -6, true, 0, 0, class77.field1449.field2400[0], 0, 0, class77.field1449.field2333[0]);
                                                if (var63) {
                                                    class136.field2506 = class159.field2921;
                                                    class223.field3925 = class260.field4582;
                                                    class55.field993 = 1;
                                                    class283.field5011 = 0;
                                                }
                                            }
                                            class198.field3606 = -1;
                                            class70.method442(false);
                                            if (class176.field3224 != var51) {
                                                if (var51 != null) {
                                                    class182.method1267(var51, 79);
                                                }
                                                if (class176.field3224 != null) {
                                                    class182.method1267(class176.field3224, 126);
                                                }
                                            }
                                            if (class24.field346 != var52 && class64.field1146 == class24.field344) {
                                                if (var52 != null) {
                                                    class182.method1267(var52, 108);
                                                }
                                                if (class24.field346 != null) {
                                                    class182.method1267(class24.field346, 82);
                                                }
                                            }
                                            if (class24.field346 == null) {
                                                if (class24.field344 > 0) {
                                                    class24.field344--;
                                                }
                                            } else if (class24.field344 < class64.field1146) {
                                                class24.field344++;
                                                if (class64.field1146 == class24.field344) {
                                                    class182.method1267(class24.field346, 76);
                                                }
                                            }
                                            if (class194.field3468 == 1) {
                                                class94.method685((byte) 110);
                                            } else if (class194.field3468 == 2) {
                                                class279.method1922((byte) 127);
                                            } else {
                                                class180.method1254(1);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class27.field408[var64]++;
                                            }
                                            int var65 = class285.method1956(23);
                                            int var66 = class106.method742(0);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class224.field3939 = 250;
                                                class107.method745(14500, 119);
                                                class15.field221++;
                                                class208.field3720.method162(2, 245);
                                            }
                                            if (class83.field1519 != null && class83.field1519.field3358 == 1) {
                                                if (class83.field1519.field3357 != null) {
                                                    class95.method690(class213.field3774, (byte) 85, client.field2862);
                                                }
                                                class83.field1519 = null;
                                                class213.field3774 = false;
                                                client.field2862 = null;
                                            }
                                            class180.field3255++;
                                            class102.field1792++;
                                            class196.field3538++;
                                            if (class180.field3255 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class192.field3443 += class288.field5146;
                                                }
                                                class180.field3255 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    client.field2857 += class232.field4094;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class156.field2872 += class3.field44;
                                                }
                                            }
                                            if (client.field2857 < -50) {
                                                class232.field4094 = 2;
                                            }
                                            if (client.field2857 > 50) {
                                                class232.field4094 = -2;
                                            }
                                            if (class102.field1792 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class184.field3320 += class157.field2902;
                                                }
                                                class102.field1792 = 0;
                                                if ((var68 & 0x2) == 2) {
                                                    class232.field4093 += class34.field490;
                                                }
                                            }
                                            if (class156.field2872 < -40) {
                                                class3.field44 = 1;
                                            }
                                            if (class184.field3320 < -60) {
                                                class157.field2902 = 2;
                                            }
                                            if (class156.field2872 > 40) {
                                                class3.field44 = -1;
                                            }
                                            if (class232.field4093 < -20) {
                                                class34.field490 = 1;
                                            }
                                            if (class192.field3443 < -55) {
                                                class288.field5146 = 2;
                                            }
                                            if (class192.field3443 > 55) {
                                                class288.field5146 = -2;
                                            }
                                            if (class232.field4093 > 10) {
                                                class34.field490 = -1;
                                            }
                                            if (class184.field3320 > 60) {
                                                class157.field2902 = -2;
                                            }
                                            if (class196.field3538 > 50) {
                                                class208.field3720.method162(2, 93);
                                                class152.field2772++;
                                            }
                                            if (class63.field1137) {
                                                class47.method302(128);
                                                class63.field1137 = false;
                                            }
                                            try {
                                                if (class164.field3047 != null && class208.field3720.field1340 > 0) {
                                                    class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 127);
                                                    class208.field3720.field1340 = 0;
                                                    class196.field3538 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class198.method1357(-115);
                                                return;
                                            }
                                        }
                                        var60 = var59.field13;
                                        if (var60.field799 < 0) {
                                            break;
                                        }
                                        var61 = class251.method1741((byte) 110, var60.field707);
                                    } while (var61 == null || var61.field761 == null || var60.field799 >= var61.field761.length || var61.field761[var60.field799] != var60);
                                    class288.method1973(var59, -124);
                                }
                            }
                            var57 = var56.field13;
                            if (var57.field799 < 0) {
                                break;
                            }
                            var58 = class251.method1741((byte) 110, var57.field707);
                        } while (var58 == null || var58.field761 == null || var58.field761.length <= var57.field799 || var58.field761[var57.field799] != var57);
                        class288.method1973(var56, -60);
                    }
                }
                var54 = var53.field13;
                if (var54.field799 < 0) {
                    break;
                }
                var55 = class251.method1741((byte) 110, var54.field707);
            } while (var55 == null || var55.field761 == null || var55.field761.length <= var54.field799 || var55.field761[var54.field799] != var54);
            class288.method1973(var53, 60);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lid;I)Lid;")
    public static final class149 method1348(class149 arg0, int arg1) {
        field3567++;
        int var2 = class254.method1751(arg0, arg1);
        return var2 == -1 ? class23.field334 : class168.field3120.field4967[var2].method1030(class166.field3091, true, class86.field1566);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLid;BLjava/awt/Color;)V")
    public static final void method1349(int arg0, boolean arg1, class149 arg2, byte arg3, Color arg4) {
        try {
            Graphics var5 = class244.field4295.getGraphics();
            if (class6.field72 == null) {
                class6.field72 = new Font("Helvetica", 1, 13);
                class174.field3201 = class244.field4295.getFontMetrics(class6.field72);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class218.field3851, class240.field4197);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class242.field4257 == null) {
                    class242.field4257 = class244.field4295.createImage(304, 34);
                }
                if (arg3 != 75) {
                    field3566 = null;
                }
                Graphics var6 = class242.field4257.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class6.field72);
                var6.setColor(Color.white);
                arg2.method1061(125, (304 - arg2.method1019((byte) 122, class174.field3201)) / 2, var6, 22);
                var5.drawImage(class242.field4257, class218.field3851 / 2 - 152, class240.field4197 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class218.field3851 / 2 - 152;
                int var8 = class240.field4197 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class6.field72);
                var5.setColor(Color.white);
                arg2.method1061(100, var7 + (304 - arg2.method1019((byte) 108, class174.field3201)) / 2, var5, var8 + 22);
            }
            if (class52.field945 != null) {
                var5.setFont(class6.field72);
                var5.setColor(Color.white);
                class52.field945.method1061(89, class218.field3851 / 2 - class52.field945.method1019((byte) -127, class174.field3201) / 2, var5, class240.field4197 / 2 - 26);
            }
        } catch (Exception var10) {
            class244.field4295.repaint();
        }
        field3552++;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V")
    public final void method1350(byte arg0) {
        this.field3582 = null;
        this.field3572 = null;
        this.field3560 = null;
        this.field3580 = null;
        if (arg0 <= 110) {
            this.field3578 = -72;
        }
        field3573++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIII)V")
    public static final void method1351(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class224.field3940 && class94.field1655 >= arg2) {
            int var5 = class47.method303(arg3, class192.field3449, class257.field4496, 65535);
            int var6 = class47.method303(arg4, class192.field3449, class257.field4496, arg1 + 65433);
            class230.method1546(arg2, var6, 28375, var5, arg0);
        }
        field3561++;
        if (arg1 != 102) {
            method1349(-113, true, (class149) null, (byte) -28, (Color) null);
        }
    }
}
