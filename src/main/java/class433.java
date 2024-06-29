import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class433 extends class501 {

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field5800 = 0;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field5797;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field5798;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lsl;")
    public class391 field5802;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Ljava/lang/String;")
    public String field5801;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
    public int[] field5799;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
    public int[] field5804;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[Llb;")
    public class465[] field5794;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field5795;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)V", line = 16)
    public static final void method2529(int arg0, int arg1, int arg2, byte arg3) {
        field5806++;
        if (arg3 == -24) {
            class221 var4 = class65.method413(9, arg1, (byte) -54);
            var4.method1426((byte) -121);
            var4.field3208 = arg0;
            var4.field3214 = arg2;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IC)Z", line = 38)
    public static final boolean method2530(int arg0, char arg1) {
        field5793++;
        if (arg0 > -90) {
            return false;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }
}
