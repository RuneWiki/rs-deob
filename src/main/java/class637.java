import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class637 extends class659 {

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Ldc;")
    public class302 field9161 = new class302();

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Ltq;")
    public class358 field9168 = new class358();

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lfn;")
    private class617 field9159;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lqg;")
    public static class271 field9158 = new class271("RC", 1);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()Lac;", line = 3)
    public final class659 method531() {
        field9163++;
        class464 var1 = (class464) this.field9161.method1904(false);
        if (var1 == null) {
            return null;
        } else if (var1.field6702 == null) {
            return this.method534();
        } else {
            return var1.field6702;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()I", line = 20)
    public final int method545() {
        field9162++;
        return 0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 28)
    public static void method3640(byte arg0) {
        field9158 = null;
        if (arg0 <= 109) {
            method3640((byte) 116);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILuf;I)V", line = 39)
    private final void method3641(int arg0, class464 arg1, int arg2) {
        field9167++;
        if ((this.field9159.field8916[arg1.field6692] & 0x4) != 0 && arg1.field6686 < 0) {
            int var4 = this.field9159.field8936[arg1.field6692] / class82.field1321;
            int var5 = (var4 + 1048575 - arg1.field6693) / var4;
            arg1.field6693 = arg1.field6693 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field9159.field8902[arg1.field6692] == 0) {
                    arg1.field6702 = class93.method537(arg1.field6684, arg1.field6702.method523(), arg1.field6702.method556(), arg1.field6702.method535());
                } else {
                    arg1.field6702 = class93.method537(arg1.field6684, arg1.field6702.method523(), 0, arg1.field6702.method535());
                    this.field9159.method3529(-1120027130, ~arg1.field6691.field282[arg1.field6703] > -1, arg1);
                }
                if (arg1.field6691.field282[arg1.field6703] < 0) {
                    arg1.field6702.method558(-1);
                }
                arg0 = arg1.field6693 / var4;
            }
        }
        arg1.field6702.method526(arg0);
        if (arg2 <= 59) {
            this.method549(null, -124, 58);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 79)
    public final void method526(int arg0) {
        this.field9168.method526(arg0);
        field9160++;
        for (class464 var2 = (class464) this.field9161.method1904(false); var2 != null; var2 = (class464) this.field9161.method1901(122)) {
            if (!this.field9159.method3558(15, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field6696 >= var3) {
                        this.method3641(var3, var2, 100);
                        var2.field6696 -= var3;
                        break;
                    }
                    this.method3641(var2.field6696, var2, 106);
                    var3 -= var2.field6696;
                } while (!this.field9159.method3524((byte) 67, var3, 0, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([III)V", line = 119)
    public final void method549(int[] arg0, int arg1, int arg2) {
        field9166++;
        this.field9168.method549(arg0, arg1, arg2);
        for (class464 var4 = (class464) this.field9161.method1904(false); var4 != null; var4 = (class464) this.field9161.method1901(94)) {
            if (!this.field9159.method3558(15, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field6696) {
                        this.method3642(arg0, var4, -1, var6 + var5, var6, var5);
                        var4.field6696 -= var5;
                        break;
                    }
                    this.method3642(arg0, var4, -1, var6 + var5, var6, var4.field6696);
                    var6 += var4.field6696;
                    var5 -= var4.field6696;
                } while (!this.field9159.method3524((byte) 67, var5, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([ILuf;IIII)V", line = 160)
    private final void method3642(int[] arg0, class464 arg1, int arg2, int arg3, int arg4, int arg5) {
        field9165++;
        if (~(this.field9159.field8916[arg1.field6692] & 0x4) != arg2 && arg1.field6686 < 0) {
            int var7 = this.field9159.field8936[arg1.field6692] / class82.field1321;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field6693) / var7;
                if (var8 > arg5) {
                    arg1.field6693 += arg5 * var7;
                    break;
                }
                arg1.field6702.method549(arg0, arg4, var8);
                arg5 -= var8;
                arg4 += var8;
                arg1.field6693 += var7 * var8 - 1048576;
                int var9 = class82.field1321 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class93 var11 = arg1.field6702;
                if (this.field9159.field8902[arg1.field6692] == 0) {
                    arg1.field6702 = class93.method537(arg1.field6684, var11.method523(), var11.method556(), var11.method535());
                } else {
                    arg1.field6702 = class93.method537(arg1.field6684, var11.method523(), 0, var11.method535());
                    this.field9159.method3529(-1120027130, ~arg1.field6691.field282[arg1.field6703] > -1, arg1);
                    arg1.field6702.method550(var9, var11.method556());
                }
                if (arg1.field6691.field282[arg1.field6703] < 0) {
                    arg1.field6702.method558(-1);
                }
                var11.method528(var9);
                var11.method549(arg0, arg4, arg3 - arg4);
                if (var11.method521()) {
                    this.field9168.method2206(var11);
                }
            }
        }
        arg1.field6702.method549(arg0, arg4, arg5);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "()Lac;", line = 223)
    public final class659 method534() {
        field9164++;
        class464 var1;
        do {
            var1 = (class464) this.field9161.method1901(122);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6702 == null);
        return var1.field6702;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lfn;)V", line = 251)
    public class637(class617 arg0) {
        this.field9159 = arg0;
    }
}
