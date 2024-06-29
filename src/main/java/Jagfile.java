import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class Jagfile {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Z")
    private boolean field161;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[B")
    public byte[] field155;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "[I")
    public int[] field159;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "([B)V")
    public Jagfile(byte[] arg0) {
        this.method75(arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([B)V")
    private void method75(byte[] arg0) {
        Packet var2 = new Packet(arg0);
        int var3 = var2.method60();
        int var4 = var2.method60();
        if (var3 == var4) {
            this.field155 = arg0;
            this.field161 = false;
        } else {
            byte[] var5 = new byte[var3];
            BZip2.method73(var5, var3, arg0, var4, 6);
            this.field155 = var5;
            var2 = new Packet(this.field155);
            this.field161 = true;
        }
        this.field156 = var2.method57();
        this.field157 = new int[this.field156];
        this.field158 = new int[this.field156];
        this.field159 = new int[this.field156];
        this.field160 = new int[this.field156];
        int var6 = this.field156 * 10 + var2.field87;
        for (int var7 = 0; var7 < this.field156; var7++) {
            this.field157[var7] = var2.method54();
            this.field158[var7] = var2.method60();
            this.field159[var7] = var2.method60();
            this.field160[var7] = var6;
            var6 += this.field159[var7];
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method76(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field156; var6++) {
            if (this.field157[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field158[var6]];
                }
                if (this.field161) {
                    for (int var7 = 0; var7 < this.field158[var6]; var7++) {
                        arg1[var7] = this.field155[this.field160[var6] + var7];
                    }
                } else {
                    BZip2.method73(arg1, this.field158[var6], this.field155, this.field159[var6], this.field160[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
