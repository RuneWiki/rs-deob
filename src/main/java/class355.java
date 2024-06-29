import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class355 {

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Ltg;")
    private class295 field4835 = new class295();

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lio;")
    public static class286 field4828 = new class286(5000);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Ltg;")
    private class295 field4838;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Ltg;")
    public final class295 method2234(int arg0) {
        field4837++;
        class295 var2 = this.field4835.field3979;
        if (this.field4835 == var2) {
            this.field4838 = null;
            return null;
        }
        this.field4838 = var2.field3979;
        if (arg0 != 9700) {
            method2236(119);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
    public final int method2235(byte arg0) {
        field4832++;
        int var2 = 0;
        class295 var3 = this.field4835.field3979;
        if (arg0 != 114) {
            return 24;
        }
        while (this.field4835 != var3) {
            var3 = var3.field3979;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public static void method2236(int arg0) {
        int var1 = 70 / ((arg0 + 30) / 57);
        field4828 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Ltg;")
    public final class295 method2237(byte arg0) {
        field4836++;
        class295 var2 = this.field4838;
        int var3 = 53 % ((-arg0 - 23) / 40);
        if (this.field4835 == var2) {
            this.field4838 = null;
            return null;
        } else {
            this.field4838 = var2.field3979;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public final void method2238(int arg0) {
        field4829++;
        if (arg0 != 5) {
            this.field4838 = null;
        }
        while (true) {
            class295 var2 = this.field4835.field3979;
            if (this.field4835 == var2) {
                this.field4838 = null;
                return;
            }
            var2.method1902(32);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lqf;IIIII)V")
    public static final void method2239(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5473 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class39.field603[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class21 var11 = class30.field511[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field5473; var12++) {
                            if (arg0.field5477[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field5477[arg0.field5473++] = var11;
                        if (arg0.field5473 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field5473; var13 < 4; var13++) {
            arg0.field5477[var13] = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
    public static final void method2240(byte arg0) {
        field4827++;
        if (arg0 != 53) {
            method2241(false);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class22.field408[var1] = false;
        }
        class441.field6354 = class356.field4842;
        class393.field5506 = class286.field3837;
        class184.field2675 = 5;
        class29.field493 = -1;
        class191.field2746 = class414.field5793;
        class187.field2708 = class443.field6389;
        class113.field1606 = class374.field5261;
        class265.field3565 = 0;
        class345.field4680 = class167.field2488;
        class286.field3830 = -1;
        class83.field1218 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
    public static final void method2241(boolean arg0) {
        field4831++;
        for (int var1 = 0; var1 < class150.field2295.length; var1++) {
            for (int var2 = 0; var2 < class150.field2295[var1].length; var2++) {
                class150.field2295[var1][var2] = class199.field2832;
            }
        }
        if (!arg0) {
            method2242((String) null, false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2242(String arg0, boolean arg1) {
        class301.field4042 = arg0;
        field4830++;
        if (!arg1) {
            field4828 = null;
        }
        if (class30.field502.field4117 == null) {
            return;
        }
        try {
            String var2 = class30.field502.field4117.getParameter("cookieprefix");
            String var3 = class30.field502.field4117.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class447.method2774(class108.method902((byte) -93) + 94608000000L, (byte) 32) + "; Max-Age=" + 94608000L;
            }
            class117.method934(class30.field502.field4117, "document.cookie=\"" + var5 + "\"", -8642);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Ltg;")
    public final class295 method2243(int arg0) {
        field4834++;
        if (arg0 != 0) {
            this.method2238(46);
        }
        class295 var2 = this.field4835.field3979;
        if (this.field4835 == var2) {
            return null;
        } else {
            var2.method1902(32);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILtg;)V")
    public final void method2244(int arg0, class295 arg1) {
        if (arg1.field3980 != null) {
            arg1.method1902(32);
        }
        field4833++;
        arg1.field3980 = this.field4835.field3980;
        arg1.field3979 = this.field4835;
        arg1.field3980.field3979 = arg1;
        arg1.field3979.field3980 = arg1;
        if (arg0 != 11310) {
            field4828 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
    public class355() {
        this.field4835.field3980 = this.field4835;
        this.field4835.field3979 = this.field4835;
    }
}
