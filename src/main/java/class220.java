import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class220 extends class362 {

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    private int field3221 = 32768;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "Lpja;")
    public static class43 field3227 = new class43(260);

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "Lbo;")
    public static class761 field3231 = new class761();

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "F")
    public static float field3233;

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "[[[I")
    public static int[][][] field3229;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field3224;
        int[] var3 = super.field4927.method808(-124, arg1);
        if (arg0 != -2026769311) {
            field3234 = 74;
        }
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(1, arg1, -84);
            int[] var5 = this.method2221(2, arg1, 99);
            for (int var6 = 0; class769.field10597 > var6; ++var6) {
                int var7 = (4092 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field3221 >> 12;
                int var9 = class551.field7540[var7] * var8 >> 12;
                int var10 = class365.field4956[var7] * var8 >> 12;
                int var11 = class522.field7083 & var6 - -(var9 >> 12);
                int var12 = arg1 - -(var10 >> 12) & class606.field8463;
                int[] var13 = this.method2221(0, var12, -96);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
    public class220() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1513(String arg0, int arg1) {
        ++field3225;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; ~var4 > ~var2; ++var4) {
            var3 = (var3 << 5) + -var3 + arg0.charAt(var4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3231 = null;
        if (arg0 >= -80) {
            field3223 = 104;
        }
        field3229 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4929 = arg0.method793((byte) 5) == 1;
            }
        } else {
            this.field3221 = arg0.method763(-36) << 4;
        }
        if (arg2 != -1) {
            this.method156(-8, -54);
        }
        ++field3222;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != -996226836) {
            this.method160(50);
        }
        class713.method3968(arg0 + 996226836);
        ++field3232;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method1515(String arg0, boolean arg1, char arg2) {
        ++field3228;
        if (arg1) {
            field3229 = null;
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            if (~arg2 == ~arg0.charAt(var5)) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field3226;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            field3233 = -2.3317063F;
        }
        if (super.field4938.field7848) {
            int[] var4 = this.method2221(1, arg0, 67);
            int[] var5 = this.method2221(2, arg0, -87);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class769.field10597 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1046027) >> 12;
                int var11 = var5[var9] * this.field3221 >> 12;
                int var12 = class551.field7540[var10] * var11 >> 12;
                int var13 = class365.field4956[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class522.field7083;
                int var15 = class606.field8463 & (var13 >> 12) + arg0;
                int[][] var16 = this.method2222(0, var15, 28008);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
