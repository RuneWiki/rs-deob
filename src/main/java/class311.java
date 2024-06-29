import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class311 extends class72 {

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lqe;")
    public static class465 field4391 = new class465(71, 0);

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
    public static int[] field4385;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public static void method2014(boolean arg0) {
        if (!arg0) {
            method2014(true);
        }
        field4391 = null;
        field4385 = null;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lcq;)V")
    public class311(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)I")
    public final int method2015(int arg0) {
        if (arg0 != 27669) {
            this.method59(35, 127);
        }
        ++field4388;
        return super.field1282;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method2015(66);
        }
        ++field4386;
        return super.field1286.method2815(-102) == class87.field1576 && super.field1286.method2818(true) ? 0 : 1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2016(String arg0, int arg1) {
        ++field4389;
        int var2 = arg0.length();
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = var2 + 3 & -4;
            int var4 = var3 / 4 * 3;
            if (var2 > var3 + -2 && class695.method3902(1237726796, arg0.charAt(var3 - 2)) != -1) {
                if (~(var3 + -1) <= ~var2 || ~class695.method3902(1237726796, arg0.charAt(var3 + -1)) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class117.method949(arg0, 0, arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field4387;
        if (arg0 <= 30) {
            field4385 = null;
        }
        super.field1282 = this.method60(-3271);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        if (arg1 != 3) {
            field4385 = null;
        }
        super.field1282 = arg0;
        ++field4393;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field4392;
        return arg1 != 11260 ? -102 : 3;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(ILcq;)V")
    public class311(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lvk;ILjava/lang/String;I)Lav;")
    public static final class637 method2017(class367 arg0, int arg1, String arg2, int arg3) {
        ++field4390;
        if (arg1 == 0) {
            return arg0.method2288(-19, arg2);
        } else if (~arg1 == -2) {
            try {
                class101.method890("openjs", -86, new Object[] { (new URL(class476.field6812.getCodeBase(), arg2)).toString() }, class476.field6812);
                class637 var4 = new class637();
                var4.field9091 = 1;
                return var4;
            } catch (Throwable var10) {
                class637 var5 = new class637();
                var5.field9091 = 2;
                return var5;
            }
        } else if (~arg1 == -3) {
            try {
                class476.field6812.getAppletContext().showDocument(new URL(class476.field6812.getCodeBase(), arg2), "_blank");
                class637 var6 = new class637();
                var6.field9091 = 1;
                return var6;
            } catch (Exception var11) {
                class637 var7 = new class637();
                var7.field9091 = 2;
                return var7;
            }
        } else {
            if (arg3 != 2) {
                field4385 = null;
            }
            if (~arg1 == -4) {
                try {
                    class101.method889("loggedout", class476.field6812, -27420);
                } catch (Throwable var13) {
                }
                try {
                    class476.field6812.getAppletContext().showDocument(new URL(class476.field6812.getCodeBase(), arg2), "_top");
                    class637 var8 = new class637();
                    var8.field9091 = 1;
                    return var8;
                } catch (Exception var12) {
                    class637 var9 = new class637();
                    var9.field9091 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
