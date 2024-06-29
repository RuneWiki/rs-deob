import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class299 {

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field4241 = 0;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
    private boolean field4244 = false;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public int field4240 = 0;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "Llt;")
    public static class475 field4245;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "[Z")
    public static boolean[] field4257;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "Lwa;")
    public static class433 field4258;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "J")
    public long field4236;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ldh;IB)V")
    private final void method1893(class209 arg0, int arg1, byte arg2) {
        field4250++;
        if (arg1 == 1) {
            this.field4237 = arg0.method1450((byte) 96);
        } else if (arg1 == 2) {
            arg0.method1428(32122);
        } else if (arg1 == 3) {
            this.field4249 = arg0.method1452(arg2 ^ 0xFFFF00A5);
            this.field4246 = arg0.method1452(65280);
            this.field4251 = arg0.method1452(65280);
        } else if (arg1 == 4) {
            this.field4248 = arg0.method1428(arg2 + 32213);
            this.field4254 = arg0.method1452(arg2 ^ 0xFFFF00A5);
        } else if (arg1 == 6) {
            this.field4239 = arg0.method1428(32122);
        } else if (arg1 == 8) {
            this.field4241 = 1;
        } else if (arg1 == 9) {
            this.field4240 = 1;
        } else if (arg1 == 10) {
            this.field4244 = true;
        }
        if (arg2 != -91) {
            this.field4255 = 58;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
    public final void method1894(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field4242 = class457.field6759[this.field4237 << 3];
        field4252++;
        this.field4235 = (int) Math.sqrt((double) (this.field4249 * this.field4249 + (this.field4246 * this.field4246 + (this.field4251 * this.field4251))));
        if (this.field4254 == 0) {
            this.field4254 = 1;
        }
        if (this.field4248 == 0) {
            this.field4236 = 2147483647L;
        } else if (this.field4248 == 1) {
            this.field4236 = (this.field4235 * 8 / this.field4254);
            this.field4236 *= this.field4236;
        } else if (this.field4248 == 2) {
            this.field4236 = (this.field4235 * 8 / this.field4254);
        }
        if (this.field4244) {
            this.field4235 *= -1;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        if (arg0 != -74) {
            field4257 = null;
        }
        field4258 = null;
        field4245 = null;
        field4257 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[BI[BII)V")
    public static final void method1896(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field4243++;
        if (arg1 >= -62) {
            method1895((byte) 39);
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg6[var10001] = (byte) (arg6[var10001] - arg4[arg8++]);
                int var14 = arg3++;
                arg6[var14] = (byte) (arg6[var14] - arg4[arg8++]);
                int var15 = arg3++;
                arg6[var15] = (byte) (arg6[var15] - arg4[arg8++]);
                int var16 = arg3++;
                arg6[var16] = (byte) (arg6[var16] - arg4[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg6[var10001] = (byte) (arg6[var10001] - arg4[arg8++]);
            }
            arg3 += arg7;
            arg8 += arg2;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1897(String arg0, int arg1, int arg2) {
        field4253++;
        class338 var3 = class230.method1580(2, -1332166328, arg2);
        var3.method2053(-82);
        if (arg1 == -25805) {
            var3.field4757 = arg0;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ldh;B)V")
    public final void method1898(class209 arg0, byte arg1) {
        field4247++;
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                if (arg1 <= 13) {
                    method1897(null, 69, -20);
                    return;
                } else {
                    return;
                }
            }
            this.method1893(arg0, var3, (byte) -91);
        }
    }

    static {
        new class475("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field4245 = new class475("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        field4256 = 0;
        field4257 = new boolean[8];
        new class475("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field4258 = new class433(16);
    }
}
