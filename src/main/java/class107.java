import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class107 extends class276 {

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "Z")
    public static boolean field1903 = false;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "J")
    public static long field1906 = 0L;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIB)V", line = 10)
    public static final void method778(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1905++;
        if (arg2 >= arg1) {
            class357.method2291(arg1, arg3, class209.field3294[arg0], arg2, -1);
        } else {
            class357.method2291(arg2, arg3, class209.field3294[arg0], arg1, -1);
        }
        if (arg4 <= 90) {
            method778(78, 62, -90, 51, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II)V", line = 34)
    public class107(int arg0, int arg1) {
        this.field1907 = arg1;
        this.field1904 = arg0;
    }
}
