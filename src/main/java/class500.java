import java.awt.Canvas;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class500 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field6579 = -1;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6597 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lil;")
    private class68 field6580;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6585;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Ljava/lang/String;")
    private String field6592;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "Ljava/lang/String;")
    private String field6599;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "[I")
    private int[] field6582;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "[I")
    private int[] field6584;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "[I")
    private int[] field6586;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "[I")
    private int[] field6587;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "[I")
    private int[] field6594;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "[I")
    private int[] field6595;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "[I")
    private int[] field6596;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "[I")
    private int[] field6603;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field6581;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field6589;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "[[I")
    private int[][] field6588;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "[[I")
    private int[][] field6590;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "[[I")
    private int[][] field6591;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "[[I")
    public static int[][] field6598;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ[I[JI)V", line = 3)
    public static final void method2693(int arg0, boolean arg1, int[] arg2, long[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if (((long) (var10 & var11) + var7) > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method2693(var6 - 1, false, arg2, arg3, arg4);
            method2693(arg0, arg1, arg2, arg3, var6 + 1);
        }
        field6601++;
        if (arg1) {
            method2693(-57, true, null, null, 101);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 78)
    public static void method2694(int arg0) {
        if (arg0 != -8) {
            method2693(-128, false, null, null, -12);
        }
        field6597 = null;
        field6598 = null;
        field6585 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLes;)V", line = 96)
    public final void method2695(boolean arg0, class630 arg1) {
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                if (!arg0) {
                    method2694(6);
                }
                field6593++;
                return;
            }
            this.method2697(arg1, var3, -32723);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V", line = 129)
    public final void method2696(int arg0) {
        field6602++;
        if (this.field6592 == null) {
            this.field6592 = this.field6599;
        }
        if (arg0 != 1) {
            this.field6590 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Les;II)V", line = 145)
    private final void method2697(class630 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field6599 = arg0.method3497(-1);
        } else if (arg1 == 2) {
            this.field6592 = arg0.method3497(-1);
        } else if (arg1 == 3) {
            int var22 = arg0.method3501(-9268);
            this.field6590 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6590[var23][0] = arg0.method3470(arg2 + 45834);
                this.field6590[var23][1] = arg0.method3483(76);
                this.field6590[var23][2] = arg0.method3483(117);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method3501(-9268);
            this.field6588 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6588[var5][0] = arg0.method3470(arg2 + 45834);
                this.field6588[var5][1] = arg0.method3483(98);
                this.field6588[var5][2] = arg0.method3483(class688.method3877(arg2, -32675));
            }
        } else if (arg1 == 5) {
            arg0.method3470(13111);
        } else if (arg1 == 6) {
            arg0.method3501(-9268);
        } else if (arg1 == 7) {
            arg0.method3501(-9268);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method3501(-9268);
            } else if (arg1 == 10) {
                int var20 = arg0.method3501(-9268);
                this.field6596 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6596[var21] = arg0.method3483(62);
                }
            } else if (arg1 == 12) {
                arg0.method3483(71);
            } else if (arg1 == 13) {
                int var18 = arg0.method3501(-9268);
                this.field6582 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6582[var19] = arg0.method3470(13111);
                }
            } else if (arg1 == 14) {
                int var16 = arg0.method3501(arg2 ^ 0x5BE1);
                this.field6591 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field6591[var17][0] = arg0.method3501(-9268);
                    this.field6591[var17][1] = arg0.method3501(-9268);
                }
            } else if (arg1 == 15) {
                arg0.method3470(arg2 ^ 0xFFFFB31A);
            } else if (arg1 == 17) {
                this.field6579 = arg0.method3470(13111);
            } else if (arg1 == 18) {
                int var14 = arg0.method3501(-9268);
                this.field6584 = new int[var14];
                this.field6589 = new String[var14];
                this.field6594 = new int[var14];
                this.field6586 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field6586[var15] = arg0.method3483(class688.method3877(arg2, -32692));
                    this.field6584[var15] = arg0.method3483(class688.method3877(arg2, -32683));
                    this.field6594[var15] = arg0.method3483(68);
                    this.field6589[var15] = arg0.method3500((byte) 118);
                }
            } else if (arg1 == 19) {
                int var6 = arg0.method3501(-9268);
                this.field6587 = new int[var6];
                this.field6603 = new int[var6];
                this.field6581 = new String[var6];
                this.field6595 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6595[var7] = arg0.method3483(arg2 + 32800);
                    this.field6587[var7] = arg0.method3483(123);
                    this.field6603[var7] = arg0.method3483(88);
                    this.field6581[var7] = arg0.method3500((byte) 119);
                }
            } else if (arg1 == 249) {
                int var8 = arg0.method3501(-9268);
                if (this.field6580 == null) {
                    int var9 = class391.method2101(var8, 128);
                    this.field6580 = new class68(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method3501(-9268) == 1;
                    int var12 = arg0.method3517(-1);
                    class329 var13;
                    if (var11) {
                        var13 = new class103(arg0.method3500((byte) 121));
                    } else {
                        var13 = new class262(arg0.method3483(arg2 ^ 0xFFFF8047));
                    }
                    this.field6580.method402(var13, (byte) -64, (long) var12);
                }
            }
        }
        field6583++;
        if (arg2 != -32723) {
            this.method2697(null, 115, -110);
        }
    }
}
