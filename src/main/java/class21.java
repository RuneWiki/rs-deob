import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("INOFEYKQ")
public class class21 {

    @OriginalMember(owner = "INOFEYKQ", name = "a", descriptor = "I")
    private int field968 = 5;

    @OriginalMember(owner = "INOFEYKQ", name = "b", descriptor = "I")
    private int field969 = 44885;

    @OriginalMember(owner = "INOFEYKQ", name = "c", descriptor = "Z")
    private boolean field970 = true;

    @OriginalMember(owner = "INOFEYKQ", name = "d", descriptor = "Z")
    private boolean field971 = true;

    @OriginalMember(owner = "INOFEYKQ", name = "f", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "INOFEYKQ", name = "k", descriptor = "Z")
    private boolean field978;

    @OriginalMember(owner = "INOFEYKQ", name = "e", descriptor = "[B")
    public byte[] field972;

    @OriginalMember(owner = "INOFEYKQ", name = "g", descriptor = "[I")
    public int[] field974;

    @OriginalMember(owner = "INOFEYKQ", name = "h", descriptor = "[I")
    public int[] field975;

    @OriginalMember(owner = "INOFEYKQ", name = "i", descriptor = "[I")
    public int[] field976;

    @OriginalMember(owner = "INOFEYKQ", name = "j", descriptor = "[I")
    public int[] field977;

    @OriginalMember(owner = "INOFEYKQ", name = "<init>", descriptor = "(Z[B)V")
    public class21(boolean arg0, byte[] arg1) {
        this.method276(399, arg1);
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "INOFEYKQ", name = "a", descriptor = "(I[B)V")
    private void method276(int arg0, byte[] arg1) {
        class35 var3 = new class35((byte) -103, arg1);
        int var4 = var3.method353();
        int var5 = var3.method353();
        if (var4 == var5) {
            this.field972 = arg1;
            this.field978 = false;
        } else {
            byte[] var6 = new byte[var4];
            class57.method538(var6, var4, arg1, var5, 6);
            this.field972 = var6;
            var3 = new class35((byte) -103, this.field972);
            this.field978 = true;
        }
        this.field973 = var3.method351();
        this.field974 = new int[this.field973];
        this.field975 = new int[this.field973];
        this.field976 = new int[this.field973];
        this.field977 = new int[this.field973];
        int var7 = this.field973 * 10 + var3.field1107;
        int var8 = 43 / arg0;
        for (int var9 = 0; var9 < this.field973; var9++) {
            this.field974[var9] = var3.method354();
            this.field975[var9] = var3.method353();
            this.field976[var9] = var3.method353();
            this.field977[var9] = var7;
            var7 += this.field976[var9];
        }
    }

    @OriginalMember(owner = "INOFEYKQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method277(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field973; var6++) {
            if (this.field974[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field975[var6]];
                }
                if (this.field978) {
                    for (int var7 = 0; var7 < this.field975[var6]; var7++) {
                        arg1[var7] = this.field972[this.field977[var6] + var7];
                    }
                } else {
                    class57.method538(arg1, this.field975[var6], this.field972, this.field976[var6], this.field977[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
