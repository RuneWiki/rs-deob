import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class740 {

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "Ltn;")
    private class179 field10348 = new class179(null);

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "[B")
    private static byte[] field10347 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    private int field10351;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
    public int field10352;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "J")
    private long field10353;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "[I")
    private int[] field10349;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "[I")
    private int[] field10350;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "[I")
    public int[] field10354;

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "[I")
    private int[] field10355;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)I")
    private final int method4143(int arg0) {
        byte var2 = this.field10348.field2325[this.field10348.field2354];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field10355[arg0] = var3;
            this.field10348.field2354++;
        } else {
            var3 = this.field10355[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4152(arg0, var3);
        }
        int var4 = this.field10348.method1120(-94);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field10348.field2325[this.field10348.field2354] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field10348.field2354++;
                this.field10355[arg0] = var5;
                return this.method4152(arg0, var5);
            }
        }
        this.field10348.field2354 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)I")
    public final int method4144(int arg0) {
        return this.method4143(arg0);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "()I")
    public final int method4145() {
        int var1 = this.field10349.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field10349[var4] >= 0 && this.field10354[var4] < var3) {
                var2 = var4;
                var3 = this.field10354[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)V")
    public final void method4146(int arg0) {
        int var2 = this.field10348.method1120(-90);
        this.field10354[arg0] += var2;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "()I")
    public final int method4147() {
        return this.field10349.length;
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "()Z")
    public final boolean method4148() {
        int var1 = this.field10349.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field10349[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "()V")
    public final void method4149() {
        this.field10348.field2325 = null;
        this.field10350 = null;
        this.field10349 = null;
        this.field10354 = null;
        this.field10355 = null;
    }

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "()Z")
    public final boolean method4150() {
        return this.field10348.field2325 != null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(J)V")
    public final void method4151(long arg0) {
        this.field10353 = arg0;
        int var3 = this.field10349.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field10354[var4] = 0;
            this.field10355[var4] = 0;
            this.field10348.field2354 = this.field10350[var4];
            this.method4146(var4);
            this.field10349[var4] = this.field10348.field2354;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)I")
    private final int method4152(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field10347[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field10348.method1094(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field10348.method1094(255) << 16;
            }
            return var8;
        }
        int var3 = this.field10348.method1094(255);
        int var4 = this.field10348.method1120(-119);
        if (var3 == 47) {
            this.field10348.field2354 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field10348.method1114(86);
            var4 -= 3;
            int var6 = this.field10354[arg0];
            this.field10353 += (long) (this.field10351 - var5) * (long) var6;
            this.field10351 = var5;
            this.field10348.field2354 += var4;
            return 2;
        } else {
            this.field10348.field2354 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "([B)V")
    public final void method4153(byte[] arg0) {
        this.field10348.field2325 = arg0;
        this.field10348.field2354 = 10;
        int var2 = this.field10348.method1107(false);
        this.field10352 = this.field10348.method1107(false);
        this.field10351 = 500000;
        this.field10350 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field10348.method1095((byte) 124);
            int var6 = this.field10348.method1095((byte) 116);
            if (var5 == 1297379947) {
                this.field10350[var3] = this.field10348.field2354;
                var3++;
            }
            this.field10348.field2354 += var6;
        }
        this.field10353 = 0L;
        this.field10349 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field10349[var4] = this.field10350[var4];
        }
        this.field10354 = new int[var2];
        this.field10355 = new int[var2];
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(I)V")
    public final void method4154(int arg0) {
        this.field10349[arg0] = this.field10348.field2354;
    }

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "(I)V")
    public final void method4155(int arg0) {
        this.field10348.field2354 = this.field10349[arg0];
    }

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "()V")
    public final void method4156() {
        this.field10348.field2354 = -1;
    }

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "()V")
    public static void method4157() {
        field10347 = null;
    }

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "(I)J")
    public final long method4158(int arg0) {
        return (long) this.field10351 * (long) arg0 + this.field10353;
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V")
    public class740() {
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "([B)V")
    public class740(byte[] arg0) {
        this.method4153(arg0);
    }
}
