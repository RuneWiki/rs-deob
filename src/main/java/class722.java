import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class722 {

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Z")
    public static boolean field10132 = true;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "S")
    public static short field10135 = 256;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Llja;")
    public static class744 field10131 = new class744(46, 3);

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "J")
    public static long field10137 = 0L;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Lbt;")
    public static class48 field10136;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "[I")
    public static int[] field10134;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 6)
    public static void method4086(byte arg0) {
        field10131 = null;
        field10134 = null;
        field10136 = null;
        if (arg0 != -95) {
            method4086((byte) -15);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method4087(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10133++;
        if (arg1 != -21207) {
            method4087(-59, -50, -101, -113, 123);
        }
        if (arg4 != 8 && arg4 != 16) {
            class727 var5 = class107.field1351[arg2][arg0][arg3];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field10178 = 0;
                } else if (arg4 == 2) {
                    var5.field10183 = 0;
                }
            }
            class144.method1057((byte) 124);
            return;
        }
        for (int var6 = 0; var6 < class513.field7243; var6++) {
            class557 var7 = class345.field4315[var6];
            if (var7.field7742 == arg4 && var7.field7738 == arg0 && var7.field7745 == arg3 || var7.field7740 == arg0 && var7.field7745 == arg3) {
                if (class513.field7243 != var6) {
                    class211.method1335(class345.field4315, var6 + 1, class345.field4315, var6, -(var6 - class345.field4315.length) - 1);
                }
                class513.field7243--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lwaa;")
    public abstract class732 method210(int arg0);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V")
    public abstract void method212(byte arg0);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
    public abstract boolean method216(int arg0, int arg1);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
    public abstract void method213(int arg0);
}
