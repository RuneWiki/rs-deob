import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class589 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field8314 = -1;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "F")
    public static float field8306 = 0.25F;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field8315 = 0;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field8302;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field8305;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field8309;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field8311;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field8313;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Lls;")
    public static class149 field8303;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 5)
    public static final int method3433(int arg0, int arg1) {
        if (arg1 >= -125) {
            method3433(42, 115);
        }
        field8304++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 28)
    public static void method3434(int arg0) {
        int var1 = -10 % ((-arg0 - 74) / 39);
        field8303 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V", line = 43)
    public static final void method3435(int arg0, int arg1, int arg2) {
        field8312++;
        class313 var3 = class312.method1998(0L, arg1, arg1 ^ 0xFFFFFFF0);
        var3.method2001((byte) 78);
        var3.field4455 = arg2;
        var3.field4464 = arg0;
    }
}
