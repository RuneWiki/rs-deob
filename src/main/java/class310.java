import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class310 extends class338 {

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "J")
    public static long field4188 = 0L;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "[I")
    public static int[] field4187 = new int[14];

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field4183 = 100;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 11)
    public static void method1815(byte arg0) {
        field4187 = null;
        if (arg0 > -115) {
            field4182 = -61;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILdn;)V", line = 22)
    public static final void method1816(int arg0, class321 arg1) {
        arg1.field4289 = null;
        field4185++;
        int var2 = arg1.field4293.length;
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1.field4293[var3].field6507 = false;
        }
        class184[] var4 = class38.field396;
        synchronized (class38.field396) {
            if (var2 < class38.field396.length && class19.field191[var2] < 200) {
                class38.field396[var2].method992(arg1, arg0 + 111);
                int var10002 = class19.field191[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 49)
    public class310() {
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V", line = 55)
    public class310(int arg0) {
        this.field4186 = arg0;
    }
}
