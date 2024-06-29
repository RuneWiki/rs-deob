import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class Jagfile {

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Z")
    private boolean field153;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "[B")
    public byte[] field147;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[I")
    public int[] field150;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[I")
    public int[] field151;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([B)V")
    public Jagfile(byte[] arg0) {
        this.method61(arg0);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([B)V")
    private void method61(byte[] arg0) {
        Packet var2 = new Packet(arg0);
        int var3 = var2.method49();
        int var4 = var2.method49();
        if (var3 == var4) {
            this.field147 = arg0;
            this.field153 = false;
        } else {
            byte[] var5 = new byte[var3];
            BZip2.method59(var5, var3, arg0, var4, 6);
            this.field147 = var5;
            var2 = new Packet(this.field147);
            this.field153 = true;
        }
        this.field148 = var2.method47();
        this.field149 = new int[this.field148];
        this.field150 = new int[this.field148];
        this.field151 = new int[this.field148];
        this.field152 = new int[this.field148];
        int var6 = this.field148 * 10 + var2.field79;
        for (int var7 = 0; var7 < this.field148; var7++) {
            this.field149[var7] = var2.method44();
            this.field150[var7] = var2.method49();
            this.field151[var7] = var2.method49();
            this.field152[var7] = var6;
            var6 += this.field151[var7];
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method62(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field148; var6++) {
            if (this.field149[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field150[var6]];
                }
                if (this.field153) {
                    for (int var7 = 0; var7 < this.field150[var6]; var7++) {
                        arg1[var7] = this.field147[this.field152[var6] + var7];
                    }
                } else {
                    BZip2.method59(arg1, this.field150[var6], this.field147, this.field151[var6], this.field152[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
