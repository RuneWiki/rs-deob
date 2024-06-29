import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class212 {

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    private int field3401 = 0;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[Lq;")
    private class79[] field3396;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lck;")
    public static class119 field3383 = class298.method1987((byte) 98, "::noclip");

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[[I")
    public static int[][] field3378 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field3384 = new int[25];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[Z")
    public static boolean[] field3379 = new boolean[100];

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[Lck;")
    public static class119[] field3398 = new class119[500];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "J")
    private long field3387;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lml;")
    public static class134 field3377;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lq;")
    private class79 field3374;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Lq;")
    private class79 field3399;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
    public static int[] field3400;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Lq;", line = 4)
    public final class79 method1325(int arg0) {
        if (arg0 > -23) {
            this.field3374 = (class79) null;
        }
        this.field3401 = 0;
        field3385++;
        return this.method1332(-112);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JBLq;)V", line = 18)
    public final void method1326(long arg0, byte arg1, class79 arg2) {
        field3381++;
        if (arg2.field1215 != null) {
            arg2.method552((byte) -13);
        }
        class79 var5 = this.field3396[(int) ((long) (this.field3388 - 1) & arg0)];
        arg2.field1215 = var5.field1215;
        arg2.field1209 = var5;
        arg2.field1218 = arg0;
        if (arg1 < -99) {
            arg2.field1215.field1209 = arg2;
            arg2.field1209.field1215 = arg2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Lq;", line = 59)
    public final class79 method1327(byte arg0) {
        field3386++;
        if (this.field3374 == null) {
            return null;
        }
        int var2 = -11 / ((54 - arg0) / 38);
        class79 var3 = this.field3396[(int) (this.field3387 & (long) (this.field3388 - 1))];
        while (this.field3374 != var3) {
            if (this.field3374.field1218 == this.field3387) {
                class79 var4 = this.field3374;
                this.field3374 = this.field3374.field1209;
                return var4;
            }
            this.field3374 = this.field3374.field1209;
        }
        this.field3374 = null;
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 89)
    public static final void method1328(int arg0, int arg1, int arg2) {
        class6.field149.method966(0, 32);
        field3391++;
        class226.field3616++;
        if (arg1 != -26957) {
            method1330(-16);
        }
        class6.field149.method19((byte) 56, arg2);
        class6.field149.method26(arg0, 99);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BJ)Lq;", line = 105)
    public final class79 method1329(byte arg0, long arg1) {
        if (arg0 != 90) {
            field3379 = (boolean[]) null;
        }
        field3389++;
        this.field3387 = arg1;
        class79 var4 = this.field3396[(int) ((long) (this.field3388 - 1) & arg1)];
        for (this.field3374 = var4.field1209; this.field3374 != var4; this.field3374 = this.field3374.field1209) {
            if (this.field3374.field1218 == arg1) {
                class79 var5 = this.field3374;
                this.field3374 = this.field3374.field1209;
                return var5;
            }
        }
        this.field3374 = null;
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 142)
    public static final void method1330(int arg0) {
        class262.field4258 = new class104[arg0][class208.field3328][class103.field1569];
        class37.field554 = new int[class208.field3328][class103.field1569];
        class259.field4144 = new int[arg0][class208.field3328 + 1][class103.field1569 + 1];
        class25.field374 = new class145[arg0][];
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 156)
    public static void method1331(int arg0) {
        field3383 = null;
        if (arg0 != 0) {
            method1330(-109);
        }
        field3379 = null;
        field3400 = null;
        field3377 = null;
        field3384 = null;
        field3398 = null;
        field3378 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Lq;", line = 179)
    public final class79 method1332(int arg0) {
        field3392++;
        if (this.field3401 > 0 && this.field3396[this.field3401 - 1] != this.field3399) {
            class79 var2 = this.field3399;
            this.field3399 = var2.field1209;
            return var2;
        }
        class79 var3;
        do {
            if (this.field3388 <= this.field3401) {
                if (arg0 >= -14) {
                    this.field3396 = (class79[]) null;
                }
                return null;
            }
            var3 = this.field3396[this.field3401++].field1209;
        } while (this.field3396[this.field3401 - 1] == var3);
        this.field3399 = var3.field1209;
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([Lq;I)I", line = 221)
    public final int method1333(class79[] arg0, int arg1) {
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field3388; var4++) {
            class79 var5 = this.field3396[var4];
            for (class79 var6 = var5.field1209; var6 != var5; var6 = var6.field1209) {
                arg0[var3++] = var6;
            }
        }
        field3382++;
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 248)
    public final void method1334(byte arg0) {
        if (arg0 != -60) {
            this.method1333((class79[]) null, 111);
        }
        field3380++;
        for (int var2 = 0; var2 < this.field3388; var2++) {
            class79 var3 = this.field3396[var2];
            while (true) {
                class79 var4 = var3.field1209;
                if (var3 == var4) {
                    break;
                }
                var4.method552((byte) 102);
            }
        }
        this.field3399 = null;
        this.field3374 = null;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)[Lra;", line = 291)
    public static final class43[] method1335(int arg0) {
        field3373++;
        class43[] var1 = new class43[class285.field4706];
        for (int var2 = arg0; var2 < class285.field4706; var2++) {
            int var3 = class64.field1006[var2] * class232.field3741[var2];
            byte[] var4 = class247.field3989[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class161.field2553[class19.method151(255, var4[var6])];
            }
            var1[var2] = new class43(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], var5);
        }
        class162.method1035(-20432);
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 325)
    public static final void method1336(int arg0) {
        if (arg0 != 128) {
            field3398 = (class119[]) null;
        }
        class285.field4708.method486((byte) 93);
        field3394++;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V", line = 336)
    public static final void method1337(byte arg0) {
        if (arg0 < 65) {
            return;
        }
        int var1 = class257.field4133 - (int) ((double) class187.field2942.field2180 / class285.field4707);
        int var2 = (int) ((double) class187.field2942.field2180 / class285.field4707) + class257.field4133;
        field3395++;
        int var3 = (int) ((double) class187.field2942.field2057 / class285.field4707) + class162.field2561;
        int var4 = class162.field2561 - ((int) ((double) class187.field2942.field2057 / class285.field4707));
        if (var1 < 0) {
            class11.field195 = -1;
            class257.field4133 = (int) ((double) class187.field2942.field2180 / class285.field4707);
            class19.field242 = -1;
        }
        if (class126.field1938 < var2) {
            class11.field195 = -1;
            class257.field4133 = class126.field1938 - (int) ((double) class187.field2942.field2180 / class285.field4707);
            class19.field242 = -1;
        }
        if (var4 < 0) {
            class11.field195 = -1;
            class19.field242 = -1;
            class162.field2561 = (int) ((double) class187.field2942.field2057 / class285.field4707);
        }
        if (class258.field4137 < var3) {
            class162.field2561 = class258.field4137 - (int) ((double) class187.field2942.field2057 / class285.field4707);
            class19.field242 = -1;
            class11.field195 = -1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 385)
    public class212(int arg0) {
        this.field3388 = arg0;
        this.field3396 = new class79[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class79 var3 = this.field3396[var2] = new class79();
            var3.field1209 = var3;
            var3.field1215 = var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)I", line = 413)
    public final int method1338(int arg0) {
        field3390++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3388; var3++) {
            class79 var4 = this.field3396[var3];
            class79 var5 = var4.field1209;
            while (var4 != var5) {
                var5 = var5.field1209;
                var2++;
            }
        }
        if (arg0 > -42) {
            this.method1333((class79[]) null, -79);
        }
        return var2;
    }
}
