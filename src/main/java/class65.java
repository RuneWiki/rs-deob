import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class65 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lhd;")
    private class68 field1411 = new class68(null);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[B")
    private static byte[] field1414 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
    private long field1418;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    private int[] field1412;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    private int[] field1413;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public int[] field1416;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    private int[] field1417;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method538(int arg0) {
        this.field1412[arg0] = this.field1411.field1454;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public static void method539() {
        field1414 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public final boolean method540() {
        int var1 = this.field1412.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1412[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public final void method541() {
        this.field1411.field1454 = -1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(J)V")
    public final void method542(long arg0) {
        this.field1418 = arg0;
        int var3 = this.field1412.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1416[var4] = 0;
            this.field1417[var4] = 0;
            this.field1411.field1454 = this.field1413[var4];
            this.method549(var4);
            this.field1412[var4] = this.field1411.field1454;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public final boolean method543() {
        return this.field1411.field1495 != null;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
    public final int method544() {
        int var1 = this.field1412.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1412[var4] >= 0 && this.field1416[var4] < var3) {
                var2 = var4;
                var3 = this.field1416[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public final void method545() {
        this.field1411.field1495 = null;
        this.field1413 = null;
        this.field1412 = null;
        this.field1416 = null;
        this.field1417 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B)V")
    public final void method546(byte[] arg0) {
        this.field1411.field1495 = arg0;
        this.field1411.field1454 = 10;
        int var2 = this.field1411.method569(26496);
        this.field1415 = this.field1411.method569(26496);
        this.field1419 = 500000;
        this.field1413 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1411.method599((byte) 96);
            int var6 = this.field1411.method599((byte) 96);
            if (var5 == 1297379947) {
                this.field1413[var3] = this.field1411.field1454;
                var3++;
            }
            this.field1411.field1454 += var6;
        }
        this.field1418 = 0L;
        this.field1412 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1412[var4] = this.field1413[var4];
        }
        this.field1416 = new int[var2];
        this.field1417 = new int[var2];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    private final int method547(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1414[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1411.method604((byte) -124) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1411.method604((byte) 108) << 16;
            }
            return var8;
        }
        int var3 = this.field1411.method604((byte) -124);
        int var4 = this.field1411.method578(-1);
        if (var3 == 47) {
            this.field1411.field1454 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1411.method613(true);
            var4 -= 3;
            int var6 = this.field1416[arg0];
            this.field1418 += (long) (this.field1419 - var5) * (long) var6;
            this.field1419 = var5;
            this.field1411.field1454 += var4;
            return 2;
        } else {
            this.field1411.field1454 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
    public final int method548(int arg0) {
        return this.method552(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public final void method549(int arg0) {
        int var2 = this.field1411.method578(-1);
        this.field1416[arg0] += var2;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()I")
    public final int method550() {
        return this.field1412.length;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)J")
    public final long method551(int arg0) {
        return (long) this.field1419 * (long) arg0 + this.field1418;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
    private final int method552(int arg0) {
        byte var2 = this.field1411.field1495[this.field1411.field1454];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1417[arg0] = var3;
            this.field1411.field1454++;
        } else {
            var3 = this.field1417[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method547(arg0, var3);
        }
        int var4 = this.field1411.method578(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1411.field1495[this.field1411.field1454] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1411.field1454++;
                this.field1417[arg0] = var5;
                return this.method547(arg0, var5);
            }
        }
        this.field1411.field1454 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public final void method553(int arg0) {
        this.field1411.field1454 = this.field1412[arg0];
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class65() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
    public class65(byte[] arg0) {
        this.method546(arg0);
    }
}
