import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class178 {

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[F")
    public static float[] field2934 = new float[4];

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[I")
    public static int[] field2931 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lph;")
    public static class229 field2935 = class266.method1858(")4j", 0);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[Lph;")
    public static class229[] field2937 = new class229[200];

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "B")
    public static byte field2933;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lsi;")
    public static class66 field2929;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lsi;")
    public static class66 field2936;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[I")
    public static int[] field2939;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[[B")
    public static byte[][] field2930;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[[B")
    public static byte[][] field2932;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 8)
    public static void method1277(byte arg0) {
        field2934 = null;
        field2937 = null;
        field2936 = null;
        field2931 = null;
        field2935 = null;
        field2929 = null;
        if (arg0 != 97) {
            method1279(-70, (byte) -87);
        }
        field2930 = (byte[][]) null;
        field2939 = null;
        field2932 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)I", line = 37)
    public static final int method1278(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -18842) {
            method1277((byte) -78);
        }
        field2938++;
        return arg3 > arg1 ? arg3 : (arg1 > arg0 ? arg0 : arg1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method1279(int arg0, byte arg1) {
        field2940++;
        class208.field3428.method1418((byte) -17, arg0);
        if (arg1 != -10) {
            field2929 = (class66) null;
        }
        class70.field1112.method1418((byte) -17, arg0);
    }
}
