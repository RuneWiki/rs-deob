import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class434 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Laq;")
    private class90 field6117;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field6125 = -1;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "[I")
    public static int[] field6126 = new int[5];

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field6129 = -1;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "[I")
    public static int[] field6128 = new int[14];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Laa;")
    public static class283 field6118;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lpl;")
    private class390 field6122;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method2724(byte arg0) {
        field6126 = null;
        field6118 = null;
        field6128 = null;
        if (arg0 <= 80) {
            method2728((class268) null, -35, (class268) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLms;)V")
    public static final void method2725(boolean arg0, class453 arg1) {
        field6127++;
        if (!class327.field4511) {
            return;
        }
        class399.field5686++;
        class46.field648.method1178(63, 117);
        class46.field648.method155(15489, arg1.field6314);
        class46.field648.method157(-88, class178.field2451);
        if (arg0) {
            method2731(-70, 5);
        }
        class46.field648.method169(-53, class231.field3339);
        class46.field648.method178(arg1.field6406, -46);
        class46.field648.method157(-30, arg1.field6452);
        class46.field648.method183(class325.field4444, true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLaq;)V")
    public final void method2726(byte arg0, class90 arg1) {
        int var3 = -26 % ((-arg0 - 68) / 41);
        this.field6117 = arg1;
        field6115++;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class434() {
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lpl;")
    public final class390 method2727(byte arg0) {
        field6124++;
        class390 var2 = this.field6122;
        if (arg0 <= 90) {
            field6126 = null;
        }
        if (this.field6117.field1267 == var2) {
            this.field6122 = null;
            return null;
        } else {
            this.field6122 = var2.field5597;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lnq;ILnq;)I")
    public static final int method2728(class268 arg0, int arg1, class268 arg2) {
        field6121++;
        int var3 = 0;
        if (arg0.method1759(-67, class403.field5721)) {
            var3++;
        }
        if (arg0.method1759(-32, class157.field2215)) {
            var3++;
        }
        if (arg0.method1759(-63, class403.field5717)) {
            var3++;
        }
        if (arg2.method1759(-70, class403.field5721)) {
            var3++;
        }
        if (arg2.method1759(-25, class157.field2215)) {
            var3++;
        }
        if (arg1 >= -102) {
            method2732(78);
        }
        if (arg2.method1759(-56, class403.field5717)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BC)C")
    public static final char method2729(byte arg0, char arg1) {
        field6120++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg0 != 51) {
            return 'Z';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lpl;")
    public final class390 method2730(int arg0) {
        if (arg0 != -1) {
            field6125 = -121;
        }
        field6116++;
        class390 var2 = this.field6117.field1267.field5597;
        if (this.field6117.field1267 == var2) {
            this.field6122 = null;
            return null;
        } else {
            this.field6122 = var2.field5597;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Laq;)V")
    public class434(class90 arg0) {
        this.field6117 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public static final void method2731(int arg0, int arg1) {
        field6119++;
        class131 var2 = class206.field2830;
        synchronized (class206.field2830) {
            class206.field2830.method901(arg0, 12223);
        }
        class131 var3 = class113.field1633;
        synchronized (class113.field1633) {
            class113.field1633.method901(arg0, 12223);
        }
        int var4 = 30 / ((60 - arg1) / 40);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static final void method2732(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field6123++;
        if (class327.field4477 == null) {
            return;
        }
        if (class327.field4477.field3998 == 1) {
            class327.field4477 = null;
            return;
        }
        if (class327.field4477.field3998 == 2) {
            class362.method2325(class39.field572, class410.field5806, 2, (byte) 126);
            class327.field4477 = null;
            return;
        }
    }
}
