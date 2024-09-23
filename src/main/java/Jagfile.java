import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field862 = -550;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field863 = 30967;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "xb", name = "i", descriptor = "Z")
    private boolean field870;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[B")
    public byte[] field864;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field866;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        this.method296((byte) 9, arg0);
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(B[B)V")
    private void method296(byte arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, 15787);
        int var4 = var3.method231();
        int var5 = var3.method231();
        if (var4 == var5) {
            this.field864 = arg1;
            this.field870 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method259(var6, var4, arg1, var5, 6);
            this.field864 = var6;
            var3 = new Packet(this.field864, 15787);
            this.field870 = true;
        }
        this.field865 = var3.method229();
        this.field866 = new int[this.field865];
        if (arg0 != 9) {
            return;
        }
        boolean var7 = false;
        this.field867 = new int[this.field865];
        this.field868 = new int[this.field865];
        this.field869 = new int[this.field865];
        int var8 = this.field865 * 10 + var3.field710;
        for (int var9 = 0; var9 < this.field865; var9++) {
            this.field866[var9] = var3.method232();
            this.field867[var9] = var3.method231();
            this.field868[var9] = var3.method231();
            this.field869[var9] = var8;
            var8 += this.field868[var9];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method297(String arg0, byte[] arg1) {
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
                    BZip2.method259(arg1, this.field867[var6], this.field864, this.field868[var6], this.field869[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
