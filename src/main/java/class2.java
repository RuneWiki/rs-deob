import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class577 {

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "[I")
    public static int[] field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 4)
    public static void method16(int arg0) {
        field14 = null;
        if (arg0 != 23338) {
            field11 = -86;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II)V", line = 16)
    public class2(int arg0, int arg1) {
        this.field10 = arg0;
        this.field13 = arg1;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lmea;Z)V", line = 25)
    public static final void method17(class451 arg0, boolean arg1) {
        field12++;
        if (!arg1) {
            field14 = null;
        }
        if (arg0.field6210 == 5 && arg0.field6183 != -1) {
            class773.method4261(class37.field491, arg0, -19780);
        }
    }
}
