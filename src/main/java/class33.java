import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LKPVZAQN")
public class class33 {

    @OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "I")
    private int field1103 = 787;

    @OriginalMember(owner = "client!LKPVZAQN", name = "b", descriptor = "Z")
    private boolean field1104 = false;

    @OriginalMember(owner = "client!LKPVZAQN", name = "c", descriptor = "I")
    private int field1105 = 3982;

    @OriginalMember(owner = "client!LKPVZAQN", name = "e", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!LKPVZAQN", name = "j", descriptor = "Z")
    private boolean field1112;

    @OriginalMember(owner = "client!LKPVZAQN", name = "d", descriptor = "[B")
    public byte[] field1106;

    @OriginalMember(owner = "client!LKPVZAQN", name = "f", descriptor = "[I")
    public int[] field1108;

    @OriginalMember(owner = "client!LKPVZAQN", name = "g", descriptor = "[I")
    public int[] field1109;

    @OriginalMember(owner = "client!LKPVZAQN", name = "h", descriptor = "[I")
    public int[] field1110;

    @OriginalMember(owner = "client!LKPVZAQN", name = "i", descriptor = "[I")
    public int[] field1111;

    @OriginalMember(owner = "client!LKPVZAQN", name = "<init>", descriptor = "([BI)V")
    public class33(byte[] arg0, int arg1) {
        this.method322(true, arg0);
        if (arg1 != 0) {
            this.field1104 = !this.field1104;
        }
    }

    @OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "(Z[B)V")
    private void method322(boolean arg0, byte[] arg1) {
        class58 var3 = new class58((byte) -115, arg1);
        if (!arg0) {
            this.field1105 = -58;
        }
        int var4 = var3.method519();
        int var5 = var3.method519();
        if (var4 == var5) {
            this.field1106 = arg1;
            this.field1112 = false;
        } else {
            byte[] var6 = new byte[var4];
            class68.method570(var6, var4, arg1, var5, 6);
            this.field1106 = var6;
            var3 = new class58((byte) -115, this.field1106);
            this.field1112 = true;
        }
        this.field1107 = var3.method517();
        this.field1108 = new int[this.field1107];
        this.field1109 = new int[this.field1107];
        this.field1110 = new int[this.field1107];
        this.field1111 = new int[this.field1107];
        int var7 = this.field1107 * 10 + var3.field1615;
        for (int var8 = 0; var8 < this.field1107; var8++) {
            this.field1108[var8] = var3.method520();
            this.field1109[var8] = var3.method519();
            this.field1110[var8] = var3.method519();
            this.field1111[var8] = var7;
            var7 += this.field1110[var8];
        }
    }

    @OriginalMember(owner = "client!LKPVZAQN", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method323(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1107; var6++) {
            if (this.field1108[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1109[var6]];
                }
                if (this.field1112) {
                    for (int var7 = 0; var7 < this.field1109[var6]; var7++) {
                        arg1[var7] = this.field1106[this.field1111[var6] + var7];
                    }
                } else {
                    class68.method570(arg1, this.field1109[var6], this.field1106, this.field1110[var6], this.field1111[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
