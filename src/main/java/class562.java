import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class562 extends class748 {

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    private int field7986 = -1;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Lqk;")
    public static class148 field7994 = new class148(32, 0);

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public int field7992;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public int field7993;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "Lol;")
    public static class248 field7995;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
    public int[] field7989;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
    public static void method3361(int arg0) {
        if (arg0 != -25344) {
            method3361(63);
        }
        field7994 = null;
        field7995 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field7991;
        if (arg1) {
            this.method3362((byte) -11);
        }
        if (~arg0 == -1) {
            this.field7986 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class562() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public final void method792(boolean arg0) {
        super.method792(arg0);
        ++field7990;
        if (!arg0) {
            this.field7989 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)[[I")
    public int[][] method445(int arg0, int arg1) {
        ++field7987;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (arg1 != 0) {
            this.field7993 = -110;
        }
        if (super.field10420.field1979 && this.method3363((byte) 59)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class245.field3400 != ~this.field7992 ? this.field7992 * arg0 / class245.field3400 : arg0) * this.field7993;
            if (class424.field5889 != this.field7993) {
                for (int var8 = 0; class424.field5889 > var8; ++var8) {
                    int var9 = this.field7993 * var8 / class424.field5889;
                    int var10 = this.field7989[var7 + var9];
                    var6[var8] = class136.method878(var10, 255) << 4;
                    var5[var8] = class136.method878(65280, var10) >> 4;
                    var4[var8] = class136.method878(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class424.field5889; ++var11) {
                    int var12 = this.field7989[var7++];
                    var6[var11] = class136.method878(255, var12) << 4;
                    var5[var11] = class136.method878(65280, var12) >> 4;
                    var4[var11] = class136.method878(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)I")
    public final int method3362(byte arg0) {
        ++field7985;
        return arg0 <= 109 ? 15 : this.field7986;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Z")
    public final boolean method3363(byte arg0) {
        ++field7988;
        if (this.field7989 != null) {
            return true;
        } else {
            if (arg0 < 7) {
                this.field7992 = 21;
            }
            if (this.field7986 >= 0) {
                class320 var2 = class589.field8453 >= 0 ? class320.method1870(class87.field1200, class589.field8453, this.field7986) : class320.method1861(class87.field1200, this.field7986);
                var2.method1859();
                this.field7989 = var2.method1865();
                this.field7993 = var2.field4122;
                this.field7992 = var2.field4121;
                return true;
            } else {
                return false;
            }
        }
    }
}
