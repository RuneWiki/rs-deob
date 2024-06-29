import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class87 extends class38 {

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    private int field1241 = -1;

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "[F")
    public static float[] field1244 = new float[4];

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "Lhe;")
    public static class372 field1236 = new class372(16);

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "S")
    public static short field1247 = 32767;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!tn", name = "X", descriptor = "I")
    public static volatile int field1249 = -1;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "Lvd;")
    public static class39 field1245;

    @OriginalMember(owner = "client!tn", name = "W", descriptor = "Ljava/applet/Applet;")
    public static Applet field1248;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "[I")
    public int[] field1237;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I", line = 10)
    public final int method192(byte arg0) {
        if (arg0 != 113) {
            field1236 = null;
        }
        ++field1240;
        return this.field1241;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z", line = 21)
    public final boolean method705(boolean arg0) {
        ++field1238;
        if (!arg0) {
            return false;
        } else if (this.field1237 != null) {
            return true;
        } else if (this.field1241 >= 0) {
            class129 var2 = ~class734.field10267 <= -1 ? class129.method919(class645.field9036, class734.field10267, this.field1241) : class129.method911(class645.field9036, this.field1241);
            var2.method909();
            this.field1237 = var2.method921();
            this.field1232 = var2.field1734;
            this.field1231 = var2.field1739;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I", line = 47)
    public int[][] method196(int arg0, int arg1) {
        ++field1233;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            this.method198(77);
        }
        if (super.field387.field6792 && this.method705(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1232 * (class632.field8852 == this.field1231 ? arg1 : this.field1231 * arg1 / class632.field8852);
            if (~class729.field10216 == ~this.field1232) {
                for (int var8 = 0; class729.field10216 > var8; ++var8) {
                    int var9 = this.field1237[var7++];
                    var6[var8] = class493.method2943(var9 << 4, 4080);
                    var5[var8] = class493.method2943(65280, var9) >> 4;
                    var4[var8] = class493.method2943(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class729.field10216; ++var10) {
                    int var11 = this.field1232 * var10 / class729.field10216;
                    int var12 = this.field1237[var7 + var11];
                    var6[var10] = class493.method2943(var12, 255) << 4;
                    var5[var10] = class493.method2943(65280, var12) >> 4;
                    var4[var10] = class493.method2943(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 115)
    public final void method198(int arg0) {
        ++field1243;
        super.method198(arg0);
        this.field1237 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILrg;)V", line = 125)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field1235;
        if (arg0 >= 34) {
            if (arg1 == 0) {
                this.field1241 = arg2.method3712((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 170)
    public class87() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(B)V", line = 153)
    public static void method706(byte arg0) {
        if (arg0 > 74) {
            field1245 = null;
            field1248 = null;
            field1244 = null;
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lpha;B)I", line = 176)
    public static final int method707(class165 arg0, byte arg1) {
        if (arg1 <= 37) {
            field1248 = null;
        }
        ++field1234;
        if (class499.field7099 != arg0) {
            if (class336.field4874 != arg0) {
                if (class49.field706 == arg0) {
                    return 34165;
                } else if (class661.field9242 != arg0) {
                    if (class449.field6633 == arg0) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }
}
