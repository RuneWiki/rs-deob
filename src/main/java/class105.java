import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class105 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lil;")
    private class265 field1405 = new class265((byte[]) null);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "[B")
    private static byte[] field1404 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "J")
    private long field1408;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[I")
    private int[] field1406;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
    private int[] field1410;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "[I")
    private int[] field1412;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([B)V", line = 3)
    public final void method713(byte[] arg0) {
        this.field1405.field3879 = arg0;
        this.field1405.field3915 = 10;
        int var2 = this.field1405.method1685(8104);
        this.field1411 = this.field1405.method1685(8104);
        this.field1409 = 500000;
        this.field1410 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1405.method1666(-2);
            int var6 = this.field1405.method1666(-2);
            if (var5 == 1297379947) {
                this.field1410[var3] = this.field1405.field3915;
                var3++;
            }
            this.field1405.field3915 += var6;
        }
        this.field1408 = 0L;
        this.field1412 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1412[var4] = this.field1410[var4];
        }
        this.field1407 = new int[var2];
        this.field1406 = new int[var2];
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V", line = 58)
    public final void method714() {
        this.field1405.field3879 = null;
        this.field1410 = null;
        this.field1412 = null;
        this.field1407 = null;
        this.field1406 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()V", line = 67)
    public static void method715() {
        field1404 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I", line = 70)
    private final int method716(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1404[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1405.method1697(127) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1405.method1697(-19) << 16;
            }
            return var8;
        }
        int var3 = this.field1405.method1697(-51);
        int var4 = this.field1405.method1681(true);
        if (var3 == 47) {
            this.field1405.field3915 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1405.method1691(false);
            var4 -= 3;
            int var6 = this.field1407[arg0];
            this.field1408 += (long) (this.field1409 - var5) * (long) var6;
            this.field1409 = var5;
            this.field1405.field3915 += var4;
            return 2;
        } else {
            this.field1405.field3915 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()Z", line = 115)
    public final boolean method717() {
        int var1 = this.field1412.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1412[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()V", line = 128)
    public final void method718() {
        this.field1405.field3915 = -1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)J", line = 131)
    public final long method719(int arg0) {
        return (long) this.field1409 * (long) arg0 + this.field1408;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "()Z", line = 134)
    public final boolean method720() {
        return this.field1405.field3879 != null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)I", line = 138)
    public final int method721(int arg0) {
        return this.method725(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V", line = 148)
    public final void method722(int arg0) {
        int var2 = this.field1405.method1681(true);
        this.field1407[arg0] += var2;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 152)
    public final void method723(int arg0) {
        this.field1412[arg0] = this.field1405.field3915;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "()I", line = 156)
    public final int method724() {
        return this.field1412.length;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I", line = 160)
    private final int method725(int arg0) {
        byte var2 = this.field1405.field3879[this.field1405.field3915];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1406[arg0] = var3;
            this.field1405.field3915++;
        } else {
            var3 = this.field1406[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method716(arg0, var3);
        }
        int var4 = this.field1405.method1681(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1405.field3879[this.field1405.field3915] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1405.field3915++;
                this.field1406[arg0] = var5;
                return this.method716(arg0, var5);
            }
        }
        this.field1405.field3915 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "()I", line = 199)
    public final int method726() {
        int var1 = this.field1412.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1412[var4] >= 0 && this.field1407[var4] < var3) {
                var2 = var4;
                var3 = this.field1407[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V", line = 231)
    public final void method727(int arg0) {
        this.field1405.field3915 = this.field1412[arg0];
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(J)V", line = 236)
    public final void method728(long arg0) {
        this.field1408 = arg0;
        int var3 = this.field1412.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1407[var4] = 0;
            this.field1406[var4] = 0;
            this.field1405.field3915 = this.field1410[var4];
            this.method722(var4);
            this.field1412[var4] = this.field1405.field3915;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 264)
    public class105() {
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "([B)V", line = 266)
    public class105(byte[] arg0) {
        this.method713(arg0);
    }
}
