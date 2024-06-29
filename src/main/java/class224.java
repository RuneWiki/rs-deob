import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class224 extends class313 {

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    private int field3735 = 2048;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    private int field3747 = 3072;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    private int field3754 = 1024;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field3733 = 50;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "[I")
    public static int[] field3738 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field3751 = new String[field3733];

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "[I")
    public static int[] field3741 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
    public static int[] field3732 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
    public static int[] field3750 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "[I")
    public static int[] field3743 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "[Z")
    public static boolean[] field3746 = new boolean[100];

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "[I")
    public static int[] field3753 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "[I")
    public static int[] field3755 = new int[field3733];

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "Lcg;")
    public static class49 field3749;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "[[[B")
    public static byte[][][] field3745;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            field3737 = 97;
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 121);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                var9[var11] = (var5[var11] * this.field3735 >> 12) + this.field3754;
                var8[var11] = (var6[var11] * this.field3735 >> 12) + this.field3754;
                var10[var11] = (var7[var11] * this.field3735 >> 12) + this.field3754;
            }
        }
        field3748++;
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V", line = 51)
    public static final void method1633(boolean arg0) {
        class200.field3405.method470(12);
        field3734++;
        class262.field4247.method470(12);
        class253.field4069.method470(12);
        if (arg0) {
            method1635((String) null, 93);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I", line = 67)
    public static final int method1634(int arg0, int arg1) {
        if (arg1 == 14298) {
            field3742++;
            return arg0 & 0x7F;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V", line = 84)
    public final void method182(int arg0) {
        field3740++;
        if (arg0 != 25833) {
            field3746 = (boolean[]) null;
        }
        this.field3735 = this.field3747 - this.field3754;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 100)
    public static final int method1635(String arg0, int arg1) {
        field3744++;
        if (arg1 != -1) {
            field3746 = (boolean[]) null;
        }
        if (class222.field3708 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class222.field3708.field4814; var2++) {
            if (class280.method1914(true, class185.method1427(" ", arg1 - 104, class222.field3708.field4819[var2], "<br>"), arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V", line = 125)
    public static void method1636(boolean arg0) {
        field3745 = (byte[][][]) null;
        field3755 = null;
        field3743 = null;
        field3753 = null;
        field3749 = null;
        if (arg0) {
            field3738 = (int[]) null;
        }
        field3751 = null;
        field3741 = null;
        field3732 = null;
        field3738 = null;
        field3746 = null;
        field3750 = null;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 144)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)Lwh;", line = 152)
    public static final class12 method1637(int arg0, byte arg1) {
        field3757++;
        class12 var2 = (class12) class257.field4133.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field3167.method441(false, class116.method992(0, arg0), class313.method2159(arg0, (byte) -20));
        class12 var4 = new class12();
        var4.field151 = arg0;
        if (var3 != null) {
            var4.method116(new class336(var3), true);
        }
        var4.method124(75);
        if (arg1 <= 110) {
            field3738 = (int[]) null;
        }
        class257.field4133.method465(var4, (long) arg0, (byte) 65);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I", line = 191)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            this.field3754 = 48;
        }
        field3756++;
        int[] var3 = this.field4961.method1520(arg0 - 1908965698, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                var3[var5] = this.field3754 + (var4[var5] * this.field3735 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(Z)V", line = 224)
    public static final void method1638(boolean arg0) {
        field3739++;
        if (!arg0) {
            method1636(true);
        }
        class8.field96.method470(12);
        class48.field736.method470(12);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILpi;)V", line = 287)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field3754 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field3747 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            this.field3735 = -20;
        }
        field3752++;
    }
}
