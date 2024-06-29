import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class183 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lsb;")
    private class190 field2628 = new class190((byte[]) null);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[B")
    private static byte[] field2635 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field2630;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "J")
    private long field2634;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public int[] field2629;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
    private int[] field2631;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    private int[] field2632;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
    private int[] field2633;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z", line = 3)
    public final boolean method1265() {
        return this.field2628.field2718 != null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)J", line = 8)
    public final long method1266(int arg0) {
        return (long) this.field2630 * (long) arg0 + this.field2634;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V", line = 11)
    public static void method1267() {
        field2635 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([B)V", line = 14)
    public final void method1268(byte[] arg0) {
        this.field2628.field2718 = arg0;
        this.field2628.field2776 = 10;
        int var2 = this.field2628.method1317((byte) 119);
        this.field2636 = this.field2628.method1317((byte) 28);
        this.field2630 = 500000;
        this.field2631 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2628.method1371(-4);
            int var5 = this.field2628.method1371(-4);
            if (var4 == 1297379947) {
                this.field2631[var3] = this.field2628.field2776;
                var3++;
            }
            this.field2628.field2776 += var5;
        }
        this.field2634 = 0L;
        this.field2633 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2633[var6] = this.field2631[var6];
        }
        this.field2629 = new int[var2];
        this.field2632 = new int[var2];
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "()V", line = 68)
    public final void method1269() {
        this.field2628.field2718 = null;
        this.field2631 = null;
        this.field2633 = null;
        this.field2629 = null;
        this.field2632 = null;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "()Z", line = 78)
    public final boolean method1270() {
        int var1 = this.field2633.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2633[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "()V", line = 92)
    public final void method1271() {
        this.field2628.field2776 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I", line = 95)
    private final int method1272(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2635[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2628.method1319(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2628.method1319(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2628.method1319(255);
        int var4 = this.field2628.method1352(0);
        if (var3 == 47) {
            this.field2628.field2776 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2628.method1312(113);
            var4 -= 3;
            int var6 = this.field2629[arg0];
            this.field2634 += (long) (this.field2630 - var5) * (long) var6;
            this.field2630 = var5;
            this.field2628.field2776 += var4;
            return 2;
        } else {
            this.field2628.field2776 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 138)
    public final void method1273(int arg0) {
        this.field2628.field2776 = this.field2633[arg0];
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 264)
    public class183() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V", line = 266)
    public class183(byte[] arg0) {
        this.method1268(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 146)
    public final void method1274(int arg0) {
        int var2 = this.field2628.method1352(0);
        this.field2629[arg0] += var2;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "()I", line = 152)
    public final int method1275() {
        int var1 = this.field2633.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2633[var4] >= 0 && this.field2629[var4] < var3) {
                var2 = var4;
                var3 = this.field2629[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I", line = 182)
    private final int method1276(int arg0) {
        byte var2 = this.field2628.field2718[this.field2628.field2776];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2632[arg0] = var3;
            this.field2628.field2776++;
        } else {
            var3 = this.field2632[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1272(arg0, var3);
        }
        int var4 = this.field2628.method1352(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2628.field2718[this.field2628.field2776] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2628.field2776++;
                this.field2632[arg0] = var5;
                return this.method1272(arg0, var5);
            }
        }
        this.field2628.field2776 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 220)
    public final void method1277(int arg0) {
        this.field2633[arg0] = this.field2628.field2776;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(J)V", line = 223)
    public final void method1278(long arg0) {
        this.field2634 = arg0;
        int var3 = this.field2633.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2629[var4] = 0;
            this.field2632[var4] = 0;
            this.field2628.field2776 = this.field2631[var4];
            this.method1274(var4);
            this.field2633[var4] = this.field2628.field2776;
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)I", line = 244)
    public final int method1279(int arg0) {
        return this.method1276(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "()I", line = 255)
    public final int method1280() {
        return this.field2633.length;
    }
}
