import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class264 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lke;")
    public static class110 field3961;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lhc;")
    public static class235 field3969;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lod;")
    public class93 field3971;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
    public int[] field3964;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[[[B")
    public static byte[][][] field3966;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1730(int arg0) {
        field3969 = null;
        field3961 = null;
        if (arg0 < -44) {
            field3966 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method1731(byte arg0) {
        field3968++;
        class158.field2203++;
        if (arg0 < 119) {
            method1733((class235) null, 27);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIB)V")
    public static final void method1732(int arg0, int arg1, int arg2, byte arg3) {
        field3970++;
        class280 var4 = class181.method1180(arg2, 0, 9);
        var4.method1876(arg3 ^ 0x6DB3262A);
        var4.field4330 = arg1;
        var4.field4338 = arg0;
        if (arg3 != 10) {
            field3966 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1733(class235 arg0, int arg1) {
        class154.field2137 = arg0;
        field3962++;
        if (arg1 != 9) {
            field3969 = null;
        }
    }
}
