import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tb")
public class Jagfile {

    @OriginalMember(owner = "tb", name = "a", descriptor = "I")
    private int field694 = -958;

    @OriginalMember(owner = "tb", name = "b", descriptor = "Z")
    private boolean field695 = true;

    @OriginalMember(owner = "tb", name = "d", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "tb", name = "c", descriptor = "[B")
    public byte[] field696;

    @OriginalMember(owner = "tb", name = "e", descriptor = "[I")
    public int[] field698;

    @OriginalMember(owner = "tb", name = "f", descriptor = "[I")
    public int[] field699;

    @OriginalMember(owner = "tb", name = "g", descriptor = "[I")
    public int[] field700;

    @OriginalMember(owner = "tb", name = "h", descriptor = "[I")
    public int[] field701;

    @OriginalMember(owner = "tb", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        int var3 = 59 / arg1;
        this.method224((byte) -75, arg0);
    }

    @OriginalMember(owner = "tb", name = "a", descriptor = "(B[B)V")
    private void method224(byte arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, (byte) 63);
        int var4 = var3.method189();
        int var5 = var3.method189();
        if (var4 == var5) {
            this.field696 = arg1;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method213(var6, var4, arg1, var5, 6);
            this.field696 = var6;
            var3 = new Packet(this.field696, (byte) 63);
        }
        this.field697 = var3.method187();
        if (arg0 != -75) {
            this.field695 = !this.field695;
        }
        this.field698 = new int[this.field697];
        this.field699 = new int[this.field697];
        this.field700 = new int[this.field697];
        this.field701 = new int[this.field697];
        int var7 = this.field697 * 10 + var3.field586;
        for (int var8 = 0; var8 < this.field697; var8++) {
            this.field698[var8] = var3.method190();
            this.field699[var8] = var3.method189();
            this.field700[var8] = var3.method189();
            this.field701[var8] = var7;
            var7 += this.field700[var8];
        }
    }

    @OriginalMember(owner = "tb", name = "a", descriptor = "(I[BLjava/lang/String;)[B")
    public byte[] method225(int arg0, byte[] arg1, String arg2) {
        int var4 = 0;
        String var5 = arg2.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        for (int var7 = 0; var7 < this.field697; var7++) {
            if (this.field698[var7] == var4) {
                if (arg1 == null) {
                    arg1 = new byte[this.field699[var7]];
                }
                if (this.field700[var7] == this.field699[var7]) {
                    for (int var9 = 0; var9 < this.field699[var7]; var9++) {
                        arg1[var9] = this.field696[this.field701[var7] + var9];
                    }
                } else {
                    BZip2.method213(arg1, this.field699[var7], this.field696, this.field700[var7], this.field701[var7]);
                }
                return arg1;
            }
        }
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        return null;
    }
}
