import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class98 {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    private int field1753;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    private int field1755;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    private int field1760;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    private int field1759;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Lqfa;")
    public static class85 field1749 = new class85(20, -1);

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[B")
    public static byte[] field1763;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1752 = arg4;
        if (arg3 != 20) {
            field1749 = null;
        }
        this.field1761 = arg10 * arg10;
        field1750++;
        this.field1755 = arg2;
        this.field1753 = arg5;
        this.field1759 = this.field1753 + arg1;
        this.field1764 = this.field1752 + arg8;
        this.field1758 = this.field1753 + arg6;
        this.field1760 = this.field1752 + arg7;
        this.field1751 = this.field1755 + arg9;
        this.field1756 = this.field1755 + arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    public static void method930(boolean arg0) {
        field1763 = null;
        if (arg0) {
            field1749 = null;
        }
        field1749 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIII)Z")
    public final boolean method931(byte arg0, int arg1, int arg2, int arg3) {
        field1748++;
        if (this.field1756 > arg2 || arg2 > this.field1751) {
            return false;
        } else if (arg3 < this.field1758 || arg3 > this.field1759) {
            return false;
        } else if (this.field1760 <= arg1 && arg1 <= this.field1764) {
            int var5 = 6 / ((51 - arg0) / 41);
            int var6 = arg2 - this.field1755;
            int var7 = arg1 - this.field1752;
            return this.field1761 > (var6 * var6 + (var7 * var7));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method932(String arg0, byte arg1) {
        field1754++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 >= -17) {
            return -27;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = class376.method2361(-41, arg0.charAt(var4)) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1753 = arg1;
        this.field1752 = arg2;
        this.field1761 = arg3 * arg3;
        this.field1755 = arg0;
        this.field1758 = this.field1753 + arg6;
        this.field1764 = this.field1752 + arg9;
        this.field1756 = this.field1755 + arg4;
        this.field1760 = this.field1752 + arg8;
        this.field1759 = this.field1753 + arg7;
        this.field1751 = this.field1755 + arg5;
    }

    static {
        int var0 = 0;
        field1763 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1763[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
