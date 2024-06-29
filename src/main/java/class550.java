import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class550 extends class388 {

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lvea;")
    public class647 field8026;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lhl;")
    public class396 field8025;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field8021;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field8022;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field8023;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field8027;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field8029;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 5)
    public final void method3311(byte arg0) {
        this.field8023 = this.field8026.field9313;
        field8024++;
        this.field8029 = this.field8026.field9318;
        this.field8027 = this.field8026.field9315;
        if (arg0 != 101) {
            return;
        }
        if (this.field8026.field9325 != null) {
            this.field8026.field9325.method848(this.field8025.field5672, this.field8025.field5667, this.field8025.field5676, class715.field10101);
        }
        this.field8022 = class715.field10101[0];
        this.field8021 = class715.field10101[2];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V", line = 26)
    public static final void method3312(int arg0, boolean arg1) {
        field8028++;
        if (arg0 > -99) {
            return;
        }
        class710.field10013.method841(class301.field4129.method304());
        int[] var2 = class301.field4129.method247();
        class549.field7978 = var2[3];
        class758.field10553 = var2[0];
        class513.field7432 = var2[1];
        class660.field9436 = var2[2];
        if (arg1) {
            class301.field4129.method398(class275.field3881, class47.field775, class131.field1811, class486.field7005);
            class83.method668(class472.field6701, (byte) 120);
        } else {
            class301.field4129.method398(class499.field7179, class347.field5127, class479.field6862, class469.field6681);
            class83.method668(class252.field3649, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)Z", line = 65)
    public static final boolean method3313(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field8030++;
        int var7 = arg1 + arg2;
        if (arg3 >= -40) {
            return false;
        }
        int var8 = arg0 + arg5;
        int var9 = arg4 + arg6;
        if (!class403.method2446(arg1, var8, var7, var9, 61, var9, var8, arg6, var8, arg1)) {
            return false;
        } else if (class403.method2446(var7, var8, var7, var9, 25, arg6, var8, arg6, var8, arg1)) {
            if (class647.field9329 > arg1) {
                if (!class403.method2446(arg1, var8, arg1, var9, 91, arg6, arg0, var9, var8, arg1)) {
                    return false;
                }
                if (!class403.method2446(arg1, var8, arg1, arg6, 24, arg6, arg0, var9, arg0, arg1)) {
                    return false;
                }
            } else if (!class403.method2446(var7, var8, var7, var9, 22, arg6, arg0, var9, var8, var7)) {
                return false;
            } else if (!class403.method2446(var7, var8, var7, arg6, 116, arg6, arg0, var9, arg0, var7)) {
                return false;
            }
            if (class692.field9807 > arg6) {
                if (!class403.method2446(arg1, var8, var7, arg6, 25, arg6, arg0, arg6, var8, arg1)) {
                    return false;
                }
                if (!class403.method2446(var7, var8, var7, arg6, 50, arg6, arg0, arg6, arg0, arg1)) {
                    return false;
                }
            } else if (!class403.method2446(arg1, var8, var7, var9, 41, var9, arg0, var9, var8, arg1)) {
                return false;
            } else if (!class403.method2446(var7, var8, var7, var9, 32, var9, arg0, var9, arg0, arg1)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lvea;Lta;)V", line = 131)
    public class550(class647 arg0, class27 arg1) {
        this.field8026 = arg0;
        this.field8025 = this.field8026.method3736(8);
        this.method3311((byte) 101);
    }
}
