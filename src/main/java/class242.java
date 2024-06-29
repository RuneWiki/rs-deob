import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class242 {

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lga;")
    private class18 field4090 = new class18();

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    private int field4085;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lt;")
    private class239 field4089;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lbe;")
    public static class283 field4077 = class153.method941(12, "underlay");

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4078 = 0;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lbe;")
    public static class283 field4081 = class153.method941(126, "details");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lui;")
    public static class251 field4088;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JZ)V", line = 5)
    public final void method1627(long arg0, boolean arg1) {
        class249 var4 = (class249) this.field4089.method1612(arg0, 117);
        if (!arg1) {
            return;
        }
        if (var4 != null) {
            var4.method557((byte) -89);
            var4.method1168(4);
            this.field4087++;
        }
        field4091++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lbe;Z)V", line = 23)
    public static final void method1628(class283 arg0, boolean arg1) {
        field4092++;
        if (class124.field2070 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1929((byte) -24);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class124.field2070.length && class124.field2070[var2].field1445 != var3) {
            var2++;
        }
        if (arg1 && class124.field2070.length > var2 && class124.field2070[var2] != null) {
            class115.field1933++;
            class228.field3831.method621(1, 8);
            class228.field3831.method1544((byte) 8, class124.field2070[var2].field1445);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 80)
    public final Object method1629(int arg0, long arg1) {
        field4080++;
        class249 var4 = (class249) this.field4089.method1612(arg1, 100);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method60(256);
        if (var5 == null) {
            var4.method557((byte) -89);
            var4.method1168(4);
            this.field4087++;
            return null;
        }
        int var6 = 65 % ((20 - arg0) / 43);
        if (var4.method59(256)) {
            class55 var7 = new class55(var5);
            this.field4089.method1611(var7, -1, var4.field1445);
            this.field4090.method111(-128, var7);
            var7.field3034 = 0L;
            var4.method557((byte) -89);
            var4.method1168(4);
        } else {
            this.field4090.method111(125, var4);
            var4.field3034 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZJLjava/lang/Object;)V", line = 121)
    public final void method1630(boolean arg0, long arg1, Object arg2) {
        field4084++;
        this.method1627(arg1, arg0);
        if (this.field4087 == 0) {
            class249 var5 = (class249) this.field4090.method114((byte) 47);
            var5.method557((byte) -89);
            var5.method1168(4);
        } else {
            this.field4087--;
        }
        class55 var6 = new class55(arg2);
        this.field4089.method1611(var6, -1, arg1);
        this.field4090.method111(2, var6);
        var6.field3034 = 0L;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 146)
    public final void method1631(int arg0) {
        this.field4090.method112(arg0 + 27874);
        this.field4089.method1606((byte) 124);
        field4093++;
        this.field4087 = this.field4085;
        if (arg0 != -27875) {
            this.method1627(-77L, true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILea;BI)V", line = 171)
    public static final void method1632(int arg0, class191 arg1, byte arg2, int arg3) {
        field4076++;
        if (arg2 != 104) {
            method1632(-27, (class191) null, (byte) 108, -92);
        }
        if (arg1.field1192 == arg0 && arg0 != -1) {
            class157 var4 = class132.method821(128, arg0);
            int var5 = var4.field2592;
            if (var5 == 1) {
                arg1.field1220 = 0;
                arg1.field1171 = 0;
                arg1.field1182 = 0;
                arg1.field1200 = arg3;
                class141.method888(0, var4, arg1.field1210, class213.field3624 == arg1, arg1.field1220, arg1.field1193);
            }
            if (var5 == 2) {
                arg1.field1171 = 0;
            }
        } else if (arg0 == -1 || arg1.field1192 == -1 || class132.method821(128, arg0).field2576 >= class132.method821(128, arg1.field1192).field2576) {
            arg1.field1200 = arg3;
            arg1.field1182 = 0;
            arg1.field1192 = arg0;
            arg1.field1183 = arg1.field1212;
            arg1.field1171 = 0;
            arg1.field1220 = 0;
            if (arg1.field1192 != -1) {
                class141.method888(0, class132.method821(128, arg1.field1192), arg1.field1210, class213.field3624 == arg1, arg1.field1220, arg1.field1193);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 225)
    public static void method1633(int arg0) {
        if (arg0 != -25906) {
            method1634((byte) -91);
        }
        field4081 = null;
        field4088 = null;
        field4077 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[Lhd;", line = 237)
    public static final class113[] method1634(byte arg0) {
        if (class302.field5096 == null) {
            class113[] var1 = class262.method1774(4863, class150.field2460);
            int var2 = 0;
            class113[] var3 = new class113[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class113 var5 = var1[var4];
                if ((var5.field1908 <= 0 || var5.field1908 >= 24) && var5.field1906 >= 800 && var5.field1899 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class113 var7 = var3[var6];
                        if (var5.field1906 == var7.field1906 && var5.field1899 == var7.field1899) {
                            if (var5.field1908 > var7.field1908) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class302.field5096 = new class113[var2];
            class136.method850(var3, 0, class302.field5096, 0, var2);
            int[] var8 = new int[class302.field5096.length];
            for (int var9 = 0; var9 < class302.field5096.length; var9++) {
                class113 var10 = class302.field5096[var9];
                var8[var9] = var10.field1906 * var10.field1899;
            }
            class305.method2076(class302.field5096, var8, -84);
        }
        if (arg0 > -23) {
            return (class113[]) null;
        } else {
            field4079++;
            return class302.field5096;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lfm;", line = 323)
    public static final class42 method1635(int arg0, int arg1) {
        class42 var2 = (class42) class186.field3183.method1629(83, (long) arg1);
        field4086++;
        if (arg0 != 0) {
            method1633(75);
        }
        if (var2 != null) {
            return var2;
        }
        class42 var3 = class132.method824(false, arg1, class197.field3371, (byte) -24, class298.field5050);
        if (var3 != null) {
            class186.field3183.method1630(true, (long) arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 348)
    public final void method1636(int arg0) {
        for (class249 var2 = (class249) this.field4090.method106(false); var2 != null; var2 = (class249) this.field4090.method110((byte) -97)) {
            if (var2.method59(256)) {
                var2.method557((byte) -89);
                var2.method1168(4);
                this.field4087++;
            }
        }
        field4082++;
        if (arg0 < 107) {
            this.method1631(-12);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V", line = 429)
    public class242(int arg0) {
        this.field4085 = arg0;
        this.field4087 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4089 = new class239(var2);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V", line = 375)
    public final void method1637(boolean arg0, int arg1) {
        if (class191.field3263 != null) {
            for (class249 var3 = (class249) this.field4090.method106(false); var3 != null; var3 = (class249) this.field4090.method110((byte) -108)) {
                if (var3.method59(256)) {
                    if (var3.method60(256) == null) {
                        var3.method557((byte) -89);
                        var3.method1168(4);
                        this.field4087++;
                    }
                } else if (((long) arg1) < (++var3.field3034)) {
                    class249 var4 = class191.field3263.method9(var3, (byte) 33);
                    this.field4089.method1611(var4, -1, var3.field1445);
                    class164.method1000(64, var3, var4);
                    var3.method557((byte) -89);
                    var3.method1168(4);
                }
            }
        }
        if (!arg0) {
            this.method1636(42);
        }
        field4083++;
    }
}
