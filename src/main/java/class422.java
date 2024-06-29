import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class422 extends class276 {

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field6029 = 0;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field6019;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "J")
    public long field6023;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "[Lk;")
    public static class337[] field6026;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lae;ZIZILsj;Lqe;IIILae;I)Lgj;")
    public static final class381 method2662(class134 arg0, boolean arg1, int arg2, boolean arg3, int arg4, class266 arg5, class274 arg6, int arg7, int arg8, int arg9, class134 arg10, int arg11) {
        field6034++;
        class381 var12 = class341.method2192(arg11, arg8, arg9, arg2, arg7, (byte) 126, arg6, arg10);
        if (var12 != null) {
            return var12;
        }
        class163 var13 = class50.method288(arg4 ^ arg4, arg2);
        if (arg8 > 1 && var13.field2225 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg8 >= var13.field2235[var15] && var13.field2235[var15] != 0) {
                    var14 = var13.field2225[var15];
                }
            }
            if (var14 != -1) {
                var13 = class50.method288(0, var14);
            }
        }
        class160 var16 = class248.method1690(class215.field3044, true, 0, var13.field2293);
        if (var16 == null) {
            return null;
        }
        if (var13.field2273 != null) {
            for (int var17 = 0; var17 < var13.field2273.length; var17++) {
                if (var13.field2284 == null || var17 >= var13.field2284.length) {
                    var16.method1031(var13.field2273[var17], 0, var13.field2233[var17]);
                } else {
                    var16.method1031(var13.field2273[var17], arg4 + 18368, class369.field5215[var13.field2284[var17] & 0xFF]);
                }
            }
        }
        if (var13.field2247 != null) {
            for (int var18 = 0; var18 < var13.field2247.length; var18++) {
                var16.method1027((byte) 70, var13.field2241[var18], var13.field2247[var18]);
            }
        }
        if (arg6 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class50.field601[var19].length > arg6.field3885[var19]) {
                    var16.method1031(class279.field3947[var19], arg4 ^ 0xFFFFB840, class50.field601[var19][arg6.field3885[var19]]);
                }
                if (class202.field2904[var19].length > arg6.field3885[var19]) {
                    var16.method1031(class235.field3293[var19], 0, class202.field2904[var19][arg6.field3885[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field2228 != 128 || var13.field2260 != 128 || var13.field2263 != 128) {
            var21 = true;
            var20 |= 0x7;
        }
        class210 var22 = arg0.method605(var16, var20, 0, var13.field2272 + 64, 768 - -var13.field2271);
        if (!var22.method1402()) {
            return null;
        }
        if (var21) {
            var22.method1420(var13.field2228, var13.field2260, var13.field2263);
        }
        class381 var23 = null;
        if (var13.field2236 != -1) {
            var23 = method2662(arg0, true, var13.field2296, true, -18368, arg5, arg6, 1, 10, 0, arg10, 0);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field2269 != -1) {
            var23 = method2662(arg0, true, var13.field2275, false, -18368, arg5, arg6, arg7, arg8, 0, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field2252;
        if (arg3) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg7 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        arg0.method652(16, 16, 512, 512);
        class18 var25 = arg0.method639();
        var25.method129();
        arg0.method628(var25);
        arg0.method644(1.0F);
        arg0.method640(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class18 var26 = arg0.method649();
        var26.method120(-var13.field2286 << 3);
        var26.method119(var13.field2251 << 3);
        var26.method125(var13.field2232, (class158.field2055[var13.field2289 << 3] * var24 >> 15) + var13.field2281 - var22.method1405() / 2, (class158.field2059[var13.field2289 << 3] * var24 >> 15) + var13.field2281);
        var26.method130(var13.field2289 << 3);
        int var27 = arg0.method629();
        int var28 = arg0.method670();
        arg0.method633(50, Integer.MAX_VALUE);
        arg0.method600();
        arg0.method624();
        arg0.method653(0, 0, 36, 32, 0, 0);
        var22.method1416(var26, (class136) null, 1);
        arg0.method633(var27, var28);
        int[] var29 = arg0.method635(0, 0, 36, 32);
        if (arg7 >= 1) {
            var29 = class113.method703(-16777215, var29, (byte) 87);
            if (arg7 >= 2) {
                var29 = class113.method703(-1, var29, (byte) 68);
            }
        }
        if (arg11 != 0) {
            class288.method1879((byte) 41, var29, arg11);
        }
        arg0.method610(var29, 0, 36, 36, 32).method2446(0, 0);
        if (var13.field2236 != -1) {
            var23.method2446(0, 0);
        } else if (var13.field2269 != -1) {
            var23.method2446(0, 0);
        }
        if (arg9 == 1 || arg9 == 2 && (var13.field2278 == 1 || arg8 != 1) && arg8 != -1) {
            arg5.method1767(-16777215, 0, -256, class17.method111(arg8, -100), 9, 4);
        }
        int[] var30 = arg0.method635(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class429.method2704(var30[var31], -16777216);
            }
        }
        class381 var32;
        if (arg1) {
            var32 = arg0.method610(var30, 0, 36, 36, 32);
        } else {
            var32 = arg10.method610(var30, 0, 36, 36, 32);
        }
        if (!arg1) {
            class223 var33 = new class223();
            var33.field3133 = arg2;
            var33.field3124 = arg11;
            var33.field3130 = arg9;
            var33.field3126 = arg10.field1620;
            var33.field3128 = arg7;
            var33.field3129 = arg8;
            var33.field3125 = arg6 != null;
            class26.field322.method560(var33, (byte) -121, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I")
    public final int method1823(byte arg0) {
        if (arg0 <= 99) {
            return -103;
        } else {
            field6032++;
            return this.field6025;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)J")
    public final long method1825(byte arg0) {
        if (arg0 != -83) {
            method2665((byte) -111);
        }
        field6031++;
        return this.field6023;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method2663(String arg0, Throwable arg1, int arg2) {
        field6027++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class219.method1470(arg1, 0);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class401.method2553(1024, var3);
            String var4 = class130.method802(var3, -124, "%3a", ":");
            String var5 = class130.method802(var4, -93, "%40", "@");
            String var6 = class130.method802(var5, -106, "%26", "&");
            String var7 = class130.method802(var6, -114, "%23", "#");
            if (class178.field2431.field2685 != null) {
                if (arg2 >= -19) {
                    field6035 = -84;
                }
                class315 var8 = class178.field2431.method1270(new URL(class178.field2431.field2685.getCodeBase(), "clienterror.ws?c=" + class337.field4794 + "&u=" + class284.field3996 + "&v1=" + class185.field2681 + "&v2=" + class185.field2677 + "&e=" + var7), (byte) -73);
                while (var8.field4498 == 0) {
                    class150.method907(1L, (byte) -32);
                }
                if (var8.field4498 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4497;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
    public static void method2664(byte arg0) {
        field6026 = null;
        if (arg0 != -95) {
            method2663((String) null, (Throwable) null, 49);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
    public final int method1828(int arg0) {
        field6030++;
        if (arg0 != 1) {
            method2663((String) null, (Throwable) null, 82);
        }
        return this.field6033;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)V")
    public static final void method2665(byte arg0) {
        class385.field5427.method1041(arg0 ^ 0xC90EE95F);
        if (arg0 != -40) {
            field6029 = -81;
        }
        field6028++;
        class362.field5168 = null;
        class383.field5407 = 1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method2666(int arg0, int arg1) {
        field6024++;
        if (arg0 == 59 || arg0 == 51 || arg0 == 60 || arg0 == 8 || arg0 == 4) {
            return true;
        } else if (arg0 == 18 || arg0 == 1010) {
            return true;
        } else {
            if (arg1 != -8164) {
                field6035 = -16;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)I")
    public final int method1830(int arg0) {
        if (arg0 == 32431) {
            field6020++;
            return this.field6019;
        } else {
            return 105;
        }
    }

    static {
        new class362("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field6035 = 0;
        new class362("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
