import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class195 extends class97 {

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[B")
    public byte[] field3833;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lea;")
    private static class38 field3835 = class9.method46((byte) 120, "Loading textures )2 ");

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field3840 = -1;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Lea;")
    public static class38 field3841 = class9.method46((byte) 101, ")1j");

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Lea;")
    private static class38 field3836 = class9.method46((byte) 109, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Lea;")
    public static class38 field3843 = class9.method46((byte) 126, " <col=ffffff>");

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Lea;")
    public static class38 field3846 = field3835;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
    public static int[] field3845 = new int[2000];

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "Lea;")
    public static class38 field3847 = field3836;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lmd;")
    public static class111 field3832;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "Lqa;")
    public static class144 field3842;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lea;I)V")
    public static final void method1290(class38 arg0, int arg1) {
        field3844++;
        if (class30.field595 == null) {
            return;
        }
        int var2 = arg1;
        long var3 = arg0.method256(arg1 ^ 0xFFFFFFBD);
        if (var3 == 0L) {
            return;
        }
        while (class30.field595.length > var2 && class30.field595[var2].field2172 != var3) {
            var2++;
        }
        if (var2 < class30.field595.length && class30.field595[var2] != null) {
            class111.field2483.method169(-1494101117, 22);
            class160.field3336++;
            class111.field2483.method480(class30.field595[var2].field2172, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static final void method1291(int arg0) {
        if (arg0 != -101) {
            field3847 = null;
        }
        field3839++;
        class52.field1334 = new class141();
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
    public static void method1292(boolean arg0) {
        field3845 = null;
        field3835 = null;
        field3841 = null;
        field3843 = null;
        field3842 = null;
        if (!arg0) {
            field3847 = null;
        }
        field3832 = null;
        field3836 = null;
        field3847 = null;
        field3846 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
    public class195(byte[] arg0) {
        this.field3833 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field3838++;
        if (class53.method385(arg1, arg4 + 27212)) {
            class183.field3656 = null;
            class133.method977(arg0, arg6, class168.field3461[arg1], arg3, arg7, arg8, -26787, arg5, arg2, -1);
            if (arg4 == 111 && class183.field3656 != null) {
                class133.method977(class12.field276, arg6, class183.field3656, arg3, arg7, arg8, arg4 ^ 0xFFFF9732, class86.field2007, arg2, -1412584499);
                class183.field3656 = null;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class102.field2291[var9] = true;
            }
        } else {
            class102.field2291[arg6] = true;
        }
    }
}
