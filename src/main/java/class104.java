import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class104 extends class170 {

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public int field1432 = -1;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field1443 = 0;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public int field1445 = 12800;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public int field1437 = -1;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public int field1444 = 0;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field1428 = 12800;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Z")
    public boolean field1446 = true;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
    public String field1429;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Ljava/lang/String;")
    public String field1453;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Ljm;")
    public class162 field1454;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "J")
    public static long field1430 = -1L;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
    public static int[] field1449 = new int[13];

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1452 = 20;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1447;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
    public final boolean method784(int arg0, int arg1, int arg2) {
        field1451++;
        for (class428 var4 = (class428) this.field1454.method1173(0); var4 != null; var4 = (class428) this.field1454.method1165(true)) {
            if (var4.method2638(arg2, arg1, (byte) 96)) {
                return true;
            }
        }
        if (arg0 != 8423) {
            this.field1454 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lsk;ILsk;)V")
    public static final void method785(class170 arg0, int arg1, class170 arg2) {
        if (arg2.field2408 != null) {
            arg2.method1213((byte) 106);
        }
        field1439++;
        arg2.field2409 = arg0.field2409;
        arg2.field2408 = arg0;
        arg2.field2408.field2409 = arg2;
        if (arg1 == -1) {
            arg2.field2409.field2408 = arg2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLij;Lij;)I")
    public static final int method786(byte arg0, class316 arg1, class316 arg2) {
        field1450++;
        int var3 = 112 / ((arg0 - 5) / 35);
        int var4 = 0;
        if (arg1.method1930((byte) 90, class156.field2224)) {
            var4++;
        }
        if (arg1.method1930((byte) -123, class366.field5083)) {
            var4++;
        }
        if (arg1.method1930((byte) -127, class394.field5476)) {
            var4++;
        }
        if (arg2.method1930((byte) -113, class156.field2224)) {
            var4++;
        }
        if (arg2.method1930((byte) -115, class366.field5083)) {
            var4++;
        }
        if (arg2.method1930((byte) 19, class394.field5476)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[IB)Z")
    public final boolean method787(int arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        field1435++;
        for (class428 var6 = (class428) this.field1454.method1173(0); var6 != null; var6 = (class428) this.field1454.method1165(true)) {
            if (var6.method2640((byte) 13, arg2, arg0, arg1)) {
                var6.method2642(arg2, 31, arg3, arg1);
                return true;
            }
        }
        if (arg4 != 64) {
            method786((byte) 124, (class316) null, (class316) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIZI)Z")
    public final boolean method788(int[] arg0, int arg1, boolean arg2, int arg3) {
        field1441++;
        class428 var5 = (class428) this.field1454.method1173(0);
        if (!arg2) {
            this.method788((int[]) null, 62, false, 104);
        }
        while (var5 != null) {
            if (var5.method2635(arg1, arg3, (byte) 114)) {
                var5.method2637(arg0, 91, arg3, arg1);
                return true;
            }
            var5 = (class428) this.field1454.method1165(arg2);
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public final void method789(byte arg0) {
        this.field1445 = 12800;
        field1431++;
        this.field1443 = 0;
        this.field1444 = 0;
        if (arg0 < 62) {
            this.method788((int[]) null, 47, true, -121);
        }
        this.field1428 = 12800;
        for (class428 var2 = (class428) this.field1454.method1173(0); var2 != null; var2 = (class428) this.field1454.method1165(true)) {
            if (var2.field5947 < this.field1428) {
                this.field1428 = var2.field5947;
            }
            if (var2.field5968 < this.field1445) {
                this.field1445 = var2.field5968;
            }
            if (var2.field5964 > this.field1444) {
                this.field1444 = var2.field5964;
            }
            if (var2.field5945 > this.field1443) {
                this.field1443 = var2.field5945;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static final void method790(int arg0) {
        if (arg0 != 16711680) {
            field1436 = -78;
        }
        field1440++;
        if (class251.field3504 < 0) {
            return;
        }
        long var1 = class199.method1372(30938);
        class251.field3504 = (int) ((long) class251.field3504 - (var1 - class406.field5622));
        if (class251.field3504 > 0) {
            int var3 = (class251.field3504 << 8) / class100.field1388;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class67.field941 = ((class317.field4319 & 0xFF00) * var3 + ((class389.field5404.field2058 & 0xFF00) * var4) & 0xFF0000) + ((class317.field4319 & 0xFF00FF) * var3 + (class389.field5404.field2058 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class337.field4559 = ((class230.field3238 & 0xFF00FF) * var3 + (class389.field5404.field2055 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class230.field3238 & 0xFF00) * var3 + (class389.field5404.field2055 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class53.field682 = (class389.field5404.field2062 - class213.field2978) * var6 + class213.field2978;
            class102.field1411 = (class389.field5404.field2065 - class115.field1755) * var6 + class115.field1755;
            class429.field5978 = class214.field2999 * var3 + class389.field5404.field2066 * var4 >> 8;
            class277.field3774 = (class389.field5404.field2057 - class185.field2618) * var6 + class185.field2618;
            class128.field1941 = (class389.field5404.field2063 - class34.field460) * var6 + class34.field460;
            class116.field1762 = (class389.field5404.field2052 - class65.field897) * var6 + class65.field897;
            class90.field1265 = (class389.field5404.field2064 - class177.field2503) * var6 + class177.field2503;
            if (class22.field285 != class389.field5404.field2059) {
                class18.field244 = class144.field2108.method255(class22.field285, class389.field5404.field2059, var6, class18.field244);
            }
        } else {
            class337.field4559 = class389.field5404.field2055;
            class102.field1411 = class389.field5404.field2065;
            class128.field1941 = class389.field5404.field2063;
            class429.field5978 = class389.field5404.field2066;
            class67.field941 = class389.field5404.field2058;
            class116.field1762 = class389.field5404.field2052;
            class90.field1265 = class389.field5404.field2064;
            class251.field3504 = -1;
            class53.field682 = class389.field5404.field2062;
            class277.field3774 = class389.field5404.field2057;
            class18.field244 = class389.field5404.field2059;
        }
        class406.field5622 = var1;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method791(int arg0) {
        field1449 = null;
        if (arg0 == 255) {
            field1447 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public static final void method792(int arg0, boolean arg1) {
        field1442++;
        if (arg1 == class141.field2071) {
            return;
        }
        class141.field2071 = arg1;
        class41.method351(64);
        if (arg0 != -1) {
            field1447 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI[II)Z")
    public final boolean method793(boolean arg0, int arg1, int[] arg2, int arg3) {
        field1438++;
        class428 var5 = (class428) this.field1454.method1173(0);
        if (arg0) {
            this.field1443 = -59;
        }
        while (var5 != null) {
            if (var5.method2638(arg3, arg1, (byte) 100)) {
                var5.method2642(arg1, 41, arg2, arg3);
                return true;
            }
            var5 = (class428) this.field1454.method1165(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class104(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1446 = arg5;
        this.field1437 = arg6;
        this.field1434 = arg3;
        this.field1429 = arg2;
        this.field1432 = arg4;
        this.field1448 = arg0;
        this.field1453 = arg1;
        if (this.field1437 == 255) {
            this.field1437 = 0;
        }
        this.field1454 = new class162();
    }
}
