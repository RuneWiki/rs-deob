import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class442 extends class621 implements class125 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private int field5598;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[I")
    public static int[] field5601 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[I")
    public static int[] field5599;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I", line = 4)
    public final int method663(byte arg0) {
        ++field5597;
        if (arg0 != -17) {
            field5599 = null;
        }
        return this.field5598;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;Lrj;I)Lvfa;", line = 15)
    public static final class264 method2368(int arg0, String arg1, class648 arg2, int arg3) {
        ++field5600;
        if (arg3 == 0) {
            return arg2.method3632(0, arg1);
        } else if (arg3 == 1) {
            try {
                class371.method2027(class422.field5308, "openjs", new Object[] { (new URL(class422.field5308.getCodeBase(), arg1)).toString() }, 1164);
                class264 var4 = new class264();
                var4.field3358 = 1;
                return var4;
            } catch (Throwable var11) {
                class264 var5 = new class264();
                var5.field3358 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                class422.field5308.getAppletContext().showDocument(new URL(class422.field5308.getCodeBase(), arg1), "_blank");
                class264 var6 = new class264();
                var6.field3358 = 1;
                return var6;
            } catch (Exception var12) {
                class264 var7 = new class264();
                var7.field3358 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class371.method2028(true, "loggedout", class422.field5308);
            } catch (Throwable var14) {
            }
            try {
                class422.field5308.getAppletContext().showDocument(new URL(class422.field5308.getCodeBase(), arg1), "_top");
                class264 var8 = new class264();
                var8.field3358 = 1;
                return var8;
            } catch (Exception var13) {
                class264 var9 = new class264();
                var9.field3358 = 2;
                return var9;
            }
        } else {
            int var10 = -36 % ((arg0 - 27) / 52);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III[B)V", line = 88)
    public final void method665(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 17816) {
            field5599 = null;
        }
        this.method3406(arg3, arg2);
        ++field5595;
        this.field5598 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lqj;I[BI)V", line = 100)
    public class442(class548 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5598 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J", line = 114)
    public final long method662(int arg0) {
        if (arg0 != 13456) {
            return -7L;
        } else {
            ++field5596;
            return super.field8673.getAddress();
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I", line = 126)
    public final int method664(int arg0) {
        ++field5602;
        if (arg0 != -22904) {
            method2368(104, (String) null, (class648) null, -8);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z", line = 139)
    public static final boolean method2369(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 12524) {
            method2369(-110, -56, 69, 12);
        }
        ++field5594;
        class192.field2395.method906(arg2, arg1, arg0, class378.field4789);
        int var4 = class378.field4789[2];
        if (~var4 > -51) {
            return false;
        } else {
            class378.field4789[1] = class378.field4789[1] * class117.field1518 / var4 + class395.field4969;
            class378.field4789[2] = var4;
            class378.field4789[0] = class378.field4789[0] * class80.field1084 / var4 + class201.field2543;
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 165)
    public static void method2370(int arg0) {
        field5601 = null;
        if (arg0 != 1) {
            field5601 = null;
        }
        field5599 = null;
    }
}
