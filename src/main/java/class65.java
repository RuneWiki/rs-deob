import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YBKVSPMW")
public class class65 {

    @OriginalMember(owner = "YBKVSPMW", name = "a", descriptor = "Z")
    private boolean field1575 = true;

    @OriginalMember(owner = "YBKVSPMW", name = "j", descriptor = "Z")
    public boolean field1584 = false;

    @OriginalMember(owner = "YBKVSPMW", name = "k", descriptor = "Z")
    public boolean field1585 = true;

    @OriginalMember(owner = "YBKVSPMW", name = "m", descriptor = "Z")
    public boolean field1587 = false;

    @OriginalMember(owner = "YBKVSPMW", name = "p", descriptor = "Z")
    public boolean field1590 = false;

    @OriginalMember(owner = "YBKVSPMW", name = "q", descriptor = "I")
    public int field1591 = -1;

    @OriginalMember(owner = "YBKVSPMW", name = "b", descriptor = "Z")
    private static boolean field1576 = true;

    @OriginalMember(owner = "YBKVSPMW", name = "c", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "YBKVSPMW", name = "e", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "YBKVSPMW", name = "h", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "YBKVSPMW", name = "i", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "YBKVSPMW", name = "l", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "YBKVSPMW", name = "n", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "YBKVSPMW", name = "o", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "YBKVSPMW", name = "g", descriptor = "Ljava/lang/String;")
    public String field1581;

    @OriginalMember(owner = "YBKVSPMW", name = "f", descriptor = "[I")
    public static int[] field1580;

    @OriginalMember(owner = "YBKVSPMW", name = "d", descriptor = "[LYBKVSPMW;")
    public static class65[] field1578;

    @OriginalMember(owner = "YBKVSPMW", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method526(boolean arg0, class60 arg1) {
        class62 var2 = new class62(arg1.method465("varp.dat", null), 49938);
        field1579 = 0;
        if (arg0) {
            field1576 = !field1576;
        }
        field1577 = var2.method480();
        if (field1578 == null) {
            field1578 = new class65[field1577];
        }
        if (field1580 == null) {
            field1580 = new int[field1577];
        }
        for (int var3 = 0; var3 < field1577; var3++) {
            if (field1578[var3] == null) {
                field1578[var3] = new class65();
            }
            field1578[var3].method527(true, var2, var3);
        }
        if (var2.field1541.length != var2.field1542) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "YBKVSPMW", name = "a", descriptor = "(ZLXQPFGONL;I)V")
    public void method527(boolean arg0, class62 arg1, int arg2) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method478();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1582 = arg1.method478();
            } else if (var4 == 2) {
                this.field1583 = arg1.method478();
            } else if (var4 == 3) {
                this.field1584 = true;
                field1580[field1579++] = arg2;
            } else if (var4 == 4) {
                this.field1585 = false;
            } else if (var4 == 5) {
                this.field1586 = arg1.method480();
            } else if (var4 == 6) {
                this.field1587 = true;
            } else if (var4 == 7) {
                this.field1588 = arg1.method483();
            } else if (var4 == 8) {
                this.field1589 = 1;
                this.field1590 = true;
            } else if (var4 == 10) {
                this.field1581 = arg1.method485();
            } else if (var4 == 11) {
                this.field1590 = true;
            } else if (var4 == 12) {
                this.field1591 = arg1.method483();
            } else if (var4 == 13) {
                this.field1589 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
