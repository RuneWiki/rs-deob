import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class119 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lid;")
    private class60 field2778 = new class60(null);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[B")
    private static byte[] field2779 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "J")
    private long field2784;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public int[] field2781;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    private int[] field2782;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    private int[] field2785;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
    private int[] field2786;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
    public final long method920(int arg0) {
        return (long) this.field2780 * (long) arg0 + this.field2784;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public final void method921() {
        this.field2778.field1248 = null;
        this.field2782 = null;
        this.field2786 = null;
        this.field2781 = null;
        this.field2785 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
    public final void method922(byte[] arg0) {
        this.field2778.field1248 = arg0;
        this.field2778.field1227 = 10;
        int var2 = this.field2778.method467(255);
        this.field2783 = this.field2778.method467(255);
        this.field2780 = 500000;
        this.field2782 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2778.method442((byte) -39);
            int var6 = this.field2778.method442((byte) -57);
            if (var5 == 1297379947) {
                this.field2782[var3] = this.field2778.field1227;
                var3++;
            }
            this.field2778.field1227 += var6;
        }
        this.field2786 = new int[this.field2782.length];
        for (int var4 = 0; var4 < this.field2786.length; var4++) {
            this.field2786[var4] = this.field2782[var4];
        }
        this.field2781 = new int[var2];
        this.field2785 = new int[var2];
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
    public final void method923() {
        this.field2778.field1227 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()Z")
    public final boolean method924() {
        int var1 = this.field2786.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2786[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method925(int arg0) {
        this.field2778.field1227 = this.field2786[arg0];
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
    public static void method926() {
        field2779 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V")
    public final void method927(long arg0) {
        this.field2784 = arg0;
        int var3 = this.field2786.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2781[var4] = 0;
            this.field2785[var4] = 0;
            this.field2778.field1227 = this.field2782[var4];
            this.method928(var4);
            this.field2786[var4] = this.field2778.field1227;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public final void method928(int arg0) {
        int var2 = this.field2778.method494(true);
        this.field2781[arg0] += var2;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()I")
    public final int method929() {
        int var1 = this.field2786.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2786[var4] >= 0 && this.field2781[var4] < var3) {
                var2 = var4;
                var3 = this.field2781[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final void method930(int arg0) {
        this.field2786[arg0] = this.field2778.field1227;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "()Z")
    public final boolean method931() {
        return this.field2778.field1227 < 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
    private final int method932(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2779[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2778.method462((byte) 116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2778.method462((byte) 116) << 16;
            }
            return var8;
        }
        int var3 = this.field2778.method462((byte) 116);
        int var4 = this.field2778.method494(true);
        if (var3 == 47) {
            this.field2778.field1227 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2778.method493((byte) -44);
            var4 -= 3;
            int var6 = this.field2781[arg0];
            this.field2784 += (long) (this.field2780 - var5) * (long) var6;
            this.field2780 = var5;
            this.field2778.field1227 += var4;
            return 2;
        } else {
            this.field2778.field1227 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
    private final int method933(int arg0) {
        byte var2 = this.field2778.field1248[this.field2778.field1227];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2785[arg0] = var3;
            this.field2778.field1227++;
        } else {
            var3 = this.field2785[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method932(arg0, var3);
        }
        int var4 = this.field2778.method494(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2778.field1248[this.field2778.field1227] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2778.field1227++;
                this.field2785[arg0] = var5;
                return this.method932(arg0, var5);
            }
        }
        this.field2778.field1227 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "()Z")
    public final boolean method934() {
        return this.field2778.field1248 != null;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "()I")
    public final int method935() {
        return this.field2786.length;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I")
    public final int method936(int arg0) {
        return this.method933(arg0);
    }
}
