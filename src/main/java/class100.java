import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class100 {

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Z")
    public static boolean field1384 = false;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field1388 = -1;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
    public static boolean field1390 = false;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1383 = 0;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIBII)V", line = 3)
    public static final void method799(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 == -14) {
            for (int var6 = arg2; var6 <= arg0; var6++) {
                class636.method3569(arg5, arg4, arg1, 347845800, class432.field5765[var6]);
            }
            field1387++;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I", line = 29)
    public final int method800(int arg0) {
        field1382++;
        int var2 = 20 % ((49 - arg0) / 52);
        return this.field1386;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(JI)V", line = 53)
    public static final void method801(long arg0, int arg1) {
        if (class197.field2689 != null) {
            if (class650.field9023 == 1 || class650.field9023 == 5) {
                class196.method1304(false, arg0);
            } else if (class650.field9023 == 4) {
                class330.method1914(false, arg0);
            }
        }
        field1385++;
        class256.method1560(false, class386.field4930, (long) class463.field6224);
        if (class540.field7482 != -1) {
            class422.method2353(-1, class540.field7482);
        }
        for (int var3 = 0; var3 < class654.field9100; var3++) {
            if (class559.field7782[var3]) {
                class755.field10530[var3] = true;
            }
            class374.field4798[var3] = class559.field7782[var3];
            class559.field7782[var3] = false;
        }
        class446.field5930 = class463.field6224;
        class326.method1901(null, -1, -1, -1);
        class682.method3837(-200, null, -1, -1);
        if (class540.field7482 != -1) {
            class654.field9100 = 0;
            class663.method3742((byte) -98);
        }
        class386.field4930.method446();
        class559.method3225(class386.field4930, 8191);
        int var4 = class532.method3058(false);
        if (var4 == -1) {
            var4 = class740.field10331;
        }
        if (arg1 >= -100) {
            field1383 = -65;
        }
        if (var4 == -1) {
            var4 = class603.field8397;
        }
        class741.method4131(var4, (byte) -128);
        int var5 = class380.field4847.method82((byte) 49) << 8;
        class249.method1539(class602.field8367, 646, class380.field4847.field5796, class380.field4847.field5801 + var5, class380.field4847.field5797 + var5);
        class602.field8367 = 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/awt/Component;B)Lmca;", line = 119)
    public static final class31 method802(Component arg0, byte arg1) {
        field1391++;
        if (arg1 <= 90) {
            method802(null, (byte) -8);
        }
        return new class247(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;", line = 131)
    public final String toString() {
        field1392++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 144)
    public class100(String arg0, int arg1) {
        this.field1386 = arg1;
    }
}
