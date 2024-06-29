import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class103 extends class279 {

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "Ltl;")
    private static class59 field1702 = class85.method639("Connection lost)3", 9588);

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "[I")
    public static int[] field1705 = new int[2];

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Ltl;")
    public static class59 field1700 = class85.method639("blinken1:", 9588);

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Ltl;")
    public static class59 field1704 = field1702;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Ltl;")
    public static class59 field1707 = class85.method639("<col=ffffff>", 9588);

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[[I", line = 11)
    public final int[][] method87(int arg0, int arg1) {
        field1701++;
        if (arg0 != -7523) {
            field1707 = (class59) null;
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[] var4 = this.method1960(-122, arg1, 2);
            int[][] var5 = this.method1956(0, arg1, (byte) -112);
            int[][] var6 = this.method1956(1, arg1, (byte) -112);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class56.field835; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var10[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var14[var16];
                    var8[var16] = var13[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var10[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 95)
    public static void method781(int arg0) {
        if (arg0 > -43) {
            return;
        }
        field1702 = null;
        field1705 = null;
        field1704 = null;
        field1700 = null;
        field1707 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 109)
    public static final void method782(int arg0, byte arg1) {
        if (arg1 == 111) {
            field1706++;
            class291.field4977.method1486(false, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILme;IZ)[Lgg;", line = 120)
    public static final class47[] method783(int arg0, class295 arg1, int arg2, boolean arg3) {
        if (arg3) {
            return (class47[]) null;
        } else {
            field1708++;
            return class33.method222(6, arg2, arg0, arg1) ? class316.method2175((byte) 5) : null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 141)
    public class103() {
        super(3, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)[I", line = 158)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            this.method44(false, 56);
        }
        field1709++;
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-124, arg1, 0);
            int[] var5 = this.method1960(-126, arg1, 1);
            int[] var6 = this.method1960(-123, arg1, 2);
            for (int var7 = 0; var7 < class56.field835; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILs;)V", line = 209)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field1703++;
        if (arg1 == 0) {
            this.field4789 = arg2.method1221(106) == 1;
        }
        if (arg0 >= -125) {
            this.method51(50, -77, (class170) null);
        }
    }
}
