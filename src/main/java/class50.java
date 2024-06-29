import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SXKKBWPU")
public class class50 {

    @OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "Z")
    private boolean field1397 = false;

    @OriginalMember(owner = "client!SXKKBWPU", name = "b", descriptor = "Z")
    private boolean field1398 = true;

    @OriginalMember(owner = "client!SXKKBWPU", name = "d", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!SXKKBWPU", name = "i", descriptor = "Z")
    private boolean field1405;

    @OriginalMember(owner = "client!SXKKBWPU", name = "c", descriptor = "[B")
    public byte[] field1399;

    @OriginalMember(owner = "client!SXKKBWPU", name = "e", descriptor = "[I")
    public int[] field1401;

    @OriginalMember(owner = "client!SXKKBWPU", name = "f", descriptor = "[I")
    public int[] field1402;

    @OriginalMember(owner = "client!SXKKBWPU", name = "g", descriptor = "[I")
    public int[] field1403;

    @OriginalMember(owner = "client!SXKKBWPU", name = "h", descriptor = "[I")
    public int[] field1404;

    @OriginalMember(owner = "client!SXKKBWPU", name = "<init>", descriptor = "([BI)V")
    public class50(byte[] arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            this.field1398 = !this.field1398;
        }
        this.method441((byte) -91, arg0);
    }

    @OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "(B[B)V")
    private void method441(byte arg0, byte[] arg1) {
        if (arg0 != -91) {
            return;
        }
        class53 var3 = new class53(arg1, -631);
        int var4 = var3.method472();
        int var5 = var3.method472();
        if (var4 == var5) {
            this.field1399 = arg1;
            this.field1405 = false;
        } else {
            byte[] var6 = new byte[var4];
            class54.method507(var6, var4, arg1, var5, 6);
            this.field1399 = var6;
            var3 = new class53(this.field1399, -631);
            this.field1405 = true;
        }
        this.field1400 = var3.method470();
        this.field1401 = new int[this.field1400];
        this.field1402 = new int[this.field1400];
        this.field1403 = new int[this.field1400];
        this.field1404 = new int[this.field1400];
        int var7 = this.field1400 * 10 + var3.field1457;
        for (int var8 = 0; var8 < this.field1400; var8++) {
            this.field1401[var8] = var3.method473();
            this.field1402[var8] = var3.method472();
            this.field1403[var8] = var3.method472();
            this.field1404[var8] = var7;
            var7 += this.field1403[var8];
        }
    }

    @OriginalMember(owner = "client!SXKKBWPU", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method442(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1400; var6++) {
            if (this.field1401[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1402[var6]];
                }
                if (this.field1405) {
                    for (int var7 = 0; var7 < this.field1402[var6]; var7++) {
                        arg1[var7] = this.field1399[this.field1404[var6] + var7];
                    }
                } else {
                    class54.method507(arg1, this.field1402[var6], this.field1399, this.field1403[var6], this.field1404[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
