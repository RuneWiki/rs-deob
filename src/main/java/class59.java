import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class59 extends class56 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lvb;")
    public class247 field886 = new class247();

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lec;")
    public class104 field896 = new class104();

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lhj;")
    private class184 field890;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static volatile int field885 = -1;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lsc;")
    public static class181 field892 = class149.method967(255, "");

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[Lpg;")
    public static class69[] field893;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method425(int arg0) {
        field893 = null;
        field892 = null;
        if (arg0 != 0) {
            method429((byte) 93);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()I")
    public final int method408() {
        field883++;
        return 0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public final void method411(int arg0) {
        field887++;
        this.field896.method411(arg0);
        for (class155 var2 = (class155) this.field886.method1686((byte) -83); var2 != null; var2 = (class155) this.field886.method1683(140)) {
            if (!this.field890.method1279(-8182, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2570 >= var3) {
                        this.method427(var2, var3, 0);
                        var2.field2570 -= var3;
                        break;
                    }
                    this.method427(var2, var2.field2570, 0);
                    var3 -= var2.field2570;
                } while (!this.field890.method1288((byte) -31, (int[]) null, var3, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lpf;")
    public final class56 method406() {
        field882++;
        class155 var1;
        do {
            var1 = (class155) this.field886.method1683(140);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2588 == null);
        return var1.field2588;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILkc;[III)V")
    private final void method426(int arg0, int arg1, class155 arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 != 1535) {
            this.field886 = null;
        }
        if ((this.field890.field3262[arg2.field2587] & 0x4) != 0 && arg2.field2574 < 0) {
            int var7 = this.field890.field3279[arg2.field2587] / class207.field3554;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2578) / var7;
                if (var8 > arg4) {
                    arg2.field2578 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg2.field2588.method407(arg3, arg0, var8);
                arg0 += var8;
                class154 var9 = arg2.field2588;
                arg2.field2578 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                int var11 = class207.field3554 / 100;
                if (var11 > var10) {
                    var11 = var10;
                }
                if (this.field890.field3278[arg2.field2587] == 0) {
                    arg2.field2588 = class154.method996(arg2.field2598, var9.method1019(), var9.method1014(), var9.method1004());
                } else {
                    arg2.field2588 = class154.method996(arg2.field2598, var9.method1019(), 0, var9.method1004());
                    this.field890.method1283(arg2.field2599.field4517[arg2.field2582] < 0, arg2, (byte) 117);
                    arg2.field2588.method997(var11, var9.method1014());
                }
                if (arg2.field2599.field4517[arg2.field2582] < 0) {
                    arg2.field2588.method1018(-1);
                }
                var9.method1026(var11);
                var9.method407(arg3, arg0, arg1 - arg0);
                if (var9.method1000()) {
                    this.field896.method702(var9);
                }
            }
        }
        field891++;
        arg2.field2588.method407(arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkc;II)V")
    private final void method427(class155 arg0, int arg1, int arg2) {
        if ((this.field890.field3262[arg0.field2587] & 0x4) != 0 && arg0.field2574 < 0) {
            int var4 = this.field890.field3279[arg0.field2587] / class207.field3554;
            int var5 = (var4 + 1048575 - arg0.field2578) / var4;
            arg0.field2578 = arg1 * var4 + arg0.field2578 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field890.field3278[arg0.field2587] == 0) {
                    arg0.field2588 = class154.method996(arg0.field2598, arg0.field2588.method1019(), arg0.field2588.method1014(), arg0.field2588.method1004());
                } else {
                    arg0.field2588 = class154.method996(arg0.field2598, arg0.field2588.method1019(), 0, arg0.field2588.method1004());
                    this.field890.method1283(arg0.field2599.field4517[arg0.field2582] < 0, arg0, (byte) -85);
                }
                if (arg0.field2599.field4517[arg0.field2582] < 0) {
                    arg0.field2588.method1018(-1);
                }
                arg1 = arg0.field2578 / var4;
            }
        }
        if (arg2 == 0) {
            arg0.field2588.method411(arg1);
            field888++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()Lpf;")
    public final class56 method409() {
        class155 var1 = (class155) this.field886.method1686((byte) -83);
        field895++;
        if (var1 == null) {
            return null;
        } else if (var1.field2588 == null) {
            return this.method406();
        } else {
            return var1.field2588;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
    public final void method407(int[] arg0, int arg1, int arg2) {
        this.field896.method407(arg0, arg1, arg2);
        for (class155 var4 = (class155) this.field886.method1686((byte) -83); var4 != null; var4 = (class155) this.field886.method1683(140)) {
            if (!this.field890.method1279(-8182, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2570 >= var6) {
                        this.method426(var5, var5 + var6, var4, arg0, var6, 1535);
                        var4.field2570 -= var6;
                        break;
                    }
                    this.method426(var5, var5 + var6, var4, arg0, var4.field2570, 1535);
                    var5 += var4.field2570;
                    var6 -= var4.field2570;
                } while (!this.field890.method1288((byte) -31, arg0, var6, var4, var5));
            }
        }
        field889++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lqh;")
    public static final class100 method428(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3806; var4++) {
            class100 var5 = var3.field3797[var4];
            if ((var5.field1677 >> 29 & 0x3L) == 2L && var5.field1688 == arg1 && var5.field1672 == arg2) {
                class212.method1412(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public static final void method429(byte arg0) {
        field884++;
        int[] var1 = new int[class188.field3325];
        int var2 = 0;
        for (int var3 = 0; var3 < class188.field3325; var3++) {
            class99 var5 = class237.method1620(-29539, var3);
            if (var5.field1592 >= 0 || var5.field1603 >= 0) {
                var1[var2++] = var3;
            }
        }
        class198.field3444 = new int[var2];
        if (arg0 <= 115) {
            field892 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class198.field3444[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhj;)V")
    public class59(class184 arg0) {
        this.field890 = arg0;
    }
}
