import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class14 extends class232 {

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    private int field113 = 1;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field115 = 204;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    private int field112 = 1;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "[J")
    public static long[] field110 = new long[256];

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Z")
    public static boolean field117;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "Lhi;")
    public static class82 field118;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V", line = 10)
    public static void method76(int arg0) {
        int var1 = 40 / ((47 - arg0) / 52);
        field118 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lti;", line = 23)
    public static final class186 method77(byte arg0) {
        field111++;
        class186 var1 = new class186(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], class260.field4453[0], class142.field2427);
        int var2 = 99 % ((arg0 - 75) / 34);
        class3.method23(286013516);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[B)Lhi;", line = 40)
    public static final class82 method78(int arg0, int arg1, int arg2, byte[] arg3) {
        field108++;
        int var4 = -35 % ((-arg1 - 45) / 47);
        class82 var5 = new class82();
        var5.field1468 = 0;
        var5.field1419 = new byte[arg0];
        for (int var6 = arg2; var6 < arg2 + arg0; var6++) {
            if (arg3[var6] != 0) {
                var5.field1419[var5.field1468++] = arg3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIII)V", line = 65)
    public static final void method79(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var6 = -96 % ((58 - arg4) / 41);
        if (arg0 < 1) {
            arg0 = 1;
        }
        field114++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class147.field2485) {
            int var7 = arg3 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (class13.field98 - class13.field95) * var7 / 100 + class13.field95;
            if (var8 < class111.field2006) {
                var8 = class111.field2006;
            } else if (var8 > class88.field1569) {
                var8 = class88.field1569;
            }
            int var9 = arg3 * var8 * 512 / (arg0 * 334);
            if (class134.field2319 > var9) {
                short var10 = class134.field2319;
                var8 = arg0 * 334 * var10 / (arg3 * 512);
                if (var8 > class88.field1569) {
                    var8 = class88.field1569;
                    int var11 = arg3 * 512 * var8 / (var10 * 334);
                    int var12 = (arg0 - var11) / 2;
                    if (arg2) {
                        class116.method790();
                        class116.method784(arg5, arg1, var12, arg3, 0);
                        class116.method784(arg0 + arg5 - var12, arg1, var12, arg3, 0);
                    }
                    arg5 += var12;
                    arg0 -= var12 * 2;
                }
            } else if (class271.field4573 < var9) {
                short var13 = class271.field4573;
                var8 = var13 * 334 * arg0 / (arg3 * 512);
                if (var8 < class111.field2006) {
                    var8 = class111.field2006;
                    int var14 = arg0 * 334 * var13 / (var8 * 512);
                    int var15 = (arg3 - var14) / 2;
                    if (arg2) {
                        class116.method790();
                        class116.method784(arg5, arg1, arg0, var15, 0);
                        class116.method784(arg5, arg1 + arg3 - var15, arg0, var15, 0);
                    }
                    arg1 += var15;
                    arg3 -= var15 * 2;
                }
            }
            class105.field1869 = arg3 * var8 / 334;
        }
        class40.field699 = arg5;
        class307.field5224 = (short) arg0;
        class107.field1891 = arg1;
        class15.field124 = (short) arg3;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)[I", line = 174)
    public final int[] method80(int arg0, byte arg1) {
        field116++;
        int var3 = -50 / ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -111, arg0);
        if (this.field4008.field256) {
            for (int var5 = 0; var5 < class54.field858; var5++) {
                int var6 = class24.field329[var5];
                int var7 = this.field112 * var6 >> 12;
                int var8 = class273.field4607[arg0];
                int var9 = this.field113 * var8 >> 12;
                int var10 = var6 % (4096 / this.field112) * this.field112;
                int var11 = var8 % (4096 / this.field113) * this.field113;
                if (this.field115 > var11) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (var10 < this.field115) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field115 > var10) {
                    int var12;
                    for (var12 = var7 - var9; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 256)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLbc;)V", line = 272)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field106++;
        if (arg0 == 0) {
            this.field112 = arg2.method1082(-123);
        } else if (arg0 == 1) {
            this.field113 = arg2.method1082(-44);
        } else if (arg0 == 2) {
            this.field115 = arg2.method1090(false);
        }
        if (arg1 != -19) {
            field110 = (long[]) null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field110[var0] = var1;
        }
        field117 = false;
        field118 = class95.method664((byte) -120, "Zugewiesener Speicher)3");
    }
}
