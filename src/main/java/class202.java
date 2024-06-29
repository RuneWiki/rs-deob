import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class202 extends class17 {

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    private int field2892 = -1;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field2889 = -1;

    @OriginalMember(owner = "client!vt", name = "P", descriptor = "Leh;")
    public static class246 field2899 = new class246(95, 8);

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "[I")
    public int[] field2895;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field2897;
        if (arg1 == 0) {
            this.field2892 = arg0.method2338(0);
        }
        if (arg2 != 5159) {
            this.method85(-75);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V")
    public static final void method1298(byte arg0, boolean arg1) {
        int var2 = 67 / ((arg0 - -37) / 33);
        if (arg1) {
            if (~class472.field6578 != 0) {
                class471.method2726(5, class472.field6578);
            }
            for (class489 var3 = (class489) class255.field3763.method2414((byte) -128); var3 != null; var3 = (class489) class255.field3763.method2410((byte) 77)) {
                if (!var3.method2894(0)) {
                    var3 = (class489) class255.field3763.method2414((byte) -127);
                    if (var3 == null) {
                        break;
                    }
                }
                class309.method1870(var3, -26349, true, false);
            }
            class472.field6578 = -1;
            class255.field3763 = new class406(8);
            class355.method2096(0);
            class472.field6578 = class10.field142;
            class106.method719(2, false);
            class385.method2235((byte) 113);
            class495.method2867(class472.field6578);
        }
        ++field2898;
        class137.field1794 = true;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
    public static void method1299(byte arg0) {
        field2899 = null;
        if (arg0 > -126) {
            method1298((byte) 62, false);
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
    public class202() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)[[I")
    public int[][] method89(int arg0, byte arg1) {
        ++field2893;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            this.field2900 = -65;
        }
        if (super.field201.field4431 && this.method1300(arg1 + 134)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class178.field2556 == ~this.field2900 ? arg0 : this.field2900 * arg0 / class178.field2556) * this.field2896;
            if (~class530.field7763 != ~this.field2896) {
                for (int var8 = 0; var8 < class530.field7763; ++var8) {
                    int var9 = this.field2896 * var8 / class530.field7763;
                    int var10 = this.field2895[var7 + var9];
                    var6[var8] = class239.method1507(4080, var10 << 4);
                    var5[var8] = class239.method1507(var10, 65280) >> 4;
                    var4[var8] = class239.method1507(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class530.field7763; ++var11) {
                    int var12 = this.field2895[var7++];
                    var6[var11] = class239.method1507(var12, 255) << 4;
                    var5[var11] = class239.method1507(var12 >> 4, 4080);
                    var4[var11] = class239.method1507(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public final void method84(int arg0) {
        super.method84(arg0);
        ++field2890;
        this.field2895 = null;
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)I")
    public final int method85(int arg0) {
        ++field2894;
        if (arg0 != -1) {
            method1299((byte) -90);
        }
        return this.field2892;
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)Z")
    public final boolean method1300(int arg0) {
        ++field2891;
        if (this.field2895 != null) {
            return true;
        } else if (arg0 < 25) {
            return false;
        } else if (~this.field2892 <= -1) {
            class506 var2 = ~class5.field87 <= -1 ? class506.method3018(class1.field30, class5.field87, this.field2892) : class506.method3020(class1.field30, this.field2892);
            var2.method3014();
            this.field2895 = var2.method3017();
            this.field2896 = var2.field7495;
            this.field2900 = var2.field7489;
            return true;
        } else {
            return false;
        }
    }
}
