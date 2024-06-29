import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class310 extends class210 {

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    private int field4571 = -1;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "[I")
    public static int[] field4567 = new int[14];

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "Lil;")
    public static class274 field4560 = new class274(6, 14);

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "[I")
    public int[] field4568;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public final void method226(boolean arg0) {
        if (arg0) {
            super.method226(arg0);
            ++field4562;
            this.field4568 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class310() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[[I")
    public int[][] method58(int arg0, int arg1) {
        ++field4563;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (arg1 < 94) {
            this.field4565 = -48;
        }
        if (super.field2967.field3454 && this.method2063(32173)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class130.field1771 == this.field4570 ? arg0 : this.field4570 * arg0 / class130.field1771) * this.field4565;
            if (class202.field2852 != this.field4565) {
                for (int var8 = 0; var8 < class202.field2852; ++var8) {
                    int var9 = this.field4565 * var8 / class202.field2852;
                    int var10 = this.field4568[var7 + var9];
                    var6[var8] = class386.method2438(var10 << 4, 4080);
                    var5[var8] = class386.method2438(65280, var10) >> 4;
                    var4[var8] = class386.method2438(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class202.field2852 > var11; ++var11) {
                    int var12 = this.field4568[var7++];
                    var6[var11] = class386.method2438(var12 << 4, 4080);
                    var5[var11] = class386.method2438(4080, var12 >> 4);
                    var4[var11] = class386.method2438(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(III)V")
    public static final void method2061(int arg0, int arg1, int arg2) {
        int var3 = class450.field6629 * arg0 >> 8;
        ++field4561;
        if (~arg1 == arg2 && !class29.field408) {
            class282.method1904((byte) 109);
        } else if (~arg1 != 0 && (class343.field5048 != arg1 || !class236.method1593((byte) 86)) && var3 != 0 && !class29.field408) {
            class436.method2686(arg1, 0, var3, 2, false, class454.field6706, (byte) -58);
        }
        class343.field5048 = arg1;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
    public static void method2062(boolean arg0) {
        if (arg0) {
            method2061(-56, -68, -10);
        }
        field4560 = null;
        field4567 = null;
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)Z")
    public final boolean method2063(int arg0) {
        if (arg0 != 32173) {
            this.field4571 = -23;
        }
        ++field4564;
        if (this.field4568 != null) {
            return true;
        } else if (~this.field4571 <= -1) {
            class144 var2 = class62.field822 < 0 ? class144.method994(class154.field2076, this.field4571) : class144.method991(class154.field2076, class62.field822, this.field4571);
            var2.method1003();
            this.field4568 = var2.method999();
            this.field4570 = var2.field1955;
            this.field4565 = var2.field1952;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field4569;
        if (arg1 != -11941) {
            this.field4571 = -83;
        }
        if (arg0 == 0) {
            this.field4571 = arg2.method1767(1930493576);
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I")
    public final int method1442(int arg0) {
        if (arg0 != 8216) {
            this.method226(true);
        }
        ++field4566;
        return this.field4571;
    }
}
