import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class217 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lbt;")
    private class32 field2915 = new class32((byte[]) null);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "[B")
    private static byte[] field2914 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "J")
    private long field2916;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
    public int[] field2918;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[I")
    private int[] field2919;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
    private int[] field2921;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "[I")
    private int[] field2922;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 6)
    public final void method1230(int arg0) {
        this.field2919[arg0] = this.field2915.field456;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()I", line = 11)
    public final int method1231() {
        return this.field2919.length;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "()V", line = 14)
    public final void method1232() {
        this.field2915.field456 = -1;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 18)
    public final void method1233(int arg0) {
        int var2 = this.field2915.method198((byte) -24);
        this.field2918[arg0] += var2;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "()Z", line = 24)
    public final boolean method1234() {
        int var1 = this.field2919.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2919[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "()V", line = 37)
    public static void method1235() {
        field2914 = null;
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "()I", line = 41)
    public final int method1236() {
        int var1 = this.field2919.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2919[var4] >= 0 && this.field2918[var4] < var3) {
                var2 = var4;
                var3 = this.field2918[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "()Z", line = 66)
    public final boolean method1237() {
        return this.field2915.field472 != null;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)J", line = 69)
    public final long method1238(int arg0) {
        return (long) this.field2920 * (long) arg0 + this.field2916;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I", line = 72)
    private final int method1239(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2914[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2915.method201((byte) -123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2915.method201((byte) -110) << 16;
            }
            return var8;
        }
        int var3 = this.field2915.method201((byte) -121);
        int var4 = this.field2915.method198((byte) -75);
        if (var3 == 47) {
            this.field2915.field456 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2915.method219(-121);
            var4 -= 3;
            int var6 = this.field2918[arg0];
            this.field2916 += (long) (this.field2920 - var5) * (long) var6;
            this.field2920 = var5;
            this.field2915.field456 += var4;
            return 2;
        } else {
            this.field2915.field456 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)I", line = 116)
    private final int method1240(int arg0) {
        byte var2 = this.field2915.field472[this.field2915.field456];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2921[arg0] = var3;
            this.field2915.field456++;
        } else {
            var3 = this.field2921[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1239(arg0, var3);
        }
        int var4 = this.field2915.method198((byte) -107);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2915.field472[this.field2915.field456] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2915.field456++;
                this.field2921[arg0] = var5;
                return this.method1239(arg0, var5);
            }
        }
        this.field2915.field456 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([B)V", line = 155)
    public final void method1241(byte[] arg0) {
        this.field2915.field472 = arg0;
        this.field2915.field456 = 10;
        int var2 = this.field2915.method215((byte) 114);
        this.field2917 = this.field2915.method215((byte) 118);
        this.field2920 = 500000;
        this.field2922 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2915.method222(1024);
            int var6 = this.field2915.method222(1024);
            if (var5 == 1297379947) {
                this.field2922[var3] = this.field2915.field456;
                var3++;
            }
            this.field2915.field456 += var6;
        }
        this.field2916 = 0L;
        this.field2919 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2919[var4] = this.field2922[var4];
        }
        this.field2918 = new int[var2];
        this.field2921 = new int[var2];
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(J)V", line = 210)
    public final void method1242(long arg0) {
        this.field2916 = arg0;
        int var3 = this.field2919.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2918[var4] = 0;
            this.field2921[var4] = 0;
            this.field2915.field456 = this.field2922[var4];
            this.method1233(var4);
            this.field2919[var4] = this.field2915.field456;
        }
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)I", line = 233)
    public final int method1243(int arg0) {
        return this.method1240(arg0);
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V", line = 240)
    public final void method1244(int arg0) {
        this.field2915.field456 = this.field2919[arg0];
    }

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "()V", line = 244)
    public final void method1245() {
        this.field2915.field472 = null;
        this.field2922 = null;
        this.field2919 = null;
        this.field2918 = null;
        this.field2921 = null;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 264)
    public class217() {
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V", line = 266)
    public class217(byte[] arg0) {
        this.method1241(arg0);
    }
}
