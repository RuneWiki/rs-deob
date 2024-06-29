import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class428 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field5725;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    private int field5732;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    private int field5738;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field5731;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field5724;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field5730;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lcha;")
    public static class220 field5734 = new class220(5, 4);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)J", line = 6)
    public static final long method2452(byte arg0) {
        field5729++;
        int var1 = -110 % ((arg0 - 53) / 49);
        return class194.field2660.method70(-110);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 17)
    public static void method2453(int arg0) {
        if (arg0 == 5358) {
            field5734 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIIBI)V", line = 27)
    public final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field5728++;
        this.field5732 = arg8 * arg8;
        this.field5738 = arg2;
        this.field5725 = arg5;
        this.field5727 = arg1;
        this.field5736 = this.field5725 + arg3;
        if (arg9 < 81) {
            this.field5730 = -121;
        }
        this.field5724 = this.field5727 + arg6;
        this.field5731 = this.field5727 + arg10;
        this.field5726 = this.field5738 + arg4;
        this.field5730 = this.field5725 + arg7;
        this.field5733 = this.field5738 + arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)Z", line = 50)
    public final boolean method2455(int arg0, int arg1, int arg2, boolean arg3) {
        field5735++;
        if (this.field5736 > arg1 || this.field5730 < arg1) {
            return false;
        } else if (this.field5731 <= arg2 && arg2 <= this.field5724) {
            if (!arg3) {
                this.field5738 = -28;
            }
            if (arg0 >= this.field5733 && this.field5726 >= arg0) {
                int var5 = arg1 - this.field5725;
                int var6 = arg0 - this.field5738;
                return var5 * var5 + var6 * var6 < this.field5732;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 85)
    public class428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5725 = arg0;
        this.field5727 = arg1;
        this.field5732 = arg3 * arg3;
        this.field5738 = arg2;
        this.field5731 = this.field5727 + arg6;
        this.field5726 = this.field5738 + arg9;
        this.field5733 = this.field5738 + arg8;
        this.field5724 = this.field5727 + arg7;
        this.field5736 = this.field5725 + arg4;
        this.field5730 = this.field5725 + arg5;
    }
}
