import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class224 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    public static int[] field4067 = new int[25];

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Llc;")
    public static class143 field4069 = class66.method374("Nehmen", -1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lbg;")
    public static class177 field4065 = new class177(64);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lvh;II)V")
    public static final void method1537(class43[] arg0, int arg1, int arg2) {
        field4066++;
        int var3 = 0;
        int var4 = 54 / ((arg1 + 23) / 46);
        while (arg0.length > var3) {
            class43 var5 = arg0[var3];
            if (var5 != null) {
                if (var5.field769 == 0) {
                    if (var5.field885 != null) {
                        method1537(var5.field885, 64, arg2);
                    }
                    class163 var6 = (class163) class212.field3942.method1824((long) var5.field722, 0);
                    if (var6 != null) {
                        class114.method692(arg2, var6.field2929, 1);
                    }
                }
                if (arg2 == 0 && var5.field760 != null) {
                    class91 var7 = new class91();
                    var7.field1639 = var5.field760;
                    var7.field1641 = var5;
                    class247.method1638(var7, (byte) -91);
                }
                if (arg2 == 1 && var5.field787 != null) {
                    label60: {
                        if (var5.field719 >= 0) {
                            class43 var8 = class27.method186(1341, var5.field722);
                            if (var8 == null || var8.field885 == null || var8.field885.length <= var5.field719 || var8.field885[var5.field719] != var5) {
                                break label60;
                            }
                        }
                        class91 var9 = new class91();
                        var9.field1641 = var5;
                        var9.field1639 = var5.field787;
                        class247.method1638(var9, (byte) -91);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Llc;")
    public static final class143 method1538(int arg0, int arg1) {
        field4071++;
        int var2 = -64 / ((arg1 + 66) / 57);
        return arg0 < 999999999 ? class274.method1806(arg0, true) : class136.field2386;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[B)Llc;")
    public static final class143 method1539(int arg0, int arg1, int arg2, byte[] arg3) {
        field4072++;
        class143 var4 = new class143();
        int var5 = 87 / ((arg2 + 2) / 43);
        var4.field2548 = 0;
        var4.field2503 = new byte[arg1];
        for (int var6 = arg0; var6 < (arg0 + arg1); var6++) {
            if (arg3[var6] != 0) {
                var4.field2503[var4.field2548++] = arg3[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method1540(int arg0) {
        class186.field3380.method823(true);
        field4070++;
        if (arg0 != 20391) {
            method1538(71, -45);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        for (int var1 = 0; var1 < class212.field3945; var1++) {
            int var2 = class56.field1093[var1];
            class187 var3 = class259.field4648[var2];
            if (var3 != null) {
                class137.method820(29802, var3.field3384.field1531, var3);
            }
        }
        field4073++;
        if (arg0 != -1) {
            method1543((byte) 106);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field4067 = null;
        int var1 = -10 / ((-arg0 - 6) / 60);
        field4065 = null;
        field4069 = null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static final void method1543(byte arg0) {
        if (arg0 != -56) {
            method1542((byte) -70);
        }
        field4068++;
        if (class231.field4232 != null) {
            class231.field4232.method1657(true);
        }
        if (class185.field3366 != null) {
            class185.field3366.method1657(true);
        }
    }
}
