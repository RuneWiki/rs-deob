import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class32 {

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field462 = 3;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lwb;")
    public static class171 field460;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[Z")
    public static boolean[] field452;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLcg;)Lvl;", line = 5)
    public static final class90 method293(int arg0, byte arg1, class49 arg2) {
        field456++;
        byte[] var3 = arg2.method459(arg0, -1);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -74) {
                field453 = 127;
            }
            return new class90(var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lcg;BLcg;)V", line = 29)
    public static final void method294(class49 arg0, byte arg1, class49 arg2) {
        int var3 = 32 / ((arg1 + 8) / 58);
        class214.field3593 = arg0;
        class189.field3167 = arg2;
        field455++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field451++;
        class30 var5 = class99.method857((byte) 84, arg0, arg3);
        var5.method277(true);
        var5.field438 = arg4;
        var5.field441 = arg1;
        var5.field425 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 56)
    public static void method296(int arg0) {
        field460 = null;
        field452 = null;
        if (arg0 < 61) {
            field453 = 7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 70)
    public static final void method297(int arg0) {
        class259.field4198.method470(12);
        if (arg0 != -4039) {
            method295(95, 63, -23, -25, -32);
        }
        field458++;
    }
}
