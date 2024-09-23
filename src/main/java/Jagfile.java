import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field861 = 35839;

    @OriginalMember(owner = "xb", name = "b", descriptor = "Z")
    private boolean field862 = false;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "xb", name = "i", descriptor = "Z")
    private boolean field869;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[B")
    public byte[] field863;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field865;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field866;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        this.method294(9, arg1);
        if (arg0 != -32452) {
            this.field862 = !this.field862;
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I[B)V")
    private void method294(int arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, 185);
        int var4 = var3.method229();
        int var5 = var3.method229();
        if (var4 == var5) {
            this.field863 = arg1;
            this.field869 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method257(var6, var4, arg1, var5, 6);
            this.field863 = var6;
            var3 = new Packet(this.field863, 185);
            this.field869 = true;
        }
        this.field864 = var3.method227();
        this.field865 = new int[this.field864];
        this.field866 = new int[this.field864];
        this.field867 = new int[this.field864];
        this.field868 = new int[this.field864];
        int var7 = this.field864 * 10 + var3.field708;
        if (arg0 != 9) {
            this.field862 = !this.field862;
        }
        for (int var8 = 0; var8 < this.field864; var8++) {
            this.field865[var8] = var3.method230();
            this.field866[var8] = var3.method229();
            this.field867[var8] = var3.method229();
            this.field868[var8] = var7;
            var7 += this.field867[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method295(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field864; var6++) {
            if (this.field865[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field866[var6]];
                }
                if (this.field869) {
                    for (int var7 = 0; var7 < this.field866[var6]; var7++) {
                        arg1[var7] = this.field863[this.field868[var6] + var7];
                    }
                } else {
                    BZip2.method257(arg1, this.field866[var6], this.field863, this.field867[var6], this.field868[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
