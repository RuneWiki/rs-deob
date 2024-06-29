import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class142 extends class17 {

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    private int field2498 = 2048;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    private int field2500 = 1024;

    @OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
    private int field2507 = 3072;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "Lsf;")
    public static class108 field2495 = class140.method973(255, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "Lsf;")
    public static class108 field2499 = class140.method973(255, "<col=ff3000>");

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "[I")
    public static int[] field2504 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "[Lrg;")
    public static class96[] field2505 = new class96[28];

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "Lsf;")
    public static class108 field2497 = class140.method973(255, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!uj", name = "nb", descriptor = "[Lsf;")
    public static class108[] field2508;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[[I", line = 5)
    public final int[][] method122(boolean arg0, int arg1) {
        field2503++;
        int[][] var3 = this.field224.method2081(arg1, -111);
        if (arg0) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                var7[var11] = (var5[var11] * this.field2498 >> 12) + this.field2500;
                var9[var11] = (var6[var11] * this.field2498 >> 12) + this.field2500;
                var10[var11] = (var8[var11] * this.field2498 >> 12) + this.field2500;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILsf;IIJI)V", line = 57)
    public static final void method982(byte arg0, int arg1, class108 arg2, int arg3, int arg4, long arg5, int arg6) {
        class249 var8 = new class249(128);
        if (arg0 != -14) {
            return;
        }
        field2506++;
        var8.method1759(-32768, 10);
        var8.method1724(false, (int) (Math.random() * 99999.0D));
        var8.method1724(false, 524);
        var8.method1735((byte) -122, arg5);
        var8.method1741((int) (Math.random() * 9.9999999E7D), -1580277072);
        var8.method1708(arg2, 7733);
        var8.method1741((int) (Math.random() * 9.9999999E7D), -1580277072);
        var8.method1724(false, class247.field4269);
        var8.method1759(-32768, arg3);
        var8.method1759(-32768, arg6);
        var8.method1741((int) (Math.random() * 9.9999999E7D), -1580277072);
        var8.method1724(false, arg1);
        var8.method1724(false, arg4);
        var8.method1741((int) (Math.random() * 9.9999999E7D), arg0 - 1580277058);
        var8.method1730(class184.field3379, -13560, class234.field4133);
        class256.field4471.field4314 = 0;
        class256.field4471.method1759(-32768, 5);
        class256.field4471.method1759(-32768, var8.field4314);
        class256.field4471.method1732(3, var8.field4338, 0, var8.field4314);
        class287.field5022 = 1;
        class1.field26 = 0;
        class15.field196 = -3;
        class98.field1603 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(II)[I", line = 93)
    public final int[] method120(int arg0, int arg1) {
        field2502++;
        int[] var3 = this.field217.method1698(-3, arg1);
        if (arg0 > -95) {
            field2508 = (class108[]) null;
        }
        if (this.field217.field4295) {
            int[] var4 = this.method124(82, 0, arg1);
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                var3[var5] = this.field2500 + (var4[var5] * this.field2498 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLrm;I)V", line = 131)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            method983(false);
        }
        if (arg2 == 0) {
            this.field2500 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field2507 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field225 = arg1.method1731(true) == 1;
        }
        field2496++;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 195)
    public class142() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V", line = 183)
    public final void method116(boolean arg0) {
        this.field2498 = this.field2507 - this.field2500;
        if (!arg0) {
            this.method116(true);
        }
        field2501++;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(Z)V", line = 227)
    public static void method983(boolean arg0) {
        field2508 = null;
        field2499 = null;
        field2495 = null;
        field2497 = null;
        field2504 = null;
        if (!arg0) {
            field2495 = (class108) null;
        }
        field2505 = null;
    }
}
