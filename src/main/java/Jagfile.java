import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ATJMVOZR")
public class Jagfile {

    @OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "I")
    private int field49 = -766;

    @OriginalMember(owner = "client!ATJMVOZR", name = "b", descriptor = "Z")
    private boolean field50 = true;

    @OriginalMember(owner = "client!ATJMVOZR", name = "d", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ATJMVOZR", name = "i", descriptor = "Z")
    private boolean field57;

    @OriginalMember(owner = "client!ATJMVOZR", name = "c", descriptor = "[B")
    public byte[] field51;

    @OriginalMember(owner = "client!ATJMVOZR", name = "e", descriptor = "[I")
    public int[] field53;

    @OriginalMember(owner = "client!ATJMVOZR", name = "f", descriptor = "[I")
    public int[] field54;

    @OriginalMember(owner = "client!ATJMVOZR", name = "g", descriptor = "[I")
    public int[] field55;

    @OriginalMember(owner = "client!ATJMVOZR", name = "h", descriptor = "[I")
    public int[] field56;

    @OriginalMember(owner = "client!ATJMVOZR", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        this.method1(0, arg0);
        if (arg1 < 3 || arg1 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "(I[B)V")
    private void method1(int arg0, byte[] arg1) {
        Packet var3 = new Packet(true, arg1);
        int var4 = var3.g3();
        int var5 = var3.g3();
        if (var4 == var5) {
            this.field51 = arg1;
            this.field57 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method445(var6, var4, arg1, var5, 6);
            this.field51 = var6;
            var3 = new Packet(true, this.field51);
            this.field57 = true;
        }
        this.field52 = var3.g2();
        this.field53 = new int[this.field52];
        this.field54 = new int[this.field52];
        this.field55 = new int[this.field52];
        if (arg0 != 0) {
            return;
        }
        this.field56 = new int[this.field52];
        int var7 = this.field52 * 10 + var3.pos;
        for (int var8 = 0; var8 < this.field52; var8++) {
            this.field53[var8] = var3.g4();
            this.field54[var8] = var3.g3();
            this.field55[var8] = var3.g3();
            this.field56[var8] = var7;
            var7 += this.field55[var8];
        }
    }

    @OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method2(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field52; var6++) {
            if (this.field53[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field54[var6]];
                }
                if (this.field57) {
                    for (int var7 = 0; var7 < this.field54[var6]; var7++) {
                        arg1[var7] = this.field51[this.field56[var6] + var7];
                    }
                } else {
                    BZip2.method445(arg1, this.field54[var6], this.field51, this.field55[var6], this.field56[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
