import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class265 extends class166 {

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "Lhj;")
    public static class69 field4706 = class181.method1318(":duelfriend:", (byte) -114);

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field4715 = 0;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Lnb;")
    public static class199 field4712 = new class199(128);

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field4718 = -2;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "[[B")
    public static byte[][] field4720 = new byte[250][];

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "[I")
    public static int[] field4719 = new int[99];

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    private int field4707;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    private int field4708;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)I")
    public static final int method1833(int arg0, boolean arg1) {
        if (arg1) {
            return -46;
        } else {
            ++field4705;
            return 255 & arg0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IZ)Z")
    public static final boolean method1834(int arg0, boolean arg1) {
        ++field4710;
        if (arg1) {
            method1836((class114) null, 3);
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
    private class265(int arg0) {
        super(0, false);
        this.method1837(arg0, (byte) -45);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class265() {
        this(0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1837(67, (byte) -115);
        }
        ++field4713;
        int[][] var3 = super.field3064.method320(arg1, (byte) -76);
        if (super.field3064.field979) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class253.field4565; ++var7) {
                var4[var7] = this.field4707;
                var5[var7] = this.field4717;
                var6[var7] = this.field4708;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public static void method1835(int arg0) {
        field4719 = null;
        int var1 = 26 % ((-2 - arg0) / 62);
        field4706 = null;
        field4720 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lcj;I)V")
    public static final void method1836(class114 arg0, int arg1) {
        class119.field2246 = arg0;
        ++field4709;
        if (arg1 != -1380985532) {
            field4711 = 114;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            ++field4721;
            if (~arg2 == -1) {
                this.method1837(arg1.method952((byte) -88), (byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    private final void method1837(int arg0, byte arg1) {
        this.field4708 = (255 & arg0) << 4;
        this.field4717 = (65280 & arg0) >> 4;
        ++field4714;
        if (arg1 != -45) {
            field4718 = -24;
        }
        this.field4707 = (16711680 & arg0) >> 12;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field4719[var1] = var0 / 4;
        }
    }
}
