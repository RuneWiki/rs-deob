import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class425 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Z")
    public static boolean field5980 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILee;)Ltga;")
    public static final class56 method2596(int arg0, class675 arg1) {
        field5981++;
        arg1.method3750((byte) 35);
        int var2 = arg1.method3750((byte) 35);
        class56 var3 = class590.method3337(-111, var2);
        if (arg0 != 17956) {
            field5980 = true;
        }
        var3.field676 = arg1.method3750((byte) 35);
        int var4 = arg1.method3750((byte) 35);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3750((byte) 35);
            var3.method6(3731, arg1, var6);
        }
        var3.method364(7);
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IC)C")
    public static final char method2597(int arg0, char arg1) {
        field5982++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else {
            if (arg0 != 5) {
                field5980 = false;
            }
            if (arg1 == 'ß') {
                return 's';
            } else if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method2598(int arg0) {
        if (arg0 == 0) {
            if (class679.field9327 == 2) {
                class682.field9362[0].method598(class668.field9078[0]);
                class682.field9362[1].method598(class668.field9078[1]);
            } else if (class679.field9327 == 3) {
                class682.field9362[0].method598(class668.field9078[0]);
                class682.field9362[1].method598(class668.field9078[1]);
                class682.field9362[2].method598(class668.field9078[2]);
            } else {
                class682.field9362[0].method598(class668.field9078[0]);
                class682.field9362[1].method598(class668.field9078[1]);
                class682.field9362[2].method598(class668.field9078[2]);
                class682.field9362[3].method598(class668.field9078[3]);
            }
        } else if (arg0 == 1) {
            if (class679.field9327 == 2) {
                class682.field9362[0].method598(class668.field9078[2]);
            } else if (class679.field9327 == 3) {
                class682.field9362[0].method598(class668.field9078[3]);
                class682.field9362[1].method598(class668.field9078[4]);
            } else {
                class682.field9362[0].method598(class668.field9078[4]);
                class682.field9362[1].method598(class668.field9078[5]);
                class682.field9362[2].method598(class668.field9078[6]);
            }
        } else if (arg0 == 2) {
            if (class679.field9327 == 2) {
                class682.field9362[0].method598(class668.field9078[3]);
                return;
            }
            if (class679.field9327 == 3) {
                class682.field9362[0].method598(class668.field9078[5]);
                return;
            }
            class682.field9362[0].method598(class668.field9078[7]);
        }
    }
}
