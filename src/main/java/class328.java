import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class328 implements class613 {

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lub;")
    private class22 field4906;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[Llp;")
    private class409[] field4895;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Ldba;")
    public static class101 field4893 = new class101(10, 8);

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Lke;")
    public static class622 field4899 = new class622(8, 6);

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Ljo;")
    public static class351 field4909 = new class351(22, 18);

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "F")
    public static float field4905;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lha;")
    private class66 field4897;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Z")
    private boolean field4902;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 5)
    public final void method1528(int arg0) {
        field4904++;
        if (arg0 != -28323) {
            this.method1528(-29);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 16)
    public static final byte[] method2122(boolean arg0, String arg1) {
        field4896++;
        int var2 = arg1.length();
        if (!arg0) {
            field4893 = null;
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lnba;I)I", line = 159)
    public static final int method2123(class312 arg0, int arg1) {
        field4903++;
        String var2 = class786.method4305(arg0, 94);
        int[] var3 = null;
        if (class134.method950(arg0.field4640, -110)) {
            var3 = class526.field7490.method3567((int) arg0.field4647, true).field7175;
        } else if (arg0.field4638 != -1) {
            var3 = class526.field7490.method3567(arg0.field4638, true).field7175;
        } else if (class93.method664((byte) 76, arg0.field4640)) {
            class14 var6 = (class14) class543.field7606.method380((byte) -3, (long) ((int) arg0.field4647));
            if (var6 != null) {
                class645 var7 = var6.field262;
                class279 var8 = var7.field9071;
                if (var8.field3943 != null) {
                    var8 = var8.method1810((byte) -108, class271.field3796);
                }
                if (var8 != null) {
                    var3 = var8.field3895;
                }
            }
        } else if (class574.method3331(arg0.field4640, 1)) {
            Object var4 = null;
            class322 var5;
            if (arg0.field4640 == 1007) {
                var5 = class496.field7061.method319(28, (int) arg0.field4647);
            } else {
                var5 = class496.field7061.method319(-125, (int) (arg0.field4647 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field4830 != null) {
                var5 = var5.method2099(class271.field3796, -94);
            }
            if (var5 != null) {
                var3 = var5.field4762;
            }
        }
        if (var3 != null) {
            var2 = var2 + class388.method2379((byte) -60, var3);
        }
        int var9 = class33.field439.method1735((byte) -12, class725.field10175, var2);
        if (arg1 < 73) {
            return -101;
        } else {
            if (arg0.field4643) {
                var9 += class74.field993.method777() + 4;
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I", line = 231)
    public final int method1537(byte arg0) {
        field4908++;
        int var2 = 29 % ((86 - arg0) / 39);
        return this.field4906.field328;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 247)
    public final void method1541(int arg0) {
        int var2 = -122 / ((arg0 - 21) / 45);
        if (class638.field8979 != this.field4897) {
            this.field4902 = true;
            this.field4897 = class638.field8979;
        }
        field4907++;
        this.field4897.method417(0);
        class409[] var3 = this.field4895;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class409 var5 = var3[var4];
            if (var5 != null) {
                var5.method811(false);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I", line = 277)
    public final int method1536(int arg0) {
        if (arg0 != 9657) {
            method2122(false, null);
        }
        field4900++;
        int var2 = 0;
        class409[] var3 = this.field4895;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class409 var5 = var3[var4];
            if (var5 == null || var5.method814((byte) -128)) {
                var2++;
            }
        }
        return var2 * 100 / this.field4895.length;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lub;Luga;)V", line = 306)
    public class328(class22 arg0, class217 arg1) {
        this.field4906 = arg0;
        this.field4895 = new class409[this.field4906.field333.length];
        for (int var3 = 0; var3 < this.field4895.length; var3++) {
            this.field4895[var3] = arg1.method1505(-77, this.field4906.field333[var3]);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(JB)Z", line = 326)
    public final boolean method1533(long arg0, byte arg1) {
        if (arg1 != 104) {
            field4899 = null;
        }
        field4898++;
        return class109.method731(43) >= (long) this.field4906.field326 + arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V", line = 337)
    public final void method1529(int arg0, boolean arg1) {
        boolean var3 = true;
        if (arg0 != -27763) {
            return;
        }
        field4894++;
        class409[] var4 = this.field4895;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class409 var6 = var4[var5];
            if (var6 != null) {
                var6.method374(var3 || this.field4902, (byte) -105);
            }
        }
        this.field4902 = false;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V", line = 367)
    public static void method2124(int arg0) {
        field4899 = null;
        field4909 = null;
        field4893 = null;
        if (arg0 != -7065) {
            field4909 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I", line = 379)
    public static final int method2125(int arg0, int arg1, int arg2) {
        field4901++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return arg0 >= -76 ? -108 : var3;
    }
}
