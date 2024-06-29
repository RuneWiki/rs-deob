import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class37 extends class55 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    private int field629 = -32768;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Z")
    private boolean field648 = false;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    private int field652 = 0;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Z")
    public boolean field656 = false;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field653 = -1;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lpk;")
    private class103 field635;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field631 = -1;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Lgj;")
    private class249 field640;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field634++;
        class11 var13 = this.method345(true);
        if (var13 != null) {
            this.method341((byte) -5, var13);
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field640);
            this.field629 = var13.method82();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method339(byte arg0, int arg1) {
        if (arg0 == 120) {
            field655++;
            return arg1 & 0x3FF;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field646++;
        if (!this.field648) {
            class11 var6 = this.method345(true);
            if (var6 == null) {
                return;
            }
            this.method341((byte) -5, var6);
        }
        if (this.field640 != null) {
            this.field640.method1688(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZI)Z")
    public static final boolean method340(int arg0, boolean arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (!arg1) {
            field638 = -6;
        }
        field651++;
        class295 var3 = class166.method1209(125, arg2);
        return var3.method1968(arg0, (byte) 100);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLhd;)V")
    private final void method341(byte arg0, class11 arg1) {
        class87 var3 = (class87) arg1;
        if (arg0 != -5) {
            this.field657 = -113;
        }
        if ((this.field640 == null || this.field640.field3969) && (var3.field1300 != null || var3.field1313 != null)) {
            this.field640 = new class249(class41.field686, 1, 1);
        }
        if (this.field640 != null) {
            this.field640.method1686(var3.field1300, var3.field1313, false, var3.field1291, var3.field1329, var3.field1296);
        }
        field630++;
        this.field648 = true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILub;ZI)[Lej;")
    public static final class51[] method342(int arg0, class92 arg1, boolean arg2, int arg3) {
        field641++;
        if (class246.method1668(arg3, arg1, arg0, -1)) {
            if (arg2) {
                field637 = -40;
            }
            return class35.method331(65);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lub;Lub;I)V")
    public static final void method343(class92 arg0, class92 arg1, int arg2) {
        field643++;
        class109.field1691 = arg0;
        class207.field3193 = arg1;
        class27.field465 = class109.field1691.method700((byte) -122, 3);
        if (arg2 != -25368) {
            field637 = 30;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public final int method82() {
        field633++;
        return this.field629;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
    public final void method344(int arg0, int arg1) {
        field628++;
        if (arg0 != -32768) {
            this.field640 = null;
        }
        if (this.field656) {
            return;
        }
        this.field652 += arg1;
        while (this.field652 > this.field635.field1602[this.field644]) {
            this.field652 -= this.field635.field1602[this.field644];
            this.field644++;
            if (this.field644 >= this.field635.field1606.length) {
                this.field656 = true;
                break;
            }
        }
        if (!this.field656) {
            class136.method1004(this.field642, this.field644, this.field650, this.field635, arg0 + 33023, false);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)Lhd;")
    private final class11 method345(boolean arg0) {
        field647++;
        class206 var2 = class86.method654(this.field657, 119);
        if (!arg0) {
            method339((byte) -114, 79);
        }
        class11 var3;
        if (this.field656) {
            var3 = var2.method1443(0, 10, -1, -1);
        } else {
            var3 = var2.method1443(this.field652, 10, this.field653, this.field644);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method346(String arg0, byte arg1) {
        field654++;
        if (class183.field2895 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class183.field2895.field4783; var2++) {
            if (class260.method1743(" ", "<br>", class183.field2895.field4797[var2], -1).equals(arg0)) {
                return var2;
            }
        }
        int var3 = -47 / ((arg1 - 2) / 32);
        return -1;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field645 = arg5 + arg6;
        this.field650 = arg3;
        this.field639 = arg4;
        this.field642 = arg2;
        this.field657 = arg0;
        this.field649 = arg1;
        int var8 = class86.method654(this.field657, 122).field3166;
        if (var8 == -1) {
            this.field656 = true;
        } else {
            this.field656 = false;
            this.field635 = class250.method1700(var8, -44);
        }
        if (this.field645 == arg6) {
            class136.method1004(this.field642, this.field644, this.field650, this.field635, 255, false);
        }
    }
}
