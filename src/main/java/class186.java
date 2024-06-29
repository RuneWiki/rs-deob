import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class186 extends class205 {

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    private int field3430 = 4096;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    private int field3441 = 4096;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    private int field3442 = 4096;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static volatile int field3433 = 0;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lvd;")
    public static class222 field3436 = class212.method1357("<col=ff7000>", 10731);

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Lvd;")
    public static class222 field3432 = class212.method1357("<col=ff0000>", 10731);

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "[I")
    public static int[] field3443 = new int[128];

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "Ljf;")
    public static class103 field3444;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "Lab;")
    public static class3 field3445;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "[Lva;")
    public static class219[] field3434;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lje;B)V")
    public static final void method1165(class102 arg0, byte arg1) {
        class27.field602 = arg0;
        ++field3435;
        if (arg1 != -114) {
            method1167(15, 73, -63);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field3444 = null;
        field3436 = null;
        field3432 = null;
        field3443 = null;
        field3434 = null;
        field3445 = null;
        int var1 = 43 % ((39 - arg0) / 59);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3440;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3442 = arg0.method675(2);
                }
            } else {
                this.field3430 = arg0.method675(2);
            }
        } else {
            this.field3441 = arg0.method675(2);
        }
        int var5 = 22 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            method1166((byte) -66);
        }
        ++field3439;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, arg0, -5920);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class118.field2245; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field3441 * var12 >> 12;
                    var10[var11] = this.field3430 * var13 >> 12;
                    var9[var11] = this.field3442 * var14 >> 12;
                } else {
                    var8[var11] = this.field3441;
                    var10[var11] = this.field3430;
                    var9[var11] = this.field3442;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
    public static final void method1167(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2310 = null;
        }
    }
}
