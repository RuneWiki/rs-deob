import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XRWUKRPO")
public class class65 {

    @OriginalMember(owner = "XRWUKRPO", name = "a", descriptor = "B")
    private byte field1633 = 112;

    @OriginalMember(owner = "XRWUKRPO", name = "b", descriptor = "Z")
    private boolean field1634 = false;

    @OriginalMember(owner = "XRWUKRPO", name = "d", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "XRWUKRPO", name = "i", descriptor = "Z")
    private boolean field1641;

    @OriginalMember(owner = "XRWUKRPO", name = "c", descriptor = "[B")
    public byte[] field1635;

    @OriginalMember(owner = "XRWUKRPO", name = "e", descriptor = "[I")
    public int[] field1637;

    @OriginalMember(owner = "XRWUKRPO", name = "f", descriptor = "[I")
    public int[] field1638;

    @OriginalMember(owner = "XRWUKRPO", name = "g", descriptor = "[I")
    public int[] field1639;

    @OriginalMember(owner = "XRWUKRPO", name = "h", descriptor = "[I")
    public int[] field1640;

    @OriginalMember(owner = "XRWUKRPO", name = "<init>", descriptor = "(I[B)V")
    public class65(int arg0, byte[] arg1) {
        this.method580(this.field1633, arg1);
        if (arg0 != -31558) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "XRWUKRPO", name = "a", descriptor = "(B[B)V")
    private void method580(byte arg0, byte[] arg1) {
        class21 var3 = new class21(arg1, -49015);
        int var4 = var3.method248();
        int var5 = var3.method248();
        if (var4 == var5) {
            this.field1635 = arg1;
            this.field1641 = false;
        } else {
            byte[] var6 = new byte[var4];
            class42.method396(var6, var4, arg1, var5, 6);
            this.field1635 = var6;
            var3 = new class21(this.field1635, -49015);
            this.field1641 = true;
        }
        this.field1636 = var3.method246();
        this.field1637 = new int[this.field1636];
        this.field1638 = new int[this.field1636];
        if (arg0 != 112) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field1639 = new int[this.field1636];
        this.field1640 = new int[this.field1636];
        int var8 = this.field1636 * 10 + var3.field818;
        for (int var9 = 0; var9 < this.field1636; var9++) {
            this.field1637[var9] = var3.method249();
            this.field1638[var9] = var3.method248();
            this.field1639[var9] = var3.method248();
            this.field1640[var9] = var8;
            var8 += this.field1639[var9];
        }
    }

    @OriginalMember(owner = "XRWUKRPO", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method581(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1636; var6++) {
            if (this.field1637[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1638[var6]];
                }
                if (this.field1641) {
                    for (int var7 = 0; var7 < this.field1638[var6]; var7++) {
                        arg1[var7] = this.field1635[this.field1640[var6] + var7];
                    }
                } else {
                    class42.method396(arg1, this.field1638[var6], this.field1635, this.field1639[var6], this.field1640[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
