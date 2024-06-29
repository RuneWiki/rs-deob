import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class211 implements class219 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lpj;")
    private static class237 field3595 = class33.method353("red:", 123);

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3596 = 3353893;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lpj;")
    public static class237 field3594 = class33.method353("Lade Wordpack )2 ", 28);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lpj;")
    public static class237 field3592 = field3595;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lpj;")
    public static class237 field3598 = class33.method353("leuchten1:", 43);

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lpj;")
    public static class237 field3600 = field3595;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lpj;")
    public static class237 field3603 = class33.method353("Versteckt", 92);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILpj;)V")
    public static final void method1410(int arg0, class237 arg1) {
        field3597++;
        if (arg0 > -67) {
            field3598 = null;
        }
        class117.field2050 = arg1;
        if (class268.field4572.field1306 == null) {
            return;
        }
        try {
            class237 var2 = class39.field888.method1584(-128, class268.field4572.field1306);
            class237 var3 = class260.field4460.method1584(-127, class268.field4572.field1306);
            class237 var4 = class238.method1626(new class237[] { var2, class69.field1371, arg1, class36.field806, var3 }, -10);
            class237 var5;
            if (arg1.method1588(false) == 0) {
                var5 = class238.method1626(new class237[] { var4, class54.field1123 }, -84);
            } else {
                var5 = class238.method1626(new class237[] { var4, class255.field4376, class31.method287(class181.method1244((byte) -91) + 94608000000L, 5), class131.field2310, class273.method1822((byte) 90, 94608000L) }, -30);
            }
            class238.method1626(new class237[] { class87.field1589, var5, class147.field2620 }, -22).method1576(class268.field4572.field1306, -31535);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method1411(int arg0, int arg1) {
        class43.field953 = arg0;
        class55.field1144 = null;
        if (arg1 != -25906) {
            method1411(10, -3);
        }
        class193.field3340 = -1;
        class230.field3942 = -1;
        class199.field3452 = 0;
        class41.field930 = 1;
        field3599++;
        class62.field1248 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[IJ)Lpj;")
    public final class237 method1412(int arg0, int arg1, int[] arg2, long arg3) {
        field3602++;
        if (arg1 == 0) {
            class131 var6 = class59.method508(-23216, arg2[0]);
            return var6.method927(25606, (int) arg3);
        } else if (arg1 == 1 || arg1 == 10) {
            class8 var7 = class112.method829((byte) -82, (int) arg3);
            return var7.field131;
        } else if (~arg1 == arg0 || arg1 == 7) {
            return class59.method508(-23216, arg2[0]).method927(25606, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1413(int arg0, int arg1, Random arg2) {
        field3601++;
        if (~arg0 >= arg1) {
            throw new IllegalArgumentException();
        } else if (class32.method294(arg0, (byte) -114)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class212.method1418(arg0, var4, -93);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI)I")
    public static final int method1414(int arg0, byte arg1, int arg2) {
        if (arg1 < 58) {
            method1410(78, (class237) null);
        }
        field3593++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3595 = null;
        field3598 = null;
        field3592 = null;
        field3603 = null;
        field3600 = null;
        if (arg0 <= 80) {
            method1414(-128, (byte) 84, 14);
        }
        field3594 = null;
    }
}
