import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class56 {

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    private int field4 = -1;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "Llga;")
    public static class711 field6 = new class711();

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "Lvc;")
    public static class316 field8;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "[I")
    public int[] field12;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method1(int arg0) {
        ++field7;
        if (this.field12 != null) {
            return true;
        } else if (arg0 != 2250) {
            return false;
        } else if (this.field4 >= 0) {
            class204 var2 = class202.field2641 >= 0 ? class204.method1237(class234.field3146, class202.field2641, this.field4) : class204.method1247(class234.field3146, this.field4);
            var2.method1248();
            this.field12 = var2.method1244();
            this.field11 = var2.field2657;
            this.field3 = var2.field2664;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 30)
    public class1() {
        super(0, false);
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)V", line = 36)
    public static void method2(int arg0) {
        field8 = null;
        field6 = null;
        if (arg0 < 116) {
            field6 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 47)
    public final void method3(byte arg0) {
        super.method3((byte) -38);
        ++field10;
        this.field12 = null;
        int var2 = -125 % ((52 - arg0) / 49);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I", line = 58)
    public final int method4(int arg0) {
        ++field2;
        return arg0 != 8347 ? -45 : this.field4;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[[I", line = 81)
    public int[][] method5(int arg0, int arg1) {
        if (arg1 != 1) {
            method2(44);
        }
        ++field1;
        int[][] var3 = super.field668.method3009(arg1 + -1, arg0);
        if (super.field668.field7292 && this.method1(2250)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class226.field3050 != this.field3 ? this.field3 * arg0 / class226.field3050 : arg0) * this.field11;
            if (~class328.field4576 != ~this.field11) {
                for (int var8 = 0; class328.field4576 > var8; ++var8) {
                    int var9 = this.field11 * var8 / class328.field4576;
                    int var10 = this.field12[var7 + var9];
                    var6[var8] = class286.method1877(var10, 255) << 4;
                    var5[var8] = class286.method1877(4080, var10 >> 4);
                    var4[var8] = class286.method1877(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class328.field4576 < ~var11; ++var11) {
                    int var12 = this.field12[var7++];
                    var6[var11] = class286.method1877(var12, 255) << 4;
                    var5[var11] = class286.method1877(4080, var12 >> 4);
                    var4[var11] = class286.method1877(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILee;I)V", line = 152)
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field9;
        if (~arg2 == -1) {
            this.field4 = arg1.method3757((byte) -65);
        }
        if (arg0 != 3731) {
            this.field12 = null;
        }
    }
}
