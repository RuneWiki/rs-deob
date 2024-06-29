import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class104 extends class260 {

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
    public static boolean field1437 = false;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "Z")
    public static boolean field1438 = false;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "[I")
    public static int[] field1436 = new int[1000];

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Ljp;")
    public static class376 field1435 = new class376(1350);

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Ltm;")
    public static class412 field1442 = new class412();

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "Z")
    public static boolean field1443 = false;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfca;)V", line = 4)
    public class104(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)I", line = 8)
    public final int method4(int arg0, byte arg1) {
        int var3 = -3 / ((-53 - arg1) / 50);
        ++field1432;
        return 1;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I", line = 18)
    public final int method800(int arg0) {
        if (arg0 < 3) {
            this.method4(123, (byte) 113);
        }
        ++field1440;
        return super.field3868;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILfca;)V", line = 33)
    public class104(int arg0, class92 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I", line = 36)
    public final int method8(byte arg0) {
        ++field1431;
        if (arg0 != 4) {
            method801(-57, 106, -90, -47, (class279) null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 47)
    public final void method2(boolean arg0) {
        if (arg0) {
            this.method800(62);
        }
        ++field1434;
        if (super.field3868 != 1 && super.field3868 != 0) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIILrh;)V", line = 64)
    public static final void method801(int arg0, int arg1, int arg2, int arg3, class279 arg4) {
        class243 var5 = class501.method2895(arg0, arg1, arg2);
        if (var5 != null) {
            arg4.field2257 = (arg1 << class26.field388) + class30.field464;
            arg4.field2246 = arg3;
            arg4.field2259 = (arg2 << class26.field388) + class30.field464;
            var5.field3278 = arg4;
            int var6 = class538.field7317 == class528.field7227 ? 1 : 0;
            if (arg4.method19(-98)) {
                if (arg4.method21(0)) {
                    arg4.field2252 = class563.field7549[var6];
                    class563.field7549[var6] = arg4;
                    return;
                }
                arg4.field2252 = class308.field4450[var6];
                class308.field4450[var6] = arg4;
                class768.field10591 = true;
                return;
            }
            arg4.field2252 = class503.field6961[var6];
            class503.field6961[var6] = arg4;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V", line = 98)
    public static void method802(byte arg0) {
        field1435 = null;
        if (arg0 == -1) {
            field1436 = null;
            field1442 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIII)V", line = 110)
    public static final void method803(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2474) {
            field1443 = true;
        }
        if (arg2 != 1010) {
            if (arg2 == 1002) {
                class173.method1238(class731.field10142, arg1, arg0);
            } else if (~arg2 != -1012) {
                if (arg2 == 1006) {
                    class173.method1238(class728.field10108, arg1, arg0);
                } else if (~arg2 == -1008) {
                    class173.method1238(class430.field6115, arg1, arg0);
                }
            } else {
                class173.method1238(class4.field39, arg1, arg0);
            }
        } else {
            class173.method1238(class700.field9819, arg1, arg0);
        }
        ++field1441;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(IB)V", line = 140)
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            ++field1439;
            super.field3868 = arg0;
        }
    }
}
