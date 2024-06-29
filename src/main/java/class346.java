import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class346 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field5485 = -1;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "[I")
    public static int[] field5487 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5492 = 0;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lnk;")
    public static class16 field5486;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 7)
    public static void method2400(int arg0) {
        field5487 = null;
        field5486 = null;
        if (arg0 != -8606) {
            field5486 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lqb;Loe;I)Lwb;", line = 24)
    public static final class175 method2401(class117 arg0, class146 arg1, int arg2) {
        if (arg2 != 0) {
            method2404(119);
        }
        field5490++;
        long var3 = ((long) arg1.field2320 << 56) + ((long) arg1.field2315 << 32) + (long) ((arg1.field2323 + 1 << 16) - -arg1.field2316);
        class175 var5 = (class175) arg0.method770(var3, 59);
        if (var5 == null) {
            var5 = new class175(arg1.field2323, (float) arg1.field2316, true, false, arg1.field2315);
            arg0.method764(arg2 + 24369, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJ)V", line = 45)
    public static final void method2402(int arg0, long arg1) {
        field5489++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class274.field4339; var3++) {
            if (class337.field5382[var3] == arg1) {
                class274.field4339--;
                class294.field4633++;
                for (int var4 = var3; var4 < class274.field4339; var4++) {
                    class337.field5382[var4] = class337.field5382[var4 + 1];
                    class172.field2615[var4] = class172.field2615[var4 + 1];
                    class25.field296[var4] = class25.field296[var4 + 1];
                }
                class49.field566 = class181.field2734;
                class328.field5282.method304(28, 19830);
                class328.field5282.method1039(arg1, (byte) -124);
                break;
            }
        }
        if (arg0 != 1) {
            field5486 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 94)
    public static final void method2403(int arg0) {
        class296 var1 = class101.field1354;
        synchronized (class101.field1354) {
            class312.field4891 = class360.field5706;
            class304.field4737++;
            class197.field3009 = class88.field1163;
            class128.field1873 = class44.field493;
            class251.field3982 = class337.field5378;
            class301.field4694 = class170.field2598;
            class19.field223 = class169.field2587;
            class93.field1247 = class145.field2310;
            class337.field5378 = 0;
        }
        if (arg0 != 20421) {
            method2400(43);
        }
        field5491++;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 123)
    public static final void method2404(int arg0) {
        field5484++;
        if (arg0 != 2) {
            field5487 = (int[]) null;
        }
        class71.field883.method378(0);
    }
}
