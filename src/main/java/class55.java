import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SYUGXMZF")
public class class55 {

    @OriginalMember(owner = "SYUGXMZF", name = "a", descriptor = "I")
    private int field1446 = 531;

    @OriginalMember(owner = "SYUGXMZF", name = "b", descriptor = "I")
    private int field1447 = 531;

    @OriginalMember(owner = "SYUGXMZF", name = "c", descriptor = "I")
    private int field1448 = 23626;

    @OriginalMember(owner = "SYUGXMZF", name = "e", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "SYUGXMZF", name = "j", descriptor = "Z")
    private boolean field1455;

    @OriginalMember(owner = "SYUGXMZF", name = "d", descriptor = "[B")
    public byte[] field1449;

    @OriginalMember(owner = "SYUGXMZF", name = "f", descriptor = "[I")
    public int[] field1451;

    @OriginalMember(owner = "SYUGXMZF", name = "g", descriptor = "[I")
    public int[] field1452;

    @OriginalMember(owner = "SYUGXMZF", name = "h", descriptor = "[I")
    public int[] field1453;

    @OriginalMember(owner = "SYUGXMZF", name = "i", descriptor = "[I")
    public int[] field1454;

    @OriginalMember(owner = "SYUGXMZF", name = "<init>", descriptor = "([BB)V")
    public class55(byte[] arg0, byte arg1) {
        if (arg1 != 71) {
            this.field1448 = -427;
        }
        this.method550(this.field1446, arg0);
    }

    @OriginalMember(owner = "SYUGXMZF", name = "a", descriptor = "(I[B)V")
    private void method550(int arg0, byte[] arg1) {
        class30 var3 = new class30(arg1, -982);
        int var4 = var3.method353();
        int var5 = var3.method353();
        if (var4 == var5) {
            this.field1449 = arg1;
            this.field1455 = false;
        } else {
            byte[] var6 = new byte[var4];
            class52.method518(var6, var4, arg1, var5, 6);
            this.field1449 = var6;
            var3 = new class30(this.field1449, -982);
            this.field1455 = true;
        }
        this.field1450 = var3.method351();
        this.field1451 = new int[this.field1450];
        this.field1452 = new int[this.field1450];
        this.field1453 = new int[this.field1450];
        if (arg0 <= 0) {
            this.field1446 = -244;
        }
        this.field1454 = new int[this.field1450];
        int var7 = this.field1450 * 10 + var3.field1065;
        for (int var8 = 0; var8 < this.field1450; var8++) {
            this.field1451[var8] = var3.method354();
            this.field1452[var8] = var3.method353();
            this.field1453[var8] = var3.method353();
            this.field1454[var8] = var7;
            var7 += this.field1453[var8];
        }
    }

    @OriginalMember(owner = "SYUGXMZF", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method551(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1450; var6++) {
            if (this.field1451[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1452[var6]];
                }
                if (this.field1455) {
                    for (int var7 = 0; var7 < this.field1452[var6]; var7++) {
                        arg1[var7] = this.field1449[this.field1454[var6] + var7];
                    }
                } else {
                    class52.method518(arg1, this.field1452[var6], this.field1449, this.field1453[var6], this.field1454[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
