import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RPFMUSNN")
public class class49 {

    @OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "I")
    private int field1352 = -638;

    @OriginalMember(owner = "client!RPFMUSNN", name = "c", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!RPFMUSNN", name = "h", descriptor = "Z")
    private boolean field1359;

    @OriginalMember(owner = "client!RPFMUSNN", name = "b", descriptor = "[B")
    public byte[] field1353;

    @OriginalMember(owner = "client!RPFMUSNN", name = "d", descriptor = "[I")
    public int[] field1355;

    @OriginalMember(owner = "client!RPFMUSNN", name = "e", descriptor = "[I")
    public int[] field1356;

    @OriginalMember(owner = "client!RPFMUSNN", name = "f", descriptor = "[I")
    public int[] field1357;

    @OriginalMember(owner = "client!RPFMUSNN", name = "g", descriptor = "[I")
    public int[] field1358;

    @OriginalMember(owner = "client!RPFMUSNN", name = "<init>", descriptor = "(I[B)V")
    public class49(int arg0, byte[] arg1) {
        this.method413(arg1, 0);
        if (arg0 != 34083) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "([BI)V")
    private void method413(byte[] arg0, int arg1) {
        class63 var3 = new class63((byte) -58, arg0);
        int var4 = var3.method506();
        int var5 = var3.method506();
        if (var4 == var5) {
            this.field1353 = arg0;
            this.field1359 = false;
        } else {
            byte[] var6 = new byte[var4];
            class71.method584(var6, var4, arg0, var5, 6);
            this.field1353 = var6;
            var3 = new class63((byte) -58, this.field1353);
            this.field1359 = true;
        }
        this.field1354 = var3.method504();
        this.field1355 = new int[this.field1354];
        this.field1356 = new int[this.field1354];
        this.field1357 = new int[this.field1354];
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        this.field1358 = new int[this.field1354];
        int var7 = this.field1354 * 10 + var3.field1571;
        for (int var8 = 0; var8 < this.field1354; var8++) {
            this.field1355[var8] = var3.method507();
            this.field1356[var8] = var3.method506();
            this.field1357[var8] = var3.method506();
            this.field1358[var8] = var7;
            var7 += this.field1357[var8];
        }
    }

    @OriginalMember(owner = "client!RPFMUSNN", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method414(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1354; var6++) {
            if (this.field1355[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1356[var6]];
                }
                if (this.field1359) {
                    for (int var7 = 0; var7 < this.field1356[var6]; var7++) {
                        arg1[var7] = this.field1353[this.field1358[var6] + var7];
                    }
                } else {
                    class71.method584(arg1, this.field1356[var6], this.field1353, this.field1357[var6], this.field1358[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
