import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class284 extends class180 {

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    private final int field4867;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    private final int field4881;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    private final int field4870;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private final int field4879;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private final int field4871;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private final int field4882;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private final int field4869;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    private final int field4868;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Ljf;")
    public static class229 field4876 = class212.method1457((byte) 83, "(U3");

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lni;")
    public static class24 field4866 = new class24(50);

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Ljf;")
    public static class229 field4884 = class212.method1457((byte) 82, "tremblement:");

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Ljf;")
    public static class229 field4880 = class212.method1457((byte) 90, "gleiten:");

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lgh;")
    public static class230 field4875;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 7)
    public static void method1997(byte arg0) {
        field4884 = null;
        field4866 = null;
        if (arg0 != 40) {
            method1997((byte) 22);
        }
        field4876 = null;
        field4875 = null;
        field4880 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V", line = 32)
    public final void method789(int arg0, int arg1, int arg2) {
        int var4 = this.field4879 * arg1 >> 12;
        if (arg0 != -1) {
            field4880 = (class229) null;
        }
        int var5 = this.field4869 * arg2 >> 12;
        int var6 = this.field4868 * arg1 >> 12;
        int var7 = this.field4871 * arg1 >> 12;
        field4878++;
        int var8 = this.field4882 * arg2 >> 12;
        int var9 = this.field4881 * arg2 >> 12;
        int var10 = this.field4870 * arg2 >> 12;
        int var11 = this.field4867 * arg1 >> 12;
        class220.method1517(var9, var6, this.field3122, var4, var7, var8, var5, var11, 97, var10);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lrm;[Lsm;Lek;[Lrm;[Lrm;I[Lrm;)V", line = 69)
    public static final void method1998(class248[] arg0, class159[] arg1, class185 arg2, class248[] arg3, class248[] arg4, int arg5, class248[] arg6) {
        class157.field2695 = arg6;
        class80.field1447 = arg2;
        class206.field3601 = arg0;
        class5.field51 = arg1;
        field4873++;
        class188.field3287 = arg3;
        class62.field1061 = arg4;
        class157.field2687.method2073(true);
        int var7 = class80.field1447.method1292(class298.field5088, (byte) 38);
        int[] var8 = class80.field1447.method1280(var7, (byte) 80);
        for (int var9 = arg5; var9 < var8.length; var9++) {
            class157.field2687.method2079(class277.method1949(new class14(class80.field1447.method1275(var8[var9], var7, -5211)), (byte) 56), arg5 ^ 0x49);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 97)
    public static final void method1999(int arg0) {
        field4872++;
        if (class264.field4555 == null) {
            return;
        }
        if (class66.field1123 < 10) {
            if (!class80.field1447.method1279(class264.field4555.field2723, 105)) {
                class66.field1123 = class143.field2490.method1265((byte) 69, class264.field4555.field2723) / 10;
                return;
            }
            class19.method183((byte) -49);
            class66.field1123 = 10;
        }
        if (class66.field1123 == 10) {
            class127.field2269 = class264.field4555.field2731 >> 6 << 6;
            class290.field4953 = class264.field4555.field2734 >> 6 << 6;
            class113.field2037 = (class264.field4555.field2725 >> 6 << 6) + 64 - class290.field4953;
            class254.field4432 = (class264.field4555.field2737 >> 6 << 6) + 64 - class127.field2269;
            int var1 = (class301.field5124.field1983 >> 7) + class258.field4503 - class290.field4953;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class254.field4432 - (1 - class127.field2269) - ((class301.field5124.field2028 >> 7) + class213.field3649);
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            class235.field4060 = 8.0F;
            class160.field2716 = 8.0F;
            if (var2 >= 0 && var2 < class113.field2037 && var4 >= 0 && class254.field4432 > var4) {
                class151.field2619 = var2;
                class42.field768 = var4;
            } else {
                class42.field768 = class127.field2269 + class254.field4432 - (class264.field4555.field2733 * 64) - 1;
                class151.field2619 = class264.field4555.field2742 * 64 - class290.field4953;
            }
            class22.method211(97);
            int var5 = class254.field4432 >> 6;
            int var6 = class225.field3848 >> 2 << 10;
            int var7 = class113.field2037 >> 6;
            int var8 = class311.field5236 >> 1;
            class19.field294 = new short[var7][var5][];
            class80.field1463 = new byte[var7][var5][];
            class185.field3228 = new int[var7][var5][];
            class82.field1515 = new byte[var7][var5][];
            class8.field82 = new byte[var7][var5][];
            class144.field2517 = new byte[var7][var5][];
            class48.field869 = new int[class113.field2045 + 1];
            class270.field4639 = new int[var7][var5][];
            class91.field1666 = new byte[var7][var5][];
            class221.method1526(var8, var6, (byte) -106);
            class66.field1123 = 20;
        } else if (class66.field1123 == 20) {
            class109.method778(-1508223286, new class14(class80.field1447.method1281((byte) 120, class264.field4555.field2723, class81.field1468)));
            class66.field1123 = 30;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 30) {
            class66.method489(new class14(class80.field1447.method1281((byte) 120, class264.field4555.field2723, class91.field1663)), (byte) -97);
            class66.field1123 = 40;
            class38.method334(arg0 - 33163884);
        } else if (class66.field1123 == 40) {
            class288.method2012(arg0 - 33163777, new class14(class80.field1447.method1281((byte) 120, class264.field4555.field2723, class156.field2661)));
            class66.field1123 = 50;
            class38.method334(0);
        } else if (class66.field1123 == 50) {
            class191.method1311(new class14(class80.field1447.method1281((byte) 120, class264.field4555.field2723, class273.field4670)), false);
            class66.field1123 = 60;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 60) {
            if (class80.field1447.method1266(class142.method989(new class229[] { class264.field4555.field2723, class193.field3348 }, -78), 256)) {
                if (!class80.field1447.method1279(class142.method989(new class229[] { class264.field4555.field2723, class193.field3348 }, -97), 94)) {
                    return;
                }
                class124.field2183 = class260.method1854((byte) -60, class142.method989(new class229[] { class264.field4555.field2723, class193.field3348 }, -17), class80.field1447);
            } else {
                class124.field2183 = new class330(0);
            }
            class66.field1123 = 70;
            class38.method334(0);
        } else if (class66.field1123 == 70) {
            class84.field1615 = new class103(11, true, class299.field5100);
            class66.field1123 = 73;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 73) {
            class8.field84 = new class103(12, true, class299.field5100);
            class66.field1123 = 76;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 76) {
            class156.field2672 = new class103(14, true, class299.field5100);
            class66.field1123 = 79;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 79) {
            class241.field4253 = new class103(17, true, class299.field5100);
            class66.field1123 = 82;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 82) {
            class66.field1124 = new class103(19, true, class299.field5100);
            class66.field1123 = 85;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else if (class66.field1123 == 85) {
            class167.field2872 = new class103(22, true, class299.field5100);
            class66.field1123 = 88;
            class208.method1443((byte) 23, true);
            class38.method334(0);
        } else {
            if (arg0 != 33163884) {
                field4866 = (class24) null;
            }
            if (class66.field1123 == 88) {
                class173.field3030 = new class103(26, true, class299.field5100);
                class66.field1123 = 91;
                class208.method1443((byte) 23, true);
                class38.method334(arg0 - 33163884);
            } else {
                class137.field2377 = new class103(30, true, class299.field5100);
                class66.field1123 = 100;
                class208.method1443((byte) 23, true);
                class38.method334(0);
                class132.field2325 = -1;
                class189.field3304 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 300)
    public final void method787(int arg0, int arg1, int arg2) {
        field4874++;
        int var4 = -22 % ((-arg0 - 20) / 52);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 315)
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4867 = arg7;
        this.field4881 = arg6;
        this.field4870 = arg0;
        this.field4879 = arg3;
        this.field4871 = arg5;
        this.field4882 = arg4;
        this.field4869 = arg2;
        this.field4868 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)V", line = 331)
    public final void method786(int arg0, int arg1, int arg2) {
        if (arg1 <= 71) {
            field4875 = (class230) null;
        }
        field4877++;
    }
}
