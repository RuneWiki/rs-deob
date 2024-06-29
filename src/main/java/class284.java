import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class284 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lqd;")
    public static class40 field4762 = class147.method1106("gr-Un:", (byte) -61);

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lqd;")
    public static class40 field4773 = class147.method1106("T", (byte) -62);

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lqd;")
    public static class40 field4771 = class147.method1106("null", (byte) -97);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lqd;")
    public static class40 field4772 = class147.method1106("Clientscript error in: ", (byte) -68);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lqd;")
    private static class40 field4768 = class147.method1106("Checking for updates )2 ", (byte) -86);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lqd;")
    public static class40 field4770 = class147.method1106(" <col=00ff80>", (byte) -81);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lqd;")
    public static class40 field4765 = field4768;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lqd;")
    public static class40 field4763 = class147.method1106("Spielwelt erstellt)3", (byte) -63);

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lqd;")
    private static class40 field4778 = class147.method1106("Loaded interfaces", (byte) -83);

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lqd;")
    public static class40 field4779 = field4778;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[[I")
    public static int[][] field4776 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lqd;")
    public static class40 field4780 = class147.method1106("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -63);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 10)
    public static final int method1975(int arg0, int arg1) {
        field4764++;
        return arg1 == 1 ? (arg0 & 0x1F290C) >> 18 : 7;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z", line = 26)
    public static final boolean method1976(int arg0, int arg1, int arg2, int arg3) {
        if (class188.method1354(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class10.method64(var4 + 1, class78.field1316[arg0][arg1][arg2] + arg3, var5 + 1) && class10.method64(var4 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class10.method64(var4 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class10.method64(var4 + 1, class78.field1316[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 52)
    public static void method1977(int arg0) {
        field4780 = null;
        field4776 = (int[][]) null;
        if (arg0 != 1) {
            field4771 = (class40) null;
        }
        field4763 = null;
        field4773 = null;
        field4772 = null;
        field4762 = null;
        field4771 = null;
        field4765 = null;
        field4768 = null;
        field4770 = null;
        field4779 = null;
        field4778 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIZII)V", line = 86)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            return;
        }
        if (arg2 >= 0 && arg6 >= 0 && arg2 < 103 && arg6 < 103) {
            if (arg4 == 0) {
                class302 var8 = class272.method1882(arg0, arg2, arg6);
                if (var8 != null) {
                    int var9 = (int) (var8.field5061 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 2) {
                        var8.field5059 = new class280(var9, 2, arg1 + 4, arg0, arg2, arg6, arg7, false, var8.field5059);
                        var8.field5066 = new class280(var9, 2, arg1 + 1 & 0x3, arg0, arg2, arg6, arg7, false, var8.field5066);
                    } else {
                        var8.field5059 = new class280(var9, arg3, arg1, arg0, arg2, arg6, arg7, false, var8.field5059);
                    }
                }
            }
            if (arg4 == 1) {
                class20 var10 = class17.method98(arg0, arg2, arg6);
                if (var10 != null) {
                    int var11 = (int) (var10.field338 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field343 = new class280(var11, 4, arg1, arg0, arg2, arg6, arg7, false, var10.field343);
                    } else if (arg3 == 6) {
                        var10.field343 = new class280(var11, 4, arg1 + 4, arg0, arg2, arg6, arg7, false, var10.field343);
                    } else if (arg3 == 7) {
                        var10.field343 = new class280(var11, 4, (arg1 + 2 & 0x3) + 4, arg0, arg2, arg6, arg7, false, var10.field343);
                    } else if (arg3 == 8) {
                        var10.field343 = new class280(var11, 4, arg1 + 4, arg0, arg2, arg6, arg7, false, var10.field343);
                        var10.field335 = new class280(var11, 4, (arg1 + 2 & 0x3) + 4, arg0, arg2, arg6, arg7, false, var10.field335);
                    }
                }
            }
            if (arg4 == 2) {
                class193 var12 = class172.method1268(arg0, arg2, arg6);
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 != null) {
                    var12.field3106 = new class280((int) (var12.field3101 >>> 32) & Integer.MAX_VALUE, arg3, arg1, arg0, arg2, arg6, arg7, false, var12.field3106);
                }
            }
            if (arg4 == 3) {
                class102 var13 = class181.method1322(arg0, arg2, arg6);
                if (var13 != null) {
                    var13.field1790 = new class280((int) (var13.field1804 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg0, arg2, arg6, arg7, false, var13.field1790);
                }
            }
        }
        field4775++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 184)
    public static final void method1979(int arg0) {
        field4774++;
        if (class119.field2011 != null) {
            class119.field2011.method116((byte) 107);
        }
        if (class248.field4107 != null) {
            class248.field4107.method116((byte) 107);
        }
        if (arg0 <= 79) {
            return;
        }
        class265.method1853(class142.field2387, 22050, -587, 2);
        class119.field2011 = class72.method539(class275.field4573, 22050, -5690, class213.field3470, 0);
        class119.field2011.method107(255, class303.field5074);
        class248.field4107 = class72.method539(class275.field4573, 2048, -5690, class213.field3470, 1);
        class248.field4107.method107(255, class89.field1610);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V", line = 206)
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class125.field2164 = arg0;
        class72.field1275 = arg3;
        if (arg1 != 0) {
            method1975(-100, 55);
        }
        field4769++;
        class220.field3664 = arg2;
        class48.field941 = arg4;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z", line = 230)
    public static final boolean method1981(int arg0) {
        if (arg0 != 4) {
            return true;
        }
        field4777++;
        try {
            return class298.method2037(arg0 ^ 0x8);
        } catch (IOException var5) {
            class280.method1957((byte) -108);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class27.field523 + "," + class181.field2953 + "," + class265.field4449 + " - " + class202.field3201 + "," + (class255.field4233.field1489[0] + class196.field3152) + "," + (class255.field4233.field1532[0] + class263.field4407) + " - ";
            for (int var4 = 0; class202.field3201 > var4 && var4 < 50; var4++) {
                var3 = var3 + class95.field1715.field472[var4] + ",";
            }
            class44.method412(var6, -14997, var3);
            class159.method1223(0);
            return true;
        }
    }
}
