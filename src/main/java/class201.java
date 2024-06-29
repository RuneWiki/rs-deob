import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class201 extends class196 {

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    private int field3354 = 204;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    private int field3355 = 1;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    private int field3358 = 1;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "[Z")
    public static boolean[] field3352 = new boolean[200];

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Ldf;")
    public static class51 field3357 = class46.method233("0(U", 100);

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "Lhc;")
    public static class212 field3353 = new class212(4096);

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "Ldf;")
    public static class51 field3363 = class46.method233(" )2>", 100);

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field3365 = 1;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILu;)Lg;")
    public static final class254 method1400(int arg0, int arg1, int arg2, class111 arg3) {
        ++field3351;
        if (arg1 != 10905) {
            return null;
        } else {
            return !class69.method480(arg0, 57, arg2, arg3) ? null : class170.method1185(0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static final void method1401(int arg0) {
        if (arg0 != 1) {
            method1401(2);
        }
        ++field3356;
        class244 var1 = class42.field664;
        synchronized (class42.field664) {
            class147.field2473 = class139.field2330;
            ++class84.field1402;
            class89.field1482 = class108.field1821;
            class90.field1504 = class259.field4518;
            class19.field269 = class211.field3508;
            class265.field4642 = class86.field1443;
            class221.field3834 = class239.field4156;
            class242.field4199 = class75.field1207;
            class211.field3508 = 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3362;
        if (arg1 != 10565) {
            this.field3358 = -116;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            for (int var4 = 0; var4 < class49.field767; ++var4) {
                int var5 = class211.field3510[var4];
                int var6 = class161.field2639[arg0];
                int var7 = this.field3358 * var5 >> 12;
                int var8 = var5 % (4096 / this.field3358) * this.field3358;
                int var9 = var6 % (4096 / this.field3355) * this.field3355;
                int var10 = this.field3355 * var6 >> 12;
                if (~var9 > ~this.field3354) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3354 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field3354) {
                    int var11;
                    for (var11 = var7 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3363 = null;
        field3357 = null;
        field3352 = null;
        if (arg0 != 0) {
            method1401(-98);
        }
        field3353 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class201() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3354 = arg1.method876(false);
                }
            } else {
                this.field3355 = arg1.method897(-126);
            }
        } else {
            this.field3358 = arg1.method897(123);
        }
        ++field3359;
        if (arg2 != 82) {
            field3363 = null;
        }
    }
}
