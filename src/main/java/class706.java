import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class706 implements class447 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field9883;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljha;")
    public class692 field9889;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public int field9892;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public int field9878;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field9882;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public boolean field9879;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field9886;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Ljg;")
    public class338 field9891;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field9895;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field9887;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field9881;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field9890 = -1;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lqaa;")
    public static class27 field9896 = new class27(28, 3);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lgs;")
    public static class43[] field9897;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lwc;B)V", line = 4)
    public static final void method3957(class66 arg0, byte arg1) {
        field9880++;
        if (arg0 == null) {
            return;
        }
        class288.field4066.method1526(arg0, 120);
        class409.field5682++;
        Object var2 = null;
        class241 var5;
        if (arg0.field1202 || "".equals(arg0.field1192)) {
            var5 = new class241(arg0.field1192);
            class173.field2513++;
        } else {
            long var3 = arg0.field1193;
            for (var5 = (class241) class580.field8189.method4203(true, var3); var5 != null && !var5.field3386.equals(arg0.field1192); var5 = (class241) class580.field8189.method4210(-126)) {
            }
            if (var5 == null) {
                var5 = (class241) class143.field2191.method3054((byte) -92, var3);
                if (var5 != null && !var5.field3386.equals(arg0.field1192)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class241(arg0.field1192);
                }
                class580.field8189.method4211(var5, (byte) 100, var3);
                class173.field2513++;
            }
        }
        int var6 = 30 % ((arg1 - 70) / 32);
        if (var5.method1618(arg0, (byte) 62)) {
            class218.method1515(var5, false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 62)
    public static final String method3958(byte arg0, int arg1) {
        field9893++;
        class236 var2 = (class236) class160.field2387.method4203(true, (long) arg1);
        if (var2 != null) {
            class173 var3 = var2.field3348.method3303(6643);
            if (var3 != null) {
                double var4 = var2.field3348.method3299(16177);
                if (var4 >= (double) var3.method1265(-86) && (double) var3.method1263(true) >= var4) {
                    return var3.method1264(-111);
                }
            }
        }
        return arg0 == 90 ? null : null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)I", line = 98)
    public static final int method3959(byte arg0, int arg1, int arg2) {
        field9894++;
        if (arg0 != 6) {
            return 47;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 126)
    public static void method3960(boolean arg0) {
        if (!arg0) {
            method3959((byte) -70, -61, -7);
        }
        field9897 = null;
        field9896 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Ljw;", line = 144)
    public final class551 method930(int arg0) {
        if (arg0 != 17503) {
            this.field9892 = -37;
        }
        field9888++;
        return class676.field9502;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILjg;Ljha;IIIIIIIZ)V", line = 155)
    public class706(int arg0, class338 arg1, class692 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field9883 = arg9;
        this.field9889 = arg2;
        this.field9892 = arg4;
        this.field9878 = arg3;
        this.field9882 = arg5;
        this.field9879 = arg10;
        this.field9886 = arg6;
        this.field9891 = arg1;
        this.field9895 = arg8;
        this.field9887 = arg7;
        this.field9881 = arg0;
    }
}
