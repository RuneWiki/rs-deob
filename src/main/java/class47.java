import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class47 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
    public static boolean field786 = true;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
    public static int[] field787 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Ldm;")
    public static class182 field789 = new class182();

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field797 = "Loading - please wait.";

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lqd;")
    public static class173 field796 = new class173(64);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    public abstract int method203(int arg0, int arg1);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IC)Z")
    public static final boolean method334(int arg0, char arg1) {
        field791++;
        if (arg0 != 95) {
            field793 = -36;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_';
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
    public abstract void method213(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method335(boolean arg0) {
        field797 = null;
        field787 = null;
        field796 = null;
        field789 = null;
        if (arg0) {
            method335(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
    public static final int method336(int arg0, int arg1) {
        field792++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 != 20541) {
            field789 = null;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)[B")
    public abstract byte[] method202(int arg0, int arg1);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZ[Lag;I)V")
    public static final void method337(int arg0, int arg1, int arg2, boolean arg3, class211[] arg4, int arg5) {
        field794++;
        if (arg0 != 1000) {
            return;
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class211 var7 = arg4[var6];
            if (var7 != null && var7.field3395 == arg2) {
                class234.method1579(-92, var7, arg1, arg5, arg3);
                class64.method453(arg1, var7, 0, arg5);
                if (var7.field3392 > var7.field3410 - var7.field3430) {
                    var7.field3392 = var7.field3410 - var7.field3430;
                }
                if (var7.field3392 < 0) {
                    var7.field3392 = 0;
                }
                if (var7.field3369 > var7.field3414 - var7.field3394) {
                    var7.field3369 = var7.field3414 - var7.field3394;
                }
                if (var7.field3369 < 0) {
                    var7.field3369 = 0;
                }
                if (var7.field3385 == 0) {
                    class56.method384(arg0 ^ 0xFFFFFC79, var7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method338(int arg0) {
        class206.method1445();
        for (int var1 = 0; var1 < 4; var1++) {
            class131.field2065[var1].method305(true);
        }
        if (arg0 != -9762) {
            method335(false);
        }
        System.gc();
        field788++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Luk;")
    public abstract class213 method206(boolean arg0);
}
