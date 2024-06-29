import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class188 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lqh;")
    private class61 field3007 = new class61(null);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[B")
    private static byte[] field3013 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "J")
    private long field3009;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    private int[] field3008;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    private int[] field3010;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public int[] field3011;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    private int[] field3015;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public final void method1365() {
        this.field3007.field1393 = -1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([B)V")
    public final void method1366(byte[] arg0) {
        this.field3007.field1397 = arg0;
        this.field3007.field1393 = 10;
        int var2 = this.field3007.method723((byte) -25);
        this.field3014 = this.field3007.method723((byte) -25);
        this.field3012 = 500000;
        this.field3010 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3007.method730(89);
            int var6 = this.field3007.method730(96);
            if (var5 == 1297379947) {
                this.field3010[var3] = this.field3007.field1393;
                var3++;
            }
            this.field3007.field1393 += var6;
        }
        this.field3009 = 0L;
        this.field3015 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3015[var4] = this.field3010[var4];
        }
        this.field3011 = new int[var2];
        this.field3008 = new int[var2];
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()Z")
    public final boolean method1367() {
        return this.field3007.field1397 != null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V")
    public static void method1368() {
        field3013 = null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
    public final int method1369() {
        return this.field3015.length;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(J)V")
    public final void method1370(long arg0) {
        this.field3009 = arg0;
        int var3 = this.field3015.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3011[var4] = 0;
            this.field3008[var4] = 0;
            this.field3007.field1393 = this.field3010[var4];
            this.method1380(var4);
            this.field3015[var4] = this.field3007.field1393;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)J")
    public final long method1371(int arg0) {
        return (long) this.field3012 * (long) arg0 + this.field3009;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "()I")
    public final int method1372() {
        int var1 = this.field3015.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3015[var4] >= 0 && this.field3011[var4] < var3) {
                var2 = var4;
                var3 = this.field3011[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public final void method1373(int arg0) {
        this.field3015[arg0] = this.field3007.field1393;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I")
    private final int method1374(int arg0) {
        byte var2 = this.field3007.field1397[this.field3007.field1393];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3008[arg0] = var3;
            this.field3007.field1393++;
        } else {
            var3 = this.field3008[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1379(arg0, var3);
        }
        int var4 = this.field3007.method702(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3007.field1397[this.field3007.field1393] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3007.field1393++;
                this.field3008[arg0] = var5;
                return this.method1379(arg0, var5);
            }
        }
        this.field3007.field1393 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "()V")
    public final void method1375() {
        this.field3007.field1397 = null;
        this.field3010 = null;
        this.field3015 = null;
        this.field3011 = null;
        this.field3008 = null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
    public final int method1376(int arg0) {
        return this.method1374(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "()Z")
    public final boolean method1377() {
        int var1 = this.field3015.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3015[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public final void method1378(int arg0) {
        this.field3007.field1393 = this.field3015[arg0];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    private final int method1379(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3013[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3007.method732(-559537960) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3007.method732(-559537960) << 16;
            }
            return var8;
        }
        int var3 = this.field3007.method732(-559537960);
        int var4 = this.field3007.method702(false);
        if (var3 == 47) {
            this.field3007.field1393 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3007.method740((byte) 112);
            var4 -= 3;
            int var6 = this.field3011[arg0];
            this.field3009 += (long) (this.field3012 - var5) * (long) var6;
            this.field3012 = var5;
            this.field3007.field1393 += var4;
            return 2;
        } else {
            this.field3007.field1393 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public final void method1380(int arg0) {
        int var2 = this.field3007.method702(false);
        this.field3011[arg0] += var2;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class188() {
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        this.method1366(arg0);
    }
}
