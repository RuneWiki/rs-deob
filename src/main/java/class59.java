import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UUIGNTAD")
public class class59 {

    @OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "Z")
    private boolean field1525 = true;

    @OriginalMember(owner = "client!UUIGNTAD", name = "b", descriptor = "I")
    private int field1526 = 536;

    @OriginalMember(owner = "client!UUIGNTAD", name = "c", descriptor = "Z")
    private boolean field1527 = true;

    @OriginalMember(owner = "client!UUIGNTAD", name = "e", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!UUIGNTAD", name = "j", descriptor = "Z")
    private boolean field1534;

    @OriginalMember(owner = "client!UUIGNTAD", name = "d", descriptor = "[B")
    public byte[] field1528;

    @OriginalMember(owner = "client!UUIGNTAD", name = "f", descriptor = "[I")
    public int[] field1530;

    @OriginalMember(owner = "client!UUIGNTAD", name = "g", descriptor = "[I")
    public int[] field1531;

    @OriginalMember(owner = "client!UUIGNTAD", name = "h", descriptor = "[I")
    public int[] field1532;

    @OriginalMember(owner = "client!UUIGNTAD", name = "i", descriptor = "[I")
    public int[] field1533;

    @OriginalMember(owner = "client!UUIGNTAD", name = "<init>", descriptor = "(I[B)V")
    public class59(int arg0, byte[] arg1) {
        this.method544(arg1, true);
        if (arg0 != 0) {
            this.field1527 = !this.field1527;
        }
    }

    @OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "([BZ)V")
    private void method544(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class10 var3 = new class10(arg0, this.field1526);
        int var4 = var3.method198();
        int var5 = var3.method198();
        if (var4 == var5) {
            this.field1528 = arg0;
            this.field1534 = false;
        } else {
            byte[] var6 = new byte[var4];
            class13.method247(var6, var4, arg0, var5, 6);
            this.field1528 = var6;
            var3 = new class10(this.field1528, this.field1526);
            this.field1534 = true;
        }
        this.field1529 = var3.method196();
        this.field1530 = new int[this.field1529];
        this.field1531 = new int[this.field1529];
        this.field1532 = new int[this.field1529];
        this.field1533 = new int[this.field1529];
        int var7 = this.field1529 * 10 + var3.field646;
        for (int var8 = 0; var8 < this.field1529; var8++) {
            this.field1530[var8] = var3.method199();
            this.field1531[var8] = var3.method198();
            this.field1532[var8] = var3.method198();
            this.field1533[var8] = var7;
            var7 += this.field1532[var8];
        }
    }

    @OriginalMember(owner = "client!UUIGNTAD", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method545(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1529; var6++) {
            if (this.field1530[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1531[var6]];
                }
                if (this.field1534) {
                    for (int var7 = 0; var7 < this.field1531[var6]; var7++) {
                        arg1[var7] = this.field1528[this.field1533[var6] + var7];
                    }
                } else {
                    class13.method247(arg1, this.field1531[var6], this.field1528, this.field1532[var6], this.field1533[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
