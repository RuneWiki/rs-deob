import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class251 extends class481 {

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "B")
    public byte field3561 = 5;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "Lea;")
    public static class474 field3555 = new class474("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "Lig;")
    public static class206 field3558 = new class206(5, -2);

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!nba", name = "H", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "Z")
    public boolean field3563;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILjava/lang/String;)V", line = 6)
    public static final void method1651(int arg0, String arg1) {
        if (arg0 != 27629) {
            field3555 = null;
        }
        field3564++;
        System.out.println("Error: " + class24.method150("%0a", arg1, (byte) -40, "\n"));
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(Z)V", line = 19)
    public static final void method1652(boolean arg0) {
        field3565++;
        class414.field6279 = -1;
        class253.field3576 = 1;
        long var1 = 0L;
        if (class19.field195 == null) {
            class453.method2799(103, 35);
        } else {
            class194 var3 = new class194(class61.method437((byte) 123, class468.method2869(class19.field195, (byte) 53)));
            long var4 = var3.method1184(47);
            class527.field7641 = var3.method1184(-124);
            class237.method1589(arg0, 8, "", class113.method697((byte) -24, var4));
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;ILrt;)I", line = 49)
    public static final int method1653(String arg0, int arg1, class194 arg2) {
        field3567++;
        int var3 = arg2.field2610;
        byte[] var4 = class557.method3213((byte) -124, arg0);
        arg2.method1217(var4.length, (byte) -128);
        arg2.field2610 += class180.field2218.method1743(arg2.field2622, var4.length, 0, arg2.field2610, 7, var4);
        return arg1 <= 116 ? 84 : arg2.field2610 - var3;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)Z", line = 68)
    public static final boolean method1654(int arg0, int arg1, byte arg2) {
        field3557++;
        int var3 = 81 / ((-arg2 - 2) / 33);
        if (class429.method2676(arg1, arg0, -13555)) {
            return class531.method3113(125, arg1, arg0) | (arg1 & 0xB000) != 0 | class147.method875(arg0, (byte) -100, arg1) ? true : (arg0 & 0x37) == 0 & (class449.method2785(arg1, -21297, arg0) | class159.method917(8, arg0, arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)V", line = 93)
    public static void method1655(int arg0) {
        if (arg0 != -29123) {
            method1653(null, 39, null);
        }
        field3558 = null;
        field3555 = null;
    }

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "(Z)V", line = 115)
    public static final void method1656(boolean arg0) {
        if (class133.field1673 == 2) {
            class353.method2235(3, 1);
        } else if (class133.field1673 == 6) {
            class353.method2235(7, 1);
        } else if (class133.field1673 == 9) {
            class353.method2235(10, 1);
        }
        if (arg0) {
            field3566++;
        }
    }
}
