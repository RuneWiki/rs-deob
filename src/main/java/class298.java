import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class298 extends class337 {

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Lkh;")
    public static class13 field4532;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Lwt;")
    public static class205 field4533;

    static {
        new class234("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field4532 = new class13(32);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(III)Z", line = 3)
    public static final boolean method1931(int arg0, int arg1, int arg2) {
        ++field4534;
        if (arg2 != 2238) {
            return true;
        } else {
            return (32768 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3) {
        ++field4531;
        if (arg3 == -28145) {
            class358 var4 = class39.field531[arg2][arg0];
            class132.method970(var4 != null ? var4 : class289.field4359, arg1, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 39)
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[I", line = 42)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            field4532 = null;
        }
        ++field4530;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            class414.method2602(var3, 0, class402.field5977, class505.field7381[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V", line = 64)
    public static void method1933(int arg0) {
        if (arg0 != 9353) {
            field4533 = null;
        }
        field4532 = null;
        field4533 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLkk;)I", line = 75)
    public static final int method1934(byte arg0, class129 arg1) {
        ++field4529;
        if (~arg1.field1934 == -1) {
            return 0;
        } else {
            if (arg0 != -61) {
                field4532 = null;
            }
            if (arg1.field1968 != -1) {
                class129 var2 = null;
                if (~arg1.field1968 > -32769) {
                    var2 = class153.field2265[arg1.field1968];
                } else if (~arg1.field1968 <= -32769) {
                    var2 = class26.field319[arg1.field1968 + -32768];
                }
                if (var2 != null) {
                    int var3 = -var2.field5837 + arg1.field5837;
                    int var4 = arg1.field5833 - var2.field5833;
                    if (var3 != 0 || ~var4 != -1) {
                        arg1.method947(16383 & (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D), arg0 + 59);
                    }
                }
            }
            if (arg1 instanceof class177) {
                class177 var5 = (class177) arg1;
                if (~var5.field2644 != 0 && (~var5.field1981 == -1 || var5.field1985 > 0)) {
                    var5.method947(var5.field2644, arg0 + 59);
                    var5.field2644 = -1;
                }
            } else if (arg1 instanceof class116) {
                class116 var6 = (class116) arg1;
                if (var6.field1765 != -1 && (~var6.field1981 == -1 || var6.field1985 > 0)) {
                    int var7 = -((-class390.field5842 + -class390.field5842 + var6.field1765) * 64) + var6.field5837;
                    int var8 = -((-class176.field2613 + var6.field1769 + -class176.field2613) * 64) + var6.field5833;
                    if (var7 != 0 || ~var8 != -1) {
                        var6.method947(16383 & (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D), -2);
                    }
                    var6.field1765 = -1;
                }
            }
            return arg1.method950((byte) 108);
        }
    }
}
