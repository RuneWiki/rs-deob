import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class64 {

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Lid;")
    private static class149 field11 = class60.method382("rating: ", (byte) 59);

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "Lid;")
    public static class149 field16 = class60.method382("d-Broulement:", (byte) 86);

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Lid;")
    public static class149 field18 = class60.method382("Atteindre", (byte) 92);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lid;")
    public static class149 field7 = field11;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lid;")
    public static class149 field4 = class60.method382("null", (byte) 85);

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "D")
    public static double field22 = -1.0D;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Lid;")
    public class149 field10;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lal;")
    public static class230 field5;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Laj;")
    public class47 field12;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Laj;")
    public class47 field13;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Z")
    public boolean field6;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Ljava/lang/Object;")
    public Object[] field17;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lal;Lal;ZLal;Lal;)V")
    public static final void method1(class230 arg0, class230 arg1, boolean arg2, class230 arg3, class230 arg4) {
        class270.field4861 = arg1;
        if (!arg2) {
            method4(82, (byte) -2);
        }
        field19++;
        class232.field4081 = arg3;
        class127.field2224 = arg0;
        class45.field688 = arg4;
        class14.field206 = new class47[class45.field688.method1531(21296)][];
        class226.field3953 = new boolean[class45.field688.method1531(21296)];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)V")
    public static final void method2(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if ((arg1 - arg4) >= class257.field4496 && arg1 + arg4 <= class192.field3449 && class224.field3940 <= (arg3 - arg4) && (arg3 + arg4) <= class94.field1655) {
            class20.method116(arg3, arg1, arg4, arg0, false);
        } else {
            class83.method621((byte) 85, arg3, arg4, arg1, arg0);
        }
        int var5 = 39 / ((arg2 - 29) / 35);
        field2++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public static final void method3(boolean arg0) {
        field3++;
        class87.field1580.method628(arg0);
        class90.field1612.method435((byte) -105);
        class16.field225.method435((byte) -114);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[B")
    public static final byte[] method4(int arg0, byte arg1) {
        int var2 = -45 / ((18 - arg1) / 44);
        field1++;
        class171 var3 = (class171) class60.field1082.method800(261775, (long) arg0);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class35.method200(123, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class171(var4);
            class60.field1082.method802((long) arg0, 0, var3);
        }
        return var3.field3153;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method5(int arg0) {
        field16 = null;
        field4 = null;
        field18 = null;
        field5 = null;
        if (arg0 != 512) {
            field22 = -1.0492849692996364D;
        }
        field11 = null;
        field7 = null;
    }
}
