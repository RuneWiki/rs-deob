import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class230 extends class222 {

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "Lsb;")
    public static class98 field3967 = class47.method368("mapscene", 0);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[[I")
    public static int[][] field3970 = new int[104][104];

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lsb;")
    public static class98 field3972 = class47.method368("Starte 3D)2Softwarebibliothek)3", 0);

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Lsb;")
    public static class98 field3971 = class47.method368("hint_mapmarkers", 0);

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "Llb;")
    public static class190 field3977 = new class190(128);

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "Lsb;")
    public static class98 field3979 = class47.method368("b12_full", 0);

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "Lsb;")
    public static class98 field3978 = class47.method368("Mem:", 0);

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "Z")
    public static boolean field3980 = false;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    private int field3968;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
    private int field3974;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field3975;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3834.method627(4103, arg0);
            if (super.field3834.field1486) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class13.field253; ++var7) {
                    var4[var7] = this.field3968;
                    var5[var7] = this.field3974;
                    var6[var7] = this.field3964;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class230() {
        this(0);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)V")
    private final void method1586(byte arg0, int arg1) {
        this.field3964 = (arg1 & 255) << 4;
        this.field3974 = (65280 & arg1) >> 4;
        if (arg0 == -50) {
            ++field3965;
            this.field3968 = arg1 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZB)I")
    public static final int method1587(boolean arg0, byte arg1) {
        ++field3976;
        if (arg1 >= 65 && ~arg1 >= -91) {
            return arg1 + -65;
        } else if (~arg1 <= -98 && arg1 <= 122) {
            return arg1 + -97 + 26;
        } else {
            if (arg0) {
                method1588(false);
            }
            if (arg1 >= 48 && arg1 <= 57) {
                return arg1 + 52 + -48;
            } else if (~arg1 == -44) {
                return 62;
            } else if (arg1 == 42) {
                return 62;
            } else if (~arg1 == -48) {
                return 63;
            } else {
                return ~arg1 == -46 ? 63 : -1;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    private class230(int arg0) {
        super(0, false);
        this.method1586((byte) -50, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method1588(boolean arg0) {
        field3978 = null;
        field3977 = null;
        field3979 = null;
        if (!arg0) {
            method1587(true, (byte) -19);
        }
        field3967 = null;
        field3972 = null;
        field3970 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (arg2 == 0) {
                this.method1586((byte) -50, arg0.method1448(26420));
            }
            ++field3973;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
    public static final void method1589(int arg0, int arg1) {
        int var2 = 2 / ((-3 - arg0) / 35);
        class164.field2952.method1561(-73, arg1);
        ++field3966;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llj;I)Lw;")
    public static final class100 method1590(class216 arg0, int arg1) {
        ++field3969;
        if (arg1 != 57) {
            method1588(true);
        }
        class100 var2 = new class100();
        var2.field1763 = arg0.method1487(87);
        var2.field1755 = class90.method663(var2.field1763, 0);
        return var2;
    }
}
