import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljd;")
    private class66 field2857 = new class66(null);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[B")
    private static byte[] field2856 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "J")
    private long field2858;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
    private int[] field2859;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    private int[] field2861;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    private int[] field2862;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public int[] field2864;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
    private final int method941(int arg0) {
        byte var2 = this.field2857.field1587[this.field2857.field1569];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2859[arg0] = var3;
            this.field2857.field1569++;
        } else {
            var3 = this.field2859[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method943(arg0, var3);
        }
        int var4 = this.field2857.method511(-1592222329);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2857.field1587[this.field2857.field1569] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2857.field1569++;
                this.field2859[arg0] = var5;
                return this.method943(arg0, var5);
            }
        }
        this.field2857.field1569 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method942(int arg0) {
        this.field2861[arg0] = this.field2857.field1569;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    private final int method943(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2856[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2857.method533(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2857.method533(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2857.method533(255);
        int var4 = this.field2857.method511(-1592222329);
        if (var3 == 47) {
            this.field2857.field1569 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2857.method518((byte) 125);
            var4 -= 3;
            int var6 = this.field2864[arg0];
            this.field2858 += (long) (this.field2860 - var5) * (long) var6;
            this.field2860 = var5;
            this.field2857.field1569 += var4;
            return 2;
        } else {
            this.field2857.field1569 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()Z")
    public final boolean method944() {
        return this.field2857.field1587 != null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
    public static void method945() {
        field2856 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
    public final void method946() {
        this.field2857.field1587 = null;
        this.field2862 = null;
        this.field2861 = null;
        this.field2864 = null;
        this.field2859 = null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()Z")
    public final boolean method947() {
        int var1 = this.field2861.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2861[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()I")
    public final int method948() {
        return this.field2861.length;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)J")
    public final long method949(int arg0) {
        return (long) this.field2860 * (long) arg0 + this.field2858;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
    public final void method950() {
        this.field2857.field1569 = -1;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "()I")
    public final int method951() {
        int var1 = this.field2861.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2861[var4] >= 0 && this.field2864[var4] < var3) {
                var2 = var4;
                var3 = this.field2864[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(J)V")
    public final void method952(long arg0) {
        this.field2858 = arg0;
        int var3 = this.field2861.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2864[var4] = 0;
            this.field2859[var4] = 0;
            this.field2857.field1569 = this.field2862[var4];
            this.method953(var4);
            this.field2861[var4] = this.field2857.field1569;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final void method953(int arg0) {
        int var2 = this.field2857.method511(-1592222329);
        this.field2864[arg0] += var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
    public final void method954(byte[] arg0) {
        this.field2857.field1587 = arg0;
        this.field2857.field1569 = 10;
        int var2 = this.field2857.method532(0);
        this.field2863 = this.field2857.method532(0);
        this.field2860 = 500000;
        this.field2862 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2857.method539(true);
            int var6 = this.field2857.method539(true);
            if (var5 == 1297379947) {
                this.field2862[var3] = this.field2857.field1569;
                var3++;
            }
            this.field2857.field1569 += var6;
        }
        this.field2858 = 0L;
        this.field2861 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2861[var4] = this.field2862[var4];
        }
        this.field2864 = new int[var2];
        this.field2859 = new int[var2];
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public final void method955(int arg0) {
        this.field2857.field1569 = this.field2861[arg0];
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)I")
    public final int method956(int arg0) {
        return this.method941(arg0);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
    public class120(byte[] arg0) {
        this.method954(arg0);
    }
}
