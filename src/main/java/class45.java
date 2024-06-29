import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lmc;")
    private class86 field833 = new class86(null);

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[B")
    private static byte[] field838 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "J")
    private long field837;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    private int[] field834;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private int[] field835;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    public int[] field836;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    private int[] field839;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    private final int method321(int arg0) {
        byte var2 = this.field833.field1920[this.field833.field1924];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field835[arg0] = var3;
            this.field833.field1924++;
        } else {
            var3 = this.field835[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method332(arg0, var3);
        }
        int var4 = this.field833.method625((byte) -123);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field833.field1920[this.field833.field1924] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field833.field1924++;
                this.field835[arg0] = var5;
                return this.method332(arg0, var5);
            }
        }
        this.field833.field1924 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
    public final boolean method322() {
        int var1 = this.field834.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field834[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(J)V")
    public final void method323(long arg0) {
        this.field837 = arg0;
        int var3 = this.field834.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field836[var4] = 0;
            this.field835[var4] = 0;
            this.field833.field1924 = this.field839[var4];
            this.method328(var4);
            this.field834[var4] = this.field833.field1924;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
    public final int method324() {
        int var1 = this.field834.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field834[var4] >= 0 && this.field836[var4] < var3) {
                var2 = var4;
                var3 = this.field836[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
    public final void method325() {
        this.field833.field1920 = null;
        this.field839 = null;
        this.field834 = null;
        this.field836 = null;
        this.field835 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
    public static void method326() {
        field838 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
    public final void method327(byte[] arg0) {
        this.field833.field1920 = arg0;
        this.field833.field1924 = 10;
        int var2 = this.field833.method632((byte) -80);
        this.field840 = this.field833.method632((byte) -80);
        this.field841 = 500000;
        this.field839 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field833.method666(1183700424);
            int var6 = this.field833.method666(1183700424);
            if (var5 == 1297379947) {
                this.field839[var3] = this.field833.field1924;
                var3++;
            }
            this.field833.field1924 += var6;
        }
        this.field837 = 0L;
        this.field834 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field834[var4] = this.field839[var4];
        }
        this.field836 = new int[var2];
        this.field835 = new int[var2];
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method328(int arg0) {
        int var2 = this.field833.method625((byte) -105);
        this.field836[arg0] += var2;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()I")
    public final int method329() {
        return this.field834.length;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method330(int arg0) {
        this.field833.field1924 = this.field834[arg0];
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
    public final void method331() {
        this.field833.field1924 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
    private final int method332(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field838[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field833.method646(-15447) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field833.method646(-15447) << 16;
            }
            return var8;
        }
        int var3 = this.field833.method646(-15447);
        int var4 = this.field833.method625((byte) -123);
        if (var3 == 47) {
            this.field833.field1924 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field833.method671(67);
            var4 -= 3;
            int var6 = this.field836[arg0];
            this.field837 += (long) (this.field841 - var5) * (long) var6;
            this.field841 = var5;
            this.field833.field1924 += var4;
            return 2;
        } else {
            this.field833.field1924 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
    public final int method333(int arg0) {
        return this.method321(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public final void method334(int arg0) {
        this.field834[arg0] = this.field833.field1924;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "()Z")
    public final boolean method335() {
        return this.field833.field1920 != null;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)J")
    public final long method336(int arg0) {
        return (long) this.field841 * (long) arg0 + this.field837;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.method327(arg0);
    }
}
