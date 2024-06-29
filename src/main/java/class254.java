import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class254 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field4422 = new int[32768];

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lcd;")
    public static class64 field4424 = class44.method335((byte) 71, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lli;")
    public static class209 field4425;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
    public static int[] field4421;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 15)
    public static void method1816(int arg0) {
        field4422 = null;
        if (arg0 != -11016) {
            method1817(36, -73, 89, 39, -126, true, -86);
        }
        field4421 = null;
        field4425 = null;
        field4424 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIZI)V", line = 46)
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4423++;
        if (class295.field5066 == arg6 && class233.field3931 == arg0 && class27.field438 == arg4 || class141.method1001((byte) -47)) {
            return;
        }
        class233.field3931 = arg0;
        class27.field438 = arg4;
        class295.field5066 = arg6;
        if (class141.method1001((byte) -26)) {
            class27.field438 = 0;
        }
        if (arg5) {
            class153.method1107(28, (byte) -104);
        } else {
            class153.method1107(25, (byte) -87);
        }
        class78.method617(true, class139.field2466, (byte) -110);
        int var7 = class190.field3269;
        class190.field3269 = (arg6 - 6) * 8;
        int var8 = class121.field2184;
        class121.field2184 = (arg0 - 6) * 8;
        class140.field2476 = class238.method1731(class233.field3931 * 8, -5784, class295.field5066 * 8);
        int var9 = class190.field3269 - var7;
        int var10 = class190.field3269;
        int var11 = class121.field2184 - var8;
        int var12 = class121.field2184;
        if (arg5) {
            class218.field3707 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class232 var14 = class2.field12[var13];
                if (var14 != null) {
                    var14.field1859 -= var9 * 128;
                    var14.field1865 -= var11 * 128;
                    if (var14.field1859 >= 0 && var14.field1859 <= 13184 && var14.field1865 >= 0 && var14.field1865 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1876[var15] -= var9;
                            var14.field1898[var15] -= var11;
                        }
                        field4422[class218.field3707++] = var13;
                    } else {
                        class2.field12[var13].field3911 = null;
                        class2.field12[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class232 var17 = class2.field12[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field1876[var18] -= var9;
                        var17.field1898[var18] -= var11;
                    }
                    var17.field1865 -= var11 * 128;
                    var17.field1859 -= var9 * 128;
                }
            }
        }
        if (arg1 >= -74) {
            method1817(84, -6, -19, -111, 119, false, 31);
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class41 var20 = class284.field4888[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1876[var21] -= var9;
                    var20.field1898[var21] -= var11;
                }
                var20.field1859 -= var9 * 128;
                var20.field1865 -= var11 * 128;
            }
        }
        class20.field364 = arg4;
        class139.field2472.method320(arg2, true, false, arg3);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        if (var9 < 0) {
            var23 = -1;
            var22 = 103;
            var24 = -1;
        }
        byte var25 = 104;
        byte var26 = 0;
        byte var27 = 1;
        if (var11 < 0) {
            var26 = 103;
            var27 = -1;
            var25 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var26; var29 != var25; var29 += var27) {
                int var30 = var28 + var9;
                int var31 = var11 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class274.field4712[var32][var28][var29] = class274.field4712[var32][var30][var31];
                    } else {
                        class274.field4712[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class55 var33 = (class55) class313.field5312.method778(0); var33 != null; var33 = (class55) class313.field5312.method775(26517)) {
            var33.field929 -= var9;
            var33.field921 -= var11;
            if (var33.field929 < 0 || var33.field921 < 0 || var33.field929 >= 104 || var33.field921 >= 104) {
                var33.method232(128);
            }
        }
        if (arg5) {
            class84.field1556 -= var9;
            class245.field4263 -= var11;
            class137.field2440 -= var11;
            class258.field4456 -= var9;
        } else {
            class238.field4054 = 1;
        }
        class307.field5248 = 0;
        if (class40.field631 != 0) {
            class12.field233 -= var11;
            class40.field631 -= var9;
        }
        if (class123.field2216 && arg5 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class81.method633(127);
        }
        class232.field3924 = -1;
        class151.field2687.method776((byte) 111);
        class227.field3865.method776((byte) 115);
    }
}
