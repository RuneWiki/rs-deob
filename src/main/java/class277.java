import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class277 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ls;")
    private class170 field4756 = new class170((byte[]) null);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[B")
    private static byte[] field4755 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "J")
    private long field4763;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    private int[] field4757;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    private int[] field4758;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public int[] field4759;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[I")
    private int[] field4761;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(J)V", line = 4)
    public final void method1932(long arg0) {
        this.field4763 = arg0;
        int var3 = this.field4757.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4759[var4] = 0;
            this.field4761[var4] = 0;
            this.field4756.field2787 = this.field4758[var4];
            this.method1933(var4);
            this.field4757[var4] = this.field4756.field2787;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 26)
    public final void method1933(int arg0) {
        int var2 = this.field4756.method1220((byte) 100);
        this.field4759[arg0] += var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 30)
    public static void method1934() {
        field4755 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()Z", line = 35)
    public final boolean method1935() {
        int var1 = this.field4757.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4757[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I", line = 49)
    public final int method1936(int arg0) {
        return this.method1942(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([B)V", line = 58)
    public final void method1937(byte[] arg0) {
        this.field4756.field2758 = arg0;
        this.field4756.field2787 = 10;
        int var2 = this.field4756.method1214(-18254);
        this.field4760 = this.field4756.method1214(-18254);
        this.field4762 = 500000;
        this.field4758 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4756.method1233((byte) -77);
            int var5 = this.field4756.method1233((byte) -77);
            if (var4 == 1297379947) {
                this.field4758[var3] = this.field4756.field2787;
                var3++;
            }
            this.field4756.field2787 += var5;
        }
        this.field4763 = 0L;
        this.field4757 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4757[var6] = this.field4758[var6];
        }
        this.field4759 = new int[var2];
        this.field4761 = new int[var2];
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 264)
    public class277() {
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V", line = 266)
    public class277(byte[] arg0) {
        this.method1937(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 115)
    public final void method1938(int arg0) {
        this.field4757[arg0] = this.field4756.field2787;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()I", line = 121)
    public final int method1939() {
        return this.field4757.length;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 125)
    private final int method1940(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4755[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4756.method1221(81) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4756.method1221(109) << 16;
            }
            return var8;
        }
        int var3 = this.field4756.method1221(93);
        int var4 = this.field4756.method1220((byte) 82);
        if (var3 == 47) {
            this.field4756.field2787 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4756.method1208((byte) -82);
            var4 -= 3;
            int var6 = this.field4759[arg0];
            this.field4763 += (long) (this.field4762 - var5) * (long) var6;
            this.field4762 = var5;
            this.field4756.field2787 += var4;
            return 2;
        } else {
            this.field4756.field2787 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V", line = 168)
    public final void method1941() {
        this.field4756.field2787 = -1;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)I", line = 174)
    private final int method1942(int arg0) {
        byte var2 = this.field4756.field2758[this.field4756.field2787];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4761[arg0] = var3;
            this.field4756.field2787++;
        } else {
            var3 = this.field4761[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1940(arg0, var3);
        }
        int var4 = this.field4756.method1220((byte) 126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4756.field2758[this.field4756.field2787] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4756.field2787++;
                this.field4761[arg0] = var5;
                return this.method1940(arg0, var5);
            }
        }
        this.field4756.field2787 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)J", line = 212)
    public final long method1943(int arg0) {
        return (long) this.field4762 * (long) arg0 + this.field4763;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V", line = 218)
    public final void method1944() {
        this.field4756.field2758 = null;
        this.field4758 = null;
        this.field4757 = null;
        this.field4759 = null;
        this.field4761 = null;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()Z", line = 229)
    public final boolean method1945() {
        return this.field4756.field2758 != null;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "()I", line = 233)
    public final int method1946() {
        int var1 = this.field4757.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4757[var4] >= 0 && this.field4759[var4] < var3) {
                var2 = var4;
                var3 = this.field4759[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 262)
    public final void method1947(int arg0) {
        this.field4756.field2787 = this.field4757[arg0];
    }
}
