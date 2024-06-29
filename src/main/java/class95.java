import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class95 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lci;")
    public static class233 field1685 = new class233(64);

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1692 = 1;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lpj;")
    public static class237 field1695 = class33.method353("::gc", 120);

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "F")
    public static float field1697;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lsj;")
    public static class48 field1688;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
    public void method703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            this.method176();
        }
        field1693++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z")
    public boolean method704() {
        field1684++;
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V")
    public static final void method705(byte arg0, int arg1, int arg2) {
        field1686++;
        if (arg0 == -17) {
            class270 var3 = class202.method1368(-15, 1, arg1);
            var3.method1793(arg0 + 30);
            var3.field4619 = arg2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZIBILjb;)V")
    public static final void method706(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class256 arg5) {
        field1694++;
        if (class264.field4517 >= 50 || arg5.field4402 == null || arg2 >= arg5.field4402.length || arg5.field4402[arg2] == null) {
            return;
        }
        int var6 = arg5.field4402[arg2][0];
        int var7 = var6 & 0xF;
        int var8 = (var6 & 0x73) >> 4;
        int var9 = var6 >> 8;
        if (arg5.field4402[arg2].length > 1) {
            int var10 = (int) (Math.random() * (double) arg5.field4402[arg2].length);
            if (var10 > 0) {
                var9 = arg5.field4402[arg2][var10];
            }
        }
        if (var7 == 0) {
            if (arg1) {
                class59.method514(0, var8, var9, false);
            }
        } else if (class204.field3497 != 0) {
            class230.field3935[class264.field4517] = var9;
            int var11 = (arg4 - 64) / 128;
            int var12 = (arg0 - 64) / 128;
            class52.field1102[class264.field4517] = var8;
            class147.field2619[class264.field4517] = 0;
            class166.field2942[class264.field4517] = null;
            class19.field371[class264.field4517] = (var12 << 8) + (var11 << 16) + var7;
            class264.field4517++;
            if (arg3 <= 59) {
                field1688 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Lqe;")
    public class95 method707(int arg0, int arg1, int arg2) {
        field1696++;
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;IIIZ)V")
    public void method708(class95 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1689++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILsb;III)V")
    public static final void method709(int arg0, int arg1, int arg2, class215 arg3, int arg4, int arg5, int arg6) {
        field1682++;
        class182.method1252(arg3.field3700, arg6, -51, arg5, arg2, arg3.field3710, arg4, arg1);
        if (arg0 >= -3) {
            field1691 = 101;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILfa;)Lgj;")
    public static final class225 method710(int arg0, int arg1, int arg2, class239 arg3) {
        field1687++;
        return class123.method883(arg1, arg0, arg2, arg3) ? class166.method1161((byte) 66) : null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public abstract int method176();

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method711(int arg0) {
        field1695 = null;
        field1688 = null;
        field1685 = null;
        if (arg0 < 10) {
            field1688 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method712(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1683++;
        if (arg2 == 3) {
            method712(true, 0, class17.field298, -1, arg4, -1, true);
            return;
        }
        Container var7;
        if (class24.field433 != null) {
            var7 = class24.field433;
        } else if (class43.field946 == null) {
            var7 = class268.field4572.field1306;
        } else {
            var7 = class43.field946;
        }
        class170.field2976 = var7.getSize().width;
        class231.field3976 = var7.getSize().height;
        if (class43.field946 == var7) {
            Insets var8 = class43.field946.getInsets();
            class170.field2976 -= var8.left + var8.right;
            class231.field3976 -= var8.top + var8.bottom;
        }
        if (arg2 < 2) {
            class119.field2087 = 503;
            class245.field4296 = 0;
            class142.field2585 = 765;
            class129.field2255 = (class170.field2976 - 765) / 2;
        } else {
            class119.field2087 = class231.field3976;
            class245.field4296 = 0;
            class142.field2585 = class170.field2976;
            class129.field2255 = 0;
        }
        if (arg0) {
            class178.method1230(class20.field379, 9591);
            class118.method860(0, class20.field379);
            if (class235.field4093 != null) {
                class235.field4093.method58(true, class20.field379);
            }
            class269.field4606.method724(-108);
            class271.method1804(class20.field379, 26130);
            class271.method1799((byte) 6, class20.field379);
            if (class235.field4093 != null) {
                class235.field4093.method60(false, class20.field379);
            }
        } else {
            class20.field379.setSize(class142.field2585, class119.field2087);
            if (class43.field946 == var7) {
                Insets var9 = class43.field946.getInsets();
                class20.field379.setLocation(var9.left + class129.field2255, class245.field4296 + var9.top);
            } else {
                class20.field379.setLocation(class129.field2255, class245.field4296);
            }
        }
        if (arg2 > arg1) {
            method712(true, 0, 0, -1, arg4, -1, true);
            return;
        }
        if (class84.field1573 != -1) {
            class101.method769((byte) -110, true);
        }
        if (class127.field2219 != null && (class264.field4507 == 30 || class264.field4507 == 25)) {
            class208.method1394(34);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class166.field2941[var10] = true;
        }
        class240.field4220 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
    public static final void method713(int arg0, byte arg1) {
        field1690++;
        class270 var2 = class202.method1368(arg1 ^ 0x15, 9, arg0);
        var2.method1795(-2113);
        if (arg1 != -28) {
            method705((byte) -59, -97, 3);
        }
    }
}
