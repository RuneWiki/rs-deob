import java.awt.Container;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class717 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lmba;")
    private class441 field10382 = new class785();

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lmba;")
    private class441 field10388 = null;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field10399 = new String[] { method5232(method5231("=zMD{")), method5232(method5231("-6M\".")), method5232(method5231("(!\u000f\u0006")), method5232(method5231("-6M!.")), method5232(method5231("-6M/.")), method5232(method5231("-6M,.")), method5232(method5231("-6M#.")), method5232(method5231("-6M$.")), method5232(method5231("-6M(.")), method5232(method5231("-6M&.")), method5232(method5231("-6M-.")), method5232(method5231("-6M .")), method5232(method5231("-6M).")), method5232(method5231("-6M+.")), method5232(method5231("-6M..")), method5232(method5231("f|1\u000fe)\"\u0006\u0018c\"}C")), method5232(method5231("-6M\u0018s(|")), method5232(method5231("-6M'.")) };

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
    public static int[] field10393 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lel;")
    public static class573 field10377 = new class573(25, 4);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field10397 = new Random();

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    private int field10390;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field10391;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "J")
    private long field10386;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "J")
    private long field10394;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lgl;")
    private class626 field10392;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
    private String field10389;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Z")
    private boolean field10369;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
    private volatile boolean field10370;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[Lpja;")
    public static class43[] field10398;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[Lgl;")
    public static class626[] field10385;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)J", line = 3)
    public final long method5217(int arg0) {
        try {
            if (arg0 != 29723) {
                field10372 = -87;
            }
            field10396++;
            return this.field10394;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)I", line = 16)
    public final int method5218(int arg0) {
        try {
            field10379++;
            return arg0 == 16711680 ? this.field10391 : 115;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lmba;I)V", line = 27)
    public final synchronized void method5219(class441 arg0, int arg1) {
        try {
            if (arg1 >= -38) {
                this.field10388 = null;
            }
            this.field10388 = this.field10382;
            field10373++;
            this.field10382 = arg0;
            this.field10386 = class430.method3299(69);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10399[5] + (arg0 == null ? field10399[2] : field10399[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 40)
    public final void method5220(byte arg0) {
        try {
            if (arg0 > -114) {
                this.field10394 = 68L;
            }
            this.field10370 = true;
            field10395++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 53)
    public final synchronized void method5221(int arg0) {
        try {
            this.field10369 = true;
            if (arg0 > -1) {
                this.method5230(108L, true, null, -8, null);
            }
            field10387++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)I", line = 65)
    public final int method5222(boolean arg0) {
        try {
            field10380++;
            if (this.field10392 == null) {
                return 0;
            }
            if (!arg0) {
                this.method5226((byte) 67);
            }
            int var2 = this.field10392.method4649(3);
            if (this.field10392.field9153 && this.field10392.field9149 > this.field10390) {
                return this.field10390 + 1;
            } else if (var2 >= 0 && var2 < (field10385.length - 1)) {
                return this.field10392.field9159 == this.field10390 ? this.field10392.field9149 : this.field10392.field9159;
            } else {
                return 100;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10399[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 91)
    public static void method5223(int arg0) {
        try {
            field10377 = null;
            field10385 = null;
            if (arg0 == -1) {
                field10393 = null;
                field10398 = null;
                field10397 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10399[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILme;Lme;)V", line = 107)
    public static final void method5224(int arg0, class206 arg1, class206 arg2) {
        try {
            if (arg2.field3179 != null) {
                arg2.method1824(1);
            }
            field10376++;
            arg2.field3179 = arg1.field3179;
            arg2.field3180 = arg1;
            arg2.field3179.field3180 = arg2;
            arg2.field3180.field3179 = arg2;
            int var3 = -75 / ((75 - arg0) / 43);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10399[1] + arg0 + ',' + (arg1 == null ? field10399[2] : field10399[0]) + ',' + (arg2 == null ? field10399[2] : field10399[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Z", line = 125)
    public final synchronized boolean method5225(int arg0) {
        try {
            field10374++;
            int var2 = -108 / ((arg0 - 22) / 54);
            return this.field10382.method3390(false, this.field10386);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10399[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I", line = 141)
    public final int method5226(byte arg0) {
        try {
            if (arg0 == -76) {
                field10383++;
                return this.field10390;
            } else {
                return -111;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V", line = 153)
    public final void run() {
        try {
            while (!this.field10370) {
                long var1 = class430.method3299(106);
                synchronized (this) {
                    try {
                        this.field10391++;
                        if (this.field10382 instanceof class785) {
                            this.field10382.method3389(-90, this.field10369);
                        } else {
                            long var4 = class430.method3299(78);
                            if (class610.field8913 == null || this.field10388 == null || this.field10388.method3388(-31112) == 0 || this.field10386 < (var4 - ((long) this.field10388.method3388(-31112)))) {
                                if (this.field10388 != null) {
                                    this.field10369 = true;
                                    this.field10388.method3387((byte) -96);
                                    this.field10388 = null;
                                }
                                if (this.field10369) {
                                    class423.method3265((byte) -9);
                                    if (class610.field8913 != null) {
                                        class610.field8913.method483(0);
                                    }
                                }
                                this.field10382.method3389(-79, this.field10369 || class610.field8913 != null && class610.field8913.method503());
                            } else {
                                int var6 = (int) ((var4 - this.field10386) * 255L / (long) this.field10388.method3388(-31112));
                                int var7 = 255 - var6;
                                int var8 = var6 << 24 | 0xFFFFFF;
                                int var9 = var7 << 24 | 0xFFFFFF;
                                class423.method3265((byte) -9);
                                class610.field8913.method483(0);
                                class581 var10 = class610.field8913.method534(class179.field2489, class94.field1062, true);
                                class610.field8913.method587(-1, var10);
                                this.field10388.method3389(-127, true);
                                class610.field8913.method501();
                                var10.method999(0, 0, 0, var9, 1);
                                class610.field8913.method587(-1, var10);
                                class610.field8913.method483(0);
                                this.field10382.method3389(-119, true);
                                class610.field8913.method501();
                                var10.method999(0, 0, 0, var8, 1);
                            }
                            try {
                                if (class610.field8913 != null && !(this.field10382 instanceof class785)) {
                                    class610.field8913.method540(0);
                                }
                            } catch (class382 var19) {
                                class618.method4603((byte) -92, var19.getMessage() + field10399[15] + class43.field504.method1325((byte) -99), var19);
                                class640.method4693(0, -13558, true);
                            }
                        }
                        Container var12;
                        if (class376.field5730 != null) {
                            var12 = class376.field5730;
                        } else if (class629.field9206 == null) {
                            var12 = class277.field4174;
                        } else {
                            var12 = class629.field9206;
                        }
                        var12.getSize();
                        var12.getSize();
                        if (class376.field5730 == var12) {
                            class376.field5730.getInsets();
                        }
                        this.field10369 = false;
                        if (class610.field8913 != null && !(this.field10382 instanceof class785) && this.field10392.method4649(3) < class626.field9178.method4649(3)) {
                            class569.method4256(false);
                        }
                    } catch (Exception var20) {
                        continue;
                    }
                }
                long var13 = class430.method3299(92);
                int var15 = (int) (var1 + 20L - var13);
                if (var15 > 0) {
                    class151.method1269(false, (long) var15);
                }
            }
            field10384++;
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field10399[16] + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIILot;ILla;I)V", line = 281)
    public static final void method5227(boolean arg0, int arg1, int arg2, class616 arg3, int arg4, class476 arg5, int arg6) {
        try {
            field10375++;
            class638.method4683(arg1, arg5, 0, arg0, arg2, arg4);
            if (arg6 <= 69) {
                field10385 = null;
            }
            class494.field7093 = arg3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10399[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10399[2] : field10399[0]) + ',' + arg4 + ',' + (arg5 == null ? field10399[2] : field10399[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 294)
    public final String method5228(boolean arg0) {
        try {
            if (arg0) {
                return null;
            } else {
                field10371++;
                return this.field10389;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Lgl;", line = 313)
    public final class626 method5229(int arg0) {
        try {
            if (arg0 != 0) {
                this.method5228(true);
            }
            field10381++;
            return this.field10392;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10399[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZLgl;ILjava/lang/String;)V", line = 332)
    public final synchronized void method5230(long arg0, boolean arg1, class626 arg2, int arg3, String arg4) {
        try {
            this.field10394 = arg0;
            field10378++;
            this.field10389 = arg4;
            this.field10390 = arg3;
            if (!arg1) {
                this.field10392 = arg2;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10399[13] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10399[2] : field10399[0]) + ',' + arg3 + ',' + (arg4 == null ? field10399[2] : field10399[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5231(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5232(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
