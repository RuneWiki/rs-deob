import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class198 extends class224 {

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field2845 = 0;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLud;)V", line = 5)
    public final void method1388(byte arg0, class35 arg1) {
        while (true) {
            int var3 = arg1.method273(arg0 + 228);
            if (var3 == 0) {
                field2842++;
                if (arg0 != 27) {
                    this.method1388((byte) 112, null);
                    return;
                }
                return;
            }
            this.method1390(arg1, var3, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 27)
    public static final String method1389(long arg0, byte arg1) {
        field2846++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 != 82) {
                field2843 = -84;
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class633.field9068[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lud;IB)V", line = 67)
    private final void method1390(class35 arg0, int arg1, byte arg2) {
        if (arg1 == 2) {
            this.field2845 = arg0.method253(-13900);
        }
        field2844++;
        if (arg2 <= 53) {
            method1389(-90L, (byte) -59);
        }
    }
}
