import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class124 extends class105 {

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    private int field2232 = 2048;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    private int field2233 = 3072;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    private int field2234 = 1024;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2227 = 3;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
    public static int[] field2229 = new int[100];

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lvf;")
    public static class265 field2235 = class87.method582(-46, "::");

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "Lvf;")
    public static class265 field2228 = class87.method582(-46, "gr-Un:");

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
    public static int[] field2226;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IZ)V")
    public static final void method833(int arg0, boolean arg1) {
        ++field2238;
        if (!class256.field4380 == arg1) {
            if (arg0 != 2) {
                method834(-77, 67, -40);
            }
            class256.field4380 = arg1;
            class237.method1580((byte) -3);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1853 = arg2.method920((byte) 111) == 1;
                }
            } else {
                this.field2233 = arg2.method927(127);
            }
        } else {
            this.field2234 = arg2.method927(125);
        }
        ++field2231;
        if (arg1 != 255) {
            method833(-117, true);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public static final boolean method834(int arg0, int arg1, int arg2) {
        int var3 = class207.field3721[arg0][arg1][arg2];
        if (-class68.field1296 == var3) {
            return false;
        } else if (class68.field1296 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class155.method1053(var4 + 1, class279.field4936[arg0][arg1][arg2], var5 + 1) && class155.method1053(var4 + 128 - 1, class279.field4936[arg0][arg1 + 1][arg2], var5 + 1) && class155.method1053(var4 + 128 - 1, class279.field4936[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class155.method1053(var4 + 1, class279.field4936[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class207.field3721[arg0][arg1][arg2] = class68.field1296;
                return true;
            } else {
                class207.field3721[arg0][arg1][arg2] = -class68.field1296;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static void method835(int arg0) {
        field2235 = null;
        field2229 = null;
        if (arg0 != 1) {
            field2227 = -109;
        }
        field2226 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (arg0) {
            this.field2233 = -94;
        }
        this.field2232 = -this.field2234 + this.field2233;
        ++field2225;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        int[][] var3 = super.field1870.method569((byte) -101, arg0);
        if (arg1 >= -110) {
            return null;
        } else {
            ++field2236;
            if (super.field1870.field1567) {
                int[][] var4 = this.method702((byte) 94, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class94.field1668; ++var11) {
                    var8[var11] = (var5[var11] * this.field2232 >> 12) + this.field2234;
                    var9[var11] = (var6[var11] * this.field2232 >> 12) + this.field2234;
                    var10[var11] = (var7[var11] * this.field2232 >> 12) + this.field2234;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field2237;
        int[] var3 = super.field1862.method458(arg1, false);
        if (arg0 != 8055) {
            return null;
        } else {
            if (super.field1862.field1236) {
                int[] var4 = this.method705(arg1, (byte) -93, 0);
                for (int var5 = 0; ~class94.field1668 < ~var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field2232 >> 12) + this.field2234;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method836(Component arg0, int arg1) {
        if (arg1 > 42) {
            Method var2 = class226.field4023;
            ++field2230;
            if (var2 != null) {
                try {
                    var2.invoke(arg0, Boolean.FALSE);
                } catch (Throwable var3) {
                }
            }
            arg0.addKeyListener(class94.field1673);
            arg0.addFocusListener(class94.field1673);
        }
    }
}
