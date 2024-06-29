import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lsg;")
    private static class169 field213 = class165.method1060("Please reload this page)3", 1536);

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lsg;")
    public static class169 field219 = class165.method1060("Spiel)2Engine wird gestartet)3)3)3", 1536);

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
    public static boolean field216 = false;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lsg;")
    private static class169 field227 = class165.method1060("Please subscribe)1 or use a different world)3", 1536);

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lsg;")
    public static class169 field218 = field227;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
    public static boolean field225 = false;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lsg;")
    public static class169 field224 = class165.method1060("<img=1>", 1536);

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lsg;")
    public static class169 field229 = field213;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lqd;")
    public static class148 field221;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method43(int arg0) {
        field214++;
        for (class7 var1 = (class7) class163.field3121.method145(0); var1 != null; var1 = (class7) class163.field3121.method152((byte) -128)) {
            if (class61.field1132 != var1.field162 || class162.field3107 > var1.field136) {
                var1.method1213(9104);
            } else if (var1.field183 <= class162.field3107) {
                if (var1.field137 > 0) {
                    class197 var2 = class54.field992[var1.field137 - 1];
                    if (var2 != null && var2.field3698 >= 0 && var2.field3698 < 13312 && var2.field3679 >= 0 && var2.field3679 < 13312) {
                        var1.method41(var2.field3698, -9066, var2.field3679, class183.method1215(var2.field3698, var1.field162, var2.field3679, 0) - var1.field173, class162.field3107);
                    }
                }
                if (var1.field137 < 0) {
                    int var3 = -var1.field137 - 1;
                    class196 var4;
                    if (class206.field4041 == var3) {
                        var4 = class4.field79;
                    } else {
                        var4 = class65.field1213[var3];
                    }
                    if (var4 != null && var4.field3698 >= 0 && var4.field3698 < 13312 && var4.field3679 >= 0 && var4.field3679 < 13312) {
                        var1.method41(var4.field3698, -9066, var4.field3679, class183.method1215(var4.field3698, var1.field162, var4.field3679, 0) - var1.field173, class162.field3107);
                    }
                }
                var1.method39(-54, class149.field2756);
                class196.field3840.method910(class61.field1132, (int) var1.field176, (int) var1.field155, (int) var1.field152, 60, var1, var1.field138, -1, false);
            }
        }
        if (arg0 >= -124) {
            method45((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public final int method44(int arg0, int arg1) {
        int var3 = 20 / ((-arg0 - 3) / 49);
        field228++;
        int var4 = (this.field230.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field230[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field230[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method45(byte arg0) {
        field213 = null;
        field229 = null;
        field221 = null;
        if (arg0 != -9) {
            field217 = 65;
        }
        field218 = null;
        field224 = null;
        field227 = null;
        field219 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method46(int arg0) {
        Object var1 = class56.field1033;
        synchronized (class56.field1033) {
            if (class203.field3974 == 0) {
                class163.field3134.method676(0, new class82(), 5);
            }
            class203.field3974 = arg0;
        }
        field223++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static final void method47(boolean arg0) {
        if (class142.field2654 != null) {
            class21 var1 = class142.field2654;
            synchronized (class142.field2654) {
                class142.field2654 = null;
            }
        }
        if (!arg0) {
            method48(null, 88, 35, -72);
        }
        field220++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lke;III)[Lbg;")
    public static final class18[] method48(class95 arg0, int arg1, int arg2, int arg3) {
        field226++;
        if (arg3 != 18042) {
            field219 = null;
        }
        return class174.method1166(arg1, arg2, false, arg0) ? class49.method307((byte) -56) : null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([I)V")
    public class8(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field230 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field230[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field230[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field230[var5 + var5] = arg0[var4];
            this.field230[var5 + var5 + 1] = var4++;
        }
    }
}
