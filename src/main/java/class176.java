import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class176 {

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lbb;")
    private class14 field3335;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ldc;")
    private static class37 field3328 = class185.method1233((byte) 86, "purple:");

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ldc;")
    public static class37 field3330 = field3328;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Ldc;")
    public static class37 field3336 = field3328;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Ldc;")
    private static class37 field3339 = class185.method1233((byte) 86, " is already on your ignore list)3");

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ldc;")
    public static class37 field3331 = field3339;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lkd;")
    public static class112 field3337;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lwa;")
    public static class238 field3327;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
    public static int[] field3324;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
    public static int[] field3333;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJLia;)V")
    public final void method1179(int arg0, long arg1, class88 arg2) {
        field3326++;
        if (arg0 != 0) {
            field3339 = null;
        }
        this.field3335.method92(arg1, new class224(arg2), true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JB)Lia;")
    public final class88 method1180(long arg0, byte arg1) {
        class224 var4 = (class224) this.field3335.method87(-101, arg0);
        field3329++;
        if (var4 == null) {
            if (arg1 < 95) {
                field3324 = null;
            }
            return null;
        } else {
            return var4.field4145;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = class180.field3354[arg0][arg1][arg2];
        if (var4 != null) {
            class180.field3354[arg0][arg1][arg2].field293 = arg3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method1182(byte arg0) {
        class59.field1105 = -1;
        class239.field4389 = 0;
        field3332++;
        class97.field1701 = 0;
        class100.field1739 = -1;
        class223.field4136 = -1;
        if (arg0 != 41) {
            return;
        }
        class118.field2114 = false;
        class191.field3577 = 0;
        class59.field1096 = -1;
        class49.field970.field526 = 0;
        class12.field167.field526 = 0;
        class135.field2502 = 0;
        class8.field100 = 0;
        class77.field1359 = 0;
        for (int var1 = 0; var1 < class8.field107.length; var1++) {
            if (class8.field107[var1] != null) {
                class8.field107[var1].field3517 = -1;
            }
        }
        for (int var2 = 0; var2 < class70.field1262.length; var2++) {
            if (class70.field1262[var2] != null) {
                class70.field1262[var2].field3517 = -1;
            }
        }
        class211.method1405(32);
        class236.method1525(30, 27172);
        for (int var3 = 0; var3 < 100; var3++) {
            class211.field3948[var3] = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public final void method1183(byte arg0) {
        int var2 = 27 / ((31 - arg0) / 46);
        field3334++;
        this.field3335.method93(0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V")
    public final void method1184(int arg0, long arg1) {
        int var4 = -127 % ((arg0 + 21) / 60);
        this.field3335.method95(arg1, 2047);
        field3325++;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
    public class176(int arg0) {
        this.field3335 = new class14(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1185(int arg0) {
        if (arg0 != -1) {
            method1185(116);
        }
        field3324 = null;
        field3333 = null;
        field3327 = null;
        field3336 = null;
        field3328 = null;
        field3330 = null;
        field3331 = null;
        field3339 = null;
        field3337 = null;
    }
}
