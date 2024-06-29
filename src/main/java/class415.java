import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class415 {

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Ljr;")
    private class96 field5866 = new class96(null);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "[B")
    private static byte[] field5865 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    private int field5871;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "J")
    private long field5872;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[I")
    private int[] field5868;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "[I")
    private int[] field5869;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "[I")
    private int[] field5870;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "[I")
    public int[] field5873;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)I", line = 3)
    private final int method2362(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5865[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5866.method718(77) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5866.method718(115) << 16;
            }
            return var8;
        }
        int var3 = this.field5866.method718(-94);
        int var4 = this.field5866.method728((byte) -121);
        if (var3 == 47) {
            this.field5866.field1301 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5866.method736(-120);
            var4 -= 3;
            int var6 = this.field5873[arg0];
            this.field5872 += (long) (this.field5871 - var5) * (long) var6;
            this.field5871 = var5;
            this.field5866.field1301 += var4;
            return 2;
        } else {
            this.field5866.field1301 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I", line = 47)
    private final int method2363(int arg0) {
        byte var2 = this.field5866.field1316[this.field5866.field1301];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5869[arg0] = var3;
            this.field5866.field1301++;
        } else {
            var3 = this.field5869[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2362(arg0, var3);
        }
        int var4 = this.field5866.method728((byte) -116);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5866.field1316[this.field5866.field1301] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5866.field1301++;
                this.field5869[arg0] = var5;
                return this.method2362(arg0, var5);
            }
        }
        this.field5866.field1301 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V", line = 87)
    public final void method2364(int arg0) {
        int var2 = this.field5866.method728((byte) -123);
        this.field5873[arg0] += var2;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(J)V", line = 93)
    public final void method2365(long arg0) {
        this.field5872 = arg0;
        int var3 = this.field5870.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5873[var4] = 0;
            this.field5869[var4] = 0;
            this.field5866.field1301 = this.field5868[var4];
            this.method2364(var4);
            this.field5870[var4] = this.field5866.field1301;
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)I", line = 114)
    public final int method2366(int arg0) {
        return this.method2363(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "()Z", line = 121)
    public final boolean method2367() {
        int var1 = this.field5870.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5870[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "()V", line = 134)
    public static void method2368() {
        field5865 = null;
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "()Z", line = 137)
    public final boolean method2369() {
        return this.field5866.field1316 != null;
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "()V", line = 142)
    public final void method2370() {
        this.field5866.field1301 = -1;
    }

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "()V", line = 145)
    public final void method2371() {
        this.field5866.field1316 = null;
        this.field5868 = null;
        this.field5870 = null;
        this.field5873 = null;
        this.field5869 = null;
    }

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "()I", line = 155)
    public final int method2372() {
        int var1 = this.field5870.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5870[var4] >= 0 && this.field5873[var4] < var3) {
                var2 = var4;
                var3 = this.field5873[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "()I", line = 182)
    public final int method2373() {
        return this.field5870.length;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V", line = 264)
    public class415() {
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "([B)V", line = 266)
    public class415(byte[] arg0) {
        this.method2374(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([B)V", line = 189)
    public final void method2374(byte[] arg0) {
        this.field5866.field1316 = arg0;
        this.field5866.field1301 = 10;
        int var2 = this.field5866.method743((byte) -39);
        this.field5867 = this.field5866.method743((byte) -23);
        this.field5871 = 500000;
        this.field5868 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5866.method714(false);
            int var6 = this.field5866.method714(false);
            if (var5 == 1297379947) {
                this.field5868[var3] = this.field5866.field1301;
                var3++;
            }
            this.field5866.field1301 += var6;
        }
        this.field5872 = 0L;
        this.field5870 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5870[var4] = this.field5868[var4];
        }
        this.field5873 = new int[var2];
        this.field5869 = new int[var2];
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V", line = 242)
    public final void method2375(int arg0) {
        this.field5866.field1301 = this.field5870[arg0];
    }

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "(I)J", line = 245)
    public final long method2376(int arg0) {
        return (long) this.field5871 * (long) arg0 + this.field5872;
    }

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "(I)V", line = 249)
    public final void method2377(int arg0) {
        this.field5870[arg0] = this.field5866.field1301;
    }
}
