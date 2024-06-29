import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class170 {

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    private int field2583 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[Lsm;")
    public class46[] field2573;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Z")
    public static boolean field2565 = true;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "J")
    private long field2579;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lpb;")
    public static class2 field2577;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lsm;")
    private class46 field2581;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lsm;")
    private class46 field2585;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[[B")
    public static byte[][] field2566;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 4)
    public static void method1220(int arg0) {
        if (arg0 != 31224) {
            method1220(97);
        }
        field2577 = null;
        field2566 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[Lsm;)I", line = 20)
    public final int method1221(byte arg0, class46[] arg1) {
        field2572++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2575; var4++) {
            class46 var5 = this.field2573[var4];
            for (class46 var6 = var5.field754; var6 != var5; var6 = var6.field754) {
                arg1[var3++] = var6;
            }
        }
        int var7 = -91 / ((-arg0 - 1) / 39);
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJ)Lsm;", line = 60)
    public final class46 method1222(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method1230(52);
        }
        this.field2579 = arg1;
        class46 var4 = this.field2573[(int) ((long) (this.field2575 - 1) & arg1)];
        this.field2581 = var4.field754;
        field2580++;
        while (this.field2581 != var4) {
            if (this.field2581.field758 == arg1) {
                class46 var5 = this.field2581;
                this.field2581 = this.field2581.field754;
                return var5;
            }
            this.field2581 = this.field2581.field754;
        }
        this.field2581 = null;
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Lsm;", line = 89)
    public final class46 method1223(byte arg0) {
        if (arg0 != 13) {
            field2566 = (byte[][]) ((byte[][]) null);
        }
        field2568++;
        if (this.field2583 > 0 && this.field2573[this.field2583 - 1] != this.field2585) {
            class46 var2 = this.field2585;
            this.field2585 = var2.field754;
            return var2;
        }
        class46 var3;
        do {
            if (this.field2575 <= this.field2583) {
                return null;
            }
            var3 = this.field2573[this.field2583++].field754;
        } while (this.field2573[this.field2583 - 1] == var3);
        this.field2585 = var3.field754;
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)I", line = 122)
    public final int method1224(boolean arg0) {
        field2569++;
        int var2 = 0;
        if (arg0) {
            this.field2585 = (class46) null;
        }
        for (int var3 = 0; var3 < this.field2575; var3++) {
            class46 var4 = this.field2573[var3];
            for (class46 var5 = var4.field754; var5 != var4; var5 = var5.field754) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 152)
    public static final void method1225(byte arg0) {
        field2584++;
        if (class17.field243 != null) {
            class17.field243.method225(true);
        }
        if (class315.field4917 != null) {
            class315.field4917.method225(true);
        }
        if (arg0 != -97) {
            field2577 = (class2) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 170)
    public final void method1226(int arg0) {
        field2567++;
        for (int var2 = arg0; var2 < this.field2575; var2++) {
            class46 var3 = this.field2573[var2];
            while (true) {
                class46 var4 = var3.field754;
                if (var3 == var4) {
                    break;
                }
                var4.method403(1);
            }
        }
        this.field2585 = null;
        this.field2581 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lsm;IJ)V", line = 209)
    public final void method1227(class46 arg0, int arg1, long arg2) {
        if (arg0.field756 != null) {
            arg0.method403(1);
        }
        field2570++;
        class46 var5 = this.field2573[(int) (arg2 & (long) (this.field2575 - 1))];
        arg0.field754 = var5;
        arg0.field756 = var5.field756;
        arg0.field758 = arg2;
        if (arg1 != 0) {
            this.method1228(true);
        }
        arg0.field756.field754 = arg0;
        arg0.field754.field756 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Lsm;", line = 229)
    public final class46 method1228(boolean arg0) {
        if (!arg0) {
            this.field2579 = 52L;
        }
        this.field2583 = 0;
        field2576++;
        return this.method1223((byte) 13);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 242)
    public final int method1229(int arg0) {
        if (arg0 < 63) {
            method1231(true, -46, 110, -98, (class281) null, -20);
        }
        field2574++;
        return this.field2575;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Lsm;", line = 256)
    public final class46 method1230(int arg0) {
        field2571++;
        if (this.field2581 == null) {
            return null;
        }
        class46 var2 = this.field2573[(int) (this.field2579 & (long) (this.field2575 - 1))];
        if (arg0 != 15229) {
            return (class46) null;
        }
        while (this.field2581 != var2) {
            if (this.field2581.field758 == this.field2579) {
                class46 var3 = this.field2581;
                this.field2581 = this.field2581.field754;
                return var3;
            }
            this.field2581 = this.field2581.field754;
        }
        this.field2581 = null;
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIILoh;I)V", line = 289)
    public static final void method1231(boolean arg0, int arg1, int arg2, int arg3, class281 arg4, int arg5) {
        field2578++;
        if (class61.field986 >= 50 || arg4 == null || arg4.field4319 == null || arg3 >= arg4.field4319.length || arg4.field4319[arg3] == null) {
            return;
        }
        int var6 = arg4.field4319[arg3][0];
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 8;
        if (arg4.field4319[arg3].length > 1) {
            int var9 = (int) ((double) arg4.field4319[arg3].length * Math.random());
            if (var9 > 0) {
                var8 = arg4.field4319[arg3][var9];
            }
        }
        int var10 = var6 >> 5 & 0x7;
        if (var7 == 0) {
            if (arg0) {
                class320.method2180(0, arg5 ^ 0x5EBE, var10, 255, var8);
            }
        } else if (class201.field3016 != 0) {
            int var11 = (arg1 - 64) / 128;
            class103.field1594[class61.field986] = var8;
            int var12 = (arg2 - 64) / 128;
            class342.field5330[class61.field986] = var10;
            if (arg5 != -24255) {
                method1232(true);
            }
            class19.field256[class61.field986] = 0;
            class267.field4168[class61.field986] = null;
            class117.field1784[class61.field986] = 255;
            class263.field4092[class61.field986] = (var12 << 8) + (var11 << 16) + var7;
            class61.field986++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 345)
    public class170(int arg0) {
        this.field2573 = new class46[arg0];
        this.field2575 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class46 var3 = this.field2573[var2] = new class46();
            var3.field754 = var3;
            var3.field756 = var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)Lin;", line = 376)
    public static final class168 method1232(boolean arg0) {
        field2582++;
        class168 var1 = new class168(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], class306.field4757[0], class63.field1002);
        if (arg0) {
            field2565 = true;
        }
        class7.method56((byte) 59);
        return var1;
    }
}
