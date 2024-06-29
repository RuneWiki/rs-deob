import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class7 extends class272 implements class80 {

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "Z")
    private boolean field246 = false;

    @OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
    private int field261 = 50;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "Lek;")
    private class206 field242;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Lek;")
    private class206 field227;

    @OriginalMember(owner = "client!sn", name = "R", descriptor = "Llj;")
    private class59 field250;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "Llj;")
    private class59 field243;

    @OriginalMember(owner = "client!sn", name = "W", descriptor = "[I")
    public static int[] field254 = new int[256];

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    public static int field241 = -1;

    @OriginalMember(owner = "client!sn", name = "Q", descriptor = "[I")
    public static int[] field249 = new int[1000];

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Lsf;")
    public static class124 field228 = new class124(4);

    @OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
    public static int field263 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!sn", name = "Z", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!sn", name = "ab", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!sn", name = "bb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!sn", name = "eb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!sn", name = "cb", descriptor = "Lek;")
    public static class206 field260;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "Lob;")
    public static class323 field240;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(IB)I", line = 4)
    public final int method61(int arg0, byte arg1) {
        field238++;
        if (arg1 != 16) {
            method67((byte) 112, (class211) null);
        }
        return this.method1732(0, arg0).field2400 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIIFZ)Lsc;", line = 16)
    public final class288 method62(byte arg0, int arg1, int arg2, float arg3, boolean arg4) {
        field232++;
        class279 var6 = this.method69(arg2, 1);
        if (var6 == null || !var6.method1977(this, this.field227)) {
            return null;
        } else if (arg0 == -57) {
            return arg4 ? var6.field4554.method1505(false, (double) arg3, arg0 ^ 0xFFFFFFC7, arg1, this.field227, arg1, this) : var6.field4554.method1507(arg1, (byte) -14, (double) arg3, false, this, arg1, this.field227);
        } else {
            return (class288) null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(II)I", line = 36)
    public final int method63(int arg0, int arg1) {
        field237++;
        if (arg1 != -1) {
            method67((byte) -56, (class211) null);
        }
        return this.method1732(0, arg0).field2387 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)I", line = 50)
    public final int method64(int arg0, boolean arg1) {
        if (!arg1) {
            field249 = (int[]) null;
        }
        field262++;
        return this.method1732(0, arg0).field2390 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lek;Lek;Lek;IZ)V", line = 60)
    public class7(class206 arg0, class206 arg1, class206 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field242 = arg0;
        this.field261 = arg3;
        this.field246 = arg4;
        this.field227 = arg2;
        this.field250 = new class59(this.field261);
        if (class241.field4016) {
            this.field243 = new class59(this.field261);
        } else {
            this.field243 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V", line = 81)
    public static void method65(byte arg0) {
        int var1 = -94 % ((arg0) / 57);
        field249 = null;
        field260 = null;
        field254 = null;
        field240 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFB)[I", line = 94)
    public final int[] method66(int arg0, float arg1, byte arg2) {
        field248++;
        class279 var4 = this.method69(arg0, arg2 ^ 0x59);
        if (arg2 != 88) {
            method76(-26, -41);
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field4560 = true;
            return var4.method1978(this, this.field227, arg1, this.field246 || this.method1732(0, arg0).field2392);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLka;)V", line = 115)
    public static final void method67(byte arg0, class211 arg1) {
        field244++;
        for (int var2 = 0; var2 < class161.field2716.length; var2++) {
            class161.field2716[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * Math.random() * 128.0D);
            class161.field2716[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg0 != 35) {
            field264 = -66;
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class318.field5179[var9] = (class161.field2716[var9 + 1] + class161.field2716[var9 - 1] + class161.field2716[var9 + 128] + class161.field2716[var9 + -128]) / 4;
                }
            }
            int[] var10 = class161.field2716;
            class161.field2716 = class318.field5179;
            class318.field5179 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field5236; var12++) {
            for (int var13 = 0; var13 < arg1.field5229; var13++) {
                if (arg1.field3507[var11++] != 0) {
                    int var14 = var13 + arg1.field5232 + 16;
                    int var15 = var12 + arg1.field5238 + 16;
                    int var16 = (var15 << 7) + var14;
                    class161.field2716[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V", line = 213)
    public final void method68(int arg0, int arg1, int arg2) {
        class109.method815(-126, this.method1732(0, arg0).field2390 & arg1, this.method1732(0, arg0).field2387 & 0xFF);
        boolean var4 = false;
        class279 var5 = this.method69(arg0, arg1 - 254);
        if (var5 != null) {
            var4 = var5.method1973(this, this.field227, arg2);
        }
        if (!var4) {
            class271 var6 = this.method78((byte) -112, arg0);
            var6.method1916(arg1 - 29264);
        }
        field256++;
    }

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "(II)Lmd;", line = 240)
    private final class279 method69(int arg0, int arg1) {
        class279 var3 = (class279) this.field250.method487(119, (long) arg0);
        field230++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field242.method1404(arg0, 0, (byte) -119);
        if (var4 == null) {
            return null;
        }
        class279 var5 = new class279(new class146(var4));
        if (arg1 != 1) {
            this.field246 = false;
        }
        this.field250.method491((long) arg0, -1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "(II)Lpl;", line = 263)
    public final class216 method70(int arg0, int arg1) {
        if (arg0 == 50) {
            field257++;
            class279 var3 = this.method69(arg1, arg0 - 49);
            return var3 == null ? null : var3.field4554;
        } else {
            return (class216) null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILek;ILek;Z)Ldj;", line = 278)
    public static final class361 method71(int arg0, class206 arg1, int arg2, class206 arg3, boolean arg4) {
        if (!arg4) {
            method67((byte) 10, (class211) null);
        }
        field229++;
        return class76.method581(arg3, 59, arg2, arg0) ? class319.method2298(10304, arg1.method1404(arg2, arg0, (byte) -59)) : null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(IZ)V", line = 293)
    public final void method72(int arg0, boolean arg1) {
        field239++;
        this.field246 = arg1;
        this.method83(1);
        if (arg0 != 28916) {
            field254 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "(II)V", line = 306)
    public final void method73(int arg0, int arg1) {
        this.field261 = arg0;
        field255++;
        this.field250 = new class59(this.field261);
        if (class241.field4016) {
            this.field243 = new class59(this.field261);
        } else {
            this.field243 = null;
        }
        if (arg1 < 22) {
            this.method61(21, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(IB)Z", line = 323)
    public final boolean method74(int arg0, byte arg1) {
        field231++;
        if (arg1 >= -95) {
            return true;
        } else {
            return !this.method1732(0, arg0).field2393;
        }
    }

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "(II)V", line = 337)
    public final void method75(int arg0, int arg1) {
        for (class279 var3 = (class279) this.field250.method485(2); var3 != null; var3 = (class279) this.field250.method488((byte) 92)) {
            if (var3.field4560) {
                var3.method1974(arg1);
                var3.field4560 = false;
            }
        }
        field236++;
        if (arg0 != 17) {
            field241 = -82;
        }
    }

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "(II)V", line = 359)
    public static final void method76(int arg0, int arg1) {
        field258++;
        if (arg1 != 12919) {
            method76(67, -71);
        }
        class199 var2 = class173.method1231(false, 12, arg0);
        var2.method1358(-1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V", line = 372)
    public final void method77(byte arg0, int arg1) {
        field235++;
        this.method68(arg1, 255, this.field246 || this.method1732(0, arg1).field2392 ? 64 : 128);
        if (arg0 >= -81) {
            field254 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(BI)Lfd;", line = 386)
    private final class271 method78(byte arg0, int arg1) {
        int var3 = 95 % ((arg0 - 4) / 59);
        field253++;
        class271 var4 = (class271) this.field243.method487(122, (long) arg1);
        if (var4 == null) {
            class271 var5 = new class271(this.method1732(0, arg1).field2389 & 0xFFFF);
            this.field243.method491((long) arg1, -1, var5);
            return var5;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(II)[I", line = 405)
    public final int[] method79(int arg0, int arg1) {
        field225++;
        class279 var3 = this.method69(arg1, 1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 30854) {
                field228 = (class124) null;
            }
            return var3.method1975(this, this.field227, this.field246 || this.method1732(0, arg1).field2392);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIIII)V", line = 422)
    public static final void method80(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field259++;
        for (class302 var5 = (class302) class232.field3798.method431(0); var5 != null; var5 = (class302) class232.field3798.method439(arg0 - 28619)) {
            class83.method614(arg2, arg1, arg4, var5, true, arg3);
        }
        class302 var6 = (class302) class46.field931.method431(0);
        if (arg0 != 107) {
            field249 = (int[]) null;
        }
        while (var6 != null) {
            byte var7 = 1;
            class5 var8 = var6.field4913.method60(true);
            if (var6.field4913.field206 == var8.field106) {
                var7 = 0;
            } else if (var6.field4913.field206 == var8.field80 || var6.field4913.field206 == var8.field110 || var6.field4913.field206 == var8.field91 || var6.field4913.field206 == var8.field94) {
                var7 = 2;
            } else if (var6.field4913.field206 == var8.field82 || var6.field4913.field206 == var8.field103 || var6.field4913.field206 == var8.field99 || var6.field4913.field206 == var8.field113) {
                var7 = 3;
            }
            if (var6.field4916 != var7) {
                int var9 = class149.method1068(var6.field4913, 58);
                if (var6.field4904 != var9) {
                    if (var6.field4921 != null) {
                        class56.field1105.method1247(var6.field4921);
                        var6.field4921 = null;
                    }
                    var6.field4904 = var9;
                }
                var6.field4916 = var7;
            }
            var6.field4909 = var6.field4913.field199;
            var6.field4924 = var6.field4913.field199 + (var6.field4913.method49((byte) -70) * 64);
            var6.field4911 = var6.field4913.field213;
            var6.field4919 = var6.field4913.field213 + var6.field4913.method49((byte) 60) * 64;
            class83.method614(arg2, arg1, arg4, var6, true, arg3);
            var6 = (class302) class46.field931.method439(arg0 - 28619);
        }
        for (class302 var10 = (class302) class362.field5736.method2345((byte) 49); var10 != null; var10 = (class302) class362.field5736.method2336(-118)) {
            byte var11 = 1;
            class5 var12 = var10.field4929.method60(true);
            if (var10.field4929.field206 == var12.field106) {
                var11 = 0;
            } else if (var10.field4929.field206 == var12.field80 || var10.field4929.field206 == var12.field110 || var10.field4929.field206 == var12.field91 || var10.field4929.field206 == var12.field94) {
                var11 = 2;
            } else if (var10.field4929.field206 == var12.field82 || var10.field4929.field206 == var12.field103 || var10.field4929.field206 == var12.field99 || var10.field4929.field206 == var12.field113) {
                var11 = 3;
            }
            if (var10.field4916 != var11) {
                int var13 = class188.method1307(var10.field4929, 127);
                if (var10.field4904 != var13) {
                    if (var10.field4921 != null) {
                        class56.field1105.method1247(var10.field4921);
                        var10.field4921 = null;
                    }
                    var10.field4904 = var13;
                }
                var10.field4916 = var11;
            }
            var10.field4909 = var10.field4929.field199;
            var10.field4924 = var10.field4929.field199 + var10.field4929.method49((byte) -105) * 64;
            var10.field4911 = var10.field4929.field213;
            var10.field4919 = var10.field4929.field213 + (var10.field4929.method49((byte) 107) * 64);
            class83.method614(arg2, arg1, arg4, var10, true, arg3);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I", line = 538)
    public final int method81(int arg0, int arg1) {
        if (arg1 != -15915) {
            field260 = (class206) null;
        }
        field245++;
        return this.method1732(0, arg0).field2394 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(II)Z", line = 549)
    public final boolean method82(int arg0, int arg1) {
        if (arg1 != -5001) {
            this.method68(-123, 49, 80);
        }
        field251++;
        return this.method1732(arg1 + 5001, arg0).field2385;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 565)
    public final void method83(int arg0) {
        this.field250.method486(-1);
        field224++;
        if (arg0 != 1) {
            this.method82(-57, 111);
        }
        if (this.field243 != null) {
            this.field243.method486(-1);
        }
        class279.field4559 = null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(BI)Z", line = 587)
    public final boolean method84(byte arg0, int arg1) {
        field247++;
        int var3 = -122 / ((arg0 + 52) / 40);
        return this.field246 || this.method1732(0, arg1).field2392;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I", line = 600)
    public final int method85(int arg0, byte arg1) {
        field252++;
        if (arg1 != -82) {
            method67((byte) -42, (class211) null);
        }
        return this.method1732(0, arg0).field2389 & 0xFFFF;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)Z", line = 611)
    public final boolean method86(boolean arg0, int arg1) {
        field233++;
        if (arg0) {
            this.field261 = 110;
        }
        return this.method1732(0, arg1).field2391;
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(II)Z", line = 634)
    public final boolean method87(int arg0, int arg1) {
        field226++;
        class279 var3 = this.method69(arg0, arg1);
        return var3 == null ? false : var3.method1977(this, this.field227);
    }
}
