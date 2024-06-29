import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class120 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[Lme;")
    public class361[] field1609 = new class361[100];

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[I")
    public int[] field1608 = new int[3];

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[Lnd;")
    public class413[] field1610 = new class413[8];

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
    public int[] field1613 = new int[100];

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "[I")
    public static int[] field1616 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1617;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method835(boolean arg0) {
        field1616 = null;
        if (arg0) {
            method838((char) 65470, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -11093) {
            field1614 = -19;
        }
        field1618++;
        if (arg2 < arg1 + arg4 && arg1 < (arg2 + arg6)) {
            return arg0 < (arg8 + arg7) && arg8 < arg0 + arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(Z)V")
    public static final void method837(boolean arg0) {
        field1612++;
        if (class26.field474 > 0) {
            class322.method1992(2);
            return;
        }
        class449.field6565 = class159.field2079;
        if (!arg0) {
            method838('\u007f', (byte) 23);
        }
        class159.field2079 = null;
        class199.method1251(40, (byte) 112);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(CB)Z")
    public static final boolean method838(char arg0, byte arg1) {
        field1615++;
        if (arg1 != 122) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }
}
