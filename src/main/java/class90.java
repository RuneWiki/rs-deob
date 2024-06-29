import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class90 extends class8 {

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1491 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Laf;")
    public static class68 field1484 = new class68(64);

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static volatile int field1493 = 0;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 <= 62) {
            field1487 = -61;
        }
        ++field1489;
        if (arg2 == 0) {
            super.field115 = ~arg1.method1517((byte) -96) == -2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1492;
        if (arg0 != 3) {
            method679((byte) 59);
        }
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, -53, 0);
            int[] var5 = this.method61(arg1, 9, 1);
            int[] var6 = this.method61(arg1, 1, 2);
            for (int var7 = 0; class231.field3798 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class90() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 63 / ((arg1 - -48) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        ++field1486;
        if (super.field93.field470) {
            int[] var5 = this.method61(arg0, -120, 2);
            int[][] var6 = this.method60(arg0, 0, 109);
            int[][] var7 = this.method60(arg0, 1, 117);
            int[] var8 = var4[1];
            int[] var9 = var6[2];
            int[] var10 = var6[0];
            int[] var11 = var4[0];
            int[] var12 = var6[1];
            int[] var13 = var4[2];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class231.field3798; ++var17) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var11[var17] = var10[var17];
                    var8[var17] = var12[var17];
                    var13[var17] = var9[var17];
                } else if (~var18 == -1) {
                    var11[var17] = var15[var17];
                    var8[var17] = var14[var17];
                    var13[var17] = var16[var17];
                } else {
                    int var19 = -var18 + 4096;
                    var11[var17] = var10[var17] * var18 + var15[var17] * var19 >> 12;
                    var8[var17] = var12[var17] * var18 + var14[var17] * var19 >> 12;
                    var13[var17] = var9[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1491 = null;
        int var1 = -52 % ((arg0 - -76) / 42);
        field1484 = null;
    }
}
