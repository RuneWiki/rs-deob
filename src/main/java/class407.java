import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class407 {

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Lfg;")
    public static class83 field5641 = new class83("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient;")
    public static client field5639;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "[Lf;")
    public static class529[] field5642;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lvh;I)V")
    public static final void method2349(class240 arg0, int arg1) {
        if (arg1 <= 24) {
            field5641 = null;
        }
        class84.field1165 = arg0;
        field5638++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lkj;ILjava/lang/String;I)Lgu;")
    public static final class409 method2350(class397 arg0, int arg1, String arg2, int arg3) {
        field5640++;
        if (arg3 == 0) {
            return arg0.method2270(arg2, 126);
        }
        if (arg1 >= -52) {
            method2353(23);
        }
        if (arg3 == 1) {
            try {
                class484.method2857("openjs", new Object[] { (new URL(arg0.field5516.getCodeBase(), arg2)).toString() }, false, arg0.field5516);
                class409 var4 = new class409();
                var4.field5652 = 1;
                return var4;
            } catch (Throwable var10) {
                class409 var5 = new class409();
                var5.field5652 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg0.field5516.getAppletContext().showDocument(new URL(arg0.field5516.getCodeBase(), arg2), "_blank");
                class409 var6 = new class409();
                var6.field5652 = 1;
                return var6;
            } catch (Exception var11) {
                class409 var7 = new class409();
                var7.field5652 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class484.method2855(arg0.field5516, "loggedout", -29222);
            } catch (Throwable var13) {
            }
            try {
                arg0.field5516.getAppletContext().showDocument(new URL(arg0.field5516.getCodeBase(), arg2), "_top");
                class409 var8 = new class409();
                var8.field5652 = 1;
                return var8;
            } catch (Exception var12) {
                class409 var9 = new class409();
                var9.field5652 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
    public static final int method2351(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field5636++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = -38 / ((-arg0 - 20) / 49);
        int var6 = (var4 >>> 8) + var4;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILss;)V")
    public static final void method2352(int arg0, int arg1, int arg2, class295 arg3) {
        if (arg3.field4020 == 0) {
            arg3.field4063 = arg3.field3934;
        } else if (arg3.field4020 == 1) {
            arg3.field4063 = (arg0 - arg3.field4022) / 2 + arg3.field3934;
        } else if (arg3.field4020 == 2) {
            arg3.field4063 = arg0 - arg3.field4022 - arg3.field3934;
        } else if (arg3.field4020 == 3) {
            arg3.field4063 = arg3.field3934 * arg0 >> 14;
        } else if (arg3.field4020 == 4) {
            arg3.field4063 = (arg3.field3934 * arg0 >> 14) + (arg0 - arg3.field4022) / 2;
        } else {
            arg3.field4063 = arg0 - arg3.field4022 - (arg3.field3934 * arg0 >> 14);
        }
        field5637++;
        if (arg3.field4003 == arg2) {
            arg3.field3982 = arg3.field3966;
        } else if (arg3.field4003 == 1) {
            arg3.field3982 = (arg1 - arg3.field3960) / 2 + arg3.field3966;
        } else if (arg3.field4003 == 2) {
            arg3.field3982 = arg1 - (arg3.field3960 + arg3.field3966);
        } else if (arg3.field4003 == 3) {
            arg3.field3982 = arg3.field3966 * arg1 >> 14;
        } else if (arg3.field4003 == 4) {
            arg3.field3982 = (arg1 - arg3.field3960) / 2 + (arg3.field3966 * arg1 >> 14);
        } else {
            arg3.field3982 = arg1 - (arg3.field3966 * arg1 >> 14) - arg3.field3960;
        }
        if (!class476.field6973) {
            return;
        }
        if (client.method1191(arg3).field2833 == 0 && arg3.field3984 != 0) {
            return;
        }
        if (arg3.field4063 < 0) {
            arg3.field4063 = 0;
        } else if (arg0 < (arg3.field4063 + arg3.field4022)) {
            arg3.field4063 = arg0 - arg3.field4022;
        }
        if (arg3.field3982 < 0) {
            arg3.field3982 = 0;
            return;
        }
        if ((arg3.field3982 + arg3.field3960) > arg1) {
            arg3.field3982 = arg1 - arg3.field3960;
            return;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method2353(int arg0) {
        field5642 = null;
        field5641 = null;
        int var1 = -68 / ((32 - arg0) / 50);
        field5639 = null;
    }
}
