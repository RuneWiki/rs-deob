import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class482 {

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Lee;")
    private class677 field6589 = new class677(null);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "[B")
    private static byte[] field6588 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    private int field6593;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "J")
    private long field6594;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "[I")
    public int[] field6590;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "[I")
    private int[] field6591;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
    private int[] field6592;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "[I")
    private int[] field6596;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "([B)V", line = 3)
    public final void method2711(byte[] arg0) {
        this.field6589.field9399 = arg0;
        this.field6589.field9419 = 10;
        int var2 = this.field6589.method3807(-1);
        this.field6595 = this.field6589.method3807(-1);
        this.field6593 = 500000;
        this.field6596 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6589.method3799(false);
            int var6 = this.field6589.method3799(false);
            if (var5 == 1297379947) {
                this.field6596[var3] = this.field6589.field9419;
                var3++;
            }
            this.field6589.field9419 += var6;
        }
        this.field6594 = 0L;
        this.field6591 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6591[var4] = this.field6596[var4];
        }
        this.field6590 = new int[var2];
        this.field6592 = new int[var2];
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "()V", line = 56)
    public static void method2712() {
        field6588 = null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)I", line = 61)
    public final int method2713(int arg0) {
        return this.method2719(arg0);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "()I", line = 69)
    public final int method2714() {
        int var1 = this.field6591.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6591[var4] >= 0 && this.field6590[var4] < var3) {
                var2 = var4;
                var3 = this.field6590[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V", line = 98)
    public final void method2715(int arg0) {
        this.field6591[arg0] = this.field6589.field9419;
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)J", line = 101)
    public final long method2716(int arg0) {
        return (long) this.field6593 * (long) arg0 + this.field6594;
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "()Z", line = 108)
    public final boolean method2717() {
        return this.field6589.field9399 != null;
    }

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "()I", line = 113)
    public final int method2718() {
        return this.field6591.length;
    }

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "(I)I", line = 118)
    private final int method2719(int arg0) {
        byte var2 = this.field6589.field9399[this.field6589.field9419];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6592[arg0] = var3;
            this.field6589.field9419++;
        } else {
            var3 = this.field6592[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2724(arg0, var3);
        }
        int var4 = this.field6589.method3776(-125749561);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6589.field9399[this.field6589.field9419] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6589.field9419++;
                this.field6592[arg0] = var5;
                return this.method2724(arg0, var5);
            }
        }
        this.field6589.field9419 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V", line = 264)
    public class482() {
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "([B)V", line = 266)
    public class482(byte[] arg0) {
        this.method2711(arg0);
    }

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)V", line = 163)
    public final void method2720(int arg0) {
        int var2 = this.field6589.method3776(-125749561);
        this.field6590[arg0] += var2;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(J)V", line = 168)
    public final void method2721(long arg0) {
        this.field6594 = arg0;
        int var3 = this.field6591.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6590[var4] = 0;
            this.field6592[var4] = 0;
            this.field6589.field9419 = this.field6596[var4];
            this.method2720(var4);
            this.field6591[var4] = this.field6589.field9419;
        }
    }

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "()Z", line = 187)
    public final boolean method2722() {
        int var1 = this.field6591.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6591[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "()V", line = 201)
    public final void method2723() {
        this.field6589.field9419 = -1;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)I", line = 204)
    private final int method2724(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6588[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6589.method3821((byte) 127) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6589.method3821((byte) -87) << 16;
            }
            return var8;
        }
        int var3 = this.field6589.method3821((byte) 104);
        int var4 = this.field6589.method3776(-125749561);
        if (var3 == 47) {
            this.field6589.field9419 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6589.method3833(255);
            var4 -= 3;
            int var6 = this.field6590[arg0];
            this.field6594 += (long) (this.field6593 - var5) * (long) var6;
            this.field6593 = var5;
            this.field6589.field9419 += var4;
            return 2;
        } else {
            this.field6589.field9419 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "(I)V", line = 248)
    public final void method2725(int arg0) {
        this.field6589.field9419 = this.field6591[arg0];
    }

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "()V", line = 252)
    public final void method2726() {
        this.field6589.field9399 = null;
        this.field6596 = null;
        this.field6591 = null;
        this.field6590 = null;
        this.field6592 = null;
    }
}
