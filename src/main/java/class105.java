import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class105 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lag;")
    public class445 field1573 = new class445();

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1578;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lag;")
    private class445 field1575;

    static {
        new class206("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field1578 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 5)
    public static void method640(byte arg0) {
        field1578 = null;
        if (arg0 != 83) {
            method642((byte) -16);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lag;B)V", line = 16)
    public final void method641(class445 arg0, byte arg1) {
        field1566++;
        if (arg0.field6048 != null) {
            arg0.method2614((byte) -84);
        }
        arg0.field6046 = this.field1573;
        if (arg1 == -93) {
            arg0.field6048 = this.field1573.field6048;
            arg0.field6048.field6046 = arg0;
            arg0.field6046.field6048 = arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 35)
    public static final void method642(byte arg0) {
        field1576++;
        if (arg0 < 42) {
            field1578 = null;
        }
        if (class163.field2269 != null) {
            class163.field2269.method2217(16384);
            class163.field2269 = null;
            class62.field822 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lld;I)V", line = 52)
    public final void method643(class105 arg0, int arg1) {
        this.method647(arg0, (byte) 121, this.field1573.field6046);
        field1572++;
        if (arg1 != -2886) {
            field1578 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I", line = 66)
    public final int method644(byte arg0) {
        if (arg0 != 99) {
            this.field1575 = null;
        }
        field1567++;
        int var2 = 0;
        class445 var3 = this.field1573.field6046;
        while (this.field1573 != var3) {
            var3 = var3.field6046;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 87)
    public final void method645(int arg0) {
        while (true) {
            class445 var2 = this.field1573.field6046;
            if (this.field1573 == var2) {
                field1565++;
                if (arg0 != 0) {
                    this.field1573 = null;
                }
                this.field1575 = null;
                return;
            }
            var2.method2614((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILag;)V", line = 111)
    public final void method646(int arg0, class445 arg1) {
        field1579++;
        if (arg1.field6048 != null) {
            arg1.method2614((byte) -105);
        }
        int var3 = -107 / ((arg0 - 63) / 39);
        arg1.field6046 = this.field1573.field6046;
        arg1.field6048 = this.field1573;
        arg1.field6048.field6046 = arg1;
        arg1.field6046.field6048 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lld;BLag;)V", line = 130)
    private final void method647(class105 arg0, byte arg1, class445 arg2) {
        field1580++;
        class445 var4 = this.field1573.field6048;
        this.field1573.field6048 = arg2.field6048;
        arg2.field6048.field6046 = this.field1573;
        if (arg1 >= 99 && this.field1573 != arg2) {
            arg2.field6048 = arg0.field1573.field6048;
            arg2.field6048.field6046 = arg2;
            arg0.field1573.field6048 = var4;
            var4.field6046 = arg0.field1573;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lag;", line = 153)
    public final class445 method648(int arg0) {
        field1574++;
        class445 var2 = this.field1575;
        if (this.field1573 == var2) {
            this.field1575 = null;
            return null;
        }
        this.field1575 = var2.field6048;
        if (arg0 < 0) {
            this.field1575 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lag;", line = 175)
    public final class445 method649(int arg0) {
        if (arg0 != 18947) {
            return null;
        }
        field1571++;
        class445 var2 = this.field1573.field6048;
        if (this.field1573 == var2) {
            this.field1575 = null;
            return null;
        } else {
            this.field1575 = var2.field6048;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Lag;", line = 198)
    public final class445 method650(byte arg0) {
        field1577++;
        class445 var2 = this.field1573.field6046;
        if (this.field1573 == var2) {
            return null;
        }
        if (arg0 != -3) {
            method642((byte) -116);
        }
        var2.method2614((byte) -99);
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 240)
    public class105() {
        this.field1573.field6048 = this.field1573;
        this.field1573.field6046 = this.field1573;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z", line = 222)
    public final boolean method651(byte arg0) {
        if (arg0 > -107) {
            field1578 = null;
        }
        field1570++;
        return this.field1573.field6046 == this.field1573;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Lag;", line = 249)
    public final class445 method652(byte arg0) {
        field1568++;
        if (arg0 != 37) {
            this.method650((byte) 14);
        }
        class445 var2 = this.field1573.field6046;
        if (this.field1573 == var2) {
            this.field1575 = null;
            return null;
        } else {
            this.field1575 = var2.field6046;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lag;", line = 274)
    public final class445 method653(int arg0) {
        if (arg0 <= 7) {
            this.method644((byte) -43);
        }
        field1569++;
        class445 var2 = this.field1575;
        if (this.field1573 == var2) {
            this.field1575 = null;
            return null;
        } else {
            this.field1575 = var2.field6046;
            return var2;
        }
    }
}
