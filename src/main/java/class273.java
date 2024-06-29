import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class273 implements class160 {

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "Lcj;")
    private class721 field3946 = new class721(256);

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "Lwia;")
    private class791 field3949;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "Lwia;")
    private class791 field3935;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    private int field3940;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "[Llv;")
    private class467[] field3948;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "Ljd;")
    public static class241 field3936;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "[Ljd;")
    public static class241[] field3950;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)Lvc;")
    private final class335 method1757(int arg0, boolean arg1) {
        field3945++;
        class107 var3 = this.field3946.method4039(0, (long) arg0);
        if (var3 != null) {
            return (class335) var3;
        }
        byte[] var4 = this.field3935.method4335(arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class335 var5 = new class335(new class494(var4));
            this.field3946.method4037(var5, (long) arg0, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)Llv;")
    public final class467 method1208(byte arg0, int arg1) {
        if (arg0 == 47) {
            field3942++;
            return this.field3948[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
    public final int method1209(int arg0) {
        if (arg0 != -9413) {
            this.method1209(-102);
        }
        field3941++;
        return this.field3940;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field3950 = null;
        if (arg0 == -21) {
            field3936 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)Z")
    public final boolean method1212(int arg0, int arg1) {
        field3943++;
        if (arg0 < 103) {
            return true;
        } else {
            class335 var3 = this.method1757(arg1, false);
            return var3 != null && var3.method2127(this, 0, this.field3949);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "([BB)Lfi;")
    public static final class581 method1759(byte[] arg0, byte arg1) {
        field3937++;
        class581 var2 = new class581();
        class494 var3 = new class494(arg0);
        var3.field7042 = var3.field7050.length - 2;
        int var4 = var3.method2998(true);
        int var5 = var3.field7050.length - var4 - 16 - 2;
        if (arg1 < 105) {
            field3950 = null;
        }
        var3.field7042 = var5;
        int var6 = var3.method2976(-125);
        var2.field8207 = var3.method2998(true);
        var2.field8201 = var3.method2998(true);
        var2.field8206 = var3.method2998(true);
        var2.field8199 = var3.method2998(true);
        var2.field8212 = var3.method2998(true);
        var2.field8202 = var3.method2998(true);
        int var7 = var3.method2964((byte) 64);
        if (var7 > 0) {
            var2.field8209 = new class353[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2998(true);
                class353 var10 = new class353(class433.method2595(var9, (byte) -82));
                var2.field8209[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2976(-125);
                    int var12 = var3.method2976(-127);
                    var10.method2241(68, (long) var11, new class489(var12));
                }
            }
        }
        var3.field7042 = 0;
        var2.field8215 = var3.method2984((byte) -92);
        var2.field8214 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field7042) {
            int var14 = var3.method2998(true);
            if (var14 == 3) {
                if (var2.field8205 == null) {
                    var2.field8205 = new String[var6];
                }
                var2.field8205[var13] = var3.method2996(123).intern();
            } else if (var14 == 54) {
                if (var2.field8203 == null) {
                    var2.field8203 = new long[var6];
                }
                var2.field8203[var13] = var3.method3005(-82);
            } else {
                if (var2.field8198 == null) {
                    var2.field8198 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field8198[var13] = var3.method2964((byte) 120);
                } else {
                    var2.field8198[var13] = var3.method2976(-126);
                }
            }
            var2.field8214[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BIIZIF)[I")
    public final int[] method1211(byte arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field3938++;
        if (arg0 != 22) {
            field3950 = null;
        }
        return this.method1757(arg4, false).method2129(this.field3949, (double) arg5, this.field3948[arg4].field6580, arg1, this, arg2, arg3, (byte) -46);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIFIIZ)[F")
    public final float[] method1210(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        field3947++;
        if (arg3 != -7342) {
            this.field3946 = null;
        }
        return this.method1757(arg0, false).method2131(arg4, this.field3949, this, this.field3948[arg0].field6580, -122, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BZIIIF)[I")
    public final int[] method1207(byte arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field3939++;
        int var7 = -8 / ((26 - arg0) / 34);
        return this.method1757(arg2, false).method2130(this.field3948[arg2].field6580, arg3, (double) arg5, arg4, this, false, this.field3949);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILwn;)V")
    public static final void method1760(int arg0, int arg1, int arg2, class753 arg3) {
        field3944++;
        if (!class626.field8777) {
            return;
        }
        int var4 = arg1;
        for (class746 var5 = (class746) arg3.field10411.method636(arg1 ^ 0x100); var5 != null; var5 = (class746) arg3.field10411.method637(false)) {
            int var10 = class298.method1939(var5, arg1 ^ 0xFFFFFF94);
            if (var10 > var4) {
                var4 = var10;
            }
        }
        var4 += 8;
        int var6 = arg3.field10409 * 16 + 21;
        class295.field4298 = arg3.field10409 * 16 + (class463.field6530 ? 26 : 22);
        int var7 = class54.field679 + class109.field1608;
        if (var4 + var7 > class428.field5825) {
            var7 = class109.field1608 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class463.field6530 ? 33 : 31;
        int var9 = arg2 + 13 - var8;
        if (class714.field9895 < (var6 + var9)) {
            var9 = class714.field9895 - var6;
        }
        class55.field705 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class724.field10026 = var9;
        class545.field7847 = var4;
        class280.field4071 = arg3;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lwia;Lwia;Lwia;)V")
    public class273(class791 arg0, class791 arg1, class791 arg2) {
        this.field3949 = arg2;
        this.field3935 = arg1;
        class494 var4 = new class494(arg0.method4339(0, 0, 0));
        this.field3940 = var4.method2998(true);
        this.field3948 = new class467[this.field3940];
        for (int var5 = 0; var5 < this.field3940; var5++) {
            if (var4.method2964((byte) 102) == 1) {
                this.field3948[var5] = new class467();
            }
        }
        for (int var6 = 0; var6 < this.field3940; var6++) {
            if (this.field3948[var6] != null) {
                this.field3948[var6].field6570 = var4.method2964((byte) 41) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field3940; var7++) {
            if (this.field3948[var7] != null) {
                this.field3948[var7].field6574 = var4.method2964((byte) 40) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field3940; var8++) {
            if (this.field3948[var8] != null) {
                this.field3948[var8].field6563 = var4.method2964((byte) 80) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field3940; var9++) {
            if (this.field3948[var9] != null) {
                this.field3948[var9].field6579 = var4.method2943((byte) 16);
            }
        }
        for (int var10 = 0; var10 < this.field3940; var10++) {
            if (this.field3948[var10] != null) {
                this.field3948[var10].field6582 = var4.method2943((byte) 16);
            }
        }
        for (int var11 = 0; var11 < this.field3940; var11++) {
            if (this.field3948[var11] != null) {
                this.field3948[var11].field6567 = var4.method2943((byte) 16);
            }
        }
        for (int var12 = 0; var12 < this.field3940; var12++) {
            if (this.field3948[var12] != null) {
                this.field3948[var12].field6562 = var4.method2943((byte) 16);
            }
        }
        for (int var13 = 0; var13 < this.field3940; var13++) {
            if (this.field3948[var13] != null) {
                this.field3948[var13].field6571 = (short) var4.method2998(true);
            }
        }
        for (int var14 = 0; var14 < this.field3940; var14++) {
            if (this.field3948[var14] != null) {
                this.field3948[var14].field6577 = var4.method2943((byte) 16);
            }
        }
        for (int var15 = 0; var15 < this.field3940; var15++) {
            if (this.field3948[var15] != null) {
                this.field3948[var15].field6569 = var4.method2943((byte) 16);
            }
        }
        for (int var16 = 0; var16 < this.field3940; var16++) {
            if (this.field3948[var16] != null) {
                this.field3948[var16].field6575 = var4.method2964((byte) 58) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field3940; var17++) {
            if (this.field3948[var17] != null) {
                this.field3948[var17].field6580 = var4.method2964((byte) 101) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field3940; var18++) {
            if (this.field3948[var18] != null) {
                this.field3948[var18].field6565 = var4.method2943((byte) 16);
            }
        }
        for (int var19 = 0; var19 < this.field3940; var19++) {
            if (this.field3948[var19] != null) {
                this.field3948[var19].field6572 = var4.method2964((byte) 120) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field3940; var20++) {
            if (this.field3948[var20] != null) {
                this.field3948[var20].field6566 = var4.method2964((byte) 93) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field3940; var21++) {
            if (this.field3948[var21] != null) {
                this.field3948[var21].field6568 = var4.method2964((byte) 99) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field3940; var22++) {
            if (this.field3948[var22] != null) {
                this.field3948[var22].field6557 = var4.method2964((byte) 47);
            }
        }
        for (int var23 = 0; var23 < this.field3940; var23++) {
            if (this.field3948[var23] != null) {
                this.field3948[var23].field6561 = var4.method2976(-124);
            }
        }
        for (int var24 = 0; var24 < this.field3940; var24++) {
            if (this.field3948[var24] != null) {
                this.field3948[var24].field6581 = var4.method2964((byte) 107);
            }
        }
    }
}
