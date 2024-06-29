import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ltf;")
    private class138 field2309 = new class138(null);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[B")
    private static byte[] field2310 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "J")
    private long field2316;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    private int[] field2311;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    private int[] field2313;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    private int[] field2314;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
    public int[] field2315;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z")
    public final boolean method778() {
        return this.field2309.field3213 != null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
    public final void method779() {
        this.field2309.field3213 = null;
        this.field2313 = null;
        this.field2314 = null;
        this.field2315 = null;
        this.field2311 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
    public final int method780(int arg0) {
        return this.method789(arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([B)V")
    public final void method781(byte[] arg0) {
        this.field2309.field3213 = arg0;
        this.field2309.field3175 = 10;
        int var2 = this.field2309.method1098(true);
        this.field2312 = this.field2309.method1098(true);
        this.field2317 = 500000;
        this.field2313 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2309.method1062(1809568712);
            int var6 = this.field2309.method1062(1809568712);
            if (var5 == 1297379947) {
                this.field2313[var3] = this.field2309.field3175;
                var3++;
            }
            this.field2309.field3175 += var6;
        }
        this.field2316 = 0L;
        this.field2314 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2314[var4] = this.field2313[var4];
        }
        this.field2315 = new int[var2];
        this.field2311 = new int[var2];
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method782(int arg0) {
        this.field2314[arg0] = this.field2309.field3175;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public final void method783(int arg0) {
        this.field2309.field3175 = this.field2314[arg0];
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public final void method784(int arg0) {
        int var2 = this.field2309.method1091((byte) -45);
        this.field2315[arg0] += var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()Z")
    public final boolean method785() {
        int var1 = this.field2314.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2314[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(J)V")
    public final void method786(long arg0) {
        this.field2316 = arg0;
        int var3 = this.field2314.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2315[var4] = 0;
            this.field2311[var4] = 0;
            this.field2309.field3175 = this.field2313[var4];
            this.method784(var4);
            this.field2314[var4] = this.field2309.field3175;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)J")
    public final long method787(int arg0) {
        return (long) this.field2317 * (long) arg0 + this.field2316;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    private final int method788(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2310[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2309.method1055(118) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2309.method1055(114) << 16;
            }
            return var8;
        }
        int var3 = this.field2309.method1055(116);
        int var4 = this.field2309.method1091((byte) -45);
        if (var3 == 47) {
            this.field2309.field3175 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2309.method1088(255);
            var4 -= 3;
            int var6 = this.field2315[arg0];
            this.field2316 += (long) (this.field2317 - var5) * (long) var6;
            this.field2317 = var5;
            this.field2309.field3175 += var4;
            return 2;
        } else {
            this.field2309.field3175 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
    private final int method789(int arg0) {
        byte var2 = this.field2309.field3213[this.field2309.field3175];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2311[arg0] = var3;
            this.field2309.field3175++;
        } else {
            var3 = this.field2311[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method788(arg0, var3);
        }
        int var4 = this.field2309.method1091((byte) -45);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2309.field3213[this.field2309.field3175] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2309.field3175++;
                this.field2311[arg0] = var5;
                return this.method788(arg0, var5);
            }
        }
        this.field2309.field3175 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V")
    public static void method790() {
        field2310 = null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()I")
    public final int method791() {
        return this.field2314.length;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()V")
    public final void method792() {
        this.field2309.field3175 = -1;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "()I")
    public final int method793() {
        int var1 = this.field2314.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2314[var4] >= 0 && this.field2315[var4] < var3) {
                var2 = var4;
                var3 = this.field2315[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class109() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
    public class109(byte[] arg0) {
        this.method781(arg0);
    }
}
