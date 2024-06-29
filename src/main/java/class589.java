import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class589 implements class40 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Ldj;")
    private class362 field8013 = new class362(128);

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "[I")
    public int[] field8010 = new int[class116.field1481.field5966];

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
    private int[] field8017 = new int[class116.field1481.field5966];

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Ltf;")
    public static class312 field8014;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "[I")
    public static int[] field8022;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V", line = 4)
    public final void method3376(int arg0, int arg1, int arg2) {
        this.field8010[arg1] = arg0;
        if (arg2 != 384) {
            return;
        }
        field8024++;
        class603 var4 = (class603) this.field8013.method2121(arg2 ^ 0x1D6, (long) arg1);
        if (var4 == null) {
            class603 var5 = new class603(class349.method2069(true) + 500L);
            this.field8013.method2112(var5, (byte) 6, (long) arg1);
        } else {
            var4.field8142 = class349.method2069(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 29)
    public final void method3377(byte arg0) {
        int var2 = 0;
        int var3 = -4 % ((arg0 - 24) / 54);
        while (var2 < class116.field1481.field5966) {
            class170 var4 = class116.field1481.method2618(var2, -103);
            if (var4 != null && var4.field2045 == 0) {
                this.field8017[var2] = 0;
                this.field8010[var2] = 0;
            }
            var2++;
        }
        field8016++;
        this.field8013 = new class362(128);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIB)V", line = 56)
    public static final void method3378(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field8020++;
        int var6 = class155.method1103(class187.field2268, arg4, false, class461.field6480);
        int var7 = class155.method1103(class187.field2268, arg2, false, class461.field6480);
        int var8 = class155.method1103(class471.field6572, arg0, false, class223.field2604);
        if (arg5 != -54) {
            method3381(-62, -71, 75);
        }
        int var9 = class155.method1103(class471.field6572, arg3, false, class223.field2604);
        for (int var10 = var6; var10 <= var7; var10++) {
            class455.method2755(arg1, class4.field49[var10], (byte) 47, var9, var8);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V", line = 83)
    public static void method3379(boolean arg0) {
        field8014 = null;
        field8022 = null;
        if (!arg0) {
            field8022 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)V", line = 97)
    public final void method3380(int arg0, int arg1, int arg2) {
        field8021++;
        class270 var4 = class687.field9368.method4182(arg1, 81);
        int var5 = var4.field3188;
        if (arg2 != -1) {
            return;
        }
        int var6 = var4.field3187;
        int var7 = var4.field3183;
        int var8 = class470.field6558[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3384(true, var5, var9 & arg0 << var6 | ~var9 & this.field8017[var5]);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I", line = 129)
    public final int method337(int arg0, int arg1) {
        int var3 = -71 / ((77 - arg0) / 41);
        field8012++;
        return this.field8010[arg1];
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I", line = 139)
    public final int method336(int arg0, byte arg1) {
        field8015++;
        class270 var3 = class687.field9368.method4182(arg0, 115);
        int var4 = -24 % ((-arg1 - 11) / 50);
        int var5 = var3.field3188;
        int var6 = var3.field3187;
        int var7 = var3.field3183;
        int var8 = class470.field6558[var7 - var6];
        return this.field8010[var5] >> var6 & var8;
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(III)Z", line = 162)
    public static final boolean method3381(int arg0, int arg1, int arg2) {
        int var3 = -115 % ((-arg2 - 54) / 43);
        field8009++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)I", line = 172)
    public final int method3382(boolean arg0, boolean arg1) {
        field8011++;
        long var3 = class349.method2069(true);
        if (arg0) {
            this.field8010 = null;
        }
        for (class603 var5 = arg1 ? (class603) this.field8013.method2119(-61) : (class603) this.field8013.method2111((byte) 122); var5 != null; var5 = (class603) this.field8013.method2111((byte) -126)) {
            if ((var5.field8142 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field8142 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4809;
                    this.field8010[var6] = this.field8017[var6];
                    var5.method2219(13630);
                    return var6;
                }
                var5.method2219(13630);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(III)V", line = 212)
    public final void method3383(int arg0, int arg1, int arg2) {
        field8018++;
        class270 var4 = class687.field9368.method4182(arg1, 126);
        int var5 = var4.field3188;
        int var6 = var4.field3187;
        int var7 = var4.field3183;
        int var8 = class470.field6558[var7 - var6];
        if (arg0 < arg2 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3376(var9 & arg0 << var6 | ~var9 & this.field8010[var5], var5, 384);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)V", line = 248)
    public final void method3384(boolean arg0, int arg1, int arg2) {
        field8023++;
        this.field8017[arg1] = arg2;
        if (!arg0) {
            field8022 = null;
        }
        class603 var4 = (class603) this.field8013.method2121(73, (long) arg1);
        if (var4 == null) {
            class603 var5 = new class603(4611686018427387905L);
            this.field8013.method2112(var5, (byte) 6, (long) arg1);
        } else if (var4.field8142 != 4611686018427387905L) {
            var4.field8142 = class349.method2069(true) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLes;)Ljava/lang/String;", line = 278)
    public static final String method3385(byte arg0, class403 arg1) {
        if (arg0 >= -98) {
            method3378(23, -52, 49, -58, 63, (byte) -126);
        }
        field8019++;
        return class194.method1264(32767, true, arg1);
    }
}
