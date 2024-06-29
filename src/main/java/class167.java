import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class167 implements Runnable {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Z")
    public boolean field2934 = true;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2931 = new Object();

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
    public int[] field2938 = new int[500];

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field2939 = 0;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[I")
    public int[] field2942 = new int[500];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
    public static boolean field2930 = false;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2927 = 127;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2937 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lqk;")
    public static class207 field2932 = class24.method212(255, ")4p=");

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ldd;")
    public static class132 field2933 = new class132();

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lqk;")
    public static class207 field2941 = class24.method212(255, "cross");

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lrg;")
    public static class226 field2940;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqk;I)I")
    public static final int method1204(class207 arg0, int arg1) {
        field2936++;
        if (class57.field1052 == null || arg0.method1450((byte) 117) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class57.field1052.field3301; var2++) {
            if (class57.field1052.field3312[var2].method1447((byte) 46, class280.field4930, class208.field3694).method1436(arg0, (byte) -96)) {
                return var2;
            }
        }
        if (arg1 != -1) {
            method1206(-49);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lpk;Lpk;ZBLll;)V")
    public static final void method1205(class99 arg0, class99 arg1, boolean arg2, byte arg3, class205 arg4) {
        class160.field2837 = arg1;
        if (arg3 != 33) {
            return;
        }
        field2935++;
        class179.field3222 = arg0;
        class55.field1024 = arg2;
        int var5 = class160.field2837.method720(19680) - 1;
        class227.field4178 = var5 * 256 + class160.field2837.method698(7, var5);
        class69.field1237 = new class207[] { null, null, null, null, class87.field1582 };
        class2.field35 = arg4;
        class25.field523 = new class207[] { null, null, class190.field3353, null, null };
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
    public final void run() {
        field2929++;
        while (this.field2934) {
            Object var1 = this.field2931;
            synchronized (this.field2931) {
                if (this.field2939 < 500) {
                    this.field2942[this.field2939] = class20.field322;
                    this.field2938[this.field2939] = class268.field4747;
                    this.field2939++;
                }
            }
            class153.method1098((byte) 76, 50L);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2933 = null;
        field2941 = null;
        field2940 = null;
        field2932 = null;
        if (arg0 != -17482) {
            field2940 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V")
    public static final void method1207(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= arg0) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class15.field238[var5][arg2] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class15.field238[var6][arg2] = arg4;
            }
        }
        if (arg1 != 47) {
            method1207(-98, (byte) -52, 45, 37, -88);
        }
        field2928++;
    }
}
