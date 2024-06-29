import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class690 extends class278 {

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    private int field9634;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    private int field9624;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    private int field9623;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field9633;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    private int field9625;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    private int field9627;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    private int field9631;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field9632;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "[B")
    private byte[] field9629;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 5)
    public final void method717(int arg0, int arg1, int arg2) {
        if (arg0 != 23964) {
            return;
        }
        field9621++;
        if (arg1 == 0) {
            this.field9631 = this.field9634 - (arg2 >= 0 ? arg2 : -arg2);
            this.field9627 = 4096;
            this.field9631 = this.field9631 * this.field9631 >> 12;
            this.field9632 = this.field9631;
            return;
        }
        this.field9627 = this.field9631 * this.field9624 >> 12;
        this.field9631 = this.field9634 - (arg2 < 0 ? -arg2 : arg2);
        if (this.field9627 < 0) {
            this.field9627 = 0;
        } else if (this.field9627 > 4096) {
            this.field9627 = 4096;
        }
        this.field9631 = this.field9631 * this.field9631 >> 12;
        this.field9631 = this.field9631 * this.field9627 >> 12;
        this.field9632 += this.field9633 * this.field9631 >> 12;
        this.field9633 = this.field9633 * this.field9623 >> 12;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 40)
    public static final String method3915(int arg0, String arg1) {
        field9628++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -4097) {
            method3916(null, 110, 54, null, -61, 81, 64, 3, -17, null, (byte) -7, null, -115);
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class342.method2168(arg1.charAt(var2), 32)) {
            var2++;
        }
        while (var3 > var2 && class342.method2168(arg1.charAt(var3 - 1), 32)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class329.method2075(var7, 12701)) {
                char var8 = class607.method3504(var7, (byte) 24);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([III[FIIIII[FB[II)V", line = 97)
    public static final void method3916(int[] arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9, byte arg10, int[] arg11, int arg12) {
        field9622++;
        if (arg10 < 10) {
            method3915(17, null);
        }
        int var13 = arg5 * arg12 + arg6;
        int var14 = arg1 * arg7 + arg2;
        int var15 = arg5 - arg8;
        int var16 = arg1 - arg8;
        if (arg0 == null) {
            for (int var17 = 0; var17 < arg4; var17++) {
                int var18 = arg8 + var13;
                while (var18 > var13) {
                    arg9[var14++] = arg3[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg3 == null) {
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = arg8 + var13;
                while (var22 > var13) {
                    arg11[var14++] = arg0[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var19 = 0; var19 < arg4; var19++) {
                int var20 = arg8 + var13;
                while (var20 > var13) {
                    arg11[var14] = arg0[var13];
                    arg9[var14++] = arg3[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 183)
    public final void method716(byte arg0) {
        this.field9632 = 0;
        this.field9625 = 0;
        field9630++;
        int var2 = -73 / ((-arg0 - 70) / 51);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 203)
    public class690(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9634 = (int) (arg6 * 4096.0F);
        this.field9624 = (int) (arg7 * 4096.0F);
        this.field9633 = this.field9623 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V", line = 214)
    public void method798(int arg0, int arg1, byte arg2) {
        if (arg0 != 11829) {
            this.field9629 = null;
        }
        this.field9629[arg1] = arg2;
        field9620++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 226)
    public final void method715(int arg0) {
        field9626++;
        this.field9632 >>= 0x4;
        if (arg0 != -16749) {
            return;
        }
        this.field9633 = this.field9623;
        if (this.field9632 < 0) {
            this.field9632 = 0;
        } else if (this.field9632 > 255) {
            this.field9632 = 255;
        }
        this.method798(11829, this.field9625++, (byte) this.field9632);
        this.field9632 = 0;
    }
}
