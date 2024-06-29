import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class27 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "F")
    public static float field454;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
    public final int method160(boolean arg0) {
        field459++;
        if (!arg0) {
            this.field455 = -86;
        }
        return this.field458 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        this.field455 = arg1;
        this.field458 = arg0;
        field460++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)Z")
    public final boolean method162(int arg0, int arg1, int arg2, int arg3) {
        field456++;
        int var5 = this.field455;
        if (this.field458 == arg0 && this.field455 == 0) {
            return false;
        }
        boolean var8;
        if (~this.field455 == arg1) {
            if (arg0 > this.field458 && (this.field458 + arg2) >= arg0 || this.field458 > arg0 && arg0 >= (this.field458 - arg2)) {
                this.field458 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field455 > 0 && arg0 > this.field458) {
            int var6 = this.field455 * this.field455 / (arg2 * 2);
            int var7 = this.field458 + var6;
            if (arg0 > var7 && this.field458 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field455 < 0 && this.field458 > arg0) {
            int var9 = this.field455 * this.field455 / (arg2 * 2);
            int var10 = this.field458 - var9;
            if (var10 > arg0 && var10 <= this.field458) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 > this.field458) {
                this.field455 += arg2;
                if (arg3 != 0 && this.field455 > arg3) {
                    this.field455 = arg3;
                }
            } else {
                this.field455 -= arg2;
                if (arg3 != 0 && this.field455 < (-arg3)) {
                    this.field455 = -arg3;
                }
            }
            if (this.field455 != var5) {
                int var11 = this.field455 * this.field455 / (arg2 * 2);
                if (arg0 <= this.field458) {
                    if (this.field458 > arg0 && (this.field458 - var11) < arg0) {
                        this.field455 = var5;
                    }
                } else if ((this.field458 + var11) > arg0) {
                    this.field455 = var5;
                }
            }
        } else if (this.field455 > 0) {
            this.field455 -= arg2;
            if (this.field455 < 0) {
                this.field455 = 0;
            }
        } else {
            this.field455 += arg2;
            if (this.field455 > 0) {
                this.field455 = 0;
            }
        }
        this.field458 += this.field455 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        field457++;
        if (arg0) {
            field454 = -2.324068F;
        }
        this.field458 &= 0x3FFF;
    }
}
