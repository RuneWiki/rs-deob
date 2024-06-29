import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class708 extends class667 {

    @OriginalMember(owner = "client!ega", name = "H", descriptor = "I")
    private int field9905 = -1;

    @OriginalMember(owner = "client!ega", name = "B", descriptor = "I")
    public int field9899;

    @OriginalMember(owner = "client!ega", name = "C", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!ega", name = "D", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!ega", name = "E", descriptor = "I")
    public int field9902;

    @OriginalMember(owner = "client!ega", name = "G", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!ega", name = "I", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!ega", name = "J", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!ega", name = "K", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!ega", name = "F", descriptor = "Lvo;")
    public static class41 field9903;

    @OriginalMember(owner = "client!ega", name = "L", descriptor = "[I")
    public int[] field9909;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)V")
    public final void method3745(boolean arg0) {
        ++field9900;
        super.method3745(arg0);
        this.field9909 = null;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
    public class708() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
    public static void method3961(int arg0) {
        field9903 = null;
        if (arg0 != 16711680) {
            method3961(-23);
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(Z)I")
    public final int method3749(boolean arg0) {
        if (!arg0) {
            this.method116((class35) null, -55, 43);
        }
        ++field9908;
        return this.field9905;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)Z")
    public final boolean method3962(int arg0) {
        if (arg0 < 97) {
            this.method3962(86);
        }
        ++field9901;
        if (this.field9909 != null) {
            return true;
        } else if (this.field9905 >= 0) {
            class55 var2 = class437.field6107 >= 0 ? class55.method502(class419.field5894, class437.field6107, this.field9905) : class55.method496(class419.field5894, this.field9905);
            var2.method506();
            this.field9909 = var2.method499();
            this.field9899 = var2.field1038;
            this.field9902 = var2.field1044;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)[[I")
    public int[][] method777(boolean arg0, int arg1) {
        ++field9907;
        if (arg0) {
            return null;
        } else {
            int[][] var3 = super.field9357.method2314((byte) 41, arg1);
            if (super.field9357.field5178 && this.method3962(99)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field9902 * (class694.field9758 != this.field9899 ? this.field9899 * arg1 / class694.field9758 : arg1);
                if (class77.field1455 != this.field9902) {
                    for (int var8 = 0; ~class77.field1455 < ~var8; ++var8) {
                        int var9 = this.field9902 * var8 / class77.field1455;
                        int var10 = this.field9909[var7 + var9];
                        var6[var8] = class555.method3246(4080, var10 << 4);
                        var5[var8] = class555.method3246(var10 >> 4, 4080);
                        var4[var8] = class555.method3246(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; var11 < class77.field1455; ++var11) {
                        int var12 = this.field9909[var7++];
                        var6[var11] = class555.method3246(var12 << 4, 4080);
                        var5[var11] = class555.method3246(4080, var12 >> 4);
                        var4[var11] = class555.method3246(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.field9905 = 46;
        }
        ++field9906;
        if (~arg2 == -1) {
            this.field9905 = arg0.method253(-13900);
        }
    }
}
