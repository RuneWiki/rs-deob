import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class721 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ltja;")
    private class288 field10128 = new class288(256);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Ld;")
    private class162 field10125;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lwg;")
    private class449 field10123;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[I")
    public static int[] field10130 = new int[1000];

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    public static int[] field10126;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 3)
    public final void method4082(byte arg0) {
        this.field10128.method1694(5, -29);
        field10124++;
        if (arg0 >= -42) {
            method4085(2);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 18)
    public final void method4083(int arg0) {
        this.field10128.method1690(0);
        field10129++;
        if (arg0 != -3) {
            method4085(91);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lada;", line = 29)
    public final class175 method4084(int arg0, int arg1) {
        field10127++;
        Object var3 = this.field10128.method1684((long) arg0, -359);
        if (var3 != null) {
            return (class175) var3;
        } else if (this.field10125.method1137(arg1 - 9914, arg0)) {
            class359 var4 = this.field10125.method1138(arg0, 46);
            if (arg1 != 22343) {
                this.method4083(108);
            }
            int var5 = var4.field4451 ? 64 : this.field10123.field6300;
            class175 var7;
            if (var4.field4465 && this.field10123.method54()) {
                float[] var6 = this.field10125.method1136(var5, arg0, var5, 0.7F, false, arg1 ^ 0xFFFFA8CB);
                var7 = this.field10123.method2708(var5, class141.field1759, var4.field4453 != 0, var5, var6, 92);
            } else {
                int[] var8;
                if (var4.field4457 != 2 && class16.method203(var4.field4459, (byte) 55)) {
                    var8 = this.field10125.method1135(arg0, 0.7F, true, var5, var5, (byte) -26);
                } else {
                    var8 = this.field10125.method1139(arg0, 11196, false, var5, var5, 0.7F);
                }
                var7 = this.field10123.method2712(var4.field4453 != 0, var5, var5, arg1 ^ 0x5747, var8);
            }
            var7.method1198(var4.field4447, var4.field4460, (byte) -123);
            this.field10128.method1686(arg1 - 47981, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 77)
    public static void method4085(int arg0) {
        field10126 = null;
        int var1 = 42 % ((-arg0 - 83) / 36);
        field10130 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lwg;Ld;)V", line = 101)
    public class721(class449 arg0, class162 arg1) {
        this.field10125 = arg1;
        this.field10123 = arg0;
    }
}
