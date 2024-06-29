import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class112 extends RuntimeException {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Ljava/lang/String;")
    public String field1620;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1618;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1619 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1622 = "Started 3d Library";

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Ljf;")
    public static class216 field1616 = new class216(64);

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[Lsf;")
    public static class101[] field1627 = new class101[50];

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[Lmi;")
    public static class256[] field1628 = new class256[29];

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[Lci;")
    public static class189[] field1624;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
    public static final void method746(byte arg0, int arg1) {
        field1617++;
        class171.field2680.method1514(arg1, (byte) -55);
        class311.field4991.method1514(arg1, (byte) -55);
        if (arg0 == 86) {
            class15.field211.method1514(arg1, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILsc;Lsc;IIIIJ)V")
    public static final void method747(int arg0, int arg1, int arg2, int arg3, class248 arg4, class248 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class165 var12 = new class165();
        var12.field2551 = arg10;
        var12.field2545 = arg1 * 128 + 64;
        var12.field2546 = arg2 * 128 + 64;
        var12.field2549 = arg3;
        var12.field2552 = arg4;
        var12.field2555 = arg5;
        var12.field2547 = arg6;
        var12.field2554 = arg7;
        var12.field2553 = arg8;
        var12.field2548 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class184.field2892[var13][arg1][arg2] == null) {
                class184.field2892[var13][arg1][arg2] = new class113(var13, arg1, arg2);
            }
        }
        class184.field2892[arg0][arg1][arg2].field1649 = var12;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class112(Throwable arg0, String arg1) {
        this.field1620 = arg1;
        this.field1618 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
    public static final int method748(int arg0, int arg1, int arg2) {
        field1621++;
        if (arg1 > -37) {
            field1626 = -94;
        }
        int var3 = class44.method249(arg2 - 1, (byte) -76, arg0 - 1) + class44.method249(arg2 + 1, (byte) -76, arg0 - 1) - (-class44.method249(arg2 + -1, (byte) -76, arg0 + 1) + -class44.method249(arg2 + 1, (byte) -76, arg0 + 1));
        int var4 = class44.method249(arg2 - 1, (byte) -76, arg0) + class44.method249(arg2 + 1, (byte) -76, arg0) + class44.method249(arg2, (byte) -76, arg0 + -1) + class44.method249(arg2, (byte) -76, arg0 + 1);
        int var5 = class44.method249(arg2, (byte) -76, arg0);
        return var3 / 16 - (-(var4 / 8) - var5 / 4);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1619 = null;
        field1624 = null;
        field1627 = null;
        field1628 = null;
        field1622 = null;
        if (arg0 == -1) {
            field1616 = null;
        }
    }
}
