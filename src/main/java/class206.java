import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class206 {

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "La;")
    private class247 field3314 = new class247();

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "La;")
    private class247 field3318 = new class247();

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "La;")
    private class247 field3321 = new class247();

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "La;")
    private class247 field3322 = new class247();

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "Lhi;")
    private class264 field3326 = new class264(4);

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public volatile int field3329 = 0;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public volatile int field3327 = 0;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "B")
    private byte field3330 = 0;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Lhi;")
    private class264 field3328 = new class264(8);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static volatile int field3300 = 0;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3308 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3305 = -1;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3312 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    private int field3323;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "J")
    private long field3325;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Ltl;")
    private class186 field3324;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Lm;")
    private class41 field3331;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3313;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public static int[] field3307;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public final void method1379(int arg0, boolean arg1) {
        if (arg0 != -17587) {
            return;
        }
        field3310++;
        if (this.field3324 == null) {
            return;
        }
        try {
            this.field3326.field4195 = 0;
            this.field3326.method1757(arg1 ? 2 : 3, (byte) -8);
            this.field3326.method1778((byte) 126, 0);
            this.field3324.method1272(4, 0, this.field3326.field4198, -75);
        } catch (IOException var4) {
            try {
                this.field3324.method1276(-1);
            } catch (Exception var3) {
            }
            this.field3327 = -2;
            this.field3329++;
            this.field3324 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public final void method1380(byte arg0) {
        field3298++;
        if (this.field3324 == null) {
            return;
        }
        try {
            this.field3326.field4195 = 0;
            this.field3326.method1757(7, (byte) -81);
            if (arg0 != 24) {
                this.field3323 = -44;
            }
            this.field3326.method1778((byte) 126, 0);
            this.field3324.method1272(4, 0, this.field3326.field4198, -127);
        } catch (IOException var3) {
            try {
                this.field3324.method1276(-1);
            } catch (Exception var2) {
            }
            this.field3327 = -2;
            this.field3324 = null;
            this.field3329++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
    public final boolean method1381(boolean arg0) {
        if (arg0) {
            this.method1384(-92);
        }
        field3309++;
        return this.method1384(3) >= 20;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILtl;Z)V")
    public final void method1382(int arg0, class186 arg1, boolean arg2) {
        if (this.field3324 != null) {
            try {
                this.field3324.method1276(-1);
            } catch (Exception var9) {
            }
            this.field3324 = null;
        }
        int var4 = 2 / ((arg0 + 42) / 63);
        field3317++;
        this.field3324 = arg1;
        this.method1394(-110);
        this.method1379(-17587, arg2);
        this.field3331 = null;
        this.field3328.field4195 = 0;
        while (true) {
            class41 var5 = (class41) this.field3318.method1633((byte) -71);
            if (var5 == null) {
                while (true) {
                    class41 var6 = (class41) this.field3322.method1633((byte) -71);
                    if (var6 == null) {
                        if (this.field3330 != 0) {
                            try {
                                this.field3326.field4195 = 0;
                                this.field3326.method1757(4, (byte) -67);
                                this.field3326.method1757(this.field3330, (byte) -71);
                                this.field3326.method1761(0, 4334);
                                this.field3324.method1272(4, 0, this.field3326.field4198, -126);
                            } catch (IOException var8) {
                                try {
                                    this.field3324.method1276(-1);
                                } catch (Exception var7) {
                                }
                                this.field3327 = -2;
                                this.field3324 = null;
                                this.field3329++;
                            }
                        }
                        this.field3323 = 0;
                        this.field3325 = class182.method1253(20215);
                        return;
                    }
                    this.field3321.method1634((byte) 66, var6);
                }
            }
            this.field3314.method1634((byte) 81, var5);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static void method1383(byte arg0) {
        if (arg0 != 99) {
            method1385(-20, '\u0012');
        }
        field3312 = null;
        field3308 = null;
        field3313 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
    private final int method1384(int arg0) {
        if (arg0 == 3) {
            field3297++;
            return this.field3321.method1638(arg0 ^ 0x2) + this.field3322.method1638(1);
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IC)Z")
    public static final boolean method1385(int arg0, char arg1) {
        field3316++;
        if (arg0 != 22882) {
            field3307 = null;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public final void method1386(byte arg0) {
        if (this.field3324 != null) {
            this.field3324.method1279(arg0 + 8496);
        }
        field3303++;
        if (arg0 != -99) {
            method1383((byte) 77);
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
    public final void method1387(byte arg0) {
        if (arg0 != -98) {
            return;
        }
        try {
            this.field3324.method1276(-1);
        } catch (Exception var2) {
        }
        field3319++;
        this.field3327 = -1;
        this.field3330 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3324 = null;
        this.field3329++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
    public final boolean method1388(int arg0) {
        if (this.field3324 != null) {
            long var2 = class182.method1253(20215);
            int var4 = (int) (var2 - this.field3325);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3323 += var4;
            this.field3325 = var2;
            if (this.field3323 > 30000) {
                try {
                    this.field3324.method1276(-1);
                } catch (Exception var27) {
                }
                this.field3324 = null;
            }
        }
        field3302++;
        if (this.field3324 == null) {
            return this.method1393(256) == 0 && this.method1384(3) == 0;
        }
        try {
            this.field3324.method1278((byte) 127);
            for (class41 var5 = (class41) this.field3314.method1635(-28); var5 != null; var5 = (class41) this.field3314.method1636((byte) -93)) {
                this.field3326.field4195 = 0;
                this.field3326.method1757(1, (byte) 111);
                this.field3326.method1778((byte) 127, (int) var5.field2817);
                this.field3324.method1272(4, 0, this.field3326.field4198, -71);
                this.field3318.method1634((byte) 80, var5);
            }
            for (class41 var6 = (class41) this.field3321.method1635(arg0 - 75); var6 != null; var6 = (class41) this.field3321.method1636((byte) -105)) {
                this.field3326.field4195 = 0;
                this.field3326.method1757(0, (byte) 112);
                this.field3326.method1778((byte) 124, (int) var6.field2817);
                this.field3324.method1272(4, 0, this.field3326.field4198, arg0 - 109);
                this.field3322.method1634((byte) 70, var6);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field3324.method1274(29491);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3323 = 0;
                byte var9 = 0;
                if (this.field3331 == null) {
                    var9 = 8;
                } else if (this.field3331.field487 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3328.field4195;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field3324.method1275(var10, this.field3328.field4198, arg0 ^ 0x2FEB, this.field3328.field4195);
                    if (this.field3330 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3328.field4198[this.field3328.field4195 + var11] = (byte) class223.method1477(this.field3328.field4198[this.field3328.field4195 + var11], this.field3330);
                        }
                    }
                    this.field3328.field4195 += var10;
                    if (var9 <= this.field3328.field4195) {
                        if (this.field3331 == null) {
                            this.field3328.field4195 = 0;
                            int var12 = this.field3328.method1779(-105);
                            int var13 = this.field3328.method1777(-64);
                            int var14 = this.field3328.method1779(-92);
                            int var15 = var14 & 0x7F;
                            int var16 = this.field3328.method1765((byte) 126);
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class41 var21;
                            if (var17) {
                                for (var21 = (class41) this.field3322.method1635(arg0 - 72); var21 != null && var21.field2817 != var18; var21 = (class41) this.field3322.method1636((byte) -123)) {
                                }
                            } else {
                                for (var21 = (class41) this.field3318.method1635(arg0 ^ 0xFFFFFFDF); var21 != null && var21.field2817 != var18; var21 = (class41) this.field3318.method1636((byte) -89)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3331 = var21;
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field3331.field484 = new class264(var16 + var22 + this.field3331.field479);
                            this.field3331.field484.method1757(var15, (byte) 123);
                            this.field3331.field484.method1789((byte) -38, var16);
                            this.field3331.field487 = 8;
                            this.field3328.field4195 = 0;
                        } else if (this.field3331.field487 != 0) {
                            throw new IOException();
                        } else if (this.field3328.field4198[0] == -1) {
                            this.field3331.field487 = 1;
                            this.field3328.field4195 = 0;
                        } else {
                            this.field3331 = null;
                        }
                    }
                } else {
                    int var23 = this.field3331.field484.field4198.length - this.field3331.field479;
                    int var24 = 512 - this.field3331.field487;
                    if (var24 > var23 - this.field3331.field484.field4195) {
                        var24 = var23 - this.field3331.field484.field4195;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field3324.method1275(var24, this.field3331.field484.field4198, arg0 + 12267, this.field3331.field484.field4195);
                    if (this.field3330 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3331.field484.field4198[this.field3331.field484.field4195 + var25] = (byte) class223.method1477(this.field3331.field484.field4198[this.field3331.field484.field4195 + var25], this.field3330);
                        }
                    }
                    this.field3331.field484.field4195 += var24;
                    this.field3331.field487 += var24;
                    if (this.field3331.field484.field4195 == var23) {
                        this.field3331.method1213(true);
                        this.field3331.field998 = false;
                        this.field3331 = null;
                    } else if (this.field3331.field487 == 512) {
                        this.field3331.field487 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3324.method1276(~arg0);
            } catch (Exception var26) {
            }
            this.field3329++;
            this.field3327 = -2;
            this.field3324 = null;
            return this.method1393(256) == 0 && this.method1384(arg0 ^ 0x3) == 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static final void method1389(int arg0) {
        if (class50.field709 == null || class272.field4388 == null) {
            class50.field709 = new int[256];
            class272.field4388 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class50.field709[var1] = (int) (Math.sin(var2) * 4096.0D);
                class272.field4388[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3304++;
        if (arg0 != 4096) {
            field3313 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public final void method1390(int arg0) {
        field3301++;
        if (arg0 == 4 && this.field3324 != null) {
            this.field3324.method1276(-1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)Z")
    public final boolean method1391(int arg0) {
        if (arg0 == 3) {
            field3311++;
            return this.method1393(256) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public static final String method1392(int[] arg0, int arg1, int arg2, long arg3) {
        field3315++;
        if (class100.field1524 != null) {
            String var5 = class100.field1524.method956(arg3, arg0, 0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 <= 44) {
            method1389(-22);
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)I")
    public final int method1393(int arg0) {
        field3306++;
        if (arg0 != 256) {
            this.method1393(-107);
        }
        return this.field3314.method1638(1) + this.field3318.method1638(1);
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
    private final void method1394(int arg0) {
        field3299++;
        if (this.field3324 == null) {
            return;
        }
        try {
            this.field3326.field4195 = 0;
            this.field3326.method1757(6, (byte) 124);
            if (arg0 < -94) {
                this.field3326.method1778((byte) 127, 3);
                this.field3324.method1272(4, 0, this.field3326.field4198, -123);
            }
        } catch (IOException var3) {
            try {
                this.field3324.method1276(-1);
            } catch (Exception var2) {
            }
            this.field3327 = -2;
            this.field3324 = null;
            this.field3329++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZIIBB)Lm;")
    public final class41 method1395(boolean arg0, int arg1, int arg2, byte arg3, byte arg4) {
        field3320++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class41 var8 = new class41();
        var8.field479 = arg4;
        var8.field2817 = var6;
        var8.field999 = arg0;
        if (arg0) {
            if (this.method1393(256) >= 20) {
                throw new RuntimeException();
            }
            this.field3314.method1634((byte) 28, var8);
        } else if (this.method1384(3) < 20) {
            this.field3321.method1634((byte) 70, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg3 > -110) {
            this.method1395(false, -45, 11, (byte) 43, (byte) -109);
        }
        return var8;
    }
}
