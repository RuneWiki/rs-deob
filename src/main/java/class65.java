import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class class65 extends class504 {

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "F")
    public float field987;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Lbo;")
    public static class684 field991;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I", line = 5)
    public final int method514(int arg0) {
        field996++;
        if (arg0 < 71) {
            this.field998 = -76;
        }
        return this.field990;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I", line = 17)
    public final int method515(byte arg0) {
        field997++;
        return arg0 <= 99 ? -34 : this.field1000;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I", line = 33)
    public final int method516(int arg0) {
        if (arg0 != -18736) {
            this.method514(-85);
        }
        field986++;
        return this.field998;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZI)Z", line = 44)
    public static final boolean method517(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field991 = null;
        }
        field992++;
        return class310.method1853(arg2, arg0, (byte) -50) || class145.method1049(arg2, arg0, -24087);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)I", line = 55)
    public final int method518(byte arg0) {
        int var2 = 23 / ((-arg0 - 63) / 33);
        field989++;
        return this.field994;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)F", line = 65)
    public final float method519(boolean arg0) {
        if (!arg0) {
            this.method524((byte) -59, 105, 101, 95);
        }
        field1002++;
        return this.field987;
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V", line = 77)
    public static final void method520(byte arg0) {
        if (arg0 < 36) {
            method521(-34);
        }
        field1001++;
        if (class139.field2251 == 6) {
            class139.field2251 = 7;
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V", line = 93)
    public static void method521(int arg0) {
        if (arg0 != 7) {
            method523(-57, -83, (byte) -95);
        }
        field991 = null;
    }

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I", line = 103)
    public final int method522(int arg0) {
        int var2 = -9 / ((22 - arg0) / 58);
        field993++;
        return this.field999;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)Z", line = 114)
    public static final boolean method523(int arg0, int arg1, byte arg2) {
        field988++;
        int var3 = -89 / ((8 - arg2) / 61);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIIIF)V", line = 134)
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field999 = arg3;
        this.field998 = arg1;
        this.field990 = arg4;
        this.field1000 = arg0;
        this.field994 = arg2;
        this.field987 = arg5;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(FIFF)I", line = 148)
    public static final int method526(float arg0, int arg1, float arg2, float arg3) {
        field995++;
        if (arg1 != 3) {
            field991 = null;
        }
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if (arg2 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BIII)V")
    public abstract void method524(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(FB)V")
    public abstract void method525(float arg0, byte arg1);
}
