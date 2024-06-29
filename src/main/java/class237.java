import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class237 {

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lmo;")
    private class336 field3460 = new class336(64);

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lmo;")
    public class336 field3464 = new class336(50);

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lkq;")
    public class484 field3466 = new class484(250);

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lcs;")
    private class388 field3469 = new class388();

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Ljo;")
    private class233 field3470;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lnl;")
    public class435 field3454;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lnl;")
    private class435 field3455;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
    private boolean field3449;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field3472;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field3471;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lch;")
    public static class151 field3461 = new class151("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lcf;")
    public static class92 field3465 = new class92();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lok;", line = 5)
    public final class156 method1644(int arg0, int arg1) {
        field3444++;
        if (arg1 <= 83) {
            return null;
        }
        class336 var3 = this.field3460;
        class156 var4;
        synchronized (this.field3460) {
            var4 = (class156) this.field3460.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3455.method2633(class189.method1334(arg0, -124), class74.method658(0, arg0), -61);
        class156 var6 = new class156();
        var6.field2184 = this;
        var6.field2224 = arg0;
        var6.field2225 = new String[] { null, null, class18.field172.method1078(this.field3463, 100), null, null };
        var6.field2229 = new String[] { null, null, null, null, class165.field2402.method1078(this.field3463, 100) };
        if (var5 != null) {
            var6.method1120(new class161(var5), (byte) 38);
        }
        var6.method1118((byte) 31);
        if (var6.field2183 != -1) {
            var6.method1117(1, this.method1644(var6.field2217, 117), this.method1644(var6.field2183, 122));
        }
        if (var6.field2191 != -1) {
            var6.method1121(this.method1644(var6.field2191, 115), this.method1644(var6.field2174, 105), -1);
        }
        if (!this.field3449 && var6.field2177) {
            var6.field2189 = class196.field2907.method1078(this.field3463, 100);
            var6.field2229 = this.field3471;
            var6.field2168 = false;
            var6.field2225 = this.field3472;
            var6.field2158 = null;
            var6.field2200 = 0;
            if (var6.field2232 != null) {
                boolean var7 = false;
                for (class449 var8 = var6.field2232.method1097(64); var8 != null; var8 = var6.field2232.method1105(false)) {
                    class129 var9 = this.field3470.method1635((int) var8.field6382, false);
                    if (var9.field1768) {
                        var8.method2714(-84);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2232 = null;
                }
            }
        }
        class336 var10 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2116((long) arg0, (byte) -39, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;", line = 91)
    public static final String[] method1645(char arg0, String arg1, int arg2) {
        field3458++;
        int var3 = class139.method1014(arg2 + 68, arg0, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = arg2;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ltj;Lvc;Lam;ILvc;IZIIIZI)Lrn;", line = 123)
    public final class417 method1646(class424 arg0, class89 arg1, class199 arg2, int arg3, class89 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field3457++;
        class417 var13 = this.method1651(arg9, arg1, arg11, arg0, arg3, (byte) 113, arg8, arg5);
        if (arg7 != -1) {
            return null;
        } else if (var13 == null) {
            class156 var14 = this.method1644(arg11, 88);
            if (arg9 > 1 && var14.field2201 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg9 >= var14.field2170[var16] && var14.field2170[var16] != 0) {
                        var15 = var14.field2201[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method1644(var15, 87);
                }
            }
            int[] var17 = var14.method1109(arg4, arg10, arg0, arg2, arg9, arg1, arg3, arg5, 116, arg8);
            if (var17 == null) {
                return null;
            }
            class417 var18;
            if (arg6) {
                var18 = arg4.method342(var17, 0, 36, 36, 32);
            } else {
                var18 = arg1.method342(var17, 0, 36, 36, 32);
            }
            if (!arg6) {
                class388 var19 = new class388();
                var19.field5325 = arg0 != null;
                var19.field5326 = arg9;
                var19.field5315 = arg1.field1262;
                var19.field5319 = arg5;
                var19.field5323 = arg3;
                var19.field5320 = arg8;
                var19.field5328 = arg11;
                this.field3466.method2860(var19, var18, (byte) 76);
            }
            return var18;
        } else {
            return var13;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V", line = 189)
    public static final void method1647(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 96) {
            method1655(false, -68, true, false, 5);
        }
        field3447++;
        class334 var4 = class352.method2172(arg1, 9, 16711935);
        var4.method2104(0);
        var4.field4648 = arg3;
        var4.field4635 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V", line = 204)
    public final void method1648(int arg0, int arg1) {
        field3448++;
        if (arg0 != 32) {
            method1655(true, 21, false, true, -8);
        }
        this.field3473 = arg1;
        class336 var3 = this.field3464;
        synchronized (this.field3464) {
            this.field3464.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V", line = 222)
    public static final void method1649(int arg0, boolean arg1) {
        field3450++;
        if (class347.field4787 == arg0) {
            return;
        }
        if (class347.field4787 == 0) {
            class48.method484((byte) 110);
        }
        if (arg0 == 40) {
            class293.method1914(7);
        }
        if (arg0 != 40 && class427.field5959 != null) {
            class427.field5959.method2095(false);
            class427.field5959 = null;
        }
        if (class347.field4787 == 25 || class347.field4787 == 28) {
            class69.field1009.field6151 = 2;
            class432.field6114.field6151 = 2;
            class25.field264.field6151 = 2;
            class35.field379.field6151 = 2;
            class443.field6301.field6151 = 2;
            class442.field6291.field6151 = 2;
            class202.field2992.field6151 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class34.field357 = 0;
            class134.field1874 = 0;
            class190.field2860 = 1;
            class268.field3924 = 1;
            class448.field6381 = 0;
            class89.method745(23, true);
            class69.field1009.field6151 = 1;
            class432.field6114.field6151 = 1;
            class25.field264.field6151 = 1;
            class35.field379.field6151 = 1;
            class443.field6301.field6151 = 1;
            class442.field6291.field6151 = 1;
            class202.field2992.field6151 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class280.method1871(-32449);
        }
        if (arg0 == 5) {
            class465.method2774(class374.field5152, class454.field6440, 85);
        } else {
            class196.method1368(-22);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class347.field4787 == 5 || class347.field4787 == 10 || class347.field4787 == 28;
        if (var3 != var2) {
            if (var2) {
                class290.field4117 = class241.field3516;
                if (class409.field5605 == 0) {
                    class370.method2264(2, -118);
                } else {
                    class1.method3(false, 255, 0, true, class38.field473, 2, class241.field3516);
                }
                class380.field5220.method2470(false, 0);
            } else {
                class370.method2264(2, -28);
                class380.field5220.method2470(true, 0);
            }
        }
        if (!arg1) {
            if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
                class374.field5152.method298();
            }
            class347.field4787 = arg0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 319)
    public static void method1650(byte arg0) {
        field3465 = null;
        if (arg0 <= 98) {
            method1647(36, -58, 90, 89);
        }
        field3461 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILvc;ILtj;IBII)Lrn;", line = 331)
    public final class417 method1651(int arg0, class89 arg1, int arg2, class424 arg3, int arg4, byte arg5, int arg6, int arg7) {
        this.field3469.field5325 = arg3 != null;
        field3443++;
        this.field3469.field5323 = arg4;
        this.field3469.field5320 = arg6;
        this.field3469.field5326 = arg0;
        this.field3469.field5315 = arg1.field1262;
        if (arg5 < 11) {
            this.method1648(112, -114);
        }
        this.field3469.field5319 = arg7;
        this.field3469.field5328 = arg2;
        return (class417) this.field3466.method2851((byte) -124, this.field3469);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 349)
    public final void method1652(byte arg0) {
        class336 var2 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2109(-1);
        }
        int var3 = 0 / ((-arg0 - 54) / 53);
        field3459++;
        class336 var4 = this.field3464;
        synchronized (this.field3464) {
            this.field3464.method2109(-1);
        }
        class484 var5 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.method2856(-115);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)V", line = 367)
    public final void method1653(byte arg0, int arg1) {
        field3445++;
        class336 var3 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2120((byte) -81, arg1);
        }
        class336 var4 = this.field3464;
        synchronized (this.field3464) {
            this.field3464.method2120((byte) 36, arg1);
        }
        class484 var5 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.method2861(arg1, -13791);
            if (arg0 < 29) {
                this.method1652((byte) -8);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V", line = 386)
    public final void method1654(boolean arg0, boolean arg1) {
        if (arg0) {
            method1645('3', (String) null, 111);
        }
        field3446++;
        if (this.field3449 != arg1) {
            this.field3449 = arg1;
            this.method1652((byte) 74);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZZI)Lnl;", line = 402)
    public static final class435 method1655(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field3452++;
        class102 var5 = null;
        if (class79.field1161 != null) {
            var5 = new class102(arg4, class79.field1161, class441.field6266[arg4], 1000000);
        }
        class13.field111[arg4] = class314.field4442.method807((byte) -61, var5, class443.field6302, arg4);
        if (arg3) {
            class13.field111[arg4].method1333(arg0);
        }
        if (arg0) {
            field3465 = null;
        }
        return new class435(class13.field111[arg4], arg2, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 422)
    public final void method1656(byte arg0) {
        class484 var2 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.method2856(-74);
        }
        if (arg0 <= -100) {
            field3453++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 440)
    public final void method1657(int arg0) {
        field3462++;
        class336 var2 = this.field3464;
        synchronized (this.field3464) {
            if (arg0 >= -21) {
                this.field3472 = null;
            }
            this.field3464.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 455)
    public final void method1658(int arg0) {
        class336 var2 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2119(0);
        }
        field3456++;
        class336 var3 = this.field3464;
        synchronized (this.field3464) {
            if (arg0 != 25) {
                this.method1654(true, false);
            }
            this.field3464.method2119(0);
        }
        class484 var4 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.method2857(0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Llo;IZLjo;Lnl;Lnl;)V", line = 503)
    public class237(class280 arg0, int arg1, boolean arg2, class233 arg3, class435 arg4, class435 arg5) {
        this.field3470 = arg3;
        this.field3463 = arg1;
        this.field3454 = arg5;
        this.field3455 = arg4;
        this.field3449 = arg2;
        if (this.field3455 == null) {
            this.field3451 = 0;
        } else {
            int var7 = this.field3455.method2658(-1) - 1;
            this.field3451 = var7 * 256 + this.field3455.method2638(1, var7);
        }
        this.field3472 = new String[] { null, null, class18.field172.method1078(this.field3463, 100), null, null };
        this.field3471 = new String[] { null, null, null, null, class165.field2402.method1078(this.field3463, 100) };
    }
}
