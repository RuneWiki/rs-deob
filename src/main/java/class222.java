import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class222 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "[Lsc;")
    public volatile class131[] field3821 = new class131[2];

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
    public volatile boolean field3815 = false;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Z")
    public volatile boolean field3818 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Leg;")
    public static class37 field3813 = class174.method1167("http:)4)4", 73);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Z")
    public static boolean[] field3817 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Llb;")
    public class207 field3819;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public static int[] field3820;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1550(int arg0) {
        field3813 = null;
        field3817 = null;
        field3820 = null;
        if (arg0 != -10715) {
            field3820 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZIII)Lja;")
    public static final class105 method1551(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3812++;
        int var7 = (arg0 << 19) + (arg1 << 17) + (arg2 ? 65536 : 0) + arg3;
        long var8 = (long) arg5 * 3147483667L + (long) var7 * 3849834839L;
        int var10 = 102 / ((-arg4 - 24) / 37);
        class105 var11 = (class105) class107.field1662.method1411(-103, var8);
        if (var11 != null) {
            return var11;
        }
        class76.field1191 = false;
        class105 var12 = class231.method1590(arg1, arg2, false, arg0, -41, false, arg5, arg3);
        if (var12 != null && !class76.field1191) {
            class107.field1662.method1404(var8, false, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        this.field3818 = true;
        try {
            while (!this.field3815) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class131 var2 = this.field3821[var1];
                    if (var2 != null) {
                        var2.method936((byte) -34);
                    }
                }
                class144.method1008(121, 10L);
                class19.method126((Object) null, this.field3819, (byte) -117);
            }
        } catch (Exception var9) {
            class200.method1392(58, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field3818 = false;
        }
        field3816++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        field3814++;
        class73.field1151.method1403(45);
        if (arg0 != -4287) {
            method1551(-26, -55, false, -15, 5, -108);
        }
    }
}
