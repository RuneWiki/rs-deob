import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lkd;")
    private class64 field373 = new class64(null);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[B")
    private static byte[] field381 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "J")
    private long field375;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    public int[] field377;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    private int[] field379;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I", line = 3)
    public final int method128() {
        return this.field378.length;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V", line = 6)
    public final void method129() {
        this.field373.field1617 = -1;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()Z", line = 9)
    public final boolean method130() {
        return this.field373.field1617 < 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 13)
    public final void method131(int arg0) {
        int var2 = this.field373.method527((byte) -125);
        this.field377[arg0] += var2;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z", line = 22)
    public final boolean method132() {
        int var1 = this.field378.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field378[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V", line = 37)
    public final void method133(byte[] arg0) {
        this.field373.field1679 = arg0;
        this.field373.field1617 = 10;
        int var2 = this.field373.method506((byte) -90);
        this.field376 = this.field373.method506((byte) -90);
        this.field380 = 500000;
        this.field374 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field373.method487(128);
            int var5 = this.field373.method487(128);
            if (var4 == 1297379947) {
                this.field374[var3] = this.field373.field1617;
                var3++;
            }
            this.field373.field1617 += var5;
        }
        this.field378 = (int[]) this.field374.clone();
        this.field377 = new int[var2];
        this.field379 = new int[var2];
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 82)
    public final void method134(int arg0) {
        this.field373.field1617 = this.field378[arg0];
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)J", line = 86)
    public final long method135(int arg0) {
        return (long) this.field380 * (long) arg0 + this.field375;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z", line = 89)
    public final boolean method136() {
        return this.field373.field1679 != null;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 93)
    public final void method137(int arg0) {
        this.field378[arg0] = this.field373.field1617;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I", line = 97)
    public final int method138(int arg0) {
        return this.method143(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I", line = 103)
    private final int method139(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field381[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field373.method520(-111) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field373.method520(-122) << 16;
            }
            return var8;
        }
        int var3 = this.field373.method520(-113);
        int var4 = this.field373.method527((byte) -54);
        if (var3 == 47) {
            this.field373.field1617 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field373.method503(65280);
            var4 -= 3;
            int var6 = this.field377[arg0];
            this.field375 += (long) (this.field380 - var5) * (long) var6;
            this.field380 = var5;
            this.field373.field1617 += var4;
            return 2;
        } else {
            this.field373.field1617 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()V", line = 146)
    public static void method140() {
        field381 = null;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()V", line = 153)
    public final void method141() {
        this.field373.field1679 = null;
        this.field374 = null;
        this.field378 = null;
        this.field377 = null;
        this.field379 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(J)V", line = 166)
    public final void method142(long arg0) {
        this.field375 = arg0;
        int var3 = this.field378.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field377[var4] = 0;
            this.field379[var4] = 0;
            this.field373.field1617 = this.field374[var4];
            this.method131(var4);
            this.field378[var4] = this.field373.field1617;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)I", line = 189)
    private final int method143(int arg0) {
        byte var2 = this.field373.field1679[this.field373.field1617];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field379[arg0] = var3;
            this.field373.field1617++;
        } else {
            var3 = this.field379[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method139(arg0, var3);
        }
        int var4 = this.field373.method527((byte) -36);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field373.field1679[this.field373.field1617] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field373.field1617++;
                this.field379[arg0] = var5;
                return this.method139(arg0, var5);
            }
        }
        this.field373.field1617 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "()I", line = 228)
    public final int method144() {
        int var1 = this.field378.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field378[var4] >= 0 && this.field377[var4] < var3) {
                var2 = var4;
                var3 = this.field377[var4];
            }
        }
        return var2;
    }
}
