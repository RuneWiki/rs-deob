import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class173 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIIII)V", line = 14)
    public static final void method1272(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2821++;
        if (class255.method1799(arg2, false)) {
            class235.method1630(-1, arg0, -1, arg1, class44.field845[arg2], arg3);
            if (arg4 != -105) {
                field2820 = 53;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZIIBI)V", line = 33)
    public static final void method1273(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2825++;
        if (class78.field1319 == arg1 && class159.field2662 == arg0 && class188.field3022 == arg3 || class118.method893(2)) {
            return;
        }
        class159.field2662 = arg0;
        class78.field1319 = arg1;
        class188.field3022 = arg3;
        if (class118.method893(2)) {
            class188.field3022 = 0;
        }
        if (arg2) {
            class271.method1879(28, 17646);
        } else {
            class271.method1879(25, 17646);
        }
        class28.method269((byte) -105, class128.field2210, true);
        int var7 = class263.field4407;
        class263.field4407 = (arg0 - 6) * 8;
        int var8 = class196.field3152;
        class196.field3152 = (arg1 - 6) * 8;
        class17.field263 = class132.method976(class78.field1319 * 8, class159.field2662 * 8, -8824);
        int var9 = class263.field4407 - var7;
        int var10 = class196.field3152 - var8;
        class45.field880 = null;
        int var11 = class196.field3152;
        int var12 = class263.field4407;
        if (arg2) {
            class177.field2923 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class42 var14 = class91.field1656[var13];
                if (var14 != null) {
                    var14.field1531 -= var10 * 128;
                    var14.field1497 -= var9 * 128;
                    if (var14.field1531 >= 0 && var14.field1531 <= 13184 && var14.field1497 >= 0 && var14.field1497 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1489[var15] -= var10;
                            var14.field1532[var15] -= var9;
                        }
                        class65.field1229[class177.field2923++] = var13;
                    } else {
                        class91.field1656[var13].field796 = null;
                        class91.field1656[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class42 var17 = class91.field1656[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field1489[var18] -= var10;
                        var17.field1532[var18] -= var9;
                    }
                    var17.field1497 -= var9 * 128;
                    var17.field1531 -= var10 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class258 var20 = class298.field4979[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1489[var21] -= var10;
                    var20.field1532[var21] -= var9;
                }
                var20.field1497 -= var9 * 128;
                var20.field1531 -= var10 * 128;
            }
        }
        class160.field2671 = arg3;
        class255.field4233.method1811(0, arg4, false, arg6);
        byte var22 = 104;
        if (arg5 <= 98) {
            field2824 = -26;
        }
        byte var23 = 0;
        byte var24 = 1;
        if (var10 < 0) {
            var24 = -1;
            var22 = -1;
            var23 = 103;
        }
        byte var25 = 104;
        byte var26 = 0;
        byte var27 = 1;
        if (var9 < 0) {
            var26 = 103;
            var25 = -1;
            var27 = -1;
        }
        for (int var28 = var23; var28 != var22; var28 += var24) {
            for (int var29 = var26; var29 != var25; var29 += var27) {
                int var30 = var10 + var28;
                int var31 = var9 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class51.field983[var32][var28][var29] = class51.field983[var32][var30][var31];
                    } else {
                        class51.field983[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class65 var33 = (class65) class121.field2086.method1971(100); var33 != null; var33 = (class65) class121.field2086.method1967(100)) {
            var33.field1205 -= var10;
            var33.field1228 -= var9;
            if (var33.field1205 < 0 || var33.field1228 < 0 || var33.field1205 >= 104 || var33.field1228 >= 104) {
                var33.method2095(0);
            }
        }
        class227.field3747 = 0;
        if (class185.field2985 != 0) {
            class170.field2794 -= var9;
            class185.field2985 -= var10;
        }
        if (arg2) {
            class186.field3007 -= var10;
            class238.field3922 -= var10 * 128;
            class244.field4023 -= var9;
            class228.field3775 -= var9;
            class233.field3836 -= var10;
            class289.field4841 -= var9 * 128;
        } else {
            class103.field1814 = 1;
        }
        if (class21.field350 && arg2 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class153.method1195(1120341478);
        }
        class172.field2806 = -1;
        class55.field1066.method1966((byte) 85);
        class265.field4445.method1966((byte) 97);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)Z", line = 276)
    public static final boolean method1274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class185.field2982[arg0][var8][var9] == -class81.field1425) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class78.field1316[arg0][arg1][arg3] + arg5;
            if (!class10.method64(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class10.method64(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class10.method64(var10, var12, var14)) {
                return false;
            } else if (class10.method64(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class188.method1354(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class10.method64(var6 + 1, class78.field1316[arg0][arg1][arg3] + arg5, var7 + 1) && class10.method64(var6 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class10.method64(var6 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class10.method64(var6 + 1, class78.field1316[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)Z", line = 338)
    public static final boolean method1275(int arg0, byte arg1) {
        field2822++;
        if (arg1 > -76) {
            field2824 = 95;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }
}
