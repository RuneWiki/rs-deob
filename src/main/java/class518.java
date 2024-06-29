import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public abstract class class518 extends class538 {

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "S")
    public short field7270;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "Lsea;")
    public static class373 field7269 = new class373("runescape", 0);

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)Z")
    public final boolean method1809(int arg0) {
        if (arg0 != 0) {
            this.method1807(true);
        }
        ++field7271;
        return class406.field6066[(super.field7895 >> class125.field1831) + -class361.field5293 + class176.field2466][(super.field7896 >> class125.field1831) + -class545.field8045 + class176.field2466];
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBI)I")
    public static final int method2929(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field7272;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg2 > -74) {
                field7269 = null;
            }
            return ~var4 == -3 ? 7 - arg0 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(Z)V")
    public static void method2930(boolean arg0) {
        if (!arg0) {
            field7269 = null;
        }
        field7269 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I[Ltg;)I")
    public final int method1808(int arg0, class334[] arg1) {
        if (arg0 != 16) {
            this.field7270 = -104;
        }
        ++field7274;
        return this.method3104(super.field7895 >> class125.field1831, super.field7896 >> class125.field1831, (byte) -113, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILps;)V")
    public static final void method2931(int arg0, class5 arg1) {
        ++field7268;
        class5 var2 = class622.method3587(arg1, -1087028336);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field202;
            var4 = var2.field76;
        } else {
            var3 = class454.field6538;
            var4 = class425.field6218;
        }
        class282.method1672(false, var4, (byte) 109, var3, arg1);
        if (arg0 > -13) {
            field7269 = null;
        }
        class386.method2378(var3, var4, (byte) 125, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)Z")
    public final boolean method1807(boolean arg0) {
        ++field7273;
        return arg0 ? false : class636.method3638(-20628, super.field7896 >> class125.field1831, super.field7900, super.field7895 >> class125.field1831);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIII)V")
    public class518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field7894 = arg1;
        super.field7900 = (byte) arg4;
        super.field7896 = arg2;
        super.field7895 = arg0;
        super.field7905 = (byte) arg3;
        this.field7270 = (short) arg5;
    }
}
