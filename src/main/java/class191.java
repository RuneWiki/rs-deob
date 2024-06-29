import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class191 extends class107 {

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
    public static int[] field3194 = new int[32];

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ldf;")
    public static class51 field3189 = class46.method233(" ", 100);

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Ldf;")
    public static class51 field3192 = class46.method233("Lade Titelbild )2 ", 100);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
    public static int[] field3200 = new int[4096];

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lbg;")
    public static class217 field3201;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Ldf;")
    public static class51 field3204;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "[I")
    public int[] field3191;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
    public int[] field3195;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "[I")
    public int[] field3198;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "[Loj;")
    public class150[] field3190;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[Loj;")
    public class150[] field3196;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "[[[B")
    public byte[][][] field3197;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method1365(byte arg0) {
        field3192 = null;
        field3189 = null;
        if (arg0 != 26) {
            field3194 = null;
        }
        field3200 = null;
        field3201 = null;
        field3204 = null;
        field3194 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
    public static int method1366(int arg0, int arg1) {
        return arg0 & arg1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3194[var1] = var0 - 1;
            var0 += var0;
        }
        field3201 = new class217(64);
        field3204 = class46.method233("Fallen lassen", 100);
    }
}
