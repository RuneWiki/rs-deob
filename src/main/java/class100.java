import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 extends class69 {

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Lmc;")
    private static class75 field2580 = class30.method234(true, " million");

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Lmc;")
    public static class75 field2584 = field2580;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Lmb;")
    public static class74 field2581 = new class74(4096);

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lmc;")
    public static class75 field2595 = class30.method234(true, "gelb:");

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lmc;")
    public static class75 field2594 = class30.method234(true, "titlebox");

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "Lmc;")
    private static class75 field2588 = class30.method234(true, "wishes to trade with you)3");

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Lmc;")
    public static class75 field2589 = class30.method234(true, "Neuer Benutzer");

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lmc;")
    public static class75 field2596 = null;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lmc;")
    public static class75 field2590 = class30.method234(true, "::clientdrop");

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lmc;")
    public static class75 field2597 = field2588;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lva;")
    public class123 field2577;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Lva;")
    public class123 field2582;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lja;")
    public static class55 field2576;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Lje;")
    public class59 field2583;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Lp;")
    public static class90 field2587;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[I")
    public static int[] field2586;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "[I")
    public static int[] field2592;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 30)
    public static final void method831(int arg0) {
        class112.field2843 = 0;
        class76.field1921 = 0;
        field2568++;
        class122.method953(arg0 - 20);
        class38.method298(7);
        class92.method763(51);
        class10.method67(31266);
        for (int var1 = 0; var1 < class112.field2843; var1++) {
            int var3 = class78.field1955[var1];
            if (class34.field781 != class40.field957[var3].field1215) {
                class40.field957[var3] = null;
            }
        }
        if (class27.field547 != class97.field2448.field1556) {
            throw new RuntimeException("gpp1 pos:" + class97.field2448.field1556 + " psize:" + class27.field547);
        }
        for (int var2 = arg0; var2 < class34.field783; var2++) {
            if (class40.field957[class84.field2081[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class34.field783);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZ)I", line = 74)
    public static final int method832(int arg0, int arg1, boolean arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field2591++;
        if (!arg2) {
            return -26;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 104)
    public static void method833(int arg0) {
        field2594 = null;
        field2586 = null;
        field2581 = null;
        field2587 = null;
        field2590 = null;
        field2588 = null;
        field2580 = null;
        field2592 = null;
        field2589 = null;
        field2597 = null;
        field2584 = null;
        field2576 = null;
        field2596 = null;
        if (arg0 != 27427) {
            method831(100);
        }
        field2595 = null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 154)
    public final void method834(int arg0) {
        field2567++;
        int var2 = this.field2574;
        if (arg0 > -61) {
            method833(-89);
        }
        class59 var3 = this.field2583.method474(5234);
        if (var3 == null) {
            this.field2574 = -1;
            this.field2565 = 0;
            this.field2598 = 0;
            this.field2578 = null;
            this.field2570 = 0;
        } else {
            this.field2598 = var3.field1513 * 128;
            this.field2565 = var3.field1492;
            this.field2574 = var3.field1522;
            this.field2578 = var3.field1497;
            this.field2570 = var3.field1499;
        }
        if (this.field2574 != var2 && this.field2577 != null) {
            class110.field2792.method868(this.field2577);
            this.field2577 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lja;ILja;Lja;)V", line = 195)
    public static final void method835(class55 arg0, int arg1, class55 arg2, class55 arg3) {
        field2573++;
        class117.field2898 = arg3;
        class65.field1703 = arg2;
        if (arg1 != 0) {
            method833(-40);
        }
        class108.field2744 = arg0;
    }
}
