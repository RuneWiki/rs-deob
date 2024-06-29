import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class211 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[[[Ls;")
    public static class190[][][] field599 = new class190[4][104][104];

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Ldj;")
    public static class44 field607 = class89.method650(255, "titlebox");

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lrh;")
    public static class188 field604 = new class188(5000);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ldj;")
    public static class44 field608 = class89.method650(255, "");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field610;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class74.method571(125);
            }
            class186.field3209 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class239.field4422 = 0;
            } else if (arg0[1].equals("office")) {
                class239.field4422 = 1;
            } else if (arg0[1].equals("local")) {
                class239.field4422 = 2;
            } else {
                class74.method571(107);
            }
            if (arg0[2].equals("live")) {
                class90.field1706 = 0;
            } else if (arg0[2].equals("rc")) {
                class90.field1706 = 1;
            } else if (arg0[2].equals("wip")) {
                class90.field1706 = 2;
            } else {
                class74.method571(115);
            }
            if (arg0[3].equals("lowmem")) {
                class175.method1107((byte) 40);
            } else if (arg0[3].equals("highmem")) {
                class90.method657(false);
            } else {
                class74.method571(103);
            }
            if (arg0[4].equals("free")) {
                class178.field3064 = false;
            } else if (arg0[4].equals("members")) {
                class178.field3064 = true;
            } else {
                class74.method571(109);
            }
            if (arg0[5].equals("english")) {
                class119.field2119 = 0;
            } else if (arg0[5].equals("german")) {
                class227.method1491((byte) 84);
                class119.field2119 = 1;
            } else {
                class74.method571(115);
            }
            if (arg0[6].equals("game0")) {
                class5.field60 = 0;
            } else if (arg0[6].equals("game1")) {
                class5.field60 = 1;
            } else {
                class74.method571(123);
            }
            class103.field1890 = class94.field1752;
            class2.field30 = "127.0.0.1";
            class72.field1372 = 0;
            client var1 = new client();
            var1.method1368("runescape", 24, 765, 503, 1, 494, class90.field1706 + 32);
            class35.field620.setLocation(40, 40);
        } catch (Exception var3) {
            class173.method1099(102, null, var3);
        }
        field595++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method226(int arg0) {
        field597++;
        if (class169.field2916 != null) {
            class169.field2916.field3230 = false;
        }
        class169.field2916 = null;
        if (class101.field1844 != null) {
            class101.field1844.method778((byte) 80);
            class101.field1844 = null;
        }
        class88.method645(class8.field172, (byte) 79);
        class220.method1424(true, class8.field172);
        if (class123.field2193 != null) {
            class123.field2193.method591(class8.field172, (byte) 84);
        }
        class143.method949(arg0 ^ 0xFFFFDDAE);
        class158.method1034((byte) -71);
        class123.field2193 = null;
        if (class39.field746 != null) {
            class39.field746.method1073(-51);
        }
        if (class46.field869 != null) {
            class46.field869.method1073(-87);
        }
        if (arg0 != -8749) {
            method228(-49, 88);
        }
        class166.method1058(-48);
        class48.method354(-32656);
        try {
            if (class237.field4397 != null) {
                class237.field4397.method133(false);
            }
            if (class49.field913 != null) {
                for (int var2 = 0; var2 < class49.field913.length; var2++) {
                    if (class49.field913[var2] != null) {
                        class49.field913[var2].method133(false);
                    }
                }
            }
            if (class180.field3126 != null) {
                class180.field3126.method133(false);
            }
            if (class237.field4400 != null) {
                class237.field4400.method133(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method227(int arg0, int arg1) {
        if (class80.field1542 == class169.field2917) {
            class80.field1542 = class103.field1887;
        } else {
            class80.field1542 = class169.field2917;
        }
        class170.field2970 = null;
        class72.field1365++;
        class86.field1659 = null;
        if (arg1 > -58) {
            main(null);
        }
        class118.field2107 = 0;
        if (class72.field1365 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class183.field3191 <= 5) {
                this.method1361(67, "js5connect_full");
                class183.field3191 = 1000;
            } else {
                class139.field2498 = 3000;
            }
        } else if (class72.field1365 >= 2 && arg0 == 6) {
            this.method1361(73, "js5connect_outofdate");
            class183.field3191 = 1000;
        } else if (class72.field1365 >= 4) {
            if (class183.field3191 <= 5) {
                this.method1361(20, "js5connect");
                class183.field3191 = 1000;
            } else {
                class139.field2498 = 3000;
            }
        }
        field592++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
    public static final int method228(int arg0, int arg1) {
        field591++;
        return arg1 == 17458 ? arg0 >> 11 & 0x3F : 29;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method229(int arg0) {
        field604 = null;
        field608 = null;
        field599 = null;
        field607 = null;
        if (arg0 != -13784) {
            method228(-28, 67);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method230(byte arg0) {
        int var2 = -6 % ((48 - arg0) / 45);
        field601++;
        if (class183.field3191 != 1000) {
            boolean var3 = class83.method627((byte) 84);
            if (!var3) {
                this.method233(75);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method231(byte arg0) {
        field600++;
        if (class223.field4162 == 0) {
            class35.method238(4, 104, 104, class211.field3771, 25);
            for (int var2 = 0; var2 < 4; var2++) {
                class73.field1390[var2] = new class215(104, 104);
            }
            class193.field3388 = new class155(512, 512);
            class182.field3164 = class46.field865;
            class55.field1008 = 5;
            class223.field4162 = 30;
        } else if (class223.field4162 == 30) {
            class21.field359 = class78.method599(true, false, (byte) 69, 0, true);
            class108.field1993 = class78.method599(true, false, (byte) 69, 1, true);
            class227.field4272 = class78.method599(false, true, (byte) 69, 2, true);
            class201.field3555 = class78.method599(true, false, (byte) 69, 3, true);
            class62.field1159 = class78.method599(true, false, (byte) 69, 4, true);
            class208.field3736 = class78.method599(true, true, (byte) 69, 5, true);
            class211.field3797 = class78.method599(true, true, (byte) 69, 6, false);
            class81.field1571 = class78.method599(true, false, (byte) 69, 7, true);
            class48.field902 = class78.method599(true, false, (byte) 69, 8, true);
            class200.field3540 = class78.method599(false, true, (byte) 69, 9, true);
            class112.field2021 = class78.method599(true, false, (byte) 69, 10, true);
            class102.field1856 = class78.method599(true, false, (byte) 69, 11, true);
            class61.field1138 = class78.method599(true, false, (byte) 69, 12, true);
            class145.field2559 = class78.method599(false, true, (byte) 69, 13, true);
            class166.field2853 = class78.method599(true, false, (byte) 69, 14, false);
            class103.field1874 = class78.method599(true, false, (byte) 69, 15, true);
            class183.field3187 = class78.method599(true, false, (byte) 69, 16, true);
            class35.field619 = class78.method599(true, false, (byte) 69, 17, true);
            class179.field3107 = class78.method599(true, false, (byte) 69, 18, true);
            class58.field1094 = class78.method599(true, false, (byte) 69, 19, true);
            class226.field4241 = class78.method599(true, false, (byte) 69, 20, true);
            class120.field2129 = class78.method599(true, false, (byte) 69, 21, true);
            class236.field4386 = class78.method599(true, false, (byte) 69, 22, true);
            class146.field2576 = class78.method599(true, true, (byte) 69, 23, true);
            class55.field1008 = 20;
            class223.field4162 = 40;
            class182.field3164 = class203.field3639;
        } else if (class223.field4162 == 40) {
            byte var3 = 0;
            int var4 = var3 + class21.field359.method960(126) * 4 / 100;
            int var5 = var4 + class108.field1993.method960(127) * 4 / 100;
            int var6 = var5 + class227.field4272.method960(127) / 100;
            int var7 = var6 + class201.field3555.method960(127) * 2 / 100;
            int var8 = var7 + class62.field1159.method960(126) * 6 / 100;
            int var9 = var8 + class208.field3736.method960(-24) * 4 / 100;
            int var10 = var9 + class211.field3797.method960(127) * 2 / 100;
            int var11 = var10 + class81.field1571.method960(-38) * 53 / 100;
            int var12 = var11 + class48.field902.method960(-75) * 2 / 100;
            int var13 = var12 + class200.field3540.method960(126) * 2 / 100;
            int var14 = var13 + class112.field2021.method960(-72) * 2 / 100;
            int var15 = var14 + class102.field1856.method960(26) * 2 / 100;
            int var16 = var15 + class61.field1138.method960(127) * 2 / 100;
            int var17 = var16 + class145.field2559.method960(-127) * 2 / 100;
            int var18 = var17 + class166.field2853.method960(-26) * 2 / 100;
            int var19 = var18 + class103.field1874.method960(6) * 2 / 100;
            int var20 = var19 + class183.field3187.method960(126) / 100;
            int var21 = var20 + class35.field619.method960(-78) / 100;
            int var22 = var21 + class179.field3107.method960(-31) / 100;
            int var23 = var22 + class58.field1094.method960(-97) / 100;
            int var24 = var23 + class226.field4241.method960(127) / 100;
            int var25 = var24 + class120.field2129.method960(126) / 100;
            int var26 = var25 + class236.field4386.method960(127) / 100;
            int var27 = var26 + class146.field2576.method960(127) / 100;
            if (var27 == 100) {
                class182.field3164 = class120.field2131;
                class55.field1008 = 30;
                class174.method1105(class48.field902, 127, class211.field3797, class112.field2021);
                class223.field4162 = 45;
            } else {
                if (var27 != 0) {
                    class182.field3164 = class70.method555(new class44[] { class106.field1951, class199.method1287(var27, -1), class84.field1630 }, -3);
                }
                class55.field1008 = 30;
            }
        } else if (class223.field4162 == 45) {
            class172.method1095(22050, (byte) 55, 2, !class33.field583);
            class192 var28 = new class192();
            var28.method1224(9, 128, 108);
            class39.field746 = class93.method667((byte) -67, 22050, class83.field1627, 0, class8.field172);
            class39.field746.method1071(-386, var28);
            class82.method615(class103.field1874, class166.field2853, class62.field1159, var28, -2577);
            class46.field869 = class93.method667((byte) -101, 2048, class83.field1627, 1, class8.field172);
            class36.field634 = new class11();
            class46.field869.method1071(-386, class36.field634);
            class135.field2409 = new class5(22050, class170.field2935);
            class182.field3164 = class181.field3151;
            class223.field4162 = 50;
            class55.field1008 = 35;
        } else if (class223.field4162 == 50) {
            int var29 = 0;
            if (class21.field357 == null) {
                class21.field357 = class2.method13(class94.field1752, -127, class54.field993, class145.field2559, class48.field902);
            } else {
                var29++;
            }
            if (class77.field1489 == null) {
                class77.field1489 = class21.field357;
            } else {
                var29++;
            }
            if (class74.field1424 == null) {
                class74.field1424 = class2.method13(class94.field1752, -126, class124.field2207, class145.field2559, class48.field902);
            } else {
                var29++;
            }
            if (class150.field2620 == null) {
                class150.field2620 = class2.method13(class94.field1752, -126, class228.field4278, class145.field2559, class48.field902);
            } else {
                var29++;
            }
            if (var29 < 4) {
                class182.field3164 = class70.method555(new class44[] { class10.field211, class199.method1287(var29 * 100 / 4, -1), class84.field1630 }, -3);
                class55.field1008 = 40;
            } else {
                class223.field4162 = 60;
                class55.field1008 = 40;
                class182.field3164 = class165.field2827;
            }
        } else if (class223.field4162 == 60) {
            int var30 = class124.method856(-121, class112.field2021, class48.field902);
            int var31 = class68.method545(false);
            if (var31 > var30) {
                class182.field3164 = class70.method555(new class44[] { class58.field1088, class199.method1287(var30 * 100 / var31, -1), class84.field1630 }, -3);
                class55.field1008 = 50;
            } else {
                class182.field3164 = class152.field2651;
                class223.field4162 = 65;
                class55.field1008 = 50;
            }
        } else if (class223.field4162 == 65) {
            class55.field1008 = 50;
            class182.field3164 = class187.field3231;
            class62.method467(5, (byte) 57);
            class223.field4162 = 70;
        } else if (class223.field4162 == 70) {
            class227.field4272.method1478((byte) 115);
            byte var32 = 0;
            int var33 = var32 + class227.field4272.method1469(0);
            class183.field3187.method1478((byte) 107);
            int var34 = var33 + class183.field3187.method1469(0);
            class35.field619.method1478((byte) 110);
            int var35 = var34 + class35.field619.method1469(0);
            class179.field3107.method1478((byte) 118);
            int var36 = var35 + class179.field3107.method1469(0);
            class58.field1094.method1478((byte) 107);
            int var37 = var36 + class58.field1094.method1469(0);
            class226.field4241.method1478((byte) 121);
            int var38 = var37 + class226.field4241.method1469(0);
            class120.field2129.method1478((byte) 108);
            int var39 = var38 + class120.field2129.method1469(0);
            class236.field4386.method1478((byte) 112);
            int var40 = var39 + class236.field4386.method1469(0);
            if (var40 < 800) {
                class182.field3164 = class70.method555(new class44[] { class188.field3243, class199.method1287(var40 / 8, -1), class84.field1630 }, -3);
                class55.field1008 = 60;
            } else {
                class115.method807(4, class227.field4272);
                class92.method658((byte) 124, class227.field4272);
                class33.method222((byte) 85, class81.field1571, class227.field4272);
                class139.method935(class178.field3064, class81.field1571, class33.field583, class183.field3187, 2855);
                class196.method1275(class179.field3107, class81.field1571, (byte) -82);
                class230.method1507(class81.field1571, class58.field1094, class178.field3064, class77.field1489, -96);
                class19.method153(-1, class108.field1993, class21.field359, class226.field4241);
                class58.method440(104, class120.field2129, class81.field1571);
                class116.method812(class236.field4386, (byte) 54);
                class46.method347((byte) -120, class227.field4272);
                class3.method24(class81.field1571, class201.field3555, 768, class48.field902, class145.field2559);
                class89.method651(128, class227.field4272);
                class183.method1152(class35.field619, (byte) 64);
                class35.method240((byte) -79, class227.field4272);
                class64.method476(0, class227.field4272);
                class182.field3164 = class134.field2392;
                class55.field1008 = 60;
                class88.method647((byte) -124);
                class223.field4162 = 80;
            }
        } else if (class223.field4162 == 80) {
            int var41 = 0;
            if (class198.field3507 == null) {
                class198.field3507 = class134.method905(class20.field353, (byte) -121, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class211.field3785 == null) {
                class211.field3785 = class81.method613(class94.field1752, class27.field484, class48.field902, 391935500);
            } else {
                var41++;
            }
            if (class153.field2660 == null) {
                class153.field2660 = class9.method89(class218.field3961, 123, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class158.field2752 == null) {
                class158.field2752 = class153.field2660;
            } else {
                var41++;
            }
            if (class53.field955 == null) {
                class53.field955 = class9.method89(class58.field1081, 84, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class211.field3796 == null) {
                class211.field3796 = class9.method89(class63.field1171, 34, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class133.field2386 == null) {
                class133.field2386 = class9.method89(class171.field2988, 74, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class154.field2676 == null) {
                class154.field2676 = class9.method89(class223.field4117, 92, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class154.field2677 == null) {
                class154.field2677 = class9.method89(class116.field2069, 85, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class57.field1062 == null) {
                class57.field1062 = class9.method89(class220.field3983, 111, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class196.field3465 == null) {
                class196.field3465 = class134.method905(class234.field4357, (byte) -121, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class29.field517 == null) {
                class29.field517 = class9.method89(class98.field1808, 34, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class234.field4359 == null) {
                class234.field4359 = class9.method89(class163.field2817, 98, class94.field1752, class48.field902);
            } else {
                var41++;
            }
            if (class50.field925 == null) {
                class50.field925 = class81.method613(class94.field1752, class36.field638, class48.field902, 391935500);
            } else {
                var41++;
            }
            if (class36.field650 == null) {
                class36.field650 = class81.method613(class94.field1752, class121.field2151, class48.field902, 391935500);
            } else {
                var41++;
            }
            var41++;
            if (var41 < 16) {
                class182.field3164 = class70.method555(new class44[] { class117.field2089, class199.method1287(var41 * 100 / 16, -1), class84.field1630 }, -3);
                class55.field1008 = 70;
            } else {
                class21.field357.method427(class36.field650, null);
                class74.field1424.method427(class36.field650, null);
                class150.field2620.method427(class36.field650, null);
                if (class77.field1489 != class21.field357) {
                    class77.field1489.method427(class36.field650, null);
                }
                for (int var42 = 0; var42 < class57.field1062.length; var42++) {
                    class57.field1062[var42].method1014();
                }
                class198.field3507.method1014();
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 41.0D) - 20;
                for (int var47 = 0; var47 < class153.field2660.length; var47++) {
                    class153.field2660[var47].method1023(var43 + var46, var44 + var46, var45 + var46);
                }
                class211.field3785[0].method860(var43 + var46, var44 + var46, var45 + var46);
                class223.field4162 = 90;
                class55.field1008 = 70;
                class182.field3164 = class71.field1353;
            }
        } else if (class223.field4162 == 90) {
            if (class200.field3540.method1478((byte) 127)) {
                class74 var48 = new class74(class200.field3540, class48.field902, 20, class33.field583 ? 64 : 128);
                class206.method1342(var48);
                class206.method1332(0.7F);
                class223.field4162 = 110;
                class55.field1008 = 90;
                class182.field3164 = class90.field1707;
            } else {
                class182.field3164 = class70.method555(new class44[] { class194.field3391, class199.method1287(class200.field3540.method1469(0), -1), class84.field1630 }, -3);
                class55.field1008 = 90;
            }
        } else if (class223.field4162 == 110) {
            class169.field2916 = new class187();
            class83.field1627.method1501(10, class169.field2916, false);
            class55.field1008 = 94;
            class223.field4162 = 120;
            class182.field3164 = class133.field2381;
        } else if (class223.field4162 == 120) {
            if (class112.field2021.method1472(true, class143.field2538, class94.field1752)) {
                class221 var49 = new class221(class112.field2021.method1471(-26651, class94.field1752, class143.field2538));
                class7.method74(25345, var49);
                class55.field1008 = 96;
                class182.field3164 = class192.field3358;
                class223.field4162 = 130;
            } else {
                class182.field3164 = class70.method555(new class44[] { class191.field3296, class38.field670 }, -3);
                class55.field1008 = 96;
            }
        } else if (class223.field4162 == 130) {
            if (!class201.field3555.method1478((byte) 111)) {
                class182.field3164 = class70.method555(new class44[] { class171.field2987, class199.method1287(class201.field3555.method1469(0) * 4 / 5, -1), class84.field1630 }, -3);
                class55.field1008 = 100;
            } else if (!class61.field1138.method1478((byte) 106)) {
                class182.field3164 = class70.method555(new class44[] { class171.field2987, class199.method1287(class61.field1138.method1469(0) / 6 + 80, -1), class84.field1630 }, -3);
                class55.field1008 = 100;
            } else if (class145.field2559.method1478((byte) 117)) {
                class182.field3164 = class150.field2611;
                class55.field1008 = 100;
                class223.field4162 = 140;
            } else {
                class182.field3164 = class70.method555(new class44[] { class171.field2987, class199.method1287(class145.field2559.method1469(0) / 20 + 96, -1), class84.field1630 }, -3);
                class55.field1008 = 100;
            }
        } else if (class223.field4162 == 140) {
            class208.field3736.method1465(false, (byte) -98, true);
            class211.field3797.method1465(true, (byte) 71, true);
            class48.field902.method1465(true, (byte) -101, true);
            class145.field2559.method1465(true, (byte) -75, true);
            class112.field2021.method1465(true, (byte) -81, true);
            class62.method467(10, (byte) 57);
        } else if (arg0 < 4) {
            this.method235(-122);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method232(boolean arg0) {
        field603++;
        class46.field868++;
        if (class46.field868 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class106.field1935 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class101.field1839.setSeed((long) class106.field1935);
        }
        this.method230((byte) 126);
        class2.method15((byte) -98);
        class215.method1406((byte) 89);
        if (!arg0) {
            field607 = null;
        }
        class74.method581((byte) -106);
        class163.method1051(arg0);
        class55.method394(0);
        if (class123.field2193 != null) {
            int var3 = class123.field2193.method589(118);
            class213.field3822 = var3;
        }
        if (class183.field3191 == 0) {
            this.method231((byte) 64);
            class54.method386(-21);
        } else if (class183.field3191 == 5) {
            class192.method1232(this, (byte) -126);
            this.method231((byte) 45);
            class54.method386(-29);
        } else if (class183.field3191 == 10) {
            class192.method1232(this, (byte) -126);
        } else if (class183.field3191 == 20) {
            class192.method1232(this, (byte) -126);
            class145.method952(true);
        } else if (class183.field3191 == 25) {
            class52.method378(98);
        }
        if (class183.field3191 == 30) {
            class239.method1548((byte) 99);
        } else if (class183.field3191 == 40) {
            class145.method952(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method233(int arg0) {
        field606++;
        int var2 = -20 / ((arg0 + 66) / 37);
        if (class55.field1005 >= 4) {
            this.method1361(25, "js5crc");
            class183.field3191 = 1000;
            return;
        }
        if (class54.field999 >= 4) {
            if (class183.field3191 <= 5) {
                this.method1361(81, "js5io");
                class183.field3191 = 1000;
                return;
            }
            class139.field2498 = 3000;
            class54.field999 = 3;
        }
        if (class139.field2498-- > 0) {
            return;
        }
        try {
            if (class118.field2107 == 0) {
                class86.field1659 = class83.field1627.method1502(class2.field30, class80.field1542, -17012);
                class118.field2107++;
            }
            if (class118.field2107 == 1) {
                if (class86.field1659.field3043 == 2) {
                    this.method227(-1, -90);
                    return;
                }
                if (class86.field1659.field3043 == 1) {
                    class118.field2107++;
                }
            }
            if (class118.field2107 == 2) {
                class170.field2970 = new class108((Socket) class86.field1659.field3040, class83.field1627);
                class66 var3 = new class66(5);
                var3.method488(125, 15);
                var3.method489(494, -39);
                class170.field2970.method782(107, var3.field1219, 5, 0);
                class118.field2107++;
                class128.field2284 = class27.method193((byte) 112);
            }
            if (class118.field2107 == 3) {
                if (class183.field3191 <= 5 || class170.field2970.method783(true) > 0) {
                    int var4 = class170.field2970.method781(-104);
                    if (var4 != 0) {
                        this.method227(var4, -115);
                        return;
                    }
                    class118.field2107++;
                } else if (class27.method193((byte) 75) - class128.field2284 > 30000L) {
                    this.method227(-2, -90);
                    return;
                }
            }
            if (class118.field2107 == 4) {
                class79.method608(class183.field3191 > 20, class170.field2970, -74);
                class118.field2107 = 0;
                class86.field1659 = null;
                class170.field2970 = null;
                class72.field1365 = 0;
            }
        } catch (IOException var5) {
            this.method227(-3, -74);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        field593++;
        method229(-13784);
        class44.method316(255);
        class211.method1365(true);
        class4.method29(0);
        class10.method98((byte) -75);
        class187.method1162(0);
        class97.method681(32);
        class66.method516(-29254);
        class108.method779((byte) -21);
        class147.method958(4832);
        class15.method132(false);
        class7.method75(536129096);
        class121.method834(-1206903440);
        class188.method1174((byte) -118);
        class215.method1407(1280);
        class223.method1439(-1);
        class24.method177(-1637445112);
        class190.method1188(1);
        class120.method831((byte) 101);
        class77.method590(-22273);
        class231.method1511(24212);
        class194.method1242(-9);
        class168.method1065(38);
        class5.method31((byte) -85);
        class36.method250((byte) 90);
        class204.method1319(-1753);
        class124.method851((byte) -59);
        class132.method896(false);
        class202.method1309((byte) 117);
        class104.method763(-117);
        class183.method1147(-106);
        class201.method1298((byte) 102);
        class87.method643(0);
        class95.method674(-98);
        class31.method213((byte) -43);
        class101.method749(-106);
        class109.method786(1);
        class133.method903(false);
        class68.method546(0);
        class106.method768(true);
        class130.method885((byte) 38);
        class234.method1529(69);
        class154.method993(-1);
        class33.method223(77);
        class98.method683(-128);
        class220.method1422(0);
        class237.method1540(5);
        class26.method190();
        class173.method1098(-1);
        class186.method1158((byte) 87);
        class39.method271(3);
        class200.method1292(4996);
        class225.method1452((byte) 127);
        class189.method1177(256);
        class195.method1264();
        class88.method649((byte) -116);
        class75.method582(-78);
        class153.method987(-115);
        class27.method192(false);
        class219.method1419(-36);
        class213.method1377(1);
        class192.method1223((byte) 93);
        class23.method169(5);
        class62.method466(0);
        class197.method1277(6);
        class134.method907(0);
        class146.method957(-19);
        class64.method477((byte) -44);
        class46.method346(0);
        class123.method848(true);
        class236.method1537(29392);
        class42.method289(-1);
        class103.method759((byte) -56);
        class55.method396(-129);
        class206.method1335();
        class99.method703();
        class105.method765(0);
        class177.method1109();
        class135.method911(false);
        class129.method882(false);
        class150.method973(false);
        class172.method1091(false);
        class72.method563(-121);
        class162.method1047((byte) 104);
        class131.method886(128);
        class214.method1390((byte) -16);
        class6.method63();
        class238.method1542(-4097);
        class13.method121(false);
        class49.method361((byte) 16);
        class9.method86((byte) -51);
        class19.method151((byte) 43);
        class2.method17(2200);
        class57.method432(-91);
        int var2 = -45 % ((arg0 - 30) / 63);
        class83.method623((byte) 114);
        class56.method423();
        class74.method575((byte) -50);
        class54.method384(82);
        class221.method1430((byte) 121);
        class160.method1039(118);
        class128.method876((byte) 104);
        class84.method631(999999999);
        class93.method666((byte) -109);
        class47.method351(false);
        class203.method1312((byte) -123);
        class233.method1520();
        class29.method204(-31339);
        class117.method820((byte) 12);
        class112.method791((byte) -9);
        class140.method940((byte) 115);
        class96.method679(15536);
        class158.method1035((byte) -36);
        class151.method977(false);
        class161.method1041();
        class28.method198((byte) -101);
        class179.method1130((byte) 16);
        class139.method931((byte) -128);
        class222.method1433((byte) 96);
        class207.method1353(-27680);
        class180.method1136((byte) 115);
        class50.method365(118);
        class137.method920(-1);
        class169.method1077(0);
        class90.method655(122);
        class40.method277(-29455);
        class3.method20(115);
        class235.method1534(896);
        class67.method538((byte) 43);
        class73.method569((byte) -52);
        class76.method586(-128);
        class178.method1129(105);
        class159.method1036();
        class138.method927();
        class14.method124(-111);
        class12.method111();
        class174.method1104(50);
        class126.method873();
        class170.method1084(89);
        class143.method946(-68);
        class224.method1448((byte) -52);
        class191.method1200(1528084688);
        class86.method641((byte) 72);
        class25.method187();
        class107.method771();
        class63.method470(-2455);
        class52.method375(true);
        class82.method614(4758);
        class166.method1060((byte) 127);
        class218.method1416(-1);
        class193.method1239(-9012);
        class70.method552(101);
        class79.method601((byte) 113);
        class94.method669((byte) 119);
        class30.method208(-20186);
        class32.method217((byte) -32);
        class41.method283(-3);
        class163.method1053(27274);
        class156.method1027(-112);
        class20.method157(-24288);
        class89.method654((byte) 98);
        class145.method953((byte) -95);
        class61.method460((byte) -78);
        class37.method255((byte) -40);
        class227.method1489(0);
        class196.method1273(2);
        class102.method753(-128);
        class116.method813((byte) -127);
        class171.method1087((byte) 99);
        class115.method808(31371);
        class199.method1286(-1855376884);
        class80.method611(4096);
        class175.method1106((byte) 125);
        class226.method1483((byte) -117);
        class22.method162(-2532);
        class1.method5(1);
        class157.method1032((byte) 0);
        class118.method824((byte) 75);
        class216.method1413(29448);
        class205.method1327((byte) 113);
        class71.method561((byte) -120);
        class230.method1510((byte) -119);
        class165.method1054(0);
        class239.method1550((byte) -125);
        class53.method382(-2);
        class17.method144(-62);
        class48.method353(-8211);
        class182.method1145(67);
        class181.method1139(-9);
        class92.method659((byte) -77);
        class8.method81(-2048);
        class208.method1354(-30952);
        class45.method344(0);
        class59.method450(-127);
        class58.method443(-12999);
        class122.method841(-122);
        class198.method1283(24635);
        class21.method159((byte) 1);
        class136.method916((byte) -50);
        class119.method826(false);
        class184.method1154((byte) -108);
        class152.method981((byte) 4);
        class210.method1359(37);
        class35.method241((byte) -68);
        class111.method788(true);
        class114.method803((byte) 54);
        class228.method1493(10);
        class38.method262(-69);
        class78.method600(-25713);
        class81.method612((byte) -45);
        class212.method1371((byte) 114);
        class60.method454((byte) 114);
        if (class211.field3798) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field594++;
        if (!this.method1366((byte) -80)) {
            return;
        }
        class186.field3209 = Integer.parseInt(this.getParameter("worldid"));
        class90.field1706 = Integer.parseInt(this.getParameter("modewhat"));
        class239.field4422 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class175.method1107((byte) -128);
        } else {
            class90.method657(false);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class178.field3064 = true;
        } else {
            class178.field3064 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class227.method1491((byte) -105);
            class119.field2119 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class5.field60 = 1;
        } else {
            class5.field60 = 0;
        }
        try {
            class96.field1773 = Integer.parseInt(this.getParameter("js"));
            class92.field1724 = Integer.parseInt(this.getParameter("plug"));
            class72.field1372 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class103.field1890 = class157.field2730.method334(121, this);
        if (class103.field1890 == null) {
            class103.field1890 = class94.field1752;
        }
        class2.field30 = this.getCodeBase().getHost();
        this.method1363(false, 503, class90.field1706 + 32, 765, 494);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method235(int arg0) {
        field596++;
        if (class5.field60 == 1) {
            class10.field208 = class198.field3503;
            class162.field2802 = class132.field2356;
            class140.field2519 = class27.field487;
            class231.field4328 = class68.field1288;
        } else {
            class231.field4328 = class213.field3823;
            class10.field208 = class140.field2520;
            class162.field2802 = class82.field1605;
            class140.field2519 = class166.field2868;
        }
        class103.field1887 = class239.field4422 == 0 ? 443 : class186.field3209 + 50000;
        class169.field2917 = class239.field4422 == 0 ? 43594 : class186.field3209 + 40000;
        class80.field1542 = class169.field2917;
        class3.field43 = class190.field3281 = class152.field2647 = new short[256];
        class83.method629((byte) 122);
        class129.method883((byte) 101, class8.field172);
        class49.method359(class8.field172, (byte) -91);
        class123.field2193 = class221.method1429(-21934);
        if (class123.field2193 != null) {
            class123.field2193.method594(false, class8.field172);
        }
        class48.field883 = class229.field4306;
        if (arg0 != 21937) {
            method229(-34);
        }
        try {
            if (class83.field1627.field4297 != null) {
                class237.field4397 = new class15(class83.field1627.field4297, 5200, 0);
                for (int var2 = 0; var2 < 24; var2++) {
                    class49.field913[var2] = new class15(class83.field1627.field4293[var2], 6000, 0);
                }
                class180.field3126 = new class15(class83.field1627.field4289, 6000, 0);
                class181.field3154 = new class7(255, class237.field4397, class180.field3126, 500000);
                class237.field4400 = new class15(class83.field1627.field4299, 24, 0);
                class83.field1627.field4289 = null;
                class83.field1627.field4297 = null;
                class83.field1627.field4299 = null;
                class83.field1627.field4293 = null;
            }
        } catch (IOException var3) {
            class181.field3154 = null;
            class237.field4400 = null;
            class237.field4397 = null;
            class180.field3126 = null;
        }
        if (class239.field4422 != 0) {
            class47.field878 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method236(int arg0) {
        field605++;
        boolean var2 = class8.method79(-2049);
        if (var2 && class197.field3490 && class39.field746 != null) {
            class39.field746.method1067((byte) 108);
        }
        boolean var3 = false;
        if (class70.field1345) {
            var3 = true;
            class70.field1345 = false;
        }
        if (class183.field3191 == 0) {
            class133.method902(class182.field3164, null, (byte) -87, class55.field1008, var3);
        } else if (class183.field3191 == 5 || class183.field3191 == 10 || class183.field3191 == 20) {
            class193.method1238(99, class150.field2620, class21.field357);
        } else if (class183.field3191 == 25) {
            if (class63.field1172 == 1) {
                if (class194.field3408 < class116.field2079) {
                    class194.field3408 = class116.field2079;
                }
                int var5 = (class194.field3408 - class116.field2079) * 50 / class194.field3408;
                class151.method976(false, (byte) 116, class70.method555(new class44[] { class172.field2997, class58.field1093, class199.method1287(var5, -1), class174.field3029 }, -3));
            } else if (class63.field1172 == 2) {
                if (class145.field2560 > class87.field1670) {
                    class87.field1670 = class145.field2560;
                }
                int var4 = (class87.field1670 - class145.field2560) * 50 / class87.field1670 + 50;
                class151.method976(false, (byte) 121, class70.method555(new class44[] { class172.field2997, class58.field1093, class199.method1287(var4, -1), class174.field3029 }, arg0 ^ 0x1C));
            } else {
                class151.method976(false, (byte) 109, class172.field2997);
            }
        } else if (class183.field3191 == 30) {
            class212.method1375(2047);
        } else if (class183.field3191 == 40) {
            class151.method976(false, (byte) 113, class70.method555(new class44[] { class76.field1454, class83.field1622, class213.field3829 }, arg0 + 28));
        }
        if (arg0 != -31) {
            field604 = null;
        }
        Canvas var6 = class8.field172;
        if (class183.field3191 == 30 && class103.field1888 == 0 && !var3) {
            try {
                Graphics var9 = var6.getGraphics();
                for (int var10 = 0; var10 < class29.field502; var10++) {
                    if (class187.field3219[var10]) {
                        class28.field493.method95(var9, class172.field2999[var10], class158.field2749[var10], arg0 - 30642, class128.field2277[var10], class166.field2860[var10]);
                        class187.field3219[var10] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class183.field3191 > 0) {
            try {
                Graphics var7 = var6.getGraphics();
                class28.field493.method97(var7, 0, (byte) 119, 0);
                for (int var8 = 0; var8 < class29.field502; var8++) {
                    class187.field3219[var8] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }
}
