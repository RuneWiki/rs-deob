import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class196 extends class309 {

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[J")
    private long[] field3320 = new long[10];

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    private int field3324 = 0;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    private int field3314 = 256;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    private int field3316 = 1;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "J")
    private long field3327 = class293.method1985((byte) -71);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[F")
    public static float[] field3315 = new float[4];

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lmh;")
    public static class62 field3325 = class201.method1405(true, "hitbar_default");

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3326 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lhi;")
    public static class26 field3319;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[[B")
    public static byte[][] field3328;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1374(boolean arg0) {
        class249.field4226.method1395((byte) -43);
        if (arg0) {
            field3317++;
            class307.field5267.method1395((byte) -43);
            class275.field4672.method1395((byte) -43);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLsg;)Lsg;", line = 29)
    public static final class191 method1375(boolean arg0, class191 arg1) {
        field3322++;
        class191 var2 = client.method2053(arg1);
        if (var2 == null) {
            var2 = arg1.field3133;
        }
        if (arg0) {
            method1375(true, (class191) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 47)
    public final void method40(int arg0) {
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field3320[var2] = 0L;
        }
        field3323++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)I", line = 64)
    public final int method41(int arg0, int arg1, byte arg2) {
        int var4 = this.field3316;
        field3321++;
        this.field3316 = 1;
        int var5 = this.field3314;
        this.field3314 = 300;
        this.field3327 = class293.method1985((byte) -71);
        if (this.field3320[this.field3313] == 0L) {
            this.field3316 = var4;
            this.field3314 = var5;
        } else if (this.field3320[this.field3313] < this.field3327) {
            this.field3314 = (int) ((long) (arg1 * 2560) / (this.field3327 - this.field3320[this.field3313]));
        }
        if (this.field3314 < 25) {
            this.field3314 = 25;
        }
        if (this.field3314 > 256) {
            this.field3314 = 256;
            this.field3316 = (int) ((long) arg1 - (this.field3327 - this.field3320[this.field3313]) / 10L);
        }
        if (this.field3316 > arg1) {
            this.field3316 = arg1;
        }
        this.field3320[this.field3313] = this.field3327;
        this.field3313 = (this.field3313 + 1) % 10;
        if (arg2 != -30) {
            field3328 = (byte[][]) ((byte[][]) null);
        }
        if (this.field3316 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3320[var6] != 0L) {
                    this.field3320[var6] += (long) this.field3316;
                }
            }
        }
        if (this.field3316 < arg0) {
            this.field3316 = arg0;
        }
        class99.method792(-1, (long) this.field3316);
        int var7 = 0;
        while (this.field3324 < 256) {
            var7++;
            this.field3324 += this.field3314;
        }
        this.field3324 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 498)
    public class196() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3320[var1] = this.field3327;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 152)
    public static void method1376(byte arg0) {
        field3325 = null;
        if (arg0 >= -124) {
            method1377(-46, -117);
        }
        field3319 = null;
        field3328 = (byte[][]) null;
        field3315 = null;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)Lrg;", line = 167)
    public static final class270 method1377(int arg0, int arg1) {
        field3318++;
        if (arg0 != -35) {
            return (class270) null;
        } else if (arg1 == 0) {
            return new class69();
        } else if (arg1 == 1) {
            return new class7();
        } else if (arg1 == 2) {
            return new class30();
        } else if (arg1 == 3) {
            return new class182();
        } else if (arg1 == 4) {
            return new class283();
        } else if (arg1 == 5) {
            return new class243();
        } else if (arg1 == 6) {
            return new class63();
        } else if (arg1 == 7) {
            return new class284();
        } else if (arg1 == 8) {
            return new class99();
        } else if (arg1 == 9) {
            return new class57();
        } else if (arg1 == 10) {
            return new class215();
        } else if (arg1 == 11) {
            return new class105();
        } else if (arg1 == 12) {
            return new class184();
        } else if (arg1 == 13) {
            return new class12();
        } else if (arg1 == 14) {
            return new class101();
        } else if (arg1 == 15) {
            return new class81();
        } else if (arg1 == 16) {
            return new class140();
        } else if (arg1 == 17) {
            return new class212();
        } else if (arg1 == 18) {
            return new class4();
        } else if (arg1 == 19) {
            return new class163();
        } else if (arg1 == 20) {
            return new class298();
        } else if (arg1 == 21) {
            return new class2();
        } else if (arg1 == 22) {
            return new class102();
        } else if (arg1 == 23) {
            return new class55();
        } else if (arg1 == 24) {
            return new class174();
        } else if (arg1 == 25) {
            return new class300();
        } else if (arg1 == 26) {
            return new class260();
        } else if (arg1 == 27) {
            return new class195();
        } else if (arg1 == 28) {
            return new class162();
        } else if (arg1 == 29) {
            return new class73();
        } else if (arg1 == 30) {
            return new class36();
        } else if (arg1 == 31) {
            return new class233();
        } else if (arg1 == 32) {
            return new class261();
        } else if (arg1 == 33) {
            return new class254();
        } else if (arg1 == 34) {
            return new class262();
        } else if (arg1 == 35) {
            return new class183();
        } else if (arg1 == 36) {
            return new class181();
        } else if (arg1 == 37) {
            return new class207();
        } else if (arg1 == 38) {
            return new class108();
        } else if (arg1 == 39) {
            return new class245();
        } else {
            return null;
        }
    }
}
