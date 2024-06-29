import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class83 extends class224 {

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    private int field1245 = 12288;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    private int field1248 = 2048;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    private int field1250 = 0;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    private int field1254 = 4096;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    private int field1256 = 8192;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    private int field1258 = 2048;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    private int field1253 = 0;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Luf;")
    private static class168 field1242 = class148.method1019(-1720, " from your ignore list first)3");

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "I")
    public static int field1261 = 0;

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "Luf;")
    public static class168 field1264 = class148.method1019(-1720, ")1 ");

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "Luf;")
    public static class168 field1249 = field1242;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "[[Z")
    public static boolean[][] field1252;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)Z", line = 7)
    private final boolean method556(int arg0, byte arg1, int arg2) {
        int var4 = (arg2 - arg0) * this.field1245 >> 12;
        field1255++;
        int var5 = class261.field4425[(var4 * 255 & 0xFF6CC) >> 12];
        int var6 = (var5 << 12) / this.field1245;
        int var7 = (var6 << 12) / this.field1256;
        int var8 = this.field1254 * var7 >> 12;
        if (arg1 != 104) {
            this.field1245 = -82;
        }
        return var8 > (arg0 + arg2) && (arg0 + arg2) > (-var8);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 26)
    public final void method80(boolean arg0) {
        field1257++;
        class125.method889(-88);
        if (arg0) {
            this.field1253 = -4;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(Z)V", line = 37)
    public static void method557(boolean arg0) {
        field1264 = null;
        field1242 = null;
        field1252 = (boolean[][]) null;
        field1249 = null;
        if (!arg0) {
            method558(18);
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 54)
    public static final void method558(int arg0) {
        int var1 = -5 / ((arg0 - 29) / 38);
        field1262++;
        class221.field3591.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 175)
    public class83() {
        super(0, true);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLj;)V", line = 76)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            method558(-80);
        }
        if (arg0 == 0) {
            this.field1248 = arg2.method1069(111);
        } else if (arg0 == 1) {
            this.field1250 = arg2.method1069(105);
        } else if (arg0 == 2) {
            this.field1253 = arg2.method1069(61);
        } else if (arg0 == 3) {
            this.field1258 = arg2.method1069(76);
        } else if (arg0 == 4) {
            this.field1245 = arg2.method1069(101);
        } else if (arg0 == 5) {
            this.field1254 = arg2.method1069(68);
        } else if (arg0 == 6) {
            this.field1256 = arg2.method1069(54);
        }
        field1260++;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)I", line = 179)
    public static final int method559(int arg0) {
        field1246++;
        return class238.field3865 == arg0 ? 0 : class155.field2456[class238.field3865].method48();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V", line = 195)
    public static final void method560(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field1249 = (class168) null;
        }
        class253.field4311 = arg1;
        field1243++;
        if (!class253.field4311) {
            int var2 = class166.field2671.method1051(-128);
            int var3 = class166.field2671.method1041(arg0 ^ 0xFFFFFF9E);
            int var4 = class166.field2671.method1049(true);
            int var5 = (class110.field1726 - class166.field2671.field2367) / 16;
            class280.field4708 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    class280.field4708[var6][var7] = class166.field2671.method1052(29912);
                }
            }
            int var8 = class166.field2671.method1069(116);
            boolean var9 = false;
            int var10 = class166.field2671.method1093((byte) 41);
            class78.field1077 = new byte[var5][];
            class28.field356 = new byte[var5][];
            class196.field3228 = new int[var5];
            class76.field1011 = new int[var5];
            class247.field4232 = null;
            if (((var8 / 8) == 48 || (var8 / 8) == 49) && (var3 / 8) == 48) {
                var9 = true;
            }
            class303.field5104 = new int[var5];
            if (var8 / 8 == 48 && (var3 / 8) == 148) {
                var9 = true;
            }
            class215.field3502 = new int[var5];
            class151.field2336 = new byte[var5][];
            class157.field2492 = new int[var5];
            class51.field625 = new byte[var5][];
            int var11 = 0;
            class39.field482 = (byte[][]) null;
            for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= ((var3 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var9 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class303.field5104[var11] = var14;
                        class215.field3502[var11] = -1;
                        class157.field2492[var11] = -1;
                        class196.field3228[var11] = -1;
                        class76.field1011[var11] = -1;
                    } else {
                        class303.field5104[var11] = var14;
                        class215.field3502[var11] = class175.field2830.method1646(-27248, class134.method938((byte) -123, new class168[] { class133.field2072, class169.method1228(var12, 0), class188.field2986, class169.method1228(var13, 0) }));
                        class157.field2492[var11] = class175.field2830.method1646(-27248, class134.method938((byte) -124, new class168[] { class283.field4795, class169.method1228(var12, 0), class188.field2986, class169.method1228(var13, 0) }));
                        class196.field3228[var11] = class175.field2830.method1646(-27248, class134.method938((byte) -127, new class168[] { class293.field4966, class169.method1228(var12, 0), class188.field2986, class169.method1228(var13, 0) }));
                        class76.field1011[var11] = class175.field2830.method1646(-27248, class134.method938((byte) -125, new class168[] { class143.field2205, class169.method1228(var12, 0), class188.field2986, class169.method1228(var13, 0) }));
                    }
                    var11++;
                }
            }
            class114.method834(var4, var2, var8, var10, false, 85, var3);
            return;
        }
        int var15 = class166.field2671.method1049(true);
        int var16 = class166.field2671.method1049(true);
        int var17 = class166.field2671.method1064((byte) 19);
        int var18 = class166.field2671.method1049(true);
        class166.field2671.method718(false);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = class166.field2671.method728(1, 20544);
                    if (var22 == 1) {
                        class80.field1152[var19][var20][var21] = class166.field2671.method728(26, class289.method1988(arg0, 20544));
                    } else {
                        class80.field1152[var19][var20][var21] = -1;
                    }
                }
            }
        }
        class166.field2671.method716((byte) -26);
        int var23 = (class110.field1726 - class166.field2671.field2367) / 16;
        class280.field4708 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                class280.field4708[var24][var25] = class166.field2671.method1089((byte) -14);
            }
        }
        int var26 = class166.field2671.method1041(116);
        class196.field3228 = new int[var23];
        class28.field356 = new byte[var23][];
        class78.field1077 = new byte[var23][];
        class76.field1011 = new int[var23];
        class247.field4232 = null;
        class151.field2336 = new byte[var23][];
        class215.field3502 = new int[var23];
        class303.field5104 = new int[var23];
        class157.field2492 = new int[var23];
        class39.field482 = (byte[][]) null;
        class51.field625 = new byte[var23][];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class80.field1152[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFFFD9) >> 14;
                        int var33 = (var31 & 0x3FFA) >> 3;
                        int var34 = (var32 / 8 << 8) + (var33 / 8);
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class303.field5104[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            int var36 = var34 >> 8 & 0xFF;
                            class303.field5104[var27] = var34;
                            int var37 = var34 & 0xFF;
                            class215.field3502[var27] = class175.field2830.method1646(-27248, class134.method938((byte) -123, new class168[] { class133.field2072, class169.method1228(var36, 0), class188.field2986, class169.method1228(var37, 0) }));
                            class157.field2492[var27] = class175.field2830.method1646(-27248, class134.method938((byte) -125, new class168[] { class283.field4795, class169.method1228(var36, 0), class188.field2986, class169.method1228(var37, 0) }));
                            class196.field3228[var27] = class175.field2830.method1646(class289.method1988(arg0, -27248), class134.method938((byte) -128, new class168[] { class293.field4966, class169.method1228(var36, 0), class188.field2986, class169.method1228(var37, 0) }));
                            class76.field1011[var27] = class175.field2830.method1646(-27248, class134.method938((byte) -126, new class168[] { class143.field2205, class169.method1228(var36, 0), class188.field2986, class169.method1228(var37, 0) }));
                            var27++;
                        }
                    }
                }
            }
        }
        class114.method834(var16, var18, var15, var17, false, 122, var26);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)[I", line = 475)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = 98 / ((arg0 - 20) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        field1247++;
        if (this.field3613.field4531) {
            int var5 = class303.field5103[arg1] - 2048;
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                int var7 = class73.field979[var6] - 2048;
                int var8 = this.field1248 + var7;
                int var9 = this.field1258 + var5;
                int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                int var11 = var10 <= 2048 ? var10 : var10 - 4096;
                int var12 = var8 >= -2048 ? var8 : var8 + 4096;
                int var13 = this.field1253 + var7;
                int var14 = var12 <= 2048 ? var12 : var12 - 4096;
                int var15 = this.field1250 + var5;
                int var16 = var13 < -2048 ? var13 + 4096 : var13;
                int var17 = var15 < -2048 ? var15 + 4096 : var15;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                int var19 = var17 > 2048 ? var17 - 4096 : var17;
                var4[var6] = this.method556(var14, (byte) 104, var19) || this.method561(-2967, var11, var18) ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(III)Z", line = 523)
    private final boolean method561(int arg0, int arg1, int arg2) {
        field1263++;
        if (arg0 != -2967) {
            this.method19(58, true, (class153) null);
        }
        int var4 = (arg1 + arg2) * this.field1245 >> 12;
        int var5 = class261.field4425[(var4 * 255 & 0xFFFA0) >> 12];
        int var6 = (var5 << 12) / this.field1245;
        int var7 = (var6 << 12) / this.field1256;
        int var8 = this.field1254 * var7 >> 12;
        return (arg1 - arg2) < var8 && -var8 < arg1 - arg2;
    }
}
