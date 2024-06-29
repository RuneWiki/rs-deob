import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class47 extends class498 implements class533 {

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Leh;")
    public static class246 field535 = new class246(58, -1);

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Ltn;")
    public static class60 field540 = new class60(79, 4);

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Ltn;")
    public static class60 field544 = new class60(55, 4);

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Lkn;")
    public static class530 field545 = new class530("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "C")
    public char field529;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "F")
    public static float field543;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
    public long field536;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I", line = 4)
    public final int method268(byte arg0) {
        int var2 = 3 / ((-arg0 - 45) / 36);
        field538++;
        return this.field530;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 15)
    public static void method269(int arg0) {
        if (arg0 != 55) {
            field535 = null;
        }
        field535 = null;
        field544 = null;
        field540 = null;
        field545 = null;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V", line = 33)
    public static final void method270(byte arg0) {
        if (arg0 <= 27) {
            method270((byte) 30);
        }
        field541++;
        if (!class409.field5788) {
            return;
        }
        while (true) {
            while (class20.field239.length > class160.field2372) {
                class135 var1 = class20.field239[class160.field2372];
                if (var1 != null && var1.field1767 == -1) {
                    if (class260.field3845 == null) {
                        class260.field3845 = class71.field884.method1393(var1.field1764, -22257);
                    }
                    int var2 = class260.field3845.field495;
                    if (var2 == -1) {
                        return;
                    }
                    class160.field2372++;
                    class260.field3845 = null;
                    var1.field1767 = var2;
                } else {
                    class160.field2372++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)I", line = 75)
    public final int method271(byte arg0) {
        field534++;
        if (arg0 <= 102) {
            this.method271((byte) -25);
        }
        return this.field539;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)I", line = 89)
    public final int method272(boolean arg0) {
        if (arg0) {
            return 125;
        } else {
            field531++;
            return this.field532;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)C", line = 101)
    public final char method273(int arg0) {
        field533++;
        if (arg0 < 115) {
            this.field539 = -112;
        }
        return this.field529;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)J", line = 117)
    public final long method274(byte arg0) {
        if (arg0 <= 62) {
            field543 = 0.94625294F;
        }
        field537++;
        return this.field536;
    }
}
