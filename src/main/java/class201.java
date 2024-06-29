import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class201 extends class391 {

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    private int field2981;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(III)V")
    public final void method1256(int arg0, int arg1, int arg2) {
        ++field2975;
        int var4 = this.field2980 * arg2 >> 12;
        if (arg0 != 9329) {
            this.field2981 = -83;
        }
        int var5 = this.field2982 * arg2 >> 12;
        int var6 = this.field2981 * arg1 >> 12;
        int var7 = this.field2977 * arg1 >> 12;
        class259.method1743(super.field5404, arg0 + -9328, super.field5406, var7, var4, var5, var6);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
    public static final int method1398(byte arg0) {
        ++field2974;
        class336 var1 = class282.field4052;
        synchronized (class282.field4052) {
            int var2 = -26 / ((arg0 - -22) / 45);
            return class282.field4052.method2117((byte) 35);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
    public final void method1254(int arg0, int arg1, int arg2) {
        if (arg2 >= 120) {
            ++field2976;
            int var4 = this.field2980 * arg1 >> 12;
            int var5 = this.field2982 * arg1 >> 12;
            int var6 = this.field2981 * arg0 >> 12;
            int var7 = this.field2977 * arg0 >> 12;
            class61.method559(var5, var4, var6, var7, super.field5403, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public final void method1255(int arg0, int arg1, int arg2) {
        int var4 = 35 % ((-42 - arg2) / 37);
        ++field2983;
        int var5 = this.field2980 * arg0 >> 12;
        int var6 = this.field2982 * arg0 >> 12;
        int var7 = this.field2981 * arg1 >> 12;
        int var8 = this.field2977 * arg1 >> 12;
        class279.method1864(super.field5403, var6, super.field5406, 92, var8, var7, super.field5404, var5);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method1399(int arg0, int arg1) {
        class480.field6802 = -1;
        ++field2978;
        class182.field2752 = 100;
        if (arg0 < 11) {
            method1399(-105, 71);
        }
        class349.field4804 = 3;
        class221.field3193 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIII)V")
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2981 = arg1;
        this.field2980 = arg0;
        this.field2982 = arg2;
        this.field2977 = arg3;
    }
}
