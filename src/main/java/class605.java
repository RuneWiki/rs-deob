import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class605 extends class325 {

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "Z")
    private boolean field8214 = true;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "Z")
    private boolean field8217 = true;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field8218 = 0;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "Z")
    public static boolean field8216 = false;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "Ljava/applet/Applet;")
    public static Applet field8212;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V", line = 6)
    public class605() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method100(byte arg0, int arg1) {
        ++field8221;
        if (arg0 <= 21) {
            field8212 = null;
        }
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(this.field8214 ? class566.field7574 - arg1 : arg1, 0, (byte) 33);
            if (this.field8217) {
                for (int var5 = 0; class261.field3874 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class625.field8423];
                }
            } else {
                class278.method1798(var4, 0, var3, 0, class261.field3874);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljp;IB)V", line = 48)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field8211;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4738 = ~arg0.method2398(-1372747256) == -2;
                }
            } else {
                this.field8214 = ~arg0.method2398(-1372747256) == -2;
            }
        } else {
            this.field8217 = arg0.method2398(-1372747256) == 1;
        }
        if (arg2 >= -41) {
            field8216 = false;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Ljava/lang/String;", line = 99)
    public static final String method3355(int arg0, int arg1) {
        ++field8213;
        class150 var2 = (class150) class507.field7007.method3953((long) arg0, 14);
        if (arg1 < 55) {
            field8216 = true;
        }
        if (var2 != null) {
            class106 var3 = var2.field2082.method2723(15570);
            if (var3 != null) {
                double var4 = var2.field2082.method2732(0);
                if ((double) var3.method812((byte) -19) <= var4 && (double) var3.method809((byte) 126) >= var4) {
                    return var3.method810(true);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[I", line = 131)
    public final int[][] method360(int arg0, byte arg1) {
        ++field8215;
        if (arg1 != -9) {
            this.field8214 = true;
        }
        int[][] var3 = super.field4733.method1251((byte) 90, arg0);
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, !this.field8214 ? arg0 : class566.field7574 - arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field8217) {
                for (int var11 = 0; ~class261.field3874 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class261.field3874; ++var12) {
                    var8[var12] = var5[class625.field8423 - var12];
                    var9[var12] = var6[-var12 + class625.field8423];
                    var10[var12] = var7[-var12 + class625.field8423];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(B)V", line = 196)
    public static void method3356(byte arg0) {
        int var1 = 126 / ((arg0 - 17) / 40);
        field8212 = null;
    }
}
