import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class70 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ltd;")
    public static class136 field1467 = class145.method1172("Freie Welt", 45);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Ltd;")
    public static class136 field1474 = class145.method1172("mod_icons", 45);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ltd;")
    public static class136 field1472 = class145.method1172("Ung-Ultige Session)2ID)3", 45);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Ltd;")
    public static class136 field1471 = class145.method1172("gleiten:", 45);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Ltd;")
    public static class136 field1468 = class145.method1172("Lade)3)3)3", 45);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Ltd;")
    public static class136 field1480 = class145.method1172("und die Schaltfl-=che (WSpielkonto erstellen(W am", 45);

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Ltd;")
    public static class136 field1481 = class145.method1172("<col=ff7000>", 45);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field1469;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
    public int[] field1473;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method521(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method522(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIILjava/awt/Graphics;I)V")
    public abstract void method523(byte arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method524(int arg0) {
        class114.method888(this.field1473, this.field1470, this.field1479);
        if (arg0 == 0) {
            field1476++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
    public static final void method525(int arg0, boolean arg1) {
        field1482++;
        class79 var2 = (class79) class88.field2088.method109(67, (long) arg0);
        if (var2 == null) {
            return;
        }
        if (!arg1) {
            method526((byte) -128);
        }
        for (int var3 = 0; var3 < var2.field1806.length; var3++) {
            var2.field1806[var3] = -1;
            var2.field1809[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method526(byte arg0) {
        field1468 = null;
        field1480 = null;
        field1474 = null;
        field1467 = null;
        field1481 = null;
        if (arg0 == 103) {
            field1472 = null;
            field1471 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    protected class70() {
    }
}
