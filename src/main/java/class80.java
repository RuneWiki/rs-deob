import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class80 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lwd;")
    private class162 field1319 = new class162((byte[]) null);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[B")
    private static byte[] field1320 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "J")
    private long field1321;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[I")
    public int[] field1322;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[I")
    private int[] field1325;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[I")
    private int[] field1326;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
    private int[] field1327;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()Z")
    public final boolean method541() {
        int var1 = this.field1325.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1325[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()V")
    public final void method542() {
        this.field1319.field2568 = -1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(J)V")
    public final void method543(long arg0) {
        this.field1321 = arg0;
        int var3 = this.field1325.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1322[var4] = 0;
            this.field1326[var4] = 0;
            this.field1319.field2568 = this.field1327[var4];
            this.method545(var4);
            this.field1325[var4] = this.field1319.field2568;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "()Z")
    public final boolean method544() {
        return this.field1319.field2573 != null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method545(int arg0) {
        int var2 = this.field1319.method1164(875128648);
        this.field1322[arg0] += var2;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
    public final int method546(int arg0) {
        return this.method556(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "()I")
    public final int method547() {
        int var1 = this.field1325.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1325[var4] >= 0 && this.field1322[var4] < var3) {
                var2 = var4;
                var3 = this.field1322[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "()V")
    public static void method548() {
        field1320 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([B)V")
    public final void method549(byte[] arg0) {
        this.field1319.field2573 = arg0;
        this.field1319.field2568 = 10;
        int var2 = this.field1319.method1142(-18970);
        this.field1324 = this.field1319.method1142(-18970);
        this.field1323 = 500000;
        this.field1327 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1319.method1157(65280);
            int var6 = this.field1319.method1157(65280);
            if (var5 == 1297379947) {
                this.field1327[var3] = this.field1319.field2568;
                var3++;
            }
            this.field1319.field2568 += var6;
        }
        this.field1321 = 0L;
        this.field1325 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1325[var4] = this.field1327[var4];
        }
        this.field1322 = new int[var2];
        this.field1326 = new int[var2];
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public final void method550(int arg0) {
        this.field1325[arg0] = this.field1319.field2568;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    private final int method551(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1320[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1319.method1133((byte) 53) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1319.method1133((byte) 53) << 16;
            }
            return var8;
        }
        int var3 = this.field1319.method1133((byte) 53);
        int var4 = this.field1319.method1164(875128648);
        if (var3 == 47) {
            this.field1319.field2568 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1319.method1137(31155);
            var4 -= 3;
            int var6 = this.field1322[arg0];
            this.field1321 += (long) (this.field1323 - var5) * (long) var6;
            this.field1323 = var5;
            this.field1319.field2568 += var4;
            return 2;
        } else {
            this.field1319.field2568 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "()V")
    public final void method552() {
        this.field1319.field2573 = null;
        this.field1327 = null;
        this.field1325 = null;
        this.field1322 = null;
        this.field1326 = null;
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "()I")
    public final int method553() {
        return this.field1325.length;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public final void method554(int arg0) {
        this.field1319.field2568 = this.field1325[arg0];
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)J")
    public final long method555(int arg0) {
        return (long) this.field1323 * (long) arg0 + this.field1321;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)I")
    private final int method556(int arg0) {
        byte var2 = this.field1319.field2573[this.field1319.field2568];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1326[arg0] = var3;
            this.field1319.field2568++;
        } else {
            var3 = this.field1326[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method551(arg0, var3);
        }
        int var4 = this.field1319.method1164(875128648);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1319.field2573[this.field1319.field2568] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1319.field2568++;
                this.field1326[arg0] = var5;
                return this.method551(arg0, var5);
            }
        }
        this.field1319.field2568 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        this.method549(arg0);
    }
}
