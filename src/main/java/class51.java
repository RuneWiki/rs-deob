import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SPZBTZXL")
public class class51 {

    @OriginalMember(owner = "SPZBTZXL", name = "b", descriptor = "Z")
    private boolean field1307 = false;

    @OriginalMember(owner = "SPZBTZXL", name = "c", descriptor = "Z")
    private boolean field1308 = true;

    @OriginalMember(owner = "SPZBTZXL", name = "a", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "SPZBTZXL", name = "e", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "SPZBTZXL", name = "j", descriptor = "Z")
    private boolean field1315;

    @OriginalMember(owner = "SPZBTZXL", name = "d", descriptor = "[B")
    public byte[] field1309;

    @OriginalMember(owner = "SPZBTZXL", name = "f", descriptor = "[I")
    public int[] field1311;

    @OriginalMember(owner = "SPZBTZXL", name = "g", descriptor = "[I")
    public int[] field1312;

    @OriginalMember(owner = "SPZBTZXL", name = "h", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "SPZBTZXL", name = "i", descriptor = "[I")
    public int[] field1314;

    @OriginalMember(owner = "SPZBTZXL", name = "<init>", descriptor = "([BI)V")
    public class51(byte[] arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1306 = 250;
        }
        this.method514(arg0, 0);
    }

    @OriginalMember(owner = "SPZBTZXL", name = "a", descriptor = "([BI)V")
    private void method514(byte[] arg0, int arg1) {
        class34 var3 = new class34(arg0, this.field1306);
        int var4 = var3.method406();
        int var5 = var3.method406();
        if (var4 == var5) {
            this.field1309 = arg0;
            this.field1315 = false;
        } else {
            byte[] var6 = new byte[var4];
            class70.method578(var6, var4, arg0, var5, 6);
            this.field1309 = var6;
            var3 = new class34(this.field1309, this.field1306);
            this.field1315 = true;
        }
        this.field1310 = var3.method404();
        this.field1311 = new int[this.field1310];
        this.field1312 = new int[this.field1310];
        this.field1313 = new int[this.field1310];
        this.field1314 = new int[this.field1310];
        int var7 = this.field1310 * 10 + var3.field1073;
        if (arg1 != 0) {
            return;
        }
        for (int var8 = 0; var8 < this.field1310; var8++) {
            this.field1311[var8] = var3.method407();
            this.field1312[var8] = var3.method406();
            this.field1313[var8] = var3.method406();
            this.field1314[var8] = var7;
            var7 += this.field1313[var8];
        }
    }

    @OriginalMember(owner = "SPZBTZXL", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method515(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1310; var6++) {
            if (this.field1311[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1312[var6]];
                }
                if (this.field1315) {
                    for (int var7 = 0; var7 < this.field1312[var6]; var7++) {
                        arg1[var7] = this.field1309[this.field1314[var6] + var7];
                    }
                } else {
                    class70.method578(arg1, this.field1312[var6], this.field1309, this.field1313[var6], this.field1314[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
