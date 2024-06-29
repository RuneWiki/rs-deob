import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 extends class17 {

    @OriginalMember(owner = "mapview!k", name = "y", descriptor = "[J")
    private long[] field185 = new long[10];

    @OriginalMember(owner = "mapview!k", name = "v", descriptor = "I")
    private int field182 = 0;

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "I")
    private int field176 = 256;

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "I")
    private int field179 = 1;

    @OriginalMember(owner = "mapview!k", name = "x", descriptor = "J")
    private long field184 = class7.method45(-123);

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "Lua;")
    public static class41 field173 = class16.method86("Next page", true);

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Lua;")
    public static class41 field174 = class16.method86("floorcol)3dat", true);

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "Lua;")
    public static class41 field180 = class16.method86("Furnace", true);

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "Lua;")
    public static class41 field178 = class16.method86("Mining Shop", true);

    @OriginalMember(owner = "mapview!k", name = "w", descriptor = "Lua;")
    public static class41 field183 = class16.method86("Next page", true);

    @OriginalMember(owner = "mapview!k", name = "z", descriptor = "Lua;")
    public static class41 field186 = class16.method86("world", true);

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "[I")
    public static int[] field175;

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "[I")
    public static int[] field177;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 11)
    public static void method109(int arg0) {
        field173 = null;
        field175 = null;
        field174 = null;
        if (arg0 != 255) {
            method109(-73);
        }
        field177 = null;
        field183 = null;
        field186 = null;
        field178 = null;
        field180 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ZII)I", line = 29)
    public final int method89(boolean arg0, int arg1, int arg2) {
        int var4 = this.field176;
        this.field176 = 300;
        int var5 = this.field179;
        this.field179 = 1;
        this.field184 = class7.method45(-68);
        if (this.field185[this.field172] == 0L) {
            this.field179 = var5;
            this.field176 = var4;
        } else if (this.field184 > this.field185[this.field172]) {
            this.field176 = (int) ((long) (arg2 * 2560) / (this.field184 - this.field185[this.field172]));
        }
        if (this.field176 < 25) {
            this.field176 = 25;
        }
        if (!arg0) {
            method109(-21);
        }
        if (this.field176 > 256) {
            this.field176 = 256;
            this.field179 = (int) ((long) arg2 - (this.field184 - this.field185[this.field172]) / 10L);
        }
        if (arg2 < this.field179) {
            this.field179 = arg2;
        }
        this.field185[this.field172] = this.field184;
        this.field172 = (this.field172 + 1) % 10;
        if (this.field179 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field185[var6] != 0L) {
                    this.field185[var6] += this.field179;
                }
            }
        }
        int var7 = 0;
        if (this.field179 < arg1) {
            this.field179 = arg1;
        }
        class42.method249(-128, (long) this.field179);
        while (this.field182 < 256) {
            var7++;
            this.field182 += this.field176;
        }
        this.field182 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IZ)Lua;", line = 111)
    public static final class41 method110(int arg0, boolean arg1) {
        if (!arg1) {
            field177 = null;
        }
        return class1.method3(arg0, false, 10, (byte) -95);
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "()V", line = 166)
    public class20() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field185[var1] = this.field184;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lua;Lua;Lw;Z)[Lj;", line = 195)
    public static final class18[] method111(class41 arg0, class41 arg1, class43 arg2, boolean arg3) {
        int var4 = arg2.method256(arg0, -34);
        if (arg3) {
            int var5 = arg2.method264(arg1, 868, var4);
            return class43.method262(arg2, var4, 107, var5);
        } else {
            return (class18[]) null;
        }
    }
}
