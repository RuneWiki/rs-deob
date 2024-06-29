import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class349 extends class387 {

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public int field5182;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Z")
    public static boolean field5180 = false;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "[Lfa;")
    public static class398[] field5178 = new class398[6];

    @OriginalMember(owner = "client!br", name = "n", descriptor = "S")
    public static short field5177 = 32767;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(B)V")
    public static void method2317(byte arg0) {
        if (arg0 == 80) {
            field5178 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIII)V")
    public class349(int arg0, int arg1, int arg2, int arg3) {
        this.field5182 = arg1;
        this.field5179 = arg0;
        this.field5176 = arg3;
        this.field5175 = arg2;
    }
}
