import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class197 extends class320 {

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Z")
    public static boolean field2903 = false;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lrn;")
    public static class174 field2896 = new class174(6, 8);

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Lpi;")
    public static class342 field2912 = new class342(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "[Lbk;")
    public static class253[] field2914 = new class253[30];

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "Z")
    public static boolean field2917 = true;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field2913;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method1368(int arg0, int arg1, byte arg2) {
        class28.method321(class489.field7244, -5001);
        field2906++;
        int var3 = -99 / ((arg2 - 9) / 47);
        class297.field4216++;
        class410.field6141.method1095(117, arg0);
        class410.field6141.method1088(arg1, -268435456);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III[I)V", line = 21)
    public final void method1369(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = arg0 - (this.field2902 - this.field2900);
        arg3[0] = 0;
        field2908++;
        if (arg1 != -1613) {
            this.field2904 = -20;
        }
        arg3[2] = this.field2904 + arg2 - this.field2915;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 36)
    public static void method1370(byte arg0) {
        field2912 = null;
        field2914 = null;
        if (arg0 < -49) {
            field2913 = null;
            field2896 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII)Z", line = 56)
    public final boolean method1371(int arg0, int arg1, int arg2, int arg3) {
        field2910++;
        if (arg3 == 2) {
            return this.field2897 == arg0 && arg2 >= this.field2902 && arg2 <= this.field2901 && this.field2915 <= arg1 && arg1 <= this.field2907;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZI)Z", line = 74)
    public final boolean method1372(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1369(74, -68, 22, null);
        }
        field2898++;
        return arg2 >= this.field2900 && this.field2916 >= arg2 && arg0 >= this.field2904 && this.field2905 >= arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II[IZ)V", line = 97)
    public final void method1373(int arg0, int arg1, int[] arg2, boolean arg3) {
        field2899++;
        arg2[2] = arg0 - (this.field2904 - this.field2915);
        if (arg3) {
            this.method1369(-62, 68, -2, null);
        }
        arg2[1] = arg1 + this.field2902 - this.field2900;
        arg2[0] = this.field2897;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(IIB)Z", line = 111)
    public final boolean method1374(int arg0, int arg1, byte arg2) {
        if (arg2 == -77) {
            field2909++;
            return arg1 >= this.field2902 && arg1 <= this.field2901 && arg0 >= this.field2915 && this.field2907 >= arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIIIII)V", line = 137)
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2905 = arg8;
        this.field2916 = arg7;
        this.field2901 = arg3;
        this.field2897 = arg0;
        this.field2907 = arg4;
        this.field2904 = arg6;
        this.field2900 = arg5;
        this.field2915 = arg2;
        this.field2902 = arg1;
    }
}
