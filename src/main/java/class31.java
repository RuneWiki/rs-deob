import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class31 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ljg;")
    private class89 field576 = new class89(null);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[B")
    private static byte[] field575 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "J")
    private long field583;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
    private int[] field579;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    private int[] field580;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
    public int[] field581;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
    public final long method162(int arg0) {
        return (long) this.field582 * (long) arg0 + this.field583;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public final void method163() {
        this.field576.field1727 = -1;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
    public final boolean method164() {
        return this.field576.field1769 != null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method165(int arg0) {
        this.field577[arg0] = this.field576.field1727;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public final void method166() {
        this.field576.field1769 = null;
        this.field580 = null;
        this.field577 = null;
        this.field581 = null;
        this.field579 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
    public final int method167(int arg0) {
        return this.method173(arg0);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method168(int arg0) {
        int var2 = this.field576.method536(1507602439);
        this.field581[arg0] += var2;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method169(int arg0) {
        this.field576.field1727 = this.field577[arg0];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([B)V")
    public final void method170(byte[] arg0) {
        this.field576.field1769 = arg0;
        this.field576.field1727 = 10;
        int var2 = this.field576.method555(-1113627096);
        this.field578 = this.field576.method555(-1113627096);
        this.field582 = 500000;
        this.field580 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field576.method545(-7436);
            int var6 = this.field576.method545(-7436);
            if (var5 == 1297379947) {
                this.field580[var3] = this.field576.field1727;
                var3++;
            }
            this.field576.field1727 += var6;
        }
        this.field583 = 0L;
        this.field577 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field577[var4] = this.field580[var4];
        }
        this.field581 = new int[var2];
        this.field579 = new int[var2];
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
    public final int method171() {
        return this.field577.length;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public final boolean method172() {
        int var1 = this.field577.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field577[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)I")
    private final int method173(int arg0) {
        byte var2 = this.field576.field1769[this.field576.field1727];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field579[arg0] = var3;
            this.field576.field1727++;
        } else {
            var3 = this.field579[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method177(arg0, var3);
        }
        int var4 = this.field576.method536(1507602439);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field576.field1769[this.field576.field1727] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field576.field1727++;
                this.field579[arg0] = var5;
                return this.method177(arg0, var5);
            }
        }
        this.field576.field1727 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public static void method174() {
        field575 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(J)V")
    public final void method175(long arg0) {
        this.field583 = arg0;
        int var3 = this.field577.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field581[var4] = 0;
            this.field579[var4] = 0;
            this.field576.field1727 = this.field580[var4];
            this.method168(var4);
            this.field577[var4] = this.field576.field1727;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()I")
    public final int method176() {
        int var1 = this.field577.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field577[var4] >= 0 && this.field581[var4] < var3) {
                var2 = var4;
                var3 = this.field581[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    private final int method177(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field575[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field576.method538((byte) -128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field576.method538((byte) 112) << 16;
            }
            return var8;
        }
        int var3 = this.field576.method538((byte) 87);
        int var4 = this.field576.method536(1507602439);
        if (var3 == 47) {
            this.field576.field1727 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field576.method565(3);
            var4 -= 3;
            int var6 = this.field581[arg0];
            this.field583 += (long) (this.field582 - var5) * (long) var6;
            this.field582 = var5;
            this.field576.field1727 += var4;
            return 2;
        } else {
            this.field576.field1727 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class31() {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([B)V")
    public class31(byte[] arg0) {
        this.method170(arg0);
    }
}
