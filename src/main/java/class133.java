import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class133 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lqe;")
    private class109 field3090 = new class109(null);

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[B")
    private static byte[] field3098 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "J")
    private long field3093;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private int[] field3094;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
    public int[] field3095;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    private int[] field3096;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    private int[] field3097;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method975(int arg0) {
        this.field3090.field2583 = this.field3097[arg0];
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public final void method976(int arg0) {
        this.field3097[arg0] = this.field3090.field2583;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public final void method977() {
        this.field3090.field2547 = null;
        this.field3096 = null;
        this.field3097 = null;
        this.field3095 = null;
        this.field3094 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Z")
    public final boolean method978() {
        return this.field3090.field2547 != null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()Z")
    public final boolean method979() {
        int var1 = this.field3097.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3097[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()Z")
    public final boolean method980() {
        return this.field3090.field2583 < 0;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    private final int method981(int arg0) {
        byte var2 = this.field3090.field2547[this.field3090.field2583];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3094[arg0] = var3;
            this.field3090.field2583++;
        } else {
            var3 = this.field3094[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method991(arg0, var3);
        }
        int var4 = this.field3090.method800(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3090.field2547[this.field3090.field2583] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3090.field2583++;
                this.field3094[arg0] = var5;
                return this.method991(arg0, var5);
            }
        }
        this.field3090.field2583 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()I")
    public final int method982() {
        int var1 = this.field3097.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3097[var4] >= 0 && this.field3095[var4] < var3) {
                var2 = var4;
                var3 = this.field3095[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public final void method983(int arg0) {
        int var2 = this.field3090.method800(false);
        this.field3095[arg0] += var2;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)J")
    public final long method984(int arg0) {
        return (long) this.field3091 * (long) arg0 + this.field3093;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([B)V")
    public final void method985(byte[] arg0) {
        this.field3090.field2547 = arg0;
        this.field3090.field2583 = 10;
        int var2 = this.field3090.method835(2);
        this.field3092 = this.field3090.method835(2);
        this.field3091 = 500000;
        this.field3096 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3090.method832(14722);
            int var6 = this.field3090.method832(14722);
            if (var5 == 1297379947) {
                this.field3096[var3] = this.field3090.field2583;
                var3++;
            }
            this.field3090.field2583 += var6;
        }
        this.field3097 = new int[this.field3096.length];
        for (int var4 = 0; var4 < this.field3097.length; var4++) {
            this.field3097[var4] = this.field3096[var4];
        }
        this.field3095 = new int[var2];
        this.field3094 = new int[var2];
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
    public final void method986() {
        this.field3090.field2583 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "()I")
    public final int method987() {
        return this.field3097.length;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(J)V")
    public final void method988(long arg0) {
        this.field3093 = arg0;
        int var3 = this.field3097.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3095[var4] = 0;
            this.field3094[var4] = 0;
            this.field3090.field2583 = this.field3096[var4];
            this.method983(var4);
            this.field3097[var4] = this.field3090.field2583;
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "()V")
    public static void method989() {
        field3098 = null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I")
    public final int method990(int arg0) {
        return this.method981(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    private final int method991(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3098[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3090.method838(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3090.method838(255) << 16;
            }
            return var8;
        }
        int var3 = this.field3090.method838(255);
        int var4 = this.field3090.method800(false);
        if (var3 == 47) {
            this.field3090.field2583 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3090.method822((byte) 43);
            var4 -= 3;
            int var6 = this.field3095[arg0];
            this.field3093 += (long) (this.field3091 - var5) * (long) var6;
            this.field3091 = var5;
            this.field3090.field2583 += var4;
            return 2;
        } else {
            this.field3090.field2583 += var4;
            return 3;
        }
    }
}
