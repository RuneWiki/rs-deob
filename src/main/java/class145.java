import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class145 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
    public static boolean field2671 = true;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field2677 = new int[4];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ldg;")
    public static class139 field2672;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lal;")
    public static class231 field2680;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method1011(int arg0) {
        int var1 = 82 % ((3 - arg0) / 41);
        for (int var2 = 0; var2 < class219.field3996; var2++) {
            int var3 = class249.field4492[var2];
            class163 var4 = class60.field1207[var3];
            if (var4 != null) {
                class118.method835(var4.field2969.field4277, var4, 8655);
            }
        }
        field2673++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIILvc;)Lvc;")
    public static final class189 method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class189 arg6) {
        long var7 = (long) arg5;
        field2679++;
        class189 var9 = (class189) class230.field4177.method670((byte) -58, var7);
        if (var9 == null) {
            class208 var10 = class208.method1429(class38.field648, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1413(64, 768, -50, -10, -50);
            class230.field4177.method673(var7, -5087, var9);
        }
        int var11 = arg6.method420();
        int var12 = arg6.method414();
        int var13 = arg6.method409();
        int var14 = arg6.method421();
        if (arg3 != -21327) {
            field2676 = -96;
        }
        class189 var15 = var9.method425(true, true);
        if (arg1 != 0) {
            var15.method413(arg1);
        }
        class55 var16 = (class55) var15;
        if (class94.method661(arg4 + var13, 19452, class99.field1937, arg0 + var11) != arg2 || class94.method661(arg4 + var14, arg3 + 40779, class99.field1937, arg0 + var12) != arg2) {
            for (int var17 = 0; var17 < var16.field1071; var17++) {
                var16.field1116[var17] += class94.method661(var16.field1079[var17] + arg4, 19452, class99.field1937, var16.field1072[var17] + arg0) - arg2;
            }
            var16.field1074 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBI)I")
    public static final int method1013(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 <= 97) {
            return -33;
        }
        field2674++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1014(int arg0, Component arg1) {
        field2678++;
        arg1.addMouseListener(class71.field1349);
        arg1.addMouseMotionListener(class71.field1349);
        arg1.addFocusListener(class71.field1349);
        int var2 = -91 % ((arg0 + 52) / 45);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1015(byte arg0) {
        field2677 = null;
        field2672 = null;
        if (arg0 == 0) {
            field2680 = null;
        }
    }
}
