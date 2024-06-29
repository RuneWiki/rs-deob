import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class140 extends class23 {

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    private int field2594 = -1;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field2596 = 0;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "[I")
    public int[] field2591;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
    public final int method124(int arg0) {
        if (arg0 != -1) {
            this.method124(-86);
        }
        ++field2593;
        return this.field2594;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)[[I")
    public int[][] method7(int arg0, byte arg1) {
        ++field2599;
        if (arg1 != 13) {
            field2596 = -88;
        }
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312 && this.method926(-1)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int var6 = this.field2595 * (class27.field460 != this.field2590 ? this.field2590 * arg0 / class27.field460 : arg0);
            int[] var7 = var3[0];
            if (~class70.field1276 != ~this.field2595) {
                for (int var8 = 0; ~var8 > ~class70.field1276; ++var8) {
                    int var9 = this.field2595 * var8 / class70.field1276;
                    int var10 = this.field2591[var6 + var9];
                    var5[var8] = class70.method470(255, var10) << 4;
                    var4[var8] = class70.method470(var10 >> 4, 4080);
                    var7[var8] = class70.method470(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class70.field1276; ++var11) {
                    int var12 = this.field2591[var6++];
                    var5[var11] = class70.method470(255, var12) << 4;
                    var4[var11] = class70.method470(var12 >> 4, 4080);
                    var7[var11] = class70.method470(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)Z")
    public final boolean method926(int arg0) {
        ++field2598;
        if (this.field2591 != null) {
            return true;
        } else if (~this.field2594 <= arg0) {
            class169 var2 = class37.method250(class39.field684, (byte) 0, this.field2594);
            var2.method1180();
            this.field2595 = var2.field3656;
            this.field2590 = var2.field3654;
            this.field2591 = var2.field3249;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 == -3) {
            ++field2592;
            if (~arg2 == -1) {
                this.field2594 = arg0.method301(83);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        super.method127(arg0);
        this.field2591 = null;
        ++field2600;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, false);
    }
}
