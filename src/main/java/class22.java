import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class22 extends class177 {

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field234 = "Loading interfaces - ";

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Ljava/lang/String;")
    public static String field235 = "flash3:";

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lta;")
    public static class197 field237 = new class197(200);

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "Lta;")
    public static class197 field242 = new class197(4);

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "Llb;")
    public static class211 field243;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "[[B")
    public static byte[][] field239;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 4)
    public static void method148(int arg0) {
        field239 = (byte[][]) null;
        field243 = null;
        field235 = null;
        field237 = null;
        if (arg0 != 0) {
            method150((byte) 67);
        }
        field234 = null;
        field242 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIII)Z", line = 19)
    public static final boolean method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I", line = 47)
    public final int[] method95(int arg0, int arg1) {
        field238++;
        if (arg0 > -52) {
            field237 = (class197) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -49);
        if (this.field2652.field3287) {
            class151.method1116(var3, 0, class287.field4415, class260.field3858[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 73)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V", line = 81)
    public static final void method150(byte arg0) {
        class159.field2375++;
        if (arg0 > -63) {
            return;
        }
        field241++;
        class159.field2372.method59(243, (byte) 73);
        for (class111 var1 = (class111) client.field3794.method200(0); var1 != null; var1 = (class111) client.field3794.method202((byte) 98)) {
            if (var1.field1751 == 0) {
                class163.method1170((byte) 98, var1, true);
            }
        }
        if (class20.field227 != null) {
            class133.method1007(class20.field227, 106);
            class20.field227 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBIZ)V", line = 112)
    public static final void method151(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field236++;
        if (arg2 >= 3 && class179.method1294(arg1, 1)) {
            class230.method1640(arg4, class305.field4779[arg1], -1, arg0, 72, arg3);
        }
    }
}
