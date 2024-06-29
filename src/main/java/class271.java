import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class271 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field3544 = new int[16384];

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field3549 = new int[16384];

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lefa;")
    public static class322 field3550;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
    public final int method1619(int arg0) {
        field3545++;
        if (arg0 != -24991) {
            field3549 = null;
        }
        return this.field3547;
    }

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3548++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILfn;ZIIBLmv;)V")
    public static final void method1620(int arg0, class617 arg1, boolean arg2, int arg3, int arg4, byte arg5, class295 arg6) {
        class78.method454(arg4, arg3, arg6, -23561, arg0, arg2);
        field3546++;
        int var7 = 15 % ((arg5 + 78) / 46);
        class258.field3346 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method1621(int arg0) {
        field3550 = null;
        field3549 = null;
        field3544 = null;
        if (arg0 != 16384) {
            field3544 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class271(String arg0, int arg1) {
        this.field3547 = arg1;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3549[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3544[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field3550 = new class322(64);
    }
}
