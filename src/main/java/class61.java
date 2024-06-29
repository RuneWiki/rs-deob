import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class61 {

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[S")
    public short[] field868;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "[S")
    public short[] field879;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[B")
    public byte[] field867;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "[Lph;")
    public class229[] field872;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field870 = -1;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lph;")
    public static class229 field876 = class266.method1858("cookieprefix", 0);

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "[[I")
    public static int[][] field881 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Z", line = 5)
    public final boolean method410(int arg0, byte arg1) {
        field871++;
        if (arg1 != -12) {
            this.field869 = (int[]) null;
        }
        return (this.field867[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)I", line = 16)
    public final int method411(byte arg0, int arg1) {
        if (arg0 <= 60) {
            return 1;
        } else {
            field880++;
            return this.field867[arg1] & 0x3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field878++;
        class193.method1354((byte) -37, arg3 + arg4, -arg4 + arg3, arg0, class202.field3337[arg2]);
        int var7 = arg1;
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = arg1 << 1;
        int var12 = var8 << 1;
        int var13 = (arg5 - var11) * var9 + var12;
        int var14 = var8 - ((var11 - 1) * var10);
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((arg1 << 1) - 3) * var10;
        int var18 = (var6 + 1) * var16;
        int var19 = ((var6 << 1) + 3) * var12;
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var18;
                    var18 += var16;
                    var13 += var19;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var19;
                var14 += var18;
                var6++;
                var19 += var16;
                var18 += var16;
            }
            var13 += -var20;
            var14 += -var17;
            int var21 = arg3 + var6;
            var17 -= var15;
            int var22 = arg3 - var6;
            var7--;
            int var23 = arg2 + var7;
            var20 -= var15;
            int var24 = arg2 - var7;
            class193.method1354((byte) -37, var21, var22, arg0, class202.field3337[var24]);
            class193.method1354((byte) -37, var21, var22, arg0, class202.field3337[var23]);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 124)
    public static void method413(int arg0) {
        if (arg0 != 128) {
            method419(-5, true);
        }
        field881 = (int[][]) null;
        field876 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 136)
    public static final void method414(int arg0) {
        if (class307.field5177 != null) {
            class307.field5177.method665(-16933);
        }
        if (arg0 <= 40) {
            method412(74, -47, -86, -98, -107, 59);
        }
        if (class110.field1870 != null) {
            class110.field1870.method665(-16933);
        }
        class192.method1349(2, class143.field2313, (byte) 79, 22050);
        field877++;
        class307.field5177 = class75.method572(class249.field4143, 0, 22050, -1024, class214.field3526);
        class307.field5177.method663(class314.field5343, 28579);
        class110.field1870 = class75.method572(class249.field4143, 1, 2048, -1024, class214.field3526);
        class110.field1870.method663(class239.field3949, 28579);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z", line = 162)
    public static final boolean method415(byte arg0) {
        field866++;
        if (class99.field1675) {
            return true;
        } else {
            if (arg0 != 68) {
                method415((byte) -99);
            }
            return class85.field1467;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)Z", line = 177)
    public final boolean method416(int arg0, byte arg1) {
        field875++;
        if (arg1 < 7) {
            method414(-91);
        }
        return (this.field867[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZBLjava/lang/Object;)[B", line = 190)
    public static final byte[] method417(boolean arg0, byte arg1, Object arg2) {
        if (arg1 != -128) {
            field876 = (class229) null;
        }
        field874++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? class98.method722(0, var4) : var4;
        } else if (arg2 instanceof class300) {
            class300 var3 = (class300) arg2;
            return var3.method1131((byte) 79);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z", line = 230)
    public static final boolean method418(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class207.field3412; var3++) {
            class149 var4 = class68.field1084[var3];
            if (var4.field2416 == 1) {
                int var5 = var4.field2410 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2423 * var5 >> 8) + var4.field2403;
                    int var7 = (var4.field2412 * var5 >> 8) + var4.field2413;
                    int var8 = (var4.field2407 * var5 >> 8) + var4.field2409;
                    int var9 = (var4.field2408 * var5 >> 8) + var4.field2419;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2416 == 2) {
                int var10 = arg0 - var4.field2410;
                if (var10 > 0) {
                    int var11 = (var4.field2423 * var10 >> 8) + var4.field2403;
                    int var12 = (var4.field2412 * var10 >> 8) + var4.field2413;
                    int var13 = (var4.field2407 * var10 >> 8) + var4.field2409;
                    int var14 = (var4.field2408 * var10 >> 8) + var4.field2419;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2416 == 3) {
                int var15 = var4.field2403 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2421 * var15 >> 8) + var4.field2410;
                    int var17 = (var4.field2404 * var15 >> 8) + var4.field2405;
                    int var18 = (var4.field2407 * var15 >> 8) + var4.field2409;
                    int var19 = (var4.field2408 * var15 >> 8) + var4.field2419;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2416 == 4) {
                int var20 = arg2 - var4.field2403;
                if (var20 > 0) {
                    int var21 = (var4.field2421 * var20 >> 8) + var4.field2410;
                    int var22 = (var4.field2404 * var20 >> 8) + var4.field2405;
                    int var23 = (var4.field2407 * var20 >> 8) + var4.field2409;
                    int var24 = (var4.field2408 * var20 >> 8) + var4.field2419;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2416 == 5) {
                int var25 = arg1 - var4.field2409;
                if (var25 > 0) {
                    int var26 = (var4.field2421 * var25 >> 8) + var4.field2410;
                    int var27 = (var4.field2404 * var25 >> 8) + var4.field2405;
                    int var28 = (var4.field2423 * var25 >> 8) + var4.field2403;
                    int var29 = (var4.field2412 * var25 >> 8) + var4.field2413;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)Lqg;", line = 358)
    public static final class102 method419(int arg0, boolean arg1) {
        field873++;
        class102 var2 = (class102) class67.field1062.method1027(-60, (long) arg0);
        if (arg1) {
            method412(-22, -125, 52, 119, 12, -116);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3637.method523(-7, arg0, 11);
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method780(new class164(var3), (byte) -102);
        }
        class67.field1062.method1026(var4, 120, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V", line = 383)
    public class61(int arg0) {
        this.field882 = arg0;
        this.field869 = new int[this.field882];
        this.field868 = new short[this.field882];
        this.field879 = new short[this.field882];
        this.field867 = new byte[this.field882];
        this.field872 = new class229[this.field882];
    }
}
