import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CXFTMSCH")
public class class8 {

    @OriginalMember(owner = "CXFTMSCH", name = "b", descriptor = "I")
    private int field614 = 1;

    @OriginalMember(owner = "CXFTMSCH", name = "a", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "CXFTMSCH", name = "d", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "CXFTMSCH", name = "i", descriptor = "Z")
    private boolean field621;

    @OriginalMember(owner = "CXFTMSCH", name = "c", descriptor = "[B")
    public byte[] field615;

    @OriginalMember(owner = "CXFTMSCH", name = "e", descriptor = "[I")
    public int[] field617;

    @OriginalMember(owner = "CXFTMSCH", name = "f", descriptor = "[I")
    public int[] field618;

    @OriginalMember(owner = "CXFTMSCH", name = "g", descriptor = "[I")
    public int[] field619;

    @OriginalMember(owner = "CXFTMSCH", name = "h", descriptor = "[I")
    public int[] field620;

    @OriginalMember(owner = "CXFTMSCH", name = "<init>", descriptor = "([BI)V")
    public class8(byte[] arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            this.field614 = 108;
        }
        this.method175((byte) -37, arg0);
    }

    @OriginalMember(owner = "CXFTMSCH", name = "a", descriptor = "(B[B)V")
    private void method175(byte arg0, byte[] arg1) {
        class33 var3 = new class33(true, arg1);
        int var4 = var3.method329();
        if (arg0 != -37) {
            this.field613 = 219;
        }
        int var5 = var3.method329();
        if (var4 == var5) {
            this.field615 = arg1;
            this.field621 = false;
        } else {
            byte[] var6 = new byte[var4];
            class19.method233(var6, var4, arg1, var5, 6);
            this.field615 = var6;
            var3 = new class33(true, this.field615);
            this.field621 = true;
        }
        this.field616 = var3.method327();
        this.field617 = new int[this.field616];
        this.field618 = new int[this.field616];
        this.field619 = new int[this.field616];
        this.field620 = new int[this.field616];
        int var7 = this.field616 * 10 + var3.field945;
        for (int var8 = 0; var8 < this.field616; var8++) {
            this.field617[var8] = var3.method330();
            this.field618[var8] = var3.method329();
            this.field619[var8] = var3.method329();
            this.field620[var8] = var7;
            var7 += this.field619[var8];
        }
    }

    @OriginalMember(owner = "CXFTMSCH", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method176(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field616; var6++) {
            if (this.field617[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field618[var6]];
                }
                if (this.field621) {
                    for (int var7 = 0; var7 < this.field618[var6]; var7++) {
                        arg1[var7] = this.field615[this.field620[var6] + var7];
                    }
                } else {
                    class19.method233(arg1, this.field618[var6], this.field615, this.field619[var6], this.field620[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
