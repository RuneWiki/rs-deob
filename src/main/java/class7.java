import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lab;")
    private class3 field163 = new class3(null);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[B")
    private static byte[] field162 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "J")
    private long field164;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
    private int[] field166;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    private int[] field170;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([B)V")
    public final void method98(byte[] arg0) {
        this.field163.field48 = arg0;
        this.field163.field54 = 10;
        int var2 = this.field163.method46((byte) 65);
        this.field169 = this.field163.method46((byte) 65);
        this.field165 = 500000;
        this.field167 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field163.method56(-1);
            int var6 = this.field163.method56(-1);
            if (var5 == 1297379947) {
                this.field167[var3] = this.field163.field54;
                var3++;
            }
            this.field163.field54 += var6;
        }
        this.field164 = 0L;
        this.field170 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field170[var4] = this.field167[var4];
        }
        this.field168 = new int[var2];
        this.field166 = new int[var2];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public final void method99() {
        this.field163.field54 = -1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public final void method100(int arg0) {
        this.field170[arg0] = this.field163.field54;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public final int method101() {
        return this.field170.length;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
    private final int method102(int arg0) {
        byte var2 = this.field163.field48[this.field163.field54];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field166[arg0] = var3;
            this.field163.field54++;
        } else {
            var3 = this.field166[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method108(arg0, var3);
        }
        int var4 = this.field163.method23(255);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field163.field48[this.field163.field54] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field163.field54++;
                this.field166[arg0] = var5;
                return this.method108(arg0, var5);
            }
        }
        this.field163.field54 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(J)V")
    public final void method103(long arg0) {
        this.field164 = arg0;
        int var3 = this.field170.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field168[var4] = 0;
            this.field166[var4] = 0;
            this.field163.field54 = this.field167[var4];
            this.method112(var4);
            this.field170[var4] = this.field163.field54;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
    public final void method104() {
        this.field163.field48 = null;
        this.field167 = null;
        this.field170 = null;
        this.field168 = null;
        this.field166 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I")
    public final int method105(int arg0) {
        return this.method102(arg0);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
    public static void method106() {
        field162 = null;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public final void method107(int arg0) {
        this.field163.field54 = this.field170[arg0];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    private final int method108(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field162[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field163.method64(31790) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field163.method64(31790) << 16;
            }
            return var8;
        }
        int var3 = this.field163.method64(31790);
        int var4 = this.field163.method23(255);
        if (var3 == 47) {
            this.field163.field54 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field163.method20((byte) 66);
            var4 -= 3;
            int var6 = this.field168[arg0];
            this.field164 += (long) (this.field165 - var5) * (long) var6;
            this.field165 = var5;
            this.field163.field54 += var4;
            return 2;
        } else {
            this.field163.field54 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()Z")
    public final boolean method109() {
        return this.field163.field48 != null;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "()Z")
    public final boolean method110() {
        int var1 = this.field170.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field170[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "()I")
    public final int method111() {
        int var1 = this.field170.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field170[var4] >= 0 && this.field168[var4] < var3) {
                var2 = var4;
                var3 = this.field168[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public final void method112(int arg0) {
        int var2 = this.field163.method23(255);
        this.field168[arg0] += var2;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([B)V")
    public class7(byte[] arg0) {
        this.method98(arg0);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)J")
    public final long method113(int arg0) {
        return (long) this.field165 * (long) arg0 + this.field164;
    }
}
