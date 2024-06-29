import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class153 extends class49 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "B")
    public byte field2210;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "S")
    public short field2213;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "S")
    public short field2208;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "B")
    public byte field2206;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "S")
    public short field2216;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Z")
    public boolean field2207;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "S")
    public short field2214;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lcm;")
    public static class449 field2211;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field2218++;
        class428 var8 = new class428();
        var8.field6364 = arg4;
        var8.field6359 = arg0;
        var8.field6368 = arg5;
        var8.field6369 = arg7;
        var8.field6365 = class405.field6116 + arg1;
        var8.field6362 = arg3;
        if (arg2 != 8) {
            method999(70, -22, -36, -1, 9, -113, -10, 24, -128, 95);
        }
        var8.field6366 = arg6;
        class226.field3255.method2353(var8, -9798);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2212++;
        if (!class109.method719((byte) -119, arg3)) {
            return;
        }
        if (class471.field6886[arg3] == null) {
            client.method449(class59.field791[arg3], -1, arg9, arg7, arg6, arg5, arg1, arg2, arg0, arg4);
        } else {
            client.method449(class471.field6886[arg3], -1, arg9, arg7, arg6, arg5, arg1, arg2, arg0, arg4);
        }
        if (arg8 != 0) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
    public static final void method1000(int arg0, byte arg1) {
        field2219++;
        if (arg1 >= -54) {
            return;
        }
        for (class467 var2 = class415.field6218.method948(93); var2 != null; var2 = class415.field6218.method938(65)) {
            if ((var2.field6799 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method2785((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
    public void method1001(int arg0) {
        if (arg0 <= -89) {
            field2221++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ltf;B[[B)V")
    public static final void method1002(class167 arg0, byte arg1, byte[][] arg2) {
        for (int var3 = 0; var3 < arg0.field5171; var3++) {
            class300.method1929((byte) -4);
            for (int var4 = 0; var4 < class96.field1403 >> 3; var4++) {
                for (int var5 = 0; var5 < class485.field7122 >> 3; var5++) {
                    int var6 = class501.field7483[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field5190 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = (var6 & 0xFFEAE0) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class253.field3509.length; var12++) {
                                if (class253.field3509[var12] == var11 && arg2[var12] != null) {
                                    arg0.method1178(class444.field6605, arg2[var12], var5 * 8, var8, var7, (var10 & 0x7) * 8, var4 * 8, (var9 & 0x7) * 8, arg1 + 43, var3, class337.field5242);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -43) {
            method1000(102, (byte) -90);
        }
        field2209++;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public static void method1003(int arg0) {
        if (arg0 > 65) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I")
    public abstract int method779(byte arg0);

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field2210 = (byte) arg0;
        this.field2213 = (short) arg7;
        this.field2208 = (short) arg4;
        this.field2215 = arg3;
        this.field2217 = arg1;
        this.field2222 = arg2;
        this.field2206 = arg9;
        this.field2216 = (short) arg6;
        this.field2207 = arg8;
        this.field2214 = (short) arg5;
    }

    static {
        new class375("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field2211 = new class449(55, 15);
    }
}
