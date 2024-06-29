import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class695 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Lut;")
    private class719 field8910;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field8908 = -1;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[[Z")
    public static boolean[][] field8912 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[I")
    public static int[] field8913 = new int[2];

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Lkh;")
    private class173 field8917;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Lkh;", line = 3)
    public final class173 method3703(int arg0) {
        if (arg0 != -28643) {
            return null;
        }
        field8916++;
        class173 var2 = this.field8910.field9453.field2279;
        if (this.field8910.field9453 == var2) {
            this.field8917 = null;
            return null;
        } else {
            this.field8917 = var2.field2279;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Lkh;", line = 34)
    public final class173 method3704(byte arg0) {
        field8914++;
        class173 var2 = this.field8917;
        if (this.field8910.field9453 == var2) {
            this.field8917 = null;
            return null;
        } else if (arg0 == 121) {
            this.field8917 = var2.field2279;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V", line = 70)
    public static void method3705(byte arg0) {
        field8912 = null;
        field8913 = null;
        if (arg0 <= 81) {
            method3705((byte) 82);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 80)
    public class695() {
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lut;)V", line = 82)
    public class695(class719 arg0) {
        this.field8910 = arg0;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Lcc;", line = 90)
    public static final class602 method3706(boolean arg0) {
        field8909++;
        try {
            return arg0 ? null : (class602) Class.forName("lw").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lmc;I)Ljk;", line = 107)
    public static final class196 method3707(class234 arg0, int arg1) {
        field8915++;
        String var2 = arg0.method1540((byte) -102);
        if (arg1 != 2) {
            return null;
        }
        class759 var3 = class166.method1061(0)[arg0.method1509(true)];
        class20 var4 = class549.method2972(-2)[arg0.method1509(true)];
        int var5 = arg0.method1542(27067);
        int var6 = arg0.method1542(27067);
        int var7 = arg0.method1509(true);
        int var8 = arg0.method1509(true);
        int var9 = arg0.method1509(true);
        int var10 = arg0.method1553((byte) 53);
        int var11 = arg0.method1553((byte) -118);
        int var12 = arg0.method1497((byte) 85);
        int var13 = arg0.method1497((byte) 30);
        int var14 = arg0.method1497((byte) 57);
        return new class196(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
