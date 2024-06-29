import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class125 extends class14 {

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field1841 = 0;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    private int field1842 = 1365;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    private int field1846 = 0;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    private int field1847 = 20;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1840 = null;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "[I")
    public static int[] field1845 = new int[2];

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static final void method911(int arg0) {
        ++field1836;
        for (int var1 = 0; var1 < 5; ++var1) {
            class265.field3504[var1] = false;
        }
        class520.field7699 = -1;
        int var2 = -54 % (-arg0 / 49);
        class208.field2856 = class168.field2439;
        class46.field682 = class168.field2438;
        class477.field6577 = class207.field2854;
        class286.field3747 = class31.field516;
        class154.field2242 = 0;
        class286.field3749 = class365.field4937;
        class60.field945 = 0;
        class42.field623 = 5;
        class450.field6127 = -1;
        class497.field6884 = class430.field5888;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method912(String arg0, int arg1) {
        ++field1839;
        return arg1 != 1 ? 31 : 1 + arg0.length();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(Z)V")
    public static final void method913(boolean arg0) {
        ++field1843;
        if (!arg0) {
            method913(false);
        }
        if (class148.method1021((byte) 88)) {
            if (class390.field5283 == null) {
                class351.method2055(false);
            }
            class367.field4963 = 0;
            class289.field3785 = true;
            try {
                class381.field5205 = class170.field2476.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field1840 = null;
        field1845 = null;
        if (arg0 < 55) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field1838;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            field1845 = null;
        }
        if (super.field270.field5222) {
            for (int var4 = 0; class115.field1637 > var4; ++var4) {
                int var5 = (class195.field2715[var4] << 12) / this.field1842 + this.field1841;
                int var6 = (class273.field3590[arg0] << 12) / this.field1842 + this.field1846;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field1847 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - (-var7 + var12);
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field1847 + -1) ? (var13 << 12) / this.field1847 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 79 % ((arg1 - -51) / 37);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field1846 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field1841 = arg2.method2212((byte) 83);
                }
            } else {
                this.field1847 = arg2.method2212((byte) 83);
            }
        } else {
            this.field1842 = arg2.method2212((byte) 83);
        }
        ++field1837;
    }
}
