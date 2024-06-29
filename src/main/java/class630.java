import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class630 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field9209 = 0;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
    private boolean field9216 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field9218 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lcba;")
    public static class471 field9208 = new class471(11, 2);

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Lej;")
    public static class104 field9225 = new class104("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
    public static int[] field9231 = new int[8];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    private int field9210;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field9211;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field9212;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field9219;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field9220;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field9222;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field9224;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field9226;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field9227;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public int field9229;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "J")
    public long field9217;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Lfs;")
    public static class476 field9230;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[Lha;")
    public static class52[] field9214;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILdaa;I)V")
    private final void method3667(int arg0, class11 arg1, int arg2) {
        if (arg2 == 1) {
            this.field9210 = arg1.method93((byte) 103);
        } else if (arg2 == 2) {
            arg1.method110((byte) 98);
        } else if (arg2 == 3) {
            this.field9224 = arg1.method119(-106);
            this.field9226 = arg1.method119(-127);
            this.field9211 = arg1.method119(-96);
        } else if (arg2 == 4) {
            this.field9227 = arg1.method110((byte) 122);
            this.field9222 = arg1.method119(arg0 - 23);
        } else if (arg2 == 6) {
            this.field9219 = arg1.method110((byte) 124);
        } else if (arg2 == 8) {
            this.field9218 = 1;
        } else if (arg2 == 9) {
            this.field9209 = 1;
        } else if (arg2 == 10) {
            this.field9216 = true;
        }
        field9223++;
        if (arg0 != -5) {
            this.field9226 = 76;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method3668(boolean arg0) {
        field9208 = null;
        field9230 = null;
        field9231 = null;
        field9225 = null;
        field9214 = null;
        if (arg0) {
            field9214 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3669(int arg0, int arg1, byte arg2) {
        field9215++;
        int var3 = -117 % ((arg2 - 36) / 50);
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method3670(int arg0) {
        field9213++;
        this.field9220 = class1.field7[this.field9210 << 3];
        int var2 = 114 / ((arg0 + 40) / 49);
        this.field9212 = (int) Math.sqrt((double) (this.field9224 * this.field9224 - (-(this.field9226 * this.field9226) - this.field9211 * this.field9211)));
        if (this.field9222 == 0) {
            this.field9222 = 1;
        }
        if (this.field9227 == 0) {
            this.field9217 = 2147483647L;
        } else if (this.field9227 == 1) {
            this.field9217 = (this.field9212 * 8 / this.field9222);
            this.field9217 *= this.field9217;
        } else if (this.field9227 == 2) {
            this.field9217 = (this.field9212 * 8 / this.field9222);
        }
        if (this.field9216) {
            this.field9212 *= -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ldaa;B)V")
    public final void method3671(class11 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 88);
            if (var3 == 0) {
                if (arg1 != -36) {
                    return;
                }
                field9221++;
                return;
            }
            this.method3667(-5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB)V")
    public static final void method3672(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9228++;
        if (arg4 <= 102) {
            return;
        }
        float var5 = (float) class413.field5839 / (float) class413.field5821;
        int var6 = arg1;
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg0 - (arg3 - var7) / 2;
        int var9 = arg2 - (arg1 - var6) / 2;
        class300.field4096 = -1;
        class627.field9160 = class413.field5839 - (class413.field5839 * var8 / var7);
        class285.field3931 = class413.field5821 * var9 / var6;
        class315.field4241 = -1;
        class399.method2386((byte) -89);
    }
}
