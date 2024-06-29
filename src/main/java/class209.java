import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class209 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lwc;")
    private class53 field3527 = new class53();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lbe;")
    private class235 field3538;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lbd;")
    public static class162 field3523 = class17.method142(0, "blinken3:");

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lbd;")
    public static class162 field3530 = class17.method142(0, "settings=");

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lbd;")
    public static class162 field3532 = class17.method142(0, "<img=0>");

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lbd;")
    public static class162 field3540 = class17.method142(0, "blinken2:");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "[[B")
    public static byte[][] field3542;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[[[B")
    public static byte[][][] field3531;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 19)
    public final void method1529(boolean arg0) {
        field3525++;
        this.field3527.method378(-128);
        this.field3538.method1667(-109);
        if (arg0) {
            this.method1532(-124L, -90, (Object) null);
        }
        this.field3521 = this.field3534;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I", line = 38)
    public static final int method1530(byte arg0, int arg1) {
        int var2 = -29 / ((-arg0 - 32) / 48);
        field3541++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1531(int arg0) {
        if (arg0 != 1) {
            method1537(21, 57, false, -120, -54, 82, (class143) null);
        }
        field3522++;
        class288.field4852.method1529(false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 61)
    public final void method1532(long arg0, int arg1, Object arg2) {
        field3526++;
        if (arg1 > -39) {
            method1534(-85);
        }
        this.method1535(1, arg0);
        if (this.field3521 == 0) {
            class72 var5 = (class72) this.field3527.method374(1348);
            var5.method1183(false);
            var5.method1573(-9728);
        } else {
            this.field3521--;
        }
        class95 var6 = new class95(arg2);
        this.field3538.method1674(var6, false, arg0);
        this.field3527.method379(var6, 255);
        var6.field3604 = 0L;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V", line = 90)
    public final void method1533(boolean arg0) {
        field3528++;
        if (!arg0) {
            return;
        }
        for (class72 var2 = (class72) this.field3527.method373(arg0); var2 != null; var2 = (class72) this.field3527.method376(true)) {
            if (var2.method522(-82)) {
                var2.method1183(false);
                var2.method1573(-9728);
                this.field3521++;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 129)
    public static void method1534(int arg0) {
        field3540 = null;
        if (arg0 != 1) {
            return;
        }
        field3530 = null;
        field3531 = (byte[][][]) null;
        field3542 = (byte[][]) null;
        field3532 = null;
        field3523 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V", line = 146)
    public final void method1535(int arg0, long arg1) {
        if (arg0 != 1) {
            this.field3521 = 70;
        }
        class72 var4 = (class72) this.field3538.method1672(arg1, 19760);
        if (var4 != null) {
            var4.method1183(false);
            var4.method1573(-9728);
            this.field3521++;
        }
        field3524++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 175)
    public final Object method1536(long arg0, int arg1) {
        field3537++;
        if (arg1 > -88) {
            field3530 = (class162) null;
        }
        class72 var4 = (class72) this.field3538.method1672(arg0, 19760);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method525(true);
        if (var5 == null) {
            var4.method1183(false);
            var4.method1573(-9728);
            this.field3521++;
            return null;
        }
        if (var4.method522(-92)) {
            class95 var6 = new class95(var5);
            this.field3538.method1674(var6, false, var4.field2701);
            this.field3527.method379(var6, 255);
            var6.field3604 = 0L;
            var4.method1183(false);
            var4.method1573(-9728);
        } else {
            this.field3527.method379(var4, 255);
            var4.field3604 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIIILda;)V", line = 222)
    public static final void method1537(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class143 arg6) {
        class311.field5199 = arg5;
        int var7 = -32 / ((arg3 + 29) / 51);
        class207.field3500 = arg0;
        class34.field548 = arg6;
        class314.field5297 = arg2;
        class126.field2295 = arg4;
        class9.field105 = 1;
        class102.field1864 = arg1;
        field3536++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V", line = 242)
    public final void method1538(int arg0, byte arg1) {
        if (class34.field544 != null) {
            for (class72 var3 = (class72) this.field3527.method373(true); var3 != null; var3 = (class72) this.field3527.method376(true)) {
                if (var3.method522(116)) {
                    if (var3.method525(true) == null) {
                        var3.method1183(false);
                        var3.method1573(-9728);
                        this.field3521++;
                    }
                } else if (++var3.field3604 > (long) arg0) {
                    class72 var4 = class34.field544.method59((byte) 114, var3);
                    this.field3538.method1674(var4, false, var3.field2701);
                    class9.method57((byte) -34, var3, var4);
                    var3.method1183(false);
                    var3.method1573(-9728);
                }
            }
        }
        if (arg1 > -2) {
            this.field3521 = 98;
        }
        field3533++;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 381)
    public class209(int arg0) {
        this.field3521 = arg0;
        this.field3534 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3538 = new class235(var2);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lda;B)V", line = 299)
    public static final void method1539(class143 arg0, byte arg1) {
        field3520++;
        class43.field714 = arg0.method1136(class119.field2170, 63);
        class173.field3001 = arg0.method1136(class95.field1742, 63);
        class136.field2428 = arg0.method1136(class250.field4161, 63);
        class51.field818 = arg0.method1136(class1.field6, 63);
        class42.field676 = arg0.method1136(class156.field2749, arg1 + 141);
        if (arg1 != -78) {
            method1534(38);
        }
        class250.field4181 = arg0.method1136(class109.field1954, 63);
        class207.field3497 = arg0.method1136(class230.field3844, 63);
        class10.field119 = arg0.method1136(class266.field4435, 63);
        class295.field4944 = arg0.method1136(class222.field3716, 63);
        class314.field5291 = arg0.method1136(class119.field2174, arg1 ^ 0xFFFFFF8D);
        class172.field2981 = arg0.method1136(class177.field3036, 63);
        class115.field2043 = arg0.method1136(class73.field1163, arg1 + 141);
        class110.field1994 = arg0.method1136(class138.field2457, 63);
        class213.field3571 = arg0.method1136(class156.field2752, 63);
        class233.field3881 = arg0.method1136(class68.field1096, 63);
        class205.field3462 = arg0.method1136(class114.field2039, 63);
        class278.field4670 = arg0.method1136(class57.field894, 63);
        class106.field1929 = arg0.method1136(class207.field3502, 63);
        class162.field2833 = arg0.method1136(client.field1885, arg1 ^ 0xFFFFFF8D);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBII)I", line = 332)
    public static final int method1540(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        field3539++;
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 - 1;
        int var8 = class139.method1081(var6, (byte) 126, var4);
        if (arg1 != -113) {
            field3529 = -11;
        }
        int var9 = class139.method1081(var6, (byte) 127, var4 + 1);
        int var10 = class139.method1081(var6 + 1, (byte) 127, var4);
        int var11 = class139.method1081(var6 + 1, (byte) 127, var4 + 1);
        int var12 = class70.method512(5, var8, var5, var9, arg3);
        int var13 = class70.method512(5, var10, var5, var11, arg3);
        return class70.method512(5, var12, var7, var13, arg3);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 372)
    public static final void method1541(int arg0) {
        field3535++;
        class126.field2294.method1529(false);
        if (arg0 != 1) {
            method1537(59, -102, false, 53, 22, -20, (class143) null);
        }
    }
}
