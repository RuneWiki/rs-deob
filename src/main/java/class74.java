import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class74 extends class247 {

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "[B")
    public byte[] field1124;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lvl;")
    public static class73 field1123;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[[[B")
    public static byte[][][] field1121;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[[[Lol;")
    public static class220[][][] field1128;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZBLsb;)V")
    public static final void method514(boolean arg0, byte arg1, class104 arg2) {
        field1130++;
        int var3 = (int) arg2.field4018;
        int var4 = arg2.field1511;
        arg2.method1764(64);
        if (arg0) {
            class4.method25(var4, (byte) -104);
        }
        class32.method165(-79, var4);
        class231 var5 = class201.method1398(var3, 0);
        if (var5 != null) {
            class247.method1761(var5, (byte) -114);
        }
        int var6 = class173.field2721;
        if (arg1 != 105) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class107.method717(class192.field3056[var7], false)) {
                class111.method741((byte) -10, var7);
            }
        }
        if (class173.field2721 == 1) {
            class311.field4995 = false;
            class277.method1912(class89.field1332, -30901, class45.field548, class206.field3229, class249.field4040);
        } else {
            class277.method1912(class89.field1332, -30901, class45.field548, class206.field3229, class249.field4040);
            int var8 = class306.field4885.method1491(class177.field2783);
            for (int var9 = 0; var9 < class173.field2721; var9++) {
                int var10 = class306.field4885.method1491(class211.method1463(-76, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class89.field1332 = var8 + 8;
            class249.field4040 = (class298.field4758 ? 26 : 22) + class173.field2721 * 15;
        }
        if (class238.field3824 != -1) {
            class290.method1969(1, class238.field3824, 6404);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static final void method515(int arg0) {
        if (arg0 != -5773) {
            field1123 = null;
        }
        class171.field2680.method1510(10283);
        field1122++;
        class311.field4991.method1510(10283);
        class15.field211.method1510(10283);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1123 = null;
        field1121 = null;
        if (arg0 != 25660) {
            method514(false, (byte) 36, (class104) null);
        }
        field1128 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method517(int arg0, int arg1) {
        class83.field1290.method1514(arg1, (byte) -55);
        field1127++;
        if (arg0 != 1186334566) {
            method514(true, (byte) 102, (class104) null);
        }
        class112.field1616.method1514(arg1, (byte) -55);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class74(byte[] arg0) {
        this.field1124 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZI[B)Z")
    public static final boolean method518(int arg0, boolean arg1, int arg2, byte[] arg3) {
        field1129++;
        int var4 = -1;
        class170 var5 = new class170(arg3);
        boolean var6 = arg1;
        label68: while (true) {
            int var7 = var5.method1201(523003696);
            if (var7 == 0) {
                return var6;
            }
            var4 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class191 var16;
                do {
                    int var12;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1162(-129);
                                        if (var17 == 0) {
                                            continue label68;
                                        }
                                        var5.method1218(83);
                                    }
                                    int var10 = var5.method1162(-129);
                                    if (var10 == 0) {
                                        continue label68;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    var12 = arg2 + var11;
                                    var13 = var5.method1218(-82) >> 2;
                                    int var14 = var8 & 0x3F;
                                    var15 = arg0 + var14;
                                } while (var12 <= 0);
                            } while (var15 <= 0);
                        } while (var12 >= 103);
                    } while (var15 >= 103);
                    var16 = class128.method822(var4, (byte) -52);
                } while (var13 == 22 && !class73.field1106 && var16.field3040 == 0 && var16.field2981 != 1 && !var16.field2974);
                var9 = true;
                if (!var16.method1338(-1)) {
                    var6 = false;
                    class272.field4430++;
                }
            }
        }
    }
}
