import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class565 {

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lsv;")
    public static class570 field7879 = new class570(7, 6);

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[F")
    public static float[] field7880 = new float[4];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)I", line = 4)
    public final int method3291(int arg0, int arg1, int arg2) {
        field7875++;
        if (arg1 != 0) {
            this.method3291(82, 16, -119);
        }
        int var4 = class709.field9923 <= arg2 ? arg2 : class709.field9923;
        if (class631.field8939 == this) {
            return 0;
        } else if (class320.field4556 == this) {
            return var4 - arg0;
        } else if (class539.field7488 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 29)
    public static void method3292(byte arg0) {
        field7879 = null;
        if (arg0 != 109) {
            field7880 = null;
        }
        field7880 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Lof;", line = 40)
    public static final class477 method3293(int arg0) {
        field7877++;
        return arg0 == -15561 ? class233.field3384 : null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V", line = 51)
    public static final void method3294(int arg0) {
        field7876++;
        class420.field5820.method3781(class420.field5820.field9496, arg0 ^ 0xFFFFEA1B, 1);
        if (arg0 != -5550) {
            field7880 = null;
        }
        class420.field5820.method3781(class420.field5820.field9495, 111, 1);
        class420.field5820.method3781(class420.field5820.field9483, 108, 2);
        class420.field5820.method3781(class420.field5820.field9460, arg0 + 5622, 2);
        class420.field5820.method3781(class420.field5820.field9479, arg0 + 5674, 1);
        class420.field5820.method3781(class420.field5820.field9454, 87, 1);
        class420.field5820.method3781(class420.field5820.field9468, 70, 1);
        class420.field5820.method3781(class420.field5820.field9490, 79, 1);
        class420.field5820.method3781(class420.field5820.field9450, arg0 ^ 0xFFFFEA2C, 1);
        class420.field5820.method3781(class420.field5820.field9487, 124, 1);
        class420.field5820.method3781(class420.field5820.field9457, 113, 2);
        class420.field5820.method3781(class420.field5820.field9481, 118, 1);
        class420.field5820.method3781(class420.field5820.field9489, arg0 + 5661, 2);
        class420.field5820.method3781(class420.field5820.field9459, 75, 1);
        class420.field5820.method3781(class420.field5820.field9485, arg0 + 5668, 0);
        class420.field5820.method3781(class420.field5820.field9447, 86, 0);
        class420.field5820.method3781(class420.field5820.field9453, 119, 2);
        class420.field5820.method3781(class420.field5820.field9461, arg0 ^ 0xFFFFEA3B, 0);
        class420.field5820.method3781(class420.field5820.field9476, arg0 + 5627, 0);
        class343.method2105(arg0 ^ 0xFFFFEA56);
        class420.field5820.method3781(class420.field5820.field9493, arg0 + 5620, 0);
        class420.field5820.method3781(class420.field5820.field9443, arg0 ^ 0xFFFFEA2C, 4);
        class319.method1936((byte) 123);
        class166.method1239(false);
        class789.field10785 = true;
    }

    @OriginalMember(owner = "client!mp", name = "toString", descriptor = "()Ljava/lang/String;", line = 92)
    public final String toString() {
        field7878++;
        throw new IllegalStateException();
    }
}
