import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
    private int[] field740;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    public static int[] field742 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lp;")
    public static class280 field745 = class18.method140((byte) -123, "(U5");

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field749 = 1;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Lnb;")
    public static class205 field750 = new class205();

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ltg;")
    public static class180 field747;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Ltg;")
    public static class180 field751;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
    public final int method340(byte arg0, int arg1) {
        field746++;
        if (arg0 >= -21) {
            field748 = -67;
        }
        int var3 = (this.field740.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field740[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field740[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
    public static final int method341(int arg0, int arg1) {
        field743++;
        if (arg1 != -14715) {
            return 12;
        }
        class248 var2 = class59.method422((byte) 117, arg0);
        int var3 = var2.field4342;
        int var4 = var2.field4341;
        int var5 = var2.field4338;
        int var6 = class150.field2607[var4 - var5];
        return class17.field314[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lud;BZLud;I)I")
    public static final int method342(class2 arg0, byte arg1, boolean arg2, class2 arg3, int arg4) {
        if (arg1 != -71) {
            return 33;
        }
        field744++;
        if (arg4 == 1) {
            int var5 = arg0.field1553;
            int var6 = arg3.field1553;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg0.method46(0).field2538.method1859(92, arg3.method46(0).field2538);
        } else if (arg4 == 3) {
            if (arg0.field92.method1888(class105.field1744, arg1 + 25719)) {
                if (arg3.field92.method1888(class105.field1744, 25648)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field92.method1888(class105.field1744, 25648)) {
                return arg2 ? 1 : -1;
            } else {
                return arg0.field92.method1859(86, arg3.field92);
            }
        } else if (arg4 == 4) {
            if (arg0.method686(arg1 + 109)) {
                return arg3.method686(38) ? 0 : 1;
            } else if (arg3.method686(arg1 ^ 0xFFFFFF9F)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg0.method684(30277)) {
                return arg3.method684(arg1 ^ 0xFFFF89FC) ? 0 : 1;
            } else if (arg3.method684(arg1 + 30348)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg0.method685((byte) -45)) {
                return arg3.method685((byte) -45) ? 0 : 1;
            } else if (arg3.method685((byte) -45)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 7) {
            return arg0.field88 - arg3.field88;
        } else if (arg0.method682((byte) 106)) {
            return arg3.method682((byte) 104) ? 0 : 1;
        } else if (arg3.method682((byte) 82)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ltg;Lfd;ILtg;)V")
    public static final void method343(class180 arg0, class121 arg1, int arg2, class180 arg3) {
        class252.field4402 = arg0;
        if (arg2 != 1) {
            field748 = 77;
        }
        class192.field3356 = arg3;
        field741++;
        class21.field378 = arg1;
        if (class252.field4402 != null) {
            class49.field811 = class252.field4402.method1259(1, 81);
        }
        if (class192.field3356 != null) {
            class22.field402 = class192.field3356.method1259(1, 44);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([I)V")
    public class45(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field740 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field740[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field740[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field740[var5 + var5] = arg0[var4];
            this.field740[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method344(int arg0) {
        field745 = null;
        field747 = null;
        if (arg0 == 11851) {
            field750 = null;
            field751 = null;
            field742 = null;
        }
    }
}
