import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class20 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lsg;")
    public static class30 field362 = class167.method1221((byte) 33, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[J")
    public static long[] field363 = new long[100];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lsg;")
    public static class30 field367 = class167.method1221((byte) 33, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lsg;")
    public static class30 field376 = class167.method1221((byte) 33, "mapfunction");

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
    public static int[] field371 = new int[128];

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[I")
    public static int[] field374 = new int[100];

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field379 = -1;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[Lgj;")
    public static class192[] field373;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLsg;)I")
    public static final int method188(byte arg0, class30 arg1) {
        field368++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class117.field2307; var2++) {
            if (arg1.method285(class204.field3661[var2], 0)) {
                return var2;
            }
        }
        int var3 = 117 % ((arg0 + 74) / 42);
        return -1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILpk;IIIZ)V")
    public static final void method189(int arg0, class91 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field375++;
        if (arg1.field1836 == -1 && arg1.field1840 == null || arg5) {
            return;
        }
        int var6 = 0;
        if (arg0 > arg1.field1846) {
            var6 += arg0 - arg1.field1846;
        } else if (arg0 < arg1.field1834) {
            var6 += arg1.field1834 - arg0;
        }
        if (arg1.field1850 < arg4) {
            var6 += arg4 - arg1.field1850;
        } else if (arg1.field1828 > arg4) {
            var6 += arg1.field1828 - arg4;
        }
        if (arg1.field1845 == 0 || arg1.field1845 < var6 - 64 || class169.field3185 == 0 || arg1.field1844 != arg2) {
            if (arg1.field1829 != null) {
                class127.field2469.method186(arg1.field1829);
                arg1.field1829 = null;
            }
            if (arg1.field1848 != null) {
                class127.field2469.method186(arg1.field1848);
                arg1.field1848 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field1845 - var6) * class169.field3185 / arg1.field1845;
        if (arg1.field1829 != null) {
            arg1.field1829.method400(var7);
        } else if (arg1.field1836 >= 0) {
            class237 var8 = class237.method1687(class5.field71, arg1.field1836, 0);
            if (var8 != null) {
                class258 var9 = var8.method1686().method1792(class124.field2427);
                class38 var10 = class38.method381(var9, 100, var7);
                var10.method392(-1);
                class127.field2469.method177(var10);
                arg1.field1829 = var10;
            }
        }
        if (arg1.field1848 != null) {
            arg1.field1848.method400(var7);
            if (arg1.field1848.method1684(15284)) {
                return;
            }
            arg1.field1848 = null;
        } else if (arg1.field1840 != null && (arg1.field1839 -= arg3) <= 0) {
            int var11 = (int) ((double) arg1.field1840.length * Math.random());
            class237 var12 = class237.method1687(class5.field71, arg1.field1840[var11], 0);
            if (var12 != null) {
                class258 var13 = var12.method1686().method1792(class124.field2427);
                class38 var14 = class38.method381(var13, 100, var7);
                var14.method392(0);
                class127.field2469.method177(var14);
                arg1.field1848 = var14;
                arg1.field1839 = (int) (Math.random() * (double) (arg1.field1854 - arg1.field1852)) + arg1.field1852;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method190(int arg0) {
        if (arg0 >= -50) {
            field374 = null;
        }
        field363 = null;
        field367 = null;
        field371 = null;
        field362 = null;
        field374 = null;
        field373 = null;
        field376 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -1) {
            field377++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Z")
    public boolean method192() {
        field365++;
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Lni;")
    public class20 method193(int arg0, int arg1, int arg2) {
        field366++;
        return this;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        field364++;
        if (arg0 == 11) {
            class101.field2063.method1652(-8259);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public abstract int method22();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method195(int arg0, int arg1) {
        class242.field4331 = arg1;
        class32.field811 = -1;
        int var2 = 6 % ((-arg0 - 11) / 62);
        field378++;
        class41.field1014 = -1;
        class154.method1151((byte) -107);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lni;IIIZ)V")
    public void method196(class20 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field369++;
    }
}
