import java.awt.Container;
import java.awt.Insets;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class262 extends class34 {

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    private int field4031 = 4096;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    private int field4036 = 4096;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    private int field4041 = 4096;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "Ljava/util/Random;")
    public static Random field4039 = new Random();

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static void method1774(byte arg0) {
        if (arg0 >= 76) {
            field4039 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field4042;
        if (arg0 != 6) {
            method1776(70);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4036 = arg2.method423(86);
                }
            } else {
                this.field4031 = arg2.method423(arg0 + 120);
            }
        } else {
            this.field4041 = arg2.method423(arg0 + 41);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class262() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int[][] var3 = super.field618.method91(54, arg1);
        ++field4033;
        if (super.field618.field211) {
            int[][] var4 = this.method231(arg1, (byte) 69, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class226.field3527 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var8[var11];
                if (var12 == var14 && ~var13 == ~var14) {
                    var10[var11] = this.field4041 * var12 >> 12;
                    var6[var11] = this.field4031 * var14 >> 12;
                    var9[var11] = this.field4036 * var13 >> 12;
                } else {
                    var10[var11] = this.field4041;
                    var6[var11] = this.field4031;
                    var9[var11] = this.field4036;
                }
            }
        }
        int var15 = -95 % ((arg0 - -54) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method1775(boolean arg0, int arg1, String arg2, String arg3, String arg4) {
        class163.method1105(-1, -2694, arg1, arg3, arg2, arg4);
        if (!arg0) {
            field4039 = null;
        }
        ++field4037;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static final void method1776(int arg0) {
        ++field4035;
        Container var1;
        if (class247.field3838 == null) {
            if (class167.field2459 == null) {
                var1 = class217.field3338.field505;
            } else {
                var1 = class167.field2459;
            }
        } else {
            var1 = class247.field3838;
        }
        class145.field2099 = var1.getSize().width;
        class23.field385 = var1.getSize().height;
        if (class167.field2459 == var1) {
            Insets var2 = class167.field2459.getInsets();
            class145.field2099 -= var2.left - -var2.right;
            class23.field385 -= var2.top + var2.bottom;
        }
        if (~class227.method1552(false) > -3) {
            class208.field3118 = (class145.field2099 + -765) / 2;
            class85.field1311 = 503;
            class199.field2989 = 0;
            class126.field1854 = 765;
        } else {
            class126.field1854 = class145.field2099;
            class208.field3118 = 0;
            class199.field2989 = 0;
            class85.field1311 = class23.field385;
        }
        class297.field4569.setSize(class126.field1854, class85.field1311);
        if (class167.field2459 != var1) {
            class297.field4569.setLocation(class208.field3118, class199.field2989);
        } else {
            Insets var3 = class167.field2459.getInsets();
            class297.field4569.setLocation(class208.field3118 + var3.left, class199.field2989 + var3.top);
        }
        if (arg0 == 765) {
            if (~class184.field2677 != 0) {
                class178.method1177(false, true);
            }
            class10.method76(736);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method1777(boolean arg0, boolean arg1, String arg2) {
        if (!arg0) {
            field4039 = null;
        }
        ++field4040;
        if (arg1) {
            try {
                class112.field1717.getAppletContext().showDocument(new URL(class112.field1717.getCodeBase(), arg2), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class238.method1634("loggedout", (byte) -86, class217.field3338.field505);
            } catch (Throwable var5) {
            }
            try {
                class112.field1717.getAppletContext().showDocument(new URL(class112.field1717.getCodeBase(), arg2), "_top");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    public static final void method1778(int arg0) {
        if (arg0 != -765) {
            method1778(-43);
        }
        class174.field2551.method944(65535);
        ++field4034;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
    public static final void method1779(int arg0) {
        ++field4038;
        if (arg0 > -84) {
            method1779(-123);
        }
        class195.field2945.method940(91);
    }
}
