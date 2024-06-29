import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class521 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lee;")
    private class675 field7388 = new class675(null);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[B")
    private static byte[] field7387 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    private int field7392;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "J")
    private long field7394;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    private int[] field7389;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    private int[] field7390;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[I")
    public int[] field7391;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    private int[] field7393;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Z", line = 4)
    public final boolean method3043() {
        int var1 = this.field7393.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7393[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 18)
    private final int method3044(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7387[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7388.method3750((byte) 35) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7388.method3750((byte) 35) << 16;
            }
            return var8;
        }
        int var3 = this.field7388.method3750((byte) 35);
        int var4 = this.field7388.method3742((byte) 122);
        if (var3 == 47) {
            this.field7388.field9146 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7388.method3756(false);
            var4 -= 3;
            int var6 = this.field7391[arg0];
            this.field7394 += (long) (this.field7392 - var5) * (long) var6;
            this.field7392 = var5;
            this.field7388.field9146 += var4;
            return 2;
        } else {
            this.field7388.field9146 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I", line = 61)
    public final int method3045(int arg0) {
        return this.method3057(arg0);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 69)
    public final void method3046(int arg0) {
        int var2 = this.field7388.method3742((byte) 122);
        this.field7391[arg0] += var2;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I", line = 74)
    public final int method3047() {
        int var1 = this.field7393.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7393[var4] >= 0 && this.field7391[var4] < var3) {
                var2 = var4;
                var3 = this.field7391[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 102)
    public final void method3048(int arg0) {
        this.field7393[arg0] = this.field7388.field9146;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B)V", line = 105)
    public final void method3049(byte[] arg0) {
        this.field7388.field9154 = arg0;
        this.field7388.field9146 = 10;
        int var2 = this.field7388.method3757((byte) -65);
        this.field7395 = this.field7388.method3757((byte) -65);
        this.field7392 = 500000;
        this.field7390 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7388.method3703(118);
            int var6 = this.field7388.method3703(117);
            if (var5 == 1297379947) {
                this.field7390[var3] = this.field7388.field9146;
                var3++;
            }
            this.field7388.field9146 += var6;
        }
        this.field7394 = 0L;
        this.field7393 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7393[var4] = this.field7390[var4];
        }
        this.field7391 = new int[var2];
        this.field7389 = new int[var2];
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V", line = 162)
    public final void method3050() {
        this.field7388.field9154 = null;
        this.field7390 = null;
        this.field7393 = null;
        this.field7391 = null;
        this.field7389 = null;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V", line = 171)
    public static void method3051() {
        field7387 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(J)V", line = 174)
    public final void method3052(long arg0) {
        this.field7394 = arg0;
        int var3 = this.field7393.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7391[var4] = 0;
            this.field7389[var4] = 0;
            this.field7388.field9146 = this.field7390[var4];
            this.method3046(var4);
            this.field7393[var4] = this.field7388.field9146;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V", line = 192)
    public final void method3053() {
        this.field7388.field9146 = -1;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()I", line = 195)
    public final int method3054() {
        return this.field7393.length;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)J", line = 199)
    public final long method3055(int arg0) {
        return (long) this.field7392 * (long) arg0 + this.field7394;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()Z", line = 202)
    public final boolean method3056() {
        return this.field7388.field9154 != null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 264)
    public class521() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V", line = 266)
    public class521(byte[] arg0) {
        this.method3049(arg0);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)I", line = 216)
    private final int method3057(int arg0) {
        byte var2 = this.field7388.field9154[this.field7388.field9146];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7389[arg0] = var3;
            this.field7388.field9146++;
        } else {
            var3 = this.field7389[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3044(arg0, var3);
        }
        int var4 = this.field7388.method3742((byte) 122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7388.field9154[this.field7388.field9146] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7388.field9146++;
                this.field7389[arg0] = var5;
                return this.method3044(arg0, var5);
            }
        }
        this.field7388.field9146 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V", line = 255)
    public final void method3058(int arg0) {
        this.field7388.field9146 = this.field7393[arg0];
    }
}
