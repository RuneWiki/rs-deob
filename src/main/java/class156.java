import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class156 {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    private int field2409 = 0;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private int field2408 = -1;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lhh;")
    private class169 field2410 = new class169();

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Z")
    public boolean field2420 = false;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
    private int[][] field2414;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lhi;")
    private class192[] field2407;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2404 = "white:";

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field2417 = 1;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[[B")
    public static byte[][] field2413;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 5)
    public static final void method1114(boolean arg0, int arg1, String arg2) {
        field2415++;
        short[] var3 = new short[16];
        String var4 = arg2.toLowerCase();
        if (arg1 != -1) {
            return;
        }
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class11.field136 : class273.field4408);
        for (int var8 = var6; var8 < var7; var8++) {
            class268 var9 = class310.method2188(var8, false);
            if (var9.field4316 && var9.method1896((byte) -92).toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 50) {
                    class94.field1287 = null;
                    class219.field3544 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var8;
            }
        }
        class219.field3544 = var5;
        class17.field207 = 0;
        String[] var12 = new String[class219.field3544];
        class94.field1287 = var3;
        for (int var13 = 0; var13 < class219.field3544; var13++) {
            var12[var13] = class310.method2188(var3[var13], false).method1896((byte) -127);
        }
        class101.method695((byte) -27, var12, class94.field1287);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII[[I)I", line = 78)
    public static final int method1115(byte arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        field2403++;
        if (arg0 >= -65) {
            field2413 = (byte[][]) ((byte[][]) null);
        }
        int var6 = (128 - arg1) * arg5[arg2][arg3] + (arg5[arg2 + 1][arg3] * arg1) >> 7;
        int var7 = (128 - arg1) * arg5[arg2][arg3 + 1] + arg5[arg2 + 1][arg3 + 1] * arg1 >> 7;
        return (128 - arg4) * var6 + arg4 * var7 >> 7;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I", line = 92)
    public final int[] method1116(int arg0, int arg1) {
        if (arg0 <= 96) {
            return (int[]) null;
        }
        field2406++;
        if (this.field2418 == this.field2416) {
            this.field2420 = this.field2407[arg1] == null;
            this.field2407[arg1] = class138.field2174;
            return this.field2414[arg1];
        } else if (this.field2416 == 1) {
            this.field2420 = this.field2408 != arg1;
            this.field2408 = arg1;
            return this.field2414[0];
        } else {
            class192 var3 = this.field2407[arg1];
            if (var3 == null) {
                this.field2420 = true;
                if (this.field2416 <= this.field2409) {
                    class192 var4 = (class192) this.field2410.method1236((byte) -78);
                    var3 = new class192(arg1, var4.field3133);
                    this.field2407[var4.field3140] = null;
                    var4.method1212((byte) 109);
                } else {
                    var3 = new class192(arg1, this.field2409);
                    this.field2409++;
                }
                this.field2407[arg1] = var3;
            } else {
                this.field2420 = false;
            }
            this.field2410.method1231(-104, var3);
            return this.field2414[var3.field3133];
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)[[I", line = 166)
    public final int[][] method1117(byte arg0) {
        field2402++;
        if (arg0 < 8) {
            return (int[][]) ((int[][]) null);
        } else if (this.field2418 == this.field2416) {
            for (int var2 = 0; var2 < this.field2416; var2++) {
                this.field2407[var2] = class138.field2174;
            }
            return this.field2414;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III)V", line = 290)
    public class156(int arg0, int arg1, int arg2) {
        this.field2416 = arg0;
        this.field2414 = new int[this.field2416][arg2];
        this.field2418 = arg1;
        this.field2407 = new class192[this.field2418];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILsm;)V", line = 206)
    public static final void method1118(int arg0, class264 arg1) {
        field2419++;
        if (arg1.field4284 != null) {
            arg1.field4284.field3510 = 0;
        }
        arg1.field4282 = false;
        class264 var2 = arg1.method119();
        if (arg0 != 0) {
            field2417 = -37;
        }
        while (var2 != null) {
            method1118(0, var2);
            var2 = arg1.method125();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)J", line = 229)
    public static final long method1119(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null || var3.field3364 == null ? 0L : var3.field3364.field3595;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 244)
    public final void method1120(boolean arg0) {
        field2405++;
        for (int var2 = 0; var2 < this.field2416; var2++) {
            this.field2414[var2] = null;
        }
        this.field2407 = null;
        this.field2414 = (int[][]) null;
        this.field2410.method1233(30602);
        this.field2410 = null;
        if (!arg0) {
            field2413 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V", line = 280)
    public static void method1121(boolean arg0) {
        field2413 = (byte[][]) null;
        field2404 = null;
        if (!arg0) {
            method1121(true);
        }
    }
}
