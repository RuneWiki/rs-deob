import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XMRRKSSB")
public class class60 {

    @OriginalMember(owner = "XMRRKSSB", name = "a", descriptor = "Z")
    private boolean field1490 = false;

    @OriginalMember(owner = "XMRRKSSB", name = "c", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "XMRRKSSB", name = "h", descriptor = "Z")
    private boolean field1497;

    @OriginalMember(owner = "XMRRKSSB", name = "b", descriptor = "[B")
    public byte[] field1491;

    @OriginalMember(owner = "XMRRKSSB", name = "d", descriptor = "[I")
    public int[] field1493;

    @OriginalMember(owner = "XMRRKSSB", name = "e", descriptor = "[I")
    public int[] field1494;

    @OriginalMember(owner = "XMRRKSSB", name = "f", descriptor = "[I")
    public int[] field1495;

    @OriginalMember(owner = "XMRRKSSB", name = "g", descriptor = "[I")
    public int[] field1496;

    @OriginalMember(owner = "XMRRKSSB", name = "<init>", descriptor = "([BI)V")
    public class60(byte[] arg0, int arg1) {
        int var3 = 17 / arg1;
        this.method464(arg0, false);
    }

    @OriginalMember(owner = "XMRRKSSB", name = "a", descriptor = "([BZ)V")
    private void method464(byte[] arg0, boolean arg1) {
        class62 var3 = new class62(arg0, 49938);
        int var4 = var3.method482();
        if (arg1) {
            return;
        }
        int var5 = var3.method482();
        if (var4 == var5) {
            this.field1491 = arg0;
            this.field1497 = false;
        } else {
            byte[] var6 = new byte[var4];
            class32.method287(var6, var4, arg0, var5, 6);
            this.field1491 = var6;
            var3 = new class62(this.field1491, 49938);
            this.field1497 = true;
        }
        this.field1492 = var3.method480();
        this.field1493 = new int[this.field1492];
        this.field1494 = new int[this.field1492];
        this.field1495 = new int[this.field1492];
        this.field1496 = new int[this.field1492];
        int var7 = this.field1492 * 10 + var3.field1542;
        for (int var8 = 0; var8 < this.field1492; var8++) {
            this.field1493[var8] = var3.method483();
            this.field1494[var8] = var3.method482();
            this.field1495[var8] = var3.method482();
            this.field1496[var8] = var7;
            var7 += this.field1495[var8];
        }
    }

    @OriginalMember(owner = "XMRRKSSB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method465(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1492; var6++) {
            if (this.field1493[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1494[var6]];
                }
                if (this.field1497) {
                    for (int var7 = 0; var7 < this.field1494[var6]; var7++) {
                        arg1[var7] = this.field1491[this.field1496[var6] + var7];
                    }
                } else {
                    class32.method287(arg1, this.field1494[var6], this.field1491, this.field1495[var6], this.field1496[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
