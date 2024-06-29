import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class391 implements class361 {

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lba;")
    private class607 field5434 = new class607(128);

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
    private int[] field5428 = new int[class642.field9326.field8527];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public int[] field5423 = new int[class642.field9326.field8527];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
    public static boolean field5418 = false;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[Lpm;")
    public static class129[] field5426 = new class129[128];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljr;")
    public static class441 field5427;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V")
    public static final void method2354(int arg0, int arg1) {
        field5419++;
        class632 var2 = class641.method3699(-103, arg0, arg1);
        var2.method3655(0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
    public static final void method2355(long[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        field5425++;
        if (arg3 > arg4) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg3; var11++) {
                if (((long) (var11 & var10) + var7) > arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method2355(arg0, arg1, arg2, var6 - 1, arg4);
            method2355(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg1 != 26727) {
            field5426 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZ)V")
    public final void method2356(int arg0, int arg1, boolean arg2) {
        field5430++;
        class208 var4 = class643.field9328.method1288(arg2, arg1);
        int var5 = var4.field2696;
        int var6 = var4.field2700;
        int var7 = var4.field2701;
        int var8 = class529.field7396[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2360(-111, var5, this.field5428[var5] & ~var9 | arg0 << var6 & var9);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public final int method2235(int arg0, int arg1) {
        int var3 = 90 % ((25 - arg1) / 63);
        field5432++;
        return this.field5423[arg0];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method2357(byte arg0) {
        field5426 = null;
        if (arg0 < 103) {
            method2354(36, 111);
        }
        field5427 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)I")
    public final int method2358(int arg0, boolean arg1) {
        field5429++;
        long var3 = class348.method2175(-127);
        int var5 = -35 % ((-arg0 - 44) / 43);
        for (class152 var6 = arg1 ? (class152) this.field5434.method3473(-27089) : (class152) this.field5434.method3478((byte) 5); var6 != null; var6 = (class152) this.field5434.method3478((byte) 5)) {
            if ((var6.field1996 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var6.field1996 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field1401;
                    this.field5423[var7] = this.field5428[var7];
                    var6.method589(-8880);
                    return var7;
                }
                var6.method589(-8880);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final void method2359(int arg0) {
        for (int var2 = 0; var2 < class642.field9326.field8527; var2++) {
            class606 var3 = class642.field9326.method3404(false, var2);
            if (var3 != null && var3.field8718 == 0) {
                this.field5428[var2] = 0;
                this.field5423[var2] = 0;
            }
        }
        field5431++;
        if (arg0 != -19839) {
            this.field5423 = null;
        }
        this.field5434 = new class607(128);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public final void method2360(int arg0, int arg1, int arg2) {
        this.field5428[arg1] = arg2;
        if (arg0 >= -108) {
            field5427 = null;
        }
        field5421++;
        class152 var4 = (class152) this.field5434.method3476((long) arg1, (byte) 28);
        if (var4 == null) {
            class152 var5 = new class152(4611686018427387905L);
            this.field5434.method3475(-92, var5, (long) arg1);
        } else if (var4.field1996 != 4611686018427387905L) {
            var4.field1996 = class348.method2175(-121) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static final void method2361(int arg0) {
        field5420++;
        if (arg0 != 5466) {
            method2361(-87);
        }
        if (class403.field5520 == 1 || class403.field5520 == 3 || class61.field845 != class403.field5520 && (class403.field5520 == 0 || class61.field845 == 0)) {
            class604.field8710 = 0;
            class551.field7652 = 0;
            class131.field1619.method3472((byte) -128);
        }
        class61.field845 = class403.field5520;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public final void method2362(byte arg0, int arg1, int arg2) {
        int var4 = 70 / ((arg0 - 25) / 32);
        field5417++;
        this.field5423[arg2] = arg1;
        class152 var5 = (class152) this.field5434.method3476((long) arg2, (byte) 28);
        if (var5 == null) {
            class152 var6 = new class152(class348.method2175(-123) + 500L);
            this.field5434.method3475(-116, var6, (long) arg2);
        } else {
            var5.field1996 = class348.method2175(-123) + 500L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public final void method2363(int arg0, int arg1, int arg2) {
        field5433++;
        class208 var4 = class643.field9328.method1288(true, arg1);
        int var5 = var4.field2696;
        if (arg2 != -4365) {
            this.method2360(-90, 101, 62);
        }
        int var6 = var4.field2700;
        int var7 = var4.field2701;
        int var8 = class529.field7396[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2362((byte) 93, this.field5423[var5] & ~var9 | arg0 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I")
    public final int method2236(int arg0, int arg1) {
        field5422++;
        class208 var3 = class643.field9328.method1288(true, arg1);
        int var4 = var3.field2696;
        if (arg0 == 2) {
            int var5 = var3.field2700;
            int var6 = var3.field2701;
            int var7 = class529.field7396[var6 - var5];
            return var7 & this.field5423[var4] >> var5;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method2364(byte arg0) {
        field5435++;
        if (arg0 <= 51) {
            return;
        }
        class118.method650(true, class106.field1376);
        class273.field3466++;
        class272.field3457.method3060(class207.method1324((byte) 94), -25098);
        class272.field3457.method3042(class502.field6955, -112);
        class272.field3457.method3042(class604.field8711, 112);
        class272.field3457.method3060(class501.field6954.field7858, -25098);
    }
}
