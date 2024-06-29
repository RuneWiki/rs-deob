import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class31 {

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "[S")
    private short[] field1116 = new short[6];

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "Z")
    public boolean field1127 = false;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "[I")
    private int[] field1130 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "[S")
    private short[] field1117 = new short[6];

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lid;")
    public static class60 field1121 = class11.method72("Texturen geladen)3", (byte) 112);

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lid;")
    public static class60 field1125 = class11.method72("(U1", (byte) 118);

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "[Lae;")
    public static class6[] field1120 = new class6[1000];

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "Lid;")
    private static class60 field1128 = class11.method72("Account locked as we suspect it has been stolen)3", (byte) -40);

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lid;")
    public static class60 field1135 = field1128;

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lid;")
    private static class60 field1134 = class11.method72("You have only just left another world)3", (byte) -9);

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lid;")
    public static class60 field1118 = field1134;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "[I")
    private int[] field1132;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lnf;")
    public final class96 method327(boolean arg0) {
        field1115++;
        class96[] var2 = new class96[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1130[var4] != -1) {
                var2[var3++] = class96.method751(class115.field2713, this.field1130[var4], 0);
            }
        }
        class96 var5 = new class96(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1116[var6] != 0; var6++) {
            var5.method754(this.field1116[var6], this.field1117[var6]);
        }
        if (!arg0) {
            field1119 = -46;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILid;)V")
    public static final void method328(int arg0, int arg1, int arg2, int arg3, class60 arg4) {
        field1133++;
        class40 var5 = class158.method1218(12777, arg2, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field1026 != null) {
            class15 var6 = new class15();
            var6.field361 = var5;
            var6.field356 = arg4;
            var6.field353 = var5.field1026;
            var6.field333 = arg3;
            class61.method467(false, var6);
        }
        boolean var7 = true;
        if (var5.field966 > 0) {
            var7 = class152.method1159(var5, 324);
        }
        if (!var7 || !class72.method552(122, arg3 - 1, class97.method770(var5, -1370253216))) {
            return;
        }
        if (arg0 < 7) {
            method336(false, false);
        }
        if (arg3 == 1) {
            client.field500++;
            class22.field519.method1214(90, 0);
            class22.field519.method819(arg1, (byte) 93);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 2) {
            class22.field519.method1214(33, 0);
            class39.field927++;
            class22.field519.method819(arg1, (byte) 54);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 3) {
            class74.field1782++;
            class22.field519.method1214(5, 0);
            class22.field519.method819(arg1, (byte) -82);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 4) {
            class99.field2409++;
            class22.field519.method1214(47, 0);
            class22.field519.method819(arg1, (byte) 122);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 5) {
            class22.field519.method1214(84, 0);
            class22.field519.method819(arg1, (byte) -106);
            class22.field519.method811(true, arg2);
            class112.field2682++;
        }
        if (arg3 == 6) {
            class22.field519.method1214(184, 0);
            class22.field519.method819(arg1, (byte) 119);
            class60.field1487++;
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 7) {
            class15.field335++;
            class22.field519.method1214(192, 0);
            class22.field519.method819(arg1, (byte) -60);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 8) {
            class73.field1765++;
            class22.field519.method1214(80, 0);
            class22.field519.method819(arg1, (byte) 32);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 9) {
            class22.field519.method1214(101, 0);
            class113.field2702++;
            class22.field519.method819(arg1, (byte) 61);
            class22.field519.method811(true, arg2);
        }
        if (arg3 == 10) {
            class34.field786++;
            class22.field519.method1214(171, 0);
            class22.field519.method819(arg1, (byte) -92);
            class22.field519.method811(true, arg2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Z")
    public final boolean method329(int arg0) {
        int var2 = -5 % ((-arg0 - 2) / 56);
        field1113++;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1130[var4] != -1 && !class115.field2713.method461(0, this.field1130[var4], (byte) 52)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Lnf;")
    public final class96 method330(int arg0) {
        field1111++;
        if (this.field1132 == null) {
            return null;
        }
        class96[] var2 = new class96[this.field1132.length];
        if (arg0 != 5884) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1132.length; var3++) {
            var2[var3] = class96.method751(class115.field2713, this.field1132[var3], 0);
        }
        class96 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class96(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1116[var5] != 0; var5++) {
            var4.method754(this.field1116[var5], this.field1117[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public static final void method331(int arg0, byte arg1) {
        field1124++;
        if (class28.method209(arg0, -1)) {
            int var2 = -5 / ((29 - arg1) / 54);
            class22.method181((byte) -47, class45.field1177[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method332(byte arg0) {
        field1125 = null;
        field1120 = null;
        field1134 = null;
        if (arg0 < 0) {
            method336(true, false);
        }
        field1128 = null;
        field1135 = null;
        field1121 = null;
        field1118 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILof;I)V")
    private final void method333(int arg0, class103 arg1, int arg2) {
        field1126++;
        if (arg2 != -5591) {
            this.field1127 = true;
        }
        if (arg0 == 1) {
            this.field1129 = arg1.method829((byte) -122);
        } else if (arg0 == 2) {
            int var4 = arg1.method829((byte) -85);
            this.field1132 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1132[var5] = arg1.method808(-20054);
            }
        } else if (arg0 == 3) {
            this.field1127 = true;
        } else if (arg0 < 40 || arg0 >= 50) {
            if (arg0 >= 50 && arg0 < 60) {
                this.field1117[arg0 - 50] = (short) arg1.method808(class81.method682(arg2, 23427));
                return;
            }
            if (arg0 >= 60 && arg0 < 70) {
                this.field1130[arg0 - 60] = arg1.method808(-20054);
                return;
            }
        } else {
            this.field1116[arg0 - 40] = (short) arg1.method808(-20054);
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        field1122++;
        if (this.field1132 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1132.length; var3++) {
            if (!class115.field2713.method461(0, this.field1132[var3], (byte) -128)) {
                var2 = false;
            }
        }
        int var4 = 47 / ((arg0 - 64) / 52);
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILof;)V")
    public final void method335(int arg0, class103 arg1) {
        if (arg0 != 0) {
            this.method335(-47, null);
        }
        field1114++;
        while (true) {
            int var3 = arg1.method829((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method333(var3, arg1, arg0 ^ 0xFFFFEA29);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V")
    public static final void method336(boolean arg0, boolean arg1) {
        field1131++;
        class35.field870 = arg1;
        if (class35.field870) {
            int var15 = class56.field1393.method850((byte) -117);
            int var16 = class56.field1393.method833((byte) 27);
            int var17 = class56.field1393.method823((byte) 123);
            int var18 = class56.field1393.method850((byte) 123);
            class56.field1393.method1211(104);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class56.field1393.method1205(arg0, 1);
                        if (var37 == 1) {
                            class158.field3613[var19][var35][var36] = class56.field1393.method1205(false, 26);
                        } else {
                            class158.field3613[var19][var35][var36] = -1;
                        }
                    }
                }
            }
            class56.field1393.method1204(false);
            int var20 = (class94.field2310 - class56.field1393.field2501) / 16;
            class151.field3379 = new int[var20][4];
            for (int var21 = 0; var21 < var20; var21++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class151.field3379[var21][var34] = class56.field1393.method809(255);
                }
            }
            int var22 = class56.field1393.method808(-20054);
            class62.field1564 = new byte[var20][];
            class90.field2256 = new int[var20];
            class131.field2988 = new byte[var20][];
            class124.field2859 = new int[var20];
            class31.field737 = new int[var20];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class158.field3613[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class31.field737[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class31.field737[var23] = var30;
                                int var32 = var30 & 0xFF;
                                int var33 = var30 >> 8 & 0xFF;
                                class90.field2256[var23] = class12.field210.method482(13975, class104.method853(-97, new class60[] { class17.field419, class98.method774((byte) -121, var33), class2.field40, class98.method774((byte) -121, var32) }));
                                class124.field2859[var23] = class12.field210.method482(13975, class104.method853(-94, new class60[] { class8.field126, class98.method774((byte) -121, var33), class2.field40, class98.method774((byte) -121, var32) }));
                                var23++;
                            }
                        }
                    }
                }
            }
            class38.method297(var15, 128, var16, var17, var22, var18);
        } else {
            int var2 = class56.field1393.method831(false);
            int var3 = class56.field1393.method833((byte) 27);
            int var4 = (class94.field2310 - class56.field1393.field2501) / 16;
            class151.field3379 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class151.field3379[var5][var14] = class56.field1393.method803(false);
                }
            }
            int var6 = class56.field1393.method810(-1384376976);
            boolean var7 = false;
            int var8 = class56.field1393.method833((byte) 27);
            int var9 = class56.field1393.method850((byte) 37);
            class31.field737 = new int[var4];
            class131.field2988 = new byte[var4][];
            if ((var9 / 8 == 48 || var9 / 8 == 49) && var6 / 8 == 48) {
                var7 = true;
            }
            class90.field2256 = new int[var4];
            class124.field2859 = new int[var4];
            class62.field1564 = new byte[var4][];
            if (var9 / 8 == 48 && var6 / 8 == 148) {
                var7 = true;
            }
            int var10 = 0;
            for (int var11 = (var9 - 6) / 8; var11 <= (var9 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var7 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class31.field737[var10] = var13;
                        class90.field2256[var10] = class12.field210.method482(13975, class104.method853(-118, new class60[] { class17.field419, class98.method774((byte) -121, var11), class2.field40, class98.method774((byte) -121, var12) }));
                        class124.field2859[var10] = class12.field210.method482(13975, class104.method853(-85, new class60[] { class8.field126, class98.method774((byte) -121, var11), class2.field40, class98.method774((byte) -121, var12) }));
                        var10++;
                    }
                }
            }
            class38.method297(var8, 128, var9, var2, var3, var6);
        }
        if (arg0) {
            method328(78, -48, -64, 24, null);
        }
    }
}
