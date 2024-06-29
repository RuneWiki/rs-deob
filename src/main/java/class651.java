import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class651 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field9388;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    private int field9391;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public int field9395;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lmv;")
    public class345 field9389;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Z")
    public static final boolean method3717(int arg0, int arg1, int arg2) {
        field9393++;
        if (arg1 > -113) {
            return true;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLqh;)V")
    private final void method3718(int arg0, byte arg1, class61 arg2) {
        field9394++;
        if (arg1 != 67) {
            this.field9388 = 97;
        }
        if (arg0 == 1) {
            this.field9391 = arg2.method723((byte) -25);
        } else if (arg0 == 2) {
            this.field9388 = arg2.method732(-559537960);
            this.field9395 = arg2.method732(-559537960);
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lvw;")
    public final synchronized class279 method3719(boolean arg0) {
        field9390++;
        class279 var2 = (class279) this.field9389.field5162.method1900((long) this.field9391, -108);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            this.field9388 = -123;
        }
        class279 var3 = class279.method1841(this.field9389.field5155, this.field9391, 0);
        if (var3 != null) {
            this.field9389.field5162.method1904(var3, (long) this.field9391, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqh;B)V")
    public final void method3720(class61 arg0, byte arg1) {
        field9392++;
        while (true) {
            int var3 = arg0.method732(arg1 ^ 0x2159DF4F);
            if (var3 == 0) {
                if (arg1 == -105) {
                    return;
                } else {
                    method3717(-62, -47, 48);
                    return;
                }
            }
            this.method3718(var3, (byte) 67, arg0);
        }
    }
}
