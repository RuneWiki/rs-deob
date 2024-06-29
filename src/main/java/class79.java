import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class79 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lvd;")
    private class305 field1550 = new class305();

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1551 = 2301979;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
    public static boolean field1555 = true;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1557 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field1565 = 0;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lvd;")
    private class305 field1562;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lbm;")
    public static class307 field1553;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lbm;")
    public static class307 field1566;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 4)
    public static void method574(int arg0) {
        field1553 = null;
        field1557 = null;
        if (arg0 == 0) {
            field1566 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 31)
    public final void method575(byte arg0) {
        while (true) {
            class305 var2 = this.field1550.field4611;
            if (this.field1550 == var2) {
                field1556++;
                int var3 = -79 % ((77 - arg0) / 42);
                this.field1562 = null;
                return;
            }
            var2.method2024(0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Lvd;", line = 53)
    public final class305 method576(byte arg0) {
        field1561++;
        class305 var2 = this.field1550.field4611;
        if (this.field1550 == var2) {
            this.field1562 = null;
            return null;
        }
        this.field1562 = var2.field4611;
        if (arg0 >= -69) {
            this.method578(-105, (class305) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)Lvd;", line = 79)
    public final class305 method577(byte arg0) {
        field1554++;
        class305 var2 = this.field1550.field4611;
        if (this.field1550 == var2) {
            return null;
        }
        var2.method2024(arg0 + 92);
        if (arg0 != -92) {
            method574(-68);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 125)
    public class79() {
        this.field1550.field4614 = this.field1550;
        this.field1550.field4611 = this.field1550;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILvd;)V", line = 107)
    public final void method578(int arg0, class305 arg1) {
        if (arg0 >= -98) {
            field1567 = 58;
        }
        field1560++;
        if (arg1.field4614 != null) {
            arg1.method2024(0);
        }
        arg1.field4611 = this.field1550;
        arg1.field4614 = this.field1550.field4614;
        arg1.field4614.field4611 = arg1;
        arg1.field4611.field4614 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lvd;", line = 136)
    public final class305 method579(int arg0) {
        class305 var2 = this.field1562;
        field1558++;
        if (this.field1550 == var2) {
            this.field1562 = null;
            return null;
        }
        this.field1562 = var2.field4611;
        if (arg0 != 0) {
            this.method579(90);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I", line = 158)
    public final int method580(boolean arg0) {
        field1552++;
        class305 var2 = this.field1550.field4611;
        int var3 = 0;
        if (arg0) {
            this.method575((byte) 127);
        }
        while (this.field1550 != var2) {
            var3++;
            var2 = var2.field4611;
        }
        return var3;
    }
}
