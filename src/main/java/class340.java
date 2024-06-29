import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class340 {

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "Lso;")
    private class494 field4748 = new class494(null);

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "[B")
    private static byte[] field4747 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "J")
    private long field4753;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "[I")
    private int[] field4750;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "[I")
    private int[] field4752;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "[I")
    public int[] field4754;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "[I")
    private int[] field4755;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "()I")
    public final int method2148() {
        return this.field4750.length;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public final void method2149(int arg0) {
        this.field4748.field7042 = this.field4750[arg0];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "([B)V")
    public final void method2150(byte[] arg0) {
        this.field4748.field7050 = arg0;
        this.field4748.field7042 = 10;
        int var2 = this.field4748.method2998(true);
        this.field4749 = this.field4748.method2998(true);
        this.field4751 = 500000;
        this.field4755 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4748.method2976(-125);
            int var6 = this.field4748.method2976(-125);
            if (var5 == 1297379947) {
                this.field4755[var3] = this.field4748.field7042;
                var3++;
            }
            this.field4748.field7042 += var6;
        }
        this.field4753 = 0L;
        this.field4750 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4750[var4] = this.field4755[var4];
        }
        this.field4754 = new int[var2];
        this.field4752 = new int[var2];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(J)V")
    public final void method2151(long arg0) {
        this.field4753 = arg0;
        int var3 = this.field4750.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4754[var4] = 0;
            this.field4752[var4] = 0;
            this.field4748.field7042 = this.field4755[var4];
            this.method2161(var4);
            this.field4750[var4] = this.field4748.field7042;
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
    public final void method2152() {
        this.field4748.field7050 = null;
        this.field4755 = null;
        this.field4750 = null;
        this.field4754 = null;
        this.field4752 = null;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
    public final void method2153(int arg0) {
        this.field4750[arg0] = this.field4748.field7042;
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "()V")
    public static void method2154() {
        field4747 = null;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)I")
    private final int method2155(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4747[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4748.method2964((byte) 116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4748.method2964((byte) 114) << 16;
            }
            return var8;
        }
        int var3 = this.field4748.method2964((byte) 70);
        int var4 = this.field4748.method2987(true);
        if (var3 == 47) {
            this.field4748.field7042 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4748.method2960((byte) 94);
            var4 -= 3;
            int var6 = this.field4754[arg0];
            this.field4753 += (long) (this.field4751 - var5) * (long) var6;
            this.field4751 = var5;
            this.field4748.field7042 += var4;
            return 2;
        } else {
            this.field4748.field7042 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)J")
    public final long method2156(int arg0) {
        return (long) this.field4751 * (long) arg0 + this.field4753;
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "()Z")
    public final boolean method2157() {
        return this.field4748.field7050 != null;
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
    public final void method2158() {
        this.field4748.field7042 = -1;
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)I")
    private final int method2159(int arg0) {
        byte var2 = this.field4748.field7050[this.field4748.field7042];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4752[arg0] = var3;
            this.field4748.field7042++;
        } else {
            var3 = this.field4752[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2155(arg0, var3);
        }
        int var4 = this.field4748.method2987(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4748.field7050[this.field4748.field7042] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4748.field7042++;
                this.field4752[arg0] = var5;
                return this.method2155(arg0, var5);
            }
        }
        this.field4748.field7042 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "()I")
    public final int method2160() {
        int var1 = this.field4750.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4750[var4] >= 0 && this.field4754[var4] < var3) {
                var2 = var4;
                var3 = this.field4754[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)V")
    public final void method2161(int arg0) {
        int var2 = this.field4748.method2987(true);
        this.field4754[arg0] += var2;
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)I")
    public final int method2162(int arg0) {
        return this.method2159(arg0);
    }

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "()Z")
    public final boolean method2163() {
        int var1 = this.field4750.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4750[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V")
    public class340() {
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "([B)V")
    public class340(byte[] arg0) {
        this.method2150(arg0);
    }
}
