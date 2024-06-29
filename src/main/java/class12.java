import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 extends class242 {

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    private int field246 = 4096;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "Z")
    private boolean field253 = true;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lp;")
    public static class280 field241 = class18.method140((byte) -121, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public static int field249 = 100;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static volatile int field242 = -1;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "Lp;")
    public static class280 field247 = class18.method140((byte) -120, "Benutzen");

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field254 = -1;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "Z")
    public static boolean field252 = true;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "Lp;")
    public static class280 field255 = class18.method140((byte) -118, ":trade:");

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "Lde;")
    public static class108 field251;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "[Lde;")
    public static class108[] field244;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "[Leg;")
    public static class223[] field245;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field248;
        if (!arg0) {
            method108(86);
        }
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[] var4 = this.method1647(0, class29.field540 & arg1 + -1, 48);
            int[] var5 = this.method1647(0, arg1, 48);
            int[] var6 = this.method1647(0, class29.field540 & arg1 + 1, 48);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class264.field4654 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field246;
                int var12 = (var5[var10 + 1 & class230.field3968] + -var5[var10 - 1 & class230.field3968]) * this.field246;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field253) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)V")
    public static void method108(int arg0) {
        field251 = null;
        field244 = null;
        field245 = null;
        field247 = null;
        field241 = null;
        field255 = null;
        int var1 = 2 % ((arg0 - -24) / 35);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field253 = arg2.method189((byte) -103) == 1;
            }
        } else {
            this.field246 = arg2.method193((byte) 77);
        }
        if (arg0 >= -119) {
            field245 = null;
        }
        ++field243;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, false);
    }
}
