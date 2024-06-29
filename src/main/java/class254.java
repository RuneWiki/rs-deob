import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class254 extends class222 {

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    private int field4445 = -1;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "[I")
    public static int[] field4442 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Z")
    public static boolean field4441 = false;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "Lsb;")
    public static class98 field4452 = class47.method368("<col=ff0000>", 0);

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    private int field4453;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "[I")
    private int[] field4447;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class254() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field4448;
        if (~arg2 == -1) {
            this.field4445 = arg0.method1487(38);
        }
        if (arg1) {
            this.method3((class216) null, false, 110);
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            field4441 = true;
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486 && this.method1756(arg1 ^ -125)) {
            int var4 = this.field4453 * (class20.field373 != this.field4449 ? this.field4449 * arg0 / class20.field373 : arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class13.field253 != this.field4453) {
                for (int var8 = 0; class13.field253 > var8; ++var8) {
                    int var9 = this.field4453 * var8 / class13.field253;
                    int var10 = this.field4447[var4 - -var9];
                    var7[var8] = class214.method1427(255, var10) << 4;
                    var5[var8] = class214.method1427(var10 >> 4, 4080);
                    var6[var8] = class214.method1427(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class13.field253; ++var11) {
                    int var12 = this.field4447[var4++];
                    var7[var11] = class214.method1427(255, var12) << 4;
                    var5[var11] = class214.method1427(var12 >> 4, 4080);
                    var6[var11] = class214.method1427(var12, 16711680) >> 12;
                }
            }
        }
        ++field4451;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
    public static final void method1755(int arg0) {
        ++field4454;
        int var1 = class87.field1551;
        int var2 = class216.field3692;
        if (arg0 == -25291) {
            int var3 = -class121.field2227 + class227.field3915 + -var2;
            int var4 = -class180.field3111 + class265.field4638 + -var1;
            if (~var2 < -1 || var3 > 0 || var1 > 0 || ~var4 < -1) {
                try {
                    Container var5;
                    if (class14.field263 != null) {
                        var5 = class14.field263;
                    } else if (class72.field1195 != null) {
                        var5 = class72.field1195;
                    } else {
                        var5 = class119.field2145.field76;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class72.field1195 == var5) {
                        Insets var8 = class72.field1195.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, var2, class265.field4638);
                    }
                    if (~var1 < -1) {
                        var9.fillRect(var6, var7, class227.field3915, var1);
                    }
                    if (~var3 < -1) {
                        var9.fillRect(var6 - -class227.field3915 + -var3, var7, var3, class265.field4638);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, var7 - (-class265.field4638 - -var4), class227.field3915, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)I")
    public final int method1532(byte arg0) {
        if (arg0 <= 99) {
            return 102;
        } else {
            ++field4450;
            return this.field4445;
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)Z")
    private final boolean method1756(int arg0) {
        ++field4440;
        if (this.field4447 != null) {
            return true;
        } else {
            if (arg0 >= -114) {
                this.method1497(-24);
            }
            if (~this.field4445 <= -1) {
                int var2 = class13.field253;
                int var3 = class20.field373;
                int var4 = class103.field1828.method134(this.field4445, 127) ? 64 : 128;
                this.field4447 = class103.field1828.method131(-64, this.field4445);
                this.field4449 = var4;
                this.field4453 = var4;
                class158.method1146(var2, -128, var3);
                return this.field4447 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method1497(int arg0) {
        ++field4444;
        super.method1497(arg0);
        this.field4447 = null;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4442 = null;
        field4452 = null;
        int var1 = 9 / ((arg0 - 84) / 39);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILnj;Lq;IB)V")
    public static final void method1758(int arg0, int arg1, int arg2, class82 arg3, class148 arg4, int arg5, byte arg6) {
        ++field4446;
        if (arg3 != null) {
            int var7 = arg0 * arg0 + arg5 * arg5;
            int var8 = class243.field4219 - -class135.field2396 & 2047;
            int var9 = Math.max(arg4.field2694 / 2, arg4.field2647 / 2) + 10;
            if (~(var9 * var9) <= ~var7) {
                int var10 = class160.field2893[var8];
                int var11 = var10 * 256 / (class146.field2557 + 256);
                if (arg6 != -56) {
                    field4441 = true;
                }
                int var12 = class160.field2890[var8];
                int var13 = var12 * 256 / (class146.field2557 + 256);
                int var14 = arg5 * var13 - arg0 * var11 >> 16;
                int var15 = arg0 * var13 + arg5 * var11 >> 16;
                ((class247) arg3).method1717(arg1 - (-(arg4.field2694 / 2) - -(arg3.field1453 / 2)) + var15, arg2 - -(arg4.field2647 / 2) + -(arg3.field1442 / 2) + -var14, arg4.field2638, arg4.field2713);
            }
        }
    }
}
