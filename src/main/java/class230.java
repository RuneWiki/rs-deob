import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class230 extends class61 {

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "Lmh;")
    public class135 field3756;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "Lwm;")
    public static class152 field3747 = class157.method1048(")1o", 98);

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Lwm;")
    public static class152 field3750 = class157.method1048(" x ", 103);

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Lwm;")
    public static class152 field3757 = class157.method1048("<)4col> x", 104);

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "Lwm;")
    public static class152 field3753 = class157.method1048("Number of player models in cache:", 119);

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "Lah;")
    public static class205 field3754;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "[I")
    public static int[] field3749;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V", line = 9)
    public static void method1576(int arg0) {
        field3753 = null;
        field3754 = null;
        field3750 = null;
        if (arg0 == 0) {
            field3747 = null;
            field3749 = null;
            field3757 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 34)
    public static final void method1577(int arg0) {
        class272.method1868(arg0 + 22888, class33.field537);
        class323.field5645++;
        field3752++;
        if (client.field4364 && class40.field646) {
            int var1 = class278.field4763;
            int var2 = var1 - class305.field5245;
            if (class31.field524 > var2) {
                var2 = class31.field524;
            }
            if ((class33.field537.field1876 + var2) > (class31.field524 + class15.field207.field1876)) {
                var2 = class15.field207.field1876 + class31.field524 - class33.field537.field1876;
            }
            int var3 = class254.field4397;
            int var4 = var3 - class253.field4377;
            if (arg0 != 1) {
                method1578((class152) null, -25);
            }
            int var5 = var2 - class312.field5367;
            if (var4 < class37.field625) {
                var4 = class37.field625;
            }
            int var6 = class33.field537.field1850;
            if ((class37.field625 + class15.field207.field1921) < (class33.field537.field1921 + var4)) {
                var4 = class37.field625 + class15.field207.field1921 - class33.field537.field1921;
            }
            int var7 = var2 + class15.field207.field1891 - class31.field524;
            int var8 = var4 - class72.field1053;
            if (class323.field5645 > class33.field537.field1846 && (var5 > var6 || var5 < (-var6) || var6 < var8 || -var6 > var8)) {
                class179.field2864 = true;
            }
            int var9 = var4 + class15.field207.field1852 - class37.field625;
            if (class33.field537.field1867 != null && class179.field2864) {
                class320 var10 = new class320();
                var10.field5581 = class33.field537.field1867;
                var10.field5569 = class33.field537;
                var10.field5582 = var9;
                var10.field5586 = var7;
                class64.method412(var10, (byte) -92);
            }
            if (class93.field1330 == 0) {
                if (class179.field2864) {
                    if (class33.field537.field1792 != null) {
                        class320 var11 = new class320();
                        var11.field5586 = var7;
                        var11.field5572 = class16.field225;
                        var11.field5581 = class33.field537.field1792;
                        var11.field5569 = class33.field537;
                        var11.field5582 = var9;
                        class64.method412(var11, (byte) -122);
                    }
                    if (class16.field225 != null && client.method1748(class33.field537) != null) {
                        class26.field453++;
                        class245.field4102.method1065(97, arg0 + 124);
                        class245.field4102.method1963((byte) -78, class16.field225.field1934);
                        class245.field4102.method1983((byte) -92, class16.field225.field1868);
                        class245.field4102.method1963((byte) -78, class33.field537.field1934);
                        class245.field4102.method1983((byte) -113, class33.field537.field1868);
                    }
                } else if ((class270.field4625 == 1 || class169.method1111(class160.field2556 - 1, (byte) 95)) && class160.field2556 > 2) {
                    class222.method1537(30);
                } else if (class160.field2556 > 0) {
                    class175.method1170(false);
                }
                class33.field537 = null;
            }
        } else if (class323.field5645 > 1) {
            class33.field537 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lwm;I)Lwm;", line = 158)
    public static final class152 method1578(class152 arg0, int arg1) {
        field3755++;
        if (arg1 != 1) {
            field3749 = (int[]) null;
        }
        int var2 = class20.method128(arg0, (byte) 76);
        return var2 == -1 ? class82.field1146 : class194.field3086.field4766[var2].method987(class114.field1617, class26.field449, -1);
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 181)
    public static final void method1579(int arg0) {
        if (arg0 != 5040) {
            field3757 = (class152) null;
        }
        class18.field258++;
        class245.field4102.method1065(125, -9);
        field3758++;
        class245.field4102.method1988(0L, arg0 - 5114);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lmh;)V", line = 211)
    public class230(class135 arg0) {
        this.field3756 = arg0;
    }
}
