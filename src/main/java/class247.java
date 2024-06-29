import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class247 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lnj;")
    private class226 field4301 = new class226((byte[]) null);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[B")
    private static byte[] field4302 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "J")
    private long field4306;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    private int[] field4303;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    private int[] field4305;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    private int[] field4307;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
    public int[] field4308;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
    private final int method1647(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4302[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4301.method1471(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4301.method1471(255) << 16;
            }
            return var8;
        }
        int var3 = this.field4301.method1471(255);
        int var4 = this.field4301.method1446((byte) -92);
        if (var3 == 47) {
            this.field4301.field3879 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4301.method1444(171285352);
            var4 -= 3;
            int var6 = this.field4308[arg0];
            this.field4306 += (long) (this.field4304 - var5) * (long) var6;
            this.field4304 = var5;
            this.field4301.field3879 += var4;
            return 2;
        } else {
            this.field4301.field3879 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
    public final int method1648() {
        int var1 = this.field4307.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4307[var4] >= 0 && this.field4308[var4] < var3) {
                var2 = var4;
                var3 = this.field4308[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    private final int method1649(int arg0) {
        byte var2 = this.field4301.field3901[this.field4301.field3879];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4305[arg0] = var3;
            this.field4301.field3879++;
        } else {
            var3 = this.field4305[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1647(arg0, var3);
        }
        int var4 = this.field4301.method1446((byte) -80);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4301.field3901[this.field4301.field3879] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4301.field3879++;
                this.field4305[arg0] = var5;
                return this.method1647(arg0, var5);
            }
        }
        this.field4301.field3879 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)J")
    public final long method1650(int arg0) {
        return (long) this.field4304 * (long) arg0 + this.field4306;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(J)V")
    public final void method1651(long arg0) {
        this.field4306 = arg0;
        int var3 = this.field4307.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4308[var4] = 0;
            this.field4305[var4] = 0;
            this.field4301.field3879 = this.field4303[var4];
            this.method1655(var4);
            this.field4307[var4] = this.field4301.field3879;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()Z")
    public final boolean method1652() {
        return this.field4301.field3901 != null;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final void method1653(int arg0) {
        this.field4301.field3879 = this.field4307[arg0];
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
    public final void method1654() {
        this.field4301.field3879 = -1;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method1655(int arg0) {
        int var2 = this.field4301.method1446((byte) -85);
        this.field4308[arg0] += var2;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()V")
    public static void method1656() {
        field4302 = null;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I")
    public final int method1657(int arg0) {
        return this.method1649(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "()V")
    public final void method1658() {
        this.field4301.field3901 = null;
        this.field4303 = null;
        this.field4307 = null;
        this.field4308 = null;
        this.field4305 = null;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "()I")
    public final int method1659() {
        return this.field4307.length;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "()Z")
    public final boolean method1660() {
        int var1 = this.field4307.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4307[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public final void method1661(int arg0) {
        this.field4307[arg0] = this.field4301.field3879;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V")
    public final void method1662(byte[] arg0) {
        this.field4301.field3901 = arg0;
        this.field4301.field3879 = 10;
        int var2 = this.field4301.method1447(0);
        this.field4309 = this.field4301.method1447(0);
        this.field4304 = 500000;
        this.field4303 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4301.method1478(-32053);
            int var6 = this.field4301.method1478(-32053);
            if (var5 == 1297379947) {
                this.field4303[var3] = this.field4301.field3879;
                var3++;
            }
            this.field4301.field3879 += var6;
        }
        this.field4306 = 0L;
        this.field4307 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4307[var4] = this.field4303[var4];
        }
        this.field4308 = new int[var2];
        this.field4305 = new int[var2];
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class247() {
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
    public class247(byte[] arg0) {
        this.method1662(arg0);
    }
}
