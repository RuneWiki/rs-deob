import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QDHHNYHL")
public class class44 {

    @OriginalMember(owner = "QDHHNYHL", name = "a", descriptor = "I")
    private int field1345 = -110;

    @OriginalMember(owner = "QDHHNYHL", name = "b", descriptor = "I")
    private int field1346 = 6;

    @OriginalMember(owner = "QDHHNYHL", name = "c", descriptor = "I")
    private int field1347 = -8226;

    @OriginalMember(owner = "QDHHNYHL", name = "d", descriptor = "Z")
    private boolean field1348 = true;

    @OriginalMember(owner = "QDHHNYHL", name = "e", descriptor = "Z")
    private boolean field1349 = true;

    @OriginalMember(owner = "QDHHNYHL", name = "g", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "QDHHNYHL", name = "l", descriptor = "Z")
    private boolean field1356;

    @OriginalMember(owner = "QDHHNYHL", name = "f", descriptor = "[B")
    public byte[] field1350;

    @OriginalMember(owner = "QDHHNYHL", name = "h", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "QDHHNYHL", name = "i", descriptor = "[I")
    public int[] field1353;

    @OriginalMember(owner = "QDHHNYHL", name = "j", descriptor = "[I")
    public int[] field1354;

    @OriginalMember(owner = "QDHHNYHL", name = "k", descriptor = "[I")
    public int[] field1355;

    @OriginalMember(owner = "QDHHNYHL", name = "<init>", descriptor = "([BI)V")
    public class44(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            this.field1349 = !this.field1349;
        }
        this.method487(arg0, -42597);
    }

    @OriginalMember(owner = "QDHHNYHL", name = "a", descriptor = "([BI)V")
    private void method487(byte[] arg0, int arg1) {
        class42 var3 = new class42(5, arg0);
        int var4 = var3.method424();
        int var5 = var3.method424();
        if (var4 == var5) {
            this.field1350 = arg0;
            this.field1356 = false;
        } else {
            byte[] var6 = new byte[var4];
            class35.method380(var6, var4, arg0, var5, 6);
            this.field1350 = var6;
            var3 = new class42(5, this.field1350);
            this.field1356 = true;
        }
        this.field1351 = var3.method422();
        this.field1352 = new int[this.field1351];
        this.field1353 = new int[this.field1351];
        this.field1354 = new int[this.field1351];
        this.field1355 = new int[this.field1351];
        int var7 = this.field1351 * 10 + var3.field1250;
        for (int var8 = 0; var8 < this.field1351; var8++) {
            this.field1352[var8] = var3.method425();
            this.field1353[var8] = var3.method424();
            this.field1354[var8] = var3.method424();
            this.field1355[var8] = var7;
            var7 += this.field1354[var8];
        }
        if (arg1 != -42597) {
            this.field1347 = -374;
        }
    }

    @OriginalMember(owner = "QDHHNYHL", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method488(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1351; var6++) {
            if (this.field1352[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1353[var6]];
                }
                if (this.field1356) {
                    for (int var7 = 0; var7 < this.field1353[var6]; var7++) {
                        arg1[var7] = this.field1350[this.field1355[var6] + var7];
                    }
                } else {
                    class35.method380(arg1, this.field1353[var6], this.field1350, this.field1354[var6], this.field1355[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
