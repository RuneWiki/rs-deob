import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field861 = 9;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field862 = 29615;

    @OriginalMember(owner = "xb", name = "c", descriptor = "Z")
    private boolean field863 = true;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "xb", name = "j", descriptor = "Z")
    private boolean field870;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[B")
    public byte[] field864;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field866;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "xb", name = "i", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        this.method293(-6097, arg1);
        if (arg0 != 0) {
            this.field863 = !this.field863;
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I[B)V")
    private void method293(int arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, (byte) 1);
        int var4 = var3.method228();
        int var5 = var3.method228();
        if (var4 == var5) {
            this.field864 = arg1;
            this.field870 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method256(var6, var4, arg1, var5, 6);
            this.field864 = var6;
            var3 = new Packet(this.field864, (byte) 1);
            this.field870 = true;
        }
        this.field865 = var3.method226();
        this.field866 = new int[this.field865];
        if (arg0 != -6097) {
            this.field861 = -36;
        }
        this.field867 = new int[this.field865];
        this.field868 = new int[this.field865];
        this.field869 = new int[this.field865];
        int var7 = this.field865 * 10 + var3.field709;
        for (int var8 = 0; var8 < this.field865; var8++) {
            this.field866[var8] = var3.method229();
            this.field867[var8] = var3.method228();
            this.field868[var8] = var3.method228();
            this.field869[var8] = var7;
            var7 += this.field868[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method294(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field865; var6++) {
            if (this.field866[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field867[var6]];
                }
                if (this.field870) {
                    for (int var7 = 0; var7 < this.field867[var6]; var7++) {
                        arg1[var7] = this.field864[this.field869[var6] + var7];
                    }
                } else {
                    BZip2.method256(arg1, this.field867[var6], this.field864, this.field868[var6], this.field869[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
