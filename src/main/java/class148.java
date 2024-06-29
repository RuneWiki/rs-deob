import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class148 extends class297 {

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    private int field2475 = -1;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Lej;")
    public static class124 field2466 = new class124(67, -1);

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Luh;")
    public static class168 field2472 = new class168();

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Z")
    public static boolean field2474;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
    public int[] field2464;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
    public final boolean method1168(boolean arg0) {
        ++field2467;
        if (!arg0) {
            return true;
        } else if (this.field2464 != null) {
            return true;
        } else if (~this.field2475 <= -1) {
            class267 var2 = ~class81.field1453 <= -1 ? class267.method1780(class362.field5199, class81.field1453, this.field2475) : class267.method1771(class362.field5199, this.field2475);
            var2.method1783();
            this.field2464 = var2.method1775();
            this.field2469 = var2.field3784;
            this.field2473 = var2.field3778;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 == 31015) {
            if (arg1 == 0) {
                this.field2475 = arg0.method1478(842397944);
            }
            ++field2468;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
    public final int method1169(int arg0) {
        ++field2465;
        if (arg0 > -113) {
            field2474 = false;
        }
        return this.field2475;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method1170(byte arg0) {
        super.method1170((byte) -112);
        if (arg0 < -102) {
            ++field2470;
            this.field2464 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)[[I")
    public int[][] method18(int arg0, int arg1) {
        ++field2471;
        if (arg1 != -1564599039) {
            this.method18(8, -86);
        }
        int[][] var3 = super.field4166.method2180(-108, arg0);
        if (super.field4166.field4849 && this.method1168(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2469 * (~class128.field2169 != ~this.field2473 ? this.field2473 * arg0 / class128.field2169 : arg0);
            if (class525.field7275 == this.field2469) {
                for (int var8 = 0; ~var8 > ~class525.field7275; ++var8) {
                    int var9 = this.field2464[var7++];
                    var6[var8] = class263.method1762(4080, var9 << 4);
                    var5[var8] = class263.method1762(65280, var9) >> 4;
                    var4[var8] = class263.method1762(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class525.field7275; ++var10) {
                    int var11 = this.field2469 * var10 / class525.field7275;
                    int var12 = this.field2464[var7 + var11];
                    var6[var10] = class263.method1762(var12, 255) << 4;
                    var5[var10] = class263.method1762(var12 >> 4, 4080);
                    var4[var10] = class263.method1762(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
    public static void method1171(boolean arg0) {
        field2466 = null;
        field2472 = null;
        if (!arg0) {
            method1171(false);
        }
    }
}
