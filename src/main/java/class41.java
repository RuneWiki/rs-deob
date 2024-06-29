import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lib;")
    private class57 field1000 = new class57(null);

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[B")
    private static byte[] field1008 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "J")
    private long field1005;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    private int[] field1001;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public int[] field1004;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    private int[] field1006;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
    private int[] field1007;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public final void method345() {
        this.field1000.field1477 = -1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Z")
    public final boolean method346() {
        int var1 = this.field1001.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1001[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()Z")
    public final boolean method347() {
        return this.field1000.field1469 != null;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public final void method348() {
        this.field1000.field1469 = null;
        this.field1006 = null;
        this.field1001 = null;
        this.field1004 = null;
        this.field1007 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
    public final int method349(int arg0) {
        return this.method351(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([B)V")
    public final void method350(byte[] arg0) {
        this.field1000.field1469 = arg0;
        this.field1000.field1477 = 10;
        int var2 = this.field1000.method506(-1);
        this.field1003 = this.field1000.method506(-1);
        this.field1002 = 500000;
        this.field1006 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1000.method495(16711680);
            int var6 = this.field1000.method495(16711680);
            if (var5 == 1297379947) {
                this.field1006[var3] = this.field1000.field1477;
                var3++;
            }
            this.field1000.field1477 += var6;
        }
        this.field1005 = 0L;
        this.field1001 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1001[var4] = this.field1006[var4];
        }
        this.field1004 = new int[var2];
        this.field1007 = new int[var2];
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
    private final int method351(int arg0) {
        byte var2 = this.field1000.field1469[this.field1000.field1477];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1007[arg0] = var3;
            this.field1000.field1477++;
        } else {
            var3 = this.field1007[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method354(arg0, var3);
        }
        int var4 = this.field1000.method480(-2097152);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1000.field1469[this.field1000.field1477] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1000.field1477++;
                this.field1007[arg0] = var5;
                return this.method354(arg0, var5);
            }
        }
        this.field1000.field1477 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final void method352(int arg0) {
        this.field1000.field1477 = this.field1001[arg0];
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)J")
    public final long method353(int arg0) {
        return (long) this.field1002 * (long) arg0 + this.field1005;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    private final int method354(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1008[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1000.method510(-124) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1000.method510(-126) << 16;
            }
            return var8;
        }
        int var3 = this.field1000.method510(-122);
        int var4 = this.field1000.method480(-2097152);
        if (var3 == 47) {
            this.field1000.field1477 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1000.method483(false);
            var4 -= 3;
            int var6 = this.field1004[arg0];
            this.field1005 += (long) (this.field1002 - var5) * (long) var6;
            this.field1002 = var5;
            this.field1000.field1477 += var4;
            return 2;
        } else {
            this.field1000.field1477 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
    public static void method355() {
        field1008 = null;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()I")
    public final int method356() {
        int var1 = this.field1001.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1001[var4] >= 0 && this.field1004[var4] < var3) {
                var2 = var4;
                var3 = this.field1004[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(J)V")
    public final void method357(long arg0) {
        this.field1005 = arg0;
        int var3 = this.field1001.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1004[var4] = 0;
            this.field1007[var4] = 0;
            this.field1000.field1477 = this.field1006[var4];
            this.method359(var4);
            this.field1001[var4] = this.field1000.field1477;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public final void method358(int arg0) {
        this.field1001[arg0] = this.field1000.field1477;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class41() {
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
    public class41(byte[] arg0) {
        this.method350(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
    public final void method359(int arg0) {
        int var2 = this.field1000.method480(-2097152);
        this.field1004[arg0] += var2;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()I")
    public final int method360() {
        return this.field1001.length;
    }
}
