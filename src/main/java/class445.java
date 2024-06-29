import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class445 extends class213 {

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    private int field6626;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lod;")
    private class349 field6621;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    private int field6625;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    private int field6617;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field6622;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    private int field6620;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    private int field6616;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "Z")
    public static boolean field6627 = false;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Llt;")
    public static class475 field6623 = new class475("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field6629 = 100;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Lrc;")
    private class374 field6624;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)Lrc;", line = 3)
    public final class374 method1489(byte arg0) {
        field6618++;
        if (this.field6624 == null) {
            class235.field3488[5] = this.field6617;
            class235.field3488[1] = this.field6616;
            class235.field3488[2] = this.field6622;
            class126 var2 = this.field6621.field2379;
            class235.field3488[3] = this.field6626;
            class235.field3488[0] = this.field6620;
            class235.field3488[4] = this.field6625;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method839(class235.field3488[var5], (byte) 105)) {
                    return null;
                }
                class321 var7 = var2.method838(true, class235.field3488[var5]);
                int var8 = var7.field4590 ? 64 : 128;
                if (var7.field4591 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class197.field2877[var6] = var2.method837(var4, false, var4, 1.0F, (byte) -28, class235.field3488[var6]);
            }
            this.field6624 = new class374(this.field6621, 6407, var4, var3, class197.field2877);
        }
        int var9 = -27 % ((72 - arg0) / 52);
        return this.field6624;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)Z", line = 61)
    public static final boolean method2674(int arg0, int arg1, int arg2) {
        if (arg0 != 262144) {
            method2675(-94);
        }
        field6628++;
        return class62.method365(arg2, arg1, (byte) -11) | (arg1 & 0x40000) != 0 || class52.method319(arg1, true, arg2);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 89)
    public static void method2675(int arg0) {
        field6623 = null;
        if (arg0 != 1) {
            method2675(36);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lod;IIIIII)V", line = 101)
    public class445(class349 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6626 = arg4;
        this.field6621 = arg0;
        this.field6625 = arg5;
        this.field6617 = arg6;
        this.field6622 = arg3;
        this.field6620 = arg1;
        this.field6616 = arg2;
    }
}
