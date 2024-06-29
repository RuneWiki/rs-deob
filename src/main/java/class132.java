import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class132 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field1908 = 2;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
    public static int[] field1904 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lkf;")
    public static class249 field1905;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZILnk;II)V", line = 4)
    public static final void method904(int arg0, boolean arg1, int arg2, class16 arg3, int arg4, int arg5) {
        class19.field231 = arg5;
        field1901++;
        class203.field3094 = arg1;
        class282.field4498 = arg3;
        class24.field281 = 10000;
        class28.field330 = arg4;
        class258.field4083 = arg2;
        class2.field23 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)Z", line = 24)
    public static final boolean method905(int arg0, int arg1, int arg2, byte[] arg3) {
        field1910++;
        boolean var4 = true;
        class143 var5 = new class143(arg3);
        int var6 = -1;
        label61: while (true) {
            int var7 = var5.method1019(25180);
            if (var7 == 0) {
                if (arg2 <= 70) {
                    method909((byte) -51);
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1027(false);
                    if (var11 == 0) {
                        continue label61;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var5.method1043(true) >> 2;
                    int var14 = arg0 + var12;
                    int var15 = (var8 & 0xFE2) >> 6;
                    int var16 = var15 + arg1;
                    if (var16 > 0 && var14 > 0 && var16 < 103 && var14 < 103) {
                        class234 var17 = class123.method795(0, var6);
                        if (var13 != 22 || class353.field5629 || var17.field3598 != 0 || var17.field3602 == 1 || var17.field3604) {
                            var9 = true;
                            if (!var17.method1613(0)) {
                                class65.field779++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1027(false);
                if (var10 == 0) {
                    break;
                }
                var5.method1043(true);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lrj;I)V", line = 106)
    public static final void method906(class22 arg0, int arg1) {
        field1899++;
        class164.field2522 = 3;
        class361.method2521(-83, true);
        class16.field164 = 2;
        client.field4441 = 0;
        class171.field2601 = true;
        class10.field104 = true;
        class24.field285 = 0;
        class327.field5233 = true;
        class353.field5629 = true;
        class31.field365 = 255;
        if (arg1 != -6177) {
            method906((class22) null, -76);
        }
        class189.field2847 = 127;
        class290.field4566 = true;
        class38.field430 = true;
        class347.field5512 = true;
        class13.field136 = true;
        class76.field993 = true;
        class139.field2087 = true;
        class81 var2 = null;
        class226.field3413 = 0;
        class90.field1192 = true;
        class213.field3240 = 127;
        class352.field5609 = 0;
        if (class357.field5667 < 96) {
            class141.method986(0);
        } else {
            class141.method986(2);
        }
        class75.field966 = 0;
        class222.field3355 = false;
        class283.field4519 = false;
        class261.field4133 = 0;
        class178.field2680 = true;
        class151.field2386 = false;
        class161.field2482 = 0;
        try {
            class153 var3 = arg0.method167("runescape", 7);
            while (var3.field2419 == 0) {
                class19.method140(1L, 16711680);
            }
            if (var3.field2419 == 1) {
                var2 = (class81) var3.field2421;
                byte[] var4 = new byte[(int) var2.method530((byte) -31)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method527(var4.length - var5, var4, var5, (byte) 2);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class342.method2347(arg1 + 6171, new class143(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method532((byte) 112);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z", line = 193)
    public static final boolean method907(int arg0, int arg1) {
        field1909++;
        class122 var2 = class73.method452(-3301, arg0);
        if (var2 == null) {
            return false;
        } else if (class22.field253 == 1 || class22.field253 == 2 || class296.field4656 == 2) {
            class61.field726 = var2.field1685;
            class196.field2976 = var2.field1678;
            if (class296.field4656 != 0) {
                class345.field5479 = class196.field2976 + 50000;
                class43.field490 = class196.field2976 + 40000;
                class10.field111 = class43.field490;
            }
            return true;
        } else {
            String var3 = "";
            if (class296.field4656 != 0) {
                var3 = ":" + (var2.field1678 + 7000);
            }
            String var4 = "";
            if (client.field4444 != null) {
                var4 = "/p=" + client.field4444;
            }
            String var5 = "http://" + var2.field1685 + var3 + "/l=" + class234.field3567 + "/a=" + class233.field3522 + var4 + "/j" + (class324.field5210 ? "1" : "0") + ",o" + (class140.field2131 ? "1" : "0") + ",a2,m" + (class241.field3699 ? "1" : "0");
            try {
                class5.field59.getAppletContext().showDocument(new URL(var5), "_self");
                if (arg1 != 5539) {
                    field1904 = (int[]) null;
                }
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 246)
    public static void method908(int arg0) {
        field1904 = null;
        field1902 = null;
        if (arg0 <= 103) {
            method908(-77);
        }
        field1905 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 265)
    public static final void method909(byte arg0) {
        if (arg0 != -96) {
            field1908 = -107;
        }
        class208.field3144.method378(0);
        field1911++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZI)V", line = 276)
    public static final void method910(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            method905(97, 53, 42, (byte[]) null);
        }
        class105.field1448[0].method1089(arg1, arg2);
        int var6 = (arg5 - 32) * arg5 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg3 / (arg0 - arg5);
        class105.field1448[1].method1089(arg1, arg5 + arg2 - 16);
        if (class272.field4317) {
            class239.method1659(arg1, arg2 + 16, 16, arg5 - 32, class323.field5171);
            class239.method1659(arg1, arg2 + var7 + 16, 16, var6, class149.field2363);
            class239.method1666(arg1, arg2 + var7 + 16, var6, class85.field1117);
            class239.method1666(arg1 + 1, arg2 + 16 + var7, var6, class85.field1117);
            class239.method1657(arg1, arg2 + var7 + 16, 16, class85.field1117);
            class239.method1657(arg1, arg2 + var7 + 17, 16, class85.field1117);
            class239.method1666(arg1 + 15, arg2 + var7 + 16, var6, class17.field201);
            class239.method1666(arg1 + 14, arg2 + 17 + var7, var6 - 1, class17.field201);
            class239.method1657(arg1, arg2 + var7 + var6 + 15, 16, class17.field201);
            class239.method1657(arg1 + 1, var7 + 14 + var6 + arg2, 15, class17.field201);
        } else {
            class343.method2352(arg1, arg2 + 16, 16, arg5 - 32, class323.field5171);
            class343.method2352(arg1, arg2 + var7 + 16, 16, var6, class149.field2363);
            class343.method2376(arg1, arg2 + var7 + 16, var6, class85.field1117);
            class343.method2376(arg1 + 1, arg2 + 16 - -var7, var6, class85.field1117);
            class343.method2365(arg1, arg2 + var7 + 16, 16, class85.field1117);
            class343.method2365(arg1, arg2 + var7 + 17, 16, class85.field1117);
            class343.method2376(arg1 + 15, arg2 - (-var7 + -16), var6, class17.field201);
            class343.method2376(arg1 + 14, var7 + 17 + arg2, var6 - 1, class17.field201);
            class343.method2365(arg1, var7 + arg2 + var6 + 15, 16, class17.field201);
            class343.method2365(arg1 + 1, arg2 + 14 - -var7 + var6, 15, class17.field201);
        }
        field1907++;
    }
}
