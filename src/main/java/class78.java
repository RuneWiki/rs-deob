import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class78 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "S")
    public short field985;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
    public boolean field982;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "S")
    public short field983;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "S")
    public short field980;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "B")
    public byte field984;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lhga;")
    public static class158 field981 = new class158(114, 6);

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "Lhga;")
    public static class158 field995 = new class158(78, 6);

    @OriginalMember(owner = "client!in", name = "o", descriptor = "F")
    public static float field994;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Lcl;")
    public static class245 field996;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method763(byte arg0) {
        if (arg0 != -15) {
            field994 = -0.48523313F;
        }
        field995 = null;
        field981 = null;
        field996 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILcs;)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3, class313 arg4) {
        class252 var5 = class115.method1040(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field9696 = (arg1 << class439.field6699) + class459.field6867;
        arg4.field9701 = arg3;
        arg4.field9705 = (arg2 << class439.field6699) + class459.field6867;
        if (var5.field4025 != null) {
            arg4.field9701 -= var5.field4025.field7864;
        }
        var5.field4034 = arg4;
        int var6 = class587.field8346 == class493.field7208 ? 1 : 0;
        if (arg4.method414(0)) {
            if (arg4.method402(623404585)) {
                class321.field5016[var6][class124.field2052[var6]++] = arg4;
                return;
            }
            class20.field329[var6][class203.field3310[var6]++] = arg4;
            return;
        }
        class245.field3903[var6][class95.field1483[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field985 = (short) arg5;
        this.field982 = arg10;
        this.field983 = (short) arg4;
        this.field986 = arg3;
        this.field988 = arg11;
        this.field980 = (short) arg6;
        this.field990 = arg0;
        this.field991 = arg2;
        this.field987 = arg1;
        this.field984 = (byte) arg8;
    }
}
