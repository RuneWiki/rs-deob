import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class286 extends class276 {

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4521 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4517 = "rating: ";

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "[I")
    public static int[] field4519 = new int[14];

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field4518 = 3;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4528 = "Loaded config";

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[Lqc;")
    private class150[] field4525;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class286() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lvh;Lvh;I)V")
    public static final void method1906(class108 arg0, class108 arg1, int arg2) {
        class239.field3919 = arg1;
        class116.field2076 = arg0;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        if (arg2 == 5189) {
            int var4 = -10 + (int) (Math.random() * 21.0D);
            int var5 = (int) (21.0D * Math.random()) + -10;
            ++field4527;
            class239.field3919.method754(-58, 34);
            int var6 = -20 + (int) (Math.random() * 41.0D);
            class7.field91 = var4 - -var6;
            class53.field931 = var5 + var6;
            class209.field3544 = var3 + var6;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            field4528 = null;
        }
        ++field4523;
        int[][] var3 = super.field4418.method835((byte) 107, arg0);
        if (super.field4418.field2164) {
            int var4 = class209.field3540;
            int var5 = class53.field929;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field4418.method834(false);
            this.method1912(var6, (byte) 103);
            for (int var8 = 0; ~var8 > ~class209.field3540; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class53.field929; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class113.method791(var15 << 4, 4080);
                    var11[var14] = class113.method791(var15 >> 4, 4080);
                    var12[var14] = class113.method791(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1907(String arg0, byte arg1) {
        ++field4526;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = -12 % ((-42 - arg1) / 50);
            for (int var3 = 0; var3 < class228.field3837; ++var3) {
                if (arg0.equalsIgnoreCase(class5.field63[var3])) {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)I")
    public static final int method1908(int arg0, byte arg1) {
        ++field4530;
        int var2 = 77 % ((-29 - arg1) / 61);
        return 1023 & arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field4522;
        if (arg0 <= 39) {
            method1913(-62);
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            this.method1912(super.field4425.method990(true), (byte) 90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1909(byte arg0, String arg1, int arg2, String arg3, String arg4, int arg5) {
        ++field4524;
        for (int var6 = 99; var6 > 0; --var6) {
            class111.field2005[var6] = class111.field2005[var6 - 1];
            class192.field3110[var6] = class192.field3110[var6 - 1];
            class241.field3969[var6] = class241.field3969[var6 + -1];
            class150.field2515[var6] = class150.field2515[var6 + -1];
            class136.field2378[var6] = class136.field2378[var6 + -1];
        }
        class192.field3110[0] = arg4;
        if (arg0 > 39) {
            class111.field2005[0] = arg5;
            ++class68.field1123;
            class241.field3969[0] = arg1;
            class150.field2515[0] = arg3;
            class133.field2312 = class222.field3746;
            class136.field2378[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method1910(String arg0, boolean arg1, boolean arg2) {
        short[] var3 = new short[16];
        ++field4532;
        String var4 = arg0.toLowerCase();
        int var5 = 0;
        int var6 = !arg2 ? 0 : 32768;
        int var7 = var6 + (arg2 ? class92.field1616 : class82.field1490);
        for (int var8 = var6; ~var8 > ~var7; ++var8) {
            class123 var11 = class113.method795(var8, 237);
            if (var11.field2181 && ~var11.method843(3044).toLowerCase().indexOf(var4) != 0) {
                if (var5 >= 50) {
                    class27.field413 = null;
                    class190.field3079 = -1;
                    return;
                }
                if (~var5 <= ~var3.length) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; ~var13 > ~var5; ++var13) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var5++] = (short) var8;
            }
        }
        class178.field2930 = 0;
        class27.field413 = var3;
        if (!arg1) {
            method1911(true);
        }
        class190.field3079 = var5;
        String[] var9 = new String[class190.field3079];
        for (int var10 = 0; var10 < class190.field3079; ++var10) {
            var9[var10] = class113.method795(var3[var10], 237).method843(3044);
        }
        class31.method205(var9, -128, class27.field413);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method1911(boolean arg0) {
        ++field4534;
        Container var1;
        if (class85.field1534 != null) {
            var1 = class85.field1534;
        } else if (class270.field4349 == null) {
            var1 = class127.field2238.field2294;
        } else {
            var1 = class270.field4349;
        }
        class132.field2302 = var1.getSize().width;
        class42.field623 = var1.getSize().height;
        if (class270.field4349 == var1) {
            Insets var2 = class270.field4349.getInsets();
            class132.field2302 -= var2.right + var2.left;
            class42.field623 -= var2.top + var2.bottom;
        }
        if (class85.method557(false) < 2) {
            class231.field3870 = 0;
            class4.field38 = 503;
            class72.field1189 = (class132.field2302 + -765) / 2;
            class267.field4324 = 765;
        } else {
            class4.field38 = class42.field623;
            class231.field3870 = 0;
            class72.field1189 = 0;
            class267.field4324 = class132.field2302;
        }
        class118.field2099.setSize(class267.field4324, class4.field38);
        if (class270.field4349 == var1) {
            Insets var3 = class270.field4349.getInsets();
            class118.field2099.setLocation(class72.field1189 + var3.left, class231.field3870 + var3.top);
        } else {
            class118.field2099.setLocation(class72.field1189, class231.field3870);
        }
        if (!arg0) {
            method1909((byte) 110, (String) null, 77, (String) null, (String) null, 83);
        }
        if (~client.field4545 != 0) {
            class61.method384(true, true);
        }
        class206.method1362(44);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[IB)V")
    private final void method1912(int[][] arg0, byte arg1) {
        ++field4531;
        int var3 = class53.field929;
        int var4 = class209.field3540;
        if (arg1 < 82) {
            method1909((byte) -2, (String) null, 68, (String) null, (String) null, -38);
        }
        class7.method44(arg0, 119);
        class268.method1764(-114, 0, class125.field2189, 0, class35.field504);
        if (this.field4525 != null) {
            for (int var5 = 0; this.field4525.length > var5; ++var5) {
                class150 var6 = this.field4525[var5];
                int var7 = var6.field2517;
                int var8 = var6.field2518;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method221((byte) -77, var4, var3);
                    }
                } else if (var8 >= 0) {
                    var6.method218(0, var3, var4);
                } else {
                    var6.method220(var3, (byte) 112, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            method1910((String) null, false, true);
        }
        if (arg0 == 0) {
            this.field4525 = new class150[arg1.method669((byte) 36)];
            for (int var4 = 0; var4 < this.field4525.length; ++var4) {
                int var5 = arg1.method669((byte) 36);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4525[var4] = class58.method360(arg1, true);
                            }
                        } else {
                            this.field4525[var4] = class135.method935(arg1, (byte) -94);
                        }
                    } else {
                        this.field4525[var4] = class237.method1565(-106, arg1);
                    }
                } else {
                    this.field4525[var4] = class193.method1269(arg1, class52.method329(arg2, 20103));
                }
            }
        } else if (arg0 == 1) {
            super.field4408 = ~arg1.method669((byte) 36) == -2;
        }
        ++field4529;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public static void method1913(int arg0) {
        field4519 = null;
        field4517 = null;
        if (arg0 != -9419) {
            method1906((class108) null, (class108) null, -34);
        }
        field4521 = null;
        field4528 = null;
    }
}
