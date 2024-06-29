import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class362 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lwl;")
    public static class452 field5329 = new class452(2, -2);

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lsf;")
    public static class398 field5331 = new class398();

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5332 = new String[5];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    private int field5328;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Liq;")
    public static class134 field5333;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Liq;")
    public static class134 field5335;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lec;")
    public static class96 field5334;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZI)Z")
    public final boolean method2173(int arg0, int arg1, boolean arg2, int arg3) {
        field5325++;
        int var5 = this.field5328;
        if (this.field5324 == arg0 && this.field5328 == 0) {
            return false;
        }
        if (!arg2) {
            this.method2179(-31);
        }
        boolean var8;
        if (this.field5328 == 0) {
            if (this.field5324 < arg0 && arg0 <= this.field5324 + arg3 || this.field5324 > arg0 && arg0 >= this.field5324 - arg3) {
                this.field5324 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field5328 > 0 && this.field5324 < arg0) {
            int var6 = this.field5328 * this.field5328 / (arg3 * 2);
            int var7 = this.field5324 + var6;
            if (var7 < arg0 && var7 >= this.field5324) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field5328 < 0 && arg0 < this.field5324) {
            int var9 = this.field5328 * this.field5328 / (arg3 * 2);
            int var10 = this.field5324 - var9;
            if (var10 > arg0 && this.field5324 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field5324 >= arg0) {
                this.field5328 -= arg3;
                if (arg1 != 0 && this.field5328 < -arg1) {
                    this.field5328 = -arg1;
                }
            } else {
                this.field5328 += arg3;
                if (arg1 != 0 && arg1 < this.field5328) {
                    this.field5328 = arg1;
                }
            }
            if (this.field5328 != var5) {
                int var11 = this.field5328 * this.field5328 / (arg3 * 2);
                if (this.field5324 < arg0) {
                    if (this.field5324 + var11 > arg0) {
                        this.field5328 = var5;
                    }
                } else if (arg0 < this.field5324 && (this.field5324 - var11) < arg0) {
                    this.field5328 = var5;
                }
            }
        } else if (this.field5328 <= 0) {
            this.field5328 += arg3;
            if (this.field5328 > 0) {
                this.field5328 = 0;
            }
        } else {
            this.field5328 -= arg3;
            if (this.field5328 < 0) {
                this.field5328 = 0;
            }
        }
        this.field5324 += this.field5328 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIFZ)[I")
    public static final int[] method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7) {
        field5330++;
        int[] var8 = new int[arg4];
        class407 var9 = new class407();
        var9.field6058 = arg7;
        var9.field6055 = arg2;
        var9.field6054 = arg5;
        if (arg1 <= 39) {
            field5329 = null;
        }
        var9.field6056 = arg0;
        var9.field6057 = arg3;
        var9.field6047 = (int) (arg6 * 4096.0F);
        var9.method306(121);
        class377.method2271(1, 2016454732, arg4);
        var9.method2559(0, 121, var8);
        return var8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method2175(byte arg0) {
        field5332 = null;
        field5335 = null;
        field5329 = null;
        field5333 = null;
        field5334 = null;
        if (arg0 >= -1) {
            method2174(-58, -83, 49, -35, -67, 12, -1.6870427F, false);
        }
        field5331 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public final void method2176(int arg0, int arg1) {
        field5323++;
        int var3 = -81 / ((arg0 + 29) / 47);
        this.field5324 = arg1;
        this.field5328 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIII)I")
    public static final int method2177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5327++;
        if (class307.field4638 == null) {
            return 0;
        }
        if (arg3 != 127) {
            field5332 = null;
        }
        if (arg2 < 3) {
            int var6 = arg0 >> 7;
            int var7 = arg4 >> 7;
            if (arg5 < 0 || arg1 < 0 || arg5 > (class115.field1522 - 1) || arg1 > (class198.field3004 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class115.field1522 - 1 < var6 || var7 > class198.field3004 - 1) {
                return 0;
            }
            boolean var8 = (class341.field5085[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg0 & 0x7F) == 0) {
                boolean var9 = (class341.field5085[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class341.field5085[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class341.field5085[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class341.field5085[1][arg0 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class341.field5085[1][arg0 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class341.field5085[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class307.field4638[arg2].method100(arg0, arg4);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
    public final int method2178(int arg0) {
        if (arg0 != -14579) {
            this.method2173(35, 89, false, 24);
        }
        field5322++;
        return this.field5324 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public final void method2179(int arg0) {
        this.field5324 &= 0x3FFF;
        field5326++;
        if (arg0 != -1) {
            field5335 = null;
        }
    }
}
