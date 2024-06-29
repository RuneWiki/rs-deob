import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class221 extends class212 {

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    private int field3817 = 4096;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lsc;")
    public static class181 field3816 = class149.method967(255, "<col=00ff80>");

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field3815 = 0;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "[I")
    public static int[] field3824 = new int[5];

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "[[[I")
    public static int[][][] field3822 = new int[2][][];

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "Lsc;")
    public static class181 field3818 = class149.method967(255, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "Lsc;")
    public static class181 field3826 = class149.method967(255, "weiss:");

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "Luc;")
    public static class14 field3823;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "Ldg;")
    public static class90 field3825;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "[[[Lfa;")
    public static class220[][][] field3820;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field3817 = arg0.method1535(~arg2);
        }
        ++field3827;
        if (arg2 != -3) {
            method1467((class181) null, (class181) null, -18, (class181) null, 63, -123);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field3812;
        if (arg1 < 25) {
            field3819 = -49;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0 - 1 & class4.field90, 0, 81);
            int[] var5 = this.method1405(arg0, 0, 85);
            int[] var6 = this.method1405(class4.field90 & arg0 + 1, 0, 89);
            for (int var7 = 0; class26.field452 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3817;
                int var9 = (var5[class186.field3300 & var7 + 1] + -var5[var7 + -1 & class186.field3300]) * this.field3817;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lsc;Lsc;ILsc;II)V")
    public static final void method1467(class181 arg0, class181 arg1, int arg2, class181 arg3, int arg4, int arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class91.field1452[var6] = class91.field1452[var6 + -1];
            class78.field1256[var6] = class78.field1256[var6 + -1];
            class110.field1809[var6] = class110.field1809[var6 + -1];
            class91.field1445[var6] = class91.field1445[var6 + -1];
            class74.field1181[var6] = class74.field1181[var6 - 1];
        }
        class253.field4421 = class247.field4318;
        class91.field1452[0] = arg4;
        ++class264.field4591;
        ++field3813;
        class74.field1181[0] = arg5;
        if (arg2 == -6700) {
            class78.field1256[0] = arg1;
            class110.field1809[0] = arg3;
            class91.field1445[0] = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3814;
        int var8 = class144.method931(arg0 ^ 3, class125.field2056, class23.field408, arg5);
        int var9 = class144.method931(100, class125.field2056, class23.field408, arg4);
        int var10 = class144.method931(-15, class124.field2032, class11.field219, arg6);
        int var11 = class144.method931(-62, class124.field2032, class11.field219, arg7);
        int var12 = class144.method931(-21, class125.field2056, class23.field408, arg1 + arg5);
        int var13 = class144.method931(arg0 + -113, class125.field2056, class23.field408, arg4 - arg1);
        for (int var14 = var8; ~var12 < ~var14; ++var14) {
            class171.method1133(class149.field2507[var14], var10, arg3, var11, (byte) 126);
        }
        int var15 = var9;
        if (arg0 != 99) {
            field3822 = null;
        }
        while (var13 < var15) {
            class171.method1133(class149.field2507[var15], var10, arg3, var11, (byte) 125);
            --var15;
        }
        int var16 = class144.method931(-113, class124.field2032, class11.field219, arg1 + arg6);
        int var17 = class144.method931(arg0 + -216, class124.field2032, class11.field219, -arg1 + arg7);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class149.field2507[var18];
            class171.method1133(var19, var10, arg3, var16, (byte) 127);
            class171.method1133(var19, var16, arg2, var17, (byte) 127);
            class171.method1133(var19, var17, arg3, var11, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method1469(int arg0) {
        field3816 = null;
        field3825 = null;
        field3818 = null;
        if (arg0 == 99) {
            field3826 = null;
            field3822 = null;
            field3820 = null;
            field3823 = null;
            field3824 = null;
        }
    }
}
