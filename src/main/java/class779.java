import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class779 {

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "[I")
    public static int[] field10639 = new int[3];

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field10635;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field10637;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZIII)V", line = 3)
    public static final void method4269(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class746.field10193 = arg2;
        class195.field2703 = arg4;
        class11.field116 = arg6;
        if (arg0 != -13485) {
            field10639 = null;
        }
        field10636++;
        class270.field3557 = arg5;
        class319.field3979 = arg1;
        if (arg3 && class319.field3979 >= 100) {
            class148.field1890 = class270.field3557 * 512 + 256;
            class97.field1309 = class746.field10193 * 512 + 256;
            class439.field5770 = class512.method2831(class309.field3877, (byte) 116, class97.field1309, class148.field1890) - class11.field116;
        }
        class525.field6679 = -1;
        class524.field6672 = -1;
        class507.field6476 = 2;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method4270(int arg0, int arg1, int arg2, int arg3) {
        class766 var4 = class28.field252[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class121 var5 = var4.field10432;
        class121 var6 = var4.field10430;
        if (var5 != null) {
            var5.field1621 = (short) (var5.field1621 * arg3 / (0x10 << class88.field1221 - 7));
            var5.field1627 = (short) (var5.field1627 * arg3 / (0x10 << class88.field1221 - 7));
        }
        if (var6 != null) {
            var6.field1621 = (short) (var6.field1621 * arg3 / (0x10 << class88.field1221 - 7));
            var6.field1627 = (short) (var6.field1627 * arg3 / (0x10 << class88.field1221 - 7));
        }
    }

    @OriginalMember(owner = "client!jaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 64)
    public final String toString() {
        field10637++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 72)
    public static void method4271(byte arg0) {
        field10639 = null;
        if (arg0 != 75) {
            method4269(-37, -42, 100, true, -82, -127, 39);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)Z", line = 88)
    public final boolean method4272(byte arg0) {
        field10638++;
        if (arg0 < 71) {
            method4269(-1, -116, -85, false, 119, -74, -31);
        }
        return class7.field68 == this | class107.field1455 == this;
    }
}
