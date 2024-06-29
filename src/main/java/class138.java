import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class138 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lrg;")
    public static class292[] field2078 = new class292[29];

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljd;")
    public static class95 field2075;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method1042(char arg0, int arg1) {
        field2077++;
        if (arg1 != 31451) {
            method1044(93);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V", line = 18)
    public static final void method1043(int arg0, boolean arg1) {
        field2079++;
        if (arg0 != 57408375) {
            method1044(61);
        }
        int[] var2 = null;
        byte[][] var3;
        byte var4;
        if (class73.field1058 && arg1) {
            var3 = class5.field67;
            var4 = 1;
        } else {
            var4 = 4;
            var3 = class137.field2069;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class293.method2025((byte) 84);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class262.field4040[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x36BFB77) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var9 & 0x7) >> 1;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FF8) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class139.field2087.length; var15++) {
                                if (class139.field2087[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class132.method1022(var12, var11, var3[var15], var6 * 8, class91.field1323, 19, var5, arg1, var7 * 8, var13, var10);
                                    var8 = true;
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class40.method307(var5, 8, 8, var6 * 8, var7 * 8, 104);
                    }
                }
            }
        }
        if (var2 == null) {
            class277.field4292 = -1;
            return;
        }
        class262.field4028 = var2[2];
        class213.field3268 = var2[4];
        class277.field4292 = var2[0];
        class94.field1333 = var2[3];
        class180.field2853 = var2[1];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 131)
    public static void method1044(int arg0) {
        if (arg0 != 1) {
            method1044(93);
        }
        field2075 = null;
        field2078 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 143)
    public static final void method1045(int arg0, int arg1, int arg2) {
        class95.field1368 = true;
        class168.field2724 = arg0;
        class71.field1019 = arg1;
        class240.field3669 = arg2;
        class257.field3933 = -1;
        class264.field4101 = -1;
    }
}
