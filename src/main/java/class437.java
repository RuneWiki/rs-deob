import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class437 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Lig;")
    private class244 field6358 = new class244(null);

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "[B")
    private static byte[] field6360 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    private int field6364;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "J")
    private long field6365;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "[I")
    private int[] field6359;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "[I")
    private int[] field6361;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    public int[] field6362;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "[I")
    private int[] field6363;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 5)
    public final void method2722(int arg0) {
        this.field6358.field2903 = this.field6363[arg0];
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V", line = 8)
    public static void method2723() {
        field6360 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()I", line = 11)
    public final int method2724() {
        return this.field6363.length;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "()V", line = 18)
    public final void method2725() {
        this.field6358.field2903 = -1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(J)V", line = 21)
    public final void method2726(long arg0) {
        this.field6365 = arg0;
        int var3 = this.field6363.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6362[var4] = 0;
            this.field6359[var4] = 0;
            this.field6358.field2903 = this.field6361[var4];
            this.method2731(var4);
            this.field6363[var4] = this.field6358.field2903;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "()Z", line = 41)
    public final boolean method2727() {
        return this.field6358.field2912 != null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I", line = 45)
    private final int method2728(int arg0) {
        byte var2 = this.field6358.field2912[this.field6358.field2903];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6359[arg0] = var3;
            this.field6358.field2903++;
        } else {
            var3 = this.field6359[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2736(arg0, var3);
        }
        int var4 = this.field6358.method1478(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6358.field2912[this.field6358.field2903] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6358.field2903++;
                this.field6359[arg0] = var5;
                return this.method2736(arg0, var5);
            }
        }
        this.field6358.field2903 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([B)V", line = 83)
    public final void method2729(byte[] arg0) {
        this.field6358.field2912 = arg0;
        this.field6358.field2903 = 10;
        int var2 = this.field6358.method1476(-102);
        this.field6366 = this.field6358.method1476(-72);
        this.field6364 = 500000;
        this.field6361 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6358.method1438(91);
            int var6 = this.field6358.method1438(117);
            if (var5 == 1297379947) {
                this.field6361[var3] = this.field6358.field2903;
                var3++;
            }
            this.field6358.field2903 += var6;
        }
        this.field6365 = 0L;
        this.field6363 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6363[var4] = this.field6361[var4];
        }
        this.field6362 = new int[var2];
        this.field6359 = new int[var2];
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "()I", line = 137)
    public final int method2730() {
        int var1 = this.field6363.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6363[var4] >= 0 && this.field6362[var4] < var3) {
                var2 = var4;
                var3 = this.field6362[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V", line = 166)
    public final void method2731(int arg0) {
        int var2 = this.field6358.method1478(0);
        this.field6362[arg0] += var2;
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)J", line = 171)
    public final long method2732(int arg0) {
        return (long) this.field6364 * (long) arg0 + this.field6365;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 264)
    public class437() {
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "([B)V", line = 266)
    public class437(byte[] arg0) {
        this.method2729(arg0);
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "()Z", line = 178)
    public final boolean method2733() {
        int var1 = this.field6363.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6363[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V", line = 191)
    public final void method2734(int arg0) {
        this.field6363[arg0] = this.field6358.field2903;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "()V", line = 199)
    public final void method2735() {
        this.field6358.field2912 = null;
        this.field6361 = null;
        this.field6363 = null;
        this.field6362 = null;
        this.field6359 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I", line = 210)
    private final int method2736(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6360[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6358.method1423(-42) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6358.method1423(-119) << 16;
            }
            return var8;
        }
        int var3 = this.field6358.method1423(-93);
        int var4 = this.field6358.method1478(0);
        if (var3 == 47) {
            this.field6358.field2903 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6358.method1458((byte) -95);
            var4 -= 3;
            int var6 = this.field6362[arg0];
            this.field6365 += (long) (this.field6364 - var5) * (long) var6;
            this.field6364 = var5;
            this.field6358.field2903 += var4;
            return 2;
        } else {
            this.field6358.field2903 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)I", line = 255)
    public final int method2737(int arg0) {
        return this.method2728(arg0);
    }
}
