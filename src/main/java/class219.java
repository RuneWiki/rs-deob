import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class219 implements class134 {

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lkda;")
    private class356 field2831;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Ljn;")
    private class668 field2835;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Ljk;")
    public static class585 field2830 = new class585(64, 3);

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lwo;")
    public static class690 field2838 = new class690(78, -2);

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lwo;")
    public static class690 field2839 = new class690(12, 3);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "Lf;")
    private class701 field2834;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "[I")
    public static int[] field2836;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1325(byte arg0) {
        field2827++;
        class537.method3155((byte) -120, (long) class543.field7882, class68.field1045);
        if (class127.field1619 != -1) {
            class591.method3430(64, class127.field1619);
        }
        for (int var1 = 0; var1 < class643.field9183; var1++) {
            if (class89.field1253[var1]) {
                class325.field4339[var1] = true;
            }
            class404.field5699[var1] = class89.field1253[var1];
            class89.field1253[var1] = false;
        }
        if (arg0 > -43) {
            field2838 = null;
        }
        class353.field4716 = class543.field7882;
        if (class127.field1619 != -1) {
            class643.field9183 = 0;
            class336.method1938(0);
        }
        class68.field1045.method249();
        class286.method1707(122, class68.field1045);
        int var2 = class686.method3885((byte) 43);
        if (var2 == -1) {
            var2 = class10.field99;
        }
        if (var2 == -1) {
            var2 = class208.field2540;
        }
        class257.method1565(-1, var2);
        class456.field6422 = 0;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIILrda;)V", line = 55)
    public static final void method1326(boolean arg0, int arg1, int arg2, class613 arg3) {
        field2829++;
        int[] var4 = new int[4];
        class252.method1539(var4, 0, var4.length, arg1);
        class382.method2203(arg2, arg3, var4, (byte) -85);
        if (!arg0) {
            method1326(false, -17, -34, null);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 74)
    public final void method749(int arg0) {
        this.field2834 = class273.method1638((byte) -102, this.field2835, this.field2831.field4751);
        if (arg0 != 27471) {
            method1325((byte) 30);
        }
        field2837++;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 85)
    public static final Class method1327(String arg0, int arg1) throws ClassNotFoundException {
        field2832++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg1 != 15966) {
                field2830 = null;
            }
            if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V", line = 122)
    public static void method1328(byte arg0) {
        field2839 = null;
        field2838 = null;
        int var1 = -102 / ((arg0 + 57) / 60);
        field2836 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z", line = 136)
    public final boolean method753(int arg0) {
        field2826++;
        if (arg0 != -29791) {
            method1325((byte) -97);
        }
        return this.field2835.method3802(this.field2831.field4751, (byte) 115);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BZ)V", line = 147)
    public final void method893(byte arg0, boolean arg1) {
        field2828++;
        if (arg0 != -61) {
            this.method749(-33);
        }
        if (!arg1) {
            return;
        }
        int var3 = class589.field8535 < class467.field6533 ? class467.field6533 : class589.field8535;
        int var4 = class6.field60 < class300.field4038 ? class300.field4038 : class6.field60;
        int var5 = this.field2834.method896();
        int var6 = this.field2834.method901();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var10 = 0;
            var9 = var4;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field2834.method3925(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljn;Lkda;)V", line = 193)
    public class219(class668 arg0, class356 arg1) {
        this.field2831 = arg1;
        this.field2835 = arg0;
    }
}
