import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class213 extends class183 {

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Ljava/lang/String;")
    public String field3074;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
    public static int[] field3071 = new int[128];

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[I")
    public static int[] field3072 = new int[25];

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lqc;")
    public static class99 field3073 = new class99(64);

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Lpn;")
    public static class170 field3076;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)V", line = 11)
    public static final void method1486(int arg0, int arg1, byte arg2) {
        field3075++;
        int var3 = -94 % ((arg2 + 44) / 50);
        class143 var4 = class163.method1176((byte) -37, arg1, 13);
        var4.method1032((byte) 115);
        var4.field1965 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 24)
    public static void method1487(int arg0) {
        field3076 = null;
        field3073 = null;
        if (arg0 != -2520) {
            field3071 = (int[]) null;
        }
        field3071 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 40)
    public class213() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 46)
    public class213(String arg0) {
        this.field3074 = arg0;
    }
}
