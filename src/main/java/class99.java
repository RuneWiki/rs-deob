import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class99 extends class149 {

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    private int field1420 = 1365;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    private int field1425 = 0;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field1431 = 0;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    private int field1430 = 20;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field1423 = -1;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Z")
    public static boolean field1426 = false;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "F")
    public static float field1428 = 1024.0F;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field1429 = 0;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Lns;")
    public static class438 field1427;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 6)
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method92(int arg0, int arg1) {
        ++field1422;
        if (arg0 != -10835) {
            return null;
        } else {
            int[] var3 = super.field2152.method2891(arg1, (byte) 120);
            if (super.field2152.field7051) {
                for (int var4 = 0; ~var4 > ~class316.field4838; ++var4) {
                    int var5 = (class197.field2791[var4] << 12) / this.field1420 + this.field1431;
                    int var6 = (class185.field2613[arg1] << 12) / this.field1420 - -this.field1425;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && this.field1430 > var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var7 + var11;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 > ~(this.field1430 + -1) ? (var13 << 12) / this.field1430 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBLtl;)V", line = 71)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field1425 = arg2.method631(10494);
                    }
                } else {
                    this.field1431 = arg2.method631(10494);
                }
            } else {
                this.field1430 = arg2.method631(arg1 + 10459);
            }
        } else {
            this.field1420 = arg2.method631(arg1 + 10459);
        }
        ++field1424;
        if (arg1 != 35) {
            this.method92(-42, 122);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZI)Ljh;", line = 136)
    public static final class377 method672(int arg0, boolean arg1, int arg2) {
        ++field1421;
        if (arg1) {
            field1427 = null;
        }
        class377 var3 = (class377) class33.field515.method943((long) arg2 << 32 | (long) arg0, -1);
        if (var3 == null) {
            var3 = new class377(arg2, arg0);
            class33.field515.method940(var3.field6799, -58, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 162)
    public static void method673(boolean arg0) {
        field1427 = null;
        if (!arg0) {
            method673(false);
        }
    }
}
