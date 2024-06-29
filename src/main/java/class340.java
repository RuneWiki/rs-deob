import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class340 extends class117 {

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public int field4647 = 0;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLvb;IIILjava/lang/String;IILss;Lms;ILoj;)V", line = 6)
    public static final void method2013(byte arg0, class90 arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7, class76 arg8, class363 arg9, int arg10, class485 arg11) {
        if (arg0 != 101) {
            method2014(-106, (byte) -99);
        }
        field4648++;
        int var12;
        if (class375.field5312 == 4) {
            var12 = (int) class418.field5750 & 0x3FFF;
        } else {
            var12 = (int) class418.field5750 + class361.field5042 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field5101 / 2, arg9.field5200 / 2) + 10;
        int var14 = arg4 * arg4 + arg6 * arg6;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class432.field5955[var12];
        int var16 = class432.field5957[var12];
        if (class375.field5312 != 4) {
            var15 = var15 * 256 / (class351.field4804 + 256);
            var16 = var16 * 256 / (class351.field4804 + 256);
        }
        int var17 = arg4 * var15 + arg6 * var16 >> 15;
        int var18 = arg4 * var16 - (arg6 * var15) >> 15;
        int var19 = arg8.method527(arg5, 100, arg0 + 154, (class385[]) null);
        int var20 = var17 - var19 / 2;
        int var21 = arg8.method519(arg5, -16019, 0, (class385[]) null, 100);
        if (-arg9.field5101 <= var20 && var20 <= arg9.field5101 && -arg9.field5200 <= var18 && arg9.field5200 >= var18) {
            arg11.method2844(arg2, arg9.field5200 / 2 + arg7 - var21 - var18 - arg10, 0, 0, 50, 1, arg1, var20 + (arg9.field5101 / 2) + arg2, 0, -110, arg5, arg7, var19, arg3, (int[]) null, (class385[]) null);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method2014(int arg0, byte arg1) {
        if (class70.field1040 == 0) {
            class224.field3181.method281(arg0, arg1 - 178);
        } else {
            class71.field1041 = arg0;
        }
        if (arg1 == 64) {
            field4643++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILlk;)V", line = 71)
    public final void method2015(int arg0, class425 arg1) {
        int var3 = -40 % ((41 - arg0) / 54);
        while (true) {
            int var4 = arg1.method2503(true);
            if (var4 == 0) {
                field4644++;
                return;
            }
            this.method2017(arg1, 2, var4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 93)
    public static final void method2016(int arg0, int arg1, int arg2) {
        if (arg0 != -830) {
            return;
        }
        field4645++;
        class39.field671++;
        class131.method793(class392.field5518, 105);
        class366.field5214.method2501(arg1, -128);
        class366.field5214.method2487(0, arg2);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Llk;II)V", line = 111)
    private final void method2017(class425 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field4647 = arg0.method2508(true);
        }
        field4646++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ln;", line = 125)
    public static final class435 method2018(Throwable arg0, String arg1) {
        field4642++;
        class435 var2;
        if ((arg0 instanceof class435)) {
            var2 = (class435) arg0;
            var2.field5975 = var2.field5975 + ' ' + arg1;
        } else {
            var2 = new class435(arg0, arg1);
        }
        return var2;
    }
}
