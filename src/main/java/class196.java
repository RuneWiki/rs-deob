import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class196 {

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lec;")
    public class236 field2981;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lfca;")
    public static class85 field2977;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLrg;)V", line = 10)
    public final void method1364(byte arg0, class645 arg1) {
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                int var4 = -73 % ((21 - arg0) / 40);
                field2982++;
                return;
            }
            this.method1370(arg1, -128, var3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lfg;", line = 31)
    public final synchronized class129 method1365(int arg0) {
        field2973++;
        class129 var2 = (class129) this.field2981.field3431.method803(117, (long) this.field2976);
        if (arg0 < 30) {
            this.method1364((byte) 53, null);
        }
        if (var2 != null) {
            return var2;
        }
        class129 var3 = class129.method919(this.field2981.field3426, this.field2976, 0);
        if (var3 != null) {
            this.field2981.field3431.method801(1, var3, (long) this.field2976);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1366(int arg0) {
        class93.field1336.method800(93);
        field2971++;
        class79.field1102.method800(118);
        class255.field3668.method800(100);
        class528.field7528.method800(100);
        if (arg0 < 29) {
            method1366(5);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIILjava/lang/String;)V", line = 68)
    public static final void method1367(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
        class322.method2042(arg1, arg0, arg3, arg4, null, -126, false);
        field2979++;
        if (arg2 != 0) {
            field2983 = 18;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 80)
    public static void method1368(byte arg0) {
        if (arg0 != -110) {
            method1366(46);
        }
        field2977 = null;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 96)
    public static final void method1369(int arg0) {
        field2975++;
        class596.field8442 = false;
        class459.method2805(79);
        if (arg0 != 0) {
            field2983 = 17;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lrg;II)V", line = 111)
    private final void method1370(class645 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2976 = arg0.method3712((byte) -3);
        } else if (arg2 == 2) {
            this.field2980 = arg0.method3745(-6314);
            this.field2972 = arg0.method3745(-6314);
        }
        if (arg1 < -126) {
            field2974++;
        }
    }
}
