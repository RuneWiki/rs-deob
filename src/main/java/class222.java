import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class222 implements class18 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lc;")
    public static class125 field3784 = new class125();

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
    public static int[] field3790 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3788 = 100;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lr;")
    private static class66 field3793 = class93.method641(43, " ");

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lr;")
    public static class66 field3791 = field3793;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBJ[I)Lr;")
    public final class66 method72(int arg0, byte arg1, long arg2, int[] arg3) {
        field3786++;
        if (arg0 == 0) {
            class153 var6 = class102.method707(arg1 - 1, arg3[0]);
            return var6.method1037((byte) -113, (int) arg2);
        } else if (arg1 != 22) {
            return null;
        } else if (arg0 == 1 || arg0 == 10) {
            class157 var7 = class40.method242(-25672, (int) arg2);
            return var7.field2813;
        } else if (arg0 == 6 || arg0 == 7) {
            return class102.method707(21, arg3[0]).method1037((byte) -112, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JB)V")
    public static final void method1413(long arg0, byte arg1) {
        field3787++;
        if (arg0 == 0L) {
            return;
        }
        if (class124.field2338 >= 100) {
            class234.method1533(class85.field1679, -88, class242.field4232, 0);
            return;
        }
        class66 var3 = class87.method616(arg0, -1).method467(12688);
        for (int var4 = 0; var4 < class124.field2338; var4++) {
            if (class247.field4306[var4] == arg0) {
                class234.method1533(class85.field1679, -88, class212.method1372(2, new class66[] { var3, class248.field4330 }), 0);
                return;
            }
        }
        int var5 = 9 / ((-arg1 - 19) / 57);
        for (int var6 = 0; var6 < class173.field3058; var6++) {
            if (class176.field3104[var6] == arg0) {
                class234.method1533(class85.field1679, 125, class212.method1372(2, new class66[] { class94.field1820, var3, class216.field3718 }), 0);
                return;
            }
        }
        if (var3.method463(class207.field3595.field815, (byte) 103)) {
            class234.method1533(class85.field1679, -99, class174.field3060, 0);
            return;
        }
        class247.field4306[class124.field2338] = arg0;
        class17.field245[class124.field2338++] = class87.method616(arg0, -1);
        class252.field4434 = class15.field199;
        class28.field412.method578(-121, 61);
        field3785++;
        class28.field412.method1651(true, arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lta;II)V")
    public static final void method1414(class107 arg0, int arg1, int arg2) {
        field3781++;
        if (class75.field1501 < arg0.field2066) {
            class37.method205((byte) 126, arg0);
        } else if (class75.field1501 > arg0.field2037) {
            class183.method1217(arg0, true);
        } else {
            class119.method813(128, arg0);
        }
        if (arg1 != 128) {
            return;
        }
        if (arg0.field2077 < 128 || arg0.field2053 < 128 || arg0.field2077 >= 13184 || arg0.field2053 >= 13184) {
            arg0.field2037 = 0;
            arg0.field2053 = arg0.field2086[0] * 128 + (arg0.field2060 * 64);
            arg0.field2068 = -1;
            arg0.field2066 = 0;
            arg0.field2077 = arg0.field2039[0] * 128 + arg0.field2060 * 64;
            arg0.field2084 = -1;
            arg0.method736(arg1 - 128);
        }
        if (class207.field3595 == arg0 && (arg0.field2077 < 1536 || arg0.field2053 < 1536 || arg0.field2077 >= 11776 || arg0.field2053 >= 11776)) {
            arg0.field2068 = -1;
            arg0.field2066 = 0;
            arg0.field2053 = arg0.field2086[0] * 128 + arg0.field2060 * 64;
            arg0.field2037 = 0;
            arg0.field2077 = arg0.field2039[0] * 128 + arg0.field2060 * 64;
            arg0.field2084 = -1;
            arg0.method736(0);
        }
        class167.method1136(arg1 + 19978, arg0);
        class30.method171(arg0, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)Lr;")
    public static final class66 method1415(int arg0, long arg1) {
        class73.field1449.setTime(new Date(arg1));
        int var3 = class73.field1449.get(7);
        if (arg0 >= -102) {
            field3789 = -26;
        }
        int var4 = class73.field1449.get(5);
        field3783++;
        int var5 = class73.field1449.get(2);
        int var6 = class73.field1449.get(1);
        int var7 = class73.field1449.get(11);
        int var8 = class73.field1449.get(12);
        int var9 = class73.field1449.get(13);
        return class212.method1372(2, new class66[] { class209.field3615[var3 - 1], class172.field3044, class144.method989(var4 / 10, 0), class144.method989(var4 % 10, 0), class217.field3734, class68.field1352[var5], class217.field3734, class144.method989(var6, 0), class77.field1523, class144.method989(var7 / 10, 0), class144.method989(var7 % 10, 0), class50.field891, class144.method989(var8 / 10, 0), class144.method989(var8 % 10, 0), class50.field891, class144.method989(var9 / 10, 0), class144.method989(var9 % 10, 0), class60.field1022 });
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
    public static final void method1416(int arg0, int arg1, int arg2, int arg3) {
        field3782++;
        class66 var4 = class212.method1372(2, new class66[] { class196.field3393, class144.method989(arg1, 0), class61.field1029, class144.method989(arg0 >> 6, 0), class61.field1029, class144.method989(arg2 >> 6, 0), class61.field1029, class144.method989(arg0 & 0x3F, arg3 - 24867), class61.field1029, class144.method989(arg2 & 0x3F, 0) });
        var4.method447((byte) 112);
        if (arg3 != 24867) {
            field3784 = null;
        }
        class103.method710(var4, (byte) 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1417(int arg0) {
        field3793 = null;
        if (arg0 != 10) {
            method1413(117L, (byte) 123);
        }
        field3790 = null;
        field3784 = null;
        field3791 = null;
    }
}
