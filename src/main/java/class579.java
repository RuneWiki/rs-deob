import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class579 {

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field8191 = 0;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method3273(int arg0, int arg1, int arg2) {
        if (arg0 == -11296) {
            field8192++;
            return (arg1 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Llb;IB)V", line = 38)
    public static final void method3274(class257 arg0, int arg1, byte arg2) {
        field8190++;
        if (class309.field3825 >= 50 || arg0 == null || arg0.field3208 == null || arg1 >= arg0.field3208.length || arg0.field3208[arg1] == null) {
            return;
        }
        int var3 = arg0.field3208[arg1][0];
        if (arg2 != -106) {
            method3274(null, -50, (byte) 78);
        }
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg0.field3208[arg1].length > 1) {
            int var6 = (int) ((double) arg0.field3208[arg1].length * Math.random());
            if (var6 > 0) {
                var4 = arg0.field3208[arg1][var6];
            }
        }
        if (arg0.field3213) {
            class247.method1454(255, 0, var4, var5, -23, false);
        } else {
            class421.method2355(-100, 255, var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)[Ldba;", line = 81)
    public static final class240[] method3275(int arg0) {
        field8189++;
        if (arg0 != 0) {
            method3273(0, 66, -1);
        }
        return new class240[] { class600.field8463, class578.field8186, class255.field3200 };
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V", line = 101)
    public static final void method3276(byte arg0, int arg1) {
        class277.field3448 = new int[arg1];
        class692.field9719 = new int[arg1];
        if (arg0 != 14) {
            field8191 = 45;
        }
        class397.field5361 = new int[arg1];
        class309.field3823 = new int[arg1];
        field8188++;
        class3.field34 = new int[arg1];
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(III)V", line = 117)
    public static final void method3277(int arg0, int arg1, int arg2) {
        boolean var3 = class487.field7044[0][arg1][arg2] != null && class487.field7044[0][arg1][arg2].field7225 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class487.field7044[var4][arg1][arg2] == null) {
                class499 var5 = class487.field7044[var4][arg1][arg2] = new class499(var4);
                if (var3) {
                    var5.field7211++;
                }
            }
        }
    }
}
