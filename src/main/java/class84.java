import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class16 {

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Lje;")
    public static class67 field1861 = class85.method592(255, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lje;")
    private static class67 field1856 = class85.method592(255, "Please enter your password)3");

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Lje;")
    public static class67 field1865 = class85.method592(255, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "[Lje;")
    public static class67[] field1864 = new class67[1000];

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Lje;")
    public static class67 field1868 = field1856;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lje;")
    public static class67 field1871 = class85.method592(255, "welle2:");

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Lje;")
    private static class67 field1872 = class85.method592(255, "Type");

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "Lje;")
    public static class67 field1866 = class85.method592(255, "Art");

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "Lje;")
    public static class67 field1862 = field1872;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Luf;")
    public static class145 field1857 = new class145(4096);

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Lje;")
    public static class67 field1874 = class85.method592(255, "<col=ffff00>");

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "[I")
    public static int[] field1858;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfd;B)V")
    public static final void method589(class40 arg0, byte arg1) {
        if (arg1 <= 35) {
            method589(null, (byte) -20);
        }
        field1869++;
        class25.field450 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1856 = null;
        field1858 = null;
        field1866 = null;
        field1865 = null;
        field1862 = null;
        field1861 = null;
        field1864 = null;
        field1874 = null;
        field1871 = null;
        if (arg0 <= -5) {
            field1857 = null;
            field1868 = null;
            field1872 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)I")
    public static final int method591(int arg0, int arg1, int arg2) {
        field1860++;
        class117 var3 = (class117) class79.field1705.method1119(28254, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg0; var5 < var3.field2637.length; var5++) {
                if (var3.field2638[var5] == arg1) {
                    var4 += var3.field2637[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V")
    public class84(int arg0) {
        this.field1870 = arg0;
    }
}
