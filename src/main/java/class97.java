import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class97 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lug;")
    private class25 field1461 = new class25((byte[]) null);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[B")
    private static byte[] field1462 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "J")
    private long field1467;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    private int[] field1464;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    private int[] field1465;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[I")
    private int[] field1468;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 3)
    public static void method849() {
        field1462 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 7)
    private final int method850(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1462[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1461.method281(-126) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1461.method281(-127) << 16;
            }
            return var8;
        }
        int var3 = this.field1461.method281(-125);
        int var4 = this.field1461.method284((byte) -42);
        if (var3 == 47) {
            this.field1461.field397 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1461.method265(true);
            var4 -= 3;
            int var6 = this.field1463[arg0];
            this.field1467 += (long) (this.field1469 - var5) * (long) var6;
            this.field1469 = var5;
            this.field1461.field397 += var4;
            return 2;
        } else {
            this.field1461.field397 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()Z", line = 50)
    public final boolean method851() {
        int var1 = this.field1468.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1468[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 65)
    public final int method852(int arg0) {
        return this.method864(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 71)
    public final void method853(int arg0) {
        this.field1461.field397 = this.field1468[arg0];
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()V", line = 74)
    public final void method854() {
        this.field1461.field448 = null;
        this.field1465 = null;
        this.field1468 = null;
        this.field1463 = null;
        this.field1464 = null;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 83)
    public final void method855(int arg0) {
        this.field1468[arg0] = this.field1461.field397;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)J", line = 86)
    public final long method856(int arg0) {
        return (long) this.field1469 * (long) arg0 + this.field1467;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "()Z", line = 93)
    public final boolean method857() {
        return this.field1461.field448 != null;
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "()I", line = 100)
    public final int method858() {
        int var1 = this.field1468.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1468[var4] >= 0 && this.field1463[var4] < var3) {
                var2 = var4;
                var3 = this.field1463[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "()V", line = 125)
    public final void method859() {
        this.field1461.field397 = -1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(J)V", line = 128)
    public final void method860(long arg0) {
        this.field1467 = arg0;
        int var3 = this.field1468.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1463[var4] = 0;
            this.field1464[var4] = 0;
            this.field1461.field397 = this.field1465[var4];
            this.method861(var4);
            this.field1468[var4] = this.field1461.field397;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V", line = 153)
    public final void method861(int arg0) {
        int var2 = this.field1461.method284((byte) -42);
        this.field1463[arg0] += var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([B)V", line = 157)
    public final void method862(byte[] arg0) {
        this.field1461.field448 = arg0;
        this.field1461.field397 = 10;
        int var2 = this.field1461.method314((byte) 114);
        this.field1466 = this.field1461.method314((byte) 53);
        this.field1469 = 500000;
        this.field1465 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1461.method262((byte) 44);
            int var5 = this.field1461.method262((byte) 74);
            if (var4 == 1297379947) {
                this.field1465[var3] = this.field1461.field397;
                var3++;
            }
            this.field1461.field397 += var5;
        }
        this.field1467 = 0L;
        this.field1468 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1468[var6] = this.field1465[var6];
        }
        this.field1463 = new int[var2];
        this.field1464 = new int[var2];
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 264)
    public class97() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V", line = 266)
    public class97(byte[] arg0) {
        this.method862(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "()I", line = 216)
    public final int method863() {
        return this.field1468.length;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)I", line = 225)
    private final int method864(int arg0) {
        byte var2 = this.field1461.field448[this.field1461.field397];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1464[arg0] = var3;
            this.field1461.field397++;
        } else {
            var3 = this.field1464[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method850(arg0, var3);
        }
        int var4 = this.field1461.method284((byte) -42);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1461.field448[this.field1461.field397] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1461.field397++;
                this.field1464[arg0] = var5;
                return this.method850(arg0, var5);
            }
        }
        this.field1461.field397 += var4;
        return 0;
    }
}
