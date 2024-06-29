import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class327 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Luk;")
    private class105 field4780 = new class105();

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lic;")
    private class329 field4776;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field4773 = -1;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
    public static int[] field4778 = new int[14];

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lgl;")
    public static class281 field4771;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I", line = 5)
    public final int method2256(boolean arg0) {
        field4784++;
        int var2 = 0;
        if (arg0) {
            this.field4781 = 5;
        }
        for (class166 var3 = (class166) this.field4780.method739((byte) 104); var3 != null; var3 = (class166) this.field4780.method747(1)) {
            if (!var3.method1240(-1249071392)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 29)
    public final void method2257(int arg0, Object arg1, long arg2) {
        field4782++;
        this.method2259(arg2, 882);
        if (arg0 >= -124) {
            return;
        }
        if (this.field4779 == 0) {
            class166 var5 = (class166) this.field4780.method743(false);
            var5.method179((byte) 51);
            var5.method1556(255);
        } else {
            this.field4779--;
        }
        class227 var6 = new class227(arg1);
        this.field4776.method2275(var6, 95, arg2);
        this.field4780.method740(77, var6);
        var6.field3011 = 0L;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 57)
    public final void method2258(byte arg0) {
        this.field4780.method744(-15997);
        this.field4776.method2282((byte) -102);
        if (arg0 != 86) {
            method2266((class135) null, false, -39);
        }
        this.field4779 = this.field4781;
        field4787++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V", line = 71)
    public final void method2259(long arg0, int arg1) {
        field4785++;
        class166 var4 = (class166) this.field4776.method2279(arg0, -123);
        if (var4 != null) {
            var4.method179((byte) 51);
            var4.method1556(255);
            this.field4779++;
        }
        if (arg1 != 882) {
            field4778 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 91)
    public static void method2260(int arg0) {
        field4771 = null;
        int var1 = -128 / ((-arg0 - 43) / 56);
        field4778 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfh;ILfh;)V", line = 106)
    public static final void method2261(class140 arg0, int arg1, class140 arg2) {
        class112.field1455 = arg2;
        class345.field5369 = arg0;
        field4772++;
        if (arg1 != 0) {
            field4771 = (class281) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V", line = 119)
    public final void method2262(boolean arg0) {
        field4786++;
        if (arg0) {
            field4771 = (class281) null;
        }
        for (class166 var2 = (class166) this.field4780.method739((byte) 50); var2 != null; var2 = (class166) this.field4780.method747(1)) {
            if (var2.method1240(-1249071392)) {
                var2.method179((byte) 51);
                var2.method1556(255);
                this.field4779++;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 146)
    public static final void method2263(int arg0) {
        class56.method423();
        class205.method1488((byte) 59);
        field4775++;
        class195.method1408(-7603);
        class98.field1284.method1120((byte) -87);
        class357.field5581 = new class276();
        ((class138) class350.field5467).method1042(0);
        class324.method2241();
        class22.field238 = new class339[255];
        class22.field243 = 0;
        class128.method977();
        class151.method1161();
        class221.method1607(0);
        class40.method281(false, (byte) -93);
        class340.method2363(arg0 ^ 0x2C82);
        class357.method2480(106);
        for (int var1 = 0; var1 < 2048; var1++) {
            class239 var2 = class311.field4574[var1];
            if (var2 != null) {
                var2.field4943 = null;
            }
        }
        if (class47.field623) {
            class151.method1155(104, 104);
            class32.method199(class66.field849, arg0 ^ 0x387BE992);
            class187.method1371();
        }
        class178.method1312(class1.field7, class283.field4033, (byte) 124);
        class286.method1951(class1.field7, (byte) 51);
        class84.field1088 = null;
        class261.field3781 = null;
        if (arg0 != 11650) {
            method2266((class135) null, true, 13);
        }
        class343.field5337 = null;
        class56.field720 = null;
        class101.field1321 = null;
        if (class316.field4661 == 5) {
            class52.method400(62, class1.field7);
        }
        if (class316.field4661 == 10) {
            class249.method1742(false, arg0 - 11648);
        }
        if (class316.field4661 == 30) {
            class59.method445(25, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V", line = 286)
    public class327(int arg0) {
        this.field4781 = arg0;
        this.field4779 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4776 = new class329(var2);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V", line = 228)
    public final void method2264(byte arg0, int arg1) {
        int var3 = -3 % ((arg0 + 19) / 44);
        field4774++;
        if (class356.field5567 == null) {
            return;
        }
        for (class166 var4 = (class166) this.field4780.method739((byte) 53); var4 != null; var4 = (class166) this.field4780.method747(1)) {
            if (var4.method1240(-1249071392)) {
                if (var4.method1239(false) == null) {
                    var4.method179((byte) 51);
                    var4.method1556(255);
                    this.field4779++;
                }
            } else if (++var4.field3011 > (long) arg1) {
                class166 var5 = class356.field5567.method313(-91, var4);
                this.field4776.method2275(var5, 87, var4.field304);
                class297.method2030(var4, (byte) 116, var5);
                var4.method179((byte) 51);
                var4.method1556(255);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 302)
    public final Object method2265(long arg0, byte arg1) {
        field4783++;
        class166 var4 = (class166) this.field4776.method2279(arg0, -124);
        int var5 = -76 % ((arg1 + 34) / 51);
        if (var4 == null) {
            return null;
        }
        Object var6 = var4.method1239(false);
        if (var6 == null) {
            var4.method179((byte) 51);
            var4.method1556(255);
            this.field4779++;
            return null;
        }
        if (var4.method1240(-1249071392)) {
            class227 var7 = new class227(var6);
            this.field4776.method2275(var7, 95, var4.field304);
            this.field4780.method740(68, var7);
            var7.field3011 = 0L;
            var4.method179((byte) 51);
            var4.method1556(255);
        } else {
            this.field4780.method740(-111, var4);
            var4.field3011 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lio;ZI)V", line = 343)
    public static final void method2266(class135 arg0, boolean arg1, int arg2) {
        field4777++;
        Object[] var3 = arg0.field1836;
        int var4 = (Integer) var3[0];
        class20 var5 = class294.method2013(arg1, var4);
        if (var5 == null) {
            return;
        }
        class340.field5311 = new String[var5.field228];
        int var6 = 0;
        class359.field5615 = new int[var5.field230];
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8] instanceof Integer) {
                int var9 = (Integer) var3[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field1843;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field1839;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field1831 == null ? -1 : arg0.field1831.field5109;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field1841;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field1831 == null ? -1 : arg0.field1831.field5199;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field1829 == null ? -1 : arg0.field1829.field5109;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field1829 == null ? -1 : arg0.field1829.field5199;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field1830;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field1833;
                }
                class359.field5615[var6++] = var9;
            } else if (var3[var8] instanceof String) {
                String var10 = (String) var3[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field1838;
                }
                class340.field5311[var7++] = var10;
            }
        }
        class196.method1415(arg2, 1006199388, var5);
    }
}
