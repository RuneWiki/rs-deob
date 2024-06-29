import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class235 extends class15 {

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Lie;")
    public class2 field3430 = new class2();

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "Lli;")
    public class175 field3441 = new class175();

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Ld;")
    private class59 field3429;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "[Lii;")
    public static class228[] field3431 = new class228[4];

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[Loe;")
    public static class76[] field3439 = new class76[14];

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "S")
    public static short field3432 = 32767;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field3440 = 0;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lgm;II)V")
    private final void method1621(class45 arg0, int arg1, int arg2) {
        if (arg1 < 1) {
            this.field3441 = null;
        }
        if ((this.field3429.field900[arg0.field596] & 0x4) != 0 && arg0.field616 < 0) {
            int var4 = this.field3429.field892[arg0.field596] / class91.field1459;
            int var5 = (var4 + 1048575 - arg0.field604) / var4;
            arg0.field604 = arg2 * var4 + arg0.field604 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3429.field914[arg0.field596] == 0) {
                    arg0.field598 = class184.method1312(arg0.field611, arg0.field598.method1307(), arg0.field598.method1309(), arg0.field598.method1287());
                } else {
                    arg0.field598 = class184.method1312(arg0.field611, arg0.field598.method1307(), 0, arg0.field598.method1287());
                    this.field3429.method467((byte) -121, arg0, arg0.field605.field412[arg0.field600] < 0);
                }
                if (arg0.field605.field412[arg0.field600] < 0) {
                    arg0.field598.method1320(-1);
                }
                arg2 = arg0.field604 / var4;
            }
        }
        field3433++;
        arg0.field598.method103(arg2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([III)V")
    public final void method104(int[] arg0, int arg1, int arg2) {
        this.field3441.method104(arg0, arg1, arg2);
        field3436++;
        for (class45 var4 = (class45) this.field3430.method8(-108); var4 != null; var4 = (class45) this.field3430.method12((byte) 69)) {
            if (!this.field3429.method439((byte) 117, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field591 >= var6) {
                        this.method1624((byte) -1, var5 + var6, arg0, var5, var4, var6);
                        var4.field591 -= var6;
                        break;
                    }
                    this.method1624((byte) -1, var5 + var6, arg0, var5, var4, var4.field591);
                    var6 -= var4.field591;
                    var5 += var4.field591;
                } while (!this.field3429.method442(var5, var6, arg0, var4, (byte) -80));
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public final void method103(int arg0) {
        this.field3441.method103(arg0);
        field3435++;
        for (class45 var2 = (class45) this.field3430.method8(-93); var2 != null; var2 = (class45) this.field3430.method12((byte) 69)) {
            if (!this.field3429.method439((byte) 117, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field591) {
                        this.method1621(var2, 75, var3);
                        var2.field591 -= var3;
                        break;
                    }
                    this.method1621(var2, 4, var2.field591);
                    var3 -= var2.field591;
                } while (!this.field3429.method442(0, var3, (int[]) null, var2, (byte) -124));
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1622(int arg0, int arg1, int arg2, long arg3) {
        class313 var5 = class223.field3286[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field5012 != null && var5.field5012.field3393 == arg3) {
            return true;
        } else if (var5.field5023 != null && var5.field5023.field4393 == arg3) {
            return true;
        } else if (var5.field5027 != null && var5.field5027.field3151 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field5022; var6++) {
                if (var5.field5037[var6].field2431 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static void method1623(int arg0) {
        field3439 = null;
        field3431 = null;
        if (arg0 != 0) {
            method1622(28, 71, 44, 62L);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
    public final int method102() {
        field3437++;
        return 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI[IILgm;I)V")
    private final void method1624(byte arg0, int arg1, int[] arg2, int arg3, class45 arg4, int arg5) {
        if ((this.field3429.field900[arg4.field596] & 0x4) != 0 && arg4.field616 < 0) {
            int var7 = this.field3429.field892[arg4.field596] / class91.field1459;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field604) / var7;
                if (arg5 < var8) {
                    arg4.field604 += arg5 * var7;
                    break;
                }
                arg4.field598.method104(arg2, arg3, var8);
                int var9 = class91.field1459 / 100;
                arg5 -= var8;
                arg4.field604 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                arg3 += var8;
                if (var9 > var10) {
                    var9 = var10;
                }
                class184 var11 = arg4.field598;
                if (this.field3429.field914[arg4.field596] == 0) {
                    arg4.field598 = class184.method1312(arg4.field611, var11.method1307(), var11.method1309(), var11.method1287());
                } else {
                    arg4.field598 = class184.method1312(arg4.field611, var11.method1307(), 0, var11.method1287());
                    this.field3429.method467((byte) -122, arg4, arg4.field605.field412[arg4.field600] < 0);
                    arg4.field598.method1319(var9, var11.method1309());
                }
                if (arg4.field605.field412[arg4.field600] < 0) {
                    arg4.field598.method1320(-1);
                }
                var11.method1322(var9);
                var11.method104(arg2, arg3, arg1 - arg3);
                if (var11.method1296()) {
                    this.field3441.method1249(var11);
                }
            }
        }
        arg4.field598.method104(arg2, arg3, arg5);
        field3438++;
        if (arg0 != -1) {
            this.field3430 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "()Lrk;")
    public final class15 method106() {
        field3428++;
        class45 var1;
        do {
            var1 = (class45) this.field3430.method12((byte) 69);
            if (var1 == null) {
                return null;
            }
        } while (var1.field598 == null);
        return var1.field598;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()Lrk;")
    public final class15 method101() {
        field3427++;
        class45 var1 = (class45) this.field3430.method8(-124);
        if (var1 == null) {
            return null;
        } else if (var1.field598 == null) {
            return this.method106();
        } else {
            return var1.field598;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ld;)V")
    public class235(class59 arg0) {
        this.field3429 = arg0;
    }
}
