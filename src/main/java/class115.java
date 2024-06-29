import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 extends class45 {

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "[Ls;")
    public class124[] field2889;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lkd;")
    public static class73 field2890 = class126.method1070((byte) -66, "logo");

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lkd;")
    public static class73 field2898 = class126.method1070((byte) -66, "mod_icons");

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lta;")
    public static class131 field2894 = new class131(4096);

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "Lkd;")
    public static class73 field2902 = class126.method1070((byte) -66, "Hierhin gehen");

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2901 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "Lkd;")
    public static class73 field2905 = class126.method1070((byte) -66, "Fps:");

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "Ltc;")
    public static class133 field2903 = new class133();

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    public static int field2906 = 1;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "Lkd;")
    public static class73 field2908 = class126.method1070((byte) -66, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "[I")
    public static int[] field2909 = new int[2000];

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Lde;")
    public static class27 field2887;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "[Lpb;")
    public static class106[] field2891;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILkd;)Z")
    public static final boolean method978(int arg0, class73 arg1) {
        field2893++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 < 79) {
            field2909 = null;
        }
        while (var2 < class14.field431) {
            if (arg1.method615(class137.field3424[var2], 60)) {
                return true;
            }
            var2++;
        }
        return arg1.method615(class73.field1901.field3025, 60);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLa;)Z")
    public static final boolean method979(boolean arg0, class1 arg1) {
        field2895++;
        if (!arg0) {
            method979(false, null);
        }
        if (arg1.field132 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field132.length; var2++) {
            int var3 = class149.method1192(var2, arg1, 0);
            int var4 = arg1.field106[var2];
            if (arg1.field132[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field132[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field132[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)V")
    public static final void method980(int arg0, byte arg1) {
        class53.field1416 = arg0;
        if (arg1 != -45) {
            return;
        }
        class104.field2591 = null;
        class15.field474 = false;
        class31.field870 = -1;
        field2892++;
        class38.field1041 = -1;
        class26.field754 = 1;
        class142.field3548 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2894 = null;
        field2891 = null;
        field2901 = null;
        field2898 = null;
        field2905 = null;
        int var1 = 24 % ((37 - arg0) / 53);
        field2908 = null;
        field2909 = null;
        field2890 = null;
        field2902 = null;
        field2887 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Z")
    public final boolean method982(boolean arg0, int arg1) {
        field2900++;
        if (arg0) {
            method979(false, null);
        }
        return this.field2889[arg1].field3158;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public static final void method983(int arg0, int arg1) {
        field2896++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class118.field3013[arg1];
        int var3 = class76.field1946[arg1];
        int var4 = class74.field1921[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class14.field429[arg1];
        if (class2.field146 != 0 && var4 != 1002) {
            class132.field3304 = true;
            class2.field146 = 0;
        }
        if (var4 == 23) {
            class62.method521(var2, var5, var3, -5419);
        }
        if (var4 == 32) {
            class20.method164(var5, (byte) 118, var3, var2);
            class137.field3423++;
            class121.field3079.method1215(102, 130);
            class121.field3079.method965(class121.field3093 + var3, 102);
            class121.field3079.method936(var5 >> 14 & 0x7FFF, (byte) 98);
            class121.field3079.method965(class80.field2029 + var2, arg0 + 121);
        }
        if (arg0 != 0) {
            field2890 = null;
        }
        if (var4 == 7) {
            class2.field145++;
            class121.field3079.method1215(arg0 ^ 0xFFFFFF8F, 196);
            class121.field3079.method926(var3, -9437);
            class121.field3079.method936(var5, (byte) 98);
            class121.field3079.method947(var2, 23661);
            class89.field2225 = var3;
            class70.field1770 = 0;
            class105.field2607 = 2;
            class132.field3309 = var2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 6 && class20.method164(var5, (byte) 113, var3, var2)) {
            class121.field3079.method1215(111, 178);
            class82.field2078++;
            class121.field3079.method965(class57.field1525, 114);
            class121.field3079.method965(class44.field1163, 101);
            class121.field3079.method932((byte) -56, class70.field1775);
            class121.field3079.method928(631685288, var5 >> 14 & 0x7FFF);
            class121.field3079.method947(class121.field3093 + var3, 23661);
            class121.field3079.method928(arg0 ^ 0x25A6C0A8, var2 + class80.field2029);
        }
        if (var4 == 1004) {
            class87.field2196 = 2;
            class111.field2735 = 0;
            class74.field1918 = class42.field1134;
            class122.field3122 = class103.field2570;
            class9 var6 = class133.field3345[var5];
            if (var6 != null) {
                class28 var7 = var6.field301;
                if (var7.field801 != null) {
                    var7 = var7.method216(-1);
                }
                if (var7 != null) {
                    class143.field3570++;
                    class121.field3079.method1215(-122, 46);
                    class121.field3079.method928(631685288, var7.field790);
                }
            }
        }
        if (var4 == 27) {
            class9 var8 = class133.field3345[var5];
            if (var8 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var8.field2304[0], var8.field2280[0], 0, 1, false);
                class87.field2196 = 2;
                class122.field3122 = class103.field2570;
                class83.field2093++;
                class111.field2735 = 0;
                class74.field1918 = class42.field1134;
                class121.field3079.method1215(119, 32);
                class121.field3079.method936(var5, (byte) 98);
            }
        }
        if (var4 == 4) {
            class121.field3079.method1215(arg0 ^ 0x6F, 21);
            class121.field3079.method928(631685288, var2);
            class114.field2855++;
            class121.field3079.method937(arg0 - 1370716840, var3);
            class121.field3079.method936(var5, (byte) 98);
            class132.field3309 = var2;
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            class70.field1770 = 0;
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
            class89.field2225 = var3;
        }
        if (var4 == 29) {
            class73 var9 = class54.field1440[arg1];
            int var10 = var9.method623(arg0 - 1893532698, client.field615);
            if (var10 != -1) {
                int var11 = -1;
                long var12 = var9.method638(var10 + 12, 4).method640(-123).method643(255);
                for (int var14 = 0; var14 < class14.field431; var14++) {
                    if (class49.field1305[var14] == var12) {
                        var11 = var14;
                        break;
                    }
                }
                if (var11 != -1 && class16.field497[var11] > 0) {
                    class132.field3304 = true;
                    class72.field1837 = 3;
                    class104.field2603 = true;
                    class2.field146 = 0;
                    class9.field299 = class9.field298;
                    class70.field1783 = class49.field1305[var11];
                    class9.field316 = class32.method258(-84, new class73[] { class107.field2647, class137.field3424[var11] });
                }
            }
        }
        if (var4 == 13) {
            class118 var15 = class42.field1141[var5];
            if (var15 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var15.field2304[0], var15.field2280[0], 0, 1, false);
                class122.field3122 = class103.field2570;
                class74.field1918 = class42.field1134;
                class87.field2196 = 2;
                class111.field2735 = 0;
                class12.field384++;
                class121.field3079.method1215(arg0 - 83, 57);
                class121.field3079.method928(631685288, var5);
            }
        }
        if (var4 == 38) {
            class34.field962++;
            class121.field3079.method1215(-100, 41);
            class121.field3079.method928(631685288, var2);
            class121.field3079.method937(-1370716840, var3);
            class121.field3079.method947(var5, 23661);
            class70.field1770 = 0;
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
            class89.field2225 = var3;
            class132.field3309 = var2;
        }
        if (var4 == 19) {
            class26.method205((byte) -52);
            class44.field1163 = var5;
            class103.field2567 = 1;
            class57.field1525 = var2;
            class70.field1775 = var3;
            class38.field1028 = true;
            class5.field192 = class32.method258(-88, new class73[] { class131.field3299, class9.method86(var5, (byte) 119).field3220, client.field615 });
            if (class5.field192 == null) {
                class5.field192 = class18.field525;
            }
            return;
        }
        if (var4 == 28) {
            class118 var16 = class42.field1141[var5];
            if (var16 != null) {
                class60.field1582++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var16.field2304[0], var16.field2280[0], 0, 1, false);
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class111.field2735 = 0;
                class74.field1918 = class42.field1134;
                class121.field3079.method1215(104, 60);
                class121.field3079.method951(arg0 ^ 0x73BE, class70.field1775);
                class121.field3079.method936(class44.field1163, (byte) 98);
                class121.field3079.method936(class57.field1525, (byte) 98);
                class121.field3079.method947(var5, 23661);
            }
        }
        if (var4 == 57) {
            boolean var17 = true;
            class1 var18 = class45.method335(var3, -66);
            if (var18.field84 > 0) {
                var17 = class71.method593(-19725, var18);
            }
            if (var17) {
                class80.field2016++;
                class121.field3079.method1215(-101, 67);
                class121.field3079.method937(-1370716840, var3);
            }
        }
        if (var4 == 3) {
            class118 var19 = class42.field1141[var5];
            if (var19 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], arg0 - 1, 2, var19.field2304[0], var19.field2280[0], 0, 1, false);
                class3.field165++;
                class74.field1918 = class42.field1134;
                class111.field2735 = 0;
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class121.field3079.method1215(102, 136);
                class121.field3079.method965(var5, arg0 ^ 0x67);
            }
        }
        if (var4 == 10) {
            boolean var20 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 0, false);
            class16.field479++;
            if (!var20) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 1, false);
            }
            class74.field1918 = class42.field1134;
            class111.field2735 = 0;
            class122.field3122 = class103.field2570;
            class87.field2196 = 2;
            class121.field3079.method1215(124, 186);
            class121.field3079.method928(631685288, var2 + class80.field2029);
            class121.field3079.method965(var5, 119);
            class121.field3079.method936(class121.field3093 + var3, (byte) 98);
        }
        if (var4 == 5) {
            class80.field2016++;
            class121.field3079.method1215(124, 67);
            class121.field3079.method937(-1370716840, var3);
            class1 var22 = class45.method335(var3, -108);
            if (var22.field62 != null && var22.field62[0][0] == 5) {
                int var23 = var22.field62[0][1];
                if (class48.field1299[var23] != var22.field106[0]) {
                    class48.field1299[var23] = var22.field106[0];
                    class25.method201(15529, var23);
                    class38.field1028 = true;
                }
            }
        }
        if (var4 == 48) {
            if (class15.field459) {
                class34.field923.method51(class11.field320, var2 - 4, var3 - 4);
            } else {
                class34.field923.method51(class11.field320, class103.field2570 - 4, class42.field1134 + -4);
            }
        }
        if (var4 == 36) {
            class118 var24 = class42.field1141[var5];
            if (var24 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var24.field2304[0], var24.field2280[0], 0, 1, false);
                class122.field3122 = class103.field2570;
                class81.field2040++;
                class87.field2196 = 2;
                class74.field1918 = class42.field1134;
                class111.field2735 = 0;
                class121.field3079.method1215(-124, 6);
                class121.field3079.method965(var5, 107);
            }
        }
        if (var4 == 43) {
            class63.field1646++;
            boolean var25 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 0, false);
            if (!var25) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], arg0 - 1, 2, var2, var3, 0, 1, false);
            }
            class122.field3122 = class103.field2570;
            class87.field2196 = 2;
            class111.field2735 = 0;
            class74.field1918 = class42.field1134;
            class121.field3079.method1215(104, 83);
            class121.field3079.method928(631685288, var5);
            class121.field3079.method936(class80.field2029 + var2, (byte) 98);
            class121.field3079.method947(class121.field3093 + var3, 23661);
            class121.field3079.method951(29630, class145.field3592);
            class121.field3079.method928(631685288, class86.field2176);
        }
        if (var4 == 1) {
            class121.field3079.method1215(-55, 99);
            class121.field3079.method936(var2, (byte) 98);
            class121.field3079.method937(-1370716840, var3);
            class105.field2608++;
            class121.field3079.method965(var5, 100);
            class105.field2607 = 2;
            class89.field2225 = var3;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            class70.field1770 = 0;
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
            class132.field3309 = var2;
        }
        if (var4 == 24) {
            field2897++;
            class121.field3079.method1215(101, 149);
            class121.field3079.method928(631685288, var5);
            class121.field3079.method937(-1370716840, var3);
            class121.field3079.method947(var2, arg0 + 23661);
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
            class89.field2225 = var3;
            class70.field1770 = 0;
            class132.field3309 = var2;
        }
        if (var4 == 1006) {
            class32.field885++;
            class20.method164(var5, (byte) 123, var3, var2);
            class121.field3079.method1215(123, 233);
            class121.field3079.method965(var5 >> 14 & 0x7FFF, arg0 ^ 0x5F);
            class121.field3079.method965(var3 + class121.field3093, 114);
            class121.field3079.method965(var2 + class80.field2029, 103);
        }
        if (var4 == 11) {
            class53.field1417++;
            boolean var27 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], ~arg0, 2, var2, var3, 0, 0, false);
            if (!var27) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 1, false);
            }
            class122.field3122 = class103.field2570;
            class87.field2196 = 2;
            class74.field1918 = class42.field1134;
            class111.field2735 = 0;
            class121.field3079.method1215(-125, 193);
            class121.field3079.method928(631685288, class121.field3093 + var3);
            class121.field3079.method965(class80.field2029 + var2, 118);
            class121.field3079.method928(631685288, var5);
        }
        if (var4 == 41) {
            class9 var29 = class133.field3345[var5];
            if (var29 != null) {
                class60.field1581++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var29.field2304[0], var29.field2280[0], 0, 1, false);
                class111.field2735 = 0;
                class74.field1918 = class42.field1134;
                class87.field2196 = 2;
                class122.field3122 = class103.field2570;
                class121.field3079.method1215(104, 94);
                class121.field3079.method936(var5, (byte) 98);
                class121.field3079.method965(class86.field2176, 101);
                class121.field3079.method937(arg0 - 1370716840, class145.field3592);
            }
        }
        if (var4 == 26 || var4 == 33) {
            class73 var30 = class54.field1440[arg1];
            int var31 = var30.method623(arg0 - 1893532698, client.field615);
            if (var31 != -1) {
                class73 var32 = var30.method638(var31 + 12, arg0 ^ 0x7C).method640(arg0 ^ 0xFFFFFF85);
                class73 var33 = var32.method609((byte) -107).method610(-91);
                boolean var34 = false;
                for (int var35 = 0; var35 < class63.field1661; var35++) {
                    class118 var36 = class42.field1141[class14.field435[var35]];
                    if (var36 != null && var36.field3025 != null && var36.field3025.method615(var33, 60)) {
                        class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var36.field2304[0], var36.field2280[0], 0, 1, false);
                        if (var4 == 26) {
                            class121.field3079.method1215(97, 136);
                            class3.field165++;
                            class121.field3079.method965(class14.field435[var35], 93);
                        }
                        if (var4 == 33) {
                            class121.field3079.method1215(101, 139);
                            class44.field1170++;
                            class121.field3079.method928(631685288, class14.field435[var35]);
                        }
                        var34 = true;
                        break;
                    }
                }
                if (!var34) {
                    class74.method647((byte) 127, class9.field298, class32.method258(-68, new class73[] { class126.field3232, var33 }), 0);
                }
            }
        }
        if (var4 == 1005) {
            class1 var37 = class45.method335(var3, -97);
            if (var37 == null || var37.field92[var2] < 100000) {
                class61.field1594++;
                class121.field3079.method1215(-55, 33);
                class121.field3079.method936(var5, (byte) 98);
            } else {
                class74.method647((byte) 124, class9.field298, class32.method258(arg0 ^ 0xFFFFFFAF, new class73[] { class78.method676(var37.field92[var2], -121), class58.field1545, class9.method86(var5, (byte) -97).field3220 }), 0);
            }
            class105.field2607 = 2;
            class89.field2225 = var3;
            class70.field1770 = 0;
            class132.field3309 = var2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 40) {
            class129.field3258++;
            class121.field3079.method1215(-79, 43);
            class121.field3079.method965(var2, arg0 + 110);
            class121.field3079.method965(var5, 94);
            class121.field3079.method936(class44.field1163, (byte) 98);
            class121.field3079.method951(29630, var3);
            class121.field3079.method926(class70.field1775, -9437);
            class121.field3079.method947(class57.field1525, 23661);
            class89.field2225 = var3;
            class70.field1770 = 0;
            class132.field3309 = var2;
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 14) {
            class20.method164(var5, (byte) 91, var3, var2);
            class121.field3079.method1215(arg0 - 53, 185);
            class121.field3079.method947(var5 >> 14 & 0x7FFF, 23661);
            class133.field3327++;
            class121.field3079.method947(class80.field2029 + var2, 23661);
            class121.field3079.method965(var3 + class121.field3093, 93);
        }
        if (var4 == 22) {
            class121.field3079.method1215(-37, 102);
            class47.field1235++;
            class121.field3079.method928(631685288, var5);
            class121.field3079.method928(631685288, var2);
            class121.field3079.method926(var3, -9437);
            class132.field3309 = var2;
            class70.field1770 = 0;
            class105.field2607 = 2;
            class89.field2225 = var3;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 47) {
            class20.method164(var5, (byte) -96, var3, var2);
            class22.field634++;
            class121.field3079.method1215(111, 183);
            class121.field3079.method936(class121.field3093 + var3, (byte) 98);
            class121.field3079.method936(var5 >> 14 & 0x7FFF, (byte) 98);
            class121.field3079.method947(class80.field2029 + var2, 23661);
        }
        if (var4 == 8) {
            class73 var38 = class54.field1440[arg1];
            int var39 = var38.method623(-1893532698, client.field615);
            if (var39 != -1) {
                if (class52.field1393 == -1) {
                    client.method181((byte) 3);
                    if (class86.field2169 != -1) {
                        class9.field312 = var38.method638(var39 + 12, 127).method640(-123);
                        class50.field1316 = false;
                        class57.field1529 = class52.field1393 = class86.field2169;
                    }
                } else {
                    class74.method647((byte) -45, class9.field298, class121.field3094, 0);
                    if (class24.field695 != null) {
                        class74.method647((byte) 124, class9.field298, class24.field695, 0);
                    }
                }
            }
        }
        if (var4 == 45) {
            class118 var40 = class42.field1141[var5];
            if (var40 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var40.field2304[0], var40.field2280[0], 0, 1, false);
                class150.field3726++;
                class74.field1918 = class42.field1134;
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class111.field2735 = 0;
                class121.field3079.method1215(arg0 ^ 0xFFFFFFC2, 121);
                class121.field3079.method936(var5, (byte) 98);
            }
        }
        if (var4 == 15) {
            class80.field2016++;
            class121.field3079.method1215(-126, 67);
            class121.field3079.method937(-1370716840, var3);
            class1 var41 = class45.method335(var3, arg0 - 76);
            if (var41.field62 != null && var41.field62[0][0] == 5) {
                int var42 = var41.field62[0][1];
                class48.field1299[var42] = 1 - class48.field1299[var42];
                class25.method201(15529, var42);
                class38.field1028 = true;
            }
        }
        if (var4 == 16) {
            boolean var43 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], ~arg0, 2, var2, var3, 0, 0, false);
            if (!var43) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], arg0 - 1, 2, var2, var3, 0, 1, false);
            }
            class87.field2196 = 2;
            class20.field573++;
            class74.field1918 = class42.field1134;
            class122.field3122 = class103.field2570;
            class111.field2735 = 0;
            class121.field3079.method1215(arg0 ^ 0x73, 126);
            class121.field3079.method965(var5, 108);
            class121.field3079.method965(var3 + class121.field3093, arg0 + 117);
            class121.field3079.method947(class80.field2029 + var2, 23661);
        }
        if (var4 == 18) {
            class121.field3079.method1215(99, 84);
            class87.field2208++;
            class121.field3079.method965(var5, 104);
            class121.field3079.method937(arg0 ^ 0xAE4C8558, var3);
            class121.field3079.method947(var2, arg0 + 23661);
            class105.field2607 = 2;
            class89.field2225 = var3;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            class70.field1770 = 0;
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
            class132.field3309 = var2;
        }
        if (var4 == 34) {
            class23.field650++;
            class121.field3079.method1215(arg0 - 67, 219);
            class121.field3079.method965(var5, 103);
            class121.field3079.method965(var2, 117);
            class121.field3079.method951(29630, var3);
            class132.field3309 = var2;
            class105.field2607 = 2;
            class70.field1770 = 0;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            class89.field2225 = var3;
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 39) {
            class20.method164(var5, (byte) 116, var3, var2);
            class109.field2668++;
            class121.field3079.method1215(103, 187);
            class121.field3079.method936(var3 + class121.field3093, (byte) 98);
            class121.field3079.method947(var5 >> 14 & 0x7FFF, arg0 + 23661);
            class121.field3079.method965(class80.field2029 + var2, 92);
        }
        if (var4 == 1001) {
            class62.field1627++;
            class87.field2196 = 2;
            class111.field2735 = 0;
            class122.field3122 = class103.field2570;
            class74.field1918 = class42.field1134;
            class121.field3079.method1215(-44, 54);
            class121.field3079.method928(631685288, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 1003) {
            class74.field1918 = class42.field1134;
            class111.field2735 = 0;
            class61.field1594++;
            class122.field3122 = class103.field2570;
            class87.field2196 = 2;
            class121.field3079.method1215(-88, 33);
            class121.field3079.method936(var5, (byte) 98);
        }
        if (var4 == 37) {
            class104.field2593++;
            class121.field3079.method1215(arg0 ^ 0x7C, 48);
            class121.field3079.method932((byte) -56, var3);
            class121.field3079.method947(var2, 23661);
            class121.field3079.method947(var5, 23661);
            class70.field1770 = 0;
            class89.field2225 = var3;
            class132.field3309 = var2;
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 56) {
            class1 var45 = class34.method269(var3, false, var2);
            if (var45 != null) {
                class26.method205((byte) -52);
                client.method184(class60.method503(class153.method1225(var45, -123), (byte) 32), var2, (byte) -87, var3);
                class103.field2567 = 0;
                class38.field1028 = true;
                class57.field1511 = class77.method665((byte) 48, var45);
                if (class57.field1511 == null) {
                    class57.field1511 = class64.field1682;
                }
                if (var45.field98) {
                    class121.field3102 = class32.method258(arg0 ^ 0xFFFFFFC7, new class73[] { var45.field99, client.field615 });
                } else {
                    class121.field3102 = class32.method258(-99, new class73[] { class84.field2126, var45.field88, client.field615 });
                }
                if (class94.field2392 == 16 && !var45.field98) {
                    class149.field3666 = true;
                    class141.field3523 = 3;
                    class38.field1028 = true;
                }
            }
            return;
        }
        if (var4 == 54) {
            class118 var46 = class42.field1141[var5];
            if (var46 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], ~arg0, 2, var46.field2304[0], var46.field2280[0], 0, 1, false);
                class74.field1918 = class42.field1134;
                class111.field2735 = 0;
                class121.field3086++;
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class121.field3079.method1215(-96, 251);
                class121.field3079.method936(var5, (byte) 98);
                class121.field3079.method936(class86.field2176, (byte) 98);
                class121.field3079.method951(arg0 + 29630, class145.field3592);
            }
        }
        if (var4 == 52) {
            class53.method425(class11.field364, (byte) 71);
            class11.field364 = -1;
            class132.field3304 = true;
        }
        if (var4 == 42) {
            class9 var47 = class133.field3345[var5];
            if (var47 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var47.field2304[0], var47.field2280[0], 0, 1, false);
                class111.field2735 = 0;
                class143.field3559++;
                class87.field2196 = 2;
                class122.field3122 = class103.field2570;
                class74.field1918 = class42.field1134;
                class121.field3079.method1215(arg0 ^ 0xFFFFFF89, 56);
                class121.field3079.method926(class70.field1775, -9437);
                class121.field3079.method965(class44.field1163, 100);
                class121.field3079.method965(var5, 96);
                class121.field3079.method965(class57.field1525, 106);
            }
        }
        if (var4 == 44) {
            class9 var48 = class133.field3345[var5];
            if (var48 != null) {
                class70.field1769++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], ~arg0, 2, var48.field2304[0], var48.field2280[0], 0, 1, false);
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class111.field2735 = 0;
                class74.field1918 = class42.field1134;
                class121.field3079.method1215(arg0 + 112, 111);
                class121.field3079.method936(var5, (byte) 98);
            }
        }
        if (var4 == 46) {
            class9 var49 = class133.field3345[var5];
            if (var49 != null) {
                class72.field1824++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], ~arg0, 2, var49.field2304[0], var49.field2280[0], 0, 1, false);
                class111.field2735 = 0;
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class74.field1918 = class42.field1134;
                class121.field3079.method1215(-125, 106);
                class121.field3079.method947(var5, 23661);
            }
        }
        if (var4 == 31) {
            class70.field1773++;
            class121.field3079.method1215(arg0 ^ 0xFFFFFFC8, 2);
            class121.field3079.method928(631685288, class86.field2176);
            class121.field3079.method928(631685288, var2);
            class121.field3079.method965(var5, 118);
            class121.field3079.method932((byte) -56, var3);
            class121.field3079.method951(29630, class145.field3592);
            class132.field3309 = var2;
            class70.field1770 = 0;
            class105.field2607 = 2;
            class89.field2225 = var3;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 50) {
            class9 var50 = class133.field3345[var5];
            if (var50 != null) {
                class87.field2207++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var50.field2304[0], var50.field2280[0], 0, 1, false);
                class87.field2196 = 2;
                class122.field3122 = class103.field2570;
                class74.field1918 = class42.field1134;
                class111.field2735 = 0;
                class121.field3079.method1215(-85, 86);
                class121.field3079.method947(var5, arg0 ^ 0x5C6D);
            }
        }
        if (var4 == 58) {
            class114.field2815++;
            boolean var51 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], arg0 - 1, 2, var2, var3, 0, 0, false);
            if (!var51) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 1, false);
            }
            class111.field2735 = 0;
            class122.field3122 = class103.field2570;
            class74.field1918 = class42.field1134;
            class87.field2196 = 2;
            class121.field3079.method1215(106, 174);
            class121.field3079.method928(631685288, var5);
            class121.field3079.method947(class80.field2029 + var2, arg0 ^ 0x5C6D);
            class121.field3079.method965(class121.field3093 + var3, 100);
        }
        if (var4 == 20) {
            class125.field3173++;
            boolean var53 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 0, false);
            if (!var53) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 1, false);
            }
            class111.field2735 = 0;
            class74.field1918 = class42.field1134;
            class122.field3122 = class103.field2570;
            class87.field2196 = 2;
            class121.field3079.method1215(-26, 59);
            class121.field3079.method947(class121.field3093 + var3, 23661);
            class121.field3079.method947(class80.field2029 + var2, 23661);
            class121.field3079.method965(var5, 115);
        }
        if (var4 == 35 && class143.field3574 == -1) {
            class114.method952(var3, var2, -14964);
            class143.field3574 = var3;
            class53.field1422 = var2;
        }
        if (var4 == 2) {
            class9 var55 = class133.field3345[var5];
            if (var55 != null) {
                class1.field85++;
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], ~arg0, 2, var55.field2304[0], var55.field2280[0], 0, 1, false);
                class74.field1918 = class42.field1134;
                class111.field2735 = 0;
                class87.field2196 = 2;
                class122.field3122 = class103.field2570;
                class121.field3079.method1215(arg0 - 126, 201);
                class121.field3079.method936(var5, (byte) 98);
            }
        }
        if (var4 == 9) {
            class121.field3079.method1215(arg0 ^ 0xFFFFFF85, 181);
            class121.field3079.method965(var2, arg0 + 95);
            class98.field2446++;
            class121.field3079.method926(var3, -9437);
            class121.field3079.method965(var5, 100);
            class105.field2607 = 2;
            if (var3 >> 16 == class52.field1393) {
                class105.field2607 = 1;
            }
            class70.field1770 = 0;
            class89.field2225 = var3;
            class132.field3309 = var2;
            if (var3 >> 16 == class129.field3246) {
                class105.field2607 = 3;
            }
        }
        if (var4 == 51) {
            class121.field3079.method1215(arg0 ^ 0xFFFFFFCB, 49);
            class121.field3079.method936(class86.field2176, (byte) 98);
            class151.field3741++;
            class121.field3079.method937(-1370716840, var3);
            class121.field3079.method936(var2, (byte) 98);
            class121.field3079.method951(arg0 + 29630, class145.field3592);
        }
        if (var4 == 55) {
            class118 var56 = class42.field1141[var5];
            if (var56 != null) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], -1, 2, var56.field2304[0], var56.field2280[0], 0, 1, false);
                class74.field1918 = class42.field1134;
                class122.field3122 = class103.field2570;
                class87.field2196 = 2;
                class44.field1170++;
                class111.field2735 = 0;
                class121.field3079.method1215(124, 139);
                class121.field3079.method928(631685288, var5);
            }
        }
        if (var4 == 17) {
            class28.field818++;
            boolean var57 = class49.method394(class73.field1901.field2304[0], 0, 0, 0, class73.field1901.field2280[0], -1, 2, var2, var3, 0, 0, false);
            if (!var57) {
                class49.method394(class73.field1901.field2304[0], 0, 0, 1, class73.field1901.field2280[0], arg0 - 1, 2, var2, var3, 0, 1, false);
            }
            class74.field1918 = class42.field1134;
            class87.field2196 = 2;
            class122.field3122 = class103.field2570;
            class111.field2735 = 0;
            class121.field3079.method1215(124, 22);
            class121.field3079.method947(var5, arg0 ^ 0x5C6D);
            class121.field3079.method947(var3 + class121.field3093, 23661);
            class121.field3079.method926(class70.field1775, -9437);
            class121.field3079.method936(class57.field1525, (byte) 98);
            class121.field3079.method965(class44.field1163, arg0 + 121);
            class121.field3079.method965(class80.field2029 + var2, 123);
        }
        if (var4 == 30) {
            client.method181((byte) 3);
        }
        if (var4 == 12 && class20.method164(var5, (byte) -120, var3, var2)) {
            class62.field1618++;
            class121.field3079.method1215(-127, 164);
            class121.field3079.method965(class80.field2029 + var2, 96);
            class121.field3079.method926(class145.field3592, -9437);
            class121.field3079.method965(var5 >> 14 & 0x7FFF, 120);
            class121.field3079.method928(631685288, class121.field3093 + var3);
            class121.field3079.method965(class86.field2176, 113);
        }
        if (var4 == 49 || var4 == 53 || var4 == 21 || var4 == 25) {
            class73 var59 = class54.field1440[arg1];
            int var60 = var59.method623(arg0 - 1893532698, client.field615);
            if (var60 != -1) {
                long var61 = var59.method638(var60 + 12, arg0 ^ 0xFFFFFFEC).method640(-123).method643(255);
                if (var4 == 49) {
                    class55.method440(-12459, var61);
                }
                if (var4 == 53) {
                    class110.method880(var61, arg0 ^ 0xFFFFFFA2);
                }
                if (var4 == 21) {
                    class20.method162((byte) -119, var61);
                }
                if (var4 == 25) {
                    class141.method1153(var61, false);
                }
            }
        }
        if (class103.field2567 != 0) {
            class38.field1028 = true;
            class103.field2567 = 0;
        }
        if (class50.field1329) {
            class26.method205((byte) -52);
            class38.field1028 = true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBIIII)V")
    public static final void method984(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2899++;
        if (class9.field303 == arg0 && class146.field3598 == arg3 && (class110.field2694 == arg5 || !class77.field1971)) {
            return;
        }
        class110.field2694 = arg5;
        class146.field3598 = arg3;
        class9.field303 = arg0;
        if (!class77.field1971) {
            class110.field2694 = 0;
        }
        class45.method337(25, (byte) -73);
        class11.method97(class137.field3406, false, false, null);
        int var6 = class121.field3093;
        int var7 = class80.field2029;
        class80.field2029 = arg0 * 8 - 48;
        class121.field3093 = arg3 * 8 - 48;
        int var8 = class121.field3093 - var6;
        int var9 = class80.field2029 - var7;
        int var10 = class121.field3093;
        int var11 = class80.field2029;
        for (int var12 = 0; var12 < 32768; var12++) {
            class9 var28 = class133.field3345[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2304[var29] -= var9;
                    var28.field2280[var29] -= var8;
                }
                var28.field2264 -= var8 * 128;
                var28.field2277 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class118 var26 = class42.field1141[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2304[var27] -= var9;
                    var26.field2280[var27] -= var8;
                }
                var26.field2264 -= var8 * 128;
                var26.field2277 -= var9 * 128;
            }
        }
        class11.field320 = arg5;
        byte var14 = 104;
        class73.field1901.method747(961, arg4, arg2, false);
        byte var15 = 0;
        byte var16 = 1;
        if (var9 < 0) {
            var14 = -1;
            var16 = -1;
            var15 = 103;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var9 + var20;
                int var24 = var22 + var8;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class118.field3019[var25][var20][var22] = class118.field3019[var25][var23][var24];
                    } else {
                        class118.field3019[var25][var20][var22] = null;
                    }
                }
            }
        }
        if (arg1 > -85) {
            method980(120, (byte) -96);
        }
        for (class132 var21 = (class132) class112.field2790.method514((byte) -79); var21 != null; var21 = (class132) class112.field2790.method517(-61)) {
            var21.field3314 -= var9;
            var21.field3301 -= var8;
            if (var21.field3314 < 0 || var21.field3301 < 0 || var21.field3314 >= 104 || var21.field3301 >= 104) {
                var21.method1147((byte) -50);
            }
        }
        if (class38.field1037 != 0) {
            class34.field925 -= var8;
            class38.field1037 -= var9;
        }
        class31.field873 = false;
        class137.field3420 = -1;
        class62.field1635 = 0;
        class58.field1538.method509((byte) 81);
        class92.field2371.method509((byte) 81);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lq;Lq;IZ)V")
    public class115(class111 arg0, class111 arg1, int arg2, boolean arg3) {
        class61 var5 = new class61();
        int var6 = arg0.method889(-1, arg2);
        this.field2889 = new class124[var6];
        int[] var7 = arg0.method896((byte) 123, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method898((byte) -47, var7[var8], arg2);
            class86 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class86 var12 = (class86) var5.method514((byte) -79); var12 != null; var12 = (class86) var5.method517(-93)) {
                if (var12.field2173 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method890((byte) 121, 0, var11);
                } else {
                    var13 = arg1.method890((byte) 123, var11, 0);
                }
                var10 = new class86(var11, var13);
                var5.method519(var10, 13017);
            }
            this.field2889[var7[var8]] = new class124(var9, var10);
        }
    }
}
