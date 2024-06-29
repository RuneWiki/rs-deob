import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class149 extends class232 {

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    private int field2528 = 4096;

    @OriginalMember(owner = "client!km", name = "fb", descriptor = "I")
    private int field2541 = 4096;

    @OriginalMember(owner = "client!km", name = "eb", descriptor = "I")
    private int field2540 = 4096;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "Lhi;")
    public static class82 field2531 = class95.method664((byte) -59, "Card:");

    @OriginalMember(owner = "client!km", name = "W", descriptor = "[J")
    public static long[] field2532 = new long[32];

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "Lhi;")
    public static class82 field2535 = class95.method664((byte) -61, "(U0a )2 in: ");

    @OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "Lhn;")
    public static class317 field2525 = new class317(50);

    @OriginalMember(owner = "client!km", name = "hb", descriptor = "Lhi;")
    public static class82 field2543 = class95.method664((byte) -31, "ul");

    @OriginalMember(owner = "client!km", name = "ib", descriptor = "Lhi;")
    public static class82 field2544 = class95.method664((byte) -68, "rouge:");

    @OriginalMember(owner = "client!km", name = "jb", descriptor = "[I")
    public static int[] field2545 = new int[1000];

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!km", name = "bb", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!km", name = "cb", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!km", name = "db", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!km", name = "gb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "[I")
    public static int[] field2526;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 10)
    public class149() {
        super(1, false);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method1028(boolean arg0) {
        field2533++;
        class91.field1635.method2172(arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBLbc;)V", line = 42)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field2534++;
        if (arg1 != -19) {
            method1031(61);
        }
        if (arg0 == 0) {
            this.field2541 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field2540 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field2528 = arg2.method1090(false);
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V", line = 86)
    public static final void method1029(int arg0, int arg1) {
        field2529++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class262.field4486[arg1];
        int var3 = class28.field375[arg1];
        int var4 = (int) class40.field694[arg1];
        int var5 = class135.field2333[arg1];
        long var6 = class40.field694[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 35) {
            class43.field751++;
            boolean var8 = class55.method384(0, 2, 0, false, 0, var3, (byte) -121, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
            if (!var8) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -124, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            }
            class45.field774 = class255.field4394;
            class43.field758 = class166.field2904;
            class233.field4049 = 0;
            class193.field3277 = 2;
            class61.field957.method1504(67, arg0);
            class61.field957.method1069(class217.field3778, 877369544);
            class61.field957.method1069(class226.field3916 + var3, 877369544);
            class61.field957.method1046(class110.field1974, -29);
            class61.field957.method1071(-28182, var4);
            class61.field957.method1069(class230.field3976 + var2, arg0 + 877369545);
            class61.field957.method1071(-28182, class293.field4916);
        }
        if (var5 == 6) {
            class81 var10 = class29.field405[var4];
            if (var10 != null) {
                class55.method384(0, 2, 0, false, 1, var10.field1720[0], (byte) -110, 0, var10.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class233.field4049 = 0;
                class181.field3088++;
                class193.field3277 = 2;
                class61.field957.method1504(181, arg0);
                class61.field957.method1069(class293.field4916, 877369544);
                class61.field957.method1046(class110.field1974, arg0 - 65);
                class61.field957.method1071(-28182, var4);
                class61.field957.method1070(class217.field3778, (byte) -69);
            }
        }
        if (var5 == 4) {
            class61.field957.method1504(95, -1);
            class61.field957.method1046(var3, -13);
            class273.field4597++;
            class61.field957.method1070(var4, (byte) 39);
            class61.field957.method1070(var2, (byte) -74);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 1002) {
            class193.field3277 = 2;
            class233.field4049 = 0;
            class45.field774 = class255.field4394;
            class153.field2645++;
            class43.field758 = class166.field2904;
            class61.field957.method1504(245, -1);
            class61.field957.method1102((byte) -24, var4);
        }
        if (var5 == 9) {
            class61.field957.method1504(208, -1);
            class61.field957.method1071(-28182, var4);
            class244.field4240++;
            class61.field957.method1102((byte) -117, var2);
            class61.field957.method1053(var3, (byte) 119);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 22) {
            class200.field3428++;
            class25.method161(var2, var6, -65, var3);
            class61.field957.method1504(23, -1);
            class61.field957.method1102((byte) -81, class230.field3976 + var2);
            class61.field957.method1102((byte) -86, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class61.field957.method1069(class226.field3916 + var3, 877369544);
        }
        if (var5 == 46) {
            class312.field5397++;
            class61.field957.method1504(214, -1);
            class61.field957.method1065(178808912, var3);
            class61.field957.method1102((byte) -16, var4);
            class61.field957.method1102((byte) -61, var2);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 37) {
            class104.method719(true);
        }
        if (var5 == 60) {
            class81 var11 = class29.field405[var4];
            if (var11 != null) {
                class55.method384(0, 2, 0, false, 1, var11.field1720[0], (byte) -84, 0, var11.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class113.field2037++;
                class45.field774 = class255.field4394;
                class193.field3277 = 2;
                class233.field4049 = 0;
                class43.field758 = class166.field2904;
                class61.field957.method1504(224, -1);
                class61.field957.method1102((byte) -32, var4);
            }
        }
        if (var5 == 42 && class25.method161(var2, var6, -35, var3)) {
            class163.field2848++;
            class61.field957.method1504(141, -1);
            class61.field957.method1102((byte) -115, class293.field4916);
            class61.field957.method1070(class217.field3778, (byte) 61);
            class61.field957.method1102((byte) -127, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class61.field957.method1053(class110.field1974, (byte) 102);
            class61.field957.method1102((byte) -27, class230.field3976 + var2);
            class61.field957.method1071(arg0 ^ 0x6E15, class226.field3916 + var3);
        }
        if (var5 == 23) {
            class126.field2224++;
            if (class22.field307 == 1) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -119, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            } else {
                boolean var12 = class55.method384(0, 2, 0, false, 0, var3, (byte) -116, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                if (!var12) {
                    class55.method384(0, 2, 0, false, 1, var3, (byte) -97, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                }
            }
            class193.field3277 = 2;
            class45.field774 = class255.field4394;
            class233.field4049 = 0;
            class43.field758 = class166.field2904;
            class61.field957.method1504(33, -1);
            class61.field957.method1070(var4, (byte) 56);
            class61.field957.method1069(class230.field3976 + var2, 877369544);
            class61.field957.method1069(var3 + class226.field3916, 877369544);
        }
        if (var5 == 12) {
            class61.field957.method1504(119, -1);
            class300.field5091++;
            class61.field957.method1102((byte) -95, var2);
            class61.field957.method1069(var4, 877369544);
            class61.field957.method1046(var3, -113);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 28) {
            class61.field957.method1504(53, -1);
            class32.field483++;
            class61.field957.method1046(class65.field1016, -89);
            class61.field957.method1046(var3, -66);
            class61.field957.method1070(var2, (byte) -61);
            class61.field957.method1070(class15.field133, (byte) -123);
        }
        if (var5 == 14) {
            if (var4 == 0) {
                class66.field1029 = true;
                class247.method1765(class297.field5058, var2, var3);
            } else if (class323.field5545 > 0 && class19.field235[82] && class19.field235[81]) {
                class100.method683(class230.field3976 + var2, class297.field5058, class226.field3916 + var3, true);
            } else {
                class160.field2786++;
                class61.field957.method1504(36, -1);
                class61.field957.method1070(class230.field3976 + var2, (byte) 42);
                class61.field957.method1069(class226.field3916 + var3, 877369544);
            }
        }
        if (var5 == 1003) {
            class75 var14 = class282.method1965(var3, (byte) 6);
            if (var14 == null || var14.field1144[var2] < 100000) {
                class61.field957.method1504(133, -1);
                class61.field957.method1069(var4, 877369544);
                class99.field1780++;
            } else {
                class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { class327.method2240((byte) -74, var14.field1144[var2]), class272.field4589, class273.method1912(var4, -103).field5364 }), 4);
            }
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 29) {
            class275 var15 = class99.field1777[var4];
            if (var15 != null) {
                class55.method384(0, 2, 0, false, 1, var15.field1720[0], (byte) -96, 0, var15.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class193.field3277 = 2;
                class233.field4049 = 0;
                class64.field987++;
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class61.field957.method1504(19, -1);
                class61.field957.method1071(-28182, var4);
            }
        }
        if (var5 == 33) {
            class81 var16 = class29.field405[var4];
            if (var16 != null) {
                class327.field5596++;
                class55.method384(0, 2, 0, false, 1, var16.field1720[0], (byte) -115, 0, var16.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class43.field758 = class166.field2904;
                class193.field3277 = 2;
                class45.field774 = class255.field4394;
                class233.field4049 = 0;
                class61.field957.method1504(54, arg0 ^ 0x0);
                class61.field957.method1102((byte) -62, var4);
            }
        }
        if (var5 == 45 || var5 == 1005) {
            class111.method769(var3, arg0 + 64, var4, class157.field2727[arg1], var2);
        }
        if (var5 == 1) {
            class275 var17 = class99.field1777[var4];
            if (var17 != null) {
                class38.field645++;
                class55.method384(0, 2, 0, false, 1, var17.field1720[0], (byte) -119, 0, var17.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class233.field4049 = 0;
                class193.field3277 = 2;
                class43.field758 = class166.field2904;
                class45.field774 = class255.field4394;
                class61.field957.method1504(129, -1);
                class61.field957.method1053(class110.field1974, (byte) 122);
                class61.field957.method1069(class217.field3778, 877369544);
                class61.field957.method1069(class293.field4916, arg0 ^ 0xCBB46737);
                class61.field957.method1071(arg0 ^ 0x6E15, var4);
            }
        }
        if (var5 == 8) {
            class293.method2019(98);
            class75 var18 = class282.method1965(var3, (byte) 6);
            class217.field3778 = var2;
            class293.field4916 = var4;
            class110.field1974 = var3;
            class271.field4578 = 1;
            class138.method937(var18, 16);
            class321.field5537 = class29.method182(-6039, new class82[] { class31.field466, class273.method1912(var4, -66).field5364, class281.field4718 });
            if (class321.field5537 == null) {
                class321.field5537 = class143.field2438;
            }
            return;
        }
        if (var5 == 11) {
            class61.field957.method1504(139, -1);
            class61.field957.method1069(var2, 877369544);
            class61.field957.method1099(var3, true);
            class288.field4835++;
            class61.field957.method1102((byte) -55, var4);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 17) {
            class61.field957.method1504(58, -1);
            class17.field184++;
            class61.field957.method1065(178808912, var3);
            class75 var19 = class282.method1965(var3, (byte) 6);
            if (var19.field1152 != null && var19.field1152[0][0] == 5) {
                int var20 = var19.field1152[0][1];
                class312.field5398[var20] = 1 - class312.field5398[var20];
                class181.method1265(var20, (byte) 96);
            }
        }
        if (var5 == 47) {
            if (var4 == 0) {
                class207.field3610 = true;
                class247.method1765(class297.field5058, var2, var3);
            } else if (var4 == 1) {
                class61.field957.method1504(229, arg0 ^ 0x0);
                class61.field957.method1070(class15.field133, (byte) -126);
                class15.field129++;
                class61.field957.method1070(class230.field3976 + var2, (byte) -115);
                class61.field957.method1069(class226.field3916 + var3, 877369544);
                class61.field957.method1065(178808912, class65.field1016);
            }
        }
        if (var5 == 25) {
            class81 var21 = class29.field405[var4];
            if (var21 != null) {
                class55.method384(0, 2, 0, false, 1, var21.field1720[0], (byte) -101, 0, var21.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class249.field4300++;
                class45.field774 = class255.field4394;
                class193.field3277 = 2;
                class43.field758 = class166.field2904;
                class233.field4049 = 0;
                class61.field957.method1504(226, -1);
                class61.field957.method1099(class65.field1016, true);
                class61.field957.method1102((byte) -48, var4);
                class61.field957.method1069(class15.field133, 877369544);
            }
        }
        if (var5 == 58) {
            class275 var22 = class99.field1777[var4];
            if (var22 != null) {
                class55.method384(0, 2, 0, false, 1, var22.field1720[0], (byte) -118, 0, var22.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class43.field758 = class166.field2904;
                class64.field988++;
                class45.field774 = class255.field4394;
                class233.field4049 = 0;
                class193.field3277 = 2;
                class61.field957.method1504(81, -1);
                class61.field957.method1069(var4, 877369544);
                class61.field957.method1070(class15.field133, (byte) 40);
                class61.field957.method1099(class65.field1016, true);
            }
        }
        if (var5 == 13) {
            class308.field5243++;
            if (class22.field307 == 1) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -107, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            } else {
                boolean var23 = class55.method384(0, 2, 0, false, 0, var3, (byte) -112, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                if (!var23) {
                    class55.method384(0, 2, 0, false, 1, var3, (byte) -122, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                }
            }
            class233.field4049 = 0;
            class43.field758 = class166.field2904;
            class193.field3277 = 2;
            class45.field774 = class255.field4394;
            class61.field957.method1504(65, arg0);
            class61.field957.method1071(-28182, var3 + class226.field3916);
            class61.field957.method1102((byte) -64, class230.field3976 + var2);
            class61.field957.method1070(var4, (byte) 98);
        }
        if (var5 == 3) {
            if (var4 == 0) {
                class247.method1765(class297.field5058, var2, var3);
            } else if (var4 == 1) {
                if (class323.field5545 > 0 && class19.field235[82] && class19.field235[81]) {
                    class100.method683(class230.field3976 + var2, class297.field5058, class226.field3916 + var3, true);
                } else if (class55.method384(0, 1, 0, true, 0, var3, (byte) -126, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0)) {
                    class61.field957.method1075(class126.field2216, -1);
                    class61.field957.method1075(class129.field2249, -1);
                    class61.field957.method1102((byte) -34, class219.field3804);
                    class61.field957.method1075(57, arg0);
                    class61.field957.method1075(class62.field970, -1);
                    class61.field957.method1075(class5.field41, -1);
                    class61.field957.method1075(89, -1);
                    class61.field957.method1102((byte) -85, class168.field2932.field1685);
                    class61.field957.method1102((byte) -111, class168.field2932.field1689);
                    class61.field957.method1075(class166.field2907, -1);
                    class61.field957.method1075(63, -1);
                }
            }
        }
        if (var5 == 43) {
            class75 var25 = class282.method1965(var3, (byte) 6);
            boolean var26 = true;
            if (var25.field1210 > 0) {
                var26 = class122.method832(var25, (byte) -46);
            }
            if (var26) {
                class17.field184++;
                class61.field957.method1504(58, -1);
                class61.field957.method1065(178808912, var3);
            }
        }
        if (var5 == 40) {
            class61.field957.method1504(28, -1);
            class93.field1677++;
            class61.field957.method1102((byte) -123, var2);
            class61.field957.method1071(arg0 - 28181, var4);
            class61.field957.method1099(var3, true);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 36) {
            class284.field4767++;
            class25.method161(var2, var6, -126, var3);
            class61.field957.method1504(131, arg0);
            class61.field957.method1070(class226.field3916 + var3, (byte) -64);
            class61.field957.method1071(-28182, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class61.field957.method1071(-28182, class230.field3976 + var2);
        }
        if (var5 == 24) {
            class311.field5319++;
            class61.field957.method1504(241, arg0);
            class61.field957.method1102((byte) -68, var4);
            class61.field957.method1099(class110.field1974, true);
            class61.field957.method1099(var3, true);
            class61.field957.method1071(arg0 - 28181, class217.field3778);
            class61.field957.method1071(-28182, class293.field4916);
            class61.field957.method1069(var2, 877369544);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 20) {
            class81 var27 = class29.field405[var4];
            if (var27 != null) {
                class55.method384(0, 2, 0, false, 1, var27.field1720[0], (byte) -112, 0, var27.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class193.field3277 = 2;
                class233.field4049 = 0;
                class45.field774 = class255.field4394;
                class83.field1480++;
                class43.field758 = class166.field2904;
                class61.field957.method1504(157, -1);
                class61.field957.method1069(var4, arg0 ^ 0xCBB46737);
            }
        }
        if (var5 == 32) {
            class275 var28 = class99.field1777[var4];
            if (var28 != null) {
                class331.field5642++;
                class55.method384(0, 2, 0, false, 1, var28.field1720[0], (byte) -114, 0, var28.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class233.field4049 = 0;
                class193.field3277 = 2;
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class61.field957.method1504(85, -1);
                class61.field957.method1070(var4, (byte) 39);
            }
        }
        if (var5 == 38) {
            class275 var29 = class99.field1777[var4];
            if (var29 != null) {
                class52.field838++;
                class55.method384(0, 2, 0, false, 1, var29.field1720[0], (byte) -81, 0, var29.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class233.field4049 = 0;
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class193.field3277 = 2;
                class61.field957.method1504(169, -1);
                class61.field957.method1069(var4, 877369544);
            }
        }
        if (var5 == 16) {
            class275 var30 = class99.field1777[var4];
            if (var30 != null) {
                class77.field1307++;
                class55.method384(0, 2, 0, false, 1, var30.field1720[0], (byte) -93, 0, var30.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class43.field758 = class166.field2904;
                class45.field774 = class255.field4394;
                class193.field3277 = 2;
                class233.field4049 = 0;
                class61.field957.method1504(94, arg0);
                class61.field957.method1071(-28182, var4);
            }
        }
        if (var5 == 48) {
            class161.field2816++;
            class61.field957.method1504(48, -1);
            class61.field957.method1053(var3, (byte) 107);
            class61.field957.method1069(var2, 877369544);
            class61.field957.method1070(var4, (byte) -75);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 7) {
            if (class22.field307 == 1) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -104, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            } else {
                boolean var31 = class55.method384(0, 2, 0, false, 0, var3, (byte) -109, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                if (!var31) {
                    class55.method384(0, 2, 0, false, 1, var3, (byte) -127, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                }
            }
            class193.field3277 = 2;
            class233.field4049 = 0;
            class43.field758 = class166.field2904;
            class45.field774 = class255.field4394;
            class61.field957.method1504(39, -1);
            class47.field782++;
            class61.field957.method1070(class230.field3976 + var2, (byte) 109);
            class61.field957.method1102((byte) -89, var4);
            class61.field957.method1071(-28182, class226.field3916 + var3);
        }
        if (var5 == 49) {
            class17.field184++;
            class61.field957.method1504(58, -1);
            class61.field957.method1065(178808912, var3);
            class75 var33 = class282.method1965(var3, (byte) 6);
            if (var33.field1152 != null && var33.field1152[0][0] == 5) {
                int var34 = var33.field1152[0][1];
                if (class312.field5398[var34] != var33.field1141[0]) {
                    class312.field5398[var34] = var33.field1141[0];
                    class181.method1265(var34, (byte) 122);
                }
            }
        }
        if (var5 == 57 && class99.field1789 == null) {
            class228.method1627(532, var3, var2);
            class99.field1789 = class257.method1840(false, var3, var2);
            class138.method937(class99.field1789, 16);
        }
        if (var5 == 44) {
            class81 var35 = class29.field405[var4];
            if (var35 != null) {
                class233.field4050++;
                class55.method384(0, 2, 0, false, 1, var35.field1720[0], (byte) -87, 0, var35.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class233.field4049 = 0;
                class193.field3277 = 2;
                class61.field957.method1504(56, -1);
                class61.field957.method1102((byte) -102, var4);
            }
        }
        if (var5 == 26) {
            class275 var36 = class99.field1777[var4];
            if (var36 != null) {
                class55.method384(0, 2, 0, false, 1, var36.field1720[0], (byte) -84, 0, var36.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class45.field774 = class255.field4394;
                class233.field4049 = 0;
                class43.field758 = class166.field2904;
                class193.field3277 = 2;
                class61.field957.method1504(126, -1);
                class61.field957.method1071(-28182, var4);
                field2542++;
            }
        }
        if (var5 == 19) {
            class81 var37 = class29.field405[var4];
            if (var37 != null) {
                class90.field1628++;
                class55.method384(0, 2, 0, false, 1, var37.field1720[0], (byte) -128, 0, var37.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class193.field3277 = 2;
                class43.field758 = class166.field2904;
                class45.field774 = class255.field4394;
                class233.field4049 = 0;
                class61.field957.method1504(114, -1);
                class61.field957.method1070(var4, (byte) 59);
            }
        }
        if (var5 == 34) {
            class61.field957.method1504(117, arg0);
            class159.field2762++;
            class61.field957.method1071(-28182, var4);
            class61.field957.method1102((byte) -64, var2);
            class61.field957.method1046(var3, arg0 ^ 0x49);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 18) {
            class289.field4863++;
            class61.field957.method1504(200, -1);
            class61.field957.method1053(var3, (byte) 91);
            class61.field957.method1071(-28182, var2);
            class61.field957.method1070(var4, (byte) -124);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 50) {
            class81 var38 = class29.field405[var4];
            if (var38 != null) {
                class199.field3410++;
                class55.method384(0, 2, 0, false, 1, var38.field1720[0], (byte) -81, 0, var38.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class233.field4049 = 0;
                class45.field774 = class255.field4394;
                class193.field3277 = 2;
                class43.field758 = class166.field2904;
                class61.field957.method1504(190, -1);
                class61.field957.method1070(var4, (byte) 61);
            }
        }
        if (var5 == 1001) {
            class233.field4049 = 0;
            class45.field774 = class255.field4394;
            class43.field758 = class166.field2904;
            class193.field3277 = 2;
            class275 var39 = class99.field1777[var4];
            if (var39 != null) {
                class233 var40 = var39.field4628;
                if (var40.field4063 != null) {
                    var40 = var40.method1652(false);
                }
                if (var40 != null) {
                    class201.field3448++;
                    class61.field957.method1504(223, -1);
                    class61.field957.method1102((byte) -104, var40.field4076);
                }
            }
        }
        if (var5 == 41) {
            class61.field957.method1504(251, -1);
            class22.field303++;
            class61.field957.method1053(var3, (byte) 108);
            class61.field957.method1069(var2, 877369544);
            class61.field957.method1070(var4, (byte) -127);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (var5 == 30) {
            class110.field1969++;
            if (class22.field307 == 1) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -106, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            } else {
                boolean var41 = class55.method384(0, 2, 0, false, 0, var3, (byte) -104, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                if (!var41) {
                    class55.method384(0, 2, 0, false, 1, var3, (byte) -101, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                }
            }
            class233.field4049 = 0;
            class45.field774 = class255.field4394;
            class43.field758 = class166.field2904;
            class193.field3277 = 2;
            class61.field957.method1504(170, -1);
            class61.field957.method1069(var4, 877369544);
            class61.field957.method1070(class226.field3916 + var3, (byte) 105);
            class61.field957.method1070(var2 + class230.field3976, (byte) -63);
        }
        if (var5 == 15) {
            class81 var43 = class29.field405[var4];
            if (var43 != null) {
                class273.field4592++;
                class55.method384(0, 2, 0, false, 1, var43.field1720[0], (byte) -102, 0, var43.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class43.field758 = class166.field2904;
                class45.field774 = class255.field4394;
                class193.field3277 = 2;
                class233.field4049 = 0;
                class61.field957.method1504(236, -1);
                class61.field957.method1102((byte) -14, var4);
            }
        }
        if (var5 == 2 && class25.method161(var2, var6, -43, var3)) {
            class207.field3605++;
            class61.field957.method1504(153, arg0 ^ 0x0);
            class61.field957.method1065(arg0 ^ 0xF55797AF, class65.field1016);
            class61.field957.method1070(class230.field3976 + var2, (byte) -100);
            class61.field957.method1071(arg0 - 28181, class226.field3916 + var3);
            class61.field957.method1070(class15.field133, (byte) 121);
            class61.field957.method1069(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 + 877369545);
        }
        if (var5 == 59) {
            class183.field3120++;
            boolean var44 = class55.method384(0, 2, 0, false, 0, var3, (byte) -122, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
            if (!var44) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -91, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            }
            class43.field758 = class166.field2904;
            class45.field774 = class255.field4394;
            class233.field4049 = 0;
            class193.field3277 = 2;
            class61.field957.method1504(175, -1);
            class61.field957.method1102((byte) -93, var4);
            class61.field957.method1102((byte) -20, class226.field3916 + var3);
            class61.field957.method1046(class65.field1016, -105);
            class61.field957.method1102((byte) -62, class230.field3976 + var2);
            class61.field957.method1102((byte) -44, class15.field133);
        }
        if (var5 == 39) {
            class119.field2097++;
            if (class22.field307 == 1) {
                class55.method384(0, 2, 0, false, 1, var3, (byte) -99, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
            } else {
                boolean var46 = class55.method384(0, 2, 0, false, 0, var3, (byte) -114, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                if (!var46) {
                    class55.method384(0, 2, 0, false, 1, var3, (byte) -116, 0, var2, class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                }
            }
            class193.field3277 = 2;
            class233.field4049 = 0;
            class43.field758 = class166.field2904;
            class45.field774 = class255.field4394;
            class61.field957.method1504(173, -1);
            class61.field957.method1069(class230.field3976 + var2, 877369544);
            class61.field957.method1102((byte) -122, var3 + class226.field3916);
            class61.field957.method1069(var4, arg0 ^ 0xCBB46737);
        }
        if (var5 == 1006) {
            class272.field4587++;
            class25.method161(var2, var6, -113, var3);
            class61.field957.method1504(210, -1);
            class61.field957.method1102((byte) -56, class226.field3916 + var3);
            class61.field957.method1070(class230.field3976 + var2, (byte) -117);
            class61.field957.method1071(-28182, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var5 == 10) {
            class79.field1334++;
            class25.method161(var2, var6, -121, var3);
            class61.field957.method1504(134, arg0 ^ 0x0);
            class61.field957.method1071(-28182, class226.field3916 + var3);
            class61.field957.method1070((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 39);
            class61.field957.method1071(arg0 - 28181, class230.field3976 + var2);
        }
        if (var5 == 31) {
            class81 var48 = class29.field405[var4];
            if (var48 != null) {
                class55.method384(0, 2, 0, false, 1, var48.field1720[0], (byte) -116, 0, var48.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                class193.field3277 = 2;
                class221.field3824++;
                class233.field4049 = 0;
                class45.field774 = class255.field4394;
                class43.field758 = class166.field2904;
                class61.field957.method1504(77, -1);
                class61.field957.method1070(var4, (byte) -68);
            }
        }
        if (var5 == 51) {
            class32.field479++;
            class25.method161(var2, var6, arg0 - 126, var3);
            class61.field957.method1504(180, -1);
            class61.field957.method1071(arg0 ^ 0x6E15, class226.field3916 + var3);
            class61.field957.method1069(Integer.MAX_VALUE & (int) (var6 >>> 32), 877369544);
            class61.field957.method1069(class230.field3976 + var2, arg0 + 877369545);
        }
        if (var5 == 5) {
            class75 var49 = class257.method1840(false, var3, var2);
            if (var49 != null) {
                class293.method2019(98);
                class9.method58(var2, -661942672, var3, class53.method374(102, client.method871(var49)));
                class271.field4578 = 0;
                class119.field2105 = class247.method1772(var49, (byte) 18);
                if (class119.field2105 == null) {
                    class119.field2105 = class247.field4271;
                }
                if (var49.field1136) {
                    class48.field800 = class29.method182(arg0 ^ 0x1796, new class82[] { var49.field1187, class281.field4718 });
                } else {
                    class48.field800 = class29.method182(-6039, new class82[] { class159.field2766, var49.field1196, class281.field4718 });
                }
            }
            return;
        }
        if (var5 == 1004) {
            class99.field1780++;
            class193.field3277 = 2;
            class45.field774 = class255.field4394;
            class43.field758 = class166.field2904;
            class233.field4049 = 0;
            class61.field957.method1504(133, -1);
            class61.field957.method1069(var4, 877369544);
        }
        if (var5 == 21) {
            class254.field4372++;
            class61.field957.method1504(130, -1);
            class61.field957.method1053(var3, (byte) 96);
            class61.field957.method1071(-28182, var2);
            class61.field957.method1071(-28182, class15.field133);
            class61.field957.method1099(class65.field1016, true);
            class61.field957.method1102((byte) -98, var4);
            class327.field5587 = 0;
            class328.field5603 = class282.method1965(var3, (byte) 6);
            class131.field2274 = var2;
        }
        if (~class271.field4578 != arg0) {
            class271.field4578 = 0;
            class138.method937(class282.method1965(class110.field1974, (byte) 6), 16);
        }
        if (class256.field4406) {
            class293.method2019(arg0 + 99);
        }
        if (class328.field5603 != null && class327.field5587 == 0) {
            class138.method937(class328.field5603, 16);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)[[I", line = 1171)
    public final int[][] method146(int arg0, byte arg1) {
        field2538++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (var12 == var13 && var12 == var14) {
                    var10[var11] = this.field2541 * var13 >> 12;
                    var6[var11] = this.field2540 * var12 >> 12;
                    var9[var11] = this.field2528 * var14 >> 12;
                } else {
                    var10[var11] = this.field2541;
                    var6[var11] = this.field2540;
                    var9[var11] = this.field2528;
                }
            }
        }
        if (arg1 != -82) {
            this.field2541 = 114;
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V", line = 1236)
    public static final void method1030(byte arg0) {
        class187.field3153 = false;
        class187.field3155 = -1;
        class199.field3421 = 0;
        class238.field4134 = 0;
        class220.field3819 = -1;
        class184.field3129 = -1;
        class309.field5262 = 0;
        class92.field1647 = 0;
        class111.field2008 = 0;
        field2527++;
        class61.field957.field2611 = 0;
        class35.field545.field2611 = 0;
        class302.field5152 = 0;
        class64.field997 = -1;
        for (int var1 = 0; var1 < class29.field405.length; var1++) {
            if (class29.field405[var1] != null) {
                class29.field405[var1].field1683 = -1;
            }
        }
        int var2 = 0;
        if (arg0 >= -60) {
            field2543 = (class82) null;
        }
        while (var2 < class99.field1777.length) {
            if (class99.field1777[var2] != null) {
                class99.field1777[var2].field1683 = -1;
            }
            var2++;
        }
        class153.method1084((byte) -74);
        class273.field4602 = 1;
        class292.method2014(28, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class276.field4639[var3] = true;
        }
        class277.method1925(71);
    }

    @OriginalMember(owner = "client!km", name = "i", descriptor = "(I)V", line = 1306)
    public static void method1031(int arg0) {
        field2544 = null;
        field2531 = null;
        field2543 = null;
        field2535 = null;
        field2525 = null;
        field2532 = null;
        field2545 = null;
        if (arg0 == -1) {
            field2526 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZIIIIILbc;)V", line = 1323)
    public static final void method1032(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class153 arg8) {
        if (arg0 != -26283) {
            field2531 = (class82) null;
        }
        if (arg4 >= 0 && arg4 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg2) {
                class204.field3567[arg3][arg4][arg1] = 0;
            }
            while (true) {
                int var9 = arg8.method1082(arg0 + 26213);
                if (var9 == 0) {
                    if (arg2) {
                        class245.field4255[0][arg4][arg1] = class180.field3073[0][arg4][arg1];
                    } else if (arg3 == 0) {
                        class245.field4255[0][arg4][arg1] = -class291.method2008(arg6 + arg4 + 932731, (byte) -53, arg1 + arg7 + 556238) * 8;
                    } else {
                        class245.field4255[arg3][arg4][arg1] = class245.field4255[arg3 - 1][arg4][arg1] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg8.method1082(arg0 + 26208);
                    if (arg2) {
                        class245.field4255[0][arg4][arg1] = var10 * 8 + class180.field3073[0][arg4][arg1];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg3 == 0) {
                            class245.field4255[0][arg4][arg1] = -var10 * 8;
                        } else {
                            class245.field4255[arg3][arg4][arg1] = class245.field4255[arg3 - 1][arg4][arg1] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class256.field4405[arg3][arg4][arg1] = arg8.method1104(-1);
                    class138.field2371[arg3][arg4][arg1] = (byte) ((var9 - 2) / 4);
                    class204.field3581[arg3][arg4][arg1] = (byte) class277.method1935(3, arg5 + var9 - 2);
                } else if (var9 > 81) {
                    class77.field1323[arg3][arg4][arg1] = (byte) (var9 - 81);
                } else if (!arg2) {
                    class204.field3567[arg3][arg4][arg1] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg8.method1082(-128);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg8.method1082(-76);
                    break;
                }
                if (var11 <= 49) {
                    arg8.method1082(-71);
                }
            }
        }
        field2539++;
    }
}
