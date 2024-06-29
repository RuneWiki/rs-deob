import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class445 extends class13 {

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "[C")
    public static char[] field6244 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    public static int field6242 = 64;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    private int field6241;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    private int field6243;

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V")
    private class445(int arg0) {
        super(0, false);
        this.method2776(arg0, true);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
    private final void method2776(int arg0, boolean arg1) {
        if (!arg1) {
            this.method222(30, 87);
        }
        this.field6243 = (255 & arg0) << 4;
        ++field6239;
        this.field6237 = arg0 >> 4 & 4080;
        this.field6241 = 4080 & arg0 >> 12;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
    public static final void method2777(boolean arg0) {
        if (arg0) {
            class328.field4549 = class311.field4255;
            class375.field5354 = class214.field2979;
        } else {
            class328.field4549 = class276.field3836;
            class375.field5354 = class418.field5939;
        }
        class392.field5617 = class328.field4549.length;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        if (arg0 != -27832) {
            field6244 = null;
        }
        ++field6236;
        int[][] var3 = super.field256.method1930(arg1, (byte) 88);
        if (super.field256.field4154) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class269.field3751 > var7; ++var7) {
                var4[var7] = this.field6241;
                var5[var7] = this.field6237;
                var6[var7] = this.field6243;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)V")
    public static void method2778(byte arg0) {
        int var1 = 38 % ((arg0 - -46) / 36);
        field6244 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field6238;
        if (arg1 < 50) {
            this.method222(5, -37);
        }
        if (~arg2 == -1) {
            this.method2776(arg0.method208(27308), true);
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class445() {
        this(0);
    }
}
