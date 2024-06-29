import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class355 extends class164 {

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lfk;")
    public class604 field4745;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lmp;")
    public class705 field4746;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public int field4744;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lit;")
    public static class597 field4741;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method2003(byte arg0) {
        this.field4737 = this.field4745.field8703;
        this.field4743 = this.field4745.field8704;
        this.field4740 = this.field4745.field8702;
        field4742++;
        if (this.field4745.field8709 != null) {
            this.field4745.field8709.method717(this.field4746.field9969, this.field4746.field9968, this.field4746.field9970, class333.field4433);
        }
        this.field4739 = class333.field4433[2];
        if (arg0 >= -33) {
            method2006(13, null);
        }
        this.field4744 = class333.field4433[0];
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLn;)Ljava/lang/String;")
    public static final String method2004(byte arg0, class17 arg1) {
        field4736++;
        int var2 = -21 / ((arg0 - 15) / 44);
        if (client.method1659(arg1).method997((byte) 123) == 0) {
            return null;
        } else if (arg1.field477 == null || arg1.field477.trim().length() == 0) {
            return class679.field9734 ? "Hidden-use" : null;
        } else {
            return arg1.field477;
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static void method2005(int arg0) {
        if (arg0 == -18219) {
            field4741 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2006(int arg0, String arg1) {
        field4738++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class399.method2414(arg1, false);
        if (var2 == null || arg0 != 14467) {
            return;
        }
        for (int var3 = 0; var3 < class230.field3000; var3++) {
            String var4 = class100.field1340[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class399.method2414(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class230.field3000--;
                for (int var6 = var3; var6 < class230.field3000; var6++) {
                    class100.field1340[var6] = class100.field1340[var6 + 1];
                    class208.field2541[var6] = class208.field2541[var6 + 1];
                    class405.field5735[var6] = class405.field5735[var6 + 1];
                    class568.field8315[var6] = class568.field8315[var6 + 1];
                    class570.field8337[var6] = class570.field8337[var6 + 1];
                }
                class698.field9879 = class59.field926;
                class333.field4428++;
                class543 var7 = class299.method1780(class84.field1196, class7.field76, 39);
                var7.field7872.method2281((byte) 58, class251.method1534(arg1, (byte) 96));
                var7.field7872.method2269(arg1, arg0 - 14541);
                class511.method3028(7482, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lfk;Lau;)V")
    public class355(class604 arg0, class684 arg1) {
        this.field4745 = arg0;
        this.field4746 = this.field4745.method3481(4);
        this.method2003((byte) -86);
    }
}
