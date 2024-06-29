import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class145 extends class324 {

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Z")
    public boolean field1790;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "[Luh;")
    public class145[] field1796;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[S")
    public static short[] field1784 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "J")
    public static long field1789 = -1L;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1777 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "F")
    public static float field1780;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lpba;")
    public class280 field1792;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lom;")
    public class315 field1779;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)[I")
    public final int[] method865(int arg0, int arg1, byte arg2) {
        field1778++;
        int var4 = 113 / ((3 - arg2) / 42);
        return this.field1796[arg0].field1790 ? this.field1796[arg0].method27(false, arg1) : this.field1796[arg0].method75((byte) -76, arg1)[0];
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIB)[[I")
    public final int[][] method866(int arg0, int arg1, byte arg2) {
        int var4 = 103 % ((-arg2 - 41) / 40);
        field1788++;
        if (this.field1796[arg0].field1790) {
            int[] var5 = this.field1796[arg0].method27(false, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field1796[arg0].method75((byte) -62, arg1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public void method76(int arg0) {
        if (arg0 != -1) {
            this.method145(-85);
        }
        field1793++;
        if (this.field1790) {
            this.field1779.method2074((byte) -90);
            this.field1779 = null;
        } else {
            this.field1792.method1827(arg0 + 117);
            this.field1792 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
    public int[][] method75(byte arg0, int arg1) {
        field1782++;
        if (arg0 <= -28) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    public static void method867(boolean arg0) {
        if (!arg0) {
            field1784 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILrt;)V")
    public void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 <= -67) {
            field1786++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[I")
    public int[] method27(boolean arg0, int arg1) {
        if (arg0) {
            field1789 = -3L;
        }
        field1791++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I")
    public int method868(int arg0) {
        if (arg0 != -1) {
            this.field1779 = null;
        }
        field1795++;
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    public void method145(int arg0) {
        int var2 = -7 % ((arg0 + 46) / 45);
        field1794++;
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)I")
    public int method74(int arg0) {
        if (arg0 != 9104) {
            this.method868(-55);
        }
        field1781++;
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLcm;)V")
    public static final void method869(byte arg0, class631 arg1) {
        field1776++;
        if (arg0 == 52 && !class600.field8764) {
            arg1.method2108(true);
            class111.field1359--;
        }
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
    public static final void method870(int arg0) {
        field1783++;
        int[] var1 = new int[class622.field8999.field26];
        int var2 = 0;
        for (int var3 = 0; var3 < class622.field8999.field26; var3++) {
            class190 var5 = class622.field8999.method25(var3, -43);
            if (var5.field2348 >= 0 || var5.field2394 >= 0) {
                var1[var2++] = var3;
            }
        }
        class260.field3705 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class260.field3705[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public void method871(int arg0, int arg1, int arg2) {
        field1785++;
        int var4 = ~this.field1787 == arg0 ? arg1 : this.field1787;
        if (this.field1790) {
            this.field1779 = new class315(var4, arg1, arg2);
        } else {
            this.field1792 = new class280(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IZ)V")
    public class145(int arg0, boolean arg1) {
        this.field1790 = arg1;
        this.field1796 = new class145[arg0];
    }

    static {
        new class474("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
