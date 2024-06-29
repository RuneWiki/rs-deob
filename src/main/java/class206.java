import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class206 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
    public static int[] field2889 = new int[14];

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Lrr;")
    public class206 field2882;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lbf;")
    public class336 field2880;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2886;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lmj;", line = 5)
    public static final class177 method1414(int arg0) {
        int var1 = -70 / ((6 - arg0) / 54);
        class416.field6019 = 0;
        field2881++;
        return class46.method376(-23072);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 16)
    public static final void method1415(byte arg0) {
        field2887++;
        if (arg0 <= 63) {
            method1416(-24, 55, -26);
        }
        class363 var1 = class283.field4166;
        synchronized (class283.field4166) {
            class283.field4166.method2307(121);
        }
        class363 var2 = class272.field4022;
        synchronized (class272.field4022) {
            class272.field4022.method2307(-79);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V", line = 41)
    public static final void method1416(int arg0, int arg1, int arg2) {
        field2884++;
        class125 var3 = class56.method428(arg0, 15, -3636);
        var3.method846(26848);
        var3.field1654 = arg1;
        var3.field1657 = arg2;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 55)
    public final void method1417(int arg0) {
        field2885++;
        if (class37.field525 >= 500) {
            return;
        }
        if (arg0 != -30226) {
            this.method1417(116);
        }
        this.field2880 = null;
        this.field2890 = 0;
        this.field2882 = class230.field3450;
        class230.field3450 = this;
        class37.field525++;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 74)
    public static void method1418(int arg0) {
        field2889 = null;
        field2886 = null;
        if (arg0 != 20572) {
            method1416(65, -121, 110);
        }
    }
}
