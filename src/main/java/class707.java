import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class707 {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lrv;")
    private class120 field9956 = new class120(null);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "[B")
    private static byte[] field9955 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    private int field9959;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public int field9963;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "J")
    private long field9958;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "[I")
    public int[] field9957;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
    private int[] field9960;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "[I")
    private int[] field9961;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "[I")
    private int[] field9962;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "()I", line = 5)
    public final int method3999() {
        int var1 = this.field9961.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field9961[var4] >= 0 && this.field9957[var4] < var3) {
                var2 = var4;
                var3 = this.field9957[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V", line = 32)
    public final void method4000(int arg0) {
        int var2 = this.field9956.method881(20458);
        this.field9957[arg0] += var2;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(J)V", line = 37)
    public final void method4001(long arg0) {
        this.field9958 = arg0;
        int var3 = this.field9961.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field9957[var4] = 0;
            this.field9960[var4] = 0;
            this.field9956.field1521 = this.field9962[var4];
            this.method4000(var4);
            this.field9961[var4] = this.field9956.field1521;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V", line = 59)
    public final void method4002(int arg0) {
        this.field9961[arg0] = this.field9956.field1521;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)J", line = 64)
    public final long method4003(int arg0) {
        return (long) this.field9959 * (long) arg0 + this.field9958;
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)I", line = 69)
    public final int method4004(int arg0) {
        return this.method4009(arg0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)I", line = 76)
    private final int method4005(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field9955[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field9956.method842(2384) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field9956.method842(2384) << 16;
            }
            return var8;
        }
        int var3 = this.field9956.method842(2384);
        int var4 = this.field9956.method881(20458);
        if (var3 == 47) {
            this.field9956.field1521 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field9956.method833(-3);
            var4 -= 3;
            int var6 = this.field9957[arg0];
            this.field9958 += (long) (this.field9959 - var5) * (long) var6;
            this.field9959 = var5;
            this.field9956.field1521 += var4;
            return 2;
        } else {
            this.field9956.field1521 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "()Z", line = 119)
    public final boolean method4006() {
        int var1 = this.field9961.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field9961[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "(I)V", line = 132)
    public final void method4007(int arg0) {
        this.field9956.field1521 = this.field9961[arg0];
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "()V", line = 137)
    public static void method4008() {
        field9955 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)I", line = 141)
    private final int method4009(int arg0) {
        byte var2 = this.field9956.field1556[this.field9956.field1521];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field9960[arg0] = var3;
            this.field9956.field1521++;
        } else {
            var3 = this.field9960[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4005(arg0, var3);
        }
        int var4 = this.field9956.method881(20458);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field9956.field1556[this.field9956.field1521] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field9956.field1521++;
                this.field9960[arg0] = var5;
                return this.method4005(arg0, var5);
            }
        }
        this.field9956.field1521 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "()I", line = 181)
    public final int method4010() {
        return this.field9961.length;
    }

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "()V", line = 184)
    public final void method4011() {
        this.field9956.field1521 = -1;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V", line = 264)
    public class707() {
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V", line = 266)
    public class707(byte[] arg0) {
        this.method4014(arg0);
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "()Z", line = 196)
    public final boolean method4012() {
        return this.field9956.field1556 != null;
    }

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "()V", line = 201)
    public final void method4013() {
        this.field9956.field1556 = null;
        this.field9962 = null;
        this.field9961 = null;
        this.field9957 = null;
        this.field9960 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([B)V", line = 212)
    public final void method4014(byte[] arg0) {
        this.field9956.field1556 = arg0;
        this.field9956.field1521 = 10;
        int var2 = this.field9956.method898((byte) -87);
        this.field9963 = this.field9956.method898((byte) -89);
        this.field9959 = 500000;
        this.field9962 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field9956.method871(23995);
            int var6 = this.field9956.method871(23995);
            if (var5 == 1297379947) {
                this.field9962[var3] = this.field9956.field1521;
                var3++;
            }
            this.field9956.field1521 += var6;
        }
        this.field9958 = 0L;
        this.field9961 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field9961[var4] = this.field9962[var4];
        }
        this.field9957 = new int[var2];
        this.field9960 = new int[var2];
    }
}
