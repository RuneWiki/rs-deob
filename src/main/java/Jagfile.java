import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private int field862 = -751;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private boolean field863 = false;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "yb", name = "i", descriptor = "Z")
    private boolean field870;

    @OriginalMember(owner = "yb", name = "c", descriptor = "[B")
    public byte[] field864;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[I")
    public int[] field866;

    @OriginalMember(owner = "yb", name = "f", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "(B[B)V")
    public Jagfile(byte arg0, byte[] arg1) {
        if (arg0 != -21) {
            this.field863 = !this.field863;
        }
        this.method308(arg1, -42280);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "([BI)V")
    private void method308(byte[] arg0, int arg1) {
        Packet var3 = new Packet(arg0, 337);
        int var4 = var3.method243();
        int var5 = var3.method243();
        if (var4 == var5) {
            this.field864 = arg0;
            this.field870 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method271(var6, var4, arg0, var5, 6);
            this.field864 = var6;
            var3 = new Packet(this.field864, 337);
            this.field870 = true;
        }
        this.field865 = var3.method241();
        this.field866 = new int[this.field865];
        this.field867 = new int[this.field865];
        this.field868 = new int[this.field865];
        this.field869 = new int[this.field865];
        int var7 = this.field865 * 10 + var3.field710;
        for (int var8 = 0; var8 < this.field865; var8++) {
            this.field866[var8] = var3.method244();
            this.field867[var8] = var3.method243();
            this.field868[var8] = var3.method243();
            this.field869[var8] = var7;
            var7 += this.field868[var8];
        }
        if (arg1 != -42280) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method309(String arg0, byte[] arg1) {
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
                    BZip2.method271(arg1, this.field867[var6], this.field864, this.field868[var6], this.field869[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
