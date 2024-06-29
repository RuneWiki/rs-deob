import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class175 {

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "[Z")
    public static boolean[] field2288 = new boolean[8];

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "B")
    public byte field2276;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "B")
    public byte field2278;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "B")
    public byte field2279;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "B")
    public byte field2282;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "B")
    public byte field2287;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "B")
    public byte field2293;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "B")
    public byte field2294;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "Lep;")
    public static class146 field2291;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "S")
    public short field2295;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Z")
    public boolean field2273;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Z")
    public boolean field2274;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Z")
    public boolean field2275;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Z")
    public boolean field2277;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Z")
    public boolean field2281;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
    public boolean field2285;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Z")
    public boolean field2286;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "Z")
    public boolean field2289;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Z")
    public boolean field2292;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        class307.field4392.method212(-85);
        field2284++;
        if (arg0 < 16) {
            method1071((byte) -106);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILvp;I)V")
    public static final void method1069(byte arg0, int arg1, class194 arg2, int arg3) {
        field2296++;
        if ((arg1 & 0x800) != 0) {
            int var4 = class114.field1556.method1694(-1);
            arg2.field270 = class114.field1556.method1674((byte) -115);
            arg2.field234 = class114.field1556.method1665(14684);
            arg2.field287 = (var4 & 0x8000) != 0;
            arg2.field277 = var4 & 0x7FFF;
            arg2.field244 = class50.field698 + arg2.field277 + arg2.field270;
        }
        if ((arg1 & 0x20) != 0) {
            arg2.field255 = class114.field1556.method1712(false);
            if (arg2.field255.charAt(0) == '~') {
                arg2.field255 = arg2.field255.substring(1);
                class215.method1352(arg2.method1218(false, (byte) -44), 2, -64, arg2.method1220(true, true), 0, arg2.field255);
            } else if (class100.field1350 == arg2) {
                class215.method1352(arg2.method1218(false, (byte) -44), 2, -65, arg2.method1220(true, true), 0, arg2.field255);
            }
            arg2.field251 = 150;
            arg2.field276 = 0;
            arg2.field258 = 0;
        }
        if ((arg1 & 0x4) != 0) {
            int var5 = class114.field1556.method1680(-1647926640);
            int var6 = class114.field1556.method1674((byte) -123);
            arg2.method132(0, var5, var6, class50.field698);
            arg2.field247 = class50.field698 + 300;
            arg2.field252 = class114.field1556.method1702(4095);
        }
        if ((arg1 & 0x80) != 0) {
            arg2.field230 = class114.field1556.method1685(8104);
            if (arg2.field230 == 65535) {
                arg2.field230 = -1;
            }
        }
        if ((arg1 & 0x10) != 0) {
            int var7 = class114.field1556.method1697(102);
            byte[] var8 = new byte[var7];
            class265 var9 = new class265(var8);
            class114.field1556.method1679(var8, var7, 0, (byte) 105);
            class165.field2155[arg3] = var9;
            arg2.method1214(var9, -44);
        }
        if ((arg1 & 0x2) != 0) {
            arg2.field221 = class114.field1556.method1684((byte) 79);
            arg2.field274 = class114.field1556.method1694(-1);
        }
        if ((arg1 & 0x200) != 0) {
            int var10 = class114.field1556.method1697(-97);
            int[] var11 = new int[var10];
            int[] var12 = new int[var10];
            int[] var13 = new int[var10];
            for (int var14 = 0; var14 < var10; var14++) {
                int var15 = class114.field1556.method1705(false);
                if (var15 == 65535) {
                    var15 = -1;
                }
                var11[var14] = var15;
                var12[var14] = class114.field1556.method1674((byte) 61);
                var13[var14] = class114.field1556.method1705(false);
            }
            class39.method304(arg2, var11, false, var13, var12);
        }
        if ((arg1 & 0x8) != 0) {
            int var16 = class114.field1556.method1705(false);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class114.field1556.method1665(14684);
            class263.method1647(var16, (byte) -127, var17, arg2);
        }
        if (arg0 < 70) {
            method1071((byte) 63);
        }
        if ((arg1 & 0x100) != 0) {
            int var18 = class114.field1556.method1685(8104);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class114.field1556.method1682(65280);
            boolean var20 = true;
            if (var18 != -1 && arg2.field228 != -1) {
                if (arg2.field228 == var18) {
                    class333 var21 = class395.method2586(var18, -6861);
                    if (var21.field4922 && var21.field4924 != -1) {
                        class15 var22 = class391.method2551(var21.field4924, (byte) -90);
                        int var23 = var22.field166;
                        if (var23 == 0) {
                            var20 = false;
                        } else if (var23 == 1) {
                            var20 = true;
                        } else if (var23 == 2) {
                            arg2.field282 = 0;
                            var20 = false;
                        }
                    }
                } else {
                    class333 var24 = class395.method2586(var18, -6861);
                    class333 var25 = class395.method2586(arg2.field228, -6861);
                    if (var24.field4924 != -1 && var25.field4924 != -1) {
                        class15 var26 = class391.method2551(var24.field4924, (byte) -123);
                        class15 var27 = class391.method2551(var25.field4924, (byte) -122);
                        if (var26.field153 < var27.field153) {
                            var20 = false;
                        }
                    }
                }
            }
            if (var20) {
                arg2.field263 = 0;
                arg2.field226 = 1;
                arg2.field262 = (var19 & 0xFFFF) + class50.field698;
                arg2.field261 = var19 >> 16;
                arg2.field237 = 0;
                arg2.field228 = var18;
                if (class50.field698 < arg2.field262) {
                    arg2.field237 = -1;
                }
                if (arg2.field228 != -1 && class50.field698 == arg2.field262) {
                    int var28 = class395.method2586(arg2.field228, -6861).field4924;
                    if (var28 != -1) {
                        class15 var29 = class391.method2551(var28, (byte) -120);
                        if (var29 != null && var29.field150 != null) {
                            class277.method1770(arg2.field5284, 21155, class100.field1350 == arg2, 0, arg2.field5298, var29);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1000) != 0) {
            arg2.field256 = class114.field1556.method1702(4095);
            arg2.field224 = class114.field1556.method1697(82);
            arg2.field246 = class114.field1556.method1702(4095);
            arg2.field241 = class114.field1556.method1697(98);
            arg2.field281 = class114.field1556.method1685(8104) + class50.field698;
            arg2.field220 = class114.field1556.method1705(false) + class50.field698;
            arg2.field242 = class114.field1556.method1674((byte) -111);
            arg2.field309 = 1;
            arg2.field305 = 0;
        }
        if ((arg1 & 0x400) != 0) {
            int var30 = class114.field1556.method1680(-1647926640);
            int var31 = class114.field1556.method1697(-92);
            arg2.method132(0, var30, var31, class50.field698);
        }
        if ((arg1 & 0x40) == 0) {
            return;
        }
        int var32 = class114.field1556.method1694(-1);
        int var33 = class114.field1556.method1674((byte) 85);
        int var34 = class114.field1556.method1665(14684);
        int var35 = class114.field1556.field3915;
        boolean var36 = (var32 & 0x8000) != 0;
        if (arg2.field2756 != null && arg2.field2778 != null) {
            boolean var37 = false;
            if (var33 <= 1) {
                if (!var36 && (class261.field3808 && !class240.field3381 || class35.field570)) {
                    var37 = true;
                } else if (class24.method216(arg2.field2756, -116)) {
                    var37 = true;
                }
            }
            if (!var37 && class306.field4378 == 0) {
                class17.field188.field3915 = 0;
                class114.field1556.method1710(0, var34, (byte) -83, class17.field188.field3879);
                class17.field188.field3915 = 0;
                int var38 = -1;
                String var40;
                if (var36) {
                    var32 &= 0x7FFF;
                    class348 var39 = class228.method1417(10, class17.field188);
                    var38 = var39.field5174;
                    var40 = var39.field5169.method371(class17.field188, -8507);
                } else {
                    var40 = class297.method1886(0, class323.method1998(63, class8.method62(class17.field188, 32767)));
                }
                arg2.field255 = var40.trim();
                arg2.field251 = 150;
                arg2.field276 = var32 >> 8;
                arg2.field258 = var32 & 0xFF;
                int var41;
                if (var33 == 1 || var33 == 2) {
                    var41 = var36 ? 17 : 1;
                } else {
                    var41 = var36 ? 17 : 2;
                }
                if (var33 == 2) {
                    class316.method1968("<img=1>" + arg2.method1220(true, true), "<img=1>" + arg2.method1218(false, (byte) -44), -23645, var41, var40, 0, (String) null, var38);
                } else if (var33 == 1) {
                    class316.method1968("<img=0>" + arg2.method1220(true, true), "<img=0>" + arg2.method1218(false, (byte) -44), -23645, var41, var40, 0, (String) null, var38);
                } else {
                    class316.method1968(arg2.method1220(true, true), arg2.method1218(false, (byte) -44), -23645, var41, var40, 0, (String) null, var38);
                }
            }
        }
        class114.field1556.field3915 = var34 + var35;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static final void method1070(int arg0) {
        field2290++;
        class439.field6430 = 0;
        class122.field1630 = 0;
        class337.method2236(3943);
        class273.method1746(5816);
        class353.method2321(5784);
        class387.method2528(-1);
        if (arg0 <= 107) {
            return;
        }
        for (int var1 = 0; var1 < class122.field1630; var1++) {
            int var3 = class188.field2557[var1];
            if (class50.field698 != class125.field1664[var3].field260) {
                if (class125.field1664[var3].field2782 > 0) {
                    class104.method708(class125.field1664[var3], 4);
                }
                class125.field1664[var3] = null;
            }
        }
        if (class413.field6176 != class114.field1556.field3915) {
            throw new RuntimeException("gpp1 pos:" + class114.field1556.field3915 + " psize:" + class413.field6176);
        }
        for (int var2 = 0; var2 < class153.field2004; var2++) {
            if (class125.field1664[class66.field943[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class153.field2004);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        if (arg0 >= 5) {
            field2288 = null;
            field2291 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1072(int arg0, String arg1) {
        field2283++;
        class309.field4426 = arg1;
        if (class361.field5285.field29 == null) {
            return;
        }
        try {
            if (arg0 != 1) {
                method1071((byte) -111);
            }
            String var2 = class361.field5285.field29.getParameter("cookieprefix");
            String var3 = class361.field5285.field29.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class228.method1418((byte) 40, class55.method375(-3913) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class67.method435(arg0 ^ 0x20A7, "document.cookie=\"" + var5 + "\"", class361.field5285.field29);
        } catch (Throwable var6) {
        }
    }
}
