import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TXPLZUUI")
public class class60 {

    @OriginalMember(owner = "TXPLZUUI", name = "b", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "TXPLZUUI", name = "g", descriptor = "Z")
    private boolean field1514;

    @OriginalMember(owner = "TXPLZUUI", name = "a", descriptor = "[B")
    public byte[] field1508;

    @OriginalMember(owner = "TXPLZUUI", name = "c", descriptor = "[I")
    public int[] field1510;

    @OriginalMember(owner = "TXPLZUUI", name = "d", descriptor = "[I")
    public int[] field1511;

    @OriginalMember(owner = "TXPLZUUI", name = "e", descriptor = "[I")
    public int[] field1512;

    @OriginalMember(owner = "TXPLZUUI", name = "f", descriptor = "[I")
    public int[] field1513;

    @OriginalMember(owner = "TXPLZUUI", name = "<init>", descriptor = "([BZ)V")
    public class60(byte[] arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method505(arg0, 599);
    }

    @OriginalMember(owner = "TXPLZUUI", name = "a", descriptor = "([BI)V")
    private void method505(byte[] arg0, int arg1) {
        class43 var3 = new class43(arg0, 0);
        int var4 = var3.method334();
        int var5 = var3.method334();
        if (var4 == var5) {
            this.field1508 = arg0;
            this.field1514 = false;
        } else {
            byte[] var6 = new byte[var4];
            class32.method281(var6, var4, arg0, var5, 6);
            this.field1508 = var6;
            var3 = new class43(this.field1508, 0);
            this.field1514 = true;
        }
        this.field1509 = var3.method332();
        this.field1510 = new int[this.field1509];
        this.field1511 = new int[this.field1509];
        this.field1512 = new int[this.field1509];
        this.field1513 = new int[this.field1509];
        int var7 = 33 / arg1;
        int var8 = this.field1509 * 10 + var3.field1105;
        for (int var9 = 0; var9 < this.field1509; var9++) {
            this.field1510[var9] = var3.method335();
            this.field1511[var9] = var3.method334();
            this.field1512[var9] = var3.method334();
            this.field1513[var9] = var8;
            var8 += this.field1512[var9];
        }
    }

    @OriginalMember(owner = "TXPLZUUI", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method506(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1509; var6++) {
            if (this.field1510[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1511[var6]];
                }
                if (this.field1514) {
                    for (int var7 = 0; var7 < this.field1511[var6]; var7++) {
                        arg1[var7] = this.field1508[this.field1513[var6] + var7];
                    }
                } else {
                    class32.method281(arg1, this.field1511[var6], this.field1508, this.field1512[var6], this.field1513[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
