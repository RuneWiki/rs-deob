import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class591 {

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "J")
    public static long field8305 = -1L;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lwp;")
    public static class453 field8309 = new class453(92, -1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public int field8292;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public int field8293;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public int field8296;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public int field8298;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public int field8299;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public int field8304;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public int field8308;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Lpk;")
    public static class104 field8310;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lwca;")
    public static class338 field8297;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBZ)V", line = 7)
    public static final void method3248(int arg0, byte arg1, boolean arg2) {
        if (arg1 > -13) {
            method3248(-34, (byte) 11, false);
        }
        field8303++;
        class492 var3 = class183.method1141(arg2, (byte) 28, arg0);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field6496.length; var4++) {
                var3.field6496[var4] = -1;
                var3.field6495[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lhs;I)Z", line = 38)
    public final boolean method3249(class591 arg0, int arg1) {
        field8302++;
        if (this.field8292 == arg0.field8292 && this.field8308 == arg0.field8308 && this.field8300 == arg0.field8300) {
            return true;
        } else {
            return arg1 > -125;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V", line = 69)
    public static void method3250(boolean arg0) {
        if (arg0) {
            method3248(25, (byte) 11, true);
        }
        field8310 = null;
        field8297 = null;
        field8309 = null;
    }
}
