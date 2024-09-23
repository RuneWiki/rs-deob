import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field856 = 862;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "xb", name = "h", descriptor = "Z")
    private boolean field863;

    @OriginalMember(owner = "xb", name = "b", descriptor = "[B")
    public byte[] field857;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    public int[] field859;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field860;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field861;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field862;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        int var3 = 83 / arg1;
        this.method293(0, arg0);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I[B)V")
    private void method293(int arg0, byte[] arg1) {
        Packet var3 = new Packet((byte) 3, arg1);
        int var4 = var3.method228();
        int var5 = var3.method228();
        if (var4 == var5) {
            this.field857 = arg1;
            this.field863 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method256(var6, var4, arg1, var5, 6);
            this.field857 = var6;
            var3 = new Packet((byte) 3, this.field857);
            this.field863 = true;
        }
        this.field858 = var3.method226();
        this.field859 = new int[this.field858];
        this.field860 = new int[this.field858];
        this.field861 = new int[this.field858];
        this.field862 = new int[this.field858];
        int var7 = this.field858 * 10 + var3.field702;
        if (arg0 != 0) {
            return;
        }
        for (int var8 = 0; var8 < this.field858; var8++) {
            this.field859[var8] = var3.method229();
            this.field860[var8] = var3.method228();
            this.field861[var8] = var3.method228();
            this.field862[var8] = var7;
            var7 += this.field861[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method294(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field858; var6++) {
            if (this.field859[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field860[var6]];
                }
                if (this.field863) {
                    for (int var7 = 0; var7 < this.field860[var6]; var7++) {
                        arg1[var7] = this.field857[this.field862[var6] + var7];
                    }
                } else {
                    BZip2.method256(arg1, this.field860[var6], this.field857, this.field861[var6], this.field862[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
