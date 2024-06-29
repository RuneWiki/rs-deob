import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class37 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[S")
    public static short[] field69 = new short[256];

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lsk;")
    public static class423 field57 = new class423("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "Lum;")
    public static class348 field73 = new class348(0, 0);

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
    public static int[] field76 = new int[500];

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Loe;")
    public static class127 field74 = new class127(42, 3);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lq;")
    public static class282 field77;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient;")
    public static client field75;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method30(int arg0, int arg1, byte arg2) {
        int var4 = 0 % ((arg2 - 36) / 36);
        ++field56;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(FI[BFILgg;IIFIFFII)V", line = 13)
    public static final void method31(float arg0, int arg1, byte[] arg2, float arg3, int arg4, class111 arg5, int arg6, int arg7, float arg8, int arg9, float arg10, float arg11, int arg12, int arg13) {
        ++field67;
        int var14 = arg9 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; arg1 > var16; ++var16) {
            arg5.method794(arg11 / (float) arg9, arg6, arg10 / (float) arg12, 0, var15, false, arg12, arg3 * 127.0F, arg13, arg0 / (float) arg6, arg9);
            int var19 = arg4;
            arg0 *= 2.0F;
            arg10 *= 2.0F;
            arg11 *= 2.0F;
            arg3 *= arg8;
            for (int var20 = 0; ~var20 > ~var14; ++var20) {
                arg2[var19] = (byte) ((int) ((float) arg2[var19] + var15[var20]));
                ++var19;
            }
        }
        if (arg7 > 98) {
            int var17 = arg4;
            for (int var18 = 0; ~var18 > ~var14; ++var18) {
                arg2[var17] = (byte) (arg2[var17] + 127);
                ++var17;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 69)
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field60 = arg7;
        this.field59 = arg1;
        this.field65 = arg4;
        this.field66 = arg0;
        this.field72 = arg6;
        this.field61 = arg3;
        this.field64 = arg5;
        this.field68 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V", line = 84)
    public final void method32(int arg0, int arg1, int arg2) {
        if (arg1 == 10) {
            ++field63;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 97)
    public static final String method33(byte arg0, int arg1) {
        if (arg0 != 54) {
            field77 = null;
        }
        ++field71;
        return (255 & arg1 >> 24) + "." + ((arg1 & 16774616) >> 16) + "." + (arg1 >> 8 & 255) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 109)
    public static void method34(byte arg0) {
        int var1 = -66 % ((83 - arg0) / 42);
        field75 = null;
        field74 = null;
        field77 = null;
        field76 = null;
        field57 = null;
        field73 = null;
        field69 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILlt;Lvl;)V", line = 127)
    public static final void method35(int arg0, class458 arg1, class11 arg2) {
        class257.field3920 = arg1;
        class505.field7629 = arg2;
        ++field62;
        if (arg0 != 32161) {
            method35(86, (class458) null, (class11) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 146)
    public final void method36(int arg0, int arg1, int arg2) {
        ++field70;
        int var4 = this.field66 * arg1 >> 12;
        int var5 = this.field59 * arg2 >> 12;
        if (arg0 == 1) {
            int var6 = this.field68 * arg1 >> 12;
            int var7 = this.field61 * arg2 >> 12;
            int var8 = this.field65 * arg1 >> 12;
            int var9 = this.field64 * arg2 >> 12;
            int var10 = this.field72 * arg1 >> 12;
            int var11 = this.field60 * arg2 >> 12;
            class424.method2492(var5, var7, var8, var9, var4, super.field500, var6, var11, arg0, var10);
        }
    }
}
