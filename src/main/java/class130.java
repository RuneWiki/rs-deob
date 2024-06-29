import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class130 implements class547 {

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "Lct;")
    public class414 field1625;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "Lrc;")
    public class29 field1622;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field1613 = -1;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public static int field1620 = 16777215;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z[Lf;)V")
    public static final void method687(boolean arg0, class536[] arg1) {
        class305.field3772 = arg1.length;
        field1624++;
        class478.field6077 = new class536[class305.field3772 + 10];
        class304.field3747 = new int[class305.field3772 + 10];
        class293.method1639(arg1, 0, class478.field6077, 0, class305.field3772);
        if (!arg0) {
            field1620 = 120;
        }
        for (int var2 = 0; var2 < class305.field3772; var2++) {
            class304.field3747[var2] = class478.field6077[var2].method166();
        }
        for (int var3 = class305.field3772; var3 < class478.field6077.length; var3++) {
            class304.field3747[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Lwea;")
    public class259 method235(int arg0) {
        field1615++;
        if (arg0 <= 38) {
            method687(true, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lct;Lrc;IIIIIII)V")
    public class130(class414 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1617 = arg5;
        this.field1623 = arg2;
        this.field1614 = arg7;
        this.field1621 = arg4;
        this.field1619 = arg6;
        this.field1625 = arg0;
        this.field1616 = arg3;
        this.field1618 = arg8;
        this.field1622 = arg1;
    }
}
