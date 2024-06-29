import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class17 {

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lgh;")
    public static class33 field293;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field294;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method115(int arg0) {
        field305++;
        while (class123.field1743 >= 2048.0F) {
            class123.field1743 -= 2048.0F;
        }
        if (class160.field2239 < 128.0F) {
            class160.field2239 = 128.0F;
        }
        if (class160.field2239 > 383.0F) {
            class160.field2239 = 383.0F;
        }
        int var1 = class21.field341 >> 7;
        int var2 = class250.field3906 >> 7;
        while (class123.field1743 < 0.0F) {
            class123.field1743 += 2048.0F;
        }
        int var3 = class58.method360(class250.field3906, class21.field341, false, class166.field2364);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class166.field2364;
                    if (var7 < 3 && (class164.field2333[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class151.field2097[var7][var5][var6] & 0xFF) * 8 + var3 - class185.field2812[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        if (arg0 != 1) {
            return;
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class161.field2251 < var9) {
            class161.field2251 += (var9 - class161.field2251) / 24;
        } else if (var9 < class161.field2251) {
            class161.field2251 += (var9 - class161.field2251) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IJ)V")
    public static final void method116(int arg0, long arg1) {
        int var3 = 33 % ((arg0 - 38) / 60);
        field297++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class206.method1287(arg1 - 1L, -79);
            class206.method1287(1L, -79);
        } else {
            class206.method1287(arg1, -91);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lbj;B[B)V")
    public final void method117(class215 arg0, byte arg1, byte[] arg2) {
        field300++;
        if (arg0.field3287[arg0.field3280] != 31 || arg0.field3287[arg0.field3280 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field294 == null) {
            this.field294 = new Inflater(true);
        }
        try {
            this.field294.setInput(arg0.field3287, arg0.field3280 + 10, -8 - (arg0.field3280 + 10) + arg0.field3287.length);
            this.field294.inflate(arg2);
            if (arg1 >= -42) {
                method122(false, -17);
            }
        } catch (Exception var4) {
            this.field294.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field294.reset();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field293 = null;
        if (arg0 != 101) {
            method119(1, -12);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public static final void method119(int arg0, int arg1) {
        class251.field3923.method943(arg1, true);
        if (arg0 != 4) {
            field295 = 6;
        }
        field306++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field301++;
        if (arg4) {
            method119(-24, 71);
        }
        if (arg5 < 0 || arg6 < 0 || arg5 >= 103 || arg6 >= 103) {
            return;
        }
        if (arg7 == 0) {
            class180 var8 = class129.method823(arg0, arg5, arg6);
            if (var8 != null) {
                int var9 = (int) (var8.field2737 >>> 32) & Integer.MAX_VALUE;
                if (arg3 == 2) {
                    var8.field2735 = new class158(var9, 2, arg2 + 4, arg0, arg5, arg6, arg1, false, var8.field2735);
                    var8.field2729 = new class158(var9, 2, arg2 + 1 & 0x3, arg0, arg5, arg6, arg1, false, var8.field2729);
                } else {
                    var8.field2735 = new class158(var9, arg3, arg2, arg0, arg5, arg6, arg1, false, var8.field2735);
                }
            }
        }
        if (arg7 == 1) {
            class75 var10 = class164.method1047(arg0, arg5, arg6);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field1055 >>> 32);
                if (arg3 == 4 || arg3 == 5) {
                    var10.field1047 = new class158(var11, 4, arg2, arg0, arg5, arg6, arg1, false, var10.field1047);
                } else if (arg3 == 6) {
                    var10.field1047 = new class158(var11, 4, arg2 + 4, arg0, arg5, arg6, arg1, false, var10.field1047);
                } else if (arg3 == 7) {
                    var10.field1047 = new class158(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg5, arg6, arg1, false, var10.field1047);
                } else if (arg3 == 8) {
                    var10.field1047 = new class158(var11, 4, arg2 + 4, arg0, arg5, arg6, arg1, false, var10.field1047);
                    var10.field1057 = new class158(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg5, arg6, arg1, false, var10.field1057);
                }
            }
        }
        if (arg7 == 2) {
            class160 var12 = class258.method1693(arg0, arg5, arg6);
            if (arg3 == 11) {
                arg3 = 10;
            }
            if (var12 != null) {
                var12.field2230 = new class158(Integer.MAX_VALUE & (int) (var12.field2225 >>> 32), arg3, arg2, arg0, arg5, arg6, arg1, false, var12.field2230);
            }
        }
        if (arg7 != 3) {
            return;
        }
        class308 var13 = class124.method796(arg0, arg5, arg6);
        if (var13 != null) {
            var13.field4953 = new class158(Integer.MAX_VALUE & (int) (var13.field4950 >>> 32), 22, arg2, arg0, arg5, arg6, arg1, false, var13.field4953);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZC)Z")
    public static final boolean method121(boolean arg0, char arg1) {
        field292++;
        if (arg0) {
            field293 = null;
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            int var2 = 0;
            char[] var3 = class85.field1212;
            while (var3.length > var2) {
                char var4 = var3[var2];
                if (arg1 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class17() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(III)V")
    private class17(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)I")
    public static final int method122(boolean arg0, int arg1) {
        field303++;
        if (!arg0) {
            method118((byte) 87);
        }
        return arg1 == 16711935 ? -1 : class13.method79(0, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILbj;)V")
    public static final void method123(int arg0, class215 arg1) {
        int var2 = 0;
        if (arg0 > -99) {
            field302 = -40;
        }
        while (class92.field1354 > var2) {
            int var3 = arg1.method1347(true);
            int var4 = arg1.method1379(-101);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class250.field3912[var3] != null) {
                class250.field3912[var3].field3931 = var4;
            }
            var2++;
        }
        field298++;
    }
}
