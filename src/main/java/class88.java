import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class88 extends class440 {

    @OriginalMember(owner = "client!qda", name = "P", descriptor = "I")
    private int field1483 = 32768;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
    public static int field1471 = 2;

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1480 = null;

    @OriginalMember(owner = "client!qda", name = "O", descriptor = "Z")
    public static boolean field1482 = false;

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!qda", name = "N", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "Lpu;")
    public static class522 field1473;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
    public static void method761(byte arg0) {
        if (arg0 > -40) {
            method762(109);
        }
        field1480 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "(I)Lvd;")
    public static final class36 method762(int arg0) {
        int var1 = -1 / ((arg0 - -25) / 53);
        ++field1472;
        try {
            return (class36) Class.forName("sg").newInstance();
        } catch (Throwable var2) {
            return new class74();
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field1481;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            this.field1483 = 57;
        }
        if (super.field6417.field9606) {
            int[] var4 = this.method2611(125, arg1, 1);
            int[] var5 = this.method2611(arg0 + 5710, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class549.field7715 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field1483 >> 12;
                int var12 = class453.field6514[var10] * var11 >> 12;
                int var13 = class493.field7016[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class420.field6112;
                int var15 = class651.field9116 & (var13 >> 12) + arg1;
                int[][] var16 = this.method2606(var15, 0, -1);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)V")
    public static final void method764(int arg0, boolean arg1) {
        if (class274.field4181 != null) {
            class274.field4181.method2234(false);
            class274.field4181 = null;
        }
        ++field1477;
        class676.field9555 = 0;
        class242.method1643(-19585);
        class184.method1233();
        for (int var2 = 0; var2 < 4; ++var2) {
            class423.field6155[var2].method3749(false);
        }
        class8.method44(false, (byte) -86);
        System.gc();
        class560.method3197(2, true);
        class392.field5800 = -1;
        class43.field701 = false;
        class504.method2899(1, true);
        class203.field2874 = 0;
        class109.field1672 = 0;
        class312.field4619 = 0;
        class48.field817 = 0;
        class3.field20 = 0;
        class360.field5169 = arg0;
        for (int var3 = 0; var3 < class601.field8496.length; ++var3) {
            class601.field8496[var3] = null;
        }
        class35.method416(-12909);
        for (int var4 = 0; var4 < 2048; ++var4) {
            class141.field2087[var4] = null;
        }
        class217.field3042 = 0;
        class189.field2723.method1409((byte) 119);
        class428.field6288 = 0;
        class22.field296.method1409((byte) 119);
        class112.method872((byte) -75);
        class467.field6717 = 0;
        class61.field1163.method1732(false);
        class648.method3597(-23888);
        class488.method2834((byte) 74);
        class542.field7610 = 0L;
        class303.field4517 = null;
        if (!arg1) {
            class112.method868(3, (byte) 49);
            try {
                class556.method3150(-21295, class421.field6129, "loggedout");
            } catch (Throwable var5) {
            }
        } else {
            class112.method868(12, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field1470;
        if (arg0 != 5) {
            this.method229((byte) -117, 75);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field6424 = arg1.method3826(false) == 1;
            }
        } else {
            this.field1483 = arg1.method3847((byte) 118) << 4;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field1475;
        if (arg0 == -9) {
            class31.method354((byte) 26);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
    public static final void method765(int arg0, byte arg1) {
        class674.field9521 = arg0;
        if (arg1 != 82) {
            field1471 = 56;
        }
        ++field1476;
        class138.field2010.method2285((byte) -90);
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class88() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field1479;
        int var3 = -104 / ((-56 - arg0) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(-59, arg1, 1);
            int[] var6 = this.method2611(-9, arg1, 2);
            for (int var7 = 0; ~class549.field7715 < ~var7; ++var7) {
                int var8 = 255 & var5[var7] >> 4;
                int var9 = var6[var7] * this.field1483 >> 12;
                int var10 = class453.field6514[var8] * var9 >> 12;
                int var11 = class493.field7016[var8] * var9 >> 12;
                int var12 = (var10 >> 12) + var7 & class420.field6112;
                int var13 = class651.field9116 & (var11 >> 12) + arg1;
                int[] var14 = this.method2611(-9, var13, 0);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }
}
