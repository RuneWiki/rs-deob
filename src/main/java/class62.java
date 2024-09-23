import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSUYIIVA")
public class class62 {

    @OriginalMember(owner = "VSUYIIVA", name = "a", descriptor = "I")
    private int field1581 = 4;

    @OriginalMember(owner = "VSUYIIVA", name = "b", descriptor = "I")
    private int field1582 = -830;

    @OriginalMember(owner = "VSUYIIVA", name = "c", descriptor = "Z")
    private boolean field1583 = false;

    @OriginalMember(owner = "VSUYIIVA", name = "e", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "VSUYIIVA", name = "j", descriptor = "Z")
    private boolean field1590;

    @OriginalMember(owner = "VSUYIIVA", name = "d", descriptor = "[B")
    public byte[] field1584;

    @OriginalMember(owner = "VSUYIIVA", name = "f", descriptor = "[I")
    public int[] field1586;

    @OriginalMember(owner = "VSUYIIVA", name = "g", descriptor = "[I")
    public int[] field1587;

    @OriginalMember(owner = "VSUYIIVA", name = "h", descriptor = "[I")
    public int[] field1588;

    @OriginalMember(owner = "VSUYIIVA", name = "i", descriptor = "[I")
    public int[] field1589;

    @OriginalMember(owner = "VSUYIIVA", name = "<init>", descriptor = "([BZ)V")
    public class62(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field1582 = -470;
        }
        this.method569(arg0, 4);
    }

    @OriginalMember(owner = "VSUYIIVA", name = "a", descriptor = "([BI)V")
    private void method569(byte[] arg0, int arg1) {
        class8 var3 = new class8(arg0, 792);
        int var4 = var3.method34();
        int var5 = var3.method34();
        if (var4 == var5) {
            this.field1584 = arg0;
            this.field1590 = false;
        } else {
            byte[] var6 = new byte[var4];
            class30.method312(var6, var4, arg0, var5, 6);
            this.field1584 = var6;
            var3 = new class8(this.field1584, 792);
            this.field1590 = true;
        }
        this.field1585 = var3.method32();
        this.field1586 = new int[this.field1585];
        this.field1587 = new int[this.field1585];
        if (this.field1581 != arg1) {
            this.field1581 = -206;
        }
        this.field1588 = new int[this.field1585];
        this.field1589 = new int[this.field1585];
        int var7 = this.field1585 * 10 + var3.field72;
        for (int var8 = 0; var8 < this.field1585; var8++) {
            this.field1586[var8] = var3.method35();
            this.field1587[var8] = var3.method34();
            this.field1588[var8] = var3.method34();
            this.field1589[var8] = var7;
            var7 += this.field1588[var8];
        }
    }

    @OriginalMember(owner = "VSUYIIVA", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method570(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1585; var6++) {
            if (this.field1586[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1587[var6]];
                }
                if (this.field1590) {
                    for (int var7 = 0; var7 < this.field1587[var6]; var7++) {
                        arg1[var7] = this.field1584[this.field1589[var6] + var7];
                    }
                } else {
                    class30.method312(arg1, this.field1587[var6], this.field1584, this.field1588[var6], this.field1589[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
