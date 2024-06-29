import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends class125 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lsa;")
    public static class126 field776 = null;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lod;")
    public static class101 field784 = class46.method335(-80, "gleiten:");

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lod;")
    private static class101 field787 = class46.method335(71, "No reply from loginserver)3");

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lod;")
    public static class101 field783 = field787;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lpa;")
    public static class105 field779;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
    public int[] field782;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[I")
    public int[] field786;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[I")
    public int[] field789;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[Lke;")
    public class74[] field781;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "[Lke;")
    public class74[] field791;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[[[B")
    public byte[][][] field777;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method233(byte arg0) {
        field784 = null;
        field779 = null;
        field776 = null;
        field783 = null;
        field787 = null;
        if (arg0 <= 124) {
            field779 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lt;II)V")
    public static final void method234(class132 arg0, int arg1, int arg2) {
        field790++;
        if (class11.field200 == null) {
            class121.method906(-32407, 255, 0, 255, (byte) 0, null, true);
            class89.field1940[arg2] = arg0;
            int var5 = 3 / ((33 - arg1) / 45);
        } else {
            class11.field200.field3175 = arg2 * 8 + 5;
            int var3 = class11.field200.method1062(1809568712);
            int var4 = class11.field200.method1062(1809568712);
            arg0.method1025(var3, (byte) 0, var4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
    public static final int method235(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = 256 - arg2;
        if (!arg3) {
            field787 = null;
        }
        field778++;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method236(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 <= 114) {
            method234(null, 112, -50);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        field788++;
        return var6 + 1;
    }
}
