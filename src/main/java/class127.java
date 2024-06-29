import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class127 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Ltda;")
    public class589 field1611 = new class589();

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1619 = -1;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Lwo;")
    public static class690 field1618 = new class690(41, 8);

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "S")
    public static short field1621 = 256;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Ltda;")
    private class589 field1620;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
    public static int[] field1614;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Ltda;", line = 4)
    public final class589 method868(byte arg0) {
        field1613++;
        if (arg0 <= 97) {
            return null;
        }
        class589 var2 = this.field1611.field8537;
        if (this.field1611 == var2) {
            this.field1620 = null;
            return null;
        } else {
            this.field1620 = var2.field8537;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 142)
    public class127() {
        this.field1611.field8531 = this.field1611;
        this.field1611.field8537 = this.field1611;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Ltda;", line = 27)
    public final class589 method869(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field1617++;
        class589 var2 = this.field1620;
        if (this.field1611 == var2) {
            this.field1620 = null;
            return null;
        } else {
            this.field1620 = var2.field8537;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ltda;B)V", line = 51)
    public final void method870(class589 arg0, byte arg1) {
        if (arg0.field8531 != null) {
            arg0.method3420((byte) -104);
        }
        field1612++;
        arg0.field8531 = this.field1611.field8531;
        arg0.field8537 = this.field1611;
        arg0.field8531.field8537 = arg0;
        arg0.field8537.field8531 = arg0;
        if (arg1 != 106) {
            field1618 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 68)
    public final void method871(byte arg0) {
        field1616++;
        while (true) {
            class589 var2 = this.field1611.field8537;
            if (this.field1611 == var2) {
                this.field1620 = null;
                if (arg0 <= 99) {
                    this.method868((byte) 39);
                    return;
                } else {
                    return;
                }
            }
            var2.method3420((byte) -119);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)I", line = 93)
    public final int method872(boolean arg0) {
        field1615++;
        if (!arg0) {
            field1622 = -53;
        }
        int var2 = 0;
        class589 var3 = this.field1611.field8537;
        while (this.field1611 != var3) {
            var3 = var3.field8537;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 114)
    public static void method873(int arg0) {
        if (arg0 != -11623) {
            method873(19);
        }
        field1618 = null;
        field1614 = null;
    }
}
