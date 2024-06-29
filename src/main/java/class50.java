import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class50 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[S")
    public static short[] field647 = new short[256];

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field648 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field650 = -2;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Leh;")
    public static class137 field652;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[[[B")
    public static byte[][][] field646;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZIIIZIZLtc;)Lib;")
    public static final class56 method283(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, class134 arg8) {
        class108 var9 = class256.method1753(-2, arg0);
        field649++;
        if (arg6 > 1 && var9.field1481 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg6 >= var9.field1460[var11] && var9.field1460[var11] != 0) {
                    var10 = var9.field1481[var11];
                }
            }
            if (var10 != -1) {
                var9 = class256.method1753(arg2 ^ 0xECAD138E, var10);
            }
        }
        class125 var12 = var9.method666(arg8, (byte) -103);
        if (var12 == null) {
            return null;
        }
        class227 var13 = null;
        if (var9.field1489 != -1) {
            var13 = (class227) method283(var9.field1501, true, 324201584, 0, 1, false, 10, true, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1456 != -1) {
            var13 = (class227) method283(var9.field1498, false, 324201584, arg3, arg4, false, arg6, true, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class217.field3483;
        int var15 = class217.field3481;
        int[] var16 = new int[4];
        int var17 = class217.field3478;
        class217.method1522(var16);
        class227 var18 = new class227(36, 32);
        class217.method1536(var18.field3640, 36, 32);
        class174.method1194();
        class174.method1205(16, 16);
        class174.field2751 = false;
        if (arg2 != 324201584) {
            method286(10);
        }
        int var19 = var9.field1483;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class174.field2753[var9.field1521] * var19 >> 16;
        int var21 = class174.field2759[var9.field1521] * var19 >> 16;
        var12.method831(0, var9.field1530, var9.field1516, var9.field1521, var9.field1479, (var20 + var9.field1515) - (var12.method102() / 2), var9.field1515 + var21, -1L);
        if (arg4 >= 1) {
            var18.method1609(1);
            if (arg4 >= 2) {
                var18.method1609(16777215);
            }
            class217.method1536(var18.field3640, 36, 32);
        }
        if (arg3 != 0) {
            var18.method1611(arg3);
        }
        if (var9.field1489 != -1) {
            var13.method315(0, 0);
        } else if (var9.field1456 != -1) {
            class217.method1536(var13.field3640, 36, 32);
            var18.method315(0, 0);
            var18 = var13;
        }
        if (arg5 && (var9.field1492 == 1 || arg6 != 1) && arg6 != -1) {
            class70.field870.method687(class129.method881(arg6, 1000000), 0, 9, 16776960, 1);
        }
        class217.method1536(var14, var15, var17);
        class217.method1534(var16);
        class174.method1194();
        class174.field2751 = true;
        return var18;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIILbl;)V")
    public static final void method284(int arg0, int arg1, int arg2, int arg3, class259 arg4) {
        field645++;
        if (class286.field4571 == arg4 || class34.field437 >= 400) {
            return;
        }
        String var11;
        if (arg4.field4206 == 0) {
            boolean var5 = true;
            if (class286.field4571.field4210 != -1 && arg4.field4210 != -1) {
                int var6 = class286.field4571.field4210 >= arg4.field4210 ? arg4.field4210 : class286.field4571.field4210;
                int var7 = class286.field4571.field4200 <= arg4.field4200 ? arg4.field4200 : class286.field4571.field4200;
                int var8 = class286.field4571.field4200 - arg4.field4200;
                int var9 = (var7 * 10 / 100) + var6 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var9 < var8) {
                    var5 = false;
                }
            }
            String var10 = class297.field4695 == 1 ? class46.field584 : class258.field4187;
            if (arg4.field4195 > arg4.field4200) {
                var11 = arg4.method1770(-1) + (var5 ? class251.method1727(arg4.field4200, class286.field4571.field4200, 95) : "<col=ffffff>") + " (" + var10 + arg4.field4200 + "+" + (arg4.field4195 - arg4.field4200) + ")";
            } else {
                var11 = arg4.method1770(-1) + (var5 ? class251.method1727(arg4.field4200, class286.field4571.field4200, 127) : "<col=ffffff>") + " (" + var10 + arg4.field4200 + ")";
            }
        } else {
            var11 = arg4.method1770(arg2 - 19507) + " (" + class261.field4226 + arg4.field4206 + ")";
        }
        if (arg2 != 19506) {
            method285(-6, -78);
        }
        if (class32.field432 == 1) {
            class195.method1373(arg1, class138.field2217 + " -> <col=ffffff>" + var11, class153.field2379, (long) arg3, (byte) -112, arg0, class207.field3316, (short) 48);
            class73.field917++;
        } else if (!class247.field4076) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class163.field2597[var12] != null) {
                    class83.field1035++;
                    short var14 = 0;
                    if (class297.field4695 == 0 && class163.field2597[var12].equalsIgnoreCase(class237.field3921)) {
                        if (arg4.field4200 > class286.field4571.field4200) {
                            var14 = 2000;
                        }
                        if (class286.field4571.field4215 != 0 && arg4.field4215 != 0) {
                            if (class286.field4571.field4215 == arg4.field4215) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class56.field718[var12]) {
                        var14 = 2000;
                    }
                    boolean var15 = false;
                    short var16 = class173.field2746[var12];
                    short var17 = (short) (var14 + var16);
                    class195.method1373(arg1, "<col=ffffff>" + var11, class27.field390[var12], (long) arg3, (byte) -117, arg0, class163.field2597[var12], var17);
                }
            }
        } else if ((class78.field984 & 0x8) != 0) {
            class23.field306++;
            class195.method1373(arg1, class144.field2284 + " -> <col=ffffff>" + var11, class78.field983, (long) arg3, (byte) -83, arg0, class283.field4511, (short) 45);
        }
        for (int var13 = 0; var13 < class34.field437; var13++) {
            if (class155.field2423[var13] == 33) {
                class78.field977[var13] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method285(int arg0, int arg1) {
        field651++;
        if (arg0 == 100 && class171.field2711 > 0) {
            byte[] var2 = class52.field682[--class171.field2711];
            class52.field682[class171.field2711] = null;
            return var2;
        } else if (arg0 == 5000 && class85.field1049 > 0) {
            byte[] var3 = class108.field1502[--class85.field1049];
            class108.field1502[class85.field1049] = null;
            return var3;
        } else if (arg0 == 30000 && class238.field3938 > 0) {
            byte[] var4 = class118.field1676[--class238.field3938];
            class118.field1676[class238.field3938] = null;
            return var4;
        } else if (arg1 == 0) {
            return new byte[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        field647 = null;
        field648 = null;
        int var1 = 37 / ((arg0 + 26) / 36);
        field646 = null;
        field652 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field653++;
        int var9 = arg3 - arg8;
        int var10 = arg4 - arg6;
        if (arg1 != -34) {
            method284(8, -121, -97, -17, (class259) null);
        }
        int var11 = (arg0 - arg5 << 16) / var10;
        int var12 = (arg2 - arg7 << 16) / var9;
        class175.method1208(arg3, (byte) -91, var11, var12, 0, arg5, arg4, 0, arg6, arg7, arg8);
    }
}
