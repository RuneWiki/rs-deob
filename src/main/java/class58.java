import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TKEGJSFV")
public class class58 {

    @OriginalMember(owner = "TKEGJSFV", name = "a", descriptor = "I")
    private int field1504 = 4;

    @OriginalMember(owner = "TKEGJSFV", name = "b", descriptor = "Z")
    private boolean field1505 = true;

    @OriginalMember(owner = "TKEGJSFV", name = "d", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "TKEGJSFV", name = "i", descriptor = "Z")
    private boolean field1512;

    @OriginalMember(owner = "TKEGJSFV", name = "c", descriptor = "[B")
    public byte[] field1506;

    @OriginalMember(owner = "TKEGJSFV", name = "e", descriptor = "[I")
    public int[] field1508;

    @OriginalMember(owner = "TKEGJSFV", name = "f", descriptor = "[I")
    public int[] field1509;

    @OriginalMember(owner = "TKEGJSFV", name = "g", descriptor = "[I")
    public int[] field1510;

    @OriginalMember(owner = "TKEGJSFV", name = "h", descriptor = "[I")
    public int[] field1511;

    @OriginalMember(owner = "TKEGJSFV", name = "<init>", descriptor = "(B[B)V")
    public class58(byte arg0, byte[] arg1) {
        this.method541(arg1, false);
        if (arg0 != -74) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "TKEGJSFV", name = "a", descriptor = "([BZ)V")
    private void method541(byte[] arg0, boolean arg1) {
        class15 var3 = new class15(arg0, false);
        int var4 = var3.method265();
        int var5 = var3.method265();
        if (var4 == var5) {
            this.field1506 = arg0;
            this.field1512 = false;
        } else {
            byte[] var6 = new byte[var4];
            class37.method400(var6, var4, arg0, var5, 6);
            this.field1506 = var6;
            var3 = new class15(this.field1506, false);
            this.field1512 = true;
        }
        this.field1507 = var3.method263();
        this.field1508 = new int[this.field1507];
        this.field1509 = new int[this.field1507];
        this.field1510 = new int[this.field1507];
        if (arg1) {
            return;
        }
        this.field1511 = new int[this.field1507];
        int var7 = this.field1507 * 10 + var3.field709;
        for (int var8 = 0; var8 < this.field1507; var8++) {
            this.field1508[var8] = var3.method266();
            this.field1509[var8] = var3.method265();
            this.field1510[var8] = var3.method265();
            this.field1511[var8] = var7;
            var7 += this.field1510[var8];
        }
    }

    @OriginalMember(owner = "TKEGJSFV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method542(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1507; var6++) {
            if (this.field1508[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1509[var6]];
                }
                if (this.field1512) {
                    for (int var7 = 0; var7 < this.field1509[var6]; var7++) {
                        arg1[var7] = this.field1506[this.field1511[var6] + var7];
                    }
                } else {
                    class37.method400(arg1, this.field1509[var6], this.field1506, this.field1510[var6], this.field1511[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
