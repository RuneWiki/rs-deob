import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class473 extends class401 {

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
    public int[] field6629;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
    public int[] field6625;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lo;")
    public static class332 field6624 = new class332("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lct;")
    public static class285 field6632 = new class285(55, -1);

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field6634 = -1;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Las;")
    public static class15 field6633;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lui;")
    public static class451 field6628;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)I")
    public static final int method2756(int arg0, byte arg1) {
        if (arg1 >= -109) {
            method2757(83);
        }
        field6626++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method2757(int arg0) {
        field6627++;
        int var1 = 60 / ((arg0 - 11) / 48);
        for (int var2 = 0; var2 < class256.field3797; var2++) {
            int var3 = class236.field3441[var2];
            class349 var4 = class18.field241[var3];
            if (var4 != null) {
                class317.method1955(var4.field5309.field4147, var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2758(int arg0, int arg1) {
        field6630++;
        if (arg0 < 116) {
            method2759(-79);
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class31.field408.method2036(class4.field85, (byte) -21) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class307.field4588.method2036(class4.field85, (byte) -21) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II[I[I)V")
    public class473(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6629 = arg2;
        this.field6625 = arg3;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public static void method2759(int arg0) {
        field6628 = null;
        field6624 = null;
        field6632 = null;
        if (arg0 != 3) {
            field6634 = -2;
        }
        field6633 = null;
    }
}
