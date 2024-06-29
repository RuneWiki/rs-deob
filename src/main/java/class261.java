import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class261 extends class219 {

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    private int field4357 = 0;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    private int field4364 = 1;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    private int field4355 = 0;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Z")
    public static boolean field4356 = false;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Lbd;")
    private static class162 field4358 = class17.method142(0, "Loading config )2 ");

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
    public static int[] field4347 = new int[] { 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, -2, 6, 0, -1, 0, 0, 0, 15, 6, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, -1, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -2, 0, 10, -2, 0, 1, 0, 1, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 4, 0, 4, 5, -1, 1, 0, 6, 10, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 3, 0, 0, -2, 0, -1, 0, -2, 0, 10, 3, 0, 0, 0, 0, 0, 3, 0, 0, 8, -1, 7, 0, 0, 0, 0, 0, 0, -2, 0, 2, 0, 5, 0, 20, 6, 0, -1, 0, 0, 0, 0, 0, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 14, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 15, 0, 0, 0, 0, 2, 0, 0, 4, 0, -1, 6, 2, 12, 0, 0, -2, 10, 5, 2, 2, 0, 6, 8, 0, -1, 0, 0, 0, 12, 0, 6, 8, 9, 0, 0, 0, 4, 6, 0, 8, 0, -2, 0, 0, -2, 9, 7, -1, 0, -2, 0, 7, 5, 0, -2, 14, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0 };

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Z")
    public static boolean field4362 = true;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Lbd;")
    public static class162 field4365 = field4358;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lda;")
    public static class143 field4352;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Ldd;")
    public static class38 field4354;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILb;)V", line = 13)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            method1799((byte) -61);
        }
        if (arg0 == 0) {
            this.field4357 = arg2.method756(915905888);
        } else if (arg0 == 1) {
            this.field4355 = arg2.method756(915905888);
        } else if (arg0 == 3) {
            this.field4364 = arg2.method756(915905888);
        }
        field4363++;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 57)
    public class261() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I", line = 62)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            field4352 = (class143) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        field4353++;
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class128.field2326; var6++) {
                int var7 = class280.field4762[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field4357 == 0) {
                    var11 = (var7 - var4) * this.field4364;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4364 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field4355 == 0) {
                    var12 = class293.field4927[(var12 & 0xFFD) >> 4] + 4096 >> 1;
                } else if (this.field4355 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V", line = 130)
    public static final void method1798(byte arg0) {
        if (arg0 != -18) {
            field4358 = (class162) null;
        }
        class96.field1753.method1533(true);
        field4350++;
        class23.field386.method1533(true);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 142)
    public final void method39(byte arg0) {
        class165.method1302(100);
        field4359++;
        if (arg0 != 22) {
            this.method39((byte) -68);
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(B)V", line = 174)
    public static void method1799(byte arg0) {
        field4365 = null;
        field4358 = null;
        field4347 = null;
        field4354 = null;
        if (arg0 < -57) {
            field4352 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 189)
    public static final void method1800(int arg0) {
        field4361++;
        if (class180.field3101 == null) {
            return;
        }
        if (class123.field2234 < 10) {
            if (!class54.field855.method1124(class180.field3101.field3028, -1)) {
                class123.field2234 = class6.field50.method1130(class180.field3101.field3028, arg0 - 31304) / 10;
                return;
            }
            class89.method678((byte) -1);
            class123.field2234 = 10;
        }
        if (class123.field2234 == 10) {
            class290.field4893 = class180.field3101.field3031 >> 6 << 6;
            int var1 = (class122.field2215.field5013 >> 7) + class178.field3052 - class290.field4893;
            class87.field1536 = class180.field3101.field3030 >> 6 << 6;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class9.field114 = (class180.field3101.field3034 >> 6 << 6) + 64 - class87.field1536;
            class149.field2689 = 8.0F;
            class267.field4447 = 8.0F;
            class304.field5132 = (class180.field3101.field3027 >> 6 << 6) + 64 - class290.field4893;
            int var3 = class9.field114 + class87.field1536 - (class258.field4294 + (class122.field2215.field5047 >> 7)) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class304.field5132 && var4 >= 0 && var4 < class9.field114) {
                class136.field2420 = var2;
                class278.field4682 = var4;
            } else {
                class278.field4682 = class9.field114 + class87.field1536 - (class180.field3101.field3039 * 64) - 1;
                class136.field2420 = class180.field3101.field3035 * 64 - class290.field4893;
            }
            class273.method1853(arg0 ^ 0x7A9A);
            int var5 = class9.field114 >> 6;
            int var6 = class51.field820 >> 1;
            int var7 = class304.field5132 >> 6;
            class206.field3474 = new int[var7][var5][];
            class194.field3271 = new short[var7][var5][];
            int var8 = class127.field2305 >> 2 << 10;
            class190.field3244 = new byte[var7][var5][];
            class209.field3531 = new byte[var7][var5][];
            class158.field2780 = new int[var7][var5][];
            class222.field3713 = new int[class213.field3573 + 1];
            class259.field4315 = new byte[var7][var5][];
            class133.field2381 = new byte[var7][var5][];
            class269.field4503 = new byte[var7][var5][];
            class125.method1010(-66, var8, var6);
            class123.field2234 = 20;
        } else if (class123.field2234 == 20) {
            class109.method882((byte) 100, new class94(class54.field855.method1141(class180.field3101.field3028, class203.field3441, (byte) -122)));
            class123.field2234 = 30;
            class51.method367(true, -74);
            class220.method1590(0);
        } else if (class123.field2234 == 30) {
            class35.method276((byte) -109, new class94(class54.field855.method1141(class180.field3101.field3028, class183.field3155, (byte) -125)));
            class123.field2234 = 40;
            class220.method1590(0);
        } else if (class123.field2234 == 40) {
            class248.method1741(new class94(class54.field855.method1141(class180.field3101.field3028, class66.field1047, (byte) -126)), -65);
            class123.field2234 = 50;
            class220.method1590(0);
        } else if (class123.field2234 == 50) {
            class94.method752((byte) 59, new class94(class54.field855.method1141(class180.field3101.field3028, class242.field4029, (byte) -122)));
            class123.field2234 = 60;
            class51.method367(true, -105);
            class220.method1590(arg0 ^ 0x7AAF);
        } else if (class123.field2234 == 60) {
            if (class54.field855.method1146((byte) 93, class135.method1062(new class162[] { class180.field3101.field3028, class217.field3619 }, true))) {
                if (!class54.field855.method1124(class135.method1062(new class162[] { class180.field3101.field3028, class217.field3619 }, true), -1)) {
                    return;
                }
                class9.field112 = class184.method1394(class54.field855, 104, class135.method1062(new class162[] { class180.field3101.field3028, class217.field3619 }, true));
            } else {
                class9.field112 = new class32(0);
            }
            class123.field2234 = 70;
            class220.method1590(0);
        } else if (class123.field2234 == 70) {
            class7.field72 = new class215(11, true, class308.field5173);
            class123.field2234 = 73;
            class51.method367(true, arg0 - 31494);
            class220.method1590(arg0 - 31407);
        } else if (class123.field2234 == 73) {
            class116.field2064 = new class215(12, true, class308.field5173);
            class123.field2234 = 76;
            class51.method367(true, arg0 - 31511);
            class220.method1590(arg0 ^ 0x7AAF);
        } else if (class123.field2234 == 76) {
            class162.field2849 = new class215(14, true, class308.field5173);
            class123.field2234 = 79;
            class51.method367(true, -108);
            class220.method1590(0);
        } else if (class123.field2234 == 79) {
            class91.field1613 = new class215(17, true, class308.field5173);
            class123.field2234 = 82;
            class51.method367(true, -79);
            class220.method1590(arg0 ^ 0x7AAF);
        } else if (class123.field2234 == 82) {
            class200.field3410 = new class215(19, true, class308.field5173);
            class123.field2234 = 85;
            class51.method367(true, -41);
            class220.method1590(0);
        } else if (class123.field2234 == 85) {
            class158.field2784 = new class215(22, true, class308.field5173);
            class123.field2234 = 88;
            class51.method367(true, -80);
            class220.method1590(0);
        } else if (class123.field2234 == 88) {
            class187.field3234 = new class215(26, true, class308.field5173);
            class123.field2234 = 91;
            class51.method367(true, -87);
            class220.method1590(0);
        } else {
            class218.field3638 = new class215(30, true, class308.field5173);
            class123.field2234 = 100;
            class51.method367(true, arg0 - 31467);
            class220.method1590(0);
            class59.field922 = -1;
            if (arg0 != 31407) {
                field4358 = (class162) null;
            }
            class86.field1527 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lee;", line = 409)
    public static final class194 method1801(byte arg0, int arg1) {
        field4360++;
        int var2 = 78 / ((arg0 - 50) / 36);
        class194 var3 = (class194) class288.field4852.method1536((long) arg1, -95);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class187.field3217.method1128(arg1, 0, 16);
        class194 var5 = new class194();
        if (var4 != null) {
            var5.method1431(-1, new class94(var4));
        }
        class288.field4852.method1532((long) arg1, -69, var5);
        return var5;
    }
}
