import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 {

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "S")
    public static short field432 = 32767;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "Lke;")
    public static class622 field431 = new class622(104, 8);

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "Lpca;")
    public static class744 field438;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)I")
    public final int method224(byte arg0) {
        if (arg0 >= -5) {
            this.method226(-124, 97, 12, -63);
        }
        field434++;
        return this.field437 & 0x3FFF;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public final void method225(int arg0) {
        if (arg0 != -1) {
            this.field436 = 10;
        }
        this.field437 &= 0x3FFF;
        field435++;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIII)Z")
    public final boolean method226(int arg0, int arg1, int arg2, int arg3) {
        field430++;
        int var5 = this.field436;
        if (arg3 != -9746) {
            return true;
        } else if (this.field437 == arg0 && this.field436 == 0) {
            return false;
        } else {
            boolean var6;
            if (this.field436 == 0) {
                if (arg0 > this.field437 && (this.field437 + arg2) >= arg0 || this.field437 > arg0 && arg0 >= (this.field437 - arg2)) {
                    this.field437 = arg0;
                    return false;
                }
                var6 = true;
            } else if (this.field436 > 0 && this.field437 < arg0) {
                int var7 = this.field436 * this.field436 / (arg2 * 2);
                int var8 = this.field437 + var7;
                if (arg0 > var8 && this.field437 <= var8) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field436 < 0 && arg0 < this.field437) {
                int var9 = this.field436 * this.field436 / (arg2 * 2);
                int var10 = this.field437 - var9;
                if (arg0 < var10 && this.field437 >= var10) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (this.field437 >= arg0) {
                    this.field436 -= arg2;
                    if (arg1 != 0 && this.field436 < -arg1) {
                        this.field436 = -arg1;
                    }
                } else {
                    this.field436 += arg2;
                    if (arg1 != 0 && this.field436 > arg1) {
                        this.field436 = arg1;
                    }
                }
                if (this.field436 != var5) {
                    int var11 = this.field436 * this.field436 / (arg2 * 2);
                    if (arg0 <= this.field437) {
                        if (this.field437 > arg0 && arg0 > this.field437 - var11) {
                            this.field436 = var5;
                        }
                    } else if (arg0 < (this.field437 + var11)) {
                        this.field436 = var5;
                    }
                }
            } else if (this.field436 > 0) {
                this.field436 -= arg2;
                if (this.field436 < 0) {
                    this.field436 = 0;
                }
            } else {
                this.field436 += arg2;
                if (this.field436 > 0) {
                    this.field436 = 0;
                }
            }
            this.field437 += this.field436 + var5 >> 1;
            return var6;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
    public static void method227(boolean arg0) {
        field431 = null;
        if (arg0) {
            field438 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ICI)I")
    public static final int method228(int arg0, char arg1, int arg2) {
        field433++;
        int var3 = arg1 << 4;
        if (arg0 != 1631593732) {
            method228(-115, (char) 65426, -9);
        }
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
    public final void method229(int arg0, boolean arg1) {
        this.field437 = arg0;
        this.field436 = 0;
        if (!arg1) {
            this.method224((byte) -34);
        }
        field429++;
    }
}
