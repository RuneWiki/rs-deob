import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class123 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lcd;")
    public class90 field1370 = null;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lcd;")
    public class90 field1372 = null;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[Lg;")
    public class555[] field1374 = null;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[Lg;")
    public class555[] field1375 = null;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lcd;")
    public class90 field1377 = null;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public boolean field1373;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lcq;")
    public static class110 field1378 = new class110(8, 14);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lcq;")
    public static class110 field1380 = new class110(89, 11);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lsb;")
    public static class305 field1381 = new class305(5, 3);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 5)
    public static final void method707(int arg0, int arg1) {
        if (class533.field7494 == 1) {
            class475.field6853 = arg0;
        } else if (class533.field7494 == 2 || class533.field7494 == 3) {
            class89.field890 = arg0;
        }
        field1376++;
        if (arg1 != -4) {
            method707(121, -94);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvj;)V", line = 101)
    public class123(class422 arg0) {
        this.field1373 = arg0.field5893;
        class112.method597(arg0, 128);
        if (this.field1373) {
            byte[] var2 = class684.method3787(false, class271.field3378, 125);
            this.field1372 = new class90(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class684.method3787(false, class289.field3614, 109);
            this.field1377 = new class90(arg0, 6410, 128, 128, 16, var3, 6410);
            class168 var4 = arg0.field5822;
            if (var4.method916(-72)) {
                byte[] var5 = class684.method3787(false, class619.field8754, 112);
                this.field1370 = new class90(arg0, 6408, 128, 128, 16);
                class90 var6 = new class90(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method918(true, 2.0F, this.field1370, var6)) {
                    this.field1370.method1836(4983);
                } else {
                    this.field1370.method1834((byte) 119);
                    this.field1370 = null;
                }
                var6.method1834((byte) 123);
                return;
            }
        } else {
            this.field1374 = new class555[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class667.method3696(32768, var7 * 128 * 128 * 2, 98, class271.field3378);
                this.field1374[var7] = new class555(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field1375 = new class555[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class667.method3696(32768, var8 * 128 * 256, 67, class289.field3614);
                this.field1375[var8] = new class555(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Z", line = 26)
    public static final boolean method708(int arg0) {
        field1371++;
        if (arg0 < 7) {
            field1378 = null;
        }
        try {
            class107 var1 = new class107();
            byte[] var2 = var1.method582(class352.field4750, -6719);
            class345.method2059(3136, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZI)V", line = 51)
    public static final void method709(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            return;
        }
        field1379++;
        if (class93.field949 <= arg1 && class360.field4834 >= arg1) {
            int var5 = class266.method1567(class412.field5526, arg3, class72.field740, arg0);
            int var6 = class266.method1567(class412.field5526, true, class72.field740, arg4);
            class443.method2567(var6, arg1, arg2, 16767564, var5);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 70)
    public static void method710(byte arg0) {
        field1381 = null;
        field1380 = null;
        field1378 = null;
        if (arg0 <= 55) {
            method709(39, -4, 20, false, -47);
        }
    }
}
