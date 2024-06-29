import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lka;")
    private class109 field406 = new class109(null);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[B")
    private static byte[] field407 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
    private long field408;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public int[] field410;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    private int[] field411;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
    public final int method126() {
        return this.field411.length;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.field406.field2053 = this.field411[arg0];
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
    public final void method128() {
        this.field406.field2053 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(J)V")
    public final void method129(long arg0) {
        this.field408 = arg0;
        int var3 = this.field411.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field410[var4] = 0;
            this.field412[var4] = 0;
            this.field406.field2053 = this.field413[var4];
            this.method131(var4);
            this.field411[var4] = this.field406.field2053;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
    private final int method130(int arg0) {
        byte var2 = this.field406.field2006[this.field406.field2053];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field412[arg0] = var3;
            this.field406.field2053++;
        } else {
            var3 = this.field412[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method134(arg0, var3);
        }
        int var4 = this.field406.method664((byte) -122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field406.field2006[this.field406.field2053] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field406.field2053++;
                this.field412[arg0] = var5;
                return this.method134(arg0, var5);
            }
        }
        this.field406.field2053 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final void method131(int arg0) {
        int var2 = this.field406.method664((byte) -106);
        this.field410[arg0] += var2;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()I")
    public final int method132() {
        int var1 = this.field411.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field411[var4] >= 0 && this.field410[var4] < var3) {
                var2 = var4;
                var3 = this.field410[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)J")
    public final long method133(int arg0) {
        return (long) this.field414 * (long) arg0 + this.field408;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    private final int method134(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field407[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field406.method662((byte) -97) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field406.method662((byte) -113) << 16;
            }
            return var8;
        }
        int var3 = this.field406.method662((byte) -83);
        int var4 = this.field406.method664((byte) -88);
        if (var3 == 47) {
            this.field406.field2053 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field406.method701(869322848);
            var4 -= 3;
            int var6 = this.field410[arg0];
            this.field408 += (long) (this.field414 - var5) * (long) var6;
            this.field414 = var5;
            this.field406.field2053 += var4;
            return 2;
        } else {
            this.field406.field2053 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
    public final void method135() {
        this.field406.field2006 = null;
        this.field413 = null;
        this.field411 = null;
        this.field410 = null;
        this.field412 = null;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()Z")
    public final boolean method136() {
        return this.field406.field2006 != null;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "()V")
    public static void method137() {
        field407 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V")
    public final void method138(byte[] arg0) {
        this.field406.field2006 = arg0;
        this.field406.field2053 = 10;
        int var2 = this.field406.method675(2);
        this.field409 = this.field406.method675(2);
        this.field414 = 500000;
        this.field413 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field406.method710(28908);
            int var6 = this.field406.method710(28908);
            if (var5 == 1297379947) {
                this.field413[var3] = this.field406.field2053;
                var3++;
            }
            this.field406.field2053 += var6;
        }
        this.field408 = 0L;
        this.field411 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field411[var4] = this.field413[var4];
        }
        this.field410 = new int[var2];
        this.field412 = new int[var2];
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public final void method139(int arg0) {
        this.field411[arg0] = this.field406.field2053;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
    public final int method140(int arg0) {
        return this.method130(arg0);
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "()Z")
    public final boolean method141() {
        int var1 = this.field411.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field411[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
    public class15(byte[] arg0) {
        this.method138(arg0);
    }
}
