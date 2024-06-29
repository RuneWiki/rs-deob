import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class105 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lpb;")
    private class70 field1758 = new class70((byte[]) null);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[B")
    private static byte[] field1766 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "J")
    private long field1763;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
    private int[] field1759;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    private int[] field1760;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    private int[] field1761;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public int[] field1765;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I", line = 4)
    public final int method802(int arg0) {
        return this.method813(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()Z", line = 11)
    public final boolean method803() {
        int var1 = this.field1761.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1761[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I", line = 24)
    public final int method804() {
        return this.field1761.length;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(J)V", line = 27)
    public final void method805(long arg0) {
        this.field1763 = arg0;
        int var3 = this.field1761.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1765[var4] = 0;
            this.field1760[var4] = 0;
            this.field1758.field1068 = this.field1759[var4];
            this.method815(var4);
            this.field1761[var4] = this.field1758.field1068;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 45)
    public final void method806(int arg0) {
        this.field1758.field1068 = this.field1761[arg0];
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()I", line = 49)
    public final int method807() {
        int var1 = this.field1761.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1761[var4] >= 0 && this.field1765[var4] < var3) {
                var2 = var4;
                var3 = this.field1765[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()V", line = 74)
    public final void method808() {
        this.field1758.field1066 = null;
        this.field1759 = null;
        this.field1761 = null;
        this.field1765 = null;
        this.field1760 = null;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()Z", line = 84)
    public final boolean method809() {
        return this.field1758.field1066 != null;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()V", line = 87)
    public static void method810() {
        field1766 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 250)
    public class105() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V", line = 257)
    public class105(byte[] arg0) {
        this.method812(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I", line = 104)
    private final int method811(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1766[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1758.method481(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1758.method481(0) << 16;
            }
            return var8;
        }
        int var3 = this.field1758.method481(0);
        int var4 = this.field1758.method477(5743);
        if (var3 == 47) {
            this.field1758.field1068 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1758.method465(true);
            var4 -= 3;
            int var6 = this.field1765[arg0];
            this.field1763 += (long) (this.field1764 - var5) * (long) var6;
            this.field1764 = var5;
            this.field1758.field1068 += var4;
            return 2;
        } else {
            this.field1758.field1068 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B)V", line = 147)
    public final void method812(byte[] arg0) {
        this.field1758.field1066 = arg0;
        this.field1758.field1068 = 10;
        int var2 = this.field1758.method423(255);
        this.field1762 = this.field1758.method423(255);
        this.field1764 = 500000;
        this.field1759 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1758.method469(120);
            int var5 = this.field1758.method469(76);
            if (var4 == 1297379947) {
                this.field1759[var3] = this.field1758.field1068;
                var3++;
            }
            this.field1758.field1068 += var5;
        }
        this.field1763 = 0L;
        this.field1761 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1761[var6] = this.field1759[var6];
        }
        this.field1765 = new int[var2];
        this.field1760 = new int[var2];
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I", line = 201)
    private final int method813(int arg0) {
        byte var2 = this.field1758.field1066[this.field1758.field1068];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1760[arg0] = var3;
            this.field1758.field1068++;
        } else {
            var3 = this.field1760[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method811(arg0, var3);
        }
        int var4 = this.field1758.method477(5743);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1758.field1066[this.field1758.field1068] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1758.field1068++;
                this.field1760[arg0] = var5;
                return this.method811(arg0, var5);
            }
        }
        this.field1758.field1068 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 239)
    public final void method814(int arg0) {
        this.field1761[arg0] = this.field1758.field1068;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 246)
    public final void method815(int arg0) {
        int var2 = this.field1758.method477(5743);
        this.field1765[arg0] += var2;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)J", line = 253)
    public final long method816(int arg0) {
        return (long) this.field1764 * (long) arg0 + this.field1763;
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()V", line = 264)
    public final void method817() {
        this.field1758.field1068 = -1;
    }
}
