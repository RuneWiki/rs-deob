import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class517 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field7498 = -1;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lhga;")
    public static class158 field7500 = new class158(30, -1);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method3126(int arg0) {
        int var1 = 48 % ((arg0 + 45) / 45);
        field7500 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[S)[S")
    public static final short[] method3127(int arg0, short[] arg1) {
        field7499++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            int var3 = 18 / ((arg0 + 22) / 53);
            class398.method2567(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
