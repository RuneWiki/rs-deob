import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class184 extends class90 {

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field2623 = 0;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2635 = new String[100];

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2626 = "M";

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2627 = "wave2:";

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lh;")
    private class190 field2628;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lbh;")
    public static class239 field2631;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)I")
    public final int method1184(int arg0, int arg1, int arg2) {
        field2621++;
        if (arg1 != 1343463452) {
            field2620 = -57;
        }
        if (this.field2628 == null) {
            return arg0;
        } else {
            class64 var4 = (class64) this.field2628.method1218((long) arg2, 1);
            return var4 == null ? arg0 : var4.field1015;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lkl;B)V")
    public static final void method1185(class114 arg0, byte arg1) {
        field2629++;
        if (arg1 >= -51) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class56.field859 != null) {
            try {
                class56.field859.method325(-474049592, 0L);
                int var3 = 0;
                class56.field859.method317(0, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method774((byte) -127, 24, 0, var2);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lve;Z)V")
    public static final void method1186(class233 arg0, boolean arg1) {
        field2622++;
        class172.field2463 = class119.method818(class160.field2322, arg0, -102);
        class19.field265 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class82.field1264[var2] & 0xFF0000) >> 16);
            int var5 = (class82.field1264[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class82.field1264[var2] & 0xFF00) >> 8);
            int var8 = class82.field1264[var2 + 1] & 0xFF;
            int var9 = class82.field1264[var2 + 1] >> 8 & 0xFF;
            float var10 = ((float) var9 - var7) / 64.0F;
            float var11 = (float) (class82.field1264[var2] & 0xFF);
            float var12 = ((float) var8 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class19.field265[var2 * 64 + var13] = class163.method1093((int) var11, class163.method1093((int) var7 << 8, (int) var4 << 16));
                var7 += var10;
                var11 += var12;
                var4 += var6;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class19.field265[var3] = class82.field1264[3];
        }
        class220.field3254 = new int[32768];
        if (!arg1) {
            method1187(105);
        }
        class81.field1252 = new int[32768];
        class45.method303((class117) null, (byte) -128);
        class77.field1192 = new int[32768];
        class191.field2727 = new int[32768];
        class151.field2176 = new class244(128, 254);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        field2630++;
        int var1 = 0;
        if (arg0 != 17604) {
            return;
        }
        while (class224.field3358 > var1) {
            int var10002 = class146.field2098[var1]--;
            if (class146.field2098[var1] >= -10) {
                label87: {
                    class238 var3 = class236.field3563[var1];
                    if (var3 == null) {
                        var3 = class238.method1560(class67.field1040, class212.field3042[var1], 0);
                        if (var3 == null) {
                            break label87;
                        }
                        class146.field2098[var1] += var3.method1558();
                        class236.field3563[var1] = var3;
                    }
                    if (class146.field2098[var1] < 0) {
                        label90: {
                            int var4;
                            if (class123.field1783[var1] == 0) {
                                var4 = class32.field473;
                            } else {
                                int var5 = (class123.field1783[var1] & 0xFF) * 128;
                                int var6 = class123.field1783[var1] >> 16 & 0xFF;
                                int var7 = var6 * 128 + 64 - class55.field847.field45;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = class123.field1783[var1] >> 8 & 0xFF;
                                int var9 = var8 * 128 + 64 - class55.field847.field94;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var5 < var10) {
                                    class146.field2098[var1] = -100;
                                    break label90;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class62.field1000 / var5;
                            }
                            if (var4 > 0) {
                                class116 var11 = var3.method1561().method801(class101.field1510);
                                class252 var12 = class252.method1697(var11, 100, var4);
                                var12.method1673(class160.field2325[var1] - 1);
                                class152.field2201.method275(var12);
                            }
                            class146.field2098[var1] = -100;
                        }
                    }
                }
            } else {
                class224.field3358--;
                for (int var2 = var1; var2 < class224.field3358; var2++) {
                    class212.field3042[var2] = class212.field3042[var2 + 1];
                    class236.field3563[var2] = class236.field3563[var2 + 1];
                    class160.field2325[var2] = class160.field2325[var2 + 1];
                    class146.field2098[var2] = class146.field2098[var2 + 1];
                    class123.field1783[var2] = class123.field1783[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class200.field2884 && !class15.method121(true)) {
            if (class209.field3015 != 0 && class229.field3429 != -1) {
                class159.method1069(class209.field3015, -14698, 0, class53.field777, class229.field3429, false);
            }
            class200.field2884 = false;
        } else if (class209.field3015 != 0 && class229.field3429 != -1 && !class15.method121(true)) {
            class66.field1036++;
            class95.field1451.method522(50, 28727);
            class95.field1451.method737(arg0 ^ 0xFFFFB16F, class229.field3429);
            class229.field3429 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)I")
    public static int method1188(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILkl;)V")
    private final void method1189(int arg0, int arg1, class114 arg2) {
        field2636++;
        if (arg1 == 249) {
            int var4 = arg2.method760(false);
            if (this.field2628 == null) {
                int var5 = class5.method58(var4, (byte) -101);
                this.field2628 = new class190(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method760(false) == 1;
                int var8 = arg2.method779(arg0 + 16695258);
                class254 var9;
                if (var7) {
                    var9 = new class171(arg2.method753(-128));
                } else {
                    var9 = new class64(arg2.method759((byte) 97));
                }
                this.field2628.method1215(var9, -122, (long) var8);
            }
        }
        if (arg0 != 16422) {
            method1193(38, -93, true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)Z")
    public static final boolean method1190(int arg0) throws IOException {
        field2632++;
        if (class10.field180 == null) {
            return false;
        }
        int var1 = class10.field180.method357((byte) 77);
        if (var1 == 0) {
            return false;
        }
        if (class195.field2807 == -1) {
            var1--;
            class10.field180.method363(class68.field1071.field1629, arg0 - 5942, 1, 0);
            class68.field1071.field1673 = 0;
            class195.field2807 = class68.field1071.method526(false);
            class7.field140 = class26.field361[class195.field2807];
        }
        if (class7.field140 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class10.field180.method363(class68.field1071.field1629, -5942, 1, 0);
            var1--;
            class7.field140 = class68.field1071.field1629[0] & 0xFF;
        }
        if (class7.field140 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class10.field180.method363(class68.field1071.field1629, arg0 - 5942, 2, 0);
            class68.field1071.field1673 = 0;
            var1 -= 2;
            class7.field140 = class68.field1071.method756(-29901);
        }
        if (var1 < class7.field140) {
            return false;
        }
        class68.field1071.field1673 = 0;
        class10.field180.method363(class68.field1071.field1629, -5942, class7.field140, arg0);
        class21.field283 = 0;
        class211.field3039 = class104.field1545;
        class104.field1545 = class281.field4478;
        class281.field4478 = class195.field2807;
        if (class195.field2807 == 245) {
            for (int var2 = 0; var2 < class194.field2777.length; var2++) {
                if (class194.field2777[var2] != null) {
                    class194.field2777[var2].field98 = -1;
                }
            }
            for (int var3 = 0; var3 < class82.field1268.length; var3++) {
                if (class82.field1268[var3] != null) {
                    class82.field1268[var3].field98 = -1;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 79) {
            int var4 = class68.field1071.method760(false);
            int var5 = class68.field1071.method782(false);
            int var6 = class68.field1071.method782(false);
            class163.field2364 = var5 >> 1;
            class55.field847.method353(var6, (var5 & 0x1) == 1, var4, -101);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 240) {
            long var7 = class68.field1071.method769(arg0 ^ 0xFFFFF96E);
            int var9 = class68.field1071.method756(-29901);
            boolean var10 = false;
            byte var11 = class68.field1071.method741(3083);
            if ((var7 & Long.MIN_VALUE) != 0L) {
                var10 = true;
            }
            if (var10) {
                if (class206.field2988 == 0) {
                    class195.field2807 = -1;
                    return true;
                }
                long var12 = var7 & Long.MAX_VALUE;
                boolean var14 = false;
                int var15;
                for (var15 = 0; var15 < class206.field2988 && (class213.field3068[var15].field3851 != var12 || class213.field3068[var15].field1248 != var9); var15++) {
                }
                if (class206.field2988 > var15) {
                    while ((class206.field2988 - 1) > var15) {
                        class213.field3068[var15] = class213.field3068[var15 + 1];
                        var15++;
                    }
                    class206.field2988--;
                    class213.field3068[class206.field2988] = null;
                }
            } else {
                String var16 = class68.field1071.method753(-128);
                class80 var17 = new class80();
                var17.field3851 = var7;
                var17.field1240 = class74.method496(arg0 + 4096, var17.field3851);
                var17.field1248 = var9;
                var17.field1236 = var16;
                var17.field1245 = var11;
                int var18;
                for (var18 = class206.field2988 - 1; var18 >= 0; var18--) {
                    int var19 = class213.field3068[var18].field1240.compareTo(var17.field1240);
                    if (var19 == 0) {
                        class213.field3068[var18].field1248 = var9;
                        class213.field3068[var18].field1245 = var11;
                        class213.field3068[var18].field1236 = var16;
                        class195.field2807 = -1;
                        class32.field466 = class213.field3063;
                        if (class68.field1054 == var7) {
                            class242.field3651 = var11;
                        }
                        return true;
                    }
                    if (var19 < 0) {
                        break;
                    }
                }
                if (class206.field2988 >= class213.field3068.length) {
                    class195.field2807 = -1;
                    return true;
                }
                for (int var20 = class206.field2988 - 1; var20 > var18; var20--) {
                    class213.field3068[var20 + 1] = class213.field3068[var20];
                }
                if (class206.field2988 == 0) {
                    class213.field3068 = new class80[100];
                }
                class213.field3068[var18 + 1] = var17;
                if (class68.field1054 == var7) {
                    class242.field3651 = var11;
                }
                class206.field2988++;
            }
            class195.field2807 = -1;
            class32.field466 = class213.field3063;
            return true;
        } else if (class195.field2807 == 75) {
            int var21 = class68.field1071.method770((byte) -61);
            class93.field1419 = class163.field2378.method556(false, var21);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 78) {
            int var22 = class68.field1071.method756(arg0 - 29901);
            int var23 = class68.field1071.method735((byte) -59);
            class55.method369(var22, var23, 86);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 133) {
            class262.field3950 = class68.field1071.method750((byte) 127);
            class96.field1455 = class68.field1071.method760(false);
            for (int var24 = class262.field3950; var24 < (class262.field3950 + 8); var24++) {
                for (int var26 = class96.field1455; var26 < (class96.field1455 + 8); var26++) {
                    if (class162.field2335[class163.field2364][var24][var26] != null) {
                        class162.field2335[class163.field2364][var24][var26] = null;
                        class107.method702(30926, var24, var26);
                    }
                }
            }
            for (class272 var25 = (class272) class91.field1382.method656(96); var25 != null; var25 = (class272) class91.field1382.method650(127)) {
                if (var25.field4310 >= class262.field3950 && var25.field4310 < class262.field3950 + 8 && var25.field4311 >= class96.field1455 && var25.field4311 < class96.field1455 + 8 && class163.field2364 == var25.field4315) {
                    var25.field4308 = 0;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 195) {
            String var27 = class68.field1071.method753(-128);
            int var28 = class68.field1071.method756(-29901);
            int var29 = class68.field1071.method757(-1380156360);
            if (class42.method289(var29, true)) {
                class193.method1240(var27, (byte) -13, var28);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 37) {
            int var30 = class68.field1071.method783(arg0 ^ 0x52);
            int var31 = class68.field1071.method756(-29901);
            class55.method369(var31, var30, 75);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 159) {
            int var32 = class68.field1071.method733(false);
            int var33 = class68.field1071.method733(false);
            int var34 = class68.field1071.method733(false);
            int var35 = class68.field1071.method759((byte) 111);
            if (class42.method289(var34, true)) {
                class110.method722(var35, (var32 << 16) + var33, arg0 ^ 0xD);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 87) {
            class195.field2807 = -1;
            class103.field1539 = 0;
            return true;
        } else if (class195.field2807 == 168) {
            class54.method361(false);
            class221.field3277 = class68.field1071.method760(false);
            class108.field1559 = class213.field3063;
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 202) {
            int var36 = class68.field1071.method746((byte) -116);
            byte var37 = class68.field1071.method762(0);
            class120.method825(var36, arg0 ^ 0xFFFFFFAC, var37);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 52) {
            int var38 = class68.field1071.method756(-29901);
            if (class42.method289(var38, true)) {
                class148.method987((byte) -86);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 150) {
            int var39 = class68.field1071.method757(-1380156360);
            int var40 = class68.field1071.method770((byte) 91);
            int var41 = class68.field1071.method746((byte) -80);
            if (class42.method289(var39, true)) {
                class34.method238(var40, var41, false);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 209) {
            String var42 = class68.field1071.method753(-128);
            if (var42.endsWith(":tradereq:")) {
                String var78 = var42.substring(0, var42.indexOf(":"));
                long var79 = class109.method712((byte) 103, var78);
                boolean var81 = false;
                for (int var82 = 0; var82 < class247.field3707; var82++) {
                    if (class81.field1253[var82] == var79) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class266.field4005 == 0) {
                    class255.method1712((byte) 72, class221.field3281, 4, var78);
                }
            } else if (var42.endsWith(":chalreq:")) {
                String var43 = var42.substring(0, var42.indexOf(":"));
                long var44 = class109.method712((byte) 99, var43);
                boolean var46 = false;
                for (int var47 = 0; var47 < class247.field3707; var47++) {
                    if (class81.field1253[var47] == var44) {
                        var46 = true;
                        break;
                    }
                }
                if (!var46 && class266.field4005 == 0) {
                    String var48 = var42.substring(var42.indexOf(":") + 1, var42.length() - 9);
                    class255.method1712((byte) 72, var48, 8, var43);
                }
            } else if (var42.endsWith(":assistreq:")) {
                String var73 = var42.substring(0, var42.indexOf(":"));
                long var74 = class109.method712((byte) -127, var73);
                boolean var76 = false;
                for (int var77 = 0; var77 < class247.field3707; var77++) {
                    if (class81.field1253[var77] == var74) {
                        var76 = true;
                        break;
                    }
                }
                if (!var76 && class266.field4005 == 0) {
                    class255.method1712((byte) 72, "", 10, var73);
                }
            } else if (var42.endsWith(":clan:")) {
                String var72 = var42.substring(0, var42.indexOf(":clan:"));
                class255.method1712((byte) 72, var72, 11, "");
            } else if (var42.endsWith(":trade:")) {
                String var71 = var42.substring(0, var42.indexOf(":trade:"));
                if (class266.field4005 == 0) {
                    class255.method1712((byte) 72, var71, 12, "");
                }
            } else if (var42.endsWith(":assist:")) {
                String var70 = var42.substring(0, var42.indexOf(":assist:"));
                if (class266.field4005 == 0) {
                    class255.method1712((byte) 72, var70, 13, "");
                }
            } else if (var42.endsWith(":duelstake:")) {
                boolean var49 = false;
                String var50 = var42.substring(0, var42.indexOf(":"));
                long var51 = class109.method712((byte) 54, var50);
                for (int var53 = 0; var53 < class247.field3707; var53++) {
                    if (class81.field1253[var53] == var51) {
                        var49 = true;
                        break;
                    }
                }
                if (!var49 && class266.field4005 == 0) {
                    class255.method1712((byte) 72, "", 14, var50);
                }
            } else if (var42.endsWith(":duelfriend:")) {
                String var54 = var42.substring(0, var42.indexOf(":"));
                long var55 = class109.method712((byte) 74, var54);
                boolean var57 = false;
                for (int var58 = 0; var58 < class247.field3707; var58++) {
                    if (class81.field1253[var58] == var55) {
                        var57 = true;
                        break;
                    }
                }
                if (!var57 && class266.field4005 == 0) {
                    class255.method1712((byte) 72, "", 15, var54);
                }
            } else if (var42.endsWith(":clanreq:")) {
                String var59 = var42.substring(0, var42.indexOf(":"));
                long var60 = class109.method712((byte) -127, var59);
                boolean var62 = false;
                for (int var63 = 0; var63 < class247.field3707; var63++) {
                    if (class81.field1253[var63] == var60) {
                        var62 = true;
                        break;
                    }
                }
                if (!var62 && class266.field4005 == 0) {
                    class255.method1712((byte) 72, "", 16, var59);
                }
            } else if (var42.endsWith(":allyreq:")) {
                boolean var64 = false;
                String var65 = var42.substring(0, var42.indexOf(":"));
                long var66 = class109.method712((byte) -127, var65);
                for (int var68 = 0; var68 < class247.field3707; var68++) {
                    if (class81.field1253[var68] == var66) {
                        var64 = true;
                        break;
                    }
                }
                if (!var64 && class266.field4005 == 0) {
                    String var69 = var42.substring(var42.indexOf(":") + 1, var42.length() + -9);
                    class255.method1712((byte) 72, var69, 21, var65);
                }
            } else {
                class255.method1712((byte) 72, var42, 0, "");
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 15) {
            int var83 = class68.field1071.method759((byte) 123);
            class267 var84 = class282.method1897(var83, 59);
            for (int var85 = 0; var85 < var84.field4107.length; var85++) {
                var84.field4107[var85] = -1;
                var84.field4107[var85] = 0;
            }
            class217.method1396(false, var84);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 148) {
            class99.method663(-10414);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 145) {
            class170.method1123(-2, class68.field1071, class7.field140, class163.field2378);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 60) {
            int var86 = class68.field1071.method735((byte) -59);
            int var87 = class68.field1071.method746((byte) -78);
            if (class42.method289(var87, true)) {
                int var88 = 0;
                if (class55.field847.field765 != null) {
                    var88 = class55.field847.field765.method1415((byte) -72);
                }
                class200.method1299(true, 3, var88, var86, -1);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 50) {
            class149.method998(false, true);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 43) {
            int var89 = class68.field1071.method760(false);
            if (class68.field1071.method760(false) == 0) {
                class100.field1495[var89] = new class159();
            } else {
                class68.field1071.field1673--;
                class100.field1495[var89] = new class159(class68.field1071);
            }
            class195.field2807 = -1;
            class45.field639 = class213.field3063;
            return true;
        } else if (class195.field2807 == 72) {
            int var90 = class68.field1071.method756(-29901);
            String var91 = class68.field1071.method753(-128);
            Object[] var92 = new Object[var91.length() + 1];
            for (int var93 = var91.length() - 1; var93 >= 0; var93--) {
                if (var91.charAt(var93) == 's') {
                    var92[var93 + 1] = class68.field1071.method753(arg0 - 128);
                } else {
                    var92[var93 + 1] = Integer.valueOf(class68.field1071.method759((byte) 107));
                }
            }
            var92[0] = Integer.valueOf(class68.field1071.method759((byte) 107));
            if (class42.method289(var90, true)) {
                class234 var94 = new class234();
                var94.field3530 = var92;
                class15.method118((byte) 95, var94);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 147) {
            long var95 = class68.field1071.method769(-1682);
            class68.field1071.method741(3083);
            long var97 = class68.field1071.method769(arg0 - 1682);
            long var99 = (long) class68.field1071.method756(-29901);
            boolean var101 = false;
            long var102 = (long) class68.field1071.method779(16711680);
            long var104 = (var99 << 32) + var102;
            int var106 = class68.field1071.method760(false);
            int var107 = class68.field1071.method756(-29901);
            int var108 = 0;
            label1306: while (true) {
                if (var108 >= 100) {
                    if (var106 <= 1) {
                        for (int var109 = 0; var109 < class247.field3707; var109++) {
                            if (class81.field1253[var109] == var95) {
                                var101 = true;
                                break label1306;
                            }
                        }
                    }
                    break;
                }
                if (class53.field794[var108] == var104) {
                    var101 = true;
                    break;
                }
                var108++;
            }
            if (!var101 && class266.field4005 == 0) {
                class53.field794[class260.field3929] = var104;
                class260.field3929 = (class260.field3929 + 1) % 100;
                String var110 = class162.method1087(1, var107).method1354((byte) 116, class68.field1071);
                if (var106 == 2 || var106 == 3) {
                    class178.method1155(class204.method1321((byte) -83, var97), var110, "<img=1>" + class204.method1321((byte) -74, var95), 4096, var107, 20);
                } else if (var106 == 1) {
                    class178.method1155(class204.method1321((byte) -124, var97), var110, "<img=0>" + class204.method1321((byte) -57, var95), arg0 + 4096, var107, 20);
                } else {
                    class178.method1155(class204.method1321((byte) 123, var97), var110, class204.method1321((byte) 116, var95), 4096, var107, 20);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 156) {
            long var111 = class68.field1071.method769(-1682);
            long var113 = (long) class68.field1071.method756(-29901);
            boolean var115 = false;
            long var116 = (long) class68.field1071.method779(arg0 ^ 0xFF0000);
            long var118 = (var113 << 32) + var116;
            int var120 = class68.field1071.method760(false);
            int var121 = 0;
            label1338: while (true) {
                if (var121 >= 100) {
                    if (var120 <= 1) {
                        if ((!class108.field1560 || class24.field320) && !class136.field1965) {
                            for (int var122 = 0; var122 < class247.field3707; var122++) {
                                if (class81.field1253[var122] == var111) {
                                    var115 = true;
                                    break label1338;
                                }
                            }
                        } else {
                            var115 = true;
                        }
                    }
                    break;
                }
                if (class53.field794[var121] == var118) {
                    var115 = true;
                    break;
                }
                var121++;
            }
            if (!var115 && class266.field4005 == 0) {
                class53.field794[class260.field3929] = var118;
                class260.field3929 = (class260.field3929 + 1) % 100;
                String var123 = class198.method1266(class281.method1890((byte) -79, class99.method664(class68.field1071, true)));
                if (var120 == 2 || var120 == 3) {
                    class255.method1712((byte) 72, var123, 7, "<img=1>" + class204.method1321((byte) 120, var111));
                } else if (var120 == 1) {
                    class255.method1712((byte) 72, var123, 7, "<img=0>" + class204.method1321((byte) -69, var111));
                } else {
                    class255.method1712((byte) 72, var123, 3, class204.method1321((byte) -114, var111));
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 218) {
            int var124 = class68.field1071.method756(-29901);
            int var125 = class68.field1071.method746((byte) -115);
            int var126 = class68.field1071.method789((byte) 118);
            if (var125 == 65535) {
                var125 = -1;
            }
            if (class42.method289(var124, true)) {
                class200.method1299(true, 2, var125, var126, -1);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 211) {
            int var127 = class68.field1071.method750((byte) 126);
            int var128 = class68.field1071.method756(-29901);
            int var129 = class68.field1071.method756(-29901);
            if (class42.method289(var129, true)) {
                if (var127 == 2) {
                    class13.method108(-5955);
                }
                class193.field2774 = var128;
                class68.method460(var128, (byte) -117);
                class38.method266(0, false);
                class89.method601(class193.field2774, true);
                for (int var130 = 0; var130 < 100; var130++) {
                    class21.field278[var130] = true;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 128) {
            long var131 = class68.field1071.method769(-1682);
            long var133 = (long) class68.field1071.method756(arg0 ^ 0xFFFF8B33);
            long var135 = (long) class68.field1071.method779(16711680);
            long var137 = (var133 << 32) + var135;
            int var139 = class68.field1071.method760(false);
            int var140 = class68.field1071.method756(-29901);
            boolean var141 = false;
            int var142 = 0;
            label1363: while (true) {
                if (var142 >= 100) {
                    if (var139 <= 1) {
                        for (int var143 = 0; var143 < class247.field3707; var143++) {
                            if (class81.field1253[var143] == var131) {
                                var141 = true;
                                break label1363;
                            }
                        }
                    }
                    break;
                }
                if (class53.field794[var142] == var137) {
                    var141 = true;
                    break;
                }
                var142++;
            }
            if (!var141 && class266.field4005 == 0) {
                class53.field794[class260.field3929] = var137;
                class260.field3929 = (class260.field3929 + 1) % 100;
                String var144 = class162.method1087(1, var140).method1354((byte) 64, class68.field1071);
                if (var139 == 2) {
                    class178.method1155((String) null, var144, "<img=1>" + class204.method1321((byte) 19, var131), arg0 ^ 0x1000, var140, 18);
                } else if (var139 == 1) {
                    class178.method1155((String) null, var144, "<img=0>" + class204.method1321((byte) 111, var131), 4096, var140, 18);
                } else {
                    class178.method1155((String) null, var144, class204.method1321((byte) -91, var131), arg0 + 4096, var140, 18);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 24) {
            int var145 = class68.field1071.method735((byte) -59);
            int var146 = class68.field1071.method746((byte) -100);
            class120.method825(var146, -83, var145);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 224) {
            long var147 = class68.field1071.method769(-1682);
            int var149 = class68.field1071.method756(arg0 - 29901);
            String var150 = class162.method1087(arg0 ^ 0x1, var149).method1354((byte) 52, class68.field1071);
            class178.method1155((String) null, var150, class204.method1321((byte) -7, var147), 4096, var149, 19);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 228) {
            int var151 = class68.field1071.method760(false);
            int var152 = class68.field1071.method757(arg0 - 1380156360);
            if (class42.method289(var152, true)) {
                class221.field3269 = var151;
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 180) {
            int var153 = class68.field1071.method756(-29901);
            int var154 = class68.field1071.method746((byte) -79);
            int var155 = class68.field1071.method759((byte) 111);
            int var156 = class68.field1071.method733(false);
            if (var154 == 65535) {
                var154 = -1;
            }
            int var157 = class68.field1071.method733(false);
            if (var156 == 65535) {
                var156 = -1;
            }
            if (class42.method289(var157, true)) {
                for (int var158 = var156; var158 <= var154; var158++) {
                    long var159 = ((long) var155 << 32) + (long) var158;
                    class92 var161 = (class92) class53.field780.method1218(var159, arg0 ^ 0x70);
                    class92 var162;
                    if (var161 != null) {
                        var162 = new class92(var161.field1395, var153);
                        var161.method1706(-85);
                    } else if (var158 == -1) {
                        var162 = new class92(class282.method1897(var155, 79).field4046.field1395, var153);
                    } else {
                        var162 = new class92(0, var153);
                    }
                    class53.field780.method1215(var162, -88, var159);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 14) {
            class54.method361(false);
            int var163 = class68.field1071.method760(false);
            int var164 = class68.field1071.method770((byte) 123);
            int var165 = class68.field1071.method783(arg0 + 104);
            class180.field2571[var165] = var164;
            class70.field1093[var165] = var163;
            class274.field4400[var165] = 1;
            for (int var166 = 0; var166 < 98; var166++) {
                if (var164 >= class31.field462[var166]) {
                    class274.field4400[var165] = var166 + 2;
                }
            }
            class114.field1656[method1188(31, class152.field2189++)] = var165;
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 35) {
            int var167 = class68.field1071.method789((byte) 118);
            int var168 = class68.field1071.method733(false);
            int var169 = class68.field1071.method782(false);
            if (class42.method289(var168, true)) {
                class266.method1765(var167, var169, (byte) -36);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 27) {
            class54.method361(false);
            class118.field1735 = class68.field1071.method763(true);
            class195.field2807 = -1;
            class108.field1559 = class213.field3063;
            return true;
        } else if (class195.field2807 == 158) {
            class13.method110((byte) 65);
            class54.method361(false);
            class115.field1703 += 32;
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 222) {
            int var170 = class68.field1071.method733(false);
            int var171 = class68.field1071.method756(arg0 ^ 0xFFFF8B33);
            int var172 = class68.field1071.method750((byte) 126);
            class72 var173 = class82.field1268[var170];
            if (var173 != null) {
                class235.method1549(var171, var173, -1, var172);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 64) {
            int var174 = class68.field1071.method759((byte) 102);
            int var175 = class68.field1071.method756(-29901);
            if (var174 < -70000) {
                var175 += 32768;
            }
            class267 var176;
            if (var174 < 0) {
                var176 = null;
            } else {
                var176 = class282.method1897(var174, arg0 + 121);
            }
            while (class68.field1071.field1673 < class7.field140) {
                int var177 = class68.field1071.method787((byte) 115);
                int var178 = class68.field1071.method756(-29901);
                int var179 = 0;
                if (var178 != 0) {
                    var179 = class68.field1071.method760(false);
                    if (var179 == 255) {
                        var179 = class68.field1071.method759((byte) 123);
                    }
                }
                if (var176 != null && var177 >= 0 && var177 < var176.field4107.length) {
                    var176.field4107[var177] = var178;
                    var176.field4172[var177] = var179;
                }
                class250.method1651(var179, var177, var175, true, var178 - 1);
            }
            if (var176 != null) {
                class217.method1396(false, var176);
            }
            class54.method361(false);
            class149.field2128[method1188(31, class209.field3011++)] = method1188(32767, var175);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 236) {
            class68.field1071.field1673 += 28;
            if (class68.field1071.method754((byte) 20)) {
                class246.method1613(class68.field1071, 127, class68.field1071.field1673 - 28);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 139) {
            class209.field3012 = class68.field1071.method760(false);
            class195.field2807 = -1;
            class113.field1611 = class213.field3063;
            return true;
        } else if (class195.field2807 == 233) {
            int var180 = class68.field1071.method756(arg0 ^ 0xFFFF8B33);
            int var181 = class68.field1071.method759((byte) 121);
            if (class42.method289(var180, true)) {
                class261 var182 = (class261) class128.field1874.method1218((long) var181, arg0 + 123);
                if (var182 != null) {
                    class69.method466((byte) -88, var182, true);
                }
                if (class101.field1508 != null) {
                    class217.method1396(false, class101.field1508);
                    class101.field1508 = null;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 172) {
            int var183 = class68.field1071.method735((byte) -59);
            int var184 = class68.field1071.method756(-29901);
            int var185 = class68.field1071.method756(-29901);
            int var186 = class68.field1071.method733(false);
            if (var183 >> 30 != 0) {
                int var197 = (var183 & 0x3AF437AE) >> 28;
                int var198 = ((var183 & 0xFFFCB48) >> 14) - class113.field1615;
                int var199 = (var183 & 0x3FFF) - class95.field1445;
                if (var198 >= 0 && var199 >= 0 && var198 < 104 && var199 < 104) {
                    int var200 = var199 * 128 + 64;
                    int var201 = var198 * 128 + 64;
                    class73 var202 = new class73(var185, var197, var201, var200, class81.method542(var201, -1, var197, var200) - var184, var186, class82.field1267);
                    class86.field1323.method652(108, new class290(var202));
                }
            } else if (var183 >> 29 != 0) {
                int var192 = var183 & 0xFFFF;
                class72 var193 = class82.field1268[var192];
                if (var193 != null) {
                    if (var185 == 65535) {
                        var185 = -1;
                    }
                    boolean var194 = true;
                    if (var185 != -1 && var193.field81 != -1 && class70.method478(class274.method1848(true, var185).field138, false).field2830 < class70.method478(class274.method1848(true, var193.field81).field138, false).field2830) {
                        var194 = false;
                    }
                    if (var194) {
                        var193.field90 = 0;
                        var193.field46 = 1;
                        var193.field120 = 0;
                        var193.field40 = class82.field1267 + var186;
                        var193.field111 = var184;
                        var193.field81 = var185;
                        if (class82.field1267 < var193.field40) {
                            var193.field120 = -1;
                        }
                        if (var193.field81 != -1 && class82.field1267 == var193.field40) {
                            int var195 = class274.method1848(true, var193.field81).field138;
                            if (var195 != -1) {
                                class196 var196 = class70.method478(var195, false);
                                if (var196 != null && var196.field2818 != null) {
                                    class206.method1327(0, -64, var196, false, var193.field94, var193.field45);
                                }
                            }
                        }
                    }
                }
            } else if ((var183 >> 28) != 0) {
                int var187 = var183 & 0xFFFF;
                class53 var188;
                if (class73.field1133 == var187) {
                    var188 = class55.field847;
                } else {
                    var188 = class194.field2777[var187];
                }
                if (var188 != null) {
                    if (var185 == 65535) {
                        var185 = -1;
                    }
                    boolean var189 = true;
                    if (var185 != -1 && var188.field81 != -1 && class70.method478(class274.method1848(true, var185).field138, false).field2830 < class70.method478(class274.method1848(true, var188.field81).field138, false).field2830) {
                        var189 = false;
                    }
                    if (var189) {
                        var188.field120 = 0;
                        var188.field40 = class82.field1267 + var186;
                        var188.field111 = var184;
                        var188.field81 = var185;
                        var188.field46 = 1;
                        var188.field90 = 0;
                        if (class82.field1267 < var188.field40) {
                            var188.field120 = -1;
                        }
                        if (var188.field81 == 65535) {
                            var188.field81 = -1;
                        }
                        if (var188.field81 != -1 && class82.field1267 == var188.field40) {
                            int var190 = class274.method1848(true, var188.field81).field138;
                            if (var190 != -1) {
                                class196 var191 = class70.method478(var190, false);
                                if (var191 != null && var191.field2818 != null) {
                                    class206.method1327(0, -79, var191, class55.field847 == var188, var188.field94, var188.field45);
                                }
                            }
                        }
                    }
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 129) {
            class149.method998(false, false);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 166) {
            int var203 = class68.field1071.method746((byte) -36);
            int var204 = class68.field1071.method770((byte) 95);
            int var205 = class68.field1071.method746((byte) -21);
            int var206 = class68.field1071.method746((byte) -50);
            int var207 = class68.field1071.method733(false);
            if (class42.method289(var205, true)) {
                class225.method1473(var204, var207, var206, var203, arg0 + 8);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 80) {
            int var208 = class68.field1071.method746((byte) -78);
            int var209 = class68.field1071.method789((byte) 118);
            if (var208 == 65535) {
                var208 = -1;
            }
            int var210 = var209 & 0x3FFF;
            int var211 = class68.field1071.method750((byte) 127);
            int var212 = var209 >> 14 & 0x3FFF;
            int var213 = var210 - class95.field1445;
            int var214 = var212 - class113.field1615;
            int var215 = var209 >> 28 & 0x3;
            int var216 = var211 >> 2;
            int var217 = var211 & 0x3;
            int var218 = class66.field1032[var216];
            class152.method1030(var215, var214, var218, 262143, var213, var208, var216, var217);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 169) {
            class96.field1455 = class68.field1071.method783(arg0 ^ 0x70);
            class262.field3950 = class68.field1071.method750((byte) 127);
            while (class68.field1071.field1673 < class7.field140) {
                class195.field2807 = class68.field1071.method760(false);
                class146.method980(7);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 101) {
            class178.method1157(true);
            class195.field2807 = -1;
            return false;
        } else if (class195.field2807 == 102) {
            if (class7.field140 == 0) {
                class189.field2682 = class158.field2287;
            } else {
                class189.field2682 = class68.field1071.method753(-128);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 237) {
            class32.field466 = class213.field3063;
            long var219 = class68.field1071.method769(arg0 ^ 0xFFFFF96E);
            if (var219 == 0L) {
                class195.field2807 = -1;
                class124.field1808 = null;
                class206.field2988 = 0;
                class213.field3068 = null;
                class84.field1292 = null;
                return true;
            }
            long var221 = class68.field1071.method769(-1682);
            class84.field1292 = class74.method496(arg0 ^ 0x1000, var221);
            class124.field1808 = class74.method496(4096, var219);
            class233.field3488 = class68.field1071.method741(3083);
            int var223 = class68.field1071.method760(false);
            if (var223 == 255) {
                class195.field2807 = -1;
                return true;
            }
            class206.field2988 = var223;
            class80[] var224 = new class80[100];
            for (int var225 = 0; var225 < class206.field2988; var225++) {
                var224[var225] = new class80();
                var224[var225].field3851 = class68.field1071.method769(-1682);
                var224[var225].field1240 = class74.method496(4096, var224[var225].field3851);
                var224[var225].field1248 = class68.field1071.method756(-29901);
                var224[var225].field1245 = class68.field1071.method741(arg0 + 3083);
                var224[var225].field1236 = class68.field1071.method753(-128);
                if (class68.field1054 == var224[var225].field3851) {
                    class242.field3651 = var224[var225].field1245;
                }
            }
            boolean var226 = false;
            int var227 = class206.field2988;
            while (var227 > 0) {
                var227--;
                boolean var228 = true;
                for (int var229 = 0; var229 < var227; var229++) {
                    if (var224[var229].field1240.compareTo(var224[var229 + 1].field1240) > 0) {
                        var228 = false;
                        class80 var230 = var224[var229];
                        var224[var229] = var224[var229 + 1];
                        var224[var229 + 1] = var230;
                    }
                }
                if (var228) {
                    break;
                }
            }
            class213.field3068 = var224;
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 191) {
            int var231 = class68.field1071.method789((byte) 118);
            int var232 = class68.field1071.method756(-29901);
            int var233 = class68.field1071.method735((byte) -59);
            int var234 = class68.field1071.method757(-1380156360);
            if (var234 == 65535) {
                var234 = -1;
            }
            int var235 = class68.field1071.method746((byte) -107);
            if (var235 == 65535) {
                var235 = -1;
            }
            if (class42.method289(var232, true)) {
                for (int var236 = var235; var236 <= var234; var236++) {
                    long var237 = ((long) var231 << 32) + (long) var236;
                    class92 var239 = (class92) class53.field780.method1218(var237, -83);
                    class92 var240;
                    if (var239 != null) {
                        var240 = new class92(var233, var239.field1400);
                        var239.method1706(-57);
                    } else if (var236 == -1) {
                        var240 = new class92(var233, class282.method1897(var231, 101).field4046.field1400);
                    } else {
                        var240 = new class92(var233, -1);
                    }
                    class53.field780.method1215(var240, -107, var237);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 183) {
            int var241 = class68.field1071.method746((byte) -42);
            int var242 = class68.field1071.method789((byte) 118);
            int var243 = class68.field1071.method789((byte) 118);
            if (class42.method289(var241, true)) {
                class261 var244 = (class261) class128.field1874.method1218((long) var243, 117);
                class261 var245 = (class261) class128.field1874.method1218((long) var242, 116);
                if (var245 != null) {
                    class69.method466((byte) -118, var245, var244 == null || var244.field3940 != var245.field3940);
                }
                if (var244 != null) {
                    var244.method1706(-66);
                    class128.field1874.method1215(var244, -90, (long) var242);
                }
                class267 var246 = class282.method1897(var243, arg0 ^ 0x5D);
                if (var246 != null) {
                    class217.method1396(false, var246);
                }
                class267 var247 = class282.method1897(var242, arg0 ^ 0x74);
                if (var247 != null) {
                    class217.method1396(false, var247);
                    class130.method897(arg0 ^ 0xFFFFFE0B, var247, true);
                }
                if (class193.field2774 != -1) {
                    class168.method1114(false, class193.field2774, 1);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 96) {
            String var248 = class68.field1071.method753(-128);
            int var249 = class68.field1071.method733(false);
            int var250 = class68.field1071.method789((byte) 118);
            if (class42.method289(var249, true)) {
                class86.method589(var250, 5, var248);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 154) {
            int var251 = class68.field1071.method786(arg0 ^ 0xFFFFFFB9);
            int var252 = class68.field1071.method759((byte) 122);
            int var253 = class68.field1071.method756(-29901);
            if (class42.method289(var253, true)) {
                class211.method1348(var252, var251, 5);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 117) {
            class30.field423 = class68.field1071.method760(false);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 19) {
            class131.method903(true, class68.field1071.method753(-128));
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 136) {
            int var254 = class68.field1071.method757(-1380156360);
            int var255 = class68.field1071.method757(-1380156360);
            String var256 = class68.field1071.method753(-128);
            if (class42.method289(var255, true)) {
                class193.method1240(var256, (byte) -13, var254);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 5) {
            class247.field3707 = class7.field140 / 8;
            for (int var257 = 0; var257 < class247.field3707; var257++) {
                class81.field1253[var257] = class68.field1071.method769(class182.method1175(arg0, -1682));
                class62.field1003[var257] = class273.method1845(class81.field1253[var257], class182.method1175(arg0, 28549));
            }
            class195.field2807 = -1;
            class113.field1611 = class213.field3063;
            return true;
        } else if (class195.field2807 == 189) {
            class262.field3950 = class68.field1071.method760(false);
            class96.field1455 = class68.field1071.method750((byte) 127);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 216) {
            int var258 = class68.field1071.method759((byte) 110);
            int var259 = class68.field1071.method756(-29901);
            class267 var260;
            if (var258 < 0) {
                var260 = null;
            } else {
                var260 = class282.method1897(var258, 79);
            }
            if (var258 < -70000) {
                var259 += 32768;
            }
            if (var260 != null) {
                for (int var261 = 0; var261 < var260.field4107.length; var261++) {
                    var260.field4107[var261] = 0;
                    var260.field4172[var261] = 0;
                }
            }
            class129.method894(var259, (byte) -110);
            int var262 = class68.field1071.method756(-29901);
            for (int var263 = 0; var263 < var262; var263++) {
                int var264 = class68.field1071.method760(false);
                if (var264 == 255) {
                    var264 = class68.field1071.method759((byte) 111);
                }
                int var265 = class68.field1071.method757(arg0 ^ 0xADBC7C38);
                if (var260 != null && var263 < var260.field4107.length) {
                    var260.field4107[var263] = var265;
                    var260.field4172[var263] = var264;
                }
                class250.method1651(var264, var263, var259, true, var265 - 1);
            }
            if (var260 != null) {
                class217.method1396(false, var260);
            }
            class54.method361(false);
            class149.field2128[method1188(31, class209.field3011++)] = method1188(var259, 32767);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 91) {
            int var266 = class68.field1071.method759((byte) 110);
            int var267 = class68.field1071.method757(-1380156360);
            int var268 = class68.field1071.method746((byte) -125);
            if (class42.method289(var268, true)) {
                class16.method122(6, var266, var267);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 107) {
            int var269 = class68.field1071.method756(-29901);
            int var270 = class68.field1071.method760(false);
            int var271 = class68.field1071.method760(false);
            int var272 = class68.field1071.method756(arg0 - 29901);
            int var273 = class68.field1071.method760(false);
            int var274 = class68.field1071.method760(false);
            if (class42.method289(var269, true)) {
                class37.method264(var273, var274, var271, true, 118, var272, var270);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 82) {
            int var275 = class68.field1071.method756(arg0 - 29901);
            int var276 = class68.field1071.method759((byte) 123);
            int var277 = class68.field1071.method759((byte) 110);
            int var278 = class68.field1071.method757(-1380156360);
            if (var278 == 65535) {
                var278 = -1;
            }
            if (class42.method289(var275, true)) {
                class267 var279 = class282.method1897(var276, 84);
                if (var279.field4039) {
                    class132.method904(var277, (byte) -125, var278, var276);
                    class273 var281 = class259.method1735(var278, -14667);
                    class225.method1473(var276, var281.field4333, var281.field4394, var281.field4359, 8);
                    class192.method1233(var276, var281.field4390, var281.field4321, var281.field4363, 10);
                } else if (var278 == -1) {
                    var279.field4057 = 0;
                    class195.field2807 = -1;
                    return true;
                } else {
                    class273 var280 = class259.method1735(var278, arg0 ^ 0xFFFFC6B5);
                    var279.field4155 = var280.field4333;
                    var279.field4057 = 4;
                    var279.field4135 = var280.field4359 * 100 / var277;
                    var279.field4097 = var280.field4394;
                    var279.field4038 = var278;
                    class217.method1396(false, var279);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 97) {
            int var282 = class68.field1071.method756(-29901);
            int var283 = class68.field1071.method757(-1380156360);
            int var284 = class68.field1071.method733(false);
            int var285 = class68.field1071.method733(false);
            int var286 = class68.field1071.method735((byte) -59);
            if (class42.method289(var283, true)) {
                class200.method1299(true, 7, var282 | var284 << 16, var286, var285);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 210) {
            long var287 = class68.field1071.method769(-1682);
            class68.field1071.method741(3083);
            long var289 = class68.field1071.method769(-1682);
            long var291 = (long) class68.field1071.method756(-29901);
            long var293 = (long) class68.field1071.method779(16711680);
            int var295 = class68.field1071.method760(false);
            long var296 = (var291 << 32) + var293;
            boolean var298 = false;
            int var299 = 0;
            label1471: while (true) {
                if (var299 >= 100) {
                    if (var295 <= 1) {
                        if ((!class108.field1560 || class24.field320) && !class136.field1965) {
                            for (int var300 = 0; var300 < class247.field3707; var300++) {
                                if (class81.field1253[var300] == var287) {
                                    var298 = true;
                                    break label1471;
                                }
                            }
                        } else {
                            var298 = true;
                        }
                    }
                    break;
                }
                if (class53.field794[var299] == var296) {
                    var298 = true;
                    break;
                }
                var299++;
            }
            if (!var298 && class266.field4005 == 0) {
                class53.field794[class260.field3929] = var296;
                class260.field3929 = (class260.field3929 + 1) % 100;
                String var301 = class198.method1266(class281.method1890((byte) -79, class99.method664(class68.field1071, true)));
                if (var295 == 2 || var295 == 3) {
                    class247.method1629(var301, class204.method1321((byte) -6, var289), (byte) 94, "<img=1>" + class204.method1321((byte) -75, var287), 9);
                } else if (var295 == 1) {
                    class247.method1629(var301, class204.method1321((byte) -59, var289), (byte) 107, "<img=0>" + class204.method1321((byte) 117, var287), 9);
                } else {
                    class247.method1629(var301, class204.method1321((byte) -126, var289), (byte) -107, class204.method1321((byte) -47, var287), 9);
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 153) {
            byte[] var302 = new byte[class7.field140];
            class68.field1071.method520(0, (byte) 104, class7.field140, var302);
            String var303 = class222.method1443(true, var302, 0, class7.field140);
            if (class282.field4503 == null && class83.field1286 == 3 || !class83.field1270.startsWith("win") || class118.field1736) {
                class114.method788((byte) 119, true, var303);
            } else {
                class211.field3032 = true;
                class96.field1457 = var303;
                field2631 = class163.field2378.method557((byte) 125, var303);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 247) {
            long var304 = class68.field1071.method769(arg0 - 1682);
            String var306 = class198.method1266(class281.method1890((byte) -79, class99.method664(class68.field1071, true)));
            class255.method1712((byte) 72, var306, 6, class204.method1321((byte) 125, var304));
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 132) {
            int var307 = class68.field1071.method756(-29901);
            if (var307 == 65535) {
                var307 = -1;
            }
            int var308 = class68.field1071.method759((byte) 101);
            int var309 = class68.field1071.method746((byte) -86);
            if (class42.method289(var309, true)) {
                class200.method1299(true, 1, var307, var308, -1);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 225) {
            byte var310 = class68.field1071.method778((byte) -71);
            int var311 = class68.field1071.method733(false);
            int var312 = class68.field1071.method746((byte) -59);
            if (class42.method289(var311, true)) {
                class148.method990(var310, var312, (byte) -23);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 161) {
            int var313 = class68.field1071.method746((byte) -78);
            int var314 = class68.field1071.method735((byte) -59);
            int var315 = class68.field1071.method756(-29901);
            if (class42.method289(var315, true)) {
                class148.method990(var314, var313, (byte) 117);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 41) {
            int var316 = class68.field1071.method770((byte) 91);
            int var317 = class68.field1071.method746((byte) -74);
            int var318 = class68.field1071.method786(-75);
            int var319 = class68.field1071.method763(true);
            if (class42.method289(var317, true)) {
                class150.method1012(var319, var316, var318, (byte) 61);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 99) {
            int var320 = class68.field1071.method757(-1380156360);
            int var321 = class68.field1071.method760(false);
            int var322 = class68.field1071.method735((byte) -59);
            int var323 = class68.field1071.method733(false);
            if (class42.method289(var323, true)) {
                class261 var324 = (class261) class128.field1874.method1218((long) var322, 126);
                if (var324 != null) {
                    class69.method466((byte) -100, var324, var324.field3940 != var320);
                }
                class196.method1251(var320, false, var322, var321);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 142) {
            int var325 = class68.field1071.method760(false);
            int var326 = var325 >> 6;
            class39 var327 = new class39();
            var327.field574 = var325 & 0x3F;
            var327.field573 = class68.field1071.method760(false);
            if (var327.field573 >= 0 && var327.field573 < class257.field3902.length) {
                if (var327.field574 == 1 || var327.field574 == 10) {
                    var327.field578 = class68.field1071.method756(arg0 - 29901);
                    class68.field1071.field1673 += 3;
                } else if (var327.field574 >= 2 && var327.field574 <= 6) {
                    if (var327.field574 == 2) {
                        var327.field577 = 64;
                        var327.field580 = 64;
                    }
                    if (var327.field574 == 3) {
                        var327.field580 = 0;
                        var327.field577 = 64;
                    }
                    if (var327.field574 == 4) {
                        var327.field577 = 64;
                        var327.field580 = 128;
                    }
                    if (var327.field574 == 5) {
                        var327.field580 = 64;
                        var327.field577 = 0;
                    }
                    if (var327.field574 == 6) {
                        var327.field580 = 64;
                        var327.field577 = 128;
                    }
                    var327.field574 = 2;
                    var327.field584 = class68.field1071.method756(-29901);
                    var327.field576 = class68.field1071.method756(-29901);
                    var327.field579 = class68.field1071.method760(false);
                }
                var327.field571 = class68.field1071.method756(arg0 ^ 0xFFFF8B33);
                if (var327.field571 == 65535) {
                    var327.field571 = -1;
                }
                class210.field3024[var326] = var327;
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 73) {
            if (class193.field2774 != -1) {
                class168.method1114(false, class193.field2774, 0);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 44) {
            long var328 = class68.field1071.method769(-1682);
            int var330 = class68.field1071.method756(-29901);
            int var331 = class68.field1071.method760(false);
            String var332 = "";
            boolean var333 = true;
            if (var330 > 0) {
                var332 = class68.field1071.method753(-128);
            }
            if (var328 < 0L) {
                var333 = false;
                var328 &= Long.MAX_VALUE;
            }
            String var334 = class204.method1321((byte) 125, var328);
            for (int var335 = 0; var335 < class55.field836; var335++) {
                if (class95.field1452[var335] == var328) {
                    if (class95.field1439[var335] != var330) {
                        class95.field1439[var335] = var330;
                        if (var330 > 0) {
                            class255.method1712((byte) 72, var334 + class26.field358, 5, "");
                        }
                        if (var330 == 0) {
                            class255.method1712((byte) 72, var334 + class221.field3280, 5, "");
                        }
                    }
                    var334 = null;
                    class79.field1222[var335] = var332;
                    class35.field498[var335] = var331;
                    class152.field2194[var335] = var333;
                    break;
                }
            }
            if (var334 != null && class55.field836 < 200) {
                class95.field1452[class55.field836] = var328;
                class70.field1089[class55.field836] = var334;
                class95.field1439[class55.field836] = var330;
                class79.field1222[class55.field836] = var332;
                class35.field498[class55.field836] = var331;
                class152.field2194[class55.field836] = var333;
                class55.field836++;
            }
            class113.field1611 = class213.field3063;
            boolean var336 = false;
            int var337 = class55.field836;
            while (var337 > 0) {
                boolean var338 = true;
                var337--;
                for (int var339 = 0; var339 < var337; var339++) {
                    if (class95.field1439[var339] != class29.field415 && class95.field1439[var339 + 1] == class29.field415 || class95.field1439[var339] == 0 && class95.field1439[var339 + 1] != 0) {
                        int var340 = class95.field1439[var339];
                        var338 = false;
                        class95.field1439[var339] = class95.field1439[var339 + 1];
                        class95.field1439[var339 + 1] = var340;
                        String var341 = class79.field1222[var339];
                        class79.field1222[var339] = class79.field1222[var339 + 1];
                        class79.field1222[var339 + 1] = var341;
                        String var342 = class70.field1089[var339];
                        class70.field1089[var339] = class70.field1089[var339 + 1];
                        class70.field1089[var339 + 1] = var342;
                        long var343 = class95.field1452[var339];
                        class95.field1452[var339] = class95.field1452[var339 + 1];
                        class95.field1452[var339 + 1] = var343;
                        int var345 = class35.field498[var339];
                        class35.field498[var339] = class35.field498[var339 + 1];
                        class35.field498[var339 + 1] = var345;
                        boolean var346 = class152.field2194[var339];
                        class152.field2194[var339] = class152.field2194[var339 + 1];
                        class152.field2194[var339 + 1] = var346;
                    }
                }
                if (var338) {
                    break;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 100) {
            int var347 = class68.field1071.method746((byte) -92);
            int var348 = class68.field1071.method756(-29901);
            int var349 = class68.field1071.method756(-29901);
            if (class42.method289(var348, true)) {
                class103.field1535 = var347;
                class245.field3667 = var349;
                if (class68.field1069 == 2) {
                    class30.field439 = class245.field3667;
                    class146.field2097 = class103.field1535;
                }
                class100.method671(-123);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 226) {
            int var350 = class68.field1071.method756(arg0 - 29901);
            int var351 = class68.field1071.method760(false);
            int var352 = class68.field1071.method760(false);
            int var353 = class68.field1071.method756(-29901);
            int var354 = class68.field1071.method760(false);
            int var355 = class68.field1071.method760(false);
            if (class42.method289(var350, true)) {
                class209.method1339(var355, var352, var353, 45, var351, var354);
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 3) {
            int var356 = class68.field1071.method756(-29901);
            if (var356 == 65535) {
                var356 = -1;
            }
            int var357 = class68.field1071.method760(false);
            int var358 = class68.field1071.method756(arg0 - 29901);
            class205.method1322(0, var356, var357, var358);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 98) {
            int var359 = class68.field1071.method756(-29901);
            class55.method371(var359, 0);
            class149.field2128[method1188(class209.field3011++, 31)] = method1188(var359, 32767);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 106) {
            for (int var360 = 0; var360 < class20.field276.length; var360++) {
                if (class43.field616[var360] != class20.field276[var360]) {
                    class20.field276[var360] = class43.field616[var360];
                    class97.method658(7272, var360);
                    class284.field4527[method1188(class115.field1703++, 31)] = var360;
                }
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 57) {
            int var361 = class68.field1071.method756(-29901);
            if (var361 == 65535) {
                var361 = -1;
            }
            int var362 = class68.field1071.method750((byte) 127);
            int var363 = class68.field1071.method782(false);
            String var364 = class68.field1071.method753(-128);
            if (var363 >= 1 && var363 <= 8) {
                if (var364.equalsIgnoreCase("null")) {
                    var364 = null;
                }
                class209.field3010[var363 - 1] = var364;
                class171.field2460[var363 - 1] = var361;
                class168.field2434[var363 - 1] = var362 == 0;
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 74) {
            class66.method450(4660);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 85) {
            int var365 = class68.field1071.method746((byte) -81);
            if (var365 == 65535) {
                var365 = -1;
            }
            class206.method1329(var365, true);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 120) {
            int var366 = class68.field1071.method768((byte) 107);
            int var367 = class68.field1071.method733(false);
            if (var367 == 65535) {
                var367 = -1;
            }
            class193.method1237(var366, (byte) 59, var367);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 55 || class195.field2807 == 25 || class195.field2807 == 68 || class195.field2807 == 29 || class195.field2807 == 93 || class195.field2807 == 241 || class195.field2807 == 229 || class195.field2807 == 94 || class195.field2807 == 103 || class195.field2807 == 179 || class195.field2807 == 36 || class195.field2807 == 140 || class195.field2807 == 110) {
            class146.method980(7);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 203) {
            int var368 = class68.field1071.method756(-29901);
            int var369 = class68.field1071.method760(false);
            int var370 = class68.field1071.method760(false);
            int var371 = class68.field1071.method760(false);
            int var372 = class68.field1071.method760(false);
            int var373 = class68.field1071.method756(-29901);
            if (class42.method289(var368, true)) {
                class14.field215[var369] = true;
                class86.field1327[var369] = var370;
                class234.field3521[var369] = var371;
                class221.field3265[var369] = var372;
                class194.field2780[var369] = var373;
            }
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 4) {
            class175.field2486 = class68.field1071.method760(false);
            class114.field1692 = class68.field1071.method760(false);
            class264.field3989 = class68.field1071.method760(false);
            class195.field2807 = -1;
            return true;
        } else if (class195.field2807 == 214) {
            class234.field3536 = class68.field1071.method757(-1380156360) * 30;
            class108.field1559 = class213.field3063;
            class195.field2807 = -1;
            return true;
        } else {
            class37.method259(-124, "T1 - " + class195.field2807 + "," + class104.field1545 + "," + class211.field3039 + " - " + class7.field140, (Throwable) null);
            class178.method1157(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lkl;Z)V")
    public final void method1191(class114 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                if (arg1) {
                    field2627 = null;
                }
                field2625++;
                return;
            }
            this.method1189(16422, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
    public static void method1192(boolean arg0) {
        field2627 = null;
        field2635 = null;
        field2626 = null;
        if (arg0) {
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method1193(int arg0, int arg1, boolean arg2) {
        field2633++;
        if (arg1 != -31596) {
            field2631 = null;
        }
        return arg2 && arg0 >= 0 ? class15.method117(arg0, 10, arg2, -1) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method1194(int arg0, String arg1, byte arg2) {
        field2624++;
        if (this.field2628 == null) {
            return arg1;
        }
        if (arg2 != -98) {
            field2620 = 36;
        }
        class171 var4 = (class171) this.field2628.method1218((long) arg0, arg2 + 78);
        return var4 == null ? arg1 : var4.field2459;
    }
}
