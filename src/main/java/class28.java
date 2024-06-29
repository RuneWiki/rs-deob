import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    private int field592 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lo;")
    private class199 field595;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[J")
    public static long[] field597 = new long[1000];

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lqd;")
    public static class40 field599 = class147.method1106("<)4col>", (byte) -53);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lrb;")
    public static class213 field596 = null;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lqd;")
    private static class40 field601 = class147.method1106("Loading title screen )2 ", (byte) -50);

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "[Lqd;")
    public static class40[] field606 = new class40[100];

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Lqd;")
    public static class40 field609 = field601;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lpl;")
    public static class186 field604 = new class186(5);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lce;")
    public static class239 field600;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lce;")
    public static class239 field602;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lcj;")
    private class307 field598;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 18)
    public static void method267(int arg0) {
        field609 = null;
        field602 = null;
        field597 = null;
        field596 = null;
        field599 = null;
        field604 = null;
        field601 = null;
        int var1 = 32 % ((arg0 + 71) / 49);
        field606 = null;
        field600 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lcj;", line = 36)
    public final class307 method268(int arg0) {
        field593++;
        if (this.field592 > 0 && this.field595.field3178[this.field592 - 1] != this.field598) {
            class307 var2 = this.field598;
            this.field598 = var2.field5143;
            return var2;
        }
        class307 var3;
        do {
            if (this.field592 >= this.field595.field3182) {
                if (arg0 >= -64) {
                    return (class307) null;
                }
                return null;
            }
            var3 = this.field595.field3178[this.field592++].field5143;
        } while (this.field595.field3178[this.field592 - 1] == var3);
        this.field598 = var3.field5143;
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lo;)V", line = 158)
    public class28(class199 arg0) {
        this.field595 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLqd;Z)V", line = 82)
    public static final void method269(byte arg0, class40 arg1, boolean arg2) {
        field603++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class146.field2428.method1838(arg1, 250);
        int var7 = class146.field2428.method1834(arg1, 250) * 13;
        if (class21.field350) {
            class111.method846(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 - -var3, 0);
            class111.method835(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class115.method880(var4 - var3, -var3 + var5, var6 + var3 + var3, var7 - -var3 + var3, 0);
            class115.method881(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        }
        if (arg0 != -105) {
            field602 = (class239) null;
        }
        class146.field2428.method1840(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class129.method958(var5 - var3, var3 + var7 + var3, var4 - var3, 76, var6 - (-var3 - var3));
        if (!arg2) {
            class51.method444(var6, var4, var7, var5, 86);
        } else if (class21.field350) {
            class21.method161();
        } else {
            try {
                Graphics var8 = class213.field3470.getGraphics();
                class237.field3903.method548(0, 0, 0, var8);
            } catch (Exception var10) {
                class213.field3470.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I", line = 147)
    public static final int method270(byte arg0) {
        if (arg0 >= -125) {
            return -9;
        } else {
            field594++;
            return class51.field982;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 167)
    public static final void method271(int arg0, int arg1) {
        field607++;
        class177 var2 = class177.method1310(89, 5, arg0);
        var2.method1303((byte) 107);
        if (arg1 >= -98) {
            method273((byte) 64, -72);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Lcj;", line = 183)
    public final class307 method272(int arg0) {
        field605++;
        this.field592 = arg0;
        return this.method268(-127);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V", line = 195)
    public static final void method273(byte arg0, int arg1) {
        field608++;
        class62.field1182 = -1;
        class52.field1017 = 1;
        class309.field5182 = -1;
        class95.field1708 = 0;
        if (arg0 < 67) {
            field600 = (class239) null;
        }
        class95.field1718 = arg1;
        class207.field3309 = false;
        class109.field1913 = null;
    }
}
