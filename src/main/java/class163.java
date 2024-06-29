import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class163 extends class104 {

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "Lvh;")
    public class252 field2675 = new class252();

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "Lpg;")
    public class71 field2683 = new class71();

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Llc;")
    private class80 field2665;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Ldf;")
    public static class51 field2662 = class46.method233("(Z", 100);

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Z")
    public static boolean field2669 = false;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Ldf;")
    public static class51 field2671 = class46.method233("<)4col> x", 100);

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lbg;")
    public static class217 field2664 = new class217(64);

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lu;")
    public static class111 field2663;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "Lqb;")
    public static class54 field2681;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()Lth;")
    public final class104 method493() {
        class198 var1 = (class198) this.field2675.method1720(true);
        field2674++;
        if (var1 == null) {
            return null;
        } else if (var1.field3322 == null) {
            return this.method490();
        } else {
            return var1.field3322;
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static final void method1146(int arg0) {
        field2682++;
        class63.field1024.method1350((byte) 117);
        if (arg0 != 98) {
            field2669 = false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public static final void method1147(int arg0) {
        if (class144.field2405[96]) {
            class85.field1428 += (-class85.field1428 - 24) / 2;
        } else if (class144.field2405[97]) {
            class85.field1428 += (24 - class85.field1428) / 2;
        } else {
            class85.field1428 /= 2;
        }
        if (class144.field2405[98]) {
            class96.field1586 += (12 - class96.field1586) / 2;
        } else if (class144.field2405[99]) {
            class96.field1586 += (-class96.field1586 - 12) / 2;
        } else {
            class96.field1586 /= 2;
        }
        class192.field3211 += class96.field1586 / 2;
        field2678++;
        if (arg0 < 106) {
            method1152((byte) 57);
        }
        int var1 = class234.field4080 + class44.field706.field4319;
        class120.field1993 += class85.field1428 / 2;
        int var2 = class44.field706.field4348 + class134.field2237;
        if ((class170.field2784 - var1) < -500 || class170.field2784 - var1 > 500 || (class118.field1977 - var2) < -500 || class118.field1977 - var2 > 500) {
            class170.field2784 = var1;
            class118.field1977 = var2;
        }
        if (class118.field1977 != var2) {
            class118.field1977 += (var2 - class118.field1977) / 16;
        }
        if (class170.field2784 != var1) {
            class170.field2784 += (var1 - class170.field2784) / 16;
        }
        class64.method429((byte) 65);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ldf;II)V")
    public static final void method1148(class51 arg0, int arg1, int arg2) {
        class95.field1575.method424((byte) 99, arg1);
        field2677++;
        class156.field2576++;
        class95.field1575.method866(arg2, (byte) 121);
        class95.field1575.method911(-1382577376, arg0.method316(arg1 - 101));
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILef;)V")
    private final void method1149(boolean arg0, int arg1, class198 arg2) {
        if (!arg0) {
            return;
        }
        if ((this.field2665.field1309[arg2.field3317] & 0x4) != 0 && arg2.field3312 < 0) {
            int var4 = this.field2665.field1313[arg2.field3317] / class156.field2568;
            int var5 = (var4 + 1048575 - arg2.field3324) / var4;
            arg2.field3324 = arg1 * var4 + arg2.field3324 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2665.field1292[arg2.field3317] == 0) {
                    arg2.field3322 = class81.method611(arg2.field3311, arg2.field3322.method629(), arg2.field3322.method608(), arg2.field3322.method631());
                } else {
                    arg2.field3322 = class81.method611(arg2.field3311, arg2.field3322.method629(), 0, arg2.field3322.method631());
                    this.field2665.method588((byte) -43, arg2, arg2.field3296.field307[arg2.field3309] < 0);
                }
                if (arg2.field3296.field307[arg2.field3309] < 0) {
                    arg2.field3322.method600(-1);
                }
                arg1 = arg2.field3324 / var4;
            }
        }
        arg2.field3322.method496(arg1);
        field2666++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[ILef;IBI)V")
    private final void method1150(int arg0, int[] arg1, class198 arg2, int arg3, byte arg4, int arg5) {
        field2673++;
        if (arg4 < 8) {
            field2669 = false;
        }
        if ((this.field2665.field1309[arg2.field3317] & 0x4) != 0 && arg2.field3312 < 0) {
            int var7 = this.field2665.field1313[arg2.field3317] / class156.field2568;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3324) / var7;
                if (var8 > arg5) {
                    arg2.field3324 += arg5 * var7;
                    break;
                }
                arg2.field3322.method498(arg1, arg0, var8);
                class81 var9 = arg2.field3322;
                arg5 -= var8;
                arg2.field3324 += var7 * var8 - 1048576;
                int var10 = class156.field2568 / 100;
                int var11 = 262144 / var7;
                arg0 += var8;
                if (var10 > var11) {
                    var10 = var11;
                }
                if (this.field2665.field1292[arg2.field3317] == 0) {
                    arg2.field3322 = class81.method611(arg2.field3311, var9.method629(), var9.method608(), var9.method631());
                } else {
                    arg2.field3322 = class81.method611(arg2.field3311, var9.method629(), 0, var9.method631());
                    this.field2665.method588((byte) -43, arg2, arg2.field3296.field307[arg2.field3309] < 0);
                    arg2.field3322.method633(var10, var9.method608());
                }
                if (arg2.field3296.field307[arg2.field3309] < 0) {
                    arg2.field3322.method600(-1);
                }
                var9.method614(var10);
                var9.method498(arg1, arg0, arg3 - arg0);
                if (var9.method634()) {
                    this.field2683.method495(var9);
                }
            }
        }
        arg2.field3322.method498(arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([III)V")
    public final void method498(int[] arg0, int arg1, int arg2) {
        field2672++;
        this.field2683.method498(arg0, arg1, arg2);
        for (class198 var4 = (class198) this.field2675.method1720(true); var4 != null; var4 = (class198) this.field2675.method1712((byte) 112)) {
            if (!this.field2665.method582((byte) 122, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3325) {
                        this.method1150(var5, arg0, var4, var5 + var6, (byte) 106, var6);
                        var4.field3325 -= var6;
                        break;
                    }
                    this.method1150(var5, arg0, var4, var5 + var6, (byte) 109, var4.field3325);
                    var5 += var4.field3325;
                    var6 -= var4.field3325;
                } while (!this.field2665.method585(var6, true, var4, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class32.field459 * arg3 + class128.field2150 * arg0 >> 16;
        int var6 = class128.field2150 * arg3 - class32.field459 * arg0 >> 16;
        int var7 = class261.field4560 * var6 + class246.field4266 * arg1 >> 16;
        int var8 = class261.field4560 * arg1 - class246.field4266 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class261.field4560 * var6 + class246.field4266 * arg2 >> 16;
        int var12 = class261.field4560 * arg2 - class246.field4266 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class42.field676 && var13 < class42.field676) {
            return false;
        } else if (var9 > class5.field39 && var13 > class5.field39) {
            return false;
        } else if (var10 < class188.field3154 && var14 < class188.field3154) {
            return false;
        } else {
            return var10 <= class236.field4116 || var14 <= class236.field4116;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2663 = null;
        field2681 = null;
        field2671 = null;
        if (arg0 != -115) {
            method1151(-87, 0, 9, 24, 25);
        }
        field2664 = null;
        field2662 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public final void method496(int arg0) {
        this.field2683.method496(arg0);
        field2676++;
        for (class198 var2 = (class198) this.field2675.method1720(true); var2 != null; var2 = (class198) this.field2675.method1712((byte) 112)) {
            if (!this.field2665.method582((byte) 115, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3325) {
                        this.method1149(true, var3, var2);
                        var2.field3325 -= var3;
                        break;
                    }
                    this.method1149(true, var2.field3325, var2);
                    var3 -= var2.field3325;
                } while (!this.field2665.method585(var3, true, var2, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()I")
    public final int method491() {
        field2670++;
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()Lth;")
    public final class104 method490() {
        field2667++;
        class198 var1;
        do {
            var1 = (class198) this.field2675.method1712((byte) 112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3322 == null);
        return var1.field3322;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILu;)Ltg;")
    public static final class171 method1153(int arg0, int arg1, int arg2, class111 arg3) {
        field2679++;
        if (class69.method480(arg0, 57, arg1, arg3)) {
            if (arg2 != -22081) {
                method1151(68, -91, -44, -126, 77);
            }
            return class133.method976(1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Llc;)V")
    public class163(class80 arg0) {
        this.field2665 = arg0;
    }
}
