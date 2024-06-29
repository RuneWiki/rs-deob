import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class231 extends class258 {

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "[I")
    private int[] field3411 = new int[this.field3814];

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "Lpm;")
    public static class349 field3421;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "[[I")
    public static int[][] field3422;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    private int field3417;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "Lvj;")
    public static class256 field3418;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "Lef;")
    public static class284 field3414;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "[B")
    private byte[] field3413;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "[Lnn;")
    public static class239[] field3420;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIF)V")
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field3814 < ~var7; ++var7) {
            this.field3411[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public final void method1599(boolean arg0) {
        this.field3417 = Math.abs(this.field3417);
        if (!arg0) {
            field3420 = null;
        }
        ++field3416;
        if (this.field3417 >= 4096) {
            this.field3417 = 4095;
        }
        this.method1166(this.field3410++, (byte) (this.field3417 >> 4));
        this.field3417 = 0;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IIII)V")
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        class74 var4 = class385.field5449[arg0][arg1][arg2];
        if (var4 != null) {
            class441 var5 = var4.field967;
            class441 var6 = var4.field976;
            if (var5 != null) {
                var5.field6304 = var5.field6304 * arg3 / 16;
                var5.field6305 = var5.field6305 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field6304 = var6.field6304 * arg3 / 16;
                var6.field6305 = var6.field6305 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILbb;ILbr;Lsg;ILjava/lang/String;IILug;)V")
    public static final void method1601(int arg0, int arg1, int arg2, class182 arg3, int arg4, class223 arg5, class226 arg6, int arg7, String arg8, int arg9, int arg10, class335 arg11) {
        ++field3408;
        int var12;
        if (~class336.field4878 != -5) {
            var12 = 16383 & (int) class358.field5176 + class63.field842;
        } else {
            var12 = 16383 & (int) class358.field5176;
        }
        int var13 = Math.max(arg5.field3250 / 2, arg5.field3282 / 2) - -10;
        int var14 = arg1 * arg1 + arg2 * arg2;
        if (var13 * var13 >= var14) {
            int var15 = class447.field6381[var12];
            int var16 = class447.field6390[var12];
            if (class336.field4878 != arg4) {
                var15 = var15 * 256 / (class261.field3863 + 256);
                var16 = var16 * 256 / (class261.field3863 + 256);
            }
            int var17 = arg1 * var16 + arg2 * var15 >> 15;
            int var18 = arg2 * var16 - arg1 * var15 >> 15;
            int var19 = arg3.method1308(arg4 + -4, arg8, (class256[]) null, 100);
            int var20 = var17 - var19 / 2;
            int var21 = arg3.method1307(0, 100, -21433, arg8, (class256[]) null);
            if (var20 >= -arg5.field3250 && ~arg5.field3250 <= ~var20 && var18 >= -arg5.field3282 && arg5.field3282 >= var18) {
                arg11.method2204(0, 1, arg0, arg8, 0, arg5.field3250 / 2 + arg7 + var20, 50, 16777215, arg6, arg10 - -(arg5.field3282 / 2) - var21 + -arg9 + -var18, 0, arg7, (int[]) null, arg10, var19, (class256[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        field3418 = null;
        field3420 = null;
        field3414 = null;
        field3422 = null;
        if (arg0 != 113) {
            method1602((byte) 76);
        }
        field3421 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
    public void method1166(int arg0, byte arg1) {
        this.field3413[this.field3410++] = (byte) (127 + (class209.method1483(arg1, 255) >> 1));
        ++field3409;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public final void method1603(byte arg0) {
        this.field3410 = 0;
        ++field3412;
        if (arg0 <= -69) {
            this.field3417 = 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
    public final void method1604(int arg0, int arg1, int arg2) {
        ++field3419;
        if (arg2 != 16898) {
            field3418 = null;
        }
        this.field3417 += this.field3411[arg1] * arg0 >> 12;
    }

    static {
        new class349("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field3415 = 100;
        field3421 = new class349("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        field3422 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
    }
}
