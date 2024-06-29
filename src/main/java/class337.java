import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class337 {

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Llc;")
    public static class435 field4658 = new class435(38, -1);

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Llc;")
    public static class435 field4659 = new class435(108, 4);

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "Lmg;")
    public static class495 field4660 = new class495();

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Lmr;")
    public static class611 field4661 = new class611();

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([BII)[B")
    public static final byte[] method2076(byte[] arg0, int arg1, int arg2) {
        field4656++;
        int var3 = 88 / ((arg2 - 78) / 38);
        byte[] var4 = new byte[arg1];
        class85.method683(arg0, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIZLaa;IILha;ILqk;)V")
    public static final void method2077(int arg0, int arg1, boolean arg2, class569 arg3, int arg4, int arg5, class543 arg6, int arg7, class146 arg8) {
        if (!arg2) {
            method2077(-81, 96, false, null, -70, -1, null, 0, null);
        }
        field4655++;
        class463 var9 = class386.field5581.method2687(arg4, 36);
        if (var9 == null || !var9.field6601 || !var9.method2811(class226.field3372, (byte) 92)) {
            return;
        }
        if (var9.field6603 != null) {
            int[] var10 = new int[var9.field6603.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class165.field2351 == 4) {
                    var28 = (int) class680.field9668 & 0x3FFF;
                } else {
                    var28 = (int) class680.field9668 + class225.field3350 & 0x3FFF;
                }
                int var29 = class125.field1736[var28];
                int var30 = class125.field1729[var28];
                if (class165.field2351 != 4) {
                    var29 = var29 * 256 / (class17.field162 + 256);
                    var30 = var30 * 256 / (class17.field162 + 256);
                }
                var10[var11 * 2] = ((arg1 + (var9.field6603[var11 * 2 + 1] * 4)) * var29 + (var9.field6603[var11 * 2] * 4 + arg5) * var30 >> 14) + arg8.field2016 / 2 + arg0;
                var10[var11 * 2 + 1] = arg7 + (arg8.field1997 / 2) - ((arg1 + (var9.field6603[var11 * 2 + 1] * 4)) * var30 - (arg5 + (var9.field6603[var11 * 2] * 4)) * var29 >> 14);
            }
            class450.method2749(arg6, var10, var9.field6583, arg8.field2025, arg8.field2111);
            if (var9.field6611 > 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[(var12 + 1) * 2];
                    int var23 = var10[(var12 + 1) * 2 + 1];
                    if (var20 > var22) {
                        int var24 = var20;
                        int var25 = var21;
                        var20 = var22;
                        var22 = var24;
                        var21 = var23;
                        var23 = var25;
                    } else if (var20 == var22 && var21 > var23) {
                        int var26 = var21;
                        var21 = var23;
                        var23 = var26;
                    }
                    arg6.method368(var20, var21, var22, var23, var9.field6574[var9.field6590[var12] & 0xFF], 1, arg3, arg0, arg7, var9.field6611, var9.field6607, var9.field6570);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var14 > var16) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg6.method368(var13, var14, var15, var16, var9.field6574[var9.field6590[var9.field6590.length - 1] & 0xFF], 1, arg3, arg0, arg7, var9.field6611, var9.field6607, var9.field6570);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg6.method276(var10[var27 * 2], var10[var27 * 2 + 1], var10[var27 * 2 + 2], var10[(var27 + 1) * 2 + 1], var9.field6574[var9.field6590[var27] & 0xFF], 1, arg3, arg0, arg7);
                }
                arg6.method276(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6574[var9.field6590[var9.field6590.length - 1] & 0xFF], 1, arg3, arg0, arg7);
            }
        }
        class515 var31 = null;
        if (var9.field6580 != -1) {
            var31 = var9.method2812(arg6, false, (byte) -123);
            if (var31 != null) {
                class438.method2678(arg0, var31, arg3, arg5, arg1, arg7, arg8, -90);
            }
        }
        if (var9.field6585 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method787();
        }
        class400 var33 = class564.field8163;
        class502 var34 = class426.field6164;
        if (var9.field6606 == 1) {
            var33 = class208.field3141;
            var34 = class79.field1140;
        }
        if (var9.field6606 == 2) {
            var33 = class193.field2838;
            var34 = class119.field1635;
        }
        class72.method629(arg7, arg5, arg8, arg1, var34, var32, arg3, var9.field6573, var9.field6585, var33, arg0, -880112948);
        return;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static final void method2078(int arg0) {
        if (arg0 != 108) {
            return;
        }
        field4657++;
        if (class486.field6999 == null) {
            return;
        }
        try {
            String var1 = class486.field6999.getParameter("cookiehost");
            int var2 = (int) (class465.method2818(255) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class665.method3804(-83, class486.field6999, "document.cookie=\"" + var3 + "\"");
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public static void method2079(boolean arg0) {
        field4660 = null;
        field4658 = null;
        field4661 = null;
        field4659 = null;
        if (arg0) {
            field4661 = null;
        }
    }
}
