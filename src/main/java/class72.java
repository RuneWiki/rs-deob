import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class72 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
    public static int[] field1092 = new int[32];

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Z")
    public static boolean field1094;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lff;")
    public static class9 field1093;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1091;

    static {
        new class304("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field1094 = true;
        field1093 = new class9(9, 2);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method469(int arg0, int arg1) {
        field1091++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 0) {
            method469(119, -64);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class256.field3378.method1764(class489.field6789, false) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class513.field7562.method1764(class489.field6789, false) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V", line = 32)
    public static void method470(boolean arg0) {
        if (arg0) {
            method471(116);
        }
        field1092 = null;
        field1093 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 43)
    public static final void method471(int arg0) {
        field1090++;
        int var1 = 0;
        if (class154.field2244.method3086(class166.field2414, (byte) 60)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (arg0 != 30) {
            return;
        }
        if (!class154.field2244.field7754) {
            var1 |= 0x40;
        }
        class476.method2736(var1, (byte) 108);
        class402.field5388.method1997(6, var1);
        class127.field1852.method2391(var1, (byte) -101);
        class206.field2849.method2547(var1, 4096);
        class441.field6049.method728((byte) 68, var1);
        class115.method791(-16726, var1);
        class351.method2054(var1, arg0 ^ 0xFFFFFFE1);
        class302.method1759(true, var1);
        class477.method2740(var1, (byte) -83);
        if (class454.field6161 == 10) {
            class507.method2898(1, 28);
        } else if (class454.field6161 == 30) {
            class507.method2898(1, 25);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
    public abstract int method472(int arg0, int arg1);

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public abstract void method473(int arg0);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)J")
    public abstract long method474(byte arg0);
}
