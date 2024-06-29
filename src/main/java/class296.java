import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class296 extends class316 {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    private int field4459 = -1;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Ljo;")
    public static class351 field4457 = new class351(78, 4);

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
    public static int[] field4463 = new int[3];

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lqda;")
    public static class112 field4462;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Lwq;")
    public static class176 field4458;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[Lwga;")
    public static class778[] field4465;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lua;I)V")
    public final void method819(class692 arg0, int arg1) {
        if (arg1 == 0) {
            field4460++;
            arg0.method3890(arg1 ^ 0x1, this.field4459);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)V")
    public static final void method1984(int arg0, int arg1, int arg2, int arg3) {
        class379 var4 = class378.field5427[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class239 var5 = var4.field5432;
        class239 var6 = var4.field5444;
        if (var5 != null) {
            var5.field3448 = (short) (var5.field3448 * arg3 / (0x10 << class310.field4616 - 7));
            var5.field3452 = (short) (var5.field3452 * arg3 / (0x10 << class310.field4616 - 7));
        }
        if (var6 != null) {
            var6.field3448 = (short) (var6.field3448 * arg3 / (0x10 << class310.field4616 - 7));
            var6.field3452 = (short) (var6.field3452 * arg3 / (0x10 << class310.field4616 - 7));
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1985(byte arg0) {
        field4458 = null;
        field4457 = null;
        field4463 = null;
        field4462 = null;
        if (arg0 != 123) {
            method1984(-3, -98, 5, 73);
        }
        field4465 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILrv;)V")
    public final void method818(int arg0, class120 arg1) {
        this.field4459 = arg1.method898((byte) -124);
        if (arg0 != -2) {
            this.method818(28, null);
        }
        field4461++;
        arg1.method842(2384);
        if (arg1.method842(2384) != 255) {
            arg1.field1521--;
            arg1.method834(-8616);
        }
    }
}
