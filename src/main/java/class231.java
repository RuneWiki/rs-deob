import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class231 {

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    private int field3782 = 0;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[Lbh;")
    public class273[] field3771;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Lwm;")
    public static class152 field3772 = class157.method1048("::clientdrop", 113);

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Lwm;")
    public static class152 field3773 = class157.method1048("S-Blectionner", 94);

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    public static int[] field3769 = new int[256];

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "[I")
    public static int[] field3780;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "J")
    private long field3776;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Lbh;")
    private class273 field3774;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lbh;")
    private class273 field3781;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[[[I")
    public static int[][][] field3779;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLah;)V", line = 6)
    public static final void method1580(byte arg0, class205 arg1) {
        class55.field868 = class33.method249(class79.field1108, 0, arg1);
        field3768++;
        class133.field2042 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class191.field3008[var2] >> 16 & 0xFF);
            int var4 = class191.field3008[var2 + 1] >> 16 & 0xFF;
            float var5 = (float) (class191.field3008[var2] >> 8 & 0xFF);
            float var6 = ((float) var4 - var3) / 64.0F;
            int var7 = (class191.field3008[var2 + 1] & 0xFF00) >> 8;
            int var8 = class191.field3008[var2 + 1] & 0xFF;
            float var9 = (float) (class191.field3008[var2] & 0xFF);
            float var10 = ((float) var7 - var5) / 64.0F;
            float var11 = ((float) var8 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class133.field2042[var2 * 64 + var12] = class72.method493(class72.method493((int) var5 << 8, (int) var3 << 16), (int) var9);
                var3 += var6;
                var9 += var11;
                var5 += var10;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class133.field2042[var13] = class191.field3008[3];
        }
        if (arg0 != -10) {
            method1592((class205) null, 44, -117, (byte) 4);
        }
        class238.field3904 = new int[32768];
        class179.field2854 = new int[32768];
        class262.method1806((class300) null, (byte) 54);
        class324.field5653 = new int[32768];
        class241.field3938 = new int[32768];
        class157.field2494 = new class109(128, 254);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Lbh;", line = 71)
    public final class273 method1581(byte arg0) {
        field3775++;
        if (this.field3782 > 0 && this.field3771[this.field3782 - 1] != this.field3781) {
            class273 var2 = this.field3781;
            this.field3781 = var2.field4687;
            return var2;
        }
        int var3 = -24 % ((arg0 - 41) / 53);
        class273 var4;
        do {
            if (this.field3770 <= this.field3782) {
                return null;
            }
            var4 = this.field3771[this.field3782++].field4687;
        } while (this.field3771[this.field3782 - 1] == var4);
        this.field3781 = var4.field4687;
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)I", line = 101)
    public final int method1582(int arg0) {
        field3778++;
        int var2 = 0;
        if (arg0 != -18869) {
            return -89;
        }
        for (int var3 = 0; var3 < this.field3770; var3++) {
            class273 var4 = this.field3771[var3];
            class273 var5 = var4.field4687;
            while (var4 != var5) {
                var5 = var5.field4687;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Lbh;B)I", line = 133)
    public final int method1583(class273[] arg0, byte arg1) {
        field3765++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 != 88) {
            return -72;
        }
        while (var4 < this.field3770) {
            class273 var5 = this.field3771[var4];
            for (class273 var6 = var5.field4687; var6 != var5; var6 = var6.field4687) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V", line = 164)
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3759++;
        if (class38.field632 == 1) {
            class123.field1732[class57.field878 / 100].method429(class211.field3429 - 8, class279.field4765 + -8);
        }
        if (arg1 <= 16) {
            field3780 = (int[]) null;
        }
        if (class38.field632 == 2) {
            class123.field1732[(class57.field878 / 100) + 4].method429(class211.field3429 - 8, class279.field4765 + -8);
        }
        class299.method2090(-125);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lbh;", line = 191)
    public final class273 method1585(int arg0) {
        this.field3782 = 0;
        if (arg0 != -1506054736) {
            field3769 = (int[]) null;
        }
        field3764++;
        return this.method1581((byte) -34);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)Lbh;", line = 206)
    public final class273 method1586(long arg0, int arg1) {
        field3767++;
        this.field3776 = arg0;
        class273 var4 = this.field3771[(int) (arg0 & (long) (this.field3770 - 1))];
        for (this.field3774 = var4.field4687; this.field3774 != var4; this.field3774 = this.field3774.field4687) {
            if (this.field3774.field4689 == arg0) {
                class273 var5 = this.field3774;
                this.field3774 = this.field3774.field4687;
                return var5;
            }
        }
        this.field3774 = null;
        if (arg1 >= -50) {
            method1591(56, 63, -1, -119, true, -67, 116, 1.3167756F, -57);
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 242)
    public static void method1587(int arg0) {
        field3780 = null;
        if (arg0 == 32768) {
            field3769 = null;
            field3772 = null;
            field3773 = null;
            field3779 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I", line = 260)
    public final int method1588(byte arg0) {
        if (arg0 != 114) {
            this.field3774 = (class273) null;
        }
        field3762++;
        return this.field3770;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 273)
    public final void method1589(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (var2 < this.field3770) {
            class273 var3 = this.field3771[var2];
            while (true) {
                class273 var4 = var3.field4687;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1880(-25368);
            }
        }
        this.field3774 = null;
        this.field3781 = null;
        field3760++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3769[var0] = var1;
        }
        field3780 = new int[32];
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)Lbh;", line = 312)
    public final class273 method1590(boolean arg0) {
        if (arg0) {
            return (class273) null;
        }
        field3766++;
        if (this.field3774 == null) {
            return null;
        }
        class273 var2 = this.field3771[(int) ((long) (this.field3770 - 1) & this.field3776)];
        while (this.field3774 != var2) {
            if (this.field3774.field4689 == this.field3776) {
                class273 var3 = this.field3774;
                this.field3774 = this.field3774.field4687;
                return var3;
            }
            this.field3774 = this.field3774.field4687;
        }
        this.field3774 = null;
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIZIIFI)[[I", line = 355)
    public static final int[][] method1591(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, float arg7, int arg8) {
        field3777++;
        int[][] var9 = new int[arg2][arg5];
        class252 var10 = new class252();
        var10.field4327 = arg6;
        var10.field4333 = arg1;
        var10.field4349 = arg4;
        var10.field4334 = arg8;
        var10.field4324 = (int) (arg7 * 4096.0F);
        var10.method673(8);
        class54.method361(102, arg2, arg5);
        if (arg3 != 1) {
            method1580((byte) -82, (class205) null);
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1747(var11, true, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lah;IIB)Lbg;", line = 385)
    public static final class203 method1592(class205 arg0, int arg1, int arg2, byte arg3) {
        field3761++;
        if (class86.method566(arg2, arg0, arg1, 1)) {
            if (arg3 < 17) {
                field3779 = (int[][][]) ((int[][][]) null);
            }
            return class225.method1549(3803);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JLbh;I)V", line = 405)
    public final void method1593(long arg0, class273 arg1, int arg2) {
        if (arg1.field4685 != null) {
            arg1.method1880(-25368);
        }
        field3763++;
        if (arg2 != 27497) {
            this.method1588((byte) 77);
        }
        class273 var5 = this.field3771[(int) (arg0 & (long) (this.field3770 - 1))];
        arg1.field4687 = var5;
        arg1.field4685 = var5.field4685;
        arg1.field4689 = arg0;
        arg1.field4685.field4687 = arg1;
        arg1.field4687.field4685 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V", line = 451)
    public class231(int arg0) {
        this.field3771 = new class273[arg0];
        this.field3770 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class273 var3 = this.field3771[var2] = new class273();
            var3.field4685 = var3;
            var3.field4687 = var3;
        }
    }
}
