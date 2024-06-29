import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class166 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
    public static int[][] field2762 = new int[5][5000];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIILqm;)V", line = 16)
    public static final void method1217(byte arg0, int arg1, int arg2, class334 arg3) {
        field2761++;
        if (arg0 != 125) {
            field2762 = (int[][]) ((int[][]) null);
        }
        if (arg3.field4268 == arg1 && arg1 != -1) {
            class202 var4 = class325.method2274(arg1, -108);
            int var5 = var4.field3291;
            if (var5 == 1) {
                arg3.field4265 = 0;
                arg3.field4237 = 1;
                arg3.field4201 = 0;
                arg3.field4190 = arg2;
                arg3.field4250 = 0;
                class190.method1411(31, class191.field3129 == arg3, var4, arg3.field4264, arg3.field4265, arg3.field4255);
            }
            if (var5 == 2) {
                arg3.field4250 = 0;
            }
        } else if (arg1 == -1 || arg3.field4268 == -1 || class325.method2274(arg1, -84).field3279 >= class325.method2274(arg3.field4268, -99).field3279) {
            arg3.field4201 = 0;
            arg3.field4279 = arg3.field4251;
            arg3.field4237 = 1;
            arg3.field4190 = arg2;
            arg3.field4265 = 0;
            arg3.field4268 = arg1;
            arg3.field4250 = 0;
            if (arg3.field4268 != -1) {
                class190.method1411(31, class191.field3129 == arg3, class325.method2274(arg3.field4268, -128), arg3.field4264, arg3.field4265, arg3.field4255);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 68)
    public static void method1218(int arg0) {
        if (arg0 != -3) {
            field2762 = (int[][]) ((int[][]) null);
        }
        field2762 = (int[][]) null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)[Lrg;", line = 83)
    public static final class326[] method1219(int arg0) {
        int var1 = 24 % ((26 - arg0) / 63);
        field2759++;
        class326[] var2 = new class326[class48.field680];
        for (int var3 = 0; var3 < class48.field680; var3++) {
            var2[var3] = new class326(class303.field4757, class243.field3832, class270.field4364[var3], class51.field732[var3], class102.field1489[var3], class184.field3046[var3], class278.field4481[var3], class205.field3370);
        }
        class106.method727(true);
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 105)
    public static final void method1220(boolean arg0) {
        field2758++;
        if (arg0) {
            field2762 = (int[][]) ((int[][]) null);
        }
        if (class43.field543 > class122.field1920) {
            class122.field1920 = (float) ((double) class122.field1920 / 30.0D + (double) class122.field1920);
            if (class43.field543 < class122.field1920) {
                class122.field1920 = class43.field543;
            }
            class46.method295(-1);
        } else if (class122.field1920 > class43.field543) {
            class122.field1920 = (float) ((double) class122.field1920 - (double) class122.field1920 / 30.0D);
            if (class43.field543 > class122.field1920) {
                class122.field1920 = class43.field543;
            }
            class46.method295(-1);
        }
        if (class88.field1218 == -1 || class50.field707 == -1) {
            return;
        }
        int var1 = class88.field1218 - class139.field2195;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        int var2 = class50.field707 - class91.field1254;
        class139.field2195 += var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class50.field707 = -1;
            class88.field1218 = -1;
        }
        class91.field1254 += var2;
        class46.method295(-1);
    }
}
