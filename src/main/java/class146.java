import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class146 extends class12 {

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Ltg;")
    private static class184 field2628 = class135.method812("Hidden", 3);

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Ltg;")
    public static class184 field2630 = class135.method812("leuchten3:", 3);

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Ltg;")
    private static class184 field2629 = class135.method812("Members only world", 3);

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Ltg;")
    public static class184 field2627 = field2629;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "Ltg;")
    public static class184 field2634 = class135.method812(")2", 3);

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Ltg;")
    public static class184 field2635 = field2628;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Ltg;")
    private static class184 field2642 = class135.method812("Loaded wordpack", 3);

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "Ltg;")
    public static class184 field2643 = field2642;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "Lud;")
    public static class190 field2631;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2637;
        int var3 = -99 / ((arg1 - -58) / 34);
        int[][] var4 = super.field232.method673(arg0, 92);
        int[] var5 = var4[1];
        int[] var6 = var4[0];
        int[] var7 = var4[2];
        if (super.field232.field1962) {
            for (int var8 = 0; var8 < class201.field3889; ++var8) {
                this.method896(arg0, var8, (byte) 100);
                int[][] var9 = this.method76(class6.field109, 6218, 0);
                var6[var8] = var9[0][class5.field80];
                var5[var8] = var9[1][class5.field80];
                var7[var8] = var9[2][class5.field80];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field2632;
        if (~arg1 == -1) {
            super.field211 = ~arg0.method588((byte) -101) == -2;
        }
        if (arg2) {
            field2642 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
    private final void method896(int arg0, int arg1, byte arg2) {
        if (arg2 != 100) {
            field2628 = null;
        }
        ++field2639;
        int var4 = class37.field698[arg0];
        int var5 = class131.field2381[arg1];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class6.field109 = arg0;
            class5.field80 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class5.field80 = arg0;
            class6.field109 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class6.field109 = arg1;
            class5.field80 = class201.field3889 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class5.field80 = arg1;
            class6.field109 = -arg0 + class114.field2074;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class5.field80 = -arg1 + class201.field3889;
            class6.field109 = -arg0 + class114.field2074;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class5.field80 = -arg0 + class201.field3889;
            class6.field109 = -arg1 + class114.field2074;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class5.field80 = arg0;
            class6.field109 = class114.field2074 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class5.field80 = class201.field3889 - arg1;
            class6.field109 = arg0;
        }
        class5.field80 &= class51.field937;
        class6.field109 &= class173.field3274;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) -64, arg0);
        ++field2633;
        if (arg1 != 17) {
            field2638 = -46;
        }
        if (super.field224.field53) {
            for (int var4 = 0; var4 < class201.field3889; ++var4) {
                this.method896(arg0, var4, (byte) 100);
                int[] var5 = this.method77(0, class6.field109, -125);
                var3[var4] = var5[class5.field80];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2642 = null;
        field2629 = null;
        if (arg0 <= 68) {
            field2635 = null;
        }
        field2630 = null;
        field2634 = null;
        field2627 = null;
        field2635 = null;
        field2628 = null;
        field2643 = null;
        field2631 = null;
    }
}
