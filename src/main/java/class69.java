import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    private int field1374 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[Lsi;")
    public class314[] field1358;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1366 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "J")
    private long field1371;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lok;")
    public static class149 field1357;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lok;")
    public static class149 field1364;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lsi;")
    private class314 field1367;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lsi;")
    private class314 field1373;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILok;)V", line = 4)
    public static final void method601(int arg0, class149 arg1) {
        if (arg0 == -1) {
            field1372++;
            class221.field3893 = arg1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)I", line = 16)
    public final int method602(boolean arg0) {
        if (arg0) {
            this.method603((byte) -119);
        }
        field1359++;
        return this.field1353;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 41)
    public final void method603(byte arg0) {
        field1352++;
        for (int var2 = 0; var2 < this.field1353; var2++) {
            class314 var3 = this.field1358[var2];
            while (true) {
                class314 var4 = var3.field5538;
                if (var3 == var4) {
                    break;
                }
                var4.method2221(true);
            }
        }
        if (arg0 <= 116) {
            method606(-63, -121);
        }
        this.field1373 = null;
        this.field1367 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lsi;", line = 75)
    public final class314 method604(int arg0) {
        if (arg0 != 2) {
            this.method610(-86L, 54);
        }
        field1360++;
        if (this.field1374 > 0 && this.field1358[this.field1374 - 1] != this.field1373) {
            class314 var2 = this.field1373;
            this.field1373 = var2.field5538;
            return var2;
        }
        class314 var3;
        do {
            if (this.field1353 <= this.field1374) {
                return null;
            }
            var3 = this.field1358[this.field1374++].field5538;
        } while (this.field1358[this.field1374 - 1] == var3);
        this.field1373 = var3.field5538;
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILgf;IIIILom;)V", line = 113)
    public static final void method605(int arg0, class8 arg1, int arg2, int arg3, int arg4, int arg5, class70 arg6) {
        field1370++;
        if (arg6 == null) {
            return;
        }
        int var7 = class126.field2349 + class212.field3714 & 0x7FF;
        int var8 = arg3 * arg3 + (arg4 * arg4);
        int var9 = Math.max(arg1.field220 / 2, arg1.field297 / arg2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class27.field654[var7];
        int var11 = class27.field642[var7];
        int var12 = var11 * 256 / (class5.field122 + 256);
        int var13 = var10 * 256 / (class5.field122 + 256);
        int var14 = arg3 * var12 + arg4 * var13 >> 16;
        int var15 = arg4 * var12 - (arg3 * var13) >> 16;
        if (class97.field1824) {
            ((class203) arg6).method1504(arg1.field220 / 2 + var14 + arg5 - (arg6.field1386 / 2), arg0 - (-(arg1.field297 / 2) - -var15) + -(arg6.field1381 / 2), (class203) arg1.method61(-10823, false));
        } else {
            ((class66) arg6).method587(arg1.field220 / 2 + var14 + arg5 - (arg6.field1386 / 2), arg1.field297 / 2 + (arg0 - arg6.field1381 / 2) + -var15, arg1.field251, arg1.field200);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I", line = 156)
    public static final int method606(int arg0, int arg1) {
        int var2 = 65 / ((arg0 - 26) / 35);
        field1356++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 168)
    public static void method607(int arg0) {
        field1357 = null;
        field1364 = null;
        if (arg0 != 0) {
            method601(-112, (class149) null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)I", line = 183)
    public final int method608(boolean arg0) {
        field1368++;
        int var2 = 0;
        if (arg0) {
            field1366 = -105;
        }
        for (int var3 = 0; var3 < this.field1353; var3++) {
            class314 var4 = this.field1358[var3];
            class314 var5 = var4.field5538;
            while (var4 != var5) {
                var5 = var5.field5538;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lsi;", line = 216)
    public final class314 method609(int arg0) {
        this.field1374 = 0;
        field1361++;
        if (arg0 != -26368) {
            this.field1373 = (class314) null;
        }
        return this.method604(2);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)Lsi;", line = 229)
    public final class314 method610(long arg0, int arg1) {
        this.field1371 = arg0;
        field1365++;
        class314 var4 = this.field1358[(int) ((long) (this.field1353 + arg1) & arg0)];
        for (this.field1367 = var4.field5538; this.field1367 != var4; this.field1367 = this.field1367.field5538) {
            if (this.field1367.field5539 == arg0) {
                class314 var5 = this.field1367;
                this.field1367 = this.field1367.field5538;
                return var5;
            }
        }
        this.field1367 = null;
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lsi;)I", line = 256)
    public final int method611(int arg0, class314[] arg1) {
        field1362++;
        int var3 = 0;
        if (arg0 <= 92) {
            return 107;
        }
        for (int var4 = 0; var4 < this.field1353; var4++) {
            class314 var5 = this.field1358[var4];
            for (class314 var6 = var5.field5538; var6 != var5; var6 = var6.field5538) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLsi;J)V", line = 289)
    public final void method612(boolean arg0, class314 arg1, long arg2) {
        if (arg1.field5535 != null) {
            arg1.method2221(true);
        }
        class314 var5 = this.field1358[(int) (arg2 & (long) (this.field1353 - 1))];
        arg1.field5539 = arg2;
        if (arg0) {
            this.method611(53, (class314[]) null);
        }
        arg1.field5535 = var5.field5535;
        arg1.field5538 = var5;
        arg1.field5535.field5538 = arg1;
        arg1.field5538.field5535 = arg1;
        field1354++;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V", line = 309)
    public class69(int arg0) {
        this.field1353 = arg0;
        this.field1358 = new class314[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class314 var3 = this.field1358[var2] = new class314();
            var3.field5535 = var3;
            var3.field5538 = var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Lsi;", line = 335)
    public final class314 method613(int arg0) {
        field1355++;
        if (this.field1367 == null) {
            return null;
        }
        if (arg0 != 5185) {
            field1369 = 34;
        }
        class314 var2 = this.field1358[(int) ((long) (this.field1353 - 1) & this.field1371)];
        while (this.field1367 != var2) {
            if (this.field1367.field5539 == this.field1371) {
                class314 var3 = this.field1367;
                this.field1367 = this.field1367.field5538;
                return var3;
            }
            this.field1367 = this.field1367.field5538;
        }
        this.field1367 = null;
        return null;
    }
}
