import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class32 extends class35 {

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public int field454 = -1;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field451 = 0;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 5634) {
            field449 = 107;
        }
        field447++;
        class258 var7 = class102.method849((byte) -105, arg0, arg3);
        if (var7 != null && var7.field3761 != null) {
            class254 var8 = new class254();
            var8.field3683 = var7.field3761;
            var8.field3678 = var7;
            class216.method1636(var8);
        }
        class72.field1207 = arg1;
        class242.field3536 = arg3;
        class436.field6354 = arg4;
        class320.field4637 = arg6;
        class46.field751 = arg0;
        class209.field3041 = arg2;
        class291.field4332 = true;
        class107.method947(true, var7);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field453++;
        if (arg3 != -6370) {
            method234(-118, -9, -4, -80, 55);
        }
        class188 var5 = (class188) class319.field4606.method1219((long) arg2, -95);
        if (var5 == null) {
            var5 = new class188();
            class319.field4606.method1217(1, (long) arg2, var5);
        }
        if (arg0 >= var5.field2781.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2781.length; var8++) {
                var6[var8] = var5.field2781[var8];
                var7[var8] = var5.field2780[var8];
            }
            for (int var9 = var5.field2781.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2781 = var6;
            var5.field2780 = var7;
        }
        var5.field2781[arg0] = arg4;
        var5.field2780[arg0] = arg1;
    }
}
