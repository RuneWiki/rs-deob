import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SMIVAFST")
public class class52 {

    @OriginalMember(owner = "client!SMIVAFST", name = "b", descriptor = "I")
    private int field1496 = 490;

    @OriginalMember(owner = "client!SMIVAFST", name = "c", descriptor = "Z")
    private boolean field1497 = false;

    @OriginalMember(owner = "client!SMIVAFST", name = "d", descriptor = "I")
    private int field1498 = 8990;

    @OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!SMIVAFST", name = "f", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!SMIVAFST", name = "k", descriptor = "Z")
    private boolean field1505;

    @OriginalMember(owner = "client!SMIVAFST", name = "e", descriptor = "[B")
    public byte[] field1499;

    @OriginalMember(owner = "client!SMIVAFST", name = "g", descriptor = "[I")
    public int[] field1501;

    @OriginalMember(owner = "client!SMIVAFST", name = "h", descriptor = "[I")
    public int[] field1502;

    @OriginalMember(owner = "client!SMIVAFST", name = "i", descriptor = "[I")
    public int[] field1503;

    @OriginalMember(owner = "client!SMIVAFST", name = "j", descriptor = "[I")
    public int[] field1504;

    @OriginalMember(owner = "client!SMIVAFST", name = "<init>", descriptor = "([BI)V")
    public class52(byte[] arg0, int arg1) {
        this.method511(false, arg0);
        if (arg1 != 0) {
            this.field1495 = 327;
        }
    }

    @OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "(Z[B)V")
    private void method511(boolean arg0, byte[] arg1) {
        class7 var3 = new class7(arg1, (byte) 3);
        int var4 = var3.method51();
        int var5 = var3.method51();
        if (var4 == var5) {
            this.field1499 = arg1;
            this.field1505 = false;
        } else {
            byte[] var6 = new byte[var4];
            class33.method355(var6, var4, arg1, var5, 6);
            this.field1499 = var6;
            var3 = new class7(this.field1499, (byte) 3);
            this.field1505 = true;
        }
        this.field1500 = var3.method49();
        this.field1501 = new int[this.field1500];
        this.field1502 = new int[this.field1500];
        if (arg0) {
            this.field1497 = !this.field1497;
        }
        this.field1503 = new int[this.field1500];
        this.field1504 = new int[this.field1500];
        int var7 = this.field1500 * 10 + var3.field91;
        for (int var8 = 0; var8 < this.field1500; var8++) {
            this.field1501[var8] = var3.method52();
            this.field1502[var8] = var3.method51();
            this.field1503[var8] = var3.method51();
            this.field1504[var8] = var7;
            var7 += this.field1503[var8];
        }
    }

    @OriginalMember(owner = "client!SMIVAFST", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method512(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1500; var6++) {
            if (this.field1501[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1502[var6]];
                }
                if (this.field1505) {
                    for (int var7 = 0; var7 < this.field1502[var6]; var7++) {
                        arg1[var7] = this.field1499[this.field1504[var6] + var7];
                    }
                } else {
                    class33.method355(arg1, this.field1502[var6], this.field1499, this.field1503[var6], this.field1504[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
