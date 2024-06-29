import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class195 extends class3 {

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Lui;")
    public static class98 field2988 = new class98(5);

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Lha;")
    public static class29 field2992 = new class29(5000);

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "[Llj;")
    public static class289[] field2990;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method25(byte arg0, int arg1) {
        field2994++;
        if (arg0 <= 57) {
            field2992 = (class29) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            for (int var4 = 0; var4 < class326.field5342; var4++) {
                this.method1333(80, var4, arg1);
                int[] var5 = this.method24(class246.field3913, 1, 0);
                var3[var4] = var5[class191.field2964];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(III)V", line = 47)
    private final void method1333(int arg0, int arg1, int arg2) {
        field2991++;
        int var4 = class163.field2591[arg1];
        int var5 = -57 % ((arg0 + 11) / 38);
        int var6 = class159.field2546[arg2];
        float var7 = (float) Math.atan2((double) (var4 - 2048), (double) (var6 - 2048));
        if ((double) var7 >= -3.141592653589793D && -2.356194490192345D >= (double) var7) {
            class191.field2964 = arg1;
            class246.field3913 = arg2;
        } else if (-1.5707963267948966D >= (double) var7 && -2.356194490192345D <= (double) var7) {
            class191.field2964 = arg2;
            class246.field3913 = arg1;
        } else if (-0.7853981633974483D >= (double) var7 && (double) var7 >= -1.5707963267948966D) {
            class191.field2964 = class326.field5342 - arg2;
            class246.field3913 = arg1;
        } else if (var7 <= 0.0F && -0.7853981633974483D <= (double) var7) {
            class191.field2964 = arg1;
            class246.field3913 = class308.field5010 - arg2;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class191.field2964 = class326.field5342 - arg1;
            class246.field3913 = class308.field5010 - arg2;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class246.field3913 = class308.field5010 - arg1;
            class191.field2964 = class326.field5342 - arg2;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class246.field3913 = class308.field5010 - arg1;
            class191.field2964 = arg2;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class191.field2964 = class326.field5342 - arg1;
            class246.field3913 = arg2;
        }
        class191.field2964 &= class5.field70;
        class246.field3913 &= class129.field1970;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfh;IZ)V", line = 124)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field34 = arg0.method2224(-119) == 1;
        }
        field2989++;
        if (arg2) {
            field2990 = (class289[]) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 137)
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V", line = 152)
    public static void method1334(byte arg0) {
        if (arg0 != -77) {
            field2988 = (class98) null;
        }
        field2990 = null;
        field2992 = null;
        field2988 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I", line = 167)
    public final int[][] method22(int arg0, int arg1) {
        field2993++;
        if (arg0 != -21194) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class326.field5342; var7++) {
                this.method1333(-95, var7, arg1);
                int[][] var8 = this.method16(class246.field3913, 0, (byte) -43);
                var5[var7] = var8[0][class191.field2964];
                var4[var7] = var8[1][class191.field2964];
                var6[var7] = var8[2][class191.field2964];
            }
        }
        return var3;
    }
}
