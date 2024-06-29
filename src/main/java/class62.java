import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WEMOPWVJ")
public class class62 {

    @OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "Z")
    private boolean field1609 = true;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "b", descriptor = "Z")
    private boolean field1610 = true;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "c", descriptor = "I")
    private int field1611 = -192;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "e", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "j", descriptor = "Z")
    private boolean field1618;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "d", descriptor = "[B")
    public byte[] field1612;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "f", descriptor = "[I")
    public int[] field1614;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "g", descriptor = "[I")
    public int[] field1615;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "h", descriptor = "[I")
    public int[] field1616;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "i", descriptor = "[I")
    public int[] field1617;

    @OriginalMember(owner = "client!WEMOPWVJ", name = "<init>", descriptor = "([BI)V")
    public class62(byte[] arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.method558(false, arg0);
    }

    @OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "(Z[B)V")
    private void method558(boolean arg0, byte[] arg1) {
        class52 var3 = new class52(arg1, true);
        int var4 = var3.method465();
        if (arg0) {
            return;
        }
        int var5 = var3.method465();
        if (var4 == var5) {
            this.field1612 = arg1;
            this.field1618 = false;
        } else {
            byte[] var6 = new byte[var4];
            class22.method300(var6, var4, arg1, var5, 6);
            this.field1612 = var6;
            var3 = new class52(this.field1612, true);
            this.field1618 = true;
        }
        this.field1613 = var3.method463();
        this.field1614 = new int[this.field1613];
        this.field1615 = new int[this.field1613];
        this.field1616 = new int[this.field1613];
        this.field1617 = new int[this.field1613];
        int var7 = this.field1613 * 10 + var3.field1434;
        for (int var8 = 0; var8 < this.field1613; var8++) {
            this.field1614[var8] = var3.method466();
            this.field1615[var8] = var3.method465();
            this.field1616[var8] = var3.method465();
            this.field1617[var8] = var7;
            var7 += this.field1616[var8];
        }
    }

    @OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method559(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1613; var6++) {
            if (this.field1614[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1615[var6]];
                }
                if (this.field1618) {
                    for (int var7 = 0; var7 < this.field1615[var6]; var7++) {
                        arg1[var7] = this.field1612[this.field1617[var6] + var7];
                    }
                } else {
                    class22.method300(arg1, this.field1615[var6], this.field1612, this.field1616[var6], this.field1617[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
