import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class201 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[Lr;")
    private class301[] field3362;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field3373 = 0;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field3375 = 0;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3376 = "wave:";

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field3366 = new Random();

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "F")
    public static float field3378;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "J")
    private long field3364;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lek;")
    public static class206 field3379;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lr;")
    private class301 field3374;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field3370;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    public static boolean field3365;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[Lbn;")
    public static class75[] field3382;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1373(int arg0) {
        field3382 = null;
        field3379 = null;
        field3366 = null;
        field3370 = null;
        field3376 = null;
        if (arg0 != -2105) {
            field3378 = 0.0014112578F;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BJ)Lr;", line = 25)
    public final class301 method1374(byte arg0, long arg1) {
        field3372++;
        this.field3364 = arg1;
        class301 var4 = this.field3362[(int) (arg1 & (long) (this.field3377 - 1))];
        for (this.field3374 = var4.field4901; this.field3374 != var4; this.field3374 = this.field3374.field4901) {
            if (this.field3374.field4902 == arg1) {
                class301 var5 = this.field3374;
                this.field3374 = this.field3374.field4901;
                return var5;
            }
        }
        if (arg0 <= 119) {
            field3370 = (Font) null;
        }
        this.field3374 = null;
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLoe;)Lag;", line = 61)
    public static final class131 method1375(byte arg0, class146 arg1) {
        field3361++;
        if (arg0 < 121) {
            method1379(true);
        }
        class131 var2 = new class131();
        var2.field2265 = arg1.method989(123);
        var2.field2257 = class335.method2362(104, var2.field2265);
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZLr;J)V", line = 77)
    public final void method1376(boolean arg0, class301 arg1, long arg2) {
        if (arg1.field4903 != null) {
            arg1.method2152((byte) -117);
        }
        class301 var5 = this.field3362[(int) (arg2 & (long) (this.field3377 - 1))];
        arg1.field4903 = var5.field4903;
        arg1.field4902 = arg2;
        field3371++;
        if (!arg0) {
            this.field3362 = (class301[]) null;
        }
        arg1.field4901 = var5;
        arg1.field4903.field4901 = arg1;
        arg1.field4901.field4903 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILoe;)V", line = 99)
    public static final void method1377(int arg0, class146 arg1) {
        int var2 = -74 % ((12 - arg0) / 61);
        for (int var3 = 0; var3 < class351.field5615; var3++) {
            int var4 = arg1.method1020(true);
            int var5 = arg1.method989(126);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class212.field3509[var4] != null) {
                class212.field3509[var4].field3615 = var5;
            }
        }
        field3380++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(ILoe;)V", line = 126)
    public static final void method1378(int arg0, class146 arg1) {
        field3381++;
        if (arg1.field2496.length - arg1.field2435 < 1) {
            return;
        }
        int var2 = arg1.method1005((byte) 122);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field2496.length - arg1.field2435) < var3) {
            return;
        }
        class152.field2601 = arg1.method1005((byte) 122);
        if (class152.field2601 < 1) {
            class152.field2601 = 1;
        } else if (class152.field2601 > 4) {
            class152.field2601 = 4;
        }
        class127.method910((byte) 94, arg1.method1005((byte) 122) == 1);
        class166.field2784 = arg1.method1005((byte) 122) == 1;
        class349.field5590 = arg1.method1005((byte) 122) == 1;
        class136.field2333 = arg1.method1005((byte) 122) == 1;
        class53.field1060 = arg1.method1005((byte) 122) == 1;
        class359.field5723 = arg1.method1005((byte) 122) == 1;
        class358.field5697 = arg1.method1005((byte) 122) == 1;
        class252.field4143 = arg1.method1005((byte) 122) == 1;
        class111.field2032 = arg1.method1005((byte) 122);
        if (class111.field2032 > 2) {
            class111.field2032 = 2;
        }
        if (var2 >= 2) {
            class281.field4606 = arg1.method1005((byte) 122) == 1;
        } else {
            class281.field4606 = arg1.method1005((byte) 122) == 1;
            arg1.method1005((byte) 122);
        }
        class68.field1254 = arg1.method1005((byte) 122) == 1;
        int var4 = -95 % ((18 - arg0) / 62);
        class264.field4330 = arg1.method1005((byte) 122) == 1;
        class178.field2937 = arg1.method1005((byte) 122);
        if (class178.field2937 > 2) {
            class178.field2937 = 2;
        }
        class117.field2083 = class178.field2937;
        class277.field4519 = arg1.method1005((byte) 122) == 1;
        class8.field268 = arg1.method1005((byte) 122);
        if (class8.field268 > 127) {
            class8.field268 = 127;
        }
        class52.field1045 = arg1.method1005((byte) 122);
        class30.field706 = arg1.method1005((byte) 122);
        if (class30.field706 > 127) {
            class30.field706 = 127;
        }
        if (var2 >= 1) {
            class217.field3616 = arg1.method989(102);
            class146.field2459 = arg1.method989(67);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1005((byte) 122);
        }
        if (var2 >= 4) {
            int var5 = arg1.method1005((byte) 122);
            if (class58.field1148 < 96) {
                var5 = 0;
            }
            class214.method1488(var5);
        }
        if (var2 >= 5) {
            class97.field1761 = arg1.method1004(3);
        }
        if (var2 >= 6) {
            class135.field2318 = arg1.method1005((byte) 122);
        }
        if (var2 >= 7) {
            class171.field2832 = arg1.method1005((byte) 122) == 1;
        }
        if (var2 >= 8) {
            class151.field2559 = arg1.method1005((byte) 122) == 1;
        }
        if (var2 >= 9) {
            class248.field4071 = arg1.method1005((byte) 122);
        }
        if (var2 >= 10) {
            class133.field2281 = arg1.method1005((byte) 122) != 0;
        }
        if (var2 >= 11) {
            class115.field2080 = arg1.method1005((byte) 122) != 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(I)V", line = 298)
    public class201(int arg0) {
        this.field3362 = new class301[arg0];
        this.field3377 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class301 var3 = this.field3362[var2] = new class301();
            var3.field4901 = var3;
            var3.field4903 = var3;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 332)
    public static final void method1379(boolean arg0) {
        class280.field4575.method889((byte) -118);
        if (!arg0) {
            field3378 = 1.7171061F;
        }
        class108.field1986.method889((byte) 84);
        field3368++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Lr;", line = 346)
    public final class301 method1380(byte arg0) {
        field3367++;
        if (arg0 < 27) {
            method1373(109);
        }
        if (this.field3374 == null) {
            return null;
        }
        class301 var2 = this.field3362[(int) (this.field3364 & (long) (this.field3377 - 1))];
        while (this.field3374 != var2) {
            if (this.field3374.field4902 == this.field3364) {
                class301 var3 = this.field3374;
                this.field3374 = this.field3374.field4901;
                return var3;
            }
            this.field3374 = this.field3374.field4901;
        }
        this.field3374 = null;
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I", line = 380)
    public static final int method1381(int arg0, int arg1, int arg2) {
        field3363++;
        class353 var3 = (class353) class216.field3591.method2344(-1, (long) arg1);
        if (var3 == null) {
            return 0;
        }
        if (arg0 != 15195) {
            method1375((byte) 97, (class146) null);
        }
        if (arg2 == -1) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field5642.length; var5++) {
            if (var3.field5646[var5] == arg2) {
                var4 += var3.field5642[var5];
            }
        }
        return var4;
    }
}
