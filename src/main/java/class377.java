import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class377 extends class354 {

    @OriginalMember(owner = "client!tp", name = "W", descriptor = "I")
    private int field5767 = -1;

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    public static int field5760 = 0;

    @OriginalMember(owner = "client!tp", name = "T", descriptor = "Lla;")
    public static class319 field5764 = new class319(86, 7);

    @OriginalMember(owner = "client!tp", name = "U", descriptor = "Lni;")
    public static class367 field5765 = new class367(60, 0);

    @OriginalMember(owner = "client!tp", name = "X", descriptor = "Lni;")
    public static class367 field5768 = new class367(65, -1);

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public int field5758;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!tp", name = "V", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "[I")
    public int[] field5755;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)I")
    public final int method2273(boolean arg0) {
        if (arg0) {
            return 85;
        } else {
            ++field5756;
            return this.field5767;
        }
    }

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "(I)V")
    public static void method2367(int arg0) {
        if (arg0 == -1365235420) {
            field5765 = null;
            field5768 = null;
            field5764 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)[[I")
    public int[][] method354(int arg0, byte arg1) {
        ++field5759;
        int var3 = 7 / ((arg1 - 48) / 60);
        int[][] var4 = super.field5474.method2414((byte) -88, arg0);
        if (super.field5474.field5870 && this.method2368((byte) -103)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field5758 * (class33.field511 == this.field5766 ? arg0 : this.field5766 * arg0 / class33.field511);
            if (class531.field7814 == this.field5758) {
                for (int var9 = 0; var9 < class531.field7814; ++var9) {
                    int var10 = this.field5755[var8++];
                    var7[var9] = class519.method3092(var10 << 4, 4080);
                    var6[var9] = class519.method3092(4080, var10 >> 4);
                    var5[var9] = class519.method3092(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; class531.field7814 > var11; ++var11) {
                    int var12 = this.field5758 * var11 / class531.field7814;
                    int var13 = this.field5755[var8 + var12];
                    var7[var11] = class519.method3092(255, var13) << 4;
                    var6[var11] = class519.method3092(65280, var13) >> 4;
                    var5[var11] = class519.method3092(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
    public class377() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field5762;
        if (arg2 != 1638) {
            field5765 = null;
        }
        if (arg1 == 0) {
            this.field5767 = arg0.method1074(-635989152);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)Z")
    public final boolean method2368(byte arg0) {
        int var2 = -51 % ((-11 - arg0) / 58);
        ++field5757;
        if (this.field5755 != null) {
            return true;
        } else if (this.field5767 >= 0) {
            class252 var3 = ~client.field2677 <= -1 ? class252.method1630(class404.field6129, client.field2677, this.field5767) : class252.method1631(class404.field6129, this.field5767);
            var3.method1642();
            this.field5755 = var3.method1636();
            this.field5766 = var3.field3513;
            this.field5758 = var3.field3512;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public final void method375(int arg0) {
        ++field5761;
        super.method375(arg0);
        this.field5755 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)I")
    public static final int method2369(int arg0, int arg1) {
        ++field5763;
        return arg0 != 1020765895 ? 60 : arg1 >>> 7;
    }
}
