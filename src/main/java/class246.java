import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class246 {

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    private int field3545 = -1;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    private int field3548 = 128;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    private int field3538 = 0;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field3547 = -1;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field3544 = 0;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    private int field3556 = 128;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "B")
    public byte field3558 = 0;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
    public boolean field3543 = false;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    private int field3541 = 0;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Lko;")
    public static class348 field3563;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "Lao;")
    public static class188 field3565;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
    public static int[] field3566;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "Lnc;")
    public static class21 field3568;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "Lao;")
    public static class188 field3570;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "Lnk;")
    public static class500 field3571;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "F")
    public static float field3564;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "Lvb;")
    public static class130 field3569;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljg;")
    public class223 field3539;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Lri;")
    public static class73 field3567;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "[S")
    private short[] field3546;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "[S")
    private short[] field3554;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "[S")
    private short[] field3555;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[S")
    private short[] field3561;

    static {
        new class180("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field3563 = new class348();
        field3565 = new class188(28, 6);
        field3566 = new int[] { 1, 2, 4, 8 };
        field3568 = new class21(1);
        field3570 = new class188(103, 0);
        field3571 = new class500("WTRC", 1);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILm;Ljava/awt/Canvas;)Lqa;", line = 3)
    public static final class162 method1571(byte arg0, int arg1, class126 arg2, Canvas arg3) {
        field3552++;
        return arg0 >= -53 ? null : new class59(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLna;IILna;Lcl;ZIILqa;III)Lc;", line = 15)
    public final class121 method1572(byte arg0, class35 arg1, int arg2, int arg3, class35 arg4, class173 arg5, boolean arg6, int arg7, int arg8, class162 arg9, int arg10, int arg11, int arg12) {
        int var14 = -36 % ((arg0 - 44) / 55);
        field3540++;
        return this.method1576(arg1, arg9, arg8, arg4, arg5, arg10, arg12, arg2, 128, arg3, (byte) 2, arg7, arg11, arg6);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1573(int arg0) {
        field3557++;
        class64 var1 = (class64) class516.field7581.method2257((byte) 92);
        if (arg0 != 16384) {
            method1573(119);
        }
        while (var1 != null) {
            if (var1.field1125 == -1) {
                var1.field1130 = 0;
                if (var1.field1122 >= 0 && var1.field1121 >= 0 && var1.field1122 < class237.field3436 && var1.field1121 < class83.field1366) {
                    class481.method2878(10845, var1);
                }
            } else {
                var1.method2663(-118);
            }
            var1 = (class64) class516.field7581.method2256(108);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lqa;Lcl;IIZII)Lc;", line = 55)
    public final class121 method1574(class162 arg0, class173 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            field3568 = null;
        }
        field3551++;
        return this.method1576(null, arg0, arg3, null, arg1, arg6, 0, arg2, 128, 0, (byte) 5, arg5, 0, false);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLti;)V", line = 72)
    public final void method1575(byte arg0, class303 arg1) {
        if (arg0 != -77) {
            this.method1574(null, null, -50, 92, false, -34, -59);
        }
        while (true) {
            int var3 = arg1.method1918((byte) -72);
            if (var3 == 0) {
                field3542++;
                return;
            }
            this.method1579(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lna;Lqa;ILna;Lcl;IIIIIBIIZ)Lc;", line = 93)
    private final class121 method1576(class35 arg0, class162 arg1, int arg2, class35 arg3, class173 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12, boolean arg13) {
        field3550++;
        int var15 = arg7;
        class357 var16 = this.field3547 == -1 || arg11 == -1 ? null : arg4.method1233(true, this.field3547);
        boolean var17 = arg13 & this.field3558 != 0;
        if (var16 != null) {
            var15 = arg7 | var16.method2303(arg8 ^ 0x480, arg5, false, arg11);
        }
        if (var17) {
            var15 |= this.field3558 == 3 ? 7 : 2;
        }
        if (this.field3548 != 128) {
            var15 |= 0x2;
        }
        if (this.field3556 != 128 || this.field3541 != 0) {
            var15 |= 0x5;
        }
        class364 var18 = this.field3539.field3233;
        class121 var19;
        synchronized (this.field3539.field3233) {
            var19 = (class121) this.field3539.field3233.method2339(-93, (long) (this.field3553 |= arg1.field2452 << 29));
        }
        if (var19 == null || arg1.method518(var19.method915(), var15) != 0) {
            if (var19 != null) {
                var15 = arg1.method472(var15, var19.method915());
            }
            int var20 = var15;
            if (this.field3546 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field3555 != null) {
                var20 |= 0x8000;
            }
            class527 var21 = class388.method2439(this.field3549, this.field3539.field3224, 0, arg8 ^ 0x931);
            if (var21 == null) {
                return null;
            }
            if (var21.field7767 < 13) {
                var21.method3124(0, (byte) -69);
            }
            var19 = arg1.method499(var21, var20, this.field3539.field3236, this.field3544 + 64, this.field3538 + 850);
            if (this.field3546 != null) {
                for (int var22 = 0; var22 < this.field3546.length; var22++) {
                    var19.method917(this.field3546[var22], this.field3561[var22]);
                }
            }
            if (this.field3555 != null) {
                for (int var23 = 0; var23 < this.field3555.length; var23++) {
                    var19.method906(this.field3555[var23], this.field3554[var23]);
                }
            }
            var19.method894(var15);
            class364 var24 = this.field3539.field3233;
            synchronized (this.field3539.field3233) {
                this.field3539.field3233.method2342((long) (this.field3553 |= arg1.field2452 << 29), var19, arg8 - 238);
            }
        }
        class121 var25 = var16 == null ? var19.method881(arg10, var15, true) : var16.method2304(arg8 ^ 0xFFFFF841, arg11, var15, 0, arg10, arg5, var19, arg2);
        if (this.field3556 != arg8 || this.field3548 != 128) {
            var25.method878(this.field3556, this.field3548, this.field3556);
        }
        if (this.field3541 != 0) {
            if (this.field3541 == 90) {
                var25.method897(4096);
            }
            if (this.field3541 == 180) {
                var25.method897(8192);
            }
            if (this.field3541 == 270) {
                var25.method897(12288);
            }
        }
        if (var17) {
            var25.method879(this.field3558, this.field3545, arg0, arg3, arg6, arg12, arg9);
        }
        var25.method894(arg7);
        return var25;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lcl;Lqa;IIIII)Lc;", line = 216)
    public final class121 method1577(class173 arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3559++;
        if (arg6 <= 29) {
            this.field3554 = null;
        }
        return this.method1576(null, arg1, arg2, null, arg0, arg3, 0, arg5, 128, 0, (byte) 2, arg4, 0, false);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 238)
    public static void method1578(int arg0) {
        if (arg0 != -10) {
            return;
        }
        field3568 = null;
        field3567 = null;
        field3570 = null;
        field3565 = null;
        field3571 = null;
        field3566 = null;
        field3563 = null;
        field3569 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZLti;)V", line = 277)
    private final void method1579(int arg0, boolean arg1, class303 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field3549 = arg2.method1868(0);
        } else if (arg0 == 2) {
            this.field3547 = arg2.method1868(0);
        } else if (arg0 == 4) {
            this.field3556 = arg2.method1868(0);
        } else if (arg0 == 5) {
            this.field3548 = arg2.method1868(0);
        } else if (arg0 == 6) {
            this.field3541 = arg2.method1868(0);
        } else if (arg0 == 7) {
            this.field3544 = arg2.method1918((byte) 82);
        } else if (arg0 == 8) {
            this.field3538 = arg2.method1918((byte) -54);
        } else if (arg0 == 9) {
            this.field3558 = 3;
            this.field3545 = 8224;
        } else if (arg0 == 10) {
            this.field3543 = true;
        } else if (arg0 == 11) {
            this.field3558 = 1;
        } else if (arg0 == 12) {
            this.field3558 = 4;
        } else if (arg0 == 13) {
            this.field3558 = 5;
        } else if (arg0 == 14) {
            this.field3558 = 2;
            this.field3545 = arg2.method1918((byte) -77) * 256;
        } else if (arg0 == 15) {
            this.field3558 = 3;
            this.field3545 = arg2.method1868(0);
        } else if (arg0 == 16) {
            this.field3558 = 3;
            this.field3545 = arg2.method1870(-1945262512);
        } else if (arg0 == 40) {
            int var6 = arg2.method1918((byte) 115);
            this.field3561 = new short[var6];
            this.field3546 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3546[var7] = (short) arg2.method1868(0);
                this.field3561[var7] = (short) arg2.method1868(0);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1918((byte) 87);
            this.field3554 = new short[var4];
            this.field3555 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3555[var5] = (short) arg2.method1868(0);
                this.field3554[var5] = (short) arg2.method1868(0);
            }
        }
        field3562++;
    }
}
