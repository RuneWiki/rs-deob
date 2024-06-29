import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class230 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lwa;")
    private class229 field4106 = new class229(null);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[B")
    private static byte[] field4107 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "J")
    private long field4108;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public int[] field4109;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    private int[] field4110;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
    private int[] field4112;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
    private int[] field4113;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
    public final int method1491() {
        int var1 = this.field4112.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4112[var4] >= 0 && this.field4109[var4] < var3) {
                var2 = var4;
                var3 = this.field4109[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(J)V")
    public final void method1492(long arg0) {
        this.field4108 = arg0;
        int var3 = this.field4112.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4109[var4] = 0;
            this.field4113[var4] = 0;
            this.field4106.field4101 = this.field4110[var4];
            this.method1505(var4);
            this.field4112[var4] = this.field4106.field4101;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    private final int method1493(int arg0) {
        byte var2 = this.field4106.field4087[this.field4106.field4101];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4113[arg0] = var3;
            this.field4106.field4101++;
        } else {
            var3 = this.field4113[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1504(arg0, var3);
        }
        int var4 = this.field4106.method1438(21);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4106.field4087[this.field4106.field4101] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4106.field4101++;
                this.field4113[arg0] = var5;
                return this.method1504(arg0, var5);
            }
        }
        this.field4106.field4101 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method1494(int arg0) {
        this.field4106.field4101 = this.field4112[arg0];
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
    public final int method1495() {
        return this.field4112.length;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public final void method1496() {
        this.field4106.field4087 = null;
        this.field4110 = null;
        this.field4112 = null;
        this.field4109 = null;
        this.field4113 = null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
    public static void method1497() {
        field4107 = null;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
    public final boolean method1498() {
        return this.field4106.field4087 != null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B)V")
    public final void method1499(byte[] arg0) {
        this.field4106.field4087 = arg0;
        this.field4106.field4101 = 10;
        int var2 = this.field4106.method1490((byte) 73);
        this.field4114 = this.field4106.method1490((byte) 73);
        this.field4111 = 500000;
        this.field4110 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4106.method1437(425528536);
            int var6 = this.field4106.method1437(425528536);
            if (var5 == 1297379947) {
                this.field4110[var3] = this.field4106.field4101;
                var3++;
            }
            this.field4106.field4101 += var6;
        }
        this.field4108 = 0L;
        this.field4112 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4112[var4] = this.field4110[var4];
        }
        this.field4109 = new int[var2];
        this.field4113 = new int[var2];
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
    public final void method1500() {
        this.field4106.field4101 = -1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)J")
    public final long method1501(int arg0) {
        return (long) this.field4111 * (long) arg0 + this.field4108;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()Z")
    public final boolean method1502() {
        int var1 = this.field4112.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4112[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final void method1503(int arg0) {
        this.field4112[arg0] = this.field4106.field4101;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    private final int method1504(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4107[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4106.method1475(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4106.method1475(255) << 16;
            }
            return var8;
        }
        int var3 = this.field4106.method1475(255);
        int var4 = this.field4106.method1438(43);
        if (var3 == 47) {
            this.field4106.field4101 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4106.method1450(-23209);
            var4 -= 3;
            int var6 = this.field4109[arg0];
            this.field4108 += (long) (this.field4111 - var5) * (long) var6;
            this.field4111 = var5;
            this.field4106.field4101 += var4;
            return 2;
        } else {
            this.field4106.field4101 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public final void method1505(int arg0) {
        int var2 = this.field4106.method1438(-126);
        this.field4109[arg0] += var2;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)I")
    public final int method1506(int arg0) {
        return this.method1493(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class230() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
    public class230(byte[] arg0) {
        this.method1499(arg0);
    }
}
