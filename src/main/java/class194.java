import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class194 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lce;")
    private class26 field3873 = new class26(null);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[B")
    private static byte[] field3874 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "J")
    private long field3877;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
    private int[] field3875;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    public int[] field3876;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    private int[] field3879;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
    private int[] field3880;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
    public final void method1266() {
        this.field3873.field527 = -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method1267(int arg0) {
        this.field3873.field527 = this.field3879[arg0];
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()Z")
    public final boolean method1268() {
        return this.field3873.field529 != null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(J)V")
    public final void method1269(long arg0) {
        this.field3877 = arg0;
        int var3 = this.field3879.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3876[var4] = 0;
            this.field3875[var4] = 0;
            this.field3873.field527 = this.field3880[var4];
            this.method1273(var4);
            this.field3879[var4] = this.field3873.field527;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()I")
    public final int method1270() {
        int var1 = this.field3879.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3879[var4] >= 0 && this.field3876[var4] < var3) {
                var2 = var4;
                var3 = this.field3876[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([B)V")
    public final void method1271(byte[] arg0) {
        this.field3873.field529 = arg0;
        this.field3873.field527 = 10;
        int var2 = this.field3873.method256((byte) -78);
        this.field3878 = this.field3873.method256((byte) -78);
        this.field3881 = 500000;
        this.field3880 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3873.method240(8);
            int var6 = this.field3873.method240(8);
            if (var5 == 1297379947) {
                this.field3880[var3] = this.field3873.field527;
                var3++;
            }
            this.field3873.field527 += var6;
        }
        this.field3877 = 0L;
        this.field3879 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3879[var4] = this.field3880[var4];
        }
        this.field3876 = new int[var2];
        this.field3875 = new int[var2];
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
    public final void method1272() {
        this.field3873.field529 = null;
        this.field3880 = null;
        this.field3879 = null;
        this.field3876 = null;
        this.field3875 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method1273(int arg0) {
        int var2 = this.field3873.method242(106);
        this.field3876[arg0] += var2;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
    public final int method1274(int arg0) {
        return this.method1280(arg0);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public final void method1275(int arg0) {
        this.field3879[arg0] = this.field3873.field527;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()I")
    public final int method1276() {
        return this.field3879.length;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    private final int method1277(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3874[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3873.method221(-79) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3873.method221(-101) << 16;
            }
            return var8;
        }
        int var3 = this.field3873.method221(-115);
        int var4 = this.field3873.method242(74);
        if (var3 == 47) {
            this.field3873.field527 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3873.method232(58);
            var4 -= 3;
            int var6 = this.field3876[arg0];
            this.field3877 += (long) (this.field3881 - var5) * (long) var6;
            this.field3881 = var5;
            this.field3873.field527 += var4;
            return 2;
        } else {
            this.field3873.field527 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "()Z")
    public final boolean method1278() {
        int var1 = this.field3879.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3879[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "()V")
    public static void method1279() {
        field3874 = null;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
    private final int method1280(int arg0) {
        byte var2 = this.field3873.field529[this.field3873.field527];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3875[arg0] = var3;
            this.field3873.field527++;
        } else {
            var3 = this.field3875[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1277(arg0, var3);
        }
        int var4 = this.field3873.method242(-126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3873.field529[this.field3873.field527] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3873.field527++;
                this.field3875[arg0] = var5;
                return this.method1277(arg0, var5);
            }
        }
        this.field3873.field527 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)J")
    public final long method1281(int arg0) {
        return (long) this.field3881 * (long) arg0 + this.field3877;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "([B)V")
    public class194(byte[] arg0) {
        this.method1271(arg0);
    }
}
