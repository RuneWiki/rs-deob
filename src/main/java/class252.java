import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class252 {

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "[I")
    public static int[] field3742;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "F")
    public static float field3739;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "Lmh;")
    public static class378 field3744;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "[Lvj;")
    public static class256[] field3740;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public abstract void method1753(int arg0);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static void method1754(int arg0) {
        field3742 = null;
        field3744 = null;
        field3740 = null;
        if (arg0 > -76) {
            method1755(15L, (String) null, 25, 35, (byte) -24, (String) null, 96, 2);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(JLjava/lang/String;IIBLjava/lang/String;II)V")
    public static final void method1755(long arg0, String arg1, int arg2, int arg3, byte arg4, String arg5, int arg6, int arg7) {
        field3738++;
        if (class359.field5185 || class381.field5412 >= 500) {
            return;
        }
        int var9 = -83 / ((-arg4 - 15) / 55);
        int var10 = arg3 == -1 ? class385.field5451 : arg3;
        class382 var11 = new class382(arg5, arg1, var10, arg2, arg0, arg6, arg7);
        class228.field3392.method2756(-78, var11);
        class381.field5412++;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
    public abstract void method1756(int arg0);

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Lpk;")
    public abstract class109 method1757(int arg0);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
    public abstract boolean method1758(int arg0, int arg1);

    static {
        new class349("From", "Von:", "De", "De");
        field3743 = -1;
        field3742 = new int[4096];
        for (int var0 = 0; var0 < 4096; var0++) {
            field3742[var0] = class213.method1492(-98, var0);
        }
    }
}
