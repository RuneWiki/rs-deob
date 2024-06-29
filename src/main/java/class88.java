import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class88 extends class100 {

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lcf;")
    public class28 field1671 = new class28();

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lki;")
    public class117 field1672 = new class117();

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lpg;")
    private class165 field1662;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lvd;")
    public static class222 field1660 = class212.method1357("Lade)3)3)3", 10731);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lvd;")
    public static class222 field1669 = class212.method1357("W-=hlen Sie eine Option", 10731);

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
    public final int method564() {
        field1663++;
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lda;III[II)V")
    private final void method565(class34 arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if ((this.field1662.field3125[arg0.field736] & 0x4) != 0 && arg0.field756 < 0) {
            int var7 = this.field1662.field3135[arg0.field736] / class106.field1956;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field743) / var7;
                if (arg5 < var8) {
                    arg0.field743 += arg5 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg0.field751.method567(arg4, arg3, var8);
                arg0.field743 += var7 * var8 - 1048576;
                class198 var10 = arg0.field751;
                arg3 += var8;
                int var11 = class106.field1956 / 100;
                arg5 -= var8;
                if (var11 > var9) {
                    var11 = var9;
                }
                if (this.field1662.field3109[arg0.field736] == 0) {
                    arg0.field751 = class198.method1235(arg0.field745, var10.method1225(), var10.method1228(), var10.method1251());
                } else {
                    arg0.field751 = class198.method1235(arg0.field745, var10.method1225(), 0, var10.method1251());
                    this.field1662.method1059(arg0.field755.field1879[arg0.field760] < 0, (byte) -104, arg0);
                    arg0.field751.method1241(var11, var10.method1228());
                }
                if (arg0.field755.field1879[arg0.field760] < 0) {
                    arg0.field751.method1230(-1);
                }
                var10.method1240(var11);
                var10.method567(arg4, arg3, arg2 - arg3);
                if (var10.method1237()) {
                    this.field1672.method751(var10);
                }
            }
        }
        field1668++;
        arg0.field751.method567(arg4, arg3, arg5);
        if (arg1 >= -115) {
            method566(53, 18, 123, null, -116, 20, 120);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILee;III)Lee;")
    public static final class49 method566(int arg0, int arg1, int arg2, class49 arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg5;
        class49 var9 = (class49) class157.field3018.method1071(var7, (byte) 122);
        field1659++;
        if (var9 == null) {
            class148 var10 = class148.method939(class116.field2217, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method949(64, 768, -50, -10, -50);
            class157.field3018.method1069(var9, var7, arg4 ^ 0x51B);
        }
        int var11 = arg3.method352();
        int var12 = arg3.method359();
        int var13 = arg3.method354();
        int var14 = arg3.method356();
        class49 var15 = var9.method353(true);
        if (arg6 != 0) {
            var15.method358(arg6);
        }
        class150 var16 = (class150) var15;
        if (class71.method482(arg0 + var13, arg2 + var11, class217.field4036, (byte) 118) != arg1 || arg1 != class71.method482(arg0 + var14, arg2 + var12, class217.field4036, (byte) 119)) {
            for (int var17 = 0; var17 < var16.field2880; var17++) {
                var16.field2891[var17] += class71.method482(var16.field2889[var17] + arg0, var16.field2890[var17] + arg2, class217.field4036, (byte) 118) - arg1;
            }
            var16.field2866 = false;
        }
        return arg4 == 1397 ? var15 : null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V")
    public final void method567(int[] arg0, int arg1, int arg2) {
        field1670++;
        this.field1672.method567(arg0, arg1, arg2);
        for (class34 var4 = (class34) this.field1671.method236(0); var4 != null; var4 = (class34) this.field1671.method237(true)) {
            if (!this.field1662.method1057(var4, (byte) 114)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field741) {
                        this.method565(var4, -127, var5 + var6, var5, arg0, var6);
                        var4.field741 -= var6;
                        break;
                    }
                    this.method565(var4, -121, var5 + var6, var5, arg0, var4.field741);
                    var5 += var4.field741;
                    var6 -= var4.field741;
                } while (!this.field1662.method1042(arg0, var5, 121, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()Ljc;")
    public final class100 method568() {
        field1661++;
        class34 var1;
        do {
            var1 = (class34) this.field1671.method237(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field751 == null);
        return var1.field751;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILda;)V")
    private final void method569(byte arg0, int arg1, class34 arg2) {
        if ((this.field1662.field3125[arg2.field736] & 0x4) != 0 && arg2.field756 < 0) {
            int var4 = this.field1662.field3135[arg2.field736] / class106.field1956;
            int var5 = (var4 + 1048575 - arg2.field743) / var4;
            arg2.field743 = arg1 * var4 + arg2.field743 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1662.field3109[arg2.field736] == 0) {
                    arg2.field751 = class198.method1235(arg2.field745, arg2.field751.method1225(), arg2.field751.method1228(), arg2.field751.method1251());
                } else {
                    arg2.field751 = class198.method1235(arg2.field745, arg2.field751.method1225(), 0, arg2.field751.method1251());
                    this.field1662.method1059(arg2.field755.field1879[arg2.field760] < 0, (byte) -99, arg2);
                }
                if (arg2.field755.field1879[arg2.field760] < 0) {
                    arg2.field751.method1230(-1);
                }
                arg1 = arg2.field743 / var4;
            }
        }
        arg2.field751.method570(arg1);
        if (arg0 == -27) {
            field1664++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public final void method570(int arg0) {
        field1665++;
        this.field1672.method570(arg0);
        for (class34 var2 = (class34) this.field1671.method236(0); var2 != null; var2 = (class34) this.field1671.method237(true)) {
            if (!this.field1662.method1057(var2, (byte) 114)) {
                int var3 = arg0;
                do {
                    if (var2.field741 >= var3) {
                        this.method569((byte) -27, var3, var2);
                        var2.field741 -= var3;
                        break;
                    }
                    this.method569((byte) -27, var2.field741, var2);
                    var3 -= var2.field741;
                } while (!this.field1662.method1042(null, 0, 118, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lvd;BZ)V")
    public static final void method571(class222 arg0, byte arg1, boolean arg2) {
        field1667++;
        if (arg1 < 98) {
            field1660 = null;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class91.field1717.method893(arg0, 250);
        int var6 = class91.field1717.method890(arg0, 250) * 13;
        int var7 = var3 + 6;
        class53.method399(var4 - var3, -var3 + var7, var5 + var3 + var3, var3 + var6 + var3, 0);
        class53.method401(var4 - var3, -var3 + var7, var3 + var3 + var5, var3 + var3 + var6, 16777215);
        class91.field1717.method911(arg0, var4, var7, var5, var6, 16777215, -1, 1, 1, 0);
        class77.method512(var4 - var3, var6 - -var3 + var3, 0, var3 + var5 + var3, -var3 + var7);
        if (!arg2) {
            class222.method1437(var4, var6, var7, var5, (byte) -87);
            return;
        }
        Canvas var8 = class130.field2523;
        try {
            Graphics var9 = var8.getGraphics();
            class93.field1750.method250(true, 0, var9, 0);
        } catch (Exception var10) {
            var8.repaint();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Ljc;")
    public final class100 method572() {
        class34 var1 = (class34) this.field1671.method236(0);
        field1658++;
        if (var1 == null) {
            return null;
        } else if (var1.field751 == null) {
            return this.method568();
        } else {
            return var1.field751;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static void method573(byte arg0) {
        if (arg0 != 17) {
            method571(null, (byte) -119, true);
        }
        field1669 = null;
        field1660 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lpg;)V")
    public class88(class165 arg0) {
        this.field1662 = arg0;
    }
}
