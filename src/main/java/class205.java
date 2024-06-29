import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class205 extends class286 {

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Lbe;")
    public static class283 field3492 = class153.method941(127, "Freie Welt");

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Lj;")
    public static class269 field3485 = new class269();

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "Lj;")
    public static class269 field3496 = new class269();

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lek;")
    public static class172 field3489;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[Lmj;")
    private class217[] field3486;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "[Lqb;")
    public static class95[] field3494;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method14(int arg0, int arg1) {
        field3488++;
        if (arg0 > -52) {
            method1320(false, -125);
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            this.method1318(123, this.field4863.method1581(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)Lef;", line = 39)
    public static final class306 method1316(int arg0, int arg1) {
        field3498++;
        class306 var2 = (class306) class169.field2844.method77((long) arg0, 12);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class64.field882.method1107(1, arg0, 116);
        } else {
            var3 = class83.field1410.method1107(1, arg0 & 0x7FFF, 120);
        }
        if (arg1 < 87) {
            field3492 = (class283) null;
        }
        class306 var4 = new class306();
        if (var3 != null) {
            var4.method2079(new class229(var3), (byte) 87);
        }
        if (arg0 >= 32768) {
            var4.method2082(32768);
        }
        class169.field2844.method85(var4, (long) arg0, (byte) -117);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V", line = 71)
    public static void method1317(int arg0) {
        field3485 = null;
        field3489 = null;
        field3494 = null;
        if (arg0 != 0) {
            field3496 = (class269) null;
        }
        field3492 = null;
        field3496 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[[I", line = 89)
    public final int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            method1316(31, -77);
        }
        field3487++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int var4 = class27.field410;
            int var5 = class13.field124;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4878.method947((byte) -80);
            this.method1318(124, var6);
            for (int var8 = 0; var8 < class13.field124; var8++) {
                int[][] var9 = var7[var8];
                int[] var10 = var6[var8];
                int[] var11 = var9[1];
                int[] var12 = var9[2];
                int[] var13 = var9[0];
                for (int var14 = 0; var14 < class27.field410; var14++) {
                    int var15 = var10[var14];
                    var12[var14] = class178.method1174(var15, 255) << 4;
                    var11[var14] = class178.method1174(var15 >> 4, 4080);
                    var13[var14] = class178.method1174(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[[I)V", line = 157)
    private final void method1318(int arg0, int[][] arg1) {
        field3495++;
        int var3 = class13.field124;
        int var4 = class27.field410;
        class5.method26(arg1, (byte) -88);
        class166.method1019(0, 14358, class126.field2100, 0, class284.field4857);
        if (this.field3486 != null) {
            for (int var5 = 0; var5 < this.field3486.length; var5++) {
                class217 var6 = this.field3486[var5];
                int var7 = var6.field3671;
                int var8 = var6.field3679;
                if (var8 >= 0) {
                    if (var7 >= 0) {
                        var6.method68(var4, -65, var3);
                    } else {
                        var6.method66(false, var3, var4);
                    }
                } else if (var7 >= 0) {
                    var6.method67(var4, var3, 17113);
                }
            }
        }
        if (arg0 <= 121) {
            field3494 = (class95[]) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfe;ZI)V", line = 205)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field3491++;
        if (arg2 == 0) {
            this.field3486 = new class217[arg0.method1535((byte) 108)];
            for (int var4 = 0; var4 < this.field3486.length; var4++) {
                int var5 = arg0.method1535((byte) 82);
                if (var5 == 0) {
                    this.field3486[var4] = class304.method2067(93, arg0);
                } else if (var5 == 1) {
                    this.field3486[var4] = class150.method926(arg0, 115);
                } else if (var5 == 2) {
                    this.field3486[var4] = class119.method765(arg0, 0);
                } else if (var5 == 3) {
                    this.field3486[var4] = class99.method659(-25602, arg0);
                }
            }
        } else if (arg2 == 1) {
            this.field4876 = arg0.method1535((byte) 105) == 1;
        }
        if (arg1) {
            method1316(-108, 100);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Lni;", line = 291)
    public static final class23 method1319(byte arg0) {
        int var1 = -90 % ((19 - arg0) / 50);
        field3490++;
        try {
            return (class23) Class.forName("wh").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 304)
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)V", line = 311)
    public static final void method1320(boolean arg0, int arg1) {
        field3497++;
        byte[][] var2;
        if (arg0) {
            var2 = class14.field147;
        } else {
            var2 = class113.field1903;
        }
        int var3 = class254.field4296.length;
        if (arg1 > -31) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class177.field3039[var4] & 0xFF) * 64 - class107.field1833;
                int var7 = (class177.field3039[var4] >> 8) * 64 - class214.field3637;
                class281.method1876((byte) 92);
                class176.method1158(var5, class180.field3102, var6, 52, arg0, var7);
            }
        }
    }
}
