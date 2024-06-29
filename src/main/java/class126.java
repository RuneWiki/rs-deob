import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class126 extends class110 {

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Z")
    public static boolean field1976 = false;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field1972 = 0;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lse;")
    public static class105 field1971;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "[Llh;")
    private class222[] field1977;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 4)
    public static final String method919(String arg0, int arg1) {
        field1970++;
        if (arg1 <= 69) {
            return (String) null;
        } else {
            int var2 = class318.method2181((byte) -113, arg0);
            return var2 == -1 ? "" : class201.method1379("<br>", -70, class155.field2325.field2007[var2], " ");
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lug;", line = 22)
    public static final class242 method920(int arg0, byte arg1) {
        if (arg1 != 10) {
            method922(-82);
        }
        field1973++;
        class242 var2 = (class242) class56.field704.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field291.method1441(arg0, (byte) -44, 32);
        class242 var4 = new class242();
        if (var3 != null) {
            var4.method1636(new class263(var3), 0);
        }
        var4.method1643(-1);
        class56.field704.method2175((long) arg0, var4, arg1 ^ 0x64);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILre;I)V", line = 51)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1977 = new class222[arg1.method1787(false)];
            for (int var4 = 0; var4 < this.field1977.length; var4++) {
                int var5 = arg1.method1787(false);
                if (var5 == 0) {
                    this.field1977[var4] = class202.method1380(arg1, 99999999);
                } else if (var5 == 1) {
                    this.field1977[var4] = class76.method484(arg1, -76);
                } else if (var5 == 2) {
                    this.field1977[var4] = class300.method2087(111, arg1);
                } else if (var5 == 3) {
                    this.field1977[var4] = class320.method2190(31, arg1);
                }
            }
        } else if (arg0 == 1) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        if (arg2 <= -37) {
            field1981++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[IB)V", line = 131)
    private final void method921(int[][] arg0, byte arg1) {
        if (arg1 != -36) {
            field1976 = true;
        }
        int var3 = class124.field1936;
        field1974++;
        int var4 = class295.field4523;
        class45.method297(arg0, 0);
        class235.method1614(0, 0, class196.field2949, 256, class154.field2320);
        if (this.field1977 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1977.length; var5++) {
            class222 var6 = this.field1977[var5];
            int var7 = var6.field3380;
            int var8 = var6.field3381;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method1037(var3, var4, -119);
                } else {
                    var6.method1042(var3, var4, false);
                }
            } else if (var8 >= 0) {
                var6.method1035(var4, var3, arg1 ^ 0xFFFFFFDC);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 179)
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)[[I", line = 192)
    public final int[][] method445(int arg0, boolean arg1) {
        field1980++;
        if (arg1) {
            field1982 = -120;
        }
        int[][] var3 = this.field1701.method1477((byte) 124, arg0);
        if (this.field1701.field3255) {
            int var4 = class124.field1936;
            int var5 = class295.field4523;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field1701.method1482((byte) 107);
            this.method921(var6, (byte) -36);
            for (int var8 = 0; var8 < class295.field4523; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class124.field1936; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class124.method893(var15 << 4, 4080);
                    var12[var14] = class124.method893(65280, var15) >> 4;
                    var11[var14] = class124.method893(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I", line = 265)
    public final int[] method46(int arg0, int arg1) {
        field1969++;
        if (arg0 != 1) {
            return (int[]) null;
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            this.method921(this.field1695.method439(-109), (byte) -36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V", line = 289)
    public static final void method922(int arg0) {
        class11.field113.method2176((byte) -37);
        field1978++;
        if (arg0 != 32) {
            method919((String) null, -64);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILf;IIII)V", line = 305)
    public static final void method923(int arg0, int arg1, class329 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1979++;
        int var7 = arg4 * arg4 + (arg0 * arg0);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field5018 / 2, arg2.field4994 / 2);
        if (var7 <= var8 * var8) {
            class321.method2201(arg2, 24483, arg5, class200.field2984[arg3], arg0, arg6, arg4);
        } else {
            var8 -= 10;
            int var9 = class284.field4297 + class160.field2401 & 0x7FF;
            int var10 = class148.field2229[var9];
            int var11 = class148.field2239[var9];
            int var12 = var11 * 256 / (class178.field2641 + 256);
            int var13 = var10 * 256 / (class178.field2641 + 256);
            int var14 = arg0 * var12 + arg4 * var13 >> 16;
            int var15 = arg0 * var13 - arg4 * var12 >> 16;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) (Math.sin(var16) * (double) var8);
            int var19 = (int) ((double) var8 * Math.cos(var16));
            if (class117.field1817) {
                ((class303) class247.field3679[arg3]).method2103(240, 240, (arg6 + var18 + (arg2.field5018 / 2)) * 16, (arg2.field4994 / 2 + arg5 - var19) * 16, (int) (var16 * 10430.378D), 4096);
            } else {
                ((class127) class247.field3679[arg3]).method945(arg2.field5018 / 2 + arg6 + var18 - 10, arg2.field4994 / 2 + -var19 + arg5 + -10, 20, 20, 15, 15, var16, 256);
            }
        }
        if (arg1 != 8408) {
            method919((String) null, 9);
        }
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V", line = 353)
    public static void method924(int arg0) {
        if (arg0 != 32) {
            method920(-70, (byte) 63);
        }
        field1971 = null;
    }
}
