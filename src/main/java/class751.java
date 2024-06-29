import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class751 extends class362 {

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Lff;")
    public class9 field10510;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Lat;", line = 3)
    public static final class378 method4199(int arg0, byte arg1, int arg2) {
        field10509++;
        class378 var3 = class60.method633(arg1 + 1512932774, arg2);
        if (arg1 != -54) {
            method4200(-23, null);
        }
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field5474 == null || var3.field5474.length <= arg0) {
            return null;
        } else {
            return var3.field5474[arg0];
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILin;)I", line = 23)
    public static final int method4200(int arg0, class91 arg1) {
        field10512++;
        int var2 = 0;
        if (arg1.method874(false, field10513)) {
            var2++;
        }
        if (arg1.method874(false, class62.field1238)) {
            var2++;
        }
        if (arg1.method874(false, class61.field1199)) {
            var2++;
        }
        if (arg1.method874(false, class59.field1153)) {
            var2++;
        }
        if (arg1.method874(false, class549.field7555)) {
            var2++;
        }
        if (arg1.method874(false, class375.field5312)) {
            var2++;
        }
        if (arg1.method874(false, class307.field4267)) {
            var2++;
        }
        if (arg1.method874(false, class612.field8371)) {
            var2++;
        }
        if (arg1.method874(false, class507.field7060)) {
            var2++;
        }
        if (arg1.method874(false, class536.field7416)) {
            var2++;
        }
        if (arg1.method874(false, class652.field8956)) {
            var2++;
        }
        if (arg0 != 22388) {
            return 8;
        }
        if (arg1.method874(false, class556.field7678)) {
            var2++;
        }
        if (arg1.method874(false, class186.field2804)) {
            var2++;
        }
        if (arg1.method874(false, class684.field9254)) {
            var2++;
        }
        if (arg1.method874(false, class453.field6394)) {
            var2++;
        }
        if (arg1.method874(false, class629.field8659)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 97)
    public static final void method4201(int arg0) {
        class117.field1992.method1348(14174);
        field10511++;
        class284.field3963.method580(0);
        class334.field4684.method1988((byte) -49);
        class458.field6458.setBackground(Color.black);
        class716.field9753 = arg0;
        class117.field1992 = class480.method2818(class458.field6458, (byte) 84);
        class284.field3963 = class340.method2152(class458.field6458, 0, true);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lff;)V", line = 113)
    public class751(class9 arg0) {
        this.field10510 = arg0;
    }
}
