import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class213 {

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "S")
    public short field2741;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "B")
    public byte field2734;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "S")
    public short field2737;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Z")
    public boolean field2736;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "S")
    public short field2738;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "B")
    public byte field2740;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lkg;")
    public static class179 field2739 = new class179(45, 3);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method1315(int arg0, byte arg1) {
        field2733++;
        class153 var2 = class75.method656(8, arg1 + 162, arg0);
        var2.method997(arg1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1316(boolean arg0) {
        if (arg0) {
            field2743 = -36;
        }
        field2739 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBIII)Lfp;", line = 31)
    public final class213 method1317(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = -45 % ((23 - arg1) / 44);
        field2735++;
        return new class213(arg3, arg2, arg4, arg0, this.field2737, this.field2741, this.field2738, this.field2734, this.field2740, this.field2736);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IC)Z", line = 47)
    public static final boolean method1318(int arg0, char arg1) {
        field2744++;
        if (arg0 == 45) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 60)
    public class213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field2741 = (short) arg5;
        this.field2734 = (byte) arg7;
        this.field2742 = arg0;
        this.field2737 = (short) arg4;
        this.field2736 = arg9;
        this.field2738 = (short) arg6;
        this.field2740 = (byte) arg8;
    }
}
