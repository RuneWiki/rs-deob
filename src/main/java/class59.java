import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VSQMPWOM")
public class class59 {

    @OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "I")
    private int field1538 = 3;

    @OriginalMember(owner = "client!VSQMPWOM", name = "b", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "client!VSQMPWOM", name = "c", descriptor = "I")
    private int field1540 = 1;

    @OriginalMember(owner = "client!VSQMPWOM", name = "e", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!VSQMPWOM", name = "j", descriptor = "Z")
    private boolean field1547;

    @OriginalMember(owner = "client!VSQMPWOM", name = "d", descriptor = "[B")
    public byte[] field1541;

    @OriginalMember(owner = "client!VSQMPWOM", name = "f", descriptor = "[I")
    public int[] field1543;

    @OriginalMember(owner = "client!VSQMPWOM", name = "g", descriptor = "[I")
    public int[] field1544;

    @OriginalMember(owner = "client!VSQMPWOM", name = "h", descriptor = "[I")
    public int[] field1545;

    @OriginalMember(owner = "client!VSQMPWOM", name = "i", descriptor = "[I")
    public int[] field1546;

    @OriginalMember(owner = "client!VSQMPWOM", name = "<init>", descriptor = "([BI)V")
    public class59(byte[] arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1539 = !this.field1539;
        }
        this.method525(arg0, 0);
    }

    @OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "([BI)V")
    private void method525(byte[] arg0, int arg1) {
        class3 var3 = new class3(arg0, -990);
        int var4 = var3.method58();
        int var5 = var3.method58();
        if (arg1 != 0) {
            return;
        }
        if (var4 == var5) {
            this.field1541 = arg0;
            this.field1547 = false;
        } else {
            byte[] var6 = new byte[var4];
            class66.method567(var6, var4, arg0, var5, 6);
            this.field1541 = var6;
            var3 = new class3(this.field1541, -990);
            this.field1547 = true;
        }
        this.field1542 = var3.method56();
        this.field1543 = new int[this.field1542];
        this.field1544 = new int[this.field1542];
        this.field1545 = new int[this.field1542];
        this.field1546 = new int[this.field1542];
        int var7 = this.field1542 * 10 + var3.field50;
        for (int var8 = 0; var8 < this.field1542; var8++) {
            this.field1543[var8] = var3.method59();
            this.field1544[var8] = var3.method58();
            this.field1545[var8] = var3.method58();
            this.field1546[var8] = var7;
            var7 += this.field1545[var8];
        }
    }

    @OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method526(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1542; var6++) {
            if (this.field1543[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1544[var6]];
                }
                if (this.field1547) {
                    for (int var7 = 0; var7 < this.field1544[var6]; var7++) {
                        arg1[var7] = this.field1541[this.field1546[var6] + var7];
                    }
                } else {
                    class66.method567(arg1, this.field1544[var6], this.field1541, this.field1545[var6], this.field1546[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
