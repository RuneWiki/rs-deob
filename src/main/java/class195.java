import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class195 extends class139 {

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    private int field2855 = -1;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
    public int[] field2862;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Z")
    public final boolean method1196(int arg0) {
        ++field2856;
        if (arg0 != 26256) {
            this.method33(111, -58);
        }
        if (this.field2862 != null) {
            return true;
        } else if (~this.field2855 <= -1) {
            class72 var2 = class260.field3813 < 0 ? class72.method427(class452.field6300, this.field2855) : class72.method423(class452.field6300, class260.field3813, this.field2855);
            var2.method420();
            this.field2862 = var2.method419();
            this.field2861 = var2.field893;
            this.field2858 = var2.field897;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)[[I")
    public int[][] method33(int arg0, int arg1) {
        ++field2865;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            return null;
        } else {
            if (super.field1835.field2395 && this.method1196(26256)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class241.field3615 == ~this.field2858 ? arg1 : this.field2858 * arg1 / class241.field3615) * this.field2861;
                if (~class356.field5147 != ~this.field2861) {
                    for (int var8 = 0; var8 < class356.field5147; ++var8) {
                        int var9 = this.field2861 * var8 / class356.field5147;
                        int var10 = this.field2862[var7 + var9];
                        var6[var8] = class367.method2256(4080, var10 << 4);
                        var5[var8] = class367.method2256(65280, var10) >> 4;
                        var4[var8] = class367.method2256(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class356.field5147; ++var11) {
                        int var12 = this.field2862[var7++];
                        var6[var11] = class367.method2256(4080, var12 << 4);
                        var5[var11] = class367.method2256(65280, var12) >> 4;
                        var4[var11] = class367.method2256(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lrp;B)V")
    public static final void method1197(class276 arg0, byte arg1) {
        ++field2864;
        int var2 = arg0.method1712(-1);
        class345.field5015 = new class303[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class345.field5015[var3] = new class303();
            class345.field5015[var3].field4309 = arg0.method1712(-1);
            class345.field5015[var3].field4307 = arg0.method1754(false);
        }
        if (arg1 <= 26) {
            method1197((class276) null, (byte) -122);
        }
        class31.field414 = arg0.method1712(-1);
        class257.field3763 = arg0.method1712(-1);
        class353.field5102 = arg0.method1712(-1);
        class125.field1641 = new class42[-class31.field414 + class257.field3763 + 1];
        for (int var4 = 0; var4 < class353.field5102; ++var4) {
            int var5 = arg0.method1712(-1);
            class42 var6 = class125.field1641[var5] = new class42();
            var6.field4617 = arg0.method1701(-23121);
            var6.field4604 = arg0.method1688(20402);
            var6.field620 = class31.field414 + var5;
            var6.field618 = arg0.method1754(false);
            var6.field617 = arg0.method1754(false);
        }
        class61.field804 = arg0.method1688(20402);
        class470.field6623 = true;
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I")
    public final int method883(byte arg0) {
        if (arg0 <= 45) {
            this.method21((class276) null, (byte) 24, 45);
        }
        ++field2857;
        return this.field2855;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method876(int arg0) {
        ++field2859;
        super.method876(arg0);
        this.field2862 = null;
        if (arg0 != -7155) {
            this.method21((class276) null, (byte) 82, 101);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field2863;
        if (arg2 == 0) {
            this.field2855 = arg0.method1729(65280);
        }
        if (arg1 != -45) {
            this.field2858 = -72;
        }
    }
}
