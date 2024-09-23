import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OTSGNSQM")
public class class41 {

    @OriginalMember(owner = "OTSGNSQM", name = "b", descriptor = "Z")
    private boolean field1181 = false;

    @OriginalMember(owner = "OTSGNSQM", name = "a", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "OTSGNSQM", name = "d", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "OTSGNSQM", name = "i", descriptor = "Z")
    private boolean field1188;

    @OriginalMember(owner = "OTSGNSQM", name = "c", descriptor = "[B")
    public byte[] field1182;

    @OriginalMember(owner = "OTSGNSQM", name = "e", descriptor = "[I")
    public int[] field1184;

    @OriginalMember(owner = "OTSGNSQM", name = "f", descriptor = "[I")
    public int[] field1185;

    @OriginalMember(owner = "OTSGNSQM", name = "g", descriptor = "[I")
    public int[] field1186;

    @OriginalMember(owner = "OTSGNSQM", name = "h", descriptor = "[I")
    public int[] field1187;

    @OriginalMember(owner = "OTSGNSQM", name = "<init>", descriptor = "([BZ)V")
    public class41(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.field1180 = -388;
        }
        this.method375(507, arg0);
    }

    @OriginalMember(owner = "OTSGNSQM", name = "a", descriptor = "(I[B)V")
    private void method375(int arg0, byte[] arg1) {
        class68 var3 = new class68(arg1, -103);
        int var4 = var3.method553();
        int var5 = var3.method553();
        if (var4 == var5) {
            this.field1182 = arg1;
            this.field1188 = false;
        } else {
            byte[] var6 = new byte[var4];
            class51.method418(var6, var4, arg1, var5, 6);
            this.field1182 = var6;
            var3 = new class68(this.field1182, -103);
            this.field1188 = true;
        }
        this.field1183 = var3.method551();
        this.field1184 = new int[this.field1183];
        this.field1185 = new int[this.field1183];
        this.field1186 = new int[this.field1183];
        int var7 = 68 / arg0;
        this.field1187 = new int[this.field1183];
        int var8 = this.field1183 * 10 + var3.field1612;
        for (int var9 = 0; var9 < this.field1183; var9++) {
            this.field1184[var9] = var3.method554();
            this.field1185[var9] = var3.method553();
            this.field1186[var9] = var3.method553();
            this.field1187[var9] = var8;
            var8 += this.field1186[var9];
        }
    }

    @OriginalMember(owner = "OTSGNSQM", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method376(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1183; var6++) {
            if (this.field1184[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1185[var6]];
                }
                if (this.field1188) {
                    for (int var7 = 0; var7 < this.field1185[var6]; var7++) {
                        arg1[var7] = this.field1182[this.field1187[var6] + var7];
                    }
                } else {
                    class51.method418(arg1, this.field1185[var6], this.field1182, this.field1186[var6], this.field1187[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
