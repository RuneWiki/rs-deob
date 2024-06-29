import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class311 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lag;")
    private class202 field4722 = new class202((byte[]) null);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[B")
    private static byte[] field4721 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "J")
    private long field4724;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    private int[] field4723;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
    public int[] field4725;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[I")
    private int[] field4726;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[I")
    private int[] field4729;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([B)V", line = 3)
    public final void method2088(byte[] arg0) {
        this.field4722.field3273 = arg0;
        this.field4722.field3249 = 10;
        int var2 = this.field4722.method1315(14289);
        this.field4727 = this.field4722.method1315(14289);
        this.field4728 = 500000;
        this.field4729 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4722.method1346(-128);
            int var5 = this.field4722.method1346(77);
            if (var4 == 1297379947) {
                this.field4729[var3] = this.field4722.field3249;
                var3++;
            }
            this.field4722.field3249 += var5;
        }
        this.field4724 = 0L;
        this.field4726 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4726[var6] = this.field4729[var6];
        }
        this.field4725 = new int[var2];
        this.field4723 = new int[var2];
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 60)
    public final void method2089(int arg0) {
        this.field4722.field3249 = this.field4726[arg0];
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I", line = 64)
    public final int method2090(int arg0) {
        return this.method2096(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 71)
    public final void method2091(int arg0) {
        int var2 = this.field4722.method1295((byte) -117);
        this.field4725[arg0] += var2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V", line = 77)
    public final void method2092() {
        this.field4722.field3249 = -1;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()Z", line = 81)
    public final boolean method2093() {
        int var1 = this.field4726.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4726[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()I", line = 94)
    public final int method2094() {
        return this.field4726.length;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "()V", line = 98)
    public static void method2095() {
        field4721 = null;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I", line = 102)
    private final int method2096(int arg0) {
        byte var2 = this.field4722.field3273[this.field4722.field3249];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4723[arg0] = var3;
            this.field4722.field3249++;
        } else {
            var3 = this.field4723[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2099(arg0, var3);
        }
        int var4 = this.field4722.method1295((byte) -117);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4722.field3273[this.field4722.field3249] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4722.field3249++;
                this.field4723[arg0] = var5;
                return this.method2099(arg0, var5);
            }
        }
        this.field4722.field3249 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "()I", line = 141)
    public final int method2097() {
        int var1 = this.field4726.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4726[var4] >= 0 && this.field4725[var4] < var3) {
                var2 = var4;
                var3 = this.field4725[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V", line = 166)
    public final void method2098(int arg0) {
        this.field4726[arg0] = this.field4722.field3249;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I", line = 171)
    private final int method2099(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4721[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4722.method1317((byte) -116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4722.method1317((byte) -114) << 16;
            }
            return var8;
        }
        int var3 = this.field4722.method1317((byte) -71);
        int var4 = this.field4722.method1295((byte) -117);
        if (var3 == 47) {
            this.field4722.field3249 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4722.method1352((byte) 121);
            var4 -= 3;
            int var6 = this.field4725[arg0];
            this.field4724 += (long) (this.field4728 - var5) * (long) var6;
            this.field4728 = var5;
            this.field4722.field3249 += var4;
            return 2;
        } else {
            this.field4722.field3249 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "()V", line = 213)
    public final void method2100() {
        this.field4722.field3273 = null;
        this.field4729 = null;
        this.field4726 = null;
        this.field4725 = null;
        this.field4723 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 258)
    public class311() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V", line = 263)
    public class311(byte[] arg0) {
        this.method2088(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(J)V", line = 230)
    public final void method2101(long arg0) {
        this.field4724 = arg0;
        int var3 = this.field4726.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4725[var4] = 0;
            this.field4723[var4] = 0;
            this.field4722.field3249 = this.field4729[var4];
            this.method2091(var4);
            this.field4726[var4] = this.field4722.field3249;
        }
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "()Z", line = 250)
    public final boolean method2102() {
        return this.field4722.field3273 != null;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)J", line = 261)
    public final long method2103(int arg0) {
        return (long) this.field4728 * (long) arg0 + this.field4724;
    }
}
