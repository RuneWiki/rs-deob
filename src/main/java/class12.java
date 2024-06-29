import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class12 extends class272 {

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field218 = 0;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    private int field211 = 4096;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[I")
    public static int[] field213 = new int[128];

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Lli;")
    private static class185 field216 = class245.method1649("flash3:", -73);

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Lli;")
    public static class185 field217 = field216;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lli;")
    public static class185 field224 = field216;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "Ln;")
    public static class242 field222;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "[Lli;")
    public static class185[] field214;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field210;
        if (arg1 != 4421) {
            return null;
        } else {
            int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
            if (super.field4819.field4294) {
                int[] var4 = this.method1866(arg0, 0, 101);
                for (int var5 = 0; class246.field4385 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field218 && ~var6 >= ~this.field211 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field220;
        int var4 = -18 / ((-21 - arg1) / 55);
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field211 = arg0.method827(255);
            }
        } else {
            this.field218 = arg0.method827(255);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BB)Z")
    public static final boolean method102(byte[] arg0, byte arg1) {
        class118 var2 = new class118(arg0);
        int var3 = var2.method867(false);
        if (arg1 > -97) {
            field222 = null;
        }
        ++field223;
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = var2.method867(false) == 1;
            if (var4) {
                class254.method1718(var2, 121);
            }
            class128.method916(var2, -65536);
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)V")
    public static void method103(boolean arg0) {
        field216 = null;
        field213 = null;
        field214 = null;
        field222 = null;
        if (arg0) {
            field224 = null;
        }
        field217 = null;
        field224 = null;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static final void method104(int arg0) {
        ++field221;
        for (int var1 = 0; ~var1 > ~class236.field4227; ++var1) {
            class273 var3 = class183.method1288((byte) -120, var1);
            if (var3 != null && ~var3.field4845 == -1) {
                class269.field4752[var1] = 0;
                class59.field1059[var1] = 0;
            }
        }
        class155.field2930 = new class31(16);
        int var2 = -77 / ((arg0 - 60) / 40);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)I")
    public static final int method105(int arg0, int arg1) {
        if (arg0 != 10429) {
            field224 = null;
        }
        ++field219;
        return arg1 >>> 7;
    }
}
