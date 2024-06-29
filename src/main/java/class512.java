import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class512 {

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "Z")
    public static boolean field7222 = false;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "Lnha;")
    public static class501 field7215 = new class501("", 18);

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    private int field7219;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "Ldca;")
    public static class660 field7223;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7224;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method2945(int arg0, int arg1, int arg2, int arg3) {
        field7220++;
        int var5 = this.field7219;
        if (this.field7217 == arg2 && this.field7219 == 0) {
            return false;
        }
        boolean var8;
        if (this.field7219 == 0) {
            if (arg2 > this.field7217 && this.field7217 + arg1 >= arg2 || arg2 < this.field7217 && arg2 >= (this.field7217 - arg1)) {
                this.field7217 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field7219 > 0 && this.field7217 < arg2) {
            int var6 = this.field7219 * this.field7219 / (arg1 * 2);
            int var7 = this.field7217 + var6;
            if (var7 < arg2 && this.field7217 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field7219 < 0 && arg2 < this.field7217) {
            int var9 = this.field7219 * this.field7219 / (arg1 * 2);
            int var10 = this.field7217 - var9;
            if (arg2 < var10 && this.field7217 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (arg3 < 114) {
            this.field7219 = -110;
        }
        if (var8) {
            if (arg2 > this.field7217) {
                this.field7219 += arg1;
                if (arg0 != 0 && arg0 < this.field7219) {
                    this.field7219 = arg0;
                }
            } else {
                this.field7219 -= arg1;
                if (arg0 != 0 && this.field7219 < (-arg0)) {
                    this.field7219 = -arg0;
                }
            }
            if (this.field7219 != var5) {
                int var11 = this.field7219 * this.field7219 / (arg1 * 2);
                if (arg2 > this.field7217) {
                    if ((this.field7217 + var11) > arg2) {
                        this.field7219 = var5;
                    }
                } else if (arg2 < this.field7217 && arg2 > this.field7217 - var11) {
                    this.field7219 = var5;
                }
            }
        } else if (this.field7219 > 0) {
            this.field7219 -= arg1;
            if (this.field7219 < 0) {
                this.field7219 = 0;
            }
        } else {
            this.field7219 += arg1;
            if (this.field7219 > 0) {
                this.field7219 = 0;
            }
        }
        this.field7217 += this.field7219 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 144)
    public final void method2946(int arg0) {
        this.field7217 &= 0x3FFF;
        field7218++;
        if (arg0 != -10519) {
            method2949((byte) 7);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V", line = 156)
    public final void method2947(int arg0, boolean arg1) {
        this.field7217 = arg0;
        if (arg1) {
            field7221++;
            this.field7219 = 0;
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I", line = 169)
    public final int method2948(int arg0) {
        if (arg0 != 25160) {
            method2949((byte) -68);
        }
        field7216++;
        return this.field7217 & 0x3FFF;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 185)
    public static void method2949(byte arg0) {
        field7224 = null;
        field7215 = null;
        field7223 = null;
        int var1 = -7 / ((arg0 + 71) / 47);
    }
}
