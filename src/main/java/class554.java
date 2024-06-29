import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class554 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ljc;")
    private class711 field8070 = new class711(null);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[B")
    private static byte[] field8069 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field8073;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field8076;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
    private long field8074;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    private int[] field8071;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    private int[] field8072;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[I")
    private int[] field8075;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
    public int[] field8077;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public final void method4139(int arg0) {
        int var2 = this.field8070.method5139(false);
        this.field8077[arg0] += var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(J)V")
    public final void method4140(long arg0) {
        this.field8074 = arg0;
        int var3 = this.field8071.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field8077[var4] = 0;
            this.field8075[var4] = 0;
            this.field8070.field9945 = this.field8072[var4];
            this.method4139(var4);
            this.field8071[var4] = this.field8070.field9945;
        }
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)I")
    private final int method4141(int arg0) {
        byte var2 = this.field8070.field9996[this.field8070.field9945];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field8075[arg0] = var3;
            this.field8070.field9945++;
        } else {
            var3 = this.field8075[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4143(arg0, var3);
        }
        int var4 = this.field8070.method5139(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field8070.field9996[this.field8070.field9945] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field8070.field9945++;
                this.field8075[arg0] = var5;
                return this.method4143(arg0, var5);
            }
        }
        this.field8070.field9945 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()I")
    public final int method4142() {
        return this.field8071.length;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    private final int method4143(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field8069[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field8070.method5128(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field8070.method5128(0) << 16;
            }
            return var8;
        }
        int var3 = this.field8070.method5128(0);
        int var4 = this.field8070.method5139(false);
        if (var3 == 47) {
            this.field8070.field9945 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field8070.method5085(true);
            var4 -= 3;
            int var6 = this.field8077[arg0];
            this.field8074 += (long) (this.field8073 - var5) * (long) var6;
            this.field8073 = var5;
            this.field8070.field9945 += var4;
            return 2;
        } else {
            this.field8070.field9945 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public final void method4144(int arg0) {
        this.field8070.field9945 = this.field8071[arg0];
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "()I")
    public final int method4145() {
        int var1 = this.field8071.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field8071[var4] >= 0 && this.field8077[var4] < var3) {
                var2 = var4;
                var3 = this.field8077[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()V")
    public static void method4146() {
        field8069 = null;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z")
    public final boolean method4147() {
        return this.field8070.field9996 != null;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public final void method4148(int arg0) {
        this.field8071[arg0] = this.field8070.field9945;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public final void method4149() {
        this.field8070.field9945 = -1;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
    public final void method4150() {
        this.field8070.field9996 = null;
        this.field8072 = null;
        this.field8071 = null;
        this.field8077 = null;
        this.field8075 = null;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z")
    public final boolean method4151() {
        int var1 = this.field8071.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field8071[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)J")
    public final long method4152(int arg0) {
        return (long) this.field8073 * (long) arg0 + this.field8074;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([B)V")
    public final void method4153(byte[] arg0) {
        this.field8070.field9996 = arg0;
        this.field8070.field9945 = 10;
        int var2 = this.field8070.method5116((byte) -128);
        this.field8076 = this.field8070.method5116((byte) -107);
        this.field8073 = 500000;
        this.field8072 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field8070.method5113(18443);
            int var6 = this.field8070.method5113(18443);
            if (var5 == 1297379947) {
                this.field8072[var3] = this.field8070.field9945;
                var3++;
            }
            this.field8070.field9945 += var6;
        }
        this.field8074 = 0L;
        this.field8071 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field8071[var4] = this.field8072[var4];
        }
        this.field8077 = new int[var2];
        this.field8075 = new int[var2];
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method4154(int arg0) {
        return this.method4141(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class554() {
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([B)V")
    public class554(byte[] arg0) {
        this.method4153(arg0);
    }
}
