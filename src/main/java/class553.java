import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class553 {

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field7663 = 0;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field7667 = 0;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    private int field7660;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public int field7662;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 7)
    public final void method3256(int arg0) {
        int var2 = -12 % ((-arg0 - 73) / 41);
        this.field7662 &= 0x3FFF;
        field7664++;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)I", line = 19)
    public final int method3257(int arg0) {
        if (arg0 == -25113) {
            field7659++;
            return this.field7662 & 0x3FFF;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V", line = 31)
    public final void method3258(int arg0, int arg1) {
        field7665++;
        this.field7662 = arg1;
        this.field7660 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)Z", line = 42)
    public final boolean method3259(int arg0, int arg1, int arg2, int arg3) {
        field7661++;
        int var5 = this.field7660;
        if (this.field7662 == arg0 && this.field7660 == 0) {
            return false;
        }
        boolean var8;
        if (this.field7660 == 0) {
            if (this.field7662 < arg0 && arg0 <= (this.field7662 + arg3) || this.field7662 > arg0 && arg0 >= this.field7662 - arg3) {
                this.field7662 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field7660 > 0 && this.field7662 < arg0) {
            int var6 = this.field7660 * this.field7660 / (arg3 * 2);
            int var7 = this.field7662 + var6;
            if (var7 < arg0 && this.field7662 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field7660 < 0 && arg0 < this.field7662) {
            int var9 = this.field7660 * this.field7660 / (arg3 * 2);
            int var10 = this.field7662 - var9;
            if (arg0 < var10 && var10 <= this.field7662) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (arg2 >= -70) {
            this.field7662 = -58;
        }
        if (var8) {
            if (arg0 > this.field7662) {
                this.field7660 += arg3;
                if (arg1 != 0 && arg1 < this.field7660) {
                    this.field7660 = arg1;
                }
            } else {
                this.field7660 -= arg3;
                if (arg1 != 0 && (-arg1) > this.field7660) {
                    this.field7660 = -arg1;
                }
            }
            if (this.field7660 != var5) {
                int var11 = this.field7660 * this.field7660 / (arg3 * 2);
                if (this.field7662 >= arg0) {
                    if (this.field7662 > arg0 && (this.field7662 - var11) < arg0) {
                        this.field7660 = var5;
                    }
                } else if ((this.field7662 + var11) > arg0) {
                    this.field7660 = var5;
                }
            }
        } else if (this.field7660 <= 0) {
            this.field7660 += arg3;
            if (this.field7660 > 0) {
                this.field7660 = 0;
            }
        } else {
            this.field7660 -= arg3;
            if (this.field7660 < 0) {
                this.field7660 = 0;
            }
        }
        this.field7662 += this.field7660 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V", line = 181)
    public static final void method3260(int arg0, int arg1) {
        class39 var2 = class129.field1672;
        synchronized (class129.field1672) {
            class129.field1672.method308(-1, arg1);
        }
        field7666++;
        class39 var3 = class356.field5132;
        synchronized (class356.field5132) {
            if (arg0 != 0) {
                method3260(-58, 96);
            }
            class356.field5132.method308(~arg0, arg1);
        }
    }
}
