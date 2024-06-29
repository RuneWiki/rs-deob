import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class265 extends class123 {

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Lfd;")
    private class61 field4472 = null;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    private int field4474 = -1;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    private int field4460 = -32768;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    private int field4481 = -1;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    private int field4475 = 0;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "Z")
    private boolean field4488 = true;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    private int field4485 = 0;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field4483 = 0;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    private int field4467;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Ls;")
    private class96 field4469;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    private int field4470;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Lmh;")
    public static class62 field4471 = class201.method1405(true, "mem=");

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4479 = 1;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "Lmh;")
    public static class62 field4489 = class201.method1405(true, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "Lmh;")
    public static class62 field4487 = class201.method1405(true, "Hierhin gehen");

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 5)
    public static void method1824(int arg0) {
        field4489 = null;
        field4487 = null;
        field4471 = null;
        if (arg0 != 16) {
            method1830(3, 99, 24, (class191) null, 86, -57, -112, -122);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)V", line = 29)
    public static final void method1825(long arg0, int arg1) {
        field4477++;
        if (arg0 == 0L) {
            return;
        }
        if (class141.field2269 >= 100) {
            class116.method901(0, class275.field4694, class153.field2420, (byte) 59);
            return;
        }
        class62 var3 = class170.method1227(0, arg0).method419(28768);
        for (int var4 = 0; var4 < class141.field2269; var4++) {
            if (class55.field808[var4] == arg0) {
                class116.method901(0, class275.field4694, class254.method1772(new class62[] { var3, class267.field4520 }, 0), (byte) 73);
                return;
            }
        }
        for (int var5 = 0; var5 < class190.field3042; var5++) {
            if (class64.field963[var5] == arg0) {
                class116.method901(0, class275.field4694, class254.method1772(new class62[] { class240.field4087, var3, class197.field3330 }, 0), (byte) 104);
                return;
            }
        }
        if (var3.method446((byte) 78, class268.field4551.field2430)) {
            class116.method901(0, class275.field4694, class263.field4432, (byte) 91);
            return;
        }
        class55.field808[class141.field2269] = arg0;
        class184.field2952[class141.field2269++] = class170.method1227(0, arg0);
        class17.field153 = class105.field1716;
        class170.field2772.method1693(arg1, false);
        class170.field2772.method694(arg0, (byte) -34);
        class208.field3532++;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 93)
    public final void method1826(int arg0) {
        field4465++;
        if (this.field4472 != null) {
            class168.method1204(this.field4472, this.field4485, this.field4483, this.field4475);
        }
        this.field4481 = -1;
        this.field4474 = arg0;
        this.field4472 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 107)
    public static final void method1827(int arg0) {
        field4459++;
        if (arg0 == -1) {
            class275.field4672.method1395((byte) -43);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Ljm;", line = 130)
    private final class123 method1828(int arg0) {
        field4464++;
        if (arg0 != -31153) {
            this.method1826(-127);
        }
        return this.method1831(false, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIB)V", line = 144)
    public final void method939(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4461++;
        this.method1831(false, true);
        int var6 = 114 / ((arg4 + 29) / 62);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIZLjm;)V", line = 491)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class123 arg8) {
        this.field4478 = arg0;
        this.field4484 = arg1;
        this.field4473 = arg2;
        this.field4462 = arg4;
        this.field4476 = arg3;
        this.field4467 = arg5;
        if (arg8 != null) {
            if ((arg8 instanceof class265)) {
                ((class265) arg8).method1826(-1);
            } else {
                class216 var10 = class252.method1755(this.field4478, (byte) -28);
                if (var10.field3709 != null) {
                    var10 = var10.method1526(39);
                }
                if (var10 != null) {
                    class15.method59(0, this.field4473, this.field4476, var10, this.field4467, this.field4462, 0, this.field4484, -29827);
                }
            }
        }
        if (arg6 != -1) {
            this.field4469 = class151.method1085(arg6, (byte) 113);
            this.field4470 = 0;
            this.field4468 = class199.field3367 - 1;
            if (this.field4469.field1571 == 0 && arg8 != null && arg8 instanceof class265) {
                class265 var11 = (class265) arg8;
                if (this.field4469 == var11.field4469) {
                    this.field4470 = var11.field4470;
                    this.field4468 = var11.field4468;
                    return;
                }
            }
            if (arg7 && this.field4469.field1568 != -1) {
                this.field4470 = (int) (Math.random() * (double) this.field4469.field1586.length);
                this.field4468 -= (int) ((double) this.field4469.field1555[this.field4470] * Math.random());
            }
        }
        if (arg8 != null) {
            this.method1831(false, true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 163)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class123 var11 = this.method1828(-31153);
        field4486++;
        if (var11 != null) {
            var11.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4460 = var11.method278();
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I", line = 176)
    public final int method278() {
        field4463++;
        return this.field4460;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V", line = 184)
    private final void method1829(int arg0, int arg1, byte arg2) {
        if (this.field4469 != null) {
            int var4 = class199.field3367 - this.field4468;
            if (var4 > 100 && this.field4469.field1568 > 0) {
                int var5 = this.field4469.field1586.length - this.field4469.field1568;
                while (var5 > this.field4470 && var4 > this.field4469.field1555[this.field4470]) {
                    var4 -= this.field4469.field1555[this.field4470];
                    this.field4470++;
                }
                if (this.field4470 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4469.field1586.length; var7++) {
                        var6 += this.field4469.field1555[var7];
                    }
                    var4 %= var6;
                }
            }
            label57: {
                do {
                    do {
                        if (var4 <= this.field4469.field1555[this.field4470]) {
                            break label57;
                        }
                        class113.method881(this.field4469, arg0, arg1, false, (byte) -34, this.field4470);
                        var4 -= this.field4469.field1555[this.field4470];
                        this.field4470++;
                    } while (this.field4469.field1586.length > this.field4470);
                    this.field4470 -= this.field4469.field1568;
                } while (this.field4470 >= 0 && this.field4470 < this.field4469.field1586.length);
                this.field4469 = null;
            }
            this.field4468 = class199.field3367 - var4;
        }
        field4457++;
        int var8 = -57 % ((-arg2 - 21) / 48);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILsg;IIII)V", line = 267)
    public static final void method1830(int arg0, int arg1, int arg2, class191 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 18218) {
            return;
        }
        field4480++;
        if (class144.field2301) {
            class100.field1652 = 32;
        } else {
            class100.field1652 = 0;
        }
        class144.field2301 = false;
        if (class127.field2106 != 0) {
            if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg2 && arg0 < arg2 + 16) {
                arg3.field3188 -= 4;
                class250.method1744(arg3, (byte) -61);
            } else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg2 + arg4 - 16 <= arg0 && arg0 < (arg2 + arg4)) {
                arg3.field3188 += 4;
                class250.method1744(arg3, (byte) -61);
            } else if ((arg5 - class100.field1652) <= arg1 && (arg5 + class100.field1652 + 16) > arg1 && arg2 + 16 <= arg0 && arg4 + arg2 - 16 > arg0) {
                int var8 = (arg4 - 32) * arg4 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - (var8 / 2) - arg2 - 16;
                int var10 = arg4 - var8 - 32;
                arg3.field3188 = (arg6 - arg4) * var9 / var10;
                class250.method1744(arg3, (byte) 97);
                class144.field2301 = true;
            }
        }
        if (class269.field4565 == 0) {
            return;
        }
        int var11 = arg3.field3190;
        if ((arg5 - var11) <= arg1 && arg0 >= arg2 && arg1 < arg5 + 16 && arg0 <= (arg2 + arg4)) {
            arg3.field3188 += class269.field4565 * 45;
            class250.method1744(arg3, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)Ljm;", line = 331)
    private final class123 method1831(boolean arg0, boolean arg1) {
        field4458++;
        if (arg0) {
            return (class123) null;
        }
        boolean var3 = class72.field1106 != class37.field569;
        class216 var4 = class252.method1755(this.field4478, (byte) -115);
        if (var4.field3709 != null) {
            var4 = var4.method1526(-79);
        }
        if (var4 == null) {
            if (!var3) {
                this.method1826(-1);
            }
            return null;
        }
        int var5 = this.field4473 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3669;
            var7 = var4.field3676;
        } else {
            var6 = var4.field3676;
            var7 = var4.field3669;
        }
        int var8 = (var7 + 1 >> 1) + this.field4462;
        int var9 = (var6 >> 1) + this.field4467;
        int var10 = this.field4462 + (var7 >> 1);
        int var11 = (var6 + 1 >> 1) + this.field4467;
        this.method1829(var10 * 128, var9 * 128, (byte) 95);
        boolean var12 = !var3 && var4.field3716 && (this.field4474 != var4.field3689 || this.field4481 != this.field4470 && class301.field5179 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class37.field569[this.field4476];
        int var14 = (this.field4462 << 7) + (var7 << 6);
        int var15 = var13[var10][var9] - (-var13[var8][var11] - var13[var10][var11] - var13[var8][var9]) >> 2;
        int[][] var16 = (int[][]) null;
        int var17 = (this.field4467 << 7) + (var6 << 6);
        if (var3) {
            var16 = class72.field1106[0];
        } else if (this.field4476 < 3) {
            var16 = class37.field569[this.field4476 + 1];
        }
        if (var12) {
            class168.method1204(this.field4472, this.field4485, this.field4483, this.field4475);
        }
        boolean var18 = this.field4472 == null;
        class291 var19;
        if (this.field4469 == null) {
            var19 = var4.method1534(var18 ? class281.field4801 : this.field4472, var16, this.field4473, var17, var13, var14, var12, (byte) -79, var15, false, this.field4484);
        } else {
            var19 = var4.method1538(var12, this.field4470, (byte) 102, var14, this.field4473, this.field4484, var13, this.field4469, var15, var16, var17, var18 ? class281.field4801 : this.field4472);
        }
        if (var19 == null) {
            return null;
        }
        if (var12) {
            if (var18) {
                class281.field4801 = var19.field4937;
            }
            int var20 = 0;
            if (this.field4476 != 0) {
                int[][] var21 = class37.field569[0];
                var20 = var15 - (var21[var8][var9] + var21[var10][var11] + var21[var8][var11] + var21[var10][var9] >> 2);
            }
            class61 var22 = var19.field4937;
            if (this.field4488 && class168.method1205(var22, var14, var20, var17)) {
                this.field4488 = false;
            }
            if (!this.field4488) {
                class168.method1202(var22, var14, var20, var17);
                this.field4483 = var20;
                if (var18) {
                    class281.field4801 = null;
                }
                this.field4475 = var17;
                this.field4472 = var22;
                this.field4485 = var14;
            }
            this.field4474 = var4.field3689;
            this.field4481 = this.field4470;
        }
        return var19.field4947;
    }
}
