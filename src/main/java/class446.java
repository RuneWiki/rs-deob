import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class446 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lbo;")
    private class355 field6414 = new class355();

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lbo;")
    private class355 field6427 = new class355();

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lbo;")
    private class355 field6429 = new class355();

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lbo;")
    private class355 field6430 = new class355();

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lap;")
    private class289 field6432 = new class289(4);

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public volatile int field6435 = 0;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "B")
    private byte field6437 = 0;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public volatile int field6438 = 0;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Lap;")
    private class289 field6436 = new class289(8);

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field6416 = 0;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Loi;")
    public static class118 field6419 = new class118();

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field6423 = 0;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Lik;")
    public static class410 field6428 = new class410(64);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "J")
    private long field6431;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lrk;")
    public static class427 field6405;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lrk;")
    public static class427 field6426;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Luj;")
    private class440 field6439;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lee;")
    private class441 field6434;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public final void method2757(int arg0) {
        if (arg0 != 0) {
            this.method2757(-20);
        }
        if (this.field6434 != null) {
            this.field6434.method2741(5000);
        }
        field6412++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Lpr;")
    public static final class301 method2758(byte arg0) {
        field6409++;
        if (arg0 >= -2) {
            field6423 = 94;
        }
        try {
            return (class301) Class.forName("d").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final void method2759(int arg0) {
        field6418++;
        if (arg0 >= 104 && this.field6434 != null) {
            this.field6434.method2736(5000);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public final void method2760(byte arg0) {
        try {
            this.field6434.method2736(5000);
        } catch (Exception var2) {
        }
        field6413++;
        if (arg0 == -21) {
            this.field6437 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field6438 = -1;
            this.field6434 = null;
            this.field6435++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
    public static final void method2761(byte arg0, int arg1) {
        class134.field1913 = new int[class385.field5425];
        class236.field3283 = new byte[arg1][class116.field1621][class385.field5425];
        class422.field5901 = new byte[arg1][class116.field1621][class385.field5425];
        class438.field6281 = null;
        if (arg0 >= -15) {
            field6405 = null;
        }
        class334.field4534 = new int[5];
        class1.field4 = new int[class385.field5425];
        class77.field1152 = new byte[arg1][class116.field1621][class385.field5425];
        class236.field3287 = new byte[arg1][class116.field1621][class385.field5425];
        class399.field5586 = new int[class385.field5425];
        field6422++;
        class44.field703 = new int[arg1][class116.field1621 + 1][class385.field5425 + 1];
        class236.field3273 = new int[class385.field5425];
        class277.field3734 = new byte[arg1][class116.field1621 + 1][class385.field5425 + 1];
        client.field3447 = 99;
        class90.field1346 = new int[class385.field5425];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2762(int arg0, String arg1) {
        field6424++;
        if (class264.field3555 == null) {
            return;
        }
        class355.field4828.method1801(71, (byte) -54);
        class52.field851++;
        class355.field4828.method1824(110, class408.method2528(-105, arg1));
        if (arg0 <= 94) {
            method2758((byte) -11);
        }
        class355.field4828.method1827(0, arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
    public final boolean method2763(boolean arg0) {
        if (arg0) {
            field6415++;
            return this.method2765(0) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BZIIB)Luj;")
    public final class440 method2764(byte arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field6411++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class440 var8 = new class440();
        var8.field3984 = var6;
        var8.field1374 = arg1;
        var8.field6316 = arg0;
        if (arg1) {
            if (this.method2765(0) >= 20) {
                throw new RuntimeException();
            }
            this.field6414.method2244(11310, var8);
        } else if (this.method2767((byte) 119) < 20) {
            this.field6429.method2244(11310, var8);
        } else {
            throw new RuntimeException();
        }
        return arg4 == -60 ? var8 : null;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I")
    public final int method2765(int arg0) {
        field6425++;
        if (arg0 != 0) {
            this.method2770(-46);
        }
        return this.field6414.method2235((byte) 114) + this.field6427.method2235((byte) 114);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public final void method2766(byte arg0) {
        field6417++;
        if (this.field6434 == null) {
            return;
        }
        try {
            this.field6432.field3938 = 0;
            if (arg0 > -96) {
                this.field6414 = null;
            }
            this.field6432.method1824(67, 7);
            this.field6432.method1876(true, 0);
            this.field6434.method2737(this.field6432.field3882, 0, 4, -128);
        } catch (IOException var3) {
            try {
                this.field6434.method2736(5000);
            } catch (Exception var2) {
            }
            this.field6435++;
            this.field6434 = null;
            this.field6438 = -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
    private final int method2767(byte arg0) {
        field6407++;
        int var2 = -126 % ((arg0 - 40) / 50);
        return this.field6429.method2235((byte) 114) + this.field6430.method2235((byte) 114);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)V")
    public final void method2768(int arg0, boolean arg1) {
        field6408++;
        if (this.field6434 == null) {
            return;
        }
        try {
            this.field6432.field3938 = 0;
            this.field6432.method1824(110, arg1 ? 2 : 3);
            this.field6432.method1876(true, 0);
            this.field6434.method2737(this.field6432.field3882, arg0, 4, -125);
        } catch (IOException var4) {
            try {
                this.field6434.method2736(5000);
            } catch (Exception var3) {
            }
            this.field6434 = null;
            this.field6435++;
            this.field6438 = -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public static void method2769(boolean arg0) {
        field6405 = null;
        field6419 = null;
        field6426 = null;
        if (arg0) {
            field6428 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
    public final boolean method2770(int arg0) {
        field6420++;
        if (this.field6434 != null) {
            long var2 = class108.method902((byte) -93);
            int var4 = (int) (var2 - this.field6431);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6431 = var2;
            this.field6433 += var4;
            if (this.field6433 > 30000) {
                try {
                    this.field6434.method2736(5000);
                } catch (Exception var28) {
                }
                this.field6434 = null;
            }
        }
        if (this.field6434 == null) {
            return this.method2765(0) == 0 && this.method2767((byte) -101) == 0;
        }
        try {
            this.field6434.method2743((byte) 110);
            for (class440 var5 = (class440) this.field6414.method2234(9700); var5 != null; var5 = (class440) this.field6414.method2237((byte) -89)) {
                this.field6432.field3938 = 0;
                this.field6432.method1824(76, 1);
                this.field6432.method1876(true, (int) var5.field3984);
                this.field6434.method2737(this.field6432.field3882, 0, 4, -126);
                this.field6427.method2244(11310, var5);
            }
            for (class440 var6 = (class440) this.field6429.method2234(9700); var6 != null; var6 = (class440) this.field6429.method2237((byte) -74)) {
                this.field6432.field3938 = 0;
                this.field6432.method1824(124, 0);
                this.field6432.method1876(true, (int) var6.field3984);
                this.field6434.method2737(this.field6432.field3882, 0, 4, -126);
                this.field6430.method2244(11310, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6434.method2732(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6433 = 0;
                byte var9 = 0;
                if (this.field6439 == null) {
                    var9 = 8;
                } else if (this.field6439.field6317 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field6439.field6319.field3882.length - this.field6439.field6316;
                    int var11 = 512 - this.field6439.field6317;
                    if ((var10 - this.field6439.field6319.field3938) < var11) {
                        var11 = var10 - this.field6439.field6319.field3938;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field6434.method2733(this.field6439.field6319.field3938, this.field6439.field6319.field3882, 28, var11);
                    if (this.field6437 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field6439.field6319.field3882[this.field6439.field6319.field3938 + var12] = (byte) class331.method2109(this.field6439.field6319.field3882[this.field6439.field6319.field3938 + var12], this.field6437);
                        }
                    }
                    this.field6439.field6317 += var11;
                    this.field6439.field6319.field3938 += var11;
                    if (this.field6439.field6319.field3938 == var10) {
                        this.field6439.method1902(32);
                        this.field6439.field1384 = false;
                        this.field6439 = null;
                    } else if (this.field6439.field6317 == 512) {
                        this.field6439.field6317 = 0;
                    }
                } else {
                    int var13 = var9 - this.field6436.field3938;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field6434.method2733(this.field6436.field3938, this.field6436.field3882, 125, var13);
                    if (this.field6437 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field6436.field3882[this.field6436.field3938 + var14] = (byte) class331.method2109(this.field6436.field3882[this.field6436.field3938 + var14], this.field6437);
                        }
                    }
                    this.field6436.field3938 += var13;
                    if (var9 <= this.field6436.field3938) {
                        if (this.field6439 == null) {
                            this.field6436.field3938 = 0;
                            int var15 = this.field6436.method1861((byte) -72);
                            int var16 = this.field6436.method1853(-56);
                            int var17 = this.field6436.method1861((byte) -72);
                            int var18 = this.field6436.method1856((byte) 84);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class440 var24;
                            if (var20) {
                                for (var24 = (class440) this.field6430.method2234(9700); var24 != null && var24.field3984 != var21; var24 = (class440) this.field6430.method2237((byte) 67)) {
                                }
                            } else {
                                for (var24 = (class440) this.field6427.method2234(9700); var24 != null && var24.field3984 != var21; var24 = (class440) this.field6427.method2237((byte) -84)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field6439 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field6439.field6319 = new class289(var18 + this.field6439.field6316 + var25);
                            this.field6439.field6319.method1824(53, var19);
                            this.field6439.field6319.method1854(var18, true);
                            this.field6439.field6317 = 8;
                            this.field6436.field3938 = 0;
                        } else if (this.field6439.field6317 != 0) {
                            throw new IOException();
                        } else if (this.field6436.field3882[0] == -1) {
                            this.field6439.field6317 = 1;
                            this.field6436.field3938 = 0;
                        } else {
                            this.field6439 = null;
                        }
                    }
                }
            }
            int var26 = 81 % ((arg0 + 60) / 63);
            return true;
        } catch (IOException var29) {
            try {
                this.field6434.method2736(5000);
            } catch (Exception var27) {
            }
            this.field6434 = null;
            this.field6435++;
            this.field6438 = -2;
            return this.method2765(0) == 0 && this.method2767((byte) -18) == 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    private final void method2771(int arg0) {
        field6410++;
        if (this.field6434 == null) {
            return;
        }
        try {
            this.field6432.field3938 = 0;
            this.field6432.method1824(94, 6);
            this.field6432.method1876(true, 3);
            this.field6434.method2737(this.field6432.field3882, 0, arg0, -126);
        } catch (IOException var3) {
            try {
                this.field6434.method2736(5000);
            } catch (Exception var2) {
            }
            this.field6434 = null;
            this.field6435++;
            this.field6438 = -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZLee;)V")
    public final void method2772(int arg0, boolean arg1, class441 arg2) {
        if (this.field6434 != null) {
            try {
                this.field6434.method2736(5000);
            } catch (Exception var8) {
            }
            this.field6434 = null;
        }
        field6406++;
        this.field6434 = arg2;
        this.method2771(arg0 + 15366);
        this.method2768(arg0 ^ arg0, arg1);
        this.field6439 = null;
        this.field6436.field3938 = 0;
        while (true) {
            class440 var4 = (class440) this.field6427.method2243(0);
            if (var4 == null) {
                while (true) {
                    class440 var5 = (class440) this.field6430.method2243(0);
                    if (var5 == null) {
                        if (this.field6437 != 0) {
                            try {
                                this.field6432.field3938 = 0;
                                this.field6432.method1824(95, 4);
                                this.field6432.method1824(99, this.field6437);
                                this.field6432.method1877(true, 0);
                                this.field6434.method2737(this.field6432.field3882, 0, 4, -128);
                            } catch (IOException var7) {
                                try {
                                    this.field6434.method2736(5000);
                                } catch (Exception var6) {
                                }
                                this.field6434 = null;
                                this.field6435++;
                                this.field6438 = -2;
                            }
                        }
                        this.field6433 = 0;
                        this.field6431 = class108.method902((byte) -93);
                        return;
                    }
                    this.field6429.method2244(11310, var5);
                }
            }
            this.field6414.method2244(11310, var4);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)Z")
    public final boolean method2773(byte arg0) {
        field6404++;
        if (arg0 <= 55) {
            return false;
        } else {
            return this.method2767((byte) -20) >= 20;
        }
    }
}
