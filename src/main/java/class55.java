import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class55 extends class270 {

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "Lmh;")
    public static class62 field809 = class201.method1405(true, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "[J")
    public static long[] field808 = new long[100];

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field807 = 3353893;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)I", line = 9)
    public static final int method357(int arg0, byte arg1) {
        field804++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else {
            if (arg0 < 45) {
                field809 = (class62) null;
            }
            if (arg1 >= 48 && arg1 <= 57) {
                return arg1 + 4;
            } else if (arg1 == 43) {
                return 62;
            } else if (arg1 == 42) {
                return 62;
            } else if (arg1 == 47) {
                return 63;
            } else if (arg1 == 45) {
                return 63;
            } else {
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 45)
    public static void method358(boolean arg0) {
        field808 = null;
        field809 = null;
        if (!arg0) {
            field807 = 24;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(II)I", line = 61)
    public static final int method359(int arg0, int arg1) {
        field810++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else if (arg1 == -11230) {
            return arg0;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V", line = 84)
    private final void method360(int arg0, int arg1, byte arg2) {
        if (arg2 != -108) {
            this.method360(-117, 21, (byte) 24);
        }
        field803++;
        int var4 = class283.field4840[arg1];
        int var5 = class166.field2702[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class162.field2630 = arg0;
            class230.field3990 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class230.field3990 = arg0;
            class162.field2630 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class162.field2630 = arg1;
            class230.field3990 = class109.field1770 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class162.field2630 = class266.field4496 - arg0;
            class230.field3990 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class230.field3990 = class109.field1770 - arg1;
            class162.field2630 = class266.field4496 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class162.field2630 = class266.field4496 - arg1;
            class230.field3990 = class109.field1770 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class162.field2630 = class266.field4496 - arg1;
            class230.field3990 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class230.field3990 = class109.field1770 - arg1;
            class162.field2630 = arg0;
        }
        class230.field3990 &= class49.field717;
        class162.field2630 &= class307.field5268;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I", line = 162)
    public final int[] method6(int arg0, int arg1) {
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            for (int var4 = 0; var4 < class109.field1770; var4++) {
                this.method360(arg1, var4, (byte) -108);
                int[] var5 = this.method1850(0, 0, class162.field2630);
                var3[var4] = var5[class230.field3990];
            }
        }
        field812++;
        if (arg0 != 18693) {
            method359(101, 83);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lmi;II)V", line = 202)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        int var4 = 46 / ((arg2 + 8) / 53);
        field806++;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 214)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)[[I", line = 223)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            this.method360(83, -60, (byte) -32);
        }
        field811++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class109.field1770; var7++) {
                this.method360(arg1, var7, (byte) -108);
                int[][] var8 = this.method1855(false, class162.field2630, 0);
                var4[var7] = var8[0][class230.field3990];
                var5[var7] = var8[1][class230.field3990];
                var6[var7] = var8[2][class230.field3990];
            }
        }
        return var3;
    }
}
