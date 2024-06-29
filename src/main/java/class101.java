import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class101 extends class200 {

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field1779 = 4096;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    private int field1787 = 0;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "Lid;")
    public static class149 field1778 = class60.method382("Wordpack geladen)3", (byte) 69);

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "[I")
    public static int[] field1776 = new int[50];

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "[S")
    public static short[] field1784 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lid;")
    private static class149 field1781 = class60.method382("shake:", (byte) 30);

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Lid;")
    public static class149 field1777 = class60.method382("hitmarks", (byte) 28);

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Lid;")
    public static class149 field1783 = class60.method382("Lade Liste der Welten", (byte) 69);

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lid;")
    public static class149 field1775 = field1781;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "Lid;")
    public static class149 field1789 = field1781;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lal;")
    public static class230 field1774;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public static final void method721(int arg0, int arg1, int arg2) {
        ++field1782;
        class65.field1159 = -class80.field1480 + arg2;
        int var3 = -((int) ((float) class10.field139.field722 / class11.field156)) + class65.field1159;
        class129.field2285 = class287.field5086 - arg1 + -1 - -class91.field1615;
        int var4 = -((int) ((float) class10.field139.field727 / class11.field156)) + class129.field2285;
        int var5 = class65.field1159 - -((int) ((float) class10.field139.field722 / class11.field156));
        if (var3 < 0) {
            class65.field1159 = (int) ((float) class10.field139.field722 / class11.field156);
        }
        if (~class62.field1121 > ~var5) {
            class65.field1159 = -((int) ((float) class10.field139.field722 / class11.field156)) + class62.field1121;
        }
        int var6 = (int) ((float) class10.field139.field727 / class11.field156) + class129.field2285;
        if (arg0 != -5402) {
            field1783 = null;
        }
        if (var4 < 0) {
            class129.field2285 = (int) ((float) class10.field139.field727 / class11.field156);
        }
        if (var6 > class287.field5086) {
            class129.field2285 = class287.field5086 - (int) ((float) class10.field139.field727 / class11.field156);
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void method722(int arg0) {
        field1775 = null;
        field1789 = null;
        field1774 = null;
        field1784 = null;
        field1783 = null;
        field1776 = null;
        if (arg0 != 1030194214) {
            field1781 = null;
        }
        field1777 = null;
        field1778 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field1786;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            for (int var5 = 0; ~class137.field2515 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1787 <= var6 && ~this.field1779 <= ~var6 ? 4096 : 0;
            }
        }
        if (arg1 != 55) {
            this.method26(-59, (byte) -15);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    public static final void method723(int arg0, int arg1, int arg2, int arg3) {
        ++field1788;
        class149 var4 = class237.method1603(new class149[] { class63.field1124, class211.method1434(arg2, true), class18.field271, class211.method1434(arg0 >> 6, true), class18.field271, class211.method1434(arg1 >> 6, true), class18.field271, class211.method1434(63 & arg0, true), class18.field271, class211.method1434(arg1 & 63, true) }, -103);
        if (arg3 != 2074796454) {
            method723(83, 60, 67, -4);
        }
        var4.method1057(0);
        class9.method46(var4, 12);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class101() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field1779 = arg0.method485(-2386);
            }
        } else {
            this.field1787 = arg0.method485(-2386);
        }
        if (!arg1) {
            this.field1779 = 9;
        }
        ++field1785;
    }
}
