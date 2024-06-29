import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class224 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lge;")
    private class511 field3406 = new class511(64);

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lci;")
    private class320 field3402;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lci;")
    private class320 field3400;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lbd;")
    public static class44 field3401 = new class44("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lqv;")
    public static class316 field3405 = new class316(17, 0);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lci;")
    public static class320 field3404;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZZ)V")
    public static final void method1513(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        field3403++;
        if (class230.field3443 != null && (arg1 != 3 || class220.field3371.field2584 != arg2 || class220.field3371.field2588 != arg3)) {
            class474.method2815(false, class230.field3443, class280.field4173);
            class230.field3443 = null;
        }
        if (arg1 == 3 && class230.field3443 == null) {
            class230.field3443 = class402.method2406(arg2, 0, arg3, class280.field4173, 0, arg4);
            if (class230.field3443 != null) {
                class220.field3371.field2588 = arg3;
                class220.field3371.field2584 = arg2;
                class220.field3371.method1044(1, class280.field4173);
            }
        }
        if (arg1 == 3 && class230.field3443 == null) {
            method1513(arg0, class220.field3371.field2580, -1, -1, false, true);
            return;
        }
        Container var6;
        if (class230.field3443 != null) {
            class228.field3431 = arg2;
            class299.field4463 = arg3;
            var6 = class230.field3443;
        } else if (class70.field1153 == null) {
            var6 = class280.field4173.field5824;
            class228.field3431 = var6.getSize().width;
            class299.field4463 = var6.getSize().height;
        } else {
            Insets var7 = class70.field1153.getInsets();
            int var10001 = var7.right + var7.left;
            class228.field3431 = class70.field1153.getSize().width - var10001;
            int var12 = -var7.top;
            class299.field4463 = class70.field1153.getSize().height + var12 - var7.bottom;
            var6 = class70.field1153;
        }
        if (arg4) {
            field3404 = null;
        }
        if (arg1 == 1) {
            class76.field1247 = class219.field3349;
            class245.field3670 = 0;
            class360.field5250 = (class228.field3431 - class277.field4136) / 2;
            class50.field927 = class277.field4136;
        } else if (class414.field5859 < 96 && class74.field1211 == 0) {
            int var8 = class228.field3431 > 1024 ? 1024 : class228.field3431;
            class360.field5250 = (class228.field3431 - var8) / 2;
            class50.field927 = var8;
            int var9 = class299.field4463 > 768 ? 768 : class299.field4463;
            class76.field1247 = var9;
            class245.field3670 = 0;
        } else {
            class50.field927 = class228.field3431;
            class245.field3670 = 0;
            class76.field1247 = class299.field4463;
            class360.field5250 = 0;
        }
        if (class438.field6237 != class368.field5320) {
            boolean var10000;
            if (class50.field927 < 1024 && class76.field1247 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class27.method163(false);
        } else {
            class481.field6991.setSize(class50.field927, class76.field1247);
            class76.field1256.method362(class481.field6991);
            if (class70.field1153 == var6) {
                Insets var10 = class70.field1153.getInsets();
                class481.field6991.setLocation(class360.field5250 + var10.left, var10.top - -class245.field3670);
            } else {
                class481.field6991.setLocation(class360.field5250, class245.field3670);
            }
        }
        if (arg1 < 2) {
            class128.field2000 = false;
        } else {
            class128.field2000 = true;
        }
        if (class188.field2765 != -1) {
            class198.method1343(true, -1);
        }
        if (class410.field5802 != null && class171.method1210(class37.field799, -11)) {
            class507.method2954(false);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class25.field361[var11] = true;
        }
        class304.field4511 = true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)Lov;")
    public final class126 method1514(int arg0, byte arg1) {
        if (arg1 >= -118) {
            field3405 = null;
        }
        field3399++;
        class126 var3 = (class126) this.field3406.method2982(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field3402.method2037(arg0, (byte) -56, 0);
        } else {
            var4 = this.field3400.method2037(arg0 & 0x7FFF, (byte) -62, 0);
        }
        class126 var5 = new class126();
        if (var4 != null) {
            var5.method933(new class519(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method936((byte) -23);
        }
        this.field3406.method2981(var5, 106, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)I")
    public static final int method1515(int arg0, int arg1, int arg2, int arg3) {
        field3398++;
        if (class146.field2262 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        if (arg3 != -631749433) {
            return -96;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || class69.field1139 - 1 < var4 || (class255.field3763 - 1) < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class234.field3497[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class146.field2262[var6].method143(arg0, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        field3405 = null;
        int var1 = 98 / ((arg0 + 5) / 63);
        field3404 = null;
        field3401 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ILci;Lci;)V")
    public class224(int arg0, class320 arg1, class320 arg2) {
        this.field3402 = arg1;
        this.field3400 = arg2;
        if (this.field3402 != null) {
            this.field3402.method2030(-10914, 0);
        }
        if (this.field3400 != null) {
            this.field3400.method2030(-10914, 0);
        }
    }
}
