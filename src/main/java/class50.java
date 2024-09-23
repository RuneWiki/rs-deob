import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RVLWVPJQ")
public class class50 {

    @OriginalMember(owner = "RVLWVPJQ", name = "a", descriptor = "B")
    private byte field1326 = 6;

    @OriginalMember(owner = "RVLWVPJQ", name = "b", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "RVLWVPJQ", name = "d", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "RVLWVPJQ", name = "i", descriptor = "Z")
    private boolean field1334;

    @OriginalMember(owner = "RVLWVPJQ", name = "c", descriptor = "[B")
    public byte[] field1328;

    @OriginalMember(owner = "RVLWVPJQ", name = "e", descriptor = "[I")
    public int[] field1330;

    @OriginalMember(owner = "RVLWVPJQ", name = "f", descriptor = "[I")
    public int[] field1331;

    @OriginalMember(owner = "RVLWVPJQ", name = "g", descriptor = "[I")
    public int[] field1332;

    @OriginalMember(owner = "RVLWVPJQ", name = "h", descriptor = "[I")
    public int[] field1333;

    @OriginalMember(owner = "RVLWVPJQ", name = "<init>", descriptor = "(I[B)V")
    public class50(int arg0, byte[] arg1) {
        if (arg0 != 34194) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method423(arg1, 1);
    }

    @OriginalMember(owner = "RVLWVPJQ", name = "a", descriptor = "([BI)V")
    private void method423(byte[] arg0, int arg1) {
        class55 var3 = new class55(741, arg0);
        int var4 = var3.method459();
        int var5 = var3.method459();
        if (var4 == var5) {
            this.field1328 = arg0;
            this.field1334 = false;
        } else {
            byte[] var6 = new byte[var4];
            class45.method405(var6, var4, arg0, var5, 6);
            this.field1328 = var6;
            var3 = new class55(741, this.field1328);
            this.field1334 = true;
        }
        this.field1329 = var3.method457();
        this.field1330 = new int[this.field1329];
        this.field1331 = new int[this.field1329];
        this.field1332 = new int[this.field1329];
        this.field1333 = new int[this.field1329];
        int var7 = this.field1329 * 10 + var3.field1456;
        if (arg1 != 1) {
            return;
        }
        for (int var8 = 0; var8 < this.field1329; var8++) {
            this.field1330[var8] = var3.method460();
            this.field1331[var8] = var3.method459();
            this.field1332[var8] = var3.method459();
            this.field1333[var8] = var7;
            var7 += this.field1332[var8];
        }
    }

    @OriginalMember(owner = "RVLWVPJQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method424(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1329; var6++) {
            if (this.field1330[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1331[var6]];
                }
                if (this.field1334) {
                    for (int var7 = 0; var7 < this.field1331[var6]; var7++) {
                        arg1[var7] = this.field1328[this.field1333[var6] + var7];
                    }
                } else {
                    class45.method405(arg1, this.field1331[var6], this.field1328, this.field1332[var6], this.field1333[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
