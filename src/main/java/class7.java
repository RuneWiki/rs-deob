import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BYZSQZUF")
public class class7 {

    @OriginalMember(owner = "BYZSQZUF", name = "a", descriptor = "I")
    private int field108 = 2;

    @OriginalMember(owner = "BYZSQZUF", name = "b", descriptor = "I")
    private int field109 = 35904;

    @OriginalMember(owner = "BYZSQZUF", name = "c", descriptor = "I")
    private int field110 = 26615;

    @OriginalMember(owner = "BYZSQZUF", name = "d", descriptor = "Z")
    private boolean field111 = true;

    @OriginalMember(owner = "BYZSQZUF", name = "f", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "BYZSQZUF", name = "k", descriptor = "Z")
    private boolean field118;

    @OriginalMember(owner = "BYZSQZUF", name = "e", descriptor = "[B")
    public byte[] field112;

    @OriginalMember(owner = "BYZSQZUF", name = "g", descriptor = "[I")
    public int[] field114;

    @OriginalMember(owner = "BYZSQZUF", name = "h", descriptor = "[I")
    public int[] field115;

    @OriginalMember(owner = "BYZSQZUF", name = "i", descriptor = "[I")
    public int[] field116;

    @OriginalMember(owner = "BYZSQZUF", name = "j", descriptor = "[I")
    public int[] field117;

    @OriginalMember(owner = "BYZSQZUF", name = "<init>", descriptor = "(I[B)V")
    public class7(int arg0, byte[] arg1) {
        this.method28(arg1, 8);
        if (arg0 != -7298) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "BYZSQZUF", name = "a", descriptor = "([BI)V")
    private void method28(byte[] arg0, int arg1) {
        class24 var3 = new class24(0, arg0);
        int var4 = var3.method242();
        int var5 = var3.method242();
        if (arg1 < 8 || arg1 > 8) {
            return;
        }
        if (var4 == var5) {
            this.field112 = arg0;
            this.field118 = false;
        } else {
            byte[] var6 = new byte[var4];
            class40.method387(var6, var4, arg0, var5, 6);
            this.field112 = var6;
            var3 = new class24(0, this.field112);
            this.field118 = true;
        }
        this.field113 = var3.method240();
        this.field114 = new int[this.field113];
        this.field115 = new int[this.field113];
        this.field116 = new int[this.field113];
        this.field117 = new int[this.field113];
        int var7 = this.field113 * 10 + var3.field832;
        for (int var8 = 0; var8 < this.field113; var8++) {
            this.field114[var8] = var3.method243();
            this.field115[var8] = var3.method242();
            this.field116[var8] = var3.method242();
            this.field117[var8] = var7;
            var7 += this.field116[var8];
        }
    }

    @OriginalMember(owner = "BYZSQZUF", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method29(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field113; var6++) {
            if (this.field114[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field115[var6]];
                }
                if (this.field118) {
                    for (int var7 = 0; var7 < this.field115[var6]; var7++) {
                        arg1[var7] = this.field112[this.field117[var6] + var7];
                    }
                } else {
                    class40.method387(arg1, this.field115[var6], this.field112, this.field116[var6], this.field117[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
