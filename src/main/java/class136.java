import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class136 extends class487 {

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Z")
    public boolean field2213;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        field2214++;
        if (arg0 != -77) {
            this.field2218 = 127;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z")
    public final boolean method139(int arg0) {
        if (arg0 == 2) {
            field2216++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILoa;ILni;ZZI)V")
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (!arg5) {
            method1012(50, (byte) -30, -10, 120, -36);
        }
        field2212++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBIII)V")
    public static final void method1012(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -48 / ((arg1 - 54) / 56);
        field2210++;
        class382 var6 = class396.method2276(-39, 8, arg4);
        var6.method2232(106);
        var6.field5104 = arg3;
        var6.field5099 = arg2;
        var6.field5106 = arg0;
    }
}
