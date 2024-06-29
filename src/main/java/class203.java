import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class203 extends class180 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field3462 = -32768;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lub;")
    public static class227 field3466 = class257.method1749("Ausw-=hlen", 17263);

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lub;")
    private static class227 field3469 = class257.method1749("OFF", 17263);

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lub;")
    public static class227 field3464 = field3469;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()I")
    public final int method88() {
        field3465++;
        return this.field3462;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field3464 = null;
        int var1 = 93 / ((arg0 + 13) / 63);
        field3469 = null;
        field3466 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)I")
    public static final int method1302(int arg0, int arg1, byte arg2) {
        field3467++;
        if (arg2 != 102) {
            return 101;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3463++;
        class48 var11 = class133.method815(this.field3472, (byte) -70).method1130(this.field3470, (class51) null, 768, 0);
        if (var11 != null) {
            var11.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3462 = var11.method88();
        }
    }
}
