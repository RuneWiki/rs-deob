import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class252 extends class68 {

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "[J")
    public static long[] field3854 = new long[100];

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field3857 = 0;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class280 var5 = class181.method1180(arg2, 0, 4);
        if (arg3 != 23658) {
            field3851 = -109;
        }
        ++field3850;
        var5.method1876(arg3 ^ 1840478794);
        var5.field4330 = arg0;
        var5.field4338 = arg4;
        var5.field4329 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
    public static void method1686(int arg0) {
        field3854 = null;
        if (arg0 != 2) {
            field3849 = -25;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1687(String arg0, int arg1) {
        ++field3852;
        int var2 = arg0.length();
        if (arg1 != -22253) {
            method1688(-0.4999411100364003D, (byte) 24);
        }
        long var3 = 0L;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (long) arg0.charAt(var5) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        int[] var3 = super.field917.method1920(arg0, true);
        ++field3855;
        if (arg1 >= -118) {
            field3857 = 13;
        }
        if (super.field917.field4474) {
            int[][] var4 = this.method429(0, arg0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class89.field1248; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(DB)V")
    public static final void method1688(double arg0, byte arg1) {
        if (class116.field1648 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class20.field288[var3] = var4 <= 255 ? var4 : 255;
            }
            class116.field1648 = arg0;
        }
        if (arg1 > -10) {
            method1688(0.2717641885499906D, (byte) -18);
        }
        ++field3853;
    }
}
