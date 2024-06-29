import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class665 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field9261 = new int[1024];

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field9268 = -1;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field9263 = 1338;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    private int field9266;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method3753(int arg0) {
        field9269++;
        this.field9270 &= 0x3FFF;
        if (arg0 != -7741) {
            this.method3757(-29, -15, 43, 76);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BIIILjava/lang/String;III)V")
    public static final void method3754(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field9265++;
        class267 var8 = new class267();
        var8.field3536 = class406.field5732 + arg3;
        var8.field3532 = arg7;
        var8.field3541 = arg2;
        var8.field3539 = arg4;
        var8.field3533 = arg1;
        int var9 = 50 / ((arg0 - 49) / 43);
        var8.field3538 = arg6;
        var8.field3540 = arg5;
        class608.field8493.method118(true, var8);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public final void method3755(boolean arg0, int arg1) {
        field9262++;
        this.field9270 = arg1;
        this.field9266 = 0;
        if (!arg0) {
            this.method3757(3, -90, 0, -103);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)I")
    public final int method3756(byte arg0) {
        if (arg0 != 116) {
            this.field9270 = 87;
        }
        field9264++;
        return this.field9270 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)Z")
    public final boolean method3757(int arg0, int arg1, int arg2, int arg3) {
        field9267++;
        int var5 = this.field9266;
        if (this.field9270 == arg2 && this.field9266 == 0) {
            return false;
        }
        boolean var6;
        if (this.field9266 == 0) {
            if (this.field9270 < arg2 && this.field9270 + arg3 >= arg2 || arg2 < this.field9270 && arg2 >= this.field9270 - arg3) {
                this.field9270 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field9266 > 0 && this.field9270 < arg2) {
            int var7 = this.field9266 * this.field9266 / (arg3 * 2);
            int var8 = this.field9270 + var7;
            if (arg2 > var8 && this.field9270 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field9266 < 0 && this.field9270 > arg2) {
            int var9 = this.field9266 * this.field9266 / (arg3 * 2);
            int var10 = this.field9270 - var9;
            if (arg2 < var10 && var10 <= this.field9270) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (arg0 != 4201) {
            this.field9270 = -82;
        }
        if (var6) {
            if (arg2 > this.field9270) {
                this.field9266 += arg3;
                if (arg1 != 0 && arg1 < this.field9266) {
                    this.field9266 = arg1;
                }
            } else {
                this.field9266 -= arg3;
                if (arg1 != 0 && -arg1 > this.field9266) {
                    this.field9266 = -arg1;
                }
            }
            if (this.field9266 != var5) {
                int var11 = this.field9266 * this.field9266 / (arg3 * 2);
                if (this.field9270 >= arg2) {
                    if (arg2 < this.field9270 && arg2 > this.field9270 - var11) {
                        this.field9266 = var5;
                    }
                } else if (arg2 < (this.field9270 + var11)) {
                    this.field9266 = var5;
                }
            }
        } else if (this.field9266 > 0) {
            this.field9266 -= arg3;
            if (this.field9266 < 0) {
                this.field9266 = 0;
            }
        } else {
            this.field9266 += arg3;
            if (this.field9266 > 0) {
                this.field9266 = 0;
            }
        }
        this.field9270 += this.field9266 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static void method3758(int arg0) {
        if (arg0 != 2) {
            field9261 = null;
        }
        field9261 = null;
    }
}
