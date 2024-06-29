import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class509 extends class409 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    private int field7182;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    private int field7185;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    private int field7188;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    private int field7183;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lvg;")
    public static class622 field7180 = new class622(95, -1);

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "J")
    public static long field7192 = 0L;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Lvg;")
    public static class622 field7193 = new class622(8, 0);

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "Lmv;")
    public static class295 field7194;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field7190;
        int var4 = this.field7188 * arg2 >> 12;
        int var5 = this.field7182 * arg2 >> 12;
        int var6 = this.field7183 * arg1 >> 12;
        int var7 = this.field7185 * arg1 >> 12;
        if (arg0 == 2048) {
            class478.method2741(var7, var4, super.field6098, (byte) 80, var5, var6, super.field6091);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIII)V")
    public class509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7182 = arg2;
        this.field7185 = arg3;
        this.field7188 = arg0;
        this.field7183 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        ++field7189;
        int var4 = this.field7188 * arg0 >> 12;
        int var5 = this.field7182 * arg0 >> 12;
        if (arg1 != 27775) {
            this.method207(96, -103, 110);
        }
        int var6 = this.field7183 * arg2 >> 12;
        int var7 = this.field7185 * arg2 >> 12;
        class138.method979(var6, -56, var7, var5, var4, super.field6095);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static void method2890(byte arg0) {
        field7194 = null;
        if (arg0 >= 114) {
            field7180 = null;
            field7193 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
    public static final String[] method2891(String arg0, char arg1, int arg2) {
        ++field7184;
        int var3 = 23 / ((-27 - arg2) / 63);
        int var4 = class431.method2571(arg0, 3553, arg1);
        String[] var5 = new String[var4 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var4 > var8; ++var8) {
            int var9;
            for (var9 = var7; arg0.charAt(var9) != arg1; ++var9) {
            }
            var5[var6++] = arg0.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var4] = arg0.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lmv;B)V")
    public static final void method2892(class295 arg0, byte arg1) {
        ++field7186;
        class370.field5490 = arg0;
        if (arg1 != 48) {
            field7192 = 10L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    public static final void method2893(byte arg0) {
        ++field7187;
        class642.field9200.method3891(13747);
        if (arg0 != 78) {
            method2890((byte) -106);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        ++field7181;
        if (arg0 != -1) {
            field7180 = null;
        }
        int var4 = this.field7188 * arg2 >> 12;
        int var5 = this.field7182 * arg2 >> 12;
        int var6 = this.field7183 * arg1 >> 12;
        int var7 = this.field7185 * arg1 >> 12;
        class481.method2756(var4, super.field6091, super.field6098, super.field6095, var6, var7, (byte) -97, var5);
    }
}
