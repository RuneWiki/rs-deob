import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class41 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lng;")
    private class135 field927 = new class135((byte[]) null);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[B")
    private static byte[] field926 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "J")
    private long field934;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    private int[] field928;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    private int[] field929;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public int[] field932;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
    private int[] field933;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B)V")
    public final void method342(byte[] arg0) {
        this.field927.field2483 = arg0;
        this.field927.field2449 = 10;
        int var2 = this.field927.method927(127);
        this.field930 = this.field927.method927(126);
        this.field931 = 500000;
        this.field933 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field927.method949(3933);
            int var6 = this.field927.method949(3933);
            if (var5 == 1297379947) {
                this.field933[var3] = this.field927.field2449;
                var3++;
            }
            this.field927.field2449 += var6;
        }
        this.field934 = 0L;
        this.field928 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field928[var4] = this.field933[var4];
        }
        this.field932 = new int[var2];
        this.field929 = new int[var2];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    private final int method343(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field926[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field927.method920((byte) 23) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field927.method920((byte) 40) << 16;
            }
            return var8;
        }
        int var3 = this.field927.method920((byte) 112);
        int var4 = this.field927.method948(-90);
        if (var3 == 47) {
            this.field927.field2449 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field927.method909(-917770352);
            var4 -= 3;
            int var6 = this.field932[arg0];
            this.field934 += (long) (this.field931 - var5) * (long) var6;
            this.field931 = var5;
            this.field927.field2449 += var4;
            return 2;
        } else {
            this.field927.field2449 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method344(int arg0) {
        this.field928[arg0] = this.field927.field2449;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final void method345(int arg0) {
        this.field927.field2449 = this.field928[arg0];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()Z")
    public final boolean method346() {
        int var1 = this.field928.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field928[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
    public final int method347(int arg0) {
        return this.method348(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I")
    private final int method348(int arg0) {
        byte var2 = this.field927.field2483[this.field927.field2449];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field929[arg0] = var3;
            this.field927.field2449++;
        } else {
            var3 = this.field929[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method343(arg0, var3);
        }
        int var4 = this.field927.method948(-104);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field927.field2483[this.field927.field2449] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field927.field2449++;
                this.field929[arg0] = var5;
                return this.method343(arg0, var5);
            }
        }
        this.field927.field2449 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
    public final void method349() {
        this.field927.field2483 = null;
        this.field933 = null;
        this.field928 = null;
        this.field932 = null;
        this.field929 = null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)J")
    public final long method350(int arg0) {
        return (long) this.field931 * (long) arg0 + this.field934;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
    public final int method351() {
        int var1 = this.field928.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field928[var4] >= 0 && this.field932[var4] < var3) {
                var2 = var4;
                var3 = this.field932[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    public final void method352(int arg0) {
        int var2 = this.field927.method948(-47);
        this.field932[arg0] += var2;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
    public static void method353() {
        field926 = null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()I")
    public final int method354() {
        return this.field928.length;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "()V")
    public final void method355() {
        this.field927.field2449 = -1;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "()Z")
    public final boolean method356() {
        return this.field927.field2483 != null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(J)V")
    public final void method357(long arg0) {
        this.field934 = arg0;
        int var3 = this.field928.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field932[var4] = 0;
            this.field929[var4] = 0;
            this.field927.field2449 = this.field933[var4];
            this.method352(var4);
            this.field928[var4] = this.field927.field2449;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class41() {
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    public class41(byte[] arg0) {
        this.method342(arg0);
    }
}
