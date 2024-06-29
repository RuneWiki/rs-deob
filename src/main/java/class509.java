import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class509 {

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "[I")
    public static int[] field7019 = new int[32];

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field7018;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field7019[var1] = var0 - 1;
            var0 += var0;
        }
        field7020 = 0;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILkr;)Ljava/lang/String;", line = 3)
    public static final String method2886(int arg0, class354 arg1) {
        field7018++;
        if (arg0 >= -5) {
            method2889(96);
        }
        return arg1.field4724 == null || arg1.field4724.length() <= 0 ? arg1.field4716 : arg1.field4716 + class371.field4911.method2141(class422.field5539, true) + arg1.field4724;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBIIII)Lit;", line = 21)
    public static final class513 method2887(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -19) {
            return null;
        }
        field7017++;
        long var7 = (long) arg5 * 76724863L ^ (long) arg6 * 475427L ^ (long) arg0 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 986053L ^ (long) arg1 * 32147369L;
        class513 var9 = (class513) class362.field4789.method2176(arg2 - 108, var7);
        if (var9 == null) {
            class513 var10 = class610.field8468.method1138(arg3, arg0, arg6, arg4, arg1, arg5);
            class362.field4789.method2174(var10, var7, (byte) 124);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZ)V", line = 42)
    public static final void method2888(int arg0, int arg1, boolean arg2) {
        class149.field2037 = arg0;
        class378.field5005 = 3;
        field7016++;
        class647.method3594(class450.field5948.field3772, class450.field5948.field3769, 40000);
        if (arg2) {
            class32.method195(false, 11703, "", "");
        } else {
            class513.method2902((byte) -70);
            class32.method195(false, 11703, class618.field8577, class351.field4667);
        }
        if (arg1 >= -48) {
            method2889(26);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V", line = 63)
    public static void method2889(int arg0) {
        field7019 = null;
        if (arg0 != 28102) {
            field7019 = null;
        }
    }
}
