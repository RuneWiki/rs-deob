import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lmt;")
    private class271 field241 = new class271();

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lwf;")
    private class88 field245 = new class88();

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lwa;")
    private class433 field246;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public static boolean field236 = false;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Llt;")
    public static class475 field238 = new class475("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[F")
    public static float[] field250 = new float[16384];

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "[F")
    public static float[] field249 = new float[16384];

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lwa;")
    public static class433 field251;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lno;")
    public static class494 field252;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
    public static boolean field239;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field250[var2] = (float) Math.sin((double) var2 * var0);
            field249[var2] = (float) Math.cos((double) var2 * var0);
        }
        field251 = new class433(8);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JB)Lmt;", line = 6)
    public final class271 method145(long arg0, byte arg1) {
        field240++;
        class271 var4 = (class271) this.field246.method2605(false, arg0);
        if (var4 != null) {
            this.field245.method518(0, var4);
        }
        return arg1 == -11 ? var4 : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 35)
    public static void method146(boolean arg0) {
        field252 = null;
        field251 = null;
        field250 = null;
        field238 = null;
        if (arg0) {
            method147(null, -62, -121, 84);
        }
        field249 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljd;III)V", line = 51)
    public static final void method147(class152 arg0, int arg1, int arg2, int arg3) {
        long var4 = class9.field123[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field2259 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field2265[arg0.field2259++] = class517.field7540[var8 - 1].field6301;
            var6 += 16L;
        }
        for (int var9 = arg0.field2259; var9 < 4; var9++) {
            arg0.field2265[var9] = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)I", line = 81)
    public static final int method148(byte arg0, int arg1, int arg2) {
        field235++;
        if (arg0 <= 68) {
            field252 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 103)
    public final void method149(int arg0) {
        if (arg0 != 12965) {
            this.field246 = null;
        }
        field244++;
        this.field245.method512(2);
        this.field246.method2601(-21859);
        this.field241 = new class271();
        this.field248 = this.field247;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ldt;B)Z", line = 128)
    public static final boolean method150(class158 arg0, byte arg1) {
        field242++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -120 / ((arg1 - 64) / 38);
        if (!arg0.field2331) {
            return false;
        } else if (!arg0.method1011(123, class460.field6798)) {
            return false;
        } else if (field251.method2605(false, (long) arg0.field2322) == null) {
            return class91.field1371.method2605(false, (long) arg0.field2319) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILmt;J)V", line = 155)
    public final void method151(int arg0, class271 arg1, long arg2) {
        if (this.field248 == 0) {
            class271 var5 = this.field245.method511(119);
            var5.method2049(-111);
            var5.method1783((byte) -126);
            if (this.field241 == var5) {
                class271 var6 = this.field245.method511(77);
                var6.method2049(arg0 - 119);
                var6.method1783((byte) -75);
            }
        } else {
            this.field248--;
        }
        field243++;
        this.field246.method2606(arg1, arg2, arg0);
        this.field245.method518(0, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V", line = 197)
    public class23(int arg0) {
        this.field247 = arg0;
        this.field248 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field246 = new class433(var2);
    }
}
