import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class504 {

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Lpw;")
    private class649 field6894 = new class649();

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "Lpw;")
    private class649 field6898 = new class649();

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "Lpw;")
    private class649 field6900 = new class649();

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "Lpw;")
    private class649 field6901 = new class649();

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Ljr;")
    private class96 field6904 = new class96(4);

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "B")
    private byte field6908 = 0;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public volatile int field6907 = 0;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    public volatile int field6909 = 0;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "Ljr;")
    private class96 field6906 = new class96(8);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
    private int field6905;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "J")
    private long field6903;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "Lcga;")
    private class442 field6902;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "Lpi;")
    private class458 field6910;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2801(int arg0) {
        field6886++;
        if (arg0 > -24) {
            this.method2813(-98);
        }
        return this.method2813(0) >= 20;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V", line = 19)
    public static final void method2802(byte arg0) {
        field6895++;
        class499.method2792(class630.field8790, -121, (long) class239.field3440);
        if (class677.field9551 != -1) {
            class514.method2853(class677.field9551, -1);
        }
        for (int var1 = 0; var1 < class150.field2245; var1++) {
            if (class287.field3996[var1]) {
                class183.field2696[var1] = true;
            }
            class291.field4388[var1] = class287.field3996[var1];
            class287.field3996[var1] = false;
        }
        class19.field280 = class239.field3440;
        if (class630.field8790.method385()) {
            class318.field4711 = true;
        }
        if (class677.field9551 != -1) {
            class150.field2245 = 0;
            class9.method44(false);
        }
        class630.field8790.method449();
        if (arg0 >= -104) {
            method2802((byte) -27);
        }
        class53.method377(class630.field8790, -6136);
        int var2 = class13.method61(6227);
        if (var2 == -1) {
            var2 = class130.field1787;
        }
        if (var2 == -1) {
            var2 = class651.field9213;
        }
        class68.method557((byte) -128, var2);
        class371.field5290 = 0;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)V", line = 72)
    public final void method2803(byte arg0) {
        field6890++;
        if (this.field6902 == null) {
            return;
        }
        try {
            this.field6904.field1301 = 0;
            this.field6904.method746((byte) -128, 7);
            int var2 = 106 / ((81 - arg0) / 33);
            this.field6904.method758(0, 120);
            this.field6902.method2531(4, 0, 0, this.field6904.field1316);
        } catch (IOException var4) {
            try {
                this.field6902.method2529(-22272);
            } catch (Exception var3) {
            }
            this.field6902 = null;
            this.field6909 = -2;
            this.field6907++;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V", line = 99)
    private final void method2804(boolean arg0) {
        field6899++;
        if (this.field6902 == null) {
            return;
        }
        try {
            this.field6904.field1301 = 0;
            this.field6904.method746((byte) -117, 6);
            this.field6904.method758(3, 119);
            if (arg0) {
                this.field6900 = null;
            }
            this.field6902.method2531(4, 0, 0, this.field6904.field1316);
        } catch (IOException var3) {
            try {
                this.field6902.method2529(-22272);
            } catch (Exception var2) {
            }
            this.field6907++;
            this.field6909 = -2;
            this.field6902 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)I", line = 128)
    public final int method2805(int arg0) {
        field6891++;
        return arg0 == 0 ? this.field6894.method3612(true) + this.field6898.method3612(true) : 108;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V", line = 139)
    public final void method2806(boolean arg0, byte arg1) {
        if (arg1 >= -43) {
            return;
        }
        field6897++;
        if (this.field6902 == null) {
            return;
        }
        try {
            this.field6904.field1301 = 0;
            this.field6904.method746((byte) -113, arg0 ? 2 : 3);
            this.field6904.method758(0, 119);
            this.field6902.method2531(4, 0, 0, this.field6904.field1316);
        } catch (IOException var4) {
            try {
                this.field6902.method2529(-22272);
            } catch (Exception var3) {
            }
            this.field6902 = null;
            this.field6907++;
            this.field6909 = -2;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLcga;Z)V", line = 170)
    public final void method2807(byte arg0, class442 arg1, boolean arg2) {
        int var4 = -98 / ((arg0 + 28) / 49);
        if (this.field6902 != null) {
            try {
                this.field6902.method2529(-22272);
            } catch (Exception var9) {
            }
            this.field6902 = null;
        }
        field6887++;
        this.field6902 = arg1;
        this.method2804(false);
        this.method2806(arg2, (byte) -96);
        this.field6910 = null;
        this.field6906.field1301 = 0;
        while (true) {
            class458 var5 = (class458) this.field6898.method3613(-123);
            if (var5 == null) {
                while (true) {
                    class458 var6 = (class458) this.field6901.method3613(-122);
                    if (var6 == null) {
                        if (this.field6908 != 0) {
                            try {
                                this.field6904.field1301 = 0;
                                this.field6904.method746((byte) -107, 4);
                                this.field6904.method746((byte) -112, this.field6908);
                                this.field6904.method731(-2045573048, 0);
                                this.field6902.method2531(4, 0, 0, this.field6904.field1316);
                            } catch (IOException var8) {
                                try {
                                    this.field6902.method2529(-22272);
                                } catch (Exception var7) {
                                }
                                this.field6902 = null;
                                this.field6907++;
                                this.field6909 = -2;
                            }
                        }
                        this.field6905 = 0;
                        this.field6903 = class680.method3756(-79);
                        return;
                    }
                    this.field6900.method3615(-31531, var6);
                }
            }
            this.field6894.method3615(-31531, var5);
        }
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(B)V", line = 247)
    public final void method2808(byte arg0) {
        try {
            this.field6902.method2529(-22272);
            if (arg0 != 127) {
                this.method2812((byte) -78);
            }
        } catch (Exception var2) {
        }
        field6888++;
        this.field6902 = null;
        this.field6909 = -1;
        this.field6907++;
        this.field6908 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)Z", line = 265)
    public final boolean method2809(byte arg0) {
        field6892++;
        if (this.field6902 != null) {
            long var2 = class680.method3756(arg0 - 175);
            int var4 = (int) (var2 - this.field6903);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6903 = var2;
            this.field6905 += var4;
            if (this.field6905 > 30000) {
                try {
                    this.field6902.method2529(arg0 ^ 0xFFFFA966);
                } catch (Exception var27) {
                }
                this.field6902 = null;
            }
        }
        if (this.field6902 == null) {
            return this.method2805(arg0 - 102) == 0 && this.method2813(0) == 0;
        }
        try {
            this.field6902.method2530(true);
            for (class458 var5 = (class458) this.field6894.method3611(255); var5 != null; var5 = (class458) this.field6894.method3610(-30295)) {
                this.field6904.field1301 = 0;
                this.field6904.method746((byte) -126, 1);
                this.field6904.method758((int) var5.field9371, arg0 + 4);
                this.field6902.method2531(4, 0, arg0 ^ 0x66, this.field6904.field1316);
                this.field6898.method3615(-31531, var5);
            }
            for (class458 var6 = (class458) this.field6900.method3611(arg0 + 153); var6 != null; var6 = (class458) this.field6900.method3610(-30295)) {
                this.field6904.field1301 = 0;
                this.field6904.method746((byte) -92, 0);
                this.field6904.method758((int) var6.field9371, 124);
                this.field6902.method2531(4, 0, 0, this.field6904.field1316);
                this.field6901.method3615(arg0 - 31633, var6);
            }
            if (arg0 != 102) {
                return false;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6902.method2526((byte) -62);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6905 = 0;
                byte var9 = 0;
                if (this.field6910 == null) {
                    var9 = 8;
                } else if (this.field6910.field6492 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field6910.field6491.field1316.length - this.field6910.field6488;
                    int var11 = 512 - this.field6910.field6492;
                    if ((var10 - this.field6910.field6491.field1301) < var11) {
                        var11 = var10 - this.field6910.field6491.field1301;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field6902.method2528(this.field6910.field6491.field1301, this.field6910.field6491.field1316, var11, -9098);
                    if (this.field6908 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field6910.field6491.field1316[this.field6910.field6491.field1301 + var12] = (byte) class602.method3336(this.field6910.field6491.field1316[this.field6910.field6491.field1301 + var12], this.field6908);
                        }
                    }
                    this.field6910.field6491.field1301 += var11;
                    this.field6910.field6492 += var11;
                    if (this.field6910.field6491.field1301 == var10) {
                        this.field6910.method3691((byte) -119);
                        this.field6910.field9187 = false;
                        this.field6910 = null;
                    } else if (this.field6910.field6492 == 512) {
                        this.field6910.field6492 = 0;
                    }
                } else {
                    int var13 = var9 - this.field6906.field1301;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field6902.method2528(this.field6906.field1301, this.field6906.field1316, var13, -9098);
                    if (this.field6908 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field6906.field1316[this.field6906.field1301 + var14] = (byte) class602.method3336(this.field6906.field1316[this.field6906.field1301 + var14], this.field6908);
                        }
                    }
                    this.field6906.field1301 += var13;
                    if (var9 <= this.field6906.field1301) {
                        if (this.field6910 == null) {
                            this.field6906.field1301 = 0;
                            int var15 = this.field6906.method718(-115);
                            int var16 = this.field6906.method743((byte) -15);
                            int var17 = this.field6906.method718(arg0 + 8);
                            int var18 = this.field6906.method714(false);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class458 var24;
                            if (var20) {
                                for (var24 = (class458) this.field6901.method3611(255); var24 != null && var24.field9371 != var21; var24 = (class458) this.field6901.method3610(-30295)) {
                                }
                            } else {
                                for (var24 = (class458) this.field6898.method3611(255); var24 != null && var24.field9371 != var21; var24 = (class458) this.field6898.method3610(-30295)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field6910 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field6910.field6491 = new class96(var18 + this.field6910.field6488 + var25);
                            this.field6910.field6491.method746((byte) -104, var19);
                            this.field6910.field6491.method741(var18, (byte) 27);
                            this.field6906.field1301 = 0;
                            this.field6910.field6492 = 8;
                        } else if (this.field6910.field6492 != 0) {
                            throw new IOException();
                        } else if (this.field6906.field1316[0] == -1) {
                            this.field6906.field1301 = 0;
                            this.field6910.field6492 = 1;
                        } else {
                            this.field6910 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6902.method2529(-22272);
            } catch (Exception var26) {
            }
            this.field6907++;
            this.field6909 = -2;
            this.field6902 = null;
            return this.method2805(0) == 0 && this.method2813(0) == 0;
        }
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)Z", line = 539)
    public final boolean method2810(int arg0) {
        field6884++;
        if (arg0 <= 122) {
            method2802((byte) -107);
        }
        return this.method2805(0) >= 20;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZZIB)Lpi;", line = 551)
    public final class458 method2811(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        field6885++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class458 var8 = new class458();
        var8.field9371 = var6;
        var8.field6488 = arg4;
        var8.field9188 = arg2;
        if (!arg1) {
            this.method2807((byte) -125, null, false);
        }
        if (arg2) {
            if (this.method2805(0) >= 20) {
                throw new RuntimeException();
            }
            this.field6894.method3615(-31531, var8);
        } else if (this.method2813(0) < 20) {
            this.field6900.method3615(-31531, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(B)V", line = 594)
    public final void method2812(byte arg0) {
        if (arg0 != 26) {
            this.field6910 = null;
        }
        if (this.field6902 != null) {
            this.field6902.method2529(-22272);
        }
        field6893++;
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)I", line = 608)
    private final int method2813(int arg0) {
        field6889++;
        return arg0 == 0 ? this.field6900.method3612(true) + this.field6901.method3612(true) : 105;
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(B)V", line = 619)
    public final void method2814(byte arg0) {
        field6896++;
        if (arg0 < 74) {
            this.field6910 = null;
        }
        if (this.field6902 != null) {
            this.field6902.method2533(false);
        }
    }
}
