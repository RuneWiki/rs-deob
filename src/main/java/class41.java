import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class41 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Ljg;")
    private class158 field492;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lmd;")
    private class120 field493;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lda;")
    private class198 field489;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lbh;")
    public static class234 field496 = new class234();

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[S")
    public static short[] field501 = new short[256];

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Ljava/lang/String;")
    public static String field502 = " ";

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field504 = -1;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lqi;")
    private class216 field499;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[Lsh;")
    private class283[] field488;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[[B")
    public static byte[][] field500;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "[[Z")
    public static boolean[][] field503;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method253(byte arg0) {
        if (arg0 < 64) {
            field504 = -120;
        }
        for (class123 var1 = (class123) class71.field831.method1532(-115); var1 != null; var1 = (class123) class71.field831.method1523(-110)) {
            class182 var2 = var1.field1764;
            if (class199.field2833 != var2.field2594 || var2.field2612 < class198.field2819) {
                var1.method1935(106);
            } else if (class198.field2819 >= var2.field2614) {
                if (var2.field2596 > 0) {
                    class54 var3 = class20.field244[var2.field2596 - 1];
                    if (var3 != null && var3.field4563 >= 0 && var3.field4563 < 13312 && var3.field4553 >= 0 && var3.field4553 < 13312) {
                        var2.method1181((byte) -74, class4.method21(var3.field4553, var2.field2594, var3.field4563, (byte) 26) - var2.field2595, var3.field4553, class198.field2819, var3.field4563);
                    }
                }
                if (var2.field2596 < 0) {
                    int var4 = -var2.field2596 - 1;
                    class240 var5;
                    if (class33.field385 == var4) {
                        var5 = class177.field2507;
                    } else {
                        var5 = class253.field3656[var4];
                    }
                    if (var5 != null && var5.field4563 >= 0 && var5.field4563 < 13312 && var5.field4553 >= 0 && var5.field4553 < 13312) {
                        var2.method1181((byte) 105, class4.method21(var5.field4553, var2.field2594, var5.field4563, (byte) 26) - var2.field2595, var5.field4553, class198.field2819, var5.field4563);
                    }
                }
                var2.method1183(-86, class123.field1771);
                class274.method1763(class199.field2833, (int) var2.field2591, (int) var2.field2590, (int) var2.field2624, 60, var2, var2.field2623, -1L, false);
            }
        }
        field495++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method254(int arg0) {
        field501 = null;
        if (arg0 != 15988) {
            field502 = null;
        }
        field496 = null;
        field500 = null;
        field502 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILlb;IZLlb;)Lsh;")
    private final class283 method255(int arg0, class105 arg1, int arg2, boolean arg3, class105 arg4) {
        field494++;
        if (this.field499 == null) {
            throw new RuntimeException();
        }
        if (arg2 > -66) {
            method254(16);
        }
        this.field499.field3021 = arg0 * 8 + 5;
        if (this.field499.field3030.length <= this.field499.field3021) {
            throw new RuntimeException();
        } else if (this.field488[arg0] == null) {
            int var6 = this.field499.method1358(76);
            int var7 = this.field499.method1358(85);
            class283 var8 = new class283(arg0, arg4, arg1, this.field492, this.field493, var6, var7, arg3);
            this.field488[arg0] = var8;
            return var8;
        } else {
            return this.field488[arg0];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method256(int arg0, int arg1) {
        field487++;
        if (arg1 < 109) {
            field501 = null;
        }
        class178.field2531.method62(-70, arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILlb;Llb;)Lsh;")
    public final class283 method257(int arg0, int arg1, class105 arg2, class105 arg3) {
        if (arg0 > -125) {
            field501 = null;
        }
        field490++;
        return this.method255(arg1, arg2, -72, true, arg3);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Z")
    public final boolean method258(byte arg0) {
        field497++;
        if (this.field499 != null) {
            return true;
        }
        if (this.field489 == null) {
            if (this.field492.method1057(0)) {
                return false;
            }
            this.field489 = this.field492.method1059((byte) 0, true, 255, 255, false);
        }
        if (this.field489.field338) {
            return false;
        } else {
            this.field499 = new class216(this.field489.method170(-68));
            this.field488 = new class283[(this.field499.field3030.length - 5) / 8];
            int var2 = -125 / ((-arg0 - 38) / 46);
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method259(int arg0) {
        int var2 = 88 / ((-arg0 - 10) / 58);
        field491++;
        if (this.field488 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field488.length; var3++) {
            if (this.field488[var3] != null) {
                this.field488[var3].method1886((byte) -74);
            }
        }
        for (int var4 = 0; var4 < this.field488.length; var4++) {
            if (this.field488[var4] != null) {
                this.field488[var4].method1884((byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljg;Lmd;)V")
    public class41(class158 arg0, class120 arg1) {
        this.field492 = arg0;
        this.field493 = arg1;
        if (!this.field492.method1057(0)) {
            this.field489 = this.field492.method1059((byte) 0, true, 255, 255, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)I")
    public static final int method260(byte arg0, int arg1) {
        field498++;
        if (arg0 <= 37) {
            method260((byte) -2, 72);
        }
        return arg1 >>> 8;
    }
}
