import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class125 extends class398 {

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "[I")
    public static int[] field1753 = new int[32];

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field1757 = -1;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field1751 = 100;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "[I")
    public static int[] field1763;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lcr;")
    public static class189 field1762;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    private int field1759;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field1760;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Z")
    public static boolean field1750;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1753[var1] = var0 + -1;
            var0 += var0;
        }
        field1763 = new int[32];
        field1762 = new class189(64);
        field1764 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method795(int arg0, String arg1) {
        ++field1755;
        int var2 = 119 % ((15 - arg0) / 42);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)V", line = 19)
    private final void method796(int arg0, int arg1) {
        int var3 = 96 % ((arg1 - -39) / 38);
        this.field1760 = (16711680 & arg0) >> 12;
        ++field1749;
        this.field1761 = arg0 >> 4 & 4080;
        this.field1759 = (arg0 & 255) << 4;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[[I", line = 31)
    public final int[][] method99(int arg0, int arg1) {
        ++field1752;
        if (arg1 != 2) {
            method799((byte) 80);
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class140.field1922 < ~var7; ++var7) {
                var4[var7] = this.field1760;
                var5[var7] = this.field1761;
                var6[var7] = this.field1759;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 72)
    public static void method797(int arg0) {
        field1762 = null;
        if (arg0 != 100) {
            method795(35, (String) null);
        }
        field1763 = null;
        field1753 = null;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V", line = 95)
    public static final void method798(int arg0, int arg1) {
        ++field1754;
        int var2 = -class157.field2130 + class28.field418;
        if (~var2 <= -101) {
            class346.field4979 = 1;
        } else {
            int var3 = (int) class317.field4647;
            if (var3 < class48.field677 >> 8) {
                var3 = class48.field677 >> 8;
            }
            if (class119.field1671[4] && var3 < class406.field6031[4] + 128) {
                var3 = class406.field6031[4] + 128;
            }
            int var4 = (int) class396.field5847 + class105.field1523 & 16383;
            if (arg0 > -117) {
                field1762 = null;
            }
            class271.method1863(var3, 600 - -((var3 >> 3) * 3), arg1, var4, -50 + class52.method359((byte) -116, class227.field2988.field734, class227.field2988.field740, class227.field2981), 100, class144.field1962, class153.field2071);
            float var5 = 1.0F - (float) ((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
            class201.field2667 = (int) ((float) (-class286.field4143 + class201.field2667) * var5 + (float) class286.field4143);
            class400.field5971 = (int) ((float) (-class302.field4451 + class400.field5971) * var5 + (float) class302.field4451);
            class179.field2371 = (int) ((float) (class179.field2371 - class276.field3992) * var5 + (float) class276.field3992);
            class415.field6101 = (int) ((float) (-class215.field2866 + class415.field6101) * var5 + (float) class215.field2866);
            int var6 = -class23.field319 + class5.field66;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (~var6 > 8191) {
                var6 += 16384;
            }
            class5.field66 = (int) ((float) var6 * var5 + (float) class23.field319);
            class5.field66 &= 16383;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnj;II)V", line = 151)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            this.method208((class228) null, 122, 95);
        }
        if (~arg1 == -1) {
            this.method796(arg0.method1333((byte) -125), -124);
        }
        ++field1756;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 178)
    public static final void method799(byte arg0) {
        class189 var1 = class304.field4463;
        synchronized (class304.field4463) {
            class304.field4463.method1136((byte) -121);
        }
        ++field1758;
        class189 var2 = class242.field3238;
        synchronized (class242.field3238) {
            class242.field3238.method1136((byte) -112);
        }
        class178 var3 = class212.field2835;
        synchronized (class212.field2835) {
            class212.field2835.method1091(arg0 ^ 29222);
            if (arg0 != -4) {
                method799((byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V", line = 198)
    private class125(int arg0) {
        super(0, false);
        this.method796(arg0, -114);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 206)
    public class125() {
        this(0);
    }
}
