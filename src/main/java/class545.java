import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class545 implements class205 {

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public int field7557;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public int field7562;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public int field7563;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lrg;")
    public class557 field7560;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public int field7549;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public int field7555;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Lal;")
    public class125 field7553;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "[Lvo;")
    public static class133[] field7559 = new class133[4];

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Lkr;")
    public static class602 field7558 = new class602(95, 3);

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Lst;")
    public static class335 field7564 = new class335(71, 8);

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "Lgw;")
    public static class690 field7565 = new class690(4);

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "Lkr;")
    public static class602 field7566 = new class602(100, 7);

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "[I")
    public static int[] field7567;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)Lww;")
    public class288 method1206(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field7556++;
            return null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3218(int arg0) {
        field7564 = null;
        field7559 = null;
        field7566 = null;
        int var1 = 66 % ((37 - arg0) / 33);
        field7558 = null;
        field7567 = null;
        field7565 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7551++;
        int var7 = class41.method223(true, class262.field3848, class291.field4181, arg4);
        int var8 = class41.method223(true, class262.field3848, class291.field4181, arg1);
        int var9 = class41.method223(true, class726.field10064, class607.field8185, arg5);
        if (arg2 != 3) {
            field7565 = null;
        }
        int var10 = class41.method223(true, class726.field10064, class607.field8185, arg3);
        int var11 = class41.method223(true, class262.field3848, class291.field4181, arg0 + arg4);
        int var12 = class41.method223(true, class262.field3848, class291.field4181, arg1 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class102.method675(arg6, arg2 + 110, var9, var10, class538.field7454[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class102.method675(arg6, 98, var9, var10, class538.field7454[var14]);
        }
        int var15 = class41.method223(true, class726.field10064, class607.field8185, arg0 + arg5);
        int var16 = class41.method223(true, class726.field10064, class607.field8185, arg3 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class538.field7454[var17];
            class102.method675(arg6, 117, var9, var15, var18);
            class102.method675(arg6, -120, var16, var10, var18);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIZBII)V")
    public static final void method3220(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 45) {
            field7559 = null;
        }
        field7554++;
        if ((arg3 ? class332.field4707.field4795.method1140(0) : class332.field4707.field4782.method1140(0)) != 0 && arg6 != 0 && class12.field108 < 50 && arg1 != -1) {
            class669.field9235[class12.field108++] = new class396((byte) (arg3 ? 3 : 2), arg1, arg6, arg5, arg0, 0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
    public static final void method3221(int arg0) {
        field7552++;
        if (arg0 < 90) {
            method3220(55, -62, 10, false, (byte) 113, 91, 54);
        }
        if (class119.field1570 == 1 || class119.field1570 == 3 || class81.field1170 != class119.field1570 && (class119.field1570 == 0 || class81.field1170 == 0)) {
            class262.field3837 = 0;
            class445.field6185 = 0;
            class372.field5245.method819(23738);
        }
        class81.field1170 = class119.field1570;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lrg;Lal;IIIIIII)V")
    public class545(class557 arg0, class125 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7557 = arg2;
        this.field7562 = arg3;
        this.field7563 = arg8;
        this.field7561 = arg4;
        this.field7560 = arg0;
        this.field7549 = arg7;
        this.field7550 = arg5;
        this.field7555 = arg6;
        this.field7553 = arg1;
    }
}
