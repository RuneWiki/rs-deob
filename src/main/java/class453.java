import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class453 extends class9 {

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Ldm;")
    public class46 field6396 = new class46();

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "Lel;")
    public class468 field6407 = new class468();

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Lkb;")
    private class592 field6395;

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "Lvf;")
    public static class131 field6402 = new class131();

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "Lcba;")
    public static class471 field6405 = new class471(17, 5);

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "Ldv;")
    public static class566 field6406 = new class566(44, 3);

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "()Lff;")
    public final class9 method53() {
        field6398++;
        class349 var1 = (class349) this.field6396.method456((byte) -94);
        if (var1 == null) {
            return null;
        } else if (var1.field4689 == null) {
            return this.method52();
        } else {
            return var1.field4689;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZIIII)V")
    public static final void method2660(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class87.field1383 != null && (arg3 != 3 || class491.field6875.field3379 != arg2 || class491.field6875.field3355 != arg5)) {
            class634.method3681(class500.field6968, 12837, class87.field1383);
            class87.field1383 = null;
        }
        field6393++;
        if (arg3 == 3 && class87.field1383 == null) {
            class87.field1383 = class623.method3633(-2, arg2, 0, 0, arg5, class500.field6968);
            if (class87.field1383 != null) {
                class491.field6875.field3355 = arg5;
                class491.field6875.field3379 = arg2;
                class491.field6875.method2607((byte) -117, class500.field6968);
            }
        }
        if (arg3 == 3 && class87.field1383 == null) {
            method2660((byte) 44, true, -1, class491.field6875.field3359, arg4, -1);
            return;
        }
        Container var6;
        if (class87.field1383 != null) {
            var6 = class87.field1383;
            class178.field2543 = arg5;
            class342.field4611 = arg2;
        } else if (class233.field3284 == null) {
            var6 = class500.field6968.field3975;
            class342.field4611 = var6.getSize().width;
            class178.field2543 = var6.getSize().height;
        } else {
            Insets var7 = class233.field3284.getInsets();
            int var10001 = var7.left + var7.right;
            class342.field4611 = class233.field3284.getSize().width - var10001;
            class178.field2543 = class233.field3284.getSize().height - var7.top - var7.bottom;
            var6 = class233.field3284;
        }
        if (arg3 == 1) {
            class387.field5196 = class209.field2954;
            class32.field519 = (class342.field4611 - class209.field2954) / 2;
            class134.field2128 = class78.field1266;
            class272.field3787 = 0;
        } else if (class366.field4987 < 96 && class103.field1570 == 0) {
            int var8 = class342.field4611 > 1024 ? 1024 : class342.field4611;
            class387.field5196 = var8;
            class32.field519 = (class342.field4611 - var8) / 2;
            int var9 = class178.field2543 > 768 ? 768 : class178.field2543;
            class272.field3787 = 0;
            class134.field2128 = var9;
        } else {
            class272.field3787 = 0;
            class32.field519 = 0;
            class387.field5196 = class342.field4611;
            class134.field2128 = class178.field2543;
        }
        if (class71.field1181 != class53.field988) {
            boolean var10000;
            if (class387.field5196 < 1024 && class134.field2128 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class91.method665((byte) 112);
        } else {
            class166.field2390.setSize(class387.field5196, class134.field2128);
            class69.field1165.method1275(class166.field2390);
            if (class233.field3284 == var6) {
                Insets var10 = class233.field3284.getInsets();
                class166.field2390.setLocation(var10.left + class32.field519, var10.top - -class272.field3787);
            } else {
                class166.field2390.setLocation(class32.field519, class272.field3787);
            }
        }
        if (arg3 < 2) {
            class571.field7879 = false;
        } else {
            class571.field7879 = true;
        }
        if (class56.field1005 != -1) {
            class443.method2621(true, false);
        }
        if (class143.field2203 != null && class587.method3447(class440.field6254, -28130)) {
            class86.method646(-44);
        }
        int var11 = 26 % ((-arg0 - 19) / 63);
        for (int var12 = 0; var12 < 100; var12++) {
            class48.field940[var12] = true;
        }
        class190.field2693 = true;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "()I")
    public final int method51() {
        field6397++;
        return 0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public final void method54(int arg0) {
        this.field6407.method54(arg0);
        field6399++;
        for (class349 var2 = (class349) this.field6396.method456((byte) -122); var2 != null; var2 = (class349) this.field6396.method460((byte) -88)) {
            if (!this.field6395.method3478(var2, -115)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4692) {
                        this.method2663(-90, var2, var3);
                        var2.field4692 -= var3;
                        break;
                    }
                    this.method2663(-96, var2, var2.field4692);
                    var3 -= var2.field4692;
                } while (!this.field6395.method3471(0, var3, null, var2, true));
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILdg;IB[I)V")
    private final void method2661(int arg0, int arg1, class349 arg2, int arg3, byte arg4, int[] arg5) {
        if ((this.field6395.field8511[arg2.field4678] & 0x4) != 0 && arg2.field4674 < 0) {
            int var7 = this.field6395.field8463[arg2.field4678] / class223.field3180;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field4675) / var7;
                if (arg0 < var8) {
                    arg2.field4675 += arg0 * var7;
                    break;
                }
                arg2.field4689.method55(arg5, arg1, var8);
                arg0 -= var8;
                arg2.field4675 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class223.field3180 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class260 var11 = arg2.field4689;
                if (this.field6395.field8488[arg2.field4678] == 0) {
                    arg2.field4689 = class260.method1683(arg2.field4685, var11.method1671(), var11.method1679(), var11.method1674());
                } else {
                    arg2.field4689 = class260.method1683(arg2.field4685, var11.method1671(), 0, var11.method1674());
                    this.field6395.method3472(arg2.field4680.field85[arg2.field4699] < 0, (byte) -42, arg2);
                    arg2.field4689.method1668(var9, var11.method1679());
                }
                if (arg2.field4680.field85[arg2.field4699] < 0) {
                    arg2.field4689.method1696(-1);
                }
                var11.method1678(var9);
                var11.method55(arg5, arg1, arg3 - arg1);
                if (var11.method1667()) {
                    this.field6407.method2733(var11);
                }
            }
        }
        if (arg4 > -76) {
            method2662((byte) 126);
        }
        field6394++;
        arg2.field4689.method55(arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "()Lff;")
    public final class9 method52() {
        field6401++;
        class349 var1;
        do {
            var1 = (class349) this.field6396.method460((byte) 90);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4689 == null);
        return var1.field4689;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([III)V")
    public final void method55(int[] arg0, int arg1, int arg2) {
        field6400++;
        this.field6407.method55(arg0, arg1, arg2);
        for (class349 var4 = (class349) this.field6396.method456((byte) -36); var4 != null; var4 = (class349) this.field6396.method460((byte) -123)) {
            if (!this.field6395.method3478(var4, -112)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4692 >= var6) {
                        this.method2661(var6, var5, var4, var5 + var6, (byte) -89, arg0);
                        var4.field4692 -= var6;
                        break;
                    }
                    this.method2661(var4.field4692, var5, var4, var5 + var6, (byte) -85, arg0);
                    var5 += var4.field4692;
                    var6 -= var4.field4692;
                } while (!this.field6395.method3471(var5, var6, arg0, var4, true));
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static void method2662(byte arg0) {
        if (arg0 > 30) {
            field6406 = null;
            field6405 = null;
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILdg;I)V")
    private final void method2663(int arg0, class349 arg1, int arg2) {
        if (arg0 > -84) {
            this.field6395 = null;
        }
        field6404++;
        if ((this.field6395.field8511[arg1.field4678] & 0x4) != 0 && arg1.field4674 < 0) {
            int var4 = this.field6395.field8463[arg1.field4678] / class223.field3180;
            int var5 = (var4 + 1048575 - arg1.field4675) / var4;
            arg1.field4675 = arg2 * var4 + arg1.field4675 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field6395.field8488[arg1.field4678] == 0) {
                    arg1.field4689 = class260.method1683(arg1.field4685, arg1.field4689.method1671(), arg1.field4689.method1679(), arg1.field4689.method1674());
                } else {
                    arg1.field4689 = class260.method1683(arg1.field4685, arg1.field4689.method1671(), 0, arg1.field4689.method1674());
                    this.field6395.method3472(arg1.field4680.field85[arg1.field4699] < 0, (byte) 75, arg1);
                }
                if (arg1.field4680.field85[arg1.field4699] < 0) {
                    arg1.field4689.method1696(-1);
                }
                arg2 = arg1.field4675 / var4;
            }
        }
        arg1.field4689.method54(arg2);
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lkb;)V")
    public class453(class592 arg0) {
        this.field6395 = arg0;
    }
}
