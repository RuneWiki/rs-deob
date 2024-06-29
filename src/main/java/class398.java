import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class398 {

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    private int field5707;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    private int field5694;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    private int field5705;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    private int field5698;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public int field5693;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public int field5703;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public int field5708;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lqw;")
    public static class84 field5706 = new class84();

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIZI)V", line = 4)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class393.field5661 != null && (arg0 != 3 || class776.field10674 != arg5 || class104.field1485 != arg2)) {
            class163.method1130(class393.field5661, class786.field10800, -127);
            class393.field5661 = null;
        }
        field5702++;
        if (arg0 == 3 && class393.field5661 == null) {
            class393.field5661 = class143.method997(0, 0, arg5, 0, class786.field10800, arg2);
            if (class393.field5661 != null) {
                class776.field10674 = arg5;
                class104.field1485 = arg2;
                class515.method3006(-2);
            }
        }
        if (arg0 == 3 && class393.field5661 == null) {
            method2427(class125.field1721.field5183.method1441(43), 105, -1, arg3, true, -1);
            return;
        }
        Container var6;
        if (class393.field5661 != null) {
            var6 = class393.field5661;
            class358.field5218 = arg5;
            class482.field6754 = arg2;
        } else if (class639.field8606 == null) {
            if (class552.field7624 == null) {
                var6 = class468.field6609;
            } else {
                var6 = class552.field7624;
            }
            class358.field5218 = var6.getSize().width;
            class482.field6754 = var6.getSize().height;
        } else {
            Insets var7 = class639.field8606.getInsets();
            int var10001 = -var7.right;
            class358.field5218 = class639.field8606.getSize().width + var10001 - var7.left;
            int var10 = -var7.top;
            class482.field6754 = class639.field8606.getSize().height + var10 - var7.bottom;
            var6 = class639.field8606;
        }
        if (arg0 == 1) {
            class589.field8043 = 0;
            class693.field9222 = class187.field2450;
            class460.field6558 = class67.field933;
            class523.field7268 = (class358.field5218 - class67.field933) / 2;
        } else {
            class531.method3071(0);
        }
        if (class554.field7645 != class222.field2884) {
            boolean var10000;
            if (class460.field6558 < 1024 && class693.field9222 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class466.method2739(true);
        } else {
            class669.field8962.setSize(class460.field6558, class693.field9222);
            if (class24.field246) {
                class657.method3648(class669.field8962, (byte) 118);
            } else {
                class375.field5490.method546(class669.field8962, class460.field6558, class693.field9222);
            }
            if (class639.field8606 == var6) {
                Insets var8 = class639.field8606.getInsets();
                class669.field8962.setLocation(class523.field7268 + var8.left, class589.field8043 + var8.top);
            } else {
                class669.field8962.setLocation(class523.field7268, class589.field8043);
            }
        }
        if (arg1 <= 25) {
            field5706 = null;
        }
        if (arg0 >= 2) {
            class360.field5237 = true;
        } else {
            class360.field5237 = false;
        }
        if (class227.field2935 != -1) {
            class336.method2157(105, true);
        }
        if (class710.field9707 != null && class487.method2845(class780.field10712, (byte) 26)) {
            class436.method2616(-108);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class753.field10199[var9] = true;
        }
        class317.field4490 = true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 136)
    public static void method2428(int arg0) {
        if (arg0 != 0) {
            method2431((byte) 44);
        }
        field5706 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 146)
    public static final boolean method2429(byte arg0, String arg1) {
        if (arg0 <= 35) {
            method2428(-1);
        }
        field5701++;
        return class533.method3096(true, arg1, (byte) -16, 10);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)Z", line = 158)
    public final boolean method2430(int arg0, int arg1, int arg2, int arg3) {
        field5699++;
        if (arg1 < this.field5703 || arg1 > this.field5693) {
            return false;
        }
        if (arg0 <= 106) {
            field5706 = null;
        }
        if (arg2 < this.field5696 || arg2 > this.field5695) {
            return false;
        } else if (this.field5708 <= arg3 && arg3 <= this.field5700) {
            int var5 = arg1 - this.field5707;
            int var6 = arg3 - this.field5705;
            return this.field5698 > var5 * var5 + var6 * var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 193)
    public static final void method2431(byte arg0) {
        field5697++;
        if (arg0 != 16) {
            field5706 = null;
        }
        if (class617.field8324 == null) {
            class657 var1 = new class657();
            byte[] var2 = var1.method3651(128, 128, false, 16);
            class617.field8324 = class33.method182(arg0 ^ 0xFFFFB473, var2, false);
        }
        if (class255.field3797 == null) {
            class549 var3 = new class549();
            byte[] var4 = var3.method3158(128, 34037, 128, 16);
            class255.field3797 = class33.method182(-19357, var4, false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIIII)V", line = 228)
    public final void method2432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 768) {
            return;
        }
        this.field5694 = arg6;
        this.field5705 = arg8;
        field5704++;
        this.field5698 = arg5 * arg5;
        this.field5707 = arg4;
        this.field5693 = this.field5707 + arg1;
        this.field5703 = this.field5707 + arg7;
        this.field5700 = this.field5705 + arg9;
        this.field5696 = this.field5694 + arg2;
        this.field5708 = this.field5705 + arg10;
        this.field5695 = this.field5694 + arg3;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 248)
    public class398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5707 = arg0;
        this.field5694 = arg1;
        this.field5705 = arg2;
        this.field5698 = arg3 * arg3;
        this.field5693 = this.field5707 + arg5;
        this.field5703 = this.field5707 + arg4;
        this.field5695 = this.field5694 + arg7;
        this.field5696 = this.field5694 + arg6;
        this.field5700 = this.field5705 + arg9;
        this.field5708 = this.field5705 + arg8;
    }
}
