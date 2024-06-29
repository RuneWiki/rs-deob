import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class286 extends class59 {

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Lcj;")
    public class303 field4635;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4623 = "glow2:";

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field4633 = -1;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Lvl;")
    public static class73 field4629;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public static void method1955(byte arg0) {
        int var1 = 121 / ((arg0 + 5) / 34);
        field4629 = null;
        field4623 = null;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public static final void method1956(int arg0) {
        if ((class207.field3245 < class207.field3244)) {
            class207.field3245 = (float) ((double) class207.field3245 / 30.0D + (double) class207.field3245);
            if (class207.field3245 > class207.field3244) {
                class207.field3245 = class207.field3244;
            }
            class283.method1945(94);
        } else if (class207.field3244 < class207.field3245) {
            class207.field3245 = (float) ((double) class207.field3245 - (double) class207.field3245 / 30.0D);
            if (class207.field3244 > class207.field3245) {
                class207.field3245 = class207.field3244;
            }
            class283.method1945(94);
        }
        if (class282.field4592 != -1 && class72.field1069 != -1) {
            int var1 = class282.field4592 - class311.field4993;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class311.field4993 += var1;
            int var2 = class72.field1069 - class229.field3544;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class229.field3544 += var2;
            if (var1 == 0 && var2 == 0) {
                class282.field4592 = -1;
                class72.field1069 = -1;
            }
            class283.method1945(-126);
        }
        if (arg0 != -3) {
            method1955((byte) 14);
        }
        field4632++;
        if (class99.field1490 > 0) {
            class124.field1785--;
            if (class124.field1785 == 0) {
                class99.field1490--;
                class124.field1785 = 100;
            }
        } else {
            class181.field2855 = -1;
            class19.field255 = -1;
        }
        if (!class220.field3457 || class249.field4048 == null) {
            return;
        }
        for (class68 var3 = (class68) class249.field4048.method1548(arg0 + 3); var3 != null; var3 = (class68) class249.field4048.method1549(arg0 ^ 0x4F)) {
            class152 var4 = class136.method863(var3.field1004.field1987, 0);
            if (class92.field1371 == 0 && var3.method450(class50.field633, -1, class71.field1042)) {
                if (!var3.field1004.field1985) {
                    var3.field1004.field1985 = true;
                    class263.method1845(15, var3.field1004.field1987, var4.field2262, (byte) -110);
                }
                if (var3.field1004.field1985) {
                    class263.method1845(17, var3.field1004.field1987, var4.field2262, (byte) -108);
                }
            } else if (var3.field1004.field1985) {
                var3.field1004.field1985 = false;
                class263.method1845(16, var3.field1004.field1987, var4.field2262, (byte) -100);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public final void method1957(int arg0, int arg1, int arg2, int arg3) {
        this.field4618 = arg2;
        this.field4621 = arg3;
        this.field4631 = arg0;
        field4617++;
        if (arg1 < 65) {
            method1956(-27);
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public static final void method1958(int arg0) {
        field4628++;
        class164.field2542.method1510(10283);
        class231.field3624.method1510(10283);
        class36.field438.method1510(10283);
        if (arg0 != 10486) {
            field4625 = -82;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lcj;Lom;)V")
    public class286(class303 arg0, class65 arg1) {
        this.field4635 = arg0;
    }
}
