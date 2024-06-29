import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class131 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lbf;")
    private class14 field3143 = new class14(null);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[B")
    private static byte[] field3142 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    private int field3146;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "J")
    private long field3144;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[I")
    public int[] field3145;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "[I")
    private int[] field3147;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
    private int[] field3149;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    private int[] field3150;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()I")
    public final int method1067() {
        int var1 = this.field3150.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3150[var4] >= 0 && this.field3145[var4] < var3) {
                var2 = var4;
                var3 = this.field3145[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)J")
    public final long method1068(int arg0) {
        return (long) this.field3146 * (long) arg0 + this.field3144;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public final void method1069(int arg0) {
        this.field3143.field314 = this.field3150[arg0];
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(J)V")
    public final void method1070(long arg0) {
        this.field3144 = arg0;
        int var3 = this.field3150.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3145[var4] = 0;
            this.field3147[var4] = 0;
            this.field3143.field314 = this.field3149[var4];
            this.method1071(var4);
            this.field3150[var4] = this.field3143.field314;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public final void method1071(int arg0) {
        int var2 = this.field3143.method152(-112);
        this.field3145[arg0] += var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([B)V")
    public final void method1072(byte[] arg0) {
        this.field3143.field326 = arg0;
        this.field3143.field314 = 10;
        int var2 = this.field3143.method138((byte) 104);
        this.field3148 = this.field3143.method138((byte) 108);
        this.field3146 = 500000;
        this.field3149 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3143.method121((byte) -122);
            int var6 = this.field3143.method121((byte) 112);
            if (var5 == 1297379947) {
                this.field3149[var3] = this.field3143.field314;
                var3++;
            }
            this.field3143.field314 += var6;
        }
        this.field3144 = 0L;
        this.field3150 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3150[var4] = this.field3149[var4];
        }
        this.field3145 = new int[var2];
        this.field3147 = new int[var2];
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public final int method1073() {
        return this.field3150.length;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
    public final void method1074() {
        this.field3143.field326 = null;
        this.field3149 = null;
        this.field3150 = null;
        this.field3145 = null;
        this.field3147 = null;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
    private final int method1075(int arg0) {
        byte var2 = this.field3143.field326[this.field3143.field314];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3147[arg0] = var3;
            this.field3143.field314++;
        } else {
            var3 = this.field3147[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1079(arg0, var3);
        }
        int var4 = this.field3143.method152(-95);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3143.field326[this.field3143.field314] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3143.field314++;
                this.field3147[arg0] = var5;
                return this.method1079(arg0, var5);
            }
        }
        this.field3143.field314 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public final void method1076(int arg0) {
        this.field3150[arg0] = this.field3143.field314;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()Z")
    public final boolean method1077() {
        return this.field3143.field326 != null;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "()Z")
    public final boolean method1078() {
        int var1 = this.field3150.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3150[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
    private final int method1079(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3142[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3143.method153(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3143.method153(true) << 16;
            }
            return var8;
        }
        int var3 = this.field3143.method153(true);
        int var4 = this.field3143.method152(-95);
        if (var3 == 47) {
            this.field3143.field314 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3143.method122(17260);
            var4 -= 3;
            int var6 = this.field3145[arg0];
            this.field3144 += (long) (this.field3146 - var5) * (long) var6;
            this.field3146 = var5;
            this.field3143.field314 += var4;
            return 2;
        } else {
            this.field3143.field314 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "()V")
    public static void method1080() {
        field3142 = null;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I")
    public final int method1081(int arg0) {
        return this.method1075(arg0);
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "()V")
    public final void method1082() {
        this.field3143.field314 = -1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
    public class131(byte[] arg0) {
        this.method1072(arg0);
    }
}
