import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class19 extends class128 {

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "Z")
    private boolean field251 = true;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    private int field245 = 4096;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "Ldh;")
    public static class179 field248 = new class179(2);

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "[I")
    public static int[] field254 = new int[14];

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field252 = "rating: ";

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Lgk;")
    public static class8 field255;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "Z")
    public static boolean field253;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            this.method102(120, 66);
        }
        int[][] var3 = this.field1755.method875(arg1 ^ 0x13AB, arg0);
        field249++;
        if (this.field1755.field1815) {
            int[] var4 = this.method851((byte) -96, 0, class237.field3486 & arg0 - 1);
            int[] var5 = this.method851((byte) -119, 0, arg0);
            int[] var6 = this.method851((byte) -64, 0, arg0 + 1 & class237.field3486);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class10.field141; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field245;
                int var12 = (var5[class244.field3664 & var10 + 1] - var5[var10 - 1 & class244.field3664]) * this.field245;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field251) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V", line = 88)
    public static void method119(boolean arg0) {
        field255 = null;
        field248 = null;
        field254 = null;
        if (!arg0) {
            method120(92, 38, -99);
        }
        field252 = null;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)I", line = 102)
    public static final int method120(int arg0, int arg1, int arg2) {
        field243++;
        class286 var3 = (class286) class229.field3337.method1537((long) arg2, -22708);
        if (var3 == null) {
            return 0;
        } else if (~arg0 == arg1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4502.length; var5++) {
                if (var3.field4498[var5] == arg0) {
                    var4 += var3.field4502[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 140)
    public class19() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lp;II)V", line = 151)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            return;
        }
        if (arg1 == 0) {
            this.field245 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field251 = arg0.method661(-1) == 1;
        }
        field247++;
    }
}
