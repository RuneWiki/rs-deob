import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LYZBHNJP")
public class class31 {

    @OriginalMember(owner = "LYZBHNJP", name = "a", descriptor = "I")
    private int field1031 = 9;

    @OriginalMember(owner = "LYZBHNJP", name = "b", descriptor = "I")
    private int field1032 = -963;

    @OriginalMember(owner = "LYZBHNJP", name = "c", descriptor = "I")
    private int field1033 = -302;

    @OriginalMember(owner = "LYZBHNJP", name = "d", descriptor = "Z")
    private boolean field1034 = false;

    @OriginalMember(owner = "LYZBHNJP", name = "f", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "LYZBHNJP", name = "k", descriptor = "Z")
    private boolean field1041;

    @OriginalMember(owner = "LYZBHNJP", name = "e", descriptor = "[B")
    public byte[] field1035;

    @OriginalMember(owner = "LYZBHNJP", name = "g", descriptor = "[I")
    public int[] field1037;

    @OriginalMember(owner = "LYZBHNJP", name = "h", descriptor = "[I")
    public int[] field1038;

    @OriginalMember(owner = "LYZBHNJP", name = "i", descriptor = "[I")
    public int[] field1039;

    @OriginalMember(owner = "LYZBHNJP", name = "j", descriptor = "[I")
    public int[] field1040;

    @OriginalMember(owner = "LYZBHNJP", name = "<init>", descriptor = "(I[B)V")
    public class31(int arg0, byte[] arg1) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method289(arg1, this.field1031);
    }

    @OriginalMember(owner = "LYZBHNJP", name = "a", descriptor = "([BI)V")
    private void method289(byte[] arg0, int arg1) {
        class69 var3 = new class69(arg0, this.field1033);
        int var4 = var3.method551();
        int var5 = var3.method551();
        if (var4 == var5) {
            this.field1035 = arg0;
            this.field1041 = false;
        } else {
            byte[] var6 = new byte[var4];
            class48.method430(var6, var4, arg0, var5, 6);
            this.field1035 = var6;
            var3 = new class69(this.field1035, this.field1033);
            this.field1041 = true;
        }
        this.field1036 = var3.method549();
        this.field1037 = new int[this.field1036];
        this.field1038 = new int[this.field1036];
        this.field1039 = new int[this.field1036];
        this.field1040 = new int[this.field1036];
        int var7 = this.field1036 * 10 + var3.field1700;
        if (arg1 < this.field1031 || arg1 > this.field1031) {
            this.field1031 = 57;
        }
        for (int var8 = 0; var8 < this.field1036; var8++) {
            this.field1037[var8] = var3.method552();
            this.field1038[var8] = var3.method551();
            this.field1039[var8] = var3.method551();
            this.field1040[var8] = var7;
            var7 += this.field1039[var8];
        }
    }

    @OriginalMember(owner = "LYZBHNJP", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method290(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1036; var6++) {
            if (this.field1037[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1038[var6]];
                }
                if (this.field1041) {
                    for (int var7 = 0; var7 < this.field1038[var6]; var7++) {
                        arg1[var7] = this.field1035[this.field1040[var6] + var7];
                    }
                } else {
                    class48.method430(arg1, this.field1038[var6], this.field1035, this.field1039[var6], this.field1040[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
