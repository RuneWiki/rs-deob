import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class488 extends class334 {

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    private int field6708 = -1;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6709 = new Hashtable();

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    private int field6702;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "Ldda;")
    public static class407 field6706;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "[I")
    private int[] field6704;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field6710;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int var4 = this.field6702 * (class327.field4668 != this.field6713 ? this.field6713 * arg1 / class327.field4668 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class439.field6099 == ~this.field6702) {
                for (int var8 = 0; class439.field6099 > var8; ++var8) {
                    int var9 = this.field6704[var4++];
                    var7[var8] = class194.method1380(var9 << 4, 4080);
                    var6[var8] = class194.method1380(var9 >> 4, 4080);
                    var5[var8] = class194.method1380(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class439.field6099; ++var10) {
                    int var11 = this.field6702 * var10 / class439.field6099;
                    int var12 = this.field6704[var4 - -var11];
                    var7[var10] = class194.method1380(255, var12) << 4;
                    var6[var10] = class194.method1380(var12 >> 4, 4080);
                    var5[var10] = class194.method1380(var12, 16711680) >> 12;
                }
            }
        }
        if (!arg0) {
            field6709 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            field6705 = -86;
        }
        ++field6707;
        if (arg0 == 0) {
            this.field6708 = arg2.method2565((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class488() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method1064(int arg0) {
        super.method1064(-128);
        ++field6703;
        if (arg0 >= -126) {
            this.method283(true, 16);
        }
        this.field6704 = null;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
    public static void method2862(int arg0) {
        field6706 = null;
        field6709 = null;
        if (arg0 != 1992662764) {
            method2862(-112);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZII)V")
    public final void method2050(boolean arg0, int arg1, int arg2) {
        super.method2050(arg0, arg1, arg2);
        ++field6712;
        if (~this.field6708 <= -1 && class695.field9782 != null) {
            int var4 = !class695.field9782.method847(this.field6708, -95).field10044 ? 128 : 64;
            this.field6704 = class695.field9782.method844(false, (byte) 112, 1.0F, var4, this.field6708, var4);
            this.field6713 = var4;
            this.field6702 = var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
    public final int method2054(int arg0) {
        if (arg0 != -21437) {
            return -1;
        } else {
            ++field6711;
            return this.field6708;
        }
    }
}
