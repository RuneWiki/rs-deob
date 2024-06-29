import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class377 {

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lfp;")
    private class7 field5295 = null;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "Lfp;")
    private class7 field5304 = null;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    private int field5301 = 65000;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "[I")
    public static int[] field5306 = new int[5];

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "[Lkb;")
    public static class80[] field5308;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BBZI)Z", line = 9)
    private final boolean method2346(int arg0, byte[] arg1, byte arg2, boolean arg3, int arg4) {
        field5303++;
        class7 var6 = this.field5295;
        synchronized (this.field5295) {
            try {
                int var7;
                if (arg3) {
                    if (((long) (arg4 * 6 + 6)) > this.field5304.method47((byte) 53)) {
                        return false;
                    }
                    this.field5304.method40((long) (arg4 * 6), 31788);
                    this.field5304.method42(0, class266.field3576, (byte) -17, 6);
                    var7 = (class266.field3576[3] & 0xFF << 16) + (class266.field3576[5] & 0xFF) + ((class266.field3576[4] & 0xFF) << 8);
                    if (var7 <= 0 || (long) var7 > this.field5295.method47((byte) -93) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field5295.method47((byte) -122) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class266.field3576[2] = (byte) arg0;
                class266.field3576[3] = (byte) (var7 >> 16);
                class266.field3576[5] = (byte) var7;
                class266.field3576[4] = (byte) (var7 >> 8);
                class266.field3576[0] = (byte) (arg0 >> 16);
                class266.field3576[1] = (byte) (arg0 >> 8);
                this.field5304.method40((long) (arg4 * 6), 31788);
                this.field5304.method44(class266.field3576, -90, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (true) {
                    if (arg0 > var10) {
                        label110: {
                            int var12 = 0;
                            if (arg3) {
                                label109: {
                                    this.field5295.method40((long) (var7 * 520), 31788);
                                    try {
                                        this.field5295.method42(0, class266.field3576, (byte) -17, 8);
                                    } catch (EOFException var33) {
                                        break label110;
                                    }
                                    int var13 = (class266.field3576[0] & 0xFF << 8) + (class266.field3576[1] & 0xFF);
                                    int var14 = ((class266.field3576[2] & 0xFF) << 8) + (class266.field3576[3] & 0xFF);
                                    var12 = (class266.field3576[6] & 0xFF) + ((class266.field3576[5] & 0xFF) << 8) + (class266.field3576[4] & 0xFF << 16);
                                    int var15 = class266.field3576[7] & 0xFF;
                                    if (arg4 == var13 && var11 == var14 && this.field5294 == var15) {
                                        if (var12 >= 0 && ((long) var12) <= (this.field5295.method47((byte) -117) / 520L)) {
                                            break label109;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                var12 = (int) ((this.field5295.method47((byte) 110) + 519L) / 520L);
                                arg3 = false;
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var7 == var12) {
                                    var12++;
                                }
                            }
                            class266.field3576[0] = (byte) (arg4 >> 8);
                            if ((arg0 - var10) <= 512) {
                                var12 = 0;
                            }
                            class266.field3576[1] = (byte) arg4;
                            class266.field3576[3] = (byte) var11;
                            class266.field3576[2] = (byte) (var11 >> 8);
                            class266.field3576[5] = (byte) (var12 >> 8);
                            class266.field3576[6] = (byte) var12;
                            class266.field3576[7] = (byte) this.field5294;
                            class266.field3576[4] = (byte) (var12 >> 16);
                            this.field5295.method40((long) (var7 * 520), 31788);
                            this.field5295.method44(class266.field3576, -92, 0, 8);
                            int var18 = arg0 - var10;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            this.field5295.method44(arg1, -55, var10, var18);
                            var11++;
                            var10 += var18;
                            var7 = var12;
                            continue;
                        }
                    }
                    if (arg2 > -101) {
                        method2348(122);
                    }
                    return true;
                }
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 135)
    public static final void method2347(int arg0) {
        if (arg0 >= -67) {
            field5306 = null;
        }
        if (class100.field1444 == null || class381.field5351 == null) {
            class381.field5351 = new int[256];
            class100.field1444 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class100.field1444[var1] = (int) (Math.sin(var2) * 4096.0D);
                class381.field5351[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field5296++;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 167)
    public static final void method2348(int arg0) {
        if (class239.method1587(arg0 ^ 0xFFFFF7CB)) {
            if (class77.field1161 == null) {
                class295.method1897(false);
            }
            class135.field1928 = 0;
            class172.field2522 = new int[100];
            class323.field4388 = new int[100];
            class434.field6179 = true;
            class88.field1306 = new int[100];
            class276.field3719 = new boolean[100];
            for (int var1 = 0; var1 < 100; var1++) {
                class323.field4388[var1] = (int) ((double) class249.field3414 * Math.random());
                class172.field2522[var1] = (int) (Math.random() * 350.0D);
                class88.field1306[var1] = (int) (Math.random() * 102.0D);
                class276.field3719[var1] = Math.random() < 0.5D;
            }
            try {
                class64.field971 = class244.field3371.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        field5307++;
        if (arg0 != 512) {
            field5308 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B[B)[B", line = 210)
    public static final byte[] method2349(byte arg0, byte[] arg1) {
        field5297++;
        class289 var2 = new class289(arg1);
        if (arg0 >= -4) {
            method2352(23, -27);
        }
        int var3 = var2.method1861((byte) -72);
        int var4 = var2.method1856((byte) 93);
        if (var4 < 0 || !(class233.field3209 == 0 || class233.field3209 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1882(-126, var4, 0, var5);
            return var5;
        } else {
            int var6 = var2.method1856((byte) 72);
            if (var6 < 0 || !(class233.field3209 == 0 || class233.field3209 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class72.method620(var7, var6, arg1, var4, 9);
            } else {
                class407.field5682.method1378(116, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)I", line = 267)
    public static final int method2350(int arg0, int arg1, int arg2, int arg3) {
        field5298++;
        if (arg2 == arg3) {
            return arg2;
        } else if (arg1 == 32419) {
            int var4 = 128 - arg0;
            int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg0 >> 7;
            int var6 = (arg2 & 0x380) * var4 + (arg3 & 0x380) * arg0 >> 7;
            int var7 = (arg2 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg0 >> 7;
            return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 291)
    public static final void method2351(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field5299++;
        if (class60.field938 == null) {
            return;
        }
        if (class60.field938.field3345 == 1) {
            class60.field938 = null;
            return;
        }
        if (class60.field938.field3345 == 2) {
            class67.method585(-63, 2, class395.field5534, class192.field2754);
            class60.field938 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lis;", line = 319)
    public static final class39 method2352(int arg0, int arg1) {
        field5305++;
        class39 var2 = (class39) class397.field5559.method361((long) arg1, (byte) 95);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 0) {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class298.field4011.method2633(arg1, -1, 0);
            } else {
                var3 = class167.field2476.method2633(arg1 & 0x7FFF, arg0 - 1, 0);
            }
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method382(false, new class289(var3));
            }
            if (arg1 >= 32768) {
                var4.method380((byte) 89);
            }
            class397.field5559.method360(false, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)[B", line = 350)
    public final byte[] method2353(int arg0, int arg1) {
        if (arg1 != -14608) {
            this.method2355(124, (byte[]) null, 96, 50);
        }
        field5293++;
        class7 var3 = this.field5295;
        synchronized (this.field5295) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field5304.method47((byte) -123)) {
                    return null;
                }
                this.field5304.method40((long) (arg0 * 6), 31788);
                this.field5304.method42(0, class266.field3576, (byte) -17, 6);
                int var5 = (class266.field3576[0] & 0xFF << 16) + (class266.field3576[2] & 0xFF) + ((class266.field3576[1] & 0xFF) << 8);
                int var6 = (class266.field3576[5] & 0xFF) + ((class266.field3576[3] & 0xFF) << 16) + (class266.field3576[4] & 0xFF << 8);
                if (var5 < 0 || this.field5301 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field5295.method47((byte) 60) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5295.method40((long) (var6 * 520), 31788);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5295.method42(0, class266.field3576, (byte) -17, var13 + 8);
                        int var14 = (class266.field3576[0] & 0xFF << 8) + (class266.field3576[1] & 0xFF);
                        int var15 = ((class266.field3576[2] & 0xFF) << 8) + (class266.field3576[3] & 0xFF);
                        int var16 = (class266.field3576[6] & 0xFF) + ((class266.field3576[4] & 0xFF) << 16) + (class266.field3576[5] & 0xFF << 8);
                        int var17 = class266.field3576[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field5294 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field5295.method47((byte) 67) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class266.field3576[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZIB)I", line = 430)
    public static final int method2354(int arg0, boolean arg1, int arg2, byte arg3) {
        field5309++;
        class329 var4 = (class329) class19.field374.method614(-81, (long) arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 <= 67) {
            return 114;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field4472.length; var6++) {
                if (var4.field4472[var6] >= 0 && class128.field1824 > var4.field4472[var6]) {
                    class452 var7 = class234.method1569(2142, var4.field4472[var6]);
                    int var8 = var7.method2815((byte) 81, arg0, class345.method2186(arg0, (byte) 113).field3845);
                    if (arg1) {
                        var5 += var4.field4473[var6] * var8;
                    } else {
                        var5 += var8;
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BII)Z", line = 476)
    public final boolean method2355(int arg0, byte[] arg1, int arg2, int arg3) {
        field5300++;
        class7 var5 = this.field5295;
        synchronized (this.field5295) {
            if (arg3 < 0 || arg3 > this.field5301) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2346(arg3, arg1, (byte) -109, true, arg2);
            if (arg0 == 2) {
                if (!var6) {
                    var6 = this.method2346(arg3, arg1, (byte) -110, false, arg2);
                }
                return var6;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "toString", descriptor = "()Ljava/lang/String;", line = 502)
    public final String toString() {
        field5302++;
        return "Cache:" + this.field5294;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(ILfp;Lfp;I)V", line = 525)
    public class377(int arg0, class7 arg1, class7 arg2, int arg3) {
        this.field5295 = arg1;
        this.field5294 = arg0;
        this.field5301 = arg3;
        this.field5304 = arg2;
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V", line = 542)
    public static void method2356(int arg0) {
        if (arg0 != -19014) {
            method2347(-126);
        }
        field5308 = null;
        field5306 = null;
    }
}
