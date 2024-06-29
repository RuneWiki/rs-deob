import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class177 extends class86 {

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lbe;")
    public static class283 field3036 = class153.method941(125, "leuchten2:");

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[Lfe;")
    public static class229[] field3041 = new class229[2048];

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[I")
    public static int[] field3040 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
    public static int[] field3049 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "[[[Lj;")
    public static class269[][][] field3046 = new class269[4][104][104];

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Lbe;")
    private static class283 field3054 = class153.method941(125, "Location");

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[I")
    public static int[] field3052 = new int[32];

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Lbe;")
    public static class283 field3047 = field3054;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "J")
    public long field3034;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Lka;")
    public class177 field3038;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Lka;")
    public class177 field3053;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Ldj;")
    public static class310 field3050;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Ljava/awt/Font;")
    public static Font field3048;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[I")
    public static int[] field3039;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[[[B")
    public static byte[][][] field3035;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 29)
    public static void method1165(int arg0) {
        field3049 = null;
        field3048 = null;
        field3052 = null;
        field3054 = null;
        field3039 = null;
        if (arg0 != 4) {
            return;
        }
        field3050 = null;
        field3046 = (class269[][][]) null;
        field3047 = null;
        field3040 = null;
        field3036 = null;
        field3041 = null;
        field3035 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V", line = 60)
    public static final void method1166(int arg0) {
        field3042++;
        if (arg0 <= 5) {
            field3051 = -57;
        }
        class228.field3831.method621(143, 8);
        class228.field3831.method1544((byte) 8, 0L);
        class71.field1240++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([JB[Ljava/lang/Object;)V", line = 76)
    public static final void method1167(long[] arg0, byte arg1, Object[] arg2) {
        class162.method988(arg2, arg0.length - 1, arg0, true, 0);
        field3044++;
        if (arg1 >= -14) {
            field3047 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V", line = 98)
    public final void method1168(int arg0) {
        field3037++;
        if (this.field3038 == null) {
            return;
        }
        this.field3038.field3053 = this.field3053;
        if (arg0 != 4) {
            this.field3034 = -19L;
        }
        this.field3053.field3038 = this.field3038;
        this.field3038 = null;
        this.field3053 = null;
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V", line = 117)
    public static final void method1169(int arg0) {
        class281.field4735 = null;
        field3045++;
        class248.field4230 = null;
        class236.field3960 = null;
        int var1 = -105 % ((59 - arg0) / 55);
        class76.field1330 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)J", line = 136)
    public static final long method1170(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null || var3.field2642 == null ? 0L : var3.field2642.field4931;
    }
}
