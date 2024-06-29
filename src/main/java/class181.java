import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class181 extends class169 {

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "Lkb;")
    public static class93 field3584 = class76.method390("Ung-Ultiger Benutzername", 0);

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static volatile int field3585 = 0;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "B")
    public static byte field3582;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "Lme;")
    public static class114 field3586;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        if (arg0 < 52) {
            method1181(-22);
        }
        if (class203.field3915 != null) {
            class194 var1 = class203.field3915;
            synchronized (class203.field3915) {
                class203.field3915 = null;
            }
        }
        ++field3581;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        class173.field3435 = new int[104];
        class182.field3603 = new int[104];
        if (arg0 != -206548700) {
            method1182(true, true, (class93) null);
        }
        class177.field3529 = new int[104];
        class195.field3784 = new byte[4][104][104];
        class108.field1955 = new int[104];
        class95.field1768 = new int[4][105][105];
        ++field3587;
        class68.field1266 = new byte[4][104][104];
        class169.field3368 = 99;
        class204.field3953 = new int[104];
        class70.field1287 = new byte[4][104][104];
        class35.field571 = new byte[4][104][104];
        class197.field3841 = new byte[4][105][105];
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZLkb;)V")
    public static final void method1182(boolean arg0, boolean arg1, class93 arg2) {
        ++field3583;
        class93 var3 = arg2.method487(10110);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class157.field3114; ++var6) {
            class166 var9 = class166.method1126(-2, var6);
            if ((!arg0 || var9.field3322) && var9.field3281.method487(10110).method489((byte) 81, var3) != -1) {
                if (~var5 <= -251) {
                    class158.field3150 = -1;
                    class137.field2654 = null;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class158.field3150 = var5;
        if (arg1) {
            class137.field2654 = var4;
            class203.field3933 = 0;
            class93[] var7 = new class93[class158.field3150];
            for (int var8 = 0; ~var8 > ~class158.field3150; ++var8) {
                var7[var8] = class166.method1126(-116, var4[var8]).field3281;
            }
            class85.method436((byte) 118, class137.field2654, var7);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = 14 / ((arg0 - 42) / 54);
        ++field3580;
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771 && this.method1139(-124)) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int var8 = arg1 % super.field3374 * super.field3374;
            for (int var9 = 0; class159.field3209 > var9; ++var9) {
                int var10 = super.field3359[var9 % super.field3372 + var8];
                var7[var9] = class91.method479(var10 << 4, 4080);
                var5[var9] = class91.method479(4080, var10 >> 4);
                var6[var9] = class91.method479(var10 >> 12, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field3584 = null;
        if (arg0 < 114) {
            method1180(65);
        }
        field3586 = null;
    }
}
