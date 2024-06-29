import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class457 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field6656 = -1;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Z")
    public boolean field6655 = true;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    private int field6666;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lrl;")
    private class487 field6659;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    private int field6654;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lm;")
    private class120 field6650;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    private int field6662;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lud;")
    private class26 field6653;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Llp;")
    private class255 field6658;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lqb;")
    private class142 field6663;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6660;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "[I")
    public static int[] field6665;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6661;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[I")
    public static int[] field6667;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILlp;I)V")
    private final void method2661(int arg0, class255 arg1, int arg2) {
        field6652++;
        if (arg2 != 6) {
            this.method2661(14, null, 60);
        }
        if (arg0 != 0) {
            this.method2663((byte) 70);
            this.field6659.method2883(this.field6653, 125);
            this.field6659.method2929(0, arg0, 0, arg1, 4);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method2662(int arg0) {
        field6661 = null;
        field6667 = null;
        if (arg0 != 17) {
            field6667 = null;
        }
        field6660 = null;
        field6665 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    private final void method2663(byte arg0) {
        field6664++;
        if (!this.field6655) {
            return;
        }
        this.field6655 = false;
        byte[] var2 = this.field6650.field1564;
        byte[] var3 = class38.field587;
        int var4 = 0;
        int var5 = this.field6650.field1561;
        int var6 = this.field6650.field1561 * this.field6666 + this.field6654;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (arg0 < 50) {
            this.method2661(64, null, 51);
        }
        if (this.field6653 != null && this.field6656 == var4) {
            this.field6655 = false;
            return;
        }
        this.field6656 = var4;
        int var8 = 0;
        int var9 = this.field6666 * var5 + this.field6654;
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
            var9 += this.field6650.field1561 - 128;
        }
        if (this.field6653 == null) {
            this.field6653 = new class26(this.field6659, 3553, 6406, 128, 128, false, class38.field587, 6406, false);
            this.field6653.method228(false, false, 0);
            this.field6653.method1357(true, (byte) 111);
        } else {
            this.field6653.method227(false, 128, -3608, 0, 128, 0, 0, 6406, class38.field587, 0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BIZ)V")
    public final void method2664(int arg0, byte[] arg1, int arg2, boolean arg3) {
        this.field6663.method891(arg2, -4520, arg1, this.field6659.method2877(0, arg2) * arg0);
        field6657++;
        this.method2661(arg0, this.field6663, 6);
        if (!arg3) {
            field6667 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public final void method2665(byte arg0) {
        field6651++;
        if (arg0 == 68) {
            this.method2661(this.field6662, this.field6658, 6);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lrl;Lm;Lgb;IIIII)V")
    public class457(class487 arg0, class120 arg1, class136 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6666 = arg7;
        this.field6659 = arg0;
        this.field6654 = arg6;
        this.field6650 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field6434 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field1743[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6662 = var10;
        if (var10 <= 0) {
            this.field6653 = null;
        } else {
            class156 var14 = new class156(var10 * 2);
            if (this.field6659.field7350) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field6434 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field1743[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method961(var18[var19] & 0xFFFF, 1608339368);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field6434 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field1743[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method988(var23[var24] & 0xFFFF, -461070776);
                            }
                        }
                    }
                }
            }
            this.field6658 = this.field6659.method2910(5123, false, var14.field2041, var14.field2018, 768);
            this.field6663 = new class142(this.field6659, 5123, null, 1);
        }
    }

    static {
        new class194("From", "Von:", "De", "De");
        field6660 = null;
        field6665 = new int[4096];
        field6661 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field6667 = new int[6];
    }
}
