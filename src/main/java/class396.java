import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class396 extends class297 {

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "[[Lat;")
    public static class378[][] field5798;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)Z", line = 4)
    public static final boolean method2480(boolean arg0, byte arg1) {
        ++field5797;
        boolean var2 = class272.field3822.method328();
        if (arg1 != -24) {
            return true;
        } else if (!var2 == !arg0) {
            return true;
        } else {
            if (!arg0) {
                class272.field3822.method257();
            } else if (!class272.field3822.method291()) {
                arg0 = false;
            }
            if (arg0 == var2) {
                return false;
            } else {
                class693.field9368.method2065((byte) 74, class693.field9368.field4440, arg0 ? 1 : 0);
                class310.method2019(37);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 42)
    public static void method2481(byte arg0) {
        field5798 = null;
        int var1 = 93 % ((-58 - arg0) / 55);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)[[I", line = 52)
    public final int[][] method18(int arg0, int arg1) {
        ++field5800;
        int[][] var3 = super.field4166.method2180(-97, arg0);
        if (arg1 != -1564599039) {
            field5798 = null;
        }
        if (super.field4166.field4849) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class525.field7275; ++var7) {
                this.method2482(var7, arg0, (byte) -31);
                int[][] var8 = this.method1948((byte) 43, class386.field5601, 0);
                var4[var7] = var8[0][class343.field4813];
                var5[var7] = var8[1][class343.field4813];
                var6[var7] = var8[2][class343.field4813];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)[I", line = 97)
    public final int[] method15(int arg0, int arg1) {
        ++field5799;
        if (arg1 != 255) {
            field5798 = null;
        }
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            for (int var4 = 0; ~class525.field7275 < ~var4; ++var4) {
                this.method2482(var4, arg0, (byte) -31);
                int[] var5 = this.method1951(class386.field5601, arg1 ^ 633706398, 0);
                var3[var4] = var5[class343.field4813];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lcea;II)V", line = 133)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            field5798 = null;
        }
        ++field5801;
        if (arg1 == 0) {
            super.field4178 = arg0.method1535(255) == 1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 147)
    public class396() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V", line = 151)
    private final void method2482(int arg0, int arg1, byte arg2) {
        ++field5796;
        int var4 = class733.field9899[arg0];
        int var5 = class620.field8445[arg1];
        if (arg2 != -31) {
            this.method2482(-44, -111, (byte) 48);
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class386.field5601 = arg1;
            class343.field4813 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class386.field5601 = arg0;
            class343.field4813 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class343.field4813 = class525.field7275 - arg1;
            class386.field5601 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class343.field4813 = arg0;
            class386.field5601 = class128.field2169 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class343.field4813 = -arg0 + class525.field7275;
            class386.field5601 = -arg1 + class128.field2169;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class343.field4813 = -arg1 + class525.field7275;
            class386.field5601 = -arg0 + class128.field2169;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class386.field5601 = -arg0 + class128.field2169;
            class343.field4813 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class386.field5601 = arg1;
            class343.field4813 = -arg0 + class525.field7275;
        }
        class386.field5601 &= class319.field4394;
        class343.field4813 &= class677.field9204;
    }
}
