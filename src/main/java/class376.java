import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class376 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljt;")
    private class106 field5690 = new class106(64);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lvd;")
    private class39 field5696;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[[I")
    public static int[][] field5695 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field5697 = 1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Lhfa;")
    public static class312 field5694;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 4)
    public final void method2432(int arg0) {
        field5693++;
        if (arg0 != -30932) {
            field5694 = null;
        }
        class106 var2 = this.field5690;
        synchronized (this.field5690) {
            this.field5690.method809(true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lbd;", line = 19)
    public final class62 method2433(int arg0, int arg1) {
        field5692++;
        class106 var3 = this.field5690;
        class62 var4;
        synchronized (this.field5690) {
            var4 = (class62) this.field5690.method803(115, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field5696;
        byte[] var6;
        synchronized (this.field5696) {
            var6 = this.field5696.method211(true, 35, arg0);
        }
        class62 var7 = new class62();
        if (var6 != null) {
            var7.method561(new class645(var6), 0);
        }
        var7.method562(15);
        class106 var8 = this.field5690;
        synchronized (this.field5690) {
            this.field5690.method801(1, var7, (long) arg0);
            if (arg1 != -16414) {
                this.field5690 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 55)
    public static void method2434(int arg0) {
        int var1 = -93 / ((7 - arg0) / 54);
        field5695 = null;
        field5694 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[BZLjda;)V", line = 67)
    public static final void method2435(byte[][] arg0, boolean arg1, class227 arg2) {
        field5691++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field133; var4++) {
            class290.method1858((byte) 59);
            for (int var9 = 0; var9 < class194.field2946 >> 3; var9++) {
                for (int var10 = 0; var10 < class255.field3656 >> 3; var10++) {
                    int var11 = class504.field7161[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x387FDB2) >> 24;
                        if (!arg2.field122 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = (var11 & 0xFFEB18) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class434.field6462.length; var17++) {
                                if (class434.field6462[var17] == var16 && arg0[var17] != null) {
                                    class645 var18 = new class645(arg0[var17]);
                                    arg2.method62((byte) 79, class326.field4655, var18, var4, var12, var10 * 8, var15, var13, var14, var9 * 8);
                                    arg2.method1531(var10 * 8, var13, var15, var18, var14, var9 * 8, var12, var3[0] == -1 ? var3 : null, 20235, var4, class736.field10316);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1) {
            field5694 = null;
        }
        for (int var5 = 0; var5 < arg2.field133; var5++) {
            class290.method1858((byte) 123);
            for (int var6 = 0; var6 < (class194.field2946 >> 3); var6++) {
                for (int var7 = 0; var7 < class255.field3656 >> 3; var7++) {
                    int var8 = class504.field7161[var5][var6][var7];
                    if (var8 == -1) {
                        arg2.method64(true, var5, var6 * 8, 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class704.field9842 = class684.field9464.method1749(class288.field4108, var3[1], var3[3], var3[0], 16, var3[2]);
            class291.field4170 = var3[4];
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 185)
    public final void method2436(int arg0, int arg1) {
        field5688++;
        class106 var3 = this.field5690;
        synchronized (this.field5690) {
            this.field5690.method807(arg1, -1);
            if (arg0 < 50) {
                this.method2432(-10);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 202)
    public final void method2437(int arg0) {
        field5689++;
        if (arg0 > -73) {
            field5694 = null;
        }
        class106 var2 = this.field5690;
        synchronized (this.field5690) {
            this.field5690.method800(125);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 226)
    public class376(class464 arg0, int arg1, class39 arg2) {
        this.field5696 = arg2;
        if (this.field5696 != null) {
            this.field5696.method229(35, 0);
        }
    }
}
