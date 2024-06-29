import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class222 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3309 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3308 = -1;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[BII)Ljava/lang/String;")
    public static final String method1443(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field3310++;
        if (!arg0) {
            method1445(-39);
        }
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class233.field3485[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lkl;B)Lgh;")
    public static final class200 method1444(class114 arg0, byte arg1) {
        if (arg1 != 103) {
            field3311 = 70;
        }
        field3313++;
        return new class200(arg0.method763(true), arg0.method763(true), arg0.method763(true), arg0.method763(true), arg0.method779(16711680), arg0.method760(false));
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1445(int arg0) {
        field3306++;
        class259.field3920 = null;
        class214.field3077 = null;
        class98.field1475 = null;
        if (arg0 != 16755) {
            method1444((class114) null, (byte) -92);
        }
        class226.field3401 = null;
        class204.field2964 = null;
        class175.field2500 = null;
        class76.field1173 = null;
        class268.field4192 = null;
        class118.field1729 = null;
        class102.field1531 = null;
        class26.field372 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static final void method1446(boolean arg0) {
        field3307++;
        if (!arg0) {
            return;
        }
        while (true) {
            class113 var1;
            class5 var3;
            do {
                var1 = (class113) class290.field4580.method653((byte) 108);
                if (var1 == null) {
                    return;
                }
                if (var1.field1622 < 0) {
                    int var2 = -var1.field1622 - 1;
                    if (class73.field1133 == var2) {
                        var3 = class55.field847;
                    } else {
                        var3 = class194.field2777[var2];
                    }
                } else {
                    int var4 = var1.field1622 - 1;
                    var3 = class82.field1268[var4];
                }
            } while (var3 == null);
            class250 var5 = class91.method618(120, var1.field1613);
            int var6;
            int var7;
            if (var1.field1609 == 1 || var1.field1609 == 3) {
                var6 = var5.field3821;
                var7 = var5.field3808;
            } else {
                var6 = var5.field3808;
                var7 = var5.field3821;
            }
            int var8 = (var7 + 1 >> 1) + var1.field1612;
            int var9 = (var7 >> 1) + var1.field1612;
            int var10 = (var6 >> 1) + var1.field1616;
            int var11 = (var6 + 1 >> 1) + var1.field1616;
            int[][] var12 = class107.field1556[class163.field2364];
            int var13 = var12[var9][var10] + var12[var8][var10] - (-var12[var9][var11] - var12[var8][var11]) >> 2;
            int var14 = class66.field1032[var1.field1624];
            class219 var15 = null;
            if (var14 == 0) {
                class288 var19 = class91.method615(class163.field2364, var1.field1612, var1.field1616);
                if (var19 != null) {
                    var15 = var19.field4557;
                }
            } else if (var14 == 1) {
                class264 var18 = class246.method1612(class163.field2364, var1.field1612, var1.field1616);
                if (var18 != null) {
                    var15 = var18.field3974;
                }
            } else if (var14 == 2) {
                class162 var17 = class33.method232(class163.field2364, var1.field1612, var1.field1616);
                if (var17 != null) {
                    var15 = var17.field2348;
                }
            } else if (var14 == 3) {
                class109 var16 = class113.method731(class163.field2364, var1.field1612, var1.field1616);
                if (var16 != null) {
                    var15 = var16.field1569;
                }
            }
            if (var15 != null) {
                class224.method1458(var1.field1618 + 1, var14, 0, var1.field1612, var1.field1616, -1, 0, class163.field2364, false, var1.field1625 + 1);
                var3.field55 = var13;
                var3.field128 = var1.field1616 * 128 + (var6 * 64);
                var3.field86 = var1.field1612 * 128 + var7 * 64;
                var3.field64 = var1.field1625 + class82.field1267;
                var3.field78 = class82.field1267 + var1.field1618;
                int var20 = var1.field1619;
                var3.field65 = var15;
                int var21 = var1.field1621;
                int var22 = var1.field1623;
                if (var20 > var21) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                var3.field131 = var1.field1612 + var21;
                var3.field129 = var1.field1612 + var20;
                int var24 = var1.field1605;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field68 = var1.field1616 + var22;
                var3.field73 = var1.field1616 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method1447(short[] arg0, String[] arg1, int arg2) {
        field3314++;
        class289.method1933(arg1.length - 1, 120, arg0, 0, arg1);
        if (arg2 != -4) {
            field3305 = -114;
        }
    }
}
