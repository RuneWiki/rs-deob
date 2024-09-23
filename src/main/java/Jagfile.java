import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private int field869 = 7;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private boolean field870 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "yb", name = "i", descriptor = "Z")
    private boolean field877;

    @OriginalMember(owner = "yb", name = "c", descriptor = "[B")
    public byte[] field871;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[I")
    public int[] field873;

    @OriginalMember(owner = "yb", name = "f", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    public int[] field875;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[I")
    public int[] field876;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        this.method308(false, arg0);
        if (!arg1) {
            this.field869 = 369;
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Z[B)V")
    private void method308(boolean arg0, byte[] arg1) {
        Packet var3 = new Packet(16, arg1);
        int var4 = var3.method243();
        int var5 = var3.method243();
        if (arg0) {
            this.field869 = -144;
        }
        if (var4 == var5) {
            this.field871 = arg1;
            this.field877 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method271(var6, var4, arg1, var5, 6);
            this.field871 = var6;
            var3 = new Packet(16, this.field871);
            this.field877 = true;
        }
        this.field872 = var3.method241();
        this.field873 = new int[this.field872];
        this.field874 = new int[this.field872];
        this.field875 = new int[this.field872];
        this.field876 = new int[this.field872];
        int var7 = this.field872 * 10 + var3.field717;
        for (int var8 = 0; var8 < this.field872; var8++) {
            this.field873[var8] = var3.method244();
            this.field874[var8] = var3.method243();
            this.field875[var8] = var3.method243();
            this.field876[var8] = var7;
            var7 += this.field875[var8];
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method309(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field872; var6++) {
            if (this.field873[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field874[var6]];
                }
                if (this.field877) {
                    for (int var7 = 0; var7 < this.field874[var6]; var7++) {
                        arg1[var7] = this.field871[this.field876[var6] + var7];
                    }
                } else {
                    BZip2.method271(arg1, this.field874[var6], this.field871, this.field875[var6], this.field876[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
