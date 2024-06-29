import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 extends class69 {

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "[I")
    public int[] field1019;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[[I")
    public int[][] field1015;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[[B")
    public static byte[][] field1003 = new byte[250][];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field1010 = -1;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lmc;")
    public static class75 field1005 = class30.method234(true, "Fallen lassen");

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Lmc;")
    public static class75 field1017 = class30.method234(true, "mapscene");

    @OriginalMember(owner = "client!h", name = "D", descriptor = "[I")
    public static int[] field1011 = new int[5];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lmc;")
    private static class75 field1007 = class30.method234(true, "wishes to duel with you)3");

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lmc;")
    public static class75 field1004 = field1007;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Lmc;")
    public static class75 field1016 = class30.method234(true, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Lmc;")
    public static class75 field1012 = class30.method234(true, "Missbrauch melden");

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lge;I)V", line = 6)
    public static final void method321(class41 arg0, int arg1) {
        field1014++;
        class38.field903 = arg0;
        if (arg1 != 0) {
            field1016 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 22)
    public static void method322(int arg0) {
        field1003 = null;
        field1016 = null;
        field1004 = null;
        field1005 = null;
        field1017 = null;
        field1007 = null;
        field1012 = null;
        if (arg0 != 7170) {
            field1008 = -121;
        }
        field1011 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 53)
    public static final void method323(byte arg0) {
        int var1 = 77 / (arg0 / 54);
        field1009++;
        if (class117.field2909 != null) {
            class117.field2909.method756(92);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I[B)V", line = 106)
    public class42(int arg0, byte[] arg1) {
        this.field1006 = arg0;
        class61 var3 = new class61(arg1);
        this.field1018 = var3.method494(20471);
        this.field1019 = new int[this.field1018];
        this.field1015 = new int[this.field1018][];
        for (int var4 = 0; var4 < this.field1018; var4++) {
            this.field1019[var4] = var3.method494(20471);
        }
        for (int var5 = 0; var5 < this.field1018; var5++) {
            this.field1015[var5] = new int[var3.method494(20471)];
        }
        for (int var6 = 0; var6 < this.field1018; var6++) {
            for (int var7 = 0; var7 < this.field1015[var6].length; var7++) {
                this.field1015[var6][var7] = var3.method494(20471);
            }
        }
    }
}
