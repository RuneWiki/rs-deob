import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class89 extends class386 {

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "I")
    private int field1245 = 4;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
    private int field1248 = 4;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!kba", name = "L", descriptor = "Lwo;")
    public static class690 field1251 = new class690(30, 0);

    @OriginalMember(owner = "client!kba", name = "M", descriptor = "Lmq;")
    public static class472 field1252 = new class472(4);

    @OriginalMember(owner = "client!kba", name = "N", descriptor = "[Z")
    public static boolean[] field1253 = new boolean[100];

    @OriginalMember(owner = "client!kba", name = "C", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!kba", name = "H", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!kba", name = "O", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!kba", name = "J", descriptor = "Ljn;")
    public static class668 field1249;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method645(int arg0, int arg1) {
        ++field1246;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            field1252 = null;
        }
        if (super.field5148.field2041) {
            int var4 = class599.field8643 / this.field1248;
            int var5 = class365.field4914 / this.field1245;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method2211(0, 0, arg1 + -104);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2211(class365.field4914 * var7 / var5, 0, arg1 + -128);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class599.field8643 > var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class599.field8643 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(Z)V", line = 74)
    public static void method701(boolean arg0) {
        field1251 = null;
        field1249 = null;
        field1252 = null;
        field1253 = null;
        if (arg0) {
            field1250 = 74;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V", line = 168)
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(III)Z", line = 98)
    public static final boolean method702(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1249 = null;
        }
        ++field1243;
        return class177.method1108(arg2, true, arg0) & class246.method1496((byte) 127, arg0, arg2);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)[I", line = 115)
    public final int[] method359(int arg0, int arg1) {
        int var3 = -28 / ((arg1 - 13) / 40);
        ++field1254;
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var5 = class599.field8643 / this.field1248;
            int var6 = class365.field4914 / this.field1245;
            int[] var7;
            if (var6 <= 0) {
                var7 = this.method2212((byte) 74, 0, 0);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method2212((byte) 116, class365.field4914 * var8 / var6, 0);
            }
            for (int var9 = 0; ~class599.field8643 < ~var9; ++var9) {
                if (var5 <= 0) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var7[class599.field8643 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBLun;)V", line = 176)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1245 = arg2.method2229(255);
            }
        } else {
            this.field1248 = arg2.method2229(255);
        }
        if (arg1 < 111) {
            this.method645(42, 38);
        }
        ++field1247;
    }
}
