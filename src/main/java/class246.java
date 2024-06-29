import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class246 extends class326 {

    @OriginalMember(owner = "client!br", name = "O", descriptor = "Z")
    private boolean field3283 = true;

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    private int field3282 = 4096;

    @OriginalMember(owner = "client!br", name = "T", descriptor = "Lgd;")
    public static class206 field3288 = new class206("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!br", name = "X", descriptor = "Lmc;")
    public static class78 field3292 = new class78(62, 3);

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!br", name = "S", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!br", name = "U", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!br", name = "W", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!br", name = "V", descriptor = "Lcf;")
    public static class395 field3290;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "[[B")
    public static byte[][] field3284;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lwm;Lhp;III)V")
    public static final void method1379(class364 arg0, class197 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class143.field2058) {
            class491 var5 = class289.field3897[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6842 != null && var5.field6842.method17(7)) {
                arg1.method2(class230.field3020, 0, 0, arg0, true, var5.field6842, true);
            }
        }
        if (arg4 < class143.field2058) {
            class491 var6 = class289.field3897[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6842 != null && var6.field6842.method17(7)) {
                arg1.method2(0, class230.field3020, 0, arg0, true, var6.field6842, true);
            }
        }
        if (arg3 < class143.field2058 && arg4 < class91.field1344) {
            class491 var7 = class289.field3897[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6842 != null && var7.field6842.method17(7)) {
                arg1.method2(class230.field3020, class230.field3020, 0, arg0, true, var7.field6842, true);
            }
        }
        if (arg3 < class143.field2058 && arg4 > 0) {
            class491 var8 = class289.field3897[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6842 != null && var8.field6842.method17(7)) {
                arg1.method2(class230.field3020, -class230.field3020, 0, arg0, true, var8.field6842, true);
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(Z)I")
    public static final int method1380(boolean arg0) {
        if (!arg0) {
            method1379((class364) null, (class197) null, 101, 125, 9);
        }
        ++field3289;
        return 2;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3290 = null;
        field3284 = null;
        field3288 = null;
        if (arg0 != 0) {
            field3288 = null;
        }
        field3292 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3283 = arg1.method201((byte) -119) == 1;
            }
        } else {
            this.field3282 = arg1.method215((byte) 110);
        }
        ++field3285;
        if (arg2 > -3) {
            field3284 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        ++field3291;
        if (arg1 > -52) {
            field3292 = null;
        }
        int[][] var3 = super.field4343.method2356(arg0, 103);
        if (super.field4343.field5336) {
            int[] var4 = this.method1824(0, false, arg0 - 1 & class266.field3509);
            int[] var5 = this.method1824(0, false, arg0);
            int[] var6 = this.method1824(0, false, class266.field3509 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class181.field2495; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3282;
                int var12 = (var5[class459.field6226 & var10 + 1] + -var5[var10 + -1 & class459.field6226]) * this.field3282;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field3283) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }
}
