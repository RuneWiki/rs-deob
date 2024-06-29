import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class491 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Ljr;")
    public static class112 field6800 = new class112(5);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Leq;")
    public static class213 field6801 = new class213(64);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Z")
    public static boolean field6805 = false;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Z")
    public static boolean field6806 = false;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Lin;")
    public static class91 field6803;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field6803 = null;
        field6801 = null;
        if (arg0 == 5125) {
            field6800 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILbaa;)I")
    public static final int method2898(int arg0, class523 arg1) {
        field6802++;
        if (class523.field7245 == arg1) {
            return 5120;
        } else if (class523.field7247 == arg1) {
            return 5122;
        } else if (class523.field7248 == arg1) {
            return 5124;
        } else if (class523.field7249 == arg1) {
            return 5121;
        } else if (class523.field7250 == arg1) {
            return 5123;
        } else if (class523.field7251 == arg1) {
            return 5125;
        } else if (class523.field7252 == arg1) {
            return 5131;
        } else if (class523.field7253 == arg1) {
            return 5126;
        } else {
            if (arg0 > -19) {
                method2899(-7, -90);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
    public static final void method2899(int arg0, int arg1) {
        class505.field7035 = 3;
        class723.field9806 = arg1;
        class699.field9460 = -1;
        class443.field6305 = arg0;
        field6804++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method2900(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class683.field9250 != class344.field4822) {
            int var6 = class465.field6517[arg1].method1853(arg2, arg3, (byte) -109);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class281 var8 = class465.field6517[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1853(arg2, arg3, (byte) 72);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1154(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1151(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
