import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class130 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lob;")
    private static class141 field593 = class175.method1195(40, "flash1:");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lob;")
    private static class141 field584 = class175.method1195(40, "OFF");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lob;")
    public static class141 field601 = field584;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lob;")
    public static class141 field586 = field593;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[Lob;")
    public static class141[] field589 = new class141[100];

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lob;")
    public static class141 field587 = class175.method1195(40, "mn");

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lob;")
    private static class141 field591 = class175.method1195(40, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lob;")
    public static class141 field595 = field593;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    public static boolean field597 = false;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static volatile int field610 = -1;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lob;")
    public static class141 field612 = class175.method1195(40, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field613 = 1;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lob;")
    public static class141 field604 = field591;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Llg;")
    public static class116 field611;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lpe;Lob;ILob;)[Lfa;")
    private static final class52[] method208(class154 arg0, class141 arg1, int arg2, class141 arg3) {
        field598++;
        if (arg2 != 0) {
            method215(false, (byte) -124, true);
        }
        int var4 = arg0.method1071((byte) -121, arg1);
        int var5 = arg0.method1059(var4, true, arg3);
        return class150.method1043(var4, arg0, var5, 865);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static final void method209(int arg0) {
        if (arg0 > -92) {
            method209(-3);
        }
        field583++;
        int var1 = class22.field388 * 128 + 64;
        int var2 = class76.field1537 * 128 + 64;
        int var3 = class206.method1360(class66.field1287, var1, (byte) 40, var2) - class181.field3562;
        if (class178.field3508 < var1) {
            class178.field3508 += class104.field2010 + (var1 - class178.field3508) * class90.field1796 / 1000;
            if (class178.field3508 > var1) {
                class178.field3508 = var1;
            }
        }
        if (class178.field3508 > var1) {
            class178.field3508 -= (class178.field3508 - var1) * class90.field1796 / 1000 + class104.field2010;
            if (var1 > class178.field3508) {
                class178.field3508 = var1;
            }
        }
        if (var2 > class184.field3589) {
            class184.field3589 += (var2 - class184.field3589) * class90.field1796 / 1000 + class104.field2010;
            if (class184.field3589 > var2) {
                class184.field3589 = var2;
            }
        }
        int var4 = class211.field4037 * 128 + 64;
        if (class184.field3589 > var2) {
            class184.field3589 -= (class184.field3589 - var2) * class90.field1796 / 1000 + class104.field2010;
            if (class184.field3589 < var2) {
                class184.field3589 = var2;
            }
        }
        if (class191.field3683 < var3) {
            class191.field3683 += (var3 - class191.field3683) * class90.field1796 / 1000 + class104.field2010;
            if (class191.field3683 > var3) {
                class191.field3683 = var3;
            }
        }
        int var5 = class166.field3221 * 128 + 64;
        if (var3 < class191.field3683) {
            class191.field3683 -= (class191.field3683 - var3) * class90.field1796 / 1000 + class104.field2010;
            if (var3 > class191.field3683) {
                class191.field3683 = var3;
            }
        }
        int var6 = class206.method1360(class66.field1287, var4, (byte) 40, var5) - class162.field3149;
        int var7 = var6 - class191.field3683;
        int var8 = var4 - class178.field3508;
        int var9 = var5 - class184.field3589;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class175.field3474;
        if (var11 > class19.field338) {
            class19.field338 += (var11 - class19.field338) * class60.field1161 / 1000 + class124.field2378;
            if (var11 < class19.field338) {
                class19.field338 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class19.field338 > var11) {
            class19.field338 -= (class19.field338 - var11) * class60.field1161 / 1000 + class124.field2378;
            if (var11 > class19.field338) {
                class19.field338 = var11;
            }
        }
        if (var13 > 0) {
            class175.field3474 += class60.field1161 * var13 / 1000 + class124.field2378;
            class175.field3474 &= 0x7FF;
        }
        if (var13 < 0) {
            class175.field3474 -= -var13 * class60.field1161 / 1000 + class124.field2378;
            class175.field3474 &= 0x7FF;
        }
        int var14 = var12 - class175.field3474;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class175.field3474 = var12;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method210(int arg0) {
        class20.field344++;
        field600++;
        if (class20.field344 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class14.field246 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class221.field4188.setSeed((long) class14.field246);
        }
        this.method220(arg0 ^ 0xFFFFFC51);
        class206.method1363((byte) 106);
        class14.method91(0);
        class118.method766(-5);
        if (arg0 != 70) {
            field586 = null;
        }
        class178.method1209(false);
        class156.method1085(false);
        if (class175.field3476 != null) {
            int var3 = class175.field3476.method120(arg0 ^ 0x2D);
            class26.field507 = var3;
        }
        if (class161.field3132 == 0) {
            this.method221(-21939);
            class160.method1116(arg0 - 3);
        } else if (class161.field3132 == 5) {
            class69.method454((byte) 28, this);
            this.method221(-21939);
            class160.method1116(48);
        } else if (class161.field3132 == 10) {
            class69.method454((byte) 28, this);
        } else if (class161.field3132 == 20) {
            class69.method454((byte) 28, this);
            class114.method735(333485964);
        } else if (class161.field3132 == 25) {
            class129.method813(false);
        }
        if (class161.field3132 == 30) {
            class118.method764(arg0 - 149);
        } else if (class161.field3132 == 40) {
            class114.method735(333485964);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method211(int arg0) {
        field602++;
        if (class11.field228 >= 4) {
            this.method829(-82, "js5crc");
            class161.field3132 = 1000;
            return;
        }
        if (class38.field752 >= 4) {
            if (class161.field3132 <= 5) {
                this.method829(-92, "js5io");
                class161.field3132 = 1000;
                return;
            }
            class38.field752 = 3;
            class146.field2837 = 3000;
        }
        if (class146.field2837-- > 0) {
            return;
        }
        int var2 = -55 % ((56 - arg0) / 51);
        try {
            if (class2.field27 == 0) {
                class7.field119 = class69.field1356.method1259(class50.field978, class164.field3178, -89);
                class2.field27++;
            }
            if (class2.field27 == 1) {
                if (class7.field119.field1089 == 2) {
                    this.method212(-1, (byte) -65);
                    return;
                }
                if (class7.field119.field1089 == 1) {
                    class2.field27++;
                }
            }
            if (class2.field27 == 2) {
                class195.field3739 = new class157((Socket) class7.field119.field1090, class69.field1356);
                class146 var3 = new class146(5);
                var3.method997(127, 15);
                var3.method970(490, (byte) -121);
                class195.field3739.method1093(39, var3.field2859, 5, 0);
                class2.field27++;
                class60.field1158 = class1.method2((byte) -75);
            }
            if (class2.field27 == 3) {
                if (class161.field3132 <= 5 || class195.field3739.method1096(0) > 0) {
                    int var4 = class195.field3739.method1090(-119);
                    if (var4 != 0) {
                        this.method212(var4, (byte) -65);
                        return;
                    }
                    class2.field27++;
                } else if (class1.method2((byte) -47) - class60.field1158 > 30000L) {
                    this.method212(-2, (byte) -65);
                    return;
                }
            }
            if (class2.field27 == 4) {
                class21.method128(class195.field3739, class161.field3132 > 20, (byte) 40);
                class195.field3739 = null;
                class10.field177 = 0;
                class2.field27 = 0;
                class7.field119 = null;
            }
        } catch (IOException var5) {
            this.method212(-3, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method212(int arg0, byte arg1) {
        field588++;
        if (arg1 != -65) {
            field612 = null;
        }
        class2.field27 = 0;
        class195.field3739 = null;
        class10.field177++;
        class7.field119 = null;
        if (class69.field1354 == class164.field3178) {
            class164.field3178 = class169.field3251;
        } else {
            class164.field3178 = class69.field1354;
        }
        if (class10.field177 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class161.field3132 > 5) {
                class146.field2837 = 3000;
            } else {
                this.method829(97, "js5connect_full");
                class161.field3132 = 1000;
            }
        } else if (class10.field177 >= 2 && arg0 == 6) {
            this.method829(-114, "js5connect_outofdate");
            class161.field3132 = 1000;
        } else if (class10.field177 >= 4) {
            if (class161.field3132 > 5) {
                class146.field2837 = 3000;
            } else {
                this.method829(arg1 ^ 0xFFFFFFF4, "js5connect");
                class161.field3132 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method213(boolean arg0) {
        boolean var2 = class159.method1107(75);
        if (var2 && class118.field2305 && field611 != null) {
            field611.method749((byte) -47);
        }
        field594++;
        if (class18.field324) {
            class42.method272(-751, class176.field3488);
            class60.method403((byte) 98, class176.field3488);
            if (class175.field3476 != null) {
                class175.field3476.method112(class176.field3488, 15929);
            }
            this.method822(!arg0);
            class126.method807(0, class176.field3488);
            class12.method78(class176.field3488, -111);
            if (class175.field3476 != null) {
                class175.field3476.method114(class176.field3488, (byte) -55);
            }
        }
        if (class161.field3132 == 0) {
            class210.method1370(class105.field2018, null, (byte) -123, class203.field3865);
        } else if (class161.field3132 == 5) {
            class154.method1077(class81.field1624, -83, class165.field3198);
        } else if (class161.field3132 == 10) {
            class154.method1077(class81.field1624, -127, class165.field3198);
        } else if (class161.field3132 == 20) {
            class154.method1077(class81.field1624, -122, class165.field3198);
        } else if (class161.field3132 == 25) {
            if (class24.field456 == 1) {
                if (class157.field3028 > class182.field3581) {
                    class182.field3581 = class157.field3028;
                }
                int var3 = (class182.field3581 - class157.field3028) * 50 / class182.field3581;
                class53.method357(-31122, false, class220.method1422(new class141[] { class182.field3574, class165.field3205, class78.method543((byte) 93, var3), class3.field33 }, -3));
            } else if (class24.field456 == 2) {
                if (class78.field1582 > class174.field3447) {
                    class174.field3447 = class78.field1582;
                }
                int var4 = (class174.field3447 - class78.field1582) * 50 / class174.field3447 + 50;
                class53.method357(-31122, false, class220.method1422(new class141[] { class182.field3574, class165.field3205, class78.method543((byte) 93, var4), class3.field33 }, -3));
            } else {
                class53.method357(-31122, false, class182.field3574);
            }
        } else if (class161.field3132 == 30) {
            class92.method632(-67);
        } else if (class161.field3132 == 40) {
            class53.method357(-31122, false, class220.method1422(new class141[] { class146.field2836, class70.field1405, class206.field3928 }, -3));
        }
        if (!arg0) {
            return;
        }
        if (class161.field3132 == 30 && class176.field3490 == 0 && !class104.field2013) {
            try {
                Graphics var7 = class176.field3488.getGraphics();
                for (int var8 = 0; var8 < class41.field807; var8++) {
                    if (class223.field4211[var8]) {
                        class219.field4149.method657(3, class109.field2109[var8], class37.field739[var8], var7, class16.field289[var8], class108.field2089[var8]);
                        class223.field4211[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class176.field3488.repaint();
            }
        } else if (class161.field3132 > 0) {
            try {
                Graphics var5 = class176.field3488.getGraphics();
                class219.field4149.method655(0, var5, 0, 123);
                class104.field2013 = false;
                for (int var6 = 0; var6 < class41.field807; var6++) {
                    class223.field4211[var6] = false;
                }
            } catch (Exception var10) {
                class176.field3488.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)I")
    public static final int method214(int arg0, byte arg1) {
        field614++;
        return arg1 <= 9 ? -99 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBZ)I")
    public static final int method215(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 > -23) {
            field591 = null;
        }
        field606++;
        int var3 = 0;
        if (arg2) {
            var3 += class68.field1339 + class176.field3487;
        }
        if (arg0) {
            var3 += class93.field1854 + class151.field2900;
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method216(byte arg0) {
        method218((byte) 114);
        class141.method918((byte) -85);
        field609++;
        class130.method824(1000);
        class77.method537((byte) 114);
        class106.method706(-5218);
        class67.method447(true);
        class108.method714(3073);
        class146.method998(1013841624);
        class157.method1088(-99);
        class22.method137(0);
        class90.method610((byte) 63);
        class164.method1138(true);
        class131.method835(-31056);
        class6.method33((byte) -117);
        class79.method545((byte) -59);
        class170.method1170(0);
        class38.method253((byte) 127);
        class158.method1099(100);
        class123.method791(108);
        class19.method119((byte) 121);
        class215.method1400(3);
        class96.method647(21528);
        class116.method745(0);
        class196.method1323(-1);
        class73.method505(29450);
        class26.method185(113);
        class203.method1345(false);
        class66.method444((byte) -39);
        class10.method68(-7018);
        class174.method1192((byte) 94);
        class213.method1387(17480);
        class93.method635(-28934);
        class167.method1152(true);
        class212.method1384(-1);
        class97.method651(-6424);
        class184.method1235(35);
        class59.method400(48);
        class9.method59((byte) 109);
        class87.method591(false);
        class2.method9(128);
        class172.method1185(24147);
        class58.method392(24711);
        class124.method801(-115);
        class76.method530(-16225);
        class101.method660();
        class150.method1045(80);
        class45.method300(-24701);
        class191.method1265((byte) 54);
        class200.method1336(true);
        class1.method8((byte) -112);
        class166.method1144(false);
        class35.method245(-7607);
        class154.method1075(18034);
        class70.method490(123);
        class144.method948(-5079);
        class20.method124(-18944);
        class221.method1427(true);
        class25.method175((byte) 103);
        class142.method938(-103);
        class201.method1337((byte) 87);
        class195.method1315(false);
        class129.method819(-93);
        class209.method1369(-2900);
        class3.method17((byte) -34);
        class225.method1446((byte) 51);
        class41.method269((byte) 29);
        class148.method1028();
        class176.method1204(8);
        class44.method293();
        class115.method742(-104);
        class121.method775();
        class85.method585(false);
        class84.method576((byte) -123);
        class86.method588(104);
        class15.method98((byte) 30);
        class65.method437(119);
        class23.method165();
        class54.method366((byte) 115);
        class161.method1128(5);
        if (arg0 >= -55) {
            method209(122);
        }
        class50.method329(25473);
        class75.method528();
        class78.method541(0);
        class107.method712(-125);
        class31.method226(4);
        class173.method1187(0);
        class24.method170(11520);
        class83.method573((byte) 10);
        class137.method875();
        class160.method1115(26285);
        class61.method407(-16733);
        class187.method1243(0);
        class16.method100(67);
        class126.method810(64);
        class185.method1237(false);
        class136.method856((byte) 89);
        class165.method1142(-102);
        class147.method1018(-1);
        class8.method58(4);
        class182.method1230(118);
        class220.method1421(4585);
        class223.method1435(100);
        class118.method765(-127);
        class134.method847();
        class82.method566(128);
        class32.method237(1);
        class68.method452(118);
        class110.method723(-2);
        class190.method1263(1610612736);
        class57.method388(true);
        class180.method1218(-121);
        class113.method731((byte) -108);
        class132.method838(-115);
        class152.method1050(false);
        class40.method262(-1155);
        class62.method414(114);
        class122.method790(0);
        class46.method310((byte) -115);
        class178.method1210(false);
        class210.method1371(2);
        class12.method79(1);
        class13.method86();
        class222.method1431();
        class39.method256(7);
        class139.method893((byte) 72);
        class33.method239();
        class36.method248(-23);
        class162.method1129((byte) 42);
        class171.method1180();
        class211.method1373((byte) -123);
        class30.method206((byte) -105);
        class60.method402(94);
        class28.method195();
        class51.method341();
        class105.method697((byte) -97);
        class88.method598(13786);
        class109.method721((byte) -87);
        class7.method54(4);
        class218.method1413(70);
        class135.method853(-3);
        class214.method1395((byte) -83);
        class133.method841((byte) 65);
        class169.method1158((byte) 106);
        class43.method278(true);
        class92.method627(96);
        class219.method1419(-799263056);
        class42.method276(true);
        class117.method760((byte) -115);
        class81.method563(false);
        class21.method130((byte) 5);
        class95.method643(0);
        class202.method1341((byte) -84);
        class216.method1410(-3);
        class143.method945((byte) -56);
        class204.method1351(4096);
        class11.method73((byte) 11);
        class53.method355(-112);
        class29.method205((byte) -33);
        class181.method1221(123);
        class197.method1325((byte) 93);
        class138.method889(0);
        class104.method695(128);
        class156.method1084(true);
        class94.method641(2);
        class114.method738(0);
        class128.method811(22817);
        class224.method1436((byte) -90);
        class49.method322(-23153);
        class47.method313((byte) 85);
        class103.method688((byte) -37);
        class17.method107(0);
        class14.method88((byte) 119);
        class179.method1213(-69);
        class27.method193(true);
        class188.method1250(true);
        class125.method806((byte) 120);
        class63.method418(256);
        class159.method1112(0);
        class5.method29((byte) -120);
        class111.method727(true);
        class91.method623(25447);
        class168.method1155((byte) -48);
        class18.method111((byte) 95);
        class100.method658((byte) 117);
        class206.method1359((byte) 114);
        class69.method456((byte) -78);
        class177.method1207(-25070);
        class163.method1134(66);
        class72.method499((byte) -96);
        class175.method1197((byte) 86);
        class34.method240(-127);
        class37.method250((byte) -51);
        class98.method653((byte) 105);
        class119.method771(-90);
        class4.method25(106);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
    public static final int method217(int arg0, int arg1, int arg2) {
        field596++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        if (arg0 != 490) {
            return -65;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method218(byte arg0) {
        field587 = null;
        field612 = null;
        field601 = null;
        field595 = null;
        if (arg0 != 114) {
            return;
        }
        field589 = null;
        field604 = null;
        field586 = null;
        field611 = null;
        field584 = null;
        field591 = null;
        field593 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method219(byte arg0) {
        if (class37.field745 != null) {
            class37.field745.field1294 = false;
        }
        field592++;
        class37.field745 = null;
        if (class29.field562 != null) {
            class29.field562.method1089(-2);
            class29.field562 = null;
        }
        class42.method272(-751, class176.field3488);
        class60.method403((byte) 82, class176.field3488);
        if (class175.field3476 != null) {
            class175.field3476.method112(class176.field3488, 15929);
        }
        if (arg0 > -74) {
            return;
        }
        class185.method1239(false);
        class19.method115(15929);
        class175.field3476 = null;
        if (field611 != null) {
            field611.method752((byte) -25);
        }
        if (class125.field2415 != null) {
            class125.field2415.method752((byte) -25);
        }
        class96.method646((byte) 26);
        class39.method258((byte) -75);
        try {
            if (class175.field3482 != null) {
                class175.field3482.method607(244);
            }
            if (class1.field9 != null) {
                for (int var2 = 0; var2 < class1.field9.length; var2++) {
                    if (class1.field9[var2] != null) {
                        class1.field9[var2].method607(244);
                    }
                }
            }
            if (class45.field873 != null) {
                class45.field873.method607(244);
            }
            if (class165.field3200 != null) {
                class165.field3200.method607(244);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class216.method1409(-16);
            }
            class173.field3443 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class160.field3097 = 0;
            } else if (arg0[1].equals("office")) {
                class160.field3097 = 1;
            } else if (arg0[1].equals("local")) {
                class160.field3097 = 2;
            } else {
                class216.method1409(-16);
            }
            if (arg0[2].equals("live")) {
                class107.field2061 = 0;
            } else if (arg0[2].equals("rc")) {
                class107.field2061 = 1;
            } else if (arg0[2].equals("wip")) {
                class107.field2061 = 2;
            } else {
                class216.method1409(-16);
            }
            if (arg0[3].equals("lowmem")) {
                class215.method1404(114);
            } else if (arg0[3].equals("highmem")) {
                class91.method625(true);
            } else {
                class216.method1409(-16);
            }
            if (arg0[4].equals("free")) {
                class118.field2296 = false;
            } else if (arg0[4].equals("members")) {
                class118.field2296 = true;
            } else {
                class216.method1409(-16);
            }
            if (arg0[5].equals("english")) {
                class147.field2875 = 0;
            } else if (arg0[5].equals("german")) {
                class175.method1196((byte) 98);
                class111.field2138 = class164.field3164;
                class147.field2875 = 1;
            } else {
                class216.method1409(-16);
            }
            if (arg0[6].equals("game0")) {
                class160.field3117 = 0;
            } else if (arg0[6].equals("game1")) {
                class160.field3117 = 1;
            } else {
                class216.method1409(-16);
            }
            class50.field978 = "127.0.0.1";
            class160.field3115 = 0;
            class86.field1715 = class111.field2128;
            client var1 = new client();
            var1.method823(class107.field2061 + 32, "runescape", 503, 1, 765, 490, 23);
            class209.field3985.setLocation(40, 40);
        } catch (Exception var3) {
            class170.method1162(null, var3, (byte) 66);
        }
        field615++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method220(int arg0) {
        field585++;
        if (~class161.field3132 != arg0) {
            boolean var2 = class88.method595(false);
            if (!var2) {
                this.method211(124);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method221(int arg0) {
        field608++;
        if (class157.field3033 == 0) {
            class20.method126(4, 104, 104, class31.field617);
            for (int var2 = 0; var2 < 4; var2++) {
                class47.field888[var2] = new class79(104, 104);
            }
            class108.field2079 = new class102(512, 512);
            class105.field2018 = class25.field467;
            class203.field3865 = 5;
            class157.field3033 = 20;
        } else if (arg0 == -21939) {
            if (class157.field3033 == 20) {
                int[] var3 = new int[9];
                for (int var4 = 0; var4 < 9; var4++) {
                    int var5 = var4 * 32 + 128 + 15;
                    int var6 = class44.field854[var5];
                    int var7 = var5 * 3 + 600;
                    var3[var4] = var6 * var7 >> 16;
                }
                class79.method546(var3, 500, 800, 512, 334, 25, 3500);
                class105.field2018 = class209.field3983;
                class157.field3033 = 30;
                class203.field3865 = 10;
            } else if (class157.field3033 == 30) {
                class24.field452 = class22.method139(true, true, (byte) 119, 0, false);
                class177.field3501 = class22.method139(true, true, (byte) 18, 1, false);
                class69.field1361 = class22.method139(true, false, (byte) 62, 2, true);
                class5.field65 = class22.method139(true, true, (byte) 72, 3, false);
                class79.field1612 = class22.method139(true, true, (byte) 84, 4, false);
                class125.field2414 = class22.method139(true, true, (byte) 117, 5, true);
                class159.field3067 = class22.method139(false, true, (byte) 65, 6, true);
                class160.field3118 = class22.method139(true, true, (byte) 76, 7, false);
                class109.field2108 = class22.method139(true, true, (byte) 47, 8, false);
                class150.field2899 = class22.method139(true, false, (byte) 48, 9, true);
                class59.field1146 = class22.method139(true, true, (byte) 60, 10, false);
                class164.field3174 = class22.method139(true, true, (byte) 122, 11, false);
                class96.field1913 = class22.method139(true, true, (byte) 64, 12, false);
                class214.field4078 = class22.method139(true, false, (byte) 18, 13, true);
                class158.field3058 = class22.method139(false, true, (byte) 25, 14, false);
                class221.field4178 = class22.method139(true, true, (byte) 116, 15, false);
                class73.field1450 = class22.method139(true, true, (byte) 80, 16, false);
                class185.field3601 = class22.method139(true, true, (byte) 124, 17, false);
                class108.field2083 = class22.method139(true, true, (byte) 95, 18, false);
                class143.field2760 = class22.method139(true, true, (byte) 93, 19, false);
                class124.field2393 = class22.method139(true, true, (byte) 39, 20, false);
                class77.field1564 = class22.method139(true, true, (byte) 53, 21, false);
                class152.field2918 = class22.method139(true, true, (byte) 119, 22, false);
                class203.field3865 = 20;
                class157.field3033 = 40;
                class105.field2018 = class136.field2592;
            } else if (class157.field3033 == 40) {
                byte var8 = 0;
                int var9 = var8 + class24.field452.method136(arg0 ^ 0xFFFFAA4C) * 4 / 100;
                int var10 = var9 + class177.field3501.method136(1) * 4 / 100;
                int var11 = var10 + class69.field1361.method136(1) / 100;
                int var12 = var11 + class5.field65.method136(1) * 2 / 100;
                int var13 = var12 + class79.field1612.method136(1) * 6 / 100;
                int var14 = var13 + class125.field2414.method136(1) * 4 / 100;
                int var15 = var14 + class159.field3067.method136(1) * 2 / 100;
                int var16 = var15 + class160.field3118.method136(1) * 54 / 100;
                int var17 = var16 + class109.field2108.method136(arg0 + 21940) * 2 / 100;
                int var18 = var17 + class150.field2899.method136(1) * 2 / 100;
                int var19 = var18 + class59.field1146.method136(1) * 2 / 100;
                int var20 = var19 + class164.field3174.method136(1) * 2 / 100;
                int var21 = var20 + class96.field1913.method136(1) * 2 / 100;
                int var22 = var21 + class214.field4078.method136(1) * 2 / 100;
                int var23 = var22 + class158.field3058.method136(1) * 2 / 100;
                int var24 = var23 + class221.field4178.method136(1) * 2 / 100;
                int var25 = var24 + class73.field1450.method136(1) / 100;
                int var26 = var25 + class185.field3601.method136(1) / 100;
                int var27 = var26 + class108.field2083.method136(1) / 100;
                int var28 = var27 + class143.field2760.method136(arg0 + 21940) / 100;
                int var29 = var28 + class124.field2393.method136(1) / 100;
                int var30 = var29 + class77.field1564.method136(1) / 100;
                int var31 = var30 + class152.field2918.method136(1) / 100;
                if (var31 == 100) {
                    class105.field2018 = class79.field1591;
                    class203.field3865 = 30;
                    class126.method809(class109.field2108, (byte) 93, class159.field3067, class59.field1146);
                    class157.field3033 = 45;
                } else {
                    if (var31 != 0) {
                        class105.field2018 = class220.method1422(new class141[] { class124.field2383, class78.method543((byte) 93, var31), class1.field3 }, -3);
                    }
                    class203.field3865 = 30;
                }
            } else if (class157.field3033 == 45) {
                class225.method1443(!class8.field128, 2, 22050, arg0 + 21939);
                class70 var32 = new class70();
                var32.method484(true, 128, 9);
                field611 = class202.method1338(0, true, 22050, class176.field3488, class69.field1356);
                field611.method746(var32, arg0 ^ 0xFFFFAA49);
                class212.method1377(var32, -19, class79.field1612, class221.field4178, class158.field3058);
                class125.field2415 = class202.method1338(1, true, 2048, class176.field3488, class69.field1356);
                class201.field3798 = new class199();
                class125.field2415.method746(class201.field3798, 4);
                class168.field3235 = new class196(22050, class108.field2080);
                class105.field2018 = class8.field132;
                class157.field3033 = 50;
                class203.field3865 = 35;
            } else if (class157.field3033 == 50) {
                int var33 = 0;
                if (class165.field3198 == null) {
                    class165.field3198 = class69.method457(class17.field301, -20, class214.field4078, class109.field2108, class111.field2128);
                } else {
                    var33++;
                }
                if (class58.field1142 == null) {
                    class58.field1142 = class165.field3198;
                } else {
                    var33++;
                }
                if (class125.field2409 == null) {
                    class125.field2409 = class69.method457(class124.field2377, arg0 ^ 0x55A1, class214.field4078, class109.field2108, class111.field2128);
                } else {
                    var33++;
                }
                if (class81.field1624 == null) {
                    class81.field1624 = class69.method457(class191.field3697, -20, class214.field4078, class109.field2108, class111.field2128);
                } else {
                    var33++;
                }
                if (var33 < 4) {
                    class105.field2018 = class220.method1422(new class141[] { class98.field1939, class78.method543((byte) 93, var33 * 100 / 4), class1.field3 }, -3);
                    class203.field3865 = 40;
                } else {
                    class203.field3865 = 40;
                    class105.field2018 = class57.field1098;
                    class157.field3033 = 60;
                }
            } else if (class157.field3033 == 60) {
                int var34 = class72.method500(class109.field2108, true, class59.field1146);
                int var35 = class10.method71(arg0 ^ 0x55EA);
                if (var35 > var34) {
                    class105.field2018 = class220.method1422(new class141[] { class84.field1668, class78.method543((byte) 93, var34 * 100 / var35), class1.field3 }, arg0 ^ 0x55B0);
                    class203.field3865 = 50;
                } else {
                    class105.field2018 = class1.field14;
                    class157.field3033 = 65;
                    class203.field3865 = 50;
                }
            } else if (class157.field3033 == 65) {
                class203.field3865 = 50;
                class105.field2018 = class76.field1560;
                class156.method1086(5, (byte) 84);
                class157.field3033 = 70;
            } else if (class157.field3033 == 70) {
                byte var36 = 0;
                class69.field1361.method1068(true);
                int var37 = var36 + class69.field1361.method1073((byte) 104);
                class73.field1450.method1068(true);
                int var38 = var37 + class73.field1450.method1073((byte) 104);
                class185.field3601.method1068(true);
                int var39 = var38 + class185.field3601.method1073((byte) 104);
                class108.field2083.method1068(true);
                int var40 = var39 + class108.field2083.method1073((byte) 104);
                class143.field2760.method1068(true);
                int var41 = var40 + class143.field2760.method1073((byte) 104);
                class124.field2393.method1068(true);
                int var42 = var41 + class124.field2393.method1073((byte) 104);
                class77.field1564.method1068(true);
                int var43 = var42 + class77.field1564.method1073((byte) 104);
                class152.field2918.method1068(true);
                int var44 = var43 + class152.field2918.method1073((byte) 104);
                if (var44 < 800) {
                    class105.field2018 = class220.method1422(new class141[] { class30.field571, class78.method543((byte) 93, var44 / 8), class1.field3 }, -3);
                    class203.field3865 = 60;
                } else {
                    class42.method271(class69.field1361, (byte) 0);
                    class65.method431(class69.field1361, (byte) 71);
                    class63.method420(class160.field3118, -1, class69.field1361);
                    class88.method600(-1888, class160.field3118, class8.field128, class73.field1450);
                    class14.method90(class160.field3118, class108.field2083, (byte) -106);
                    class40.method266(class160.field3118, class143.field2760, class118.field2296, class58.field1142, (byte) 102);
                    class46.method308(-120, class124.field2393, class177.field3501, class24.field452);
                    class78.method538(class160.field3118, class77.field1564, (byte) 26);
                    class150.method1044(-30393, class152.field2918);
                    class49.method320(29118, class69.field1361);
                    class139.method891(class109.field2108, 0, class160.field3118, class5.field65, class214.field4078);
                    class91.method624((byte) -113, class69.field1361);
                    class40.method265(0, class185.field3601);
                    class105.field2018 = class21.field359;
                    class203.field3865 = 60;
                    class168.method1154((byte) 124);
                    class157.field3033 = 80;
                }
            } else if (class157.field3033 == 80) {
                int var45 = 0;
                if (class11.field219 == null) {
                    class11.field219 = class24.method173(class53.field1014, arg0 ^ 0xFFFFAA4D, class111.field2128, class109.field2108);
                } else {
                    var45++;
                }
                if (class60.field1164 == null) {
                    class60.field1164 = method208(class109.field2108, class10.field200, 0, class111.field2128);
                } else {
                    var45++;
                }
                if (class22.field368 == null) {
                    class22.field368 = class98.method652(class111.field2128, class109.field2108, -72515348, class100.field1953);
                } else {
                    var45++;
                }
                if (class174.field3451 == null) {
                    class174.field3451 = class98.method652(class111.field2128, class109.field2108, arg0 - 72493409, class68.field1338);
                } else {
                    var45++;
                }
                if (class125.field2407 == null) {
                    class125.field2407 = class98.method652(class111.field2128, class109.field2108, -72515348, class87.field1729);
                } else {
                    var45++;
                }
                if (class22.field367 == null) {
                    class22.field367 = class98.method652(class111.field2128, class109.field2108, -72515348, class58.field1140);
                } else {
                    var45++;
                }
                if (class67.field1314 == null) {
                    class67.field1314 = class98.method652(class111.field2128, class109.field2108, arg0 ^ 0x4522AA1, class21.field358);
                } else {
                    var45++;
                }
                if (class211.field4004 == null) {
                    class211.field4004 = class98.method652(class111.field2128, class109.field2108, -72515348, class54.field1033);
                } else {
                    var45++;
                }
                if (class206.field3925 == null) {
                    class206.field3925 = class98.method652(class111.field2128, class109.field2108, -72515348, class4.field49);
                } else {
                    var45++;
                }
                if (class174.field3453 == null) {
                    class174.field3453 = class24.method173(class180.field3539, 0, class111.field2128, class109.field2108);
                } else {
                    var45++;
                }
                if (class177.field3506 == null) {
                    class177.field3506 = class98.method652(class111.field2128, class109.field2108, -72515348, class68.field1329);
                } else {
                    var45++;
                }
                if (class4.field40 == null) {
                    class4.field40 = class98.method652(class111.field2128, class109.field2108, -72515348, class29.field557);
                } else {
                    var45++;
                }
                if (class104.field2006 == null) {
                    class104.field2006 = method208(class109.field2108, class156.field3016, 0, class111.field2128);
                } else {
                    var45++;
                }
                if (class22.field363 == null) {
                    class22.field363 = method208(class109.field2108, class174.field3449, 0, class111.field2128);
                } else {
                    var45++;
                }
                var45++;
                if (var45 < 15) {
                    class105.field2018 = class220.method1422(new class141[] { class152.field2912, class78.method543((byte) 93, var45 * 100 / 13), class1.field3 }, -3);
                    class203.field3865 = 70;
                } else {
                    class165.field3198.method883(class22.field363, null);
                    class125.field2409.method883(class22.field363, null);
                    class81.field1624.method883(class22.field363, null);
                    if (class58.field1142 != class165.field3198) {
                        class58.field1142.method883(class22.field363, null);
                    }
                    for (int var46 = 0; var46 < class206.field3925.length; var46++) {
                        class206.field3925[var46].method679();
                    }
                    class11.field219.method679();
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 41.0D) - 20;
                    for (int var51 = 0; var51 < class22.field368.length; var51++) {
                        class22.field368[var51].method674(var47 + var50, var48 - -var50, var49 + var50);
                    }
                    class60.field1164[0].method352(var47 + var50, var48 + var50, var49 + var50);
                    class105.field2018 = class46.field876;
                    class157.field3033 = 90;
                    class203.field3865 = 70;
                }
            } else if (class157.field3033 == 90) {
                if (class150.field2899.method1068(true)) {
                    class160 var52 = new class160(class150.field2899, class109.field2108, 20, class8.field128 ? 64 : 128);
                    class44.method286(var52);
                    class44.method281(0.7F);
                    class203.field3865 = 90;
                    class105.field2018 = class91.field1816;
                    class157.field3033 = 110;
                } else {
                    class105.field2018 = class220.method1422(new class141[] { class224.field4231, class78.method543((byte) 93, class150.field2899.method1073((byte) 104)), class1.field3 }, -3);
                    class203.field3865 = 90;
                }
            } else if (class157.field3033 == 110) {
                class37.field745 = new class67();
                class69.field1356.method1256(3360, 10, class37.field745);
                class157.field3033 = 120;
                class203.field3865 = 94;
                class105.field2018 = class172.field3424;
            } else if (class157.field3033 == 120) {
                if (class59.field1146.method1074(class111.field2128, class20.field339, false)) {
                    class187 var53 = new class187(class59.field1146.method1079(class20.field339, 1, class111.field2128));
                    class160.method1118(-101, var53);
                    class203.field3865 = 96;
                    class157.field3033 = 130;
                    class105.field2018 = class135.field2578;
                } else {
                    class105.field2018 = class220.method1422(new class141[] { class1.field13, class103.field1994 }, arg0 + 21936);
                    class203.field3865 = 96;
                }
            } else if (class157.field3033 == 130) {
                if (!class5.field65.method1068(true)) {
                    class105.field2018 = class220.method1422(new class141[] { class126.field2429, class78.method543((byte) 93, class5.field65.method1073((byte) 104) * 4 / 5), class1.field3 }, -3);
                    class203.field3865 = 100;
                } else if (!class96.field1913.method1068(true)) {
                    class105.field2018 = class220.method1422(new class141[] { class126.field2429, class78.method543((byte) 93, class96.field1913.method1073((byte) 104) / 6 + 80), class1.field3 }, -3);
                    class203.field3865 = 100;
                } else if (class214.field4078.method1068(true)) {
                    class105.field2018 = class6.field82;
                    class203.field3865 = 100;
                    class157.field3033 = 140;
                } else {
                    class105.field2018 = class220.method1422(new class141[] { class126.field2429, class78.method543((byte) 93, class214.field4078.method1073((byte) 104) / 20 + 96), class1.field3 }, -3);
                    class203.field3865 = 100;
                }
            } else if (class157.field3033 == 140) {
                class125.field2414.method1056(true, (byte) 90, false);
                class159.field3067.method1056(true, (byte) 90, true);
                class109.field2108.method1056(true, (byte) 90, true);
                class214.field4078.method1056(true, (byte) 90, true);
                class59.field1146.method1056(true, (byte) 90, true);
                class156.method1086(10, (byte) -61);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field607++;
        if (!this.method833(0)) {
            return;
        }
        class173.field3443 = Integer.parseInt(this.getParameter("worldid"));
        class107.field2061 = Integer.parseInt(this.getParameter("modewhat"));
        class160.field3097 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class215.method1404(127);
        } else {
            class91.method625(true);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class118.field2296 = true;
        } else {
            class118.field2296 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class175.method1196((byte) 122);
            class147.field2875 = 1;
            class111.field2138 = class164.field3164;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class160.field3117 = 1;
        } else {
            class160.field3117 = 0;
        }
        try {
            field613 = Integer.parseInt(this.getParameter("js"));
            class142.field2747 = Integer.parseInt(this.getParameter("plug"));
            class160.field3115 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class86.field1715 = class175.field3470.method930(this, (byte) 60);
        if (class86.field1715 == null) {
            class86.field1715 = class111.field2128;
        }
        class50.field978 = this.getCodeBase().getHost();
        this.method832(765, 490, 26340, class107.field2061 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method222(byte arg0) {
        field603++;
        int var1 = 55 / ((arg0 - 20) / 61);
        while (class156.field3014.method36(50, class187.field3632) >= 27) {
            int var2 = class156.field3014.method34(15, 11339);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class10.field172[var2] == null) {
                class10.field172[var2] = new class131();
                var3 = true;
            }
            class131 var4 = class10.field172[var2];
            class203.field3888[class195.field3738++] = var2;
            var4.field3885 = class20.field344;
            int var5 = class156.field3014.method34(5, 11339);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class156.field3014.method34(1, 11339);
            int var7 = class156.field3014.method34(1, 11339);
            if (var7 == 1) {
                class125.field2416[class165.field3199++] = var2;
            }
            int var8 = class47.field908[class156.field3014.method34(3, 11339)];
            if (var3) {
                var4.field3833 = var4.field3845 = var8;
            }
            int var9 = class156.field3014.method34(5, 11339);
            var4.field2507 = class50.method323(class156.field3014.method34(14, 11339), 0);
            var4.field3839 = var4.field2507.field214;
            var4.field3859 = var4.field2507.field211;
            if (var4.field3839 == 0) {
                var4.field3845 = 0;
            }
            var4.field3874 = var4.field2507.field204;
            var4.field3837 = var4.field2507.field194;
            var4.field3830 = var4.field2507.field192;
            if (var9 > 15) {
                var9 -= 32;
            }
            var4.field3848 = var4.field2507.field191;
            var4.field3882 = var4.field2507.field212;
            var4.field3871 = var4.field2507.field205;
            var4.field3860 = var4.field2507.field165;
            var4.method1344(class114.field2176.field3870[0] + var9, class114.field2176.field3892[0] + var5, -1, ~var6 == -2);
        }
        class156.field3014.method41(8);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method223(int arg0) {
        field590++;
        if (class160.field3117 == 1) {
            class141.field2731 = class8.field133;
            class110.field2121 = class19.field327;
            class76.field1556 = class54.field1023;
            class103.field1996 = class87.field1722;
        } else {
            class103.field1996 = class38.field754;
            class76.field1556 = class39.field793;
            class141.field2731 = class26.field491;
            class110.field2121 = class164.field3173;
        }
        class69.field1354 = class160.field3097 == 0 ? 43594 : class173.field3443 + 40000;
        class169.field3251 = class160.field3097 == 0 ? 443 : class173.field3443 + 50000;
        class164.field3178 = class69.field1354;
        class31.method228(arg0);
        class126.method807(arg0, class176.field3488);
        class12.method78(class176.field3488, -116);
        class175.field3476 = class182.method1228((byte) 116);
        if (class175.field3476 != null) {
            class175.field3476.method114(class176.field3488, (byte) -55);
        }
        class209.field3965 = class189.field3663;
        try {
            if (class69.field1356.field3658 != null) {
                class175.field3482 = new class90(class69.field1356.field3658, 5200, 0);
                for (int var2 = 0; var2 < 23; var2++) {
                    class1.field9[var2] = new class90(class69.field1356.field3650[var2], 6000, 0);
                }
                class45.field873 = new class90(class69.field1356.field3665, 6000, 0);
                class131.field2502 = new class164(255, class175.field3482, class45.field873, 500000);
                class165.field3200 = new class90(class69.field1356.field3657, 24, 0);
                class69.field1356.field3650 = null;
                class69.field1356.field3657 = null;
                class69.field1356.field3665 = null;
                class69.field1356.field3658 = null;
            }
        } catch (IOException var3) {
            class175.field3482 = null;
            class165.field3200 = null;
            class131.field2502 = null;
            class45.field873 = null;
        }
        if (class160.field3097 != 0) {
            class116.field2233 = true;
        }
    }
}
