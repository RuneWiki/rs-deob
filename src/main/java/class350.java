import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class350 extends class386 {

    @OriginalMember(owner = "client!es", name = "J", descriptor = "Liv;")
    public static class82 field4677 = new class82(6, 7);

    @OriginalMember(owner = "client!es", name = "L", descriptor = "Lhu;")
    public static class115 field4679 = new class115("", 10);

    @OriginalMember(owner = "client!es", name = "I", descriptor = "F")
    public static float field4676;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "[Lcp;")
    private class673[] field4675;

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
    public class350() {
        super(0, true);
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
    public static void method1992(int arg0) {
        field4677 = null;
        if (arg0 > 78) {
            field4679 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([[II)V")
    private final void method1993(int[][] arg0, int arg1) {
        ++field4673;
        int var3 = class599.field8643;
        if (arg1 > 79) {
            int var4 = class365.field4914;
            class267.method1618(arg0, true);
            class556.method3250(class206.field2474, class276.field3782, 0, (byte) 46, 0);
            if (this.field4675 != null) {
                for (int var5 = 0; this.field4675.length > var5; ++var5) {
                    class673 var6 = this.field4675[var5];
                    int var7 = var6.field9670;
                    int var8 = var6.field9672;
                    if (~var7 <= -1) {
                        if (~var8 <= -1) {
                            var6.method694(var4, var3, -3);
                        } else {
                            var6.method695(var3, var4, (byte) 48);
                        }
                    } else if (~var8 <= -1) {
                        var6.method693(var3, var4, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field4674;
        int[][] var3 = super.field5148.method1054(arg0, arg1 + 16254);
        if (super.field5148.field2041) {
            int var4 = class599.field8643;
            int var5 = class365.field4914;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5148.method1052(-124);
            this.method1993(var6, 89);
            for (int var8 = 0; var8 < class365.field4914; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class599.field8643; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class435.method2605(var15 << 4, 4080);
                    var12[var14] = class435.method2605(65280, var15) >> 4;
                    var11[var14] = class435.method2605(var15, 16711680) >> 12;
                }
            }
        }
        return arg1 != 3 ? null : var3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg0 == 0) {
            this.field4675 = new class673[arg2.method2229(255)];
            for (int var4 = 0; var4 < this.field4675.length; ++var4) {
                int var5 = arg2.method2229(255);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4675[var4] = class262.method1594(arg2, 0);
                            }
                        } else {
                            this.field4675[var4] = class518.method3066((byte) -30, arg2);
                        }
                    } else {
                        this.field4675[var4] = class290.method1726(arg2, 200);
                    }
                } else {
                    this.field4675[var4] = class163.method1029((byte) -121, arg2);
                }
            }
        } else if (~arg0 == -2) {
            super.field5145 = arg2.method2229(255) == 1;
        }
        if (arg1 <= 111) {
            this.method359(-2, -14);
        }
        ++field4672;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field4678;
        int[] var3 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            this.method1993(super.field5140.method1563(-2), 111);
        }
        int var4 = 104 % ((13 - arg1) / 40);
        return var3;
    }
}
