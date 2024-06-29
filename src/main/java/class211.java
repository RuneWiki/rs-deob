import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class211 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ltb;B)V", line = 7)
    public static final void method1488(class220 arg0, byte arg1) {
        int var2 = arg0.field3427;
        field3214++;
        if (var2 == 324) {
            if (class187.field2792 == -1) {
                class187.field2792 = arg0.field3400;
                class23.field385 = arg0.field3447;
            }
            if (class331.field5157.field2827) {
                arg0.field3400 = class187.field2792;
            } else {
                arg0.field3400 = class23.field385;
            }
        } else if (var2 == 325) {
            if (class187.field2792 == -1) {
                class187.field2792 = arg0.field3400;
                class23.field385 = arg0.field3447;
            }
            if (class331.field5157.field2827) {
                arg0.field3400 = class23.field385;
            } else {
                arg0.field3400 = class187.field2792;
            }
        } else if (var2 == 327) {
            arg0.field3350 = 150;
            arg0.field3505 = (int) (Math.sin((double) class227.field3618 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3372 = 5;
            arg0.field3466 = -1;
        } else {
            if (arg1 > -43) {
                method1488((class220) null, (byte) -36);
            }
            if (var2 == 328) {
                if (class98.field1566.field477 == null) {
                    arg0.field3466 = 0;
                } else {
                    arg0.field3350 = 150;
                    arg0.field3505 = (int) (Math.sin((double) class227.field3618 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field3372 = 5;
                    arg0.field3466 = ((int) class128.method926(class98.field1566.field477, (byte) -66) << 11) + 2047;
                    arg0.field3349 = class98.field1566.field1954;
                    arg0.field3469 = class98.field1566.field1873;
                    arg0.field3500 = 0;
                    arg0.field3406 = class98.field1566.field1872;
                }
            }
        }
    }
}
