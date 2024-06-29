import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class340 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lsl;")
    private class461 field4298 = new class461(null);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[B")
    private static byte[] field4299 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "J")
    private long field4303;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    private int[] field4301;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private int[] field4302;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    private int[] field4304;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public int[] field4305;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
    private final int method1954(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4299[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4298.method2600((byte) -128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4298.method2600((byte) -127) << 16;
            }
            return var8;
        }
        int var3 = this.field4298.method2600((byte) -123);
        int var4 = this.field4298.method2609(514710565);
        if (var3 == 47) {
            this.field4298.field6193 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4298.method2576((byte) 39);
            var4 -= 3;
            int var6 = this.field4305[arg0];
            this.field4303 += (long) (this.field4306 - var5) * (long) var6;
            this.field4306 = var5;
            this.field4298.field6193 += var4;
            return 2;
        } else {
            this.field4298.field6193 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(J)V")
    public final void method1955(long arg0) {
        this.field4303 = arg0;
        int var3 = this.field4302.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4305[var4] = 0;
            this.field4304[var4] = 0;
            this.field4298.field6193 = this.field4301[var4];
            this.method1963(var4);
            this.field4302[var4] = this.field4298.field6193;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
    public final long method1956(int arg0) {
        return (long) this.field4306 * (long) arg0 + this.field4303;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public static void method1957() {
        field4299 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method1958(int arg0) {
        this.field4298.field6193 = this.field4302[arg0];
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()Z")
    public final boolean method1959() {
        return this.field4298.field6180 != null;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
    public final int method1960() {
        int var1 = this.field4302.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4302[var4] >= 0 && this.field4305[var4] < var3) {
                var2 = var4;
                var3 = this.field4305[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final void method1961(int arg0) {
        this.field4302[arg0] = this.field4298.field6193;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
    public final int method1962(int arg0) {
        return this.method1969(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public final void method1963(int arg0) {
        int var2 = this.field4298.method2609(514710565);
        this.field4305[arg0] += var2;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
    public final void method1964() {
        this.field4298.field6180 = null;
        this.field4301 = null;
        this.field4302 = null;
        this.field4305 = null;
        this.field4304 = null;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()I")
    public final int method1965() {
        return this.field4302.length;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V")
    public final void method1966(byte[] arg0) {
        this.field4298.field6180 = arg0;
        this.field4298.field6193 = 10;
        int var2 = this.field4298.method2566(-2);
        this.field4300 = this.field4298.method2566(-2);
        this.field4306 = 500000;
        this.field4301 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4298.method2622(-539564808);
            int var6 = this.field4298.method2622(-539564808);
            if (var5 == 1297379947) {
                this.field4301[var3] = this.field4298.field6193;
                var3++;
            }
            this.field4298.field6193 += var6;
        }
        this.field4303 = 0L;
        this.field4302 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4302[var4] = this.field4301[var4];
        }
        this.field4305 = new int[var2];
        this.field4304 = new int[var2];
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()V")
    public final void method1967() {
        this.field4298.field6193 = -1;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "()Z")
    public final boolean method1968() {
        int var1 = this.field4302.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4302[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
    private final int method1969(int arg0) {
        byte var2 = this.field4298.field6180[this.field4298.field6193];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4304[arg0] = var3;
            this.field4298.field6193++;
        } else {
            var3 = this.field4304[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1954(arg0, var3);
        }
        int var4 = this.field4298.method2609(514710565);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4298.field6180[this.field4298.field6193] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4298.field6193++;
                this.field4304[arg0] = var5;
                return this.method1954(arg0, var5);
            }
        }
        this.field4298.field6193 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class340() {
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
    public class340(byte[] arg0) {
        this.method1966(arg0);
    }
}
