import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class21 extends class83 {

    @OriginalMember(owner = "client!mp", name = "S", descriptor = "I")
    private int field203 = -1;

    @OriginalMember(owner = "client!mp", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field198 = new String[100];

    @OriginalMember(owner = "client!mp", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field209 = "glow3:";

    @OriginalMember(owner = "client!mp", name = "P", descriptor = "Lar;")
    public static class47 field200 = new class47(64);

    @OriginalMember(owner = "client!mp", name = "Z", descriptor = "Z")
    public static boolean field210 = false;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!mp", name = "T", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!mp", name = "U", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!mp", name = "W", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!mp", name = "X", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!mp", name = "V", descriptor = "[I")
    private int[] field206;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "[[Lja;")
    public static class89[][] field197;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field204;
        int[][] var3 = super.field927.method1774((byte) 119, arg1);
        if (!arg0) {
            this.field203 = 38;
        }
        if (super.field927.field4104) {
            int var4 = this.field205 * (~class91.field1047 == ~this.field201 ? arg1 : this.field201 * arg1 / class91.field1047);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class420.field6139 == ~this.field205) {
                for (int var8 = 0; var8 < class420.field6139; ++var8) {
                    int var9 = this.field206[var4++];
                    var7[var8] = class262.method1461(4080, var9 << 4);
                    var6[var8] = class262.method1461(var9, 65280) >> 4;
                    var5[var8] = class262.method1461(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class420.field6139 > var10; ++var10) {
                    int var11 = this.field205 * var10 / class420.field6139;
                    int var12 = this.field206[var4 + var11];
                    var7[var10] = class262.method1461(4080, var12 << 4);
                    var6[var10] = class262.method1461(var12, 65280) >> 4;
                    var5[var10] = class262.method1461(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIIZBI)V")
    public static final void method113(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        ++field202;
        if (arg5 != -6) {
            field198 = null;
        }
        if (~arg2 < ~arg3) {
            int var7 = (arg2 + arg3) / 2;
            int var8 = arg3;
            class156 var9 = class5.field41[var7];
            class5.field41[var7] = class5.field41[arg2];
            class5.field41[arg2] = var9;
            for (int var10 = arg3; ~arg2 < ~var10; ++var10) {
                if (~class370.method2237(arg0, var9, class5.field41[var10], arg6, arg1, -94, arg4) >= -1) {
                    class156 var11 = class5.field41[var10];
                    class5.field41[var10] = class5.field41[var8];
                    class5.field41[var8++] = var11;
                }
            }
            class5.field41[arg2] = class5.field41[var8];
            class5.field41[var8] = var9;
            method113(arg0, arg1, var8 + -1, arg3, arg4, (byte) -6, arg6);
            method113(arg0, arg1, arg2, var8 - -1, arg4, (byte) -6, arg6);
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public final void method114(byte arg0) {
        super.method114((byte) 123);
        ++field196;
        if (arg0 <= 95) {
            field200 = null;
        }
        this.field206 = null;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)V")
    public static void method115(int arg0) {
        field209 = null;
        field200 = null;
        field197 = null;
        if (arg0 != -4108) {
            field197 = null;
        }
        field198 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public final void method116(int arg0, int arg1, int arg2) {
        ++field195;
        super.method116(arg0, arg1, -20);
        int var4 = -77 % ((arg2 - 72) / 37);
        if (~this.field203 <= -1) {
            int var5 = class149.field1883.method1660(this.field203, (byte) -75).field825 ? 64 : 128;
            this.field206 = class149.field1883.method1662(false, var5, var5, 28861, 1.0F, this.field203);
            this.field205 = var5;
            this.field201 = var5;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)I")
    public final int method117(byte arg0) {
        if (arg0 != 25) {
            this.field205 = -112;
        }
        ++field207;
        return this.field203;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)V")
    public static final void method118(int arg0) {
        if (arg0 != 2) {
            method115(-111);
        }
        class212.field2873.method613(true);
        ++field208;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -69 / ((-27 - arg1) / 50);
        ++field199;
        if (arg0 == 0) {
            this.field203 = arg2.method1374(-2);
        }
    }
}
