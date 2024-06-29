import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class336 {

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lkh;")
    private class173 field4094 = new class173();

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lut;")
    private class719 field4095 = new class719();

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lrda;")
    private class467 field4099;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "S")
    public static short field4093 = 1;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    public static boolean field4097 = false;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Llq;")
    public static class210[] field4089;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ltia;I)V", line = 17)
    public static final void method1935(class740 arg0, int arg1) {
        field4096++;
        for (int var2 = 0; var2 < class404.field5371; var2++) {
            int var3 = class723.field9490[var2];
            class33 var4 = class263.field3508[var3];
            int var5 = arg0.method1509(true);
            if ((var5 & 0x20) != 0) {
                var5 += arg0.method1509(true) << 8;
            }
            if ((var5 & 0x8000) != 0) {
                var5 += arg0.method1509(true) << 16;
            }
            class427.method2473(arg0, var4, var5, (byte) -97, var3);
        }
        if (arg1 < 38) {
            method1937(54);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lkh;JI)V", line = 49)
    public final void method1936(class173 arg0, long arg1, int arg2) {
        if (arg2 > -96) {
            this.method1936(null, 59L, -4);
        }
        if (this.field4100 == 0) {
            class173 var5 = this.field4095.method3859(0);
            var5.method1946(-10364);
            var5.method1084((byte) 111);
            if (this.field4094 == var5) {
                class173 var6 = this.field4095.method3859(0);
                var6.method1946(-10364);
                var6.method1084((byte) 81);
            }
        } else {
            this.field4100--;
        }
        field4091++;
        this.field4099.method2619(arg0, arg1, -1);
        this.field4095.method3862(arg0, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 81)
    public static void method1937(int arg0) {
        field4089 = null;
        if (arg0 != 1) {
            method1940(111, -76, -60);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 98)
    public final void method1938(byte arg0) {
        this.field4095.method3860((byte) -127);
        field4101++;
        this.field4099.method2617(28812);
        this.field4094 = new class173();
        this.field4100 = this.field4098;
        if (arg0 >= -44) {
            this.field4100 = 76;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)V", line = 112)
    public final void method1939(long arg0, int arg1) {
        field4088++;
        class173 var4 = (class173) this.field4099.method2616(arg0, (byte) -102);
        int var5 = -14 / ((-arg1 - 38) / 53);
        if (var4 != null) {
            var4.method1946(-10364);
            var4.method1084((byte) -120);
            this.field4100++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z", line = 130)
    public static final boolean method1940(int arg0, int arg1, int arg2) {
        field4092++;
        if (!class168.method1068(arg0, 80, arg2)) {
            return false;
        } else if ((arg0 & 0x9000) != 0 | class645.method3490(arg0, arg2, -60) | class209.method1403(arg2, (byte) 51, arg0)) {
            return true;
        } else {
            if (arg1 != 8192) {
                field4097 = true;
            }
            return (arg2 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | class311.method1832(arg2, arg1 - 8068, arg0) | class791.method4327(arg2, arg0, (byte) -58));
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V", line = 192)
    public class336(int arg0) {
        this.field4098 = arg0;
        this.field4100 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4099 = new class467(var2);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)Lkh;", line = 165)
    public final class173 method1941(long arg0, byte arg1) {
        field4090++;
        class173 var4 = (class173) this.field4099.method2616(arg0, (byte) 88);
        if (var4 != null) {
            this.field4095.method3862(var4, false);
        }
        int var5 = -9 % ((arg1 - 13) / 33);
        return var4;
    }
}
