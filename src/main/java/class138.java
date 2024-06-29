import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class138 extends class43 {

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    private int field2580 = 32768;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Lbg;")
    public static class19 field2584 = new class19();

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "Lmb;")
    public static class132 field2592 = class166.method1092("Hierhin gehen", 121);

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "[Lef;")
    public static class51[] field2594 = new class51[50];

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "[I")
    public static int[] field2590 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lmb;")
    public static class132 field2589 = null;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lmb;")
    public static class132 field2593 = class166.method1092("; Max)2Age=", 114);

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "I")
    public static int field2596 = 0;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lmb;")
    public static class132 field2595 = class166.method1092("titlebutton", 121);

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "[I")
    public static int[] field2588;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2584 = null;
        if (arg0 == 60) {
            field2588 = null;
            field2594 = null;
            field2589 = null;
            field2592 = null;
            field2590 = null;
            field2593 = null;
            field2595 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)Lp;")
    public static final class163 method936(int arg0, int arg1) {
        class163 var2 = (class163) class154.field2800.method777(-1, (long) arg1);
        ++field2583;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class15.field228.method1079(arg0, -45, arg1);
            class163 var4 = new class163();
            if (var3 != null) {
                var4.method1053(new class112(var3), arg0 ^ 6018);
            }
            class154.field2800.method774((long) arg1, var4, arg0 + -16);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            return null;
        } else {
            ++field2586;
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            if (super.field764.field3960) {
                int[] var4 = this.method300(98, 1, arg1);
                int[] var5 = this.method300(67, 2, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                int[] var8 = var3[1];
                for (int var9 = 0; ~class131.field2427 < ~var9; ++var9) {
                    int var10 = (var4[var9] * 255 & 1047224) >> 12;
                    int var11 = var5[var9] * this.field2580 >> 12;
                    int var12 = class69.field1151[var10] * var11 >> 12;
                    int var13 = class174.field3239[var10] * var11 >> 12;
                    int var14 = (var12 >> 12) + var9 & class90.field1593;
                    int var15 = class185.field3423 & (var13 >> 12) + arg1;
                    int[][] var16 = this.method301(var15, (byte) 84, 0);
                    var6[var9] = var16[0][var14];
                    var8[var9] = var16[1][var14];
                    var7[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field2585;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(116, 1, arg0);
            int[] var5 = this.method300(-107, 2, arg0);
            for (int var6 = 0; class131.field2427 > var6; ++var6) {
                int var7 = var5[var6] * this.field2580 >> 12;
                int var8 = 255 & var4[var6] >> 4;
                int var9 = class69.field1151[var8] * var7 >> 12;
                int var10 = class174.field3239[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class90.field1593;
                int var12 = arg0 - -(var10 >> 12) & class185.field3423;
                int[] var13 = this.method300(65, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 == -73) {
            ++field2581;
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field746 = ~arg2.method716(-1308) == -2;
                }
            } else {
                this.field2580 = arg2.method739(-123) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class138() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        class191.method1222(false);
        ++field2582;
        if (arg0 < 21) {
            method935((byte) -11);
        }
    }
}
