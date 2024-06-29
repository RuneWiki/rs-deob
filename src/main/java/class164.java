import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class164 extends class518 {

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    private int field2175;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field2179;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[[I")
    public static int[][] field2173 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    public static int[] field2171 = new int[14];

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lvi;")
    public static class388 field2174;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method1041(int arg0, int arg1, byte arg2) {
        ++field2180;
        int var4 = this.field2178 * arg0 >> 12;
        int var5 = this.field2179 * arg0 >> 12;
        int var6 = this.field2175 * arg1 >> 12;
        if (arg2 >= 11) {
            int var7 = this.field2181 * arg1 >> 12;
            class530.method2905(var7, var5, 74, super.field6594, var4, super.field6595, super.field6592, var6);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 22)
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field2172;
        if (arg0 != -23442) {
            this.method1042(-91, -45, 55);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIII)V", line = 36)
    public class164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2181 = arg3;
        this.field2178 = arg0;
        this.field2175 = arg1;
        this.field2179 = arg2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 48)
    public static void method1043(int arg0) {
        if (arg0 >= -109) {
            field2177 = 45;
        }
        field2174 = null;
        field2173 = null;
        field2171 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIB)V", line = 67)
    public final void method1044(int arg0, int arg1, byte arg2) {
        ++field2176;
        int var4 = this.field2178 * arg1 >> 12;
        int var5 = this.field2179 * arg1 >> 12;
        if (arg2 != 24) {
            this.method1042(-107, 112, -73);
        }
        int var6 = this.field2175 * arg0 >> 12;
        int var7 = this.field2181 * arg0 >> 12;
        class61.method359(var4, var6, var7, var5, super.field6595, (byte) -127);
    }
}
