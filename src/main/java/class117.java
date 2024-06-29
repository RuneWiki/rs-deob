import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class117 extends class165 {

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[Z")
    public static boolean[] field1770 = new boolean[112];

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[I")
    public static int[] field1773 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1776 = "scroll:";

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field1780 = -1;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Z")
    public boolean field1778;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method800(int arg0) {
        if (arg0 != 0) {
            field1773 = (int[]) null;
        }
        field1775++;
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 16)
    public static void method801(int arg0) {
        field1776 = null;
        field1773 = null;
        field1770 = null;
        if (arg0 != 1840) {
            field1776 = (String) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)Z", line = 28)
    public final boolean method802(int arg0) {
        field1777++;
        return arg0 >= -51 ? false : false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V", line = 41)
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1774++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class90.field1250 - class321.field4979) * var8 / 100 + class321.field4979;
        int var10 = arg2 * var9 >> 8;
        int var11 = 0;
        int var12 = 2048 - arg4 & 0x7FF;
        if (arg0 != 11104) {
            field1770 = (boolean[]) null;
        }
        int var13 = 2048 - arg3 & 0x7FF;
        int var14 = 0;
        int var15 = var10;
        if (var13 != 0) {
            int var16 = class170.field2810[var13];
            int var17 = class170.field2801[var13];
            var14 = -var10 * var17 >> 16;
            var15 = var10 * var16 >> 16;
        }
        if (var12 != 0) {
            int var18 = class170.field2801[var12];
            var11 = var15 * var18 >> 16;
            int var19 = class170.field2810[var12];
            var15 = var15 * var19 >> 16;
        }
        class74.field1036 = arg3;
        class186.field3076 = arg4;
        class83.field1173 = arg5 - var14;
        class260.field4150 = arg1 - var15;
        class120.field1825 = arg7 - var11;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lql;", line = 120)
    public static final class27 method809(int arg0, int arg1) {
        field1781++;
        class27 var2 = (class27) class21.field301.method704((byte) 72, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class330.field5083.method1287(class135.method1008(-96, arg0), class192.method1421((byte) 4, arg0), -1);
        class27 var4 = new class27();
        if (arg1 >= -40) {
            return (class27) null;
        }
        if (var3 != null) {
            var4.method154(-2432, new class44(var3));
        }
        class21.field301.method703(var4, (long) arg0, (byte) 41);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)Z", line = 148)
    public final boolean method810(int arg0) {
        field1771++;
        if (arg0 < 8) {
            this.field1778 = false;
        }
        return this.field1778;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()I", line = 162)
    public int method811() {
        field1772++;
        return 0;
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)I", line = 173)
    public final int method812(int arg0) {
        field1769++;
        return arg0 == 23954888 ? 1 : 75;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    public abstract void method803(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public abstract void method805(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()V")
    public abstract void method806();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()Z")
    public abstract boolean method807();

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    public abstract void method808(int arg0, int arg1);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()Z")
    public abstract boolean method813();
}
