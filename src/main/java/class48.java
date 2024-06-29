import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class48 implements class716 {

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lkd;")
    private class284 field681;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "Lnd;")
    private class547 field684;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lkg;")
    public static class275 field686 = new class275(56, 11);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Liea;")
    private class481 field679;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lpfa;B)I")
    public static final int method364(class299 arg0, byte arg1) {
        int var2 = -95 % ((-arg1 - 45) / 56);
        field687++;
        if (class476.field6418 == arg0) {
            return 7681;
        } else if (class405.field5120 == arg0) {
            return 8448;
        } else if (class740.field10325 == arg0) {
            return 34165;
        } else if (class155.field2108 == arg0) {
            return 260;
        } else if (class257.field3259 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILha;)V")
    public static final void method365(int arg0, class60 arg1) {
        field680++;
        if (class503.field7104.method3666(arg0) == 0) {
            return;
        }
        if (class748.field10451.field10399.method1924((byte) -118) == 0) {
            for (class167 var2 = (class167) class503.field7104.method3672(-1); var2 != null; var2 = (class167) class503.field7104.method3662(-1)) {
                class21.field381.method1585(false, var2.field2324, false, class164.field2272, arg1, var2.field2321, var2.field2318 ? class380.field4847.field10081 : null, var2.field2320, var2.field2325, arg1, 42, var2.field2322);
                var2.method1175(-2);
            }
            class433.method2476(-59);
            return;
        }
        if (class520.field7296 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class520.field7296 = class139.method1018(-127, 0, var3, class124.field1793, 0, class168.field2329);
            class66.field952 = class520.field7296.method500(class739.method4118(class656.field9123, 0, class445.field5928, -1072), class728.method4067(class268.field3369, class656.field9123, 0), true);
        }
        for (class167 var4 = (class167) class503.field7104.method3672(-1); var4 != null; var4 = (class167) class503.field7104.method3662(-1)) {
            class21.field381.method1585(false, var4.field2324, false, class66.field952, class520.field7296, var4.field2321, var4.field2318 ? class380.field4847.field10081 : null, var4.field2320, var4.field2325, arg1, 102, var4.field2322);
            var4.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public final void method366(int arg0) {
        if (arg0 == 18295) {
            field682++;
            this.field679 = class533.method3062(-107, this.field681.field3578, this.field684);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIII)V")
    public static final void method367(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class748.field10451.field10402.method4186((byte) 80) * arg1 >> 8;
        field685++;
        if (arg3 <= 56) {
            field686 = null;
        }
        if (arg2 == -1 && !class87.field1208) {
            class754.method4194(1);
        } else if (arg2 != -1 && (class309.field4068 != arg2 || !class453.method2546((byte) 69)) && var4 != 0 && !class87.field1208) {
            class373.method2146(-9854, var4, 0, class87.field1210, false, arg0, arg2);
            class638.method3575(36);
        }
        if (class309.field4068 != arg2) {
            class292.field3841 = null;
        }
        class309.field4068 = arg2;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        field683++;
        if (arg0) {
            int var3 = class482.field6548 >= class356.field4586 ? class482.field6548 : class356.field4586;
            int var4 = class466.field6263 <= class478.field6509 ? class478.field6509 : class466.field6263;
            int var5 = this.field679.method142();
            int var6 = this.field679.method149();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var10 = 0;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field679.method2760(var7, var10, var8, var9);
        }
        if (arg1 >= -57) {
            method364(null, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        if (arg0 != 11107) {
            this.field681 = null;
        }
        field678++;
        return this.field684.method3154(this.field681.field3578, (byte) 98);
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lnd;Lkd;)V")
    public class48(class547 arg0, class284 arg1) {
        this.field681 = arg1;
        this.field684 = arg0;
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
    public static void method370(int arg0) {
        field686 = null;
        if (arg0 < 62) {
            field686 = null;
        }
    }
}
