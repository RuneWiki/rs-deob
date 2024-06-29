import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class142 {

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lal;")
    public static class52 field2250 = new class52(64);

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lal;")
    public static class52 field2254 = new class52(64);

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2255 = 12;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field2243;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lma;")
    public static class8 field2253;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 4)
    public final int method1032(int arg0) {
        if (arg0 >= -84) {
            field2255 = 51;
        }
        field2246++;
        return this.field2248 & 0x3FFF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)I", line = 16)
    public static final int method1033(int arg0, boolean arg1, int arg2) {
        field2247++;
        if (!arg1) {
            method1038((byte) -108, -30);
        }
        int var3 = arg2 - 1 & arg0 >> 31;
        return (arg0 + (arg0 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 29)
    public final void method1034(int arg0, int arg1) {
        this.field2248 = arg0;
        int var3 = 58 % ((arg1 - 6) / 41);
        field2244++;
        this.field2243 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 41)
    public final void method1035(int arg0) {
        if (arg0 != 825386177) {
            field2254 = null;
        }
        this.field2248 &= 0x3FFF;
        field2251++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 54)
    public static final void method1036(byte arg0) {
        field2242++;
        if (class312.field4907 != null) {
            class190 var1 = class312.field4907;
            synchronized (class312.field4907) {
                class312.field4907 = null;
            }
        }
        if (arg0 != -26) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 76)
    public static void method1037(byte arg0) {
        field2250 = null;
        int var1 = -8 % ((arg0 + 25) / 62);
        field2254 = null;
        field2253 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 87)
    public static final void method1038(byte arg0, int arg1) {
        if (arg0 != -107) {
            method1039(-81);
        }
        field2249++;
        class211 var2 = class281.method1921(7, arg1, (byte) -105);
        var2.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 100)
    public static final void method1039(int arg0) {
        field2252++;
        class11.field139.method2224(arg0, (byte) 0);
        class275.field4393++;
        class11.field139.method1283(8, class160.field2530);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILmo;)V", line = 122)
    public static final void method1040(int arg0, class447 arg1) {
        class410.field6078 = arg1;
        field2245++;
        if (arg0 != -1) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z", line = 134)
    public final boolean method1041(int arg0, int arg1, int arg2, int arg3) {
        field2241++;
        int var5 = this.field2243;
        if (this.field2248 == arg2 && this.field2243 == 0) {
            return false;
        }
        if (arg3 != 26063) {
            this.field2243 = -74;
        }
        boolean var8;
        if (this.field2243 == 0) {
            if (arg2 > this.field2248 && (this.field2248 + arg1) >= arg2 || this.field2248 > arg2 && this.field2248 - arg1 <= arg2) {
                this.field2248 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field2243 > 0 && this.field2248 < arg2) {
            int var6 = this.field2243 * this.field2243 / (arg1 * 2);
            int var7 = this.field2248 + var6;
            if (arg2 > var7 && this.field2248 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field2243 < 0 && arg2 < this.field2248) {
            int var9 = this.field2243 * this.field2243 / (arg1 * 2);
            int var10 = this.field2248 - var9;
            if (var10 > arg2 && this.field2248 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field2248 >= arg2) {
                this.field2243 -= arg1;
                if (arg0 != 0 && -arg0 > this.field2243) {
                    this.field2243 = -arg0;
                }
            } else {
                this.field2243 += arg1;
                if (arg0 != 0 && this.field2243 > arg0) {
                    this.field2243 = arg0;
                }
            }
            if (this.field2243 != var5) {
                int var11 = this.field2243 * this.field2243 / (arg1 * 2);
                if (this.field2248 < arg2) {
                    if (arg2 < (this.field2248 + var11)) {
                        this.field2243 = var5;
                    }
                } else if (arg2 < this.field2248 && this.field2248 - var11 < arg2) {
                    this.field2243 = var5;
                }
            }
        } else if (this.field2243 > 0) {
            this.field2243 -= arg1;
            if (this.field2243 < 0) {
                this.field2243 = 0;
            }
        } else {
            this.field2243 += arg1;
            if (this.field2243 > 0) {
                this.field2243 = 0;
            }
        }
        this.field2248 += this.field2243 + var5 >> 1;
        return var8;
    }
}
