import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class88 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lsg;")
    public static class247 field1713;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lcj;")
    public static class28 field1712;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lcj;")
    public static class28 field1715;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[Lpd;I)V")
    public static final void method619(int arg0, int arg1, class200[] arg2, int arg3) {
        if (arg1 != -228) {
            field1712 = null;
        }
        field1717++;
        if (arg3 >= arg0) {
            return;
        }
        int var4 = arg3 - 1;
        int var5 = arg0 + 1;
        int var6 = (arg3 + arg0) / 2;
        class200 var7 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var7;
        while (var5 > var4) {
            boolean var8 = true;
            do {
                var5--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class135.field2504[var9] == 2) {
                        var10 = arg2[var5].field3449;
                        var11 = var7.field3449;
                    } else if (class135.field2504[var9] == 1) {
                        var10 = arg2[var5].field3451;
                        if (var10 == -1 && class222.field3790[var9] == 1) {
                            var10 = 2001;
                        }
                        var11 = var7.field3451;
                        if (var11 == -1 && class222.field3790[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class135.field2504[var9] == 3) {
                        var11 = var7.field3447 ? 1 : 0;
                        var10 = arg2[var5].field3447 ? 1 : 0;
                    } else {
                        var10 = arg2[var5].field3450;
                        var11 = var7.field3450;
                    }
                    if (var10 != var11) {
                        if ((class222.field3790[var9] != 1 || var11 >= var10) && (class222.field3790[var9] != 0 || var11 <= var10)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class135.field2504[var13] == 2) {
                        var14 = arg2[var4].field3449;
                        var15 = var7.field3449;
                    } else if (class135.field2504[var13] == 1) {
                        var14 = arg2[var4].field3451;
                        var15 = var7.field3451;
                        if (var15 == -1 && class222.field3790[var13] == 1) {
                            var15 = 2001;
                        }
                        if (var14 == -1 && class222.field3790[var13] == 1) {
                            var14 = 2001;
                        }
                    } else if (class135.field2504[var13] == 3) {
                        var14 = arg2[var4].field3447 ? 1 : 0;
                        var15 = var7.field3447 ? 1 : 0;
                    } else {
                        var15 = var7.field3450;
                        var14 = arg2[var4].field3450;
                    }
                    if (var14 != var15) {
                        if ((class222.field3790[var13] != 1 || var15 <= var14) && (class222.field3790[var13] != 0 || var14 <= var15)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var5 > var4) {
                class200 var16 = arg2[var4];
                arg2[var4] = arg2[var5];
                arg2[var5] = var16;
            }
        }
        method619(var5, -228, arg2, arg3);
        method619(arg0, -228, arg2, var5 + 1);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
    public static final void method620(int arg0, boolean arg1) {
        if (!arg1) {
            field1715 = null;
        }
        field1709++;
        class200.field3448.method1611(-18767, arg0);
        class162.field2901.method1611(-18767, arg0);
        class170.field3020.method1611(-18767, arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
    public static final void method621(byte arg0, int arg1) {
        field1708++;
        if (arg0 != -117) {
            method624(-42, 32, -2, -81, 42, 107, -83);
        }
        class197 var2 = class135.method933(arg1, 1, (byte) -128);
        var2.method1288((byte) -50);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLcj;)V")
    public static final void method622(byte arg0, class28 arg1) {
        int var2 = 95 / ((-arg0 - 64) / 32);
        class112.field2149 = arg1.method132(class40.field658, (byte) -98);
        class70.field1408 = arg1.method132(class90.field1738, (byte) -82);
        field1710++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;III)Lme;")
    public static final class145 method623(Component arg0, int arg1, int arg2, int arg3) {
        field1711++;
        try {
            Class var4 = Class.forName("ue");
            class145 var5 = (class145) var4.getDeclaredConstructor().newInstance();
            if (arg3 >= -12) {
                method620(-53, false);
            }
            var5.method120(arg0, arg1, -121, arg2);
            return var5;
        } catch (Throwable var7) {
            class27 var6 = new class27();
            var6.method120(arg0, arg1, -127, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class259 var7 = new class259();
        var7.field4545 = arg1 / 128;
        var7.field4548 = arg2 / 128;
        var7.field4544 = arg3 / 128;
        var7.field4555 = arg4 / 128;
        var7.field4541 = arg0;
        var7.field4558 = arg1;
        var7.field4561 = arg2;
        var7.field4547 = arg3;
        var7.field4546 = arg4;
        var7.field4551 = arg5;
        var7.field4549 = arg6;
        class255.field4478[class51.field898++] = var7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z")
    public static final boolean method625(int arg0) {
        if (arg0 != 24781) {
            field1713 = null;
        }
        field1716++;
        return class76.field1514;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public static final void method626(int arg0, int arg1, int arg2) {
        field1714++;
        if (class176.field3105 < 2 && class188.field3259 == 0 && !class247.field4308) {
            return;
        }
        if (arg0 <= 22) {
            field1712 = null;
        }
        class66 var3;
        if (class188.field3259 == 1 && class176.field3105 < 2) {
            var3 = class212.method1372(2, new class66[] { class127.field2373, class222.field3791, class103.field2004, class242.field4229 });
        } else if (class247.field4308 && class176.field3105 < 2) {
            var3 = class212.method1372(2, new class66[] { class162.field2895, class222.field3791, class195.field3366, class242.field4229 });
        } else {
            var3 = class183.method1218((byte) -99, class176.field3105 - 1);
        }
        if (class176.field3105 > 2) {
            var3 = class212.method1372(2, new class66[] { var3, class193.field3337, class144.method989(class176.field3105 - 2, 0), class162.field2914 });
        }
        int var4 = class59.field1016.method238(var3, arg2 + 4, arg1 + 15, 16777215, 0, class124.field2331, class59.field1014);
        class100.method689(arg2 + 4, arg1, class59.field1016.method232(var3) + var4, 15, (byte) -112);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1715 = null;
        field1712 = null;
        if (arg0 != -1) {
            field1713 = null;
        }
        field1713 = null;
    }
}
