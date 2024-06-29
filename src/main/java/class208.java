import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class208 extends class417 {

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lm;")
    public class242 field2829 = new class242();

    @OriginalMember(owner = "client!af", name = "A", descriptor = "Lf;")
    public class32 field2837 = new class32();

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Ltm;")
    private class20 field2826;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method187(int arg0) {
        field2839++;
        this.field2837.method187(arg0);
        for (class256 var2 = (class256) this.field2829.method1575(0); var2 != null; var2 = (class256) this.field2829.method1573((byte) -128)) {
            if (!this.field2826.method160(3, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3734 >= var3) {
                        this.method1362(var3, var2, 262144);
                        var2.field3734 -= var3;
                        break;
                    }
                    this.method1362(var2.field3734, var2, 262144);
                    var3 -= var2.field3734;
                } while (!this.field2826.method180(var2, 0, var3, (int[]) null, -2));
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILko;I)V")
    private final void method1362(int arg0, class256 arg1, int arg2) {
        if ((this.field2826.field322[arg1.field3725] & 0x4) != 0 && arg1.field3726 < 0) {
            int var4 = this.field2826.field362[arg1.field3725] / class388.field5673;
            int var5 = (var4 + 1048575 - arg1.field3731) / var4;
            arg1.field3731 = arg0 * var4 + arg1.field3731 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2826.field339[arg1.field3725] == 0) {
                    arg1.field3732 = class260.method1729(arg1.field3730, arg1.field3732.method1714(), arg1.field3732.method1722(), arg1.field3732.method1711());
                } else {
                    arg1.field3732 = class260.method1729(arg1.field3730, arg1.field3732.method1714(), 0, arg1.field3732.method1711());
                    this.field2826.method157(16, arg1.field3758.field1329[arg1.field3752] < 0, arg1);
                }
                if (arg1.field3758.field1329[arg1.field3752] < 0) {
                    arg1.field3732.method1740(-1);
                }
                arg0 = arg1.field3731 / var4;
            }
        }
        field2828++;
        if (arg2 == 262144) {
            arg1.field3732.method187(arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BILko;[III)V")
    private final void method1363(byte arg0, int arg1, class256 arg2, int[] arg3, int arg4, int arg5) {
        field2827++;
        int var7 = 39 % ((arg0 + 31) / 44);
        if ((this.field2826.field322[arg2.field3725] & 0x4) != 0 && arg2.field3726 < 0) {
            int var8 = this.field2826.field362[arg2.field3725] / class388.field5673;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field3731) / var8;
                if (var9 > arg5) {
                    arg2.field3731 += arg5 * var8;
                    break;
                }
                arg2.field3732.method165(arg3, arg1, var9);
                arg5 -= var9;
                arg1 += var9;
                arg2.field3731 += var8 * var9 - 1048576;
                int var10 = class388.field5673 / 100;
                int var11 = 262144 / var8;
                if (var10 > var11) {
                    var10 = var11;
                }
                class260 var12 = arg2.field3732;
                if (this.field2826.field339[arg2.field3725] == 0) {
                    arg2.field3732 = class260.method1729(arg2.field3730, var12.method1714(), var12.method1722(), var12.method1711());
                } else {
                    arg2.field3732 = class260.method1729(arg2.field3730, var12.method1714(), 0, var12.method1711());
                    this.field2826.method157(16, arg2.field3758.field1329[arg2.field3752] < 0, arg2);
                    arg2.field3732.method1734(var10, var12.method1722());
                }
                if (arg2.field3758.field1329[arg2.field3752] < 0) {
                    arg2.field3732.method1740(-1);
                }
                var12.method1726(var10);
                var12.method165(arg3, arg1, arg4 - arg1);
                if (var12.method1720()) {
                    this.field2837.method248(var12);
                }
            }
        }
        arg2.field3732.method165(arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method1364(int arg0, int arg1) {
        class229.field3152.method379(arg0, false);
        field2833++;
        if (arg1 == 6789) {
            class136.field1768.method379(arg0, false);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
    public static final void method1365(boolean arg0) {
        field2835++;
        if (class211.field2872 != null) {
            return;
        }
        Container var1;
        if (class428.field6222 == null) {
            var1 = class63.field948.field5381;
        } else {
            var1 = class428.field6222;
        }
        class159.field2075 = var1.getSize().width;
        class331.field4882 = var1.getSize().height;
        if (class428.field6222 == var1) {
            Insets var2 = class428.field6222.getInsets();
            class159.field2075 -= var2.right + var2.left;
            class331.field4882 -= var2.top + var2.bottom;
        }
        if (class340.method2203((byte) 77) == 1) {
            class244.field3436 = 0;
            class435.field6313 = 503;
            class357.field5298 = 765;
            class420.field6109 = (class159.field2075 - 765) / 2;
        } else if (class393.field5727 < 96 && class397.field5796 == 0) {
            int var3 = class159.field2075 <= 1024 ? class159.field2075 : 1024;
            class420.field6109 = (class159.field2075 - var3) / 2;
            class357.field5298 = var3;
            int var4 = class331.field4882 > 768 ? 768 : class331.field4882;
            class244.field3436 = 0;
            class435.field6313 = var4;
        } else {
            class420.field6109 = 0;
            class244.field3436 = 0;
            class435.field6313 = class331.field4882;
            class357.field5298 = class159.field2075;
        }
        if (class72.field1026 != 0) {
            boolean var10000;
            if (class357.field5298 < 1024 && class435.field6313 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class422.field6138.setSize(class357.field5298, class435.field6313);
        if (class126.field1647 != null) {
            class126.field1647.method454();
        }
        if (class428.field6222 == var1) {
            Insets var5 = class428.field6222.getInsets();
            class422.field6138.setLocation(var5.left + class420.field6109, class244.field3436 + var5.top);
        } else {
            class422.field6138.setLocation(class420.field6109, class244.field3436);
        }
        if (arg0) {
            method1366(71, 41);
        }
        if (class233.field3246 != -1) {
            class453.method2813((byte) -108, true);
        }
        class20.method162(1016);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
    public final void method165(int[] arg0, int arg1, int arg2) {
        field2838++;
        this.field2837.method165(arg0, arg1, arg2);
        for (class256 var4 = (class256) this.field2829.method1575(0); var4 != null; var4 = (class256) this.field2829.method1573((byte) -128)) {
            if (!this.field2826.method160(3, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3734) {
                        this.method1363((byte) 124, var5, var4, arg0, var5 + var6, var6);
                        var4.field3734 -= var6;
                        break;
                    }
                    this.method1363((byte) 110, var5, var4, arg0, var5 + var6, var4.field3734);
                    var6 -= var4.field3734;
                    var5 += var4.field3734;
                } while (!this.field2826.method180(var4, var5, var6, arg0, -2));
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()Lmq;")
    public final class417 method156() {
        field2836++;
        class256 var1;
        do {
            var1 = (class256) this.field2829.method1573((byte) -128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3732 == null);
        return var1.field3732;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Lmq;")
    public final class417 method189() {
        field2834++;
        class256 var1 = (class256) this.field2829.method1575(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3732 == null) {
            return this.method156();
        } else {
            return var1.field3732;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Lwe;")
    public static final class387 method1366(int arg0, int arg1) {
        if (arg1 != -1048576) {
            method1364(-45, 70);
        }
        field2830++;
        return (class387) class67.field982.method2826(false, (long) arg0);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
    public final int method152() {
        field2831++;
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)Lil;")
    public static final class104 method1367(int arg0, int arg1) {
        if (arg0 != -10186) {
            return null;
        }
        field2841++;
        class104 var2 = (class104) class92.field1253.method2348(112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class154.field1965.method1235(1, false, arg1 & 0x7FFF);
        } else {
            var3 = class212.field2889.method1235(1, false, arg1);
        }
        class104 var4 = new class104();
        if (var3 != null) {
            var4.method783(new class341(var3), arg0 ^ 0xFFFFD836);
        }
        if (arg1 >= 32768) {
            var4.method791(arg0 + 1440929205);
        }
        class92.field1253.method2350(var4, (long) arg1, arg0 ^ 0xFFFFD81C);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ltm;)V")
    public class208(class20 arg0) {
        this.field2826 = arg0;
    }
}
