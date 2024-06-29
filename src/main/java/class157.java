import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class157 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lnj;")
    private class164 field2038 = new class164(null);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[B")
    private static byte[] field2037 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    private int field2042;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "J")
    private long field2045;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
    private int[] field2040;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private int[] field2041;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    private int[] field2043;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I", line = 3)
    private final int method1010(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2037[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2038.method1087(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2038.method1087(false) << 16;
            }
            return var8;
        }
        int var3 = this.field2038.method1087(false);
        int var4 = this.field2038.method1069(-5316);
        if (var3 == 47) {
            this.field2038.field2185 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2038.method1090(-1);
            var4 -= 3;
            int var6 = this.field2044[arg0];
            this.field2045 += (long) (this.field2042 - var5) * (long) var6;
            this.field2042 = var5;
            this.field2038.field2185 += var4;
            return 2;
        } else {
            this.field2038.field2185 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 52)
    public final void method1011() {
        this.field2038.field2185 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Z", line = 58)
    public final boolean method1012() {
        int var1 = this.field2040.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2040[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()V", line = 72)
    public static void method1013() {
        field2037 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I", line = 76)
    public final int method1014(int arg0) {
        return this.method1021(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(J)V", line = 82)
    public final void method1015(long arg0) {
        this.field2045 = arg0;
        int var3 = this.field2040.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2044[var4] = 0;
            this.field2041[var4] = 0;
            this.field2038.field2185 = this.field2043[var4];
            this.method1016(var4);
            this.field2040[var4] = this.field2038.field2185;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 101)
    public final void method1016(int arg0) {
        int var2 = this.field2038.method1069(-5316);
        this.field2044[arg0] += var2;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()Z", line = 105)
    public final boolean method1017() {
        return this.field2038.field2219 != null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 108)
    public final void method1018(int arg0) {
        this.field2038.field2185 = this.field2040[arg0];
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()I", line = 111)
    public final int method1019() {
        return this.field2040.length;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 114)
    public final void method1020(int arg0) {
        this.field2040[arg0] = this.field2038.field2185;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 211)
    public class157() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V", line = 266)
    public class157(byte[] arg0) {
        this.method1025(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I", line = 121)
    private final int method1021(int arg0) {
        byte var2 = this.field2038.field2219[this.field2038.field2185];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2041[arg0] = var3;
            this.field2038.field2185++;
        } else {
            var3 = this.field2041[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1010(arg0, var3);
        }
        int var4 = this.field2038.method1069(-5316);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2038.field2219[this.field2038.field2185] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2038.field2185++;
                this.field2041[arg0] = var5;
                return this.method1010(arg0, var5);
            }
        }
        this.field2038.field2185 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "()I", line = 161)
    public final int method1022() {
        int var1 = this.field2040.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2040[var4] >= 0 && this.field2044[var4] < var3) {
                var2 = var4;
                var3 = this.field2044[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "()V", line = 186)
    public final void method1023() {
        this.field2038.field2219 = null;
        this.field2043 = null;
        this.field2040 = null;
        this.field2044 = null;
        this.field2041 = null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)J", line = 205)
    public final long method1024(int arg0) {
        return (long) this.field2042 * (long) arg0 + this.field2045;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([B)V", line = 214)
    public final void method1025(byte[] arg0) {
        this.field2038.field2219 = arg0;
        this.field2038.field2185 = 10;
        int var2 = this.field2038.method1074(-635989152);
        this.field2039 = this.field2038.method1074(-635989152);
        this.field2042 = 500000;
        this.field2043 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2038.method1099(-127);
            int var6 = this.field2038.method1099(-126);
            if (var5 == 1297379947) {
                this.field2043[var3] = this.field2038.field2185;
                var3++;
            }
            this.field2038.field2185 += var6;
        }
        this.field2045 = 0L;
        this.field2040 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2040[var4] = this.field2043[var4];
        }
        this.field2044 = new int[var2];
        this.field2041 = new int[var2];
    }
}
