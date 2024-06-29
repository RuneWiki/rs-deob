import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XOJZVVDK")
public class class60 {

    @OriginalMember(owner = "client!XOJZVVDK", name = "b", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!XOJZVVDK", name = "g", descriptor = "Z")
    private boolean field1602;

    @OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "[B")
    public byte[] field1596;

    @OriginalMember(owner = "client!XOJZVVDK", name = "c", descriptor = "[I")
    public int[] field1598;

    @OriginalMember(owner = "client!XOJZVVDK", name = "d", descriptor = "[I")
    public int[] field1599;

    @OriginalMember(owner = "client!XOJZVVDK", name = "e", descriptor = "[I")
    public int[] field1600;

    @OriginalMember(owner = "client!XOJZVVDK", name = "f", descriptor = "[I")
    public int[] field1601;

    @OriginalMember(owner = "client!XOJZVVDK", name = "<init>", descriptor = "([BI)V")
    public class60(byte[] arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method559(arg0, true);
    }

    @OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "([BZ)V")
    private void method559(byte[] arg0, boolean arg1) {
        class41 var3 = new class41(888, arg0);
        int var4 = var3.method344();
        int var5 = var3.method344();
        if (var4 == var5) {
            this.field1596 = arg0;
            this.field1602 = false;
        } else {
            byte[] var6 = new byte[var4];
            class19.method248(var6, var4, arg0, var5, 6);
            this.field1596 = var6;
            var3 = new class41(888, this.field1596);
            this.field1602 = true;
        }
        this.field1597 = var3.method342();
        this.field1598 = new int[this.field1597];
        this.field1599 = new int[this.field1597];
        this.field1600 = new int[this.field1597];
        if (!arg1) {
            return;
        }
        this.field1601 = new int[this.field1597];
        int var7 = this.field1597 * 10 + var3.field1241;
        for (int var8 = 0; var8 < this.field1597; var8++) {
            this.field1598[var8] = var3.method345();
            this.field1599[var8] = var3.method344();
            this.field1600[var8] = var3.method344();
            this.field1601[var8] = var7;
            var7 += this.field1600[var8];
        }
    }

    @OriginalMember(owner = "client!XOJZVVDK", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method560(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1597; var6++) {
            if (this.field1598[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1599[var6]];
                }
                if (this.field1602) {
                    for (int var7 = 0; var7 < this.field1599[var6]; var7++) {
                        arg1[var7] = this.field1596[this.field1601[var6] + var7];
                    }
                } else {
                    class19.method248(arg1, this.field1599[var6], this.field1596, this.field1600[var6], this.field1601[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
