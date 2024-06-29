import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class32 extends class120 {

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field471 = -2;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "Lok;")
    private static class41 field475 = class137.method956("cyan:", 45);

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "Lok;")
    public static class41 field476 = class137.method956("Mem:", 45);

    @OriginalMember(owner = "client!vg", name = "mb", descriptor = "Lok;")
    public static class41 field482 = field475;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "Lok;")
    public static class41 field478 = field475;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field473 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "Lak;")
    public static class20 field466 = new class20(64);

    @OriginalMember(owner = "client!vg", name = "qb", descriptor = "[[B")
    public static byte[][] field486 = new byte[50][];

    @OriginalMember(owner = "client!vg", name = "pb", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!vg", name = "lb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vg", name = "nb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!vg", name = "ob", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 7)
    public static final void method216(int arg0) {
        class203.field3281.method490(true);
        for (int var1 = 0; var1 < 32; var1++) {
            class175.field2842[var1] = 0L;
        }
        field481++;
        for (int var2 = 0; var2 < 32; var2++) {
            class43.field687[var2] = 0L;
        }
        if (arg0 >= 41) {
            class301.field4879 = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILmh;)V", line = 34)
    public static final void method217(int arg0, class65 arg1) {
        class109.field1523 = arg1;
        field468++;
        if (arg0 != -1) {
            method222(-52);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 45)
    private class32(int arg0) {
        super(0, true);
        this.field469 = 4096;
        this.field469 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)V", line = 55)
    public static final void method218(int arg0, int arg1, int arg2) {
        field467++;
        if (class104.field1483 > 0) {
            class276.method1957(1, class104.field1483);
            class104.field1483 = 0;
        }
        int var3 = class54.field798 * arg0;
        if (arg1 > -73) {
            field478 = (class41) null;
        }
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var8 = (var4 - var7) * class276.field4511[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class54.field801[arg2 + (var3++)];
                int var11 = class116.field1694[var6++];
                if (var11 == 0) {
                    class312.field5262.field1070[var5++] = var10;
                } else {
                    int var12 = 256 - var11 - 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = var11 + 18;
                    int var14 = class148.field2298[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class312.field5262.field1070[var5++] = class217.method1563(-16711936, var12 * class217.method1563(16711935, var10) + var13 * class217.method1563(16711935, var14)) + class217.method1563(16711680, var12 * class217.method1563(var10, 65280) + var13 * class217.method1563(var14, 65280)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class312.field5262.field1070[var5++] = class54.field801[var3++ + arg2];
            }
            var3 += class54.field798 - 128;
        }
        class312.field5262.method77(arg2, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)V", line = 144)
    public static final void method219(boolean arg0, int arg1) {
        class232.field3661 = new int[104];
        class27.field404 = new int[104];
        field474++;
        class101.field1442 = new int[104];
        class151.field2347 = new int[arg1];
        class59.field843 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class36.field539 = 99;
        class57.field819 = new int[var2][105][105];
        class224.field3586 = new byte[var2][104][104];
        class277.field4542 = new byte[var2][104][104];
        class276.field4521 = new byte[var2][104][104];
        class314.field5301 = new byte[var2][105][105];
        class69.field1043 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V", line = 169)
    public static void method220(int arg0) {
        field486 = (byte[][]) null;
        field478 = null;
        field466 = null;
        field475 = null;
        field482 = null;
        field476 = null;
        if (arg0 < 62) {
            method218(1, 3, -56);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(III)V", line = 202)
    public static final void method221(int arg0, int arg1, int arg2) {
        field465++;
        class46 var3 = class195.method1396(1, arg0, false);
        var3.method337(0);
        int var4 = 47 % ((17 - arg2) / 60);
        var3.field721 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 214)
    public class32() {
        this(4096);
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)[Ltb;", line = 219)
    public static final class199[] method222(int arg0) {
        if (arg0 <= 13) {
            return (class199[]) null;
        }
        field472++;
        class199[] var1 = new class199[class181.field2940];
        for (int var2 = 0; var2 < class181.field2940; var2++) {
            int var3 = class69.field1040[var2] * class173.field2812[var2];
            byte[] var4 = class223.field3562[var2];
            if (class116.field1684[var2]) {
                byte[] var7 = class185.field3027[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class255.method1813(class217.method1563(255, var7[var9]) << 24, class312.field5263[class217.method1563(255, var4[var9])]);
                }
                if (class166.field2625) {
                    var1[var2] = new class87(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var8);
                } else {
                    var1[var2] = new class261(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class312.field5263[class217.method1563(var4[var6], 255)];
                }
                if (class166.field2625) {
                    var1[var2] = new class17(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var5);
                } else {
                    var1[var2] = new class72(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], var5);
                }
            }
        }
        class286.method2005((byte) -9);
        return var1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I", line = 284)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            this.method14(-39, 73);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        field470++;
        if (this.field1775.field1798) {
            class21.method143(var3, 0, class307.field5160, this.field469);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)Z", line = 319)
    public static final boolean method223(int arg0, int arg1) {
        field464++;
        if (class126.field1872[arg0]) {
            return true;
        } else if (class20.field314.method462(arg0, 21)) {
            if (arg1 != 255) {
                method222(-118);
            }
            int var2 = class20.field314.method481(17377, arg0);
            if (var2 == 0) {
                class126.field1872[arg0] = true;
                return true;
            }
            if (class273.field4446[arg0] == null) {
                class273.field4446[arg0] = new class302[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class273.field4446[arg0][var3] == null) {
                    byte[] var4 = class20.field314.method454(arg0, 0, var3);
                    if (var4 != null) {
                        class273.field4446[arg0][var3] = new class302();
                        class273.field4446[arg0][var3].field4910 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class273.field4446[arg0][var3].method2088(new class112(var4), (byte) -94);
                        } else {
                            class273.field4446[arg0][var3].method2083(0, new class112(var4));
                        }
                    }
                }
            }
            class126.field1872[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V", line = 387)
    public static final void method224(byte arg0) {
        class165.field2608.method135(18436);
        field480++;
        int var1 = -83 % ((arg0 - 72) / 51);
        class222.field3540.method135(18436);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Llb;II)V", line = 401)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field477++;
        if (arg1 == -1 && arg2 == 0) {
            this.field469 = (arg0.method792(2) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IIIIIII)V", line = 439)
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            return;
        }
        field484++;
        int var7 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg5);
        int var8 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg2);
        int var9 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg6);
        int var10 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg4);
        int var11 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg3 + arg5);
        int var12 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg2 - arg3);
        for (int var13 = var7; var13 < var11; var13++) {
            class269.method1908(19, class239.field3829[var13], arg1, var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class269.method1908(19, class239.field3829[var14], arg1, var10, var9);
        }
        int var15 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + arg6);
        int var16 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg4 - arg3);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class239.field3829[var17];
            class269.method1908(19, var18, arg1, var15, var9);
            class269.method1908(19, var18, arg1, var10, var16);
        }
    }
}
