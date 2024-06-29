import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class219 extends class7 {

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Log;")
    public static class146 field4145 = new class146(8);

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field4151 = 50;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lkg;")
    public static class106 field4149;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Lob;")
    public static final class141 method1416(int arg0, int arg1) {
        if (arg0 < 46) {
            field4149 = null;
        }
        class141 var2 = class78.method543((byte) 93, arg1);
        field4147++;
        for (int var3 = var2.method908(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class220.method1422(new class141[] { var2.method902(var3, 0, (byte) 18), class95.field1889, var2.method907((byte) 117, var3) }, -3);
        }
        if (var2.method908(false) > 9) {
            return class220.method1422(new class141[] { class157.field3022, var2.method902(var2.method908(false) - 8, 0, (byte) 36), class86.field1708, class204.field3910, var2, class106.field2033 }, -3);
        } else if (var2.method908(false) > 6) {
            return class220.method1422(new class141[] { class35.field699, var2.method902(var2.method908(false) - 4, 0, (byte) 92), class22.field374, class204.field3910, var2, class106.field2033 }, -3);
        } else {
            return class220.method1422(new class141[] { class130.field2490, var2, class185.field3602 }, -3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class219() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            method1416(-112, -19);
        }
        field4148++;
        return class15.field272;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4150++;
        class136 var5 = (class136) class96.field1894.method792((long) arg2, 22346);
        if (var5 == null) {
            var5 = new class136();
            class96.field1894.method797(var5, (long) arg2, true);
        }
        if (arg0 >= var5.field2586.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2586.length; var8++) {
                var6[var8] = var5.field2586[var8];
                var7[var8] = var5.field2594[var8];
            }
            for (int var9 = var5.field2586.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2586 = var6;
            var5.field2594 = var7;
        }
        var5.field2586[arg0] = arg1;
        var5.field2594[arg0] = arg4;
        if (arg3 != -20971) {
            field4151 = -58;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZI)I")
    public static final int method1418(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1419(21);
        }
        long var3 = (long) ((arg0 << 16) + arg2);
        field4146++;
        return class57.field1104 != null && class57.field1104.field4067 == var3 ? class209.field3984.field2865 * 99 / (class209.field3984.field2859.length - class57.field1104.field3944) + 1 : 0;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field4145 = null;
        field4149 = null;
        if (arg0 != -799263056) {
            method1419(121);
        }
    }
}
