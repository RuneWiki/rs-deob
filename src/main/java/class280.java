import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class280 {

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
    public final int method1593(int arg0) {
        field3531++;
        return arg0 >= -119 ? 1 : this.field3532 & 0x3FFF;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
    public final void method1594(int arg0, int arg1) {
        field3538++;
        this.field3534 = 0;
        int var3 = -27 / ((arg1 + 61) / 44);
        this.field3532 = arg0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLiaa;)V")
    public static final void method1595(byte arg0, class452 arg1) {
        field3533++;
        if ((arg1.field6209.length - arg1.field6215) < 1) {
            return;
        }
        int var2 = arg1.method2541(49);
        if (var2 < 0 || var2 > 1 || arg1.field6209.length - arg1.field6215 < 2) {
            return;
        }
        int var3 = arg1.method2574(-1758460248);
        if (arg0 != 114 || (arg1.field6209.length - arg1.field6215) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method2574(-1758460248);
            int var6 = arg1.method2575((byte) -48);
            if (class585.field8313.length > var5 && class462.field6424[var5] && (class410.field5444.method3195(var5, 19).field4113 != '1' || var6 >= -1 && var6 <= 1)) {
                class585.field8313[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
    public final void method1596(int arg0) {
        this.field3532 &= 0x3FFF;
        if (arg0 != -3165) {
            this.field3534 = -102;
        }
        field3537++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
    public static final void method1597(boolean arg0) {
        field3535++;
        if (class680.field9649 != null) {
            return;
        }
        int var1 = class287.field3673;
        int var2 = class600.field8523;
        int var3 = class433.field5699 - class399.field5336 - var1;
        if (arg0) {
            return;
        }
        int var4 = class680.field9645 - var2 - class416.field5524;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class77.field796 != null) {
                var5 = class77.field796;
            } else if (class485.field7068 == null) {
                var5 = class663.field9432;
            } else {
                var5 = class485.field7068;
            }
            int var6 = 0;
            int var7 = 0;
            if (class77.field796 == var5) {
                Insets var8 = class77.field796.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class680.field9645);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class433.field5699, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class433.field5699 - var3, var7, var3, class680.field9645);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class680.field9645 - var4, class433.field5699, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIBI)Z")
    public final boolean method1598(int arg0, int arg1, byte arg2, int arg3) {
        field3536++;
        int var5 = this.field3534;
        if (arg2 != 12) {
            return false;
        } else if (this.field3532 == arg1 && this.field3534 == 0) {
            return false;
        } else {
            boolean var6;
            if (this.field3534 == 0) {
                if (this.field3532 < arg1 && this.field3532 + arg3 >= arg1 || arg1 < this.field3532 && arg1 >= this.field3532 - arg3) {
                    this.field3532 = arg1;
                    return false;
                }
                var6 = true;
            } else if (this.field3534 > 0 && arg1 > this.field3532) {
                int var7 = this.field3534 * this.field3534 / (arg3 * 2);
                int var8 = this.field3532 + var7;
                if (var8 < arg1 && this.field3532 <= var8) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field3534 < 0 && this.field3532 > arg1) {
                int var9 = this.field3534 * this.field3534 / (arg3 * 2);
                int var10 = this.field3532 - var9;
                if (arg1 < var10 && this.field3532 >= var10) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (this.field3532 >= arg1) {
                    this.field3534 -= arg3;
                    if (arg0 != 0 && this.field3534 < -arg0) {
                        this.field3534 = -arg0;
                    }
                } else {
                    this.field3534 += arg3;
                    if (arg0 != 0 && this.field3534 > arg0) {
                        this.field3534 = arg0;
                    }
                }
                if (this.field3534 != var5) {
                    int var11 = this.field3534 * this.field3534 / (arg3 * 2);
                    if (this.field3532 < arg1) {
                        if (this.field3532 + var11 > arg1) {
                            this.field3534 = var5;
                        }
                    } else if (this.field3532 > arg1 && this.field3532 - var11 < arg1) {
                        this.field3534 = var5;
                    }
                }
            } else if (this.field3534 <= 0) {
                this.field3534 += arg3;
                if (this.field3534 > 0) {
                    this.field3534 = 0;
                }
            } else {
                this.field3534 -= arg3;
                if (this.field3534 < 0) {
                    this.field3534 = 0;
                }
            }
            this.field3532 += this.field3534 + var5 >> 1;
            return var6;
        }
    }
}
