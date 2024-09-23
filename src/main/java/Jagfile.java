import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "B")
    private byte field894 = 9;

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private int field895 = 741;

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private int field896 = 2;

    @OriginalMember(owner = "yb", name = "e", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "yb", name = "j", descriptor = "Z")
    private boolean field903;

    @OriginalMember(owner = "yb", name = "d", descriptor = "[B")
    public byte[] field897;

    @OriginalMember(owner = "yb", name = "f", descriptor = "[I")
    public int[] field899;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    public int[] field900;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[I")
    public int[] field901;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[I")
    public int[] field902;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "([BB)V")
    public Jagfile(byte[] arg0, byte arg1) {
        this.method308((byte) 9, arg0);
        if (arg1 != -25) {
            this.field896 = -453;
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(B[B)V")
    private void method308(byte arg0, byte[] arg1) {
        Packet var3 = new Packet(45427, arg1);
        int var4 = var3.method243();
        int var5 = var3.method243();
        if (var4 == var5) {
            this.field897 = arg1;
            this.field903 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method271(var6, var4, arg1, var5, 6);
            this.field897 = var6;
            var3 = new Packet(45427, this.field897);
            this.field903 = true;
        }
        this.field898 = var3.method241();
        if (this.field894 == arg0) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field899 = new int[this.field898];
        this.field900 = new int[this.field898];
        this.field901 = new int[this.field898];
        this.field902 = new int[this.field898];
        int var9 = this.field898 * 10 + var3.field736;
        for (int var10 = 0; var10 < this.field898; var10++) {
            this.field899[var10] = var3.method244();
            this.field900[var10] = var3.method243();
            this.field901[var10] = var3.method243();
            this.field902[var10] = var9;
            var9 += this.field901[var10];
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method309(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field898; var6++) {
            if (this.field899[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field900[var6]];
                }
                if (this.field903) {
                    for (int var7 = 0; var7 < this.field900[var6]; var7++) {
                        arg1[var7] = this.field897[this.field902[var6] + var7];
                    }
                } else {
                    BZip2.method271(arg1, this.field900[var6], this.field897, this.field901[var6], this.field902[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
