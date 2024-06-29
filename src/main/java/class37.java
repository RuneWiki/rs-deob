import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class107 {

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lvc;")
    public static class137 field804 = class45.method325("Schrifts-=tze geladen)3", -46);

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Lvc;")
    private static class137 field821 = class45.method325("Use", -46);

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Lvc;")
    public static class137 field807 = class45.method325("Duell akzeptieren", -46);

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lvc;")
    public static class137 field806 = class45.method325("Freunde", -46);

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "[Lvc;")
    public static class137[] field810 = new class137[100];

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Lvc;")
    public static class137 field824 = class45.method325(")1", -46);

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Lvc;")
    public static class137 field825 = field821;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "Lvc;")
    public static class137 field829 = class45.method325("Musik)2Engine vorbereitet)3", -46);

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "[I")
    public static int[] field830 = new int[100];

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Ltd;")
    public class126 field802;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lvb;")
    public static class136 field805;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lc;")
    public class15 field811;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Lc;")
    public class15 field817;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "[I")
    public int[] field819;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "[I")
    public static int[] field828;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILnb;)V")
    public static final void method267(int arg0, class88 arg1) {
        field816++;
        class12.field253 = arg1;
        if (arg0 != -31797) {
            method267(30, null);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ)V")
    public static final void method268(byte arg0, long arg1) {
        field818++;
        if (arg1 == 0L) {
            return;
        }
        if (class80.field1832 >= 100 && class29.field650 != 1 || class80.field1832 >= 200) {
            class109.method792(0, class48.field1075, -4, class45.field999);
            return;
        }
        class137 var3 = class105.method757(126, arg1).method1016((byte) 126);
        for (int var4 = 0; var4 < class80.field1832; var4++) {
            if (class68.field1395[var4] == arg1) {
                class109.method792(0, class88.method666(-59, new class137[] { var3, class114.field2693 }), -4, class45.field999);
                return;
            }
        }
        for (int var5 = 0; var5 < class39.field868; var5++) {
            if (class93.field2212[var5] == arg1) {
                class109.method792(0, class88.method666(120, new class137[] { class77.field1705, var3, class7.field165 }), -4, class45.field999);
                return;
            }
        }
        if (var3.method1026(-1, class104.field2412.field2909) || arg0 > -51) {
            return;
        }
        class89.field2128++;
        class98.field2270[class80.field1832] = var3;
        class68.field1395[class80.field1832] = arg1;
        class83.field1872[class80.field1832] = 0;
        class99.field2320[class80.field1832] = 0;
        class11.field240 = class112.field2667 + 1;
        class80.field1832++;
        class34.field737 = true;
        class72.field1527.method845(81, 100);
        class72.field1527.method840(false, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method269(byte arg0) {
        field829 = null;
        field807 = null;
        field821 = null;
        field804 = null;
        field825 = null;
        field828 = null;
        field806 = null;
        field824 = null;
        if (arg0 != 69) {
            method270((byte) -104);
        }
        field810 = null;
        field805 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public static final void method270(byte arg0) {
        if (class68.field1398 != null) {
            class68.field1398.method21();
            class68.field1398 = null;
        }
        class85.field2025 = 0;
        if (arg0 < 116) {
            method267(-16, null);
        }
        field822++;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
    public final void method271(byte arg0) {
        field801++;
        if (arg0 <= 16) {
            this.method271((byte) 14);
        }
        int var2 = this.field808;
        class126 var3 = this.field802.method947(121);
        if (var3 == null) {
            this.field803 = 0;
            this.field819 = null;
            this.field815 = 0;
            this.field808 = -1;
            this.field800 = 0;
        } else {
            this.field803 = var3.field2958;
            this.field815 = var3.field2937 * 128;
            this.field800 = var3.field2979;
            this.field808 = var3.field2944;
            this.field819 = var3.field2951;
        }
        if (this.field808 != var2 && this.field811 != null) {
            class23.field560.method566(this.field811);
            this.field811 = null;
        }
    }
}
