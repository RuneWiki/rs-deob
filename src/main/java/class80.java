import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class80 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[B")
    public byte[] field1161;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[I")
    public int[] field1164;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field1153;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
    public static int[] field1162 = new int[100];

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lod;")
    public static class93 field1152 = new class93();

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1170 = " has logged in.";

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Z")
    public final boolean method581(boolean arg0, int arg1) {
        field1160++;
        if (!arg0) {
            this.method583(-126, 84);
        }
        return (this.field1161[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Loa;")
    public static final class101 method582(int arg0, int arg1) {
        field1155++;
        int var2 = 102 / ((arg1 + 10) / 63);
        class101 var3 = (class101) class18.field195.method1553((long) arg0, (byte) -117);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class233.field3728.method643(arg0, 34, false);
        class101 var5 = new class101();
        if (var4 != null) {
            var5.method772((byte) -111, new class152(var4), arg0);
        }
        class18.field195.method1551(var5, 0, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
    public final boolean method583(int arg0, int arg1) {
        field1157++;
        if (arg0 != 126) {
            this.field1153 = null;
        }
        return (this.field1161[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BC)Z")
    public static final boolean method584(byte arg0, char arg1) {
        field1151++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != 83) {
            field1170 = null;
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILlc;ZIIZ)V")
    public static final void method585(int arg0, int arg1, class86 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        class266.field4302 = arg4;
        if (!arg6) {
            return;
        }
        class225.field3618 = arg2;
        field1154++;
        class191.field3086 = arg0;
        class141.field2280 = arg1;
        class242.field3869 = arg3;
        class145.field2379 = 1;
        class27.field312 = arg5;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)Z")
    public final boolean method586(boolean arg0, int arg1) {
        field1167++;
        if (arg0) {
            return false;
        } else {
            return (this.field1161[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
    public final int method587(int arg0, int arg1) {
        field1159++;
        return arg1 == -21688 ? this.field1161[arg0] & 0x3 : -99;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class80(int arg0) {
        this.field1150 = arg0;
        this.field1161 = new byte[this.field1150];
        this.field1165 = new int[this.field1150];
        this.field1164 = new int[this.field1150];
        this.field1153 = new String[this.field1150];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method588(byte arg0) {
        field1170 = null;
        field1162 = null;
        if (arg0 > -73) {
            field1168 = 61;
        }
        field1152 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method589(int arg0) {
        field1166++;
        Container var1;
        if (class175.field2847 != null) {
            var1 = class175.field2847;
        } else if (class85.field1240 == null) {
            var1 = class138.field2241.field63;
        } else {
            var1 = class85.field1240;
        }
        field1168 = var1.getSize().width;
        class164.field2670 = var1.getSize().height;
        if (class85.field1240 == var1) {
            Insets var2 = class85.field1240.getInsets();
            class164.field2670 -= var2.top + var2.bottom;
            field1168 -= var2.right + var2.left;
        }
        if (class243.method1724(97) < 2) {
            class178.field2886 = 0;
            class61.field853 = (field1168 - 765) / 2;
            class154.field2543 = 503;
            class23.field265 = 765;
        } else {
            class154.field2543 = class164.field2670;
            class61.field853 = 0;
            class178.field2886 = 0;
            class23.field265 = field1168;
        }
        class10.field89.setSize(class23.field265, class154.field2543);
        if (class85.field1240 == var1) {
            Insets var3 = class85.field1240.getInsets();
            class10.field89.setLocation(class61.field853 + var3.left, var3.top - -class178.field2886);
        } else {
            class10.field89.setLocation(class61.field853, class178.field2886);
        }
        if (~class211.field3384 != arg0) {
            class152.method1115(true, -114);
        }
        class115.method846(-97);
    }
}
