import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class329 extends class398 {

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Z")
    public static boolean field4789 = false;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field4790 = -1;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "Lcr;")
    public static class189 field4793 = new class189(64);

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
    public static int[] field4797 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Llm;")
    public static class347 field4796;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILwm;)V", line = 3)
    public static final void method2187(int arg0, class298 arg1) {
        ++field4787;
        if (arg1 instanceof class43) {
            class43 var2 = (class43) arg1;
            if (var2.field606 != null) {
                class83.method588(var2, (byte) -102);
            }
        } else {
            if (!(arg1 instanceof class25)) {
                return;
            }
            class364.method2378((byte) 80, (class25) arg1);
        }
        if (arg0 >= -93) {
            field4793 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnj;II)V", line = 30)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field4795;
        if (arg2 == -13132) {
            if (arg1 == 0) {
                super.field5931 = ~arg0.method1348(arg2 + 13007) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)I", line = 43)
    public static final int method2188(int arg0, int arg1) {
        if (arg0 != 127) {
            field4793 = null;
        }
        ++field4791;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 58)
    public static final void method2189(byte arg0) {
        ++field4786;
        if (class103.field1428 == null) {
            int var1 = class159.field2145;
            int var2 = class308.field4535;
            int var3 = class273.field3956 - (class138.field1907 - -var1);
            if (arg0 <= -34) {
                int var4 = class180.field2384 - class92.field1294 + -var2;
                if (var1 > 0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
                    try {
                        Container var5;
                        if (class374.field5447 == null) {
                            var5 = class76.field1085.field519;
                        } else {
                            var5 = class374.field5447;
                        }
                        int var6 = 0;
                        int var7 = 0;
                        if (class374.field5447 == var5) {
                            Insets var8 = class374.field5447.getInsets();
                            var6 = var8.left;
                            var7 = var8.top;
                        }
                        Graphics var9 = var5.getGraphics();
                        var9.setColor(Color.black);
                        if (var1 > 0) {
                            var9.fillRect(var6, var7, var1, class180.field2384);
                        }
                        if (var2 > 0) {
                            var9.fillRect(var6, var7, class273.field3956, var2);
                        }
                        if (var3 > 0) {
                            var9.fillRect(var6 - -class273.field3956 - var3, var7, var3, class180.field2384);
                        }
                        if (var4 > 0) {
                            var9.fillRect(var6, -var4 + var7 + class180.field2384, class273.field3956, var4);
                            return;
                        }
                    } catch (Exception var10) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lge;", line = 127)
    public static final class104 method2190(byte arg0, int arg1) {
        ++field4788;
        class189 var2 = class240.field3217;
        class104 var3;
        synchronized (class240.field3217) {
            var3 = (class104) class240.field3217.method1137((long) arg1, 2108653711);
        }
        if (var3 != null) {
            return var3;
        } else {
            if (arg0 != 63) {
                field4798 = -124;
            }
            byte[] var4 = class276.field3991.method2261(class192.method1159(86, arg1), class62.method433(false, arg1), arg0 + 30);
            class104 var5 = new class104();
            var5.field1507 = arg1;
            if (var4 != null) {
                var5.method694((byte) -115, new class228(var4));
            }
            var5.method699((byte) 86);
            if (var5.field1476) {
                var5.field1442 = false;
                var5.field1483 = 0;
            }
            if (!class173.field2305 && var5.field1437) {
                var5.field1458 = null;
                var5.field1484 = null;
            }
            class189 var6 = class240.field3217;
            synchronized (class240.field3217) {
                class240.field3217.method1144((long) arg1, var5, arg0 ^ -3497);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 183)
    public class329() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I", line = 187)
    public final int[] method95(int arg0, int arg1) {
        ++field4794;
        if (arg1 != 0) {
            field4790 = -117;
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 89);
        if (super.field5927.field591) {
            int[] var4 = this.method2558(0, arg1 + 29295, arg0);
            for (int var5 = 0; ~var5 > ~class140.field1922; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I", line = 221)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != 2) {
            return null;
        } else {
            ++field4792;
            int[][] var3 = super.field5933.method2205((byte) -114, arg0);
            if (super.field5933.field4847) {
                int[][] var4 = this.method2561(arg0, (byte) -90, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class140.field1922 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V", line = 267)
    public static void method2191(byte arg0) {
        field4796 = null;
        field4797 = null;
        if (arg0 >= -48) {
            field4799 = 121;
        }
        field4793 = null;
    }
}
