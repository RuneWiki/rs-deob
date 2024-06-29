import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class331 extends class466 {

    @OriginalMember(owner = "client!br", name = "K", descriptor = "I")
    private int field4421 = 20;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    private int field4424 = 0;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "I")
    private int field4426 = 1365;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "[I")
    public static int[] field4425;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "Lbu;")
    public static class18 field4418;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2029(String arg0, int arg1) {
        ++field4416;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 == -38 && ~(var4 + 2) > ~var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (~var6 <= -49 && var6 <= '9') {
                    var8 = var6 + -48;
                } else if (var6 >= 'a' && ~var6 >= -103) {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (~var6 > -66 || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + -55;
                }
                char var9 = arg0.charAt(var4 - -2);
                int var10 = var8 * 16;
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 + -48 + var10;
                } else if (var9 >= 'a' && ~var9 >= -103) {
                    var11 = var9 + '\n' + -97 + var10;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + -65 + 10 + var10;
                }
                if (var11 != 0 && class560.method3191((byte) var11, 101)) {
                    var2.append(class363.method2173((byte) var11, true));
                }
                var4 += 2;
            } else if (~var5 != -44) {
                var2.append(var5);
            } else {
                var2.append(' ');
            }
        }
        if (arg1 != -31881) {
            field4422 = -26;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V")
    public static void method2030(int arg0) {
        field4425 = null;
        if (arg0 != 32) {
            field4423 = -29;
        }
        field4418 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.method2(-128, 106);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field4419 = arg0.method93((byte) 79);
                    }
                } else {
                    this.field4424 = arg0.method93((byte) 118);
                }
            } else {
                this.field4421 = arg0.method93((byte) 122);
            }
        } else {
            this.field4426 = arg0.method93((byte) 96);
        }
        ++field4420;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class331() {
        super(0, true);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
    public static final void method2031(byte arg0, int arg1) {
        ++field4417;
        class107.field1637 = 1000000000L / (long) arg1;
        if (arg0 != 90) {
            method2031((byte) -92, -61);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field4415;
        if (arg1 != 0) {
            this.field4426 = 38;
        }
        int[] var3 = super.field6557.method565(arg0, arg1 + -24728);
        if (super.field6557.field1163) {
            for (int var4 = 0; var4 < class312.field4207; ++var4) {
                int var5 = (class431.field6129[var4] << 12) / this.field4426 + this.field4424;
                int var6 = (class63.field1085[arg0] << 12) / this.field4426 + this.field4419;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field4421 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field4421 + -1 <= var13 ? 0 : (var13 << 12) / this.field4421;
            }
        }
        return var3;
    }

    static {
        new class104((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field4423 = 0;
        field4422 = 0;
        field4425 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    }
}
