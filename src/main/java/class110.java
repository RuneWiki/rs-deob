import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class110 {

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "Z")
    public boolean field1387;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "Z")
    public boolean field1373;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "[S")
    public short[] field1381;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "Lkp;")
    public class515 field1374;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)V")
    public static final void method881(int arg0, int arg1, int arg2) {
        field1383++;
        class714 var3 = class350.method2072(0L, 15, (byte) 109);
        var3.method4043(6380);
        var3.field10021 = arg2;
        if (arg1 != 255) {
            method881(-108, 57, 5);
        }
        var3.field10018 = arg0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILha;IIIII)V")
    private final void method882(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            this.field1388 = -112;
        }
        this.field1374 = arg1.method573(arg5, arg0, arg6, arg2, arg3, 1.0F);
        field1376++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
    public final void method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1375 = arg3;
        this.field1379 = arg4;
        this.field1380 = arg2;
        field1386++;
        this.field1390 = arg0;
        if (arg1 <= 110) {
            this.field1389 = -85;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    private final void method884(byte arg0) {
        if (arg0 != -82) {
            this.field1379 = 84;
        }
        field1377++;
        int var2 = this.field1388;
        if (var2 == 2) {
            this.field1379 = 2048;
            this.field1380 = 1;
            this.field1375 = 0;
            this.field1390 = 2048;
        } else if (var2 == 3) {
            this.field1375 = 0;
            this.field1390 = 2048;
            this.field1379 = 4096;
            this.field1380 = 1;
        } else if (var2 == 4) {
            this.field1379 = 2048;
            this.field1375 = 0;
            this.field1390 = 2048;
            this.field1380 = 4;
        } else if (var2 == 5) {
            this.field1375 = 0;
            this.field1380 = 4;
            this.field1379 = 8192;
            this.field1390 = 2048;
        } else if (var2 == 12) {
            this.field1375 = 0;
            this.field1380 = 2;
            this.field1390 = 2048;
            this.field1379 = 2048;
        } else if (var2 == 13) {
            this.field1380 = 2;
            this.field1390 = 2048;
            this.field1375 = 0;
            this.field1379 = 8192;
        } else if (var2 == 10) {
            this.field1379 = 2048;
            this.field1380 = 3;
            this.field1375 = 1536;
            this.field1390 = 512;
        } else if (var2 == 11) {
            this.field1380 = 3;
            this.field1375 = 1536;
            this.field1390 = 512;
            this.field1379 = 4096;
        } else if (var2 == 6) {
            this.field1380 = 3;
            this.field1390 = 768;
            this.field1375 = 1280;
            this.field1379 = 2048;
        } else if (var2 == 7) {
            this.field1375 = 1280;
            this.field1390 = 768;
            this.field1380 = 3;
            this.field1379 = 4096;
        } else if (var2 == 8) {
            this.field1379 = 2048;
            this.field1380 = 3;
            this.field1375 = 1024;
            this.field1390 = 1024;
        } else if (var2 == 9) {
            this.field1379 = 4096;
            this.field1375 = 1024;
            this.field1390 = 1024;
            this.field1380 = 3;
        } else if (var2 == 14) {
            this.field1380 = 1;
            this.field1375 = 1280;
            this.field1379 = 2048;
            this.field1390 = 768;
        } else if (var2 == 15) {
            this.field1390 = 512;
            this.field1380 = 1;
            this.field1379 = 4096;
            this.field1375 = 1536;
        } else if (var2 == 16) {
            this.field1379 = 8192;
            this.field1380 = 1;
            this.field1390 = 256;
            this.field1375 = 1792;
        } else {
            this.field1390 = 2048;
            this.field1380 = 0;
            this.field1375 = 0;
            this.field1379 = 2048;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIII)I")
    public static final int method885(int arg0, int arg1, int arg2, int arg3) {
        field1384++;
        int var4 = arg2 / arg0;
        int var5 = arg0 - 1 & arg2;
        int var6 = arg1 / arg0;
        int var7 = arg1 & arg0 - 1;
        int var8 = class437.method2578(var4, false, var6);
        int var9 = class437.method2578(var4 + 1, false, var6);
        int var10 = class437.method2578(var4, false, var6 + 1);
        int var11 = class437.method2578(var4 + 1, false, var6 + 1);
        int var12 = class316.method1861(arg0, var5, var9, var8, 1073741824);
        if (arg3 > -101) {
            field1382 = 69;
        }
        int var13 = class316.method1861(arg0, var5, var11, var10, 1073741824);
        return class316.method1861(arg0, var7, var13, var12, 1073741824);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZII)V")
    public final void method886(boolean arg0, int arg1, int arg2) {
        field1378++;
        if (arg1 > -101) {
            this.field1374 = null;
        }
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field1379 * arg2 / 50 + this.field1389 & 0x7FF;
            int var6 = this.field1380;
            if (var6 == 1) {
                var4 = (class789.field10868[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class343.field4304[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field1374.method545(0, (float) ((this.field1390 * var4 >> 11) + this.field1375) / 2048.0F);
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
    protected class110() {
        if (class343.field4304 == null) {
            class35.method319((byte) -97);
        }
        this.method884((byte) -82);
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lha;Les;I)V")
    public class110(class66 arg0, class403 arg1, int arg2) {
        if (class343.field4304 == null) {
            class35.method319((byte) -97);
        }
        this.field1385 = arg1.method2396((byte) 65);
        this.field1387 = (this.field1385 & 0x8) != 0;
        this.field1373 = (this.field1385 & 0x10) != 0;
        this.field1385 &= 0x7;
        int var4 = arg1.method2390((byte) 23) << arg2;
        int var5 = arg1.method2390((byte) -123) << arg2;
        int var6 = arg1.method2390((byte) 59) << arg2;
        int var7 = arg1.method2396((byte) 81);
        int var8 = var7 * 2 + 1;
        this.field1381 = new short[var8];
        for (int var9 = 0; var9 < this.field1381.length; var9++) {
            short var13 = (short) arg1.method2390((byte) -109);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field1381[var9] = (short) class5.method105(var14 << 8, var15);
        }
        int var10 = (var7 << class714.field10017) + class343.field4301;
        int var11 = class437.field5749 == null ? class12.field211[class319.method1899(arg1.method2390((byte) -127), (byte) 68) & 0xFFFF] : class437.field5749[arg1.method2390((byte) 67)];
        int var12 = arg1.method2396((byte) 16);
        this.field1389 = var12 & 0xE0 << 3;
        this.field1388 = var12 & 0x1F;
        if (this.field1388 != 31) {
            this.method884((byte) -82);
        }
        this.method882(var6, arg0, var10, var11, 0, var4, var5);
    }
}
