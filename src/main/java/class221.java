import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class221 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Llj;")
    private class25 field3577 = new class25((byte[]) null);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[B")
    private static byte[] field3576 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "J")
    private long field3583;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    private int[] field3578;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
    private int[] field3579;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    private int[] field3580;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
    public int[] field3584;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public final void method1490() {
        this.field3577.field339 = null;
        this.field3578 = null;
        this.field3579 = null;
        this.field3584 = null;
        this.field3580 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public final int method1491() {
        int var1 = this.field3579.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3579[var4] >= 0 && this.field3584[var4] < var3) {
                var2 = var4;
                var3 = this.field3584[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(J)V")
    public final void method1492(long arg0) {
        this.field3583 = arg0;
        int var3 = this.field3579.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3584[var4] = 0;
            this.field3580[var4] = 0;
            this.field3577.field349 = this.field3578[var4];
            this.method1496(var4);
            this.field3579[var4] = this.field3577.field349;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([B)V")
    public final void method1493(byte[] arg0) {
        this.field3577.field339 = arg0;
        this.field3577.field349 = 10;
        int var2 = this.field3577.method190(-3);
        this.field3581 = this.field3577.method190(-3);
        this.field3582 = 500000;
        this.field3578 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3577.method214((byte) 44);
            int var6 = this.field3577.method214((byte) 44);
            if (var5 == 1297379947) {
                this.field3578[var3] = this.field3577.field349;
                var3++;
            }
            this.field3577.field349 += var6;
        }
        this.field3583 = 0L;
        this.field3579 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3579[var4] = this.field3578[var4];
        }
        this.field3584 = new int[var2];
        this.field3580 = new int[var2];
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
    private final int method1494(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3576[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3577.method201(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3577.method201(255) << 16;
            }
            return var8;
        }
        int var3 = this.field3577.method201(255);
        int var4 = this.field3577.method180(false);
        if (var3 == 47) {
            this.field3577.field349 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3577.method215((byte) 122);
            var4 -= 3;
            int var6 = this.field3584[arg0];
            this.field3583 += (long) (this.field3582 - var5) * (long) var6;
            this.field3582 = var5;
            this.field3577.field349 += var4;
            return 2;
        } else {
            this.field3577.field349 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
    public static void method1495() {
        field3576 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method1496(int arg0) {
        int var2 = this.field3577.method180(false);
        this.field3584[arg0] += var2;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()Z")
    public final boolean method1497() {
        int var1 = this.field3579.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3579[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)J")
    public final long method1498(int arg0) {
        return (long) this.field3582 * (long) arg0 + this.field3583;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)I")
    private final int method1499(int arg0) {
        byte var2 = this.field3577.field339[this.field3577.field349];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3580[arg0] = var3;
            this.field3577.field349++;
        } else {
            var3 = this.field3580[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1494(arg0, var3);
        }
        int var4 = this.field3577.method180(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3577.field339[this.field3577.field349] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3577.field349++;
                this.field3580[arg0] = var5;
                return this.method1494(arg0, var5);
            }
        }
        this.field3577.field349 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "()I")
    public final int method1500() {
        return this.field3579.length;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public final void method1501(int arg0) {
        this.field3579[arg0] = this.field3577.field349;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public final void method1502(int arg0) {
        this.field3577.field349 = this.field3579[arg0];
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "()V")
    public final void method1503() {
        this.field3577.field349 = -1;
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "()Z")
    public final boolean method1504() {
        return this.field3577.field339 != null;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
    public final int method1505(int arg0) {
        return this.method1499(arg0);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class221() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
    public class221(byte[] arg0) {
        this.method1493(arg0);
    }
}
