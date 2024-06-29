import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class12 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lva;")
    private class187 field196 = new class187((byte[]) null);

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[B")
    private static byte[] field202 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "J")
    private long field198;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    private int[] field197;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public int[] field203;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    private final int method80(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field202[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field196.method1268(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field196.method1268(255) << 16;
            }
            return var8;
        }
        int var3 = this.field196.method1268(255);
        int var4 = this.field196.method1251(-1);
        if (var3 == 47) {
            this.field196.field3169 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field196.method1248((byte) -103);
            var4 -= 3;
            int var6 = this.field203[arg0];
            this.field198 += (long) (this.field200 - var5) * (long) var6;
            this.field200 = var5;
            this.field196.field3169 += var4;
            return 2;
        } else {
            this.field196.field3169 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method81(int arg0) {
        int var2 = this.field196.method1251(-1);
        this.field203[arg0] += var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()Z")
    public final boolean method82() {
        int var1 = this.field201.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field201[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([B)V")
    public final void method83(byte[] arg0) {
        this.field196.field3175 = arg0;
        this.field196.field3169 = 10;
        int var2 = this.field196.method1244(false);
        this.field204 = this.field196.method1244(false);
        this.field200 = 500000;
        this.field197 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field196.method1290((byte) 90);
            int var6 = this.field196.method1290((byte) 90);
            if (var5 == 1297379947) {
                this.field197[var3] = this.field196.field3169;
                var3++;
            }
            this.field196.field3169 += var6;
        }
        this.field198 = 0L;
        this.field201 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field201[var4] = this.field197[var4];
        }
        this.field203 = new int[var2];
        this.field199 = new int[var2];
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)J")
    public final long method84(int arg0) {
        return (long) this.field200 * (long) arg0 + this.field198;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public static void method85() {
        field202 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
    public final int method86(int arg0) {
        return this.method94(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public final void method87(int arg0) {
        this.field201[arg0] = this.field196.field3169;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(J)V")
    public final void method88(long arg0) {
        this.field198 = arg0;
        int var3 = this.field201.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field203[var4] = 0;
            this.field199[var4] = 0;
            this.field196.field3169 = this.field197[var4];
            this.method81(var4);
            this.field201[var4] = this.field196.field3169;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
    public final int method89() {
        return this.field201.length;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public final void method90() {
        this.field196.field3169 = -1;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.field196.field3169 = this.field201[arg0];
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    public final void method92() {
        this.field196.field3175 = null;
        this.field197 = null;
        this.field201 = null;
        this.field203 = null;
        this.field199 = null;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()I")
    public final int method93() {
        int var1 = this.field201.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field201[var4] >= 0 && this.field203[var4] < var3) {
                var2 = var4;
                var3 = this.field203[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)I")
    private final int method94(int arg0) {
        byte var2 = this.field196.field3175[this.field196.field3169];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field199[arg0] = var3;
            this.field196.field3169++;
        } else {
            var3 = this.field199[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method80(arg0, var3);
        }
        int var4 = this.field196.method1251(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field196.field3175[this.field196.field3169] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field196.field3169++;
                this.field199[arg0] = var5;
                return this.method80(arg0, var5);
            }
        }
        this.field196.field3169 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()Z")
    public final boolean method95() {
        return this.field196.field3175 != null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V")
    public class12(byte[] arg0) {
        this.method83(arg0);
    }
}
