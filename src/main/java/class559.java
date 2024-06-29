import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class559 extends class134 {

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "J")
    public long field7985;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lbq;")
    public static class289 field7984 = new class289();

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lof;")
    public static class620 field7988 = new class620(3000000, 200);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 5)
    public static void method3271(int arg0) {
        field7984 = null;
        field7988 = null;
        int var1 = 32 % ((-arg0 - 56) / 47);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 17)
    public class559() {
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILtp;IZ)V", line = 24)
    public static final void method3272(int arg0, class532 arg1, int arg2, boolean arg3) {
        field7983++;
        if (class568.field8075) {
            class703 var4 = class262.field3260 == -1 ? null : class84.field884.method98(true, class262.field3260);
            if (client.method1779(arg1).method4189(23370) && (class12.field96 & 0x20) != 0 && (var4 == null || arg1.method3111((byte) -106, var4.field9906, class262.field3260) != var4.field9906)) {
                class723.method4030((long) (arg1.field7628 << 0 | arg1.field7704), false, arg1.field7691, false, 0L, false, 13, class52.field548, arg1.field7704, arg1.field7628, true, class192.field2266, class175.field2063 + " -> " + arg1.field7666);
                class174.field2059++;
            }
        }
        int var5 = 9;
        if (!arg3) {
            return;
        }
        while (var5 >= 5) {
            String var9 = class256.method1524(true, arg1, var5);
            if (var9 != null) {
                class284.field3461++;
                class723.method4030((long) (arg1.field7704 | arg1.field7628 << 0), false, arg1.field7691, false, (long) (var5 + 1), !arg3, 1002, var9, arg1.field7704, arg1.field7628, true, class384.method2386(arg1, var5, (byte) -36), arg1.field7666);
            }
            var5--;
        }
        String var6 = class603.method3422(1, arg1);
        if (var6 != null) {
            class723.method4030((long) (arg1.field7704 | arg1.field7628 << 0), false, arg1.field7691, false, 0L, false, 12, var6, arg1.field7704, arg1.field7628, true, arg1.field7651, arg1.field7666);
            class702.field9899++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class256.method1524(arg3, arg1, var7);
            if (var8 != null) {
                class723.method4030((long) (arg1.field7628 << 0 | arg1.field7704), false, arg1.field7691, false, (long) (var7 + 1), false, 5, var8, arg1.field7704, arg1.field7628, true, class384.method2386(arg1, var7, (byte) -38), arg1.field7666);
                class284.field3461++;
            }
        }
        if (!client.method1779(arg1).method4182((byte) -42)) {
            return;
        }
        class411.field5609++;
        if (arg1.field7602 == null) {
            class723.method4030((long) (arg1.field7704 | arg1.field7628 << 0), false, arg1.field7691, false, 0L, !arg3, 9, class486.field6913.method2936(class489.field6978, -85), arg1.field7704, arg1.field7628, true, -1, "");
        } else {
            class723.method4030((long) (arg1.field7704 | arg1.field7628 << 0), false, arg1.field7691, false, 0L, !arg3, 9, arg1.field7602, arg1.field7704, arg1.field7628, true, -1, "");
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(J)V", line = 99)
    public class559(long arg0) {
        this.field7985 = arg0;
    }
}
