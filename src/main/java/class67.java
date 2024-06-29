import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class67 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lhp;")
    private class217 field862 = new class217(null);

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[B")
    private static byte[] field863 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "J")
    private long field865;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    private int[] field864;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
    private int[] field866;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
    private int[] field868;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()I", line = 7)
    public final int method563() {
        int var1 = this.field864.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field864[var4] >= 0 && this.field869[var4] < var3) {
                var2 = var4;
                var3 = this.field869[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()Z", line = 33)
    public final boolean method564() {
        int var1 = this.field864.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field864[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 47)
    public final void method565(int arg0) {
        int var2 = this.field862.method1526((byte) 115);
        this.field869[arg0] += var2;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J", line = 52)
    public final long method566(int arg0) {
        return (long) this.field867 * (long) arg0 + this.field865;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()V", line = 55)
    public final void method567() {
        this.field862.field3572 = null;
        this.field868 = null;
        this.field864 = null;
        this.field869 = null;
        this.field866 = null;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I", line = 65)
    private final int method568(int arg0) {
        byte var2 = this.field862.field3572[this.field862.field3556];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field866[arg0] = var3;
            this.field862.field3556++;
        } else {
            var3 = this.field866[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method570(arg0, var3);
        }
        int var4 = this.field862.method1526((byte) 124);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field862.field3572[this.field862.field3556] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field862.field3556++;
                this.field866[arg0] = var5;
                return this.method570(arg0, var5);
            }
        }
        this.field862.field3556 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()I", line = 104)
    public final int method569() {
        return this.field864.length;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I", line = 107)
    private final int method570(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field863[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field862.method1515((byte) 123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field862.method1515((byte) 124) << 16;
            }
            return var8;
        }
        int var3 = this.field862.method1515((byte) 121);
        int var4 = this.field862.method1526((byte) -122);
        if (var3 == 47) {
            this.field862.field3556 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field862.method1548(31529);
            var4 -= 3;
            int var6 = this.field869[arg0];
            this.field865 += (long) (this.field867 - var5) * (long) var6;
            this.field867 = var5;
            this.field862.field3556 += var4;
            return 2;
        } else {
            this.field862.field3556 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(J)V", line = 149)
    public final void method571(long arg0) {
        this.field865 = arg0;
        int var3 = this.field864.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field869[var4] = 0;
            this.field866[var4] = 0;
            this.field862.field3556 = this.field868[var4];
            this.method565(var4);
            this.field864[var4] = this.field862.field3556;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 167)
    public final void method572(int arg0) {
        this.field864[arg0] = this.field862.field3556;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)I", line = 174)
    public final int method573(int arg0) {
        return this.method568(arg0);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "()V", line = 180)
    public final void method574() {
        this.field862.field3556 = -1;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "()V", line = 184)
    public static void method575() {
        field863 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([B)V", line = 189)
    public final void method576(byte[] arg0) {
        this.field862.field3572 = arg0;
        this.field862.field3556 = 10;
        int var2 = this.field862.method1511(-98);
        this.field870 = this.field862.method1511(-106);
        this.field867 = 500000;
        this.field868 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field862.method1556(126);
            int var6 = this.field862.method1556(121);
            if (var5 == 1297379947) {
                this.field868[var3] = this.field862.field3556;
                var3++;
            }
            this.field862.field3556 += var6;
        }
        this.field865 = 0L;
        this.field864 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field864[var4] = this.field868[var4];
        }
        this.field869 = new int[var2];
        this.field866 = new int[var2];
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "()Z", line = 242)
    public final boolean method577() {
        return this.field862.field3572 != null;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 248)
    public final void method578(int arg0) {
        this.field862.field3556 = this.field864[arg0];
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 264)
    public class67() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "([B)V", line = 266)
    public class67(byte[] arg0) {
        this.method576(arg0);
    }
}
