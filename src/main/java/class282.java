import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class282 extends class76 {

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "[J")
    private long[] field4461 = new long[10];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    private int field4464 = 0;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field4469 = 256;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    private int field4470 = 1;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "J")
    private long field4471 = class260.method1785((byte) -108);

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "[S")
    public static short[] field4475 = new short[256];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    private int field4463;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Ldl;")
    public static class123 field4462;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ldl;")
    public static class123 field4468;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[Lhc;")
    public static class229[] field4467;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 41 % ((79 - arg4) / 32);
        field4472++;
        if (arg5 >= class51.field710 && arg3 <= class96.field1484 && class110.field1669 <= arg2 && class189.field2984 >= arg1) {
            class93.method622(arg5, arg2, arg0, false, arg1, arg3);
        } else {
            class134.method909(arg2, arg3, arg0, 11121, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)I")
    public final int method514(int arg0, int arg1, byte arg2) {
        int var4 = this.field4470;
        this.field4470 = 1;
        field4465++;
        int var5 = this.field4469;
        if (arg2 > -52) {
            return -97;
        }
        this.field4469 = 300;
        this.field4471 = class260.method1785((byte) -107);
        if (this.field4461[this.field4463] == 0L) {
            this.field4469 = var5;
            this.field4470 = var4;
        } else if (this.field4461[this.field4463] < this.field4471) {
            this.field4469 = (int) ((long) (arg0 * 2560) / (this.field4471 - this.field4461[this.field4463]));
        }
        if (this.field4469 < 25) {
            this.field4469 = 25;
        }
        if (this.field4469 > 256) {
            this.field4469 = 256;
            this.field4470 = (int) ((long) arg0 - (this.field4471 - this.field4461[this.field4463]) / 10L);
        }
        if (this.field4470 > arg0) {
            this.field4470 = arg0;
        }
        this.field4461[this.field4463] = this.field4471;
        this.field4463 = (this.field4463 + 1) % 10;
        if (this.field4470 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4461[var6] != 0L) {
                    this.field4461[var6] += (long) this.field4470;
                }
            }
        }
        if (arg1 > this.field4470) {
            this.field4470 = arg1;
        }
        class170.method1183((long) this.field4470, (byte) 109);
        int var7 = 0;
        while (this.field4464 < 256) {
            var7++;
            this.field4464 += this.field4469;
        }
        this.field4464 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method516(int arg0) {
        field4474++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4461[var2] = 0L;
        }
        if (arg0 != -29395) {
            this.method514(51, 119, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static void method1883(int arg0) {
        field4475 = null;
        if (arg0 != 3) {
            field4462 = null;
        }
        field4468 = null;
        field4462 = null;
        field4467 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lef;IIIZ)V")
    public static final void method1884(class214 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = 14 % ((33 - arg2) / 43);
        field4466++;
        int var6 = arg0.field3473;
        if (arg0.field3468 == 0) {
            arg0.field3473 = arg0.field3426;
        } else if (arg0.field3468 == 1) {
            arg0.field3473 = arg3 - arg0.field3426;
        } else if (arg0.field3468 == 2) {
            arg0.field3473 = arg0.field3426 * arg3 >> 14;
        } else if (arg0.field3468 == 3) {
            if (arg0.field3447 == 2) {
                arg0.field3473 = arg0.field3426 * 32 + ((arg0.field3426 - 1) * arg0.field3354);
            } else if (arg0.field3447 == 7) {
                arg0.field3473 = (arg0.field3426 - 1) * arg0.field3354 + arg0.field3426 * 115;
            }
        }
        int var7 = arg0.field3369;
        if (arg0.field3363 == 0) {
            arg0.field3369 = arg0.field3486;
        } else if (arg0.field3363 == 1) {
            arg0.field3369 = arg1 - arg0.field3486;
        } else if (arg0.field3363 == 2) {
            arg0.field3369 = arg0.field3486 * arg1 >> 14;
        } else if (arg0.field3363 == 3) {
            if (arg0.field3447 == 2) {
                arg0.field3369 = (arg0.field3486 - 1) * arg0.field3402 + arg0.field3486 * 32;
            } else if (arg0.field3447 == 7) {
                arg0.field3369 = arg0.field3486 * 12 + ((arg0.field3486 - 1) * arg0.field3402);
            }
        }
        if (arg0.field3468 == 4) {
            arg0.field3473 = arg0.field3454 * arg0.field3369 / arg0.field3500;
        }
        if (arg0.field3363 == 4) {
            arg0.field3369 = arg0.field3500 * arg0.field3473 / arg0.field3454;
        }
        if (class22.field270 && (client.method1038(arg0).field1029 != 0 || arg0.field3447 == 0)) {
            if (arg0.field3369 < 5 && arg0.field3473 < 5) {
                arg0.field3473 = 5;
                arg0.field3369 = 5;
            } else {
                if (arg0.field3369 <= 0) {
                    arg0.field3369 = 5;
                }
                if (arg0.field3473 <= 0) {
                    arg0.field3473 = 5;
                }
            }
        }
        if (arg0.field3390 == 1337) {
            class175.field2732 = arg0;
        }
        if (arg4 && arg0.field3428 != null && arg0.field3473 != var6 || arg0.field3369 != var7) {
            class142 var8 = new class142();
            var8.field2079 = arg0;
            var8.field2086 = arg0.field3428;
            class175.field2735.method349(var8, true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1885(int arg0, boolean arg1) {
        class228.field3698 = true;
        if (arg1) {
            field4476 = -98;
        }
        class246.field3949 = arg0 + 1 & 0xFFFF;
        field4473++;
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class282() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4461[var1] = this.field4471;
        }
    }
}
