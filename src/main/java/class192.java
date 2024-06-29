import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class192 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lbm;")
    private class209 field2998 = new class209();

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lng;")
    private class79 field3007 = new class79();

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lpf;")
    private class305 field3005;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lnf;")
    public static class162 field3009 = new class162(4);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[I")
    public static int[] field3011 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)Lbm;")
    public final class209 method1361(byte arg0, long arg1) {
        if (arg0 != -95) {
            return null;
        }
        field2996++;
        class209 var4 = (class209) this.field3005.method2043(arg1, -1);
        if (var4 != null) {
            this.field3007.method621(var4, (byte) -86);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lub;ILub;Lub;)V")
    public static final void method1362(class92 arg0, int arg1, class92 arg2, class92 arg3) {
        class115.field1764 = arg3;
        class198.field3087 = arg0;
        class92.field1469 = arg2;
        if (arg1 != 90) {
            method1369((byte) 33, -48, (class98) null, false, (class98) null);
        }
        field3001++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1363(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        field3000++;
        int var5 = 0;
        for (int var6 = arg1; var6 < class159.field2373; var6++) {
            class179 var9 = class123.method929(22497, var6);
            if ((!arg2 || var9.field2790) && var9.field2747 == -1 && var9.field2805 == -1 && var9.field2785 == 0 && var9.field2778.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class162.field2443 = null;
                    class121.field1819 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class121.field1819 = var5;
        class204.field3150 = 0;
        String[] var7 = new String[class121.field1819];
        class162.field2443 = var4;
        for (int var8 = 0; var8 < class121.field1819; var8++) {
            var7[var8] = class123.method929(22497, var4[var8]).field2778;
        }
        class121.method917(class162.field2443, var7, -25);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1364(byte arg0) {
        field3011 = null;
        field3009 = null;
        if (arg0 != -83) {
            field3011 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JBLbm;)V")
    public final void method1365(long arg0, byte arg1, class209 arg2) {
        if (arg1 != 13) {
            this.field3010 = -89;
        }
        field2999++;
        if (this.field3008 == 0) {
            class209 var5 = this.field3007.method617((byte) 114);
            var5.method995((byte) 114);
            var5.method1463((byte) -106);
            if (this.field2998 == var5) {
                class209 var6 = this.field3007.method617((byte) 114);
                var6.method995((byte) -117);
                var6.method1463((byte) -128);
            }
        } else {
            this.field3008--;
        }
        this.field3005.method2046(arg2, -40, arg0);
        this.field3007.method621(arg2, (byte) -53);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Llb;")
    public final class134 method1366(int arg0) {
        field3006++;
        if (arg0 != -251) {
            this.method1367(false);
        }
        return this.field3005.method2047(-114);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public final void method1367(boolean arg0) {
        this.field3007.method627((byte) 114);
        this.field3005.method2044(0);
        field2997++;
        this.field2998 = new class209();
        if (arg0) {
            field3011 = null;
        }
        this.field3008 = this.field3010;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class192(int arg0) {
        this.field3008 = arg0;
        int var2 = 1;
        this.field3010 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field3005 = new class305(var2);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Llb;")
    public final class134 method1368(byte arg0) {
        field3004++;
        if (arg0 > -32) {
            this.method1366(-103);
        }
        return this.field3005.method2049(0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BILnl;ZLnl;)I")
    public static final int method1369(byte arg0, int arg1, class98 arg2, boolean arg3, class98 arg4) {
        field3002++;
        if (arg1 == 1) {
            int var5 = arg2.field1998;
            int var6 = arg4.field1998;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class75.method592(-27644, class130.field1939, arg2.method766((byte) -121).field4190, arg4.method766((byte) -121).field4190);
        } else if (arg1 == 3) {
            if (arg2.field1572.equals("-")) {
                if (arg4.field1572.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1572.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class75.method592(-27644, class130.field1939, arg2.field1572, arg4.field1572);
            }
        } else if (arg1 == 4) {
            if (arg2.method993((byte) 84)) {
                return arg4.method993((byte) 84) ? 0 : 1;
            } else if (arg4.method993((byte) 84)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 5) {
            int var7 = -121 % ((65 - arg0) / 61);
            if (arg1 == 6) {
                if (arg2.method990(0)) {
                    return arg4.method990(0) ? 0 : 1;
                } else if (arg4.method990(0)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 != 7) {
                return arg2.field1565 - arg4.field1565;
            } else if (arg2.method989(-105)) {
                return arg4.method989(-92) ? 0 : 1;
            } else if (arg4.method989(-110)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2.method992(true)) {
            return arg4.method992(true) ? 0 : 1;
        } else if (arg4.method992(true)) {
            return -1;
        } else {
            return 0;
        }
    }
}
