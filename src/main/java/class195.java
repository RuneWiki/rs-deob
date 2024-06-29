import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class195 extends class128 {

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field2794 = -1;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2801 = 7759444;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "[S")
    public static short[] field2805 = new short[256];

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2799 = "Loaded fonts";

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "[I")
    public static int[] field2806 = new int[32];

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2804 = "purple:";

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "F")
    public static float field2795;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lfg;")
    public static class228 field2802;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "[I")
    public static int[] field2798;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lp;II)V", line = 4)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            field2799 = (String) null;
        }
        if (arg1 == 0) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        field2800++;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 19)
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIZ)V", line = 25)
    public static final void method1352(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2793++;
        if (!arg4) {
            method1353((byte) -100);
        }
        class96 var5 = class141.method935(arg2, 8, 50);
        var5.method581((byte) -126);
        var5.field1246 = arg1;
        var5.field1243 = arg0;
        var5.field1254 = arg3;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)[I", line = 53)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 < 100) {
            return (int[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        field2796++;
        if (this.field1748.field1878) {
            for (int var4 = 0; var4 < class10.field141; var4++) {
                this.method1354(var4, arg1, 2048);
                int[] var5 = this.method851((byte) -76, 0, class283.field4441);
                var3[var4] = var5[class160.field2208];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 86)
    public static void method1353(byte arg0) {
        field2798 = null;
        field2799 = null;
        if (arg0 < 0) {
            method1352(-69, -94, -77, -37, false);
        }
        field2806 = null;
        field2805 = null;
        field2802 = null;
        field2804 = null;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)V", line = 104)
    private final void method1354(int arg0, int arg1, int arg2) {
        field2797++;
        int var4 = class49.field600[arg1];
        int var5 = class334.field5157[arg0];
        float var6 = (float) Math.atan2((double) (var5 - arg2), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
            class160.field2208 = arg0;
            class283.field4441 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class283.field4441 = arg0;
            class160.field2208 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class160.field2208 = class10.field141 - arg1;
            class283.field4441 = arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class160.field2208 = arg0;
            class283.field4441 = class322.field4940 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class283.field4441 = class322.field4940 - arg1;
            class160.field2208 = class10.field141 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class283.field4441 = class322.field4940 - arg0;
            class160.field2208 = class10.field141 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class160.field2208 = arg1;
            class283.field4441 = class322.field4940 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class160.field2208 = class10.field141 - arg0;
            class283.field4441 = arg1;
        }
        class160.field2208 &= class244.field3664;
        class283.field4441 &= class237.field3486;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[[I", line = 175)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            field2798 = (int[]) null;
        }
        field2803++;
        int[][] var3 = this.field1755.method875(127, arg0);
        if (this.field1755.field1815) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class10.field141; var7++) {
                this.method1354(var7, arg0, 2048);
                int[][] var8 = this.method855(-3102, class283.field4441, 0);
                var4[var7] = var8[0][class160.field2208];
                var5[var7] = var8[1][class160.field2208];
                var6[var7] = var8[2][class160.field2208];
            }
        }
        return var3;
    }
}
