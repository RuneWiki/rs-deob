import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class634 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    private int field8560 = -1;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public boolean field8570 = true;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field8558;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field8563;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lwg;")
    private class448 field8569;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Llf;")
    private class250 field8565;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    private int field8557;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lrba;")
    private class456 field8564;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lvv;")
    private class343 field8572;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lts;")
    private class561 field8561;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
    public static boolean field8566 = false;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8567 = -1;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
    public static int[] field8573;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method3494(int arg0) {
        this.method3499(this.field8557, this.field8572, -89);
        if (arg0 == 19597) {
            field8571++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIZ)V")
    public final void method3495(int arg0, byte[] arg1, int arg2, boolean arg3) {
        this.field8561.method1762(arg2 * this.field8565.method1587(arg0, (byte) 32), arg1, (byte) 54, arg0);
        field8568++;
        this.method3499(arg2, this.field8561, -20);
        if (arg3) {
            field8573 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JZII)Ljava/lang/String;")
    public static final String method3496(long arg0, boolean arg1, int arg2, int arg3) {
        field8559++;
        Calendar var5;
        if (arg1) {
            class120.method858(1, arg0);
            var5 = class79.field1090;
        } else {
            class215.method1391(false, arg0);
            var5 = class79.field1085;
        }
        int var6 = var5.get(5);
        if (arg2 != -20982) {
            method3497(-11);
        }
        int var7 = var5.get(2) + 1;
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method3497(int arg0) {
        field8573 = null;
        if (arg0 != -128) {
            method3497(-42);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    private final void method3498(int arg0) {
        field8562++;
        if (!this.field8570) {
            return;
        }
        this.field8570 = false;
        byte[] var2 = this.field8569.field6448;
        byte[] var3 = this.field8565.field3667;
        int var4 = 0;
        int var5 = this.field8569.field6437;
        int var6 = this.field8569.field6437 * this.field8558 + this.field8563;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field8564 != null && this.field8560 == var4) {
            this.field8570 = false;
            return;
        }
        this.field8560 = var4;
        int var8 = 0;
        int var9 = this.field8563 + (this.field8558 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field8569.field6437 - 128;
        }
        if (arg0 >= -40) {
            this.method3498(-10);
        }
        if (this.field8564 == null) {
            this.field8564 = new class456(this.field8565, 3553, 6406, 128, 128, false, this.field8565.field3667, 6406, false);
            this.field8564.method2708((byte) -126, false, false);
            this.field8564.method1344(-15578, true);
        } else {
            this.field8564.method2707(this.field8565.field3667, 6406, 0, 0, 0, 0, true, false, 128, 128);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILvv;I)V")
    private final void method3499(int arg0, class343 arg1, int arg2) {
        field8556++;
        if (arg0 != 0) {
            int var4 = -22 % ((arg2 - 49) / 32);
            this.method3498(-53);
            this.field8565.method1595((byte) 117, this.field8564);
            this.field8565.method1568(false, 0, 4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JJ)J")
    public static long method3500(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Liga;")
    public static final class481 method3501(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2527;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Llf;Lwg;Lbja;IIIII)V")
    public class634(class250 arg0, class448 arg1, class34 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8558 = arg7;
        this.field8563 = arg6;
        this.field8569 = arg1;
        this.field8565 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4174 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field326[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field8557 = var10;
        if (var10 <= 0) {
            this.field8564 = null;
        } else {
            class254 var14 = new class254(var10 * 2);
            if (this.field8565.field3561) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4174 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field326[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1733(var23[var24] & 0xFFFF, -32466);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4174 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field326[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1719(126, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field8572 = this.field8565.method1615(var14.field3789, 5123, false, 0, var14.field3725);
            this.field8561 = new class561(this.field8565, 5123, null, 1);
        }
    }
}
