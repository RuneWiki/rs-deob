import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class555 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    public int[] field7722;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[[F")
    public float[][] field7723;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    public int[] field7727;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
    public int[] field7721;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lkg;")
    public static class275 field7724 = new class275(66, 2);

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Lkg;")
    public static class275 field7729 = new class275(7, 12);

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "Lkg;")
    public static class275 field7730 = new class275(57, -1);

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field7731 = 0;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field7732 = 0;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lut;")
    public static class127 field7728;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V", line = 4)
    public static final void method3207(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class501.method2938(var3.field278);
        class501.method2938(var3.field283);
        if (var3.field278 != null) {
            var3.field278 = null;
        }
        if (var3.field283 != null) {
            var3.field283 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BZILjava/lang/String;)V", line = 22)
    public static final void method3208(byte arg0, boolean arg1, int arg2, String arg3) {
        field7726++;
        class655.method3681(0);
        class323.method1895((byte) -122);
        class545.method3145((byte) 9);
        class378.method2163(arg2, (byte) -40, arg1, arg3);
        class236.method1477(-1);
        class365.method2104(class386.field4930, 13);
        class422.method2348(class386.field4930, -126);
        class86.method710((byte) 51, class268.field3369, class386.field4930);
        class532.method3057(-18788);
        int var4 = 34 % ((arg0 - 17) / 44);
        class647.method3629((byte) 114, class537.field7454);
        class433.method2476(-99);
        class421.method2346(true);
        if (class27.field484 == 3) {
            class571.method3275(27461, 4);
        } else if (class27.field484 == 7) {
            class571.method3275(27461, 8);
        } else if (class27.field484 == 10) {
            class571.method3275(27461, 11);
        } else if (class27.field484 == 1 || class27.field484 == 2) {
            class641.method3606((byte) 103);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I", line = 63)
    public static final int method3209(int arg0) {
        field7725++;
        int var1 = 85 % ((-arg0 - 5) / 42);
        return class592.field8283++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 74)
    public static void method3210(int arg0) {
        field7724 = null;
        field7729 = null;
        int var1 = -73 % ((20 - arg0) / 38);
        field7728 = null;
        field7730 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([I[I[I[[F)V", line = 89)
    public class555(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field7722 = arg2;
        this.field7723 = arg3;
        this.field7727 = arg1;
        this.field7721 = arg0;
    }
}
