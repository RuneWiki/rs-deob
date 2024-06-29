import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class378 extends class305 {

    @OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
    public static int[] field5714 = new int[32];

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5721 = 0;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "[I")
    public static int[] field5723 = new int[4];

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILhb;)V")
    public class378(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field5715;
        if (super.field4323.method4110(-22215)) {
            return 3;
        } else if (super.field4323.method4107(true) == class555.field7936) {
            return 1;
        } else {
            return arg0 != 31401 ? -100 : 3;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public static void method2443(int arg0) {
        field5723 = null;
        field5714 = null;
        if (arg0 != 0) {
            method2447((byte) 43);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lhb;)V")
    public class378(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field5724;
        if (super.field4323.method4107(true) == class555.field7936) {
            if (super.field4323.method4110(-22215)) {
                super.field4320 = 0;
            }
        } else {
            super.field4320 = 1;
        }
        if (arg0 > -40) {
            field5714 = null;
        }
        if (super.field4320 != 0 && super.field4320 != 1) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        if (arg0 == -27751) {
            ++field5716;
            super.field4320 = arg1;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
    public static final void method2444(boolean arg0) {
        ++field5722;
        short var1 = 1024;
        short var2 = 3072;
        if (class418.field6258) {
            if (class246.field3581) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if (class418.field6261 < (float) var1) {
            class418.field6261 = (float) var1;
        }
        if (class418.field6261 > (float) var2) {
            class418.field6261 = (float) var2;
        }
        while (class255.field3659 >= 16384.0F) {
            class255.field3659 -= 16384.0F;
        }
        while (class255.field3659 < 0.0F) {
            class255.field3659 += 16384.0F;
        }
        int var3 = class383.field5783 >> 9;
        if (arg0) {
            method2447((byte) 100);
        }
        int var4 = class398.field5951 >> 9;
        int var5 = class384.method2468(!arg0, class383.field5783, class341.field4946, class398.field5951);
        int var6 = 0;
        if (~var3 < -4 && ~var4 < -4 && ~var3 > ~(class194.field2946 - 4) && ~var4 > ~(class255.field3656 - 4)) {
            for (int var7 = var3 + -4; var7 <= var3 + 4; ++var7) {
                for (int var8 = var4 + -4; ~var8 >= ~(var4 + 4); ++var8) {
                    int var9 = class341.field4946;
                    if (~var9 > -4 && class286.method1827(var7, var8, (byte) -2)) {
                        ++var9;
                    }
                    int var10 = 0;
                    if (class671.field9358.field124 != null && class671.field9358.field124[var9] != null) {
                        var10 = (class671.field9358.field124[var9][var7][var8] & 255) * 8 << 2;
                    }
                    if (class582.field8287 != null && class582.field8287[var9] != null) {
                        int var11 = var10 - (class582.field8287[var9].method1787(var7, 19646, var8) - var5);
                        if (~var6 > ~var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (~var12 < -786433) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class521.field7455 < var12) {
            class521.field7455 += (-class521.field7455 + var12) / 24;
        } else if (var12 < class521.field7455) {
            class521.field7455 += (-class521.field7455 + var12) / 80;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Z")
    public final boolean method2445(int arg0) {
        ++field5718;
        if (super.field4323.method4110(-22215)) {
            return false;
        } else {
            if (arg0 != 2) {
                this.method305((byte) 120);
            }
            return super.field4323.method4107(true) == class555.field7936;
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
    public final int method2446(int arg0) {
        ++field5720;
        return arg0 != 17503 ? -50 : super.field4320;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field5719;
        if (arg0 != 68) {
            field5723 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(B)V")
    public static final void method2447(byte arg0) {
        ++field5717;
        if (class183.field2801 == null) {
            int var1 = class238.field3466;
            int var2 = class37.field381;
            int var3 = -class501.field7123 + -var1 + class153.field2475;
            if (arg0 != 84) {
                method2447((byte) 81);
            }
            int var4 = -var2 + class455.field6702 - class510.field7263;
            if (~var1 < -1 || ~var3 < -1 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class169.field2648 == null) {
                        if (class466.field6830 == null) {
                            var5 = class176.field2729;
                        } else {
                            var5 = class466.field6830;
                        }
                    } else {
                        var5 = class169.field2648;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class169.field2648 == var5) {
                        Insets var8 = class169.field2648.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class455.field6702);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class153.field2475, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(class153.field2475 + var6 + -var3, var7, var3, class455.field6702);
                    }
                    if (var4 > 0) {
                        var9.fillRect(var6, -var4 + var7 + class455.field6702, class153.field2475, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }
}
